package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.class */
public class VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX extends Struct<VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DENSEGEOMETRYFORMAT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DENSEGEOMETRYFORMAT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(address, container);
    }

    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(ByteBuffer container) {
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
    public boolean denseGeometryFormat() {
        return ndenseGeometryFormat(address()) != 0;
    }

    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX sType$Default() {
        return sType(1000478000);
    }

    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX denseGeometryFormat(@NativeType("VkBool32") boolean value) {
        ndenseGeometryFormat(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX set(int sType, long pNext, boolean denseGeometryFormat) {
        sType(sType);
        pNext(pNext);
        denseGeometryFormat(denseGeometryFormat);
        return this;
    }

    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX set(VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX malloc() {
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX calloc() {
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX create(long address) {
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(address, null);
    }

    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(address, null);
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

    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndenseGeometryFormat(long struct) {
        return MemoryUtil.memGetInt(struct + DENSEGEOMETRYFORMAT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndenseGeometryFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + DENSEGEOMETRYFORMAT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX ELEMENT_FACTORY = VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.SIZEOF);
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
        public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean denseGeometryFormat() {
            return VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.ndenseGeometryFormat(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000478000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.npNext(address(), value);
            return this;
        }

        public Buffer denseGeometryFormat(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.ndenseGeometryFormat(address(), value ? 1 : 0);
            return this;
        }
    }
}
