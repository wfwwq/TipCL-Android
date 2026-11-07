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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferAllocateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferAllocateInfo.class */
public class VkCommandBufferAllocateInfo extends Struct<VkCommandBufferAllocateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COMMANDPOOL;
    public static final int LEVEL;
    public static final int COMMANDBUFFERCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMMANDPOOL = layout.offsetof(2);
        LEVEL = layout.offsetof(3);
        COMMANDBUFFERCOUNT = layout.offsetof(4);
    }

    protected VkCommandBufferAllocateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCommandBufferAllocateInfo create(long address, ByteBuffer container) {
        return new VkCommandBufferAllocateInfo(address, container);
    }

    public VkCommandBufferAllocateInfo(ByteBuffer container) {
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

    @NativeType("VkCommandPool")
    public long commandPool() {
        return ncommandPool(address());
    }

    @NativeType("VkCommandBufferLevel")
    public int level() {
        return nlevel(address());
    }

    @NativeType("uint32_t")
    public int commandBufferCount() {
        return ncommandBufferCount(address());
    }

    public VkCommandBufferAllocateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCommandBufferAllocateInfo sType$Default() {
        return sType(40);
    }

    public VkCommandBufferAllocateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCommandBufferAllocateInfo commandPool(@NativeType("VkCommandPool") long value) {
        ncommandPool(address(), value);
        return this;
    }

    public VkCommandBufferAllocateInfo level(@NativeType("VkCommandBufferLevel") int value) {
        nlevel(address(), value);
        return this;
    }

    public VkCommandBufferAllocateInfo commandBufferCount(@NativeType("uint32_t") int value) {
        ncommandBufferCount(address(), value);
        return this;
    }

    public VkCommandBufferAllocateInfo set(int sType, long pNext, long commandPool, int level, int commandBufferCount) {
        sType(sType);
        pNext(pNext);
        commandPool(commandPool);
        level(level);
        commandBufferCount(commandBufferCount);
        return this;
    }

    public VkCommandBufferAllocateInfo set(VkCommandBufferAllocateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCommandBufferAllocateInfo malloc() {
        return new VkCommandBufferAllocateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCommandBufferAllocateInfo calloc() {
        return new VkCommandBufferAllocateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCommandBufferAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferAllocateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkCommandBufferAllocateInfo create(long address) {
        return new VkCommandBufferAllocateInfo(address, null);
    }

    public static VkCommandBufferAllocateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCommandBufferAllocateInfo(address, null);
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

    public static VkCommandBufferAllocateInfo malloc(MemoryStack stack) {
        return new VkCommandBufferAllocateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCommandBufferAllocateInfo calloc(MemoryStack stack) {
        return new VkCommandBufferAllocateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ncommandPool(long struct) {
        return MemoryUtil.memGetLong(struct + COMMANDPOOL);
    }

    public static int nlevel(long struct) {
        return MemoryUtil.memGetInt(struct + LEVEL);
    }

    public static int ncommandBufferCount(long struct) {
        return MemoryUtil.memGetInt(struct + COMMANDBUFFERCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncommandPool(long struct, long value) {
        MemoryUtil.memPutLong(struct + COMMANDPOOL, value);
    }

    public static void nlevel(long struct, int value) {
        MemoryUtil.memPutInt(struct + LEVEL, value);
    }

    public static void ncommandBufferCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMMANDBUFFERCOUNT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferAllocateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferAllocateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkCommandBufferAllocateInfo, Buffer> implements NativeResource {
        private static final VkCommandBufferAllocateInfo ELEMENT_FACTORY = VkCommandBufferAllocateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCommandBufferAllocateInfo.SIZEOF);
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
        public VkCommandBufferAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCommandBufferAllocateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCommandBufferAllocateInfo.npNext(address());
        }

        @NativeType("VkCommandPool")
        public long commandPool() {
            return VkCommandBufferAllocateInfo.ncommandPool(address());
        }

        @NativeType("VkCommandBufferLevel")
        public int level() {
            return VkCommandBufferAllocateInfo.nlevel(address());
        }

        @NativeType("uint32_t")
        public int commandBufferCount() {
            return VkCommandBufferAllocateInfo.ncommandBufferCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCommandBufferAllocateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(40);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCommandBufferAllocateInfo.npNext(address(), value);
            return this;
        }

        public Buffer commandPool(@NativeType("VkCommandPool") long value) {
            VkCommandBufferAllocateInfo.ncommandPool(address(), value);
            return this;
        }

        public Buffer level(@NativeType("VkCommandBufferLevel") int value) {
            VkCommandBufferAllocateInfo.nlevel(address(), value);
            return this;
        }

        public Buffer commandBufferCount(@NativeType("uint32_t") int value) {
            VkCommandBufferAllocateInfo.ncommandBufferCount(address(), value);
            return this;
        }
    }
}
