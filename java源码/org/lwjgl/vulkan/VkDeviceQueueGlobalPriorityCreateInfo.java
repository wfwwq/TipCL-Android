package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueGlobalPriorityCreateInfo.class */
public class VkDeviceQueueGlobalPriorityCreateInfo extends Struct<VkDeviceQueueGlobalPriorityCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int GLOBALPRIORITY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GLOBALPRIORITY = layout.offsetof(2);
    }

    protected VkDeviceQueueGlobalPriorityCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceQueueGlobalPriorityCreateInfo create(long address, ByteBuffer container) {
        return new VkDeviceQueueGlobalPriorityCreateInfo(address, container);
    }

    public VkDeviceQueueGlobalPriorityCreateInfo(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkQueueGlobalPriority")
    public int globalPriority() {
        return nglobalPriority(address());
    }

    public VkDeviceQueueGlobalPriorityCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceQueueGlobalPriorityCreateInfo sType$Default() {
        return sType(1000174000);
    }

    public VkDeviceQueueGlobalPriorityCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceQueueGlobalPriorityCreateInfo globalPriority(@NativeType("VkQueueGlobalPriority") int value) {
        nglobalPriority(address(), value);
        return this;
    }

    public VkDeviceQueueGlobalPriorityCreateInfo set(int sType, long pNext, int globalPriority) {
        sType(sType);
        pNext(pNext);
        globalPriority(globalPriority);
        return this;
    }

    public VkDeviceQueueGlobalPriorityCreateInfo set(VkDeviceQueueGlobalPriorityCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceQueueGlobalPriorityCreateInfo malloc() {
        return new VkDeviceQueueGlobalPriorityCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceQueueGlobalPriorityCreateInfo calloc() {
        return new VkDeviceQueueGlobalPriorityCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceQueueGlobalPriorityCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceQueueGlobalPriorityCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceQueueGlobalPriorityCreateInfo create(long address) {
        return new VkDeviceQueueGlobalPriorityCreateInfo(address, null);
    }

    public static VkDeviceQueueGlobalPriorityCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceQueueGlobalPriorityCreateInfo(address, null);
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

    public static VkDeviceQueueGlobalPriorityCreateInfo malloc(MemoryStack stack) {
        return new VkDeviceQueueGlobalPriorityCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceQueueGlobalPriorityCreateInfo calloc(MemoryStack stack) {
        return new VkDeviceQueueGlobalPriorityCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nglobalPriority(long struct) {
        return MemoryUtil.memGetInt(struct + GLOBALPRIORITY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nglobalPriority(long struct, int value) {
        MemoryUtil.memPutInt(struct + GLOBALPRIORITY, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueGlobalPriorityCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceQueueGlobalPriorityCreateInfo, Buffer> implements NativeResource {
        private static final VkDeviceQueueGlobalPriorityCreateInfo ELEMENT_FACTORY = VkDeviceQueueGlobalPriorityCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceQueueGlobalPriorityCreateInfo.SIZEOF);
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
        public VkDeviceQueueGlobalPriorityCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceQueueGlobalPriorityCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceQueueGlobalPriorityCreateInfo.npNext(address());
        }

        @NativeType("VkQueueGlobalPriority")
        public int globalPriority() {
            return VkDeviceQueueGlobalPriorityCreateInfo.nglobalPriority(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceQueueGlobalPriorityCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000174000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceQueueGlobalPriorityCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer globalPriority(@NativeType("VkQueueGlobalPriority") int value) {
            VkDeviceQueueGlobalPriorityCreateInfo.nglobalPriority(address(), value);
            return this;
        }
    }
}
