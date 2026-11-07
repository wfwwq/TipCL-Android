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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewASTCDecodeModeEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewASTCDecodeModeEXT.class */
public class VkImageViewASTCDecodeModeEXT extends Struct<VkImageViewASTCDecodeModeEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DECODEMODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DECODEMODE = layout.offsetof(2);
    }

    protected VkImageViewASTCDecodeModeEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageViewASTCDecodeModeEXT create(long address, ByteBuffer container) {
        return new VkImageViewASTCDecodeModeEXT(address, container);
    }

    public VkImageViewASTCDecodeModeEXT(ByteBuffer container) {
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

    @NativeType("VkFormat")
    public int decodeMode() {
        return ndecodeMode(address());
    }

    public VkImageViewASTCDecodeModeEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageViewASTCDecodeModeEXT sType$Default() {
        return sType(EXTAstcDecodeMode.VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT);
    }

    public VkImageViewASTCDecodeModeEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageViewASTCDecodeModeEXT decodeMode(@NativeType("VkFormat") int value) {
        ndecodeMode(address(), value);
        return this;
    }

    public VkImageViewASTCDecodeModeEXT set(int sType, long pNext, int decodeMode) {
        sType(sType);
        pNext(pNext);
        decodeMode(decodeMode);
        return this;
    }

    public VkImageViewASTCDecodeModeEXT set(VkImageViewASTCDecodeModeEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageViewASTCDecodeModeEXT malloc() {
        return new VkImageViewASTCDecodeModeEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageViewASTCDecodeModeEXT calloc() {
        return new VkImageViewASTCDecodeModeEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageViewASTCDecodeModeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewASTCDecodeModeEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImageViewASTCDecodeModeEXT create(long address) {
        return new VkImageViewASTCDecodeModeEXT(address, null);
    }

    public static VkImageViewASTCDecodeModeEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageViewASTCDecodeModeEXT(address, null);
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

    public static VkImageViewASTCDecodeModeEXT malloc(MemoryStack stack) {
        return new VkImageViewASTCDecodeModeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageViewASTCDecodeModeEXT calloc(MemoryStack stack) {
        return new VkImageViewASTCDecodeModeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndecodeMode(long struct) {
        return MemoryUtil.memGetInt(struct + DECODEMODE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndecodeMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + DECODEMODE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewASTCDecodeModeEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewASTCDecodeModeEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageViewASTCDecodeModeEXT, Buffer> implements NativeResource {
        private static final VkImageViewASTCDecodeModeEXT ELEMENT_FACTORY = VkImageViewASTCDecodeModeEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageViewASTCDecodeModeEXT.SIZEOF);
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
        public VkImageViewASTCDecodeModeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageViewASTCDecodeModeEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageViewASTCDecodeModeEXT.npNext(address());
        }

        @NativeType("VkFormat")
        public int decodeMode() {
            return VkImageViewASTCDecodeModeEXT.ndecodeMode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageViewASTCDecodeModeEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTAstcDecodeMode.VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageViewASTCDecodeModeEXT.npNext(address(), value);
            return this;
        }

        public Buffer decodeMode(@NativeType("VkFormat") int value) {
            VkImageViewASTCDecodeModeEXT.ndecodeMode(address(), value);
            return this;
        }
    }
}
