package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.class */
public class VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT extends Struct<VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERREPLICATEDCOMPOSITES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERREPLICATEDCOMPOSITES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(ByteBuffer container) {
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
    public boolean shaderReplicatedComposites() {
        return nshaderReplicatedComposites(address()) != 0;
    }

    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT sType$Default() {
        return sType(EXTShaderReplicatedComposites.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT);
    }

    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT shaderReplicatedComposites(@NativeType("VkBool32") boolean value) {
        nshaderReplicatedComposites(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT set(int sType, long pNext, boolean shaderReplicatedComposites) {
        sType(sType);
        pNext(pNext);
        shaderReplicatedComposites(shaderReplicatedComposites);
        return this;
    }

    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT set(VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderReplicatedComposites(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERREPLICATEDCOMPOSITES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderReplicatedComposites(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERREPLICATEDCOMPOSITES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderReplicatedComposites() {
            return VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.nshaderReplicatedComposites(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderReplicatedComposites.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer shaderReplicatedComposites(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.nshaderReplicatedComposites(address(), value ? 1 : 0);
            return this;
        }
    }
}
