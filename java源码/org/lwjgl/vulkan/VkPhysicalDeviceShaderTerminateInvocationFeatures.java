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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTerminateInvocationFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTerminateInvocationFeatures.class */
public class VkPhysicalDeviceShaderTerminateInvocationFeatures extends Struct<VkPhysicalDeviceShaderTerminateInvocationFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERTERMINATEINVOCATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERTERMINATEINVOCATION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderTerminateInvocationFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderTerminateInvocationFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(address, container);
    }

    public VkPhysicalDeviceShaderTerminateInvocationFeatures(ByteBuffer container) {
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
    public boolean shaderTerminateInvocation() {
        return nshaderTerminateInvocation(address()) != 0;
    }

    public VkPhysicalDeviceShaderTerminateInvocationFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderTerminateInvocationFeatures sType$Default() {
        return sType(1000215000);
    }

    public VkPhysicalDeviceShaderTerminateInvocationFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderTerminateInvocationFeatures shaderTerminateInvocation(@NativeType("VkBool32") boolean value) {
        nshaderTerminateInvocation(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderTerminateInvocationFeatures set(int sType, long pNext, boolean shaderTerminateInvocation) {
        sType(sType);
        pNext(pNext);
        shaderTerminateInvocation(shaderTerminateInvocation);
        return this;
    }

    public VkPhysicalDeviceShaderTerminateInvocationFeatures set(VkPhysicalDeviceShaderTerminateInvocationFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderTerminateInvocationFeatures malloc() {
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderTerminateInvocationFeatures calloc() {
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderTerminateInvocationFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderTerminateInvocationFeatures create(long address) {
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(address, null);
    }

    public static VkPhysicalDeviceShaderTerminateInvocationFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(address, null);
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

    public static VkPhysicalDeviceShaderTerminateInvocationFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderTerminateInvocationFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderTerminateInvocation(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERTERMINATEINVOCATION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderTerminateInvocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERTERMINATEINVOCATION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTerminateInvocationFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTerminateInvocationFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderTerminateInvocationFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderTerminateInvocationFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderTerminateInvocationFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderTerminateInvocationFeatures.SIZEOF);
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
        public VkPhysicalDeviceShaderTerminateInvocationFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderTerminateInvocationFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderTerminateInvocationFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderTerminateInvocation() {
            return VkPhysicalDeviceShaderTerminateInvocationFeatures.nshaderTerminateInvocation(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderTerminateInvocationFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000215000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderTerminateInvocationFeatures.npNext(address(), value);
            return this;
        }

        public Buffer shaderTerminateInvocation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderTerminateInvocationFeatures.nshaderTerminateInvocation(address(), value ? 1 : 0);
            return this;
        }
    }
}
