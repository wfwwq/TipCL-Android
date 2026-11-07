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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.class */
public class VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT extends Struct<VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int NONSEAMLESSCUBEMAP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NONSEAMLESSCUBEMAP = layout.offsetof(2);
    }

    protected VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(ByteBuffer container) {
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
    public boolean nonSeamlessCubeMap() {
        return nnonSeamlessCubeMap(address()) != 0;
    }

    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT sType$Default() {
        return sType(EXTNonSeamlessCubeMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT);
    }

    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT nonSeamlessCubeMap(@NativeType("VkBool32") boolean value) {
        nnonSeamlessCubeMap(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT set(int sType, long pNext, boolean nonSeamlessCubeMap) {
        sType(sType);
        pNext(pNext);
        nonSeamlessCubeMap(nonSeamlessCubeMap);
        return this;
    }

    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT set(VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT malloc() {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT calloc() {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT create(long address) {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nnonSeamlessCubeMap(long struct) {
        return MemoryUtil.memGetInt(struct + NONSEAMLESSCUBEMAP);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nnonSeamlessCubeMap(long struct, int value) {
        MemoryUtil.memPutInt(struct + NONSEAMLESSCUBEMAP, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean nonSeamlessCubeMap() {
            return VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.nnonSeamlessCubeMap(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTNonSeamlessCubeMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer nonSeamlessCubeMap(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.nnonSeamlessCubeMap(address(), value ? 1 : 0);
            return this;
        }
    }
}
