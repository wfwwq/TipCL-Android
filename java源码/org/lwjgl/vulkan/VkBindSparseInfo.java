package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo;
import org.lwjgl.vulkan.VkSparseImageMemoryBindInfo;
import org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindSparseInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindSparseInfo.class */
public class VkBindSparseInfo extends Struct<VkBindSparseInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int WAITSEMAPHORECOUNT;
    public static final int PWAITSEMAPHORES;
    public static final int BUFFERBINDCOUNT;
    public static final int PBUFFERBINDS;
    public static final int IMAGEOPAQUEBINDCOUNT;
    public static final int PIMAGEOPAQUEBINDS;
    public static final int IMAGEBINDCOUNT;
    public static final int PIMAGEBINDS;
    public static final int SIGNALSEMAPHORECOUNT;
    public static final int PSIGNALSEMAPHORES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHORECOUNT = layout.offsetof(2);
        PWAITSEMAPHORES = layout.offsetof(3);
        BUFFERBINDCOUNT = layout.offsetof(4);
        PBUFFERBINDS = layout.offsetof(5);
        IMAGEOPAQUEBINDCOUNT = layout.offsetof(6);
        PIMAGEOPAQUEBINDS = layout.offsetof(7);
        IMAGEBINDCOUNT = layout.offsetof(8);
        PIMAGEBINDS = layout.offsetof(9);
        SIGNALSEMAPHORECOUNT = layout.offsetof(10);
        PSIGNALSEMAPHORES = layout.offsetof(11);
    }

    protected VkBindSparseInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindSparseInfo create(long address, ByteBuffer container) {
        return new VkBindSparseInfo(address, container);
    }

    public VkBindSparseInfo(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int waitSemaphoreCount() {
        return nwaitSemaphoreCount(address());
    }

    @NativeType("VkSemaphore const *")
    public LongBuffer pWaitSemaphores() {
        return npWaitSemaphores(address());
    }

    @NativeType("uint32_t")
    public int bufferBindCount() {
        return nbufferBindCount(address());
    }

    @NativeType("VkSparseBufferMemoryBindInfo const *")
    public VkSparseBufferMemoryBindInfo.Buffer pBufferBinds() {
        return npBufferBinds(address());
    }

    @NativeType("uint32_t")
    public int imageOpaqueBindCount() {
        return nimageOpaqueBindCount(address());
    }

    @NativeType("VkSparseImageOpaqueMemoryBindInfo const *")
    public VkSparseImageOpaqueMemoryBindInfo.Buffer pImageOpaqueBinds() {
        return npImageOpaqueBinds(address());
    }

    @NativeType("uint32_t")
    public int imageBindCount() {
        return nimageBindCount(address());
    }

    @NativeType("VkSparseImageMemoryBindInfo const *")
    public VkSparseImageMemoryBindInfo.Buffer pImageBinds() {
        return npImageBinds(address());
    }

    @NativeType("uint32_t")
    public int signalSemaphoreCount() {
        return nsignalSemaphoreCount(address());
    }

    @NativeType("VkSemaphore const *")
    public LongBuffer pSignalSemaphores() {
        return npSignalSemaphores(address());
    }

    public VkBindSparseInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindSparseInfo sType$Default() {
        return sType(7);
    }

    public VkBindSparseInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindSparseInfo pNext(VkDeviceGroupBindSparseInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindSparseInfo pNext(VkDeviceGroupBindSparseInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindSparseInfo pNext(VkFrameBoundaryEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindSparseInfo pNext(VkFrameBoundaryTensorsARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindSparseInfo pNext(VkTimelineSemaphoreSubmitInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindSparseInfo pNext(VkTimelineSemaphoreSubmitInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindSparseInfo pWaitSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
        npWaitSemaphores(address(), value);
        return this;
    }

    public VkBindSparseInfo pBufferBinds(@NativeType("VkSparseBufferMemoryBindInfo const *") VkSparseBufferMemoryBindInfo.Buffer value) {
        npBufferBinds(address(), value);
        return this;
    }

    public VkBindSparseInfo pImageOpaqueBinds(@NativeType("VkSparseImageOpaqueMemoryBindInfo const *") VkSparseImageOpaqueMemoryBindInfo.Buffer value) {
        npImageOpaqueBinds(address(), value);
        return this;
    }

    public VkBindSparseInfo pImageBinds(@NativeType("VkSparseImageMemoryBindInfo const *") VkSparseImageMemoryBindInfo.Buffer value) {
        npImageBinds(address(), value);
        return this;
    }

    public VkBindSparseInfo pSignalSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
        npSignalSemaphores(address(), value);
        return this;
    }

    public VkBindSparseInfo set(int sType, long pNext, LongBuffer pWaitSemaphores, VkSparseBufferMemoryBindInfo.Buffer pBufferBinds, VkSparseImageOpaqueMemoryBindInfo.Buffer pImageOpaqueBinds, VkSparseImageMemoryBindInfo.Buffer pImageBinds, LongBuffer pSignalSemaphores) {
        sType(sType);
        pNext(pNext);
        pWaitSemaphores(pWaitSemaphores);
        pBufferBinds(pBufferBinds);
        pImageOpaqueBinds(pImageOpaqueBinds);
        pImageBinds(pImageBinds);
        pSignalSemaphores(pSignalSemaphores);
        return this;
    }

    public VkBindSparseInfo set(VkBindSparseInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindSparseInfo malloc() {
        return new VkBindSparseInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindSparseInfo calloc() {
        return new VkBindSparseInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindSparseInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindSparseInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkBindSparseInfo create(long address) {
        return new VkBindSparseInfo(address, null);
    }

    public static VkBindSparseInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindSparseInfo(address, null);
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

    public static VkBindSparseInfo malloc(MemoryStack stack) {
        return new VkBindSparseInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindSparseInfo calloc(MemoryStack stack) {
        return new VkBindSparseInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nwaitSemaphoreCount(long struct) {
        return MemoryUtil.memGetInt(struct + WAITSEMAPHORECOUNT);
    }

    public static LongBuffer npWaitSemaphores(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PWAITSEMAPHORES), nwaitSemaphoreCount(struct));
    }

    public static int nbufferBindCount(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERBINDCOUNT);
    }

    public static VkSparseBufferMemoryBindInfo.Buffer npBufferBinds(long struct) {
        return VkSparseBufferMemoryBindInfo.createSafe(MemoryUtil.memGetAddress(struct + PBUFFERBINDS), nbufferBindCount(struct));
    }

    public static int nimageOpaqueBindCount(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEOPAQUEBINDCOUNT);
    }

    public static VkSparseImageOpaqueMemoryBindInfo.Buffer npImageOpaqueBinds(long struct) {
        return VkSparseImageOpaqueMemoryBindInfo.createSafe(MemoryUtil.memGetAddress(struct + PIMAGEOPAQUEBINDS), nimageOpaqueBindCount(struct));
    }

    public static int nimageBindCount(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEBINDCOUNT);
    }

    public static VkSparseImageMemoryBindInfo.Buffer npImageBinds(long struct) {
        return VkSparseImageMemoryBindInfo.createSafe(MemoryUtil.memGetAddress(struct + PIMAGEBINDS), nimageBindCount(struct));
    }

    public static int nsignalSemaphoreCount(long struct) {
        return MemoryUtil.memGetInt(struct + SIGNALSEMAPHORECOUNT);
    }

    public static LongBuffer npSignalSemaphores(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PSIGNALSEMAPHORES), nsignalSemaphoreCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nwaitSemaphoreCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + WAITSEMAPHORECOUNT, value);
    }

    public static void npWaitSemaphores(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PWAITSEMAPHORES, MemoryUtil.memAddressSafe(value));
        nwaitSemaphoreCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nbufferBindCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUFFERBINDCOUNT, value);
    }

    public static void npBufferBinds(long struct, VkSparseBufferMemoryBindInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PBUFFERBINDS, MemoryUtil.memAddressSafe(value));
        nbufferBindCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nimageOpaqueBindCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEOPAQUEBINDCOUNT, value);
    }

    public static void npImageOpaqueBinds(long struct, VkSparseImageOpaqueMemoryBindInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PIMAGEOPAQUEBINDS, MemoryUtil.memAddressSafe(value));
        nimageOpaqueBindCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nimageBindCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEBINDCOUNT, value);
    }

    public static void npImageBinds(long struct, VkSparseImageMemoryBindInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PIMAGEBINDS, MemoryUtil.memAddressSafe(value));
        nimageBindCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nsignalSemaphoreCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIGNALSEMAPHORECOUNT, value);
    }

    public static void npSignalSemaphores(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSIGNALSEMAPHORES, MemoryUtil.memAddressSafe(value));
        nsignalSemaphoreCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nwaitSemaphoreCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PWAITSEMAPHORES));
        }
        int bufferBindCount = nbufferBindCount(struct);
        if (bufferBindCount != 0) {
            long pBufferBinds = MemoryUtil.memGetAddress(struct + PBUFFERBINDS);
            Checks.check(pBufferBinds);
            validate(pBufferBinds, bufferBindCount, VkSparseBufferMemoryBindInfo.SIZEOF, VkSparseBufferMemoryBindInfo::validate);
        }
        int imageOpaqueBindCount = nimageOpaqueBindCount(struct);
        if (imageOpaqueBindCount != 0) {
            long pImageOpaqueBinds = MemoryUtil.memGetAddress(struct + PIMAGEOPAQUEBINDS);
            Checks.check(pImageOpaqueBinds);
            validate(pImageOpaqueBinds, imageOpaqueBindCount, VkSparseImageOpaqueMemoryBindInfo.SIZEOF, VkSparseImageOpaqueMemoryBindInfo::validate);
        }
        int imageBindCount = nimageBindCount(struct);
        if (imageBindCount != 0) {
            long pImageBinds = MemoryUtil.memGetAddress(struct + PIMAGEBINDS);
            Checks.check(pImageBinds);
            validate(pImageBinds, imageBindCount, VkSparseImageMemoryBindInfo.SIZEOF, VkSparseImageMemoryBindInfo::validate);
        }
        if (nsignalSemaphoreCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PSIGNALSEMAPHORES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindSparseInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindSparseInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindSparseInfo, Buffer> implements NativeResource {
        private static final VkBindSparseInfo ELEMENT_FACTORY = VkBindSparseInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindSparseInfo.SIZEOF);
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
        public VkBindSparseInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindSparseInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindSparseInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int waitSemaphoreCount() {
            return VkBindSparseInfo.nwaitSemaphoreCount(address());
        }

        @NativeType("VkSemaphore const *")
        public LongBuffer pWaitSemaphores() {
            return VkBindSparseInfo.npWaitSemaphores(address());
        }

        @NativeType("uint32_t")
        public int bufferBindCount() {
            return VkBindSparseInfo.nbufferBindCount(address());
        }

        @NativeType("VkSparseBufferMemoryBindInfo const *")
        public VkSparseBufferMemoryBindInfo.Buffer pBufferBinds() {
            return VkBindSparseInfo.npBufferBinds(address());
        }

        @NativeType("uint32_t")
        public int imageOpaqueBindCount() {
            return VkBindSparseInfo.nimageOpaqueBindCount(address());
        }

        @NativeType("VkSparseImageOpaqueMemoryBindInfo const *")
        public VkSparseImageOpaqueMemoryBindInfo.Buffer pImageOpaqueBinds() {
            return VkBindSparseInfo.npImageOpaqueBinds(address());
        }

        @NativeType("uint32_t")
        public int imageBindCount() {
            return VkBindSparseInfo.nimageBindCount(address());
        }

        @NativeType("VkSparseImageMemoryBindInfo const *")
        public VkSparseImageMemoryBindInfo.Buffer pImageBinds() {
            return VkBindSparseInfo.npImageBinds(address());
        }

        @NativeType("uint32_t")
        public int signalSemaphoreCount() {
            return VkBindSparseInfo.nsignalSemaphoreCount(address());
        }

        @NativeType("VkSemaphore const *")
        public LongBuffer pSignalSemaphores() {
            return VkBindSparseInfo.npSignalSemaphores(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindSparseInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(7);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindSparseInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDeviceGroupBindSparseInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceGroupBindSparseInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkFrameBoundaryEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkFrameBoundaryTensorsARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkTimelineSemaphoreSubmitInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkTimelineSemaphoreSubmitInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pWaitSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
            VkBindSparseInfo.npWaitSemaphores(address(), value);
            return this;
        }

        public Buffer pBufferBinds(@NativeType("VkSparseBufferMemoryBindInfo const *") VkSparseBufferMemoryBindInfo.Buffer value) {
            VkBindSparseInfo.npBufferBinds(address(), value);
            return this;
        }

        public Buffer pImageOpaqueBinds(@NativeType("VkSparseImageOpaqueMemoryBindInfo const *") VkSparseImageOpaqueMemoryBindInfo.Buffer value) {
            VkBindSparseInfo.npImageOpaqueBinds(address(), value);
            return this;
        }

        public Buffer pImageBinds(@NativeType("VkSparseImageMemoryBindInfo const *") VkSparseImageMemoryBindInfo.Buffer value) {
            VkBindSparseInfo.npImageBinds(address(), value);
            return this;
        }

        public Buffer pSignalSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
            VkBindSparseInfo.npSignalSemaphores(address(), value);
            return this;
        }
    }
}
