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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayEventInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayEventInfoEXT.class */
public class VkDisplayEventInfoEXT extends Struct<VkDisplayEventInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DISPLAYEVENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISPLAYEVENT = layout.offsetof(2);
    }

    protected VkDisplayEventInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplayEventInfoEXT create(long address, ByteBuffer container) {
        return new VkDisplayEventInfoEXT(address, container);
    }

    public VkDisplayEventInfoEXT(ByteBuffer container) {
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

    @NativeType("VkDisplayEventTypeEXT")
    public int displayEvent() {
        return ndisplayEvent(address());
    }

    public VkDisplayEventInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDisplayEventInfoEXT sType$Default() {
        return sType(EXTDisplayControl.VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT);
    }

    public VkDisplayEventInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDisplayEventInfoEXT displayEvent(@NativeType("VkDisplayEventTypeEXT") int value) {
        ndisplayEvent(address(), value);
        return this;
    }

    public VkDisplayEventInfoEXT set(int sType, long pNext, int displayEvent) {
        sType(sType);
        pNext(pNext);
        displayEvent(displayEvent);
        return this;
    }

    public VkDisplayEventInfoEXT set(VkDisplayEventInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDisplayEventInfoEXT malloc() {
        return new VkDisplayEventInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplayEventInfoEXT calloc() {
        return new VkDisplayEventInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplayEventInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayEventInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplayEventInfoEXT create(long address) {
        return new VkDisplayEventInfoEXT(address, null);
    }

    public static VkDisplayEventInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplayEventInfoEXT(address, null);
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

    public static VkDisplayEventInfoEXT malloc(MemoryStack stack) {
        return new VkDisplayEventInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplayEventInfoEXT calloc(MemoryStack stack) {
        return new VkDisplayEventInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndisplayEvent(long struct) {
        return MemoryUtil.memGetInt(struct + DISPLAYEVENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndisplayEvent(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISPLAYEVENT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayEventInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayEventInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplayEventInfoEXT, Buffer> implements NativeResource {
        private static final VkDisplayEventInfoEXT ELEMENT_FACTORY = VkDisplayEventInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplayEventInfoEXT.SIZEOF);
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
        public VkDisplayEventInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDisplayEventInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDisplayEventInfoEXT.npNext(address());
        }

        @NativeType("VkDisplayEventTypeEXT")
        public int displayEvent() {
            return VkDisplayEventInfoEXT.ndisplayEvent(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDisplayEventInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDisplayControl.VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDisplayEventInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer displayEvent(@NativeType("VkDisplayEventTypeEXT") int value) {
            VkDisplayEventInfoEXT.ndisplayEvent(address(), value);
            return this;
        }
    }
}
