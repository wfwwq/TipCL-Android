package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.class */
public class VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT extends Struct<VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TEXTURECOMPRESSIONASTC_3D;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TEXTURECOMPRESSIONASTC_3D = layout.offsetof(2);
    }

    protected VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(ByteBuffer container) {
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
    public boolean textureCompressionASTC_3D() {
        return ntextureCompressionASTC_3D(address()) != 0;
    }

    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT sType$Default() {
        return sType(1000288000);
    }

    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT textureCompressionASTC_3D(@NativeType("VkBool32") boolean value) {
        ntextureCompressionASTC_3D(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT set(int sType, long pNext, boolean textureCompressionASTC_3D) {
        sType(sType);
        pNext(pNext);
        textureCompressionASTC_3D(textureCompressionASTC_3D);
        return this;
    }

    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT set(VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT malloc() {
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT calloc() {
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT create(long address) {
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntextureCompressionASTC_3D(long struct) {
        return MemoryUtil.memGetInt(struct + TEXTURECOMPRESSIONASTC_3D);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntextureCompressionASTC_3D(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEXTURECOMPRESSIONASTC_3D, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean textureCompressionASTC_3D() {
            return VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.ntextureCompressionASTC_3D(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000288000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer textureCompressionASTC_3D(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.ntextureCompressionASTC_3D(address(), value ? 1 : 0);
            return this;
        }
    }
}
