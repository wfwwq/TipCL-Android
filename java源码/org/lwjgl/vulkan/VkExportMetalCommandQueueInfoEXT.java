package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalCommandQueueInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalCommandQueueInfoEXT.class */
public class VkExportMetalCommandQueueInfoEXT extends Struct<VkExportMetalCommandQueueInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int QUEUE;
    public static final int MTLCOMMANDQUEUE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUE = layout.offsetof(2);
        MTLCOMMANDQUEUE = layout.offsetof(3);
    }

    protected VkExportMetalCommandQueueInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExportMetalCommandQueueInfoEXT create(long address, ByteBuffer container) {
        return new VkExportMetalCommandQueueInfoEXT(address, container);
    }

    public VkExportMetalCommandQueueInfoEXT(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkQueue")
    public long queue() {
        return nqueue(address());
    }

    @NativeType("MTLCommandQueue_id")
    public long mtlCommandQueue() {
        return nmtlCommandQueue(address());
    }

    public VkExportMetalCommandQueueInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExportMetalCommandQueueInfoEXT sType$Default() {
        return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT);
    }

    public VkExportMetalCommandQueueInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExportMetalCommandQueueInfoEXT queue(VkQueue value) {
        nqueue(address(), value);
        return this;
    }

    public VkExportMetalCommandQueueInfoEXT mtlCommandQueue(@NativeType("MTLCommandQueue_id") long value) {
        nmtlCommandQueue(address(), value);
        return this;
    }

    public VkExportMetalCommandQueueInfoEXT set(int sType, long pNext, VkQueue queue, long mtlCommandQueue) {
        sType(sType);
        pNext(pNext);
        queue(queue);
        mtlCommandQueue(mtlCommandQueue);
        return this;
    }

    public VkExportMetalCommandQueueInfoEXT set(VkExportMetalCommandQueueInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportMetalCommandQueueInfoEXT malloc() {
        return new VkExportMetalCommandQueueInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportMetalCommandQueueInfoEXT calloc() {
        return new VkExportMetalCommandQueueInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportMetalCommandQueueInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalCommandQueueInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkExportMetalCommandQueueInfoEXT create(long address) {
        return new VkExportMetalCommandQueueInfoEXT(address, null);
    }

    public static VkExportMetalCommandQueueInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportMetalCommandQueueInfoEXT(address, null);
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

    public static VkExportMetalCommandQueueInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalCommandQueueInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportMetalCommandQueueInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalCommandQueueInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nqueue(long struct) {
        return MemoryUtil.memGetAddress(struct + QUEUE);
    }

    public static long nmtlCommandQueue(long struct) {
        return MemoryUtil.memGetAddress(struct + MTLCOMMANDQUEUE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nqueue(long struct, VkQueue value) {
        MemoryUtil.memPutAddress(struct + QUEUE, value.address());
    }

    public static void nmtlCommandQueue(long struct, long value) {
        MemoryUtil.memPutAddress(struct + MTLCOMMANDQUEUE, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + QUEUE));
        Checks.check(MemoryUtil.memGetAddress(struct + MTLCOMMANDQUEUE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalCommandQueueInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalCommandQueueInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkExportMetalCommandQueueInfoEXT, Buffer> implements NativeResource {
        private static final VkExportMetalCommandQueueInfoEXT ELEMENT_FACTORY = VkExportMetalCommandQueueInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExportMetalCommandQueueInfoEXT.SIZEOF);
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
        public VkExportMetalCommandQueueInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExportMetalCommandQueueInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExportMetalCommandQueueInfoEXT.npNext(address());
        }

        @NativeType("VkQueue")
        public long queue() {
            return VkExportMetalCommandQueueInfoEXT.nqueue(address());
        }

        @NativeType("MTLCommandQueue_id")
        public long mtlCommandQueue() {
            return VkExportMetalCommandQueueInfoEXT.nmtlCommandQueue(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportMetalCommandQueueInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportMetalCommandQueueInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer queue(VkQueue value) {
            VkExportMetalCommandQueueInfoEXT.nqueue(address(), value);
            return this;
        }

        public Buffer mtlCommandQueue(@NativeType("MTLCommandQueue_id") long value) {
            VkExportMetalCommandQueueInfoEXT.nmtlCommandQueue(address(), value);
            return this;
        }
    }
}
