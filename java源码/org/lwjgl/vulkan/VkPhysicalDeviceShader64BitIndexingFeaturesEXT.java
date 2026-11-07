package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShader64BitIndexingFeaturesEXT.class */
public class VkPhysicalDeviceShader64BitIndexingFeaturesEXT extends Struct<VkPhysicalDeviceShader64BitIndexingFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADER64BITINDEXING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADER64BITINDEXING = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShader64BitIndexingFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT(ByteBuffer container) {
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
    public boolean shader64BitIndexing() {
        return nshader64BitIndexing(address()) != 0;
    }

    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT sType$Default() {
        return sType(EXTShader64bitIndexing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_64_BIT_INDEXING_FEATURES_EXT);
    }

    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT shader64BitIndexing(@NativeType("VkBool32") boolean value) {
        nshader64BitIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT set(int sType, long pNext, boolean shader64BitIndexing) {
        sType(sType);
        pNext(pNext);
        shader64BitIndexing(shader64BitIndexing);
        return this;
    }

    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT set(VkPhysicalDeviceShader64BitIndexingFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT malloc() {
        return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT calloc() {
        return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshader64BitIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADER64BITINDEXING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshader64BitIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADER64BITINDEXING, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShader64BitIndexingFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShader64BitIndexingFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShader64BitIndexingFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShader64BitIndexingFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShader64BitIndexingFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceShader64BitIndexingFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShader64BitIndexingFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShader64BitIndexingFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shader64BitIndexing() {
            return VkPhysicalDeviceShader64BitIndexingFeaturesEXT.nshader64BitIndexing(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShader64BitIndexingFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShader64bitIndexing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_64_BIT_INDEXING_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShader64BitIndexingFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer shader64BitIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShader64BitIndexingFeaturesEXT.nshader64BitIndexing(address(), value ? 1 : 0);
            return this;
        }
    }
}
