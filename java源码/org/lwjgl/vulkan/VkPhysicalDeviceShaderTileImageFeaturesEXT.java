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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTileImageFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTileImageFeaturesEXT.class */
public class VkPhysicalDeviceShaderTileImageFeaturesEXT extends Struct<VkPhysicalDeviceShaderTileImageFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERTILEIMAGECOLORREADACCESS;
    public static final int SHADERTILEIMAGEDEPTHREADACCESS;
    public static final int SHADERTILEIMAGESTENCILREADACCESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERTILEIMAGECOLORREADACCESS = layout.offsetof(2);
        SHADERTILEIMAGEDEPTHREADACCESS = layout.offsetof(3);
        SHADERTILEIMAGESTENCILREADACCESS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShaderTileImageFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderTileImageFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceShaderTileImageFeaturesEXT(ByteBuffer container) {
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
    public boolean shaderTileImageColorReadAccess() {
        return nshaderTileImageColorReadAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderTileImageDepthReadAccess() {
        return nshaderTileImageDepthReadAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderTileImageStencilReadAccess() {
        return nshaderTileImageStencilReadAccess(address()) != 0;
    }

    public VkPhysicalDeviceShaderTileImageFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderTileImageFeaturesEXT sType$Default() {
        return sType(EXTShaderTileImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT);
    }

    public VkPhysicalDeviceShaderTileImageFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageColorReadAccess(@NativeType("VkBool32") boolean value) {
        nshaderTileImageColorReadAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageDepthReadAccess(@NativeType("VkBool32") boolean value) {
        nshaderTileImageDepthReadAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageStencilReadAccess(@NativeType("VkBool32") boolean value) {
        nshaderTileImageStencilReadAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderTileImageFeaturesEXT set(int sType, long pNext, boolean shaderTileImageColorReadAccess, boolean shaderTileImageDepthReadAccess, boolean shaderTileImageStencilReadAccess) {
        sType(sType);
        pNext(pNext);
        shaderTileImageColorReadAccess(shaderTileImageColorReadAccess);
        shaderTileImageDepthReadAccess(shaderTileImageDepthReadAccess);
        shaderTileImageStencilReadAccess(shaderTileImageStencilReadAccess);
        return this;
    }

    public VkPhysicalDeviceShaderTileImageFeaturesEXT set(VkPhysicalDeviceShaderTileImageFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderTileImageColorReadAccess(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERTILEIMAGECOLORREADACCESS);
    }

    public static int nshaderTileImageDepthReadAccess(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERTILEIMAGEDEPTHREADACCESS);
    }

    public static int nshaderTileImageStencilReadAccess(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERTILEIMAGESTENCILREADACCESS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderTileImageColorReadAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERTILEIMAGECOLORREADACCESS, value);
    }

    public static void nshaderTileImageDepthReadAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERTILEIMAGEDEPTHREADACCESS, value);
    }

    public static void nshaderTileImageStencilReadAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERTILEIMAGESTENCILREADACCESS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTileImageFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTileImageFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderTileImageFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderTileImageFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderTileImageFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderTileImageFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceShaderTileImageFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderTileImageFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderTileImageFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderTileImageColorReadAccess() {
            return VkPhysicalDeviceShaderTileImageFeaturesEXT.nshaderTileImageColorReadAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderTileImageDepthReadAccess() {
            return VkPhysicalDeviceShaderTileImageFeaturesEXT.nshaderTileImageDepthReadAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderTileImageStencilReadAccess() {
            return VkPhysicalDeviceShaderTileImageFeaturesEXT.nshaderTileImageStencilReadAccess(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderTileImageFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderTileImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderTileImageFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer shaderTileImageColorReadAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderTileImageFeaturesEXT.nshaderTileImageColorReadAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderTileImageDepthReadAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderTileImageFeaturesEXT.nshaderTileImageDepthReadAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderTileImageStencilReadAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderTileImageFeaturesEXT.nshaderTileImageStencilReadAccess(address(), value ? 1 : 0);
            return this;
        }
    }
}
