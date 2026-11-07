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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutTokenEXT.class */
public class VkIndirectCommandsLayoutTokenEXT extends Struct<VkIndirectCommandsLayoutTokenEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;
    public static final int DATA;
    public static final int OFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkIndirectCommandsTokenDataEXT.SIZEOF, VkIndirectCommandsTokenDataEXT.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        DATA = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
    }

    protected VkIndirectCommandsLayoutTokenEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectCommandsLayoutTokenEXT create(long address, ByteBuffer container) {
        return new VkIndirectCommandsLayoutTokenEXT(address, container);
    }

    public VkIndirectCommandsLayoutTokenEXT(ByteBuffer container) {
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

    @NativeType("VkIndirectCommandsTokenTypeEXT")
    public int type() {
        return ntype(address());
    }

    public VkIndirectCommandsTokenDataEXT data() {
        return ndata(address());
    }

    @NativeType("uint32_t")
    public int offset() {
        return noffset(address());
    }

    public VkIndirectCommandsLayoutTokenEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenEXT sType$Default() {
        return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT);
    }

    public VkIndirectCommandsLayoutTokenEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenEXT pNext(VkPushConstantBankInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkIndirectCommandsLayoutTokenEXT type(@NativeType("VkIndirectCommandsTokenTypeEXT") int value) {
        ntype(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenEXT data(VkIndirectCommandsTokenDataEXT value) {
        ndata(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenEXT data(Consumer<VkIndirectCommandsTokenDataEXT> consumer) {
        consumer.accept(data());
        return this;
    }

    public VkIndirectCommandsLayoutTokenEXT offset(@NativeType("uint32_t") int value) {
        noffset(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenEXT set(int sType, long pNext, int type, VkIndirectCommandsTokenDataEXT data, int offset) {
        sType(sType);
        pNext(pNext);
        type(type);
        data(data);
        offset(offset);
        return this;
    }

    public VkIndirectCommandsLayoutTokenEXT set(VkIndirectCommandsLayoutTokenEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectCommandsLayoutTokenEXT malloc() {
        return new VkIndirectCommandsLayoutTokenEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutTokenEXT calloc() {
        return new VkIndirectCommandsLayoutTokenEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutTokenEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsLayoutTokenEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectCommandsLayoutTokenEXT create(long address) {
        return new VkIndirectCommandsLayoutTokenEXT(address, null);
    }

    public static VkIndirectCommandsLayoutTokenEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectCommandsLayoutTokenEXT(address, null);
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

    public static VkIndirectCommandsLayoutTokenEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutTokenEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutTokenEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutTokenEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkIndirectCommandsTokenDataEXT ndata(long struct) {
        return VkIndirectCommandsTokenDataEXT.create(struct + DATA);
    }

    public static int noffset(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET);
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

    public static void ndata(long struct, VkIndirectCommandsTokenDataEXT value) {
        MemoryUtil.memCopy(value.address(), struct + DATA, VkIndirectCommandsTokenDataEXT.SIZEOF);
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutTokenEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutTokenEXT, Buffer> implements NativeResource {
        private static final VkIndirectCommandsLayoutTokenEXT ELEMENT_FACTORY = VkIndirectCommandsLayoutTokenEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectCommandsLayoutTokenEXT.SIZEOF);
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
        public VkIndirectCommandsLayoutTokenEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkIndirectCommandsLayoutTokenEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkIndirectCommandsLayoutTokenEXT.npNext(address());
        }

        @NativeType("VkIndirectCommandsTokenTypeEXT")
        public int type() {
            return VkIndirectCommandsLayoutTokenEXT.ntype(address());
        }

        public VkIndirectCommandsTokenDataEXT data() {
            return VkIndirectCommandsLayoutTokenEXT.ndata(address());
        }

        @NativeType("uint32_t")
        public int offset() {
            return VkIndirectCommandsLayoutTokenEXT.noffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkIndirectCommandsLayoutTokenEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkIndirectCommandsLayoutTokenEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPushConstantBankInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer type(@NativeType("VkIndirectCommandsTokenTypeEXT") int value) {
            VkIndirectCommandsLayoutTokenEXT.ntype(address(), value);
            return this;
        }

        public Buffer data(VkIndirectCommandsTokenDataEXT value) {
            VkIndirectCommandsLayoutTokenEXT.ndata(address(), value);
            return this;
        }

        public Buffer data(Consumer<VkIndirectCommandsTokenDataEXT> consumer) {
            consumer.accept(data());
            return this;
        }

        public Buffer offset(@NativeType("uint32_t") int value) {
            VkIndirectCommandsLayoutTokenEXT.noffset(address(), value);
            return this;
        }
    }
}
