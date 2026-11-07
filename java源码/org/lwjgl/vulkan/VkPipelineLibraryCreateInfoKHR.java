package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineLibraryCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineLibraryCreateInfoKHR.class */
public class VkPipelineLibraryCreateInfoKHR extends Struct<VkPipelineLibraryCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int LIBRARYCOUNT;
    public static final int PLIBRARIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LIBRARYCOUNT = layout.offsetof(2);
        PLIBRARIES = layout.offsetof(3);
    }

    protected VkPipelineLibraryCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineLibraryCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkPipelineLibraryCreateInfoKHR(address, container);
    }

    public VkPipelineLibraryCreateInfoKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int libraryCount() {
        return nlibraryCount(address());
    }

    @NativeType("VkPipeline const *")
    public LongBuffer pLibraries() {
        return npLibraries(address());
    }

    public VkPipelineLibraryCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineLibraryCreateInfoKHR sType$Default() {
        return sType(KHRPipelineLibrary.VK_STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR);
    }

    public VkPipelineLibraryCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineLibraryCreateInfoKHR pLibraries(@NativeType("VkPipeline const *") LongBuffer value) {
        npLibraries(address(), value);
        return this;
    }

    public VkPipelineLibraryCreateInfoKHR set(int sType, long pNext, LongBuffer pLibraries) {
        sType(sType);
        pNext(pNext);
        pLibraries(pLibraries);
        return this;
    }

    public VkPipelineLibraryCreateInfoKHR set(VkPipelineLibraryCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineLibraryCreateInfoKHR malloc() {
        return new VkPipelineLibraryCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineLibraryCreateInfoKHR calloc() {
        return new VkPipelineLibraryCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineLibraryCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineLibraryCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineLibraryCreateInfoKHR create(long address) {
        return new VkPipelineLibraryCreateInfoKHR(address, null);
    }

    public static VkPipelineLibraryCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineLibraryCreateInfoKHR(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static VkPipelineLibraryCreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineLibraryCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineLibraryCreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineLibraryCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nlibraryCount(long struct) {
        return MemoryUtil.memGetInt(struct + LIBRARYCOUNT);
    }

    public static LongBuffer npLibraries(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PLIBRARIES), nlibraryCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nlibraryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + LIBRARYCOUNT, value);
    }

    public static void npLibraries(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PLIBRARIES, MemoryUtil.memAddressSafe(value));
        nlibraryCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nlibraryCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PLIBRARIES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineLibraryCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineLibraryCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineLibraryCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkPipelineLibraryCreateInfoKHR ELEMENT_FACTORY = VkPipelineLibraryCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineLibraryCreateInfoKHR.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkPipelineLibraryCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineLibraryCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineLibraryCreateInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int libraryCount() {
            return VkPipelineLibraryCreateInfoKHR.nlibraryCount(address());
        }

        @NativeType("VkPipeline const *")
        public LongBuffer pLibraries() {
            return VkPipelineLibraryCreateInfoKHR.npLibraries(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineLibraryCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPipelineLibrary.VK_STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineLibraryCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pLibraries(@NativeType("VkPipeline const *") LongBuffer value) {
            VkPipelineLibraryCreateInfoKHR.npLibraries(address(), value);
            return this;
        }
    }
}
