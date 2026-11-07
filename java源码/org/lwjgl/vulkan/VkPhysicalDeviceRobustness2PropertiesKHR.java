package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRobustness2PropertiesKHR.class */
public class VkPhysicalDeviceRobustness2PropertiesKHR extends Struct<VkPhysicalDeviceRobustness2PropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ROBUSTSTORAGEBUFFERACCESSSIZEALIGNMENT;
    public static final int ROBUSTUNIFORMBUFFERACCESSSIZEALIGNMENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ROBUSTSTORAGEBUFFERACCESSSIZEALIGNMENT = layout.offsetof(2);
        ROBUSTUNIFORMBUFFERACCESSSIZEALIGNMENT = layout.offsetof(3);
    }

    protected VkPhysicalDeviceRobustness2PropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRobustness2PropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRobustness2PropertiesKHR(address, container);
    }

    public VkPhysicalDeviceRobustness2PropertiesKHR(ByteBuffer container) {
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

    @NativeType("VkDeviceSize")
    public long robustStorageBufferAccessSizeAlignment() {
        return nrobustStorageBufferAccessSizeAlignment(address());
    }

    @NativeType("VkDeviceSize")
    public long robustUniformBufferAccessSizeAlignment() {
        return nrobustUniformBufferAccessSizeAlignment(address());
    }

    public VkPhysicalDeviceRobustness2PropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRobustness2PropertiesKHR sType$Default() {
        return sType(1000286001);
    }

    public VkPhysicalDeviceRobustness2PropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRobustness2PropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceRobustness2PropertiesKHR set(VkPhysicalDeviceRobustness2PropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRobustness2PropertiesKHR malloc() {
        return new VkPhysicalDeviceRobustness2PropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRobustness2PropertiesKHR calloc() {
        return new VkPhysicalDeviceRobustness2PropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRobustness2PropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRobustness2PropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRobustness2PropertiesKHR create(long address) {
        return new VkPhysicalDeviceRobustness2PropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceRobustness2PropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRobustness2PropertiesKHR(address, null);
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

    public static VkPhysicalDeviceRobustness2PropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRobustness2PropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRobustness2PropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRobustness2PropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nrobustStorageBufferAccessSizeAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + ROBUSTSTORAGEBUFFERACCESSSIZEALIGNMENT);
    }

    public static long nrobustUniformBufferAccessSizeAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + ROBUSTUNIFORMBUFFERACCESSSIZEALIGNMENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRobustness2PropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRobustness2PropertiesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRobustness2PropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceRobustness2PropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRobustness2PropertiesKHR.SIZEOF);
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
        public VkPhysicalDeviceRobustness2PropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRobustness2PropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRobustness2PropertiesKHR.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long robustStorageBufferAccessSizeAlignment() {
            return VkPhysicalDeviceRobustness2PropertiesKHR.nrobustStorageBufferAccessSizeAlignment(address());
        }

        @NativeType("VkDeviceSize")
        public long robustUniformBufferAccessSizeAlignment() {
            return VkPhysicalDeviceRobustness2PropertiesKHR.nrobustUniformBufferAccessSizeAlignment(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRobustness2PropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000286001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRobustness2PropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
