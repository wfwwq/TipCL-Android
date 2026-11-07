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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawMeshTasksIndirectCommandEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawMeshTasksIndirectCommandEXT.class */
public class VkDrawMeshTasksIndirectCommandEXT extends Struct<VkDrawMeshTasksIndirectCommandEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int GROUPCOUNTX;
    public static final int GROUPCOUNTY;
    public static final int GROUPCOUNTZ;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        GROUPCOUNTX = layout.offsetof(0);
        GROUPCOUNTY = layout.offsetof(1);
        GROUPCOUNTZ = layout.offsetof(2);
    }

    protected VkDrawMeshTasksIndirectCommandEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDrawMeshTasksIndirectCommandEXT create(long address, ByteBuffer container) {
        return new VkDrawMeshTasksIndirectCommandEXT(address, container);
    }

    public VkDrawMeshTasksIndirectCommandEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int groupCountX() {
        return ngroupCountX(address());
    }

    @NativeType("uint32_t")
    public int groupCountY() {
        return ngroupCountY(address());
    }

    @NativeType("uint32_t")
    public int groupCountZ() {
        return ngroupCountZ(address());
    }

    public VkDrawMeshTasksIndirectCommandEXT groupCountX(@NativeType("uint32_t") int value) {
        ngroupCountX(address(), value);
        return this;
    }

    public VkDrawMeshTasksIndirectCommandEXT groupCountY(@NativeType("uint32_t") int value) {
        ngroupCountY(address(), value);
        return this;
    }

    public VkDrawMeshTasksIndirectCommandEXT groupCountZ(@NativeType("uint32_t") int value) {
        ngroupCountZ(address(), value);
        return this;
    }

    public VkDrawMeshTasksIndirectCommandEXT set(int groupCountX, int groupCountY, int groupCountZ) {
        groupCountX(groupCountX);
        groupCountY(groupCountY);
        groupCountZ(groupCountZ);
        return this;
    }

    public VkDrawMeshTasksIndirectCommandEXT set(VkDrawMeshTasksIndirectCommandEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDrawMeshTasksIndirectCommandEXT malloc() {
        return new VkDrawMeshTasksIndirectCommandEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDrawMeshTasksIndirectCommandEXT calloc() {
        return new VkDrawMeshTasksIndirectCommandEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDrawMeshTasksIndirectCommandEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrawMeshTasksIndirectCommandEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDrawMeshTasksIndirectCommandEXT create(long address) {
        return new VkDrawMeshTasksIndirectCommandEXT(address, null);
    }

    public static VkDrawMeshTasksIndirectCommandEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDrawMeshTasksIndirectCommandEXT(address, null);
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

    public static VkDrawMeshTasksIndirectCommandEXT malloc(MemoryStack stack) {
        return new VkDrawMeshTasksIndirectCommandEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDrawMeshTasksIndirectCommandEXT calloc(MemoryStack stack) {
        return new VkDrawMeshTasksIndirectCommandEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ngroupCountX(long struct) {
        return MemoryUtil.memGetInt(struct + GROUPCOUNTX);
    }

    public static int ngroupCountY(long struct) {
        return MemoryUtil.memGetInt(struct + GROUPCOUNTY);
    }

    public static int ngroupCountZ(long struct) {
        return MemoryUtil.memGetInt(struct + GROUPCOUNTZ);
    }

    public static void ngroupCountX(long struct, int value) {
        MemoryUtil.memPutInt(struct + GROUPCOUNTX, value);
    }

    public static void ngroupCountY(long struct, int value) {
        MemoryUtil.memPutInt(struct + GROUPCOUNTY, value);
    }

    public static void ngroupCountZ(long struct, int value) {
        MemoryUtil.memPutInt(struct + GROUPCOUNTZ, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawMeshTasksIndirectCommandEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawMeshTasksIndirectCommandEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDrawMeshTasksIndirectCommandEXT, Buffer> implements NativeResource {
        private static final VkDrawMeshTasksIndirectCommandEXT ELEMENT_FACTORY = VkDrawMeshTasksIndirectCommandEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDrawMeshTasksIndirectCommandEXT.SIZEOF);
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
        public VkDrawMeshTasksIndirectCommandEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int groupCountX() {
            return VkDrawMeshTasksIndirectCommandEXT.ngroupCountX(address());
        }

        @NativeType("uint32_t")
        public int groupCountY() {
            return VkDrawMeshTasksIndirectCommandEXT.ngroupCountY(address());
        }

        @NativeType("uint32_t")
        public int groupCountZ() {
            return VkDrawMeshTasksIndirectCommandEXT.ngroupCountZ(address());
        }

        public Buffer groupCountX(@NativeType("uint32_t") int value) {
            VkDrawMeshTasksIndirectCommandEXT.ngroupCountX(address(), value);
            return this;
        }

        public Buffer groupCountY(@NativeType("uint32_t") int value) {
            VkDrawMeshTasksIndirectCommandEXT.ngroupCountY(address(), value);
            return this;
        }

        public Buffer groupCountZ(@NativeType("uint32_t") int value) {
            VkDrawMeshTasksIndirectCommandEXT.ngroupCountZ(address(), value);
            return this;
        }
    }
}
