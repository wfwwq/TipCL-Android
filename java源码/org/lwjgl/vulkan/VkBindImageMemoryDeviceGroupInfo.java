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
import org.lwjgl.vulkan.VkRect2D;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemoryDeviceGroupInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemoryDeviceGroupInfo.class */
public class VkBindImageMemoryDeviceGroupInfo extends Struct<VkBindImageMemoryDeviceGroupInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICEINDEXCOUNT;
    public static final int PDEVICEINDICES;
    public static final int SPLITINSTANCEBINDREGIONCOUNT;
    public static final int PSPLITINSTANCEBINDREGIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEINDEXCOUNT = layout.offsetof(2);
        PDEVICEINDICES = layout.offsetof(3);
        SPLITINSTANCEBINDREGIONCOUNT = layout.offsetof(4);
        PSPLITINSTANCEBINDREGIONS = layout.offsetof(5);
    }

    protected VkBindImageMemoryDeviceGroupInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindImageMemoryDeviceGroupInfo create(long address, ByteBuffer container) {
        return new VkBindImageMemoryDeviceGroupInfo(address, container);
    }

    public VkBindImageMemoryDeviceGroupInfo(ByteBuffer container) {
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
    public int deviceIndexCount() {
        return ndeviceIndexCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pDeviceIndices() {
        return npDeviceIndices(address());
    }

    @NativeType("uint32_t")
    public int splitInstanceBindRegionCount() {
        return nsplitInstanceBindRegionCount(address());
    }

    @NativeType("VkRect2D const *")
    public VkRect2D.Buffer pSplitInstanceBindRegions() {
        return npSplitInstanceBindRegions(address());
    }

    public VkBindImageMemoryDeviceGroupInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindImageMemoryDeviceGroupInfo sType$Default() {
        return sType(1000060014);
    }

    public VkBindImageMemoryDeviceGroupInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindImageMemoryDeviceGroupInfo pDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npDeviceIndices(address(), value);
        return this;
    }

    public VkBindImageMemoryDeviceGroupInfo pSplitInstanceBindRegions(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
        npSplitInstanceBindRegions(address(), value);
        return this;
    }

    public VkBindImageMemoryDeviceGroupInfo set(int sType, long pNext, IntBuffer pDeviceIndices, VkRect2D.Buffer pSplitInstanceBindRegions) {
        sType(sType);
        pNext(pNext);
        pDeviceIndices(pDeviceIndices);
        pSplitInstanceBindRegions(pSplitInstanceBindRegions);
        return this;
    }

    public VkBindImageMemoryDeviceGroupInfo set(VkBindImageMemoryDeviceGroupInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindImageMemoryDeviceGroupInfo malloc() {
        return new VkBindImageMemoryDeviceGroupInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindImageMemoryDeviceGroupInfo calloc() {
        return new VkBindImageMemoryDeviceGroupInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindImageMemoryDeviceGroupInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindImageMemoryDeviceGroupInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkBindImageMemoryDeviceGroupInfo create(long address) {
        return new VkBindImageMemoryDeviceGroupInfo(address, null);
    }

    public static VkBindImageMemoryDeviceGroupInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindImageMemoryDeviceGroupInfo(address, null);
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

    public static VkBindImageMemoryDeviceGroupInfo malloc(MemoryStack stack) {
        return new VkBindImageMemoryDeviceGroupInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindImageMemoryDeviceGroupInfo calloc(MemoryStack stack) {
        return new VkBindImageMemoryDeviceGroupInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndeviceIndexCount(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEINDEXCOUNT);
    }

    public static IntBuffer npDeviceIndices(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PDEVICEINDICES), ndeviceIndexCount(struct));
    }

    public static int nsplitInstanceBindRegionCount(long struct) {
        return MemoryUtil.memGetInt(struct + SPLITINSTANCEBINDREGIONCOUNT);
    }

    public static VkRect2D.Buffer npSplitInstanceBindRegions(long struct) {
        return VkRect2D.createSafe(MemoryUtil.memGetAddress(struct + PSPLITINSTANCEBINDREGIONS), nsplitInstanceBindRegionCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndeviceIndexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEINDEXCOUNT, value);
    }

    public static void npDeviceIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PDEVICEINDICES, MemoryUtil.memAddressSafe(value));
        ndeviceIndexCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nsplitInstanceBindRegionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPLITINSTANCEBINDREGIONCOUNT, value);
    }

    public static void npSplitInstanceBindRegions(long struct, VkRect2D.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSPLITINSTANCEBINDREGIONS, MemoryUtil.memAddressSafe(value));
        nsplitInstanceBindRegionCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (ndeviceIndexCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDEVICEINDICES));
        }
        if (nsplitInstanceBindRegionCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PSPLITINSTANCEBINDREGIONS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemoryDeviceGroupInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemoryDeviceGroupInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindImageMemoryDeviceGroupInfo, Buffer> implements NativeResource {
        private static final VkBindImageMemoryDeviceGroupInfo ELEMENT_FACTORY = VkBindImageMemoryDeviceGroupInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindImageMemoryDeviceGroupInfo.SIZEOF);
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
        public VkBindImageMemoryDeviceGroupInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindImageMemoryDeviceGroupInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindImageMemoryDeviceGroupInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int deviceIndexCount() {
            return VkBindImageMemoryDeviceGroupInfo.ndeviceIndexCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pDeviceIndices() {
            return VkBindImageMemoryDeviceGroupInfo.npDeviceIndices(address());
        }

        @NativeType("uint32_t")
        public int splitInstanceBindRegionCount() {
            return VkBindImageMemoryDeviceGroupInfo.nsplitInstanceBindRegionCount(address());
        }

        @NativeType("VkRect2D const *")
        public VkRect2D.Buffer pSplitInstanceBindRegions() {
            return VkBindImageMemoryDeviceGroupInfo.npSplitInstanceBindRegions(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindImageMemoryDeviceGroupInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000060014);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindImageMemoryDeviceGroupInfo.npNext(address(), value);
            return this;
        }

        public Buffer pDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkBindImageMemoryDeviceGroupInfo.npDeviceIndices(address(), value);
            return this;
        }

        public Buffer pSplitInstanceBindRegions(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
            VkBindImageMemoryDeviceGroupInfo.npSplitInstanceBindRegions(address(), value);
            return this;
        }
    }
}
