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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetBindingReferenceVALVE.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetBindingReferenceVALVE.class */
public class VkDescriptorSetBindingReferenceVALVE extends Struct<VkDescriptorSetBindingReferenceVALVE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DESCRIPTORSETLAYOUT;
    public static final int BINDING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORSETLAYOUT = layout.offsetof(2);
        BINDING = layout.offsetof(3);
    }

    protected VkDescriptorSetBindingReferenceVALVE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorSetBindingReferenceVALVE create(long address, ByteBuffer container) {
        return new VkDescriptorSetBindingReferenceVALVE(address, container);
    }

    public VkDescriptorSetBindingReferenceVALVE(ByteBuffer container) {
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

    @NativeType("VkDescriptorSetLayout")
    public long descriptorSetLayout() {
        return ndescriptorSetLayout(address());
    }

    @NativeType("uint32_t")
    public int binding() {
        return nbinding(address());
    }

    public VkDescriptorSetBindingReferenceVALVE sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorSetBindingReferenceVALVE sType$Default() {
        return sType(VALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE);
    }

    public VkDescriptorSetBindingReferenceVALVE pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorSetBindingReferenceVALVE descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) {
        ndescriptorSetLayout(address(), value);
        return this;
    }

    public VkDescriptorSetBindingReferenceVALVE binding(@NativeType("uint32_t") int value) {
        nbinding(address(), value);
        return this;
    }

    public VkDescriptorSetBindingReferenceVALVE set(int sType, long pNext, long descriptorSetLayout, int binding) {
        sType(sType);
        pNext(pNext);
        descriptorSetLayout(descriptorSetLayout);
        binding(binding);
        return this;
    }

    public VkDescriptorSetBindingReferenceVALVE set(VkDescriptorSetBindingReferenceVALVE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorSetBindingReferenceVALVE malloc() {
        return new VkDescriptorSetBindingReferenceVALVE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorSetBindingReferenceVALVE calloc() {
        return new VkDescriptorSetBindingReferenceVALVE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorSetBindingReferenceVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetBindingReferenceVALVE(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorSetBindingReferenceVALVE create(long address) {
        return new VkDescriptorSetBindingReferenceVALVE(address, null);
    }

    public static VkDescriptorSetBindingReferenceVALVE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorSetBindingReferenceVALVE(address, null);
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

    public static VkDescriptorSetBindingReferenceVALVE malloc(MemoryStack stack) {
        return new VkDescriptorSetBindingReferenceVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorSetBindingReferenceVALVE calloc(MemoryStack stack) {
        return new VkDescriptorSetBindingReferenceVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndescriptorSetLayout(long struct) {
        return MemoryUtil.memGetLong(struct + DESCRIPTORSETLAYOUT);
    }

    public static int nbinding(long struct) {
        return MemoryUtil.memGetInt(struct + BINDING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndescriptorSetLayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + DESCRIPTORSETLAYOUT, value);
    }

    public static void nbinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDING, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetBindingReferenceVALVE$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetBindingReferenceVALVE$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorSetBindingReferenceVALVE, Buffer> implements NativeResource {
        private static final VkDescriptorSetBindingReferenceVALVE ELEMENT_FACTORY = VkDescriptorSetBindingReferenceVALVE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorSetBindingReferenceVALVE.SIZEOF);
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
        public VkDescriptorSetBindingReferenceVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorSetBindingReferenceVALVE.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDescriptorSetBindingReferenceVALVE.npNext(address());
        }

        @NativeType("VkDescriptorSetLayout")
        public long descriptorSetLayout() {
            return VkDescriptorSetBindingReferenceVALVE.ndescriptorSetLayout(address());
        }

        @NativeType("uint32_t")
        public int binding() {
            return VkDescriptorSetBindingReferenceVALVE.nbinding(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorSetBindingReferenceVALVE.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(VALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorSetBindingReferenceVALVE.npNext(address(), value);
            return this;
        }

        public Buffer descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) {
            VkDescriptorSetBindingReferenceVALVE.ndescriptorSetLayout(address(), value);
            return this;
        }

        public Buffer binding(@NativeType("uint32_t") int value) {
            VkDescriptorSetBindingReferenceVALVE.nbinding(address(), value);
            return this;
        }
    }
}
