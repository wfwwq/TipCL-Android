package org.lwjgl.stb;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBVorbisComment.class
 */
@NativeType("struct stb_vorbis_comment")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBVorbisComment.class */
public class STBVorbisComment extends Struct<STBVorbisComment> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VENDOR;
    public static final int COMMENT_LIST_LENGTH;
    public static final int COMMENT_LIST;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VENDOR = layout.offsetof(0);
        COMMENT_LIST_LENGTH = layout.offsetof(1);
        COMMENT_LIST = layout.offsetof(2);
    }

    protected STBVorbisComment(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBVorbisComment create(long address, ByteBuffer container) {
        return new STBVorbisComment(address, container);
    }

    public STBVorbisComment(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char *")
    public ByteBuffer vendor() {
        return nvendor(address());
    }

    @NativeType("char *")
    public String vendorString() {
        return nvendorString(address());
    }

    public int comment_list_length() {
        return ncomment_list_length(address());
    }

    @NativeType("char **")
    public PointerBuffer comment_list() {
        return ncomment_list(address());
    }

    public static STBVorbisComment malloc() {
        return new STBVorbisComment(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBVorbisComment calloc() {
        return new STBVorbisComment(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBVorbisComment create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBVorbisComment(MemoryUtil.memAddress(container), container);
    }

    public static STBVorbisComment create(long address) {
        return new STBVorbisComment(address, null);
    }

    public static STBVorbisComment createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBVorbisComment(address, null);
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

    public static STBVorbisComment malloc(MemoryStack stack) {
        return new STBVorbisComment(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBVorbisComment calloc(MemoryStack stack) {
        return new STBVorbisComment(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nvendor(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + VENDOR));
    }

    public static String nvendorString(long struct) {
        return MemoryUtil.memASCII(MemoryUtil.memGetAddress(struct + VENDOR));
    }

    public static int ncomment_list_length(long struct) {
        return MemoryUtil.memGetInt(struct + COMMENT_LIST_LENGTH);
    }

    public static PointerBuffer ncomment_list(long struct) {
        return MemoryUtil.memPointerBuffer(MemoryUtil.memGetAddress(struct + COMMENT_LIST), ncomment_list_length(struct));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBVorbisComment$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBVorbisComment$Buffer.class */
    public static class Buffer extends StructBuffer<STBVorbisComment, Buffer> implements NativeResource {
        private static final STBVorbisComment ELEMENT_FACTORY = STBVorbisComment.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBVorbisComment.SIZEOF);
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
        public STBVorbisComment getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char *")
        public ByteBuffer vendor() {
            return STBVorbisComment.nvendor(address());
        }

        @NativeType("char *")
        public String vendorString() {
            return STBVorbisComment.nvendorString(address());
        }

        public int comment_list_length() {
            return STBVorbisComment.ncomment_list_length(address());
        }

        @NativeType("char **")
        public PointerBuffer comment_list() {
            return STBVorbisComment.ncomment_list(address());
        }
    }
}
