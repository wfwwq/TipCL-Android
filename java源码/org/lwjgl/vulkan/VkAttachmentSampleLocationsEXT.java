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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentSampleLocationsEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentSampleLocationsEXT.class */
public class VkAttachmentSampleLocationsEXT extends Struct<VkAttachmentSampleLocationsEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ATTACHMENTINDEX;
    public static final int SAMPLELOCATIONSINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(VkSampleLocationsInfoEXT.SIZEOF, VkSampleLocationsInfoEXT.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ATTACHMENTINDEX = layout.offsetof(0);
        SAMPLELOCATIONSINFO = layout.offsetof(1);
    }

    protected VkAttachmentSampleLocationsEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAttachmentSampleLocationsEXT create(long address, ByteBuffer container) {
        return new VkAttachmentSampleLocationsEXT(address, container);
    }

    public VkAttachmentSampleLocationsEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int attachmentIndex() {
        return nattachmentIndex(address());
    }

    public VkSampleLocationsInfoEXT sampleLocationsInfo() {
        return nsampleLocationsInfo(address());
    }

    public VkAttachmentSampleLocationsEXT attachmentIndex(@NativeType("uint32_t") int value) {
        nattachmentIndex(address(), value);
        return this;
    }

    public VkAttachmentSampleLocationsEXT sampleLocationsInfo(VkSampleLocationsInfoEXT value) {
        nsampleLocationsInfo(address(), value);
        return this;
    }

    public VkAttachmentSampleLocationsEXT sampleLocationsInfo(Consumer<VkSampleLocationsInfoEXT> consumer) {
        consumer.accept(sampleLocationsInfo());
        return this;
    }

    public VkAttachmentSampleLocationsEXT set(int attachmentIndex, VkSampleLocationsInfoEXT sampleLocationsInfo) {
        attachmentIndex(attachmentIndex);
        sampleLocationsInfo(sampleLocationsInfo);
        return this;
    }

    public VkAttachmentSampleLocationsEXT set(VkAttachmentSampleLocationsEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentSampleLocationsEXT malloc() {
        return new VkAttachmentSampleLocationsEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentSampleLocationsEXT calloc() {
        return new VkAttachmentSampleLocationsEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentSampleLocationsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentSampleLocationsEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentSampleLocationsEXT create(long address) {
        return new VkAttachmentSampleLocationsEXT(address, null);
    }

    public static VkAttachmentSampleLocationsEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentSampleLocationsEXT(address, null);
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

    public static VkAttachmentSampleLocationsEXT malloc(MemoryStack stack) {
        return new VkAttachmentSampleLocationsEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentSampleLocationsEXT calloc(MemoryStack stack) {
        return new VkAttachmentSampleLocationsEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nattachmentIndex(long struct) {
        return MemoryUtil.memGetInt(struct + ATTACHMENTINDEX);
    }

    public static VkSampleLocationsInfoEXT nsampleLocationsInfo(long struct) {
        return VkSampleLocationsInfoEXT.create(struct + SAMPLELOCATIONSINFO);
    }

    public static void nattachmentIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + ATTACHMENTINDEX, value);
    }

    public static void nsampleLocationsInfo(long struct, VkSampleLocationsInfoEXT value) {
        MemoryUtil.memCopy(value.address(), struct + SAMPLELOCATIONSINFO, VkSampleLocationsInfoEXT.SIZEOF);
    }

    public static void validate(long struct) {
        VkSampleLocationsInfoEXT.validate(struct + SAMPLELOCATIONSINFO);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentSampleLocationsEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentSampleLocationsEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkAttachmentSampleLocationsEXT, Buffer> implements NativeResource {
        private static final VkAttachmentSampleLocationsEXT ELEMENT_FACTORY = VkAttachmentSampleLocationsEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAttachmentSampleLocationsEXT.SIZEOF);
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
        public VkAttachmentSampleLocationsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int attachmentIndex() {
            return VkAttachmentSampleLocationsEXT.nattachmentIndex(address());
        }

        public VkSampleLocationsInfoEXT sampleLocationsInfo() {
            return VkAttachmentSampleLocationsEXT.nsampleLocationsInfo(address());
        }

        public Buffer attachmentIndex(@NativeType("uint32_t") int value) {
            VkAttachmentSampleLocationsEXT.nattachmentIndex(address(), value);
            return this;
        }

        public Buffer sampleLocationsInfo(VkSampleLocationsInfoEXT value) {
            VkAttachmentSampleLocationsEXT.nsampleLocationsInfo(address(), value);
            return this;
        }

        public Buffer sampleLocationsInfo(Consumer<VkSampleLocationsInfoEXT> consumer) {
            consumer.accept(sampleLocationsInfo());
            return this;
        }
    }
}
