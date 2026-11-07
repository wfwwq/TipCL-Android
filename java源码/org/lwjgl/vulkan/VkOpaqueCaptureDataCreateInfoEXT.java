package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpaqueCaptureDataCreateInfoEXT.class */
public class VkOpaqueCaptureDataCreateInfoEXT extends Struct<VkOpaqueCaptureDataCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PDATA = layout.offsetof(2);
    }

    protected VkOpaqueCaptureDataCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkOpaqueCaptureDataCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkOpaqueCaptureDataCreateInfoEXT(address, container);
    }

    public VkOpaqueCaptureDataCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkHostAddressRangeConstEXT const *")
    public VkHostAddressRangeConstEXT pData() {
        return npData(address());
    }

    public VkOpaqueCaptureDataCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkOpaqueCaptureDataCreateInfoEXT sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT);
    }

    public VkOpaqueCaptureDataCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkOpaqueCaptureDataCreateInfoEXT pData(@NativeType("VkHostAddressRangeConstEXT const *") VkHostAddressRangeConstEXT value) {
        npData(address(), value);
        return this;
    }

    public VkOpaqueCaptureDataCreateInfoEXT set(int sType, long pNext, VkHostAddressRangeConstEXT pData) {
        sType(sType);
        pNext(pNext);
        pData(pData);
        return this;
    }

    public VkOpaqueCaptureDataCreateInfoEXT set(VkOpaqueCaptureDataCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkOpaqueCaptureDataCreateInfoEXT malloc() {
        return new VkOpaqueCaptureDataCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkOpaqueCaptureDataCreateInfoEXT calloc() {
        return new VkOpaqueCaptureDataCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkOpaqueCaptureDataCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpaqueCaptureDataCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkOpaqueCaptureDataCreateInfoEXT create(long address) {
        return new VkOpaqueCaptureDataCreateInfoEXT(address, null);
    }

    public static VkOpaqueCaptureDataCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkOpaqueCaptureDataCreateInfoEXT(address, null);
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

    public static VkOpaqueCaptureDataCreateInfoEXT malloc(MemoryStack stack) {
        return new VkOpaqueCaptureDataCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkOpaqueCaptureDataCreateInfoEXT calloc(MemoryStack stack) {
        return new VkOpaqueCaptureDataCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkHostAddressRangeConstEXT npData(long struct) {
        return VkHostAddressRangeConstEXT.createSafe(MemoryUtil.memGetAddress(struct + PDATA));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npData(long struct, VkHostAddressRangeConstEXT value) {
        MemoryUtil.memPutAddress(struct + PDATA, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        long pData = MemoryUtil.memGetAddress(struct + PDATA);
        if (pData != 0) {
            VkHostAddressRangeConstEXT.validate(pData);
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpaqueCaptureDataCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkOpaqueCaptureDataCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkOpaqueCaptureDataCreateInfoEXT ELEMENT_FACTORY = VkOpaqueCaptureDataCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkOpaqueCaptureDataCreateInfoEXT.SIZEOF);
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
        public VkOpaqueCaptureDataCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkOpaqueCaptureDataCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkOpaqueCaptureDataCreateInfoEXT.npNext(address());
        }

        @NativeType("VkHostAddressRangeConstEXT const *")
        public VkHostAddressRangeConstEXT pData() {
            return VkOpaqueCaptureDataCreateInfoEXT.npData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkOpaqueCaptureDataCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkOpaqueCaptureDataCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pData(@NativeType("VkHostAddressRangeConstEXT const *") VkHostAddressRangeConstEXT value) {
            VkOpaqueCaptureDataCreateInfoEXT.npData(address(), value);
            return this;
        }
    }
}
