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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapTriangleEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapTriangleEXT.class */
public class VkMicromapTriangleEXT extends Struct<VkMicromapTriangleEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DATAOFFSET;
    public static final int SUBDIVISIONLEVEL;
    public static final int FORMAT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DATAOFFSET = layout.offsetof(0);
        SUBDIVISIONLEVEL = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
    }

    protected VkMicromapTriangleEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMicromapTriangleEXT create(long address, ByteBuffer container) {
        return new VkMicromapTriangleEXT(address, container);
    }

    public VkMicromapTriangleEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int dataOffset() {
        return ndataOffset(address());
    }

    @NativeType("uint16_t")
    public short subdivisionLevel() {
        return nsubdivisionLevel(address());
    }

    @NativeType("uint16_t")
    public short format() {
        return nformat(address());
    }

    public VkMicromapTriangleEXT dataOffset(@NativeType("uint32_t") int value) {
        ndataOffset(address(), value);
        return this;
    }

    public VkMicromapTriangleEXT subdivisionLevel(@NativeType("uint16_t") short value) {
        nsubdivisionLevel(address(), value);
        return this;
    }

    public VkMicromapTriangleEXT format(@NativeType("uint16_t") short value) {
        nformat(address(), value);
        return this;
    }

    public VkMicromapTriangleEXT set(int dataOffset, short subdivisionLevel, short format) {
        dataOffset(dataOffset);
        subdivisionLevel(subdivisionLevel);
        format(format);
        return this;
    }

    public VkMicromapTriangleEXT set(VkMicromapTriangleEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMicromapTriangleEXT malloc() {
        return new VkMicromapTriangleEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMicromapTriangleEXT calloc() {
        return new VkMicromapTriangleEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMicromapTriangleEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapTriangleEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMicromapTriangleEXT create(long address) {
        return new VkMicromapTriangleEXT(address, null);
    }

    public static VkMicromapTriangleEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMicromapTriangleEXT(address, null);
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

    public static VkMicromapTriangleEXT malloc(MemoryStack stack) {
        return new VkMicromapTriangleEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMicromapTriangleEXT calloc(MemoryStack stack) {
        return new VkMicromapTriangleEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ndataOffset(long struct) {
        return MemoryUtil.memGetInt(struct + DATAOFFSET);
    }

    public static short nsubdivisionLevel(long struct) {
        return MemoryUtil.memGetShort(struct + SUBDIVISIONLEVEL);
    }

    public static short nformat(long struct) {
        return MemoryUtil.memGetShort(struct + FORMAT);
    }

    public static void ndataOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + DATAOFFSET, value);
    }

    public static void nsubdivisionLevel(long struct, short value) {
        MemoryUtil.memPutShort(struct + SUBDIVISIONLEVEL, value);
    }

    public static void nformat(long struct, short value) {
        MemoryUtil.memPutShort(struct + FORMAT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapTriangleEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapTriangleEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMicromapTriangleEXT, Buffer> implements NativeResource {
        private static final VkMicromapTriangleEXT ELEMENT_FACTORY = VkMicromapTriangleEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMicromapTriangleEXT.SIZEOF);
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
        public VkMicromapTriangleEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int dataOffset() {
            return VkMicromapTriangleEXT.ndataOffset(address());
        }

        @NativeType("uint16_t")
        public short subdivisionLevel() {
            return VkMicromapTriangleEXT.nsubdivisionLevel(address());
        }

        @NativeType("uint16_t")
        public short format() {
            return VkMicromapTriangleEXT.nformat(address());
        }

        public Buffer dataOffset(@NativeType("uint32_t") int value) {
            VkMicromapTriangleEXT.ndataOffset(address(), value);
            return this;
        }

        public Buffer subdivisionLevel(@NativeType("uint16_t") short value) {
            VkMicromapTriangleEXT.nsubdivisionLevel(address(), value);
            return this;
        }

        public Buffer format(@NativeType("uint16_t") short value) {
            VkMicromapTriangleEXT.nformat(address(), value);
            return this;
        }
    }
}
