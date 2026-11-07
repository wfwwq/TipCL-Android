package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Prop_GlyphToScriptMap.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Prop_GlyphToScriptMap.class */
public class FT_Prop_GlyphToScriptMap extends Struct<FT_Prop_GlyphToScriptMap> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FACE;
    public static final int MAP;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FACE = layout.offsetof(0);
        MAP = layout.offsetof(1);
    }

    protected FT_Prop_GlyphToScriptMap(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Prop_GlyphToScriptMap create(long address, ByteBuffer container) {
        return new FT_Prop_GlyphToScriptMap(address, container);
    }

    public FT_Prop_GlyphToScriptMap(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public FT_Face face() {
        return nface(address());
    }

    @NativeType("FT_UShort *")
    public ShortBuffer map(int capacity) {
        return nmap(address(), capacity);
    }

    public static FT_Prop_GlyphToScriptMap create(long address) {
        return new FT_Prop_GlyphToScriptMap(address, null);
    }

    public static FT_Prop_GlyphToScriptMap createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Prop_GlyphToScriptMap(address, null);
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

    public static FT_Face nface(long struct) {
        return FT_Face.create(MemoryUtil.memGetAddress(struct + FACE));
    }

    public static ShortBuffer nmap(long struct, int capacity) {
        return MemoryUtil.memShortBufferSafe(MemoryUtil.memGetAddress(struct + MAP), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Prop_GlyphToScriptMap$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Prop_GlyphToScriptMap$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Prop_GlyphToScriptMap, Buffer> {
        private static final FT_Prop_GlyphToScriptMap ELEMENT_FACTORY = FT_Prop_GlyphToScriptMap.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Prop_GlyphToScriptMap.SIZEOF);
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
        public FT_Prop_GlyphToScriptMap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public FT_Face face() {
            return FT_Prop_GlyphToScriptMap.nface(address());
        }

        @NativeType("FT_UShort *")
        public ShortBuffer map(int capacity) {
            return FT_Prop_GlyphToScriptMap.nmap(address(), capacity);
        }
    }
}
