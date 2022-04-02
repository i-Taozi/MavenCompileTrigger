// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;

// Parsed from QtWidgets/qabstractspinbox.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QAbstractSpinBox extends QWidget {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QAbstractSpinBox(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QAbstractSpinBox(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QAbstractSpinBox position(long position) {
        return (QAbstractSpinBox)super.position(position);
    }
    @Override public QAbstractSpinBox getPointer(long i) {
        return new QAbstractSpinBox((Pointer)this).offsetAddress(i);
    }

    public QAbstractSpinBox(QWidget parent/*=nullptr*/) { super((Pointer)null); allocate(parent); }
    private native void allocate(QWidget parent/*=nullptr*/);
    public QAbstractSpinBox() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** enum QAbstractSpinBox::StepEnabledFlag */
    public static final int StepNone = 0x00, StepUpEnabled = 0x01,
                           StepDownEnabled = 0x02;
    

    /** enum QAbstractSpinBox::ButtonSymbols */
    public static final int UpDownArrows = 0, PlusMinus = 1, NoButtons = 2;
    

    public native @Cast("QAbstractSpinBox::ButtonSymbols") int buttonSymbols();
    public native void setButtonSymbols(@Cast("QAbstractSpinBox::ButtonSymbols") int bs);

    /** enum QAbstractSpinBox::CorrectionMode */
    public static final int CorrectToPreviousValue = 0, CorrectToNearestValue = 1;
    

    public native void setCorrectionMode(@Cast("QAbstractSpinBox::CorrectionMode") int cm);
    public native @Cast("QAbstractSpinBox::CorrectionMode") int correctionMode();

    public native @Cast("bool") boolean hasAcceptableInput();
    public native @ByVal QString text();

    public native @ByVal QString specialValueText();
    public native void setSpecialValueText(@Const @ByRef QString txt);

    public native @Cast("bool") boolean wrapping();
    public native void setWrapping(@Cast("bool") boolean w);

    public native void setReadOnly(@Cast("bool") boolean r);
    public native @Cast("bool") boolean isReadOnly();

    public native void setKeyboardTracking(@Cast("bool") boolean kt);
    public native @Cast("bool") boolean keyboardTracking();

    public native void setAlignment(@ByVal @Cast("Qt::Alignment") int flag);
    public native @ByVal @Cast("Qt::Alignment") int alignment();

    public native void setFrame(@Cast("bool") boolean arg0);
    public native @Cast("bool") boolean hasFrame();

    public native void setAccelerated(@Cast("bool") boolean on);
    public native @Cast("bool") boolean isAccelerated();

    public native void setGroupSeparatorShown(@Cast("bool") boolean shown);
    public native @Cast("bool") boolean isGroupSeparatorShown();

    public native @ByVal QSize sizeHint();
    public native @ByVal QSize minimumSizeHint();
    public native void interpretText();
    @Virtual protected native @Cast("bool") boolean event(QEvent event);

    public native @ByVal QVariant inputMethodQuery(@Cast("Qt::InputMethodQuery") int arg0);
    @Virtual public native @Const({false, false, true}) void fixup(@ByRef QString input);

    @Virtual public native void stepBy(int steps);

    public enum StepType {
        DefaultStepType(0),
        AdaptiveDecimalStepType(1);

        public final int value;
        private StepType(int v) { this.value = v; }
        private StepType(StepType e) { this.value = e.value; }
        public StepType intern() { for (StepType e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }
    public native void stepUp();
    public native void stepDown();
    public native void selectAll();
    @Virtual public native void clear();
    @Virtual protected native void changeEvent(QEvent event);
    @Virtual protected native void closeEvent(QCloseEvent event);
    @Virtual protected native void timerEvent(QTimerEvent event);
    @Virtual protected native void paintEvent(QPaintEvent event);
}
