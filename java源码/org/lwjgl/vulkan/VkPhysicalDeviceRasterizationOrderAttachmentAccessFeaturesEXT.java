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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.class */
public class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT extends Struct<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RASTERIZATIONORDERCOLORATTACHMENTACCESS;
    public static final int RASTERIZATIONORDERDEPTHATTACHMENTACCESS;
    public static final int RASTERIZATIONORDERSTENCILATTACHMENTACCESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RASTERIZATIONORDERCOLORATTACHMENTACCESS = layout.offsetof(2);
        RASTERIZATIONORDERDEPTHATTACHMENTACCESS = layout.offsetof(3);
        RASTERIZATIONORDERSTENCILATTACHMENTACCESS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(ByteBuffer container) {
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
    public boolean rasterizationOrderColorAttachmentAccess() {
        return nrasterizationOrderColorAttachmentAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean rasterizationOrderDepthAttachmentAccess() {
        return nrasterizationOrderDepthAttachmentAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean rasterizationOrderStencilAttachmentAccess() {
        return nrasterizationOrderStencilAttachmentAccess(address()) != 0;
    }

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT sType$Default() {
        return sType(1000342000);
    }

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderColorAttachmentAccess(@NativeType("VkBool32") boolean value) {
        nrasterizationOrderColorAttachmentAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderDepthAttachmentAccess(@NativeType("VkBool32") boolean value) {
        nrasterizationOrderDepthAttachmentAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderStencilAttachmentAccess(@NativeType("VkBool32") boolean value) {
        nrasterizationOrderStencilAttachmentAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT set(int sType, long pNext, boolean rasterizationOrderColorAttachmentAccess, boolean rasterizationOrderDepthAttachmentAccess, boolean rasterizationOrderStencilAttachmentAccess) {
        sType(sType);
        pNext(pNext);
        rasterizationOrderColorAttachmentAccess(rasterizationOrderColorAttachmentAccess);
        rasterizationOrderDepthAttachmentAccess(rasterizationOrderDepthAttachmentAccess);
        rasterizationOrderStencilAttachmentAccess(rasterizationOrderStencilAttachmentAccess);
        return this;
    }

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT set(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT malloc() {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT calloc() {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT create(long address) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrasterizationOrderColorAttachmentAccess(long struct) {
        return MemoryUtil.memGetInt(struct + RASTERIZATIONORDERCOLORATTACHMENTACCESS);
    }

    public static int nrasterizationOrderDepthAttachmentAccess(long struct) {
        return MemoryUtil.memGetInt(struct + RASTERIZATIONORDERDEPTHATTACHMENTACCESS);
    }

    public static int nrasterizationOrderStencilAttachmentAccess(long struct) {
        return MemoryUtil.memGetInt(struct + RASTERIZATIONORDERSTENCILATTACHMENTACCESS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrasterizationOrderColorAttachmentAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + RASTERIZATIONORDERCOLORATTACHMENTACCESS, value);
    }

    public static void nrasterizationOrderDepthAttachmentAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + RASTERIZATIONORDERDEPTHATTACHMENTACCESS, value);
    }

    public static void nrasterizationOrderStencilAttachmentAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + RASTERIZATIONORDERSTENCILATTACHMENTACCESS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean rasterizationOrderColorAttachmentAccess() {
            return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nrasterizationOrderColorAttachmentAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean rasterizationOrderDepthAttachmentAccess() {
            return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nrasterizationOrderDepthAttachmentAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean rasterizationOrderStencilAttachmentAccess() {
            return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nrasterizationOrderStencilAttachmentAccess(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000342000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer rasterizationOrderColorAttachmentAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nrasterizationOrderColorAttachmentAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer rasterizationOrderDepthAttachmentAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nrasterizationOrderDepthAttachmentAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer rasterizationOrderStencilAttachmentAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nrasterizationOrderStencilAttachmentAccess(address(), value ? 1 : 0);
            return this;
        }
    }
}
