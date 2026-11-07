package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderQuadControlFeaturesKHR.class */
public class VkPhysicalDeviceShaderQuadControlFeaturesKHR extends Struct<VkPhysicalDeviceShaderQuadControlFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERQUADCONTROL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERQUADCONTROL = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderQuadControlFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderQuadControlFeaturesKHR(ByteBuffer container) {
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
    public boolean shaderQuadControl() {
        return nshaderQuadControl(address()) != 0;
    }

    public VkPhysicalDeviceShaderQuadControlFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderQuadControlFeaturesKHR sType$Default() {
        return sType(KHRShaderQuadControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_QUAD_CONTROL_FEATURES_KHR);
    }

    public VkPhysicalDeviceShaderQuadControlFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderQuadControlFeaturesKHR shaderQuadControl(@NativeType("VkBool32") boolean value) {
        nshaderQuadControl(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderQuadControlFeaturesKHR set(int sType, long pNext, boolean shaderQuadControl) {
        sType(sType);
        pNext(pNext);
        shaderQuadControl(shaderQuadControl);
        return this;
    }

    public VkPhysicalDeviceShaderQuadControlFeaturesKHR set(VkPhysicalDeviceShaderQuadControlFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderQuadControl(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERQUADCONTROL);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderQuadControl(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERQUADCONTROL, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderQuadControlFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderQuadControlFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderQuadControlFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderQuadControlFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderQuadControlFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceShaderQuadControlFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderQuadControlFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderQuadControlFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderQuadControl() {
            return VkPhysicalDeviceShaderQuadControlFeaturesKHR.nshaderQuadControl(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderQuadControlFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRShaderQuadControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_QUAD_CONTROL_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderQuadControlFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer shaderQuadControl(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderQuadControlFeaturesKHR.nshaderQuadControl(address(), value ? 1 : 0);
            return this;
        }
    }
}
