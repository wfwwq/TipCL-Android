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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceNV.class */
public class VkAccelerationStructureMotionInstanceNV extends Struct<VkAccelerationStructureMotionInstanceNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int FLAGS;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(VkAccelerationStructureMotionInstanceDataNV.SIZEOF, VkAccelerationStructureMotionInstanceDataNV.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        DATA = layout.offsetof(2);
    }

    protected VkAccelerationStructureMotionInstanceNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureMotionInstanceNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureMotionInstanceNV(address, container);
    }

    public VkAccelerationStructureMotionInstanceNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkAccelerationStructureMotionInstanceTypeNV")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkAccelerationStructureMotionInstanceFlagsNV")
    public int flags() {
        return nflags(address());
    }

    public VkAccelerationStructureMotionInstanceDataNV data() {
        return ndata(address());
    }

    public VkAccelerationStructureMotionInstanceNV type(@NativeType("VkAccelerationStructureMotionInstanceTypeNV") int value) {
        ntype(address(), value);
        return this;
    }

    public VkAccelerationStructureMotionInstanceNV flags(@NativeType("VkAccelerationStructureMotionInstanceFlagsNV") int value) {
        nflags(address(), value);
        return this;
    }

    public VkAccelerationStructureMotionInstanceNV data(VkAccelerationStructureMotionInstanceDataNV value) {
        ndata(address(), value);
        return this;
    }

    public VkAccelerationStructureMotionInstanceNV data(Consumer<VkAccelerationStructureMotionInstanceDataNV> consumer) {
        consumer.accept(data());
        return this;
    }

    public VkAccelerationStructureMotionInstanceNV set(int type, int flags, VkAccelerationStructureMotionInstanceDataNV data) {
        type(type);
        flags(flags);
        data(data);
        return this;
    }

    public VkAccelerationStructureMotionInstanceNV set(VkAccelerationStructureMotionInstanceNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureMotionInstanceNV malloc() {
        return new VkAccelerationStructureMotionInstanceNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureMotionInstanceNV calloc() {
        return new VkAccelerationStructureMotionInstanceNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureMotionInstanceNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureMotionInstanceNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureMotionInstanceNV create(long address) {
        return new VkAccelerationStructureMotionInstanceNV(address, null);
    }

    public static VkAccelerationStructureMotionInstanceNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureMotionInstanceNV(address, null);
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

    public static VkAccelerationStructureMotionInstanceNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureMotionInstanceNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureMotionInstanceNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureMotionInstanceNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static VkAccelerationStructureMotionInstanceDataNV ndata(long struct) {
        return VkAccelerationStructureMotionInstanceDataNV.create(struct + DATA);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ndata(long struct, VkAccelerationStructureMotionInstanceDataNV value) {
        MemoryUtil.memCopy(value.address(), struct + DATA, VkAccelerationStructureMotionInstanceDataNV.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureMotionInstanceNV, Buffer> implements NativeResource {
        private static final VkAccelerationStructureMotionInstanceNV ELEMENT_FACTORY = VkAccelerationStructureMotionInstanceNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureMotionInstanceNV.SIZEOF);
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
        public VkAccelerationStructureMotionInstanceNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkAccelerationStructureMotionInstanceTypeNV")
        public int type() {
            return VkAccelerationStructureMotionInstanceNV.ntype(address());
        }

        @NativeType("VkAccelerationStructureMotionInstanceFlagsNV")
        public int flags() {
            return VkAccelerationStructureMotionInstanceNV.nflags(address());
        }

        public VkAccelerationStructureMotionInstanceDataNV data() {
            return VkAccelerationStructureMotionInstanceNV.ndata(address());
        }

        public Buffer type(@NativeType("VkAccelerationStructureMotionInstanceTypeNV") int value) {
            VkAccelerationStructureMotionInstanceNV.ntype(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkAccelerationStructureMotionInstanceFlagsNV") int value) {
            VkAccelerationStructureMotionInstanceNV.nflags(address(), value);
            return this;
        }

        public Buffer data(VkAccelerationStructureMotionInstanceDataNV value) {
            VkAccelerationStructureMotionInstanceNV.ndata(address(), value);
            return this;
        }

        public Buffer data(Consumer<VkAccelerationStructureMotionInstanceDataNV> consumer) {
            consumer.accept(data());
            return this;
        }
    }
}
