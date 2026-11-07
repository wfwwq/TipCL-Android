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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowImageFormatInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowImageFormatInfoNV.class */
public class VkOpticalFlowImageFormatInfoNV extends Struct<VkOpticalFlowImageFormatInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int USAGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USAGE = layout.offsetof(2);
    }

    protected VkOpticalFlowImageFormatInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkOpticalFlowImageFormatInfoNV create(long address, ByteBuffer container) {
        return new VkOpticalFlowImageFormatInfoNV(address, container);
    }

    public VkOpticalFlowImageFormatInfoNV(ByteBuffer container) {
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

    @NativeType("VkOpticalFlowUsageFlagsNV")
    public int usage() {
        return nusage(address());
    }

    public VkOpticalFlowImageFormatInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkOpticalFlowImageFormatInfoNV sType$Default() {
        return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV);
    }

    public VkOpticalFlowImageFormatInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkOpticalFlowImageFormatInfoNV usage(@NativeType("VkOpticalFlowUsageFlagsNV") int value) {
        nusage(address(), value);
        return this;
    }

    public VkOpticalFlowImageFormatInfoNV set(int sType, long pNext, int usage) {
        sType(sType);
        pNext(pNext);
        usage(usage);
        return this;
    }

    public VkOpticalFlowImageFormatInfoNV set(VkOpticalFlowImageFormatInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkOpticalFlowImageFormatInfoNV malloc() {
        return new VkOpticalFlowImageFormatInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkOpticalFlowImageFormatInfoNV calloc() {
        return new VkOpticalFlowImageFormatInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkOpticalFlowImageFormatInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpticalFlowImageFormatInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkOpticalFlowImageFormatInfoNV create(long address) {
        return new VkOpticalFlowImageFormatInfoNV(address, null);
    }

    public static VkOpticalFlowImageFormatInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkOpticalFlowImageFormatInfoNV(address, null);
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

    public static VkOpticalFlowImageFormatInfoNV malloc(MemoryStack stack) {
        return new VkOpticalFlowImageFormatInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkOpticalFlowImageFormatInfoNV calloc(MemoryStack stack) {
        return new VkOpticalFlowImageFormatInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nusage(long struct) {
        return MemoryUtil.memGetInt(struct + USAGE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nusage(long struct, int value) {
        MemoryUtil.memPutInt(struct + USAGE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowImageFormatInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowImageFormatInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkOpticalFlowImageFormatInfoNV, Buffer> implements NativeResource {
        private static final VkOpticalFlowImageFormatInfoNV ELEMENT_FACTORY = VkOpticalFlowImageFormatInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkOpticalFlowImageFormatInfoNV.SIZEOF);
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
        public VkOpticalFlowImageFormatInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkOpticalFlowImageFormatInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkOpticalFlowImageFormatInfoNV.npNext(address());
        }

        @NativeType("VkOpticalFlowUsageFlagsNV")
        public int usage() {
            return VkOpticalFlowImageFormatInfoNV.nusage(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkOpticalFlowImageFormatInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkOpticalFlowImageFormatInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer usage(@NativeType("VkOpticalFlowUsageFlagsNV") int value) {
            VkOpticalFlowImageFormatInfoNV.nusage(address(), value);
            return this;
        }
    }
}
