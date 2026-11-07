package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBeginCustomResolveInfoEXT.class */
public class VkBeginCustomResolveInfoEXT extends Struct<VkBeginCustomResolveInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
    }

    protected VkBeginCustomResolveInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBeginCustomResolveInfoEXT create(long address, ByteBuffer container) {
        return new VkBeginCustomResolveInfoEXT(address, container);
    }

    public VkBeginCustomResolveInfoEXT(ByteBuffer container) {
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

    public VkBeginCustomResolveInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBeginCustomResolveInfoEXT sType$Default() {
        return sType(EXTCustomResolve.VK_STRUCTURE_TYPE_BEGIN_CUSTOM_RESOLVE_INFO_EXT);
    }

    public VkBeginCustomResolveInfoEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBeginCustomResolveInfoEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkBeginCustomResolveInfoEXT set(VkBeginCustomResolveInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBeginCustomResolveInfoEXT malloc() {
        return new VkBeginCustomResolveInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBeginCustomResolveInfoEXT calloc() {
        return new VkBeginCustomResolveInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBeginCustomResolveInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBeginCustomResolveInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkBeginCustomResolveInfoEXT create(long address) {
        return new VkBeginCustomResolveInfoEXT(address, null);
    }

    public static VkBeginCustomResolveInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBeginCustomResolveInfoEXT(address, null);
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

    public static VkBeginCustomResolveInfoEXT malloc(MemoryStack stack) {
        return new VkBeginCustomResolveInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBeginCustomResolveInfoEXT calloc(MemoryStack stack) {
        return new VkBeginCustomResolveInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBeginCustomResolveInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkBeginCustomResolveInfoEXT, Buffer> implements NativeResource {
        private static final VkBeginCustomResolveInfoEXT ELEMENT_FACTORY = VkBeginCustomResolveInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBeginCustomResolveInfoEXT.SIZEOF);
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
        public VkBeginCustomResolveInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBeginCustomResolveInfoEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkBeginCustomResolveInfoEXT.npNext(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBeginCustomResolveInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTCustomResolve.VK_STRUCTURE_TYPE_BEGIN_CUSTOM_RESOLVE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkBeginCustomResolveInfoEXT.npNext(address(), value);
            return this;
        }
    }
}
