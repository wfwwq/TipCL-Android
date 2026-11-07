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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferDeviceAddressInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferDeviceAddressInfo.class */
public class VkBufferDeviceAddressInfo extends Struct<VkBufferDeviceAddressInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BUFFER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
    }

    protected VkBufferDeviceAddressInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBufferDeviceAddressInfo create(long address, ByteBuffer container) {
        return new VkBufferDeviceAddressInfo(address, container);
    }

    public VkBufferDeviceAddressInfo(ByteBuffer container) {
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

    @NativeType("VkBuffer")
    public long buffer() {
        return nbuffer(address());
    }

    public VkBufferDeviceAddressInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBufferDeviceAddressInfo sType$Default() {
        return sType(1000244001);
    }

    public VkBufferDeviceAddressInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBufferDeviceAddressInfo buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkBufferDeviceAddressInfo set(int sType, long pNext, long buffer) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        return this;
    }

    public VkBufferDeviceAddressInfo set(VkBufferDeviceAddressInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferDeviceAddressInfo malloc() {
        return new VkBufferDeviceAddressInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferDeviceAddressInfo calloc() {
        return new VkBufferDeviceAddressInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferDeviceAddressInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferDeviceAddressInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferDeviceAddressInfo create(long address) {
        return new VkBufferDeviceAddressInfo(address, null);
    }

    public static VkBufferDeviceAddressInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferDeviceAddressInfo(address, null);
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

    public static VkBufferDeviceAddressInfo malloc(MemoryStack stack) {
        return new VkBufferDeviceAddressInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferDeviceAddressInfo calloc(MemoryStack stack) {
        return new VkBufferDeviceAddressInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nbuffer(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferDeviceAddressInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferDeviceAddressInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkBufferDeviceAddressInfo, Buffer> implements NativeResource {
        private static final VkBufferDeviceAddressInfo ELEMENT_FACTORY = VkBufferDeviceAddressInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBufferDeviceAddressInfo.SIZEOF);
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
        public VkBufferDeviceAddressInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBufferDeviceAddressInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBufferDeviceAddressInfo.npNext(address());
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkBufferDeviceAddressInfo.nbuffer(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferDeviceAddressInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000244001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferDeviceAddressInfo.npNext(address(), value);
            return this;
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkBufferDeviceAddressInfo.nbuffer(address(), value);
            return this;
        }
    }
}
