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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPrivateDataSlotCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPrivateDataSlotCreateInfo.class */
public class VkPrivateDataSlotCreateInfo extends Struct<VkPrivateDataSlotCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected VkPrivateDataSlotCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPrivateDataSlotCreateInfo create(long address, ByteBuffer container) {
        return new VkPrivateDataSlotCreateInfo(address, container);
    }

    public VkPrivateDataSlotCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPrivateDataSlotCreateFlags")
    public int flags() {
        return nflags(address());
    }

    public VkPrivateDataSlotCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPrivateDataSlotCreateInfo sType$Default() {
        return sType(1000295002);
    }

    public VkPrivateDataSlotCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPrivateDataSlotCreateInfo flags(@NativeType("VkPrivateDataSlotCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPrivateDataSlotCreateInfo set(int sType, long pNext, int flags) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        return this;
    }

    public VkPrivateDataSlotCreateInfo set(VkPrivateDataSlotCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPrivateDataSlotCreateInfo malloc() {
        return new VkPrivateDataSlotCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPrivateDataSlotCreateInfo calloc() {
        return new VkPrivateDataSlotCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPrivateDataSlotCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPrivateDataSlotCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPrivateDataSlotCreateInfo create(long address) {
        return new VkPrivateDataSlotCreateInfo(address, null);
    }

    public static VkPrivateDataSlotCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPrivateDataSlotCreateInfo(address, null);
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

    public static VkPrivateDataSlotCreateInfo malloc(MemoryStack stack) {
        return new VkPrivateDataSlotCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPrivateDataSlotCreateInfo calloc(MemoryStack stack) {
        return new VkPrivateDataSlotCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPrivateDataSlotCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPrivateDataSlotCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPrivateDataSlotCreateInfo, Buffer> implements NativeResource {
        private static final VkPrivateDataSlotCreateInfo ELEMENT_FACTORY = VkPrivateDataSlotCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPrivateDataSlotCreateInfo.SIZEOF);
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
        public VkPrivateDataSlotCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPrivateDataSlotCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPrivateDataSlotCreateInfo.npNext(address());
        }

        @NativeType("VkPrivateDataSlotCreateFlags")
        public int flags() {
            return VkPrivateDataSlotCreateInfo.nflags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPrivateDataSlotCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000295002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPrivateDataSlotCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPrivateDataSlotCreateFlags") int value) {
            VkPrivateDataSlotCreateInfo.nflags(address(), value);
            return this;
        }
    }
}
