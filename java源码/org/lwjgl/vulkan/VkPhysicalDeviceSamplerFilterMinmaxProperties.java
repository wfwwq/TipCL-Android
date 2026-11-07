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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSamplerFilterMinmaxProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSamplerFilterMinmaxProperties.class */
public class VkPhysicalDeviceSamplerFilterMinmaxProperties extends Struct<VkPhysicalDeviceSamplerFilterMinmaxProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FILTERMINMAXSINGLECOMPONENTFORMATS;
    public static final int FILTERMINMAXIMAGECOMPONENTMAPPING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FILTERMINMAXSINGLECOMPONENTFORMATS = layout.offsetof(2);
        FILTERMINMAXIMAGECOMPONENTMAPPING = layout.offsetof(3);
    }

    protected VkPhysicalDeviceSamplerFilterMinmaxProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSamplerFilterMinmaxProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSamplerFilterMinmaxProperties(address, container);
    }

    public VkPhysicalDeviceSamplerFilterMinmaxProperties(ByteBuffer container) {
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
    public boolean filterMinmaxSingleComponentFormats() {
        return nfilterMinmaxSingleComponentFormats(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean filterMinmaxImageComponentMapping() {
        return nfilterMinmaxImageComponentMapping(address()) != 0;
    }

    public VkPhysicalDeviceSamplerFilterMinmaxProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceSamplerFilterMinmaxProperties sType$Default() {
        return sType(1000130000);
    }

    public VkPhysicalDeviceSamplerFilterMinmaxProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceSamplerFilterMinmaxProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceSamplerFilterMinmaxProperties set(VkPhysicalDeviceSamplerFilterMinmaxProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSamplerFilterMinmaxProperties malloc() {
        return new VkPhysicalDeviceSamplerFilterMinmaxProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSamplerFilterMinmaxProperties calloc() {
        return new VkPhysicalDeviceSamplerFilterMinmaxProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSamplerFilterMinmaxProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSamplerFilterMinmaxProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSamplerFilterMinmaxProperties create(long address) {
        return new VkPhysicalDeviceSamplerFilterMinmaxProperties(address, null);
    }

    public static VkPhysicalDeviceSamplerFilterMinmaxProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSamplerFilterMinmaxProperties(address, null);
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

    public static VkPhysicalDeviceSamplerFilterMinmaxProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSamplerFilterMinmaxProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSamplerFilterMinmaxProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSamplerFilterMinmaxProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nfilterMinmaxSingleComponentFormats(long struct) {
        return MemoryUtil.memGetInt(struct + FILTERMINMAXSINGLECOMPONENTFORMATS);
    }

    public static int nfilterMinmaxImageComponentMapping(long struct) {
        return MemoryUtil.memGetInt(struct + FILTERMINMAXIMAGECOMPONENTMAPPING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSamplerFilterMinmaxProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSamplerFilterMinmaxProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSamplerFilterMinmaxProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceSamplerFilterMinmaxProperties ELEMENT_FACTORY = VkPhysicalDeviceSamplerFilterMinmaxProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSamplerFilterMinmaxProperties.SIZEOF);
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
        public VkPhysicalDeviceSamplerFilterMinmaxProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceSamplerFilterMinmaxProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceSamplerFilterMinmaxProperties.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean filterMinmaxSingleComponentFormats() {
            return VkPhysicalDeviceSamplerFilterMinmaxProperties.nfilterMinmaxSingleComponentFormats(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean filterMinmaxImageComponentMapping() {
            return VkPhysicalDeviceSamplerFilterMinmaxProperties.nfilterMinmaxImageComponentMapping(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSamplerFilterMinmaxProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000130000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSamplerFilterMinmaxProperties.npNext(address(), value);
            return this;
        }
    }
}
