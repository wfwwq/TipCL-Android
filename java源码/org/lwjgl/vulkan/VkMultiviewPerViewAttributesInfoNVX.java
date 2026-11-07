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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiviewPerViewAttributesInfoNVX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiviewPerViewAttributesInfoNVX.class */
public class VkMultiviewPerViewAttributesInfoNVX extends Struct<VkMultiviewPerViewAttributesInfoNVX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PERVIEWATTRIBUTES;
    public static final int PERVIEWATTRIBUTESPOSITIONXONLY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERVIEWATTRIBUTES = layout.offsetof(2);
        PERVIEWATTRIBUTESPOSITIONXONLY = layout.offsetof(3);
    }

    protected VkMultiviewPerViewAttributesInfoNVX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMultiviewPerViewAttributesInfoNVX create(long address, ByteBuffer container) {
        return new VkMultiviewPerViewAttributesInfoNVX(address, container);
    }

    public VkMultiviewPerViewAttributesInfoNVX(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean perViewAttributes() {
        return nperViewAttributes(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean perViewAttributesPositionXOnly() {
        return nperViewAttributesPositionXOnly(address()) != 0;
    }

    public VkMultiviewPerViewAttributesInfoNVX sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMultiviewPerViewAttributesInfoNVX sType$Default() {
        return sType(NVXMultiviewPerViewAttributes.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX);
    }

    public VkMultiviewPerViewAttributesInfoNVX pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMultiviewPerViewAttributesInfoNVX perViewAttributes(@NativeType("VkBool32") boolean value) {
        nperViewAttributes(address(), value ? 1 : 0);
        return this;
    }

    public VkMultiviewPerViewAttributesInfoNVX perViewAttributesPositionXOnly(@NativeType("VkBool32") boolean value) {
        nperViewAttributesPositionXOnly(address(), value ? 1 : 0);
        return this;
    }

    public VkMultiviewPerViewAttributesInfoNVX set(int sType, long pNext, boolean perViewAttributes, boolean perViewAttributesPositionXOnly) {
        sType(sType);
        pNext(pNext);
        perViewAttributes(perViewAttributes);
        perViewAttributesPositionXOnly(perViewAttributesPositionXOnly);
        return this;
    }

    public VkMultiviewPerViewAttributesInfoNVX set(VkMultiviewPerViewAttributesInfoNVX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMultiviewPerViewAttributesInfoNVX malloc() {
        return new VkMultiviewPerViewAttributesInfoNVX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMultiviewPerViewAttributesInfoNVX calloc() {
        return new VkMultiviewPerViewAttributesInfoNVX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMultiviewPerViewAttributesInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMultiviewPerViewAttributesInfoNVX(MemoryUtil.memAddress(container), container);
    }

    public static VkMultiviewPerViewAttributesInfoNVX create(long address) {
        return new VkMultiviewPerViewAttributesInfoNVX(address, null);
    }

    public static VkMultiviewPerViewAttributesInfoNVX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMultiviewPerViewAttributesInfoNVX(address, null);
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

    public static VkMultiviewPerViewAttributesInfoNVX malloc(MemoryStack stack) {
        return new VkMultiviewPerViewAttributesInfoNVX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMultiviewPerViewAttributesInfoNVX calloc(MemoryStack stack) {
        return new VkMultiviewPerViewAttributesInfoNVX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nperViewAttributes(long struct) {
        return MemoryUtil.memGetInt(struct + PERVIEWATTRIBUTES);
    }

    public static int nperViewAttributesPositionXOnly(long struct) {
        return MemoryUtil.memGetInt(struct + PERVIEWATTRIBUTESPOSITIONXONLY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nperViewAttributes(long struct, int value) {
        MemoryUtil.memPutInt(struct + PERVIEWATTRIBUTES, value);
    }

    public static void nperViewAttributesPositionXOnly(long struct, int value) {
        MemoryUtil.memPutInt(struct + PERVIEWATTRIBUTESPOSITIONXONLY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiviewPerViewAttributesInfoNVX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiviewPerViewAttributesInfoNVX$Buffer.class */
    public static class Buffer extends StructBuffer<VkMultiviewPerViewAttributesInfoNVX, Buffer> implements NativeResource {
        private static final VkMultiviewPerViewAttributesInfoNVX ELEMENT_FACTORY = VkMultiviewPerViewAttributesInfoNVX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMultiviewPerViewAttributesInfoNVX.SIZEOF);
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
        public VkMultiviewPerViewAttributesInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMultiviewPerViewAttributesInfoNVX.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMultiviewPerViewAttributesInfoNVX.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean perViewAttributes() {
            return VkMultiviewPerViewAttributesInfoNVX.nperViewAttributes(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean perViewAttributesPositionXOnly() {
            return VkMultiviewPerViewAttributesInfoNVX.nperViewAttributesPositionXOnly(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMultiviewPerViewAttributesInfoNVX.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVXMultiviewPerViewAttributes.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMultiviewPerViewAttributesInfoNVX.npNext(address(), value);
            return this;
        }

        public Buffer perViewAttributes(@NativeType("VkBool32") boolean value) {
            VkMultiviewPerViewAttributesInfoNVX.nperViewAttributes(address(), value ? 1 : 0);
            return this;
        }

        public Buffer perViewAttributesPositionXOnly(@NativeType("VkBool32") boolean value) {
            VkMultiviewPerViewAttributesInfoNVX.nperViewAttributesPositionXOnly(address(), value ? 1 : 0);
            return this;
        }
    }
}
