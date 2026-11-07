package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupDeviceCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupDeviceCreateInfo.class */
public class VkDeviceGroupDeviceCreateInfo extends Struct<VkDeviceGroupDeviceCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PHYSICALDEVICECOUNT;
    public static final int PPHYSICALDEVICES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PHYSICALDEVICECOUNT = layout.offsetof(2);
        PPHYSICALDEVICES = layout.offsetof(3);
    }

    protected VkDeviceGroupDeviceCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceGroupDeviceCreateInfo create(long address, ByteBuffer container) {
        return new VkDeviceGroupDeviceCreateInfo(address, container);
    }

    public VkDeviceGroupDeviceCreateInfo(ByteBuffer container) {
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
    public int physicalDeviceCount() {
        return nphysicalDeviceCount(address());
    }

    @NativeType("VkPhysicalDevice const *")
    public PointerBuffer pPhysicalDevices() {
        return npPhysicalDevices(address());
    }

    public VkDeviceGroupDeviceCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceGroupDeviceCreateInfo sType$Default() {
        return sType(1000070001);
    }

    public VkDeviceGroupDeviceCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceGroupDeviceCreateInfo pPhysicalDevices(@NativeType("VkPhysicalDevice const *") PointerBuffer value) {
        npPhysicalDevices(address(), value);
        return this;
    }

    public VkDeviceGroupDeviceCreateInfo set(int sType, long pNext, PointerBuffer pPhysicalDevices) {
        sType(sType);
        pNext(pNext);
        pPhysicalDevices(pPhysicalDevices);
        return this;
    }

    public VkDeviceGroupDeviceCreateInfo set(VkDeviceGroupDeviceCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceGroupDeviceCreateInfo malloc() {
        return new VkDeviceGroupDeviceCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceGroupDeviceCreateInfo calloc() {
        return new VkDeviceGroupDeviceCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceGroupDeviceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupDeviceCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceGroupDeviceCreateInfo create(long address) {
        return new VkDeviceGroupDeviceCreateInfo(address, null);
    }

    public static VkDeviceGroupDeviceCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceGroupDeviceCreateInfo(address, null);
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

    public static VkDeviceGroupDeviceCreateInfo malloc(MemoryStack stack) {
        return new VkDeviceGroupDeviceCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceGroupDeviceCreateInfo calloc(MemoryStack stack) {
        return new VkDeviceGroupDeviceCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nphysicalDeviceCount(long struct) {
        return MemoryUtil.memGetInt(struct + PHYSICALDEVICECOUNT);
    }

    public static PointerBuffer npPhysicalDevices(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + PPHYSICALDEVICES), nphysicalDeviceCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nphysicalDeviceCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PHYSICALDEVICECOUNT, value);
    }

    public static void npPhysicalDevices(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + PPHYSICALDEVICES, MemoryUtil.memAddressSafe(value));
        nphysicalDeviceCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nphysicalDeviceCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPHYSICALDEVICES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupDeviceCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupDeviceCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceGroupDeviceCreateInfo, Buffer> implements NativeResource {
        private static final VkDeviceGroupDeviceCreateInfo ELEMENT_FACTORY = VkDeviceGroupDeviceCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceGroupDeviceCreateInfo.SIZEOF);
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
        public VkDeviceGroupDeviceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceGroupDeviceCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceGroupDeviceCreateInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int physicalDeviceCount() {
            return VkDeviceGroupDeviceCreateInfo.nphysicalDeviceCount(address());
        }

        @NativeType("VkPhysicalDevice const *")
        public PointerBuffer pPhysicalDevices() {
            return VkDeviceGroupDeviceCreateInfo.npPhysicalDevices(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceGroupDeviceCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000070001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceGroupDeviceCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pPhysicalDevices(@NativeType("VkPhysicalDevice const *") PointerBuffer value) {
            VkDeviceGroupDeviceCreateInfo.npPhysicalDevices(address(), value);
            return this;
        }
    }
}
