package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT.class */
public class VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT extends Struct<VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERUNIFORMBUFFERUNSIZEDARRAY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERUNIFORMBUFFERUNSIZEDARRAY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(ByteBuffer container) {
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
    public boolean shaderUniformBufferUnsizedArray() {
        return nshaderUniformBufferUnsizedArray(address()) != 0;
    }

    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT sType$Default() {
        return sType(EXTShaderUniformBufferUnsizedArray.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNIFORM_BUFFER_UNSIZED_ARRAY_FEATURES_EXT);
    }

    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT shaderUniformBufferUnsizedArray(@NativeType("VkBool32") boolean value) {
        nshaderUniformBufferUnsizedArray(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT set(int sType, long pNext, boolean shaderUniformBufferUnsizedArray) {
        sType(sType);
        pNext(pNext);
        shaderUniformBufferUnsizedArray(shaderUniformBufferUnsizedArray);
        return this;
    }

    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT set(VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderUniformBufferUnsizedArray(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERUNIFORMBUFFERUNSIZEDARRAY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderUniformBufferUnsizedArray(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERUNIFORMBUFFERUNSIZEDARRAY, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderUniformBufferUnsizedArray() {
            return VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT.nshaderUniformBufferUnsizedArray(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderUniformBufferUnsizedArray.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNIFORM_BUFFER_UNSIZED_ARRAY_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer shaderUniformBufferUnsizedArray(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT.nshaderUniformBufferUnsizedArray(address(), value ? 1 : 0);
            return this;
        }
    }
}
