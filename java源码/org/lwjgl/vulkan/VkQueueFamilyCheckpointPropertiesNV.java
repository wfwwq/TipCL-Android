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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyCheckpointPropertiesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyCheckpointPropertiesNV.class */
public class VkQueueFamilyCheckpointPropertiesNV extends Struct<VkQueueFamilyCheckpointPropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CHECKPOINTEXECUTIONSTAGEMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CHECKPOINTEXECUTIONSTAGEMASK = layout.offsetof(2);
    }

    protected VkQueueFamilyCheckpointPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueueFamilyCheckpointPropertiesNV create(long address, ByteBuffer container) {
        return new VkQueueFamilyCheckpointPropertiesNV(address, container);
    }

    public VkQueueFamilyCheckpointPropertiesNV(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkPipelineStageFlags")
    public int checkpointExecutionStageMask() {
        return ncheckpointExecutionStageMask(address());
    }

    public VkQueueFamilyCheckpointPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkQueueFamilyCheckpointPropertiesNV sType$Default() {
        return sType(NVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV);
    }

    public VkQueueFamilyCheckpointPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkQueueFamilyCheckpointPropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkQueueFamilyCheckpointPropertiesNV set(VkQueueFamilyCheckpointPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueueFamilyCheckpointPropertiesNV malloc() {
        return new VkQueueFamilyCheckpointPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueueFamilyCheckpointPropertiesNV calloc() {
        return new VkQueueFamilyCheckpointPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueueFamilyCheckpointPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyCheckpointPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkQueueFamilyCheckpointPropertiesNV create(long address) {
        return new VkQueueFamilyCheckpointPropertiesNV(address, null);
    }

    public static VkQueueFamilyCheckpointPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueueFamilyCheckpointPropertiesNV(address, null);
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

    public static VkQueueFamilyCheckpointPropertiesNV malloc(MemoryStack stack) {
        return new VkQueueFamilyCheckpointPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueueFamilyCheckpointPropertiesNV calloc(MemoryStack stack) {
        return new VkQueueFamilyCheckpointPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncheckpointExecutionStageMask(long struct) {
        return MemoryUtil.memGetInt(struct + CHECKPOINTEXECUTIONSTAGEMASK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyCheckpointPropertiesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyCheckpointPropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueueFamilyCheckpointPropertiesNV, Buffer> implements NativeResource {
        private static final VkQueueFamilyCheckpointPropertiesNV ELEMENT_FACTORY = VkQueueFamilyCheckpointPropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueueFamilyCheckpointPropertiesNV.SIZEOF);
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
        public VkQueueFamilyCheckpointPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkQueueFamilyCheckpointPropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkQueueFamilyCheckpointPropertiesNV.npNext(address());
        }

        @NativeType("VkPipelineStageFlags")
        public int checkpointExecutionStageMask() {
            return VkQueueFamilyCheckpointPropertiesNV.ncheckpointExecutionStageMask(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueueFamilyCheckpointPropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkQueueFamilyCheckpointPropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
