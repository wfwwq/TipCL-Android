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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyCheckpointProperties2NV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyCheckpointProperties2NV.class */
public class VkQueueFamilyCheckpointProperties2NV extends Struct<VkQueueFamilyCheckpointProperties2NV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CHECKPOINTEXECUTIONSTAGEMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CHECKPOINTEXECUTIONSTAGEMASK = layout.offsetof(2);
    }

    protected VkQueueFamilyCheckpointProperties2NV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueueFamilyCheckpointProperties2NV create(long address, ByteBuffer container) {
        return new VkQueueFamilyCheckpointProperties2NV(address, container);
    }

    public VkQueueFamilyCheckpointProperties2NV(ByteBuffer container) {
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

    @NativeType("VkPipelineStageFlags2")
    public long checkpointExecutionStageMask() {
        return ncheckpointExecutionStageMask(address());
    }

    public VkQueueFamilyCheckpointProperties2NV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkQueueFamilyCheckpointProperties2NV sType$Default() {
        return sType(NVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV);
    }

    public VkQueueFamilyCheckpointProperties2NV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkQueueFamilyCheckpointProperties2NV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkQueueFamilyCheckpointProperties2NV set(VkQueueFamilyCheckpointProperties2NV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueueFamilyCheckpointProperties2NV malloc() {
        return new VkQueueFamilyCheckpointProperties2NV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueueFamilyCheckpointProperties2NV calloc() {
        return new VkQueueFamilyCheckpointProperties2NV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueueFamilyCheckpointProperties2NV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyCheckpointProperties2NV(MemoryUtil.memAddress(container), container);
    }

    public static VkQueueFamilyCheckpointProperties2NV create(long address) {
        return new VkQueueFamilyCheckpointProperties2NV(address, null);
    }

    public static VkQueueFamilyCheckpointProperties2NV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueueFamilyCheckpointProperties2NV(address, null);
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

    public static VkQueueFamilyCheckpointProperties2NV malloc(MemoryStack stack) {
        return new VkQueueFamilyCheckpointProperties2NV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueueFamilyCheckpointProperties2NV calloc(MemoryStack stack) {
        return new VkQueueFamilyCheckpointProperties2NV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ncheckpointExecutionStageMask(long struct) {
        return MemoryUtil.memGetLong(struct + CHECKPOINTEXECUTIONSTAGEMASK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyCheckpointProperties2NV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyCheckpointProperties2NV$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueueFamilyCheckpointProperties2NV, Buffer> implements NativeResource {
        private static final VkQueueFamilyCheckpointProperties2NV ELEMENT_FACTORY = VkQueueFamilyCheckpointProperties2NV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueueFamilyCheckpointProperties2NV.SIZEOF);
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
        public VkQueueFamilyCheckpointProperties2NV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkQueueFamilyCheckpointProperties2NV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkQueueFamilyCheckpointProperties2NV.npNext(address());
        }

        @NativeType("VkPipelineStageFlags2")
        public long checkpointExecutionStageMask() {
            return VkQueueFamilyCheckpointProperties2NV.ncheckpointExecutionStageMask(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueueFamilyCheckpointProperties2NV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkQueueFamilyCheckpointProperties2NV.npNext(address(), value);
            return this;
        }
    }
}
