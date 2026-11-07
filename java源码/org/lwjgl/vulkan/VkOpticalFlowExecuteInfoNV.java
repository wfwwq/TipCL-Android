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
import org.lwjgl.vulkan.VkRect2D;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowExecuteInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowExecuteInfoNV.class */
public class VkOpticalFlowExecuteInfoNV extends Struct<VkOpticalFlowExecuteInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int REGIONCOUNT;
    public static final int PREGIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        REGIONCOUNT = layout.offsetof(3);
        PREGIONS = layout.offsetof(4);
    }

    protected VkOpticalFlowExecuteInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkOpticalFlowExecuteInfoNV create(long address, ByteBuffer container) {
        return new VkOpticalFlowExecuteInfoNV(address, container);
    }

    public VkOpticalFlowExecuteInfoNV(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkOpticalFlowExecuteFlagsNV")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int regionCount() {
        return nregionCount(address());
    }

    @NativeType("VkRect2D const *")
    public VkRect2D.Buffer pRegions() {
        return npRegions(address());
    }

    public VkOpticalFlowExecuteInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkOpticalFlowExecuteInfoNV sType$Default() {
        return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV);
    }

    public VkOpticalFlowExecuteInfoNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkOpticalFlowExecuteInfoNV flags(@NativeType("VkOpticalFlowExecuteFlagsNV") int value) {
        nflags(address(), value);
        return this;
    }

    public VkOpticalFlowExecuteInfoNV pRegions(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    public VkOpticalFlowExecuteInfoNV set(int sType, long pNext, int flags, VkRect2D.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pRegions(pRegions);
        return this;
    }

    public VkOpticalFlowExecuteInfoNV set(VkOpticalFlowExecuteInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkOpticalFlowExecuteInfoNV malloc() {
        return new VkOpticalFlowExecuteInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkOpticalFlowExecuteInfoNV calloc() {
        return new VkOpticalFlowExecuteInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkOpticalFlowExecuteInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpticalFlowExecuteInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkOpticalFlowExecuteInfoNV create(long address) {
        return new VkOpticalFlowExecuteInfoNV(address, null);
    }

    public static VkOpticalFlowExecuteInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkOpticalFlowExecuteInfoNV(address, null);
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

    public static VkOpticalFlowExecuteInfoNV malloc(MemoryStack stack) {
        return new VkOpticalFlowExecuteInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkOpticalFlowExecuteInfoNV calloc(MemoryStack stack) {
        return new VkOpticalFlowExecuteInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nregionCount(long struct) {
        return MemoryUtil.memGetInt(struct + REGIONCOUNT);
    }

    public static VkRect2D.Buffer npRegions(long struct) {
        return VkRect2D.createSafe(MemoryUtil.memGetAddress(struct + PREGIONS), nregionCount(struct));
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

    public static void nregionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + REGIONCOUNT, value);
    }

    public static void npRegions(long struct, VkRect2D.Buffer value) {
        MemoryUtil.memPutAddress(struct + PREGIONS, MemoryUtil.memAddressSafe(value));
        nregionCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nregionCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PREGIONS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowExecuteInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowExecuteInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkOpticalFlowExecuteInfoNV, Buffer> implements NativeResource {
        private static final VkOpticalFlowExecuteInfoNV ELEMENT_FACTORY = VkOpticalFlowExecuteInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkOpticalFlowExecuteInfoNV.SIZEOF);
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
        public VkOpticalFlowExecuteInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkOpticalFlowExecuteInfoNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkOpticalFlowExecuteInfoNV.npNext(address());
        }

        @NativeType("VkOpticalFlowExecuteFlagsNV")
        public int flags() {
            return VkOpticalFlowExecuteInfoNV.nflags(address());
        }

        @NativeType("uint32_t")
        public int regionCount() {
            return VkOpticalFlowExecuteInfoNV.nregionCount(address());
        }

        @NativeType("VkRect2D const *")
        public VkRect2D.Buffer pRegions() {
            return VkOpticalFlowExecuteInfoNV.npRegions(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkOpticalFlowExecuteInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkOpticalFlowExecuteInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkOpticalFlowExecuteFlagsNV") int value) {
            VkOpticalFlowExecuteInfoNV.nflags(address(), value);
            return this;
        }

        public Buffer pRegions(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
            VkOpticalFlowExecuteInfoNV.npRegions(address(), value);
            return this;
        }
    }
}
