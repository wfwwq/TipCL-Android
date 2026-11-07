package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGLUFramebufferBGFX.class
 */
@NativeType("struct NVGLUframebuffer")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGLUFramebufferBGFX.class */
public class NVGLUFramebufferBGFX extends Struct<NVGLUFramebufferBGFX> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CTX;
    public static final int HANDLE;
    public static final int IMAGE;
    public static final int VIEWID;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(2), __member(4), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CTX = layout.offsetof(0);
        HANDLE = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        VIEWID = layout.offsetof(3);
    }

    protected NVGLUFramebufferBGFX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public NVGLUFramebufferBGFX create(long address, ByteBuffer container) {
        return new NVGLUFramebufferBGFX(address, container);
    }

    public NVGLUFramebufferBGFX(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("NVGcontext *")
    public long ctx() {
        return nctx(address());
    }

    @NativeType("bgfx_frame_buffer_handle_t")
    public short handle() {
        return nhandle(address());
    }

    public int image() {
        return nimage(address());
    }

    @NativeType("bgfx_view_id_t")
    public short viewId() {
        return nviewId(address());
    }

    public static NVGLUFramebufferBGFX create(long address) {
        return new NVGLUFramebufferBGFX(address, null);
    }

    public static NVGLUFramebufferBGFX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new NVGLUFramebufferBGFX(address, null);
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

    public static long nctx(long struct) {
        return MemoryUtil.memGetAddress(struct + CTX);
    }

    public static short nhandle(long struct) {
        return MemoryUtil.memGetShort(struct + HANDLE);
    }

    public static int nimage(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGE);
    }

    public static short nviewId(long struct) {
        return MemoryUtil.memGetShort(struct + VIEWID);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGLUFramebufferBGFX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGLUFramebufferBGFX$Buffer.class */
    public static class Buffer extends StructBuffer<NVGLUFramebufferBGFX, Buffer> {
        private static final NVGLUFramebufferBGFX ELEMENT_FACTORY = NVGLUFramebufferBGFX.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / NVGLUFramebufferBGFX.SIZEOF);
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
        public NVGLUFramebufferBGFX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("NVGcontext *")
        public long ctx() {
            return NVGLUFramebufferBGFX.nctx(address());
        }

        @NativeType("bgfx_frame_buffer_handle_t")
        public short handle() {
            return NVGLUFramebufferBGFX.nhandle(address());
        }

        public int image() {
            return NVGLUFramebufferBGFX.nimage(address());
        }

        @NativeType("bgfx_view_id_t")
        public short viewId() {
            return NVGLUFramebufferBGFX.nviewId(address());
        }
    }
}
