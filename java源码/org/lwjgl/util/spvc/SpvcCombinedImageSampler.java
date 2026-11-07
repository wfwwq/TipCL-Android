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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcCombinedImageSampler.class
 */
@NativeType("struct spvc_combined_image_sampler")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcCombinedImageSampler.class */
public class SpvcCombinedImageSampler extends Struct<SpvcCombinedImageSampler> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COMBINED_ID;
    public static final int IMAGE_ID;
    public static final int SAMPLER_ID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COMBINED_ID = layout.offsetof(0);
        IMAGE_ID = layout.offsetof(1);
        SAMPLER_ID = layout.offsetof(2);
    }

    protected SpvcCombinedImageSampler(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcCombinedImageSampler create(long address, ByteBuffer container) {
        return new SpvcCombinedImageSampler(address, container);
    }

    public SpvcCombinedImageSampler(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("spvc_variable_id")
    public int combined_id() {
        return ncombined_id(address());
    }

    @NativeType("spvc_variable_id")
    public int image_id() {
        return nimage_id(address());
    }

    @NativeType("spvc_variable_id")
    public int sampler_id() {
        return nsampler_id(address());
    }

    public SpvcCombinedImageSampler combined_id(@NativeType("spvc_variable_id") int value) {
        ncombined_id(address(), value);
        return this;
    }

    public SpvcCombinedImageSampler image_id(@NativeType("spvc_variable_id") int value) {
        nimage_id(address(), value);
        return this;
    }

    public SpvcCombinedImageSampler sampler_id(@NativeType("spvc_variable_id") int value) {
        nsampler_id(address(), value);
        return this;
    }

    public SpvcCombinedImageSampler set(int combined_id, int image_id, int sampler_id) {
        combined_id(combined_id);
        image_id(image_id);
        sampler_id(sampler_id);
        return this;
    }

    public SpvcCombinedImageSampler set(SpvcCombinedImageSampler src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcCombinedImageSampler malloc() {
        return new SpvcCombinedImageSampler(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcCombinedImageSampler calloc() {
        return new SpvcCombinedImageSampler(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcCombinedImageSampler create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcCombinedImageSampler(MemoryUtil.memAddress(container), container);
    }

    public static SpvcCombinedImageSampler create(long address) {
        return new SpvcCombinedImageSampler(address, null);
    }

    public static SpvcCombinedImageSampler createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcCombinedImageSampler(address, null);
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

    public static SpvcCombinedImageSampler malloc(MemoryStack stack) {
        return new SpvcCombinedImageSampler(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcCombinedImageSampler calloc(MemoryStack stack) {
        return new SpvcCombinedImageSampler(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ncombined_id(long struct) {
        return MemoryUtil.memGetInt(struct + COMBINED_ID);
    }

    public static int nimage_id(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGE_ID);
    }

    public static int nsampler_id(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLER_ID);
    }

    public static void ncombined_id(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMBINED_ID, value);
    }

    public static void nimage_id(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGE_ID, value);
    }

    public static void nsampler_id(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLER_ID, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcCombinedImageSampler$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcCombinedImageSampler$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcCombinedImageSampler, Buffer> implements NativeResource {
        private static final SpvcCombinedImageSampler ELEMENT_FACTORY = SpvcCombinedImageSampler.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcCombinedImageSampler.SIZEOF);
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
        public SpvcCombinedImageSampler getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("spvc_variable_id")
        public int combined_id() {
            return SpvcCombinedImageSampler.ncombined_id(address());
        }

        @NativeType("spvc_variable_id")
        public int image_id() {
            return SpvcCombinedImageSampler.nimage_id(address());
        }

        @NativeType("spvc_variable_id")
        public int sampler_id() {
            return SpvcCombinedImageSampler.nsampler_id(address());
        }

        public Buffer combined_id(@NativeType("spvc_variable_id") int value) {
            SpvcCombinedImageSampler.ncombined_id(address(), value);
            return this;
        }

        public Buffer image_id(@NativeType("spvc_variable_id") int value) {
            SpvcCombinedImageSampler.nimage_id(address(), value);
            return this;
        }

        public Buffer sampler_id(@NativeType("spvc_variable_id") int value) {
            SpvcCombinedImageSampler.nsampler_id(address(), value);
            return this;
        }
    }
}
