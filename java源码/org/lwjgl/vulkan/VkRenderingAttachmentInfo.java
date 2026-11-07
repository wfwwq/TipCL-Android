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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfo.class */
public class VkRenderingAttachmentInfo extends Struct<VkRenderingAttachmentInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGEVIEW;
    public static final int IMAGELAYOUT;
    public static final int RESOLVEMODE;
    public static final int RESOLVEIMAGEVIEW;
    public static final int RESOLVEIMAGELAYOUT;
    public static final int LOADOP;
    public static final int STOREOP;
    public static final int CLEARVALUE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4), __member(8), __member(4), __member(4), __member(4), __member(VkClearValue.SIZEOF, VkClearValue.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEVIEW = layout.offsetof(2);
        IMAGELAYOUT = layout.offsetof(3);
        RESOLVEMODE = layout.offsetof(4);
        RESOLVEIMAGEVIEW = layout.offsetof(5);
        RESOLVEIMAGELAYOUT = layout.offsetof(6);
        LOADOP = layout.offsetof(7);
        STOREOP = layout.offsetof(8);
        CLEARVALUE = layout.offsetof(9);
    }

    protected VkRenderingAttachmentInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderingAttachmentInfo create(long address, ByteBuffer container) {
        return new VkRenderingAttachmentInfo(address, container);
    }

    public VkRenderingAttachmentInfo(ByteBuffer container) {
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

    @NativeType("VkImageLayout")
    public int imageLayout() {
        return nimageLayout(address());
    }

    @NativeType("VkResolveModeFlagBits")
    public int resolveMode() {
        return nresolveMode(address());
    }

    @NativeType("VkImageView")
    public long resolveImageView() {
        return nresolveImageView(address());
    }

    @NativeType("VkImageLayout")
    public int resolveImageLayout() {
        return nresolveImageLayout(address());
    }

    @NativeType("VkAttachmentLoadOp")
    public int loadOp() {
        return nloadOp(address());
    }

    @NativeType("VkAttachmentStoreOp")
    public int storeOp() {
        return nstoreOp(address());
    }

    public VkClearValue clearValue() {
        return nclearValue(address());
    }

    public VkRenderingAttachmentInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderingAttachmentInfo sType$Default() {
        return sType(1000044001);
    }

    public VkRenderingAttachmentInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderingAttachmentInfo pNext(VkAttachmentFeedbackLoopInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingAttachmentInfo pNext(VkRenderingAttachmentFlagsInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingAttachmentInfo imageView(@NativeType("VkImageView") long value) {
        nimageView(address(), value);
        return this;
    }

    public VkRenderingAttachmentInfo imageLayout(@NativeType("VkImageLayout") int value) {
        nimageLayout(address(), value);
        return this;
    }

    public VkRenderingAttachmentInfo resolveMode(@NativeType("VkResolveModeFlagBits") int value) {
        nresolveMode(address(), value);
        return this;
    }

    public VkRenderingAttachmentInfo resolveImageView(@NativeType("VkImageView") long value) {
        nresolveImageView(address(), value);
        return this;
    }

    public VkRenderingAttachmentInfo resolveImageLayout(@NativeType("VkImageLayout") int value) {
        nresolveImageLayout(address(), value);
        return this;
    }

    public VkRenderingAttachmentInfo loadOp(@NativeType("VkAttachmentLoadOp") int value) {
        nloadOp(address(), value);
        return this;
    }

    public VkRenderingAttachmentInfo storeOp(@NativeType("VkAttachmentStoreOp") int value) {
        nstoreOp(address(), value);
        return this;
    }

    public VkRenderingAttachmentInfo clearValue(VkClearValue value) {
        nclearValue(address(), value);
        return this;
    }

    public VkRenderingAttachmentInfo clearValue(Consumer<VkClearValue> consumer) {
        consumer.accept(clearValue());
        return this;
    }

    public VkRenderingAttachmentInfo set(int sType, long pNext, long imageView, int imageLayout, int resolveMode, long resolveImageView, int resolveImageLayout, int loadOp, int storeOp, VkClearValue clearValue) {
        sType(sType);
        pNext(pNext);
        imageView(imageView);
        imageLayout(imageLayout);
        resolveMode(resolveMode);
        resolveImageView(resolveImageView);
        resolveImageLayout(resolveImageLayout);
        loadOp(loadOp);
        storeOp(storeOp);
        clearValue(clearValue);
        return this;
    }

    public VkRenderingAttachmentInfo set(VkRenderingAttachmentInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderingAttachmentInfo malloc() {
        return new VkRenderingAttachmentInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderingAttachmentInfo calloc() {
        return new VkRenderingAttachmentInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderingAttachmentInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingAttachmentInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderingAttachmentInfo create(long address) {
        return new VkRenderingAttachmentInfo(address, null);
    }

    public static VkRenderingAttachmentInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderingAttachmentInfo(address, null);
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

    public static VkRenderingAttachmentInfo malloc(MemoryStack stack) {
        return new VkRenderingAttachmentInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderingAttachmentInfo calloc(MemoryStack stack) {
        return new VkRenderingAttachmentInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nimageLayout(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGELAYOUT);
    }

    public static int nresolveMode(long struct) {
        return MemoryUtil.memGetInt(struct + RESOLVEMODE);
    }

    public static long nresolveImageView(long struct) {
        return MemoryUtil.memGetLong(struct + RESOLVEIMAGEVIEW);
    }

    public static int nresolveImageLayout(long struct) {
        return MemoryUtil.memGetInt(struct + RESOLVEIMAGELAYOUT);
    }

    public static int nloadOp(long struct) {
        return MemoryUtil.memGetInt(struct + LOADOP);
    }

    public static int nstoreOp(long struct) {
        return MemoryUtil.memGetInt(struct + STOREOP);
    }

    public static VkClearValue nclearValue(long struct) {
        return VkClearValue.create(struct + CLEARVALUE);
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

    public static void nimageLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGELAYOUT, value);
    }

    public static void nresolveMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESOLVEMODE, value);
    }

    public static void nresolveImageView(long struct, long value) {
        MemoryUtil.memPutLong(struct + RESOLVEIMAGEVIEW, value);
    }

    public static void nresolveImageLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESOLVEIMAGELAYOUT, value);
    }

    public static void nloadOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOADOP, value);
    }

    public static void nstoreOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + STOREOP, value);
    }

    public static void nclearValue(long struct, VkClearValue value) {
        MemoryUtil.memCopy(value.address(), struct + CLEARVALUE, VkClearValue.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderingAttachmentInfo, Buffer> implements NativeResource {
        private static final VkRenderingAttachmentInfo ELEMENT_FACTORY = VkRenderingAttachmentInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderingAttachmentInfo.SIZEOF);
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
        public VkRenderingAttachmentInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderingAttachmentInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderingAttachmentInfo.npNext(address());
        }

        @NativeType("VkImageView")
        public long imageView() {
            return VkRenderingAttachmentInfo.nimageView(address());
        }

        @NativeType("VkImageLayout")
        public int imageLayout() {
            return VkRenderingAttachmentInfo.nimageLayout(address());
        }

        @NativeType("VkResolveModeFlagBits")
        public int resolveMode() {
            return VkRenderingAttachmentInfo.nresolveMode(address());
        }

        @NativeType("VkImageView")
        public long resolveImageView() {
            return VkRenderingAttachmentInfo.nresolveImageView(address());
        }

        @NativeType("VkImageLayout")
        public int resolveImageLayout() {
            return VkRenderingAttachmentInfo.nresolveImageLayout(address());
        }

        @NativeType("VkAttachmentLoadOp")
        public int loadOp() {
            return VkRenderingAttachmentInfo.nloadOp(address());
        }

        @NativeType("VkAttachmentStoreOp")
        public int storeOp() {
            return VkRenderingAttachmentInfo.nstoreOp(address());
        }

        public VkClearValue clearValue() {
            return VkRenderingAttachmentInfo.nclearValue(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderingAttachmentInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000044001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderingAttachmentInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkAttachmentFeedbackLoopInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderingAttachmentFlagsInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer imageView(@NativeType("VkImageView") long value) {
            VkRenderingAttachmentInfo.nimageView(address(), value);
            return this;
        }

        public Buffer imageLayout(@NativeType("VkImageLayout") int value) {
            VkRenderingAttachmentInfo.nimageLayout(address(), value);
            return this;
        }

        public Buffer resolveMode(@NativeType("VkResolveModeFlagBits") int value) {
            VkRenderingAttachmentInfo.nresolveMode(address(), value);
            return this;
        }

        public Buffer resolveImageView(@NativeType("VkImageView") long value) {
            VkRenderingAttachmentInfo.nresolveImageView(address(), value);
            return this;
        }

        public Buffer resolveImageLayout(@NativeType("VkImageLayout") int value) {
            VkRenderingAttachmentInfo.nresolveImageLayout(address(), value);
            return this;
        }

        public Buffer loadOp(@NativeType("VkAttachmentLoadOp") int value) {
            VkRenderingAttachmentInfo.nloadOp(address(), value);
            return this;
        }

        public Buffer storeOp(@NativeType("VkAttachmentStoreOp") int value) {
            VkRenderingAttachmentInfo.nstoreOp(address(), value);
            return this;
        }

        public Buffer clearValue(VkClearValue value) {
            VkRenderingAttachmentInfo.nclearValue(address(), value);
            return this;
        }

        public Buffer clearValue(Consumer<VkClearValue> consumer) {
            consumer.accept(clearValue());
            return this;
        }
    }
}
