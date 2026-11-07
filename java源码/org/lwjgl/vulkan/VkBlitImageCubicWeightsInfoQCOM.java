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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBlitImageCubicWeightsInfoQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBlitImageCubicWeightsInfoQCOM.class */
public class VkBlitImageCubicWeightsInfoQCOM extends Struct<VkBlitImageCubicWeightsInfoQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CUBICWEIGHTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CUBICWEIGHTS = layout.offsetof(2);
    }

    protected VkBlitImageCubicWeightsInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBlitImageCubicWeightsInfoQCOM create(long address, ByteBuffer container) {
        return new VkBlitImageCubicWeightsInfoQCOM(address, container);
    }

    public VkBlitImageCubicWeightsInfoQCOM(ByteBuffer container) {
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

    @NativeType("VkCubicFilterWeightsQCOM")
    public int cubicWeights() {
        return ncubicWeights(address());
    }

    public VkBlitImageCubicWeightsInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBlitImageCubicWeightsInfoQCOM sType$Default() {
        return sType(QCOMFilterCubicWeights.VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM);
    }

    public VkBlitImageCubicWeightsInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBlitImageCubicWeightsInfoQCOM cubicWeights(@NativeType("VkCubicFilterWeightsQCOM") int value) {
        ncubicWeights(address(), value);
        return this;
    }

    public VkBlitImageCubicWeightsInfoQCOM set(int sType, long pNext, int cubicWeights) {
        sType(sType);
        pNext(pNext);
        cubicWeights(cubicWeights);
        return this;
    }

    public VkBlitImageCubicWeightsInfoQCOM set(VkBlitImageCubicWeightsInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBlitImageCubicWeightsInfoQCOM malloc() {
        return new VkBlitImageCubicWeightsInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBlitImageCubicWeightsInfoQCOM calloc() {
        return new VkBlitImageCubicWeightsInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBlitImageCubicWeightsInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBlitImageCubicWeightsInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkBlitImageCubicWeightsInfoQCOM create(long address) {
        return new VkBlitImageCubicWeightsInfoQCOM(address, null);
    }

    public static VkBlitImageCubicWeightsInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBlitImageCubicWeightsInfoQCOM(address, null);
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

    public static VkBlitImageCubicWeightsInfoQCOM malloc(MemoryStack stack) {
        return new VkBlitImageCubicWeightsInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBlitImageCubicWeightsInfoQCOM calloc(MemoryStack stack) {
        return new VkBlitImageCubicWeightsInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncubicWeights(long struct) {
        return MemoryUtil.memGetInt(struct + CUBICWEIGHTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncubicWeights(long struct, int value) {
        MemoryUtil.memPutInt(struct + CUBICWEIGHTS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBlitImageCubicWeightsInfoQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBlitImageCubicWeightsInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkBlitImageCubicWeightsInfoQCOM, Buffer> implements NativeResource {
        private static final VkBlitImageCubicWeightsInfoQCOM ELEMENT_FACTORY = VkBlitImageCubicWeightsInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBlitImageCubicWeightsInfoQCOM.SIZEOF);
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
        public VkBlitImageCubicWeightsInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBlitImageCubicWeightsInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBlitImageCubicWeightsInfoQCOM.npNext(address());
        }

        @NativeType("VkCubicFilterWeightsQCOM")
        public int cubicWeights() {
            return VkBlitImageCubicWeightsInfoQCOM.ncubicWeights(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBlitImageCubicWeightsInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMFilterCubicWeights.VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBlitImageCubicWeightsInfoQCOM.npNext(address(), value);
            return this;
        }

        public Buffer cubicWeights(@NativeType("VkCubicFilterWeightsQCOM") int value) {
            VkBlitImageCubicWeightsInfoQCOM.ncubicWeights(address(), value);
            return this;
        }
    }
}
