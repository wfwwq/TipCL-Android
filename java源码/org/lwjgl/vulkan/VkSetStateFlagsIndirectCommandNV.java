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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSetStateFlagsIndirectCommandNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSetStateFlagsIndirectCommandNV.class */
public class VkSetStateFlagsIndirectCommandNV extends Struct<VkSetStateFlagsIndirectCommandNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DATA = layout.offsetof(0);
    }

    protected VkSetStateFlagsIndirectCommandNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSetStateFlagsIndirectCommandNV create(long address, ByteBuffer container) {
        return new VkSetStateFlagsIndirectCommandNV(address, container);
    }

    public VkSetStateFlagsIndirectCommandNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int data() {
        return ndata(address());
    }

    public VkSetStateFlagsIndirectCommandNV data(@NativeType("uint32_t") int value) {
        ndata(address(), value);
        return this;
    }

    public VkSetStateFlagsIndirectCommandNV set(VkSetStateFlagsIndirectCommandNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSetStateFlagsIndirectCommandNV malloc() {
        return new VkSetStateFlagsIndirectCommandNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSetStateFlagsIndirectCommandNV calloc() {
        return new VkSetStateFlagsIndirectCommandNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSetStateFlagsIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSetStateFlagsIndirectCommandNV(MemoryUtil.memAddress(container), container);
    }

    public static VkSetStateFlagsIndirectCommandNV create(long address) {
        return new VkSetStateFlagsIndirectCommandNV(address, null);
    }

    public static VkSetStateFlagsIndirectCommandNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSetStateFlagsIndirectCommandNV(address, null);
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

    public static VkSetStateFlagsIndirectCommandNV malloc(MemoryStack stack) {
        return new VkSetStateFlagsIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSetStateFlagsIndirectCommandNV calloc(MemoryStack stack) {
        return new VkSetStateFlagsIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ndata(long struct) {
        return MemoryUtil.memGetInt(struct + DATA);
    }

    public static void ndata(long struct, int value) {
        MemoryUtil.memPutInt(struct + DATA, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSetStateFlagsIndirectCommandNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSetStateFlagsIndirectCommandNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkSetStateFlagsIndirectCommandNV, Buffer> implements NativeResource {
        private static final VkSetStateFlagsIndirectCommandNV ELEMENT_FACTORY = VkSetStateFlagsIndirectCommandNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSetStateFlagsIndirectCommandNV.SIZEOF);
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
        public VkSetStateFlagsIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int data() {
            return VkSetStateFlagsIndirectCommandNV.ndata(address());
        }

        public Buffer data(@NativeType("uint32_t") int value) {
            VkSetStateFlagsIndirectCommandNV.ndata(address(), value);
            return this;
        }
    }
}
