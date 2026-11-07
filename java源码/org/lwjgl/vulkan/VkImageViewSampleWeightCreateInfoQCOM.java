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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewSampleWeightCreateInfoQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewSampleWeightCreateInfoQCOM.class */
public class VkImageViewSampleWeightCreateInfoQCOM extends Struct<VkImageViewSampleWeightCreateInfoQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FILTERCENTER;
    public static final int FILTERSIZE;
    public static final int NUMPHASES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FILTERCENTER = layout.offsetof(2);
        FILTERSIZE = layout.offsetof(3);
        NUMPHASES = layout.offsetof(4);
    }

    protected VkImageViewSampleWeightCreateInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageViewSampleWeightCreateInfoQCOM create(long address, ByteBuffer container) {
        return new VkImageViewSampleWeightCreateInfoQCOM(address, container);
    }

    public VkImageViewSampleWeightCreateInfoQCOM(ByteBuffer container) {
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

    public VkOffset2D filterCenter() {
        return nfilterCenter(address());
    }

    public VkExtent2D filterSize() {
        return nfilterSize(address());
    }

    @NativeType("uint32_t")
    public int numPhases() {
        return nnumPhases(address());
    }

    public VkImageViewSampleWeightCreateInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageViewSampleWeightCreateInfoQCOM sType$Default() {
        return sType(QCOMImageProcessing.VK_STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM);
    }

    public VkImageViewSampleWeightCreateInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageViewSampleWeightCreateInfoQCOM filterCenter(VkOffset2D value) {
        nfilterCenter(address(), value);
        return this;
    }

    public VkImageViewSampleWeightCreateInfoQCOM filterCenter(Consumer<VkOffset2D> consumer) {
        consumer.accept(filterCenter());
        return this;
    }

    public VkImageViewSampleWeightCreateInfoQCOM filterSize(VkExtent2D value) {
        nfilterSize(address(), value);
        return this;
    }

    public VkImageViewSampleWeightCreateInfoQCOM filterSize(Consumer<VkExtent2D> consumer) {
        consumer.accept(filterSize());
        return this;
    }

    public VkImageViewSampleWeightCreateInfoQCOM numPhases(@NativeType("uint32_t") int value) {
        nnumPhases(address(), value);
        return this;
    }

    public VkImageViewSampleWeightCreateInfoQCOM set(int sType, long pNext, VkOffset2D filterCenter, VkExtent2D filterSize, int numPhases) {
        sType(sType);
        pNext(pNext);
        filterCenter(filterCenter);
        filterSize(filterSize);
        numPhases(numPhases);
        return this;
    }

    public VkImageViewSampleWeightCreateInfoQCOM set(VkImageViewSampleWeightCreateInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageViewSampleWeightCreateInfoQCOM malloc() {
        return new VkImageViewSampleWeightCreateInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageViewSampleWeightCreateInfoQCOM calloc() {
        return new VkImageViewSampleWeightCreateInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageViewSampleWeightCreateInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewSampleWeightCreateInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkImageViewSampleWeightCreateInfoQCOM create(long address) {
        return new VkImageViewSampleWeightCreateInfoQCOM(address, null);
    }

    public static VkImageViewSampleWeightCreateInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageViewSampleWeightCreateInfoQCOM(address, null);
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

    public static VkImageViewSampleWeightCreateInfoQCOM malloc(MemoryStack stack) {
        return new VkImageViewSampleWeightCreateInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageViewSampleWeightCreateInfoQCOM calloc(MemoryStack stack) {
        return new VkImageViewSampleWeightCreateInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkOffset2D nfilterCenter(long struct) {
        return VkOffset2D.create(struct + FILTERCENTER);
    }

    public static VkExtent2D nfilterSize(long struct) {
        return VkExtent2D.create(struct + FILTERSIZE);
    }

    public static int nnumPhases(long struct) {
        return MemoryUtil.memGetInt(struct + NUMPHASES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nfilterCenter(long struct, VkOffset2D value) {
        MemoryUtil.memCopy(value.address(), struct + FILTERCENTER, VkOffset2D.SIZEOF);
    }

    public static void nfilterSize(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + FILTERSIZE, VkExtent2D.SIZEOF);
    }

    public static void nnumPhases(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUMPHASES, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewSampleWeightCreateInfoQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewSampleWeightCreateInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageViewSampleWeightCreateInfoQCOM, Buffer> implements NativeResource {
        private static final VkImageViewSampleWeightCreateInfoQCOM ELEMENT_FACTORY = VkImageViewSampleWeightCreateInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageViewSampleWeightCreateInfoQCOM.SIZEOF);
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
        public VkImageViewSampleWeightCreateInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageViewSampleWeightCreateInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageViewSampleWeightCreateInfoQCOM.npNext(address());
        }

        public VkOffset2D filterCenter() {
            return VkImageViewSampleWeightCreateInfoQCOM.nfilterCenter(address());
        }

        public VkExtent2D filterSize() {
            return VkImageViewSampleWeightCreateInfoQCOM.nfilterSize(address());
        }

        @NativeType("uint32_t")
        public int numPhases() {
            return VkImageViewSampleWeightCreateInfoQCOM.nnumPhases(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageViewSampleWeightCreateInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMImageProcessing.VK_STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageViewSampleWeightCreateInfoQCOM.npNext(address(), value);
            return this;
        }

        public Buffer filterCenter(VkOffset2D value) {
            VkImageViewSampleWeightCreateInfoQCOM.nfilterCenter(address(), value);
            return this;
        }

        public Buffer filterCenter(Consumer<VkOffset2D> consumer) {
            consumer.accept(filterCenter());
            return this;
        }

        public Buffer filterSize(VkExtent2D value) {
            VkImageViewSampleWeightCreateInfoQCOM.nfilterSize(address(), value);
            return this;
        }

        public Buffer filterSize(Consumer<VkExtent2D> consumer) {
            consumer.accept(filterSize());
            return this;
        }

        public Buffer numPhases(@NativeType("uint32_t") int value) {
            VkImageViewSampleWeightCreateInfoQCOM.nnumPhases(address(), value);
            return this;
        }
    }
}
