package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryOpaqueCaptureAddressInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryOpaqueCaptureAddressInfo.class */
public class VkDeviceMemoryOpaqueCaptureAddressInfo extends Struct<VkDeviceMemoryOpaqueCaptureAddressInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MEMORY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
    }

    protected VkDeviceMemoryOpaqueCaptureAddressInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceMemoryOpaqueCaptureAddressInfo create(long address, ByteBuffer container) {
        return new VkDeviceMemoryOpaqueCaptureAddressInfo(address, container);
    }

    public VkDeviceMemoryOpaqueCaptureAddressInfo(ByteBuffer container) {
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

    @NativeType("VkDeviceMemory")
    public long memory() {
        return nmemory(address());
    }

    public VkDeviceMemoryOpaqueCaptureAddressInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceMemoryOpaqueCaptureAddressInfo sType$Default() {
        return sType(1000257004);
    }

    public VkDeviceMemoryOpaqueCaptureAddressInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceMemoryOpaqueCaptureAddressInfo memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkDeviceMemoryOpaqueCaptureAddressInfo set(int sType, long pNext, long memory) {
        sType(sType);
        pNext(pNext);
        memory(memory);
        return this;
    }

    public VkDeviceMemoryOpaqueCaptureAddressInfo set(VkDeviceMemoryOpaqueCaptureAddressInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfo malloc() {
        return new VkDeviceMemoryOpaqueCaptureAddressInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfo calloc() {
        return new VkDeviceMemoryOpaqueCaptureAddressInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceMemoryOpaqueCaptureAddressInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfo create(long address) {
        return new VkDeviceMemoryOpaqueCaptureAddressInfo(address, null);
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceMemoryOpaqueCaptureAddressInfo(address, null);
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

    public static VkDeviceMemoryOpaqueCaptureAddressInfo malloc(MemoryStack stack) {
        return new VkDeviceMemoryOpaqueCaptureAddressInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfo calloc(MemoryStack stack) {
        return new VkDeviceMemoryOpaqueCaptureAddressInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nmemory(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryOpaqueCaptureAddressInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryOpaqueCaptureAddressInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceMemoryOpaqueCaptureAddressInfo, Buffer> implements NativeResource {
        private static final VkDeviceMemoryOpaqueCaptureAddressInfo ELEMENT_FACTORY = VkDeviceMemoryOpaqueCaptureAddressInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceMemoryOpaqueCaptureAddressInfo.SIZEOF);
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
        public VkDeviceMemoryOpaqueCaptureAddressInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceMemoryOpaqueCaptureAddressInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceMemoryOpaqueCaptureAddressInfo.npNext(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkDeviceMemoryOpaqueCaptureAddressInfo.nmemory(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceMemoryOpaqueCaptureAddressInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000257004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceMemoryOpaqueCaptureAddressInfo.npNext(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkDeviceMemoryOpaqueCaptureAddressInfo.nmemory(address(), value);
            return this;
        }
    }
}
