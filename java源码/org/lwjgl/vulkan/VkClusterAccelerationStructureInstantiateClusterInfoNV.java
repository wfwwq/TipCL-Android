package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureInstantiateClusterInfoNV.class */
public class VkClusterAccelerationStructureInstantiateClusterInfoNV extends Struct<VkClusterAccelerationStructureInstantiateClusterInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CLUSTERIDOFFSET;
    public static final int BITFIELD0;
    public static final int CLUSTERTEMPLATEADDRESS;
    public static final int VERTEXBUFFER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(VkStridedDeviceAddressNV.SIZEOF, VkStridedDeviceAddressNV.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CLUSTERIDOFFSET = layout.offsetof(0);
        BITFIELD0 = layout.offsetof(1);
        CLUSTERTEMPLATEADDRESS = layout.offsetof(2);
        VERTEXBUFFER = layout.offsetof(3);
    }

    protected VkClusterAccelerationStructureInstantiateClusterInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClusterAccelerationStructureInstantiateClusterInfoNV create(long address, ByteBuffer container) {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(address, container);
    }

    public VkClusterAccelerationStructureInstantiateClusterInfoNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int clusterIdOffset() {
        return nclusterIdOffset(address());
    }

    @NativeType("uint32_t")
    public int geometryIndexOffset() {
        return ngeometryIndexOffset(address());
    }

    @NativeType("uint32_t")
    public int reserved() {
        return nreserved(address());
    }

    @NativeType("VkDeviceAddress")
    public long clusterTemplateAddress() {
        return nclusterTemplateAddress(address());
    }

    public VkStridedDeviceAddressNV vertexBuffer() {
        return nvertexBuffer(address());
    }

    public VkClusterAccelerationStructureInstantiateClusterInfoNV clusterIdOffset(@NativeType("uint32_t") int value) {
        nclusterIdOffset(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureInstantiateClusterInfoNV geometryIndexOffset(@NativeType("uint32_t") int value) {
        ngeometryIndexOffset(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureInstantiateClusterInfoNV reserved(@NativeType("uint32_t") int value) {
        nreserved(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureInstantiateClusterInfoNV clusterTemplateAddress(@NativeType("VkDeviceAddress") long value) {
        nclusterTemplateAddress(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureInstantiateClusterInfoNV vertexBuffer(VkStridedDeviceAddressNV value) {
        nvertexBuffer(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureInstantiateClusterInfoNV vertexBuffer(Consumer<VkStridedDeviceAddressNV> consumer) {
        consumer.accept(vertexBuffer());
        return this;
    }

    public VkClusterAccelerationStructureInstantiateClusterInfoNV set(int clusterIdOffset, int geometryIndexOffset, int reserved, long clusterTemplateAddress, VkStridedDeviceAddressNV vertexBuffer) {
        clusterIdOffset(clusterIdOffset);
        geometryIndexOffset(geometryIndexOffset);
        reserved(reserved);
        clusterTemplateAddress(clusterTemplateAddress);
        vertexBuffer(vertexBuffer);
        return this;
    }

    public VkClusterAccelerationStructureInstantiateClusterInfoNV set(VkClusterAccelerationStructureInstantiateClusterInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClusterAccelerationStructureInstantiateClusterInfoNV malloc() {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClusterAccelerationStructureInstantiateClusterInfoNV calloc() {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureInstantiateClusterInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkClusterAccelerationStructureInstantiateClusterInfoNV create(long address) {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(address, null);
    }

    public static VkClusterAccelerationStructureInstantiateClusterInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(address, null);
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

    public static VkClusterAccelerationStructureInstantiateClusterInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureInstantiateClusterInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nclusterIdOffset(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERIDOFFSET);
    }

    public static int nbitfield0(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD0);
    }

    public static int ngeometryIndexOffset(long struct) {
        return nbitfield0(struct) & 16777215;
    }

    public static int nreserved(long struct) {
        return nbitfield0(struct) >>> 24;
    }

    public static long nclusterTemplateAddress(long struct) {
        return MemoryUtil.memGetLong(struct + CLUSTERTEMPLATEADDRESS);
    }

    public static VkStridedDeviceAddressNV nvertexBuffer(long struct) {
        return VkStridedDeviceAddressNV.create(struct + VERTEXBUFFER);
    }

    public static void nclusterIdOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLUSTERIDOFFSET, value);
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void ngeometryIndexOffset(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-16777216)) | (value & 16777215));
    }

    public static void nreserved(long struct, int value) {
        nbitfield0(struct, (value << 24) | (nbitfield0(struct) & 16777215));
    }

    public static void nclusterTemplateAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + CLUSTERTEMPLATEADDRESS, value);
    }

    public static void nvertexBuffer(long struct, VkStridedDeviceAddressNV value) {
        MemoryUtil.memCopy(value.address(), struct + VERTEXBUFFER, VkStridedDeviceAddressNV.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureInstantiateClusterInfoNV, Buffer> implements NativeResource {
        private static final VkClusterAccelerationStructureInstantiateClusterInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureInstantiateClusterInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF);
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
        public VkClusterAccelerationStructureInstantiateClusterInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int clusterIdOffset() {
            return VkClusterAccelerationStructureInstantiateClusterInfoNV.nclusterIdOffset(address());
        }

        @NativeType("uint32_t")
        public int geometryIndexOffset() {
            return VkClusterAccelerationStructureInstantiateClusterInfoNV.ngeometryIndexOffset(address());
        }

        @NativeType("uint32_t")
        public int reserved() {
            return VkClusterAccelerationStructureInstantiateClusterInfoNV.nreserved(address());
        }

        @NativeType("VkDeviceAddress")
        public long clusterTemplateAddress() {
            return VkClusterAccelerationStructureInstantiateClusterInfoNV.nclusterTemplateAddress(address());
        }

        public VkStridedDeviceAddressNV vertexBuffer() {
            return VkClusterAccelerationStructureInstantiateClusterInfoNV.nvertexBuffer(address());
        }

        public Buffer clusterIdOffset(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureInstantiateClusterInfoNV.nclusterIdOffset(address(), value);
            return this;
        }

        public Buffer geometryIndexOffset(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureInstantiateClusterInfoNV.ngeometryIndexOffset(address(), value);
            return this;
        }

        public Buffer reserved(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureInstantiateClusterInfoNV.nreserved(address(), value);
            return this;
        }

        public Buffer clusterTemplateAddress(@NativeType("VkDeviceAddress") long value) {
            VkClusterAccelerationStructureInstantiateClusterInfoNV.nclusterTemplateAddress(address(), value);
            return this;
        }

        public Buffer vertexBuffer(VkStridedDeviceAddressNV value) {
            VkClusterAccelerationStructureInstantiateClusterInfoNV.nvertexBuffer(address(), value);
            return this;
        }

        public Buffer vertexBuffer(Consumer<VkStridedDeviceAddressNV> consumer) {
            consumer.accept(vertexBuffer());
            return this;
        }
    }
}
