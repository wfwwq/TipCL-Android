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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpacityMicromapPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpacityMicromapPropertiesEXT.class */
public class VkPhysicalDeviceOpacityMicromapPropertiesEXT extends Struct<VkPhysicalDeviceOpacityMicromapPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXOPACITY2STATESUBDIVISIONLEVEL;
    public static final int MAXOPACITY4STATESUBDIVISIONLEVEL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXOPACITY2STATESUBDIVISIONLEVEL = layout.offsetof(2);
        MAXOPACITY4STATESUBDIVISIONLEVEL = layout.offsetof(3);
    }

    protected VkPhysicalDeviceOpacityMicromapPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceOpacityMicromapPropertiesEXT(ByteBuffer container) {
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
    public int maxOpacity2StateSubdivisionLevel() {
        return nmaxOpacity2StateSubdivisionLevel(address());
    }

    @NativeType("uint32_t")
    public int maxOpacity4StateSubdivisionLevel() {
        return nmaxOpacity4StateSubdivisionLevel(address());
    }

    public VkPhysicalDeviceOpacityMicromapPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceOpacityMicromapPropertiesEXT sType$Default() {
        return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceOpacityMicromapPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceOpacityMicromapPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceOpacityMicromapPropertiesEXT set(VkPhysicalDeviceOpacityMicromapPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT malloc() {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT calloc() {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT create(long address) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxOpacity2StateSubdivisionLevel(long struct) {
        return MemoryUtil.memGetInt(struct + MAXOPACITY2STATESUBDIVISIONLEVEL);
    }

    public static int nmaxOpacity4StateSubdivisionLevel(long struct) {
        return MemoryUtil.memGetInt(struct + MAXOPACITY4STATESUBDIVISIONLEVEL);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpacityMicromapPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpacityMicromapPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceOpacityMicromapPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceOpacityMicromapPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceOpacityMicromapPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceOpacityMicromapPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceOpacityMicromapPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceOpacityMicromapPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceOpacityMicromapPropertiesEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxOpacity2StateSubdivisionLevel() {
            return VkPhysicalDeviceOpacityMicromapPropertiesEXT.nmaxOpacity2StateSubdivisionLevel(address());
        }

        @NativeType("uint32_t")
        public int maxOpacity4StateSubdivisionLevel() {
            return VkPhysicalDeviceOpacityMicromapPropertiesEXT.nmaxOpacity4StateSubdivisionLevel(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceOpacityMicromapPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceOpacityMicromapPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
