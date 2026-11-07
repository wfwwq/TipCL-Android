package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spv_parsed_header_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVParsedHeader.class */
public class SPVParsedHeader extends Struct<SPVParsedHeader> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MAGIC;
    public static final int VERSION;
    public static final int GENERATOR;
    public static final int BOUND;
    public static final int RESERVED;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MAGIC = layout.offsetof(0);
        VERSION = layout.offsetof(1);
        GENERATOR = layout.offsetof(2);
        BOUND = layout.offsetof(3);
        RESERVED = layout.offsetof(4);
    }

    protected SPVParsedHeader(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SPVParsedHeader create(long address, ByteBuffer container) {
        return new SPVParsedHeader(address, container);
    }

    public SPVParsedHeader(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int magic() {
        return nmagic(address());
    }

    @NativeType("uint32_t")
    public int version() {
        return nversion(address());
    }

    @NativeType("uint32_t")
    public int generator() {
        return ngenerator(address());
    }

    @NativeType("uint32_t")
    public int bound() {
        return nbound(address());
    }

    public static SPVParsedHeader create(long address) {
        return new SPVParsedHeader(address, null);
    }

    public static SPVParsedHeader createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SPVParsedHeader(address, null);
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

    public static int nmagic(long struct) {
        return MemoryUtil.memGetInt(struct + MAGIC);
    }

    public static int nversion(long struct) {
        return MemoryUtil.memGetInt(struct + VERSION);
    }

    public static int ngenerator(long struct) {
        return MemoryUtil.memGetInt(struct + GENERATOR);
    }

    public static int nbound(long struct) {
        return MemoryUtil.memGetInt(struct + BOUND);
    }

    public static int nreserved(long struct) {
        return MemoryUtil.memGetInt(struct + RESERVED);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVParsedHeader$Buffer.class */
    public static class Buffer extends StructBuffer<SPVParsedHeader, Buffer> {
        private static final SPVParsedHeader ELEMENT_FACTORY = SPVParsedHeader.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SPVParsedHeader.SIZEOF);
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
        public SPVParsedHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int magic() {
            return SPVParsedHeader.nmagic(address());
        }

        @NativeType("uint32_t")
        public int version() {
            return SPVParsedHeader.nversion(address());
        }

        @NativeType("uint32_t")
        public int generator() {
            return SPVParsedHeader.ngenerator(address());
        }

        @NativeType("uint32_t")
        public int bound() {
            return SPVParsedHeader.nbound(address());
        }
    }
}
