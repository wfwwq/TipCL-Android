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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewCreateInfo.class */
public class VkImageViewCreateInfo extends Struct<VkImageViewCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int IMAGE;
    public static final int VIEWTYPE;
    public static final int FORMAT;
    public static final int COMPONENTS;
    public static final int SUBRESOURCERANGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(4), __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF), __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        IMAGE = layout.offsetof(3);
        VIEWTYPE = layout.offsetof(4);
        FORMAT = layout.offsetof(5);
        COMPONENTS = layout.offsetof(6);
        SUBRESOURCERANGE = layout.offsetof(7);
    }

    protected VkImageViewCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageViewCreateInfo create(long address, ByteBuffer container) {
        return new VkImageViewCreateInfo(address, container);
    }

    public VkImageViewCreateInfo(ByteBuffer container) {
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

    @NativeType("VkImageViewCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkImage")
    public long image() {
        return nimage(address());
    }

    @NativeType("VkImageViewType")
    public int viewType() {
        return nviewType(address());
    }

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    public VkComponentMapping components() {
        return ncomponents(address());
    }

    public VkImageSubresourceRange subresourceRange() {
        return nsubresourceRange(address());
    }

    public VkImageViewCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageViewCreateInfo sType$Default() {
        return sType(15);
    }

    public VkImageViewCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageViewCreateInfo pNext(VkExportMetalObjectCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageViewCreateInfo pNext(VkImageViewASTCDecodeModeEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageViewCreateInfo pNext(VkImageViewMinLodCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageViewCreateInfo pNext(VkImageViewSampleWeightCreateInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageViewCreateInfo pNext(VkImageViewSlicedCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageViewCreateInfo pNext(VkImageViewUsageCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageViewCreateInfo pNext(VkImageViewUsageCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageViewCreateInfo pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageViewCreateInfo pNext(VkSamplerYcbcrConversionInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageViewCreateInfo pNext(VkSamplerYcbcrConversionInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageViewCreateInfo flags(@NativeType("VkImageViewCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkImageViewCreateInfo image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    public VkImageViewCreateInfo viewType(@NativeType("VkImageViewType") int value) {
        nviewType(address(), value);
        return this;
    }

    public VkImageViewCreateInfo format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkImageViewCreateInfo components(VkComponentMapping value) {
        ncomponents(address(), value);
        return this;
    }

    public VkImageViewCreateInfo components(Consumer<VkComponentMapping> consumer) {
        consumer.accept(components());
        return this;
    }

    public VkImageViewCreateInfo subresourceRange(VkImageSubresourceRange value) {
        nsubresourceRange(address(), value);
        return this;
    }

    public VkImageViewCreateInfo subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
        consumer.accept(subresourceRange());
        return this;
    }

    public VkImageViewCreateInfo set(int sType, long pNext, int flags, long image, int viewType, int format, VkComponentMapping components, VkImageSubresourceRange subresourceRange) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        image(image);
        viewType(viewType);
        format(format);
        components(components);
        subresourceRange(subresourceRange);
        return this;
    }

    public VkImageViewCreateInfo set(VkImageViewCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageViewCreateInfo malloc() {
        return new VkImageViewCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageViewCreateInfo calloc() {
        return new VkImageViewCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageViewCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkImageViewCreateInfo create(long address) {
        return new VkImageViewCreateInfo(address, null);
    }

    public static VkImageViewCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageViewCreateInfo(address, null);
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

    public static VkImageViewCreateInfo malloc(MemoryStack stack) {
        return new VkImageViewCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageViewCreateInfo calloc(MemoryStack stack) {
        return new VkImageViewCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nimage(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGE);
    }

    public static int nviewType(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWTYPE);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static VkComponentMapping ncomponents(long struct) {
        return VkComponentMapping.create(struct + COMPONENTS);
    }

    public static VkImageSubresourceRange nsubresourceRange(long struct) {
        return VkImageSubresourceRange.create(struct + SUBRESOURCERANGE);
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

    public static void nimage(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGE, value);
    }

    public static void nviewType(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWTYPE, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void ncomponents(long struct, VkComponentMapping value) {
        MemoryUtil.memCopy(value.address(), struct + COMPONENTS, VkComponentMapping.SIZEOF);
    }

    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) {
        MemoryUtil.memCopy(value.address(), struct + SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageViewCreateInfo, Buffer> implements NativeResource {
        private static final VkImageViewCreateInfo ELEMENT_FACTORY = VkImageViewCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageViewCreateInfo.SIZEOF);
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
        public VkImageViewCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageViewCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageViewCreateInfo.npNext(address());
        }

        @NativeType("VkImageViewCreateFlags")
        public int flags() {
            return VkImageViewCreateInfo.nflags(address());
        }

        @NativeType("VkImage")
        public long image() {
            return VkImageViewCreateInfo.nimage(address());
        }

        @NativeType("VkImageViewType")
        public int viewType() {
            return VkImageViewCreateInfo.nviewType(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkImageViewCreateInfo.nformat(address());
        }

        public VkComponentMapping components() {
            return VkImageViewCreateInfo.ncomponents(address());
        }

        public VkImageSubresourceRange subresourceRange() {
            return VkImageViewCreateInfo.nsubresourceRange(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageViewCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(15);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageViewCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkExportMetalObjectCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageViewASTCDecodeModeEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageViewMinLodCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageViewSampleWeightCreateInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageViewSlicedCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageViewUsageCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageViewUsageCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerYcbcrConversionInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerYcbcrConversionInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkImageViewCreateFlags") int value) {
            VkImageViewCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer image(@NativeType("VkImage") long value) {
            VkImageViewCreateInfo.nimage(address(), value);
            return this;
        }

        public Buffer viewType(@NativeType("VkImageViewType") int value) {
            VkImageViewCreateInfo.nviewType(address(), value);
            return this;
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkImageViewCreateInfo.nformat(address(), value);
            return this;
        }

        public Buffer components(VkComponentMapping value) {
            VkImageViewCreateInfo.ncomponents(address(), value);
            return this;
        }

        public Buffer components(Consumer<VkComponentMapping> consumer) {
            consumer.accept(components());
            return this;
        }

        public Buffer subresourceRange(VkImageSubresourceRange value) {
            VkImageViewCreateInfo.nsubresourceRange(address(), value);
            return this;
        }

        public Buffer subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
            consumer.accept(subresourceRange());
            return this;
        }
    }
}
