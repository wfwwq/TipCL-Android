package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_iccp")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_iccp.class */
public class spng_iccp extends Struct<spng_iccp> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PROFILE_NAME;
    public static final int PROFILE_LEN;
    public static final int PROFILE;

    static {
        Struct.Layout layout = __struct(__array(1, 80), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PROFILE_NAME = layout.offsetof(0);
        PROFILE_LEN = layout.offsetof(1);
        PROFILE = layout.offsetof(2);
    }

    protected spng_iccp(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_iccp create(long address, ByteBuffer container) {
        return new spng_iccp(address, container);
    }

    public spng_iccp(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char[80]")
    public ByteBuffer profile_name() {
        return nprofile_name(address());
    }

    @NativeType("char[80]")
    public String profile_nameString() {
        return nprofile_nameString(address());
    }

    @NativeType("size_t")
    public long profile_len() {
        return nprofile_len(address());
    }

    @NativeType("char *")
    public ByteBuffer profile() {
        return nprofile(address());
    }

    public spng_iccp profile_name(@NativeType("char[80]") ByteBuffer value) {
        nprofile_name(address(), value);
        return this;
    }

    public spng_iccp profile(@NativeType("char *") ByteBuffer value) {
        nprofile(address(), value);
        return this;
    }

    public spng_iccp set(ByteBuffer profile_name, ByteBuffer profile) {
        profile_name(profile_name);
        profile(profile);
        return this;
    }

    public spng_iccp set(spng_iccp src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_iccp malloc() {
        return new spng_iccp(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_iccp calloc() {
        return new spng_iccp(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_iccp create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_iccp(MemoryUtil.memAddress(container), container);
    }

    public static spng_iccp create(long address) {
        return new spng_iccp(address, null);
    }

    public static spng_iccp createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_iccp(address, null);
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

    public static spng_iccp malloc(MemoryStack stack) {
        return new spng_iccp(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_iccp calloc(MemoryStack stack) {
        return new spng_iccp(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nprofile_name(long struct) {
        return MemoryUtil.memByteBuffer(struct + PROFILE_NAME, 80);
    }

    public static String nprofile_nameString(long struct) {
        return MemoryUtil.memASCII(struct + PROFILE_NAME);
    }

    public static long nprofile_len(long struct) {
        return MemoryUtil.memGetAddress(struct + PROFILE_LEN);
    }

    public static ByteBuffer nprofile(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PROFILE), (int) nprofile_len(struct));
    }

    public static void nprofile_name(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
            Checks.checkGT(value, 80);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PROFILE_NAME, value.remaining());
    }

    public static void nprofile_len(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PROFILE_LEN, value);
    }

    public static void nprofile(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PROFILE, MemoryUtil.memAddress(value));
        nprofile_len(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PROFILE));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_iccp$Buffer.class */
    public static class Buffer extends StructBuffer<spng_iccp, Buffer> implements NativeResource {
        private static final spng_iccp ELEMENT_FACTORY = spng_iccp.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_iccp.SIZEOF);
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
        public spng_iccp getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char[80]")
        public ByteBuffer profile_name() {
            return spng_iccp.nprofile_name(address());
        }

        @NativeType("char[80]")
        public String profile_nameString() {
            return spng_iccp.nprofile_nameString(address());
        }

        @NativeType("size_t")
        public long profile_len() {
            return spng_iccp.nprofile_len(address());
        }

        @NativeType("char *")
        public ByteBuffer profile() {
            return spng_iccp.nprofile(address());
        }

        public Buffer profile_name(@NativeType("char[80]") ByteBuffer value) {
            spng_iccp.nprofile_name(address(), value);
            return this;
        }

        public Buffer profile(@NativeType("char *") ByteBuffer value) {
            spng_iccp.nprofile(address(), value);
            return this;
        }
    }
}
