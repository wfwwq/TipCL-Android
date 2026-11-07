package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportDepthClampControlCreateInfoEXT.class */
public class VkPipelineViewportDepthClampControlCreateInfoEXT extends Struct<VkPipelineViewportDepthClampControlCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEPTHCLAMPMODE;
    public static final int PDEPTHCLAMPRANGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPTHCLAMPMODE = layout.offsetof(2);
        PDEPTHCLAMPRANGE = layout.offsetof(3);
    }

    protected VkPipelineViewportDepthClampControlCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineViewportDepthClampControlCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(address, container);
    }

    public VkPipelineViewportDepthClampControlCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkDepthClampModeEXT")
    public int depthClampMode() {
        return ndepthClampMode(address());
    }

    @NativeType("VkDepthClampRangeEXT const *")
    public VkDepthClampRangeEXT pDepthClampRange() {
        return npDepthClampRange(address());
    }

    public VkPipelineViewportDepthClampControlCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineViewportDepthClampControlCreateInfoEXT sType$Default() {
        return sType(EXTDepthClampControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT);
    }

    public VkPipelineViewportDepthClampControlCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineViewportDepthClampControlCreateInfoEXT depthClampMode(@NativeType("VkDepthClampModeEXT") int value) {
        ndepthClampMode(address(), value);
        return this;
    }

    public VkPipelineViewportDepthClampControlCreateInfoEXT pDepthClampRange(@NativeType("VkDepthClampRangeEXT const *") VkDepthClampRangeEXT value) {
        npDepthClampRange(address(), value);
        return this;
    }

    public VkPipelineViewportDepthClampControlCreateInfoEXT set(int sType, long pNext, int depthClampMode, VkDepthClampRangeEXT pDepthClampRange) {
        sType(sType);
        pNext(pNext);
        depthClampMode(depthClampMode);
        pDepthClampRange(pDepthClampRange);
        return this;
    }

    public VkPipelineViewportDepthClampControlCreateInfoEXT set(VkPipelineViewportDepthClampControlCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineViewportDepthClampControlCreateInfoEXT malloc() {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineViewportDepthClampControlCreateInfoEXT calloc() {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineViewportDepthClampControlCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineViewportDepthClampControlCreateInfoEXT create(long address) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(address, null);
    }

    public static VkPipelineViewportDepthClampControlCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(address, null);
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

    public static VkPipelineViewportDepthClampControlCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineViewportDepthClampControlCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndepthClampMode(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHCLAMPMODE);
    }

    public static VkDepthClampRangeEXT npDepthClampRange(long struct) {
        return VkDepthClampRangeEXT.createSafe(MemoryUtil.memGetAddress(struct + PDEPTHCLAMPRANGE));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndepthClampMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHCLAMPMODE, value);
    }

    public static void npDepthClampRange(long struct, VkDepthClampRangeEXT value) {
        MemoryUtil.memPutAddress(struct + PDEPTHCLAMPRANGE, MemoryUtil.memAddressSafe(value));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportDepthClampControlCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineViewportDepthClampControlCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkPipelineViewportDepthClampControlCreateInfoEXT ELEMENT_FACTORY = VkPipelineViewportDepthClampControlCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineViewportDepthClampControlCreateInfoEXT.SIZEOF);
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
        public VkPipelineViewportDepthClampControlCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineViewportDepthClampControlCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineViewportDepthClampControlCreateInfoEXT.npNext(address());
        }

        @NativeType("VkDepthClampModeEXT")
        public int depthClampMode() {
            return VkPipelineViewportDepthClampControlCreateInfoEXT.ndepthClampMode(address());
        }

        @NativeType("VkDepthClampRangeEXT const *")
        public VkDepthClampRangeEXT pDepthClampRange() {
            return VkPipelineViewportDepthClampControlCreateInfoEXT.npDepthClampRange(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineViewportDepthClampControlCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDepthClampControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineViewportDepthClampControlCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer depthClampMode(@NativeType("VkDepthClampModeEXT") int value) {
            VkPipelineViewportDepthClampControlCreateInfoEXT.ndepthClampMode(address(), value);
            return this;
        }

        public Buffer pDepthClampRange(@NativeType("VkDepthClampRangeEXT const *") VkDepthClampRangeEXT value) {
            VkPipelineViewportDepthClampControlCreateInfoEXT.npDepthClampRange(address(), value);
            return this;
        }
    }
}
