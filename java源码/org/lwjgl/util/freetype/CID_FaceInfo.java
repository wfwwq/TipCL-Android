package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.CLongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/CID_FaceInfo.class
 */
@NativeType("struct CID_FaceInfoRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/CID_FaceInfo.class */
public class CID_FaceInfo extends Struct<CID_FaceInfo> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CID_FONT_NAME;
    public static final int CID_VERSION;
    public static final int CID_FONT_TYPE;
    public static final int REGISTRY;
    public static final int ORDERING;
    public static final int SUPPLEMENT;
    public static final int FONT_INFO;
    public static final int FONT_BBOX;
    public static final int UID_BASE;
    public static final int NUM_XUID;
    public static final int XUID;
    public static final int CIDMAP_OFFSET;
    public static final int FD_BYTES;
    public static final int GD_BYTES;
    public static final int CID_COUNT;
    public static final int NUM_DICTS;
    public static final int FONT_DICTS;
    public static final int DATA_OFFSET;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(PS_FontInfo.SIZEOF, PS_FontInfo.ALIGNOF), __member(FT_BBox.SIZEOF, FT_BBox.ALIGNOF), __member(CLONG_SIZE), __member(4), __array(CLONG_SIZE, 16), __member(CLONG_SIZE), __member(4), __member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CID_FONT_NAME = layout.offsetof(0);
        CID_VERSION = layout.offsetof(1);
        CID_FONT_TYPE = layout.offsetof(2);
        REGISTRY = layout.offsetof(3);
        ORDERING = layout.offsetof(4);
        SUPPLEMENT = layout.offsetof(5);
        FONT_INFO = layout.offsetof(6);
        FONT_BBOX = layout.offsetof(7);
        UID_BASE = layout.offsetof(8);
        NUM_XUID = layout.offsetof(9);
        XUID = layout.offsetof(10);
        CIDMAP_OFFSET = layout.offsetof(11);
        FD_BYTES = layout.offsetof(12);
        GD_BYTES = layout.offsetof(13);
        CID_COUNT = layout.offsetof(14);
        NUM_DICTS = layout.offsetof(15);
        FONT_DICTS = layout.offsetof(16);
        DATA_OFFSET = layout.offsetof(17);
    }

    protected CID_FaceInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public CID_FaceInfo create(long address, ByteBuffer container) {
        return new CID_FaceInfo(address, container);
    }

    public CID_FaceInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_String *")
    public ByteBuffer cid_font_name() {
        return ncid_font_name(address());
    }

    @NativeType("FT_String *")
    public String cid_font_nameString() {
        return ncid_font_nameString(address());
    }

    @NativeType("FT_Fixed")
    public long cid_version() {
        return ncid_version(address());
    }

    @NativeType("FT_Int")
    public int cid_font_type() {
        return ncid_font_type(address());
    }

    @NativeType("FT_String *")
    public ByteBuffer registry() {
        return nregistry(address());
    }

    @NativeType("FT_String *")
    public String registryString() {
        return nregistryString(address());
    }

    @NativeType("FT_String *")
    public ByteBuffer ordering() {
        return nordering(address());
    }

    @NativeType("FT_String *")
    public String orderingString() {
        return norderingString(address());
    }

    @NativeType("FT_Int")
    public int supplement() {
        return nsupplement(address());
    }

    @NativeType("PS_FontInfoRec")
    public PS_FontInfo font_info() {
        return nfont_info(address());
    }

    public FT_BBox font_bbox() {
        return nfont_bbox(address());
    }

    @NativeType("FT_ULong")
    public long uid_base() {
        return nuid_base(address());
    }

    @NativeType("FT_Int")
    public int num_xuid() {
        return nnum_xuid(address());
    }

    @NativeType("FT_ULong[16]")
    public CLongBuffer xuid() {
        return nxuid(address());
    }

    @NativeType("FT_ULong")
    public long xuid(int index) {
        return nxuid(address(), index);
    }

    @NativeType("FT_ULong")
    public long cidmap_offset() {
        return ncidmap_offset(address());
    }

    @NativeType("FT_UInt")
    public int fd_bytes() {
        return nfd_bytes(address());
    }

    @NativeType("FT_UInt")
    public int gd_bytes() {
        return ngd_bytes(address());
    }

    @NativeType("FT_ULong")
    public long cid_count() {
        return ncid_count(address());
    }

    @NativeType("FT_UInt")
    public int num_dicts() {
        return nnum_dicts(address());
    }

    public CID_FaceDict font_dicts() {
        return nfont_dicts(address());
    }

    @NativeType("FT_ULong")
    public long data_offset() {
        return ndata_offset(address());
    }

    public static CID_FaceInfo create(long address) {
        return new CID_FaceInfo(address, null);
    }

    public static CID_FaceInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new CID_FaceInfo(address, null);
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

    public static ByteBuffer ncid_font_name(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + CID_FONT_NAME));
    }

    public static String ncid_font_nameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + CID_FONT_NAME));
    }

    public static long ncid_version(long struct) {
        return MemoryUtil.memGetCLong(struct + CID_VERSION);
    }

    public static int ncid_font_type(long struct) {
        return MemoryUtil.memGetInt(struct + CID_FONT_TYPE);
    }

    public static ByteBuffer nregistry(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + REGISTRY));
    }

    public static String nregistryString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + REGISTRY));
    }

    public static ByteBuffer nordering(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + ORDERING));
    }

    public static String norderingString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + ORDERING));
    }

    public static int nsupplement(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPLEMENT);
    }

    public static PS_FontInfo nfont_info(long struct) {
        return PS_FontInfo.create(struct + FONT_INFO);
    }

    public static FT_BBox nfont_bbox(long struct) {
        return FT_BBox.create(struct + FONT_BBOX);
    }

    public static long nuid_base(long struct) {
        return MemoryUtil.memGetCLong(struct + UID_BASE);
    }

    public static int nnum_xuid(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_XUID);
    }

    public static CLongBuffer nxuid(long struct) {
        return MemoryUtil.memCLongBuffer(struct + XUID, 16);
    }

    public static long nxuid(long struct, int index) {
        return MemoryUtil.memGetCLong(struct + XUID + (Checks.check(index, 16) * CLONG_SIZE));
    }

    public static long ncidmap_offset(long struct) {
        return MemoryUtil.memGetCLong(struct + CIDMAP_OFFSET);
    }

    public static int nfd_bytes(long struct) {
        return MemoryUtil.memGetInt(struct + FD_BYTES);
    }

    public static int ngd_bytes(long struct) {
        return MemoryUtil.memGetInt(struct + GD_BYTES);
    }

    public static long ncid_count(long struct) {
        return MemoryUtil.memGetCLong(struct + CID_COUNT);
    }

    public static int nnum_dicts(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_DICTS);
    }

    public static CID_FaceDict nfont_dicts(long struct) {
        return CID_FaceDict.create(MemoryUtil.memGetAddress(struct + FONT_DICTS));
    }

    public static long ndata_offset(long struct) {
        return MemoryUtil.memGetCLong(struct + DATA_OFFSET);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/CID_FaceInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/CID_FaceInfo$Buffer.class */
    public static class Buffer extends StructBuffer<CID_FaceInfo, Buffer> {
        private static final CID_FaceInfo ELEMENT_FACTORY = CID_FaceInfo.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / CID_FaceInfo.SIZEOF);
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
        public CID_FaceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_String *")
        public ByteBuffer cid_font_name() {
            return CID_FaceInfo.ncid_font_name(address());
        }

        @NativeType("FT_String *")
        public String cid_font_nameString() {
            return CID_FaceInfo.ncid_font_nameString(address());
        }

        @NativeType("FT_Fixed")
        public long cid_version() {
            return CID_FaceInfo.ncid_version(address());
        }

        @NativeType("FT_Int")
        public int cid_font_type() {
            return CID_FaceInfo.ncid_font_type(address());
        }

        @NativeType("FT_String *")
        public ByteBuffer registry() {
            return CID_FaceInfo.nregistry(address());
        }

        @NativeType("FT_String *")
        public String registryString() {
            return CID_FaceInfo.nregistryString(address());
        }

        @NativeType("FT_String *")
        public ByteBuffer ordering() {
            return CID_FaceInfo.nordering(address());
        }

        @NativeType("FT_String *")
        public String orderingString() {
            return CID_FaceInfo.norderingString(address());
        }

        @NativeType("FT_Int")
        public int supplement() {
            return CID_FaceInfo.nsupplement(address());
        }

        @NativeType("PS_FontInfoRec")
        public PS_FontInfo font_info() {
            return CID_FaceInfo.nfont_info(address());
        }

        public FT_BBox font_bbox() {
            return CID_FaceInfo.nfont_bbox(address());
        }

        @NativeType("FT_ULong")
        public long uid_base() {
            return CID_FaceInfo.nuid_base(address());
        }

        @NativeType("FT_Int")
        public int num_xuid() {
            return CID_FaceInfo.nnum_xuid(address());
        }

        @NativeType("FT_ULong[16]")
        public CLongBuffer xuid() {
            return CID_FaceInfo.nxuid(address());
        }

        @NativeType("FT_ULong")
        public long xuid(int index) {
            return CID_FaceInfo.nxuid(address(), index);
        }

        @NativeType("FT_ULong")
        public long cidmap_offset() {
            return CID_FaceInfo.ncidmap_offset(address());
        }

        @NativeType("FT_UInt")
        public int fd_bytes() {
            return CID_FaceInfo.nfd_bytes(address());
        }

        @NativeType("FT_UInt")
        public int gd_bytes() {
            return CID_FaceInfo.ngd_bytes(address());
        }

        @NativeType("FT_ULong")
        public long cid_count() {
            return CID_FaceInfo.ncid_count(address());
        }

        @NativeType("FT_UInt")
        public int num_dicts() {
            return CID_FaceInfo.nnum_dicts(address());
        }

        public CID_FaceDict font_dicts() {
            return CID_FaceInfo.nfont_dicts(address());
        }

        @NativeType("FT_ULong")
        public long data_offset() {
            return CID_FaceInfo.ndata_offset(address());
        }
    }
}
