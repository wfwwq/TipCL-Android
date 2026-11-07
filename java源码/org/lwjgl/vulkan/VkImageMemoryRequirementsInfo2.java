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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryRequirementsInfo2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryRequirementsInfo2.class */
public class VkImageMemoryRequirementsInfo2 extends Struct<VkImageMemoryRequirementsInfo2> implements NativeResource {
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

    protected VkImageMemoryRequirementsInfo2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageMemoryRequirementsInfo2 create(long address, ByteBuffer container) {
        return new VkImageMemoryRequirementsInfo2(address, container);
    }

    public VkImageMemoryRequirementsInfo2(ByteBuffer container) {
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

    public VkImageMemoryRequirementsInfo2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageMemoryRequirementsInfo2 sType$Default() {
        return sType(1000146001);
    }

    public VkImageMemoryRequirementsInfo2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageMemoryRequirementsInfo2 pNext(VkImagePlaneMemoryRequirementsInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageMemoryRequirementsInfo2 pNext(VkImagePlaneMemoryRequirementsInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageMemoryRequirementsInfo2 image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    public VkImageMemoryRequirementsInfo2 set(int sType, long pNext, long image) {
        sType(sType);
        pNext(pNext);
        image(image);
        return this;
    }

    public VkImageMemoryRequirementsInfo2 set(VkImageMemoryRequirementsInfo2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageMemoryRequirementsInfo2 malloc() {
        return new VkImageMemoryRequirementsInfo2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageMemoryRequirementsInfo2 calloc() {
        return new VkImageMemoryRequirementsInfo2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageMemoryRequirementsInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageMemoryRequirementsInfo2(MemoryUtil.memAddress(container), container);
    }

    public static VkImageMemoryRequirementsInfo2 create(long address) {
        return new VkImageMemoryRequirementsInfo2(address, null);
    }

    public static VkImageMemoryRequirementsInfo2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageMemoryRequirementsInfo2(address, null);
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

    public static VkImageMemoryRequirementsInfo2 malloc(MemoryStack stack) {
        return new VkImageMemoryRequirementsInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageMemoryRequirementsInfo2 calloc(MemoryStack stack) {
        return new VkImageMemoryRequirementsInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryRequirementsInfo2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryRequirementsInfo2$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageMemoryRequirementsInfo2, Buffer> implements NativeResource {
        private static final VkImageMemoryRequirementsInfo2 ELEMENT_FACTORY = VkImageMemoryRequirementsInfo2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageMemoryRequirementsInfo2.SIZEOF);
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
        public VkImageMemoryRequirementsInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageMemoryRequirementsInfo2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageMemoryRequirementsInfo2.npNext(address());
        }

        @NativeType("VkImage")
        public long image() {
            return VkImageMemoryRequirementsInfo2.nimage(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageMemoryRequirementsInfo2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000146001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageMemoryRequirementsInfo2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkImagePlaneMemoryRequirementsInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImagePlaneMemoryRequirementsInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer image(@NativeType("VkImage") long value) {
            VkImageMemoryRequirementsInfo2.nimage(address(), value);
            return this;
        }
    }
}
