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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassMultiviewCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassMultiviewCreateInfo.class */
public class VkRenderPassMultiviewCreateInfo extends Struct<VkRenderPassMultiviewCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SUBPASSCOUNT;
    public static final int PVIEWMASKS;
    public static final int DEPENDENCYCOUNT;
    public static final int PVIEWOFFSETS;
    public static final int CORRELATIONMASKCOUNT;
    public static final int PCORRELATIONMASKS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUBPASSCOUNT = layout.offsetof(2);
        PVIEWMASKS = layout.offsetof(3);
        DEPENDENCYCOUNT = layout.offsetof(4);
        PVIEWOFFSETS = layout.offsetof(5);
        CORRELATIONMASKCOUNT = layout.offsetof(6);
        PCORRELATIONMASKS = layout.offsetof(7);
    }

    protected VkRenderPassMultiviewCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassMultiviewCreateInfo create(long address, ByteBuffer container) {
        return new VkRenderPassMultiviewCreateInfo(address, container);
    }

    public VkRenderPassMultiviewCreateInfo(ByteBuffer container) {
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
    public int subpassCount() {
        return nsubpassCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pViewMasks() {
        return npViewMasks(address());
    }

    @NativeType("uint32_t")
    public int dependencyCount() {
        return ndependencyCount(address());
    }

    @NativeType("int32_t const *")
    public IntBuffer pViewOffsets() {
        return npViewOffsets(address());
    }

    @NativeType("uint32_t")
    public int correlationMaskCount() {
        return ncorrelationMaskCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pCorrelationMasks() {
        return npCorrelationMasks(address());
    }

    public VkRenderPassMultiviewCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassMultiviewCreateInfo sType$Default() {
        return sType(1000053000);
    }

    public VkRenderPassMultiviewCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassMultiviewCreateInfo pViewMasks(@NativeType("uint32_t const *") IntBuffer value) {
        npViewMasks(address(), value);
        return this;
    }

    public VkRenderPassMultiviewCreateInfo pViewOffsets(@NativeType("int32_t const *") IntBuffer value) {
        npViewOffsets(address(), value);
        return this;
    }

    public VkRenderPassMultiviewCreateInfo pCorrelationMasks(@NativeType("uint32_t const *") IntBuffer value) {
        npCorrelationMasks(address(), value);
        return this;
    }

    public VkRenderPassMultiviewCreateInfo set(int sType, long pNext, IntBuffer pViewMasks, IntBuffer pViewOffsets, IntBuffer pCorrelationMasks) {
        sType(sType);
        pNext(pNext);
        pViewMasks(pViewMasks);
        pViewOffsets(pViewOffsets);
        pCorrelationMasks(pCorrelationMasks);
        return this;
    }

    public VkRenderPassMultiviewCreateInfo set(VkRenderPassMultiviewCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassMultiviewCreateInfo malloc() {
        return new VkRenderPassMultiviewCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassMultiviewCreateInfo calloc() {
        return new VkRenderPassMultiviewCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassMultiviewCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassMultiviewCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassMultiviewCreateInfo create(long address) {
        return new VkRenderPassMultiviewCreateInfo(address, null);
    }

    public static VkRenderPassMultiviewCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassMultiviewCreateInfo(address, null);
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

    public static VkRenderPassMultiviewCreateInfo malloc(MemoryStack stack) {
        return new VkRenderPassMultiviewCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassMultiviewCreateInfo calloc(MemoryStack stack) {
        return new VkRenderPassMultiviewCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsubpassCount(long struct) {
        return MemoryUtil.memGetInt(struct + SUBPASSCOUNT);
    }

    public static IntBuffer npViewMasks(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PVIEWMASKS), nsubpassCount(struct));
    }

    public static int ndependencyCount(long struct) {
        return MemoryUtil.memGetInt(struct + DEPENDENCYCOUNT);
    }

    public static IntBuffer npViewOffsets(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PVIEWOFFSETS), ndependencyCount(struct));
    }

    public static int ncorrelationMaskCount(long struct) {
        return MemoryUtil.memGetInt(struct + CORRELATIONMASKCOUNT);
    }

    public static IntBuffer npCorrelationMasks(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PCORRELATIONMASKS), ncorrelationMaskCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsubpassCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBPASSCOUNT, value);
    }

    public static void npViewMasks(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PVIEWMASKS, MemoryUtil.memAddressSafe(value));
        nsubpassCount(struct, value == null ? 0 : value.remaining());
    }

    public static void ndependencyCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPENDENCYCOUNT, value);
    }

    public static void npViewOffsets(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PVIEWOFFSETS, MemoryUtil.memAddressSafe(value));
        ndependencyCount(struct, value == null ? 0 : value.remaining());
    }

    public static void ncorrelationMaskCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + CORRELATIONMASKCOUNT, value);
    }

    public static void npCorrelationMasks(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCORRELATIONMASKS, MemoryUtil.memAddressSafe(value));
        ncorrelationMaskCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nsubpassCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PVIEWMASKS));
        }
        if (ndependencyCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PVIEWOFFSETS));
        }
        if (ncorrelationMaskCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PCORRELATIONMASKS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassMultiviewCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassMultiviewCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassMultiviewCreateInfo, Buffer> implements NativeResource {
        private static final VkRenderPassMultiviewCreateInfo ELEMENT_FACTORY = VkRenderPassMultiviewCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassMultiviewCreateInfo.SIZEOF);
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
        public VkRenderPassMultiviewCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassMultiviewCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassMultiviewCreateInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int subpassCount() {
            return VkRenderPassMultiviewCreateInfo.nsubpassCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pViewMasks() {
            return VkRenderPassMultiviewCreateInfo.npViewMasks(address());
        }

        @NativeType("uint32_t")
        public int dependencyCount() {
            return VkRenderPassMultiviewCreateInfo.ndependencyCount(address());
        }

        @NativeType("int32_t const *")
        public IntBuffer pViewOffsets() {
            return VkRenderPassMultiviewCreateInfo.npViewOffsets(address());
        }

        @NativeType("uint32_t")
        public int correlationMaskCount() {
            return VkRenderPassMultiviewCreateInfo.ncorrelationMaskCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pCorrelationMasks() {
            return VkRenderPassMultiviewCreateInfo.npCorrelationMasks(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassMultiviewCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000053000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassMultiviewCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pViewMasks(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderPassMultiviewCreateInfo.npViewMasks(address(), value);
            return this;
        }

        public Buffer pViewOffsets(@NativeType("int32_t const *") IntBuffer value) {
            VkRenderPassMultiviewCreateInfo.npViewOffsets(address(), value);
            return this;
        }

        public Buffer pCorrelationMasks(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderPassMultiviewCreateInfo.npCorrelationMasks(address(), value);
            return this;
        }
    }
}
