package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDeviceMemoryCallbacks.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDeviceMemoryCallbacks.class */
public class VmaDeviceMemoryCallbacks extends Struct<VmaDeviceMemoryCallbacks> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PFNALLOCATE;
    public static final int PFNFREE;
    public static final int PUSERDATA;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PFNALLOCATE = layout.offsetof(0);
        PFNFREE = layout.offsetof(1);
        PUSERDATA = layout.offsetof(2);
    }

    protected VmaDeviceMemoryCallbacks(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaDeviceMemoryCallbacks create(long address, ByteBuffer container) {
        return new VmaDeviceMemoryCallbacks(address, container);
    }

    public VmaDeviceMemoryCallbacks(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("PFN_vmaAllocateDeviceMemoryFunction")
    public VmaAllocateDeviceMemoryFunction pfnAllocate() {
        return npfnAllocate(address());
    }

    @NativeType("PFN_vmaFreeDeviceMemoryFunction")
    public VmaFreeDeviceMemoryFunction pfnFree() {
        return npfnFree(address());
    }

    @NativeType("void *")
    public long pUserData() {
        return npUserData(address());
    }

    public VmaDeviceMemoryCallbacks pfnAllocate(@NativeType("PFN_vmaAllocateDeviceMemoryFunction") VmaAllocateDeviceMemoryFunctionI value) {
        npfnAllocate(address(), value);
        return this;
    }

    public VmaDeviceMemoryCallbacks pfnFree(@NativeType("PFN_vmaFreeDeviceMemoryFunction") VmaFreeDeviceMemoryFunctionI value) {
        npfnFree(address(), value);
        return this;
    }

    public VmaDeviceMemoryCallbacks pUserData(@NativeType("void *") long value) {
        npUserData(address(), value);
        return this;
    }

    public VmaDeviceMemoryCallbacks set(VmaAllocateDeviceMemoryFunctionI pfnAllocate, VmaFreeDeviceMemoryFunctionI pfnFree, long pUserData) {
        pfnAllocate(pfnAllocate);
        pfnFree(pfnFree);
        pUserData(pUserData);
        return this;
    }

    public VmaDeviceMemoryCallbacks set(VmaDeviceMemoryCallbacks src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VmaDeviceMemoryCallbacks malloc() {
        return new VmaDeviceMemoryCallbacks(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaDeviceMemoryCallbacks calloc() {
        return new VmaDeviceMemoryCallbacks(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaDeviceMemoryCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaDeviceMemoryCallbacks(MemoryUtil.memAddress(container), container);
    }

    public static VmaDeviceMemoryCallbacks create(long address) {
        return new VmaDeviceMemoryCallbacks(address, null);
    }

    public static VmaDeviceMemoryCallbacks createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaDeviceMemoryCallbacks(address, null);
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

    public static VmaDeviceMemoryCallbacks malloc(MemoryStack stack) {
        return new VmaDeviceMemoryCallbacks(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaDeviceMemoryCallbacks calloc(MemoryStack stack) {
        return new VmaDeviceMemoryCallbacks(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VmaAllocateDeviceMemoryFunction npfnAllocate(long struct) {
        return VmaAllocateDeviceMemoryFunction.createSafe(MemoryUtil.memGetAddress(struct + PFNALLOCATE));
    }

    public static VmaFreeDeviceMemoryFunction npfnFree(long struct) {
        return VmaFreeDeviceMemoryFunction.createSafe(MemoryUtil.memGetAddress(struct + PFNFREE));
    }

    public static long npUserData(long struct) {
        return MemoryUtil.memGetAddress(struct + PUSERDATA);
    }

    public static void npfnAllocate(long struct, VmaAllocateDeviceMemoryFunctionI value) {
        MemoryUtil.memPutAddress(struct + PFNALLOCATE, MemoryUtil.memAddressSafe(value));
    }

    public static void npfnFree(long struct, VmaFreeDeviceMemoryFunctionI value) {
        MemoryUtil.memPutAddress(struct + PFNFREE, MemoryUtil.memAddressSafe(value));
    }

    public static void npUserData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PUSERDATA, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDeviceMemoryCallbacks$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDeviceMemoryCallbacks$Buffer.class */
    public static class Buffer extends StructBuffer<VmaDeviceMemoryCallbacks, Buffer> implements NativeResource {
        private static final VmaDeviceMemoryCallbacks ELEMENT_FACTORY = VmaDeviceMemoryCallbacks.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaDeviceMemoryCallbacks.SIZEOF);
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
        public VmaDeviceMemoryCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("PFN_vmaAllocateDeviceMemoryFunction")
        public VmaAllocateDeviceMemoryFunction pfnAllocate() {
            return VmaDeviceMemoryCallbacks.npfnAllocate(address());
        }

        @NativeType("PFN_vmaFreeDeviceMemoryFunction")
        public VmaFreeDeviceMemoryFunction pfnFree() {
            return VmaDeviceMemoryCallbacks.npfnFree(address());
        }

        @NativeType("void *")
        public long pUserData() {
            return VmaDeviceMemoryCallbacks.npUserData(address());
        }

        public Buffer pfnAllocate(@NativeType("PFN_vmaAllocateDeviceMemoryFunction") VmaAllocateDeviceMemoryFunctionI value) {
            VmaDeviceMemoryCallbacks.npfnAllocate(address(), value);
            return this;
        }

        public Buffer pfnFree(@NativeType("PFN_vmaFreeDeviceMemoryFunction") VmaFreeDeviceMemoryFunctionI value) {
            VmaDeviceMemoryCallbacks.npfnFree(address(), value);
            return this;
        }

        public Buffer pUserData(@NativeType("void *") long value) {
            VmaDeviceMemoryCallbacks.npUserData(address(), value);
            return this;
        }
    }
}
