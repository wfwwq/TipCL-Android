package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderFmaFeaturesKHR.class */
public class VkPhysicalDeviceShaderFmaFeaturesKHR extends Struct<VkPhysicalDeviceShaderFmaFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERFMAFLOAT16;
    public static final int SHADERFMAFLOAT32;
    public static final int SHADERFMAFLOAT64;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERFMAFLOAT16 = layout.offsetof(2);
        SHADERFMAFLOAT32 = layout.offsetof(3);
        SHADERFMAFLOAT64 = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShaderFmaFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderFmaFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderFmaFeaturesKHR(ByteBuffer container) {
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
    public boolean shaderFmaFloat16() {
        return nshaderFmaFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderFmaFloat32() {
        return nshaderFmaFloat32(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderFmaFloat64() {
        return nshaderFmaFloat64(address()) != 0;
    }

    public VkPhysicalDeviceShaderFmaFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderFmaFeaturesKHR sType$Default() {
        return sType(KHRShaderFma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FMA_FEATURES_KHR);
    }

    public VkPhysicalDeviceShaderFmaFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat16(@NativeType("VkBool32") boolean value) {
        nshaderFmaFloat16(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat32(@NativeType("VkBool32") boolean value) {
        nshaderFmaFloat32(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat64(@NativeType("VkBool32") boolean value) {
        nshaderFmaFloat64(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderFmaFeaturesKHR set(int sType, long pNext, boolean shaderFmaFloat16, boolean shaderFmaFloat32, boolean shaderFmaFloat64) {
        sType(sType);
        pNext(pNext);
        shaderFmaFloat16(shaderFmaFloat16);
        shaderFmaFloat32(shaderFmaFloat32);
        shaderFmaFloat64(shaderFmaFloat64);
        return this;
    }

    public VkPhysicalDeviceShaderFmaFeaturesKHR set(VkPhysicalDeviceShaderFmaFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderFmaFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFmaFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFmaFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderFmaFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderFmaFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderFmaFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFmaFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderFmaFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERFMAFLOAT16);
    }

    public static int nshaderFmaFloat32(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERFMAFLOAT32);
    }

    public static int nshaderFmaFloat64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERFMAFLOAT64);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderFmaFloat16(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERFMAFLOAT16, value);
    }

    public static void nshaderFmaFloat32(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERFMAFLOAT32, value);
    }

    public static void nshaderFmaFloat64(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERFMAFLOAT64, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderFmaFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderFmaFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderFmaFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderFmaFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderFmaFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceShaderFmaFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderFmaFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderFmaFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderFmaFloat16() {
            return VkPhysicalDeviceShaderFmaFeaturesKHR.nshaderFmaFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderFmaFloat32() {
            return VkPhysicalDeviceShaderFmaFeaturesKHR.nshaderFmaFloat32(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderFmaFloat64() {
            return VkPhysicalDeviceShaderFmaFeaturesKHR.nshaderFmaFloat64(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderFmaFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRShaderFma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FMA_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderFmaFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer shaderFmaFloat16(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderFmaFeaturesKHR.nshaderFmaFloat16(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderFmaFloat32(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderFmaFeaturesKHR.nshaderFmaFloat32(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderFmaFloat64(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderFmaFeaturesKHR.nshaderFmaFloat64(address(), value ? 1 : 0);
            return this;
        }
    }
}
