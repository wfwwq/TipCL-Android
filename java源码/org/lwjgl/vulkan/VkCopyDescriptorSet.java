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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyDescriptorSet.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyDescriptorSet.class */
public class VkCopyDescriptorSet extends Struct<VkCopyDescriptorSet> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCSET;
    public static final int SRCBINDING;
    public static final int SRCARRAYELEMENT;
    public static final int DSTSET;
    public static final int DSTBINDING;
    public static final int DSTARRAYELEMENT;
    public static final int DESCRIPTORCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4), __member(8), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSET = layout.offsetof(2);
        SRCBINDING = layout.offsetof(3);
        SRCARRAYELEMENT = layout.offsetof(4);
        DSTSET = layout.offsetof(5);
        DSTBINDING = layout.offsetof(6);
        DSTARRAYELEMENT = layout.offsetof(7);
        DESCRIPTORCOUNT = layout.offsetof(8);
    }

    protected VkCopyDescriptorSet(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyDescriptorSet create(long address, ByteBuffer container) {
        return new VkCopyDescriptorSet(address, container);
    }

    public VkCopyDescriptorSet(ByteBuffer container) {
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

    @NativeType("VkDescriptorSet")
    public long srcSet() {
        return nsrcSet(address());
    }

    @NativeType("uint32_t")
    public int srcBinding() {
        return nsrcBinding(address());
    }

    @NativeType("uint32_t")
    public int srcArrayElement() {
        return nsrcArrayElement(address());
    }

    @NativeType("VkDescriptorSet")
    public long dstSet() {
        return ndstSet(address());
    }

    @NativeType("uint32_t")
    public int dstBinding() {
        return ndstBinding(address());
    }

    @NativeType("uint32_t")
    public int dstArrayElement() {
        return ndstArrayElement(address());
    }

    @NativeType("uint32_t")
    public int descriptorCount() {
        return ndescriptorCount(address());
    }

    public VkCopyDescriptorSet sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCopyDescriptorSet sType$Default() {
        return sType(36);
    }

    public VkCopyDescriptorSet pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCopyDescriptorSet srcSet(@NativeType("VkDescriptorSet") long value) {
        nsrcSet(address(), value);
        return this;
    }

    public VkCopyDescriptorSet srcBinding(@NativeType("uint32_t") int value) {
        nsrcBinding(address(), value);
        return this;
    }

    public VkCopyDescriptorSet srcArrayElement(@NativeType("uint32_t") int value) {
        nsrcArrayElement(address(), value);
        return this;
    }

    public VkCopyDescriptorSet dstSet(@NativeType("VkDescriptorSet") long value) {
        ndstSet(address(), value);
        return this;
    }

    public VkCopyDescriptorSet dstBinding(@NativeType("uint32_t") int value) {
        ndstBinding(address(), value);
        return this;
    }

    public VkCopyDescriptorSet dstArrayElement(@NativeType("uint32_t") int value) {
        ndstArrayElement(address(), value);
        return this;
    }

    public VkCopyDescriptorSet descriptorCount(@NativeType("uint32_t") int value) {
        ndescriptorCount(address(), value);
        return this;
    }

    public VkCopyDescriptorSet set(int sType, long pNext, long srcSet, int srcBinding, int srcArrayElement, long dstSet, int dstBinding, int dstArrayElement, int descriptorCount) {
        sType(sType);
        pNext(pNext);
        srcSet(srcSet);
        srcBinding(srcBinding);
        srcArrayElement(srcArrayElement);
        dstSet(dstSet);
        dstBinding(dstBinding);
        dstArrayElement(dstArrayElement);
        descriptorCount(descriptorCount);
        return this;
    }

    public VkCopyDescriptorSet set(VkCopyDescriptorSet src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyDescriptorSet malloc() {
        return new VkCopyDescriptorSet(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyDescriptorSet calloc() {
        return new VkCopyDescriptorSet(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyDescriptorSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyDescriptorSet(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyDescriptorSet create(long address) {
        return new VkCopyDescriptorSet(address, null);
    }

    public static VkCopyDescriptorSet createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyDescriptorSet(address, null);
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

    public static VkCopyDescriptorSet malloc(MemoryStack stack) {
        return new VkCopyDescriptorSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyDescriptorSet calloc(MemoryStack stack) {
        return new VkCopyDescriptorSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsrcSet(long struct) {
        return MemoryUtil.memGetLong(struct + SRCSET);
    }

    public static int nsrcBinding(long struct) {
        return MemoryUtil.memGetInt(struct + SRCBINDING);
    }

    public static int nsrcArrayElement(long struct) {
        return MemoryUtil.memGetInt(struct + SRCARRAYELEMENT);
    }

    public static long ndstSet(long struct) {
        return MemoryUtil.memGetLong(struct + DSTSET);
    }

    public static int ndstBinding(long struct) {
        return MemoryUtil.memGetInt(struct + DSTBINDING);
    }

    public static int ndstArrayElement(long struct) {
        return MemoryUtil.memGetInt(struct + DSTARRAYELEMENT);
    }

    public static int ndescriptorCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrcSet(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCSET, value);
    }

    public static void nsrcBinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCBINDING, value);
    }

    public static void nsrcArrayElement(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCARRAYELEMENT, value);
    }

    public static void ndstSet(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTSET, value);
    }

    public static void ndstBinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTBINDING, value);
    }

    public static void ndstArrayElement(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTARRAYELEMENT, value);
    }

    public static void ndescriptorCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORCOUNT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyDescriptorSet$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyDescriptorSet$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyDescriptorSet, Buffer> implements NativeResource {
        private static final VkCopyDescriptorSet ELEMENT_FACTORY = VkCopyDescriptorSet.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyDescriptorSet.SIZEOF);
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
        public VkCopyDescriptorSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCopyDescriptorSet.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCopyDescriptorSet.npNext(address());
        }

        @NativeType("VkDescriptorSet")
        public long srcSet() {
            return VkCopyDescriptorSet.nsrcSet(address());
        }

        @NativeType("uint32_t")
        public int srcBinding() {
            return VkCopyDescriptorSet.nsrcBinding(address());
        }

        @NativeType("uint32_t")
        public int srcArrayElement() {
            return VkCopyDescriptorSet.nsrcArrayElement(address());
        }

        @NativeType("VkDescriptorSet")
        public long dstSet() {
            return VkCopyDescriptorSet.ndstSet(address());
        }

        @NativeType("uint32_t")
        public int dstBinding() {
            return VkCopyDescriptorSet.ndstBinding(address());
        }

        @NativeType("uint32_t")
        public int dstArrayElement() {
            return VkCopyDescriptorSet.ndstArrayElement(address());
        }

        @NativeType("uint32_t")
        public int descriptorCount() {
            return VkCopyDescriptorSet.ndescriptorCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyDescriptorSet.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(36);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyDescriptorSet.npNext(address(), value);
            return this;
        }

        public Buffer srcSet(@NativeType("VkDescriptorSet") long value) {
            VkCopyDescriptorSet.nsrcSet(address(), value);
            return this;
        }

        public Buffer srcBinding(@NativeType("uint32_t") int value) {
            VkCopyDescriptorSet.nsrcBinding(address(), value);
            return this;
        }

        public Buffer srcArrayElement(@NativeType("uint32_t") int value) {
            VkCopyDescriptorSet.nsrcArrayElement(address(), value);
            return this;
        }

        public Buffer dstSet(@NativeType("VkDescriptorSet") long value) {
            VkCopyDescriptorSet.ndstSet(address(), value);
            return this;
        }

        public Buffer dstBinding(@NativeType("uint32_t") int value) {
            VkCopyDescriptorSet.ndstBinding(address(), value);
            return this;
        }

        public Buffer dstArrayElement(@NativeType("uint32_t") int value) {
            VkCopyDescriptorSet.ndstArrayElement(address(), value);
            return this;
        }

        public Buffer descriptorCount(@NativeType("uint32_t") int value) {
            VkCopyDescriptorSet.ndescriptorCount(address(), value);
            return this;
        }
    }
}
