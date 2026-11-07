package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGLUFramebuffer.class
 */
@NativeType("struct NVGLUframebuffer")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGLUFramebuffer.class */
public class NVGLUFramebuffer extends Struct<NVGLUFramebuffer> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FBO;
    public static final int RBO;
    public static final int TEXTURE;
    public static final int IMAGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FBO = layout.offsetof(0);
        RBO = layout.offsetof(1);
        TEXTURE = layout.offsetof(2);
        IMAGE = layout.offsetof(3);
    }

    protected NVGLUFramebuffer(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public NVGLUFramebuffer create(long address, ByteBuffer container) {
        return new NVGLUFramebuffer(address, container);
    }

    public NVGLUFramebuffer(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("GLuint")
    public int fbo() {
        return nfbo(address());
    }

    @NativeType("GLuint")
    public int rbo() {
        return nrbo(address());
    }

    @NativeType("GLuint")
    public int texture() {
        return ntexture(address());
    }

    public int image() {
        return nimage(address());
    }

    public static NVGLUFramebuffer create(long address) {
        return new NVGLUFramebuffer(address, null);
    }

    public static NVGLUFramebuffer createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new NVGLUFramebuffer(address, null);
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

    public static int nfbo(long struct) {
        return MemoryUtil.memGetInt(struct + FBO);
    }

    public static int nrbo(long struct) {
        return MemoryUtil.memGetInt(struct + RBO);
    }

    public static int ntexture(long struct) {
        return MemoryUtil.memGetInt(struct + TEXTURE);
    }

    public static int nimage(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGLUFramebuffer$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGLUFramebuffer$Buffer.class */
    public static class Buffer extends StructBuffer<NVGLUFramebuffer, Buffer> {
        private static final NVGLUFramebuffer ELEMENT_FACTORY = NVGLUFramebuffer.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / NVGLUFramebuffer.SIZEOF);
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
        public NVGLUFramebuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("GLuint")
        public int fbo() {
            return NVGLUFramebuffer.nfbo(address());
        }

        @NativeType("GLuint")
        public int rbo() {
            return NVGLUFramebuffer.nrbo(address());
        }

        @NativeType("GLuint")
        public int texture() {
            return NVGLUFramebuffer.ntexture(address());
        }

        public int image() {
            return NVGLUFramebuffer.nimage(address());
        }
    }
}
