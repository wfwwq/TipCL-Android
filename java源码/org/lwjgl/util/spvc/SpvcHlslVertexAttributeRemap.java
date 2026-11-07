package org.lwjgl.util.spvc;

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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHlslVertexAttributeRemap.class
 */
@NativeType("struct spvc_hlsl_vertex_attribute_remap")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHlslVertexAttributeRemap.class */
public class SpvcHlslVertexAttributeRemap extends Struct<SpvcHlslVertexAttributeRemap> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LOCATION;
    public static final int SEMANTIC;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LOCATION = layout.offsetof(0);
        SEMANTIC = layout.offsetof(1);
    }

    protected SpvcHlslVertexAttributeRemap(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcHlslVertexAttributeRemap create(long address, ByteBuffer container) {
        return new SpvcHlslVertexAttributeRemap(address, container);
    }

    public SpvcHlslVertexAttributeRemap(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned int")
    public int location() {
        return nlocation(address());
    }

    @NativeType("char const *")
    public ByteBuffer semantic() {
        return nsemantic(address());
    }

    @NativeType("char const *")
    public String semanticString() {
        return nsemanticString(address());
    }

    public SpvcHlslVertexAttributeRemap location(@NativeType("unsigned int") int value) {
        nlocation(address(), value);
        return this;
    }

    public SpvcHlslVertexAttributeRemap semantic(@NativeType("char const *") ByteBuffer value) {
        nsemantic(address(), value);
        return this;
    }

    public SpvcHlslVertexAttributeRemap set(int location, ByteBuffer semantic) {
        location(location);
        semantic(semantic);
        return this;
    }

    public SpvcHlslVertexAttributeRemap set(SpvcHlslVertexAttributeRemap src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcHlslVertexAttributeRemap malloc() {
        return new SpvcHlslVertexAttributeRemap(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcHlslVertexAttributeRemap calloc() {
        return new SpvcHlslVertexAttributeRemap(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcHlslVertexAttributeRemap create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcHlslVertexAttributeRemap(MemoryUtil.memAddress(container), container);
    }

    public static SpvcHlslVertexAttributeRemap create(long address) {
        return new SpvcHlslVertexAttributeRemap(address, null);
    }

    public static SpvcHlslVertexAttributeRemap createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcHlslVertexAttributeRemap(address, null);
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

    public static SpvcHlslVertexAttributeRemap malloc(MemoryStack stack) {
        return new SpvcHlslVertexAttributeRemap(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcHlslVertexAttributeRemap calloc(MemoryStack stack) {
        return new SpvcHlslVertexAttributeRemap(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer nsemantic(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + SEMANTIC));
    }

    public static String nsemanticString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + SEMANTIC));
    }

    public static void nlocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOCATION, value);
    }

    public static void nsemantic(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + SEMANTIC, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + SEMANTIC));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHlslVertexAttributeRemap$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHlslVertexAttributeRemap$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcHlslVertexAttributeRemap, Buffer> implements NativeResource {
        private static final SpvcHlslVertexAttributeRemap ELEMENT_FACTORY = SpvcHlslVertexAttributeRemap.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcHlslVertexAttributeRemap.SIZEOF);
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
        public SpvcHlslVertexAttributeRemap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned int")
        public int location() {
            return SpvcHlslVertexAttributeRemap.nlocation(address());
        }

        @NativeType("char const *")
        public ByteBuffer semantic() {
            return SpvcHlslVertexAttributeRemap.nsemantic(address());
        }

        @NativeType("char const *")
        public String semanticString() {
            return SpvcHlslVertexAttributeRemap.nsemanticString(address());
        }

        public Buffer location(@NativeType("unsigned int") int value) {
            SpvcHlslVertexAttributeRemap.nlocation(address(), value);
            return this;
        }

        public Buffer semantic(@NativeType("char const *") ByteBuffer value) {
            SpvcHlslVertexAttributeRemap.nsemantic(address(), value);
            return this;
        }
    }
}
