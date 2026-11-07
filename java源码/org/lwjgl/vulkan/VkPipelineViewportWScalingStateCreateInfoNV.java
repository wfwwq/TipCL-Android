package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkViewportWScalingNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportWScalingStateCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportWScalingStateCreateInfoNV.class */
public class VkPipelineViewportWScalingStateCreateInfoNV extends Struct<VkPipelineViewportWScalingStateCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIEWPORTWSCALINGENABLE;
    public static final int VIEWPORTCOUNT;
    public static final int PVIEWPORTWSCALINGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIEWPORTWSCALINGENABLE = layout.offsetof(2);
        VIEWPORTCOUNT = layout.offsetof(3);
        PVIEWPORTWSCALINGS = layout.offsetof(4);
    }

    protected VkPipelineViewportWScalingStateCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineViewportWScalingStateCreateInfoNV create(long address, ByteBuffer container) {
        return new VkPipelineViewportWScalingStateCreateInfoNV(address, container);
    }

    public VkPipelineViewportWScalingStateCreateInfoNV(ByteBuffer container) {
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
    public boolean viewportWScalingEnable() {
        return nviewportWScalingEnable(address()) != 0;
    }

    @NativeType("uint32_t")
    public int viewportCount() {
        return nviewportCount(address());
    }

    @NativeType("VkViewportWScalingNV const *")
    public VkViewportWScalingNV.Buffer pViewportWScalings() {
        return npViewportWScalings(address());
    }

    public VkPipelineViewportWScalingStateCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineViewportWScalingStateCreateInfoNV sType$Default() {
        return sType(1000087000);
    }

    public VkPipelineViewportWScalingStateCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineViewportWScalingStateCreateInfoNV viewportWScalingEnable(@NativeType("VkBool32") boolean value) {
        nviewportWScalingEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineViewportWScalingStateCreateInfoNV viewportCount(@NativeType("uint32_t") int value) {
        nviewportCount(address(), value);
        return this;
    }

    public VkPipelineViewportWScalingStateCreateInfoNV pViewportWScalings(@NativeType("VkViewportWScalingNV const *") VkViewportWScalingNV.Buffer value) {
        npViewportWScalings(address(), value);
        return this;
    }

    public VkPipelineViewportWScalingStateCreateInfoNV set(int sType, long pNext, boolean viewportWScalingEnable, int viewportCount, VkViewportWScalingNV.Buffer pViewportWScalings) {
        sType(sType);
        pNext(pNext);
        viewportWScalingEnable(viewportWScalingEnable);
        viewportCount(viewportCount);
        pViewportWScalings(pViewportWScalings);
        return this;
    }

    public VkPipelineViewportWScalingStateCreateInfoNV set(VkPipelineViewportWScalingStateCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV malloc() {
        return new VkPipelineViewportWScalingStateCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV calloc() {
        return new VkPipelineViewportWScalingStateCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportWScalingStateCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV create(long address) {
        return new VkPipelineViewportWScalingStateCreateInfoNV(address, null);
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineViewportWScalingStateCreateInfoNV(address, null);
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

    public static VkPipelineViewportWScalingStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineViewportWScalingStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineViewportWScalingStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nviewportWScalingEnable(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWPORTWSCALINGENABLE);
    }

    public static int nviewportCount(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWPORTCOUNT);
    }

    public static VkViewportWScalingNV.Buffer npViewportWScalings(long struct) {
        return VkViewportWScalingNV.createSafe(MemoryUtil.memGetAddress(struct + PVIEWPORTWSCALINGS), nviewportCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nviewportWScalingEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWPORTWSCALINGENABLE, value);
    }

    public static void nviewportCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWPORTCOUNT, value);
    }

    public static void npViewportWScalings(long struct, VkViewportWScalingNV.Buffer value) {
        MemoryUtil.memPutAddress(struct + PVIEWPORTWSCALINGS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nviewportCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportWScalingStateCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportWScalingStateCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineViewportWScalingStateCreateInfoNV, Buffer> implements NativeResource {
        private static final VkPipelineViewportWScalingStateCreateInfoNV ELEMENT_FACTORY = VkPipelineViewportWScalingStateCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineViewportWScalingStateCreateInfoNV.SIZEOF);
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
        public VkPipelineViewportWScalingStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineViewportWScalingStateCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineViewportWScalingStateCreateInfoNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean viewportWScalingEnable() {
            return VkPipelineViewportWScalingStateCreateInfoNV.nviewportWScalingEnable(address()) != 0;
        }

        @NativeType("uint32_t")
        public int viewportCount() {
            return VkPipelineViewportWScalingStateCreateInfoNV.nviewportCount(address());
        }

        @NativeType("VkViewportWScalingNV const *")
        public VkViewportWScalingNV.Buffer pViewportWScalings() {
            return VkPipelineViewportWScalingStateCreateInfoNV.npViewportWScalings(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineViewportWScalingStateCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000087000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineViewportWScalingStateCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer viewportWScalingEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineViewportWScalingStateCreateInfoNV.nviewportWScalingEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer viewportCount(@NativeType("uint32_t") int value) {
            VkPipelineViewportWScalingStateCreateInfoNV.nviewportCount(address(), value);
            return this;
        }

        public Buffer pViewportWScalings(@NativeType("VkViewportWScalingNV const *") VkViewportWScalingNV.Buffer value) {
            VkPipelineViewportWScalingStateCreateInfoNV.npViewportWScalings(address(), value);
            return this;
        }
    }
}
