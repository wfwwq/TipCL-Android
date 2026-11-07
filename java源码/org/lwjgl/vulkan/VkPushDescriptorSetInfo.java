package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkWriteDescriptorSet;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushDescriptorSetInfo.class */
public class VkPushDescriptorSetInfo extends Struct<VkPushDescriptorSetInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STAGEFLAGS;
    public static final int LAYOUT;
    public static final int SET;
    public static final int DESCRIPTORWRITECOUNT;
    public static final int PDESCRIPTORWRITES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGEFLAGS = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        SET = layout.offsetof(4);
        DESCRIPTORWRITECOUNT = layout.offsetof(5);
        PDESCRIPTORWRITES = layout.offsetof(6);
    }

    protected VkPushDescriptorSetInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPushDescriptorSetInfo create(long address, ByteBuffer container) {
        return new VkPushDescriptorSetInfo(address, container);
    }

    public VkPushDescriptorSetInfo(ByteBuffer container) {
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

    @NativeType("VkShaderStageFlags")
    public int stageFlags() {
        return nstageFlags(address());
    }

    @NativeType("VkPipelineLayout")
    public long layout() {
        return nlayout(address());
    }

    @NativeType("uint32_t")
    public int set() {
        return nset(address());
    }

    @NativeType("uint32_t")
    public int descriptorWriteCount() {
        return ndescriptorWriteCount(address());
    }

    @NativeType("VkWriteDescriptorSet const *")
    public VkWriteDescriptorSet.Buffer pDescriptorWrites() {
        return npDescriptorWrites(address());
    }

    public VkPushDescriptorSetInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPushDescriptorSetInfo sType$Default() {
        return sType(1000545005);
    }

    public VkPushDescriptorSetInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPushDescriptorSetInfo pNext(VkPipelineLayoutCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPushDescriptorSetInfo stageFlags(@NativeType("VkShaderStageFlags") int value) {
        nstageFlags(address(), value);
        return this;
    }

    public VkPushDescriptorSetInfo layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    public VkPushDescriptorSetInfo set(@NativeType("uint32_t") int value) {
        nset(address(), value);
        return this;
    }

    public VkPushDescriptorSetInfo pDescriptorWrites(@NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer value) {
        npDescriptorWrites(address(), value);
        return this;
    }

    public VkPushDescriptorSetInfo set(int sType, long pNext, int stageFlags, long layout, int set, VkWriteDescriptorSet.Buffer pDescriptorWrites) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        set(set);
        pDescriptorWrites(pDescriptorWrites);
        return this;
    }

    public VkPushDescriptorSetInfo set(VkPushDescriptorSetInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPushDescriptorSetInfo malloc() {
        return new VkPushDescriptorSetInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPushDescriptorSetInfo calloc() {
        return new VkPushDescriptorSetInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPushDescriptorSetInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushDescriptorSetInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPushDescriptorSetInfo create(long address) {
        return new VkPushDescriptorSetInfo(address, null);
    }

    public static VkPushDescriptorSetInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPushDescriptorSetInfo(address, null);
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

    public static VkPushDescriptorSetInfo malloc(MemoryStack stack) {
        return new VkPushDescriptorSetInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPushDescriptorSetInfo calloc(MemoryStack stack) {
        return new VkPushDescriptorSetInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstageFlags(long struct) {
        return MemoryUtil.memGetInt(struct + STAGEFLAGS);
    }

    public static long nlayout(long struct) {
        return MemoryUtil.memGetLong(struct + LAYOUT);
    }

    public static int nset(long struct) {
        return MemoryUtil.memGetInt(struct + SET);
    }

    public static int ndescriptorWriteCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORWRITECOUNT);
    }

    public static VkWriteDescriptorSet.Buffer npDescriptorWrites(long struct) {
        return VkWriteDescriptorSet.create(MemoryUtil.memGetAddress(struct + PDESCRIPTORWRITES), ndescriptorWriteCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstageFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGEFLAGS, value);
    }

    public static void nlayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + LAYOUT, value);
    }

    public static void nset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SET, value);
    }

    public static void ndescriptorWriteCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORWRITECOUNT, value);
    }

    public static void npDescriptorWrites(long struct, VkWriteDescriptorSet.Buffer value) {
        MemoryUtil.memPutAddress(struct + PDESCRIPTORWRITES, value.address());
        ndescriptorWriteCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PDESCRIPTORWRITES));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushDescriptorSetInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPushDescriptorSetInfo, Buffer> implements NativeResource {
        private static final VkPushDescriptorSetInfo ELEMENT_FACTORY = VkPushDescriptorSetInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPushDescriptorSetInfo.SIZEOF);
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
        public VkPushDescriptorSetInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPushDescriptorSetInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPushDescriptorSetInfo.npNext(address());
        }

        @NativeType("VkShaderStageFlags")
        public int stageFlags() {
            return VkPushDescriptorSetInfo.nstageFlags(address());
        }

        @NativeType("VkPipelineLayout")
        public long layout() {
            return VkPushDescriptorSetInfo.nlayout(address());
        }

        @NativeType("uint32_t")
        public int set() {
            return VkPushDescriptorSetInfo.nset(address());
        }

        @NativeType("uint32_t")
        public int descriptorWriteCount() {
            return VkPushDescriptorSetInfo.ndescriptorWriteCount(address());
        }

        @NativeType("VkWriteDescriptorSet const *")
        public VkWriteDescriptorSet.Buffer pDescriptorWrites() {
            return VkPushDescriptorSetInfo.npDescriptorWrites(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPushDescriptorSetInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000545005);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPushDescriptorSetInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineLayoutCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) {
            VkPushDescriptorSetInfo.nstageFlags(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkPushDescriptorSetInfo.nlayout(address(), value);
            return this;
        }

        public Buffer set(@NativeType("uint32_t") int value) {
            VkPushDescriptorSetInfo.nset(address(), value);
            return this;
        }

        public Buffer pDescriptorWrites(@NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer value) {
            VkPushDescriptorSetInfo.npDescriptorWrites(address(), value);
            return this;
        }
    }
}
