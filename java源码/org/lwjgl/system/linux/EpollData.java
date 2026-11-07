package org.lwjgl.system.linux;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/EpollData.class
 */
@NativeType("union epoll_data_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/EpollData.class */
public class EpollData extends Struct<EpollData> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PTR;
    public static final int FD;
    public static final int U32;
    public static final int U64;

    static {
        Struct.Layout layout = __union(__member(POINTER_SIZE), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PTR = layout.offsetof(0);
        FD = layout.offsetof(1);
        U32 = layout.offsetof(2);
        U64 = layout.offsetof(3);
    }

    protected EpollData(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public EpollData create(long address, ByteBuffer container) {
        return new EpollData(address, container);
    }

    public EpollData(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("void *")
    public long ptr() {
        return nptr(address());
    }

    public int fd() {
        return nfd(address());
    }

    @NativeType("uint32_t")
    public int u32() {
        return nu32(address());
    }

    @NativeType("uint64_t")
    public long u64() {
        return nu64(address());
    }

    public EpollData ptr(@NativeType("void *") long value) {
        nptr(address(), value);
        return this;
    }

    public EpollData fd(int value) {
        nfd(address(), value);
        return this;
    }

    public EpollData u32(@NativeType("uint32_t") int value) {
        nu32(address(), value);
        return this;
    }

    public EpollData u64(@NativeType("uint64_t") long value) {
        nu64(address(), value);
        return this;
    }

    public EpollData set(EpollData src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static EpollData malloc() {
        return new EpollData(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static EpollData calloc() {
        return new EpollData(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static EpollData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new EpollData(MemoryUtil.memAddress(container), container);
    }

    public static EpollData create(long address) {
        return new EpollData(address, null);
    }

    public static EpollData createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new EpollData(address, null);
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

    public static EpollData malloc(MemoryStack stack) {
        return new EpollData(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static EpollData calloc(MemoryStack stack) {
        return new EpollData(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nptr(long struct) {
        return MemoryUtil.memGetAddress(struct + PTR);
    }

    public static int nfd(long struct) {
        return MemoryUtil.memGetInt(struct + FD);
    }

    public static int nu32(long struct) {
        return MemoryUtil.memGetInt(struct + U32);
    }

    public static long nu64(long struct) {
        return MemoryUtil.memGetLong(struct + U64);
    }

    public static void nptr(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PTR, Checks.check(value));
    }

    public static void nfd(long struct, int value) {
        MemoryUtil.memPutInt(struct + FD, value);
    }

    public static void nu32(long struct, int value) {
        MemoryUtil.memPutInt(struct + U32, value);
    }

    public static void nu64(long struct, long value) {
        MemoryUtil.memPutLong(struct + U64, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/EpollData$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/EpollData$Buffer.class */
    public static class Buffer extends StructBuffer<EpollData, Buffer> implements NativeResource {
        private static final EpollData ELEMENT_FACTORY = EpollData.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / EpollData.SIZEOF);
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
        public EpollData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("void *")
        public long ptr() {
            return EpollData.nptr(address());
        }

        public int fd() {
            return EpollData.nfd(address());
        }

        @NativeType("uint32_t")
        public int u32() {
            return EpollData.nu32(address());
        }

        @NativeType("uint64_t")
        public long u64() {
            return EpollData.nu64(address());
        }

        public Buffer ptr(@NativeType("void *") long value) {
            EpollData.nptr(address(), value);
            return this;
        }

        public Buffer fd(int value) {
            EpollData.nfd(address(), value);
            return this;
        }

        public Buffer u32(@NativeType("uint32_t") int value) {
            EpollData.nu32(address(), value);
            return this;
        }

        public Buffer u64(@NativeType("uint64_t") long value) {
            EpollData.nu64(address(), value);
            return this;
        }
    }
}
