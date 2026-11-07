package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkRect2D;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportExclusiveScissorStateCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportExclusiveScissorStateCreateInfoNV.class */
public class VkPipelineViewportExclusiveScissorStateCreateInfoNV extends Struct<VkPipelineViewportExclusiveScissorStateCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int EXCLUSIVESCISSORCOUNT;
    public static final int PEXCLUSIVESCISSORS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXCLUSIVESCISSORCOUNT = layout.offsetof(2);
        PEXCLUSIVESCISSORS = layout.offsetof(3);
    }

    protected VkPipelineViewportExclusiveScissorStateCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV create(long address, ByteBuffer container) {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(address, container);
    }

    public VkPipelineViewportExclusiveScissorStateCreateInfoNV(ByteBuffer container) {
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
    public int exclusiveScissorCount() {
        return nexclusiveScissorCount(address());
    }

    @NativeType("VkRect2D const *")
    public VkRect2D.Buffer pExclusiveScissors() {
        return npExclusiveScissors(address());
    }

    public VkPipelineViewportExclusiveScissorStateCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineViewportExclusiveScissorStateCreateInfoNV sType$Default() {
        return sType(1000205000);
    }

    public VkPipelineViewportExclusiveScissorStateCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineViewportExclusiveScissorStateCreateInfoNV exclusiveScissorCount(@NativeType("uint32_t") int value) {
        nexclusiveScissorCount(address(), value);
        return this;
    }

    public VkPipelineViewportExclusiveScissorStateCreateInfoNV pExclusiveScissors(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
        npExclusiveScissors(address(), value);
        return this;
    }

    public VkPipelineViewportExclusiveScissorStateCreateInfoNV set(int sType, long pNext, int exclusiveScissorCount, VkRect2D.Buffer pExclusiveScissors) {
        sType(sType);
        pNext(pNext);
        exclusiveScissorCount(exclusiveScissorCount);
        pExclusiveScissors(pExclusiveScissors);
        return this;
    }

    public VkPipelineViewportExclusiveScissorStateCreateInfoNV set(VkPipelineViewportExclusiveScissorStateCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV malloc() {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV calloc() {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV create(long address) {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(address, null);
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(address, null);
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

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nexclusiveScissorCount(long struct) {
        return MemoryUtil.memGetInt(struct + EXCLUSIVESCISSORCOUNT);
    }

    public static VkRect2D.Buffer npExclusiveScissors(long struct) {
        return VkRect2D.createSafe(MemoryUtil.memGetAddress(struct + PEXCLUSIVESCISSORS), nexclusiveScissorCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nexclusiveScissorCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXCLUSIVESCISSORCOUNT, value);
    }

    public static void npExclusiveScissors(long struct, VkRect2D.Buffer value) {
        MemoryUtil.memPutAddress(struct + PEXCLUSIVESCISSORS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nexclusiveScissorCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportExclusiveScissorStateCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportExclusiveScissorStateCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineViewportExclusiveScissorStateCreateInfoNV, Buffer> implements NativeResource {
        private static final VkPipelineViewportExclusiveScissorStateCreateInfoNV ELEMENT_FACTORY = VkPipelineViewportExclusiveScissorStateCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineViewportExclusiveScissorStateCreateInfoNV.SIZEOF);
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
        public VkPipelineViewportExclusiveScissorStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineViewportExclusiveScissorStateCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineViewportExclusiveScissorStateCreateInfoNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int exclusiveScissorCount() {
            return VkPipelineViewportExclusiveScissorStateCreateInfoNV.nexclusiveScissorCount(address());
        }

        @NativeType("VkRect2D const *")
        public VkRect2D.Buffer pExclusiveScissors() {
            return VkPipelineViewportExclusiveScissorStateCreateInfoNV.npExclusiveScissors(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineViewportExclusiveScissorStateCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000205000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineViewportExclusiveScissorStateCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer exclusiveScissorCount(@NativeType("uint32_t") int value) {
            VkPipelineViewportExclusiveScissorStateCreateInfoNV.nexclusiveScissorCount(address(), value);
            return this;
        }

        public Buffer pExclusiveScissors(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
            VkPipelineViewportExclusiveScissorStateCreateInfoNV.npExclusiveScissors(address(), value);
            return this;
        }
    }
}
