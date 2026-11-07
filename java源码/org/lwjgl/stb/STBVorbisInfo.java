package org.lwjgl.stb;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBVorbisInfo.class
 */
@NativeType("struct stb_vorbis_info")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBVorbisInfo.class */
public class STBVorbisInfo extends Struct<STBVorbisInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SAMPLE_RATE;
    public static final int CHANNELS;
    public static final int SETUP_MEMORY_REQUIRED;
    public static final int SETUP_TEMP_MEMORY_REQUIRED;
    public static final int TEMP_MEMORY_REQUIRED;
    public static final int MAX_FRAME_SIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SAMPLE_RATE = layout.offsetof(0);
        CHANNELS = layout.offsetof(1);
        SETUP_MEMORY_REQUIRED = layout.offsetof(2);
        SETUP_TEMP_MEMORY_REQUIRED = layout.offsetof(3);
        TEMP_MEMORY_REQUIRED = layout.offsetof(4);
        MAX_FRAME_SIZE = layout.offsetof(5);
    }

    protected STBVorbisInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBVorbisInfo create(long address, ByteBuffer container) {
        return new STBVorbisInfo(address, container);
    }

    public STBVorbisInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned int")
    public int sample_rate() {
        return nsample_rate(address());
    }

    public int channels() {
        return nchannels(address());
    }

    @NativeType("unsigned int")
    public int setup_memory_required() {
        return nsetup_memory_required(address());
    }

    @NativeType("unsigned int")
    public int setup_temp_memory_required() {
        return nsetup_temp_memory_required(address());
    }

    @NativeType("unsigned int")
    public int temp_memory_required() {
        return ntemp_memory_required(address());
    }

    public int max_frame_size() {
        return nmax_frame_size(address());
    }

    public static STBVorbisInfo malloc() {
        return new STBVorbisInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBVorbisInfo calloc() {
        return new STBVorbisInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBVorbisInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBVorbisInfo(MemoryUtil.memAddress(container), container);
    }

    public static STBVorbisInfo create(long address) {
        return new STBVorbisInfo(address, null);
    }

    public static STBVorbisInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBVorbisInfo(address, null);
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

    public static STBVorbisInfo malloc(MemoryStack stack) {
        return new STBVorbisInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBVorbisInfo calloc(MemoryStack stack) {
        return new STBVorbisInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsample_rate(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLE_RATE);
    }

    public static int nchannels(long struct) {
        return MemoryUtil.memGetInt(struct + CHANNELS);
    }

    public static int nsetup_memory_required(long struct) {
        return MemoryUtil.memGetInt(struct + SETUP_MEMORY_REQUIRED);
    }

    public static int nsetup_temp_memory_required(long struct) {
        return MemoryUtil.memGetInt(struct + SETUP_TEMP_MEMORY_REQUIRED);
    }

    public static int ntemp_memory_required(long struct) {
        return MemoryUtil.memGetInt(struct + TEMP_MEMORY_REQUIRED);
    }

    public static int nmax_frame_size(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_FRAME_SIZE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBVorbisInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBVorbisInfo$Buffer.class */
    public static class Buffer extends StructBuffer<STBVorbisInfo, Buffer> implements NativeResource {
        private static final STBVorbisInfo ELEMENT_FACTORY = STBVorbisInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBVorbisInfo.SIZEOF);
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
        public STBVorbisInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned int")
        public int sample_rate() {
            return STBVorbisInfo.nsample_rate(address());
        }

        public int channels() {
            return STBVorbisInfo.nchannels(address());
        }

        @NativeType("unsigned int")
        public int setup_memory_required() {
            return STBVorbisInfo.nsetup_memory_required(address());
        }

        @NativeType("unsigned int")
        public int setup_temp_memory_required() {
            return STBVorbisInfo.nsetup_temp_memory_required(address());
        }

        @NativeType("unsigned int")
        public int temp_memory_required() {
            return STBVorbisInfo.ntemp_memory_required(address());
        }

        public int max_frame_size() {
            return STBVorbisInfo.nmax_frame_size(address());
        }
    }
}
