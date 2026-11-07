package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkResourceDescriptorDataEXT.class */
public class VkResourceDescriptorDataEXT extends Struct<VkResourceDescriptorDataEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PIMAGE;
    public static final int PTEXELBUFFER;
    public static final int PADDRESSRANGE;
    public static final int PTENSORARM;

    static {
        Struct.Layout layout = __union(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PIMAGE = layout.offsetof(0);
        PTEXELBUFFER = layout.offsetof(1);
        PADDRESSRANGE = layout.offsetof(2);
        PTENSORARM = layout.offsetof(3);
    }

    protected VkResourceDescriptorDataEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkResourceDescriptorDataEXT create(long address, ByteBuffer container) {
        return new VkResourceDescriptorDataEXT(address, container);
    }

    public VkResourceDescriptorDataEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkImageDescriptorInfoEXT const *")
    public VkImageDescriptorInfoEXT pImage() {
        return npImage(address());
    }

    @NativeType("VkTexelBufferDescriptorInfoEXT const *")
    public VkTexelBufferDescriptorInfoEXT pTexelBuffer() {
        return npTexelBuffer(address());
    }

    @NativeType("VkDeviceAddressRangeEXT const *")
    public VkDeviceAddressRangeEXT pAddressRange() {
        return npAddressRange(address());
    }

    @NativeType("VkTensorViewCreateInfoARM const *")
    public VkTensorViewCreateInfoARM pTensorARM() {
        return npTensorARM(address());
    }

    public VkResourceDescriptorDataEXT pImage(@NativeType("VkImageDescriptorInfoEXT const *") VkImageDescriptorInfoEXT value) {
        npImage(address(), value);
        return this;
    }

    public VkResourceDescriptorDataEXT pTexelBuffer(@NativeType("VkTexelBufferDescriptorInfoEXT const *") VkTexelBufferDescriptorInfoEXT value) {
        npTexelBuffer(address(), value);
        return this;
    }

    public VkResourceDescriptorDataEXT pAddressRange(@NativeType("VkDeviceAddressRangeEXT const *") VkDeviceAddressRangeEXT value) {
        npAddressRange(address(), value);
        return this;
    }

    public VkResourceDescriptorDataEXT pTensorARM(@NativeType("VkTensorViewCreateInfoARM const *") VkTensorViewCreateInfoARM value) {
        npTensorARM(address(), value);
        return this;
    }

    public VkResourceDescriptorDataEXT set(VkResourceDescriptorDataEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkResourceDescriptorDataEXT malloc() {
        return new VkResourceDescriptorDataEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkResourceDescriptorDataEXT calloc() {
        return new VkResourceDescriptorDataEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkResourceDescriptorDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkResourceDescriptorDataEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkResourceDescriptorDataEXT create(long address) {
        return new VkResourceDescriptorDataEXT(address, null);
    }

    public static VkResourceDescriptorDataEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkResourceDescriptorDataEXT(address, null);
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

    public static VkResourceDescriptorDataEXT malloc(MemoryStack stack) {
        return new VkResourceDescriptorDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkResourceDescriptorDataEXT calloc(MemoryStack stack) {
        return new VkResourceDescriptorDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkImageDescriptorInfoEXT npImage(long struct) {
        return VkImageDescriptorInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PIMAGE));
    }

    public static VkTexelBufferDescriptorInfoEXT npTexelBuffer(long struct) {
        return VkTexelBufferDescriptorInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PTEXELBUFFER));
    }

    public static VkDeviceAddressRangeEXT npAddressRange(long struct) {
        return VkDeviceAddressRangeEXT.createSafe(MemoryUtil.memGetAddress(struct + PADDRESSRANGE));
    }

    public static VkTensorViewCreateInfoARM npTensorARM(long struct) {
        return VkTensorViewCreateInfoARM.createSafe(MemoryUtil.memGetAddress(struct + PTENSORARM));
    }

    public static void npImage(long struct, VkImageDescriptorInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PIMAGE, MemoryUtil.memAddressSafe(value));
    }

    public static void npTexelBuffer(long struct, VkTexelBufferDescriptorInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PTEXELBUFFER, MemoryUtil.memAddressSafe(value));
    }

    public static void npAddressRange(long struct, VkDeviceAddressRangeEXT value) {
        MemoryUtil.memPutAddress(struct + PADDRESSRANGE, MemoryUtil.memAddressSafe(value));
    }

    public static void npTensorARM(long struct, VkTensorViewCreateInfoARM value) {
        MemoryUtil.memPutAddress(struct + PTENSORARM, MemoryUtil.memAddressSafe(value));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkResourceDescriptorDataEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkResourceDescriptorDataEXT, Buffer> implements NativeResource {
        private static final VkResourceDescriptorDataEXT ELEMENT_FACTORY = VkResourceDescriptorDataEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkResourceDescriptorDataEXT.SIZEOF);
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
        public VkResourceDescriptorDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkImageDescriptorInfoEXT const *")
        public VkImageDescriptorInfoEXT pImage() {
            return VkResourceDescriptorDataEXT.npImage(address());
        }

        @NativeType("VkTexelBufferDescriptorInfoEXT const *")
        public VkTexelBufferDescriptorInfoEXT pTexelBuffer() {
            return VkResourceDescriptorDataEXT.npTexelBuffer(address());
        }

        @NativeType("VkDeviceAddressRangeEXT const *")
        public VkDeviceAddressRangeEXT pAddressRange() {
            return VkResourceDescriptorDataEXT.npAddressRange(address());
        }

        @NativeType("VkTensorViewCreateInfoARM const *")
        public VkTensorViewCreateInfoARM pTensorARM() {
            return VkResourceDescriptorDataEXT.npTensorARM(address());
        }

        public Buffer pImage(@NativeType("VkImageDescriptorInfoEXT const *") VkImageDescriptorInfoEXT value) {
            VkResourceDescriptorDataEXT.npImage(address(), value);
            return this;
        }

        public Buffer pTexelBuffer(@NativeType("VkTexelBufferDescriptorInfoEXT const *") VkTexelBufferDescriptorInfoEXT value) {
            VkResourceDescriptorDataEXT.npTexelBuffer(address(), value);
            return this;
        }

        public Buffer pAddressRange(@NativeType("VkDeviceAddressRangeEXT const *") VkDeviceAddressRangeEXT value) {
            VkResourceDescriptorDataEXT.npAddressRange(address(), value);
            return this;
        }

        public Buffer pTensorARM(@NativeType("VkTensorViewCreateInfoARM const *") VkTensorViewCreateInfoARM value) {
            VkResourceDescriptorDataEXT.npTensorARM(address(), value);
            return this;
        }
    }
}
