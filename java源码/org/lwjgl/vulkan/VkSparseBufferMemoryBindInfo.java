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
import org.lwjgl.vulkan.VkSparseMemoryBind;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseBufferMemoryBindInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseBufferMemoryBindInfo.class */
public class VkSparseBufferMemoryBindInfo extends Struct<VkSparseBufferMemoryBindInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BUFFER;
    public static final int BINDCOUNT;
    public static final int PBINDS;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BUFFER = layout.offsetof(0);
        BINDCOUNT = layout.offsetof(1);
        PBINDS = layout.offsetof(2);
    }

    protected VkSparseBufferMemoryBindInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSparseBufferMemoryBindInfo create(long address, ByteBuffer container) {
        return new VkSparseBufferMemoryBindInfo(address, container);
    }

    public VkSparseBufferMemoryBindInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkBuffer")
    public long buffer() {
        return nbuffer(address());
    }

    @NativeType("uint32_t")
    public int bindCount() {
        return nbindCount(address());
    }

    @NativeType("VkSparseMemoryBind const *")
    public VkSparseMemoryBind.Buffer pBinds() {
        return npBinds(address());
    }

    public VkSparseBufferMemoryBindInfo buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkSparseBufferMemoryBindInfo pBinds(@NativeType("VkSparseMemoryBind const *") VkSparseMemoryBind.Buffer value) {
        npBinds(address(), value);
        return this;
    }

    public VkSparseBufferMemoryBindInfo set(long buffer, VkSparseMemoryBind.Buffer pBinds) {
        buffer(buffer);
        pBinds(pBinds);
        return this;
    }

    public VkSparseBufferMemoryBindInfo set(VkSparseBufferMemoryBindInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSparseBufferMemoryBindInfo malloc() {
        return new VkSparseBufferMemoryBindInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSparseBufferMemoryBindInfo calloc() {
        return new VkSparseBufferMemoryBindInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSparseBufferMemoryBindInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseBufferMemoryBindInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSparseBufferMemoryBindInfo create(long address) {
        return new VkSparseBufferMemoryBindInfo(address, null);
    }

    public static VkSparseBufferMemoryBindInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSparseBufferMemoryBindInfo(address, null);
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

    public static VkSparseBufferMemoryBindInfo malloc(MemoryStack stack) {
        return new VkSparseBufferMemoryBindInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSparseBufferMemoryBindInfo calloc(MemoryStack stack) {
        return new VkSparseBufferMemoryBindInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nbuffer(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFER);
    }

    public static int nbindCount(long struct) {
        return MemoryUtil.memGetInt(struct + BINDCOUNT);
    }

    public static VkSparseMemoryBind.Buffer npBinds(long struct) {
        return VkSparseMemoryBind.create(MemoryUtil.memGetAddress(struct + PBINDS), nbindCount(struct));
    }

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFER, value);
    }

    public static void nbindCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDCOUNT, value);
    }

    public static void npBinds(long struct, VkSparseMemoryBind.Buffer value) {
        MemoryUtil.memPutAddress(struct + PBINDS, value.address());
        nbindCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PBINDS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseBufferMemoryBindInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseBufferMemoryBindInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSparseBufferMemoryBindInfo, Buffer> implements NativeResource {
        private static final VkSparseBufferMemoryBindInfo ELEMENT_FACTORY = VkSparseBufferMemoryBindInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSparseBufferMemoryBindInfo.SIZEOF);
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
        public VkSparseBufferMemoryBindInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkSparseBufferMemoryBindInfo.nbuffer(address());
        }

        @NativeType("uint32_t")
        public int bindCount() {
            return VkSparseBufferMemoryBindInfo.nbindCount(address());
        }

        @NativeType("VkSparseMemoryBind const *")
        public VkSparseMemoryBind.Buffer pBinds() {
            return VkSparseBufferMemoryBindInfo.npBinds(address());
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkSparseBufferMemoryBindInfo.nbuffer(address(), value);
            return this;
        }

        public Buffer pBinds(@NativeType("VkSparseMemoryBind const *") VkSparseMemoryBind.Buffer value) {
            VkSparseBufferMemoryBindInfo.npBinds(address(), value);
            return this;
        }
    }
}
