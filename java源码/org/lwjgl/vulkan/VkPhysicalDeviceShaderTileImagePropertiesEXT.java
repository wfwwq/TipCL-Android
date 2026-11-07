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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTileImagePropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTileImagePropertiesEXT.class */
public class VkPhysicalDeviceShaderTileImagePropertiesEXT extends Struct<VkPhysicalDeviceShaderTileImagePropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERTILEIMAGECOHERENTREADACCELERATED;
    public static final int SHADERTILEIMAGEREADSAMPLEFROMPIXELRATEINVOCATION;
    public static final int SHADERTILEIMAGEREADFROMHELPERINVOCATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERTILEIMAGECOHERENTREADACCELERATED = layout.offsetof(2);
        SHADERTILEIMAGEREADSAMPLEFROMPIXELRATEINVOCATION = layout.offsetof(3);
        SHADERTILEIMAGEREADFROMHELPERINVOCATION = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShaderTileImagePropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderTileImagePropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(address, container);
    }

    public VkPhysicalDeviceShaderTileImagePropertiesEXT(ByteBuffer container) {
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
    public boolean shaderTileImageCoherentReadAccelerated() {
        return nshaderTileImageCoherentReadAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderTileImageReadSampleFromPixelRateInvocation() {
        return nshaderTileImageReadSampleFromPixelRateInvocation(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderTileImageReadFromHelperInvocation() {
        return nshaderTileImageReadFromHelperInvocation(address()) != 0;
    }

    public VkPhysicalDeviceShaderTileImagePropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderTileImagePropertiesEXT sType$Default() {
        return sType(EXTShaderTileImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceShaderTileImagePropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderTileImagePropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceShaderTileImagePropertiesEXT set(VkPhysicalDeviceShaderTileImagePropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT malloc() {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT calloc() {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT create(long address) {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(address, null);
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

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderTileImageCoherentReadAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERTILEIMAGECOHERENTREADACCELERATED);
    }

    public static int nshaderTileImageReadSampleFromPixelRateInvocation(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERTILEIMAGEREADSAMPLEFROMPIXELRATEINVOCATION);
    }

    public static int nshaderTileImageReadFromHelperInvocation(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERTILEIMAGEREADFROMHELPERINVOCATION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTileImagePropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTileImagePropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderTileImagePropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderTileImagePropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderTileImagePropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderTileImagePropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceShaderTileImagePropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderTileImagePropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderTileImagePropertiesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderTileImageCoherentReadAccelerated() {
            return VkPhysicalDeviceShaderTileImagePropertiesEXT.nshaderTileImageCoherentReadAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderTileImageReadSampleFromPixelRateInvocation() {
            return VkPhysicalDeviceShaderTileImagePropertiesEXT.nshaderTileImageReadSampleFromPixelRateInvocation(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderTileImageReadFromHelperInvocation() {
            return VkPhysicalDeviceShaderTileImagePropertiesEXT.nshaderTileImageReadFromHelperInvocation(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderTileImagePropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderTileImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderTileImagePropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
