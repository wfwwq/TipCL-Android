package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.class */
public class VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT extends Struct<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FRAGMENTDENSITYOFFSETGRANULARITY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTDENSITYOFFSETGRANULARITY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(ByteBuffer container) {
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

    public VkExtent2D fragmentDensityOffsetGranularity() {
        return nfragmentDensityOffsetGranularity(address());
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT sType$Default() {
        return sType(1000425001);
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT set(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT malloc() {
        return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT calloc() {
        return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT create(long address) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkExtent2D nfragmentDensityOffsetGranularity(long struct) {
        return VkExtent2D.create(struct + FRAGMENTDENSITYOFFSETGRANULARITY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.npNext(address());
        }

        public VkExtent2D fragmentDensityOffsetGranularity() {
            return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.nfragmentDensityOffsetGranularity(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000425001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
