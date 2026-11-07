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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputBindingDescription2EXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputBindingDescription2EXT.class */
public class VkVertexInputBindingDescription2EXT extends Struct<VkVertexInputBindingDescription2EXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BINDING;
    public static final int STRIDE;
    public static final int INPUTRATE;
    public static final int DIVISOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BINDING = layout.offsetof(2);
        STRIDE = layout.offsetof(3);
        INPUTRATE = layout.offsetof(4);
        DIVISOR = layout.offsetof(5);
    }

    protected VkVertexInputBindingDescription2EXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVertexInputBindingDescription2EXT create(long address, ByteBuffer container) {
        return new VkVertexInputBindingDescription2EXT(address, container);
    }

    public VkVertexInputBindingDescription2EXT(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int binding() {
        return nbinding(address());
    }

    @NativeType("uint32_t")
    public int stride() {
        return nstride(address());
    }

    @NativeType("VkVertexInputRate")
    public int inputRate() {
        return ninputRate(address());
    }

    @NativeType("uint32_t")
    public int divisor() {
        return ndivisor(address());
    }

    public VkVertexInputBindingDescription2EXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVertexInputBindingDescription2EXT sType$Default() {
        return sType(1000352001);
    }

    public VkVertexInputBindingDescription2EXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVertexInputBindingDescription2EXT binding(@NativeType("uint32_t") int value) {
        nbinding(address(), value);
        return this;
    }

    public VkVertexInputBindingDescription2EXT stride(@NativeType("uint32_t") int value) {
        nstride(address(), value);
        return this;
    }

    public VkVertexInputBindingDescription2EXT inputRate(@NativeType("VkVertexInputRate") int value) {
        ninputRate(address(), value);
        return this;
    }

    public VkVertexInputBindingDescription2EXT divisor(@NativeType("uint32_t") int value) {
        ndivisor(address(), value);
        return this;
    }

    public VkVertexInputBindingDescription2EXT set(int sType, long pNext, int binding, int stride, int inputRate, int divisor) {
        sType(sType);
        pNext(pNext);
        binding(binding);
        stride(stride);
        inputRate(inputRate);
        divisor(divisor);
        return this;
    }

    public VkVertexInputBindingDescription2EXT set(VkVertexInputBindingDescription2EXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVertexInputBindingDescription2EXT malloc() {
        return new VkVertexInputBindingDescription2EXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVertexInputBindingDescription2EXT calloc() {
        return new VkVertexInputBindingDescription2EXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVertexInputBindingDescription2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVertexInputBindingDescription2EXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVertexInputBindingDescription2EXT create(long address) {
        return new VkVertexInputBindingDescription2EXT(address, null);
    }

    public static VkVertexInputBindingDescription2EXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVertexInputBindingDescription2EXT(address, null);
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

    public static VkVertexInputBindingDescription2EXT malloc(MemoryStack stack) {
        return new VkVertexInputBindingDescription2EXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVertexInputBindingDescription2EXT calloc(MemoryStack stack) {
        return new VkVertexInputBindingDescription2EXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nbinding(long struct) {
        return MemoryUtil.memGetInt(struct + BINDING);
    }

    public static int nstride(long struct) {
        return MemoryUtil.memGetInt(struct + STRIDE);
    }

    public static int ninputRate(long struct) {
        return MemoryUtil.memGetInt(struct + INPUTRATE);
    }

    public static int ndivisor(long struct) {
        return MemoryUtil.memGetInt(struct + DIVISOR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nbinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDING, value);
    }

    public static void nstride(long struct, int value) {
        MemoryUtil.memPutInt(struct + STRIDE, value);
    }

    public static void ninputRate(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUTRATE, value);
    }

    public static void ndivisor(long struct, int value) {
        MemoryUtil.memPutInt(struct + DIVISOR, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputBindingDescription2EXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputBindingDescription2EXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVertexInputBindingDescription2EXT, Buffer> implements NativeResource {
        private static final VkVertexInputBindingDescription2EXT ELEMENT_FACTORY = VkVertexInputBindingDescription2EXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVertexInputBindingDescription2EXT.SIZEOF);
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
        public VkVertexInputBindingDescription2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVertexInputBindingDescription2EXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVertexInputBindingDescription2EXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int binding() {
            return VkVertexInputBindingDescription2EXT.nbinding(address());
        }

        @NativeType("uint32_t")
        public int stride() {
            return VkVertexInputBindingDescription2EXT.nstride(address());
        }

        @NativeType("VkVertexInputRate")
        public int inputRate() {
            return VkVertexInputBindingDescription2EXT.ninputRate(address());
        }

        @NativeType("uint32_t")
        public int divisor() {
            return VkVertexInputBindingDescription2EXT.ndivisor(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVertexInputBindingDescription2EXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000352001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVertexInputBindingDescription2EXT.npNext(address(), value);
            return this;
        }

        public Buffer binding(@NativeType("uint32_t") int value) {
            VkVertexInputBindingDescription2EXT.nbinding(address(), value);
            return this;
        }

        public Buffer stride(@NativeType("uint32_t") int value) {
            VkVertexInputBindingDescription2EXT.nstride(address(), value);
            return this;
        }

        public Buffer inputRate(@NativeType("VkVertexInputRate") int value) {
            VkVertexInputBindingDescription2EXT.ninputRate(address(), value);
            return this;
        }

        public Buffer divisor(@NativeType("uint32_t") int value) {
            VkVertexInputBindingDescription2EXT.ndivisor(address(), value);
            return this;
        }
    }
}
