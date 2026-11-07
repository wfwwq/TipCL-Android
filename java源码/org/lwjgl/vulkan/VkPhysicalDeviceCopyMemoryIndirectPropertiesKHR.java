package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.class */
public class VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR extends Struct<VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SUPPORTEDQUEUES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTEDQUEUES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(address, container);
    }

    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(ByteBuffer container) {
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

    @NativeType("VkQueueFlags")
    public int supportedQueues() {
        return nsupportedQueues(address());
    }

    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR sType$Default() {
        return sType(1000426001);
    }

    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR set(VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR malloc() {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR calloc() {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR create(long address) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(address, null);
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

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsupportedQueues(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDQUEUES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.SIZEOF);
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
        public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.npNext(address());
        }

        @NativeType("VkQueueFlags")
        public int supportedQueues() {
            return VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.nsupportedQueues(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000426001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
