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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMemoryRequirementsInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMemoryRequirementsInfoNV.class */
public class VkAccelerationStructureMemoryRequirementsInfoNV extends Struct<VkAccelerationStructureMemoryRequirementsInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;
    public static final int ACCELERATIONSTRUCTURE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        ACCELERATIONSTRUCTURE = layout.offsetof(3);
    }

    protected VkAccelerationStructureMemoryRequirementsInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureMemoryRequirementsInfoNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(address, container);
    }

    public VkAccelerationStructureMemoryRequirementsInfoNV(ByteBuffer container) {
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

    @NativeType("VkAccelerationStructureMemoryRequirementsTypeNV")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkAccelerationStructureNV")
    public long accelerationStructure() {
        return naccelerationStructure(address());
    }

    public VkAccelerationStructureMemoryRequirementsInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureMemoryRequirementsInfoNV sType$Default() {
        return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV);
    }

    public VkAccelerationStructureMemoryRequirementsInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureMemoryRequirementsInfoNV type(@NativeType("VkAccelerationStructureMemoryRequirementsTypeNV") int value) {
        ntype(address(), value);
        return this;
    }

    public VkAccelerationStructureMemoryRequirementsInfoNV accelerationStructure(@NativeType("VkAccelerationStructureNV") long value) {
        naccelerationStructure(address(), value);
        return this;
    }

    public VkAccelerationStructureMemoryRequirementsInfoNV set(int sType, long pNext, int type, long accelerationStructure) {
        sType(sType);
        pNext(pNext);
        type(type);
        accelerationStructure(accelerationStructure);
        return this;
    }

    public VkAccelerationStructureMemoryRequirementsInfoNV set(VkAccelerationStructureMemoryRequirementsInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV malloc() {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV calloc() {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureMemoryRequirementsInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV create(long address) {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(address, null);
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureMemoryRequirementsInfoNV(address, null);
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

    public static VkAccelerationStructureMemoryRequirementsInfoNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long naccelerationStructure(long struct) {
        return MemoryUtil.memGetLong(struct + ACCELERATIONSTRUCTURE);
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

    public static void naccelerationStructure(long struct, long value) {
        MemoryUtil.memPutLong(struct + ACCELERATIONSTRUCTURE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMemoryRequirementsInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMemoryRequirementsInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureMemoryRequirementsInfoNV, Buffer> implements NativeResource {
        private static final VkAccelerationStructureMemoryRequirementsInfoNV ELEMENT_FACTORY = VkAccelerationStructureMemoryRequirementsInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureMemoryRequirementsInfoNV.SIZEOF);
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
        public VkAccelerationStructureMemoryRequirementsInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureMemoryRequirementsInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureMemoryRequirementsInfoNV.npNext(address());
        }

        @NativeType("VkAccelerationStructureMemoryRequirementsTypeNV")
        public int type() {
            return VkAccelerationStructureMemoryRequirementsInfoNV.ntype(address());
        }

        @NativeType("VkAccelerationStructureNV")
        public long accelerationStructure() {
            return VkAccelerationStructureMemoryRequirementsInfoNV.naccelerationStructure(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureMemoryRequirementsInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureMemoryRequirementsInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkAccelerationStructureMemoryRequirementsTypeNV") int value) {
            VkAccelerationStructureMemoryRequirementsInfoNV.ntype(address(), value);
            return this;
        }

        public Buffer accelerationStructure(@NativeType("VkAccelerationStructureNV") long value) {
            VkAccelerationStructureMemoryRequirementsInfoNV.naccelerationStructure(address(), value);
            return this;
        }
    }
}
