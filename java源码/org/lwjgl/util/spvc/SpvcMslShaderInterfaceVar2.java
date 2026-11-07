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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslShaderInterfaceVar2.class
 */
@NativeType("struct spvc_msl_shader_interface_var_2")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslShaderInterfaceVar2.class */
public class SpvcMslShaderInterfaceVar2 extends Struct<SpvcMslShaderInterfaceVar2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LOCATION;
    public static final int FORMAT;
    public static final int BUILTIN;
    public static final int VECSIZE;
    public static final int RATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LOCATION = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        BUILTIN = layout.offsetof(2);
        VECSIZE = layout.offsetof(3);
        RATE = layout.offsetof(4);
    }

    protected SpvcMslShaderInterfaceVar2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcMslShaderInterfaceVar2 create(long address, ByteBuffer container) {
        return new SpvcMslShaderInterfaceVar2(address, container);
    }

    public SpvcMslShaderInterfaceVar2(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned")
    public int location() {
        return nlocation(address());
    }

    @NativeType("spvc_msl_shader_variable_format")
    public int format() {
        return nformat(address());
    }

    @NativeType("SpvBuiltIn")
    public int builtin() {
        return nbuiltin(address());
    }

    @NativeType("unsigned")
    public int vecsize() {
        return nvecsize(address());
    }

    @NativeType("spvc_msl_shader_variable_rate")
    public int rate() {
        return nrate(address());
    }

    public SpvcMslShaderInterfaceVar2 location(@NativeType("unsigned") int value) {
        nlocation(address(), value);
        return this;
    }

    public SpvcMslShaderInterfaceVar2 format(@NativeType("spvc_msl_shader_variable_format") int value) {
        nformat(address(), value);
        return this;
    }

    public SpvcMslShaderInterfaceVar2 builtin(@NativeType("SpvBuiltIn") int value) {
        nbuiltin(address(), value);
        return this;
    }

    public SpvcMslShaderInterfaceVar2 vecsize(@NativeType("unsigned") int value) {
        nvecsize(address(), value);
        return this;
    }

    public SpvcMslShaderInterfaceVar2 rate(@NativeType("spvc_msl_shader_variable_rate") int value) {
        nrate(address(), value);
        return this;
    }

    public SpvcMslShaderInterfaceVar2 set(int location, int format, int builtin, int vecsize, int rate) {
        location(location);
        format(format);
        builtin(builtin);
        vecsize(vecsize);
        rate(rate);
        return this;
    }

    public SpvcMslShaderInterfaceVar2 set(SpvcMslShaderInterfaceVar2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcMslShaderInterfaceVar2 malloc() {
        return new SpvcMslShaderInterfaceVar2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcMslShaderInterfaceVar2 calloc() {
        return new SpvcMslShaderInterfaceVar2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcMslShaderInterfaceVar2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcMslShaderInterfaceVar2(MemoryUtil.memAddress(container), container);
    }

    public static SpvcMslShaderInterfaceVar2 create(long address) {
        return new SpvcMslShaderInterfaceVar2(address, null);
    }

    public static SpvcMslShaderInterfaceVar2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcMslShaderInterfaceVar2(address, null);
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

    public static SpvcMslShaderInterfaceVar2 malloc(MemoryStack stack) {
        return new SpvcMslShaderInterfaceVar2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcMslShaderInterfaceVar2 calloc(MemoryStack stack) {
        return new SpvcMslShaderInterfaceVar2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nlocation(long struct) {
        return MemoryUtil.memGetInt(struct + LOCATION);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int nbuiltin(long struct) {
        return MemoryUtil.memGetInt(struct + BUILTIN);
    }

    public static int nvecsize(long struct) {
        return MemoryUtil.memGetInt(struct + VECSIZE);
    }

    public static int nrate(long struct) {
        return MemoryUtil.memGetInt(struct + RATE);
    }

    public static void nlocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOCATION, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void nbuiltin(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUILTIN, value);
    }

    public static void nvecsize(long struct, int value) {
        MemoryUtil.memPutInt(struct + VECSIZE, value);
    }

    public static void nrate(long struct, int value) {
        MemoryUtil.memPutInt(struct + RATE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslShaderInterfaceVar2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslShaderInterfaceVar2$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcMslShaderInterfaceVar2, Buffer> implements NativeResource {
        private static final SpvcMslShaderInterfaceVar2 ELEMENT_FACTORY = SpvcMslShaderInterfaceVar2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcMslShaderInterfaceVar2.SIZEOF);
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
        public SpvcMslShaderInterfaceVar2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned")
        public int location() {
            return SpvcMslShaderInterfaceVar2.nlocation(address());
        }

        @NativeType("spvc_msl_shader_variable_format")
        public int format() {
            return SpvcMslShaderInterfaceVar2.nformat(address());
        }

        @NativeType("SpvBuiltIn")
        public int builtin() {
            return SpvcMslShaderInterfaceVar2.nbuiltin(address());
        }

        @NativeType("unsigned")
        public int vecsize() {
            return SpvcMslShaderInterfaceVar2.nvecsize(address());
        }

        @NativeType("spvc_msl_shader_variable_rate")
        public int rate() {
            return SpvcMslShaderInterfaceVar2.nrate(address());
        }

        public Buffer location(@NativeType("unsigned") int value) {
            SpvcMslShaderInterfaceVar2.nlocation(address(), value);
            return this;
        }

        public Buffer format(@NativeType("spvc_msl_shader_variable_format") int value) {
            SpvcMslShaderInterfaceVar2.nformat(address(), value);
            return this;
        }

        public Buffer builtin(@NativeType("SpvBuiltIn") int value) {
            SpvcMslShaderInterfaceVar2.nbuiltin(address(), value);
            return this;
        }

        public Buffer vecsize(@NativeType("unsigned") int value) {
            SpvcMslShaderInterfaceVar2.nvecsize(address(), value);
            return this;
        }

        public Buffer rate(@NativeType("spvc_msl_shader_variable_rate") int value) {
            SpvcMslShaderInterfaceVar2.nrate(address(), value);
            return this;
        }
    }
}
