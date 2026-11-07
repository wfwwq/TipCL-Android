package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkViewportSwizzleNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportSwizzleStateCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportSwizzleStateCreateInfoNV.class */
public class VkPipelineViewportSwizzleStateCreateInfoNV extends Struct<VkPipelineViewportSwizzleStateCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int VIEWPORTCOUNT;
    public static final int PVIEWPORTSWIZZLES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIEWPORTCOUNT = layout.offsetof(3);
        PVIEWPORTSWIZZLES = layout.offsetof(4);
    }

    protected VkPipelineViewportSwizzleStateCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineViewportSwizzleStateCreateInfoNV create(long address, ByteBuffer container) {
        return new VkPipelineViewportSwizzleStateCreateInfoNV(address, container);
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkPipelineViewportSwizzleStateCreateFlagsNV")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int viewportCount() {
        return nviewportCount(address());
    }

    @NativeType("VkViewportSwizzleNV const *")
    public VkViewportSwizzleNV.Buffer pViewportSwizzles() {
        return npViewportSwizzles(address());
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV sType$Default() {
        return sType(NVViewportSwizzle.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV);
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV flags(@NativeType("VkPipelineViewportSwizzleStateCreateFlagsNV") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV pViewportSwizzles(@NativeType("VkViewportSwizzleNV const *") VkViewportSwizzleNV.Buffer value) {
        npViewportSwizzles(address(), value);
        return this;
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV set(int sType, long pNext, int flags, VkViewportSwizzleNV.Buffer pViewportSwizzles) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pViewportSwizzles(pViewportSwizzles);
        return this;
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV set(VkPipelineViewportSwizzleStateCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV malloc() {
        return new VkPipelineViewportSwizzleStateCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV calloc() {
        return new VkPipelineViewportSwizzleStateCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportSwizzleStateCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV create(long address) {
        return new VkPipelineViewportSwizzleStateCreateInfoNV(address, null);
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineViewportSwizzleStateCreateInfoNV(address, null);
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

    public static VkPipelineViewportSwizzleStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineViewportSwizzleStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineViewportSwizzleStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nviewportCount(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWPORTCOUNT);
    }

    public static VkViewportSwizzleNV.Buffer npViewportSwizzles(long struct) {
        return VkViewportSwizzleNV.create(MemoryUtil.memGetAddress(struct + PVIEWPORTSWIZZLES), nviewportCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nviewportCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWPORTCOUNT, value);
    }

    public static void npViewportSwizzles(long struct, VkViewportSwizzleNV.Buffer value) {
        MemoryUtil.memPutAddress(struct + PVIEWPORTSWIZZLES, value.address());
        nviewportCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PVIEWPORTSWIZZLES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportSwizzleStateCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportSwizzleStateCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineViewportSwizzleStateCreateInfoNV, Buffer> implements NativeResource {
        private static final VkPipelineViewportSwizzleStateCreateInfoNV ELEMENT_FACTORY = VkPipelineViewportSwizzleStateCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineViewportSwizzleStateCreateInfoNV.SIZEOF);
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
        public VkPipelineViewportSwizzleStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineViewportSwizzleStateCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineViewportSwizzleStateCreateInfoNV.npNext(address());
        }

        @NativeType("VkPipelineViewportSwizzleStateCreateFlagsNV")
        public int flags() {
            return VkPipelineViewportSwizzleStateCreateInfoNV.nflags(address());
        }

        @NativeType("uint32_t")
        public int viewportCount() {
            return VkPipelineViewportSwizzleStateCreateInfoNV.nviewportCount(address());
        }

        @NativeType("VkViewportSwizzleNV const *")
        public VkViewportSwizzleNV.Buffer pViewportSwizzles() {
            return VkPipelineViewportSwizzleStateCreateInfoNV.npViewportSwizzles(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineViewportSwizzleStateCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVViewportSwizzle.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineViewportSwizzleStateCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineViewportSwizzleStateCreateFlagsNV") int value) {
            VkPipelineViewportSwizzleStateCreateInfoNV.nflags(address(), value);
            return this;
        }

        public Buffer pViewportSwizzles(@NativeType("VkViewportSwizzleNV const *") VkViewportSwizzleNV.Buffer value) {
            VkPipelineViewportSwizzleStateCreateInfoNV.npViewportSwizzles(address(), value);
            return this;
        }
    }
}
