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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDependency.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDependency.class */
public class VkSubpassDependency extends Struct<VkSubpassDependency> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SRCSUBPASS;
    public static final int DSTSUBPASS;
    public static final int SRCSTAGEMASK;
    public static final int DSTSTAGEMASK;
    public static final int SRCACCESSMASK;
    public static final int DSTACCESSMASK;
    public static final int DEPENDENCYFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SRCSUBPASS = layout.offsetof(0);
        DSTSUBPASS = layout.offsetof(1);
        SRCSTAGEMASK = layout.offsetof(2);
        DSTSTAGEMASK = layout.offsetof(3);
        SRCACCESSMASK = layout.offsetof(4);
        DSTACCESSMASK = layout.offsetof(5);
        DEPENDENCYFLAGS = layout.offsetof(6);
    }

    protected VkSubpassDependency(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubpassDependency create(long address, ByteBuffer container) {
        return new VkSubpassDependency(address, container);
    }

    public VkSubpassDependency(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
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

    public VkSubpassDependency srcSubpass(@NativeType("uint32_t") int value) {
        nsrcSubpass(address(), value);
        return this;
    }

    public VkSubpassDependency dstSubpass(@NativeType("uint32_t") int value) {
        ndstSubpass(address(), value);
        return this;
    }

    public VkSubpassDependency srcStageMask(@NativeType("VkPipelineStageFlags") int value) {
        nsrcStageMask(address(), value);
        return this;
    }

    public VkSubpassDependency dstStageMask(@NativeType("VkPipelineStageFlags") int value) {
        ndstStageMask(address(), value);
        return this;
    }

    public VkSubpassDependency srcAccessMask(@NativeType("VkAccessFlags") int value) {
        nsrcAccessMask(address(), value);
        return this;
    }

    public VkSubpassDependency dstAccessMask(@NativeType("VkAccessFlags") int value) {
        ndstAccessMask(address(), value);
        return this;
    }

    public VkSubpassDependency dependencyFlags(@NativeType("VkDependencyFlags") int value) {
        ndependencyFlags(address(), value);
        return this;
    }

    public VkSubpassDependency set(int srcSubpass, int dstSubpass, int srcStageMask, int dstStageMask, int srcAccessMask, int dstAccessMask, int dependencyFlags) {
        srcSubpass(srcSubpass);
        dstSubpass(dstSubpass);
        srcStageMask(srcStageMask);
        dstStageMask(dstStageMask);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        dependencyFlags(dependencyFlags);
        return this;
    }

    public VkSubpassDependency set(VkSubpassDependency src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassDependency malloc() {
        return new VkSubpassDependency(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassDependency calloc() {
        return new VkSubpassDependency(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassDependency create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDependency(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassDependency create(long address) {
        return new VkSubpassDependency(address, null);
    }

    public static VkSubpassDependency createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassDependency(address, null);
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

    public static VkSubpassDependency malloc(MemoryStack stack) {
        return new VkSubpassDependency(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassDependency calloc(MemoryStack stack) {
        return new VkSubpassDependency(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDependency$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDependency$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubpassDependency, Buffer> implements NativeResource {
        private static final VkSubpassDependency ELEMENT_FACTORY = VkSubpassDependency.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubpassDependency.SIZEOF);
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
        public VkSubpassDependency getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int srcSubpass() {
            return VkSubpassDependency.nsrcSubpass(address());
        }

        @NativeType("uint32_t")
        public int dstSubpass() {
            return VkSubpassDependency.ndstSubpass(address());
        }

        @NativeType("VkPipelineStageFlags")
        public int srcStageMask() {
            return VkSubpassDependency.nsrcStageMask(address());
        }

        @NativeType("VkPipelineStageFlags")
        public int dstStageMask() {
            return VkSubpassDependency.ndstStageMask(address());
        }

        @NativeType("VkAccessFlags")
        public int srcAccessMask() {
            return VkSubpassDependency.nsrcAccessMask(address());
        }

        @NativeType("VkAccessFlags")
        public int dstAccessMask() {
            return VkSubpassDependency.ndstAccessMask(address());
        }

        @NativeType("VkDependencyFlags")
        public int dependencyFlags() {
            return VkSubpassDependency.ndependencyFlags(address());
        }

        public Buffer srcSubpass(@NativeType("uint32_t") int value) {
            VkSubpassDependency.nsrcSubpass(address(), value);
            return this;
        }

        public Buffer dstSubpass(@NativeType("uint32_t") int value) {
            VkSubpassDependency.ndstSubpass(address(), value);
            return this;
        }

        public Buffer srcStageMask(@NativeType("VkPipelineStageFlags") int value) {
            VkSubpassDependency.nsrcStageMask(address(), value);
            return this;
        }

        public Buffer dstStageMask(@NativeType("VkPipelineStageFlags") int value) {
            VkSubpassDependency.ndstStageMask(address(), value);
            return this;
        }

        public Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) {
            VkSubpassDependency.nsrcAccessMask(address(), value);
            return this;
        }

        public Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) {
            VkSubpassDependency.ndstAccessMask(address(), value);
            return this;
        }

        public Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) {
            VkSubpassDependency.ndependencyFlags(address(), value);
            return this;
        }
    }
}
