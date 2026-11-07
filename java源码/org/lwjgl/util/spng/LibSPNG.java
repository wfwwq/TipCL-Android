package org.lwjgl.util.spng;

import org.lwjgl.system.Configuration;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Platform;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/LibSPNG.class */
final class LibSPNG {
    private static native void setupMalloc(long j, long j2, long j3, long j4, long j5, long j6);

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_spng");
        Library.loadSystem(System::load, System::loadLibrary, LibSPNG.class, "org.lwjgl.spng", libName);
        MemoryUtil.MemoryAllocator allocator = MemoryUtil.getAllocator(Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.get(true).booleanValue());
        setupMalloc(allocator.getMalloc(), allocator.getCalloc(), allocator.getRealloc(), allocator.getFree(), allocator.getAlignedAlloc(), allocator.getAlignedFree());
    }

    private LibSPNG() {
    }

    static void initialize() {
    }
}
