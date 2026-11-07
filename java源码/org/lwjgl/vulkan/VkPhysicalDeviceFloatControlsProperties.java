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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsProperties.class */
public class VkPhysicalDeviceFloatControlsProperties extends Struct<VkPhysicalDeviceFloatControlsProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DENORMBEHAVIORINDEPENDENCE;
    public static final int ROUNDINGMODEINDEPENDENCE;
    public static final int SHADERSIGNEDZEROINFNANPRESERVEFLOAT16;
    public static final int SHADERSIGNEDZEROINFNANPRESERVEFLOAT32;
    public static final int SHADERSIGNEDZEROINFNANPRESERVEFLOAT64;
    public static final int SHADERDENORMPRESERVEFLOAT16;
    public static final int SHADERDENORMPRESERVEFLOAT32;
    public static final int SHADERDENORMPRESERVEFLOAT64;
    public static final int SHADERDENORMFLUSHTOZEROFLOAT16;
    public static final int SHADERDENORMFLUSHTOZEROFLOAT32;
    public static final int SHADERDENORMFLUSHTOZEROFLOAT64;
    public static final int SHADERROUNDINGMODERTEFLOAT16;
    public static final int SHADERROUNDINGMODERTEFLOAT32;
    public static final int SHADERROUNDINGMODERTEFLOAT64;
    public static final int SHADERROUNDINGMODERTZFLOAT16;
    public static final int SHADERROUNDINGMODERTZFLOAT32;
    public static final int SHADERROUNDINGMODERTZFLOAT64;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DENORMBEHAVIORINDEPENDENCE = layout.offsetof(2);
        ROUNDINGMODEINDEPENDENCE = layout.offsetof(3);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT16 = layout.offsetof(4);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT32 = layout.offsetof(5);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT64 = layout.offsetof(6);
        SHADERDENORMPRESERVEFLOAT16 = layout.offsetof(7);
        SHADERDENORMPRESERVEFLOAT32 = layout.offsetof(8);
        SHADERDENORMPRESERVEFLOAT64 = layout.offsetof(9);
        SHADERDENORMFLUSHTOZEROFLOAT16 = layout.offsetof(10);
        SHADERDENORMFLUSHTOZEROFLOAT32 = layout.offsetof(11);
        SHADERDENORMFLUSHTOZEROFLOAT64 = layout.offsetof(12);
        SHADERROUNDINGMODERTEFLOAT16 = layout.offsetof(13);
        SHADERROUNDINGMODERTEFLOAT32 = layout.offsetof(14);
        SHADERROUNDINGMODERTEFLOAT64 = layout.offsetof(15);
        SHADERROUNDINGMODERTZFLOAT16 = layout.offsetof(16);
        SHADERROUNDINGMODERTZFLOAT32 = layout.offsetof(17);
        SHADERROUNDINGMODERTZFLOAT64 = layout.offsetof(18);
    }

    protected VkPhysicalDeviceFloatControlsProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFloatControlsProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFloatControlsProperties(address, container);
    }

    public VkPhysicalDeviceFloatControlsProperties(ByteBuffer container) {
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

    @NativeType("VkShaderFloatControlsIndependence")
    public int denormBehaviorIndependence() {
        return ndenormBehaviorIndependence(address());
    }

    @NativeType("VkShaderFloatControlsIndependence")
    public int roundingModeIndependence() {
        return nroundingModeIndependence(address());
    }

    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat16() {
        return nshaderSignedZeroInfNanPreserveFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat32() {
        return nshaderSignedZeroInfNanPreserveFloat32(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat64() {
        return nshaderSignedZeroInfNanPreserveFloat64(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat16() {
        return nshaderDenormPreserveFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat32() {
        return nshaderDenormPreserveFloat32(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat64() {
        return nshaderDenormPreserveFloat64(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat16() {
        return nshaderDenormFlushToZeroFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat32() {
        return nshaderDenormFlushToZeroFloat32(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat64() {
        return nshaderDenormFlushToZeroFloat64(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat16() {
        return nshaderRoundingModeRTEFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat32() {
        return nshaderRoundingModeRTEFloat32(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat64() {
        return nshaderRoundingModeRTEFloat64(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat16() {
        return nshaderRoundingModeRTZFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat32() {
        return nshaderRoundingModeRTZFloat32(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat64() {
        return nshaderRoundingModeRTZFloat64(address()) != 0;
    }

    public VkPhysicalDeviceFloatControlsProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFloatControlsProperties sType$Default() {
        return sType(1000197000);
    }

    public VkPhysicalDeviceFloatControlsProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFloatControlsProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceFloatControlsProperties set(VkPhysicalDeviceFloatControlsProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFloatControlsProperties malloc() {
        return new VkPhysicalDeviceFloatControlsProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFloatControlsProperties calloc() {
        return new VkPhysicalDeviceFloatControlsProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFloatControlsProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFloatControlsProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFloatControlsProperties create(long address) {
        return new VkPhysicalDeviceFloatControlsProperties(address, null);
    }

    public static VkPhysicalDeviceFloatControlsProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFloatControlsProperties(address, null);
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

    public static VkPhysicalDeviceFloatControlsProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFloatControlsProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFloatControlsProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFloatControlsProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndenormBehaviorIndependence(long struct) {
        return MemoryUtil.memGetInt(struct + DENORMBEHAVIORINDEPENDENCE);
    }

    public static int nroundingModeIndependence(long struct) {
        return MemoryUtil.memGetInt(struct + ROUNDINGMODEINDEPENDENCE);
    }

    public static int nshaderSignedZeroInfNanPreserveFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSIGNEDZEROINFNANPRESERVEFLOAT16);
    }

    public static int nshaderSignedZeroInfNanPreserveFloat32(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSIGNEDZEROINFNANPRESERVEFLOAT32);
    }

    public static int nshaderSignedZeroInfNanPreserveFloat64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSIGNEDZEROINFNANPRESERVEFLOAT64);
    }

    public static int nshaderDenormPreserveFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDENORMPRESERVEFLOAT16);
    }

    public static int nshaderDenormPreserveFloat32(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDENORMPRESERVEFLOAT32);
    }

    public static int nshaderDenormPreserveFloat64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDENORMPRESERVEFLOAT64);
    }

    public static int nshaderDenormFlushToZeroFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDENORMFLUSHTOZEROFLOAT16);
    }

    public static int nshaderDenormFlushToZeroFloat32(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDENORMFLUSHTOZEROFLOAT32);
    }

    public static int nshaderDenormFlushToZeroFloat64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDENORMFLUSHTOZEROFLOAT64);
    }

    public static int nshaderRoundingModeRTEFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERROUNDINGMODERTEFLOAT16);
    }

    public static int nshaderRoundingModeRTEFloat32(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERROUNDINGMODERTEFLOAT32);
    }

    public static int nshaderRoundingModeRTEFloat64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERROUNDINGMODERTEFLOAT64);
    }

    public static int nshaderRoundingModeRTZFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERROUNDINGMODERTZFLOAT16);
    }

    public static int nshaderRoundingModeRTZFloat32(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERROUNDINGMODERTZFLOAT32);
    }

    public static int nshaderRoundingModeRTZFloat64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERROUNDINGMODERTZFLOAT64);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFloatControlsProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFloatControlsProperties ELEMENT_FACTORY = VkPhysicalDeviceFloatControlsProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFloatControlsProperties.SIZEOF);
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
        public VkPhysicalDeviceFloatControlsProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFloatControlsProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFloatControlsProperties.npNext(address());
        }

        @NativeType("VkShaderFloatControlsIndependence")
        public int denormBehaviorIndependence() {
            return VkPhysicalDeviceFloatControlsProperties.ndenormBehaviorIndependence(address());
        }

        @NativeType("VkShaderFloatControlsIndependence")
        public int roundingModeIndependence() {
            return VkPhysicalDeviceFloatControlsProperties.nroundingModeIndependence(address());
        }

        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat16() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderSignedZeroInfNanPreserveFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat32() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderSignedZeroInfNanPreserveFloat32(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat64() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderSignedZeroInfNanPreserveFloat64(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat16() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderDenormPreserveFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat32() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderDenormPreserveFloat32(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat64() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderDenormPreserveFloat64(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat16() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderDenormFlushToZeroFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat32() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderDenormFlushToZeroFloat32(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat64() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderDenormFlushToZeroFloat64(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat16() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTEFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat32() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTEFloat32(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat64() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTEFloat64(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat16() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTZFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat32() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTZFloat32(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat64() {
            return VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTZFloat64(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFloatControlsProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000197000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFloatControlsProperties.npNext(address(), value);
            return this;
        }
    }
}
