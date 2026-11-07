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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBaseInStructure.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBaseInStructure.class */
public class VkBaseInStructure extends Struct<VkBaseInStructure> implements NativeResource {
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

    protected VkBaseInStructure(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBaseInStructure create(long address, ByteBuffer container) {
        return new VkBaseInStructure(address, container);
    }

    public VkBaseInStructure(ByteBuffer container) {
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

    @NativeType("VkBaseInStructure const *")
    public VkBaseInStructure pNext() {
        return npNext(address());
    }

    public VkBaseInStructure sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBaseInStructure pNext(@NativeType("VkBaseInStructure const *") VkBaseInStructure value) {
        npNext(address(), value);
        return this;
    }

    public VkBaseInStructure set(int sType, VkBaseInStructure pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkBaseInStructure set(VkBaseInStructure src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBaseInStructure malloc() {
        return new VkBaseInStructure(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBaseInStructure calloc() {
        return new VkBaseInStructure(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBaseInStructure create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBaseInStructure(MemoryUtil.memAddress(container), container);
    }

    public static VkBaseInStructure create(long address) {
        return new VkBaseInStructure(address, null);
    }

    public static VkBaseInStructure createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBaseInStructure(address, null);
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

    public static VkBaseInStructure malloc(MemoryStack stack) {
        return new VkBaseInStructure(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBaseInStructure calloc(MemoryStack stack) {
        return new VkBaseInStructure(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkBaseInStructure npNext(long struct) {
        return createSafe(MemoryUtil.memGetAddress(struct + PNEXT));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, VkBaseInStructure value) {
        MemoryUtil.memPutAddress(struct + PNEXT, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBaseInStructure$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBaseInStructure$Buffer.class */
    public static class Buffer extends StructBuffer<VkBaseInStructure, Buffer> implements NativeResource {
        private static final VkBaseInStructure ELEMENT_FACTORY = VkBaseInStructure.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBaseInStructure.SIZEOF);
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
        public VkBaseInStructure getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBaseInStructure.nsType(address());
        }

        @NativeType("VkBaseInStructure const *")
        public VkBaseInStructure pNext() {
            return VkBaseInStructure.npNext(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBaseInStructure.nsType(address(), value);
            return this;
        }

        public Buffer pNext(@NativeType("VkBaseInStructure const *") VkBaseInStructure value) {
            VkBaseInStructure.npNext(address(), value);
            return this;
        }
    }
}
