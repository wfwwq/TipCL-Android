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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageOpaqueMemoryBindInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageOpaqueMemoryBindInfo.class */
public class VkSparseImageOpaqueMemoryBindInfo extends Struct<VkSparseImageOpaqueMemoryBindInfo> implements NativeResource {
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

    protected VkSparseImageOpaqueMemoryBindInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSparseImageOpaqueMemoryBindInfo create(long address, ByteBuffer container) {
        return new VkSparseImageOpaqueMemoryBindInfo(address, container);
    }

    public VkSparseImageOpaqueMemoryBindInfo(ByteBuffer container) {
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

    @NativeType("VkSparseMemoryBind const *")
    public VkSparseMemoryBind.Buffer pBinds() {
        return npBinds(address());
    }

    public VkSparseImageOpaqueMemoryBindInfo image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    public VkSparseImageOpaqueMemoryBindInfo pBinds(@NativeType("VkSparseMemoryBind const *") VkSparseMemoryBind.Buffer value) {
        npBinds(address(), value);
        return this;
    }

    public VkSparseImageOpaqueMemoryBindInfo set(long image, VkSparseMemoryBind.Buffer pBinds) {
        image(image);
        pBinds(pBinds);
        return this;
    }

    public VkSparseImageOpaqueMemoryBindInfo set(VkSparseImageOpaqueMemoryBindInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSparseImageOpaqueMemoryBindInfo malloc() {
        return new VkSparseImageOpaqueMemoryBindInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSparseImageOpaqueMemoryBindInfo calloc() {
        return new VkSparseImageOpaqueMemoryBindInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSparseImageOpaqueMemoryBindInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseImageOpaqueMemoryBindInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSparseImageOpaqueMemoryBindInfo create(long address) {
        return new VkSparseImageOpaqueMemoryBindInfo(address, null);
    }

    public static VkSparseImageOpaqueMemoryBindInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSparseImageOpaqueMemoryBindInfo(address, null);
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

    public static VkSparseImageOpaqueMemoryBindInfo malloc(MemoryStack stack) {
        return new VkSparseImageOpaqueMemoryBindInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSparseImageOpaqueMemoryBindInfo calloc(MemoryStack stack) {
        return new VkSparseImageOpaqueMemoryBindInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkSparseMemoryBind.Buffer npBinds(long struct) {
        return VkSparseMemoryBind.create(MemoryUtil.memGetAddress(struct + PBINDS), nbindCount(struct));
    }

    public static void nimage(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGE, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageOpaqueMemoryBindInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageOpaqueMemoryBindInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSparseImageOpaqueMemoryBindInfo, Buffer> implements NativeResource {
        private static final VkSparseImageOpaqueMemoryBindInfo ELEMENT_FACTORY = VkSparseImageOpaqueMemoryBindInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSparseImageOpaqueMemoryBindInfo.SIZEOF);
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
        public VkSparseImageOpaqueMemoryBindInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkImage")
        public long image() {
            return VkSparseImageOpaqueMemoryBindInfo.nimage(address());
        }

        @NativeType("uint32_t")
        public int bindCount() {
            return VkSparseImageOpaqueMemoryBindInfo.nbindCount(address());
        }

        @NativeType("VkSparseMemoryBind const *")
        public VkSparseMemoryBind.Buffer pBinds() {
            return VkSparseImageOpaqueMemoryBindInfo.npBinds(address());
        }

        public Buffer image(@NativeType("VkImage") long value) {
            VkSparseImageOpaqueMemoryBindInfo.nimage(address(), value);
            return this;
        }

        public Buffer pBinds(@NativeType("VkSparseMemoryBind const *") VkSparseMemoryBind.Buffer value) {
            VkSparseImageOpaqueMemoryBindInfo.npBinds(address(), value);
            return this;
        }
    }
}
