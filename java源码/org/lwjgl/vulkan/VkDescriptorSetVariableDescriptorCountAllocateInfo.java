package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetVariableDescriptorCountAllocateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetVariableDescriptorCountAllocateInfo.class */
public class VkDescriptorSetVariableDescriptorCountAllocateInfo extends Struct<VkDescriptorSetVariableDescriptorCountAllocateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DESCRIPTORSETCOUNT;
    public static final int PDESCRIPTORCOUNTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORSETCOUNT = layout.offsetof(2);
        PDESCRIPTORCOUNTS = layout.offsetof(3);
    }

    protected VkDescriptorSetVariableDescriptorCountAllocateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorSetVariableDescriptorCountAllocateInfo create(long address, ByteBuffer container) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(address, container);
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfo(ByteBuffer container) {
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
    public int descriptorSetCount() {
        return ndescriptorSetCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pDescriptorCounts() {
        return npDescriptorCounts(address());
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfo sType$Default() {
        return sType(1000161003);
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfo pDescriptorCounts(@NativeType("uint32_t const *") IntBuffer value) {
        npDescriptorCounts(address(), value);
        return this;
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfo set(int sType, long pNext, IntBuffer pDescriptorCounts) {
        sType(sType);
        pNext(pNext);
        pDescriptorCounts(pDescriptorCounts);
        return this;
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfo set(VkDescriptorSetVariableDescriptorCountAllocateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfo malloc() {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfo calloc() {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfo create(long address) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(address, null);
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(address, null);
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

    public static VkDescriptorSetVariableDescriptorCountAllocateInfo malloc(MemoryStack stack) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfo calloc(MemoryStack stack) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndescriptorSetCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORSETCOUNT);
    }

    public static IntBuffer npDescriptorCounts(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PDESCRIPTORCOUNTS), ndescriptorSetCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndescriptorSetCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORSETCOUNT, value);
    }

    public static void npDescriptorCounts(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PDESCRIPTORCOUNTS, MemoryUtil.memAddressSafe(value));
        ndescriptorSetCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (ndescriptorSetCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDESCRIPTORCOUNTS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetVariableDescriptorCountAllocateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetVariableDescriptorCountAllocateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorSetVariableDescriptorCountAllocateInfo, Buffer> implements NativeResource {
        private static final VkDescriptorSetVariableDescriptorCountAllocateInfo ELEMENT_FACTORY = VkDescriptorSetVariableDescriptorCountAllocateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorSetVariableDescriptorCountAllocateInfo.SIZEOF);
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
        public VkDescriptorSetVariableDescriptorCountAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorSetVariableDescriptorCountAllocateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDescriptorSetVariableDescriptorCountAllocateInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int descriptorSetCount() {
            return VkDescriptorSetVariableDescriptorCountAllocateInfo.ndescriptorSetCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pDescriptorCounts() {
            return VkDescriptorSetVariableDescriptorCountAllocateInfo.npDescriptorCounts(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorSetVariableDescriptorCountAllocateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000161003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorSetVariableDescriptorCountAllocateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pDescriptorCounts(@NativeType("uint32_t const *") IntBuffer value) {
            VkDescriptorSetVariableDescriptorCountAllocateInfo.npDescriptorCounts(address(), value);
            return this;
        }
    }
}
