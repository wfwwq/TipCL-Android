package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.class */
public class VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT extends Struct<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FRAGMENTDENSITYMAPOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTDENSITYMAPOFFSET = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(ByteBuffer container) {
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
    public boolean fragmentDensityMapOffset() {
        return nfragmentDensityMapOffset(address()) != 0;
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT sType$Default() {
        return sType(1000425000);
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT fragmentDensityMapOffset(@NativeType("VkBool32") boolean value) {
        nfragmentDensityMapOffset(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT set(int sType, long pNext, boolean fragmentDensityMapOffset) {
        sType(sType);
        pNext(pNext);
        fragmentDensityMapOffset(fragmentDensityMapOffset);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT set(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT malloc() {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT calloc() {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT create(long address) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nfragmentDensityMapOffset(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTDENSITYMAPOFFSET);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nfragmentDensityMapOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAGMENTDENSITYMAPOFFSET, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean fragmentDensityMapOffset() {
            return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.nfragmentDensityMapOffset(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000425000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer fragmentDensityMapOffset(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.nfragmentDensityMapOffset(address(), value ? 1 : 0);
            return this;
        }
    }
}
