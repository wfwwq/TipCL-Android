package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct glslang_spv_options_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLangSPVOptions.class */
public class GLSLangSPVOptions extends Struct<GLSLangSPVOptions> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int GENERATE_DEBUG_INFO;
    public static final int STRIP_DEBUG_INFO;
    public static final int DISABLE_OPTIMIZER;
    public static final int OPTIMIZE_SIZE;
    public static final int DISASSEMBLE;
    public static final int VALIDATE;
    public static final int EMIT_NONSEMANTIC_SHADER_DEBUG_INFO;
    public static final int EMIT_NONSEMANTIC_SHADER_DEBUG_SOURCE;
    public static final int COMPILE_ONLY;
    public static final int OPTIMIZE_ALLOW_EXPANDED_ID_BOUND;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        GENERATE_DEBUG_INFO = layout.offsetof(0);
        STRIP_DEBUG_INFO = layout.offsetof(1);
        DISABLE_OPTIMIZER = layout.offsetof(2);
        OPTIMIZE_SIZE = layout.offsetof(3);
        DISASSEMBLE = layout.offsetof(4);
        VALIDATE = layout.offsetof(5);
        EMIT_NONSEMANTIC_SHADER_DEBUG_INFO = layout.offsetof(6);
        EMIT_NONSEMANTIC_SHADER_DEBUG_SOURCE = layout.offsetof(7);
        COMPILE_ONLY = layout.offsetof(8);
        OPTIMIZE_ALLOW_EXPANDED_ID_BOUND = layout.offsetof(9);
    }

    protected GLSLangSPVOptions(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLSLangSPVOptions create(long address, ByteBuffer container) {
        return new GLSLangSPVOptions(address, container);
    }

    public GLSLangSPVOptions(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("bool")
    public boolean generate_debug_info() {
        return ngenerate_debug_info(address());
    }

    @NativeType("bool")
    public boolean strip_debug_info() {
        return nstrip_debug_info(address());
    }

    @NativeType("bool")
    public boolean disable_optimizer() {
        return ndisable_optimizer(address());
    }

    @NativeType("bool")
    public boolean optimize_size() {
        return noptimize_size(address());
    }

    @NativeType("bool")
    public boolean disassemble() {
        return ndisassemble(address());
    }

    @NativeType("bool")
    public boolean validate() {
        return nvalidate(address());
    }

    @NativeType("bool")
    public boolean emit_nonsemantic_shader_debug_info() {
        return nemit_nonsemantic_shader_debug_info(address());
    }

    @NativeType("bool")
    public boolean emit_nonsemantic_shader_debug_source() {
        return nemit_nonsemantic_shader_debug_source(address());
    }

    @NativeType("bool")
    public boolean compile_only() {
        return ncompile_only(address());
    }

    @NativeType("bool")
    public boolean optimize_allow_expanded_id_bound() {
        return noptimize_allow_expanded_id_bound(address());
    }

    public GLSLangSPVOptions generate_debug_info(@NativeType("bool") boolean value) {
        ngenerate_debug_info(address(), value);
        return this;
    }

    public GLSLangSPVOptions strip_debug_info(@NativeType("bool") boolean value) {
        nstrip_debug_info(address(), value);
        return this;
    }

    public GLSLangSPVOptions disable_optimizer(@NativeType("bool") boolean value) {
        ndisable_optimizer(address(), value);
        return this;
    }

    public GLSLangSPVOptions optimize_size(@NativeType("bool") boolean value) {
        noptimize_size(address(), value);
        return this;
    }

    public GLSLangSPVOptions disassemble(@NativeType("bool") boolean value) {
        ndisassemble(address(), value);
        return this;
    }

    public GLSLangSPVOptions validate(@NativeType("bool") boolean value) {
        nvalidate(address(), value);
        return this;
    }

    public GLSLangSPVOptions emit_nonsemantic_shader_debug_info(@NativeType("bool") boolean value) {
        nemit_nonsemantic_shader_debug_info(address(), value);
        return this;
    }

    public GLSLangSPVOptions emit_nonsemantic_shader_debug_source(@NativeType("bool") boolean value) {
        nemit_nonsemantic_shader_debug_source(address(), value);
        return this;
    }

    public GLSLangSPVOptions compile_only(@NativeType("bool") boolean value) {
        ncompile_only(address(), value);
        return this;
    }

    public GLSLangSPVOptions optimize_allow_expanded_id_bound(@NativeType("bool") boolean value) {
        noptimize_allow_expanded_id_bound(address(), value);
        return this;
    }

    public GLSLangSPVOptions set(boolean generate_debug_info, boolean strip_debug_info, boolean disable_optimizer, boolean optimize_size, boolean disassemble, boolean validate, boolean emit_nonsemantic_shader_debug_info, boolean emit_nonsemantic_shader_debug_source, boolean compile_only, boolean optimize_allow_expanded_id_bound) {
        generate_debug_info(generate_debug_info);
        strip_debug_info(strip_debug_info);
        disable_optimizer(disable_optimizer);
        optimize_size(optimize_size);
        disassemble(disassemble);
        validate(validate);
        emit_nonsemantic_shader_debug_info(emit_nonsemantic_shader_debug_info);
        emit_nonsemantic_shader_debug_source(emit_nonsemantic_shader_debug_source);
        compile_only(compile_only);
        optimize_allow_expanded_id_bound(optimize_allow_expanded_id_bound);
        return this;
    }

    public GLSLangSPVOptions set(GLSLangSPVOptions src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static GLSLangSPVOptions malloc() {
        return new GLSLangSPVOptions(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static GLSLangSPVOptions calloc() {
        return new GLSLangSPVOptions(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static GLSLangSPVOptions create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLangSPVOptions(MemoryUtil.memAddress(container), container);
    }

    public static GLSLangSPVOptions create(long address) {
        return new GLSLangSPVOptions(address, null);
    }

    public static GLSLangSPVOptions createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLSLangSPVOptions(address, null);
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

    public static GLSLangSPVOptions malloc(MemoryStack stack) {
        return new GLSLangSPVOptions(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static GLSLangSPVOptions calloc(MemoryStack stack) {
        return new GLSLangSPVOptions(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static boolean ngenerate_debug_info(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) GENERATE_DEBUG_INFO)) != 0;
    }

    public static boolean nstrip_debug_info(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) STRIP_DEBUG_INFO)) != 0;
    }

    public static boolean ndisable_optimizer(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) DISABLE_OPTIMIZER)) != 0;
    }

    public static boolean noptimize_size(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) OPTIMIZE_SIZE)) != 0;
    }

    public static boolean ndisassemble(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) DISASSEMBLE)) != 0;
    }

    public static boolean nvalidate(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) VALIDATE)) != 0;
    }

    public static boolean nemit_nonsemantic_shader_debug_info(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) EMIT_NONSEMANTIC_SHADER_DEBUG_INFO)) != 0;
    }

    public static boolean nemit_nonsemantic_shader_debug_source(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) EMIT_NONSEMANTIC_SHADER_DEBUG_SOURCE)) != 0;
    }

    public static boolean ncompile_only(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) COMPILE_ONLY)) != 0;
    }

    public static boolean noptimize_allow_expanded_id_bound(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) OPTIMIZE_ALLOW_EXPANDED_ID_BOUND)) != 0;
    }

    public static void ngenerate_debug_info(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + GENERATE_DEBUG_INFO, value ? (byte) 1 : (byte) 0);
    }

    public static void nstrip_debug_info(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + STRIP_DEBUG_INFO, value ? (byte) 1 : (byte) 0);
    }

    public static void ndisable_optimizer(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + DISABLE_OPTIMIZER, value ? (byte) 1 : (byte) 0);
    }

    public static void noptimize_size(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + OPTIMIZE_SIZE, value ? (byte) 1 : (byte) 0);
    }

    public static void ndisassemble(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + DISASSEMBLE, value ? (byte) 1 : (byte) 0);
    }

    public static void nvalidate(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + VALIDATE, value ? (byte) 1 : (byte) 0);
    }

    public static void nemit_nonsemantic_shader_debug_info(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + EMIT_NONSEMANTIC_SHADER_DEBUG_INFO, value ? (byte) 1 : (byte) 0);
    }

    public static void nemit_nonsemantic_shader_debug_source(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + EMIT_NONSEMANTIC_SHADER_DEBUG_SOURCE, value ? (byte) 1 : (byte) 0);
    }

    public static void ncompile_only(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + COMPILE_ONLY, value ? (byte) 1 : (byte) 0);
    }

    public static void noptimize_allow_expanded_id_bound(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + OPTIMIZE_ALLOW_EXPANDED_ID_BOUND, value ? (byte) 1 : (byte) 0);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLangSPVOptions$Buffer.class */
    public static class Buffer extends StructBuffer<GLSLangSPVOptions, Buffer> implements NativeResource {
        private static final GLSLangSPVOptions ELEMENT_FACTORY = GLSLangSPVOptions.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLSLangSPVOptions.SIZEOF);
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
        public GLSLangSPVOptions getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("bool")
        public boolean generate_debug_info() {
            return GLSLangSPVOptions.ngenerate_debug_info(address());
        }

        @NativeType("bool")
        public boolean strip_debug_info() {
            return GLSLangSPVOptions.nstrip_debug_info(address());
        }

        @NativeType("bool")
        public boolean disable_optimizer() {
            return GLSLangSPVOptions.ndisable_optimizer(address());
        }

        @NativeType("bool")
        public boolean optimize_size() {
            return GLSLangSPVOptions.noptimize_size(address());
        }

        @NativeType("bool")
        public boolean disassemble() {
            return GLSLangSPVOptions.ndisassemble(address());
        }

        @NativeType("bool")
        public boolean validate() {
            return GLSLangSPVOptions.nvalidate(address());
        }

        @NativeType("bool")
        public boolean emit_nonsemantic_shader_debug_info() {
            return GLSLangSPVOptions.nemit_nonsemantic_shader_debug_info(address());
        }

        @NativeType("bool")
        public boolean emit_nonsemantic_shader_debug_source() {
            return GLSLangSPVOptions.nemit_nonsemantic_shader_debug_source(address());
        }

        @NativeType("bool")
        public boolean compile_only() {
            return GLSLangSPVOptions.ncompile_only(address());
        }

        @NativeType("bool")
        public boolean optimize_allow_expanded_id_bound() {
            return GLSLangSPVOptions.noptimize_allow_expanded_id_bound(address());
        }

        public Buffer generate_debug_info(@NativeType("bool") boolean value) {
            GLSLangSPVOptions.ngenerate_debug_info(address(), value);
            return this;
        }

        public Buffer strip_debug_info(@NativeType("bool") boolean value) {
            GLSLangSPVOptions.nstrip_debug_info(address(), value);
            return this;
        }

        public Buffer disable_optimizer(@NativeType("bool") boolean value) {
            GLSLangSPVOptions.ndisable_optimizer(address(), value);
            return this;
        }

        public Buffer optimize_size(@NativeType("bool") boolean value) {
            GLSLangSPVOptions.noptimize_size(address(), value);
            return this;
        }

        public Buffer disassemble(@NativeType("bool") boolean value) {
            GLSLangSPVOptions.ndisassemble(address(), value);
            return this;
        }

        public Buffer validate(@NativeType("bool") boolean value) {
            GLSLangSPVOptions.nvalidate(address(), value);
            return this;
        }

        public Buffer emit_nonsemantic_shader_debug_info(@NativeType("bool") boolean value) {
            GLSLangSPVOptions.nemit_nonsemantic_shader_debug_info(address(), value);
            return this;
        }

        public Buffer emit_nonsemantic_shader_debug_source(@NativeType("bool") boolean value) {
            GLSLangSPVOptions.nemit_nonsemantic_shader_debug_source(address(), value);
            return this;
        }

        public Buffer compile_only(@NativeType("bool") boolean value) {
            GLSLangSPVOptions.ncompile_only(address(), value);
            return this;
        }

        public Buffer optimize_allow_expanded_id_bound(@NativeType("bool") boolean value) {
            GLSLangSPVOptions.noptimize_allow_expanded_id_bound(address(), value);
            return this;
        }
    }
}
