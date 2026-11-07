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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetAllocateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetAllocateInfo.class */
public class VkDescriptorSetAllocateInfo extends Struct<VkDescriptorSetAllocateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DESCRIPTORPOOL;
    public static final int DESCRIPTORSETCOUNT;
    public static final int PSETLAYOUTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORPOOL = layout.offsetof(2);
        DESCRIPTORSETCOUNT = layout.offsetof(3);
        PSETLAYOUTS = layout.offsetof(4);
    }

    protected VkDescriptorSetAllocateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorSetAllocateInfo create(long address, ByteBuffer container) {
        return new VkDescriptorSetAllocateInfo(address, container);
    }

    public VkDescriptorSetAllocateInfo(ByteBuffer container) {
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

    @NativeType("VkDescriptorPool")
    public long descriptorPool() {
        return ndescriptorPool(address());
    }

    @NativeType("uint32_t")
    public int descriptorSetCount() {
        return ndescriptorSetCount(address());
    }

    @NativeType("VkDescriptorSetLayout const *")
    public LongBuffer pSetLayouts() {
        return npSetLayouts(address());
    }

    public VkDescriptorSetAllocateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorSetAllocateInfo sType$Default() {
        return sType(34);
    }

    public VkDescriptorSetAllocateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorSetAllocateInfo pNext(VkDescriptorSetVariableDescriptorCountAllocateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorSetAllocateInfo pNext(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorSetAllocateInfo descriptorPool(@NativeType("VkDescriptorPool") long value) {
        ndescriptorPool(address(), value);
        return this;
    }

    public VkDescriptorSetAllocateInfo pSetLayouts(@NativeType("VkDescriptorSetLayout const *") LongBuffer value) {
        npSetLayouts(address(), value);
        return this;
    }

    public VkDescriptorSetAllocateInfo set(int sType, long pNext, long descriptorPool, LongBuffer pSetLayouts) {
        sType(sType);
        pNext(pNext);
        descriptorPool(descriptorPool);
        pSetLayouts(pSetLayouts);
        return this;
    }

    public VkDescriptorSetAllocateInfo set(VkDescriptorSetAllocateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorSetAllocateInfo malloc() {
        return new VkDescriptorSetAllocateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorSetAllocateInfo calloc() {
        return new VkDescriptorSetAllocateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorSetAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetAllocateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorSetAllocateInfo create(long address) {
        return new VkDescriptorSetAllocateInfo(address, null);
    }

    public static VkDescriptorSetAllocateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorSetAllocateInfo(address, null);
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

    public static VkDescriptorSetAllocateInfo malloc(MemoryStack stack) {
        return new VkDescriptorSetAllocateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorSetAllocateInfo calloc(MemoryStack stack) {
        return new VkDescriptorSetAllocateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndescriptorPool(long struct) {
        return MemoryUtil.memGetLong(struct + DESCRIPTORPOOL);
    }

    public static int ndescriptorSetCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORSETCOUNT);
    }

    public static LongBuffer npSetLayouts(long struct) {
        return MemoryUtil.memLongBuffer(MemoryUtil.memGetAddress(struct + PSETLAYOUTS), ndescriptorSetCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndescriptorPool(long struct, long value) {
        MemoryUtil.memPutLong(struct + DESCRIPTORPOOL, value);
    }

    public static void ndescriptorSetCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORSETCOUNT, value);
    }

    public static void npSetLayouts(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSETLAYOUTS, MemoryUtil.memAddress(value));
        ndescriptorSetCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSETLAYOUTS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetAllocateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetAllocateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorSetAllocateInfo, Buffer> implements NativeResource {
        private static final VkDescriptorSetAllocateInfo ELEMENT_FACTORY = VkDescriptorSetAllocateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorSetAllocateInfo.SIZEOF);
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
        public VkDescriptorSetAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorSetAllocateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDescriptorSetAllocateInfo.npNext(address());
        }

        @NativeType("VkDescriptorPool")
        public long descriptorPool() {
            return VkDescriptorSetAllocateInfo.ndescriptorPool(address());
        }

        @NativeType("uint32_t")
        public int descriptorSetCount() {
            return VkDescriptorSetAllocateInfo.ndescriptorSetCount(address());
        }

        @NativeType("VkDescriptorSetLayout const *")
        public LongBuffer pSetLayouts() {
            return VkDescriptorSetAllocateInfo.npSetLayouts(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorSetAllocateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(34);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorSetAllocateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDescriptorSetVariableDescriptorCountAllocateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer descriptorPool(@NativeType("VkDescriptorPool") long value) {
            VkDescriptorSetAllocateInfo.ndescriptorPool(address(), value);
            return this;
        }

        public Buffer pSetLayouts(@NativeType("VkDescriptorSetLayout const *") LongBuffer value) {
            VkDescriptorSetAllocateInfo.npSetLayouts(address(), value);
            return this;
        }
    }
}
