package org.lwjgl.util.spvc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslResourceBinding.class
 */
@NativeType("struct spvc_msl_resource_binding")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslResourceBinding.class */
public class SpvcMslResourceBinding extends Struct<SpvcMslResourceBinding> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STAGE;
    public static final int DESC_SET;
    public static final int BINDING;
    public static final int MSL_BUFFER;
    public static final int MSL_TEXTURE;
    public static final int MSL_SAMPLER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STAGE = layout.offsetof(0);
        DESC_SET = layout.offsetof(1);
        BINDING = layout.offsetof(2);
        MSL_BUFFER = layout.offsetof(3);
        MSL_TEXTURE = layout.offsetof(4);
        MSL_SAMPLER = layout.offsetof(5);
    }

    protected SpvcMslResourceBinding(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcMslResourceBinding create(long address, ByteBuffer container) {
        return new SpvcMslResourceBinding(address, container);
    }

    public SpvcMslResourceBinding(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SpvExecutionModel")
    public int stage() {
        return nstage(address());
    }

    @NativeType("unsigned int")
    public int desc_set() {
        return ndesc_set(address());
    }

    @NativeType("unsigned int")
    public int binding() {
        return nbinding(address());
    }

    @NativeType("unsigned int")
    public int msl_buffer() {
        return nmsl_buffer(address());
    }

    @NativeType("unsigned int")
    public int msl_texture() {
        return nmsl_texture(address());
    }

    @NativeType("unsigned int")
    public int msl_sampler() {
        return nmsl_sampler(address());
    }

    public SpvcMslResourceBinding stage(@NativeType("SpvExecutionModel") int value) {
        nstage(address(), value);
        return this;
    }

    public SpvcMslResourceBinding desc_set(@NativeType("unsigned int") int value) {
        ndesc_set(address(), value);
        return this;
    }

    public SpvcMslResourceBinding binding(@NativeType("unsigned int") int value) {
        nbinding(address(), value);
        return this;
    }

    public SpvcMslResourceBinding msl_buffer(@NativeType("unsigned int") int value) {
        nmsl_buffer(address(), value);
        return this;
    }

    public SpvcMslResourceBinding msl_texture(@NativeType("unsigned int") int value) {
        nmsl_texture(address(), value);
        return this;
    }

    public SpvcMslResourceBinding msl_sampler(@NativeType("unsigned int") int value) {
        nmsl_sampler(address(), value);
        return this;
    }

    public SpvcMslResourceBinding set(int stage, int desc_set, int binding, int msl_buffer, int msl_texture, int msl_sampler) {
        stage(stage);
        desc_set(desc_set);
        binding(binding);
        msl_buffer(msl_buffer);
        msl_texture(msl_texture);
        msl_sampler(msl_sampler);
        return this;
    }

    public SpvcMslResourceBinding set(SpvcMslResourceBinding src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcMslResourceBinding malloc() {
        return new SpvcMslResourceBinding(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcMslResourceBinding calloc() {
        return new SpvcMslResourceBinding(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcMslResourceBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcMslResourceBinding(MemoryUtil.memAddress(container), container);
    }

    public static SpvcMslResourceBinding create(long address) {
        return new SpvcMslResourceBinding(address, null);
    }

    public static SpvcMslResourceBinding createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcMslResourceBinding(address, null);
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

    public static SpvcMslResourceBinding malloc(MemoryStack stack) {
        return new SpvcMslResourceBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcMslResourceBinding calloc(MemoryStack stack) {
        return new SpvcMslResourceBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nstage(long struct) {
        return MemoryUtil.memGetInt(struct + STAGE);
    }

    public static int ndesc_set(long struct) {
        return MemoryUtil.memGetInt(struct + DESC_SET);
    }

    public static int nbinding(long struct) {
        return MemoryUtil.memGetInt(struct + BINDING);
    }

    public static int nmsl_buffer(long struct) {
        return MemoryUtil.memGetInt(struct + MSL_BUFFER);
    }

    public static int nmsl_texture(long struct) {
        return MemoryUtil.memGetInt(struct + MSL_TEXTURE);
    }

    public static int nmsl_sampler(long struct) {
        return MemoryUtil.memGetInt(struct + MSL_SAMPLER);
    }

    public static void nstage(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGE, value);
    }

    public static void ndesc_set(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESC_SET, value);
    }

    public static void nbinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDING, value);
    }

    public static void nmsl_buffer(long struct, int value) {
        MemoryUtil.memPutInt(struct + MSL_BUFFER, value);
    }

    public static void nmsl_texture(long struct, int value) {
        MemoryUtil.memPutInt(struct + MSL_TEXTURE, value);
    }

    public static void nmsl_sampler(long struct, int value) {
        MemoryUtil.memPutInt(struct + MSL_SAMPLER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslResourceBinding$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslResourceBinding$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcMslResourceBinding, Buffer> implements NativeResource {
        private static final SpvcMslResourceBinding ELEMENT_FACTORY = SpvcMslResourceBinding.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcMslResourceBinding.SIZEOF);
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
        public SpvcMslResourceBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SpvExecutionModel")
        public int stage() {
            return SpvcMslResourceBinding.nstage(address());
        }

        @NativeType("unsigned int")
        public int desc_set() {
            return SpvcMslResourceBinding.ndesc_set(address());
        }

        @NativeType("unsigned int")
        public int binding() {
            return SpvcMslResourceBinding.nbinding(address());
        }

        @NativeType("unsigned int")
        public int msl_buffer() {
            return SpvcMslResourceBinding.nmsl_buffer(address());
        }

        @NativeType("unsigned int")
        public int msl_texture() {
            return SpvcMslResourceBinding.nmsl_texture(address());
        }

        @NativeType("unsigned int")
        public int msl_sampler() {
            return SpvcMslResourceBinding.nmsl_sampler(address());
        }

        public Buffer stage(@NativeType("SpvExecutionModel") int value) {
            SpvcMslResourceBinding.nstage(address(), value);
            return this;
        }

        public Buffer desc_set(@NativeType("unsigned int") int value) {
            SpvcMslResourceBinding.ndesc_set(address(), value);
            return this;
        }

        public Buffer binding(@NativeType("unsigned int") int value) {
            SpvcMslResourceBinding.nbinding(address(), value);
            return this;
        }

        public Buffer msl_buffer(@NativeType("unsigned int") int value) {
            SpvcMslResourceBinding.nmsl_buffer(address(), value);
            return this;
        }

        public Buffer msl_texture(@NativeType("unsigned int") int value) {
            SpvcMslResourceBinding.nmsl_texture(address(), value);
            return this;
        }

        public Buffer msl_sampler(@NativeType("unsigned int") int value) {
            SpvcMslResourceBinding.nmsl_sampler(address(), value);
            return this;
        }
    }
}
