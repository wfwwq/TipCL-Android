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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSamplerYcbcrConversionFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSamplerYcbcrConversionFeatures.class */
public class VkPhysicalDeviceSamplerYcbcrConversionFeatures extends Struct<VkPhysicalDeviceSamplerYcbcrConversionFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SAMPLERYCBCRCONVERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLERYCBCRCONVERSION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSamplerYcbcrConversionFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(address, container);
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeatures(ByteBuffer container) {
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
    public boolean samplerYcbcrConversion() {
        return nsamplerYcbcrConversion(address()) != 0;
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeatures sType$Default() {
        return sType(1000156004);
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeatures samplerYcbcrConversion(@NativeType("VkBool32") boolean value) {
        nsamplerYcbcrConversion(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeatures set(int sType, long pNext, boolean samplerYcbcrConversion) {
        sType(sType);
        pNext(pNext);
        samplerYcbcrConversion(samplerYcbcrConversion);
        return this;
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeatures set(VkPhysicalDeviceSamplerYcbcrConversionFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures malloc() {
        return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures calloc() {
        return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures create(long address) {
        return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(address, null);
    }

    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(address, null);
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

    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsamplerYcbcrConversion(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERYCBCRCONVERSION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsamplerYcbcrConversion(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERYCBCRCONVERSION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSamplerYcbcrConversionFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSamplerYcbcrConversionFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSamplerYcbcrConversionFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceSamplerYcbcrConversionFeatures ELEMENT_FACTORY = VkPhysicalDeviceSamplerYcbcrConversionFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSamplerYcbcrConversionFeatures.SIZEOF);
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
        public VkPhysicalDeviceSamplerYcbcrConversionFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceSamplerYcbcrConversionFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceSamplerYcbcrConversionFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean samplerYcbcrConversion() {
            return VkPhysicalDeviceSamplerYcbcrConversionFeatures.nsamplerYcbcrConversion(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSamplerYcbcrConversionFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000156004);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSamplerYcbcrConversionFeatures.npNext(address(), value);
            return this;
        }

        public Buffer samplerYcbcrConversion(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceSamplerYcbcrConversionFeatures.nsamplerYcbcrConversion(address(), value ? 1 : 0);
            return this;
        }
    }
}
