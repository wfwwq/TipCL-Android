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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.class */
public class VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT extends Struct<VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FRAGMENTSHADERSAMPLEINTERLOCK;
    public static final int FRAGMENTSHADERPIXELINTERLOCK;
    public static final int FRAGMENTSHADERSHADINGRATEINTERLOCK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTSHADERSAMPLEINTERLOCK = layout.offsetof(2);
        FRAGMENTSHADERPIXELINTERLOCK = layout.offsetof(3);
        FRAGMENTSHADERSHADINGRATEINTERLOCK = layout.offsetof(4);
    }

    protected VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(ByteBuffer container) {
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
    public boolean fragmentShaderSampleInterlock() {
        return nfragmentShaderSampleInterlock(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fragmentShaderPixelInterlock() {
        return nfragmentShaderPixelInterlock(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fragmentShaderShadingRateInterlock() {
        return nfragmentShaderShadingRateInterlock(address()) != 0;
    }

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT sType$Default() {
        return sType(EXTFragmentShaderInterlock.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT);
    }

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderSampleInterlock(@NativeType("VkBool32") boolean value) {
        nfragmentShaderSampleInterlock(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderPixelInterlock(@NativeType("VkBool32") boolean value) {
        nfragmentShaderPixelInterlock(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderShadingRateInterlock(@NativeType("VkBool32") boolean value) {
        nfragmentShaderShadingRateInterlock(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT set(int sType, long pNext, boolean fragmentShaderSampleInterlock, boolean fragmentShaderPixelInterlock, boolean fragmentShaderShadingRateInterlock) {
        sType(sType);
        pNext(pNext);
        fragmentShaderSampleInterlock(fragmentShaderSampleInterlock);
        fragmentShaderPixelInterlock(fragmentShaderPixelInterlock);
        fragmentShaderShadingRateInterlock(fragmentShaderShadingRateInterlock);
        return this;
    }

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT set(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT malloc() {
        return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT calloc() {
        return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT create(long address) {
        return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nfragmentShaderSampleInterlock(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADERSAMPLEINTERLOCK);
    }

    public static int nfragmentShaderPixelInterlock(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADERPIXELINTERLOCK);
    }

    public static int nfragmentShaderShadingRateInterlock(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADERSHADINGRATEINTERLOCK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nfragmentShaderSampleInterlock(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAGMENTSHADERSAMPLEINTERLOCK, value);
    }

    public static void nfragmentShaderPixelInterlock(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAGMENTSHADERPIXELINTERLOCK, value);
    }

    public static void nfragmentShaderShadingRateInterlock(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAGMENTSHADERSHADINGRATEINTERLOCK, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean fragmentShaderSampleInterlock() {
            return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nfragmentShaderSampleInterlock(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fragmentShaderPixelInterlock() {
            return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nfragmentShaderPixelInterlock(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fragmentShaderShadingRateInterlock() {
            return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nfragmentShaderShadingRateInterlock(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTFragmentShaderInterlock.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer fragmentShaderSampleInterlock(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nfragmentShaderSampleInterlock(address(), value ? 1 : 0);
            return this;
        }

        public Buffer fragmentShaderPixelInterlock(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nfragmentShaderPixelInterlock(address(), value ? 1 : 0);
            return this;
        }

        public Buffer fragmentShaderShadingRateInterlock(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nfragmentShaderShadingRateInterlock(address(), value ? 1 : 0);
            return this;
        }
    }
}
