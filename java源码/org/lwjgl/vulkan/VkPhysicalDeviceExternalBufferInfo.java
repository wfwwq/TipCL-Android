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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalBufferInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalBufferInfo.class */
public class VkPhysicalDeviceExternalBufferInfo extends Struct<VkPhysicalDeviceExternalBufferInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int USAGE;
    public static final int HANDLETYPE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        USAGE = layout.offsetof(3);
        HANDLETYPE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceExternalBufferInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceExternalBufferInfo create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExternalBufferInfo(address, container);
    }

    public VkPhysicalDeviceExternalBufferInfo(ByteBuffer container) {
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

    @NativeType("VkBufferCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkBufferUsageFlags")
    public int usage() {
        return nusage(address());
    }

    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() {
        return nhandleType(address());
    }

    public VkPhysicalDeviceExternalBufferInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalBufferInfo sType$Default() {
        return sType(1000071002);
    }

    public VkPhysicalDeviceExternalBufferInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalBufferInfo pNext(VkBufferUsageFlags2CreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceExternalBufferInfo pNext(VkBufferUsageFlags2CreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceExternalBufferInfo flags(@NativeType("VkBufferCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalBufferInfo usage(@NativeType("VkBufferUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalBufferInfo handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalBufferInfo set(int sType, long pNext, int flags, int usage, int handleType) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        usage(usage);
        handleType(handleType);
        return this;
    }

    public VkPhysicalDeviceExternalBufferInfo set(VkPhysicalDeviceExternalBufferInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExternalBufferInfo malloc() {
        return new VkPhysicalDeviceExternalBufferInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalBufferInfo calloc() {
        return new VkPhysicalDeviceExternalBufferInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalBufferInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExternalBufferInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExternalBufferInfo create(long address) {
        return new VkPhysicalDeviceExternalBufferInfo(address, null);
    }

    public static VkPhysicalDeviceExternalBufferInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExternalBufferInfo(address, null);
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

    public static VkPhysicalDeviceExternalBufferInfo malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalBufferInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalBufferInfo calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalBufferInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nusage(long struct) {
        return MemoryUtil.memGetInt(struct + USAGE);
    }

    public static int nhandleType(long struct) {
        return MemoryUtil.memGetInt(struct + HANDLETYPE);
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

    public static void nusage(long struct, int value) {
        MemoryUtil.memPutInt(struct + USAGE, value);
    }

    public static void nhandleType(long struct, int value) {
        MemoryUtil.memPutInt(struct + HANDLETYPE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalBufferInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalBufferInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalBufferInfo, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceExternalBufferInfo ELEMENT_FACTORY = VkPhysicalDeviceExternalBufferInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceExternalBufferInfo.SIZEOF);
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
        public VkPhysicalDeviceExternalBufferInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceExternalBufferInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPhysicalDeviceExternalBufferInfo.npNext(address());
        }

        @NativeType("VkBufferCreateFlags")
        public int flags() {
            return VkPhysicalDeviceExternalBufferInfo.nflags(address());
        }

        @NativeType("VkBufferUsageFlags")
        public int usage() {
            return VkPhysicalDeviceExternalBufferInfo.nusage(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() {
            return VkPhysicalDeviceExternalBufferInfo.nhandleType(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExternalBufferInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000071002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceExternalBufferInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkBufferUsageFlags2CreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBufferUsageFlags2CreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkBufferCreateFlags") int value) {
            VkPhysicalDeviceExternalBufferInfo.nflags(address(), value);
            return this;
        }

        public Buffer usage(@NativeType("VkBufferUsageFlags") int value) {
            VkPhysicalDeviceExternalBufferInfo.nusage(address(), value);
            return this;
        }

        public Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
            VkPhysicalDeviceExternalBufferInfo.nhandleType(address(), value);
            return this;
        }
    }
}
