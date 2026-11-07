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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryReportCallbackDataEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryReportCallbackDataEXT.class */
public class VkDeviceMemoryReportCallbackDataEXT extends Struct<VkDeviceMemoryReportCallbackDataEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int TYPE;
    public static final int MEMORYOBJECTID;
    public static final int SIZE;
    public static final int OBJECTTYPE;
    public static final int OBJECTHANDLE;
    public static final int HEAPINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(8), __member(8), __member(4), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TYPE = layout.offsetof(3);
        MEMORYOBJECTID = layout.offsetof(4);
        SIZE = layout.offsetof(5);
        OBJECTTYPE = layout.offsetof(6);
        OBJECTHANDLE = layout.offsetof(7);
        HEAPINDEX = layout.offsetof(8);
    }

    protected VkDeviceMemoryReportCallbackDataEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceMemoryReportCallbackDataEXT create(long address, ByteBuffer container) {
        return new VkDeviceMemoryReportCallbackDataEXT(address, container);
    }

    public VkDeviceMemoryReportCallbackDataEXT(ByteBuffer container) {
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

    @NativeType("VkDeviceMemoryReportFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkDeviceMemoryReportEventTypeEXT")
    public int type() {
        return ntype(address());
    }

    @NativeType("uint64_t")
    public long memoryObjectId() {
        return nmemoryObjectId(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VkObjectType")
    public int objectType() {
        return nobjectType(address());
    }

    @NativeType("uint64_t")
    public long objectHandle() {
        return nobjectHandle(address());
    }

    @NativeType("uint32_t")
    public int heapIndex() {
        return nheapIndex(address());
    }

    public VkDeviceMemoryReportCallbackDataEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceMemoryReportCallbackDataEXT sType$Default() {
        return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT);
    }

    public VkDeviceMemoryReportCallbackDataEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceMemoryReportCallbackDataEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkDeviceMemoryReportCallbackDataEXT set(VkDeviceMemoryReportCallbackDataEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceMemoryReportCallbackDataEXT malloc() {
        return new VkDeviceMemoryReportCallbackDataEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceMemoryReportCallbackDataEXT calloc() {
        return new VkDeviceMemoryReportCallbackDataEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceMemoryReportCallbackDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceMemoryReportCallbackDataEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceMemoryReportCallbackDataEXT create(long address) {
        return new VkDeviceMemoryReportCallbackDataEXT(address, null);
    }

    public static VkDeviceMemoryReportCallbackDataEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceMemoryReportCallbackDataEXT(address, null);
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

    public static VkDeviceMemoryReportCallbackDataEXT malloc(MemoryStack stack) {
        return new VkDeviceMemoryReportCallbackDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceMemoryReportCallbackDataEXT calloc(MemoryStack stack) {
        return new VkDeviceMemoryReportCallbackDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static long nmemoryObjectId(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORYOBJECTID);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static int nobjectType(long struct) {
        return MemoryUtil.memGetInt(struct + OBJECTTYPE);
    }

    public static long nobjectHandle(long struct) {
        return MemoryUtil.memGetLong(struct + OBJECTHANDLE);
    }

    public static int nheapIndex(long struct) {
        return MemoryUtil.memGetInt(struct + HEAPINDEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryReportCallbackDataEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryReportCallbackDataEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceMemoryReportCallbackDataEXT, Buffer> implements NativeResource {
        private static final VkDeviceMemoryReportCallbackDataEXT ELEMENT_FACTORY = VkDeviceMemoryReportCallbackDataEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceMemoryReportCallbackDataEXT.SIZEOF);
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
        public VkDeviceMemoryReportCallbackDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceMemoryReportCallbackDataEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDeviceMemoryReportCallbackDataEXT.npNext(address());
        }

        @NativeType("VkDeviceMemoryReportFlagsEXT")
        public int flags() {
            return VkDeviceMemoryReportCallbackDataEXT.nflags(address());
        }

        @NativeType("VkDeviceMemoryReportEventTypeEXT")
        public int type() {
            return VkDeviceMemoryReportCallbackDataEXT.ntype(address());
        }

        @NativeType("uint64_t")
        public long memoryObjectId() {
            return VkDeviceMemoryReportCallbackDataEXT.nmemoryObjectId(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkDeviceMemoryReportCallbackDataEXT.nsize(address());
        }

        @NativeType("VkObjectType")
        public int objectType() {
            return VkDeviceMemoryReportCallbackDataEXT.nobjectType(address());
        }

        @NativeType("uint64_t")
        public long objectHandle() {
            return VkDeviceMemoryReportCallbackDataEXT.nobjectHandle(address());
        }

        @NativeType("uint32_t")
        public int heapIndex() {
            return VkDeviceMemoryReportCallbackDataEXT.nheapIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceMemoryReportCallbackDataEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDeviceMemoryReportCallbackDataEXT.npNext(address(), value);
            return this;
        }
    }
}
