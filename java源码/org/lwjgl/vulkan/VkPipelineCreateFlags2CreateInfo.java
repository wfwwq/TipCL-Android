package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreateFlags2CreateInfo.class */
public class VkPipelineCreateFlags2CreateInfo extends Struct<VkPipelineCreateFlags2CreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected VkPipelineCreateFlags2CreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineCreateFlags2CreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineCreateFlags2CreateInfo(address, container);
    }

    public VkPipelineCreateFlags2CreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineCreateFlags2")
    public long flags() {
        return nflags(address());
    }

    public VkPipelineCreateFlags2CreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineCreateFlags2CreateInfo sType$Default() {
        return sType(1000470005);
    }

    public VkPipelineCreateFlags2CreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineCreateFlags2CreateInfo flags(@NativeType("VkPipelineCreateFlags2") long value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineCreateFlags2CreateInfo set(int sType, long pNext, long flags) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        return this;
    }

    public VkPipelineCreateFlags2CreateInfo set(VkPipelineCreateFlags2CreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineCreateFlags2CreateInfo malloc() {
        return new VkPipelineCreateFlags2CreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineCreateFlags2CreateInfo calloc() {
        return new VkPipelineCreateFlags2CreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineCreateFlags2CreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCreateFlags2CreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineCreateFlags2CreateInfo create(long address) {
        return new VkPipelineCreateFlags2CreateInfo(address, null);
    }

    public static VkPipelineCreateFlags2CreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineCreateFlags2CreateInfo(address, null);
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

    public static VkPipelineCreateFlags2CreateInfo malloc(MemoryStack stack) {
        return new VkPipelineCreateFlags2CreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineCreateFlags2CreateInfo calloc(MemoryStack stack) {
        return new VkPipelineCreateFlags2CreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nflags(long struct) {
        return MemoryUtil.memGetLong(struct + FLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, long value) {
        MemoryUtil.memPutLong(struct + FLAGS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreateFlags2CreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineCreateFlags2CreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineCreateFlags2CreateInfo ELEMENT_FACTORY = VkPipelineCreateFlags2CreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineCreateFlags2CreateInfo.SIZEOF);
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
        public VkPipelineCreateFlags2CreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineCreateFlags2CreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineCreateFlags2CreateInfo.npNext(address());
        }

        @NativeType("VkPipelineCreateFlags2")
        public long flags() {
            return VkPipelineCreateFlags2CreateInfo.nflags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineCreateFlags2CreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000470005);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineCreateFlags2CreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineCreateFlags2") long value) {
            VkPipelineCreateFlags2CreateInfo.nflags(address(), value);
            return this;
        }
    }
}
