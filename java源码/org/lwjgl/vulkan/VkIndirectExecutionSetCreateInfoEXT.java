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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectExecutionSetCreateInfoEXT.class */
public class VkIndirectExecutionSetCreateInfoEXT extends Struct<VkIndirectExecutionSetCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;
    public static final int INFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkIndirectExecutionSetInfoEXT.SIZEOF, VkIndirectExecutionSetInfoEXT.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        INFO = layout.offsetof(3);
    }

    protected VkIndirectExecutionSetCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectExecutionSetCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkIndirectExecutionSetCreateInfoEXT(address, container);
    }

    public VkIndirectExecutionSetCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkIndirectExecutionSetInfoTypeEXT")
    public int type() {
        return ntype(address());
    }

    public VkIndirectExecutionSetInfoEXT info() {
        return ninfo(address());
    }

    public VkIndirectExecutionSetCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkIndirectExecutionSetCreateInfoEXT sType$Default() {
        return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT);
    }

    public VkIndirectExecutionSetCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkIndirectExecutionSetCreateInfoEXT type(@NativeType("VkIndirectExecutionSetInfoTypeEXT") int value) {
        ntype(address(), value);
        return this;
    }

    public VkIndirectExecutionSetCreateInfoEXT info(VkIndirectExecutionSetInfoEXT value) {
        ninfo(address(), value);
        return this;
    }

    public VkIndirectExecutionSetCreateInfoEXT info(Consumer<VkIndirectExecutionSetInfoEXT> consumer) {
        consumer.accept(info());
        return this;
    }

    public VkIndirectExecutionSetCreateInfoEXT set(int sType, long pNext, int type, VkIndirectExecutionSetInfoEXT info) {
        sType(sType);
        pNext(pNext);
        type(type);
        info(info);
        return this;
    }

    public VkIndirectExecutionSetCreateInfoEXT set(VkIndirectExecutionSetCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectExecutionSetCreateInfoEXT malloc() {
        return new VkIndirectExecutionSetCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectExecutionSetCreateInfoEXT calloc() {
        return new VkIndirectExecutionSetCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectExecutionSetCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectExecutionSetCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectExecutionSetCreateInfoEXT create(long address) {
        return new VkIndirectExecutionSetCreateInfoEXT(address, null);
    }

    public static VkIndirectExecutionSetCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectExecutionSetCreateInfoEXT(address, null);
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

    public static VkIndirectExecutionSetCreateInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectExecutionSetCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectExecutionSetCreateInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectExecutionSetCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkIndirectExecutionSetInfoEXT ninfo(long struct) {
        return VkIndirectExecutionSetInfoEXT.create(struct + INFO);
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

    public static void ninfo(long struct, VkIndirectExecutionSetInfoEXT value) {
        MemoryUtil.memCopy(value.address(), struct + INFO, VkIndirectExecutionSetInfoEXT.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectExecutionSetCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectExecutionSetCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkIndirectExecutionSetCreateInfoEXT ELEMENT_FACTORY = VkIndirectExecutionSetCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectExecutionSetCreateInfoEXT.SIZEOF);
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
        public VkIndirectExecutionSetCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkIndirectExecutionSetCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkIndirectExecutionSetCreateInfoEXT.npNext(address());
        }

        @NativeType("VkIndirectExecutionSetInfoTypeEXT")
        public int type() {
            return VkIndirectExecutionSetCreateInfoEXT.ntype(address());
        }

        public VkIndirectExecutionSetInfoEXT info() {
            return VkIndirectExecutionSetCreateInfoEXT.ninfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkIndirectExecutionSetCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkIndirectExecutionSetCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkIndirectExecutionSetInfoTypeEXT") int value) {
            VkIndirectExecutionSetCreateInfoEXT.ntype(address(), value);
            return this;
        }

        public Buffer info(VkIndirectExecutionSetInfoEXT value) {
            VkIndirectExecutionSetCreateInfoEXT.ninfo(address(), value);
            return this;
        }

        public Buffer info(Consumer<VkIndirectExecutionSetInfoEXT> consumer) {
            consumer.accept(info());
            return this;
        }
    }
}
