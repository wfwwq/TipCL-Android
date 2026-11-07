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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo.class */
public class VkPipelineRasterizationStateCreateInfo extends Struct<VkPipelineRasterizationStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DEPTHCLAMPENABLE;
    public static final int RASTERIZERDISCARDENABLE;
    public static final int POLYGONMODE;
    public static final int CULLMODE;
    public static final int FRONTFACE;
    public static final int DEPTHBIASENABLE;
    public static final int DEPTHBIASCONSTANTFACTOR;
    public static final int DEPTHBIASCLAMP;
    public static final int DEPTHBIASSLOPEFACTOR;
    public static final int LINEWIDTH;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DEPTHCLAMPENABLE = layout.offsetof(3);
        RASTERIZERDISCARDENABLE = layout.offsetof(4);
        POLYGONMODE = layout.offsetof(5);
        CULLMODE = layout.offsetof(6);
        FRONTFACE = layout.offsetof(7);
        DEPTHBIASENABLE = layout.offsetof(8);
        DEPTHBIASCONSTANTFACTOR = layout.offsetof(9);
        DEPTHBIASCLAMP = layout.offsetof(10);
        DEPTHBIASSLOPEFACTOR = layout.offsetof(11);
        LINEWIDTH = layout.offsetof(12);
    }

    protected VkPipelineRasterizationStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineRasterizationStateCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineRasterizationStateCreateInfo(address, container);
    }

    public VkPipelineRasterizationStateCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineRasterizationStateCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkBool32")
    public boolean depthClampEnable() {
        return ndepthClampEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean rasterizerDiscardEnable() {
        return nrasterizerDiscardEnable(address()) != 0;
    }

    @NativeType("VkPolygonMode")
    public int polygonMode() {
        return npolygonMode(address());
    }

    @NativeType("VkCullModeFlags")
    public int cullMode() {
        return ncullMode(address());
    }

    @NativeType("VkFrontFace")
    public int frontFace() {
        return nfrontFace(address());
    }

    @NativeType("VkBool32")
    public boolean depthBiasEnable() {
        return ndepthBiasEnable(address()) != 0;
    }

    public float depthBiasConstantFactor() {
        return ndepthBiasConstantFactor(address());
    }

    public float depthBiasClamp() {
        return ndepthBiasClamp(address());
    }

    public float depthBiasSlopeFactor() {
        return ndepthBiasSlopeFactor(address());
    }

    public float lineWidth() {
        return nlineWidth(address());
    }

    public VkPipelineRasterizationStateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo sType$Default() {
        return sType(23);
    }

    public VkPipelineRasterizationStateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo pNext(VkDepthBiasRepresentationInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineRasterizationStateCreateInfo pNext(VkPipelineRasterizationConservativeStateCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineRasterizationStateCreateInfo pNext(VkPipelineRasterizationDepthClipStateCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineRasterizationStateCreateInfo pNext(VkPipelineRasterizationLineStateCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineRasterizationStateCreateInfo pNext(VkPipelineRasterizationLineStateCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineRasterizationStateCreateInfo pNext(VkPipelineRasterizationLineStateCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineRasterizationStateCreateInfo pNext(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineRasterizationStateCreateInfo pNext(VkPipelineRasterizationStateRasterizationOrderAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineRasterizationStateCreateInfo pNext(VkPipelineRasterizationStateStreamCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineRasterizationStateCreateInfo flags(@NativeType("VkPipelineRasterizationStateCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo depthClampEnable(@NativeType("VkBool32") boolean value) {
        ndepthClampEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo rasterizerDiscardEnable(@NativeType("VkBool32") boolean value) {
        nrasterizerDiscardEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo polygonMode(@NativeType("VkPolygonMode") int value) {
        npolygonMode(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo cullMode(@NativeType("VkCullModeFlags") int value) {
        ncullMode(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo frontFace(@NativeType("VkFrontFace") int value) {
        nfrontFace(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo depthBiasEnable(@NativeType("VkBool32") boolean value) {
        ndepthBiasEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo depthBiasConstantFactor(float value) {
        ndepthBiasConstantFactor(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo depthBiasClamp(float value) {
        ndepthBiasClamp(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo depthBiasSlopeFactor(float value) {
        ndepthBiasSlopeFactor(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo lineWidth(float value) {
        nlineWidth(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo set(int sType, long pNext, int flags, boolean depthClampEnable, boolean rasterizerDiscardEnable, int polygonMode, int cullMode, int frontFace, boolean depthBiasEnable, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor, float lineWidth) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        depthClampEnable(depthClampEnable);
        rasterizerDiscardEnable(rasterizerDiscardEnable);
        polygonMode(polygonMode);
        cullMode(cullMode);
        frontFace(frontFace);
        depthBiasEnable(depthBiasEnable);
        depthBiasConstantFactor(depthBiasConstantFactor);
        depthBiasClamp(depthBiasClamp);
        depthBiasSlopeFactor(depthBiasSlopeFactor);
        lineWidth(lineWidth);
        return this;
    }

    public VkPipelineRasterizationStateCreateInfo set(VkPipelineRasterizationStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineRasterizationStateCreateInfo malloc() {
        return new VkPipelineRasterizationStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineRasterizationStateCreateInfo calloc() {
        return new VkPipelineRasterizationStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineRasterizationStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineRasterizationStateCreateInfo create(long address) {
        return new VkPipelineRasterizationStateCreateInfo(address, null);
    }

    public static VkPipelineRasterizationStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineRasterizationStateCreateInfo(address, null);
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

    public static VkPipelineRasterizationStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineRasterizationStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineRasterizationStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineRasterizationStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndepthClampEnable(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHCLAMPENABLE);
    }

    public static int nrasterizerDiscardEnable(long struct) {
        return MemoryUtil.memGetInt(struct + RASTERIZERDISCARDENABLE);
    }

    public static int npolygonMode(long struct) {
        return MemoryUtil.memGetInt(struct + POLYGONMODE);
    }

    public static int ncullMode(long struct) {
        return MemoryUtil.memGetInt(struct + CULLMODE);
    }

    public static int nfrontFace(long struct) {
        return MemoryUtil.memGetInt(struct + FRONTFACE);
    }

    public static int ndepthBiasEnable(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHBIASENABLE);
    }

    public static float ndepthBiasConstantFactor(long struct) {
        return MemoryUtil.memGetFloat(struct + DEPTHBIASCONSTANTFACTOR);
    }

    public static float ndepthBiasClamp(long struct) {
        return MemoryUtil.memGetFloat(struct + DEPTHBIASCLAMP);
    }

    public static float ndepthBiasSlopeFactor(long struct) {
        return MemoryUtil.memGetFloat(struct + DEPTHBIASSLOPEFACTOR);
    }

    public static float nlineWidth(long struct) {
        return MemoryUtil.memGetFloat(struct + LINEWIDTH);
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

    public static void ndepthClampEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHCLAMPENABLE, value);
    }

    public static void nrasterizerDiscardEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + RASTERIZERDISCARDENABLE, value);
    }

    public static void npolygonMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + POLYGONMODE, value);
    }

    public static void ncullMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + CULLMODE, value);
    }

    public static void nfrontFace(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRONTFACE, value);
    }

    public static void ndepthBiasEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHBIASENABLE, value);
    }

    public static void ndepthBiasConstantFactor(long struct, float value) {
        MemoryUtil.memPutFloat(struct + DEPTHBIASCONSTANTFACTOR, value);
    }

    public static void ndepthBiasClamp(long struct, float value) {
        MemoryUtil.memPutFloat(struct + DEPTHBIASCLAMP, value);
    }

    public static void ndepthBiasSlopeFactor(long struct, float value) {
        MemoryUtil.memPutFloat(struct + DEPTHBIASSLOPEFACTOR, value);
    }

    public static void nlineWidth(long struct, float value) {
        MemoryUtil.memPutFloat(struct + LINEWIDTH, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationStateCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineRasterizationStateCreateInfo ELEMENT_FACTORY = VkPipelineRasterizationStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineRasterizationStateCreateInfo.SIZEOF);
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
        public VkPipelineRasterizationStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineRasterizationStateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineRasterizationStateCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineRasterizationStateCreateFlags")
        public int flags() {
            return VkPipelineRasterizationStateCreateInfo.nflags(address());
        }

        @NativeType("VkBool32")
        public boolean depthClampEnable() {
            return VkPipelineRasterizationStateCreateInfo.ndepthClampEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean rasterizerDiscardEnable() {
            return VkPipelineRasterizationStateCreateInfo.nrasterizerDiscardEnable(address()) != 0;
        }

        @NativeType("VkPolygonMode")
        public int polygonMode() {
            return VkPipelineRasterizationStateCreateInfo.npolygonMode(address());
        }

        @NativeType("VkCullModeFlags")
        public int cullMode() {
            return VkPipelineRasterizationStateCreateInfo.ncullMode(address());
        }

        @NativeType("VkFrontFace")
        public int frontFace() {
            return VkPipelineRasterizationStateCreateInfo.nfrontFace(address());
        }

        @NativeType("VkBool32")
        public boolean depthBiasEnable() {
            return VkPipelineRasterizationStateCreateInfo.ndepthBiasEnable(address()) != 0;
        }

        public float depthBiasConstantFactor() {
            return VkPipelineRasterizationStateCreateInfo.ndepthBiasConstantFactor(address());
        }

        public float depthBiasClamp() {
            return VkPipelineRasterizationStateCreateInfo.ndepthBiasClamp(address());
        }

        public float depthBiasSlopeFactor() {
            return VkPipelineRasterizationStateCreateInfo.ndepthBiasSlopeFactor(address());
        }

        public float lineWidth() {
            return VkPipelineRasterizationStateCreateInfo.nlineWidth(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineRasterizationStateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(23);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineRasterizationStateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDepthBiasRepresentationInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRasterizationConservativeStateCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRasterizationDepthClipStateCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRasterizationLineStateCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRasterizationLineStateCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRasterizationLineStateCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRasterizationStateRasterizationOrderAMD value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRasterizationStateStreamCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkPipelineRasterizationStateCreateFlags") int value) {
            VkPipelineRasterizationStateCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer depthClampEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineRasterizationStateCreateInfo.ndepthClampEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer rasterizerDiscardEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineRasterizationStateCreateInfo.nrasterizerDiscardEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer polygonMode(@NativeType("VkPolygonMode") int value) {
            VkPipelineRasterizationStateCreateInfo.npolygonMode(address(), value);
            return this;
        }

        public Buffer cullMode(@NativeType("VkCullModeFlags") int value) {
            VkPipelineRasterizationStateCreateInfo.ncullMode(address(), value);
            return this;
        }

        public Buffer frontFace(@NativeType("VkFrontFace") int value) {
            VkPipelineRasterizationStateCreateInfo.nfrontFace(address(), value);
            return this;
        }

        public Buffer depthBiasEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineRasterizationStateCreateInfo.ndepthBiasEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer depthBiasConstantFactor(float value) {
            VkPipelineRasterizationStateCreateInfo.ndepthBiasConstantFactor(address(), value);
            return this;
        }

        public Buffer depthBiasClamp(float value) {
            VkPipelineRasterizationStateCreateInfo.ndepthBiasClamp(address(), value);
            return this;
        }

        public Buffer depthBiasSlopeFactor(float value) {
            VkPipelineRasterizationStateCreateInfo.ndepthBiasSlopeFactor(address(), value);
            return this;
        }

        public Buffer lineWidth(float value) {
            VkPipelineRasterizationStateCreateInfo.nlineWidth(address(), value);
            return this;
        }
    }
}
