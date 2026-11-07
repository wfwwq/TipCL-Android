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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryBarrier2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryBarrier2.class */
public class VkMemoryBarrier2 extends Struct<VkMemoryBarrier2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCSTAGEMASK;
    public static final int SRCACCESSMASK;
    public static final int DSTSTAGEMASK;
    public static final int DSTACCESSMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSTAGEMASK = layout.offsetof(2);
        SRCACCESSMASK = layout.offsetof(3);
        DSTSTAGEMASK = layout.offsetof(4);
        DSTACCESSMASK = layout.offsetof(5);
    }

    protected VkMemoryBarrier2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryBarrier2 create(long address, ByteBuffer container) {
        return new VkMemoryBarrier2(address, container);
    }

    public VkMemoryBarrier2(ByteBuffer container) {
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

    @NativeType("VkPipelineStageFlags2")
    public long srcStageMask() {
        return nsrcStageMask(address());
    }

    @NativeType("VkAccessFlags2")
    public long srcAccessMask() {
        return nsrcAccessMask(address());
    }

    @NativeType("VkPipelineStageFlags2")
    public long dstStageMask() {
        return ndstStageMask(address());
    }

    @NativeType("VkAccessFlags2")
    public long dstAccessMask() {
        return ndstAccessMask(address());
    }

    public VkMemoryBarrier2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryBarrier2 sType$Default() {
        return sType(1000314000);
    }

    public VkMemoryBarrier2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryBarrier2 srcStageMask(@NativeType("VkPipelineStageFlags2") long value) {
        nsrcStageMask(address(), value);
        return this;
    }

    public VkMemoryBarrier2 srcAccessMask(@NativeType("VkAccessFlags2") long value) {
        nsrcAccessMask(address(), value);
        return this;
    }

    public VkMemoryBarrier2 dstStageMask(@NativeType("VkPipelineStageFlags2") long value) {
        ndstStageMask(address(), value);
        return this;
    }

    public VkMemoryBarrier2 dstAccessMask(@NativeType("VkAccessFlags2") long value) {
        ndstAccessMask(address(), value);
        return this;
    }

    public VkMemoryBarrier2 set(int sType, long pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        return this;
    }

    public VkMemoryBarrier2 set(VkMemoryBarrier2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryBarrier2 malloc() {
        return new VkMemoryBarrier2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryBarrier2 calloc() {
        return new VkMemoryBarrier2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryBarrier2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryBarrier2(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryBarrier2 create(long address) {
        return new VkMemoryBarrier2(address, null);
    }

    public static VkMemoryBarrier2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryBarrier2(address, null);
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

    public static VkMemoryBarrier2 malloc(MemoryStack stack) {
        return new VkMemoryBarrier2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryBarrier2 calloc(MemoryStack stack) {
        return new VkMemoryBarrier2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsrcStageMask(long struct) {
        return MemoryUtil.memGetLong(struct + SRCSTAGEMASK);
    }

    public static long nsrcAccessMask(long struct) {
        return MemoryUtil.memGetLong(struct + SRCACCESSMASK);
    }

    public static long ndstStageMask(long struct) {
        return MemoryUtil.memGetLong(struct + DSTSTAGEMASK);
    }

    public static long ndstAccessMask(long struct) {
        return MemoryUtil.memGetLong(struct + DSTACCESSMASK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrcStageMask(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCSTAGEMASK, value);
    }

    public static void nsrcAccessMask(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCACCESSMASK, value);
    }

    public static void ndstStageMask(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTSTAGEMASK, value);
    }

    public static void ndstAccessMask(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTACCESSMASK, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryBarrier2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryBarrier2$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryBarrier2, Buffer> implements NativeResource {
        private static final VkMemoryBarrier2 ELEMENT_FACTORY = VkMemoryBarrier2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryBarrier2.SIZEOF);
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
        public VkMemoryBarrier2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryBarrier2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMemoryBarrier2.npNext(address());
        }

        @NativeType("VkPipelineStageFlags2")
        public long srcStageMask() {
            return VkMemoryBarrier2.nsrcStageMask(address());
        }

        @NativeType("VkAccessFlags2")
        public long srcAccessMask() {
            return VkMemoryBarrier2.nsrcAccessMask(address());
        }

        @NativeType("VkPipelineStageFlags2")
        public long dstStageMask() {
            return VkMemoryBarrier2.ndstStageMask(address());
        }

        @NativeType("VkAccessFlags2")
        public long dstAccessMask() {
            return VkMemoryBarrier2.ndstAccessMask(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryBarrier2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000314000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryBarrier2.npNext(address(), value);
            return this;
        }

        public Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkMemoryBarrier2.nsrcStageMask(address(), value);
            return this;
        }

        public Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) {
            VkMemoryBarrier2.nsrcAccessMask(address(), value);
            return this;
        }

        public Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkMemoryBarrier2.ndstStageMask(address(), value);
            return this;
        }

        public Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) {
            VkMemoryBarrier2.ndstAccessMask(address(), value);
            return this;
        }
    }
}
