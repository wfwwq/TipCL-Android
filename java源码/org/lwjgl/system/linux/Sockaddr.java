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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/Sockaddr.class
 */
@NativeType("struct sockaddr")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/Sockaddr.class */
public class Sockaddr extends Struct<Sockaddr> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SA_FAMILY;
    public static final int SA_DATA;

    static {
        Struct.Layout layout = __struct(__member(2), __array(1, 14));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SA_FAMILY = layout.offsetof(0);
        SA_DATA = layout.offsetof(1);
    }

    protected Sockaddr(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public Sockaddr create(long address, ByteBuffer container) {
        return new Sockaddr(address, container);
    }

    public Sockaddr(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("sa_family_t")
    public short sa_family() {
        return nsa_family(address());
    }

    @NativeType("char[14]")
    public ByteBuffer sa_data() {
        return nsa_data(address());
    }

    @NativeType("char")
    public byte sa_data(int index) {
        return nsa_data(address(), index);
    }

    public Sockaddr sa_family(@NativeType("sa_family_t") short value) {
        nsa_family(address(), value);
        return this;
    }

    public Sockaddr sa_data(@NativeType("char[14]") ByteBuffer value) {
        nsa_data(address(), value);
        return this;
    }

    public Sockaddr sa_data(int index, @NativeType("char") byte value) {
        nsa_data(address(), index, value);
        return this;
    }

    public Sockaddr set(short sa_family, ByteBuffer sa_data) {
        sa_family(sa_family);
        sa_data(sa_data);
        return this;
    }

    public Sockaddr set(Sockaddr src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static Sockaddr malloc() {
        return new Sockaddr(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static Sockaddr calloc() {
        return new Sockaddr(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static Sockaddr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new Sockaddr(MemoryUtil.memAddress(container), container);
    }

    public static Sockaddr create(long address) {
        return new Sockaddr(address, null);
    }

    public static Sockaddr createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new Sockaddr(address, null);
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

    public static Sockaddr malloc(MemoryStack stack) {
        return new Sockaddr(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static Sockaddr calloc(MemoryStack stack) {
        return new Sockaddr(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nsa_family(long struct) {
        return MemoryUtil.memGetShort(struct + SA_FAMILY);
    }

    public static ByteBuffer nsa_data(long struct) {
        return MemoryUtil.memByteBuffer(struct + SA_DATA, 14);
    }

    public static byte nsa_data(long struct, int index) {
        return MemoryUtil.memGetByte(struct + SA_DATA + (Checks.check(index, 14) * 1));
    }

    public static void nsa_family(long struct, short value) {
        MemoryUtil.memPutShort(struct + SA_FAMILY, value);
    }

    public static void nsa_data(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 14);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + SA_DATA, value.remaining() * 1);
    }

    public static void nsa_data(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + SA_DATA + (Checks.check(index, 14) * 1), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/Sockaddr$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/Sockaddr$Buffer.class */
    public static class Buffer extends StructBuffer<Sockaddr, Buffer> implements NativeResource {
        private static final Sockaddr ELEMENT_FACTORY = Sockaddr.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / Sockaddr.SIZEOF);
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
        public Sockaddr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("sa_family_t")
        public short sa_family() {
            return Sockaddr.nsa_family(address());
        }

        @NativeType("char[14]")
        public ByteBuffer sa_data() {
            return Sockaddr.nsa_data(address());
        }

        @NativeType("char")
        public byte sa_data(int index) {
            return Sockaddr.nsa_data(address(), index);
        }

        public Buffer sa_family(@NativeType("sa_family_t") short value) {
            Sockaddr.nsa_family(address(), value);
            return this;
        }

        public Buffer sa_data(@NativeType("char[14]") ByteBuffer value) {
            Sockaddr.nsa_data(address(), value);
            return this;
        }

        public Buffer sa_data(int index, @NativeType("char") byte value) {
            Sockaddr.nsa_data(address(), index, value);
            return this;
        }
    }
}
