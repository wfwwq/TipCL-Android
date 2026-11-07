package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePushDescriptorProperties.class */
public class VkPhysicalDevicePushDescriptorProperties extends Struct<VkPhysicalDevicePushDescriptorProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXPUSHDESCRIPTORS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXPUSHDESCRIPTORS = layout.offsetof(2);
    }

    protected VkPhysicalDevicePushDescriptorProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePushDescriptorProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePushDescriptorProperties(address, container);
    }

    public VkPhysicalDevicePushDescriptorProperties(ByteBuffer container) {
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
    public int maxPushDescriptors() {
        return nmaxPushDescriptors(address());
    }

    public VkPhysicalDevicePushDescriptorProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePushDescriptorProperties sType$Default() {
        return sType(1000080000);
    }

    public VkPhysicalDevicePushDescriptorProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePushDescriptorProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDevicePushDescriptorProperties set(VkPhysicalDevicePushDescriptorProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePushDescriptorProperties malloc() {
        return new VkPhysicalDevicePushDescriptorProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePushDescriptorProperties calloc() {
        return new VkPhysicalDevicePushDescriptorProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePushDescriptorProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePushDescriptorProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePushDescriptorProperties create(long address) {
        return new VkPhysicalDevicePushDescriptorProperties(address, null);
    }

    public static VkPhysicalDevicePushDescriptorProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePushDescriptorProperties(address, null);
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

    public static VkPhysicalDevicePushDescriptorProperties malloc(MemoryStack stack) {
        return new VkPhysicalDevicePushDescriptorProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePushDescriptorProperties calloc(MemoryStack stack) {
        return new VkPhysicalDevicePushDescriptorProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxPushDescriptors(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPUSHDESCRIPTORS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePushDescriptorProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePushDescriptorProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePushDescriptorProperties ELEMENT_FACTORY = VkPhysicalDevicePushDescriptorProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePushDescriptorProperties.SIZEOF);
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
        public VkPhysicalDevicePushDescriptorProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePushDescriptorProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePushDescriptorProperties.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxPushDescriptors() {
            return VkPhysicalDevicePushDescriptorProperties.nmaxPushDescriptors(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePushDescriptorProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000080000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePushDescriptorProperties.npNext(address(), value);
            return this;
        }
    }
}
