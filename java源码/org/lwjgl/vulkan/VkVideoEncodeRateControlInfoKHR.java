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
import org.lwjgl.vulkan.VkVideoEncodeRateControlLayerInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlInfoKHR.class */
public class VkVideoEncodeRateControlInfoKHR extends Struct<VkVideoEncodeRateControlInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int RATECONTROLMODE;
    public static final int LAYERCOUNT;
    public static final int PLAYERS;
    public static final int VIRTUALBUFFERSIZEINMS;
    public static final int INITIALVIRTUALBUFFERSIZEINMS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RATECONTROLMODE = layout.offsetof(3);
        LAYERCOUNT = layout.offsetof(4);
        PLAYERS = layout.offsetof(5);
        VIRTUALBUFFERSIZEINMS = layout.offsetof(6);
        INITIALVIRTUALBUFFERSIZEINMS = layout.offsetof(7);
    }

    protected VkVideoEncodeRateControlInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeRateControlInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeRateControlInfoKHR(address, container);
    }

    public VkVideoEncodeRateControlInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeRateControlFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkVideoEncodeRateControlModeFlagBitsKHR")
    public int rateControlMode() {
        return nrateControlMode(address());
    }

    @NativeType("uint32_t")
    public int layerCount() {
        return nlayerCount(address());
    }

    @NativeType("VkVideoEncodeRateControlLayerInfoKHR const *")
    public VkVideoEncodeRateControlLayerInfoKHR.Buffer pLayers() {
        return npLayers(address());
    }

    @NativeType("uint32_t")
    public int virtualBufferSizeInMs() {
        return nvirtualBufferSizeInMs(address());
    }

    @NativeType("uint32_t")
    public int initialVirtualBufferSizeInMs() {
        return ninitialVirtualBufferSizeInMs(address());
    }

    public VkVideoEncodeRateControlInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlInfoKHR sType$Default() {
        return sType(1000299001);
    }

    public VkVideoEncodeRateControlInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlInfoKHR flags(@NativeType("VkVideoEncodeRateControlFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlInfoKHR rateControlMode(@NativeType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) {
        nrateControlMode(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlInfoKHR pLayers(@NativeType("VkVideoEncodeRateControlLayerInfoKHR const *") VkVideoEncodeRateControlLayerInfoKHR.Buffer value) {
        npLayers(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlInfoKHR virtualBufferSizeInMs(@NativeType("uint32_t") int value) {
        nvirtualBufferSizeInMs(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlInfoKHR initialVirtualBufferSizeInMs(@NativeType("uint32_t") int value) {
        ninitialVirtualBufferSizeInMs(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlInfoKHR set(int sType, long pNext, int flags, int rateControlMode, VkVideoEncodeRateControlLayerInfoKHR.Buffer pLayers, int virtualBufferSizeInMs, int initialVirtualBufferSizeInMs) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        rateControlMode(rateControlMode);
        pLayers(pLayers);
        virtualBufferSizeInMs(virtualBufferSizeInMs);
        initialVirtualBufferSizeInMs(initialVirtualBufferSizeInMs);
        return this;
    }

    public VkVideoEncodeRateControlInfoKHR set(VkVideoEncodeRateControlInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeRateControlInfoKHR malloc() {
        return new VkVideoEncodeRateControlInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeRateControlInfoKHR calloc() {
        return new VkVideoEncodeRateControlInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeRateControlInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeRateControlInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeRateControlInfoKHR create(long address) {
        return new VkVideoEncodeRateControlInfoKHR(address, null);
    }

    public static VkVideoEncodeRateControlInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeRateControlInfoKHR(address, null);
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

    public static VkVideoEncodeRateControlInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeRateControlInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeRateControlInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeRateControlInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrateControlMode(long struct) {
        return MemoryUtil.memGetInt(struct + RATECONTROLMODE);
    }

    public static int nlayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + LAYERCOUNT);
    }

    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer npLayers(long struct) {
        return VkVideoEncodeRateControlLayerInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PLAYERS), nlayerCount(struct));
    }

    public static int nvirtualBufferSizeInMs(long struct) {
        return MemoryUtil.memGetInt(struct + VIRTUALBUFFERSIZEINMS);
    }

    public static int ninitialVirtualBufferSizeInMs(long struct) {
        return MemoryUtil.memGetInt(struct + INITIALVIRTUALBUFFERSIZEINMS);
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

    public static void nrateControlMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + RATECONTROLMODE, value);
    }

    public static void nlayerCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYERCOUNT, value);
    }

    public static void npLayers(long struct, VkVideoEncodeRateControlLayerInfoKHR.Buffer value) {
        MemoryUtil.memPutAddress(struct + PLAYERS, MemoryUtil.memAddressSafe(value));
        nlayerCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nvirtualBufferSizeInMs(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIRTUALBUFFERSIZEINMS, value);
    }

    public static void ninitialVirtualBufferSizeInMs(long struct, int value) {
        MemoryUtil.memPutInt(struct + INITIALVIRTUALBUFFERSIZEINMS, value);
    }

    public static void validate(long struct) {
        if (nlayerCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PLAYERS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeRateControlInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeRateControlInfoKHR ELEMENT_FACTORY = VkVideoEncodeRateControlInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeRateControlInfoKHR.SIZEOF);
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
        public VkVideoEncodeRateControlInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeRateControlInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeRateControlInfoKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeRateControlFlagsKHR")
        public int flags() {
            return VkVideoEncodeRateControlInfoKHR.nflags(address());
        }

        @NativeType("VkVideoEncodeRateControlModeFlagBitsKHR")
        public int rateControlMode() {
            return VkVideoEncodeRateControlInfoKHR.nrateControlMode(address());
        }

        @NativeType("uint32_t")
        public int layerCount() {
            return VkVideoEncodeRateControlInfoKHR.nlayerCount(address());
        }

        @NativeType("VkVideoEncodeRateControlLayerInfoKHR const *")
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer pLayers() {
            return VkVideoEncodeRateControlInfoKHR.npLayers(address());
        }

        @NativeType("uint32_t")
        public int virtualBufferSizeInMs() {
            return VkVideoEncodeRateControlInfoKHR.nvirtualBufferSizeInMs(address());
        }

        @NativeType("uint32_t")
        public int initialVirtualBufferSizeInMs() {
            return VkVideoEncodeRateControlInfoKHR.ninitialVirtualBufferSizeInMs(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeRateControlInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000299001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeRateControlInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkVideoEncodeRateControlFlagsKHR") int value) {
            VkVideoEncodeRateControlInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer rateControlMode(@NativeType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) {
            VkVideoEncodeRateControlInfoKHR.nrateControlMode(address(), value);
            return this;
        }

        public Buffer pLayers(@NativeType("VkVideoEncodeRateControlLayerInfoKHR const *") VkVideoEncodeRateControlLayerInfoKHR.Buffer value) {
            VkVideoEncodeRateControlInfoKHR.npLayers(address(), value);
            return this;
        }

        public Buffer virtualBufferSizeInMs(@NativeType("uint32_t") int value) {
            VkVideoEncodeRateControlInfoKHR.nvirtualBufferSizeInMs(address(), value);
            return this;
        }

        public Buffer initialVirtualBufferSizeInMs(@NativeType("uint32_t") int value) {
            VkVideoEncodeRateControlInfoKHR.ninitialVirtualBufferSizeInMs(address(), value);
            return this;
        }
    }
}
