package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToAccelerationStructureInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToAccelerationStructureInfoKHR.class */
public class VkCopyMemoryToAccelerationStructureInfoKHR extends Struct<VkCopyMemoryToAccelerationStructureInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRC;
    public static final int DST;
    public static final int MODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRC = layout.offsetof(2);
        DST = layout.offsetof(3);
        MODE = layout.offsetof(4);
    }

    protected VkCopyMemoryToAccelerationStructureInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyMemoryToAccelerationStructureInfoKHR create(long address, ByteBuffer container) {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(address, container);
    }

    public VkCopyMemoryToAccelerationStructureInfoKHR(ByteBuffer container) {
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

    public VkDeviceOrHostAddressConstKHR src() {
        return nsrc(address());
    }

    @NativeType("VkAccelerationStructureKHR")
    public long dst() {
        return ndst(address());
    }

    @NativeType("VkCopyAccelerationStructureModeKHR")
    public int mode() {
        return nmode(address());
    }

    public VkCopyMemoryToAccelerationStructureInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCopyMemoryToAccelerationStructureInfoKHR sType$Default() {
        return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR);
    }

    public VkCopyMemoryToAccelerationStructureInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCopyMemoryToAccelerationStructureInfoKHR src(VkDeviceOrHostAddressConstKHR value) {
        nsrc(address(), value);
        return this;
    }

    public VkCopyMemoryToAccelerationStructureInfoKHR src(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(src());
        return this;
    }

    public VkCopyMemoryToAccelerationStructureInfoKHR dst(@NativeType("VkAccelerationStructureKHR") long value) {
        ndst(address(), value);
        return this;
    }

    public VkCopyMemoryToAccelerationStructureInfoKHR mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) {
        nmode(address(), value);
        return this;
    }

    public VkCopyMemoryToAccelerationStructureInfoKHR set(int sType, long pNext, VkDeviceOrHostAddressConstKHR src, long dst, int mode) {
        sType(sType);
        pNext(pNext);
        src(src);
        dst(dst);
        mode(mode);
        return this;
    }

    public VkCopyMemoryToAccelerationStructureInfoKHR set(VkCopyMemoryToAccelerationStructureInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyMemoryToAccelerationStructureInfoKHR malloc() {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyMemoryToAccelerationStructureInfoKHR calloc() {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyMemoryToAccelerationStructureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToAccelerationStructureInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyMemoryToAccelerationStructureInfoKHR create(long address) {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(address, null);
    }

    public static VkCopyMemoryToAccelerationStructureInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyMemoryToAccelerationStructureInfoKHR(address, null);
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

    public static VkCopyMemoryToAccelerationStructureInfoKHR malloc(MemoryStack stack) {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyMemoryToAccelerationStructureInfoKHR calloc(MemoryStack stack) {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkDeviceOrHostAddressConstKHR nsrc(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + SRC);
    }

    public static long ndst(long struct) {
        return MemoryUtil.memGetLong(struct + DST);
    }

    public static int nmode(long struct) {
        return MemoryUtil.memGetInt(struct + MODE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrc(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + SRC, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void ndst(long struct, long value) {
        MemoryUtil.memPutLong(struct + DST, value);
    }

    public static void nmode(long struct, int value) {
        MemoryUtil.memPutInt(struct + MODE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToAccelerationStructureInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToAccelerationStructureInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyMemoryToAccelerationStructureInfoKHR, Buffer> implements NativeResource {
        private static final VkCopyMemoryToAccelerationStructureInfoKHR ELEMENT_FACTORY = VkCopyMemoryToAccelerationStructureInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyMemoryToAccelerationStructureInfoKHR.SIZEOF);
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
        public VkCopyMemoryToAccelerationStructureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCopyMemoryToAccelerationStructureInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCopyMemoryToAccelerationStructureInfoKHR.npNext(address());
        }

        public VkDeviceOrHostAddressConstKHR src() {
            return VkCopyMemoryToAccelerationStructureInfoKHR.nsrc(address());
        }

        @NativeType("VkAccelerationStructureKHR")
        public long dst() {
            return VkCopyMemoryToAccelerationStructureInfoKHR.ndst(address());
        }

        @NativeType("VkCopyAccelerationStructureModeKHR")
        public int mode() {
            return VkCopyMemoryToAccelerationStructureInfoKHR.nmode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyMemoryToAccelerationStructureInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyMemoryToAccelerationStructureInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer src(VkDeviceOrHostAddressConstKHR value) {
            VkCopyMemoryToAccelerationStructureInfoKHR.nsrc(address(), value);
            return this;
        }

        public Buffer src(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(src());
            return this;
        }

        public Buffer dst(@NativeType("VkAccelerationStructureKHR") long value) {
            VkCopyMemoryToAccelerationStructureInfoKHR.ndst(address(), value);
            return this;
        }

        public Buffer mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) {
            VkCopyMemoryToAccelerationStructureInfoKHR.nmode(address(), value);
            return this;
        }
    }
}
