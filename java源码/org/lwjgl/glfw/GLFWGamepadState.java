package org.lwjgl.glfw;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWGamepadState.class
 */
@NativeType("struct GLFWgamepadstate")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWGamepadState.class */
public class GLFWGamepadState extends Struct<GLFWGamepadState> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BUTTONS;
    public static final int AXES;

    static {
        Struct.Layout layout = __struct(__array(1, 15), __array(4, 6));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BUTTONS = layout.offsetof(0);
        AXES = layout.offsetof(1);
    }

    protected GLFWGamepadState(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLFWGamepadState create(long address, ByteBuffer container) {
        return new GLFWGamepadState(address, container);
    }

    public GLFWGamepadState(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned char[15]")
    public ByteBuffer buttons() {
        return nbuttons(address());
    }

    @NativeType("unsigned char")
    public byte buttons(int index) {
        return nbuttons(address(), index);
    }

    @NativeType("float[6]")
    public FloatBuffer axes() {
        return naxes(address());
    }

    public float axes(int index) {
        return naxes(address(), index);
    }

    public GLFWGamepadState buttons(@NativeType("unsigned char[15]") ByteBuffer value) {
        nbuttons(address(), value);
        return this;
    }

    public GLFWGamepadState buttons(int index, @NativeType("unsigned char") byte value) {
        nbuttons(address(), index, value);
        return this;
    }

    public GLFWGamepadState axes(@NativeType("float[6]") FloatBuffer value) {
        naxes(address(), value);
        return this;
    }

    public GLFWGamepadState axes(int index, float value) {
        naxes(address(), index, value);
        return this;
    }

    public GLFWGamepadState set(ByteBuffer buttons, FloatBuffer axes) {
        buttons(buttons);
        axes(axes);
        return this;
    }

    public GLFWGamepadState set(GLFWGamepadState src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static GLFWGamepadState malloc() {
        return new GLFWGamepadState(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static GLFWGamepadState calloc() {
        return new GLFWGamepadState(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static GLFWGamepadState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLFWGamepadState(MemoryUtil.memAddress(container), container);
    }

    public static GLFWGamepadState create(long address) {
        return new GLFWGamepadState(address, null);
    }

    public static GLFWGamepadState createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLFWGamepadState(address, null);
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

    public static GLFWGamepadState malloc(MemoryStack stack) {
        return new GLFWGamepadState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static GLFWGamepadState calloc(MemoryStack stack) {
        return new GLFWGamepadState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nbuttons(long struct) {
        return MemoryUtil.memByteBuffer(struct + BUTTONS, 15);
    }

    public static byte nbuttons(long struct, int index) {
        return MemoryUtil.memGetByte(struct + BUTTONS + (Checks.check(index, 15) * 1));
    }

    public static FloatBuffer naxes(long struct) {
        return MemoryUtil.memFloatBuffer(struct + AXES, 6);
    }

    public static float naxes(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + AXES + (Checks.check(index, 6) * 4));
    }

    public static void nbuttons(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 15);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + BUTTONS, value.remaining() * 1);
    }

    public static void nbuttons(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + BUTTONS + (Checks.check(index, 15) * 1), value);
    }

    public static void naxes(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 6);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + AXES, value.remaining() * 4);
    }

    public static void naxes(long struct, int index, float value) {
        MemoryUtil.memPutFloat(struct + AXES + (Checks.check(index, 6) * 4), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWGamepadState$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWGamepadState$Buffer.class */
    public static class Buffer extends StructBuffer<GLFWGamepadState, Buffer> implements NativeResource {
        private static final GLFWGamepadState ELEMENT_FACTORY = GLFWGamepadState.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLFWGamepadState.SIZEOF);
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
        public GLFWGamepadState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned char[15]")
        public ByteBuffer buttons() {
            return GLFWGamepadState.nbuttons(address());
        }

        @NativeType("unsigned char")
        public byte buttons(int index) {
            return GLFWGamepadState.nbuttons(address(), index);
        }

        @NativeType("float[6]")
        public FloatBuffer axes() {
            return GLFWGamepadState.naxes(address());
        }

        public float axes(int index) {
            return GLFWGamepadState.naxes(address(), index);
        }

        public Buffer buttons(@NativeType("unsigned char[15]") ByteBuffer value) {
            GLFWGamepadState.nbuttons(address(), value);
            return this;
        }

        public Buffer buttons(int index, @NativeType("unsigned char") byte value) {
            GLFWGamepadState.nbuttons(address(), index, value);
            return this;
        }

        public Buffer axes(@NativeType("float[6]") FloatBuffer value) {
            GLFWGamepadState.naxes(address(), value);
            return this;
        }

        public Buffer axes(int index, float value) {
            GLFWGamepadState.naxes(address(), index, value);
            return this;
        }
    }
}
