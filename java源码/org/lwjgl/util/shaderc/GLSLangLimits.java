package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct glslang_limits_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLangLimits.class */
public class GLSLangLimits extends Struct<GLSLangLimits> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NON_INDUCTIVE_FOR_LOOPS;
    public static final int WHILE_LOOPS;
    public static final int DO_WHILE_LOOPS;
    public static final int GENERAL_UNIFORM_INDEXING;
    public static final int GENERAL_ATTRIBUTE_MATRIX_VECTOR_INDEXING;
    public static final int GENERAL_VARYING_INDEXING;
    public static final int GENERAL_SAMPLER_INDEXING;
    public static final int GENERAL_VARIABLE_INDEXING;
    public static final int GENERAL_CONSTANT_MATRIX_VECTOR_INDEXING;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NON_INDUCTIVE_FOR_LOOPS = layout.offsetof(0);
        WHILE_LOOPS = layout.offsetof(1);
        DO_WHILE_LOOPS = layout.offsetof(2);
        GENERAL_UNIFORM_INDEXING = layout.offsetof(3);
        GENERAL_ATTRIBUTE_MATRIX_VECTOR_INDEXING = layout.offsetof(4);
        GENERAL_VARYING_INDEXING = layout.offsetof(5);
        GENERAL_SAMPLER_INDEXING = layout.offsetof(6);
        GENERAL_VARIABLE_INDEXING = layout.offsetof(7);
        GENERAL_CONSTANT_MATRIX_VECTOR_INDEXING = layout.offsetof(8);
    }

    protected GLSLangLimits(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLSLangLimits create(long address, ByteBuffer container) {
        return new GLSLangLimits(address, container);
    }

    public GLSLangLimits(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("bool")
    public boolean non_inductive_for_loops() {
        return nnon_inductive_for_loops(address());
    }

    @NativeType("bool")
    public boolean while_loops() {
        return nwhile_loops(address());
    }

    @NativeType("bool")
    public boolean do_while_loops() {
        return ndo_while_loops(address());
    }

    @NativeType("bool")
    public boolean general_uniform_indexing() {
        return ngeneral_uniform_indexing(address());
    }

    @NativeType("bool")
    public boolean general_attribute_matrix_vector_indexing() {
        return ngeneral_attribute_matrix_vector_indexing(address());
    }

    @NativeType("bool")
    public boolean general_varying_indexing() {
        return ngeneral_varying_indexing(address());
    }

    @NativeType("bool")
    public boolean general_sampler_indexing() {
        return ngeneral_sampler_indexing(address());
    }

    @NativeType("bool")
    public boolean general_variable_indexing() {
        return ngeneral_variable_indexing(address());
    }

    @NativeType("bool")
    public boolean general_constant_matrix_vector_indexing() {
        return ngeneral_constant_matrix_vector_indexing(address());
    }

    public GLSLangLimits non_inductive_for_loops(@NativeType("bool") boolean value) {
        nnon_inductive_for_loops(address(), value);
        return this;
    }

    public GLSLangLimits while_loops(@NativeType("bool") boolean value) {
        nwhile_loops(address(), value);
        return this;
    }

    public GLSLangLimits do_while_loops(@NativeType("bool") boolean value) {
        ndo_while_loops(address(), value);
        return this;
    }

    public GLSLangLimits general_uniform_indexing(@NativeType("bool") boolean value) {
        ngeneral_uniform_indexing(address(), value);
        return this;
    }

    public GLSLangLimits general_attribute_matrix_vector_indexing(@NativeType("bool") boolean value) {
        ngeneral_attribute_matrix_vector_indexing(address(), value);
        return this;
    }

    public GLSLangLimits general_varying_indexing(@NativeType("bool") boolean value) {
        ngeneral_varying_indexing(address(), value);
        return this;
    }

    public GLSLangLimits general_sampler_indexing(@NativeType("bool") boolean value) {
        ngeneral_sampler_indexing(address(), value);
        return this;
    }

    public GLSLangLimits general_variable_indexing(@NativeType("bool") boolean value) {
        ngeneral_variable_indexing(address(), value);
        return this;
    }

    public GLSLangLimits general_constant_matrix_vector_indexing(@NativeType("bool") boolean value) {
        ngeneral_constant_matrix_vector_indexing(address(), value);
        return this;
    }

    public GLSLangLimits set(boolean non_inductive_for_loops, boolean while_loops, boolean do_while_loops, boolean general_uniform_indexing, boolean general_attribute_matrix_vector_indexing, boolean general_varying_indexing, boolean general_sampler_indexing, boolean general_variable_indexing, boolean general_constant_matrix_vector_indexing) {
        non_inductive_for_loops(non_inductive_for_loops);
        while_loops(while_loops);
        do_while_loops(do_while_loops);
        general_uniform_indexing(general_uniform_indexing);
        general_attribute_matrix_vector_indexing(general_attribute_matrix_vector_indexing);
        general_varying_indexing(general_varying_indexing);
        general_sampler_indexing(general_sampler_indexing);
        general_variable_indexing(general_variable_indexing);
        general_constant_matrix_vector_indexing(general_constant_matrix_vector_indexing);
        return this;
    }

    public GLSLangLimits set(GLSLangLimits src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static GLSLangLimits malloc() {
        return new GLSLangLimits(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static GLSLangLimits calloc() {
        return new GLSLangLimits(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static GLSLangLimits create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLangLimits(MemoryUtil.memAddress(container), container);
    }

    public static GLSLangLimits create(long address) {
        return new GLSLangLimits(address, null);
    }

    public static GLSLangLimits createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLSLangLimits(address, null);
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

    public static GLSLangLimits malloc(MemoryStack stack) {
        return new GLSLangLimits(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static GLSLangLimits calloc(MemoryStack stack) {
        return new GLSLangLimits(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static boolean nnon_inductive_for_loops(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) NON_INDUCTIVE_FOR_LOOPS)) != 0;
    }

    public static boolean nwhile_loops(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) WHILE_LOOPS)) != 0;
    }

    public static boolean ndo_while_loops(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) DO_WHILE_LOOPS)) != 0;
    }

    public static boolean ngeneral_uniform_indexing(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) GENERAL_UNIFORM_INDEXING)) != 0;
    }

    public static boolean ngeneral_attribute_matrix_vector_indexing(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) GENERAL_ATTRIBUTE_MATRIX_VECTOR_INDEXING)) != 0;
    }

    public static boolean ngeneral_varying_indexing(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) GENERAL_VARYING_INDEXING)) != 0;
    }

    public static boolean ngeneral_sampler_indexing(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) GENERAL_SAMPLER_INDEXING)) != 0;
    }

    public static boolean ngeneral_variable_indexing(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) GENERAL_VARIABLE_INDEXING)) != 0;
    }

    public static boolean ngeneral_constant_matrix_vector_indexing(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) GENERAL_CONSTANT_MATRIX_VECTOR_INDEXING)) != 0;
    }

    public static void nnon_inductive_for_loops(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + NON_INDUCTIVE_FOR_LOOPS, value ? (byte) 1 : (byte) 0);
    }

    public static void nwhile_loops(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + WHILE_LOOPS, value ? (byte) 1 : (byte) 0);
    }

    public static void ndo_while_loops(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + DO_WHILE_LOOPS, value ? (byte) 1 : (byte) 0);
    }

    public static void ngeneral_uniform_indexing(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + GENERAL_UNIFORM_INDEXING, value ? (byte) 1 : (byte) 0);
    }

    public static void ngeneral_attribute_matrix_vector_indexing(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + GENERAL_ATTRIBUTE_MATRIX_VECTOR_INDEXING, value ? (byte) 1 : (byte) 0);
    }

    public static void ngeneral_varying_indexing(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + GENERAL_VARYING_INDEXING, value ? (byte) 1 : (byte) 0);
    }

    public static void ngeneral_sampler_indexing(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + GENERAL_SAMPLER_INDEXING, value ? (byte) 1 : (byte) 0);
    }

    public static void ngeneral_variable_indexing(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + GENERAL_VARIABLE_INDEXING, value ? (byte) 1 : (byte) 0);
    }

    public static void ngeneral_constant_matrix_vector_indexing(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + GENERAL_CONSTANT_MATRIX_VECTOR_INDEXING, value ? (byte) 1 : (byte) 0);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLangLimits$Buffer.class */
    public static class Buffer extends StructBuffer<GLSLangLimits, Buffer> implements NativeResource {
        private static final GLSLangLimits ELEMENT_FACTORY = GLSLangLimits.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLSLangLimits.SIZEOF);
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
        public GLSLangLimits getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("bool")
        public boolean non_inductive_for_loops() {
            return GLSLangLimits.nnon_inductive_for_loops(address());
        }

        @NativeType("bool")
        public boolean while_loops() {
            return GLSLangLimits.nwhile_loops(address());
        }

        @NativeType("bool")
        public boolean do_while_loops() {
            return GLSLangLimits.ndo_while_loops(address());
        }

        @NativeType("bool")
        public boolean general_uniform_indexing() {
            return GLSLangLimits.ngeneral_uniform_indexing(address());
        }

        @NativeType("bool")
        public boolean general_attribute_matrix_vector_indexing() {
            return GLSLangLimits.ngeneral_attribute_matrix_vector_indexing(address());
        }

        @NativeType("bool")
        public boolean general_varying_indexing() {
            return GLSLangLimits.ngeneral_varying_indexing(address());
        }

        @NativeType("bool")
        public boolean general_sampler_indexing() {
            return GLSLangLimits.ngeneral_sampler_indexing(address());
        }

        @NativeType("bool")
        public boolean general_variable_indexing() {
            return GLSLangLimits.ngeneral_variable_indexing(address());
        }

        @NativeType("bool")
        public boolean general_constant_matrix_vector_indexing() {
            return GLSLangLimits.ngeneral_constant_matrix_vector_indexing(address());
        }

        public Buffer non_inductive_for_loops(@NativeType("bool") boolean value) {
            GLSLangLimits.nnon_inductive_for_loops(address(), value);
            return this;
        }

        public Buffer while_loops(@NativeType("bool") boolean value) {
            GLSLangLimits.nwhile_loops(address(), value);
            return this;
        }

        public Buffer do_while_loops(@NativeType("bool") boolean value) {
            GLSLangLimits.ndo_while_loops(address(), value);
            return this;
        }

        public Buffer general_uniform_indexing(@NativeType("bool") boolean value) {
            GLSLangLimits.ngeneral_uniform_indexing(address(), value);
            return this;
        }

        public Buffer general_attribute_matrix_vector_indexing(@NativeType("bool") boolean value) {
            GLSLangLimits.ngeneral_attribute_matrix_vector_indexing(address(), value);
            return this;
        }

        public Buffer general_varying_indexing(@NativeType("bool") boolean value) {
            GLSLangLimits.ngeneral_varying_indexing(address(), value);
            return this;
        }

        public Buffer general_sampler_indexing(@NativeType("bool") boolean value) {
            GLSLangLimits.ngeneral_sampler_indexing(address(), value);
            return this;
        }

        public Buffer general_variable_indexing(@NativeType("bool") boolean value) {
            GLSLangLimits.ngeneral_variable_indexing(address(), value);
            return this;
        }

        public Buffer general_constant_matrix_vector_indexing(@NativeType("bool") boolean value) {
            GLSLangLimits.ngeneral_constant_matrix_vector_indexing(address(), value);
            return this;
        }
    }
}
