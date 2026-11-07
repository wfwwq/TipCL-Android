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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueueFeaturesAMDX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueueFeaturesAMDX.class */
public class VkPhysicalDeviceShaderEnqueueFeaturesAMDX extends Struct<VkPhysicalDeviceShaderEnqueueFeaturesAMDX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERENQUEUE;
    public static final int SHADERMESHENQUEUE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERENQUEUE = layout.offsetof(2);
        SHADERMESHENQUEUE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderEnqueueFeaturesAMDX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(address, container);
    }

    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX(ByteBuffer container) {
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
    public boolean shaderEnqueue() {
        return nshaderEnqueue(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderMeshEnqueue() {
        return nshaderMeshEnqueue(address()) != 0;
    }

    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX sType$Default() {
        return sType(1000134000);
    }

    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX shaderEnqueue(@NativeType("VkBool32") boolean value) {
        nshaderEnqueue(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX shaderMeshEnqueue(@NativeType("VkBool32") boolean value) {
        nshaderMeshEnqueue(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX set(int sType, long pNext, boolean shaderEnqueue, boolean shaderMeshEnqueue) {
        sType(sType);
        pNext(pNext);
        shaderEnqueue(shaderEnqueue);
        shaderMeshEnqueue(shaderMeshEnqueue);
        return this;
    }

    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX set(VkPhysicalDeviceShaderEnqueueFeaturesAMDX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX malloc() {
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX calloc() {
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX create(long address) {
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(address, null);
    }

    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(address, null);
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

    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderEnqueue(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERENQUEUE);
    }

    public static int nshaderMeshEnqueue(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERMESHENQUEUE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderEnqueue(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERENQUEUE, value);
    }

    public static void nshaderMeshEnqueue(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERMESHENQUEUE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueueFeaturesAMDX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueueFeaturesAMDX$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderEnqueueFeaturesAMDX, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderEnqueueFeaturesAMDX ELEMENT_FACTORY = VkPhysicalDeviceShaderEnqueueFeaturesAMDX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderEnqueueFeaturesAMDX.SIZEOF);
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
        public VkPhysicalDeviceShaderEnqueueFeaturesAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderEnqueueFeaturesAMDX.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderEnqueueFeaturesAMDX.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderEnqueue() {
            return VkPhysicalDeviceShaderEnqueueFeaturesAMDX.nshaderEnqueue(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderMeshEnqueue() {
            return VkPhysicalDeviceShaderEnqueueFeaturesAMDX.nshaderMeshEnqueue(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderEnqueueFeaturesAMDX.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000134000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderEnqueueFeaturesAMDX.npNext(address(), value);
            return this;
        }

        public Buffer shaderEnqueue(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderEnqueueFeaturesAMDX.nshaderEnqueue(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderMeshEnqueue(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderEnqueueFeaturesAMDX.nshaderMeshEnqueue(address(), value ? 1 : 0);
            return this;
        }
    }
}
