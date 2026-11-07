package org.lwjgl.glfw;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWVidMode.class
 */
@NativeType("struct GLFWvidmode")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWVidMode.class */
public class GLFWVidMode extends Struct<GLFWVidMode> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int REDBITS;
    public static final int GREENBITS;
    public static final int BLUEBITS;
    public static final int REFRESHRATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        REDBITS = layout.offsetof(2);
        GREENBITS = layout.offsetof(3);
        BLUEBITS = layout.offsetof(4);
        REFRESHRATE = layout.offsetof(5);
    }

    protected GLFWVidMode(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLFWVidMode create(long address, ByteBuffer container) {
        return new GLFWVidMode(address, container);
    }

    public GLFWVidMode(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int width() {
        return nwidth(address());
    }

    public int height() {
        return nheight(address());
    }

    public int redBits() {
        return nredBits(address());
    }

    public int greenBits() {
        return ngreenBits(address());
    }

    public int blueBits() {
        return nblueBits(address());
    }

    public int refreshRate() {
        return nrefreshRate(address());
    }

    public static GLFWVidMode create(long address) {
        return new GLFWVidMode(address, null);
    }

    public static GLFWVidMode createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLFWVidMode(address, null);
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

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static int nredBits(long struct) {
        return MemoryUtil.memGetInt(struct + REDBITS);
    }

    public static int ngreenBits(long struct) {
        return MemoryUtil.memGetInt(struct + GREENBITS);
    }

    public static int nblueBits(long struct) {
        return MemoryUtil.memGetInt(struct + BLUEBITS);
    }

    public static int nrefreshRate(long struct) {
        return MemoryUtil.memGetInt(struct + REFRESHRATE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWVidMode$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWVidMode$Buffer.class */
    public static class Buffer extends StructBuffer<GLFWVidMode, Buffer> {
        private static final GLFWVidMode ELEMENT_FACTORY = GLFWVidMode.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLFWVidMode.SIZEOF);
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
        public GLFWVidMode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int width() {
            return GLFWVidMode.nwidth(address());
        }

        public int height() {
            return GLFWVidMode.nheight(address());
        }

        public int redBits() {
            return GLFWVidMode.nredBits(address());
        }

        public int greenBits() {
            return GLFWVidMode.ngreenBits(address());
        }

        public int blueBits() {
            return GLFWVidMode.nblueBits(address());
        }

        public int refreshRate() {
            return GLFWVidMode.nrefreshRate(address());
        }
    }
}
