package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureMoveObjectsInfoNV.class */
public class VkClusterAccelerationStructureMoveObjectsInfoNV extends Struct<VkClusterAccelerationStructureMoveObjectsInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SRCACCELERATIONSTRUCTURE;

    static {
        Struct.Layout layout = __struct(__member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SRCACCELERATIONSTRUCTURE = layout.offsetof(0);
    }

    protected VkClusterAccelerationStructureMoveObjectsInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClusterAccelerationStructureMoveObjectsInfoNV create(long address, ByteBuffer container) {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(address, container);
    }

    public VkClusterAccelerationStructureMoveObjectsInfoNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceAddress")
    public long srcAccelerationStructure() {
        return nsrcAccelerationStructure(address());
    }

    public VkClusterAccelerationStructureMoveObjectsInfoNV srcAccelerationStructure(@NativeType("VkDeviceAddress") long value) {
        nsrcAccelerationStructure(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureMoveObjectsInfoNV set(VkClusterAccelerationStructureMoveObjectsInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClusterAccelerationStructureMoveObjectsInfoNV malloc() {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClusterAccelerationStructureMoveObjectsInfoNV calloc() {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureMoveObjectsInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkClusterAccelerationStructureMoveObjectsInfoNV create(long address) {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(address, null);
    }

    public static VkClusterAccelerationStructureMoveObjectsInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(address, null);
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

    public static VkClusterAccelerationStructureMoveObjectsInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureMoveObjectsInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nsrcAccelerationStructure(long struct) {
        return MemoryUtil.memGetLong(struct + SRCACCELERATIONSTRUCTURE);
    }

    public static void nsrcAccelerationStructure(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCACCELERATIONSTRUCTURE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureMoveObjectsInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureMoveObjectsInfoNV, Buffer> implements NativeResource {
        private static final VkClusterAccelerationStructureMoveObjectsInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureMoveObjectsInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClusterAccelerationStructureMoveObjectsInfoNV.SIZEOF);
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
        public VkClusterAccelerationStructureMoveObjectsInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long srcAccelerationStructure() {
            return VkClusterAccelerationStructureMoveObjectsInfoNV.nsrcAccelerationStructure(address());
        }

        public Buffer srcAccelerationStructure(@NativeType("VkDeviceAddress") long value) {
            VkClusterAccelerationStructureMoveObjectsInfoNV.nsrcAccelerationStructure(address(), value);
            return this;
        }
    }
}
