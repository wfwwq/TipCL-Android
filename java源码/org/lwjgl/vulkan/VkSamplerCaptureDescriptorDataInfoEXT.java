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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCaptureDescriptorDataInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCaptureDescriptorDataInfoEXT.class */
public class VkSamplerCaptureDescriptorDataInfoEXT extends Struct<VkSamplerCaptureDescriptorDataInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SAMPLER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLER = layout.offsetof(2);
    }

    protected VkSamplerCaptureDescriptorDataInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSamplerCaptureDescriptorDataInfoEXT create(long address, ByteBuffer container) {
        return new VkSamplerCaptureDescriptorDataInfoEXT(address, container);
    }

    public VkSamplerCaptureDescriptorDataInfoEXT(ByteBuffer container) {
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

    @NativeType("VkSampler")
    public long sampler() {
        return nsampler(address());
    }

    public VkSamplerCaptureDescriptorDataInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSamplerCaptureDescriptorDataInfoEXT sType$Default() {
        return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
    }

    public VkSamplerCaptureDescriptorDataInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSamplerCaptureDescriptorDataInfoEXT sampler(@NativeType("VkSampler") long value) {
        nsampler(address(), value);
        return this;
    }

    public VkSamplerCaptureDescriptorDataInfoEXT set(int sType, long pNext, long sampler) {
        sType(sType);
        pNext(pNext);
        sampler(sampler);
        return this;
    }

    public VkSamplerCaptureDescriptorDataInfoEXT set(VkSamplerCaptureDescriptorDataInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerCaptureDescriptorDataInfoEXT malloc() {
        return new VkSamplerCaptureDescriptorDataInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerCaptureDescriptorDataInfoEXT calloc() {
        return new VkSamplerCaptureDescriptorDataInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerCaptureDescriptorDataInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerCaptureDescriptorDataInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerCaptureDescriptorDataInfoEXT create(long address) {
        return new VkSamplerCaptureDescriptorDataInfoEXT(address, null);
    }

    public static VkSamplerCaptureDescriptorDataInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerCaptureDescriptorDataInfoEXT(address, null);
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

    public static VkSamplerCaptureDescriptorDataInfoEXT malloc(MemoryStack stack) {
        return new VkSamplerCaptureDescriptorDataInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerCaptureDescriptorDataInfoEXT calloc(MemoryStack stack) {
        return new VkSamplerCaptureDescriptorDataInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsampler(long struct) {
        return MemoryUtil.memGetLong(struct + SAMPLER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsampler(long struct, long value) {
        MemoryUtil.memPutLong(struct + SAMPLER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCaptureDescriptorDataInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCaptureDescriptorDataInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSamplerCaptureDescriptorDataInfoEXT, Buffer> implements NativeResource {
        private static final VkSamplerCaptureDescriptorDataInfoEXT ELEMENT_FACTORY = VkSamplerCaptureDescriptorDataInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSamplerCaptureDescriptorDataInfoEXT.SIZEOF);
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
        public VkSamplerCaptureDescriptorDataInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSamplerCaptureDescriptorDataInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSamplerCaptureDescriptorDataInfoEXT.npNext(address());
        }

        @NativeType("VkSampler")
        public long sampler() {
            return VkSamplerCaptureDescriptorDataInfoEXT.nsampler(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerCaptureDescriptorDataInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSamplerCaptureDescriptorDataInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer sampler(@NativeType("VkSampler") long value) {
            VkSamplerCaptureDescriptorDataInfoEXT.nsampler(address(), value);
            return this;
        }
    }
}
