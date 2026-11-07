package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferUsageFlags2CreateInfo.class */
public class VkBufferUsageFlags2CreateInfo extends Struct<VkBufferUsageFlags2CreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int USAGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USAGE = layout.offsetof(2);
    }

    protected VkBufferUsageFlags2CreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBufferUsageFlags2CreateInfo create(long address, ByteBuffer container) {
        return new VkBufferUsageFlags2CreateInfo(address, container);
    }

    public VkBufferUsageFlags2CreateInfo(ByteBuffer container) {
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

    @NativeType("VkBufferUsageFlags2")
    public long usage() {
        return nusage(address());
    }

    public VkBufferUsageFlags2CreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBufferUsageFlags2CreateInfo sType$Default() {
        return sType(1000470006);
    }

    public VkBufferUsageFlags2CreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBufferUsageFlags2CreateInfo usage(@NativeType("VkBufferUsageFlags2") long value) {
        nusage(address(), value);
        return this;
    }

    public VkBufferUsageFlags2CreateInfo set(int sType, long pNext, long usage) {
        sType(sType);
        pNext(pNext);
        usage(usage);
        return this;
    }

    public VkBufferUsageFlags2CreateInfo set(VkBufferUsageFlags2CreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferUsageFlags2CreateInfo malloc() {
        return new VkBufferUsageFlags2CreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferUsageFlags2CreateInfo calloc() {
        return new VkBufferUsageFlags2CreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferUsageFlags2CreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferUsageFlags2CreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferUsageFlags2CreateInfo create(long address) {
        return new VkBufferUsageFlags2CreateInfo(address, null);
    }

    public static VkBufferUsageFlags2CreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferUsageFlags2CreateInfo(address, null);
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

    public static VkBufferUsageFlags2CreateInfo malloc(MemoryStack stack) {
        return new VkBufferUsageFlags2CreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferUsageFlags2CreateInfo calloc(MemoryStack stack) {
        return new VkBufferUsageFlags2CreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nusage(long struct) {
        return MemoryUtil.memGetLong(struct + USAGE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nusage(long struct, long value) {
        MemoryUtil.memPutLong(struct + USAGE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferUsageFlags2CreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkBufferUsageFlags2CreateInfo, Buffer> implements NativeResource {
        private static final VkBufferUsageFlags2CreateInfo ELEMENT_FACTORY = VkBufferUsageFlags2CreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBufferUsageFlags2CreateInfo.SIZEOF);
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
        public VkBufferUsageFlags2CreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBufferUsageFlags2CreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBufferUsageFlags2CreateInfo.npNext(address());
        }

        @NativeType("VkBufferUsageFlags2")
        public long usage() {
            return VkBufferUsageFlags2CreateInfo.nusage(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferUsageFlags2CreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000470006);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferUsageFlags2CreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer usage(@NativeType("VkBufferUsageFlags2") long value) {
            VkBufferUsageFlags2CreateInfo.nusage(address(), value);
            return this;
        }
    }
}
