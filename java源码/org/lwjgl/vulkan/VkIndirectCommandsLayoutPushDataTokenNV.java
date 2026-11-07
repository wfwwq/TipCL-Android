package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutPushDataTokenNV.class */
public class VkIndirectCommandsLayoutPushDataTokenNV extends Struct<VkIndirectCommandsLayoutPushDataTokenNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PUSHDATAOFFSET;
    public static final int PUSHDATASIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PUSHDATAOFFSET = layout.offsetof(2);
        PUSHDATASIZE = layout.offsetof(3);
    }

    protected VkIndirectCommandsLayoutPushDataTokenNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectCommandsLayoutPushDataTokenNV create(long address, ByteBuffer container) {
        return new VkIndirectCommandsLayoutPushDataTokenNV(address, container);
    }

    public VkIndirectCommandsLayoutPushDataTokenNV(ByteBuffer container) {
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
    public int pushDataOffset() {
        return npushDataOffset(address());
    }

    @NativeType("uint32_t")
    public int pushDataSize() {
        return npushDataSize(address());
    }

    public VkIndirectCommandsLayoutPushDataTokenNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutPushDataTokenNV sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV);
    }

    public VkIndirectCommandsLayoutPushDataTokenNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutPushDataTokenNV pushDataOffset(@NativeType("uint32_t") int value) {
        npushDataOffset(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutPushDataTokenNV pushDataSize(@NativeType("uint32_t") int value) {
        npushDataSize(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutPushDataTokenNV set(int sType, long pNext, int pushDataOffset, int pushDataSize) {
        sType(sType);
        pNext(pNext);
        pushDataOffset(pushDataOffset);
        pushDataSize(pushDataSize);
        return this;
    }

    public VkIndirectCommandsLayoutPushDataTokenNV set(VkIndirectCommandsLayoutPushDataTokenNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectCommandsLayoutPushDataTokenNV malloc() {
        return new VkIndirectCommandsLayoutPushDataTokenNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutPushDataTokenNV calloc() {
        return new VkIndirectCommandsLayoutPushDataTokenNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutPushDataTokenNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsLayoutPushDataTokenNV(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectCommandsLayoutPushDataTokenNV create(long address) {
        return new VkIndirectCommandsLayoutPushDataTokenNV(address, null);
    }

    public static VkIndirectCommandsLayoutPushDataTokenNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectCommandsLayoutPushDataTokenNV(address, null);
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

    public static VkIndirectCommandsLayoutPushDataTokenNV malloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutPushDataTokenNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutPushDataTokenNV calloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutPushDataTokenNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npushDataOffset(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHDATAOFFSET);
    }

    public static int npushDataSize(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHDATASIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npushDataOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHDATAOFFSET, value);
    }

    public static void npushDataSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHDATASIZE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutPushDataTokenNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutPushDataTokenNV, Buffer> implements NativeResource {
        private static final VkIndirectCommandsLayoutPushDataTokenNV ELEMENT_FACTORY = VkIndirectCommandsLayoutPushDataTokenNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectCommandsLayoutPushDataTokenNV.SIZEOF);
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
        public VkIndirectCommandsLayoutPushDataTokenNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkIndirectCommandsLayoutPushDataTokenNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkIndirectCommandsLayoutPushDataTokenNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int pushDataOffset() {
            return VkIndirectCommandsLayoutPushDataTokenNV.npushDataOffset(address());
        }

        @NativeType("uint32_t")
        public int pushDataSize() {
            return VkIndirectCommandsLayoutPushDataTokenNV.npushDataSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkIndirectCommandsLayoutPushDataTokenNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkIndirectCommandsLayoutPushDataTokenNV.npNext(address(), value);
            return this;
        }

        public Buffer pushDataOffset(@NativeType("uint32_t") int value) {
            VkIndirectCommandsLayoutPushDataTokenNV.npushDataOffset(address(), value);
            return this;
        }

        public Buffer pushDataSize(@NativeType("uint32_t") int value) {
            VkIndirectCommandsLayoutPushDataTokenNV.npushDataSize(address(), value);
            return this;
        }
    }
}
