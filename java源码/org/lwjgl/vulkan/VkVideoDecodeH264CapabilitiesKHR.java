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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264CapabilitiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264CapabilitiesKHR.class */
public class VkVideoDecodeH264CapabilitiesKHR extends Struct<VkVideoDecodeH264CapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXLEVELIDC;
    public static final int FIELDOFFSETGRANULARITY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXLEVELIDC = layout.offsetof(2);
        FIELDOFFSETGRANULARITY = layout.offsetof(3);
    }

    protected VkVideoDecodeH264CapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeH264CapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeH264CapabilitiesKHR(address, container);
    }

    public VkVideoDecodeH264CapabilitiesKHR(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("StdVideoH264LevelIdc")
    public int maxLevelIdc() {
        return nmaxLevelIdc(address());
    }

    public VkOffset2D fieldOffsetGranularity() {
        return nfieldOffsetGranularity(address());
    }

    public VkVideoDecodeH264CapabilitiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeH264CapabilitiesKHR sType$Default() {
        return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR);
    }

    public VkVideoDecodeH264CapabilitiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeH264CapabilitiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoDecodeH264CapabilitiesKHR set(VkVideoDecodeH264CapabilitiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeH264CapabilitiesKHR malloc() {
        return new VkVideoDecodeH264CapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeH264CapabilitiesKHR calloc() {
        return new VkVideoDecodeH264CapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeH264CapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264CapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeH264CapabilitiesKHR create(long address) {
        return new VkVideoDecodeH264CapabilitiesKHR(address, null);
    }

    public static VkVideoDecodeH264CapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeH264CapabilitiesKHR(address, null);
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

    public static VkVideoDecodeH264CapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264CapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeH264CapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264CapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxLevelIdc(long struct) {
        return MemoryUtil.memGetInt(struct + MAXLEVELIDC);
    }

    public static VkOffset2D nfieldOffsetGranularity(long struct) {
        return VkOffset2D.create(struct + FIELDOFFSETGRANULARITY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264CapabilitiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264CapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264CapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeH264CapabilitiesKHR ELEMENT_FACTORY = VkVideoDecodeH264CapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeH264CapabilitiesKHR.SIZEOF);
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
        public VkVideoDecodeH264CapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeH264CapabilitiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoDecodeH264CapabilitiesKHR.npNext(address());
        }

        @NativeType("StdVideoH264LevelIdc")
        public int maxLevelIdc() {
            return VkVideoDecodeH264CapabilitiesKHR.nmaxLevelIdc(address());
        }

        public VkOffset2D fieldOffsetGranularity() {
            return VkVideoDecodeH264CapabilitiesKHR.nfieldOffsetGranularity(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeH264CapabilitiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoDecodeH264CapabilitiesKHR.npNext(address(), value);
            return this;
        }
    }
}
