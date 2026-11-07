package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_MaxProfile.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_MaxProfile.class */
public class TT_MaxProfile extends Struct<TT_MaxProfile> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERSION;
    public static final int NUMGLYPHS;
    public static final int MAXPOINTS;
    public static final int MAXCONTOURS;
    public static final int MAXCOMPOSITEPOINTS;
    public static final int MAXCOMPOSITECONTOURS;
    public static final int MAXZONES;
    public static final int MAXTWILIGHTPOINTS;
    public static final int MAXSTORAGE;
    public static final int MAXFUNCTIONDEFS;
    public static final int MAXINSTRUCTIONDEFS;
    public static final int MAXSTACKELEMENTS;
    public static final int MAXSIZEOFINSTRUCTIONS;
    public static final int MAXCOMPONENTELEMENTS;
    public static final int MAXCOMPONENTDEPTH;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VERSION = layout.offsetof(0);
        NUMGLYPHS = layout.offsetof(1);
        MAXPOINTS = layout.offsetof(2);
        MAXCONTOURS = layout.offsetof(3);
        MAXCOMPOSITEPOINTS = layout.offsetof(4);
        MAXCOMPOSITECONTOURS = layout.offsetof(5);
        MAXZONES = layout.offsetof(6);
        MAXTWILIGHTPOINTS = layout.offsetof(7);
        MAXSTORAGE = layout.offsetof(8);
        MAXFUNCTIONDEFS = layout.offsetof(9);
        MAXINSTRUCTIONDEFS = layout.offsetof(10);
        MAXSTACKELEMENTS = layout.offsetof(11);
        MAXSIZEOFINSTRUCTIONS = layout.offsetof(12);
        MAXCOMPONENTELEMENTS = layout.offsetof(13);
        MAXCOMPONENTDEPTH = layout.offsetof(14);
    }

    protected TT_MaxProfile(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public TT_MaxProfile create(long address, ByteBuffer container) {
        return new TT_MaxProfile(address, container);
    }

    public TT_MaxProfile(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Fixed")
    public long version() {
        return nversion(address());
    }

    @NativeType("FT_UShort")
    public short numGlyphs() {
        return nnumGlyphs(address());
    }

    @NativeType("FT_UShort")
    public short maxPoints() {
        return nmaxPoints(address());
    }

    @NativeType("FT_UShort")
    public short maxContours() {
        return nmaxContours(address());
    }

    @NativeType("FT_UShort")
    public short maxCompositePoints() {
        return nmaxCompositePoints(address());
    }

    @NativeType("FT_UShort")
    public short maxCompositeContours() {
        return nmaxCompositeContours(address());
    }

    @NativeType("FT_UShort")
    public short maxZones() {
        return nmaxZones(address());
    }

    @NativeType("FT_UShort")
    public short maxTwilightPoints() {
        return nmaxTwilightPoints(address());
    }

    @NativeType("FT_UShort")
    public short maxStorage() {
        return nmaxStorage(address());
    }

    @NativeType("FT_UShort")
    public short maxFunctionDefs() {
        return nmaxFunctionDefs(address());
    }

    @NativeType("FT_UShort")
    public short maxInstructionDefs() {
        return nmaxInstructionDefs(address());
    }

    @NativeType("FT_UShort")
    public short maxStackElements() {
        return nmaxStackElements(address());
    }

    @NativeType("FT_UShort")
    public short maxSizeOfInstructions() {
        return nmaxSizeOfInstructions(address());
    }

    @NativeType("FT_UShort")
    public short maxComponentElements() {
        return nmaxComponentElements(address());
    }

    @NativeType("FT_UShort")
    public short maxComponentDepth() {
        return nmaxComponentDepth(address());
    }

    public static TT_MaxProfile create(long address) {
        return new TT_MaxProfile(address, null);
    }

    public static TT_MaxProfile createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new TT_MaxProfile(address, null);
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

    public static long nversion(long struct) {
        return MemoryUtil.memGetCLong(struct + VERSION);
    }

    public static short nnumGlyphs(long struct) {
        return MemoryUtil.memGetShort(struct + NUMGLYPHS);
    }

    public static short nmaxPoints(long struct) {
        return MemoryUtil.memGetShort(struct + MAXPOINTS);
    }

    public static short nmaxContours(long struct) {
        return MemoryUtil.memGetShort(struct + MAXCONTOURS);
    }

    public static short nmaxCompositePoints(long struct) {
        return MemoryUtil.memGetShort(struct + MAXCOMPOSITEPOINTS);
    }

    public static short nmaxCompositeContours(long struct) {
        return MemoryUtil.memGetShort(struct + MAXCOMPOSITECONTOURS);
    }

    public static short nmaxZones(long struct) {
        return MemoryUtil.memGetShort(struct + MAXZONES);
    }

    public static short nmaxTwilightPoints(long struct) {
        return MemoryUtil.memGetShort(struct + MAXTWILIGHTPOINTS);
    }

    public static short nmaxStorage(long struct) {
        return MemoryUtil.memGetShort(struct + MAXSTORAGE);
    }

    public static short nmaxFunctionDefs(long struct) {
        return MemoryUtil.memGetShort(struct + MAXFUNCTIONDEFS);
    }

    public static short nmaxInstructionDefs(long struct) {
        return MemoryUtil.memGetShort(struct + MAXINSTRUCTIONDEFS);
    }

    public static short nmaxStackElements(long struct) {
        return MemoryUtil.memGetShort(struct + MAXSTACKELEMENTS);
    }

    public static short nmaxSizeOfInstructions(long struct) {
        return MemoryUtil.memGetShort(struct + MAXSIZEOFINSTRUCTIONS);
    }

    public static short nmaxComponentElements(long struct) {
        return MemoryUtil.memGetShort(struct + MAXCOMPONENTELEMENTS);
    }

    public static short nmaxComponentDepth(long struct) {
        return MemoryUtil.memGetShort(struct + MAXCOMPONENTDEPTH);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_MaxProfile$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_MaxProfile$Buffer.class */
    public static class Buffer extends StructBuffer<TT_MaxProfile, Buffer> {
        private static final TT_MaxProfile ELEMENT_FACTORY = TT_MaxProfile.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / TT_MaxProfile.SIZEOF);
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
        public TT_MaxProfile getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Fixed")
        public long version() {
            return TT_MaxProfile.nversion(address());
        }

        @NativeType("FT_UShort")
        public short numGlyphs() {
            return TT_MaxProfile.nnumGlyphs(address());
        }

        @NativeType("FT_UShort")
        public short maxPoints() {
            return TT_MaxProfile.nmaxPoints(address());
        }

        @NativeType("FT_UShort")
        public short maxContours() {
            return TT_MaxProfile.nmaxContours(address());
        }

        @NativeType("FT_UShort")
        public short maxCompositePoints() {
            return TT_MaxProfile.nmaxCompositePoints(address());
        }

        @NativeType("FT_UShort")
        public short maxCompositeContours() {
            return TT_MaxProfile.nmaxCompositeContours(address());
        }

        @NativeType("FT_UShort")
        public short maxZones() {
            return TT_MaxProfile.nmaxZones(address());
        }

        @NativeType("FT_UShort")
        public short maxTwilightPoints() {
            return TT_MaxProfile.nmaxTwilightPoints(address());
        }

        @NativeType("FT_UShort")
        public short maxStorage() {
            return TT_MaxProfile.nmaxStorage(address());
        }

        @NativeType("FT_UShort")
        public short maxFunctionDefs() {
            return TT_MaxProfile.nmaxFunctionDefs(address());
        }

        @NativeType("FT_UShort")
        public short maxInstructionDefs() {
            return TT_MaxProfile.nmaxInstructionDefs(address());
        }

        @NativeType("FT_UShort")
        public short maxStackElements() {
            return TT_MaxProfile.nmaxStackElements(address());
        }

        @NativeType("FT_UShort")
        public short maxSizeOfInstructions() {
            return TT_MaxProfile.nmaxSizeOfInstructions(address());
        }

        @NativeType("FT_UShort")
        public short maxComponentElements() {
            return TT_MaxProfile.nmaxComponentElements(address());
        }

        @NativeType("FT_UShort")
        public short maxComponentDepth() {
            return TT_MaxProfile.nmaxComponentDepth(address());
        }
    }
}
