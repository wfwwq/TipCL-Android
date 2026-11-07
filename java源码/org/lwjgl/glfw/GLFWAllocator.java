package org.lwjgl.glfw;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWAllocator.class
 */
@NativeType("struct GLFWallocator")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWAllocator.class */
public class GLFWAllocator extends Struct<GLFWAllocator> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ALLOCATE;
    public static final int REALLOCATE;
    public static final int DEALLOCATE;
    public static final int USER;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ALLOCATE = layout.offsetof(0);
        REALLOCATE = layout.offsetof(1);
        DEALLOCATE = layout.offsetof(2);
        USER = layout.offsetof(3);
    }

    protected GLFWAllocator(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLFWAllocator create(long address, ByteBuffer container) {
        return new GLFWAllocator(address, container);
    }

    public GLFWAllocator(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("GLFWallocatefun")
    public GLFWAllocateCallback allocate() {
        return nallocate(address());
    }

    @NativeType("GLFWreallocatefun")
    public GLFWReallocateCallback reallocate() {
        return nreallocate(address());
    }

    @NativeType("GLFWdeallocatefun")
    public GLFWDeallocateCallback deallocate() {
        return ndeallocate(address());
    }

    @NativeType("void *")
    public long user() {
        return nuser(address());
    }

    public GLFWAllocator allocate(@NativeType("GLFWallocatefun") GLFWAllocateCallbackI value) {
        nallocate(address(), value);
        return this;
    }

    public GLFWAllocator reallocate(@NativeType("GLFWreallocatefun") GLFWReallocateCallbackI value) {
        nreallocate(address(), value);
        return this;
    }

    public GLFWAllocator deallocate(@NativeType("GLFWdeallocatefun") GLFWDeallocateCallbackI value) {
        ndeallocate(address(), value);
        return this;
    }

    public GLFWAllocator user(@NativeType("void *") long value) {
        nuser(address(), value);
        return this;
    }

    public GLFWAllocator set(GLFWAllocateCallbackI allocate, GLFWReallocateCallbackI reallocate, GLFWDeallocateCallbackI deallocate, long user) {
        allocate(allocate);
        reallocate(reallocate);
        deallocate(deallocate);
        user(user);
        return this;
    }

    public GLFWAllocator set(GLFWAllocator src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static GLFWAllocator malloc() {
        return new GLFWAllocator(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static GLFWAllocator calloc() {
        return new GLFWAllocator(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static GLFWAllocator create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLFWAllocator(MemoryUtil.memAddress(container), container);
    }

    public static GLFWAllocator create(long address) {
        return new GLFWAllocator(address, null);
    }

    public static GLFWAllocator createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLFWAllocator(address, null);
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

    public static GLFWAllocator malloc(MemoryStack stack) {
        return new GLFWAllocator(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static GLFWAllocator calloc(MemoryStack stack) {
        return new GLFWAllocator(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static GLFWAllocateCallback nallocate(long struct) {
        return GLFWAllocateCallback.create(MemoryUtil.memGetAddress(struct + ALLOCATE));
    }

    public static GLFWReallocateCallback nreallocate(long struct) {
        return GLFWReallocateCallback.create(MemoryUtil.memGetAddress(struct + REALLOCATE));
    }

    public static GLFWDeallocateCallback ndeallocate(long struct) {
        return GLFWDeallocateCallback.create(MemoryUtil.memGetAddress(struct + DEALLOCATE));
    }

    public static long nuser(long struct) {
        return MemoryUtil.memGetAddress(struct + USER);
    }

    public static void nallocate(long struct, GLFWAllocateCallbackI value) {
        MemoryUtil.memPutAddress(struct + ALLOCATE, value.address());
    }

    public static void nreallocate(long struct, GLFWReallocateCallbackI value) {
        MemoryUtil.memPutAddress(struct + REALLOCATE, value.address());
    }

    public static void ndeallocate(long struct, GLFWDeallocateCallbackI value) {
        MemoryUtil.memPutAddress(struct + DEALLOCATE, value.address());
    }

    public static void nuser(long struct, long value) {
        MemoryUtil.memPutAddress(struct + USER, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + ALLOCATE));
        Checks.check(MemoryUtil.memGetAddress(struct + REALLOCATE));
        Checks.check(MemoryUtil.memGetAddress(struct + DEALLOCATE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWAllocator$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWAllocator$Buffer.class */
    public static class Buffer extends StructBuffer<GLFWAllocator, Buffer> implements NativeResource {
        private static final GLFWAllocator ELEMENT_FACTORY = GLFWAllocator.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLFWAllocator.SIZEOF);
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
        public GLFWAllocator getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("GLFWallocatefun")
        public GLFWAllocateCallback allocate() {
            return GLFWAllocator.nallocate(address());
        }

        @NativeType("GLFWreallocatefun")
        public GLFWReallocateCallback reallocate() {
            return GLFWAllocator.nreallocate(address());
        }

        @NativeType("GLFWdeallocatefun")
        public GLFWDeallocateCallback deallocate() {
            return GLFWAllocator.ndeallocate(address());
        }

        @NativeType("void *")
        public long user() {
            return GLFWAllocator.nuser(address());
        }

        public Buffer allocate(@NativeType("GLFWallocatefun") GLFWAllocateCallbackI value) {
            GLFWAllocator.nallocate(address(), value);
            return this;
        }

        public Buffer reallocate(@NativeType("GLFWreallocatefun") GLFWReallocateCallbackI value) {
            GLFWAllocator.nreallocate(address(), value);
            return this;
        }

        public Buffer deallocate(@NativeType("GLFWdeallocatefun") GLFWDeallocateCallbackI value) {
            GLFWAllocator.ndeallocate(address(), value);
            return this;
        }

        public Buffer user(@NativeType("void *") long value) {
            GLFWAllocator.nuser(address(), value);
            return this;
        }
    }
}
