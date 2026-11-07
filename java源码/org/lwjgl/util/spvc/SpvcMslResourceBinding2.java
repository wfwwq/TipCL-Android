package org.lwjgl.util.spvc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spvc_msl_resource_binding_2")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslResourceBinding2.class */
public class SpvcMslResourceBinding2 extends Struct<SpvcMslResourceBinding2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STAGE;
    public static final int DESC_SET;
    public static final int BINDING;
    public static final int COUNT;
    public static final int MSL_BUFFER;
    public static final int MSL_TEXTURE;
    public static final int MSL_SAMPLER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STAGE = layout.offsetof(0);
        DESC_SET = layout.offsetof(1);
        BINDING = layout.offsetof(2);
        COUNT = layout.offsetof(3);
        MSL_BUFFER = layout.offsetof(4);
        MSL_TEXTURE = layout.offsetof(5);
        MSL_SAMPLER = layout.offsetof(6);
    }

    protected SpvcMslResourceBinding2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcMslResourceBinding2 create(long address, ByteBuffer container) {
        return new SpvcMslResourceBinding2(address, container);
    }

    public SpvcMslResourceBinding2(ByteBuffer container) {
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
    public int count() {
        return ncount(address());
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

    public SpvcMslResourceBinding2 stage(@NativeType("SpvExecutionModel") int value) {
        nstage(address(), value);
        return this;
    }

    public SpvcMslResourceBinding2 desc_set(@NativeType("unsigned int") int value) {
        ndesc_set(address(), value);
        return this;
    }

    public SpvcMslResourceBinding2 binding(@NativeType("unsigned int") int value) {
        nbinding(address(), value);
        return this;
    }

    public SpvcMslResourceBinding2 count(@NativeType("unsigned int") int value) {
        ncount(address(), value);
        return this;
    }

    public SpvcMslResourceBinding2 msl_buffer(@NativeType("unsigned int") int value) {
        nmsl_buffer(address(), value);
        return this;
    }

    public SpvcMslResourceBinding2 msl_texture(@NativeType("unsigned int") int value) {
        nmsl_texture(address(), value);
        return this;
    }

    public SpvcMslResourceBinding2 msl_sampler(@NativeType("unsigned int") int value) {
        nmsl_sampler(address(), value);
        return this;
    }

    public SpvcMslResourceBinding2 set(int stage, int desc_set, int binding, int count, int msl_buffer, int msl_texture, int msl_sampler) {
        stage(stage);
        desc_set(desc_set);
        binding(binding);
        count(count);
        msl_buffer(msl_buffer);
        msl_texture(msl_texture);
        msl_sampler(msl_sampler);
        return this;
    }

    public SpvcMslResourceBinding2 set(SpvcMslResourceBinding2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcMslResourceBinding2 malloc() {
        return new SpvcMslResourceBinding2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcMslResourceBinding2 calloc() {
        return new SpvcMslResourceBinding2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcMslResourceBinding2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcMslResourceBinding2(MemoryUtil.memAddress(container), container);
    }

    public static SpvcMslResourceBinding2 create(long address) {
        return new SpvcMslResourceBinding2(address, null);
    }

    public static SpvcMslResourceBinding2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcMslResourceBinding2(address, null);
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

    public static SpvcMslResourceBinding2 malloc(MemoryStack stack) {
        return new SpvcMslResourceBinding2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcMslResourceBinding2 calloc(MemoryStack stack) {
        return new SpvcMslResourceBinding2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncount(long struct) {
        return MemoryUtil.memGetInt(struct + COUNT);
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

    public static void ncount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COUNT, value);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslResourceBinding2$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcMslResourceBinding2, Buffer> implements NativeResource {
        private static final SpvcMslResourceBinding2 ELEMENT_FACTORY = SpvcMslResourceBinding2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcMslResourceBinding2.SIZEOF);
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
        public SpvcMslResourceBinding2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SpvExecutionModel")
        public int stage() {
            return SpvcMslResourceBinding2.nstage(address());
        }

        @NativeType("unsigned int")
        public int desc_set() {
            return SpvcMslResourceBinding2.ndesc_set(address());
        }

        @NativeType("unsigned int")
        public int binding() {
            return SpvcMslResourceBinding2.nbinding(address());
        }

        @NativeType("unsigned int")
        public int count() {
            return SpvcMslResourceBinding2.ncount(address());
        }

        @NativeType("unsigned int")
        public int msl_buffer() {
            return SpvcMslResourceBinding2.nmsl_buffer(address());
        }

        @NativeType("unsigned int")
        public int msl_texture() {
            return SpvcMslResourceBinding2.nmsl_texture(address());
        }

        @NativeType("unsigned int")
        public int msl_sampler() {
            return SpvcMslResourceBinding2.nmsl_sampler(address());
        }

        public Buffer stage(@NativeType("SpvExecutionModel") int value) {
            SpvcMslResourceBinding2.nstage(address(), value);
            return this;
        }

        public Buffer desc_set(@NativeType("unsigned int") int value) {
            SpvcMslResourceBinding2.ndesc_set(address(), value);
            return this;
        }

        public Buffer binding(@NativeType("unsigned int") int value) {
            SpvcMslResourceBinding2.nbinding(address(), value);
            return this;
        }

        public Buffer count(@NativeType("unsigned int") int value) {
            SpvcMslResourceBinding2.ncount(address(), value);
            return this;
        }

        public Buffer msl_buffer(@NativeType("unsigned int") int value) {
            SpvcMslResourceBinding2.nmsl_buffer(address(), value);
            return this;
        }

        public Buffer msl_texture(@NativeType("unsigned int") int value) {
            SpvcMslResourceBinding2.nmsl_texture(address(), value);
            return this;
        }

        public Buffer msl_sampler(@NativeType("unsigned int") int value) {
            SpvcMslResourceBinding2.nmsl_sampler(address(), value);
            return this;
        }
    }
}
