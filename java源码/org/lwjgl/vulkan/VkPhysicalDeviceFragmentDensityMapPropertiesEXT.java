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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapPropertiesEXT.class */
public class VkPhysicalDeviceFragmentDensityMapPropertiesEXT extends Struct<VkPhysicalDeviceFragmentDensityMapPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MINFRAGMENTDENSITYTEXELSIZE;
    public static final int MAXFRAGMENTDENSITYTEXELSIZE;
    public static final int FRAGMENTDENSITYINVOCATIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINFRAGMENTDENSITYTEXELSIZE = layout.offsetof(2);
        MAXFRAGMENTDENSITYTEXELSIZE = layout.offsetof(3);
        FRAGMENTDENSITYINVOCATIONS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceFragmentDensityMapPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(ByteBuffer container) {
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

    public VkExtent2D minFragmentDensityTexelSize() {
        return nminFragmentDensityTexelSize(address());
    }

    public VkExtent2D maxFragmentDensityTexelSize() {
        return nmaxFragmentDensityTexelSize(address());
    }

    @NativeType("VkBool32")
    public boolean fragmentDensityInvocations() {
        return nfragmentDensityInvocations(address()) != 0;
    }

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sType$Default() {
        return sType(EXTFragmentDensityMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT set(VkPhysicalDeviceFragmentDensityMapPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT malloc() {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT calloc() {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT create(long address) {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkExtent2D nminFragmentDensityTexelSize(long struct) {
        return VkExtent2D.create(struct + MINFRAGMENTDENSITYTEXELSIZE);
    }

    public static VkExtent2D nmaxFragmentDensityTexelSize(long struct) {
        return VkExtent2D.create(struct + MAXFRAGMENTDENSITYTEXELSIZE);
    }

    public static int nfragmentDensityInvocations(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTDENSITYINVOCATIONS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMapPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFragmentDensityMapPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFragmentDensityMapPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceFragmentDensityMapPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.npNext(address());
        }

        public VkExtent2D minFragmentDensityTexelSize() {
            return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nminFragmentDensityTexelSize(address());
        }

        public VkExtent2D maxFragmentDensityTexelSize() {
            return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nmaxFragmentDensityTexelSize(address());
        }

        @NativeType("VkBool32")
        public boolean fragmentDensityInvocations() {
            return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nfragmentDensityInvocations(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTFragmentDensityMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFragmentDensityMapPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
