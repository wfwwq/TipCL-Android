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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHLSLResourceBindingMapping.class
 */
@NativeType("struct spvc_hlsl_resource_binding_mapping")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHLSLResourceBindingMapping.class */
public class SpvcHLSLResourceBindingMapping extends Struct<SpvcHLSLResourceBindingMapping> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int REGISTER_SPACE;
    public static final int REGISTER_BINDING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        REGISTER_SPACE = layout.offsetof(0);
        REGISTER_BINDING = layout.offsetof(1);
    }

    protected SpvcHLSLResourceBindingMapping(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcHLSLResourceBindingMapping create(long address, ByteBuffer container) {
        return new SpvcHLSLResourceBindingMapping(address, container);
    }

    public SpvcHLSLResourceBindingMapping(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned")
    public int register_space() {
        return nregister_space(address());
    }

    @NativeType("unsigned")
    public int register_binding() {
        return nregister_binding(address());
    }

    public SpvcHLSLResourceBindingMapping register_space(@NativeType("unsigned") int value) {
        nregister_space(address(), value);
        return this;
    }

    public SpvcHLSLResourceBindingMapping register_binding(@NativeType("unsigned") int value) {
        nregister_binding(address(), value);
        return this;
    }

    public SpvcHLSLResourceBindingMapping set(int register_space, int register_binding) {
        register_space(register_space);
        register_binding(register_binding);
        return this;
    }

    public SpvcHLSLResourceBindingMapping set(SpvcHLSLResourceBindingMapping src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcHLSLResourceBindingMapping malloc() {
        return new SpvcHLSLResourceBindingMapping(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcHLSLResourceBindingMapping calloc() {
        return new SpvcHLSLResourceBindingMapping(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcHLSLResourceBindingMapping create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcHLSLResourceBindingMapping(MemoryUtil.memAddress(container), container);
    }

    public static SpvcHLSLResourceBindingMapping create(long address) {
        return new SpvcHLSLResourceBindingMapping(address, null);
    }

    public static SpvcHLSLResourceBindingMapping createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcHLSLResourceBindingMapping(address, null);
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

    public static SpvcHLSLResourceBindingMapping malloc(MemoryStack stack) {
        return new SpvcHLSLResourceBindingMapping(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcHLSLResourceBindingMapping calloc(MemoryStack stack) {
        return new SpvcHLSLResourceBindingMapping(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nregister_space(long struct) {
        return MemoryUtil.memGetInt(struct + REGISTER_SPACE);
    }

    public static int nregister_binding(long struct) {
        return MemoryUtil.memGetInt(struct + REGISTER_BINDING);
    }

    public static void nregister_space(long struct, int value) {
        MemoryUtil.memPutInt(struct + REGISTER_SPACE, value);
    }

    public static void nregister_binding(long struct, int value) {
        MemoryUtil.memPutInt(struct + REGISTER_BINDING, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHLSLResourceBindingMapping$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHLSLResourceBindingMapping$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcHLSLResourceBindingMapping, Buffer> implements NativeResource {
        private static final SpvcHLSLResourceBindingMapping ELEMENT_FACTORY = SpvcHLSLResourceBindingMapping.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcHLSLResourceBindingMapping.SIZEOF);
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
        public SpvcHLSLResourceBindingMapping getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned")
        public int register_space() {
            return SpvcHLSLResourceBindingMapping.nregister_space(address());
        }

        @NativeType("unsigned")
        public int register_binding() {
            return SpvcHLSLResourceBindingMapping.nregister_binding(address());
        }

        public Buffer register_space(@NativeType("unsigned") int value) {
            SpvcHLSLResourceBindingMapping.nregister_space(address(), value);
            return this;
        }

        public Buffer register_binding(@NativeType("unsigned") int value) {
            SpvcHLSLResourceBindingMapping.nregister_binding(address(), value);
            return this;
        }
    }
}
