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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBaseOutStructure.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBaseOutStructure.class */
public class VkBaseOutStructure extends Struct<VkBaseOutStructure> implements NativeResource {
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

    protected VkBaseOutStructure(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBaseOutStructure create(long address, ByteBuffer container) {
        return new VkBaseOutStructure(address, container);
    }

    public VkBaseOutStructure(ByteBuffer container) {
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

    @NativeType("VkBaseOutStructure *")
    public VkBaseOutStructure pNext() {
        return npNext(address());
    }

    public VkBaseOutStructure sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBaseOutStructure pNext(@NativeType("VkBaseOutStructure *") VkBaseOutStructure value) {
        npNext(address(), value);
        return this;
    }

    public VkBaseOutStructure set(int sType, VkBaseOutStructure pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkBaseOutStructure set(VkBaseOutStructure src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBaseOutStructure malloc() {
        return new VkBaseOutStructure(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBaseOutStructure calloc() {
        return new VkBaseOutStructure(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBaseOutStructure create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBaseOutStructure(MemoryUtil.memAddress(container), container);
    }

    public static VkBaseOutStructure create(long address) {
        return new VkBaseOutStructure(address, null);
    }

    public static VkBaseOutStructure createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBaseOutStructure(address, null);
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

    public static VkBaseOutStructure malloc(MemoryStack stack) {
        return new VkBaseOutStructure(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBaseOutStructure calloc(MemoryStack stack) {
        return new VkBaseOutStructure(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkBaseOutStructure npNext(long struct) {
        return createSafe(MemoryUtil.memGetAddress(struct + PNEXT));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, VkBaseOutStructure value) {
        MemoryUtil.memPutAddress(struct + PNEXT, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBaseOutStructure$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBaseOutStructure$Buffer.class */
    public static class Buffer extends StructBuffer<VkBaseOutStructure, Buffer> implements NativeResource {
        private static final VkBaseOutStructure ELEMENT_FACTORY = VkBaseOutStructure.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBaseOutStructure.SIZEOF);
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
        public VkBaseOutStructure getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBaseOutStructure.nsType(address());
        }

        @NativeType("VkBaseOutStructure *")
        public VkBaseOutStructure pNext() {
            return VkBaseOutStructure.npNext(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBaseOutStructure.nsType(address(), value);
            return this;
        }

        public Buffer pNext(@NativeType("VkBaseOutStructure *") VkBaseOutStructure value) {
            VkBaseOutStructure.npNext(address(), value);
            return this;
        }
    }
}
