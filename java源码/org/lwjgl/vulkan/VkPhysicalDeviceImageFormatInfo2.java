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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageFormatInfo2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageFormatInfo2.class */
public class VkPhysicalDeviceImageFormatInfo2 extends Struct<VkPhysicalDeviceImageFormatInfo2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FORMAT;
    public static final int TYPE;
    public static final int TILING;
    public static final int USAGE;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        TYPE = layout.offsetof(3);
        TILING = layout.offsetof(4);
        USAGE = layout.offsetof(5);
        FLAGS = layout.offsetof(6);
    }

    protected VkPhysicalDeviceImageFormatInfo2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceImageFormatInfo2 create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageFormatInfo2(address, container);
    }

    public VkPhysicalDeviceImageFormatInfo2(ByteBuffer container) {
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

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("VkImageType")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkImageTiling")
    public int tiling() {
        return ntiling(address());
    }

    @NativeType("VkImageUsageFlags")
    public int usage() {
        return nusage(address());
    }

    @NativeType("VkImageCreateFlags")
    public int flags() {
        return nflags(address());
    }

    public VkPhysicalDeviceImageFormatInfo2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageFormatInfo2 sType$Default() {
        return sType(1000059004);
    }

    public VkPhysicalDeviceImageFormatInfo2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageCompressionControlEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageFormatListCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageFormatListCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageStencilUsageCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageStencilUsageCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceImageFormatInfo2 pNext(VkOpticalFlowImageFormatInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceImageFormatInfo2 pNext(VkPhysicalDeviceExternalImageFormatInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceImageFormatInfo2 pNext(VkPhysicalDeviceExternalImageFormatInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceImageFormatInfo2 pNext(VkPhysicalDeviceImageDrmFormatModifierInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceImageFormatInfo2 pNext(VkPhysicalDeviceImageViewImageFormatInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceImageFormatInfo2 pNext(VkVideoProfileListInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceImageFormatInfo2 format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageFormatInfo2 type(@NativeType("VkImageType") int value) {
        ntype(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageFormatInfo2 tiling(@NativeType("VkImageTiling") int value) {
        ntiling(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageFormatInfo2 usage(@NativeType("VkImageUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageFormatInfo2 flags(@NativeType("VkImageCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageFormatInfo2 set(int sType, long pNext, int format, int type, int tiling, int usage, int flags) {
        sType(sType);
        pNext(pNext);
        format(format);
        type(type);
        tiling(tiling);
        usage(usage);
        flags(flags);
        return this;
    }

    public VkPhysicalDeviceImageFormatInfo2 set(VkPhysicalDeviceImageFormatInfo2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageFormatInfo2 malloc() {
        return new VkPhysicalDeviceImageFormatInfo2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageFormatInfo2 calloc() {
        return new VkPhysicalDeviceImageFormatInfo2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageFormatInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageFormatInfo2(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageFormatInfo2 create(long address) {
        return new VkPhysicalDeviceImageFormatInfo2(address, null);
    }

    public static VkPhysicalDeviceImageFormatInfo2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageFormatInfo2(address, null);
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

    public static VkPhysicalDeviceImageFormatInfo2 malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageFormatInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageFormatInfo2 calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageFormatInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int ntiling(long struct) {
        return MemoryUtil.memGetInt(struct + TILING);
    }

    public static int nusage(long struct) {
        return MemoryUtil.memGetInt(struct + USAGE);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void ntiling(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILING, value);
    }

    public static void nusage(long struct, int value) {
        MemoryUtil.memPutInt(struct + USAGE, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageFormatInfo2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageFormatInfo2$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageFormatInfo2, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceImageFormatInfo2 ELEMENT_FACTORY = VkPhysicalDeviceImageFormatInfo2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceImageFormatInfo2.SIZEOF);
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
        public VkPhysicalDeviceImageFormatInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceImageFormatInfo2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPhysicalDeviceImageFormatInfo2.npNext(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkPhysicalDeviceImageFormatInfo2.nformat(address());
        }

        @NativeType("VkImageType")
        public int type() {
            return VkPhysicalDeviceImageFormatInfo2.ntype(address());
        }

        @NativeType("VkImageTiling")
        public int tiling() {
            return VkPhysicalDeviceImageFormatInfo2.ntiling(address());
        }

        @NativeType("VkImageUsageFlags")
        public int usage() {
            return VkPhysicalDeviceImageFormatInfo2.nusage(address());
        }

        @NativeType("VkImageCreateFlags")
        public int flags() {
            return VkPhysicalDeviceImageFormatInfo2.nflags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageFormatInfo2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000059004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceImageFormatInfo2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkImageCompressionControlEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageFormatListCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageFormatListCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageStencilUsageCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageStencilUsageCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkOpticalFlowImageFormatInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExternalImageFormatInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExternalImageFormatInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageDrmFormatModifierInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageViewImageFormatInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoProfileListInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkPhysicalDeviceImageFormatInfo2.nformat(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkImageType") int value) {
            VkPhysicalDeviceImageFormatInfo2.ntype(address(), value);
            return this;
        }

        public Buffer tiling(@NativeType("VkImageTiling") int value) {
            VkPhysicalDeviceImageFormatInfo2.ntiling(address(), value);
            return this;
        }

        public Buffer usage(@NativeType("VkImageUsageFlags") int value) {
            VkPhysicalDeviceImageFormatInfo2.nusage(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkImageCreateFlags") int value) {
            VkPhysicalDeviceImageFormatInfo2.nflags(address(), value);
            return this;
        }
    }
}
