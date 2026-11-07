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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLayeredDriverPropertiesMSFT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLayeredDriverPropertiesMSFT.class */
public class VkPhysicalDeviceLayeredDriverPropertiesMSFT extends Struct<VkPhysicalDeviceLayeredDriverPropertiesMSFT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int UNDERLYINGAPI;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        UNDERLYINGAPI = layout.offsetof(2);
    }

    protected VkPhysicalDeviceLayeredDriverPropertiesMSFT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(address, container);
    }

    public VkPhysicalDeviceLayeredDriverPropertiesMSFT(ByteBuffer container) {
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

    @NativeType("VkLayeredDriverUnderlyingApiMSFT")
    public int underlyingAPI() {
        return nunderlyingAPI(address());
    }

    public VkPhysicalDeviceLayeredDriverPropertiesMSFT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceLayeredDriverPropertiesMSFT sType$Default() {
        return sType(MSFTLayeredDriver.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT);
    }

    public VkPhysicalDeviceLayeredDriverPropertiesMSFT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceLayeredDriverPropertiesMSFT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceLayeredDriverPropertiesMSFT set(VkPhysicalDeviceLayeredDriverPropertiesMSFT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT malloc() {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT calloc() {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT create(long address) {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(address, null);
    }

    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(address, null);
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

    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nunderlyingAPI(long struct) {
        return MemoryUtil.memGetInt(struct + UNDERLYINGAPI);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLayeredDriverPropertiesMSFT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLayeredDriverPropertiesMSFT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLayeredDriverPropertiesMSFT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceLayeredDriverPropertiesMSFT ELEMENT_FACTORY = VkPhysicalDeviceLayeredDriverPropertiesMSFT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceLayeredDriverPropertiesMSFT.SIZEOF);
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
        public VkPhysicalDeviceLayeredDriverPropertiesMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceLayeredDriverPropertiesMSFT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceLayeredDriverPropertiesMSFT.npNext(address());
        }

        @NativeType("VkLayeredDriverUnderlyingApiMSFT")
        public int underlyingAPI() {
            return VkPhysicalDeviceLayeredDriverPropertiesMSFT.nunderlyingAPI(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceLayeredDriverPropertiesMSFT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(MSFTLayeredDriver.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceLayeredDriverPropertiesMSFT.npNext(address(), value);
            return this;
        }
    }
}
