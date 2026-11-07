package org.lwjgl.util.tinyfd;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Platform;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-tinyfd.jar:org/lwjgl/util/tinyfd/TinyFileDialogs.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-tinyfd.jar:org/lwjgl/util/tinyfd/TinyFileDialogs.class */
public class TinyFileDialogs {
    public static final String tinyfd_version = "tinyfd_version";
    public static final String tinyfd_needs = "tinyfd_needs";
    public static final String tinyfd_response = "tinyfd_response";
    public static final String tinyfd_verbose = "tinyfd_verbose";
    public static final String tinyfd_silent = "tinyfd_silent";
    public static final String tinyfd_allowCursesDialogs = "tinyfd_allowCursesDialogs";
    public static final String tinyfd_forceConsole = "tinyfd_forceConsole";
    public static final String tinyfd_winUtf8 = "tinyfd_winUtf8";

    public static native long ntinyfd_getGlobalChar(long j);

    public static native int ntinyfd_getGlobalInt(long j);

    public static native int ntinyfd_setGlobalInt(long j, int i);

    public static native void tinyfd_beep();

    public static native int ntinyfd_notifyPopup(long j, long j2, long j3);

    public static native int ntinyfd_messageBox(long j, long j2, long j3, long j4, int i);

    public static native long ntinyfd_inputBox(long j, long j2, long j3);

    public static native long ntinyfd_saveFileDialog(long j, long j2, int i, long j3, long j4);

    public static native long ntinyfd_openFileDialog(long j, long j2, int i, long j3, long j4, int i2);

    public static native long ntinyfd_selectFolderDialog(long j, long j2);

    public static native long ntinyfd_colorChooser(long j, long j2, long j3, long j4);

    static {
        Library.loadSystem(System::load, System::loadLibrary, TinyFileDialogs.class, "org.lwjgl.tinyfd", Platform.mapLibraryNameBundled("lwjgl_tinyfd"));
        if (Platform.get() == Platform.WINDOWS) {
            tinyfd_setGlobalInt(tinyfd_winUtf8, 1);
        }
    }

    protected TinyFileDialogs() {
        throw new UnsupportedOperationException();
    }

    @NativeType("char const *")
    public static String tinyfd_getGlobalChar(@NativeType("char const *") ByteBuffer aCharVariableName) {
        if (Checks.CHECKS) {
            Checks.checkNT1(aCharVariableName);
        }
        long __result = ntinyfd_getGlobalChar(MemoryUtil.memAddress(aCharVariableName));
        return MemoryUtil.memASCIISafe(__result);
    }

    @NativeType("char const *")
    public static String tinyfd_getGlobalChar(@NativeType("char const *") CharSequence aCharVariableName) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(aCharVariableName, true);
            long aCharVariableNameEncoded = stack.getPointerAddress();
            long __result = ntinyfd_getGlobalChar(aCharVariableNameEncoded);
            String strMemASCIISafe = MemoryUtil.memASCIISafe(__result);
            stack.setPointer(stackPointer);
            return strMemASCIISafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int tinyfd_getGlobalInt(@NativeType("char const *") ByteBuffer aIntVariableName) {
        if (Checks.CHECKS) {
            Checks.checkNT1(aIntVariableName);
        }
        return ntinyfd_getGlobalInt(MemoryUtil.memAddress(aIntVariableName));
    }

    public static int tinyfd_getGlobalInt(@NativeType("char const *") CharSequence aIntVariableName) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(aIntVariableName, true);
            long aIntVariableNameEncoded = stack.getPointerAddress();
            int iNtinyfd_getGlobalInt = ntinyfd_getGlobalInt(aIntVariableNameEncoded);
            stack.setPointer(stackPointer);
            return iNtinyfd_getGlobalInt;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int tinyfd_setGlobalInt(@NativeType("char const *") ByteBuffer aIntVariableName, int aValue) {
        if (Checks.CHECKS) {
            Checks.checkNT1(aIntVariableName);
        }
        return ntinyfd_setGlobalInt(MemoryUtil.memAddress(aIntVariableName), aValue);
    }

