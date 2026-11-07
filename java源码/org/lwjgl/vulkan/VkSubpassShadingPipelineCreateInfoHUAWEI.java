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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassShadingPipelineCreateInfoHUAWEI.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassShadingPipelineCreateInfoHUAWEI.class */
public class VkSubpassShadingPipelineCreateInfoHUAWEI extends Struct<VkSubpassShadingPipelineCreateInfoHUAWEI> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RENDERPASS;
    public static final int SUBPASS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RENDERPASS = layout.offsetof(2);
        SUBPASS = layout.offsetof(3);
    }

    protected VkSubpassShadingPipelineCreateInfoHUAWEI(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubpassShadingPipelineCreateInfoHUAWEI create(long address, ByteBuffer container) {
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(address, container);
    }

    public VkSubpassShadingPipelineCreateInfoHUAWEI(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkRenderPass")
    public long renderPass() {
        return nrenderPass(address());
    }

    @NativeType("uint32_t")
    public int subpass() {
        return nsubpass(address());
    }

    public VkSubpassShadingPipelineCreateInfoHUAWEI sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSubpassShadingPipelineCreateInfoHUAWEI sType$Default() {
        return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI);
    }

    public VkSubpassShadingPipelineCreateInfoHUAWEI pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSubpassShadingPipelineCreateInfoHUAWEI renderPass(@NativeType("VkRenderPass") long value) {
        nrenderPass(address(), value);
        return this;
    }

    public VkSubpassShadingPipelineCreateInfoHUAWEI subpass(@NativeType("uint32_t") int value) {
        nsubpass(address(), value);
        return this;
    }

    public VkSubpassShadingPipelineCreateInfoHUAWEI set(int sType, long pNext, long renderPass, int subpass) {
        sType(sType);
        pNext(pNext);
        renderPass(renderPass);
        subpass(subpass);
        return this;
    }

    public VkSubpassShadingPipelineCreateInfoHUAWEI set(VkSubpassShadingPipelineCreateInfoHUAWEI src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassShadingPipelineCreateInfoHUAWEI malloc() {
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassShadingPipelineCreateInfoHUAWEI calloc() {
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassShadingPipelineCreateInfoHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassShadingPipelineCreateInfoHUAWEI create(long address) {
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(address, null);
    }

    public static VkSubpassShadingPipelineCreateInfoHUAWEI createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(address, null);
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

    public static VkSubpassShadingPipelineCreateInfoHUAWEI malloc(MemoryStack stack) {
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassShadingPipelineCreateInfoHUAWEI calloc(MemoryStack stack) {
        return new VkSubpassShadingPipelineCreateInfoHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsubpass(long struct) {
        return MemoryUtil.memGetInt(struct + SUBPASS);
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

    public static void nsubpass(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBPASS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassShadingPipelineCreateInfoHUAWEI$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassShadingPipelineCreateInfoHUAWEI$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubpassShadingPipelineCreateInfoHUAWEI, Buffer> implements NativeResource {
        private static final VkSubpassShadingPipelineCreateInfoHUAWEI ELEMENT_FACTORY = VkSubpassShadingPipelineCreateInfoHUAWEI.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubpassShadingPipelineCreateInfoHUAWEI.SIZEOF);
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
        public VkSubpassShadingPipelineCreateInfoHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSubpassShadingPipelineCreateInfoHUAWEI.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkSubpassShadingPipelineCreateInfoHUAWEI.npNext(address());
        }

        @NativeType("VkRenderPass")
        public long renderPass() {
            return VkSubpassShadingPipelineCreateInfoHUAWEI.nrenderPass(address());
        }

        @NativeType("uint32_t")
        public int subpass() {
            return VkSubpassShadingPipelineCreateInfoHUAWEI.nsubpass(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubpassShadingPipelineCreateInfoHUAWEI.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkSubpassShadingPipelineCreateInfoHUAWEI.npNext(address(), value);
            return this;
        }

        public Buffer renderPass(@NativeType("VkRenderPass") long value) {
            VkSubpassShadingPipelineCreateInfoHUAWEI.nrenderPass(address(), value);
            return this;
        }

        public Buffer subpass(@NativeType("uint32_t") int value) {
            VkSubpassShadingPipelineCreateInfoHUAWEI.nsubpass(address(), value);
            return this;
        }
    }
}
