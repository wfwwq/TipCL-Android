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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolInlineUniformBlockCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolInlineUniformBlockCreateInfo.class */
public class VkDescriptorPoolInlineUniformBlockCreateInfo extends Struct<VkDescriptorPoolInlineUniformBlockCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXINLINEUNIFORMBLOCKBINDINGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXINLINEUNIFORMBLOCKBINDINGS = layout.offsetof(2);
    }

    protected VkDescriptorPoolInlineUniformBlockCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorPoolInlineUniformBlockCreateInfo create(long address, ByteBuffer container) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(address, container);
    }

    public VkDescriptorPoolInlineUniformBlockCreateInfo(ByteBuffer container) {
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
    public int maxInlineUniformBlockBindings() {
        return nmaxInlineUniformBlockBindings(address());
    }

    public VkDescriptorPoolInlineUniformBlockCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorPoolInlineUniformBlockCreateInfo sType$Default() {
        return sType(1000138003);
    }

    public VkDescriptorPoolInlineUniformBlockCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorPoolInlineUniformBlockCreateInfo maxInlineUniformBlockBindings(@NativeType("uint32_t") int value) {
        nmaxInlineUniformBlockBindings(address(), value);
        return this;
    }

    public VkDescriptorPoolInlineUniformBlockCreateInfo set(int sType, long pNext, int maxInlineUniformBlockBindings) {
        sType(sType);
        pNext(pNext);
        maxInlineUniformBlockBindings(maxInlineUniformBlockBindings);
        return this;
    }

    public VkDescriptorPoolInlineUniformBlockCreateInfo set(VkDescriptorPoolInlineUniformBlockCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfo malloc() {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfo calloc() {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfo create(long address) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(address, null);
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(address, null);
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

    public static VkDescriptorPoolInlineUniformBlockCreateInfo malloc(MemoryStack stack) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfo calloc(MemoryStack stack) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxInlineUniformBlockBindings(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINLINEUNIFORMBLOCKBINDINGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaxInlineUniformBlockBindings(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXINLINEUNIFORMBLOCKBINDINGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolInlineUniformBlockCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolInlineUniformBlockCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorPoolInlineUniformBlockCreateInfo, Buffer> implements NativeResource {
        private static final VkDescriptorPoolInlineUniformBlockCreateInfo ELEMENT_FACTORY = VkDescriptorPoolInlineUniformBlockCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorPoolInlineUniformBlockCreateInfo.SIZEOF);
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
        public VkDescriptorPoolInlineUniformBlockCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorPoolInlineUniformBlockCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDescriptorPoolInlineUniformBlockCreateInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxInlineUniformBlockBindings() {
            return VkDescriptorPoolInlineUniformBlockCreateInfo.nmaxInlineUniformBlockBindings(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorPoolInlineUniformBlockCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000138003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorPoolInlineUniformBlockCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer maxInlineUniformBlockBindings(@NativeType("uint32_t") int value) {
            VkDescriptorPoolInlineUniformBlockCreateInfo.nmaxInlineUniformBlockBindings(address(), value);
            return this;
        }
    }
}
