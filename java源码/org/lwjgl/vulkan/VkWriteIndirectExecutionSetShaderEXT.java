package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteIndirectExecutionSetShaderEXT.class */
public class VkWriteIndirectExecutionSetShaderEXT extends Struct<VkWriteIndirectExecutionSetShaderEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INDEX;
    public static final int SHADER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INDEX = layout.offsetof(2);
        SHADER = layout.offsetof(3);
    }

    protected VkWriteIndirectExecutionSetShaderEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkWriteIndirectExecutionSetShaderEXT create(long address, ByteBuffer container) {
        return new VkWriteIndirectExecutionSetShaderEXT(address, container);
    }

    public VkWriteIndirectExecutionSetShaderEXT(ByteBuffer container) {
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
    public int index() {
        return nindex(address());
    }

    @NativeType("VkShaderEXT")
    public long shader() {
        return nshader(address());
    }

    public VkWriteIndirectExecutionSetShaderEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkWriteIndirectExecutionSetShaderEXT sType$Default() {
        return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT);
    }

    public VkWriteIndirectExecutionSetShaderEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkWriteIndirectExecutionSetShaderEXT index(@NativeType("uint32_t") int value) {
        nindex(address(), value);
        return this;
    }

    public VkWriteIndirectExecutionSetShaderEXT shader(@NativeType("VkShaderEXT") long value) {
        nshader(address(), value);
        return this;
    }

    public VkWriteIndirectExecutionSetShaderEXT set(int sType, long pNext, int index, long shader) {
        sType(sType);
        pNext(pNext);
        index(index);
        shader(shader);
        return this;
    }

    public VkWriteIndirectExecutionSetShaderEXT set(VkWriteIndirectExecutionSetShaderEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkWriteIndirectExecutionSetShaderEXT malloc() {
        return new VkWriteIndirectExecutionSetShaderEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkWriteIndirectExecutionSetShaderEXT calloc() {
        return new VkWriteIndirectExecutionSetShaderEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkWriteIndirectExecutionSetShaderEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteIndirectExecutionSetShaderEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkWriteIndirectExecutionSetShaderEXT create(long address) {
        return new VkWriteIndirectExecutionSetShaderEXT(address, null);
    }

    public static VkWriteIndirectExecutionSetShaderEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkWriteIndirectExecutionSetShaderEXT(address, null);
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

    public static VkWriteIndirectExecutionSetShaderEXT malloc(MemoryStack stack) {
        return new VkWriteIndirectExecutionSetShaderEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkWriteIndirectExecutionSetShaderEXT calloc(MemoryStack stack) {
        return new VkWriteIndirectExecutionSetShaderEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nindex(long struct) {
        return MemoryUtil.memGetInt(struct + INDEX);
    }

    public static long nshader(long struct) {
        return MemoryUtil.memGetLong(struct + SHADER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nindex(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEX, value);
    }

    public static void nshader(long struct, long value) {
        MemoryUtil.memPutLong(struct + SHADER, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteIndirectExecutionSetShaderEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkWriteIndirectExecutionSetShaderEXT, Buffer> implements NativeResource {
        private static final VkWriteIndirectExecutionSetShaderEXT ELEMENT_FACTORY = VkWriteIndirectExecutionSetShaderEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkWriteIndirectExecutionSetShaderEXT.SIZEOF);
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
        public VkWriteIndirectExecutionSetShaderEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkWriteIndirectExecutionSetShaderEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkWriteIndirectExecutionSetShaderEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int index() {
            return VkWriteIndirectExecutionSetShaderEXT.nindex(address());
        }

        @NativeType("VkShaderEXT")
        public long shader() {
            return VkWriteIndirectExecutionSetShaderEXT.nshader(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkWriteIndirectExecutionSetShaderEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkWriteIndirectExecutionSetShaderEXT.npNext(address(), value);
            return this;
        }

        public Buffer index(@NativeType("uint32_t") int value) {
            VkWriteIndirectExecutionSetShaderEXT.nindex(address(), value);
            return this;
        }

        public Buffer shader(@NativeType("VkShaderEXT") long value) {
            VkWriteIndirectExecutionSetShaderEXT.nshader(address(), value);
            return this;
        }
    }
}
