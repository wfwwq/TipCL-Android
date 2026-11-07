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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFrameBoundaryFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFrameBoundaryFeaturesEXT.class */
public class VkPhysicalDeviceFrameBoundaryFeaturesEXT extends Struct<VkPhysicalDeviceFrameBoundaryFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FRAMEBOUNDARY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAMEBOUNDARY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFrameBoundaryFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFrameBoundaryFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceFrameBoundaryFeaturesEXT(ByteBuffer container) {
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
    public boolean frameBoundary() {
        return nframeBoundary(address()) != 0;
    }

    public VkPhysicalDeviceFrameBoundaryFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFrameBoundaryFeaturesEXT sType$Default() {
        return sType(EXTFrameBoundary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT);
    }

    public VkPhysicalDeviceFrameBoundaryFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFrameBoundaryFeaturesEXT frameBoundary(@NativeType("VkBool32") boolean value) {
        nframeBoundary(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFrameBoundaryFeaturesEXT set(int sType, long pNext, boolean frameBoundary) {
        sType(sType);
        pNext(pNext);
        frameBoundary(frameBoundary);
        return this;
    }

    public VkPhysicalDeviceFrameBoundaryFeaturesEXT set(VkPhysicalDeviceFrameBoundaryFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT malloc() {
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT calloc() {
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT create(long address) {
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nframeBoundary(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMEBOUNDARY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nframeBoundary(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAMEBOUNDARY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFrameBoundaryFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFrameBoundaryFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFrameBoundaryFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFrameBoundaryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceFrameBoundaryFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFrameBoundaryFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceFrameBoundaryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFrameBoundaryFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFrameBoundaryFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean frameBoundary() {
            return VkPhysicalDeviceFrameBoundaryFeaturesEXT.nframeBoundary(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFrameBoundaryFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTFrameBoundary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFrameBoundaryFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer frameBoundary(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFrameBoundaryFeaturesEXT.nframeBoundary(address(), value ? 1 : 0);
            return this;
        }
    }
}
