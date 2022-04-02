// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("arrow::Future<std::shared_ptr<const arrow::KeyValueMetadata> >") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class KeyValueMetadataFuture extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KeyValueMetadataFuture(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public KeyValueMetadataFuture(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public KeyValueMetadataFuture position(long position) {
        return (KeyValueMetadataFuture)super.position(position);
    }
    @Override public KeyValueMetadataFuture getPointer(long i) {
        return new KeyValueMetadataFuture((Pointer)this).offsetAddress(i);
    }

  @MemberGetter public static native @Cast("const bool") boolean is_empty();
  public static final boolean is_empty = is_empty();
  // The default constructor creates an invalid Future.  Use Future::Make()
  // for a valid Future.  This constructor is mostly for the convenience
  // of being able to presize a vector of Futures.
  public KeyValueMetadataFuture() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Consumer API

  
  ///
  public native @Cast("bool") boolean is_valid();

  /** \brief Return the Future's current state
   * 
   *  A return value of PENDING is only indicative, as the Future can complete
   *  concurrently.  A return value of FAILURE or SUCCESS is definitive, though. */
  
  ///
  public native FutureState state();

  /** \brief Whether the Future is finished
   * 
   *  A false return value is only indicative, as the Future can complete
   *  concurrently.  A true return value is definitive, though. */
  public native @Cast("bool") boolean is_finished();

  /** \brief Wait for the Future to complete and return its Result */
  
  ///
  public native @Const @ByRef KeyValueMetadataResult result();

  /** \brief Returns an rvalue to the result.  This method is potentially unsafe
   * 
   *  The future is not the unique owner of the result, copies of a future will
   *  also point to the same result.  You must make sure that no other copies
   *  of the future exist.  Attempts to add callbacks after you move the result
   *  will result in undefined behavior. */
  public native @ByRef(true) KeyValueMetadataResult MoveResult();

  /** \brief Wait for the Future to complete and return its Status */
  public native @Const @ByRef Status status();

  /** \brief Future<T> is convertible to Future<>, which views only the
   *  Status of the original. Marking the returned Future Finished is not supported. */
  public native @ByVal @Name("operator arrow::Future<>") Future asFuture();

  /** \brief Wait for the Future to complete */
  
  ///
  public native void Wait();

  /** \brief Wait for the Future to complete, or for the timeout to expire
   * 
   *  {@code true} is returned if the Future completed, {@code false} if the timeout expired.
   *  Note a {@code false} value is only indicative, as the Future can complete
   *  concurrently. */
  
  ///
  public native @Cast("bool") boolean Wait(double seconds);

  // Producer API

  /** \brief Producer API: mark Future finished
   * 
   *  The Future's result is set to {@code res}. */
  public native void MarkFinished(@ByVal KeyValueMetadataResult res);

  /** \brief Mark a Future<> completed with the provided Status. */

  /** \brief Producer API: instantiate a valid Future
   * 
   *  The Future's state is initialized with PENDING.  If you are creating a future with
   *  this method you must ensure that future is eventually completed (with success or
   *  failure).  Creating a future, returning it, and never completing the future can lead
   *  to memory leaks (for example, see Loop). */
  public static native @ByVal KeyValueMetadataFuture Make();

  /** \brief Producer API: instantiate a finished Future */
  public static native @ByVal KeyValueMetadataFuture MakeFinished(@ByVal KeyValueMetadataResult res);

  /** \brief Make a finished Future<> with the provided Status. */

  
  ///
  ///
  ///
  ///
  ///

  /** \brief Consumer API: Register a callback to run when this future completes
   * 
   *  The callback should receive the result of the future (const Result<T>&)
   *  For a void or statusy future this should be (const Status&)
   * 
   *  There is no guarantee to the order in which callbacks will run.  In
   *  particular, callbacks added while the future is being marked complete
   *  may be executed immediately, ahead of, or even the same time as, other
   *  callbacks that have been previously added.
   * 
   *  WARNING: callbacks may hold arbitrary references, including cyclic references.
   *  Since callbacks will only be destroyed after they are invoked, this can lead to
   *  memory leaks if a Future is never marked finished (abandoned):
   * 
   *  {
   *      auto fut = Future<>::Make();
   *      fut.AddCallback([fut]() {});
   *  }
   * 
   *  In this example {@code fut} falls out of scope but is not destroyed because it holds a
   *  cyclic reference to itself through the callback. */

  /** \brief Overload of AddCallback that will return false instead of running
   *  synchronously
   * 
   *  This overload will guarantee the callback is never run synchronously.  If the future
   *  is already finished then it will simply return false.  This can be useful to avoid
   *  stack overflow in a situation where you have recursive Futures.  For an example
   *  see the Loop function
   * 
   *  Takes in a callback factory function to allow moving callbacks (the factory function
   *  will only be called if the callback can successfully be added)
   * 
   *  Returns true if a callback was actually added and false if the callback failed
   *  to add because the future was marked complete. */

  /** \brief Consumer API: Register a continuation to run when this future completes
   * 
   *  The continuation will run in the same thread that called MarkFinished (whatever
   *  callback is registered with this function will run before MarkFinished returns).
   *  Avoid long-running callbacks in favor of submitting a task to an Executor and
   *  returning the future.
   * 
   *  Two callbacks are supported:
   *  - OnSuccess, called with the result (const ValueType&) on successul completion.
   *               for an empty future this will be called with nothing ()
   *  - OnFailure, called with the error (const Status&) on failed completion.
   *               This callback is optional and defaults to a passthru of any errors.
   * 
   *  Then() returns a Future whose ValueType is derived from the return type of the
   *  callbacks. If a callback returns:
   *  - void, a Future<> will be returned which will completes successully as soon
   *    as the callback runs.
   *  - Status, a Future<> will be returned which will complete with the returned Status
   *    as soon as the callback runs.
   *  - V or Result<V>, a Future<V> will be returned which will complete with the result
   *    of invoking the callback as soon as the callback runs.
   *  - Future<V>, a Future<V> will be returned which will be marked complete when the
   *    future returned by the callback completes (and will complete with the same
   *    result).
   * 
   *  The continued Future type must be the same for both callbacks.
   * 
   *  Note that OnFailure can swallow errors, allowing continued Futures to successully
   *  complete even if this Future fails.
   * 
   *  If this future is already completed then the callback will be run immediately
   *  and the returned future may already be marked complete.
   * 
   *  See AddCallback for general considerations when writing callbacks. */

  /** \brief Implicit constructor to create a finished future from a value */
  public KeyValueMetadataFuture(@SharedPtr @Cast({"const arrow::KeyValueMetadata*", "std::shared_ptr<const arrow::KeyValueMetadata>"}) KeyValueMetadata val) { super((Pointer)null); allocate(val); }
  private native void allocate(@SharedPtr @Cast({"const arrow::KeyValueMetadata*", "std::shared_ptr<const arrow::KeyValueMetadata>"}) KeyValueMetadata val);

  /** \brief Implicit constructor to create a future from a Result, enabling use
   *      of macros like ARROW_ASSIGN_OR_RAISE. */
  public KeyValueMetadataFuture(@ByVal KeyValueMetadataResult res) { super((Pointer)null); allocate(res); }
  private native void allocate(@ByVal KeyValueMetadataResult res);

  /** \brief Implicit constructor to create a future from a Status, enabling use
   *      of macros like ARROW_RETURN_NOT_OK. */
  public KeyValueMetadataFuture(@ByVal Status s) { super((Pointer)null); allocate(s); }
  private native void allocate(@ByVal Status s);
}
