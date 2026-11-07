package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.class */
public class VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR extends Struct<VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERMAXIMALRECONVERGENCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERMAXIMALRECONVERGENCE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(ByteBuffer container) {
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
    public boolean shaderMaximalReconvergence() {
        return nshaderMaximalReconvergence(address()) != 0;
    }

    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR sType$Default() {
        return sType(KHRShaderMaximalReconvergence.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR);
    }

    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR shaderMaximalReconvergence(@NativeType("VkBool32") boolean value) {
        nshaderMaximalReconvergence(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR set(int sType, long pNext, boolean shaderMaximalReconvergence) {
        sType(sType);
        pNext(pNext);
        shaderMaximalReconvergence(shaderMaximalReconvergence);
        return this;
    }

    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR set(VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderMaximalReconvergence(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERMAXIMALRECONVERGENCE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderMaximalReconvergence(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERMAXIMALRECONVERGENCE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderMaximalReconvergence() {
            return VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.nshaderMaximalReconvergence(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRShaderMaximalReconvergence.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer shaderMaximalReconvergence(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.nshaderMaximalReconvergence(address(), value ? 1 : 0);
            return this;
        }
    }
}
