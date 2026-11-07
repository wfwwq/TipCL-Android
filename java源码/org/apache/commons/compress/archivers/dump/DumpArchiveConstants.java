package org.apache.commons.compress.archivers.dump;

/* loaded from: classes24.dex */
public final class DumpArchiveConstants {
    public static final int CHECKSUM = 84446;
    public static final int FS_UFS2_MAGIC = 424935705;
    public static final int HIGH_DENSITY_NTREC = 32;
    public static final int LBLSIZE = 16;
    public static final int NAMELEN = 64;
    public static final int NFS_MAGIC = 60012;
    public static final int NTREC = 10;
    public static final int OFS_MAGIC = 60011;
    public static final int TP_SIZE = 1024;

    public enum COMPRESSION_TYPE {
        UNKNOWN(-1),
        ZLIB(0),
        BZLIB(1),
        LZO(2);

        final int code;

        public static COMPRESSION_TYPE find(int code) {
            for (COMPRESSION_TYPE t : values()) {
                if (t.code == code) {
                    return t;
                }
            }
            return UNKNOWN;
        }

        COMPRESSION_TYPE(int code) {
            this.code = code;
        }
    }

    public enum SEGMENT_TYPE {
        TAPE(1),
        INODE(2),
        BITS(3),
        ADDR(4),
        END(5),
        CLRI(6);

        final int code;

        public static SEGMENT_TYPE find(int code) {
            for (SEGMENT_TYPE t : values()) {
                if (t.code == code) {
                    return t;
                }
            }
            return null;
        }

        SEGMENT_TYPE(int code) {
            this.code = code;
        }
    }

    private DumpArchiveConstants() {
    }
}
