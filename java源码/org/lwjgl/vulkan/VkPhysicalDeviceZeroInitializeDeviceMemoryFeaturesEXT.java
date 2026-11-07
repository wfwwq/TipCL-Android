package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.class */
public class VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT extends Struct<VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ZEROINITIALIZEDEVICEMEMORY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ZEROINITIALIZEDEVICEMEMORY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(ByteBuffer container) {
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
    public boolean zeroInitializeDeviceMemory() {
        return nzeroInitializeDeviceMemory(address()) != 0;
    }

    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT sType$Default() {
        return sType(1000620000);
    }

    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT zeroInitializeDeviceMemory(@NativeType("VkBool32") boolean value) {
        nzeroInitializeDeviceMemory(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT set(int sType, long pNext, boolean zeroInitializeDeviceMemory) {
        sType(sType);
        pNext(pNext);
        zeroInitializeDeviceMemory(zeroInitializeDeviceMemory);
        return this;
    }

    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT set(VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT malloc() {
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT calloc() {
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT create(long address) {
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nzeroInitializeDeviceMemory(long struct) {
        return MemoryUtil.memGetInt(struct + ZEROINITIALIZEDEVICEMEMORY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nzeroInitializeDeviceMemory(long struct, int value) {
        MemoryUtil.memPutInt(struct + ZEROINITIALIZEDEVICEMEMORY, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean zeroInitializeDeviceMemory() {
            return VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.nzeroInitializeDeviceMemory(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000620000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer zeroInitializeDeviceMemory(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.nzeroInitializeDeviceMemory(address(), value ? 1 : 0);
            return this;
        }
    }
}
