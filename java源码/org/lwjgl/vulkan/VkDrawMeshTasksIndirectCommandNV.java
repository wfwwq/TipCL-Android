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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawMeshTasksIndirectCommandNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawMeshTasksIndirectCommandNV.class */
public class VkDrawMeshTasksIndirectCommandNV extends Struct<VkDrawMeshTasksIndirectCommandNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TASKCOUNT;
    public static final int FIRSTTASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TASKCOUNT = layout.offsetof(0);
        FIRSTTASK = layout.offsetof(1);
    }

    protected VkDrawMeshTasksIndirectCommandNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDrawMeshTasksIndirectCommandNV create(long address, ByteBuffer container) {
        return new VkDrawMeshTasksIndirectCommandNV(address, container);
    }

    public VkDrawMeshTasksIndirectCommandNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int taskCount() {
        return ntaskCount(address());
    }

    @NativeType("uint32_t")
    public int firstTask() {
        return nfirstTask(address());
    }

    public VkDrawMeshTasksIndirectCommandNV taskCount(@NativeType("uint32_t") int value) {
        ntaskCount(address(), value);
        return this;
    }

    public VkDrawMeshTasksIndirectCommandNV firstTask(@NativeType("uint32_t") int value) {
        nfirstTask(address(), value);
        return this;
    }

    public VkDrawMeshTasksIndirectCommandNV set(int taskCount, int firstTask) {
        taskCount(taskCount);
        firstTask(firstTask);
        return this;
    }

    public VkDrawMeshTasksIndirectCommandNV set(VkDrawMeshTasksIndirectCommandNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDrawMeshTasksIndirectCommandNV malloc() {
        return new VkDrawMeshTasksIndirectCommandNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDrawMeshTasksIndirectCommandNV calloc() {
        return new VkDrawMeshTasksIndirectCommandNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDrawMeshTasksIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrawMeshTasksIndirectCommandNV(MemoryUtil.memAddress(container), container);
    }

    public static VkDrawMeshTasksIndirectCommandNV create(long address) {
        return new VkDrawMeshTasksIndirectCommandNV(address, null);
    }

    public static VkDrawMeshTasksIndirectCommandNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDrawMeshTasksIndirectCommandNV(address, null);
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

    public static VkDrawMeshTasksIndirectCommandNV malloc(MemoryStack stack) {
        return new VkDrawMeshTasksIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDrawMeshTasksIndirectCommandNV calloc(MemoryStack stack) {
        return new VkDrawMeshTasksIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntaskCount(long struct) {
        return MemoryUtil.memGetInt(struct + TASKCOUNT);
    }

    public static int nfirstTask(long struct) {
        return MemoryUtil.memGetInt(struct + FIRSTTASK);
    }

    public static void ntaskCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + TASKCOUNT, value);
    }

    public static void nfirstTask(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRSTTASK, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawMeshTasksIndirectCommandNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawMeshTasksIndirectCommandNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkDrawMeshTasksIndirectCommandNV, Buffer> implements NativeResource {
        private static final VkDrawMeshTasksIndirectCommandNV ELEMENT_FACTORY = VkDrawMeshTasksIndirectCommandNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDrawMeshTasksIndirectCommandNV.SIZEOF);
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
        public VkDrawMeshTasksIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int taskCount() {
            return VkDrawMeshTasksIndirectCommandNV.ntaskCount(address());
        }

        @NativeType("uint32_t")
        public int firstTask() {
            return VkDrawMeshTasksIndirectCommandNV.nfirstTask(address());
        }

        public Buffer taskCount(@NativeType("uint32_t") int value) {
            VkDrawMeshTasksIndirectCommandNV.ntaskCount(address(), value);
            return this;
        }

        public Buffer firstTask(@NativeType("uint32_t") int value) {
            VkDrawMeshTasksIndirectCommandNV.nfirstTask(address(), value);
            return this;
        }
    }
}
