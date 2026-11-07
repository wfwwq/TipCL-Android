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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryDeviceGroupInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryDeviceGroupInfo.class */
public class VkBindBufferMemoryDeviceGroupInfo extends Struct<VkBindBufferMemoryDeviceGroupInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICEINDEXCOUNT;
    public static final int PDEVICEINDICES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEINDEXCOUNT = layout.offsetof(2);
        PDEVICEINDICES = layout.offsetof(3);
    }

    protected VkBindBufferMemoryDeviceGroupInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindBufferMemoryDeviceGroupInfo create(long address, ByteBuffer container) {
        return new VkBindBufferMemoryDeviceGroupInfo(address, container);
    }

    public VkBindBufferMemoryDeviceGroupInfo(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int deviceIndexCount() {
        return ndeviceIndexCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pDeviceIndices() {
        return npDeviceIndices(address());
    }

    public VkBindBufferMemoryDeviceGroupInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindBufferMemoryDeviceGroupInfo sType$Default() {
        return sType(1000060013);
    }

    public VkBindBufferMemoryDeviceGroupInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindBufferMemoryDeviceGroupInfo pDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npDeviceIndices(address(), value);
        return this;
    }

    public VkBindBufferMemoryDeviceGroupInfo set(int sType, long pNext, IntBuffer pDeviceIndices) {
        sType(sType);
        pNext(pNext);
        pDeviceIndices(pDeviceIndices);
        return this;
    }

    public VkBindBufferMemoryDeviceGroupInfo set(VkBindBufferMemoryDeviceGroupInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindBufferMemoryDeviceGroupInfo malloc() {
        return new VkBindBufferMemoryDeviceGroupInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindBufferMemoryDeviceGroupInfo calloc() {
        return new VkBindBufferMemoryDeviceGroupInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindBufferMemoryDeviceGroupInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindBufferMemoryDeviceGroupInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkBindBufferMemoryDeviceGroupInfo create(long address) {
        return new VkBindBufferMemoryDeviceGroupInfo(address, null);
    }

    public static VkBindBufferMemoryDeviceGroupInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindBufferMemoryDeviceGroupInfo(address, null);
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

    public static VkBindBufferMemoryDeviceGroupInfo malloc(MemoryStack stack) {
        return new VkBindBufferMemoryDeviceGroupInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindBufferMemoryDeviceGroupInfo calloc(MemoryStack stack) {
        return new VkBindBufferMemoryDeviceGroupInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndeviceIndexCount(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEINDEXCOUNT);
    }

    public static IntBuffer npDeviceIndices(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PDEVICEINDICES), ndeviceIndexCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndeviceIndexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEINDEXCOUNT, value);
    }

    public static void npDeviceIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PDEVICEINDICES, MemoryUtil.memAddressSafe(value));
        ndeviceIndexCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (ndeviceIndexCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDEVICEINDICES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryDeviceGroupInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryDeviceGroupInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindBufferMemoryDeviceGroupInfo, Buffer> implements NativeResource {
        private static final VkBindBufferMemoryDeviceGroupInfo ELEMENT_FACTORY = VkBindBufferMemoryDeviceGroupInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindBufferMemoryDeviceGroupInfo.SIZEOF);
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
        public VkBindBufferMemoryDeviceGroupInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindBufferMemoryDeviceGroupInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindBufferMemoryDeviceGroupInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int deviceIndexCount() {
            return VkBindBufferMemoryDeviceGroupInfo.ndeviceIndexCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pDeviceIndices() {
            return VkBindBufferMemoryDeviceGroupInfo.npDeviceIndices(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindBufferMemoryDeviceGroupInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000060013);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindBufferMemoryDeviceGroupInfo.npNext(address(), value);
            return this;
        }

        public Buffer pDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkBindBufferMemoryDeviceGroupInfo.npDeviceIndices(address(), value);
            return this;
        }
    }
}
