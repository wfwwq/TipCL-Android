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
import org.lwjgl.vulkan.VkViewport;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportStateCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportStateCreateInfo.class */
public class VkPipelineViewportStateCreateInfo extends Struct<VkPipelineViewportStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int VIEWPORTCOUNT;
    public static final int PVIEWPORTS;
    public static final int SCISSORCOUNT;
    public static final int PSCISSORS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIEWPORTCOUNT = layout.offsetof(3);
        PVIEWPORTS = layout.offsetof(4);
        SCISSORCOUNT = layout.offsetof(5);
        PSCISSORS = layout.offsetof(6);
    }

    protected VkPipelineViewportStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineViewportStateCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineViewportStateCreateInfo(address, container);
    }

    public VkPipelineViewportStateCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineViewportStateCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int viewportCount() {
        return nviewportCount(address());
    }

    @NativeType("VkViewport const *")
    public VkViewport.Buffer pViewports() {
        return npViewports(address());
    }

    @NativeType("uint32_t")
    public int scissorCount() {
        return nscissorCount(address());
    }

    @NativeType("VkRect2D const *")
    public VkRect2D.Buffer pScissors() {
        return npScissors(address());
    }

    public VkPipelineViewportStateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineViewportStateCreateInfo sType$Default() {
        return sType(22);
    }

    public VkPipelineViewportStateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportCoarseSampleOrderStateCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportDepthClampControlCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportDepthClipControlCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportExclusiveScissorStateCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportShadingRateImageStateCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportSwizzleStateCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineViewportStateCreateInfo pNext(VkPipelineViewportWScalingStateCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineViewportStateCreateInfo flags(@NativeType("VkPipelineViewportStateCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineViewportStateCreateInfo viewportCount(@NativeType("uint32_t") int value) {
        nviewportCount(address(), value);
        return this;
    }

    public VkPipelineViewportStateCreateInfo pViewports(@NativeType("VkViewport const *") VkViewport.Buffer value) {
        npViewports(address(), value);
        return this;
    }

    public VkPipelineViewportStateCreateInfo scissorCount(@NativeType("uint32_t") int value) {
        nscissorCount(address(), value);
        return this;
    }

    public VkPipelineViewportStateCreateInfo pScissors(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
        npScissors(address(), value);
        return this;
    }

    public VkPipelineViewportStateCreateInfo set(int sType, long pNext, int flags, int viewportCount, VkViewport.Buffer pViewports, int scissorCount, VkRect2D.Buffer pScissors) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        viewportCount(viewportCount);
        pViewports(pViewports);
        scissorCount(scissorCount);
        pScissors(pScissors);
        return this;
    }

    public VkPipelineViewportStateCreateInfo set(VkPipelineViewportStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineViewportStateCreateInfo malloc() {
        return new VkPipelineViewportStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineViewportStateCreateInfo calloc() {
        return new VkPipelineViewportStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineViewportStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineViewportStateCreateInfo create(long address) {
        return new VkPipelineViewportStateCreateInfo(address, null);
    }

    public static VkPipelineViewportStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineViewportStateCreateInfo(address, null);
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

    public static VkPipelineViewportStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineViewportStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineViewportStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineViewportStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkViewport.Buffer npViewports(long struct) {
        return VkViewport.createSafe(MemoryUtil.memGetAddress(struct + PVIEWPORTS), nviewportCount(struct));
    }

    public static int nscissorCount(long struct) {
        return MemoryUtil.memGetInt(struct + SCISSORCOUNT);
    }

    public static VkRect2D.Buffer npScissors(long struct) {
        return VkRect2D.createSafe(MemoryUtil.memGetAddress(struct + PSCISSORS), nscissorCount(struct));
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

    public static void npViewports(long struct, VkViewport.Buffer value) {
        MemoryUtil.memPutAddress(struct + PVIEWPORTS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nviewportCount(struct, value.remaining());
        }
    }

    public static void nscissorCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SCISSORCOUNT, value);
    }

    public static void npScissors(long struct, VkRect2D.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSCISSORS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nscissorCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportStateCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineViewportStateCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineViewportStateCreateInfo ELEMENT_FACTORY = VkPipelineViewportStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineViewportStateCreateInfo.SIZEOF);
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
        public VkPipelineViewportStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineViewportStateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineViewportStateCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineViewportStateCreateFlags")
        public int flags() {
            return VkPipelineViewportStateCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int viewportCount() {
            return VkPipelineViewportStateCreateInfo.nviewportCount(address());
        }

        @NativeType("VkViewport const *")
        public VkViewport.Buffer pViewports() {
            return VkPipelineViewportStateCreateInfo.npViewports(address());
        }

        @NativeType("uint32_t")
        public int scissorCount() {
            return VkPipelineViewportStateCreateInfo.nscissorCount(address());
        }

        @NativeType("VkRect2D const *")
        public VkRect2D.Buffer pScissors() {
            return VkPipelineViewportStateCreateInfo.npScissors(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineViewportStateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(22);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineViewportStateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineViewportCoarseSampleOrderStateCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineViewportDepthClampControlCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineViewportDepthClipControlCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineViewportExclusiveScissorStateCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineViewportShadingRateImageStateCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineViewportSwizzleStateCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineViewportWScalingStateCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkPipelineViewportStateCreateFlags") int value) {
            VkPipelineViewportStateCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer viewportCount(@NativeType("uint32_t") int value) {
            VkPipelineViewportStateCreateInfo.nviewportCount(address(), value);
            return this;
        }

        public Buffer pViewports(@NativeType("VkViewport const *") VkViewport.Buffer value) {
            VkPipelineViewportStateCreateInfo.npViewports(address(), value);
            return this;
        }

        public Buffer scissorCount(@NativeType("uint32_t") int value) {
            VkPipelineViewportStateCreateInfo.nscissorCount(address(), value);
            return this;
        }

        public Buffer pScissors(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
            VkPipelineViewportStateCreateInfo.npScissors(address(), value);
            return this;
        }
    }
}
