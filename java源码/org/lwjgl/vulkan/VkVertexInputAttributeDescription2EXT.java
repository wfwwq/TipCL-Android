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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputAttributeDescription2EXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputAttributeDescription2EXT.class */
public class VkVertexInputAttributeDescription2EXT extends Struct<VkVertexInputAttributeDescription2EXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int LOCATION;
    public static final int BINDING;
    public static final int FORMAT;
    public static final int OFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LOCATION = layout.offsetof(2);
        BINDING = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
        OFFSET = layout.offsetof(5);
    }

    protected VkVertexInputAttributeDescription2EXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVertexInputAttributeDescription2EXT create(long address, ByteBuffer container) {
        return new VkVertexInputAttributeDescription2EXT(address, container);
    }

    public VkVertexInputAttributeDescription2EXT(ByteBuffer container) {
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
    public int location() {
        return nlocation(address());
    }

    @NativeType("uint32_t")
    public int binding() {
        return nbinding(address());
    }

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("uint32_t")
    public int offset() {
        return noffset(address());
    }

    public VkVertexInputAttributeDescription2EXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVertexInputAttributeDescription2EXT sType$Default() {
        return sType(1000352002);
    }

    public VkVertexInputAttributeDescription2EXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVertexInputAttributeDescription2EXT location(@NativeType("uint32_t") int value) {
        nlocation(address(), value);
        return this;
    }

    public VkVertexInputAttributeDescription2EXT binding(@NativeType("uint32_t") int value) {
        nbinding(address(), value);
        return this;
    }

    public VkVertexInputAttributeDescription2EXT format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkVertexInputAttributeDescription2EXT offset(@NativeType("uint32_t") int value) {
        noffset(address(), value);
        return this;
    }

    public VkVertexInputAttributeDescription2EXT set(int sType, long pNext, int location, int binding, int format, int offset) {
        sType(sType);
        pNext(pNext);
        location(location);
        binding(binding);
        format(format);
        offset(offset);
        return this;
    }

    public VkVertexInputAttributeDescription2EXT set(VkVertexInputAttributeDescription2EXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVertexInputAttributeDescription2EXT malloc() {
        return new VkVertexInputAttributeDescription2EXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVertexInputAttributeDescription2EXT calloc() {
        return new VkVertexInputAttributeDescription2EXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVertexInputAttributeDescription2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVertexInputAttributeDescription2EXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVertexInputAttributeDescription2EXT create(long address) {
        return new VkVertexInputAttributeDescription2EXT(address, null);
    }

    public static VkVertexInputAttributeDescription2EXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVertexInputAttributeDescription2EXT(address, null);
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

    public static VkVertexInputAttributeDescription2EXT malloc(MemoryStack stack) {
        return new VkVertexInputAttributeDescription2EXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVertexInputAttributeDescription2EXT calloc(MemoryStack stack) {
        return new VkVertexInputAttributeDescription2EXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nlocation(long struct) {
        return MemoryUtil.memGetInt(struct + LOCATION);
    }

    public static int nbinding(long struct) {
        return MemoryUtil.memGetInt(struct + BINDING);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
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

    public static void nlocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOCATION, value);
    }

    public static void nbinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDING, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputAttributeDescription2EXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputAttributeDescription2EXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVertexInputAttributeDescription2EXT, Buffer> implements NativeResource {
        private static final VkVertexInputAttributeDescription2EXT ELEMENT_FACTORY = VkVertexInputAttributeDescription2EXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVertexInputAttributeDescription2EXT.SIZEOF);
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
        public VkVertexInputAttributeDescription2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVertexInputAttributeDescription2EXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVertexInputAttributeDescription2EXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int location() {
            return VkVertexInputAttributeDescription2EXT.nlocation(address());
        }

        @NativeType("uint32_t")
        public int binding() {
            return VkVertexInputAttributeDescription2EXT.nbinding(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkVertexInputAttributeDescription2EXT.nformat(address());
        }

        @NativeType("uint32_t")
        public int offset() {
            return VkVertexInputAttributeDescription2EXT.noffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVertexInputAttributeDescription2EXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000352002);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVertexInputAttributeDescription2EXT.npNext(address(), value);
            return this;
        }

        public Buffer location(@NativeType("uint32_t") int value) {
            VkVertexInputAttributeDescription2EXT.nlocation(address(), value);
            return this;
        }

        public Buffer binding(@NativeType("uint32_t") int value) {
            VkVertexInputAttributeDescription2EXT.nbinding(address(), value);
            return this;
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkVertexInputAttributeDescription2EXT.nformat(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("uint32_t") int value) {
            VkVertexInputAttributeDescription2EXT.noffset(address(), value);
            return this;
        }
    }
}
