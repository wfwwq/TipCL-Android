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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalSharedEventInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalSharedEventInfoEXT.class */
public class VkExportMetalSharedEventInfoEXT extends Struct<VkExportMetalSharedEventInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SEMAPHORE;
    public static final int EVENT;
    public static final int MTLSHAREDEVENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORE = layout.offsetof(2);
        EVENT = layout.offsetof(3);
        MTLSHAREDEVENT = layout.offsetof(4);
    }

    protected VkExportMetalSharedEventInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExportMetalSharedEventInfoEXT create(long address, ByteBuffer container) {
        return new VkExportMetalSharedEventInfoEXT(address, container);
    }

    public VkExportMetalSharedEventInfoEXT(ByteBuffer container) {
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

    @NativeType("VkSemaphore")
    public long semaphore() {
        return nsemaphore(address());
    }

    @NativeType("VkEvent")
    public long event() {
        return nevent(address());
    }

    @NativeType("MTLSharedEvent_id")
    public long mtlSharedEvent() {
        return nmtlSharedEvent(address());
    }

    public VkExportMetalSharedEventInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExportMetalSharedEventInfoEXT sType$Default() {
        return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT);
    }

    public VkExportMetalSharedEventInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExportMetalSharedEventInfoEXT semaphore(@NativeType("VkSemaphore") long value) {
        nsemaphore(address(), value);
        return this;
    }

    public VkExportMetalSharedEventInfoEXT event(@NativeType("VkEvent") long value) {
        nevent(address(), value);
        return this;
    }

    public VkExportMetalSharedEventInfoEXT mtlSharedEvent(@NativeType("MTLSharedEvent_id") long value) {
        nmtlSharedEvent(address(), value);
        return this;
    }

    public VkExportMetalSharedEventInfoEXT set(int sType, long pNext, long semaphore, long event, long mtlSharedEvent) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        event(event);
        mtlSharedEvent(mtlSharedEvent);
        return this;
    }

    public VkExportMetalSharedEventInfoEXT set(VkExportMetalSharedEventInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportMetalSharedEventInfoEXT malloc() {
        return new VkExportMetalSharedEventInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportMetalSharedEventInfoEXT calloc() {
        return new VkExportMetalSharedEventInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportMetalSharedEventInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalSharedEventInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkExportMetalSharedEventInfoEXT create(long address) {
        return new VkExportMetalSharedEventInfoEXT(address, null);
    }

    public static VkExportMetalSharedEventInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportMetalSharedEventInfoEXT(address, null);
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

    public static VkExportMetalSharedEventInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalSharedEventInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportMetalSharedEventInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalSharedEventInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsemaphore(long struct) {
        return MemoryUtil.memGetLong(struct + SEMAPHORE);
    }

    public static long nevent(long struct) {
        return MemoryUtil.memGetLong(struct + EVENT);
    }

    public static long nmtlSharedEvent(long struct) {
        return MemoryUtil.memGetAddress(struct + MTLSHAREDEVENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsemaphore(long struct, long value) {
        MemoryUtil.memPutLong(struct + SEMAPHORE, value);
    }

    public static void nevent(long struct, long value) {
        MemoryUtil.memPutLong(struct + EVENT, value);
    }

    public static void nmtlSharedEvent(long struct, long value) {
        MemoryUtil.memPutAddress(struct + MTLSHAREDEVENT, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + MTLSHAREDEVENT));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalSharedEventInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalSharedEventInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkExportMetalSharedEventInfoEXT, Buffer> implements NativeResource {
        private static final VkExportMetalSharedEventInfoEXT ELEMENT_FACTORY = VkExportMetalSharedEventInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExportMetalSharedEventInfoEXT.SIZEOF);
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
        public VkExportMetalSharedEventInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExportMetalSharedEventInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExportMetalSharedEventInfoEXT.npNext(address());
        }

        @NativeType("VkSemaphore")
        public long semaphore() {
            return VkExportMetalSharedEventInfoEXT.nsemaphore(address());
        }

        @NativeType("VkEvent")
        public long event() {
            return VkExportMetalSharedEventInfoEXT.nevent(address());
        }

        @NativeType("MTLSharedEvent_id")
        public long mtlSharedEvent() {
            return VkExportMetalSharedEventInfoEXT.nmtlSharedEvent(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportMetalSharedEventInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportMetalSharedEventInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer semaphore(@NativeType("VkSemaphore") long value) {
            VkExportMetalSharedEventInfoEXT.nsemaphore(address(), value);
            return this;
        }

        public Buffer event(@NativeType("VkEvent") long value) {
            VkExportMetalSharedEventInfoEXT.nevent(address(), value);
            return this;
        }

        public Buffer mtlSharedEvent(@NativeType("MTLSharedEvent_id") long value) {
            VkExportMetalSharedEventInfoEXT.nmtlSharedEvent(address(), value);
            return this;
        }
    }
}
