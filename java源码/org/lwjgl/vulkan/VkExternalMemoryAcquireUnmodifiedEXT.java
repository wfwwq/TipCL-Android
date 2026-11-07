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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryAcquireUnmodifiedEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryAcquireUnmodifiedEXT.class */
public class VkExternalMemoryAcquireUnmodifiedEXT extends Struct<VkExternalMemoryAcquireUnmodifiedEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ACQUIREUNMODIFIEDMEMORY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACQUIREUNMODIFIEDMEMORY = layout.offsetof(2);
    }

    protected VkExternalMemoryAcquireUnmodifiedEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExternalMemoryAcquireUnmodifiedEXT create(long address, ByteBuffer container) {
        return new VkExternalMemoryAcquireUnmodifiedEXT(address, container);
    }

    public VkExternalMemoryAcquireUnmodifiedEXT(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean acquireUnmodifiedMemory() {
        return nacquireUnmodifiedMemory(address()) != 0;
    }

    public VkExternalMemoryAcquireUnmodifiedEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExternalMemoryAcquireUnmodifiedEXT sType$Default() {
        return sType(EXTExternalMemoryAcquireUnmodified.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT);
    }

    public VkExternalMemoryAcquireUnmodifiedEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExternalMemoryAcquireUnmodifiedEXT acquireUnmodifiedMemory(@NativeType("VkBool32") boolean value) {
        nacquireUnmodifiedMemory(address(), value ? 1 : 0);
        return this;
    }

    public VkExternalMemoryAcquireUnmodifiedEXT set(int sType, long pNext, boolean acquireUnmodifiedMemory) {
        sType(sType);
        pNext(pNext);
        acquireUnmodifiedMemory(acquireUnmodifiedMemory);
        return this;
    }

    public VkExternalMemoryAcquireUnmodifiedEXT set(VkExternalMemoryAcquireUnmodifiedEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalMemoryAcquireUnmodifiedEXT malloc() {
        return new VkExternalMemoryAcquireUnmodifiedEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalMemoryAcquireUnmodifiedEXT calloc() {
        return new VkExternalMemoryAcquireUnmodifiedEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalMemoryAcquireUnmodifiedEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalMemoryAcquireUnmodifiedEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalMemoryAcquireUnmodifiedEXT create(long address) {
        return new VkExternalMemoryAcquireUnmodifiedEXT(address, null);
    }

    public static VkExternalMemoryAcquireUnmodifiedEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalMemoryAcquireUnmodifiedEXT(address, null);
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

    public static VkExternalMemoryAcquireUnmodifiedEXT malloc(MemoryStack stack) {
        return new VkExternalMemoryAcquireUnmodifiedEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalMemoryAcquireUnmodifiedEXT calloc(MemoryStack stack) {
        return new VkExternalMemoryAcquireUnmodifiedEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nacquireUnmodifiedMemory(long struct) {
        return MemoryUtil.memGetInt(struct + ACQUIREUNMODIFIEDMEMORY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nacquireUnmodifiedMemory(long struct, int value) {
        MemoryUtil.memPutInt(struct + ACQUIREUNMODIFIEDMEMORY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryAcquireUnmodifiedEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryAcquireUnmodifiedEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkExternalMemoryAcquireUnmodifiedEXT, Buffer> implements NativeResource {
        private static final VkExternalMemoryAcquireUnmodifiedEXT ELEMENT_FACTORY = VkExternalMemoryAcquireUnmodifiedEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExternalMemoryAcquireUnmodifiedEXT.SIZEOF);
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
        public VkExternalMemoryAcquireUnmodifiedEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExternalMemoryAcquireUnmodifiedEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExternalMemoryAcquireUnmodifiedEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean acquireUnmodifiedMemory() {
            return VkExternalMemoryAcquireUnmodifiedEXT.nacquireUnmodifiedMemory(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalMemoryAcquireUnmodifiedEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTExternalMemoryAcquireUnmodified.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExternalMemoryAcquireUnmodifiedEXT.npNext(address(), value);
            return this;
        }

        public Buffer acquireUnmodifiedMemory(@NativeType("VkBool32") boolean value) {
            VkExternalMemoryAcquireUnmodifiedEXT.nacquireUnmodifiedMemory(address(), value ? 1 : 0);
            return this;
        }
    }
}
