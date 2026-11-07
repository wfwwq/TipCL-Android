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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupRenderPassBeginInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupRenderPassBeginInfo.class */
public class VkDeviceGroupRenderPassBeginInfo extends Struct<VkDeviceGroupRenderPassBeginInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICEMASK;
    public static final int DEVICERENDERAREACOUNT;
    public static final int PDEVICERENDERAREAS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEMASK = layout.offsetof(2);
        DEVICERENDERAREACOUNT = layout.offsetof(3);
        PDEVICERENDERAREAS = layout.offsetof(4);
    }

    protected VkDeviceGroupRenderPassBeginInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceGroupRenderPassBeginInfo create(long address, ByteBuffer container) {
        return new VkDeviceGroupRenderPassBeginInfo(address, container);
    }

    public VkDeviceGroupRenderPassBeginInfo(ByteBuffer container) {
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
    public int deviceMask() {
        return ndeviceMask(address());
    }

    @NativeType("uint32_t")
    public int deviceRenderAreaCount() {
        return ndeviceRenderAreaCount(address());
    }

    @NativeType("VkRect2D const *")
    public VkRect2D.Buffer pDeviceRenderAreas() {
        return npDeviceRenderAreas(address());
    }

    public VkDeviceGroupRenderPassBeginInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceGroupRenderPassBeginInfo sType$Default() {
        return sType(1000060003);
    }

    public VkDeviceGroupRenderPassBeginInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceGroupRenderPassBeginInfo deviceMask(@NativeType("uint32_t") int value) {
        ndeviceMask(address(), value);
        return this;
    }

    public VkDeviceGroupRenderPassBeginInfo pDeviceRenderAreas(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
        npDeviceRenderAreas(address(), value);
        return this;
    }

    public VkDeviceGroupRenderPassBeginInfo set(int sType, long pNext, int deviceMask, VkRect2D.Buffer pDeviceRenderAreas) {
        sType(sType);
        pNext(pNext);
        deviceMask(deviceMask);
        pDeviceRenderAreas(pDeviceRenderAreas);
        return this;
    }

    public VkDeviceGroupRenderPassBeginInfo set(VkDeviceGroupRenderPassBeginInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceGroupRenderPassBeginInfo malloc() {
        return new VkDeviceGroupRenderPassBeginInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceGroupRenderPassBeginInfo calloc() {
        return new VkDeviceGroupRenderPassBeginInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceGroupRenderPassBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupRenderPassBeginInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceGroupRenderPassBeginInfo create(long address) {
        return new VkDeviceGroupRenderPassBeginInfo(address, null);
    }

    public static VkDeviceGroupRenderPassBeginInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceGroupRenderPassBeginInfo(address, null);
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

    public static VkDeviceGroupRenderPassBeginInfo malloc(MemoryStack stack) {
        return new VkDeviceGroupRenderPassBeginInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceGroupRenderPassBeginInfo calloc(MemoryStack stack) {
        return new VkDeviceGroupRenderPassBeginInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndeviceMask(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEMASK);
    }

    public static int ndeviceRenderAreaCount(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICERENDERAREACOUNT);
    }

    public static VkRect2D.Buffer npDeviceRenderAreas(long struct) {
        return VkRect2D.createSafe(MemoryUtil.memGetAddress(struct + PDEVICERENDERAREAS), ndeviceRenderAreaCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndeviceMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEMASK, value);
    }

    public static void ndeviceRenderAreaCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICERENDERAREACOUNT, value);
    }

    public static void npDeviceRenderAreas(long struct, VkRect2D.Buffer value) {
        MemoryUtil.memPutAddress(struct + PDEVICERENDERAREAS, MemoryUtil.memAddressSafe(value));
        ndeviceRenderAreaCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (ndeviceRenderAreaCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDEVICERENDERAREAS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupRenderPassBeginInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupRenderPassBeginInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceGroupRenderPassBeginInfo, Buffer> implements NativeResource {
        private static final VkDeviceGroupRenderPassBeginInfo ELEMENT_FACTORY = VkDeviceGroupRenderPassBeginInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceGroupRenderPassBeginInfo.SIZEOF);
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
        public VkDeviceGroupRenderPassBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceGroupRenderPassBeginInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceGroupRenderPassBeginInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int deviceMask() {
            return VkDeviceGroupRenderPassBeginInfo.ndeviceMask(address());
        }

        @NativeType("uint32_t")
        public int deviceRenderAreaCount() {
            return VkDeviceGroupRenderPassBeginInfo.ndeviceRenderAreaCount(address());
        }

        @NativeType("VkRect2D const *")
        public VkRect2D.Buffer pDeviceRenderAreas() {
            return VkDeviceGroupRenderPassBeginInfo.npDeviceRenderAreas(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceGroupRenderPassBeginInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000060003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceGroupRenderPassBeginInfo.npNext(address(), value);
            return this;
        }

        public Buffer deviceMask(@NativeType("uint32_t") int value) {
            VkDeviceGroupRenderPassBeginInfo.ndeviceMask(address(), value);
            return this;
        }

        public Buffer pDeviceRenderAreas(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
            VkDeviceGroupRenderPassBeginInfo.npDeviceRenderAreas(address(), value);
            return this;
        }
    }
}
