package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocationCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocationCreateInfo.class */
public class VmaAllocationCreateInfo extends Struct<VmaAllocationCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int USAGE;
    public static final int REQUIREDFLAGS;
    public static final int PREFERREDFLAGS;
    public static final int MEMORYTYPEBITS;
    public static final int POOL;
    public static final int PUSERDATA;
    public static final int PRIORITY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        USAGE = layout.offsetof(1);
        REQUIREDFLAGS = layout.offsetof(2);
        PREFERREDFLAGS = layout.offsetof(3);
        MEMORYTYPEBITS = layout.offsetof(4);
        POOL = layout.offsetof(5);
        PUSERDATA = layout.offsetof(6);
        PRIORITY = layout.offsetof(7);
    }

    protected VmaAllocationCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaAllocationCreateInfo create(long address, ByteBuffer container) {
        return new VmaAllocationCreateInfo(address, container);
    }

    public VmaAllocationCreateInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VmaAllocationCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VmaMemoryUsage")
    public int usage() {
        return nusage(address());
    }

    @NativeType("VkMemoryPropertyFlags")
    public int requiredFlags() {
        return nrequiredFlags(address());
    }

    @NativeType("VkMemoryPropertyFlags")
    public int preferredFlags() {
        return npreferredFlags(address());
    }

    @NativeType("uint32_t")
    public int memoryTypeBits() {
        return nmemoryTypeBits(address());
    }

    @NativeType("VmaPool")
    public long pool() {
        return npool(address());
    }

    @NativeType("void *")
    public long pUserData() {
        return npUserData(address());
    }

    public float priority() {
        return npriority(address());
    }

    public VmaAllocationCreateInfo flags(@NativeType("VmaAllocationCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VmaAllocationCreateInfo usage(@NativeType("VmaMemoryUsage") int value) {
        nusage(address(), value);
        return this;
    }

    public VmaAllocationCreateInfo requiredFlags(@NativeType("VkMemoryPropertyFlags") int value) {
        nrequiredFlags(address(), value);
        return this;
    }

    public VmaAllocationCreateInfo preferredFlags(@NativeType("VkMemoryPropertyFlags") int value) {
        npreferredFlags(address(), value);
        return this;
    }

    public VmaAllocationCreateInfo memoryTypeBits(@NativeType("uint32_t") int value) {
        nmemoryTypeBits(address(), value);
        return this;
    }

    public VmaAllocationCreateInfo pool(@NativeType("VmaPool") long value) {
        npool(address(), value);
        return this;
    }

    public VmaAllocationCreateInfo pUserData(@NativeType("void *") long value) {
        npUserData(address(), value);
        return this;
    }

    public VmaAllocationCreateInfo priority(float value) {
        npriority(address(), value);
        return this;
    }

    public VmaAllocationCreateInfo set(int flags, int usage, int requiredFlags, int preferredFlags, int memoryTypeBits, long pool, long pUserData, float priority) {
        flags(flags);
        usage(usage);
        requiredFlags(requiredFlags);
        preferredFlags(preferredFlags);
        memoryTypeBits(memoryTypeBits);
        pool(pool);
        pUserData(pUserData);
        priority(priority);
        return this;
    }

    public VmaAllocationCreateInfo set(VmaAllocationCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VmaAllocationCreateInfo malloc() {
        return new VmaAllocationCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaAllocationCreateInfo calloc() {
        return new VmaAllocationCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaAllocationCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaAllocationCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VmaAllocationCreateInfo create(long address) {
        return new VmaAllocationCreateInfo(address, null);
    }

    public static VmaAllocationCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaAllocationCreateInfo(address, null);
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

    public static VmaAllocationCreateInfo malloc(MemoryStack stack) {
        return new VmaAllocationCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaAllocationCreateInfo calloc(MemoryStack stack) {
        return new VmaAllocationCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nusage(long struct) {
        return MemoryUtil.memGetInt(struct + USAGE);
    }

    public static int nrequiredFlags(long struct) {
        return MemoryUtil.memGetInt(struct + REQUIREDFLAGS);
    }

    public static int npreferredFlags(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDFLAGS);
    }

    public static int nmemoryTypeBits(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYTYPEBITS);
    }

    public static long npool(long struct) {
        return MemoryUtil.memGetAddress(struct + POOL);
    }

    public static long npUserData(long struct) {
        return MemoryUtil.memGetAddress(struct + PUSERDATA);
    }

    public static float npriority(long struct) {
        return MemoryUtil.memGetFloat(struct + PRIORITY);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nusage(long struct, int value) {
        MemoryUtil.memPutInt(struct + USAGE, value);
    }

    public static void nrequiredFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + REQUIREDFLAGS, value);
    }

    public static void npreferredFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + PREFERREDFLAGS, value);
    }

    public static void nmemoryTypeBits(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYTYPEBITS, value);
    }

    public static void npool(long struct, long value) {
        MemoryUtil.memPutAddress(struct + POOL, value);
    }

    public static void npUserData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PUSERDATA, value);
    }

    public static void npriority(long struct, float value) {
        MemoryUtil.memPutFloat(struct + PRIORITY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocationCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocationCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VmaAllocationCreateInfo, Buffer> implements NativeResource {
        private static final VmaAllocationCreateInfo ELEMENT_FACTORY = VmaAllocationCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaAllocationCreateInfo.SIZEOF);
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
        public VmaAllocationCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VmaAllocationCreateFlags")
        public int flags() {
            return VmaAllocationCreateInfo.nflags(address());
        }

        @NativeType("VmaMemoryUsage")
        public int usage() {
            return VmaAllocationCreateInfo.nusage(address());
        }

        @NativeType("VkMemoryPropertyFlags")
        public int requiredFlags() {
            return VmaAllocationCreateInfo.nrequiredFlags(address());
        }

        @NativeType("VkMemoryPropertyFlags")
        public int preferredFlags() {
            return VmaAllocationCreateInfo.npreferredFlags(address());
        }

        @NativeType("uint32_t")
        public int memoryTypeBits() {
            return VmaAllocationCreateInfo.nmemoryTypeBits(address());
        }

        @NativeType("VmaPool")
        public long pool() {
            return VmaAllocationCreateInfo.npool(address());
        }

        @NativeType("void *")
        public long pUserData() {
            return VmaAllocationCreateInfo.npUserData(address());
        }

        public float priority() {
            return VmaAllocationCreateInfo.npriority(address());
        }

        public Buffer flags(@NativeType("VmaAllocationCreateFlags") int value) {
            VmaAllocationCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer usage(@NativeType("VmaMemoryUsage") int value) {
            VmaAllocationCreateInfo.nusage(address(), value);
            return this;
        }

        public Buffer requiredFlags(@NativeType("VkMemoryPropertyFlags") int value) {
            VmaAllocationCreateInfo.nrequiredFlags(address(), value);
            return this;
        }

        public Buffer preferredFlags(@NativeType("VkMemoryPropertyFlags") int value) {
            VmaAllocationCreateInfo.npreferredFlags(address(), value);
            return this;
        }

        public Buffer memoryTypeBits(@NativeType("uint32_t") int value) {
            VmaAllocationCreateInfo.nmemoryTypeBits(address(), value);
            return this;
        }

        public Buffer pool(@NativeType("VmaPool") long value) {
            VmaAllocationCreateInfo.npool(address(), value);
            return this;
        }

        public Buffer pUserData(@NativeType("void *") long value) {
            VmaAllocationCreateInfo.npUserData(address(), value);
            return this;
        }

        public Buffer priority(float value) {
            VmaAllocationCreateInfo.npriority(address(), value);
            return this;
        }
    }
}
