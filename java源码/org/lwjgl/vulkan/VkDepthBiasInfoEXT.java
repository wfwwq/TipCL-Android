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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDepthBiasInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDepthBiasInfoEXT.class */
public class VkDepthBiasInfoEXT extends Struct<VkDepthBiasInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEPTHBIASCONSTANTFACTOR;
    public static final int DEPTHBIASCLAMP;
    public static final int DEPTHBIASSLOPEFACTOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPTHBIASCONSTANTFACTOR = layout.offsetof(2);
        DEPTHBIASCLAMP = layout.offsetof(3);
        DEPTHBIASSLOPEFACTOR = layout.offsetof(4);
    }

    protected VkDepthBiasInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDepthBiasInfoEXT create(long address, ByteBuffer container) {
        return new VkDepthBiasInfoEXT(address, container);
    }

    public VkDepthBiasInfoEXT(ByteBuffer container) {
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

    public float depthBiasConstantFactor() {
        return ndepthBiasConstantFactor(address());
    }

    public float depthBiasClamp() {
        return ndepthBiasClamp(address());
    }

    public float depthBiasSlopeFactor() {
        return ndepthBiasSlopeFactor(address());
    }

    public VkDepthBiasInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDepthBiasInfoEXT sType$Default() {
        return sType(EXTDepthBiasControl.VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT);
    }

    public VkDepthBiasInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDepthBiasInfoEXT pNext(VkDepthBiasRepresentationInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDepthBiasInfoEXT depthBiasConstantFactor(float value) {
        ndepthBiasConstantFactor(address(), value);
        return this;
    }

    public VkDepthBiasInfoEXT depthBiasClamp(float value) {
        ndepthBiasClamp(address(), value);
        return this;
    }

    public VkDepthBiasInfoEXT depthBiasSlopeFactor(float value) {
        ndepthBiasSlopeFactor(address(), value);
        return this;
    }

    public VkDepthBiasInfoEXT set(int sType, long pNext, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
        sType(sType);
        pNext(pNext);
        depthBiasConstantFactor(depthBiasConstantFactor);
        depthBiasClamp(depthBiasClamp);
        depthBiasSlopeFactor(depthBiasSlopeFactor);
        return this;
    }

    public VkDepthBiasInfoEXT set(VkDepthBiasInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDepthBiasInfoEXT malloc() {
        return new VkDepthBiasInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDepthBiasInfoEXT calloc() {
        return new VkDepthBiasInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDepthBiasInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDepthBiasInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDepthBiasInfoEXT create(long address) {
        return new VkDepthBiasInfoEXT(address, null);
    }

    public static VkDepthBiasInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDepthBiasInfoEXT(address, null);
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

    public static VkDepthBiasInfoEXT malloc(MemoryStack stack) {
        return new VkDepthBiasInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDepthBiasInfoEXT calloc(MemoryStack stack) {
        return new VkDepthBiasInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static float ndepthBiasConstantFactor(long struct) {
        return MemoryUtil.memGetFloat(struct + DEPTHBIASCONSTANTFACTOR);
    }

    public static float ndepthBiasClamp(long struct) {
        return MemoryUtil.memGetFloat(struct + DEPTHBIASCLAMP);
    }

    public static float ndepthBiasSlopeFactor(long struct) {
        return MemoryUtil.memGetFloat(struct + DEPTHBIASSLOPEFACTOR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
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

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDepthBiasInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDepthBiasInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDepthBiasInfoEXT, Buffer> implements NativeResource {
        private static final VkDepthBiasInfoEXT ELEMENT_FACTORY = VkDepthBiasInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDepthBiasInfoEXT.SIZEOF);
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
        public VkDepthBiasInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDepthBiasInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDepthBiasInfoEXT.npNext(address());
        }

        public float depthBiasConstantFactor() {
            return VkDepthBiasInfoEXT.ndepthBiasConstantFactor(address());
        }

        public float depthBiasClamp() {
            return VkDepthBiasInfoEXT.ndepthBiasClamp(address());
        }

        public float depthBiasSlopeFactor() {
            return VkDepthBiasInfoEXT.ndepthBiasSlopeFactor(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDepthBiasInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDepthBiasControl.VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDepthBiasInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDepthBiasRepresentationInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer depthBiasConstantFactor(float value) {
            VkDepthBiasInfoEXT.ndepthBiasConstantFactor(address(), value);
            return this;
        }

        public Buffer depthBiasClamp(float value) {
            VkDepthBiasInfoEXT.ndepthBiasClamp(address(), value);
            return this;
        }

        public Buffer depthBiasSlopeFactor(float value) {
            VkDepthBiasInfoEXT.ndepthBiasSlopeFactor(address(), value);
            return this;
        }
    }
}