    public static int tinyfd_setGlobalInt(@NativeType("char const *") CharSequence aIntVariableName, int aValue) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(aIntVariableName, true);
            long aIntVariableNameEncoded = stack.getPointerAddress();
            int iNtinyfd_setGlobalInt = ntinyfd_setGlobalInt(aIntVariableNameEncoded, aValue);
            stack.setPointer(stackPointer);
            return iNtinyfd_setGlobalInt;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int tinyfd_notifyPopup(@NativeType("char const *") ByteBuffer aTitle, @NativeType("char const *") ByteBuffer aMessage, @NativeType("char const *") ByteBuffer aIconType) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(aTitle);
            Checks.checkNT1Safe(aMessage);
            Checks.checkNT1(aIconType);
        }
        return ntinyfd_notifyPopup(MemoryUtil.memAddressSafe(aTitle), MemoryUtil.memAddressSafe(aMessage), MemoryUtil.memAddress(aIconType));
    }

    public static int tinyfd_notifyPopup(@NativeType("char const *") CharSequence aTitle, @NativeType("char const *") CharSequence aMessage, @NativeType("char const *") CharSequence aIconType) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(aMessage, true);
            long aMessageEncoded = aMessage == null ? 0L : stack.getPointerAddress();
            stack.nASCII(aIconType, true);
            long aIconTypeEncoded = stack.getPointerAddress();
            int iNtinyfd_notifyPopup = ntinyfd_notifyPopup(aTitleEncoded, aMessageEncoded, aIconTypeEncoded);
            stack.setPointer(stackPointer);
            return iNtinyfd_notifyPopup;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int tinyfd_messageBox(@NativeType("char const *") ByteBuffer aTitle, @NativeType("char const *") ByteBuffer aMessage, @NativeType("char const *") ByteBuffer aDialogType, @NativeType("char const *") ByteBuffer aIconType, int aDefaultButton) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(aTitle);
            Checks.checkNT1Safe(aMessage);
            Checks.checkNT1(aDialogType);
            Checks.checkNT1(aIconType);
        }
        return ntinyfd_messageBox(MemoryUtil.memAddressSafe(aTitle), MemoryUtil.memAddressSafe(aMessage), MemoryUtil.memAddress(aDialogType), MemoryUtil.memAddress(aIconType), aDefaultButton);
    }

    public static int tinyfd_messageBox(@NativeType("char const *") CharSequence aTitle, @NativeType("char const *") CharSequence aMessage, @NativeType("char const *") CharSequence aDialogType, @NativeType("char const *") CharSequence aIconType, int aDefaultButton) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(aMessage, true);
            long aMessageEncoded = aMessage == null ? 0L : stack.getPointerAddress();
            stack.nASCII(aDialogType, true);
            long aDialogTypeEncoded = stack.getPointerAddress();
            stack.nASCII(aIconType, true);
            long aIconTypeEncoded = stack.getPointerAddress();
            int iNtinyfd_messageBox = ntinyfd_messageBox(aTitleEncoded, aMessageEncoded, aDialogTypeEncoded, aIconTypeEncoded, aDefaultButton);
            stack.setPointer(stackPointer);
            return iNtinyfd_messageBox;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char const *")
    public static String tinyfd_inputBox(@NativeType("char const *") ByteBuffer aTitle, @NativeType("char const *") ByteBuffer aMessage, @NativeType("char const *") ByteBuffer aDefaultInput) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(aTitle);
            Checks.checkNT1Safe(aMessage);
            Checks.checkNT1Safe(aDefaultInput);
        }
        long __result = ntinyfd_inputBox(MemoryUtil.memAddressSafe(aTitle), MemoryUtil.memAddressSafe(aMessage), MemoryUtil.memAddressSafe(aDefaultInput));
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("char const *")
    public static String tinyfd_inputBox(@NativeType("char const *") CharSequence aTitle, @NativeType("char const *") CharSequence aMessage, @NativeType("char const *") CharSequence aDefaultInput) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(aMessage, true);
            long aMessageEncoded = aMessage == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(aDefaultInput, true);
            long aDefaultInputEncoded = aDefaultInput == null ? 0L : stack.getPointerAddress();
            long __result = ntinyfd_inputBox(aTitleEncoded, aMessageEncoded, aDefaultInputEncoded);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            stack.setPointer(stackPointer);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char const *")
    public static String tinyfd_saveFileDialog(@NativeType("char const *") ByteBuffer aTitle, @NativeType("char const *") ByteBuffer aDefaultPathAndOrFile, @NativeType("char const * const *") PointerBuffer aFilterPatterns, @NativeType("char const *") ByteBuffer aSingleFilterDescription) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(aTitle);
            Checks.checkNT1Safe(aDefaultPathAndOrFile);
            Checks.checkNT1Safe(aSingleFilterDescription);
        }
        long __result = ntinyfd_saveFileDialog(MemoryUtil.memAddressSafe(aTitle), MemoryUtil.memAddressSafe(aDefaultPathAndOrFile), Checks.remainingSafe(aFilterPatterns), MemoryUtil.memAddressSafe(aFilterPatterns), MemoryUtil.memAddressSafe(aSingleFilterDescription));
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("char const *")
    public static String tinyfd_saveFileDialog(@NativeType("char const *") CharSequence aTitle, @NativeType("char const *") CharSequence aDefaultPathAndOrFile, @NativeType("char const * const *") PointerBuffer aFilterPatterns, @NativeType("char const *") CharSequence aSingleFilterDescription) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(aDefaultPathAndOrFile, true);
            long aDefaultPathAndOrFileEncoded = aDefaultPathAndOrFile == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(aSingleFilterDescription, true);
            long aSingleFilterDescriptionEncoded = aSingleFilterDescription == null ? 0L : stack.getPointerAddress();
            long __result = ntinyfd_saveFileDialog(aTitleEncoded, aDefaultPathAndOrFileEncoded, Checks.remainingSafe(aFilterPatterns), MemoryUtil.memAddressSafe(aFilterPatterns), aSingleFilterDescriptionEncoded);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            stack.setPointer(stackPointer);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char const *")
    public static String tinyfd_openFileDialog(@NativeType("char const *") ByteBuffer aTitle, @NativeType("char const *") ByteBuffer aDefaultPathAndOrFile, @NativeType("char const * const *") PointerBuffer aFilterPatterns, @NativeType("char const *") ByteBuffer aSingleFilterDescription, @NativeType("int") boolean aAllowMultipleSelects) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(aTitle);
            Checks.checkNT1Safe(aDefaultPathAndOrFile);
            Checks.checkNT1Safe(aSingleFilterDescription);
        }
        long __result = ntinyfd_openFileDialog(MemoryUtil.memAddressSafe(aTitle), MemoryUtil.memAddressSafe(aDefaultPathAndOrFile), Checks.remainingSafe(aFilterPatterns), MemoryUtil.memAddressSafe(aFilterPatterns), MemoryUtil.memAddressSafe(aSingleFilterDescription), aAllowMultipleSelects ? 1 : 0);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("char const *")
    public static String tinyfd_openFileDialog(@NativeType("char const *") CharSequence aTitle, @NativeType("char const *") CharSequence aDefaultPathAndOrFile, @NativeType("char const * const *") PointerBuffer aFilterPatterns, @NativeType("char const *") CharSequence aSingleFilterDescription, @NativeType("int") boolean aAllowMultipleSelects) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(aDefaultPathAndOrFile, true);
            long aDefaultPathAndOrFileEncoded = aDefaultPathAndOrFile == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(aSingleFilterDescription, true);
            long aSingleFilterDescriptionEncoded = aSingleFilterDescription == null ? 0L : stack.getPointerAddress();
            long __result = ntinyfd_openFileDialog(aTitleEncoded, aDefaultPathAndOrFileEncoded, Checks.remainingSafe(aFilterPatterns), MemoryUtil.memAddressSafe(aFilterPatterns), aSingleFilterDescriptionEncoded, aAllowMultipleSelects ? 1 : 0);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            stack.setPointer(stackPointer);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char const *")
    public static String tinyfd_selectFolderDialog(@NativeType("char const *") ByteBuffer aTitle, @NativeType("char const *") ByteBuffer aDefaultPath) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(aTitle);
            Checks.checkNT1Safe(aDefaultPath);
        }
        long __result = ntinyfd_selectFolderDialog(MemoryUtil.memAddressSafe(aTitle), MemoryUtil.memAddressSafe(aDefaultPath));
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("char const *")
    public static String tinyfd_selectFolderDialog(@NativeType("char const *") CharSequence aTitle, @NativeType("char const *") CharSequence aDefaultPath) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(aDefaultPath, true);
            long aDefaultPathEncoded = aDefaultPath == null ? 0L : stack.getPointerAddress();
            long __result = ntinyfd_selectFolderDialog(aTitleEncoded, aDefaultPathEncoded);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            stack.setPointer(stackPointer);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char const *")
    public static String tinyfd_colorChooser(@NativeType("char const *") ByteBuffer aTitle, @NativeType("char const *") ByteBuffer aDefaultHexRGB, @NativeType("unsigned char *") ByteBuffer aDefaultRGB, @NativeType("unsigned char *") ByteBuffer aoResultRGB) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(aTitle);
            Checks.checkNT1Safe(aDefaultHexRGB);
            Checks.checkSafe((Buffer) aDefaultRGB, 3);
            Checks.check((Buffer) aoResultRGB, 3);
        }
        long __result = ntinyfd_colorChooser(MemoryUtil.memAddressSafe(aTitle), MemoryUtil.memAddressSafe(aDefaultHexRGB), MemoryUtil.memAddressSafe(aDefaultRGB), MemoryUtil.memAddress(aoResultRGB));
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("char const *")
    public static String tinyfd_colorChooser(@NativeType("char const *") CharSequence aTitle, @NativeType("char const *") CharSequence aDefaultHexRGB, @NativeType("unsigned char *") ByteBuffer aDefaultRGB, @NativeType("unsigned char *") ByteBuffer aoResultRGB) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) aDefaultRGB, 3);
            Checks.check((Buffer) aoResultRGB, 3);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? 0L : stack.getPointerAddress();
            stack.nASCIISafe(aDefaultHexRGB, true);
            long aDefaultHexRGBEncoded = aDefaultHexRGB == null ? 0L : stack.getPointerAddress();
            long __result = ntinyfd_colorChooser(aTitleEncoded, aDefaultHexRGBEncoded, MemoryUtil.memAddressSafe(aDefaultRGB), MemoryUtil.memAddress(aoResultRGB));
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            stack.setPointer(stackPointer);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
