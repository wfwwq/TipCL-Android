package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.class */
public class VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT extends Struct<VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VERTEXATTRIBUTEROBUSTNESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXATTRIBUTEROBUSTNESS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(ByteBuffer container) {
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
    public boolean vertexAttributeRobustness() {
        return nvertexAttributeRobustness(address()) != 0;
    }

    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT sType$Default() {
        return sType(EXTVertexAttributeRobustness.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT);
    }

    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT vertexAttributeRobustness(@NativeType("VkBool32") boolean value) {
        nvertexAttributeRobustness(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT set(int sType, long pNext, boolean vertexAttributeRobustness) {
        sType(sType);
        pNext(pNext);
        vertexAttributeRobustness(vertexAttributeRobustness);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT set(VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT malloc() {
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT calloc() {
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT create(long address) {
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvertexAttributeRobustness(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXATTRIBUTEROBUSTNESS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvertexAttributeRobustness(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXATTRIBUTEROBUSTNESS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean vertexAttributeRobustness() {
            return VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.nvertexAttributeRobustness(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTVertexAttributeRobustness.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer vertexAttributeRobustness(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.nvertexAttributeRobustness(address(), value ? 1 : 0);
            return this;
        }
    }
}
