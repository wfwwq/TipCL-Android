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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushConstantsInfo.class */
public class VkPushConstantsInfo extends Struct<VkPushConstantsInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int LAYOUT;
    public static final int STAGEFLAGS;
    public static final int OFFSET;
    public static final int SIZE;
    public static final int PVALUES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LAYOUT = layout.offsetof(2);
        STAGEFLAGS = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        SIZE = layout.offsetof(5);
        PVALUES = layout.offsetof(6);
    }

    protected VkPushConstantsInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPushConstantsInfo create(long address, ByteBuffer container) {
        return new VkPushConstantsInfo(address, container);
    }

    public VkPushConstantsInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineLayout")
    public long layout() {
        return nlayout(address());
    }

    @NativeType("VkShaderStageFlags")
    public int stageFlags() {
        return nstageFlags(address());
    }

    @NativeType("uint32_t")
    public int offset() {
        return noffset(address());
    }

    @NativeType("uint32_t")
    public int size() {
        return nsize(address());
    }

    @NativeType("void const *")
    public ByteBuffer pValues() {
        return npValues(address());
    }

    public VkPushConstantsInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPushConstantsInfo sType$Default() {
        return sType(1000545004);
    }

    public VkPushConstantsInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPushConstantsInfo pNext(VkPipelineLayoutCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPushConstantsInfo pNext(VkPushConstantBankInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPushConstantsInfo layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    public VkPushConstantsInfo stageFlags(@NativeType("VkShaderStageFlags") int value) {
        nstageFlags(address(), value);
        return this;
    }

    public VkPushConstantsInfo offset(@NativeType("uint32_t") int value) {
        noffset(address(), value);
        return this;
    }

    public VkPushConstantsInfo pValues(@NativeType("void const *") ByteBuffer value) {
        npValues(address(), value);
        return this;
    }

    public VkPushConstantsInfo set(int sType, long pNext, long layout, int stageFlags, int offset, ByteBuffer pValues) {
        sType(sType);
        pNext(pNext);
        layout(layout);
        stageFlags(stageFlags);
        offset(offset);
        pValues(pValues);
        return this;
    }

    public VkPushConstantsInfo set(VkPushConstantsInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPushConstantsInfo malloc() {
        return new VkPushConstantsInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPushConstantsInfo calloc() {
        return new VkPushConstantsInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPushConstantsInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushConstantsInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPushConstantsInfo create(long address) {
        return new VkPushConstantsInfo(address, null);
    }

    public static VkPushConstantsInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPushConstantsInfo(address, null);
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

    public static VkPushConstantsInfo malloc(MemoryStack stack) {
        return new VkPushConstantsInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPushConstantsInfo calloc(MemoryStack stack) {
        return new VkPushConstantsInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nlayout(long struct) {
        return MemoryUtil.memGetLong(struct + LAYOUT);
    }

    public static int nstageFlags(long struct) {
        return MemoryUtil.memGetInt(struct + STAGEFLAGS);
    }

    public static int noffset(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET);
    }

    public static int nsize(long struct) {
        return MemoryUtil.memGetInt(struct + SIZE);
    }

    public static ByteBuffer npValues(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PVALUES), nsize(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nlayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + LAYOUT, value);
    }

    public static void nstageFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGEFLAGS, value);
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    public static void nsize(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIZE, value);
    }

    public static void npValues(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PVALUES, MemoryUtil.memAddress(value));
        nsize(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PVALUES));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushConstantsInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPushConstantsInfo, Buffer> implements NativeResource {
        private static final VkPushConstantsInfo ELEMENT_FACTORY = VkPushConstantsInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPushConstantsInfo.SIZEOF);
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
        public VkPushConstantsInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPushConstantsInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPushConstantsInfo.npNext(address());
        }

        @NativeType("VkPipelineLayout")
        public long layout() {
            return VkPushConstantsInfo.nlayout(address());
        }

        @NativeType("VkShaderStageFlags")
        public int stageFlags() {
            return VkPushConstantsInfo.nstageFlags(address());
        }

        @NativeType("uint32_t")
        public int offset() {
            return VkPushConstantsInfo.noffset(address());
        }

        @NativeType("uint32_t")
        public int size() {
            return VkPushConstantsInfo.nsize(address());
        }

        @NativeType("void const *")
        public ByteBuffer pValues() {
            return VkPushConstantsInfo.npValues(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPushConstantsInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000545004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPushConstantsInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineLayoutCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPushConstantBankInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkPushConstantsInfo.nlayout(address(), value);
            return this;
        }

        public Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) {
            VkPushConstantsInfo.nstageFlags(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("uint32_t") int value) {
            VkPushConstantsInfo.noffset(address(), value);
            return this;
        }

        public Buffer pValues(@NativeType("void const *") ByteBuffer value) {
            VkPushConstantsInfo.npValues(address(), value);
            return this;
        }
    }
}
