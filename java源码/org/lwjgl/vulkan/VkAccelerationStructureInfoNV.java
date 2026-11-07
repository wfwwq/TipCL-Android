package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkGeometryNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureInfoNV.class */
public class VkAccelerationStructureInfoNV extends Struct<VkAccelerationStructureInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;
    public static final int FLAGS;
    public static final int INSTANCECOUNT;
    public static final int GEOMETRYCOUNT;
    public static final int PGEOMETRIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        INSTANCECOUNT = layout.offsetof(4);
        GEOMETRYCOUNT = layout.offsetof(5);
        PGEOMETRIES = layout.offsetof(6);
    }

    protected VkAccelerationStructureInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureInfoNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureInfoNV(address, container);
    }

    public VkAccelerationStructureInfoNV(ByteBuffer container) {
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

    @NativeType("VkAccelerationStructureTypeNV")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkBuildAccelerationStructureFlagsNV")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int instanceCount() {
        return ninstanceCount(address());
    }

    @NativeType("uint32_t")
    public int geometryCount() {
        return ngeometryCount(address());
    }

    @NativeType("VkGeometryNV const *")
    public VkGeometryNV.Buffer pGeometries() {
        return npGeometries(address());
    }

    public VkAccelerationStructureInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureInfoNV sType$Default() {
        return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV);
    }

    public VkAccelerationStructureInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureInfoNV type(@NativeType("VkAccelerationStructureTypeNV") int value) {
        ntype(address(), value);
        return this;
    }

    public VkAccelerationStructureInfoNV flags(@NativeType("VkBuildAccelerationStructureFlagsNV") int value) {
        nflags(address(), value);
        return this;
    }

    public VkAccelerationStructureInfoNV instanceCount(@NativeType("uint32_t") int value) {
        ninstanceCount(address(), value);
        return this;
    }

    public VkAccelerationStructureInfoNV pGeometries(@NativeType("VkGeometryNV const *") VkGeometryNV.Buffer value) {
        npGeometries(address(), value);
        return this;
    }

    public VkAccelerationStructureInfoNV set(int sType, long pNext, int type, int flags, int instanceCount, VkGeometryNV.Buffer pGeometries) {
        sType(sType);
        pNext(pNext);
        type(type);
        flags(flags);
        instanceCount(instanceCount);
        pGeometries(pGeometries);
        return this;
    }

    public VkAccelerationStructureInfoNV set(VkAccelerationStructureInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureInfoNV malloc() {
        return new VkAccelerationStructureInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureInfoNV calloc() {
        return new VkAccelerationStructureInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureInfoNV create(long address) {
        return new VkAccelerationStructureInfoNV(address, null);
    }

    public static VkAccelerationStructureInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureInfoNV(address, null);
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

    public static VkAccelerationStructureInfoNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureInfoNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int ninstanceCount(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCECOUNT);
    }

    public static int ngeometryCount(long struct) {
        return MemoryUtil.memGetInt(struct + GEOMETRYCOUNT);
    }

    public static VkGeometryNV.Buffer npGeometries(long struct) {
        return VkGeometryNV.createSafe(MemoryUtil.memGetAddress(struct + PGEOMETRIES), ngeometryCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ninstanceCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCECOUNT, value);
    }

    public static void ngeometryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + GEOMETRYCOUNT, value);
    }

    public static void npGeometries(long struct, VkGeometryNV.Buffer value) {
        MemoryUtil.memPutAddress(struct + PGEOMETRIES, MemoryUtil.memAddressSafe(value));
        ngeometryCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (ngeometryCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PGEOMETRIES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureInfoNV, Buffer> implements NativeResource {
        private static final VkAccelerationStructureInfoNV ELEMENT_FACTORY = VkAccelerationStructureInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureInfoNV.SIZEOF);
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
        public VkAccelerationStructureInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureInfoNV.npNext(address());
        }

        @NativeType("VkAccelerationStructureTypeNV")
        public int type() {
            return VkAccelerationStructureInfoNV.ntype(address());
        }

        @NativeType("VkBuildAccelerationStructureFlagsNV")
        public int flags() {
            return VkAccelerationStructureInfoNV.nflags(address());
        }

        @NativeType("uint32_t")
        public int instanceCount() {
            return VkAccelerationStructureInfoNV.ninstanceCount(address());
        }

        @NativeType("uint32_t")
        public int geometryCount() {
            return VkAccelerationStructureInfoNV.ngeometryCount(address());
        }

        @NativeType("VkGeometryNV const *")
        public VkGeometryNV.Buffer pGeometries() {
            return VkAccelerationStructureInfoNV.npGeometries(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkAccelerationStructureTypeNV") int value) {
            VkAccelerationStructureInfoNV.ntype(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkBuildAccelerationStructureFlagsNV") int value) {
            VkAccelerationStructureInfoNV.nflags(address(), value);
            return this;
        }

        public Buffer instanceCount(@NativeType("uint32_t") int value) {
            VkAccelerationStructureInfoNV.ninstanceCount(address(), value);
            return this;
        }

        public Buffer pGeometries(@NativeType("VkGeometryNV const *") VkGeometryNV.Buffer value) {
            VkAccelerationStructureInfoNV.npGeometries(address(), value);
            return this;
        }
    }
}
