package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderFloat8FeaturesEXT.class */
public class VkPhysicalDeviceShaderFloat8FeaturesEXT extends Struct<VkPhysicalDeviceShaderFloat8FeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERFLOAT8;
    public static final int SHADERFLOAT8COOPERATIVEMATRIX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERFLOAT8 = layout.offsetof(2);
        SHADERFLOAT8COOPERATIVEMATRIX = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderFloat8FeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderFloat8FeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(address, container);
    }

    public VkPhysicalDeviceShaderFloat8FeaturesEXT(ByteBuffer container) {
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
    public boolean shaderFloat8() {
        return nshaderFloat8(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderFloat8CooperativeMatrix() {
        return nshaderFloat8CooperativeMatrix(address()) != 0;
    }

    public VkPhysicalDeviceShaderFloat8FeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderFloat8FeaturesEXT sType$Default() {
        return sType(EXTShaderFloat8.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT8_FEATURES_EXT);
    }

    public VkPhysicalDeviceShaderFloat8FeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8(@NativeType("VkBool32") boolean value) {
        nshaderFloat8(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8CooperativeMatrix(@NativeType("VkBool32") boolean value) {
        nshaderFloat8CooperativeMatrix(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderFloat8FeaturesEXT set(int sType, long pNext, boolean shaderFloat8, boolean shaderFloat8CooperativeMatrix) {
        sType(sType);
        pNext(pNext);
        shaderFloat8(shaderFloat8);
        shaderFloat8CooperativeMatrix(shaderFloat8CooperativeMatrix);
        return this;
    }

    public VkPhysicalDeviceShaderFloat8FeaturesEXT set(VkPhysicalDeviceShaderFloat8FeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderFloat8FeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFloat8FeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFloat8FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderFloat8FeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceShaderFloat8FeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(address, null);
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

    public static VkPhysicalDeviceShaderFloat8FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFloat8FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderFloat8(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERFLOAT8);
    }

    public static int nshaderFloat8CooperativeMatrix(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERFLOAT8COOPERATIVEMATRIX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderFloat8(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERFLOAT8, value);
    }

    public static void nshaderFloat8CooperativeMatrix(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERFLOAT8COOPERATIVEMATRIX, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderFloat8FeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderFloat8FeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderFloat8FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderFloat8FeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderFloat8FeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceShaderFloat8FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderFloat8FeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderFloat8FeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderFloat8() {
            return VkPhysicalDeviceShaderFloat8FeaturesEXT.nshaderFloat8(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderFloat8CooperativeMatrix() {
            return VkPhysicalDeviceShaderFloat8FeaturesEXT.nshaderFloat8CooperativeMatrix(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderFloat8FeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderFloat8.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT8_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderFloat8FeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer shaderFloat8(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderFloat8FeaturesEXT.nshaderFloat8(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderFloat8CooperativeMatrix(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderFloat8FeaturesEXT.nshaderFloat8CooperativeMatrix(address(), value ? 1 : 0);
            return this;
        }
    }
}
