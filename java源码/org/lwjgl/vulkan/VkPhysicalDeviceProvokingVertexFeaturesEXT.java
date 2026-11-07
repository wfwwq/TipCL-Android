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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProvokingVertexFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProvokingVertexFeaturesEXT.class */
public class VkPhysicalDeviceProvokingVertexFeaturesEXT extends Struct<VkPhysicalDeviceProvokingVertexFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PROVOKINGVERTEXLAST;
    public static final int TRANSFORMFEEDBACKPRESERVESPROVOKINGVERTEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROVOKINGVERTEXLAST = layout.offsetof(2);
        TRANSFORMFEEDBACKPRESERVESPROVOKINGVERTEX = layout.offsetof(3);
    }

    protected VkPhysicalDeviceProvokingVertexFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceProvokingVertexFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceProvokingVertexFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceProvokingVertexFeaturesEXT(ByteBuffer container) {
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
    public boolean provokingVertexLast() {
        return nprovokingVertexLast(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean transformFeedbackPreservesProvokingVertex() {
        return ntransformFeedbackPreservesProvokingVertex(address()) != 0;
    }

    public VkPhysicalDeviceProvokingVertexFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceProvokingVertexFeaturesEXT sType$Default() {
        return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT);
    }

    public VkPhysicalDeviceProvokingVertexFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceProvokingVertexFeaturesEXT provokingVertexLast(@NativeType("VkBool32") boolean value) {
        nprovokingVertexLast(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceProvokingVertexFeaturesEXT transformFeedbackPreservesProvokingVertex(@NativeType("VkBool32") boolean value) {
        ntransformFeedbackPreservesProvokingVertex(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceProvokingVertexFeaturesEXT set(int sType, long pNext, boolean provokingVertexLast, boolean transformFeedbackPreservesProvokingVertex) {
        sType(sType);
        pNext(pNext);
        provokingVertexLast(provokingVertexLast);
        transformFeedbackPreservesProvokingVertex(transformFeedbackPreservesProvokingVertex);
        return this;
    }

    public VkPhysicalDeviceProvokingVertexFeaturesEXT set(VkPhysicalDeviceProvokingVertexFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT malloc() {
        return new VkPhysicalDeviceProvokingVertexFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT calloc() {
        return new VkPhysicalDeviceProvokingVertexFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceProvokingVertexFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT create(long address) {
        return new VkPhysicalDeviceProvokingVertexFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceProvokingVertexFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceProvokingVertexFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceProvokingVertexFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nprovokingVertexLast(long struct) {
        return MemoryUtil.memGetInt(struct + PROVOKINGVERTEXLAST);
    }

    public static int ntransformFeedbackPreservesProvokingVertex(long struct) {
        return MemoryUtil.memGetInt(struct + TRANSFORMFEEDBACKPRESERVESPROVOKINGVERTEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nprovokingVertexLast(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROVOKINGVERTEXLAST, value);
    }

    public static void ntransformFeedbackPreservesProvokingVertex(long struct, int value) {
        MemoryUtil.memPutInt(struct + TRANSFORMFEEDBACKPRESERVESPROVOKINGVERTEX, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProvokingVertexFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProvokingVertexFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceProvokingVertexFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceProvokingVertexFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceProvokingVertexFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceProvokingVertexFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceProvokingVertexFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceProvokingVertexFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceProvokingVertexFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean provokingVertexLast() {
            return VkPhysicalDeviceProvokingVertexFeaturesEXT.nprovokingVertexLast(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean transformFeedbackPreservesProvokingVertex() {
            return VkPhysicalDeviceProvokingVertexFeaturesEXT.ntransformFeedbackPreservesProvokingVertex(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceProvokingVertexFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceProvokingVertexFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer provokingVertexLast(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceProvokingVertexFeaturesEXT.nprovokingVertexLast(address(), value ? 1 : 0);
            return this;
        }

        public Buffer transformFeedbackPreservesProvokingVertex(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceProvokingVertexFeaturesEXT.ntransformFeedbackPreservesProvokingVertex(address(), value ? 1 : 0);
            return this;
        }
    }
}
