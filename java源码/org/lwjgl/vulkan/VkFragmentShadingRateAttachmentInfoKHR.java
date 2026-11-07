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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFragmentShadingRateAttachmentInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFragmentShadingRateAttachmentInfoKHR.class */
public class VkFragmentShadingRateAttachmentInfoKHR extends Struct<VkFragmentShadingRateAttachmentInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PFRAGMENTSHADINGRATEATTACHMENT;
    public static final int SHADINGRATEATTACHMENTTEXELSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PFRAGMENTSHADINGRATEATTACHMENT = layout.offsetof(2);
        SHADINGRATEATTACHMENTTEXELSIZE = layout.offsetof(3);
    }

    protected VkFragmentShadingRateAttachmentInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkFragmentShadingRateAttachmentInfoKHR create(long address, ByteBuffer container) {
        return new VkFragmentShadingRateAttachmentInfoKHR(address, container);
    }

    public VkFragmentShadingRateAttachmentInfoKHR(ByteBuffer container) {
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

    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2 pFragmentShadingRateAttachment() {
        return npFragmentShadingRateAttachment(address());
    }

    public VkExtent2D shadingRateAttachmentTexelSize() {
        return nshadingRateAttachmentTexelSize(address());
    }

    public VkFragmentShadingRateAttachmentInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkFragmentShadingRateAttachmentInfoKHR sType$Default() {
        return sType(1000226000);
    }

    public VkFragmentShadingRateAttachmentInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkFragmentShadingRateAttachmentInfoKHR pFragmentShadingRateAttachment(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) {
        npFragmentShadingRateAttachment(address(), value);
        return this;
    }

    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(VkExtent2D value) {
        nshadingRateAttachmentTexelSize(address(), value);
        return this;
    }

    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(Consumer<VkExtent2D> consumer) {
        consumer.accept(shadingRateAttachmentTexelSize());
        return this;
    }

    public VkFragmentShadingRateAttachmentInfoKHR set(int sType, long pNext, VkAttachmentReference2 pFragmentShadingRateAttachment, VkExtent2D shadingRateAttachmentTexelSize) {
        sType(sType);
        pNext(pNext);
        pFragmentShadingRateAttachment(pFragmentShadingRateAttachment);
        shadingRateAttachmentTexelSize(shadingRateAttachmentTexelSize);
        return this;
    }

    public VkFragmentShadingRateAttachmentInfoKHR set(VkFragmentShadingRateAttachmentInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkFragmentShadingRateAttachmentInfoKHR malloc() {
        return new VkFragmentShadingRateAttachmentInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkFragmentShadingRateAttachmentInfoKHR calloc() {
        return new VkFragmentShadingRateAttachmentInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkFragmentShadingRateAttachmentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFragmentShadingRateAttachmentInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkFragmentShadingRateAttachmentInfoKHR create(long address) {
        return new VkFragmentShadingRateAttachmentInfoKHR(address, null);
    }

    public static VkFragmentShadingRateAttachmentInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkFragmentShadingRateAttachmentInfoKHR(address, null);
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

    public static VkFragmentShadingRateAttachmentInfoKHR malloc(MemoryStack stack) {
        return new VkFragmentShadingRateAttachmentInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkFragmentShadingRateAttachmentInfoKHR calloc(MemoryStack stack) {
        return new VkFragmentShadingRateAttachmentInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkAttachmentReference2 npFragmentShadingRateAttachment(long struct) {
        return VkAttachmentReference2.createSafe(MemoryUtil.memGetAddress(struct + PFRAGMENTSHADINGRATEATTACHMENT));
    }

    public static VkExtent2D nshadingRateAttachmentTexelSize(long struct) {
        return VkExtent2D.create(struct + SHADINGRATEATTACHMENTTEXELSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npFragmentShadingRateAttachment(long struct, VkAttachmentReference2 value) {
        MemoryUtil.memPutAddress(struct + PFRAGMENTSHADINGRATEATTACHMENT, MemoryUtil.memAddressSafe(value));
    }

    public static void nshadingRateAttachmentTexelSize(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + SHADINGRATEATTACHMENTTEXELSIZE, VkExtent2D.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFragmentShadingRateAttachmentInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFragmentShadingRateAttachmentInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkFragmentShadingRateAttachmentInfoKHR, Buffer> implements NativeResource {
        private static final VkFragmentShadingRateAttachmentInfoKHR ELEMENT_FACTORY = VkFragmentShadingRateAttachmentInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkFragmentShadingRateAttachmentInfoKHR.SIZEOF);
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
        public VkFragmentShadingRateAttachmentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkFragmentShadingRateAttachmentInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkFragmentShadingRateAttachmentInfoKHR.npNext(address());
        }

        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2 pFragmentShadingRateAttachment() {
            return VkFragmentShadingRateAttachmentInfoKHR.npFragmentShadingRateAttachment(address());
        }

        public VkExtent2D shadingRateAttachmentTexelSize() {
            return VkFragmentShadingRateAttachmentInfoKHR.nshadingRateAttachmentTexelSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkFragmentShadingRateAttachmentInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000226000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkFragmentShadingRateAttachmentInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pFragmentShadingRateAttachment(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) {
            VkFragmentShadingRateAttachmentInfoKHR.npFragmentShadingRateAttachment(address(), value);
            return this;
        }

        public Buffer shadingRateAttachmentTexelSize(VkExtent2D value) {
            VkFragmentShadingRateAttachmentInfoKHR.nshadingRateAttachmentTexelSize(address(), value);
            return this;
        }

        public Buffer shadingRateAttachmentTexelSize(Consumer<VkExtent2D> consumer) {
            consumer.accept(shadingRateAttachmentTexelSize());
            return this;
        }
    }
}
