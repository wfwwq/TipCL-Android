package org.lwjgl.system.macosx;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/MacOSXLibraryBundle.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/MacOSXLibraryBundle.class */
public class MacOSXLibraryBundle extends MacOSXLibrary {
    public MacOSXLibraryBundle(String name, long bundleRef) {
        super(name, bundleRef);
    }

    public static MacOSXLibraryBundle getWithIdentifier(String bundleID) {
        long filePath = 0;
        try {
            MemoryStack stack = MemoryStack.stackPush();
            try {
                filePath = CString2CFString(stack.UTF8(bundleID), CoreFoundation.kCFStringEncodingUTF8);
                long bundleRef = CoreFoundation.CFBundleGetBundleWithIdentifier(filePath);
                if (bundleRef == 0) {
                    throw new UnsatisfiedLinkError("Failed to retrieve bundle with identifier: " + bundleID);
                }
                CoreFoundation.CFRetain(bundleRef);
                MacOSXLibraryBundle macOSXLibraryBundle = new MacOSXLibraryBundle(bundleID, bundleRef);
                if (stack != null) {
                    stack.close();
                }
                return macOSXLibraryBundle;
            } finally {
            }
        } finally {
            if (filePath != 0) {
                CoreFoundation.CFRelease(filePath);
            }
        }
    }

    public static MacOSXLibraryBundle create(String path) {
        long filePath = 0;
        long url = 0;
        try {
            MemoryStack stack = MemoryStack.stackPush();
            try {
                filePath = CString2CFString(stack.UTF8(path), CoreFoundation.kCFStringEncodingUTF8);
                url = Checks.check(CoreFoundation.CFURLCreateWithFileSystemPath(0L, filePath, 0L, true));
                long bundleRef = CoreFoundation.CFBundleCreate(0L, url);
                if (bundleRef == 0) {
                    throw new UnsatisfiedLinkError("Failed to create bundle: " + path);
                }
                MacOSXLibraryBundle macOSXLibraryBundle = new MacOSXLibraryBundle(path, bundleRef);
                if (stack != null) {
                    stack.close();
                }
                return macOSXLibraryBundle;
            } finally {
            }
        } finally {
            if (url != 0) {
                CoreFoundation.CFRelease(url);
            }
            if (filePath != 0) {
                CoreFoundation.CFRelease(filePath);
            }
        }
    }

    @Override // org.lwjgl.system.SharedLibrary
    public String getPath() {
        return null;
    }

    @Override // org.lwjgl.system.FunctionProvider
    public long getFunctionAddress(ByteBuffer functionName) {
        long nameRef = CString2CFString(functionName, 1536);
        try {
            long jCFBundleGetFunctionPointerForName = CoreFoundation.CFBundleGetFunctionPointerForName(address(), nameRef);
            CoreFoundation.CFRelease(nameRef);
            return jCFBundleGetFunctionPointerForName;
        } catch (Throwable th) {
            CoreFoundation.CFRelease(nameRef);
            throw th;
        }
    }

    private static long CString2CFString(ByteBuffer name, int encoding) {
        return Checks.check(CoreFoundation.CFStringCreateWithCStringNoCopy(0L, name, encoding, CoreFoundation.kCFAllocatorNull));
    }

    @Override // org.lwjgl.system.NativeResource
    public void free() {
        CoreFoundation.CFRelease(address());
    }
}
