package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkPhysicalDeviceLayeredApiPropertiesKHR;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLayeredApiPropertiesListKHR.class */
public class VkPhysicalDeviceLayeredApiPropertiesListKHR extends Struct<VkPhysicalDeviceLayeredApiPropertiesListKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int LAYEREDAPICOUNT;
    public static final int PLAYEREDAPIS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LAYEREDAPICOUNT = layout.offsetof(2);
        PLAYEREDAPIS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceLayeredApiPropertiesListKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceLayeredApiPropertiesListKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(address, container);
    }

    public VkPhysicalDeviceLayeredApiPropertiesListKHR(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int layeredApiCount() {
        return nlayeredApiCount(address());
    }

    @NativeType("VkPhysicalDeviceLayeredApiPropertiesKHR *")
    public VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer pLayeredApis() {
        return npLayeredApis(address());
    }

    public VkPhysicalDeviceLayeredApiPropertiesListKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceLayeredApiPropertiesListKHR sType$Default() {
        return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR);
    }

    public VkPhysicalDeviceLayeredApiPropertiesListKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceLayeredApiPropertiesListKHR layeredApiCount(@NativeType("uint32_t") int value) {
        nlayeredApiCount(address(), value);
        return this;
    }

    public VkPhysicalDeviceLayeredApiPropertiesListKHR pLayeredApis(@NativeType("VkPhysicalDeviceLayeredApiPropertiesKHR *") VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer value) {
        npLayeredApis(address(), value);
        return this;
    }

    public VkPhysicalDeviceLayeredApiPropertiesListKHR set(int sType, long pNext, int layeredApiCount, VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer pLayeredApis) {
        sType(sType);
        pNext(pNext);
        layeredApiCount(layeredApiCount);
        pLayeredApis(pLayeredApis);
        return this;
    }

    public VkPhysicalDeviceLayeredApiPropertiesListKHR set(VkPhysicalDeviceLayeredApiPropertiesListKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR malloc() {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR calloc() {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR create(long address) {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(address, null);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(address, null);
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

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nlayeredApiCount(long struct) {
        return MemoryUtil.memGetInt(struct + LAYEREDAPICOUNT);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer npLayeredApis(long struct) {
        return VkPhysicalDeviceLayeredApiPropertiesKHR.createSafe(MemoryUtil.memGetAddress(struct + PLAYEREDAPIS), nlayeredApiCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nlayeredApiCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYEREDAPICOUNT, value);
    }

    public static void npLayeredApis(long struct, VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer value) {
        MemoryUtil.memPutAddress(struct + PLAYEREDAPIS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nlayeredApiCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLayeredApiPropertiesListKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLayeredApiPropertiesListKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceLayeredApiPropertiesListKHR ELEMENT_FACTORY = VkPhysicalDeviceLayeredApiPropertiesListKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceLayeredApiPropertiesListKHR.SIZEOF);
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
        public VkPhysicalDeviceLayeredApiPropertiesListKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceLayeredApiPropertiesListKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceLayeredApiPropertiesListKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int layeredApiCount() {
            return VkPhysicalDeviceLayeredApiPropertiesListKHR.nlayeredApiCount(address());
        }

        @NativeType("VkPhysicalDeviceLayeredApiPropertiesKHR *")
        public VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer pLayeredApis() {
            return VkPhysicalDeviceLayeredApiPropertiesListKHR.npLayeredApis(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceLayeredApiPropertiesListKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceLayeredApiPropertiesListKHR.npNext(address(), value);
            return this;
        }

        public Buffer layeredApiCount(@NativeType("uint32_t") int value) {
            VkPhysicalDeviceLayeredApiPropertiesListKHR.nlayeredApiCount(address(), value);
            return this;
        }

        public Buffer pLayeredApis(@NativeType("VkPhysicalDeviceLayeredApiPropertiesKHR *") VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer value) {
            VkPhysicalDeviceLayeredApiPropertiesListKHR.npLayeredApis(address(), value);
            return this;
        }
    }
}
