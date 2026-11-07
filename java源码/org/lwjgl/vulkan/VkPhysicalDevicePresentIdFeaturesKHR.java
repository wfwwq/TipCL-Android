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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentIdFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentIdFeaturesKHR.class */
public class VkPhysicalDevicePresentIdFeaturesKHR extends Struct<VkPhysicalDevicePresentIdFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTID = layout.offsetof(2);
    }

    protected VkPhysicalDevicePresentIdFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePresentIdFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePresentIdFeaturesKHR(address, container);
    }

    public VkPhysicalDevicePresentIdFeaturesKHR(ByteBuffer container) {
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
    public boolean presentId() {
        return npresentId(address()) != 0;
    }

    public VkPhysicalDevicePresentIdFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePresentIdFeaturesKHR sType$Default() {
        return sType(KHRPresentId.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_FEATURES_KHR);
    }

    public VkPhysicalDevicePresentIdFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePresentIdFeaturesKHR presentId(@NativeType("VkBool32") boolean value) {
        npresentId(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePresentIdFeaturesKHR set(int sType, long pNext, boolean presentId) {
        sType(sType);
        pNext(pNext);
        presentId(presentId);
        return this;
    }

    public VkPhysicalDevicePresentIdFeaturesKHR set(VkPhysicalDevicePresentIdFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePresentIdFeaturesKHR malloc() {
        return new VkPhysicalDevicePresentIdFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePresentIdFeaturesKHR calloc() {
        return new VkPhysicalDevicePresentIdFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePresentIdFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePresentIdFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePresentIdFeaturesKHR create(long address) {
        return new VkPhysicalDevicePresentIdFeaturesKHR(address, null);
    }

    public static VkPhysicalDevicePresentIdFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePresentIdFeaturesKHR(address, null);
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

    public static VkPhysicalDevicePresentIdFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentIdFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePresentIdFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentIdFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npresentId(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTID);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npresentId(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTID, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentIdFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentIdFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePresentIdFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePresentIdFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePresentIdFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePresentIdFeaturesKHR.SIZEOF);
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
        public VkPhysicalDevicePresentIdFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePresentIdFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePresentIdFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean presentId() {
            return VkPhysicalDevicePresentIdFeaturesKHR.npresentId(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePresentIdFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPresentId.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePresentIdFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer presentId(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePresentIdFeaturesKHR.npresentId(address(), value ? 1 : 0);
            return this;
        }
    }
}
