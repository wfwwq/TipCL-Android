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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.class */
public class VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT extends Struct<VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DYNAMICRENDERINGUNUSEDATTACHMENTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DYNAMICRENDERINGUNUSEDATTACHMENTS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkBool32")
    public boolean dynamicRenderingUnusedAttachments() {
        return ndynamicRenderingUnusedAttachments(address()) != 0;
    }

    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT sType$Default() {
        return sType(EXTDynamicRenderingUnusedAttachments.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT);
    }

    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT dynamicRenderingUnusedAttachments(@NativeType("VkBool32") boolean value) {
        ndynamicRenderingUnusedAttachments(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT set(int sType, long pNext, boolean dynamicRenderingUnusedAttachments) {
        sType(sType);
        pNext(pNext);
        dynamicRenderingUnusedAttachments(dynamicRenderingUnusedAttachments);
        return this;
    }

    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT set(VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT malloc() {
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT calloc() {
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndynamicRenderingUnusedAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + DYNAMICRENDERINGUNUSEDATTACHMENTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndynamicRenderingUnusedAttachments(long struct, int value) {
        MemoryUtil.memPutInt(struct + DYNAMICRENDERINGUNUSEDATTACHMENTS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean dynamicRenderingUnusedAttachments() {
            return VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.ndynamicRenderingUnusedAttachments(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDynamicRenderingUnusedAttachments.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer dynamicRenderingUnusedAttachments(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.ndynamicRenderingUnusedAttachments(address(), value ? 1 : 0);
            return this;
        }
    }
}
