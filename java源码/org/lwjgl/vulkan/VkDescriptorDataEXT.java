package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorDataEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorDataEXT.class */
public class VkDescriptorDataEXT extends Struct<VkDescriptorDataEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PSAMPLER;
    public static final int PCOMBINEDIMAGESAMPLER;
    public static final int PINPUTATTACHMENTIMAGE;
    public static final int PSAMPLEDIMAGE;
    public static final int PSTORAGEIMAGE;
    public static final int PUNIFORMTEXELBUFFER;
    public static final int PSTORAGETEXELBUFFER;
    public static final int PUNIFORMBUFFER;
    public static final int PSTORAGEBUFFER;
    public static final int ACCELERATIONSTRUCTURE;

    static {
        Struct.Layout layout = __union(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PSAMPLER = layout.offsetof(0);
        PCOMBINEDIMAGESAMPLER = layout.offsetof(1);
        PINPUTATTACHMENTIMAGE = layout.offsetof(2);
        PSAMPLEDIMAGE = layout.offsetof(3);
        PSTORAGEIMAGE = layout.offsetof(4);
        PUNIFORMTEXELBUFFER = layout.offsetof(5);
        PSTORAGETEXELBUFFER = layout.offsetof(6);
        PUNIFORMBUFFER = layout.offsetof(7);
        PSTORAGEBUFFER = layout.offsetof(8);
        ACCELERATIONSTRUCTURE = layout.offsetof(9);
    }

    protected VkDescriptorDataEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorDataEXT create(long address, ByteBuffer container) {
        return new VkDescriptorDataEXT(address, container);
    }

    public VkDescriptorDataEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkSampler const *")
    public LongBuffer pSampler(int capacity) {
        return npSampler(address(), capacity);
    }

    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo pCombinedImageSampler() {
        return npCombinedImageSampler(address());
    }

    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo pInputAttachmentImage() {
        return npInputAttachmentImage(address());
    }

    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo pSampledImage() {
        return npSampledImage(address());
    }

    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo pStorageImage() {
        return npStorageImage(address());
    }

    @NativeType("VkDescriptorAddressInfoEXT const *")
    public VkDescriptorAddressInfoEXT pUniformTexelBuffer() {
        return npUniformTexelBuffer(address());
    }

    @NativeType("VkDescriptorAddressInfoEXT const *")
    public VkDescriptorAddressInfoEXT pStorageTexelBuffer() {
        return npStorageTexelBuffer(address());
    }

    @NativeType("VkDescriptorAddressInfoEXT const *")
    public VkDescriptorAddressInfoEXT pUniformBuffer() {
        return npUniformBuffer(address());
    }

    @NativeType("VkDescriptorAddressInfoEXT const *")
    public VkDescriptorAddressInfoEXT pStorageBuffer() {
        return npStorageBuffer(address());
    }

    @NativeType("VkDeviceAddress")
    public long accelerationStructure() {
        return naccelerationStructure(address());
    }

    public VkDescriptorDataEXT pSampler(@NativeType("VkSampler const *") LongBuffer value) {
        npSampler(address(), value);
        return this;
    }

    public VkDescriptorDataEXT pCombinedImageSampler(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) {
        npCombinedImageSampler(address(), value);
        return this;
    }

    public VkDescriptorDataEXT pInputAttachmentImage(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) {
        npInputAttachmentImage(address(), value);
        return this;
    }

    public VkDescriptorDataEXT pSampledImage(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) {
        npSampledImage(address(), value);
        return this;
    }

    public VkDescriptorDataEXT pStorageImage(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) {
        npStorageImage(address(), value);
        return this;
    }

    public VkDescriptorDataEXT pUniformTexelBuffer(@NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) {
        npUniformTexelBuffer(address(), value);
        return this;
    }

    public VkDescriptorDataEXT pStorageTexelBuffer(@NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) {
        npStorageTexelBuffer(address(), value);
        return this;
    }

    public VkDescriptorDataEXT pUniformBuffer(@NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) {
        npUniformBuffer(address(), value);
        return this;
    }

    public VkDescriptorDataEXT pStorageBuffer(@NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) {
        npStorageBuffer(address(), value);
        return this;
    }

    public VkDescriptorDataEXT accelerationStructure(@NativeType("VkDeviceAddress") long value) {
        naccelerationStructure(address(), value);
        return this;
    }

    public VkDescriptorDataEXT set(VkDescriptorDataEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorDataEXT malloc() {
        return new VkDescriptorDataEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorDataEXT calloc() {
        return new VkDescriptorDataEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorDataEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorDataEXT create(long address) {
        return new VkDescriptorDataEXT(address, null);
    }

    public static VkDescriptorDataEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorDataEXT(address, null);
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

    public static VkDescriptorDataEXT malloc(MemoryStack stack) {
        return new VkDescriptorDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorDataEXT calloc(MemoryStack stack) {
        return new VkDescriptorDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static LongBuffer npSampler(long struct, int capacity) {
        return MemoryUtil.memLongBuffer(MemoryUtil.memGetAddress(struct + PSAMPLER), capacity);
    }

    public static VkDescriptorImageInfo npCombinedImageSampler(long struct) {
        return VkDescriptorImageInfo.create(MemoryUtil.memGetAddress(struct + PCOMBINEDIMAGESAMPLER));
    }

    public static VkDescriptorImageInfo npInputAttachmentImage(long struct) {
        return VkDescriptorImageInfo.create(MemoryUtil.memGetAddress(struct + PINPUTATTACHMENTIMAGE));
    }

    public static VkDescriptorImageInfo npSampledImage(long struct) {
        return VkDescriptorImageInfo.createSafe(MemoryUtil.memGetAddress(struct + PSAMPLEDIMAGE));
    }

    public static VkDescriptorImageInfo npStorageImage(long struct) {
        return VkDescriptorImageInfo.createSafe(MemoryUtil.memGetAddress(struct + PSTORAGEIMAGE));
    }

    public static VkDescriptorAddressInfoEXT npUniformTexelBuffer(long struct) {
        return VkDescriptorAddressInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PUNIFORMTEXELBUFFER));
    }

    public static VkDescriptorAddressInfoEXT npStorageTexelBuffer(long struct) {
        return VkDescriptorAddressInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PSTORAGETEXELBUFFER));
    }

    public static VkDescriptorAddressInfoEXT npUniformBuffer(long struct) {
        return VkDescriptorAddressInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PUNIFORMBUFFER));
    }

    public static VkDescriptorAddressInfoEXT npStorageBuffer(long struct) {
        return VkDescriptorAddressInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PSTORAGEBUFFER));
    }

    public static long naccelerationStructure(long struct) {
        return MemoryUtil.memGetLong(struct + ACCELERATIONSTRUCTURE);
    }

    public static void npSampler(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSAMPLER, MemoryUtil.memAddress(value));
    }

    public static void npCombinedImageSampler(long struct, VkDescriptorImageInfo value) {
        MemoryUtil.memPutAddress(struct + PCOMBINEDIMAGESAMPLER, value.address());
    }

    public static void npInputAttachmentImage(long struct, VkDescriptorImageInfo value) {
        MemoryUtil.memPutAddress(struct + PINPUTATTACHMENTIMAGE, value.address());
    }

    public static void npSampledImage(long struct, VkDescriptorImageInfo value) {
        MemoryUtil.memPutAddress(struct + PSAMPLEDIMAGE, MemoryUtil.memAddressSafe(value));
    }

    public static void npStorageImage(long struct, VkDescriptorImageInfo value) {
        MemoryUtil.memPutAddress(struct + PSTORAGEIMAGE, MemoryUtil.memAddressSafe(value));
    }

    public static void npUniformTexelBuffer(long struct, VkDescriptorAddressInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PUNIFORMTEXELBUFFER, MemoryUtil.memAddressSafe(value));
    }

    public static void npStorageTexelBuffer(long struct, VkDescriptorAddressInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PSTORAGETEXELBUFFER, MemoryUtil.memAddressSafe(value));
    }

    public static void npUniformBuffer(long struct, VkDescriptorAddressInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PUNIFORMBUFFER, MemoryUtil.memAddressSafe(value));
    }

    public static void npStorageBuffer(long struct, VkDescriptorAddressInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PSTORAGEBUFFER, MemoryUtil.memAddressSafe(value));
    }

    public static void naccelerationStructure(long struct, long value) {
        MemoryUtil.memPutLong(struct + ACCELERATIONSTRUCTURE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorDataEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorDataEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorDataEXT, Buffer> implements NativeResource {
        private static final VkDescriptorDataEXT ELEMENT_FACTORY = VkDescriptorDataEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorDataEXT.SIZEOF);
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
        public VkDescriptorDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkSampler const *")
        public LongBuffer pSampler(int capacity) {
            return VkDescriptorDataEXT.npSampler(address(), capacity);
        }

        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo pCombinedImageSampler() {
            return VkDescriptorDataEXT.npCombinedImageSampler(address());
        }

        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo pInputAttachmentImage() {
            return VkDescriptorDataEXT.npInputAttachmentImage(address());
        }

        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo pSampledImage() {
            return VkDescriptorDataEXT.npSampledImage(address());
        }

        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo pStorageImage() {
            return VkDescriptorDataEXT.npStorageImage(address());
        }

        @NativeType("VkDescriptorAddressInfoEXT const *")
        public VkDescriptorAddressInfoEXT pUniformTexelBuffer() {
            return VkDescriptorDataEXT.npUniformTexelBuffer(address());
        }

        @NativeType("VkDescriptorAddressInfoEXT const *")
        public VkDescriptorAddressInfoEXT pStorageTexelBuffer() {
            return VkDescriptorDataEXT.npStorageTexelBuffer(address());
        }

        @NativeType("VkDescriptorAddressInfoEXT const *")
        public VkDescriptorAddressInfoEXT pUniformBuffer() {
            return VkDescriptorDataEXT.npUniformBuffer(address());
        }

        @NativeType("VkDescriptorAddressInfoEXT const *")
        public VkDescriptorAddressInfoEXT pStorageBuffer() {
            return VkDescriptorDataEXT.npStorageBuffer(address());
        }

        @NativeType("VkDeviceAddress")
        public long accelerationStructure() {
            return VkDescriptorDataEXT.naccelerationStructure(address());
        }

        public Buffer pSampler(@NativeType("VkSampler const *") LongBuffer value) {
            VkDescriptorDataEXT.npSampler(address(), value);
            return this;
        }

        public Buffer pCombinedImageSampler(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) {
            VkDescriptorDataEXT.npCombinedImageSampler(address(), value);
            return this;
        }

        public Buffer pInputAttachmentImage(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) {
            VkDescriptorDataEXT.npInputAttachmentImage(address(), value);
            return this;
        }

        public Buffer pSampledImage(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) {
            VkDescriptorDataEXT.npSampledImage(address(), value);
            return this;
        }

        public Buffer pStorageImage(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) {
            VkDescriptorDataEXT.npStorageImage(address(), value);
            return this;
        }

        public Buffer pUniformTexelBuffer(@NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) {
            VkDescriptorDataEXT.npUniformTexelBuffer(address(), value);
            return this;
        }

        public Buffer pStorageTexelBuffer(@NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) {
            VkDescriptorDataEXT.npStorageTexelBuffer(address(), value);
            return this;
        }

        public Buffer pUniformBuffer(@NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) {
            VkDescriptorDataEXT.npUniformBuffer(address(), value);
            return this;
        }

        public Buffer pStorageBuffer(@NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) {
            VkDescriptorDataEXT.npStorageBuffer(address(), value);
            return this;
        }

        public Buffer accelerationStructure(@NativeType("VkDeviceAddress") long value) {
            VkDescriptorDataEXT.naccelerationStructure(address(), value);
            return this;
        }
    }
}
