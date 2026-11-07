package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorHeapFeaturesEXT.class */
public class VkPhysicalDeviceDescriptorHeapFeaturesEXT extends Struct<VkPhysicalDeviceDescriptorHeapFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DESCRIPTORHEAP;
    public static final int DESCRIPTORHEAPCAPTUREREPLAY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORHEAP = layout.offsetof(2);
        DESCRIPTORHEAPCAPTUREREPLAY = layout.offsetof(3);
    }

    protected VkPhysicalDeviceDescriptorHeapFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceDescriptorHeapFeaturesEXT(ByteBuffer container) {
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
    public boolean descriptorHeap() {
        return ndescriptorHeap(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorHeapCaptureReplay() {
        return ndescriptorHeapCaptureReplay(address()) != 0;
    }

    public VkPhysicalDeviceDescriptorHeapFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorHeapFeaturesEXT sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT);
    }

    public VkPhysicalDeviceDescriptorHeapFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorHeapFeaturesEXT descriptorHeap(@NativeType("VkBool32") boolean value) {
        ndescriptorHeap(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorHeapFeaturesEXT descriptorHeapCaptureReplay(@NativeType("VkBool32") boolean value) {
        ndescriptorHeapCaptureReplay(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorHeapFeaturesEXT set(int sType, long pNext, boolean descriptorHeap, boolean descriptorHeapCaptureReplay) {
        sType(sType);
        pNext(pNext);
        descriptorHeap(descriptorHeap);
        descriptorHeapCaptureReplay(descriptorHeapCaptureReplay);
        return this;
    }

    public VkPhysicalDeviceDescriptorHeapFeaturesEXT set(VkPhysicalDeviceDescriptorHeapFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT malloc() {
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT calloc() {
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndescriptorHeap(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORHEAP);
    }

    public static int ndescriptorHeapCaptureReplay(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORHEAPCAPTUREREPLAY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndescriptorHeap(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORHEAP, value);
    }

    public static void ndescriptorHeapCaptureReplay(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORHEAPCAPTUREREPLAY, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorHeapFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorHeapFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDescriptorHeapFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDescriptorHeapFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDescriptorHeapFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceDescriptorHeapFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDescriptorHeapFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDescriptorHeapFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean descriptorHeap() {
            return VkPhysicalDeviceDescriptorHeapFeaturesEXT.ndescriptorHeap(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorHeapCaptureReplay() {
            return VkPhysicalDeviceDescriptorHeapFeaturesEXT.ndescriptorHeapCaptureReplay(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDescriptorHeapFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDescriptorHeapFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer descriptorHeap(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorHeapFeaturesEXT.ndescriptorHeap(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorHeapCaptureReplay(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorHeapFeaturesEXT.ndescriptorHeapCaptureReplay(address(), value ? 1 : 0);
            return this;
        }
    }
}
