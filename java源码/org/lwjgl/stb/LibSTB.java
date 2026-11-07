package org.lwjgl.stb;

import org.lwjgl.system.Configuration;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Platform;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/LibSTB.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/LibSTB.class */
final class LibSTB {
    private static native void setupMalloc(long j, long j2, long j3, long j4, long j5, long j6);

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_stb");
        Library.loadSystem(System::load, System::loadLibrary, LibSTB.class, "org.lwjgl.stb", libName);
        MemoryUtil.MemoryAllocator allocator = MemoryUtil.getAllocator(Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.get(true).booleanValue());
        setupMalloc(allocator.getMalloc(), allocator.getCalloc(), allocator.getRealloc(), allocator.getFree(), allocator.getAlignedAlloc(), allocator.getAlignedFree());
    }

    private LibSTB() {
    }

    static void initialize() {
    }
}
