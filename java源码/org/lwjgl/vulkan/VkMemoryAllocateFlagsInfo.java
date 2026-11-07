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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryAllocateFlagsInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryAllocateFlagsInfo.class */
public class VkMemoryAllocateFlagsInfo extends Struct<VkMemoryAllocateFlagsInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DEVICEMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DEVICEMASK = layout.offsetof(3);
    }

    protected VkMemoryAllocateFlagsInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryAllocateFlagsInfo create(long address, ByteBuffer container) {
        return new VkMemoryAllocateFlagsInfo(address, container);
    }

    public VkMemoryAllocateFlagsInfo(ByteBuffer container) {
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

    @NativeType("VkMemoryAllocateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int deviceMask() {
        return ndeviceMask(address());
    }

    public VkMemoryAllocateFlagsInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryAllocateFlagsInfo sType$Default() {
        return sType(1000060000);
    }

    public VkMemoryAllocateFlagsInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryAllocateFlagsInfo flags(@NativeType("VkMemoryAllocateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkMemoryAllocateFlagsInfo deviceMask(@NativeType("uint32_t") int value) {
        ndeviceMask(address(), value);
        return this;
    }

    public VkMemoryAllocateFlagsInfo set(int sType, long pNext, int flags, int deviceMask) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        deviceMask(deviceMask);
        return this;
    }

    public VkMemoryAllocateFlagsInfo set(VkMemoryAllocateFlagsInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryAllocateFlagsInfo malloc() {
        return new VkMemoryAllocateFlagsInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryAllocateFlagsInfo calloc() {
        return new VkMemoryAllocateFlagsInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryAllocateFlagsInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryAllocateFlagsInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryAllocateFlagsInfo create(long address) {
        return new VkMemoryAllocateFlagsInfo(address, null);
    }

    public static VkMemoryAllocateFlagsInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryAllocateFlagsInfo(address, null);
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

    public static VkMemoryAllocateFlagsInfo malloc(MemoryStack stack) {
        return new VkMemoryAllocateFlagsInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryAllocateFlagsInfo calloc(MemoryStack stack) {
        return new VkMemoryAllocateFlagsInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int ndeviceMask(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEMASK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ndeviceMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEMASK, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryAllocateFlagsInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryAllocateFlagsInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryAllocateFlagsInfo, Buffer> implements NativeResource {
        private static final VkMemoryAllocateFlagsInfo ELEMENT_FACTORY = VkMemoryAllocateFlagsInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryAllocateFlagsInfo.SIZEOF);
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
        public VkMemoryAllocateFlagsInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryAllocateFlagsInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMemoryAllocateFlagsInfo.npNext(address());
        }

        @NativeType("VkMemoryAllocateFlags")
        public int flags() {
            return VkMemoryAllocateFlagsInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int deviceMask() {
            return VkMemoryAllocateFlagsInfo.ndeviceMask(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryAllocateFlagsInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000060000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryAllocateFlagsInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkMemoryAllocateFlags") int value) {
            VkMemoryAllocateFlagsInfo.nflags(address(), value);
            return this;
        }

        public Buffer deviceMask(@NativeType("uint32_t") int value) {
            VkMemoryAllocateFlagsInfo.ndeviceMask(address(), value);
            return this;
        }
    }
}
