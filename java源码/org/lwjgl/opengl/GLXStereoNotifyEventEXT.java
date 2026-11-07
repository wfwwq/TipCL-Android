package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLXStereoNotifyEventEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLXStereoNotifyEventEXT.class */
public class GLXStereoNotifyEventEXT extends Struct<GLXStereoNotifyEventEXT> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int EXTENSION;
    public static final int EVTYPE;
    public static final int WINDOW;
    public static final int STEREO_TREE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        EXTENSION = layout.offsetof(4);
        EVTYPE = layout.offsetof(5);
        WINDOW = layout.offsetof(6);
        STEREO_TREE = layout.offsetof(7);
    }

    protected GLXStereoNotifyEventEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLXStereoNotifyEventEXT create(long address, ByteBuffer container) {
        return new GLXStereoNotifyEventEXT(address, container);
    }

    public GLXStereoNotifyEventEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int type() {
        return ntype(address());
    }

    @NativeType("unsigned long")
    public long serial() {
        return nserial(address());
    }

    @NativeType("Bool")
    public boolean send_event() {
        return nsend_event(address()) != 0;
    }

    @NativeType("Display *")
    public long display() {
        return ndisplay(address());
    }

    public int extension() {
        return nextension(address());
    }

    public int evtype() {
        return nevtype(address());
    }

    @NativeType("GLXDrawable")
    public long window() {
        return nwindow(address());
    }

    @NativeType("Bool")
    public boolean stereo_tree() {
        return nstereo_tree(address()) != 0;
    }

    public static GLXStereoNotifyEventEXT create(long address) {
        return new GLXStereoNotifyEventEXT(address, null);
    }

    public static GLXStereoNotifyEventEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLXStereoNotifyEventEXT(address, null);
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

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static long nserial(long struct) {
        return MemoryUtil.memGetCLong(struct + SERIAL);
    }

    public static int nsend_event(long struct) {
        return MemoryUtil.memGetInt(struct + SEND_EVENT);
    }

    public static long ndisplay(long struct) {
        return MemoryUtil.memGetAddress(struct + DISPLAY);
    }

    public static int nextension(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENSION);
    }

    public static int nevtype(long struct) {
        return MemoryUtil.memGetInt(struct + EVTYPE);
    }

    public static long nwindow(long struct) {
        return MemoryUtil.memGetAddress(struct + WINDOW);
    }

    public static int nstereo_tree(long struct) {
        return MemoryUtil.memGetInt(struct + STEREO_TREE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLXStereoNotifyEventEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLXStereoNotifyEventEXT$Buffer.class */
    public static class Buffer extends StructBuffer<GLXStereoNotifyEventEXT, Buffer> {
        private static final GLXStereoNotifyEventEXT ELEMENT_FACTORY = GLXStereoNotifyEventEXT.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLXStereoNotifyEventEXT.SIZEOF);
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
        public GLXStereoNotifyEventEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return GLXStereoNotifyEventEXT.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return GLXStereoNotifyEventEXT.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return GLXStereoNotifyEventEXT.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return GLXStereoNotifyEventEXT.ndisplay(address());
        }

        public int extension() {
            return GLXStereoNotifyEventEXT.nextension(address());
        }

        public int evtype() {
            return GLXStereoNotifyEventEXT.nevtype(address());
        }

        @NativeType("GLXDrawable")
        public long window() {
            return GLXStereoNotifyEventEXT.nwindow(address());
        }

        @NativeType("Bool")
        public boolean stereo_tree() {
            return GLXStereoNotifyEventEXT.nstereo_tree(address()) != 0;
        }
    }
}
