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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicInt64Features.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicInt64Features.class */
public class VkPhysicalDeviceShaderAtomicInt64Features extends Struct<VkPhysicalDeviceShaderAtomicInt64Features> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERBUFFERINT64ATOMICS;
    public static final int SHADERSHAREDINT64ATOMICS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERBUFFERINT64ATOMICS = layout.offsetof(2);
        SHADERSHAREDINT64ATOMICS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderAtomicInt64Features(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderAtomicInt64Features create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderAtomicInt64Features(address, container);
    }

    public VkPhysicalDeviceShaderAtomicInt64Features(ByteBuffer container) {
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
    public boolean shaderBufferInt64Atomics() {
        return nshaderBufferInt64Atomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSharedInt64Atomics() {
        return nshaderSharedInt64Atomics(address()) != 0;
    }

    public VkPhysicalDeviceShaderAtomicInt64Features sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicInt64Features sType$Default() {
        return sType(1000180000);
    }

    public VkPhysicalDeviceShaderAtomicInt64Features pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicInt64Features shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) {
        nshaderBufferInt64Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicInt64Features shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) {
        nshaderSharedInt64Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicInt64Features set(int sType, long pNext, boolean shaderBufferInt64Atomics, boolean shaderSharedInt64Atomics) {
        sType(sType);
        pNext(pNext);
        shaderBufferInt64Atomics(shaderBufferInt64Atomics);
        shaderSharedInt64Atomics(shaderSharedInt64Atomics);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicInt64Features set(VkPhysicalDeviceShaderAtomicInt64Features src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderAtomicInt64Features malloc() {
        return new VkPhysicalDeviceShaderAtomicInt64Features(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicInt64Features calloc() {
        return new VkPhysicalDeviceShaderAtomicInt64Features(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicInt64Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderAtomicInt64Features(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderAtomicInt64Features create(long address) {
        return new VkPhysicalDeviceShaderAtomicInt64Features(address, null);
    }

    public static VkPhysicalDeviceShaderAtomicInt64Features createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderAtomicInt64Features(address, null);
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

    public static VkPhysicalDeviceShaderAtomicInt64Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicInt64Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicInt64Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicInt64Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderBufferInt64Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBUFFERINT64ATOMICS);
    }

    public static int nshaderSharedInt64Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSHAREDINT64ATOMICS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderBufferInt64Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBUFFERINT64ATOMICS, value);
    }

    public static void nshaderSharedInt64Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSHAREDINT64ATOMICS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicInt64Features$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicInt64Features$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderAtomicInt64Features, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderAtomicInt64Features ELEMENT_FACTORY = VkPhysicalDeviceShaderAtomicInt64Features.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderAtomicInt64Features.SIZEOF);
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
        public VkPhysicalDeviceShaderAtomicInt64Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderAtomicInt64Features.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderAtomicInt64Features.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderBufferInt64Atomics() {
            return VkPhysicalDeviceShaderAtomicInt64Features.nshaderBufferInt64Atomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSharedInt64Atomics() {
            return VkPhysicalDeviceShaderAtomicInt64Features.nshaderSharedInt64Atomics(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderAtomicInt64Features.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000180000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderAtomicInt64Features.npNext(address(), value);
            return this;
        }

        public Buffer shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicInt64Features.nshaderBufferInt64Atomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicInt64Features.nshaderSharedInt64Atomics(address(), value ? 1 : 0);
            return this;
        }
    }
}
