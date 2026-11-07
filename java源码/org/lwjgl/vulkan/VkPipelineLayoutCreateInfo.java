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
import org.lwjgl.vulkan.VkPushConstantRange;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineLayoutCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineLayoutCreateInfo.class */
public class VkPipelineLayoutCreateInfo extends Struct<VkPipelineLayoutCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int SETLAYOUTCOUNT;
    public static final int PSETLAYOUTS;
    public static final int PUSHCONSTANTRANGECOUNT;
    public static final int PPUSHCONSTANTRANGES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SETLAYOUTCOUNT = layout.offsetof(3);
        PSETLAYOUTS = layout.offsetof(4);
        PUSHCONSTANTRANGECOUNT = layout.offsetof(5);
        PPUSHCONSTANTRANGES = layout.offsetof(6);
    }

    protected VkPipelineLayoutCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineLayoutCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineLayoutCreateInfo(address, container);
    }

    public VkPipelineLayoutCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineLayoutCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int setLayoutCount() {
        return nsetLayoutCount(address());
    }

    @NativeType("VkDescriptorSetLayout const *")
    public LongBuffer pSetLayouts() {
        return npSetLayouts(address());
    }

    @NativeType("uint32_t")
    public int pushConstantRangeCount() {
        return npushConstantRangeCount(address());
    }

    @NativeType("VkPushConstantRange const *")
    public VkPushConstantRange.Buffer pPushConstantRanges() {
        return npPushConstantRanges(address());
    }

    public VkPipelineLayoutCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineLayoutCreateInfo sType$Default() {
        return sType(30);
    }

    public VkPipelineLayoutCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineLayoutCreateInfo flags(@NativeType("VkPipelineLayoutCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineLayoutCreateInfo setLayoutCount(@NativeType("uint32_t") int value) {
        nsetLayoutCount(address(), value);
        return this;
    }

    public VkPipelineLayoutCreateInfo pSetLayouts(@NativeType("VkDescriptorSetLayout const *") LongBuffer value) {
        npSetLayouts(address(), value);
        return this;
    }

    public VkPipelineLayoutCreateInfo pPushConstantRanges(@NativeType("VkPushConstantRange const *") VkPushConstantRange.Buffer value) {
        npPushConstantRanges(address(), value);
        return this;
    }

    public VkPipelineLayoutCreateInfo set(int sType, long pNext, int flags, int setLayoutCount, LongBuffer pSetLayouts, VkPushConstantRange.Buffer pPushConstantRanges) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        setLayoutCount(setLayoutCount);
        pSetLayouts(pSetLayouts);
        pPushConstantRanges(pPushConstantRanges);
        return this;
    }

    public VkPipelineLayoutCreateInfo set(VkPipelineLayoutCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineLayoutCreateInfo malloc() {
        return new VkPipelineLayoutCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineLayoutCreateInfo calloc() {
        return new VkPipelineLayoutCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineLayoutCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineLayoutCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineLayoutCreateInfo create(long address) {
        return new VkPipelineLayoutCreateInfo(address, null);
    }

    public static VkPipelineLayoutCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineLayoutCreateInfo(address, null);
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

    public static VkPipelineLayoutCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineLayoutCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineLayoutCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineLayoutCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nsetLayoutCount(long struct) {
        return MemoryUtil.memGetInt(struct + SETLAYOUTCOUNT);
    }

    public static LongBuffer npSetLayouts(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PSETLAYOUTS), nsetLayoutCount(struct));
    }

    public static int npushConstantRangeCount(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHCONSTANTRANGECOUNT);
    }

    public static VkPushConstantRange.Buffer npPushConstantRanges(long struct) {
        return VkPushConstantRange.createSafe(MemoryUtil.memGetAddress(struct + PPUSHCONSTANTRANGES), npushConstantRangeCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nsetLayoutCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SETLAYOUTCOUNT, value);
    }

    public static void npSetLayouts(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSETLAYOUTS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nsetLayoutCount(struct, value.remaining());
        }
    }

    public static void npushConstantRangeCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHCONSTANTRANGECOUNT, value);
    }

    public static void npPushConstantRanges(long struct, VkPushConstantRange.Buffer value) {
        MemoryUtil.memPutAddress(struct + PPUSHCONSTANTRANGES, MemoryUtil.memAddressSafe(value));
        npushConstantRangeCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (npushConstantRangeCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPUSHCONSTANTRANGES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineLayoutCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineLayoutCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineLayoutCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineLayoutCreateInfo ELEMENT_FACTORY = VkPipelineLayoutCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineLayoutCreateInfo.SIZEOF);
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
        public VkPipelineLayoutCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineLayoutCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineLayoutCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineLayoutCreateFlags")
        public int flags() {
            return VkPipelineLayoutCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int setLayoutCount() {
            return VkPipelineLayoutCreateInfo.nsetLayoutCount(address());
        }

        @NativeType("VkDescriptorSetLayout const *")
        public LongBuffer pSetLayouts() {
            return VkPipelineLayoutCreateInfo.npSetLayouts(address());
        }

        @NativeType("uint32_t")
        public int pushConstantRangeCount() {
            return VkPipelineLayoutCreateInfo.npushConstantRangeCount(address());
        }

        @NativeType("VkPushConstantRange const *")
        public VkPushConstantRange.Buffer pPushConstantRanges() {
            return VkPipelineLayoutCreateInfo.npPushConstantRanges(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineLayoutCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(30);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineLayoutCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineLayoutCreateFlags") int value) {
            VkPipelineLayoutCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer setLayoutCount(@NativeType("uint32_t") int value) {
            VkPipelineLayoutCreateInfo.nsetLayoutCount(address(), value);
            return this;
        }

        public Buffer pSetLayouts(@NativeType("VkDescriptorSetLayout const *") LongBuffer value) {
            VkPipelineLayoutCreateInfo.npSetLayouts(address(), value);
            return this;
        }

        public Buffer pPushConstantRanges(@NativeType("VkPushConstantRange const *") VkPushConstantRange.Buffer value) {
            VkPipelineLayoutCreateInfo.npPushConstantRanges(address(), value);
            return this;
        }
    }
}
