// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


/**********************************************************************
 * EANYCODE_CHAR
 * Description of a single character. The character code is defined by
 * the character set of the current font.
 * Output text is sent as an array of these structures.
 * Spaces and line endings in the output are represented in the
 * structures of the surrounding characters. They are not directly
 * represented as characters.
 * The first character in a word has a positive value of blanks.
 * Missing information should be set to the defaults in the comments.
 * If word bounds are known, but not character bounds, then the top and
 * bottom of each character should be those of the word. The left of the
 * first and right of the last char in each word should be set. All other
 * lefts and rights should be set to -1.
 * If set, the values of right and bottom are left+width and top+height.
 * Most of the members come directly from the parameters to ocr_append_char.
 * The formatting member uses the enhancement parameter and combines the
 * line direction stuff into the top 3 bits.
 * The coding is 0=RL char, 1=LR char, 2=DR NL, 3=UL NL, 4=DR Para,
 * 5=UL Para, 6=TB char, 7=BT char. API users do not need to know what
 * the coding is, only that it is backwards compatible with the previous
 * version.
 **********************************************************************/

@Namespace("tesseract") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class EANYCODE_CHAR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EANYCODE_CHAR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EANYCODE_CHAR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EANYCODE_CHAR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EANYCODE_CHAR position(long position) {
        return (EANYCODE_CHAR)super.position(position);
    }
    @Override public EANYCODE_CHAR getPointer(long i) {
        return new EANYCODE_CHAR((Pointer)this).offsetAddress(i);
    }
 /*single character */
  // It should be noted that the format for char_code for version 2.0 and beyond
  // is UTF8 which means that ASCII characters will come out as one structure
  // but other characters will be returned in two or more instances of this
  // structure with a single byte of the  UTF8 code in each, but each will have
  // the same bounding box. Programs which want to handle languagues with
  // different characters sets will need to handle extended characters
  // appropriately, but *all* code needs to be prepared to receive UTF8 coded
  // characters for characters such as bullet and fancy quotes.
  public native @Cast("uint16_t") short char_code(); public native EANYCODE_CHAR char_code(short setter); /*character itself */
  public native short left(); public native EANYCODE_CHAR left(short setter);       /*of char (-1) */
  public native short right(); public native EANYCODE_CHAR right(short setter);      /*of char (-1) */
  public native short top(); public native EANYCODE_CHAR top(short setter);        /*of char (-1) */
  public native short bottom(); public native EANYCODE_CHAR bottom(short setter);     /*of char (-1) */
  public native short font_index(); public native EANYCODE_CHAR font_index(short setter); /*what font (0) */
  public native @Cast("uint8_t") byte confidence(); public native EANYCODE_CHAR confidence(byte setter); /*0=perfect, 100=reject (0/100) */
  public native @Cast("uint8_t") byte point_size(); public native EANYCODE_CHAR point_size(byte setter); /*of char, 72=i inch, (10) */
  public native byte blanks(); public native EANYCODE_CHAR blanks(byte setter);      /*no of spaces before this char (1) */
  public native @Cast("uint8_t") byte formatting(); public native EANYCODE_CHAR formatting(byte setter); /*char formatting (0) */
}
