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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDependency2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDependency2.class */
public class VkSubpassDependency2 extends Struct<VkSubpassDependency2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCSUBPASS;
    public static final int DSTSUBPASS;
    public static final int SRCSTAGEMASK;
    public static final int DSTSTAGEMASK;
    public static final int SRCACCESSMASK;
    public static final int DSTACCESSMASK;
    public static final int DEPENDENCYFLAGS;
    public static final int VIEWOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSUBPASS = layout.offsetof(2);
        DSTSUBPASS = layout.offsetof(3);
        SRCSTAGEMASK = layout.offsetof(4);
        DSTSTAGEMASK = layout.offsetof(5);
        SRCACCESSMASK = layout.offsetof(6);
        DSTACCESSMASK = layout.offsetof(7);
        DEPENDENCYFLAGS = layout.offsetof(8);
        VIEWOFFSET = layout.offsetof(9);
    }

    protected VkSubpassDependency2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubpassDependency2 create(long address, ByteBuffer container) {
        return new VkSubpassDependency2(address, container);
    }

    public VkSubpassDependency2(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int srcSubpass() {
        return nsrcSubpass(address());
    }

    @NativeType("uint32_t")
    public int dstSubpass() {
        return ndstSubpass(address());
    }

    @NativeType("VkPipelineStageFlags")
    public int srcStageMask() {
        return nsrcStageMask(address());
    }

    @NativeType("VkPipelineStageFlags")
    public int dstStageMask() {
        return ndstStageMask(address());
    }

    @NativeType("VkAccessFlags")
    public int srcAccessMask() {
        return nsrcAccessMask(address());
    }

    @NativeType("VkAccessFlags")
    public int dstAccessMask() {
        return ndstAccessMask(address());
    }

    @NativeType("VkDependencyFlags")
    public int dependencyFlags() {
        return ndependencyFlags(address());
    }

    @NativeType("int32_t")
    public int viewOffset() {
        return nviewOffset(address());
    }

    public VkSubpassDependency2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSubpassDependency2 sType$Default() {
        return sType(1000109003);
    }

    public VkSubpassDependency2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSubpassDependency2 pNext(VkMemoryBarrier2 value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubpassDependency2 pNext(VkMemoryBarrier2KHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubpassDependency2 pNext(VkMemoryBarrierAccessFlags3KHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubpassDependency2 srcSubpass(@NativeType("uint32_t") int value) {
        nsrcSubpass(address(), value);
        return this;
    }

    public VkSubpassDependency2 dstSubpass(@NativeType("uint32_t") int value) {
        ndstSubpass(address(), value);
        return this;
    }

    public VkSubpassDependency2 srcStageMask(@NativeType("VkPipelineStageFlags") int value) {
        nsrcStageMask(address(), value);
        return this;
    }

    public VkSubpassDependency2 dstStageMask(@NativeType("VkPipelineStageFlags") int value) {
        ndstStageMask(address(), value);
        return this;
    }

    public VkSubpassDependency2 srcAccessMask(@NativeType("VkAccessFlags") int value) {
        nsrcAccessMask(address(), value);
        return this;
    }

    public VkSubpassDependency2 dstAccessMask(@NativeType("VkAccessFlags") int value) {
        ndstAccessMask(address(), value);
        return this;
    }

    public VkSubpassDependency2 dependencyFlags(@NativeType("VkDependencyFlags") int value) {
        ndependencyFlags(address(), value);
        return this;
    }

    public VkSubpassDependency2 viewOffset(@NativeType("int32_t") int value) {
        nviewOffset(address(), value);
        return this;
    }

    public VkSubpassDependency2 set(int sType, long pNext, int srcSubpass, int dstSubpass, int srcStageMask, int dstStageMask, int srcAccessMask, int dstAccessMask, int dependencyFlags, int viewOffset) {
        sType(sType);
        pNext(pNext);
        srcSubpass(srcSubpass);
        dstSubpass(dstSubpass);
        srcStageMask(srcStageMask);
        dstStageMask(dstStageMask);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        dependencyFlags(dependencyFlags);
        viewOffset(viewOffset);
        return this;
    }

    public VkSubpassDependency2 set(VkSubpassDependency2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassDependency2 malloc() {
        return new VkSubpassDependency2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassDependency2 calloc() {
        return new VkSubpassDependency2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassDependency2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDependency2(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassDependency2 create(long address) {
        return new VkSubpassDependency2(address, null);
    }

    public static VkSubpassDependency2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassDependency2(address, null);
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

    public static VkSubpassDependency2 malloc(MemoryStack stack) {
        return new VkSubpassDependency2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassDependency2 calloc(MemoryStack stack) {
        return new VkSubpassDependency2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsrcSubpass(long struct) {
        return MemoryUtil.memGetInt(struct + SRCSUBPASS);
    }

    public static int ndstSubpass(long struct) {
        return MemoryUtil.memGetInt(struct + DSTSUBPASS);
    }

    public static int nsrcStageMask(long struct) {
        return MemoryUtil.memGetInt(struct + SRCSTAGEMASK);
    }

    public static int ndstStageMask(long struct) {
        return MemoryUtil.memGetInt(struct + DSTSTAGEMASK);
    }

    public static int nsrcAccessMask(long struct) {
        return MemoryUtil.memGetInt(struct + SRCACCESSMASK);
    }

    public static int ndstAccessMask(long struct) {
        return MemoryUtil.memGetInt(struct + DSTACCESSMASK);
    }

    public static int ndependencyFlags(long struct) {
        return MemoryUtil.memGetInt(struct + DEPENDENCYFLAGS);
    }

    public static int nviewOffset(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWOFFSET);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrcSubpass(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCSUBPASS, value);
    }

    public static void ndstSubpass(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTSUBPASS, value);
    }

    public static void nsrcStageMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCSTAGEMASK, value);
    }

    public static void ndstStageMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTSTAGEMASK, value);
    }

    public static void nsrcAccessMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCACCESSMASK, value);
    }

    public static void ndstAccessMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTACCESSMASK, value);
    }

    public static void ndependencyFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPENDENCYFLAGS, value);
    }

    public static void nviewOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWOFFSET, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDependency2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDependency2$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubpassDependency2, Buffer> implements NativeResource {
        private static final VkSubpassDependency2 ELEMENT_FACTORY = VkSubpassDependency2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubpassDependency2.SIZEOF);
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
        public VkSubpassDependency2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSubpassDependency2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSubpassDependency2.npNext(address());
        }

        @NativeType("uint32_t")
        public int srcSubpass() {
            return VkSubpassDependency2.nsrcSubpass(address());
        }

        @NativeType("uint32_t")
        public int dstSubpass() {
            return VkSubpassDependency2.ndstSubpass(address());
        }

        @NativeType("VkPipelineStageFlags")
        public int srcStageMask() {
            return VkSubpassDependency2.nsrcStageMask(address());
        }

        @NativeType("VkPipelineStageFlags")
        public int dstStageMask() {
            return VkSubpassDependency2.ndstStageMask(address());
        }

        @NativeType("VkAccessFlags")
        public int srcAccessMask() {
            return VkSubpassDependency2.nsrcAccessMask(address());
        }

        @NativeType("VkAccessFlags")
        public int dstAccessMask() {
            return VkSubpassDependency2.ndstAccessMask(address());
        }

        @NativeType("VkDependencyFlags")
        public int dependencyFlags() {
            return VkSubpassDependency2.ndependencyFlags(address());
        }

        @NativeType("int32_t")
        public int viewOffset() {
            return VkSubpassDependency2.nviewOffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubpassDependency2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000109003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubpassDependency2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkMemoryBarrier2 value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMemoryBarrier2KHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMemoryBarrierAccessFlags3KHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer srcSubpass(@NativeType("uint32_t") int value) {
            VkSubpassDependency2.nsrcSubpass(address(), value);
            return this;
        }

        public Buffer dstSubpass(@NativeType("uint32_t") int value) {
            VkSubpassDependency2.ndstSubpass(address(), value);
            return this;
        }

        public Buffer srcStageMask(@NativeType("VkPipelineStageFlags") int value) {
            VkSubpassDependency2.nsrcStageMask(address(), value);
            return this;
        }

        public Buffer dstStageMask(@NativeType("VkPipelineStageFlags") int value) {
            VkSubpassDependency2.ndstStageMask(address(), value);
            return this;
        }

        public Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) {
            VkSubpassDependency2.nsrcAccessMask(address(), value);
            return this;
        }

        public Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) {
            VkSubpassDependency2.ndstAccessMask(address(), value);
            return this;
        }

        public Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) {
            VkSubpassDependency2.ndependencyFlags(address(), value);
            return this;
        }

        public Buffer viewOffset(@NativeType("int32_t") int value) {
            VkSubpassDependency2.nviewOffset(address(), value);
            return this;
        }
    }
}
