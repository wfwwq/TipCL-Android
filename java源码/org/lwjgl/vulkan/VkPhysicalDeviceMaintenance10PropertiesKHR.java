package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance10PropertiesKHR.class */
public class VkPhysicalDeviceMaintenance10PropertiesKHR extends Struct<VkPhysicalDeviceMaintenance10PropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RGBA4OPAQUEBLACKSWIZZLED;
    public static final int RESOLVESRGBFORMATAPPLIESTRANSFERFUNCTION;
    public static final int RESOLVESRGBFORMATSUPPORTSTRANSFERFUNCTIONCONTROL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RGBA4OPAQUEBLACKSWIZZLED = layout.offsetof(2);
        RESOLVESRGBFORMATAPPLIESTRANSFERFUNCTION = layout.offsetof(3);
        RESOLVESRGBFORMATSUPPORTSTRANSFERFUNCTIONCONTROL = layout.offsetof(4);
    }

    protected VkPhysicalDeviceMaintenance10PropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMaintenance10PropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance10PropertiesKHR(address, container);
    }

    public VkPhysicalDeviceMaintenance10PropertiesKHR(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean rgba4OpaqueBlackSwizzled() {
        return nrgba4OpaqueBlackSwizzled(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean resolveSrgbFormatAppliesTransferFunction() {
        return nresolveSrgbFormatAppliesTransferFunction(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean resolveSrgbFormatSupportsTransferFunctionControl() {
        return nresolveSrgbFormatSupportsTransferFunctionControl(address()) != 0;
    }

    public VkPhysicalDeviceMaintenance10PropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMaintenance10PropertiesKHR sType$Default() {
        return sType(KHRMaintenance10.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_PROPERTIES_KHR);
    }

    public VkPhysicalDeviceMaintenance10PropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMaintenance10PropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceMaintenance10PropertiesKHR set(VkPhysicalDeviceMaintenance10PropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMaintenance10PropertiesKHR malloc() {
        return new VkPhysicalDeviceMaintenance10PropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance10PropertiesKHR calloc() {
        return new VkPhysicalDeviceMaintenance10PropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance10PropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance10PropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMaintenance10PropertiesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance10PropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceMaintenance10PropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMaintenance10PropertiesKHR(address, null);
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

    public static VkPhysicalDeviceMaintenance10PropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance10PropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance10PropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance10PropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrgba4OpaqueBlackSwizzled(long struct) {
        return MemoryUtil.memGetInt(struct + RGBA4OPAQUEBLACKSWIZZLED);
    }

    public static int nresolveSrgbFormatAppliesTransferFunction(long struct) {
        return MemoryUtil.memGetInt(struct + RESOLVESRGBFORMATAPPLIESTRANSFERFUNCTION);
    }

    public static int nresolveSrgbFormatSupportsTransferFunctionControl(long struct) {
        return MemoryUtil.memGetInt(struct + RESOLVESRGBFORMATSUPPORTSTRANSFERFUNCTIONCONTROL);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance10PropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance10PropertiesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMaintenance10PropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance10PropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMaintenance10PropertiesKHR.SIZEOF);
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
        public VkPhysicalDeviceMaintenance10PropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMaintenance10PropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMaintenance10PropertiesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean rgba4OpaqueBlackSwizzled() {
            return VkPhysicalDeviceMaintenance10PropertiesKHR.nrgba4OpaqueBlackSwizzled(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean resolveSrgbFormatAppliesTransferFunction() {
            return VkPhysicalDeviceMaintenance10PropertiesKHR.nresolveSrgbFormatAppliesTransferFunction(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean resolveSrgbFormatSupportsTransferFunctionControl() {
            return VkPhysicalDeviceMaintenance10PropertiesKHR.nresolveSrgbFormatSupportsTransferFunctionControl(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMaintenance10PropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRMaintenance10.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMaintenance10PropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
