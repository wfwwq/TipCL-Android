package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationInfo.class */
public class VmaDefragmentationInfo extends Struct<VmaDefragmentationInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int POOL;
    public static final int MAXBYTESPERPASS;
    public static final int MAXALLOCATIONSPERPASS;
    public static final int PFNBREAKCALLBACK;
    public static final int PBREAKCALLBACKUSERDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        POOL = layout.offsetof(1);
        MAXBYTESPERPASS = layout.offsetof(2);
        MAXALLOCATIONSPERPASS = layout.offsetof(3);
        PFNBREAKCALLBACK = layout.offsetof(4);
        PBREAKCALLBACKUSERDATA = layout.offsetof(5);
    }

    protected VmaDefragmentationInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaDefragmentationInfo create(long address, ByteBuffer container) {
        return new VmaDefragmentationInfo(address, container);
    }

    public VmaDefragmentationInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VmaDefragmentationFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VmaPool")
    public long pool() {
        return npool(address());
    }

    @NativeType("VkDeviceSize")
    public long maxBytesPerPass() {
        return nmaxBytesPerPass(address());
    }

    @NativeType("uint32_t")
    public int maxAllocationsPerPass() {
        return nmaxAllocationsPerPass(address());
    }

    @NativeType("PFN_vmaCheckDefragmentationBreakFunction")
    public VmaCheckDefragmentationBreakFunction pfnBreakCallback() {
        return npfnBreakCallback(address());
    }

    @NativeType("void *")
    public long pBreakCallbackUserData() {
        return npBreakCallbackUserData(address());
    }

    public VmaDefragmentationInfo flags(@NativeType("VmaDefragmentationFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VmaDefragmentationInfo pool(@NativeType("VmaPool") long value) {
        npool(address(), value);
        return this;
    }

    public VmaDefragmentationInfo maxBytesPerPass(@NativeType("VkDeviceSize") long value) {
        nmaxBytesPerPass(address(), value);
        return this;
    }

    public VmaDefragmentationInfo maxAllocationsPerPass(@NativeType("uint32_t") int value) {
        nmaxAllocationsPerPass(address(), value);
        return this;
    }

    public VmaDefragmentationInfo pfnBreakCallback(@NativeType("PFN_vmaCheckDefragmentationBreakFunction") VmaCheckDefragmentationBreakFunctionI value) {
        npfnBreakCallback(address(), value);
        return this;
    }

    public VmaDefragmentationInfo pBreakCallbackUserData(@NativeType("void *") long value) {
        npBreakCallbackUserData(address(), value);
        return this;
    }

    public VmaDefragmentationInfo set(int flags, long pool, long maxBytesPerPass, int maxAllocationsPerPass, VmaCheckDefragmentationBreakFunctionI pfnBreakCallback, long pBreakCallbackUserData) {
        flags(flags);
        pool(pool);
        maxBytesPerPass(maxBytesPerPass);
        maxAllocationsPerPass(maxAllocationsPerPass);
        pfnBreakCallback(pfnBreakCallback);
        pBreakCallbackUserData(pBreakCallbackUserData);
        return this;
    }

    public VmaDefragmentationInfo set(VmaDefragmentationInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VmaDefragmentationInfo malloc() {
        return new VmaDefragmentationInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaDefragmentationInfo calloc() {
        return new VmaDefragmentationInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaDefragmentationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaDefragmentationInfo(MemoryUtil.memAddress(container), container);
    }

    public static VmaDefragmentationInfo create(long address) {
        return new VmaDefragmentationInfo(address, null);
    }

    public static VmaDefragmentationInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaDefragmentationInfo(address, null);
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

    public static VmaDefragmentationInfo malloc(MemoryStack stack) {
        return new VmaDefragmentationInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaDefragmentationInfo calloc(MemoryStack stack) {
        return new VmaDefragmentationInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long npool(long struct) {
        return MemoryUtil.memGetAddress(struct + POOL);
    }

    public static long nmaxBytesPerPass(long struct) {
        return MemoryUtil.memGetLong(struct + MAXBYTESPERPASS);
    }

    public static int nmaxAllocationsPerPass(long struct) {
        return MemoryUtil.memGetInt(struct + MAXALLOCATIONSPERPASS);
    }

    public static VmaCheckDefragmentationBreakFunction npfnBreakCallback(long struct) {
        return VmaCheckDefragmentationBreakFunction.createSafe(MemoryUtil.memGetAddress(struct + PFNBREAKCALLBACK));
    }

    public static long npBreakCallbackUserData(long struct) {
        return MemoryUtil.memGetAddress(struct + PBREAKCALLBACKUSERDATA);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void npool(long struct, long value) {
        MemoryUtil.memPutAddress(struct + POOL, value);
    }

    public static void nmaxBytesPerPass(long struct, long value) {
        MemoryUtil.memPutLong(struct + MAXBYTESPERPASS, value);
    }

    public static void nmaxAllocationsPerPass(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXALLOCATIONSPERPASS, value);
    }

    public static void npfnBreakCallback(long struct, VmaCheckDefragmentationBreakFunctionI value) {
        MemoryUtil.memPutAddress(struct + PFNBREAKCALLBACK, MemoryUtil.memAddressSafe(value));
    }

    public static void npBreakCallbackUserData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PBREAKCALLBACKUSERDATA, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VmaDefragmentationInfo, Buffer> implements NativeResource {
        private static final VmaDefragmentationInfo ELEMENT_FACTORY = VmaDefragmentationInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaDefragmentationInfo.SIZEOF);
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
        public VmaDefragmentationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VmaDefragmentationFlags")
        public int flags() {
            return VmaDefragmentationInfo.nflags(address());
        }

        @NativeType("VmaPool")
        public long pool() {
            return VmaDefragmentationInfo.npool(address());
        }

        @NativeType("VkDeviceSize")
        public long maxBytesPerPass() {
            return VmaDefragmentationInfo.nmaxBytesPerPass(address());
        }

        @NativeType("uint32_t")
        public int maxAllocationsPerPass() {
            return VmaDefragmentationInfo.nmaxAllocationsPerPass(address());
        }

        @NativeType("PFN_vmaCheckDefragmentationBreakFunction")
        public VmaCheckDefragmentationBreakFunction pfnBreakCallback() {
            return VmaDefragmentationInfo.npfnBreakCallback(address());
        }

        @NativeType("void *")
        public long pBreakCallbackUserData() {
            return VmaDefragmentationInfo.npBreakCallbackUserData(address());
        }

        public Buffer flags(@NativeType("VmaDefragmentationFlags") int value) {
            VmaDefragmentationInfo.nflags(address(), value);
            return this;
        }

        public Buffer pool(@NativeType("VmaPool") long value) {
            VmaDefragmentationInfo.npool(address(), value);
            return this;
        }

        public Buffer maxBytesPerPass(@NativeType("VkDeviceSize") long value) {
            VmaDefragmentationInfo.nmaxBytesPerPass(address(), value);
            return this;
        }

        public Buffer maxAllocationsPerPass(@NativeType("uint32_t") int value) {
            VmaDefragmentationInfo.nmaxAllocationsPerPass(address(), value);
            return this;
        }

        public Buffer pfnBreakCallback(@NativeType("PFN_vmaCheckDefragmentationBreakFunction") VmaCheckDefragmentationBreakFunctionI value) {
            VmaDefragmentationInfo.npfnBreakCallback(address(), value);
            return this;
        }

        public Buffer pBreakCallbackUserData(@NativeType("void *") long value) {
            VmaDefragmentationInfo.npBreakCallbackUserData(address(), value);
            return this;
        }
    }
}
