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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCaptureDescriptorDataInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCaptureDescriptorDataInfoEXT.class */
public class VkImageCaptureDescriptorDataInfoEXT extends Struct<VkImageCaptureDescriptorDataInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
    }

    protected VkImageCaptureDescriptorDataInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageCaptureDescriptorDataInfoEXT create(long address, ByteBuffer container) {
        return new VkImageCaptureDescriptorDataInfoEXT(address, container);
    }

    public VkImageCaptureDescriptorDataInfoEXT(ByteBuffer container) {
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

    @NativeType("VkImage")
    public long image() {
        return nimage(address());
    }

    public VkImageCaptureDescriptorDataInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageCaptureDescriptorDataInfoEXT sType$Default() {
        return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
    }

    public VkImageCaptureDescriptorDataInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageCaptureDescriptorDataInfoEXT image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    public VkImageCaptureDescriptorDataInfoEXT set(int sType, long pNext, long image) {
        sType(sType);
        pNext(pNext);
        image(image);
        return this;
    }

    public VkImageCaptureDescriptorDataInfoEXT set(VkImageCaptureDescriptorDataInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageCaptureDescriptorDataInfoEXT malloc() {
        return new VkImageCaptureDescriptorDataInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageCaptureDescriptorDataInfoEXT calloc() {
        return new VkImageCaptureDescriptorDataInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageCaptureDescriptorDataInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageCaptureDescriptorDataInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImageCaptureDescriptorDataInfoEXT create(long address) {
        return new VkImageCaptureDescriptorDataInfoEXT(address, null);
    }

    public static VkImageCaptureDescriptorDataInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageCaptureDescriptorDataInfoEXT(address, null);
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

    public static VkImageCaptureDescriptorDataInfoEXT malloc(MemoryStack stack) {
        return new VkImageCaptureDescriptorDataInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageCaptureDescriptorDataInfoEXT calloc(MemoryStack stack) {
        return new VkImageCaptureDescriptorDataInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nimage(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimage(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCaptureDescriptorDataInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCaptureDescriptorDataInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageCaptureDescriptorDataInfoEXT, Buffer> implements NativeResource {
        private static final VkImageCaptureDescriptorDataInfoEXT ELEMENT_FACTORY = VkImageCaptureDescriptorDataInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageCaptureDescriptorDataInfoEXT.SIZEOF);
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
        public VkImageCaptureDescriptorDataInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageCaptureDescriptorDataInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageCaptureDescriptorDataInfoEXT.npNext(address());
        }

        @NativeType("VkImage")
        public long image() {
            return VkImageCaptureDescriptorDataInfoEXT.nimage(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageCaptureDescriptorDataInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageCaptureDescriptorDataInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer image(@NativeType("VkImage") long value) {
            VkImageCaptureDescriptorDataInfoEXT.nimage(address(), value);
            return this;
        }
    }
}
