package org.lwjgl.system.macosx;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/CoreFoundation.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/CoreFoundation.class */
public class CoreFoundation {
    public static final byte TRUE = 1;
    public static final byte FALSE = 0;
    public static final int kCFStringEncodingMacRoman = 0;
    public static final int kCFStringEncodingWindowsLatin1 = 1280;
    public static final int kCFStringEncodingISOLatin1 = 513;
    public static final int kCFStringEncodingNextStepLatin = 2817;
    public static final int kCFStringEncodingASCII = 1536;
    public static final int kCFStringEncodingUnicode = 256;
    public static final int kCFStringEncodingUTF8 = 134217984;
    public static final int kCFStringEncodingNonLossyASCII = 3071;
    public static final int kCFStringEncodingUTF16 = 256;
    public static final int kCFStringEncodingUTF16BE = 268435712;
    public static final int kCFStringEncodingUTF16LE = 335544576;
    public static final int kCFStringEncodingUTF32 = 201326848;
    public static final int kCFStringEncodingUTF32BE = 402653440;
    public static final int kCFStringEncodingUTF32LE = 469762304;
    public static final int kCFURLPOSIXPathStyle = 0;
    public static final int kCFURLHFSPathStyle = 1;
    public static final int kCFURLWindowsPathStyle = 2;
    public static final long kCFAllocatorDefault;
    public static final long kCFAllocatorSystemDefault;
    public static final long kCFAllocatorMalloc;
    public static final long kCFAllocatorMallocZone;
    public static final long kCFAllocatorNull;
    public static final long kCFAllocatorUseContext;

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorDefault();

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorSystemDefault();

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorMalloc();

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorMallocZone();

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorNull();

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorUseContext();

    public static native long nCFRetain(long j);

    public static native void nCFRelease(long j);

    public static native long nCFBundleCreate(long j, long j2);

    public static native long nCFBundleGetBundleWithIdentifier(long j);

    public static native long nCFBundleGetFunctionPointerForName(long j, long j2);

    public static native long nCFStringCreateWithCString(long j, long j2, int i);

    public static native long nCFStringCreateWithCStringNoCopy(long j, long j2, int i, long j3);

    public static native long nCFURLCreateWithFileSystemPath(long j, long j2, long j3, boolean z);

    static {
        Library.initialize();
        kCFAllocatorDefault = kCFAllocatorDefault();
        kCFAllocatorSystemDefault = kCFAllocatorSystemDefault();
        kCFAllocatorMalloc = kCFAllocatorMalloc();
        kCFAllocatorMallocZone = kCFAllocatorMallocZone();
        kCFAllocatorNull = kCFAllocatorNull();
        kCFAllocatorUseContext = kCFAllocatorUseContext();
    }

    protected CoreFoundation() {
        throw new UnsupportedOperationException();
    }

    @NativeType("CFTypeRef")
    public static long CFRetain(@NativeType("CFTypeRef") long cf) {
        if (Checks.CHECKS) {
            Checks.check(cf);
        }
        return nCFRetain(cf);
    }

    public static void CFRelease(@NativeType("CFTypeRef") long cf) {
        if (Checks.CHECKS) {
            Checks.check(cf);
        }
        nCFRelease(cf);
    }

    @NativeType("CFBundleRef")
    public static long CFBundleCreate(@NativeType("CFAllocatorRef") long allocator, @NativeType("CFURLRef") long bundleURL) {
        if (Checks.CHECKS) {
            Checks.check(bundleURL);
        }
        return nCFBundleCreate(allocator, bundleURL);
    }

    @NativeType("CFBundleRef")
    public static long CFBundleGetBundleWithIdentifier(@NativeType("CFStringRef") long bundleID) {
        if (Checks.CHECKS) {
            Checks.check(bundleID);
        }
        return nCFBundleGetBundleWithIdentifier(bundleID);
    }

    @NativeType("void *")
    public static long CFBundleGetFunctionPointerForName(@NativeType("CFBundleRef") long bundle, @NativeType("CFStringRef") long functionName) {
        if (Checks.CHECKS) {
            Checks.check(bundle);
            Checks.check(functionName);
        }
        return nCFBundleGetFunctionPointerForName(bundle, functionName);
    }

    @NativeType("CFStringRef")
    public static long CFStringCreateWithCString(@NativeType("CFAllocatorRef") long allocator, @NativeType("char const *") ByteBuffer cStr, @NativeType("CFStringEncoding") int encoding) {
        return nCFStringCreateWithCString(allocator, MemoryUtil.memAddress(cStr), encoding);
    }

    @NativeType("CFStringRef")
    public static long CFStringCreateWithCStringNoCopy(@NativeType("CFAllocatorRef") long allocator, @NativeType("char const *") ByteBuffer cStr, @NativeType("CFStringEncoding") int encoding, @NativeType("CFAllocatorRef") long contentsDeallocator) {
        return nCFStringCreateWithCStringNoCopy(allocator, MemoryUtil.memAddress(cStr), encoding, contentsDeallocator);
    }

    @NativeType("CFURLRef")
    public static long CFURLCreateWithFileSystemPath(@NativeType("CFAllocatorRef") long allocator, @NativeType("CFStringRef") long filePath, @NativeType("CFURLPathStyle") long pathStyle, @NativeType("Boolean") boolean isDirectory) {
        if (Checks.CHECKS) {
            Checks.check(filePath);
        }
        return nCFURLCreateWithFileSystemPath(allocator, filePath, pathStyle, isDirectory);
    }
}
