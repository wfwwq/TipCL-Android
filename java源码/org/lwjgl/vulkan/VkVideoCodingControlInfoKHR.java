package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoCodingControlInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoCodingControlInfoKHR.class */
public class VkVideoCodingControlInfoKHR extends Struct<VkVideoCodingControlInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected VkVideoCodingControlInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoCodingControlInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoCodingControlInfoKHR(address, container);
    }

    public VkVideoCodingControlInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoCodingControlFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    public VkVideoCodingControlInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoCodingControlInfoKHR sType$Default() {
        return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR);
    }

    public VkVideoCodingControlInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoCodingControlInfoKHR pNext(VkVideoEncodeAV1RateControlInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCodingControlInfoKHR pNext(VkVideoEncodeH264RateControlInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCodingControlInfoKHR pNext(VkVideoEncodeH265RateControlInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCodingControlInfoKHR pNext(VkVideoEncodeQualityLevelInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCodingControlInfoKHR pNext(VkVideoEncodeRateControlInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCodingControlInfoKHR flags(@NativeType("VkVideoCodingControlFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkVideoCodingControlInfoKHR set(int sType, long pNext, int flags) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        return this;
    }

    public VkVideoCodingControlInfoKHR set(VkVideoCodingControlInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoCodingControlInfoKHR malloc() {
        return new VkVideoCodingControlInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoCodingControlInfoKHR calloc() {
        return new VkVideoCodingControlInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoCodingControlInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoCodingControlInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoCodingControlInfoKHR create(long address) {
        return new VkVideoCodingControlInfoKHR(address, null);
    }

    public static VkVideoCodingControlInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoCodingControlInfoKHR(address, null);
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

    public static VkVideoCodingControlInfoKHR malloc(MemoryStack stack) {
        return new VkVideoCodingControlInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoCodingControlInfoKHR calloc(MemoryStack stack) {
        return new VkVideoCodingControlInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoCodingControlInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoCodingControlInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoCodingControlInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoCodingControlInfoKHR ELEMENT_FACTORY = VkVideoCodingControlInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoCodingControlInfoKHR.SIZEOF);
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
        public VkVideoCodingControlInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoCodingControlInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoCodingControlInfoKHR.npNext(address());
        }

        @NativeType("VkVideoCodingControlFlagsKHR")
        public int flags() {
            return VkVideoCodingControlInfoKHR.nflags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoCodingControlInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoCodingControlInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoEncodeAV1RateControlInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264RateControlInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265RateControlInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeQualityLevelInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeRateControlInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkVideoCodingControlFlagsKHR") int value) {
            VkVideoCodingControlInfoKHR.nflags(address(), value);
            return this;
        }
    }
}
