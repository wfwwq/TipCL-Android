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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.class */
public class VkPhysicalDeviceYcbcrImageArraysFeaturesEXT extends Struct<VkPhysicalDeviceYcbcrImageArraysFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int YCBCRIMAGEARRAYS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        YCBCRIMAGEARRAYS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(ByteBuffer container) {
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
    public boolean ycbcrImageArrays() {
        return nycbcrImageArrays(address()) != 0;
    }

    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT sType$Default() {
        return sType(EXTYcbcrImageArrays.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES_EXT);
    }

    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT ycbcrImageArrays(@NativeType("VkBool32") boolean value) {
        nycbcrImageArrays(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT set(int sType, long pNext, boolean ycbcrImageArrays) {
        sType(sType);
        pNext(pNext);
        ycbcrImageArrays(ycbcrImageArrays);
        return this;
    }

    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT set(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT malloc() {
        return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT calloc() {
        return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT create(long address) {
        return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nycbcrImageArrays(long struct) {
        return MemoryUtil.memGetInt(struct + YCBCRIMAGEARRAYS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nycbcrImageArrays(long struct, int value) {
        MemoryUtil.memPutInt(struct + YCBCRIMAGEARRAYS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceYcbcrImageArraysFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceYcbcrImageArraysFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceYcbcrImageArraysFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceYcbcrImageArraysFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean ycbcrImageArrays() {
            return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.nycbcrImageArrays(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTYcbcrImageArrays.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer ycbcrImageArrays(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.nycbcrImageArrays(address(), value ? 1 : 0);
            return this;
        }
    }
}
