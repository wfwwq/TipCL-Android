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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTransformFeedbackPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTransformFeedbackPropertiesEXT.class */
public class VkPhysicalDeviceTransformFeedbackPropertiesEXT extends Struct<VkPhysicalDeviceTransformFeedbackPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXTRANSFORMFEEDBACKSTREAMS;
    public static final int MAXTRANSFORMFEEDBACKBUFFERS;
    public static final int MAXTRANSFORMFEEDBACKBUFFERSIZE;
    public static final int MAXTRANSFORMFEEDBACKSTREAMDATASIZE;
    public static final int MAXTRANSFORMFEEDBACKBUFFERDATASIZE;
    public static final int MAXTRANSFORMFEEDBACKBUFFERDATASTRIDE;
    public static final int TRANSFORMFEEDBACKQUERIES;
    public static final int TRANSFORMFEEDBACKSTREAMSLINESTRIANGLES;
    public static final int TRANSFORMFEEDBACKRASTERIZATIONSTREAMSELECT;
    public static final int TRANSFORMFEEDBACKDRAW;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXTRANSFORMFEEDBACKSTREAMS = layout.offsetof(2);
        MAXTRANSFORMFEEDBACKBUFFERS = layout.offsetof(3);
        MAXTRANSFORMFEEDBACKBUFFERSIZE = layout.offsetof(4);
        MAXTRANSFORMFEEDBACKSTREAMDATASIZE = layout.offsetof(5);
        MAXTRANSFORMFEEDBACKBUFFERDATASIZE = layout.offsetof(6);
        MAXTRANSFORMFEEDBACKBUFFERDATASTRIDE = layout.offsetof(7);
        TRANSFORMFEEDBACKQUERIES = layout.offsetof(8);
        TRANSFORMFEEDBACKSTREAMSLINESTRIANGLES = layout.offsetof(9);
        TRANSFORMFEEDBACKRASTERIZATIONSTREAMSELECT = layout.offsetof(10);
        TRANSFORMFEEDBACKDRAW = layout.offsetof(11);
    }

    protected VkPhysicalDeviceTransformFeedbackPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceTransformFeedbackPropertiesEXT(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int maxTransformFeedbackStreams() {
        return nmaxTransformFeedbackStreams(address());
    }

    @NativeType("uint32_t")
    public int maxTransformFeedbackBuffers() {
        return nmaxTransformFeedbackBuffers(address());
    }

    @NativeType("VkDeviceSize")
    public long maxTransformFeedbackBufferSize() {
        return nmaxTransformFeedbackBufferSize(address());
    }

    @NativeType("uint32_t")
    public int maxTransformFeedbackStreamDataSize() {
        return nmaxTransformFeedbackStreamDataSize(address());
    }

    @NativeType("uint32_t")
    public int maxTransformFeedbackBufferDataSize() {
        return nmaxTransformFeedbackBufferDataSize(address());
    }

    @NativeType("uint32_t")
    public int maxTransformFeedbackBufferDataStride() {
        return nmaxTransformFeedbackBufferDataStride(address());
    }

    @NativeType("VkBool32")
    public boolean transformFeedbackQueries() {
        return ntransformFeedbackQueries(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean transformFeedbackStreamsLinesTriangles() {
        return ntransformFeedbackStreamsLinesTriangles(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean transformFeedbackRasterizationStreamSelect() {
        return ntransformFeedbackRasterizationStreamSelect(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean transformFeedbackDraw() {
        return ntransformFeedbackDraw(address()) != 0;
    }

    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sType$Default() {
        return sType(EXTTransformFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceTransformFeedbackPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceTransformFeedbackPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceTransformFeedbackPropertiesEXT set(VkPhysicalDeviceTransformFeedbackPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT malloc() {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT calloc() {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT create(long address) {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxTransformFeedbackStreams(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTRANSFORMFEEDBACKSTREAMS);
    }

    public static int nmaxTransformFeedbackBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTRANSFORMFEEDBACKBUFFERS);
    }

    public static long nmaxTransformFeedbackBufferSize(long struct) {
        return MemoryUtil.memGetLong(struct + MAXTRANSFORMFEEDBACKBUFFERSIZE);
    }

    public static int nmaxTransformFeedbackStreamDataSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTRANSFORMFEEDBACKSTREAMDATASIZE);
    }

    public static int nmaxTransformFeedbackBufferDataSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTRANSFORMFEEDBACKBUFFERDATASIZE);
    }

    public static int nmaxTransformFeedbackBufferDataStride(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTRANSFORMFEEDBACKBUFFERDATASTRIDE);
    }

    public static int ntransformFeedbackQueries(long struct) {
        return MemoryUtil.memGetInt(struct + TRANSFORMFEEDBACKQUERIES);
    }

    public static int ntransformFeedbackStreamsLinesTriangles(long struct) {
        return MemoryUtil.memGetInt(struct + TRANSFORMFEEDBACKSTREAMSLINESTRIANGLES);
    }

    public static int ntransformFeedbackRasterizationStreamSelect(long struct) {
        return MemoryUtil.memGetInt(struct + TRANSFORMFEEDBACKRASTERIZATIONSTREAMSELECT);
    }

    public static int ntransformFeedbackDraw(long struct) {
        return MemoryUtil.memGetInt(struct + TRANSFORMFEEDBACKDRAW);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTransformFeedbackPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTransformFeedbackPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTransformFeedbackPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceTransformFeedbackPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceTransformFeedbackPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceTransformFeedbackPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceTransformFeedbackPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxTransformFeedbackStreams() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackStreams(address());
        }

        @NativeType("uint32_t")
        public int maxTransformFeedbackBuffers() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackBuffers(address());
        }

        @NativeType("VkDeviceSize")
        public long maxTransformFeedbackBufferSize() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackBufferSize(address());
        }

        @NativeType("uint32_t")
        public int maxTransformFeedbackStreamDataSize() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackStreamDataSize(address());
        }

        @NativeType("uint32_t")
        public int maxTransformFeedbackBufferDataSize() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackBufferDataSize(address());
        }

        @NativeType("uint32_t")
        public int maxTransformFeedbackBufferDataStride() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackBufferDataStride(address());
        }

        @NativeType("VkBool32")
        public boolean transformFeedbackQueries() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.ntransformFeedbackQueries(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean transformFeedbackStreamsLinesTriangles() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.ntransformFeedbackStreamsLinesTriangles(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean transformFeedbackRasterizationStreamSelect() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.ntransformFeedbackRasterizationStreamSelect(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean transformFeedbackDraw() {
            return VkPhysicalDeviceTransformFeedbackPropertiesEXT.ntransformFeedbackDraw(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTransformFeedbackPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTTransformFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTransformFeedbackPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
