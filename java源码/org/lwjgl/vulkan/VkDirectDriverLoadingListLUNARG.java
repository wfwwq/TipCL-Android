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
import org.lwjgl.vulkan.VkDirectDriverLoadingInfoLUNARG;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDirectDriverLoadingListLUNARG.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDirectDriverLoadingListLUNARG.class */
public class VkDirectDriverLoadingListLUNARG extends Struct<VkDirectDriverLoadingListLUNARG> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MODE;
    public static final int DRIVERCOUNT;
    public static final int PDRIVERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MODE = layout.offsetof(2);
        DRIVERCOUNT = layout.offsetof(3);
        PDRIVERS = layout.offsetof(4);
    }

    protected VkDirectDriverLoadingListLUNARG(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDirectDriverLoadingListLUNARG create(long address, ByteBuffer container) {
        return new VkDirectDriverLoadingListLUNARG(address, container);
    }

    public VkDirectDriverLoadingListLUNARG(ByteBuffer container) {
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

    @NativeType("VkDirectDriverLoadingModeLUNARG")
    public int mode() {
        return nmode(address());
    }

    @NativeType("uint32_t")
    public int driverCount() {
        return ndriverCount(address());
    }

    @NativeType("VkDirectDriverLoadingInfoLUNARG const *")
    public VkDirectDriverLoadingInfoLUNARG.Buffer pDrivers() {
        return npDrivers(address());
    }

    public VkDirectDriverLoadingListLUNARG sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDirectDriverLoadingListLUNARG sType$Default() {
        return sType(LUNARGDirectDriverLoading.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG);
    }

    public VkDirectDriverLoadingListLUNARG pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDirectDriverLoadingListLUNARG mode(@NativeType("VkDirectDriverLoadingModeLUNARG") int value) {
        nmode(address(), value);
        return this;
    }

    public VkDirectDriverLoadingListLUNARG pDrivers(@NativeType("VkDirectDriverLoadingInfoLUNARG const *") VkDirectDriverLoadingInfoLUNARG.Buffer value) {
        npDrivers(address(), value);
        return this;
    }

    public VkDirectDriverLoadingListLUNARG set(int sType, long pNext, int mode, VkDirectDriverLoadingInfoLUNARG.Buffer pDrivers) {
        sType(sType);
        pNext(pNext);
        mode(mode);
        pDrivers(pDrivers);
        return this;
    }

    public VkDirectDriverLoadingListLUNARG set(VkDirectDriverLoadingListLUNARG src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDirectDriverLoadingListLUNARG malloc() {
        return new VkDirectDriverLoadingListLUNARG(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDirectDriverLoadingListLUNARG calloc() {
        return new VkDirectDriverLoadingListLUNARG(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDirectDriverLoadingListLUNARG create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDirectDriverLoadingListLUNARG(MemoryUtil.memAddress(container), container);
    }

    public static VkDirectDriverLoadingListLUNARG create(long address) {
        return new VkDirectDriverLoadingListLUNARG(address, null);
    }

    public static VkDirectDriverLoadingListLUNARG createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDirectDriverLoadingListLUNARG(address, null);
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

    public static VkDirectDriverLoadingListLUNARG malloc(MemoryStack stack) {
        return new VkDirectDriverLoadingListLUNARG(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDirectDriverLoadingListLUNARG calloc(MemoryStack stack) {
        return new VkDirectDriverLoadingListLUNARG(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmode(long struct) {
        return MemoryUtil.memGetInt(struct + MODE);
    }

    public static int ndriverCount(long struct) {
        return MemoryUtil.memGetInt(struct + DRIVERCOUNT);
    }

    public static VkDirectDriverLoadingInfoLUNARG.Buffer npDrivers(long struct) {
        return VkDirectDriverLoadingInfoLUNARG.create(MemoryUtil.memGetAddress(struct + PDRIVERS), ndriverCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmode(long struct, int value) {
        MemoryUtil.memPutInt(struct + MODE, value);
    }

    public static void ndriverCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DRIVERCOUNT, value);
    }

    public static void npDrivers(long struct, VkDirectDriverLoadingInfoLUNARG.Buffer value) {
        MemoryUtil.memPutAddress(struct + PDRIVERS, value.address());
        ndriverCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        int driverCount = ndriverCount(struct);
        long pDrivers = MemoryUtil.memGetAddress(struct + PDRIVERS);
        Checks.check(pDrivers);
        validate(pDrivers, driverCount, VkDirectDriverLoadingInfoLUNARG.SIZEOF, VkDirectDriverLoadingInfoLUNARG::validate);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDirectDriverLoadingListLUNARG$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDirectDriverLoadingListLUNARG$Buffer.class */
    public static class Buffer extends StructBuffer<VkDirectDriverLoadingListLUNARG, Buffer> implements NativeResource {
        private static final VkDirectDriverLoadingListLUNARG ELEMENT_FACTORY = VkDirectDriverLoadingListLUNARG.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDirectDriverLoadingListLUNARG.SIZEOF);
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
        public VkDirectDriverLoadingListLUNARG getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDirectDriverLoadingListLUNARG.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDirectDriverLoadingListLUNARG.npNext(address());
        }

        @NativeType("VkDirectDriverLoadingModeLUNARG")
        public int mode() {
            return VkDirectDriverLoadingListLUNARG.nmode(address());
        }

        @NativeType("uint32_t")
        public int driverCount() {
            return VkDirectDriverLoadingListLUNARG.ndriverCount(address());
        }

        @NativeType("VkDirectDriverLoadingInfoLUNARG const *")
        public VkDirectDriverLoadingInfoLUNARG.Buffer pDrivers() {
            return VkDirectDriverLoadingListLUNARG.npDrivers(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDirectDriverLoadingListLUNARG.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(LUNARGDirectDriverLoading.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDirectDriverLoadingListLUNARG.npNext(address(), value);
            return this;
        }

        public Buffer mode(@NativeType("VkDirectDriverLoadingModeLUNARG") int value) {
            VkDirectDriverLoadingListLUNARG.nmode(address(), value);
            return this;
        }

        public Buffer pDrivers(@NativeType("VkDirectDriverLoadingInfoLUNARG const *") VkDirectDriverLoadingInfoLUNARG.Buffer value) {
            VkDirectDriverLoadingListLUNARG.npDrivers(address(), value);
            return this;
        }
    }
}
