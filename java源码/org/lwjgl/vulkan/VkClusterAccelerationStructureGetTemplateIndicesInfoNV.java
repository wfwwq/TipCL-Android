package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureGetTemplateIndicesInfoNV.class */
public class VkClusterAccelerationStructureGetTemplateIndicesInfoNV extends Struct<VkClusterAccelerationStructureGetTemplateIndicesInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CLUSTERTEMPLATEADDRESS;

    static {
        Struct.Layout layout = __struct(__member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CLUSTERTEMPLATEADDRESS = layout.offsetof(0);
    }

    protected VkClusterAccelerationStructureGetTemplateIndicesInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV create(long address, ByteBuffer container) {
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(address, container);
    }

    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceAddress")
    public long clusterTemplateAddress() {
        return nclusterTemplateAddress(address());
    }

    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV clusterTemplateAddress(@NativeType("VkDeviceAddress") long value) {
        nclusterTemplateAddress(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV set(VkClusterAccelerationStructureGetTemplateIndicesInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV malloc() {
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV calloc() {
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV create(long address) {
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(address, null);
    }

    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(address, null);
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

    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nclusterTemplateAddress(long struct) {
        return MemoryUtil.memGetLong(struct + CLUSTERTEMPLATEADDRESS);
    }

    public static void nclusterTemplateAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + CLUSTERTEMPLATEADDRESS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureGetTemplateIndicesInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureGetTemplateIndicesInfoNV, Buffer> implements NativeResource {
        private static final VkClusterAccelerationStructureGetTemplateIndicesInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureGetTemplateIndicesInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClusterAccelerationStructureGetTemplateIndicesInfoNV.SIZEOF);
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
        public VkClusterAccelerationStructureGetTemplateIndicesInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long clusterTemplateAddress() {
            return VkClusterAccelerationStructureGetTemplateIndicesInfoNV.nclusterTemplateAddress(address());
        }

        public Buffer clusterTemplateAddress(@NativeType("VkDeviceAddress") long value) {
            VkClusterAccelerationStructureGetTemplateIndicesInfoNV.nclusterTemplateAddress(address(), value);
            return this;
        }
    }
}
