package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spv_diagnostic_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVDiagnostic.class */
public class SPVDiagnostic extends Struct<SPVDiagnostic> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int POSITION;
    public static final int ERROR;
    public static final int ISTEXTSOURCE;

    static {
        Struct.Layout layout = __struct(__member(SPVPosition.SIZEOF, SPVPosition.ALIGNOF), __member(POINTER_SIZE), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        POSITION = layout.offsetof(0);
        ERROR = layout.offsetof(1);
        ISTEXTSOURCE = layout.offsetof(2);
    }

    protected SPVDiagnostic(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SPVDiagnostic create(long address, ByteBuffer container) {
        return new SPVDiagnostic(address, container);
    }

    public SPVDiagnostic(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("spv_position_t")
    public SPVPosition position$() {
        return nposition$(address());
    }

    @NativeType("char *")
    public ByteBuffer error() {
        return nerror(address());
    }

    @NativeType("char *")
    public String errorString() {
        return nerrorString(address());
    }

    @NativeType("bool")
    public boolean isTextSource() {
        return nisTextSource(address());
    }

    public static SPVDiagnostic malloc() {
        return new SPVDiagnostic(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SPVDiagnostic calloc() {
        return new SPVDiagnostic(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SPVDiagnostic create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SPVDiagnostic(MemoryUtil.memAddress(container), container);
    }

    public static SPVDiagnostic create(long address) {
        return new SPVDiagnostic(address, null);
    }

    public static SPVDiagnostic createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SPVDiagnostic(address, null);
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

    public static SPVDiagnostic malloc(MemoryStack stack) {
        return new SPVDiagnostic(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SPVDiagnostic calloc(MemoryStack stack) {
        return new SPVDiagnostic(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static SPVPosition nposition$(long struct) {
        return SPVPosition.create(struct + POSITION);
    }

    public static ByteBuffer nerror(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + ERROR));
    }

    public static String nerrorString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + ERROR));
    }

    public static boolean nisTextSource(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ISTEXTSOURCE)) != 0;
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVDiagnostic$Buffer.class */
    public static class Buffer extends StructBuffer<SPVDiagnostic, Buffer> implements NativeResource {
        private static final SPVDiagnostic ELEMENT_FACTORY = SPVDiagnostic.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SPVDiagnostic.SIZEOF);
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
        public SPVDiagnostic getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("spv_position_t")
        public SPVPosition position$() {
            return SPVDiagnostic.nposition$(address());
        }

        @NativeType("char *")
        public ByteBuffer error() {
            return SPVDiagnostic.nerror(address());
        }

        @NativeType("char *")
        public String errorString() {
            return SPVDiagnostic.nerrorString(address());
        }

        @NativeType("bool")
        public boolean isTextSource() {
            return SPVDiagnostic.nisTextSource(address());
        }
    }
}
