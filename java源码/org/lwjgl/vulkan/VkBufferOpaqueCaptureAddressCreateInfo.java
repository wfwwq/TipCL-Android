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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferOpaqueCaptureAddressCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferOpaqueCaptureAddressCreateInfo.class */
public class VkBufferOpaqueCaptureAddressCreateInfo extends Struct<VkBufferOpaqueCaptureAddressCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int OPAQUECAPTUREADDRESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OPAQUECAPTUREADDRESS = layout.offsetof(2);
    }

    protected VkBufferOpaqueCaptureAddressCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBufferOpaqueCaptureAddressCreateInfo create(long address, ByteBuffer container) {
        return new VkBufferOpaqueCaptureAddressCreateInfo(address, container);
    }

    public VkBufferOpaqueCaptureAddressCreateInfo(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long opaqueCaptureAddress() {
        return nopaqueCaptureAddress(address());
    }

    public VkBufferOpaqueCaptureAddressCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBufferOpaqueCaptureAddressCreateInfo sType$Default() {
        return sType(1000257002);
    }

    public VkBufferOpaqueCaptureAddressCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBufferOpaqueCaptureAddressCreateInfo opaqueCaptureAddress(@NativeType("uint64_t") long value) {
        nopaqueCaptureAddress(address(), value);
        return this;
    }

    public VkBufferOpaqueCaptureAddressCreateInfo set(int sType, long pNext, long opaqueCaptureAddress) {
        sType(sType);
        pNext(pNext);
        opaqueCaptureAddress(opaqueCaptureAddress);
        return this;
    }

    public VkBufferOpaqueCaptureAddressCreateInfo set(VkBufferOpaqueCaptureAddressCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferOpaqueCaptureAddressCreateInfo malloc() {
        return new VkBufferOpaqueCaptureAddressCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferOpaqueCaptureAddressCreateInfo calloc() {
        return new VkBufferOpaqueCaptureAddressCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferOpaqueCaptureAddressCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferOpaqueCaptureAddressCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferOpaqueCaptureAddressCreateInfo create(long address) {
        return new VkBufferOpaqueCaptureAddressCreateInfo(address, null);
    }

    public static VkBufferOpaqueCaptureAddressCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferOpaqueCaptureAddressCreateInfo(address, null);
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

    public static VkBufferOpaqueCaptureAddressCreateInfo malloc(MemoryStack stack) {
        return new VkBufferOpaqueCaptureAddressCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferOpaqueCaptureAddressCreateInfo calloc(MemoryStack stack) {
        return new VkBufferOpaqueCaptureAddressCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nopaqueCaptureAddress(long struct) {
        return MemoryUtil.memGetLong(struct + OPAQUECAPTUREADDRESS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nopaqueCaptureAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + OPAQUECAPTUREADDRESS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferOpaqueCaptureAddressCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferOpaqueCaptureAddressCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkBufferOpaqueCaptureAddressCreateInfo, Buffer> implements NativeResource {
        private static final VkBufferOpaqueCaptureAddressCreateInfo ELEMENT_FACTORY = VkBufferOpaqueCaptureAddressCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBufferOpaqueCaptureAddressCreateInfo.SIZEOF);
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
        public VkBufferOpaqueCaptureAddressCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBufferOpaqueCaptureAddressCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBufferOpaqueCaptureAddressCreateInfo.npNext(address());
        }

        @NativeType("uint64_t")
        public long opaqueCaptureAddress() {
            return VkBufferOpaqueCaptureAddressCreateInfo.nopaqueCaptureAddress(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferOpaqueCaptureAddressCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000257002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferOpaqueCaptureAddressCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer opaqueCaptureAddress(@NativeType("uint64_t") long value) {
            VkBufferOpaqueCaptureAddressCreateInfo.nopaqueCaptureAddress(address(), value);
            return this;
        }
    }
}
