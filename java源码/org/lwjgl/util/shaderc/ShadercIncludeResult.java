package org.lwjgl.util.shaderc;

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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/ShadercIncludeResult.class
 */
@NativeType("struct shaderc_include_result")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/ShadercIncludeResult.class */
public class ShadercIncludeResult extends Struct<ShadercIncludeResult> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SOURCE_NAME;
    public static final int SOURCE_NAME_LENGTH;
    public static final int CONTENT;
    public static final int CONTENT_LENGTH;
    public static final int USER_DATA;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SOURCE_NAME = layout.offsetof(0);
        SOURCE_NAME_LENGTH = layout.offsetof(1);
        CONTENT = layout.offsetof(2);
        CONTENT_LENGTH = layout.offsetof(3);
        USER_DATA = layout.offsetof(4);
    }

    protected ShadercIncludeResult(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public ShadercIncludeResult create(long address, ByteBuffer container) {
        return new ShadercIncludeResult(address, container);
    }

    public ShadercIncludeResult(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char const *")
    public ByteBuffer source_name() {
        return nsource_name(address());
    }

    @NativeType("char const *")
    public String source_nameString() {
        return nsource_nameString(address());
    }

    @NativeType("size_t")
    public long source_name_length() {
        return nsource_name_length(address());
    }

    @NativeType("char const *")
    public ByteBuffer content() {
        return ncontent(address());
    }

    @NativeType("char const *")
    public String contentString() {
        return ncontentString(address());
    }

    @NativeType("size_t")
    public long content_length() {
        return ncontent_length(address());
    }

    @NativeType("void *")
    public long user_data() {
        return nuser_data(address());
    }

    public ShadercIncludeResult source_name(@NativeType("char const *") ByteBuffer value) {
        nsource_name(address(), value);
        return this;
    }

    public ShadercIncludeResult content(@NativeType("char const *") ByteBuffer value) {
        ncontent(address(), value);
        return this;
    }

    public ShadercIncludeResult user_data(@NativeType("void *") long value) {
        nuser_data(address(), value);
        return this;
    }

    public ShadercIncludeResult set(ByteBuffer source_name, ByteBuffer content, long user_data) {
        source_name(source_name);
        content(content);
        user_data(user_data);
        return this;
    }

    public ShadercIncludeResult set(ShadercIncludeResult src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static ShadercIncludeResult malloc() {
        return new ShadercIncludeResult(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static ShadercIncludeResult calloc() {
        return new ShadercIncludeResult(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static ShadercIncludeResult create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ShadercIncludeResult(MemoryUtil.memAddress(container), container);
    }

    public static ShadercIncludeResult create(long address) {
        return new ShadercIncludeResult(address, null);
    }

    public static ShadercIncludeResult createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new ShadercIncludeResult(address, null);
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

    public static ShadercIncludeResult malloc(MemoryStack stack) {
        return new ShadercIncludeResult(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static ShadercIncludeResult calloc(MemoryStack stack) {
        return new ShadercIncludeResult(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nsource_name(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + SOURCE_NAME));
    }

    public static String nsource_nameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + SOURCE_NAME));
    }

    public static long nsource_name_length(long struct) {
        return MemoryUtil.memGetAddress(struct + SOURCE_NAME_LENGTH);
    }

    public static ByteBuffer ncontent(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + CONTENT));
    }

    public static String ncontentString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + CONTENT));
    }

    public static long ncontent_length(long struct) {
        return MemoryUtil.memGetAddress(struct + CONTENT_LENGTH);
    }

    public static long nuser_data(long struct) {
        return MemoryUtil.memGetAddress(struct + USER_DATA);
    }

    public static void nsource_name(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + SOURCE_NAME, MemoryUtil.memAddress(value));
        nsource_name_length(struct, value.remaining());
    }

    public static void nsource_name_length(long struct, long value) {
        MemoryUtil.memPutAddress(struct + SOURCE_NAME_LENGTH, value);
    }

    public static void ncontent(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + CONTENT, MemoryUtil.memAddress(value));
        ncontent_length(struct, value.remaining());
    }

    public static void ncontent_length(long struct, long value) {
        MemoryUtil.memPutAddress(struct + CONTENT_LENGTH, value);
    }

    public static void nuser_data(long struct, long value) {
        MemoryUtil.memPutAddress(struct + USER_DATA, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + SOURCE_NAME));
        Checks.check(MemoryUtil.memGetAddress(struct + CONTENT));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/ShadercIncludeResult$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/ShadercIncludeResult$Buffer.class */
    public static class Buffer extends StructBuffer<ShadercIncludeResult, Buffer> implements NativeResource {
        private static final ShadercIncludeResult ELEMENT_FACTORY = ShadercIncludeResult.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / ShadercIncludeResult.SIZEOF);
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
        public ShadercIncludeResult getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char const *")
        public ByteBuffer source_name() {
            return ShadercIncludeResult.nsource_name(address());
        }

        @NativeType("char const *")
        public String source_nameString() {
            return ShadercIncludeResult.nsource_nameString(address());
        }

        @NativeType("size_t")
        public long source_name_length() {
            return ShadercIncludeResult.nsource_name_length(address());
        }

        @NativeType("char const *")
        public ByteBuffer content() {
            return ShadercIncludeResult.ncontent(address());
        }

        @NativeType("char const *")
        public String contentString() {
            return ShadercIncludeResult.ncontentString(address());
        }

        @NativeType("size_t")
        public long content_length() {
            return ShadercIncludeResult.ncontent_length(address());
        }

        @NativeType("void *")
        public long user_data() {
            return ShadercIncludeResult.nuser_data(address());
        }

        public Buffer source_name(@NativeType("char const *") ByteBuffer value) {
            ShadercIncludeResult.nsource_name(address(), value);
            return this;
        }

        public Buffer content(@NativeType("char const *") ByteBuffer value) {
            ShadercIncludeResult.ncontent(address(), value);
            return this;
        }

        public Buffer user_data(@NativeType("void *") long value) {
            ShadercIncludeResult.nuser_data(address(), value);
            return this;
        }
    }
}
