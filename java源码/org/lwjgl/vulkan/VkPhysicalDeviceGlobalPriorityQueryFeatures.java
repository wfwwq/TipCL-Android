package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGlobalPriorityQueryFeatures.class */
public class VkPhysicalDeviceGlobalPriorityQueryFeatures extends Struct<VkPhysicalDeviceGlobalPriorityQueryFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int GLOBALPRIORITYQUERY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GLOBALPRIORITYQUERY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceGlobalPriorityQueryFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceGlobalPriorityQueryFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceGlobalPriorityQueryFeatures(address, container);
    }

    public VkPhysicalDeviceGlobalPriorityQueryFeatures(ByteBuffer container) {
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
    public boolean globalPriorityQuery() {
        return nglobalPriorityQuery(address()) != 0;
    }

    public VkPhysicalDeviceGlobalPriorityQueryFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceGlobalPriorityQueryFeatures sType$Default() {
        return sType(1000388000);
    }

    public VkPhysicalDeviceGlobalPriorityQueryFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceGlobalPriorityQueryFeatures globalPriorityQuery(@NativeType("VkBool32") boolean value) {
        nglobalPriorityQuery(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceGlobalPriorityQueryFeatures set(int sType, long pNext, boolean globalPriorityQuery) {
        sType(sType);
        pNext(pNext);
        globalPriorityQuery(globalPriorityQuery);
        return this;
    }

    public VkPhysicalDeviceGlobalPriorityQueryFeatures set(VkPhysicalDeviceGlobalPriorityQueryFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeatures malloc() {
        return new VkPhysicalDeviceGlobalPriorityQueryFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeatures calloc() {
        return new VkPhysicalDeviceGlobalPriorityQueryFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceGlobalPriorityQueryFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeatures create(long address) {
        return new VkPhysicalDeviceGlobalPriorityQueryFeatures(address, null);
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceGlobalPriorityQueryFeatures(address, null);
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

    public static VkPhysicalDeviceGlobalPriorityQueryFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceGlobalPriorityQueryFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceGlobalPriorityQueryFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nglobalPriorityQuery(long struct) {
        return MemoryUtil.memGetInt(struct + GLOBALPRIORITYQUERY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nglobalPriorityQuery(long struct, int value) {
        MemoryUtil.memPutInt(struct + GLOBALPRIORITYQUERY, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGlobalPriorityQueryFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceGlobalPriorityQueryFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceGlobalPriorityQueryFeatures ELEMENT_FACTORY = VkPhysicalDeviceGlobalPriorityQueryFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceGlobalPriorityQueryFeatures.SIZEOF);
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
        public VkPhysicalDeviceGlobalPriorityQueryFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceGlobalPriorityQueryFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceGlobalPriorityQueryFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean globalPriorityQuery() {
            return VkPhysicalDeviceGlobalPriorityQueryFeatures.nglobalPriorityQuery(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceGlobalPriorityQueryFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000388000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceGlobalPriorityQueryFeatures.npNext(address(), value);
            return this;
        }

        public Buffer globalPriorityQuery(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceGlobalPriorityQueryFeatures.nglobalPriorityQuery(address(), value ? 1 : 0);
            return this;
        }
    }
}
