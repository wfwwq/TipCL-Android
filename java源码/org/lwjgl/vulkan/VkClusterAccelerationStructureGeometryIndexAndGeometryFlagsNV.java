package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.class */
public class VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV extends Struct<VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV create(long address, ByteBuffer container) {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(address, container);
    }

    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int geometryIndex() {
        return ngeometryIndex(address());
    }

    @NativeType("uint32_t")
    public int reserved() {
        return nreserved(address());
    }

    @NativeType("uint32_t")
    public int geometryFlags() {
        return ngeometryFlags(address());
    }

    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV geometryIndex(@NativeType("uint32_t") int value) {
        ngeometryIndex(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV reserved(@NativeType("uint32_t") int value) {
        nreserved(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV geometryFlags(@NativeType("uint32_t") int value) {
        ngeometryFlags(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV set(int geometryIndex, int reserved, int geometryFlags) {
        geometryIndex(geometryIndex);
        reserved(reserved);
        geometryFlags(geometryFlags);
        return this;
    }

    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV set(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV malloc() {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV calloc() {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(MemoryUtil.memAddress(container), container);
    }

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV create(long address) {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(address, null);
    }

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(address, null);
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

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nbitfield0(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD0);
    }

    public static int ngeometryIndex(long struct) {
        return nbitfield0(struct) & 16777215;
    }

    public static int nreserved(long struct) {
        return (nbitfield0(struct) & 520093696) >>> 24;
    }

    public static int ngeometryFlags(long struct) {
        return nbitfield0(struct) >>> 29;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void ngeometryIndex(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-16777216)) | (value & 16777215));
    }

    public static void nreserved(long struct, int value) {
        nbitfield0(struct, ((value << 24) & 520093696) | (nbitfield0(struct) & (-520093697)));
    }

    public static void ngeometryFlags(long struct, int value) {
        nbitfield0(struct, (value << 29) | (nbitfield0(struct) & 536870911));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV, Buffer> implements NativeResource {
        private static final VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV ELEMENT_FACTORY = VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF);
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
        public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int geometryIndex() {
            return VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ngeometryIndex(address());
        }

        @NativeType("uint32_t")
        public int reserved() {
            return VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.nreserved(address());
        }

        @NativeType("uint32_t")
        public int geometryFlags() {
            return VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ngeometryFlags(address());
        }

        public Buffer geometryIndex(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ngeometryIndex(address(), value);
            return this;
        }

        public Buffer reserved(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.nreserved(address(), value);
            return this;
        }

        public Buffer geometryFlags(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ngeometryFlags(address(), value);
            return this;
        }
    }
}
