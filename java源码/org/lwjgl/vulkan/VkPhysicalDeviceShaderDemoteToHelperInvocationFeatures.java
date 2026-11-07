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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.class */
public class VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures extends Struct<VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERDEMOTETOHELPERINVOCATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERDEMOTETOHELPERINVOCATION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(address, container);
    }

    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(ByteBuffer container) {
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
    public boolean shaderDemoteToHelperInvocation() {
        return nshaderDemoteToHelperInvocation(address()) != 0;
    }

    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures sType$Default() {
        return sType(1000276000);
    }

    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) {
        nshaderDemoteToHelperInvocation(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures set(int sType, long pNext, boolean shaderDemoteToHelperInvocation) {
        sType(sType);
        pNext(pNext);
        shaderDemoteToHelperInvocation(shaderDemoteToHelperInvocation);
        return this;
    }

    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures set(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures malloc() {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures calloc() {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures create(long address) {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(address, null);
    }

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(address, null);
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

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderDemoteToHelperInvocation(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDEMOTETOHELPERINVOCATION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderDemoteToHelperInvocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERDEMOTETOHELPERINVOCATION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.SIZEOF);
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
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderDemoteToHelperInvocation() {
            return VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.nshaderDemoteToHelperInvocation(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000276000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.npNext(address(), value);
            return this;
        }

        public Buffer shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.nshaderDemoteToHelperInvocation(address(), value ? 1 : 0);
            return this;
        }
    }
}
