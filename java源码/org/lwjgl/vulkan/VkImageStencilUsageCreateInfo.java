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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageStencilUsageCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageStencilUsageCreateInfo.class */
public class VkImageStencilUsageCreateInfo extends Struct<VkImageStencilUsageCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STENCILUSAGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STENCILUSAGE = layout.offsetof(2);
    }

    protected VkImageStencilUsageCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageStencilUsageCreateInfo create(long address, ByteBuffer container) {
        return new VkImageStencilUsageCreateInfo(address, container);
    }

    public VkImageStencilUsageCreateInfo(ByteBuffer container) {
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

    @NativeType("VkImageUsageFlags")
    public int stencilUsage() {
        return nstencilUsage(address());
    }

    public VkImageStencilUsageCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageStencilUsageCreateInfo sType$Default() {
        return sType(1000246000);
    }

    public VkImageStencilUsageCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageStencilUsageCreateInfo stencilUsage(@NativeType("VkImageUsageFlags") int value) {
        nstencilUsage(address(), value);
        return this;
    }

    public VkImageStencilUsageCreateInfo set(int sType, long pNext, int stencilUsage) {
        sType(sType);
        pNext(pNext);
        stencilUsage(stencilUsage);
        return this;
    }

    public VkImageStencilUsageCreateInfo set(VkImageStencilUsageCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageStencilUsageCreateInfo malloc() {
        return new VkImageStencilUsageCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageStencilUsageCreateInfo calloc() {
        return new VkImageStencilUsageCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageStencilUsageCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageStencilUsageCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkImageStencilUsageCreateInfo create(long address) {
        return new VkImageStencilUsageCreateInfo(address, null);
    }

    public static VkImageStencilUsageCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageStencilUsageCreateInfo(address, null);
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

    public static VkImageStencilUsageCreateInfo malloc(MemoryStack stack) {
        return new VkImageStencilUsageCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageStencilUsageCreateInfo calloc(MemoryStack stack) {
        return new VkImageStencilUsageCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstencilUsage(long struct) {
        return MemoryUtil.memGetInt(struct + STENCILUSAGE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstencilUsage(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCILUSAGE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageStencilUsageCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageStencilUsageCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageStencilUsageCreateInfo, Buffer> implements NativeResource {
        private static final VkImageStencilUsageCreateInfo ELEMENT_FACTORY = VkImageStencilUsageCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageStencilUsageCreateInfo.SIZEOF);
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
        public VkImageStencilUsageCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageStencilUsageCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageStencilUsageCreateInfo.npNext(address());
        }

        @NativeType("VkImageUsageFlags")
        public int stencilUsage() {
            return VkImageStencilUsageCreateInfo.nstencilUsage(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageStencilUsageCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000246000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageStencilUsageCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer stencilUsage(@NativeType("VkImageUsageFlags") int value) {
            VkImageStencilUsageCreateInfo.nstencilUsage(address(), value);
            return this;
        }
    }
}
