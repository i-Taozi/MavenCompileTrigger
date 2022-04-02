// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


	/**
	 * The Error object represents an error that is returned from the library.
	 * Overloaded operators allow comparisons against other Error objects or
	 * the ErrorType enumeration.
	 */
	@Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class Error extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public Error(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public Error(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public Error position(long position) {
	        return (Error)super.position(position);
	    }
	    @Override public Error getPointer(long i) {
	        return new Error((Pointer)this).offsetAddress(i);
	    }
	

			/**
			 * Default constructor.
			 */
			public Error() { super((Pointer)null); allocate(); }
			private native void allocate();

			/**
			 * Copy constructor.
			 */
			public Error( @Const @ByRef Error error ) { super((Pointer)null); allocate(error); }
			private native void allocate( @Const @ByRef Error error );

			/**
			 * Default destructor.
			 */

			/**
			 * Assignment operator.
			 */
			public native @ByRef @Name("operator =") Error put( @Const @ByRef Error error );

			/**
			 * Equality operator.
			 */
			public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef Error error );

			/**
			 * Equality operator. This overloaded operator compares the
			 * ErrorType of the Error against the specified ErrorType.
			 */
			public native @Cast("bool") @Name("operator ==") boolean equals( @Cast("const FlyCapture2::ErrorType") int errorType );

			/**
			 * Inequality operator.
			 */
			public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef Error error );

			/**
			 * Inequality operator. This overloaded operator compares the
			 * ErrorType of the Error against the specified ErrorType.
			 */
			public native @Cast("bool") @Name("operator !=") boolean notEquals( @Cast("const FlyCapture2::ErrorType") int errorType );

			/**
			 * Retrieve the ErrorType of the error.
			 *
			 * @return The ErrorType of the error.
			 */
			public native @Cast("FlyCapture2::ErrorType") int GetType();

			/**
			 * Retrieve the top level description of the error that occurred.
			 *
			 * @return A string with the error description.
			 */
			public native @Cast("const char*") BytePointer GetDescription();

			/**
			 * Retrieve the line number where the error originated.
			 *
			 * @return The line number.
			 */
			public native @Cast("unsigned int") int GetLine();

			/**
			 * Retrieve the source filename where the error originated.
			 *
			 * @return A string with the file name.
			 */
			public native @Cast("const char*") BytePointer GetFilename();

			/**
			 * Get the error which caused this error.
			 *
			 * @return An error object representing the cause of this error.
			 */
			public native @ByVal Error GetCause();

			/**
			 * Retrieve the build date of the file where the error originated.
			 *
			 * @return A string with the build date and time.
			 */
			public native @Cast("const char*") BytePointer GetBuildDate();

			/**
			 * Retrieve the support information.
			 * It is not implemented in this release.
			 *
			 * @return A string containing support information.
			 */
			public native @Cast("const char*") BytePointer CollectSupportInformation();

			/**
			 * Print a formatted log trace to stderr.
			 */
			public native void PrintErrorTrace();
	}
