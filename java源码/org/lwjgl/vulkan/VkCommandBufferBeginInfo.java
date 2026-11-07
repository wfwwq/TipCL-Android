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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferBeginInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferBeginInfo.class */
public class VkCommandBufferBeginInfo extends Struct<VkCommandBufferBeginInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PINHERITANCEINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PINHERITANCEINFO = layout.offsetof(3);
    }

    protected VkCommandBufferBeginInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCommandBufferBeginInfo create(long address, ByteBuffer container) {
        return new VkCommandBufferBeginInfo(address, container);
    }

    public VkCommandBufferBeginInfo(ByteBuffer container) {
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

    @NativeType("VkCommandBufferUsageFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkCommandBufferInheritanceInfo const *")
    public VkCommandBufferInheritanceInfo pInheritanceInfo() {
        return npInheritanceInfo(address());
    }

    public VkCommandBufferBeginInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCommandBufferBeginInfo sType$Default() {
        return sType(42);
    }

    public VkCommandBufferBeginInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCommandBufferBeginInfo pNext(VkDeviceGroupCommandBufferBeginInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferBeginInfo pNext(VkDeviceGroupCommandBufferBeginInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferBeginInfo flags(@NativeType("VkCommandBufferUsageFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkCommandBufferBeginInfo pInheritanceInfo(@NativeType("VkCommandBufferInheritanceInfo const *") VkCommandBufferInheritanceInfo value) {
        npInheritanceInfo(address(), value);
        return this;
    }

    public VkCommandBufferBeginInfo set(int sType, long pNext, int flags, VkCommandBufferInheritanceInfo pInheritanceInfo) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pInheritanceInfo(pInheritanceInfo);
        return this;
    }

    public VkCommandBufferBeginInfo set(VkCommandBufferBeginInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCommandBufferBeginInfo malloc() {
        return new VkCommandBufferBeginInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCommandBufferBeginInfo calloc() {
        return new VkCommandBufferBeginInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCommandBufferBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferBeginInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkCommandBufferBeginInfo create(long address) {
        return new VkCommandBufferBeginInfo(address, null);
    }

    public static VkCommandBufferBeginInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCommandBufferBeginInfo(address, null);
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

    public static VkCommandBufferBeginInfo malloc(MemoryStack stack) {
        return new VkCommandBufferBeginInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCommandBufferBeginInfo calloc(MemoryStack stack) {
        return new VkCommandBufferBeginInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkCommandBufferInheritanceInfo npInheritanceInfo(long struct) {
        return VkCommandBufferInheritanceInfo.createSafe(MemoryUtil.memGetAddress(struct + PINHERITANCEINFO));
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

    public static void npInheritanceInfo(long struct, VkCommandBufferInheritanceInfo value) {
        MemoryUtil.memPutAddress(struct + PINHERITANCEINFO, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferBeginInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferBeginInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkCommandBufferBeginInfo, Buffer> implements NativeResource {
        private static final VkCommandBufferBeginInfo ELEMENT_FACTORY = VkCommandBufferBeginInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCommandBufferBeginInfo.SIZEOF);
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
        public VkCommandBufferBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCommandBufferBeginInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCommandBufferBeginInfo.npNext(address());
        }

        @NativeType("VkCommandBufferUsageFlags")
        public int flags() {
            return VkCommandBufferBeginInfo.nflags(address());
        }

        @NativeType("VkCommandBufferInheritanceInfo const *")
        public VkCommandBufferInheritanceInfo pInheritanceInfo() {
            return VkCommandBufferBeginInfo.npInheritanceInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCommandBufferBeginInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(42);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCommandBufferBeginInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDeviceGroupCommandBufferBeginInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceGroupCommandBufferBeginInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkCommandBufferUsageFlags") int value) {
            VkCommandBufferBeginInfo.nflags(address(), value);
            return this;
        }

        public Buffer pInheritanceInfo(@NativeType("VkCommandBufferInheritanceInfo const *") VkCommandBufferInheritanceInfo value) {
            VkCommandBufferBeginInfo.npInheritanceInfo(address(), value);
            return this;
        }
    }
}
