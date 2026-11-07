package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkInputAttachmentAspectReference;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassInputAttachmentAspectCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassInputAttachmentAspectCreateInfo.class */
public class VkRenderPassInputAttachmentAspectCreateInfo extends Struct<VkRenderPassInputAttachmentAspectCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ASPECTREFERENCECOUNT;
    public static final int PASPECTREFERENCES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ASPECTREFERENCECOUNT = layout.offsetof(2);
        PASPECTREFERENCES = layout.offsetof(3);
    }

    protected VkRenderPassInputAttachmentAspectCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassInputAttachmentAspectCreateInfo create(long address, ByteBuffer container) {
        return new VkRenderPassInputAttachmentAspectCreateInfo(address, container);
    }

    public VkRenderPassInputAttachmentAspectCreateInfo(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int aspectReferenceCount() {
        return naspectReferenceCount(address());
    }

    @NativeType("VkInputAttachmentAspectReference const *")
    public VkInputAttachmentAspectReference.Buffer pAspectReferences() {
        return npAspectReferences(address());
    }

    public VkRenderPassInputAttachmentAspectCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassInputAttachmentAspectCreateInfo sType$Default() {
        return sType(1000117001);
    }

    public VkRenderPassInputAttachmentAspectCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassInputAttachmentAspectCreateInfo pAspectReferences(@NativeType("VkInputAttachmentAspectReference const *") VkInputAttachmentAspectReference.Buffer value) {
        npAspectReferences(address(), value);
        return this;
    }

    public VkRenderPassInputAttachmentAspectCreateInfo set(int sType, long pNext, VkInputAttachmentAspectReference.Buffer pAspectReferences) {
        sType(sType);
        pNext(pNext);
        pAspectReferences(pAspectReferences);
        return this;
    }

    public VkRenderPassInputAttachmentAspectCreateInfo set(VkRenderPassInputAttachmentAspectCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo malloc() {
        return new VkRenderPassInputAttachmentAspectCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo calloc() {
        return new VkRenderPassInputAttachmentAspectCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassInputAttachmentAspectCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo create(long address) {
        return new VkRenderPassInputAttachmentAspectCreateInfo(address, null);
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassInputAttachmentAspectCreateInfo(address, null);
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

    public static VkRenderPassInputAttachmentAspectCreateInfo malloc(MemoryStack stack) {
        return new VkRenderPassInputAttachmentAspectCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo calloc(MemoryStack stack) {
        return new VkRenderPassInputAttachmentAspectCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int naspectReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + ASPECTREFERENCECOUNT);
    }

    public static VkInputAttachmentAspectReference.Buffer npAspectReferences(long struct) {
        return VkInputAttachmentAspectReference.create(MemoryUtil.memGetAddress(struct + PASPECTREFERENCES), naspectReferenceCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void naspectReferenceCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ASPECTREFERENCECOUNT, value);
    }

    public static void npAspectReferences(long struct, VkInputAttachmentAspectReference.Buffer value) {
        MemoryUtil.memPutAddress(struct + PASPECTREFERENCES, value.address());
        naspectReferenceCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PASPECTREFERENCES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassInputAttachmentAspectCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassInputAttachmentAspectCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassInputAttachmentAspectCreateInfo, Buffer> implements NativeResource {
        private static final VkRenderPassInputAttachmentAspectCreateInfo ELEMENT_FACTORY = VkRenderPassInputAttachmentAspectCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassInputAttachmentAspectCreateInfo.SIZEOF);
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
        public VkRenderPassInputAttachmentAspectCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassInputAttachmentAspectCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassInputAttachmentAspectCreateInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int aspectReferenceCount() {
            return VkRenderPassInputAttachmentAspectCreateInfo.naspectReferenceCount(address());
        }

        @NativeType("VkInputAttachmentAspectReference const *")
        public VkInputAttachmentAspectReference.Buffer pAspectReferences() {
            return VkRenderPassInputAttachmentAspectCreateInfo.npAspectReferences(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassInputAttachmentAspectCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000117001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassInputAttachmentAspectCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pAspectReferences(@NativeType("VkInputAttachmentAspectReference const *") VkInputAttachmentAspectReference.Buffer value) {
            VkRenderPassInputAttachmentAspectCreateInfo.npAspectReferences(address(), value);
            return this;
        }
    }
}
