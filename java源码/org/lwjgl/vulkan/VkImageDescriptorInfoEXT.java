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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDescriptorInfoEXT.class */
public class VkImageDescriptorInfoEXT extends Struct<VkImageDescriptorInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PVIEW;
    public static final int LAYOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PVIEW = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
    }

    protected VkImageDescriptorInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageDescriptorInfoEXT create(long address, ByteBuffer container) {
        return new VkImageDescriptorInfoEXT(address, container);
    }

    public VkImageDescriptorInfoEXT(ByteBuffer container) {
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

    @NativeType("VkImageViewCreateInfo const *")
    public VkImageViewCreateInfo pView() {
        return npView(address());
    }

    @NativeType("VkImageLayout")
    public int layout() {
        return nlayout(address());
    }

    public VkImageDescriptorInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageDescriptorInfoEXT sType$Default() {
        return sType(1000135001);
    }

    public VkImageDescriptorInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageDescriptorInfoEXT pView(@NativeType("VkImageViewCreateInfo const *") VkImageViewCreateInfo value) {
        npView(address(), value);
        return this;
    }

    public VkImageDescriptorInfoEXT layout(@NativeType("VkImageLayout") int value) {
        nlayout(address(), value);
        return this;
    }

    public VkImageDescriptorInfoEXT set(int sType, long pNext, VkImageViewCreateInfo pView, int layout) {
        sType(sType);
        pNext(pNext);
        pView(pView);
        layout(layout);
        return this;
    }

    public VkImageDescriptorInfoEXT set(VkImageDescriptorInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageDescriptorInfoEXT malloc() {
        return new VkImageDescriptorInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageDescriptorInfoEXT calloc() {
        return new VkImageDescriptorInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageDescriptorInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageDescriptorInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImageDescriptorInfoEXT create(long address) {
        return new VkImageDescriptorInfoEXT(address, null);
    }

    public static VkImageDescriptorInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageDescriptorInfoEXT(address, null);
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

    public static VkImageDescriptorInfoEXT malloc(MemoryStack stack) {
        return new VkImageDescriptorInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageDescriptorInfoEXT calloc(MemoryStack stack) {
        return new VkImageDescriptorInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkImageViewCreateInfo npView(long struct) {
        return VkImageViewCreateInfo.create(MemoryUtil.memGetAddress(struct + PVIEW));
    }

    public static int nlayout(long struct) {
        return MemoryUtil.memGetInt(struct + LAYOUT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npView(long struct, VkImageViewCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PVIEW, value.address());
    }

    public static void nlayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYOUT, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PVIEW));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDescriptorInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageDescriptorInfoEXT, Buffer> implements NativeResource {
        private static final VkImageDescriptorInfoEXT ELEMENT_FACTORY = VkImageDescriptorInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageDescriptorInfoEXT.SIZEOF);
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
        public VkImageDescriptorInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageDescriptorInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageDescriptorInfoEXT.npNext(address());
        }

        @NativeType("VkImageViewCreateInfo const *")
        public VkImageViewCreateInfo pView() {
            return VkImageDescriptorInfoEXT.npView(address());
        }

        @NativeType("VkImageLayout")
        public int layout() {
            return VkImageDescriptorInfoEXT.nlayout(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageDescriptorInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000135001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageDescriptorInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pView(@NativeType("VkImageViewCreateInfo const *") VkImageViewCreateInfo value) {
            VkImageDescriptorInfoEXT.npView(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkImageLayout") int value) {
            VkImageDescriptorInfoEXT.nlayout(address(), value);
            return this;
        }
    }
}
