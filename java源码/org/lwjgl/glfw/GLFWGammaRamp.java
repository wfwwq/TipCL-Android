package org.lwjgl.glfw;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWGammaRamp.class
 */
@NativeType("struct GLFWgammaramp")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWGammaRamp.class */
public class GLFWGammaRamp extends Struct<GLFWGammaRamp> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RED;
    public static final int GREEN;
    public static final int BLUE;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        RED = layout.offsetof(0);
        GREEN = layout.offsetof(1);
        BLUE = layout.offsetof(2);
        SIZE = layout.offsetof(3);
    }

    protected GLFWGammaRamp(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLFWGammaRamp create(long address, ByteBuffer container) {
        return new GLFWGammaRamp(address, container);
    }

    public GLFWGammaRamp(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned short *")
    public ShortBuffer red() {
        return nred(address());
    }

    @NativeType("unsigned short *")
    public ShortBuffer green() {
        return ngreen(address());
    }

    @NativeType("unsigned short *")
    public ShortBuffer blue() {
        return nblue(address());
    }

    @NativeType("unsigned int")
    public int size() {
        return nsize(address());
    }

    public GLFWGammaRamp red(@NativeType("unsigned short *") ShortBuffer value) {
        nred(address(), value);
        return this;
    }

    public GLFWGammaRamp green(@NativeType("unsigned short *") ShortBuffer value) {
        ngreen(address(), value);
        return this;
    }

    public GLFWGammaRamp blue(@NativeType("unsigned short *") ShortBuffer value) {
        nblue(address(), value);
        return this;
    }

    public GLFWGammaRamp size(@NativeType("unsigned int") int value) {
        nsize(address(), value);
        return this;
    }

    public GLFWGammaRamp set(ShortBuffer red, ShortBuffer green, ShortBuffer blue, int size) {
        red(red);
        green(green);
        blue(blue);
        size(size);
        return this;
    }

    public GLFWGammaRamp set(GLFWGammaRamp src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static GLFWGammaRamp malloc() {
        return new GLFWGammaRamp(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static GLFWGammaRamp calloc() {
        return new GLFWGammaRamp(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static GLFWGammaRamp create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLFWGammaRamp(MemoryUtil.memAddress(container), container);
    }

    public static GLFWGammaRamp create(long address) {
        return new GLFWGammaRamp(address, null);
    }

    public static GLFWGammaRamp createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLFWGammaRamp(address, null);
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

    public static GLFWGammaRamp malloc(MemoryStack stack) {
        return new GLFWGammaRamp(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static GLFWGammaRamp calloc(MemoryStack stack) {
        return new GLFWGammaRamp(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ShortBuffer nred(long struct) {
        return MemoryUtil.memShortBuffer(MemoryUtil.memGetAddress(struct + RED), nsize(struct));
    }

    public static ShortBuffer ngreen(long struct) {
        return MemoryUtil.memShortBuffer(MemoryUtil.memGetAddress(struct + GREEN), nsize(struct));
    }

    public static ShortBuffer nblue(long struct) {
        return MemoryUtil.memShortBuffer(MemoryUtil.memGetAddress(struct + BLUE), nsize(struct));
    }

    public static int nsize(long struct) {
        return MemoryUtil.memGetInt(struct + SIZE);
    }

    public static void nred(long struct, ShortBuffer value) {
        MemoryUtil.memPutAddress(struct + RED, MemoryUtil.memAddress(value));
    }

    public static void ngreen(long struct, ShortBuffer value) {
        MemoryUtil.memPutAddress(struct + GREEN, MemoryUtil.memAddress(value));
    }

    public static void nblue(long struct, ShortBuffer value) {
        MemoryUtil.memPutAddress(struct + BLUE, MemoryUtil.memAddress(value));
    }

    public static void nsize(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIZE, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + RED));
        Checks.check(MemoryUtil.memGetAddress(struct + GREEN));
        Checks.check(MemoryUtil.memGetAddress(struct + BLUE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWGammaRamp$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWGammaRamp$Buffer.class */
    public static class Buffer extends StructBuffer<GLFWGammaRamp, Buffer> implements NativeResource {
        private static final GLFWGammaRamp ELEMENT_FACTORY = GLFWGammaRamp.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLFWGammaRamp.SIZEOF);
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
        public GLFWGammaRamp getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned short *")
        public ShortBuffer red() {
            return GLFWGammaRamp.nred(address());
        }

        @NativeType("unsigned short *")
        public ShortBuffer green() {
            return GLFWGammaRamp.ngreen(address());
        }

        @NativeType("unsigned short *")
        public ShortBuffer blue() {
            return GLFWGammaRamp.nblue(address());
        }

        @NativeType("unsigned int")
        public int size() {
            return GLFWGammaRamp.nsize(address());
        }

        public Buffer red(@NativeType("unsigned short *") ShortBuffer value) {
            GLFWGammaRamp.nred(address(), value);
            return this;
        }

        public Buffer green(@NativeType("unsigned short *") ShortBuffer value) {
            GLFWGammaRamp.ngreen(address(), value);
            return this;
        }

        public Buffer blue(@NativeType("unsigned short *") ShortBuffer value) {
            GLFWGammaRamp.nblue(address(), value);
            return this;
        }

        public Buffer size(@NativeType("unsigned int") int value) {
            GLFWGammaRamp.nsize(address(), value);
            return this;
        }
    }
}
