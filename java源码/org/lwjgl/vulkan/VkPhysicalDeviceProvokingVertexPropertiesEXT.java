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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProvokingVertexPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProvokingVertexPropertiesEXT.class */
public class VkPhysicalDeviceProvokingVertexPropertiesEXT extends Struct<VkPhysicalDeviceProvokingVertexPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PROVOKINGVERTEXMODEPERPIPELINE;
    public static final int TRANSFORMFEEDBACKPRESERVESTRIANGLEFANPROVOKINGVERTEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROVOKINGVERTEXMODEPERPIPELINE = layout.offsetof(2);
        TRANSFORMFEEDBACKPRESERVESTRIANGLEFANPROVOKINGVERTEX = layout.offsetof(3);
    }

    protected VkPhysicalDeviceProvokingVertexPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceProvokingVertexPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceProvokingVertexPropertiesEXT(ByteBuffer container) {
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
    public boolean provokingVertexModePerPipeline() {
        return nprovokingVertexModePerPipeline(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean transformFeedbackPreservesTriangleFanProvokingVertex() {
        return ntransformFeedbackPreservesTriangleFanProvokingVertex(address()) != 0;
    }

    public VkPhysicalDeviceProvokingVertexPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceProvokingVertexPropertiesEXT sType$Default() {
        return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceProvokingVertexPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceProvokingVertexPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceProvokingVertexPropertiesEXT set(VkPhysicalDeviceProvokingVertexPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT malloc() {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT calloc() {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT create(long address) {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nprovokingVertexModePerPipeline(long struct) {
        return MemoryUtil.memGetInt(struct + PROVOKINGVERTEXMODEPERPIPELINE);
    }

    public static int ntransformFeedbackPreservesTriangleFanProvokingVertex(long struct) {
        return MemoryUtil.memGetInt(struct + TRANSFORMFEEDBACKPRESERVESTRIANGLEFANPROVOKINGVERTEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProvokingVertexPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProvokingVertexPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceProvokingVertexPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceProvokingVertexPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceProvokingVertexPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceProvokingVertexPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceProvokingVertexPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceProvokingVertexPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceProvokingVertexPropertiesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean provokingVertexModePerPipeline() {
            return VkPhysicalDeviceProvokingVertexPropertiesEXT.nprovokingVertexModePerPipeline(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean transformFeedbackPreservesTriangleFanProvokingVertex() {
            return VkPhysicalDeviceProvokingVertexPropertiesEXT.ntransformFeedbackPreservesTriangleFanProvokingVertex(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceProvokingVertexPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceProvokingVertexPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
