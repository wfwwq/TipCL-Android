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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewCaptureDescriptorDataInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewCaptureDescriptorDataInfoEXT.class */
public class VkImageViewCaptureDescriptorDataInfoEXT extends Struct<VkImageViewCaptureDescriptorDataInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGEVIEW;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEVIEW = layout.offsetof(2);
    }

    protected VkImageViewCaptureDescriptorDataInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageViewCaptureDescriptorDataInfoEXT create(long address, ByteBuffer container) {
        return new VkImageViewCaptureDescriptorDataInfoEXT(address, container);
    }

    public VkImageViewCaptureDescriptorDataInfoEXT(ByteBuffer container) {
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

    @NativeType("VkImageView")
    public long imageView() {
        return nimageView(address());
    }

    public VkImageViewCaptureDescriptorDataInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageViewCaptureDescriptorDataInfoEXT sType$Default() {
        return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
    }

    public VkImageViewCaptureDescriptorDataInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageViewCaptureDescriptorDataInfoEXT imageView(@NativeType("VkImageView") long value) {
        nimageView(address(), value);
        return this;
    }

    public VkImageViewCaptureDescriptorDataInfoEXT set(int sType, long pNext, long imageView) {
        sType(sType);
        pNext(pNext);
        imageView(imageView);
        return this;
    }

    public VkImageViewCaptureDescriptorDataInfoEXT set(VkImageViewCaptureDescriptorDataInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageViewCaptureDescriptorDataInfoEXT malloc() {
        return new VkImageViewCaptureDescriptorDataInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageViewCaptureDescriptorDataInfoEXT calloc() {
        return new VkImageViewCaptureDescriptorDataInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageViewCaptureDescriptorDataInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewCaptureDescriptorDataInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImageViewCaptureDescriptorDataInfoEXT create(long address) {
        return new VkImageViewCaptureDescriptorDataInfoEXT(address, null);
    }

    public static VkImageViewCaptureDescriptorDataInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageViewCaptureDescriptorDataInfoEXT(address, null);
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

    public static VkImageViewCaptureDescriptorDataInfoEXT malloc(MemoryStack stack) {
        return new VkImageViewCaptureDescriptorDataInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageViewCaptureDescriptorDataInfoEXT calloc(MemoryStack stack) {
        return new VkImageViewCaptureDescriptorDataInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nimageView(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGEVIEW);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimageView(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGEVIEW, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewCaptureDescriptorDataInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewCaptureDescriptorDataInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageViewCaptureDescriptorDataInfoEXT, Buffer> implements NativeResource {
        private static final VkImageViewCaptureDescriptorDataInfoEXT ELEMENT_FACTORY = VkImageViewCaptureDescriptorDataInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageViewCaptureDescriptorDataInfoEXT.SIZEOF);
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
        public VkImageViewCaptureDescriptorDataInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageViewCaptureDescriptorDataInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageViewCaptureDescriptorDataInfoEXT.npNext(address());
        }

        @NativeType("VkImageView")
        public long imageView() {
            return VkImageViewCaptureDescriptorDataInfoEXT.nimageView(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageViewCaptureDescriptorDataInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageViewCaptureDescriptorDataInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer imageView(@NativeType("VkImageView") long value) {
            VkImageViewCaptureDescriptorDataInfoEXT.nimageView(address(), value);
            return this;
        }
    }
}
