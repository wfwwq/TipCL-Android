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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/CMsghdr.class
 */
@NativeType("struct cmsghdr")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/CMsghdr.class */
public class CMsghdr extends Struct<CMsghdr> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CMSG_LEN;
    public static final int CMSG_LEVEL;
    public static final int CMSG_TYPE;
    public static final int CMSG_DATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __array(1, 0));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CMSG_LEN = layout.offsetof(0);
        CMSG_LEVEL = layout.offsetof(1);
        CMSG_TYPE = layout.offsetof(2);
        CMSG_DATA = layout.offsetof(3);
    }

    protected CMsghdr(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public CMsghdr create(long address, ByteBuffer container) {
        return new CMsghdr(address, container);
    }

    public CMsghdr(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("socklen_t")
    public int cmsg_len() {
        return ncmsg_len(address());
    }

    public int cmsg_level() {
        return ncmsg_level(address());
    }

    public int cmsg_type() {
        return ncmsg_type(address());
    }

    @NativeType("char[0]")
    public ByteBuffer cmsg_data() {
        return ncmsg_data(address());
    }

    @NativeType("char")
    public byte cmsg_data(int index) {
        return ncmsg_data(address(), index);
    }

    public CMsghdr cmsg_len(@NativeType("socklen_t") int value) {
        ncmsg_len(address(), value);
        return this;
    }

    public CMsghdr cmsg_level(int value) {
        ncmsg_level(address(), value);
        return this;
    }

    public CMsghdr cmsg_type(int value) {
        ncmsg_type(address(), value);
        return this;
    }

    public CMsghdr cmsg_data(@NativeType("char[0]") ByteBuffer value) {
        ncmsg_data(address(), value);
        return this;
    }

    public CMsghdr cmsg_data(int index, @NativeType("char") byte value) {
        ncmsg_data(address(), index, value);
        return this;
    }

    public CMsghdr set(int cmsg_len, int cmsg_level, int cmsg_type, ByteBuffer cmsg_data) {
        cmsg_len(cmsg_len);
        cmsg_level(cmsg_level);
        cmsg_type(cmsg_type);
        cmsg_data(cmsg_data);
        return this;
    }

    public CMsghdr set(CMsghdr src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static CMsghdr malloc() {
        return new CMsghdr(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static CMsghdr calloc() {
        return new CMsghdr(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static CMsghdr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CMsghdr(MemoryUtil.memAddress(container), container);
    }

    public static CMsghdr create(long address) {
        return new CMsghdr(address, null);
    }

    public static CMsghdr createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new CMsghdr(address, null);
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

    public static CMsghdr malloc(MemoryStack stack) {
        return new CMsghdr(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static CMsghdr calloc(MemoryStack stack) {
        return new CMsghdr(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ncmsg_len(long struct) {
        return MemoryUtil.memGetInt(struct + CMSG_LEN);
    }

    public static int ncmsg_level(long struct) {
        return MemoryUtil.memGetInt(struct + CMSG_LEVEL);
    }

    public static int ncmsg_type(long struct) {
        return MemoryUtil.memGetInt(struct + CMSG_TYPE);
    }

    public static ByteBuffer ncmsg_data(long struct) {
        return MemoryUtil.memByteBuffer(struct + CMSG_DATA, 0);
    }

    public static byte ncmsg_data(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CMSG_DATA + (Checks.check(index, 0) * 1));
    }

    public static void ncmsg_len(long struct, int value) {
        MemoryUtil.memPutInt(struct + CMSG_LEN, value);
    }

    public static void ncmsg_level(long struct, int value) {
        MemoryUtil.memPutInt(struct + CMSG_LEVEL, value);
    }

    public static void ncmsg_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + CMSG_TYPE, value);
    }

    public static void ncmsg_data(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 0);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CMSG_DATA, value.remaining() * 1);
    }

    public static void ncmsg_data(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CMSG_DATA + (Checks.check(index, 0) * 1), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/CMsghdr$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/CMsghdr$Buffer.class */
    public static class Buffer extends StructBuffer<CMsghdr, Buffer> implements NativeResource {
        private static final CMsghdr ELEMENT_FACTORY = CMsghdr.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / CMsghdr.SIZEOF);
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
        public CMsghdr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("socklen_t")
        public int cmsg_len() {
            return CMsghdr.ncmsg_len(address());
        }

        public int cmsg_level() {
            return CMsghdr.ncmsg_level(address());
        }

        public int cmsg_type() {
            return CMsghdr.ncmsg_type(address());
        }

        @NativeType("char[0]")
        public ByteBuffer cmsg_data() {
            return CMsghdr.ncmsg_data(address());
        }

        @NativeType("char")
        public byte cmsg_data(int index) {
            return CMsghdr.ncmsg_data(address(), index);
        }

        public Buffer cmsg_len(@NativeType("socklen_t") int value) {
            CMsghdr.ncmsg_len(address(), value);
            return this;
        }

        public Buffer cmsg_level(int value) {
            CMsghdr.ncmsg_level(address(), value);
            return this;
        }

        public Buffer cmsg_type(int value) {
            CMsghdr.ncmsg_type(address(), value);
            return this;
        }

        public Buffer cmsg_data(@NativeType("char[0]") ByteBuffer value) {
            CMsghdr.ncmsg_data(address(), value);
            return this;
        }

        public Buffer cmsg_data(int index, @NativeType("char") byte value) {
            CMsghdr.ncmsg_data(address(), index, value);
            return this;
        }
    }
}
