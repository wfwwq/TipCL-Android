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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferViewCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferViewCreateInfo.class */
public class VkBufferViewCreateInfo extends Struct<VkBufferViewCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int BUFFER;
    public static final int FORMAT;
    public static final int OFFSET;
    public static final int RANGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
        OFFSET = layout.offsetof(5);
        RANGE = layout.offsetof(6);
    }

    protected VkBufferViewCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBufferViewCreateInfo create(long address, ByteBuffer container) {
        return new VkBufferViewCreateInfo(address, container);
    }

    public VkBufferViewCreateInfo(ByteBuffer container) {
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

    @NativeType("VkBufferViewCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkBuffer")
    public long buffer() {
        return nbuffer(address());
    }

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("VkDeviceSize")
    public long offset() {
        return noffset(address());
    }

    @NativeType("VkDeviceSize")
    public long range() {
        return nrange(address());
    }

    public VkBufferViewCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBufferViewCreateInfo sType$Default() {
        return sType(13);
    }

    public VkBufferViewCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBufferViewCreateInfo pNext(VkBufferUsageFlags2CreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferViewCreateInfo pNext(VkBufferUsageFlags2CreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferViewCreateInfo pNext(VkExportMetalObjectCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferViewCreateInfo flags(@NativeType("VkBufferViewCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkBufferViewCreateInfo buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkBufferViewCreateInfo format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkBufferViewCreateInfo offset(@NativeType("VkDeviceSize") long value) {
        noffset(address(), value);
        return this;
    }

    public VkBufferViewCreateInfo range(@NativeType("VkDeviceSize") long value) {
        nrange(address(), value);
        return this;
    }

    public VkBufferViewCreateInfo set(int sType, long pNext, int flags, long buffer, int format, long offset, long range) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        buffer(buffer);
        format(format);
        offset(offset);
        range(range);
        return this;
    }

    public VkBufferViewCreateInfo set(VkBufferViewCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferViewCreateInfo malloc() {
        return new VkBufferViewCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferViewCreateInfo calloc() {
        return new VkBufferViewCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferViewCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferViewCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferViewCreateInfo create(long address) {
        return new VkBufferViewCreateInfo(address, null);
    }

    public static VkBufferViewCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferViewCreateInfo(address, null);
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

    public static VkBufferViewCreateInfo malloc(MemoryStack stack) {
        return new VkBufferViewCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferViewCreateInfo calloc(MemoryStack stack) {
        return new VkBufferViewCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nbuffer(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFER);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetLong(struct + OFFSET);
    }

    public static long nrange(long struct) {
        return MemoryUtil.memGetLong(struct + RANGE);
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

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFER, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void noffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + OFFSET, value);
    }

    public static void nrange(long struct, long value) {
        MemoryUtil.memPutLong(struct + RANGE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferViewCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferViewCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkBufferViewCreateInfo, Buffer> implements NativeResource {
        private static final VkBufferViewCreateInfo ELEMENT_FACTORY = VkBufferViewCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBufferViewCreateInfo.SIZEOF);
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
        public VkBufferViewCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBufferViewCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBufferViewCreateInfo.npNext(address());
        }

        @NativeType("VkBufferViewCreateFlags")
        public int flags() {
            return VkBufferViewCreateInfo.nflags(address());
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkBufferViewCreateInfo.nbuffer(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkBufferViewCreateInfo.nformat(address());
        }

        @NativeType("VkDeviceSize")
        public long offset() {
            return VkBufferViewCreateInfo.noffset(address());
        }

        @NativeType("VkDeviceSize")
        public long range() {
            return VkBufferViewCreateInfo.nrange(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferViewCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(13);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferViewCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkBufferUsageFlags2CreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBufferUsageFlags2CreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportMetalObjectCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkBufferViewCreateFlags") int value) {
            VkBufferViewCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkBufferViewCreateInfo.nbuffer(address(), value);
            return this;
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkBufferViewCreateInfo.nformat(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("VkDeviceSize") long value) {
            VkBufferViewCreateInfo.noffset(address(), value);
            return this;
        }

        public Buffer range(@NativeType("VkDeviceSize") long value) {
            VkBufferViewCreateInfo.nrange(address(), value);
            return this;
        }
    }
}
