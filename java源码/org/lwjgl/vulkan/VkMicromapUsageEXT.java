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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapUsageEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapUsageEXT.class */
public class VkMicromapUsageEXT extends Struct<VkMicromapUsageEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COUNT;
    public static final int SUBDIVISIONLEVEL;
    public static final int FORMAT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COUNT = layout.offsetof(0);
        SUBDIVISIONLEVEL = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
    }

    protected VkMicromapUsageEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMicromapUsageEXT create(long address, ByteBuffer container) {
        return new VkMicromapUsageEXT(address, container);
    }

    public VkMicromapUsageEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int count() {
        return ncount(address());
    }

    @NativeType("uint32_t")
    public int subdivisionLevel() {
        return nsubdivisionLevel(address());
    }

    @NativeType("uint32_t")
    public int format() {
        return nformat(address());
    }

    public VkMicromapUsageEXT count(@NativeType("uint32_t") int value) {
        ncount(address(), value);
        return this;
    }

    public VkMicromapUsageEXT subdivisionLevel(@NativeType("uint32_t") int value) {
        nsubdivisionLevel(address(), value);
        return this;
    }

    public VkMicromapUsageEXT format(@NativeType("uint32_t") int value) {
        nformat(address(), value);
        return this;
    }

    public VkMicromapUsageEXT set(int count, int subdivisionLevel, int format) {
        count(count);
        subdivisionLevel(subdivisionLevel);
        format(format);
        return this;
    }

    public VkMicromapUsageEXT set(VkMicromapUsageEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMicromapUsageEXT malloc() {
        return new VkMicromapUsageEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMicromapUsageEXT calloc() {
        return new VkMicromapUsageEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMicromapUsageEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapUsageEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMicromapUsageEXT create(long address) {
        return new VkMicromapUsageEXT(address, null);
    }

    public static VkMicromapUsageEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMicromapUsageEXT(address, null);
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

    public static VkMicromapUsageEXT malloc(MemoryStack stack) {
        return new VkMicromapUsageEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMicromapUsageEXT calloc(MemoryStack stack) {
        return new VkMicromapUsageEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ncount(long struct) {
        return MemoryUtil.memGetInt(struct + COUNT);
    }

    public static int nsubdivisionLevel(long struct) {
        return MemoryUtil.memGetInt(struct + SUBDIVISIONLEVEL);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static void ncount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COUNT, value);
    }

    public static void nsubdivisionLevel(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBDIVISIONLEVEL, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapUsageEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapUsageEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMicromapUsageEXT, Buffer> implements NativeResource {
        private static final VkMicromapUsageEXT ELEMENT_FACTORY = VkMicromapUsageEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMicromapUsageEXT.SIZEOF);
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
        public VkMicromapUsageEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int count() {
            return VkMicromapUsageEXT.ncount(address());
        }

        @NativeType("uint32_t")
        public int subdivisionLevel() {
            return VkMicromapUsageEXT.nsubdivisionLevel(address());
        }

        @NativeType("uint32_t")
        public int format() {
            return VkMicromapUsageEXT.nformat(address());
        }

        public Buffer count(@NativeType("uint32_t") int value) {
            VkMicromapUsageEXT.ncount(address(), value);
            return this;
        }

        public Buffer subdivisionLevel(@NativeType("uint32_t") int value) {
            VkMicromapUsageEXT.nsubdivisionLevel(address(), value);
            return this;
        }

        public Buffer format(@NativeType("uint32_t") int value) {
            VkMicromapUsageEXT.nformat(address(), value);
            return this;
        }
    }
}
