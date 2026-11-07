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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyAccelerationStructureToMemoryInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyAccelerationStructureToMemoryInfoKHR.class */
public class VkCopyAccelerationStructureToMemoryInfoKHR extends Struct<VkCopyAccelerationStructureToMemoryInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRC;
    public static final int DST;
    public static final int MODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(VkDeviceOrHostAddressKHR.SIZEOF, VkDeviceOrHostAddressKHR.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRC = layout.offsetof(2);
        DST = layout.offsetof(3);
        MODE = layout.offsetof(4);
    }

    protected VkCopyAccelerationStructureToMemoryInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyAccelerationStructureToMemoryInfoKHR create(long address, ByteBuffer container) {
        return new VkCopyAccelerationStructureToMemoryInfoKHR(address, container);
    }

    public VkCopyAccelerationStructureToMemoryInfoKHR(ByteBuffer container) {
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

    @NativeType("VkAccelerationStructureKHR")
    public long src() {
        return nsrc(address());
    }

    public VkDeviceOrHostAddressKHR dst() {
        return ndst(address());
    }

    @NativeType("VkCopyAccelerationStructureModeKHR")
    public int mode() {
        return nmode(address());
    }

    public VkCopyAccelerationStructureToMemoryInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCopyAccelerationStructureToMemoryInfoKHR sType$Default() {
        return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR);
    }

    public VkCopyAccelerationStructureToMemoryInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCopyAccelerationStructureToMemoryInfoKHR src(@NativeType("VkAccelerationStructureKHR") long value) {
        nsrc(address(), value);
        return this;
    }

    public VkCopyAccelerationStructureToMemoryInfoKHR dst(VkDeviceOrHostAddressKHR value) {
        ndst(address(), value);
        return this;
    }

    public VkCopyAccelerationStructureToMemoryInfoKHR dst(Consumer<VkDeviceOrHostAddressKHR> consumer) {
        consumer.accept(dst());
        return this;
    }

    public VkCopyAccelerationStructureToMemoryInfoKHR mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) {
        nmode(address(), value);
        return this;
    }

    public VkCopyAccelerationStructureToMemoryInfoKHR set(int sType, long pNext, long src, VkDeviceOrHostAddressKHR dst, int mode) {
        sType(sType);
        pNext(pNext);
        src(src);
        dst(dst);
        mode(mode);
        return this;
    }

    public VkCopyAccelerationStructureToMemoryInfoKHR set(VkCopyAccelerationStructureToMemoryInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyAccelerationStructureToMemoryInfoKHR malloc() {
        return new VkCopyAccelerationStructureToMemoryInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyAccelerationStructureToMemoryInfoKHR calloc() {
        return new VkCopyAccelerationStructureToMemoryInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyAccelerationStructureToMemoryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyAccelerationStructureToMemoryInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyAccelerationStructureToMemoryInfoKHR create(long address) {
        return new VkCopyAccelerationStructureToMemoryInfoKHR(address, null);
    }

    public static VkCopyAccelerationStructureToMemoryInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyAccelerationStructureToMemoryInfoKHR(address, null);
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

    public static VkCopyAccelerationStructureToMemoryInfoKHR malloc(MemoryStack stack) {
        return new VkCopyAccelerationStructureToMemoryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyAccelerationStructureToMemoryInfoKHR calloc(MemoryStack stack) {
        return new VkCopyAccelerationStructureToMemoryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsrc(long struct) {
        return MemoryUtil.memGetLong(struct + SRC);
    }

    public static VkDeviceOrHostAddressKHR ndst(long struct) {
        return VkDeviceOrHostAddressKHR.create(struct + DST);
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

    public static void nsrc(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRC, value);
    }

    public static void ndst(long struct, VkDeviceOrHostAddressKHR value) {
        MemoryUtil.memCopy(value.address(), struct + DST, VkDeviceOrHostAddressKHR.SIZEOF);
    }

    public static void nmode(long struct, int value) {
        MemoryUtil.memPutInt(struct + MODE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyAccelerationStructureToMemoryInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyAccelerationStructureToMemoryInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyAccelerationStructureToMemoryInfoKHR, Buffer> implements NativeResource {
        private static final VkCopyAccelerationStructureToMemoryInfoKHR ELEMENT_FACTORY = VkCopyAccelerationStructureToMemoryInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyAccelerationStructureToMemoryInfoKHR.SIZEOF);
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
        public VkCopyAccelerationStructureToMemoryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCopyAccelerationStructureToMemoryInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCopyAccelerationStructureToMemoryInfoKHR.npNext(address());
        }

        @NativeType("VkAccelerationStructureKHR")
        public long src() {
            return VkCopyAccelerationStructureToMemoryInfoKHR.nsrc(address());
        }

        public VkDeviceOrHostAddressKHR dst() {
            return VkCopyAccelerationStructureToMemoryInfoKHR.ndst(address());
        }

        @NativeType("VkCopyAccelerationStructureModeKHR")
        public int mode() {
            return VkCopyAccelerationStructureToMemoryInfoKHR.nmode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyAccelerationStructureToMemoryInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyAccelerationStructureToMemoryInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer src(@NativeType("VkAccelerationStructureKHR") long value) {
            VkCopyAccelerationStructureToMemoryInfoKHR.nsrc(address(), value);
            return this;
        }

        public Buffer dst(VkDeviceOrHostAddressKHR value) {
            VkCopyAccelerationStructureToMemoryInfoKHR.ndst(address(), value);
            return this;
        }

        public Buffer dst(Consumer<VkDeviceOrHostAddressKHR> consumer) {
            consumer.accept(dst());
            return this;
        }

        public Buffer mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) {
            VkCopyAccelerationStructureToMemoryInfoKHR.nmode(address(), value);
            return this;
        }
    }
}
