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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureCaptureDescriptorDataInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureCaptureDescriptorDataInfoEXT.class */
public class VkAccelerationStructureCaptureDescriptorDataInfoEXT extends Struct<VkAccelerationStructureCaptureDescriptorDataInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ACCELERATIONSTRUCTURE;
    public static final int ACCELERATIONSTRUCTURENV;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
        ACCELERATIONSTRUCTURENV = layout.offsetof(3);
    }

    protected VkAccelerationStructureCaptureDescriptorDataInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT create(long address, ByteBuffer container) {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(address, container);
    }

    public VkAccelerationStructureCaptureDescriptorDataInfoEXT(ByteBuffer container) {
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

    @NativeType("VkAccelerationStructureKHR")
    public long accelerationStructure() {
        return naccelerationStructure(address());
    }

    @NativeType("VkAccelerationStructureNV")
    public long accelerationStructureNV() {
        return naccelerationStructureNV(address());
    }

    public VkAccelerationStructureCaptureDescriptorDataInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureCaptureDescriptorDataInfoEXT sType$Default() {
        return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
    }

    public VkAccelerationStructureCaptureDescriptorDataInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) {
        naccelerationStructure(address(), value);
        return this;
    }

    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructureNV(@NativeType("VkAccelerationStructureNV") long value) {
        naccelerationStructureNV(address(), value);
        return this;
    }

    public VkAccelerationStructureCaptureDescriptorDataInfoEXT set(int sType, long pNext, long accelerationStructure, long accelerationStructureNV) {
        sType(sType);
        pNext(pNext);
        accelerationStructure(accelerationStructure);
        accelerationStructureNV(accelerationStructureNV);
        return this;
    }

    public VkAccelerationStructureCaptureDescriptorDataInfoEXT set(VkAccelerationStructureCaptureDescriptorDataInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT malloc() {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT calloc() {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT create(long address) {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(address, null);
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(address, null);
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

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT malloc(MemoryStack stack) {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT calloc(MemoryStack stack) {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long naccelerationStructure(long struct) {
        return MemoryUtil.memGetLong(struct + ACCELERATIONSTRUCTURE);
    }

    public static long naccelerationStructureNV(long struct) {
        return MemoryUtil.memGetLong(struct + ACCELERATIONSTRUCTURENV);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void naccelerationStructure(long struct, long value) {
        MemoryUtil.memPutLong(struct + ACCELERATIONSTRUCTURE, value);
    }

    public static void naccelerationStructureNV(long struct, long value) {
        MemoryUtil.memPutLong(struct + ACCELERATIONSTRUCTURENV, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureCaptureDescriptorDataInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureCaptureDescriptorDataInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureCaptureDescriptorDataInfoEXT, Buffer> implements NativeResource {
        private static final VkAccelerationStructureCaptureDescriptorDataInfoEXT ELEMENT_FACTORY = VkAccelerationStructureCaptureDescriptorDataInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureCaptureDescriptorDataInfoEXT.SIZEOF);
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
        public VkAccelerationStructureCaptureDescriptorDataInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureCaptureDescriptorDataInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureCaptureDescriptorDataInfoEXT.npNext(address());
        }

        @NativeType("VkAccelerationStructureKHR")
        public long accelerationStructure() {
            return VkAccelerationStructureCaptureDescriptorDataInfoEXT.naccelerationStructure(address());
        }

        @NativeType("VkAccelerationStructureNV")
        public long accelerationStructureNV() {
            return VkAccelerationStructureCaptureDescriptorDataInfoEXT.naccelerationStructureNV(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureCaptureDescriptorDataInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureCaptureDescriptorDataInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer accelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) {
            VkAccelerationStructureCaptureDescriptorDataInfoEXT.naccelerationStructure(address(), value);
            return this;
        }

        public Buffer accelerationStructureNV(@NativeType("VkAccelerationStructureNV") long value) {
            VkAccelerationStructureCaptureDescriptorDataInfoEXT.naccelerationStructureNV(address(), value);
            return this;
        }
    }
}
