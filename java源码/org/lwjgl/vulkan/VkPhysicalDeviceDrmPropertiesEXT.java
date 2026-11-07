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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDrmPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDrmPropertiesEXT.class */
public class VkPhysicalDeviceDrmPropertiesEXT extends Struct<VkPhysicalDeviceDrmPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HASPRIMARY;
    public static final int HASRENDER;
    public static final int PRIMARYMAJOR;
    public static final int PRIMARYMINOR;
    public static final int RENDERMAJOR;
    public static final int RENDERMINOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HASPRIMARY = layout.offsetof(2);
        HASRENDER = layout.offsetof(3);
        PRIMARYMAJOR = layout.offsetof(4);
        PRIMARYMINOR = layout.offsetof(5);
        RENDERMAJOR = layout.offsetof(6);
        RENDERMINOR = layout.offsetof(7);
    }

    protected VkPhysicalDeviceDrmPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDrmPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDrmPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceDrmPropertiesEXT(ByteBuffer container) {
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
    public boolean hasPrimary() {
        return nhasPrimary(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean hasRender() {
        return nhasRender(address()) != 0;
    }

    @NativeType("int64_t")
    public long primaryMajor() {
        return nprimaryMajor(address());
    }

    @NativeType("int64_t")
    public long primaryMinor() {
        return nprimaryMinor(address());
    }

    @NativeType("int64_t")
    public long renderMajor() {
        return nrenderMajor(address());
    }

    @NativeType("int64_t")
    public long renderMinor() {
        return nrenderMinor(address());
    }

    public VkPhysicalDeviceDrmPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDrmPropertiesEXT sType$Default() {
        return sType(EXTPhysicalDeviceDrm.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceDrmPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDrmPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceDrmPropertiesEXT set(VkPhysicalDeviceDrmPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDrmPropertiesEXT malloc() {
        return new VkPhysicalDeviceDrmPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDrmPropertiesEXT calloc() {
        return new VkPhysicalDeviceDrmPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDrmPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDrmPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDrmPropertiesEXT create(long address) {
        return new VkPhysicalDeviceDrmPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceDrmPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDrmPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceDrmPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDrmPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDrmPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDrmPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nhasPrimary(long struct) {
        return MemoryUtil.memGetInt(struct + HASPRIMARY);
    }

    public static int nhasRender(long struct) {
        return MemoryUtil.memGetInt(struct + HASRENDER);
    }

    public static long nprimaryMajor(long struct) {
        return MemoryUtil.memGetLong(struct + PRIMARYMAJOR);
    }

    public static long nprimaryMinor(long struct) {
        return MemoryUtil.memGetLong(struct + PRIMARYMINOR);
    }

    public static long nrenderMajor(long struct) {
        return MemoryUtil.memGetLong(struct + RENDERMAJOR);
    }

    public static long nrenderMinor(long struct) {
        return MemoryUtil.memGetLong(struct + RENDERMINOR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDrmPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDrmPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDrmPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDrmPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceDrmPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDrmPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceDrmPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDrmPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDrmPropertiesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean hasPrimary() {
            return VkPhysicalDeviceDrmPropertiesEXT.nhasPrimary(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean hasRender() {
            return VkPhysicalDeviceDrmPropertiesEXT.nhasRender(address()) != 0;
        }

        @NativeType("int64_t")
        public long primaryMajor() {
            return VkPhysicalDeviceDrmPropertiesEXT.nprimaryMajor(address());
        }

        @NativeType("int64_t")
        public long primaryMinor() {
            return VkPhysicalDeviceDrmPropertiesEXT.nprimaryMinor(address());
        }

        @NativeType("int64_t")
        public long renderMajor() {
            return VkPhysicalDeviceDrmPropertiesEXT.nrenderMajor(address());
        }

        @NativeType("int64_t")
        public long renderMinor() {
            return VkPhysicalDeviceDrmPropertiesEXT.nrenderMinor(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDrmPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTPhysicalDeviceDrm.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDrmPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
