package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueShaderCoreControlCreateInfoARM.class */
public class VkDeviceQueueShaderCoreControlCreateInfoARM extends Struct<VkDeviceQueueShaderCoreControlCreateInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERCORECOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERCORECOUNT = layout.offsetof(2);
    }

    protected VkDeviceQueueShaderCoreControlCreateInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceQueueShaderCoreControlCreateInfoARM create(long address, ByteBuffer container) {
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(address, container);
    }

    public VkDeviceQueueShaderCoreControlCreateInfoARM(ByteBuffer container) {
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
    public int shaderCoreCount() {
        return nshaderCoreCount(address());
    }

    public VkDeviceQueueShaderCoreControlCreateInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceQueueShaderCoreControlCreateInfoARM sType$Default() {
        return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM);
    }

    public VkDeviceQueueShaderCoreControlCreateInfoARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceQueueShaderCoreControlCreateInfoARM shaderCoreCount(@NativeType("uint32_t") int value) {
        nshaderCoreCount(address(), value);
        return this;
    }

    public VkDeviceQueueShaderCoreControlCreateInfoARM set(int sType, long pNext, int shaderCoreCount) {
        sType(sType);
        pNext(pNext);
        shaderCoreCount(shaderCoreCount);
        return this;
    }

    public VkDeviceQueueShaderCoreControlCreateInfoARM set(VkDeviceQueueShaderCoreControlCreateInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceQueueShaderCoreControlCreateInfoARM malloc() {
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceQueueShaderCoreControlCreateInfoARM calloc() {
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceQueueShaderCoreControlCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceQueueShaderCoreControlCreateInfoARM create(long address) {
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(address, null);
    }

    public static VkDeviceQueueShaderCoreControlCreateInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(address, null);
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

    public static VkDeviceQueueShaderCoreControlCreateInfoARM malloc(MemoryStack stack) {
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceQueueShaderCoreControlCreateInfoARM calloc(MemoryStack stack) {
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderCoreCount(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERCORECOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderCoreCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERCORECOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueShaderCoreControlCreateInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceQueueShaderCoreControlCreateInfoARM, Buffer> implements NativeResource {
        private static final VkDeviceQueueShaderCoreControlCreateInfoARM ELEMENT_FACTORY = VkDeviceQueueShaderCoreControlCreateInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceQueueShaderCoreControlCreateInfoARM.SIZEOF);
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
        public VkDeviceQueueShaderCoreControlCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceQueueShaderCoreControlCreateInfoARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDeviceQueueShaderCoreControlCreateInfoARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int shaderCoreCount() {
            return VkDeviceQueueShaderCoreControlCreateInfoARM.nshaderCoreCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceQueueShaderCoreControlCreateInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDeviceQueueShaderCoreControlCreateInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer shaderCoreCount(@NativeType("uint32_t") int value) {
            VkDeviceQueueShaderCoreControlCreateInfoARM.nshaderCoreCount(address(), value);
            return this;
        }
    }
}
