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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceViewportScissorInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceViewportScissorInfoNV.class */
public class VkCommandBufferInheritanceViewportScissorInfoNV extends Struct<VkCommandBufferInheritanceViewportScissorInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIEWPORTSCISSOR2D;
    public static final int VIEWPORTDEPTHCOUNT;
    public static final int PVIEWPORTDEPTHS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIEWPORTSCISSOR2D = layout.offsetof(2);
        VIEWPORTDEPTHCOUNT = layout.offsetof(3);
        PVIEWPORTDEPTHS = layout.offsetof(4);
    }

    protected VkCommandBufferInheritanceViewportScissorInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCommandBufferInheritanceViewportScissorInfoNV create(long address, ByteBuffer container) {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(address, container);
    }

    public VkCommandBufferInheritanceViewportScissorInfoNV(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean viewportScissor2D() {
        return nviewportScissor2D(address()) != 0;
    }

    @NativeType("uint32_t")
    public int viewportDepthCount() {
        return nviewportDepthCount(address());
    }

    @NativeType("VkViewport const *")
    public VkViewport pViewportDepths() {
        return npViewportDepths(address());
    }

    public VkCommandBufferInheritanceViewportScissorInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceViewportScissorInfoNV sType$Default() {
        return sType(NVInheritedViewportScissor.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV);
    }

    public VkCommandBufferInheritanceViewportScissorInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceViewportScissorInfoNV viewportScissor2D(@NativeType("VkBool32") boolean value) {
        nviewportScissor2D(address(), value ? 1 : 0);
        return this;
    }

    public VkCommandBufferInheritanceViewportScissorInfoNV viewportDepthCount(@NativeType("uint32_t") int value) {
        nviewportDepthCount(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceViewportScissorInfoNV pViewportDepths(@NativeType("VkViewport const *") VkViewport value) {
        npViewportDepths(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceViewportScissorInfoNV set(int sType, long pNext, boolean viewportScissor2D, int viewportDepthCount, VkViewport pViewportDepths) {
        sType(sType);
        pNext(pNext);
        viewportScissor2D(viewportScissor2D);
        viewportDepthCount(viewportDepthCount);
        pViewportDepths(pViewportDepths);
        return this;
    }

    public VkCommandBufferInheritanceViewportScissorInfoNV set(VkCommandBufferInheritanceViewportScissorInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV malloc() {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV calloc() {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceViewportScissorInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV create(long address) {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(address, null);
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCommandBufferInheritanceViewportScissorInfoNV(address, null);
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

    public static VkCommandBufferInheritanceViewportScissorInfoNV malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nviewportScissor2D(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWPORTSCISSOR2D);
    }

    public static int nviewportDepthCount(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWPORTDEPTHCOUNT);
    }

    public static VkViewport npViewportDepths(long struct) {
        return VkViewport.createSafe(MemoryUtil.memGetAddress(struct + PVIEWPORTDEPTHS));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nviewportScissor2D(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWPORTSCISSOR2D, value);
    }

    public static void nviewportDepthCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWPORTDEPTHCOUNT, value);
    }

    public static void npViewportDepths(long struct, VkViewport value) {
        MemoryUtil.memPutAddress(struct + PVIEWPORTDEPTHS, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceViewportScissorInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceViewportScissorInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceViewportScissorInfoNV, Buffer> implements NativeResource {
        private static final VkCommandBufferInheritanceViewportScissorInfoNV ELEMENT_FACTORY = VkCommandBufferInheritanceViewportScissorInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCommandBufferInheritanceViewportScissorInfoNV.SIZEOF);
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
        public VkCommandBufferInheritanceViewportScissorInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCommandBufferInheritanceViewportScissorInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCommandBufferInheritanceViewportScissorInfoNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean viewportScissor2D() {
            return VkCommandBufferInheritanceViewportScissorInfoNV.nviewportScissor2D(address()) != 0;
        }

        @NativeType("uint32_t")
        public int viewportDepthCount() {
            return VkCommandBufferInheritanceViewportScissorInfoNV.nviewportDepthCount(address());
        }

        @NativeType("VkViewport const *")
        public VkViewport pViewportDepths() {
            return VkCommandBufferInheritanceViewportScissorInfoNV.npViewportDepths(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCommandBufferInheritanceViewportScissorInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVInheritedViewportScissor.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCommandBufferInheritanceViewportScissorInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer viewportScissor2D(@NativeType("VkBool32") boolean value) {
            VkCommandBufferInheritanceViewportScissorInfoNV.nviewportScissor2D(address(), value ? 1 : 0);
            return this;
        }

        public Buffer viewportDepthCount(@NativeType("uint32_t") int value) {
            VkCommandBufferInheritanceViewportScissorInfoNV.nviewportDepthCount(address(), value);
            return this;
        }

        public Buffer pViewportDepths(@NativeType("VkViewport const *") VkViewport value) {
            VkCommandBufferInheritanceViewportScissorInfoNV.npViewportDepths(address(), value);
            return this;
        }
    }
}
