package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWin32KeyedMutexAcquireReleaseInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWin32KeyedMutexAcquireReleaseInfoNV.class */
public class VkWin32KeyedMutexAcquireReleaseInfoNV extends Struct<VkWin32KeyedMutexAcquireReleaseInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ACQUIRECOUNT;
    public static final int PACQUIRESYNCS;
    public static final int PACQUIREKEYS;
    public static final int PACQUIRETIMEOUTMILLISECONDS;
    public static final int RELEASECOUNT;
    public static final int PRELEASESYNCS;
    public static final int PRELEASEKEYS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACQUIRECOUNT = layout.offsetof(2);
        PACQUIRESYNCS = layout.offsetof(3);
        PACQUIREKEYS = layout.offsetof(4);
        PACQUIRETIMEOUTMILLISECONDS = layout.offsetof(5);
        RELEASECOUNT = layout.offsetof(6);
        PRELEASESYNCS = layout.offsetof(7);
        PRELEASEKEYS = layout.offsetof(8);
    }

    protected VkWin32KeyedMutexAcquireReleaseInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkWin32KeyedMutexAcquireReleaseInfoNV create(long address, ByteBuffer container) {
        return new VkWin32KeyedMutexAcquireReleaseInfoNV(address, container);
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV(ByteBuffer container) {
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
    public int acquireCount() {
        return nacquireCount(address());
    }

    @NativeType("VkDeviceMemory const *")
    public LongBuffer pAcquireSyncs() {
        return npAcquireSyncs(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pAcquireKeys() {
        return npAcquireKeys(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pAcquireTimeoutMilliseconds() {
        return npAcquireTimeoutMilliseconds(address());
    }

    @NativeType("uint32_t")
    public int releaseCount() {
        return nreleaseCount(address());
    }

    @NativeType("VkDeviceMemory const *")
    public LongBuffer pReleaseSyncs() {
        return npReleaseSyncs(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pReleaseKeys() {
        return npReleaseKeys(address());
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV sType$Default() {
        return sType(NVWin32KeyedMutex.VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV);
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV acquireCount(@NativeType("uint32_t") int value) {
        nacquireCount(address(), value);
        return this;
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireSyncs(@NativeType("VkDeviceMemory const *") LongBuffer value) {
        npAcquireSyncs(address(), value);
        return this;
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireKeys(@NativeType("uint64_t const *") LongBuffer value) {
        npAcquireKeys(address(), value);
        return this;
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireTimeoutMilliseconds(@NativeType("uint32_t const *") IntBuffer value) {
        npAcquireTimeoutMilliseconds(address(), value);
        return this;
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV releaseCount(@NativeType("uint32_t") int value) {
        nreleaseCount(address(), value);
        return this;
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseSyncs(@NativeType("VkDeviceMemory const *") LongBuffer value) {
        npReleaseSyncs(address(), value);
        return this;
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseKeys(@NativeType("uint64_t const *") LongBuffer value) {
        npReleaseKeys(address(), value);
        return this;
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV set(int sType, long pNext, int acquireCount, LongBuffer pAcquireSyncs, LongBuffer pAcquireKeys, IntBuffer pAcquireTimeoutMilliseconds, int releaseCount, LongBuffer pReleaseSyncs, LongBuffer pReleaseKeys) {
        sType(sType);
        pNext(pNext);
        acquireCount(acquireCount);
        pAcquireSyncs(pAcquireSyncs);
        pAcquireKeys(pAcquireKeys);
        pAcquireTimeoutMilliseconds(pAcquireTimeoutMilliseconds);
        releaseCount(releaseCount);
        pReleaseSyncs(pReleaseSyncs);
        pReleaseKeys(pReleaseKeys);
        return this;
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV set(VkWin32KeyedMutexAcquireReleaseInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoNV malloc() {
        return new VkWin32KeyedMutexAcquireReleaseInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoNV calloc() {
        return new VkWin32KeyedMutexAcquireReleaseInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWin32KeyedMutexAcquireReleaseInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoNV create(long address) {
        return new VkWin32KeyedMutexAcquireReleaseInfoNV(address, null);
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkWin32KeyedMutexAcquireReleaseInfoNV(address, null);
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

    public static VkWin32KeyedMutexAcquireReleaseInfoNV malloc(MemoryStack stack) {
        return new VkWin32KeyedMutexAcquireReleaseInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoNV calloc(MemoryStack stack) {
        return new VkWin32KeyedMutexAcquireReleaseInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nacquireCount(long struct) {
        return MemoryUtil.memGetInt(struct + ACQUIRECOUNT);
    }

    public static LongBuffer npAcquireSyncs(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PACQUIRESYNCS), nacquireCount(struct));
    }

    public static LongBuffer npAcquireKeys(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PACQUIREKEYS), nacquireCount(struct));
    }

    public static IntBuffer npAcquireTimeoutMilliseconds(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PACQUIRETIMEOUTMILLISECONDS), nacquireCount(struct));
    }

    public static int nreleaseCount(long struct) {
        return MemoryUtil.memGetInt(struct + RELEASECOUNT);
    }

    public static LongBuffer npReleaseSyncs(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PRELEASESYNCS), nreleaseCount(struct));
    }

    public static LongBuffer npReleaseKeys(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PRELEASEKEYS), nreleaseCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nacquireCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ACQUIRECOUNT, value);
    }

    public static void npAcquireSyncs(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PACQUIRESYNCS, MemoryUtil.memAddressSafe(value));
    }

    public static void npAcquireKeys(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PACQUIREKEYS, MemoryUtil.memAddressSafe(value));
    }

    public static void npAcquireTimeoutMilliseconds(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PACQUIRETIMEOUTMILLISECONDS, MemoryUtil.memAddressSafe(value));
    }

    public static void nreleaseCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + RELEASECOUNT, value);
    }

    public static void npReleaseSyncs(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PRELEASESYNCS, MemoryUtil.memAddressSafe(value));
    }

    public static void npReleaseKeys(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PRELEASEKEYS, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        if (nacquireCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PACQUIRESYNCS));
            Checks.check(MemoryUtil.memGetAddress(struct + PACQUIREKEYS));
            Checks.check(MemoryUtil.memGetAddress(struct + PACQUIRETIMEOUTMILLISECONDS));
        }
        if (nreleaseCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PRELEASESYNCS));
            Checks.check(MemoryUtil.memGetAddress(struct + PRELEASEKEYS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkWin32KeyedMutexAcquireReleaseInfoNV, Buffer> implements NativeResource {
        private static final VkWin32KeyedMutexAcquireReleaseInfoNV ELEMENT_FACTORY = VkWin32KeyedMutexAcquireReleaseInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF);
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
        public VkWin32KeyedMutexAcquireReleaseInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkWin32KeyedMutexAcquireReleaseInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkWin32KeyedMutexAcquireReleaseInfoNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int acquireCount() {
            return VkWin32KeyedMutexAcquireReleaseInfoNV.nacquireCount(address());
        }

        @NativeType("VkDeviceMemory const *")
        public LongBuffer pAcquireSyncs() {
            return VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireSyncs(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pAcquireKeys() {
            return VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireKeys(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pAcquireTimeoutMilliseconds() {
            return VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireTimeoutMilliseconds(address());
        }

        @NativeType("uint32_t")
        public int releaseCount() {
            return VkWin32KeyedMutexAcquireReleaseInfoNV.nreleaseCount(address());
        }

        @NativeType("VkDeviceMemory const *")
        public LongBuffer pReleaseSyncs() {
            return VkWin32KeyedMutexAcquireReleaseInfoNV.npReleaseSyncs(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pReleaseKeys() {
            return VkWin32KeyedMutexAcquireReleaseInfoNV.npReleaseKeys(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkWin32KeyedMutexAcquireReleaseInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVWin32KeyedMutex.VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkWin32KeyedMutexAcquireReleaseInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer acquireCount(@NativeType("uint32_t") int value) {
            VkWin32KeyedMutexAcquireReleaseInfoNV.nacquireCount(address(), value);
            return this;
        }

        public Buffer pAcquireSyncs(@NativeType("VkDeviceMemory const *") LongBuffer value) {
            VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireSyncs(address(), value);
            return this;
        }

        public Buffer pAcquireKeys(@NativeType("uint64_t const *") LongBuffer value) {
            VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireKeys(address(), value);
            return this;
        }

        public Buffer pAcquireTimeoutMilliseconds(@NativeType("uint32_t const *") IntBuffer value) {
            VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireTimeoutMilliseconds(address(), value);
            return this;
        }

        public Buffer releaseCount(@NativeType("uint32_t") int value) {
            VkWin32KeyedMutexAcquireReleaseInfoNV.nreleaseCount(address(), value);
            return this;
        }

        public Buffer pReleaseSyncs(@NativeType("VkDeviceMemory const *") LongBuffer value) {
            VkWin32KeyedMutexAcquireReleaseInfoNV.npReleaseSyncs(address(), value);
            return this;
        }

        public Buffer pReleaseKeys(@NativeType("uint64_t const *") LongBuffer value) {
            VkWin32KeyedMutexAcquireReleaseInfoNV.npReleaseKeys(address(), value);
            return this;
        }
    }
}
