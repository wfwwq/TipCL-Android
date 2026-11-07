package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUGraphicsPipelineCreateInfo.class */
public class SDL_GPUGraphicsPipelineCreateInfo extends Struct<SDL_GPUGraphicsPipelineCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERTEX_SHADER;
    public static final int FRAGMENT_SHADER;
    public static final int VERTEX_INPUT_STATE;
    public static final int PRIMITIVE_TYPE;
    public static final int RASTERIZER_STATE;
    public static final int MULTISAMPLE_STATE;
    public static final int DEPTH_STENCIL_STATE;
    public static final int TARGET_INFO;
    public static final int PROPS;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(SDL_GPUVertexInputState.SIZEOF, SDL_GPUVertexInputState.ALIGNOF), __member(4), __member(SDL_GPURasterizerState.SIZEOF, SDL_GPURasterizerState.ALIGNOF), __member(SDL_GPUMultisampleState.SIZEOF, SDL_GPUMultisampleState.ALIGNOF), __member(SDL_GPUDepthStencilState.SIZEOF, SDL_GPUDepthStencilState.ALIGNOF), __member(SDL_GPUGraphicsPipelineTargetInfo.SIZEOF, SDL_GPUGraphicsPipelineTargetInfo.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VERTEX_SHADER = layout.offsetof(0);
        FRAGMENT_SHADER = layout.offsetof(1);
        VERTEX_INPUT_STATE = layout.offsetof(2);
        PRIMITIVE_TYPE = layout.offsetof(3);
        RASTERIZER_STATE = layout.offsetof(4);
        MULTISAMPLE_STATE = layout.offsetof(5);
        DEPTH_STENCIL_STATE = layout.offsetof(6);
        TARGET_INFO = layout.offsetof(7);
        PROPS = layout.offsetof(8);
    }

    protected SDL_GPUGraphicsPipelineCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUGraphicsPipelineCreateInfo create(long address, ByteBuffer container) {
        return new SDL_GPUGraphicsPipelineCreateInfo(address, container);
    }

    public SDL_GPUGraphicsPipelineCreateInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUShader *")
    public long vertex_shader() {
        return nvertex_shader(address());
    }

    @NativeType("SDL_GPUShader *")
    public long fragment_shader() {
        return nfragment_shader(address());
    }

    public SDL_GPUVertexInputState vertex_input_state() {
        return nvertex_input_state(address());
    }

    @NativeType("SDL_GPUPrimitiveType")
    public int primitive_type() {
        return nprimitive_type(address());
    }

    public SDL_GPURasterizerState rasterizer_state() {
        return nrasterizer_state(address());
    }

    public SDL_GPUMultisampleState multisample_state() {
        return nmultisample_state(address());
    }

    public SDL_GPUDepthStencilState depth_stencil_state() {
        return ndepth_stencil_state(address());
    }

    public SDL_GPUGraphicsPipelineTargetInfo target_info() {
        return ntarget_info(address());
    }

    @NativeType("SDL_PropertiesID")
    public int props() {
        return nprops(address());
    }

    public SDL_GPUGraphicsPipelineCreateInfo vertex_shader(@NativeType("SDL_GPUShader *") long value) {
        nvertex_shader(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo fragment_shader(@NativeType("SDL_GPUShader *") long value) {
        nfragment_shader(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo vertex_input_state(SDL_GPUVertexInputState value) {
        nvertex_input_state(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo vertex_input_state(Consumer<SDL_GPUVertexInputState> consumer) {
        consumer.accept(vertex_input_state());
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo primitive_type(@NativeType("SDL_GPUPrimitiveType") int value) {
        nprimitive_type(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo rasterizer_state(SDL_GPURasterizerState value) {
        nrasterizer_state(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo rasterizer_state(Consumer<SDL_GPURasterizerState> consumer) {
        consumer.accept(rasterizer_state());
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo multisample_state(SDL_GPUMultisampleState value) {
        nmultisample_state(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo multisample_state(Consumer<SDL_GPUMultisampleState> consumer) {
        consumer.accept(multisample_state());
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo depth_stencil_state(SDL_GPUDepthStencilState value) {
        ndepth_stencil_state(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo depth_stencil_state(Consumer<SDL_GPUDepthStencilState> consumer) {
        consumer.accept(depth_stencil_state());
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo target_info(SDL_GPUGraphicsPipelineTargetInfo value) {
        ntarget_info(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo target_info(Consumer<SDL_GPUGraphicsPipelineTargetInfo> consumer) {
        consumer.accept(target_info());
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo props(@NativeType("SDL_PropertiesID") int value) {
        nprops(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo set(long vertex_shader, long fragment_shader, SDL_GPUVertexInputState vertex_input_state, int primitive_type, SDL_GPURasterizerState rasterizer_state, SDL_GPUMultisampleState multisample_state, SDL_GPUDepthStencilState depth_stencil_state, SDL_GPUGraphicsPipelineTargetInfo target_info, int props) {
        vertex_shader(vertex_shader);
        fragment_shader(fragment_shader);
        vertex_input_state(vertex_input_state);
        primitive_type(primitive_type);
        rasterizer_state(rasterizer_state);
        multisample_state(multisample_state);
        depth_stencil_state(depth_stencil_state);
        target_info(target_info);
        props(props);
        return this;
    }

    public SDL_GPUGraphicsPipelineCreateInfo set(SDL_GPUGraphicsPipelineCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUGraphicsPipelineCreateInfo malloc() {
        return new SDL_GPUGraphicsPipelineCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUGraphicsPipelineCreateInfo calloc() {
        return new SDL_GPUGraphicsPipelineCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUGraphicsPipelineCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUGraphicsPipelineCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUGraphicsPipelineCreateInfo create(long address) {
        return new SDL_GPUGraphicsPipelineCreateInfo(address, null);
    }

    public static SDL_GPUGraphicsPipelineCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUGraphicsPipelineCreateInfo(address, null);
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

    public static SDL_GPUGraphicsPipelineCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUGraphicsPipelineCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUGraphicsPipelineCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUGraphicsPipelineCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nvertex_shader(long struct) {
        return MemoryUtil.memGetAddress(struct + VERTEX_SHADER);
    }

    public static long nfragment_shader(long struct) {
        return MemoryUtil.memGetAddress(struct + FRAGMENT_SHADER);
    }

    public static SDL_GPUVertexInputState nvertex_input_state(long struct) {
        return SDL_GPUVertexInputState.create(struct + VERTEX_INPUT_STATE);
    }

    public static int nprimitive_type(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMITIVE_TYPE);
    }

    public static SDL_GPURasterizerState nrasterizer_state(long struct) {
        return SDL_GPURasterizerState.create(struct + RASTERIZER_STATE);
    }

    public static SDL_GPUMultisampleState nmultisample_state(long struct) {
        return SDL_GPUMultisampleState.create(struct + MULTISAMPLE_STATE);
    }

    public static SDL_GPUDepthStencilState ndepth_stencil_state(long struct) {
        return SDL_GPUDepthStencilState.create(struct + DEPTH_STENCIL_STATE);
    }

    public static SDL_GPUGraphicsPipelineTargetInfo ntarget_info(long struct) {
        return SDL_GPUGraphicsPipelineTargetInfo.create(struct + TARGET_INFO);
    }

    public static int nprops(long struct) {
        return MemoryUtil.memGetInt(struct + PROPS);
    }

    public static void nvertex_shader(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VERTEX_SHADER, value);
    }

    public static void nfragment_shader(long struct, long value) {
        MemoryUtil.memPutAddress(struct + FRAGMENT_SHADER, value);
    }

    public static void nvertex_input_state(long struct, SDL_GPUVertexInputState value) {
        MemoryUtil.memCopy(value.address(), struct + VERTEX_INPUT_STATE, SDL_GPUVertexInputState.SIZEOF);
    }

    public static void nprimitive_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIMITIVE_TYPE, value);
    }

    public static void nrasterizer_state(long struct, SDL_GPURasterizerState value) {
        MemoryUtil.memCopy(value.address(), struct + RASTERIZER_STATE, SDL_GPURasterizerState.SIZEOF);
    }

    public static void nmultisample_state(long struct, SDL_GPUMultisampleState value) {
        MemoryUtil.memCopy(value.address(), struct + MULTISAMPLE_STATE, SDL_GPUMultisampleState.SIZEOF);
    }

    public static void ndepth_stencil_state(long struct, SDL_GPUDepthStencilState value) {
        MemoryUtil.memCopy(value.address(), struct + DEPTH_STENCIL_STATE, SDL_GPUDepthStencilState.SIZEOF);
    }

    public static void ntarget_info(long struct, SDL_GPUGraphicsPipelineTargetInfo value) {
        MemoryUtil.memCopy(value.address(), struct + TARGET_INFO, SDL_GPUGraphicsPipelineTargetInfo.SIZEOF);
    }

    public static void nprops(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROPS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUGraphicsPipelineCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUGraphicsPipelineCreateInfo, Buffer> implements NativeResource {
        private static final SDL_GPUGraphicsPipelineCreateInfo ELEMENT_FACTORY = SDL_GPUGraphicsPipelineCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUGraphicsPipelineCreateInfo.SIZEOF);
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
        public SDL_GPUGraphicsPipelineCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUShader *")
        public long vertex_shader() {
            return SDL_GPUGraphicsPipelineCreateInfo.nvertex_shader(address());
        }

        @NativeType("SDL_GPUShader *")
        public long fragment_shader() {
            return SDL_GPUGraphicsPipelineCreateInfo.nfragment_shader(address());
        }

        public SDL_GPUVertexInputState vertex_input_state() {
            return SDL_GPUGraphicsPipelineCreateInfo.nvertex_input_state(address());
        }

        @NativeType("SDL_GPUPrimitiveType")
        public int primitive_type() {
            return SDL_GPUGraphicsPipelineCreateInfo.nprimitive_type(address());
        }

        public SDL_GPURasterizerState rasterizer_state() {
            return SDL_GPUGraphicsPipelineCreateInfo.nrasterizer_state(address());
        }

        public SDL_GPUMultisampleState multisample_state() {
            return SDL_GPUGraphicsPipelineCreateInfo.nmultisample_state(address());
        }

        public SDL_GPUDepthStencilState depth_stencil_state() {
            return SDL_GPUGraphicsPipelineCreateInfo.ndepth_stencil_state(address());
        }

        public SDL_GPUGraphicsPipelineTargetInfo target_info() {
            return SDL_GPUGraphicsPipelineCreateInfo.ntarget_info(address());
        }

        @NativeType("SDL_PropertiesID")
        public int props() {
            return SDL_GPUGraphicsPipelineCreateInfo.nprops(address());
        }

        public Buffer vertex_shader(@NativeType("SDL_GPUShader *") long value) {
            SDL_GPUGraphicsPipelineCreateInfo.nvertex_shader(address(), value);
            return this;
        }

        public Buffer fragment_shader(@NativeType("SDL_GPUShader *") long value) {
            SDL_GPUGraphicsPipelineCreateInfo.nfragment_shader(address(), value);
            return this;
        }

        public Buffer vertex_input_state(SDL_GPUVertexInputState value) {
            SDL_GPUGraphicsPipelineCreateInfo.nvertex_input_state(address(), value);
            return this;
        }

        public Buffer vertex_input_state(Consumer<SDL_GPUVertexInputState> consumer) {
            consumer.accept(vertex_input_state());
            return this;
        }

        public Buffer primitive_type(@NativeType("SDL_GPUPrimitiveType") int value) {
            SDL_GPUGraphicsPipelineCreateInfo.nprimitive_type(address(), value);
            return this;
        }

        public Buffer rasterizer_state(SDL_GPURasterizerState value) {
            SDL_GPUGraphicsPipelineCreateInfo.nrasterizer_state(address(), value);
            return this;
        }

        public Buffer rasterizer_state(Consumer<SDL_GPURasterizerState> consumer) {
            consumer.accept(rasterizer_state());
            return this;
        }

        public Buffer multisample_state(SDL_GPUMultisampleState value) {
            SDL_GPUGraphicsPipelineCreateInfo.nmultisample_state(address(), value);
            return this;
        }

        public Buffer multisample_state(Consumer<SDL_GPUMultisampleState> consumer) {
            consumer.accept(multisample_state());
            return this;
        }

        public Buffer depth_stencil_state(SDL_GPUDepthStencilState value) {
            SDL_GPUGraphicsPipelineCreateInfo.ndepth_stencil_state(address(), value);
            return this;
        }

        public Buffer depth_stencil_state(Consumer<SDL_GPUDepthStencilState> consumer) {
            consumer.accept(depth_stencil_state());
            return this;
        }

        public Buffer target_info(SDL_GPUGraphicsPipelineTargetInfo value) {
            SDL_GPUGraphicsPipelineCreateInfo.ntarget_info(address(), value);
            return this;
        }

        public Buffer target_info(Consumer<SDL_GPUGraphicsPipelineTargetInfo> consumer) {
            consumer.accept(target_info());
            return this;
        }

        public Buffer props(@NativeType("SDL_PropertiesID") int value) {
            SDL_GPUGraphicsPipelineCreateInfo.nprops(address(), value);
            return this;
        }
    }
}
