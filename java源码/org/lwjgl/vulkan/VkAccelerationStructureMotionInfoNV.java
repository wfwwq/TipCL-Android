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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInfoNV.class */
public class VkAccelerationStructureMotionInfoNV extends Struct<VkAccelerationStructureMotionInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXINSTANCES;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXINSTANCES = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected VkAccelerationStructureMotionInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureMotionInfoNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureMotionInfoNV(address, container);
    }

    public VkAccelerationStructureMotionInfoNV(ByteBuffer container) {
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
    public int maxInstances() {
        return nmaxInstances(address());
    }

    @NativeType("VkAccelerationStructureMotionInfoFlagsNV")
    public int flags() {
        return nflags(address());
    }

    public VkAccelerationStructureMotionInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureMotionInfoNV sType$Default() {
        return sType(NVRayTracingMotionBlur.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV);
    }

    public VkAccelerationStructureMotionInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureMotionInfoNV maxInstances(@NativeType("uint32_t") int value) {
        nmaxInstances(address(), value);
        return this;
    }

    public VkAccelerationStructureMotionInfoNV flags(@NativeType("VkAccelerationStructureMotionInfoFlagsNV") int value) {
        nflags(address(), value);
        return this;
    }

    public VkAccelerationStructureMotionInfoNV set(int sType, long pNext, int maxInstances, int flags) {
        sType(sType);
        pNext(pNext);
        maxInstances(maxInstances);
        flags(flags);
        return this;
    }

    public VkAccelerationStructureMotionInfoNV set(VkAccelerationStructureMotionInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureMotionInfoNV malloc() {
        return new VkAccelerationStructureMotionInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureMotionInfoNV calloc() {
        return new VkAccelerationStructureMotionInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureMotionInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureMotionInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureMotionInfoNV create(long address) {
        return new VkAccelerationStructureMotionInfoNV(address, null);
    }

    public static VkAccelerationStructureMotionInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureMotionInfoNV(address, null);
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

    public static VkAccelerationStructureMotionInfoNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureMotionInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureMotionInfoNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureMotionInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxInstances(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINSTANCES);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaxInstances(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXINSTANCES, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureMotionInfoNV, Buffer> implements NativeResource {
        private static final VkAccelerationStructureMotionInfoNV ELEMENT_FACTORY = VkAccelerationStructureMotionInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureMotionInfoNV.SIZEOF);
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
        public VkAccelerationStructureMotionInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureMotionInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureMotionInfoNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxInstances() {
            return VkAccelerationStructureMotionInfoNV.nmaxInstances(address());
        }

        @NativeType("VkAccelerationStructureMotionInfoFlagsNV")
        public int flags() {
            return VkAccelerationStructureMotionInfoNV.nflags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureMotionInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracingMotionBlur.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureMotionInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer maxInstances(@NativeType("uint32_t") int value) {
            VkAccelerationStructureMotionInfoNV.nmaxInstances(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkAccelerationStructureMotionInfoFlagsNV") int value) {
            VkAccelerationStructureMotionInfoNV.nflags(address(), value);
            return this;
        }
    }
}
