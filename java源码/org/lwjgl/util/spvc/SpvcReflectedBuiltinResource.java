package org.lwjgl.util.spvc;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcReflectedBuiltinResource.class
 */
@NativeType("struct spvc_reflected_builtin_resource")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcReflectedBuiltinResource.class */
public class SpvcReflectedBuiltinResource extends Struct<SpvcReflectedBuiltinResource> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BUILTIN;
    public static final int VALUE_TYPE_ID;
    public static final int RESOURCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(SpvcReflectedResource.SIZEOF, SpvcReflectedResource.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BUILTIN = layout.offsetof(0);
        VALUE_TYPE_ID = layout.offsetof(1);
        RESOURCE = layout.offsetof(2);
    }

    protected SpvcReflectedBuiltinResource(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcReflectedBuiltinResource create(long address, ByteBuffer container) {
        return new SpvcReflectedBuiltinResource(address, container);
    }

    public SpvcReflectedBuiltinResource(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SpvBuiltIn")
    public int builtin() {
        return nbuiltin(address());
    }

    @NativeType("spvc_type_id")
    public int value_type_id() {
        return nvalue_type_id(address());
    }

    @NativeType("spvc_reflected_resource")
    public SpvcReflectedResource resource() {
        return nresource(address());
    }

    public SpvcReflectedBuiltinResource builtin(@NativeType("SpvBuiltIn") int value) {
        nbuiltin(address(), value);
        return this;
    }

    public SpvcReflectedBuiltinResource value_type_id(@NativeType("spvc_type_id") int value) {
        nvalue_type_id(address(), value);
        return this;
    }

    public SpvcReflectedBuiltinResource resource(@NativeType("spvc_reflected_resource") SpvcReflectedResource value) {
        nresource(address(), value);
        return this;
    }

    public SpvcReflectedBuiltinResource resource(Consumer<SpvcReflectedResource> consumer) {
        consumer.accept(resource());
        return this;
    }

    public SpvcReflectedBuiltinResource set(int builtin, int value_type_id, SpvcReflectedResource resource) {
        builtin(builtin);
        value_type_id(value_type_id);
        resource(resource);
        return this;
    }

    public SpvcReflectedBuiltinResource set(SpvcReflectedBuiltinResource src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcReflectedBuiltinResource malloc() {
        return new SpvcReflectedBuiltinResource(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcReflectedBuiltinResource calloc() {
        return new SpvcReflectedBuiltinResource(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcReflectedBuiltinResource create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcReflectedBuiltinResource(MemoryUtil.memAddress(container), container);
    }

    public static SpvcReflectedBuiltinResource create(long address) {
        return new SpvcReflectedBuiltinResource(address, null);
    }

    public static SpvcReflectedBuiltinResource createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcReflectedBuiltinResource(address, null);
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

    public static SpvcReflectedBuiltinResource malloc(MemoryStack stack) {
        return new SpvcReflectedBuiltinResource(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcReflectedBuiltinResource calloc(MemoryStack stack) {
        return new SpvcReflectedBuiltinResource(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nbuiltin(long struct) {
        return MemoryUtil.memGetInt(struct + BUILTIN);
    }

    public static int nvalue_type_id(long struct) {
        return MemoryUtil.memGetInt(struct + VALUE_TYPE_ID);
    }

    public static SpvcReflectedResource nresource(long struct) {
        return SpvcReflectedResource.create(struct + RESOURCE);
    }

    public static void nbuiltin(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUILTIN, value);
    }

    public static void nvalue_type_id(long struct, int value) {
        MemoryUtil.memPutInt(struct + VALUE_TYPE_ID, value);
    }

    public static void nresource(long struct, SpvcReflectedResource value) {
        MemoryUtil.memCopy(value.address(), struct + RESOURCE, SpvcReflectedResource.SIZEOF);
    }

    public static void validate(long struct) {
        SpvcReflectedResource.validate(struct + RESOURCE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcReflectedBuiltinResource$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcReflectedBuiltinResource$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcReflectedBuiltinResource, Buffer> implements NativeResource {
        private static final SpvcReflectedBuiltinResource ELEMENT_FACTORY = SpvcReflectedBuiltinResource.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcReflectedBuiltinResource.SIZEOF);
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
        public SpvcReflectedBuiltinResource getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SpvBuiltIn")
        public int builtin() {
            return SpvcReflectedBuiltinResource.nbuiltin(address());
        }

        @NativeType("spvc_type_id")
        public int value_type_id() {
            return SpvcReflectedBuiltinResource.nvalue_type_id(address());
        }

        @NativeType("spvc_reflected_resource")
        public SpvcReflectedResource resource() {
            return SpvcReflectedBuiltinResource.nresource(address());
        }

        public Buffer builtin(@NativeType("SpvBuiltIn") int value) {
            SpvcReflectedBuiltinResource.nbuiltin(address(), value);
            return this;
        }

        public Buffer value_type_id(@NativeType("spvc_type_id") int value) {
            SpvcReflectedBuiltinResource.nvalue_type_id(address(), value);
            return this;
        }

        public Buffer resource(@NativeType("spvc_reflected_resource") SpvcReflectedResource value) {
            SpvcReflectedBuiltinResource.nresource(address(), value);
            return this;
        }

        public Buffer resource(Consumer<SpvcReflectedResource> consumer) {
            consumer.accept(resource());
            return this;
        }
    }
}
