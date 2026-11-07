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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkStencilOpState.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkStencilOpState.class */
public class VkStencilOpState extends Struct<VkStencilOpState> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FAILOP;
    public static final int PASSOP;
    public static final int DEPTHFAILOP;
    public static final int COMPAREOP;
    public static final int COMPAREMASK;
    public static final int WRITEMASK;
    public static final int REFERENCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FAILOP = layout.offsetof(0);
        PASSOP = layout.offsetof(1);
        DEPTHFAILOP = layout.offsetof(2);
        COMPAREOP = layout.offsetof(3);
        COMPAREMASK = layout.offsetof(4);
        WRITEMASK = layout.offsetof(5);
        REFERENCE = layout.offsetof(6);
    }

    protected VkStencilOpState(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkStencilOpState create(long address, ByteBuffer container) {
        return new VkStencilOpState(address, container);
    }

    public VkStencilOpState(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStencilOp")
    public int failOp() {
        return nfailOp(address());
    }

    @NativeType("VkStencilOp")
    public int passOp() {
        return npassOp(address());
    }

    @NativeType("VkStencilOp")
    public int depthFailOp() {
        return ndepthFailOp(address());
    }

    @NativeType("VkCompareOp")
    public int compareOp() {
        return ncompareOp(address());
    }

    @NativeType("uint32_t")
    public int compareMask() {
        return ncompareMask(address());
    }

    @NativeType("uint32_t")
    public int writeMask() {
        return nwriteMask(address());
    }

    @NativeType("uint32_t")
    public int reference() {
        return nreference(address());
    }

    public VkStencilOpState failOp(@NativeType("VkStencilOp") int value) {
        nfailOp(address(), value);
        return this;
    }

    public VkStencilOpState passOp(@NativeType("VkStencilOp") int value) {
        npassOp(address(), value);
        return this;
    }

    public VkStencilOpState depthFailOp(@NativeType("VkStencilOp") int value) {
        ndepthFailOp(address(), value);
        return this;
    }

    public VkStencilOpState compareOp(@NativeType("VkCompareOp") int value) {
        ncompareOp(address(), value);
        return this;
    }

    public VkStencilOpState compareMask(@NativeType("uint32_t") int value) {
        ncompareMask(address(), value);
        return this;
    }

    public VkStencilOpState writeMask(@NativeType("uint32_t") int value) {
        nwriteMask(address(), value);
        return this;
    }

    public VkStencilOpState reference(@NativeType("uint32_t") int value) {
        nreference(address(), value);
        return this;
    }

    public VkStencilOpState set(int failOp, int passOp, int depthFailOp, int compareOp, int compareMask, int writeMask, int reference) {
        failOp(failOp);
        passOp(passOp);
        depthFailOp(depthFailOp);
        compareOp(compareOp);
        compareMask(compareMask);
        writeMask(writeMask);
        reference(reference);
        return this;
    }

    public VkStencilOpState set(VkStencilOpState src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkStencilOpState malloc() {
        return new VkStencilOpState(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkStencilOpState calloc() {
        return new VkStencilOpState(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkStencilOpState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkStencilOpState(MemoryUtil.memAddress(container), container);
    }

    public static VkStencilOpState create(long address) {
        return new VkStencilOpState(address, null);
    }

    public static VkStencilOpState createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkStencilOpState(address, null);
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

    public static VkStencilOpState malloc(MemoryStack stack) {
        return new VkStencilOpState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkStencilOpState calloc(MemoryStack stack) {
        return new VkStencilOpState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nfailOp(long struct) {
        return MemoryUtil.memGetInt(struct + FAILOP);
    }

    public static int npassOp(long struct) {
        return MemoryUtil.memGetInt(struct + PASSOP);
    }

    public static int ndepthFailOp(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHFAILOP);
    }

    public static int ncompareOp(long struct) {
        return MemoryUtil.memGetInt(struct + COMPAREOP);
    }

    public static int ncompareMask(long struct) {
        return MemoryUtil.memGetInt(struct + COMPAREMASK);
    }

    public static int nwriteMask(long struct) {
        return MemoryUtil.memGetInt(struct + WRITEMASK);
    }

    public static int nreference(long struct) {
        return MemoryUtil.memGetInt(struct + REFERENCE);
    }

    public static void nfailOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + FAILOP, value);
    }

    public static void npassOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + PASSOP, value);
    }

    public static void ndepthFailOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHFAILOP, value);
    }

    public static void ncompareOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPAREOP, value);
    }

    public static void ncompareMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPAREMASK, value);
    }

    public static void nwriteMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + WRITEMASK, value);
    }

    public static void nreference(long struct, int value) {
        MemoryUtil.memPutInt(struct + REFERENCE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkStencilOpState$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkStencilOpState$Buffer.class */
    public static class Buffer extends StructBuffer<VkStencilOpState, Buffer> implements NativeResource {
        private static final VkStencilOpState ELEMENT_FACTORY = VkStencilOpState.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkStencilOpState.SIZEOF);
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
        public VkStencilOpState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStencilOp")
        public int failOp() {
            return VkStencilOpState.nfailOp(address());
        }

        @NativeType("VkStencilOp")
        public int passOp() {
            return VkStencilOpState.npassOp(address());
        }

        @NativeType("VkStencilOp")
        public int depthFailOp() {
            return VkStencilOpState.ndepthFailOp(address());
        }

        @NativeType("VkCompareOp")
        public int compareOp() {
            return VkStencilOpState.ncompareOp(address());
        }

        @NativeType("uint32_t")
        public int compareMask() {
            return VkStencilOpState.ncompareMask(address());
        }

        @NativeType("uint32_t")
        public int writeMask() {
            return VkStencilOpState.nwriteMask(address());
        }

        @NativeType("uint32_t")
        public int reference() {
            return VkStencilOpState.nreference(address());
        }

        public Buffer failOp(@NativeType("VkStencilOp") int value) {
            VkStencilOpState.nfailOp(address(), value);
            return this;
        }

        public Buffer passOp(@NativeType("VkStencilOp") int value) {
            VkStencilOpState.npassOp(address(), value);
            return this;
        }

        public Buffer depthFailOp(@NativeType("VkStencilOp") int value) {
            VkStencilOpState.ndepthFailOp(address(), value);
            return this;
        }

        public Buffer compareOp(@NativeType("VkCompareOp") int value) {
            VkStencilOpState.ncompareOp(address(), value);
            return this;
        }

        public Buffer compareMask(@NativeType("uint32_t") int value) {
            VkStencilOpState.ncompareMask(address(), value);
            return this;
        }

        public Buffer writeMask(@NativeType("uint32_t") int value) {
            VkStencilOpState.nwriteMask(address(), value);
            return this;
        }

        public Buffer reference(@NativeType("uint32_t") int value) {
            VkStencilOpState.nreference(address(), value);
            return this;
        }
    }
}
