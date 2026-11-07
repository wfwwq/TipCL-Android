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
import org.lwjgl.vulkan.VkSparseImageMemoryBind;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageMemoryBindInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageMemoryBindInfo.class */
public class VkSparseImageMemoryBindInfo extends Struct<VkSparseImageMemoryBindInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int IMAGE;
    public static final int BINDCOUNT;
    public static final int PBINDS;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        IMAGE = layout.offsetof(0);
        BINDCOUNT = layout.offsetof(1);
        PBINDS = layout.offsetof(2);
    }

    protected VkSparseImageMemoryBindInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSparseImageMemoryBindInfo create(long address, ByteBuffer container) {
        return new VkSparseImageMemoryBindInfo(address, container);
    }

    public VkSparseImageMemoryBindInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkImage")
    public long image() {
        return nimage(address());
    }

    @NativeType("uint32_t")
    public int bindCount() {
        return nbindCount(address());
    }

    @NativeType("VkSparseImageMemoryBind const *")
    public VkSparseImageMemoryBind.Buffer pBinds() {
        return npBinds(address());
    }

    public VkSparseImageMemoryBindInfo image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    public VkSparseImageMemoryBindInfo pBinds(@NativeType("VkSparseImageMemoryBind const *") VkSparseImageMemoryBind.Buffer value) {
        npBinds(address(), value);
        return this;
    }

    public VkSparseImageMemoryBindInfo set(long image, VkSparseImageMemoryBind.Buffer pBinds) {
        image(image);
        pBinds(pBinds);
        return this;
    }

    public VkSparseImageMemoryBindInfo set(VkSparseImageMemoryBindInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSparseImageMemoryBindInfo malloc() {
        return new VkSparseImageMemoryBindInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSparseImageMemoryBindInfo calloc() {
        return new VkSparseImageMemoryBindInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSparseImageMemoryBindInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseImageMemoryBindInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSparseImageMemoryBindInfo create(long address) {
        return new VkSparseImageMemoryBindInfo(address, null);
    }

    public static VkSparseImageMemoryBindInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSparseImageMemoryBindInfo(address, null);
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

    public static VkSparseImageMemoryBindInfo malloc(MemoryStack stack) {
        return new VkSparseImageMemoryBindInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSparseImageMemoryBindInfo calloc(MemoryStack stack) {
        return new VkSparseImageMemoryBindInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nimage(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGE);
    }

    public static int nbindCount(long struct) {
        return MemoryUtil.memGetInt(struct + BINDCOUNT);
    }

    public static VkSparseImageMemoryBind.Buffer npBinds(long struct) {
        return VkSparseImageMemoryBind.create(MemoryUtil.memGetAddress(struct + PBINDS), nbindCount(struct));
    }

    public static void nimage(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGE, value);
    }

    public static void nbindCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDCOUNT, value);
    }

    public static void npBinds(long struct, VkSparseImageMemoryBind.Buffer value) {
        MemoryUtil.memPutAddress(struct + PBINDS, value.address());
        nbindCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PBINDS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageMemoryBindInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageMemoryBindInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSparseImageMemoryBindInfo, Buffer> implements NativeResource {
        private static final VkSparseImageMemoryBindInfo ELEMENT_FACTORY = VkSparseImageMemoryBindInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSparseImageMemoryBindInfo.SIZEOF);
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
        public VkSparseImageMemoryBindInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkImage")
        public long image() {
            return VkSparseImageMemoryBindInfo.nimage(address());
        }

        @NativeType("uint32_t")
        public int bindCount() {
            return VkSparseImageMemoryBindInfo.nbindCount(address());
        }

        @NativeType("VkSparseImageMemoryBind const *")
        public VkSparseImageMemoryBind.Buffer pBinds() {
            return VkSparseImageMemoryBindInfo.npBinds(address());
        }

        public Buffer image(@NativeType("VkImage") long value) {
            VkSparseImageMemoryBindInfo.nimage(address(), value);
            return this;
        }

        public Buffer pBinds(@NativeType("VkSparseImageMemoryBind const *") VkSparseImageMemoryBind.Buffer value) {
            VkSparseImageMemoryBindInfo.npBinds(address(), value);
            return this;
        }
    }
}
