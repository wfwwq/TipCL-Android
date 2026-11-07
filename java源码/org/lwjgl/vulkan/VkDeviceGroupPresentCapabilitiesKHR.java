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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupPresentCapabilitiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupPresentCapabilitiesKHR.class */
public class VkDeviceGroupPresentCapabilitiesKHR extends Struct<VkDeviceGroupPresentCapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTMASK;
    public static final int MODES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __array(4, 32), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTMASK = layout.offsetof(2);
        MODES = layout.offsetof(3);
    }

    protected VkDeviceGroupPresentCapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceGroupPresentCapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkDeviceGroupPresentCapabilitiesKHR(address, container);
    }

    public VkDeviceGroupPresentCapabilitiesKHR(ByteBuffer container) {
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

    @NativeType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]")
    public IntBuffer presentMask() {
        return npresentMask(address());
    }

    @NativeType("uint32_t")
    public int presentMask(int index) {
        return npresentMask(address(), index);
    }

    @NativeType("VkDeviceGroupPresentModeFlagsKHR")
    public int modes() {
        return nmodes(address());
    }

    public VkDeviceGroupPresentCapabilitiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceGroupPresentCapabilitiesKHR sType$Default() {
        return sType(1000060007);
    }

    public VkDeviceGroupPresentCapabilitiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceGroupPresentCapabilitiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkDeviceGroupPresentCapabilitiesKHR set(VkDeviceGroupPresentCapabilitiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceGroupPresentCapabilitiesKHR malloc() {
        return new VkDeviceGroupPresentCapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceGroupPresentCapabilitiesKHR calloc() {
        return new VkDeviceGroupPresentCapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceGroupPresentCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupPresentCapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceGroupPresentCapabilitiesKHR create(long address) {
        return new VkDeviceGroupPresentCapabilitiesKHR(address, null);
    }

    public static VkDeviceGroupPresentCapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceGroupPresentCapabilitiesKHR(address, null);
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

    public static VkDeviceGroupPresentCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkDeviceGroupPresentCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceGroupPresentCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkDeviceGroupPresentCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static IntBuffer npresentMask(long struct) {
        return MemoryUtil.memIntBuffer(struct + PRESENTMASK, 32);
    }

    public static int npresentMask(long struct, int index) {
        return MemoryUtil.memGetInt(struct + PRESENTMASK + (Checks.check(index, 32) * 4));
    }

    public static int nmodes(long struct) {
        return MemoryUtil.memGetInt(struct + MODES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupPresentCapabilitiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupPresentCapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceGroupPresentCapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkDeviceGroupPresentCapabilitiesKHR ELEMENT_FACTORY = VkDeviceGroupPresentCapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceGroupPresentCapabilitiesKHR.SIZEOF);
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
        public VkDeviceGroupPresentCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceGroupPresentCapabilitiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDeviceGroupPresentCapabilitiesKHR.npNext(address());
        }

        @NativeType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]")
        public IntBuffer presentMask() {
            return VkDeviceGroupPresentCapabilitiesKHR.npresentMask(address());
        }

        @NativeType("uint32_t")
        public int presentMask(int index) {
            return VkDeviceGroupPresentCapabilitiesKHR.npresentMask(address(), index);
        }

        @NativeType("VkDeviceGroupPresentModeFlagsKHR")
        public int modes() {
            return VkDeviceGroupPresentCapabilitiesKHR.nmodes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceGroupPresentCapabilitiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000060007);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDeviceGroupPresentCapabilitiesKHR.npNext(address(), value);
            return this;
        }
    }
}
