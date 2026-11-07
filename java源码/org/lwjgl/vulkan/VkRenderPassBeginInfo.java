package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkClearValue;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassBeginInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassBeginInfo.class */
public class VkRenderPassBeginInfo extends Struct<VkRenderPassBeginInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RENDERPASS;
    public static final int FRAMEBUFFER;
    public static final int RENDERAREA;
    public static final int CLEARVALUECOUNT;
    public static final int PCLEARVALUES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RENDERPASS = layout.offsetof(2);
        FRAMEBUFFER = layout.offsetof(3);
        RENDERAREA = layout.offsetof(4);
        CLEARVALUECOUNT = layout.offsetof(5);
        PCLEARVALUES = layout.offsetof(6);
    }

    protected VkRenderPassBeginInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassBeginInfo create(long address, ByteBuffer container) {
        return new VkRenderPassBeginInfo(address, container);
    }

    public VkRenderPassBeginInfo(ByteBuffer container) {
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

    @NativeType("VkRenderPass")
    public long renderPass() {
        return nrenderPass(address());
    }

    @NativeType("VkFramebuffer")
    public long framebuffer() {
        return nframebuffer(address());
    }

    public VkRect2D renderArea() {
        return nrenderArea(address());
    }

    @NativeType("uint32_t")
    public int clearValueCount() {
        return nclearValueCount(address());
    }

    @NativeType("VkClearValue const *")
    public VkClearValue.Buffer pClearValues() {
        return npClearValues(address());
    }

    public VkRenderPassBeginInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassBeginInfo sType$Default() {
        return sType(43);
    }

    public VkRenderPassBeginInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassBeginInfo pNext(VkDeviceGroupRenderPassBeginInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassBeginInfo pNext(VkDeviceGroupRenderPassBeginInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassBeginInfo pNext(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassBeginInfo pNext(VkRenderPassAttachmentBeginInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassBeginInfo pNext(VkRenderPassAttachmentBeginInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassBeginInfo pNext(VkRenderPassPerformanceCountersByRegionBeginInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassBeginInfo pNext(VkRenderPassSampleLocationsBeginInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassBeginInfo pNext(VkRenderPassStripeBeginInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassBeginInfo pNext(VkRenderPassTransformBeginInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassBeginInfo renderPass(@NativeType("VkRenderPass") long value) {
        nrenderPass(address(), value);
        return this;
    }

    public VkRenderPassBeginInfo framebuffer(@NativeType("VkFramebuffer") long value) {
        nframebuffer(address(), value);
        return this;
    }

    public VkRenderPassBeginInfo renderArea(VkRect2D value) {
        nrenderArea(address(), value);
        return this;
    }

    public VkRenderPassBeginInfo renderArea(Consumer<VkRect2D> consumer) {
        consumer.accept(renderArea());
        return this;
    }

    public VkRenderPassBeginInfo clearValueCount(@NativeType("uint32_t") int value) {
        nclearValueCount(address(), value);
        return this;
    }

    public VkRenderPassBeginInfo pClearValues(@NativeType("VkClearValue const *") VkClearValue.Buffer value) {
        npClearValues(address(), value);
        return this;
    }

    public VkRenderPassBeginInfo set(int sType, long pNext, long renderPass, long framebuffer, VkRect2D renderArea, int clearValueCount, VkClearValue.Buffer pClearValues) {
        sType(sType);
        pNext(pNext);
        renderPass(renderPass);
        framebuffer(framebuffer);
        renderArea(renderArea);
        clearValueCount(clearValueCount);
        pClearValues(pClearValues);
        return this;
    }

    public VkRenderPassBeginInfo set(VkRenderPassBeginInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassBeginInfo malloc() {
        return new VkRenderPassBeginInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassBeginInfo calloc() {
        return new VkRenderPassBeginInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassBeginInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassBeginInfo create(long address) {
        return new VkRenderPassBeginInfo(address, null);
    }

    public static VkRenderPassBeginInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassBeginInfo(address, null);
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

    public static VkRenderPassBeginInfo malloc(MemoryStack stack) {
        return new VkRenderPassBeginInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassBeginInfo calloc(MemoryStack stack) {
        return new VkRenderPassBeginInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nrenderPass(long struct) {
        return MemoryUtil.memGetLong(struct + RENDERPASS);
    }

    public static long nframebuffer(long struct) {
        return MemoryUtil.memGetLong(struct + FRAMEBUFFER);
    }

    public static VkRect2D nrenderArea(long struct) {
        return VkRect2D.create(struct + RENDERAREA);
    }

    public static int nclearValueCount(long struct) {
        return MemoryUtil.memGetInt(struct + CLEARVALUECOUNT);
    }

    public static VkClearValue.Buffer npClearValues(long struct) {
        return VkClearValue.createSafe(MemoryUtil.memGetAddress(struct + PCLEARVALUES), nclearValueCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrenderPass(long struct, long value) {
        MemoryUtil.memPutLong(struct + RENDERPASS, value);
    }

    public static void nframebuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + FRAMEBUFFER, value);
    }

    public static void nrenderArea(long struct, VkRect2D value) {
        MemoryUtil.memCopy(value.address(), struct + RENDERAREA, VkRect2D.SIZEOF);
    }

    public static void nclearValueCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLEARVALUECOUNT, value);
    }

    public static void npClearValues(long struct, VkClearValue.Buffer value) {
        MemoryUtil.memPutAddress(struct + PCLEARVALUES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nclearValueCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassBeginInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassBeginInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassBeginInfo, Buffer> implements NativeResource {
        private static final VkRenderPassBeginInfo ELEMENT_FACTORY = VkRenderPassBeginInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassBeginInfo.SIZEOF);
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
        public VkRenderPassBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassBeginInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassBeginInfo.npNext(address());
        }

        @NativeType("VkRenderPass")
        public long renderPass() {
            return VkRenderPassBeginInfo.nrenderPass(address());
        }

        @NativeType("VkFramebuffer")
        public long framebuffer() {
            return VkRenderPassBeginInfo.nframebuffer(address());
        }

        public VkRect2D renderArea() {
            return VkRenderPassBeginInfo.nrenderArea(address());
        }

        @NativeType("uint32_t")
        public int clearValueCount() {
            return VkRenderPassBeginInfo.nclearValueCount(address());
        }

        @NativeType("VkClearValue const *")
        public VkClearValue.Buffer pClearValues() {
            return VkRenderPassBeginInfo.npClearValues(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassBeginInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(43);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassBeginInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDeviceGroupRenderPassBeginInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceGroupRenderPassBeginInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassAttachmentBeginInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassAttachmentBeginInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassPerformanceCountersByRegionBeginInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassSampleLocationsBeginInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassStripeBeginInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassTransformBeginInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer renderPass(@NativeType("VkRenderPass") long value) {
            VkRenderPassBeginInfo.nrenderPass(address(), value);
            return this;
        }

        public Buffer framebuffer(@NativeType("VkFramebuffer") long value) {
            VkRenderPassBeginInfo.nframebuffer(address(), value);
            return this;
        }

        public Buffer renderArea(VkRect2D value) {
            VkRenderPassBeginInfo.nrenderArea(address(), value);
            return this;
        }

        public Buffer renderArea(Consumer<VkRect2D> consumer) {
            consumer.accept(renderArea());
            return this;
        }

        public Buffer clearValueCount(@NativeType("uint32_t") int value) {
            VkRenderPassBeginInfo.nclearValueCount(address(), value);
            return this;
        }

        public Buffer pClearValues(@NativeType("VkClearValue const *") VkClearValue.Buffer value) {
            VkRenderPassBeginInfo.npClearValues(address(), value);
            return this;
        }
    }
}
