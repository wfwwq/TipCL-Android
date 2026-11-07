package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyGlobalPriorityProperties.class */
public class VkQueueFamilyGlobalPriorityProperties extends Struct<VkQueueFamilyGlobalPriorityProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRIORITYCOUNT;
    public static final int PRIORITIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __array(4, 16));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRIORITYCOUNT = layout.offsetof(2);
        PRIORITIES = layout.offsetof(3);
    }

    protected VkQueueFamilyGlobalPriorityProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueueFamilyGlobalPriorityProperties create(long address, ByteBuffer container) {
        return new VkQueueFamilyGlobalPriorityProperties(address, container);
    }

    public VkQueueFamilyGlobalPriorityProperties(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int priorityCount() {
        return npriorityCount(address());
    }

    @NativeType("VkQueueGlobalPriority[VK_MAX_GLOBAL_PRIORITY_SIZE]")
    public IntBuffer priorities() {
        return npriorities(address());
    }

    @NativeType("VkQueueGlobalPriority")
    public int priorities(int index) {
        return npriorities(address(), index);
    }

    public VkQueueFamilyGlobalPriorityProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkQueueFamilyGlobalPriorityProperties sType$Default() {
        return sType(1000388001);
    }

    public VkQueueFamilyGlobalPriorityProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkQueueFamilyGlobalPriorityProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkQueueFamilyGlobalPriorityProperties set(VkQueueFamilyGlobalPriorityProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueueFamilyGlobalPriorityProperties malloc() {
        return new VkQueueFamilyGlobalPriorityProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueueFamilyGlobalPriorityProperties calloc() {
        return new VkQueueFamilyGlobalPriorityProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueueFamilyGlobalPriorityProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyGlobalPriorityProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkQueueFamilyGlobalPriorityProperties create(long address) {
        return new VkQueueFamilyGlobalPriorityProperties(address, null);
    }

    public static VkQueueFamilyGlobalPriorityProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueueFamilyGlobalPriorityProperties(address, null);
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

    public static VkQueueFamilyGlobalPriorityProperties malloc(MemoryStack stack) {
        return new VkQueueFamilyGlobalPriorityProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueueFamilyGlobalPriorityProperties calloc(MemoryStack stack) {
        return new VkQueueFamilyGlobalPriorityProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npriorityCount(long struct) {
        return MemoryUtil.memGetInt(struct + PRIORITYCOUNT);
    }

    public static IntBuffer npriorities(long struct) {
        return MemoryUtil.memIntBuffer(struct + PRIORITIES, npriorityCount(struct));
    }

    public static int npriorities(long struct, int index) {
        return MemoryUtil.memGetInt(struct + PRIORITIES + (Checks.check(index, 16) * 4));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyGlobalPriorityProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueueFamilyGlobalPriorityProperties, Buffer> implements NativeResource {
        private static final VkQueueFamilyGlobalPriorityProperties ELEMENT_FACTORY = VkQueueFamilyGlobalPriorityProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueueFamilyGlobalPriorityProperties.SIZEOF);
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
        public VkQueueFamilyGlobalPriorityProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkQueueFamilyGlobalPriorityProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkQueueFamilyGlobalPriorityProperties.npNext(address());
        }

        @NativeType("uint32_t")
        public int priorityCount() {
            return VkQueueFamilyGlobalPriorityProperties.npriorityCount(address());
        }

        @NativeType("VkQueueGlobalPriority[VK_MAX_GLOBAL_PRIORITY_SIZE]")
        public IntBuffer priorities() {
            return VkQueueFamilyGlobalPriorityProperties.npriorities(address());
        }

        @NativeType("VkQueueGlobalPriority")
        public int priorities(int index) {
            return VkQueueFamilyGlobalPriorityProperties.npriorities(address(), index);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueueFamilyGlobalPriorityProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000388001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkQueueFamilyGlobalPriorityProperties.npNext(address(), value);
            return this;
        }
    }
}
