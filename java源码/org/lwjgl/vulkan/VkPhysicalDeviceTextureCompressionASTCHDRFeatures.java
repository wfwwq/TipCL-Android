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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTextureCompressionASTCHDRFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTextureCompressionASTCHDRFeatures.class */
public class VkPhysicalDeviceTextureCompressionASTCHDRFeatures extends Struct<VkPhysicalDeviceTextureCompressionASTCHDRFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TEXTURECOMPRESSIONASTC_HDR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TEXTURECOMPRESSIONASTC_HDR = layout.offsetof(2);
    }

    protected VkPhysicalDeviceTextureCompressionASTCHDRFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(address, container);
    }

    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures(ByteBuffer container) {
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
    public boolean textureCompressionASTC_HDR() {
        return ntextureCompressionASTC_HDR(address()) != 0;
    }

    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures sType$Default() {
        return sType(1000066000);
    }

    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) {
        ntextureCompressionASTC_HDR(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures set(int sType, long pNext, boolean textureCompressionASTC_HDR) {
        sType(sType);
        pNext(pNext);
        textureCompressionASTC_HDR(textureCompressionASTC_HDR);
        return this;
    }

    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures set(VkPhysicalDeviceTextureCompressionASTCHDRFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures malloc() {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures calloc() {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures create(long address) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(address, null);
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(address, null);
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

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntextureCompressionASTC_HDR(long struct) {
        return MemoryUtil.memGetInt(struct + TEXTURECOMPRESSIONASTC_HDR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntextureCompressionASTC_HDR(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEXTURECOMPRESSIONASTC_HDR, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTextureCompressionASTCHDRFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTextureCompressionASTCHDRFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTextureCompressionASTCHDRFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceTextureCompressionASTCHDRFeatures ELEMENT_FACTORY = VkPhysicalDeviceTextureCompressionASTCHDRFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceTextureCompressionASTCHDRFeatures.SIZEOF);
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
        public VkPhysicalDeviceTextureCompressionASTCHDRFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceTextureCompressionASTCHDRFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceTextureCompressionASTCHDRFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean textureCompressionASTC_HDR() {
            return VkPhysicalDeviceTextureCompressionASTCHDRFeatures.ntextureCompressionASTC_HDR(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTextureCompressionASTCHDRFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000066000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTextureCompressionASTCHDRFeatures.npNext(address(), value);
            return this;
        }

        public Buffer textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTextureCompressionASTCHDRFeatures.ntextureCompressionASTC_HDR(address(), value ? 1 : 0);
            return this;
        }
    }
}
