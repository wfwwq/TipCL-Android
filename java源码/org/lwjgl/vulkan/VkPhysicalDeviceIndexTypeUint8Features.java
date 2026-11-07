package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceIndexTypeUint8Features.class */
public class VkPhysicalDeviceIndexTypeUint8Features extends Struct<VkPhysicalDeviceIndexTypeUint8Features> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INDEXTYPEUINT8;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INDEXTYPEUINT8 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceIndexTypeUint8Features(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceIndexTypeUint8Features create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceIndexTypeUint8Features(address, container);
    }

    public VkPhysicalDeviceIndexTypeUint8Features(ByteBuffer container) {
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
    public boolean indexTypeUint8() {
        return nindexTypeUint8(address()) != 0;
    }

    public VkPhysicalDeviceIndexTypeUint8Features sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceIndexTypeUint8Features sType$Default() {
        return sType(1000265000);
    }

    public VkPhysicalDeviceIndexTypeUint8Features pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceIndexTypeUint8Features indexTypeUint8(@NativeType("VkBool32") boolean value) {
        nindexTypeUint8(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceIndexTypeUint8Features set(int sType, long pNext, boolean indexTypeUint8) {
        sType(sType);
        pNext(pNext);
        indexTypeUint8(indexTypeUint8);
        return this;
    }

    public VkPhysicalDeviceIndexTypeUint8Features set(VkPhysicalDeviceIndexTypeUint8Features src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceIndexTypeUint8Features malloc() {
        return new VkPhysicalDeviceIndexTypeUint8Features(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceIndexTypeUint8Features calloc() {
        return new VkPhysicalDeviceIndexTypeUint8Features(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceIndexTypeUint8Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceIndexTypeUint8Features(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceIndexTypeUint8Features create(long address) {
        return new VkPhysicalDeviceIndexTypeUint8Features(address, null);
    }

    public static VkPhysicalDeviceIndexTypeUint8Features createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceIndexTypeUint8Features(address, null);
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

    public static VkPhysicalDeviceIndexTypeUint8Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceIndexTypeUint8Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceIndexTypeUint8Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceIndexTypeUint8Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nindexTypeUint8(long struct) {
        return MemoryUtil.memGetInt(struct + INDEXTYPEUINT8);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nindexTypeUint8(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEXTYPEUINT8, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceIndexTypeUint8Features$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceIndexTypeUint8Features, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceIndexTypeUint8Features ELEMENT_FACTORY = VkPhysicalDeviceIndexTypeUint8Features.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceIndexTypeUint8Features.SIZEOF);
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
        public VkPhysicalDeviceIndexTypeUint8Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceIndexTypeUint8Features.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceIndexTypeUint8Features.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean indexTypeUint8() {
            return VkPhysicalDeviceIndexTypeUint8Features.nindexTypeUint8(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceIndexTypeUint8Features.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000265000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceIndexTypeUint8Features.npNext(address(), value);
            return this;
        }

        public Buffer indexTypeUint8(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceIndexTypeUint8Features.nindexTypeUint8(address(), value ? 1 : 0);
            return this;
        }
    }
}
