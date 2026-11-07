package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelinePropertyQueryResultARM.class */
public class VkDataGraphPipelinePropertyQueryResultARM extends Struct<VkDataGraphPipelinePropertyQueryResultARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PROPERTY;
    public static final int ISTEXT;
    public static final int DATASIZE;
    public static final int PDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROPERTY = layout.offsetof(2);
        ISTEXT = layout.offsetof(3);
        DATASIZE = layout.offsetof(4);
        PDATA = layout.offsetof(5);
    }

    protected VkDataGraphPipelinePropertyQueryResultARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphPipelinePropertyQueryResultARM create(long address, ByteBuffer container) {
        return new VkDataGraphPipelinePropertyQueryResultARM(address, container);
    }

    public VkDataGraphPipelinePropertyQueryResultARM(ByteBuffer container) {
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

    @NativeType("VkDataGraphPipelinePropertyARM")
    public int property() {
        return nproperty(address());
    }

    @NativeType("VkBool32")
    public boolean isText() {
        return nisText(address()) != 0;
    }

    @NativeType("size_t")
    public long dataSize() {
        return ndataSize(address());
    }

    @NativeType("void *")
    public ByteBuffer pData() {
        return npData(address());
    }

    public VkDataGraphPipelinePropertyQueryResultARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphPipelinePropertyQueryResultARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM);
    }

    public VkDataGraphPipelinePropertyQueryResultARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphPipelinePropertyQueryResultARM property(@NativeType("VkDataGraphPipelinePropertyARM") int value) {
        nproperty(address(), value);
        return this;
    }

    public VkDataGraphPipelinePropertyQueryResultARM isText(@NativeType("VkBool32") boolean value) {
        nisText(address(), value ? 1 : 0);
        return this;
    }

    public VkDataGraphPipelinePropertyQueryResultARM dataSize(@NativeType("size_t") long value) {
        ndataSize(address(), value);
        return this;
    }

    public VkDataGraphPipelinePropertyQueryResultARM pData(@NativeType("void *") ByteBuffer value) {
        npData(address(), value);
        return this;
    }

    public VkDataGraphPipelinePropertyQueryResultARM set(int sType, long pNext, int property, boolean isText, long dataSize, ByteBuffer pData) {
        sType(sType);
        pNext(pNext);
        property(property);
        isText(isText);
        dataSize(dataSize);
        pData(pData);
        return this;
    }

    public VkDataGraphPipelinePropertyQueryResultARM set(VkDataGraphPipelinePropertyQueryResultARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphPipelinePropertyQueryResultARM malloc() {
        return new VkDataGraphPipelinePropertyQueryResultARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphPipelinePropertyQueryResultARM calloc() {
        return new VkDataGraphPipelinePropertyQueryResultARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphPipelinePropertyQueryResultARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelinePropertyQueryResultARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphPipelinePropertyQueryResultARM create(long address) {
        return new VkDataGraphPipelinePropertyQueryResultARM(address, null);
    }

    public static VkDataGraphPipelinePropertyQueryResultARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphPipelinePropertyQueryResultARM(address, null);
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

    public static VkDataGraphPipelinePropertyQueryResultARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelinePropertyQueryResultARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphPipelinePropertyQueryResultARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelinePropertyQueryResultARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nproperty(long struct) {
        return MemoryUtil.memGetInt(struct + PROPERTY);
    }

    public static int nisText(long struct) {
        return MemoryUtil.memGetInt(struct + ISTEXT);
    }

    public static long ndataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + DATASIZE);
    }

    public static ByteBuffer npData(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + PDATA), (int) ndataSize(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nproperty(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROPERTY, value);
    }

    public static void nisText(long struct, int value) {
        MemoryUtil.memPutInt(struct + ISTEXT, value);
    }

    public static void ndataSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DATASIZE, value);
    }

    public static void npData(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PDATA, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ndataSize(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelinePropertyQueryResultARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphPipelinePropertyQueryResultARM, Buffer> implements NativeResource {
        private static final VkDataGraphPipelinePropertyQueryResultARM ELEMENT_FACTORY = VkDataGraphPipelinePropertyQueryResultARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphPipelinePropertyQueryResultARM.SIZEOF);
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
        public VkDataGraphPipelinePropertyQueryResultARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphPipelinePropertyQueryResultARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDataGraphPipelinePropertyQueryResultARM.npNext(address());
        }

        @NativeType("VkDataGraphPipelinePropertyARM")
        public int property() {
            return VkDataGraphPipelinePropertyQueryResultARM.nproperty(address());
        }

        @NativeType("VkBool32")
        public boolean isText() {
            return VkDataGraphPipelinePropertyQueryResultARM.nisText(address()) != 0;
        }

        @NativeType("size_t")
        public long dataSize() {
            return VkDataGraphPipelinePropertyQueryResultARM.ndataSize(address());
        }

        @NativeType("void *")
        public ByteBuffer pData() {
            return VkDataGraphPipelinePropertyQueryResultARM.npData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphPipelinePropertyQueryResultARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDataGraphPipelinePropertyQueryResultARM.npNext(address(), value);
            return this;
        }

        public Buffer property(@NativeType("VkDataGraphPipelinePropertyARM") int value) {
            VkDataGraphPipelinePropertyQueryResultARM.nproperty(address(), value);
            return this;
        }

        public Buffer isText(@NativeType("VkBool32") boolean value) {
            VkDataGraphPipelinePropertyQueryResultARM.nisText(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dataSize(@NativeType("size_t") long value) {
            VkDataGraphPipelinePropertyQueryResultARM.ndataSize(address(), value);
            return this;
        }

        public Buffer pData(@NativeType("void *") ByteBuffer value) {
            VkDataGraphPipelinePropertyQueryResultARM.npData(address(), value);
            return this;
        }
    }
}
