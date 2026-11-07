package org.apache.commons.compress.archivers.zip;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.ByteUtils;
import org.apache.commons.compress.utils.CharsetNames;
import org.lwjgl.system.windows.User32;

/* loaded from: classes24.dex */
public class ZipArchiveOutputStream extends ArchiveOutputStream<ZipArchiveEntry> {
    static final int BUFFER_SIZE = 512;
    private static final int CFH_COMMENT_LENGTH_OFFSET = 32;
    private static final int CFH_COMPRESSED_SIZE_OFFSET = 20;
    private static final int CFH_CRC_OFFSET = 16;
    private static final int CFH_DISK_NUMBER_OFFSET = 34;
    private static final int CFH_EXTERNAL_ATTRIBUTES_OFFSET = 38;
    private static final int CFH_EXTRA_LENGTH_OFFSET = 30;
    private static final int CFH_FILENAME_LENGTH_OFFSET = 28;
    private static final int CFH_FILENAME_OFFSET = 46;
    private static final int CFH_GPB_OFFSET = 8;
    private static final int CFH_INTERNAL_ATTRIBUTES_OFFSET = 36;
    private static final int CFH_LFH_OFFSET = 42;
    private static final int CFH_METHOD_OFFSET = 10;
    private static final int CFH_ORIGINAL_SIZE_OFFSET = 24;
    private static final int CFH_SIG_OFFSET = 0;
    private static final int CFH_TIME_OFFSET = 12;
    private static final int CFH_VERSION_MADE_BY_OFFSET = 4;
    private static final int CFH_VERSION_NEEDED_OFFSET = 6;
    public static final int DEFAULT_COMPRESSION = -1;
    public static final int DEFLATED = 8;

    @Deprecated
    public static final int EFS_FLAG = 2048;
    private static final int LFH_COMPRESSED_SIZE_OFFSET = 18;
    private static final int LFH_CRC_OFFSET = 14;
    private static final int LFH_EXTRA_LENGTH_OFFSET = 28;
    private static final int LFH_FILENAME_LENGTH_OFFSET = 26;
    private static final int LFH_FILENAME_OFFSET = 30;
    private static final int LFH_GPB_OFFSET = 6;
    private static final int LFH_METHOD_OFFSET = 8;
    private static final int LFH_ORIGINAL_SIZE_OFFSET = 22;
    private static final int LFH_SIG_OFFSET = 0;
    private static final int LFH_TIME_OFFSET = 10;
    private static final int LFH_VERSION_NEEDED_OFFSET = 4;
    public static final int STORED = 0;
    private long cdDiskNumberStart;
    private long cdLength;
    private long cdOffset;
    private String charsetName;
    private String comment;
    private final byte[] copyBuffer;
    private UnicodeExtraFieldPolicy createUnicodeExtraFields;
    protected final Deflater def;
    private final List<ZipArchiveEntry> entries;
    private CurrentEntry entry;
    private long eocdLength;
    private boolean fallbackToUTF8;
    protected boolean finished;
    private boolean hasCompressionLevelChanged;
    private boolean hasUsedZip64;
    private final boolean isSplitZip;
    private int level;
    private final Map<ZipArchiveEntry, EntryMetaData> metaData;
    private int method;
    private final Map<Integer, Integer> numberOfCDInDiskData;
    private final OutputStream outputStream;
    private final StreamCompressor streamCompressor;
    private boolean useUTF8Flag;
    private Zip64Mode zip64Mode;
    private ZipEncoding zipEncoding;
    static final String DEFAULT_ENCODING = CharsetNames.UTF_8;
    private static final byte[] ZERO = {0, 0};
    private static final byte[] LZERO = {0, 0, 0, 0};
    private static final byte[] ONE = ZipLong.getBytes(1);
    static final byte[] LFH_SIG = ZipLong.LFH_SIG.getBytes();
    static final byte[] DD_SIG = ZipLong.DD_SIG.getBytes();
    static final byte[] CFH_SIG = ZipLong.CFH_SIG.getBytes();
    static final byte[] EOCD_SIG = ZipLong.getBytes(101010256);
    static final byte[] ZIP64_EOCD_SIG = ZipLong.getBytes(101075792);
    static final byte[] ZIP64_EOCD_LOC_SIG = ZipLong.getBytes(117853008);

    private static final class CurrentEntry {
        private long bytesRead;
        private boolean causedUseOfZip64;
        private long dataStart;
        private final ZipArchiveEntry entry;
        private boolean hasWritten;
        private long localDataStart;

        private CurrentEntry(ZipArchiveEntry entry) {
            this.entry = entry;
        }
    }

    private static final class EntryMetaData {
        private final long offset;
        private final boolean usesDataDescriptor;

        private EntryMetaData(long offset, boolean usesDataDescriptor) {
            this.offset = offset;
            this.usesDataDescriptor = usesDataDescriptor;
        }
    }

    public static final class UnicodeExtraFieldPolicy {
        public static final UnicodeExtraFieldPolicy ALWAYS = new UnicodeExtraFieldPolicy("always");
        public static final UnicodeExtraFieldPolicy NEVER = new UnicodeExtraFieldPolicy("never");
        public static final UnicodeExtraFieldPolicy NOT_ENCODEABLE = new UnicodeExtraFieldPolicy("not encodeable");
        private final String name;

        private UnicodeExtraFieldPolicy(String n) {
            this.name = n;
        }

        public String toString() {
            return this.name;
        }
    }

    public ZipArchiveOutputStream(File file) throws IOException {
        this(file.toPath(), new OpenOption[0]);
    }

    public ZipArchiveOutputStream(File file, long zipSplitSize) throws IOException {
        this(file.toPath(), zipSplitSize);
    }

    public ZipArchiveOutputStream(OutputStream out) {
        this.comment = "";
        this.level = -1;
        this.method = 8;
        this.entries = new LinkedList();
        this.metaData = new HashMap();
        this.charsetName = DEFAULT_ENCODING;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(DEFAULT_ENCODING);
        this.useUTF8Flag = true;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.numberOfCDInDiskData = new HashMap();
        this.outputStream = out;
        this.def = new Deflater(this.level, true);
        this.streamCompressor = StreamCompressor.create(out, this.def);
        this.isSplitZip = false;
    }

    public ZipArchiveOutputStream(Path path, long zipSplitSize) throws IOException {
        this.comment = "";
        this.level = -1;
        this.method = 8;
        this.entries = new LinkedList();
        this.metaData = new HashMap();
        this.charsetName = DEFAULT_ENCODING;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(DEFAULT_ENCODING);
        this.useUTF8Flag = true;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.numberOfCDInDiskData = new HashMap();
        this.def = new Deflater(this.level, true);
        this.outputStream = new ZipSplitOutputStream(path, zipSplitSize);
        this.streamCompressor = StreamCompressor.create(this.outputStream, this.def);
        this.isSplitZip = true;
    }

    public ZipArchiveOutputStream(Path file, OpenOption... options) throws IOException {
        this.comment = "";
        this.level = -1;
        this.method = 8;
        this.entries = new LinkedList();
        this.metaData = new HashMap();
        this.charsetName = DEFAULT_ENCODING;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(DEFAULT_ENCODING);
        this.useUTF8Flag = true;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.numberOfCDInDiskData = new HashMap();
        this.def = new Deflater(this.level, true);
        this.outputStream = options.length == 0 ? new FileRandomAccessOutputStream(file) : new FileRandomAccessOutputStream(file, options);
        this.streamCompressor = StreamCompressor.create(this.outputStream, this.def);
        this.isSplitZip = false;
    }

    public ZipArchiveOutputStream(SeekableByteChannel channel) {
        this.comment = "";
        this.level = -1;
        this.method = 8;
        this.entries = new LinkedList();
        this.metaData = new HashMap();
        this.charsetName = DEFAULT_ENCODING;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(DEFAULT_ENCODING);
        this.useUTF8Flag = true;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.numberOfCDInDiskData = new HashMap();
        this.outputStream = new SeekableChannelRandomAccessOutputStream(channel);
        this.def = new Deflater(this.level, true);
        this.streamCompressor = StreamCompressor.create(this.outputStream, this.def);
        this.isSplitZip = false;
    }

    public void addRawArchiveEntry(ZipArchiveEntry entry, InputStream rawStream) throws IOException {
        ZipArchiveEntry ae = new ZipArchiveEntry(entry);
        if (hasZip64Extra(ae)) {
            ae.removeExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        }
        boolean is2PhaseSource = (ae.getCrc() == -1 || ae.getSize() == -1 || ae.getCompressedSize() == -1) ? false : true;
        putArchiveEntry(ae, is2PhaseSource);
        copyFromZipInputStream(rawStream);
        closeCopiedEntry(is2PhaseSource);
    }

    private void addUnicodeExtraFields(ZipArchiveEntry ze, boolean encodable, ByteBuffer name) throws IOException {
        if (this.createUnicodeExtraFields == UnicodeExtraFieldPolicy.ALWAYS || !encodable) {
            ze.addExtraField(new UnicodePathExtraField(ze.getName(), name.array(), name.arrayOffset(), name.limit() - name.position()));
        }
        String comm = ze.getComment();
        if (comm != null && !comm.isEmpty()) {
            boolean commentEncodable = this.zipEncoding.canEncode(comm);
            if (this.createUnicodeExtraFields == UnicodeExtraFieldPolicy.ALWAYS || !commentEncodable) {
                ByteBuffer commentB = getEntryEncoding(ze).encode(comm);
                ze.addExtraField(new UnicodeCommentExtraField(comm, commentB.array(), commentB.arrayOffset(), commentB.limit() - commentB.position()));
            }
        }
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public boolean canWriteEntryData(ArchiveEntry ae) {
        if (!(ae instanceof ZipArchiveEntry)) {
            return false;
        }
        ZipArchiveEntry zae = (ZipArchiveEntry) ae;
        return (zae.getMethod() == ZipMethod.IMPLODING.getCode() || zae.getMethod() == ZipMethod.UNSHRINKING.getCode() || !ZipUtil.canHandleEntryData(zae)) ? false : true;
    }

    private boolean checkIfNeedsZip64(Zip64Mode effectiveMode) throws ZipException {
        boolean actuallyNeedsZip64 = isZip64Required(this.entry.entry, effectiveMode);
        if (actuallyNeedsZip64 && effectiveMode == Zip64Mode.Never) {
            throw new Zip64RequiredException(Zip64RequiredException.getEntryTooBigMessage(this.entry.entry));
        }
        return actuallyNeedsZip64;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.finished) {
                finish();
            }
        } finally {
            destroy();
        }
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void closeArchiveEntry() throws IOException {
        preClose();
        flushDeflater();
        long bytesWritten = this.streamCompressor.getTotalBytesWritten() - this.entry.dataStart;
        long realCrc = this.streamCompressor.getCrc32();
        this.entry.bytesRead = this.streamCompressor.getBytesRead();
        Zip64Mode effectiveMode = getEffectiveZip64Mode(this.entry.entry);
        boolean actuallyNeedsZip64 = handleSizesAndCrc(bytesWritten, realCrc, effectiveMode);
        closeEntry(actuallyNeedsZip64, false);
        this.streamCompressor.reset();
    }

    private void closeCopiedEntry(boolean phased) throws IOException {
        preClose();
        this.entry.bytesRead = this.entry.entry.getSize();
        Zip64Mode effectiveMode = getEffectiveZip64Mode(this.entry.entry);
        boolean actuallyNeedsZip64 = checkIfNeedsZip64(effectiveMode);
        closeEntry(actuallyNeedsZip64, phased);
    }

    private void closeEntry(boolean actuallyNeedsZip64, boolean phased) throws IOException {
        if (!phased && (this.outputStream instanceof RandomAccessOutputStream)) {
            rewriteSizesAndCrc(actuallyNeedsZip64);
        }
        if (!phased) {
            writeDataDescriptor(this.entry.entry);
        }
        this.entry = null;
    }

    private void copyFromZipInputStream(InputStream src) throws IOException {
        if (this.entry != null) {
            ZipUtil.checkRequestedFeatures(this.entry.entry);
            this.entry.hasWritten = true;
            while (true) {
                int length = src.read(this.copyBuffer);
                if (length >= 0) {
                    this.streamCompressor.writeCounted(this.copyBuffer, 0, length);
                    count(length);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("No current entry");
        }
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ZipArchiveEntry createArchiveEntry(File inputFile, String entryName) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new ZipArchiveEntry(inputFile, entryName);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ZipArchiveEntry createArchiveEntry(Path inputPath, String entryName, LinkOption... options) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new ZipArchiveEntry(inputPath, entryName, new LinkOption[0]);
    }

    private byte[] createCentralFileHeader(ZipArchiveEntry ze) throws IOException {
        EntryMetaData entryMetaData = this.metaData.get(ze);
        boolean needsZip64Extra = hasZip64Extra(ze) || ze.getCompressedSize() >= 4294967295L || ze.getSize() >= 4294967295L || entryMetaData.offset >= 4294967295L || ze.getDiskNumberStart() >= User32.HWND_BROADCAST || this.zip64Mode == Zip64Mode.Always || this.zip64Mode == Zip64Mode.AlwaysWithCompatibility;
        if (!needsZip64Extra || this.zip64Mode != Zip64Mode.Never) {
            handleZip64Extra(ze, entryMetaData.offset, needsZip64Extra);
            return createCentralFileHeader(ze, getName(ze), entryMetaData, needsZip64Extra);
        }
        throw new Zip64RequiredException("Archive's size exceeds the limit of 4GByte.");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r22, java.nio.ByteBuffer r23, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData r24, boolean r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$EntryMetaData, boolean):byte[]");
    }

    private byte[] createLocalFileHeader(ZipArchiveEntry ze, ByteBuffer name, boolean encodable, boolean phased, long archiveOffset) {
        ZipExtraField oldEx = ze.getExtraField(ResourceAlignmentExtraField.ID);
        if (oldEx != null) {
            ze.removeExtraField(ResourceAlignmentExtraField.ID);
        }
        ResourceAlignmentExtraField oldAlignmentEx = oldEx instanceof ResourceAlignmentExtraField ? (ResourceAlignmentExtraField) oldEx : null;
        int alignment = ze.getAlignment();
        if (alignment <= 0 && oldAlignmentEx != null) {
            alignment = oldAlignmentEx.getAlignment();
        }
        if (alignment > 1 || (oldAlignmentEx != null && !oldAlignmentEx.allowMethodChange())) {
            int oldLength = ((name.limit() + 30) - name.position()) + ze.getLocalFileDataExtra().length;
            int padding = (int) (((((-archiveOffset) - oldLength) - 4) - 2) & (alignment - 1));
            ze.addExtraField(new ResourceAlignmentExtraField(alignment, oldAlignmentEx != null && oldAlignmentEx.allowMethodChange(), padding));
        }
        byte[] extra = ze.getLocalFileDataExtra();
        int nameLen = name.limit() - name.position();
        int len = nameLen + 30 + extra.length;
        byte[] buf = new byte[len];
        System.arraycopy(LFH_SIG, 0, buf, 0, 4);
        int zipMethod = ze.getMethod();
        boolean dataDescriptor = usesDataDescriptor(zipMethod, phased);
        ZipShort.putShort(versionNeededToExtract(zipMethod, hasZip64Extra(ze), dataDescriptor), buf, 4);
        GeneralPurposeBit generalPurposeBit = getGeneralPurposeBits(!encodable && this.fallbackToUTF8, dataDescriptor);
        generalPurposeBit.encode(buf, 6);
        ZipShort.putShort(zipMethod, buf, 8);
        ZipUtil.toDosTime(ze.getTime(), buf, 10);
        if (phased || (zipMethod != 8 && !(this.outputStream instanceof RandomAccessOutputStream))) {
            ZipLong.putLong(ze.getCrc(), buf, 14);
        } else {
            System.arraycopy(LZERO, 0, buf, 14, 4);
        }
        if (hasZip64Extra(this.entry.entry)) {
            ZipLong.ZIP64_MAGIC.putLong(buf, 18);
            ZipLong.ZIP64_MAGIC.putLong(buf, 22);
        } else if (!phased) {
            if (zipMethod == 8 || (this.outputStream instanceof RandomAccessOutputStream)) {
                System.arraycopy(LZERO, 0, buf, 18, 4);
                System.arraycopy(LZERO, 0, buf, 22, 4);
            } else {
                ZipLong.putLong(ze.getSize(), buf, 18);
                ZipLong.putLong(ze.getSize(), buf, 22);
            }
        } else {
            ZipLong.putLong(ze.getCompressedSize(), buf, 18);
            ZipLong.putLong(ze.getSize(), buf, 22);
        }
        ZipShort.putShort(nameLen, buf, 26);
        ZipShort.putShort(extra.length, buf, 28);
        System.arraycopy(name.array(), name.arrayOffset(), buf, 30, nameLen);
        System.arraycopy(extra, 0, buf, nameLen + 30, extra.length);
        return buf;
    }

    protected final void deflate() throws IOException {
        this.streamCompressor.deflate();
    }

    void destroy() throws IOException {
        if (this.outputStream != null) {
            this.outputStream.close();
        }
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws IOException, IllegalArgumentException {
        if (this.finished) {
            throw new IOException("This archive has already been finished");
        }
        if (this.entry != null) {
            throw new IOException("This archive contains unclosed entries.");
        }
        long cdOverallOffset = this.streamCompressor.getTotalBytesWritten();
        this.cdOffset = cdOverallOffset;
        if (this.isSplitZip) {
            ZipSplitOutputStream zipSplitOutputStream = (ZipSplitOutputStream) this.outputStream;
            this.cdOffset = zipSplitOutputStream.getCurrentSplitSegmentBytesWritten();
            this.cdDiskNumberStart = zipSplitOutputStream.getCurrentSplitSegmentIndex();
        }
        writeCentralDirectoryInChunks();
        this.cdLength = this.streamCompressor.getTotalBytesWritten() - cdOverallOffset;
        ByteBuffer commentData = this.zipEncoding.encode(this.comment);
        long commentLength = commentData.limit() - commentData.position();
        this.eocdLength = 22 + commentLength;
        writeZip64CentralDirectory();
        writeCentralDirectoryEnd();
        this.metaData.clear();
        this.entries.clear();
        this.streamCompressor.close();
        if (this.isSplitZip) {
            this.outputStream.close();
        }
        this.finished = true;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (this.outputStream != null) {
            this.outputStream.flush();
        }
    }

    private void flushDeflater() throws IOException {
        if (this.entry.entry.getMethod() == 8) {
            this.streamCompressor.flushDeflater();
        }
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public long getBytesWritten() {
        return this.streamCompressor.getTotalBytesWritten();
    }

    private Zip64Mode getEffectiveZip64Mode(ZipArchiveEntry ze) {
        if (this.zip64Mode != Zip64Mode.AsNeeded || (this.outputStream instanceof RandomAccessOutputStream) || ze.getMethod() != 8 || ze.getSize() != -1) {
            return this.zip64Mode;
        }
        return Zip64Mode.Never;
    }

    public String getEncoding() {
        return this.charsetName;
    }

    private ZipEncoding getEntryEncoding(ZipArchiveEntry ze) {
        boolean encodable = this.zipEncoding.canEncode(ze.getName());
        return (encodable || !this.fallbackToUTF8) ? this.zipEncoding : ZipEncodingHelper.ZIP_ENCODING_UTF_8;
    }

    private GeneralPurposeBit getGeneralPurposeBits(boolean utfFallback, boolean usesDataDescriptor) {
        GeneralPurposeBit b = new GeneralPurposeBit();
        b.useUTF8ForNames(this.useUTF8Flag || utfFallback);
        if (usesDataDescriptor) {
            b.useDataDescriptor(true);
        }
        return b;
    }

    private ByteBuffer getName(ZipArchiveEntry ze) throws IOException {
        return getEntryEncoding(ze).encode(ze.getName());
    }

    private Zip64ExtendedInformationExtraField getZip64Extra(ZipArchiveEntry ze) {
        if (this.entry != null) {
            this.entry.causedUseOfZip64 = !this.hasUsedZip64;
        }
        this.hasUsedZip64 = true;
        ZipExtraField extra = ze.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        Zip64ExtendedInformationExtraField z64 = extra instanceof Zip64ExtendedInformationExtraField ? (Zip64ExtendedInformationExtraField) extra : null;
        if (z64 == null) {
            z64 = new Zip64ExtendedInformationExtraField();
        }
        ze.addAsFirstExtraField(z64);
        return z64;
    }

    private boolean handleSizesAndCrc(long bytesWritten, long crc, Zip64Mode effectiveMode) throws ZipException {
        if (this.entry.entry.getMethod() == 8) {
            this.entry.entry.setSize(this.entry.bytesRead);
            this.entry.entry.setCompressedSize(bytesWritten);
            this.entry.entry.setCrc(crc);
        } else if (this.outputStream instanceof RandomAccessOutputStream) {
            this.entry.entry.setSize(bytesWritten);
            this.entry.entry.setCompressedSize(bytesWritten);
            this.entry.entry.setCrc(crc);
        } else {
            if (this.entry.entry.getCrc() != crc) {
                throw new ZipException("Bad CRC checksum for entry " + this.entry.entry.getName() + ": " + Long.toHexString(this.entry.entry.getCrc()) + " instead of " + Long.toHexString(crc));
            }
            if (this.entry.entry.getSize() != bytesWritten) {
                throw new ZipException("Bad size for entry " + this.entry.entry.getName() + ": " + this.entry.entry.getSize() + " instead of " + bytesWritten);
            }
        }
        return checkIfNeedsZip64(effectiveMode);
    }

    private void handleZip64Extra(ZipArchiveEntry ze, long lfhOffset, boolean needsZip64Extra) {
        if (needsZip64Extra) {
            Zip64ExtendedInformationExtraField z64 = getZip64Extra(ze);
            if (ze.getCompressedSize() >= 4294967295L || ze.getSize() >= 4294967295L || this.zip64Mode == Zip64Mode.Always || this.zip64Mode == Zip64Mode.AlwaysWithCompatibility) {
                z64.setCompressedSize(new ZipEightByteInteger(ze.getCompressedSize()));
                z64.setSize(new ZipEightByteInteger(ze.getSize()));
            } else {
                z64.setCompressedSize(null);
                z64.setSize(null);
            }
            boolean needsToEncodeLfhOffset = lfhOffset >= 4294967295L || this.zip64Mode == Zip64Mode.Always;
            boolean needsToEncodeDiskNumberStart = ze.getDiskNumberStart() >= User32.HWND_BROADCAST || this.zip64Mode == Zip64Mode.Always;
            if (needsToEncodeLfhOffset || needsToEncodeDiskNumberStart) {
                z64.setRelativeHeaderOffset(new ZipEightByteInteger(lfhOffset));
            }
            if (needsToEncodeDiskNumberStart) {
                z64.setDiskStartNumber(new ZipLong(ze.getDiskNumberStart()));
            }
            ze.setExtra();
        }
    }

    private boolean hasZip64Extra(ZipArchiveEntry ze) {
        return ze.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID) instanceof Zip64ExtendedInformationExtraField;
    }

    public boolean isSeekable() {
        return this.outputStream instanceof RandomAccessOutputStream;
    }

    private boolean isTooLargeForZip32(ZipArchiveEntry zipArchiveEntry) {
        return zipArchiveEntry.getSize() >= 4294967295L || zipArchiveEntry.getCompressedSize() >= 4294967295L;
    }

    private boolean isZip64Required(ZipArchiveEntry entry1, Zip64Mode requestedMode) {
        return requestedMode == Zip64Mode.Always || requestedMode == Zip64Mode.AlwaysWithCompatibility || isTooLargeForZip32(entry1);
    }

    private void preClose() throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        if (this.entry != null) {
            if (!this.entry.hasWritten) {
                write(ByteUtils.EMPTY_BYTE_ARRAY, 0, 0);
                return;
            }
            return;
        }
        throw new IOException("No current entry to close");
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void putArchiveEntry(ZipArchiveEntry archiveEntry) throws IOException {
        putArchiveEntry(archiveEntry, false);
    }

    private void putArchiveEntry(ZipArchiveEntry archiveEntry, boolean phased) throws IOException {
        ZipEightByteInteger size;
        ZipEightByteInteger size2;
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        if (this.entry != null) {
            closeArchiveEntry();
        }
        this.entry = new CurrentEntry(archiveEntry);
        this.entries.add(this.entry.entry);
        setDefaults(this.entry.entry);
        Zip64Mode effectiveMode = getEffectiveZip64Mode(this.entry.entry);
        validateSizeInformation(effectiveMode);
        if (shouldAddZip64Extra(this.entry.entry, effectiveMode)) {
            Zip64ExtendedInformationExtraField z64 = getZip64Extra(this.entry.entry);
            if (!phased) {
                if (this.entry.entry.getMethod() == 0 && this.entry.entry.getSize() != -1) {
                    size = new ZipEightByteInteger(this.entry.entry.getSize());
                    size2 = size;
                } else {
                    ZipEightByteInteger compressedSize = ZipEightByteInteger.ZERO;
                    size = compressedSize;
                    size2 = size;
                }
            } else {
                size2 = new ZipEightByteInteger(this.entry.entry.getSize());
                size = new ZipEightByteInteger(this.entry.entry.getCompressedSize());
            }
            z64.setSize(size2);
            z64.setCompressedSize(size);
            this.entry.entry.setExtra();
        }
        if (this.entry.entry.getMethod() == 8 && this.hasCompressionLevelChanged) {
            this.def.setLevel(this.level);
            this.hasCompressionLevelChanged = false;
        }
        writeLocalFileHeader(archiveEntry, phased);
    }

    private void rewriteSizesAndCrc(boolean actuallyNeedsZip64) throws IOException {
        RandomAccessOutputStream randomStream = (RandomAccessOutputStream) this.outputStream;
        long dataStart = this.entry.localDataStart;
        if (randomStream instanceof ZipSplitOutputStream) {
            dataStart = ((ZipSplitOutputStream) randomStream).calculateDiskPosition(this.entry.entry.getDiskNumberStart(), dataStart);
        }
        long position = dataStart;
        randomStream.writeFully(ZipLong.getBytes(this.entry.entry.getCrc()), position);
        long position2 = position + 4;
        if (!hasZip64Extra(this.entry.entry) || !actuallyNeedsZip64) {
            randomStream.writeFully(ZipLong.getBytes(this.entry.entry.getCompressedSize()), position2);
            long position3 = position2 + 4;
            randomStream.writeFully(ZipLong.getBytes(this.entry.entry.getSize()), position3);
            long j = position3 + 4;
        } else {
            randomStream.writeFully(ZipLong.ZIP64_MAGIC.getBytes(), position2);
            long position4 = position2 + 4;
            randomStream.writeFully(ZipLong.ZIP64_MAGIC.getBytes(), position4);
            long j2 = position4 + 4;
        }
        if (hasZip64Extra(this.entry.entry)) {
            ByteBuffer name = getName(this.entry.entry);
            int nameLen = name.limit() - name.position();
            long position5 = 12 + dataStart + 4 + nameLen + 4;
            randomStream.writeFully(ZipEightByteInteger.getBytes(this.entry.entry.getSize()), position5);
            long position6 = position5 + 8;
            randomStream.writeFully(ZipEightByteInteger.getBytes(this.entry.entry.getCompressedSize()), position6);
            long j3 = 8 + position6;
            if (!actuallyNeedsZip64) {
                long position7 = dataStart - 10;
                randomStream.writeFully(ZipShort.getBytes(versionNeededToExtract(this.entry.entry.getMethod(), false, false)), position7);
                long j4 = position7 + 2;
                this.entry.entry.removeExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
                this.entry.entry.setExtra();
                if (this.entry.causedUseOfZip64) {
                    this.hasUsedZip64 = false;
                }
            }
        }
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCreateUnicodeExtraFields(UnicodeExtraFieldPolicy b) {
        this.createUnicodeExtraFields = b;
    }

    private void setDefaults(ZipArchiveEntry entry) {
        if (entry.getMethod() == -1) {
            entry.setMethod(this.method);
        }
        if (entry.getTime() == -1) {
            entry.setTime(System.currentTimeMillis());
        }
    }

    public void setEncoding(String encoding) {
        this.charsetName = encoding;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(encoding);
        if (this.useUTF8Flag && !ZipEncodingHelper.isUTF8(encoding)) {
            this.useUTF8Flag = false;
        }
    }

    public void setFallbackToUTF8(boolean b) {
        this.fallbackToUTF8 = b;
    }

    public void setLevel(int level) {
        if (level < -1 || level > 9) {
            throw new IllegalArgumentException("Invalid compression level: " + level);
        }
        if (this.level == level) {
            return;
        }
        this.hasCompressionLevelChanged = true;
        this.level = level;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public void setUseLanguageEncodingFlag(boolean b) {
        this.useUTF8Flag = b && ZipEncodingHelper.isUTF8(this.charsetName);
    }

    public void setUseZip64(Zip64Mode mode) {
        this.zip64Mode = mode;
    }

    private boolean shouldAddZip64Extra(ZipArchiveEntry entry, Zip64Mode mode) {
        return mode == Zip64Mode.Always || mode == Zip64Mode.AlwaysWithCompatibility || entry.getSize() >= 4294967295L || entry.getCompressedSize() >= 4294967295L || (entry.getSize() == -1 && (this.outputStream instanceof RandomAccessOutputStream) && mode != Zip64Mode.Never);
    }

    private boolean shouldUseZip64EOCD() {
        int numberOfThisDisk = 0;
        if (this.isSplitZip) {
            numberOfThisDisk = ((ZipSplitOutputStream) this.outputStream).getCurrentSplitSegmentIndex();
        }
        int numOfEntriesOnThisDisk = this.numberOfCDInDiskData.getOrDefault(Integer.valueOf(numberOfThisDisk), 0).intValue();
        return numberOfThisDisk >= 65535 || this.cdDiskNumberStart >= User32.HWND_BROADCAST || numOfEntriesOnThisDisk >= 65535 || this.entries.size() >= 65535 || this.cdLength >= 4294967295L || this.cdOffset >= 4294967295L;
    }

    private boolean usesDataDescriptor(int zipMethod, boolean phased) {
        return (phased || zipMethod != 8 || (this.outputStream instanceof RandomAccessOutputStream)) ? false : true;
    }

    private void validateIfZip64IsNeededInEOCD() throws Zip64RequiredException {
        if (this.zip64Mode != Zip64Mode.Never) {
            return;
        }
        int numberOfThisDisk = 0;
        if (this.isSplitZip) {
            numberOfThisDisk = ((ZipSplitOutputStream) this.outputStream).getCurrentSplitSegmentIndex();
        }
        if (numberOfThisDisk >= 65535) {
            throw new Zip64RequiredException("Number of the disk of End Of Central Directory exceeds the limit of 65535.");
        }
        if (this.cdDiskNumberStart >= User32.HWND_BROADCAST) {
            throw new Zip64RequiredException("Number of the disk with the start of Central Directory exceeds the limit of 65535.");
        }
        int numOfEntriesOnThisDisk = this.numberOfCDInDiskData.getOrDefault(Integer.valueOf(numberOfThisDisk), 0).intValue();
        if (numOfEntriesOnThisDisk < 65535) {
            if (this.entries.size() >= 65535) {
                throw new Zip64RequiredException("Archive contains more than 65535 entries.");
            }
            if (this.cdLength >= 4294967295L) {
                throw new Zip64RequiredException("The size of the entire central directory exceeds the limit of 4GByte.");
            }
            if (this.cdOffset >= 4294967295L) {
                throw new Zip64RequiredException("Archive's size exceeds the limit of 4GByte.");
            }
            return;
        }
        throw new Zip64RequiredException("Number of entries on this disk exceeds the limit of 65535.");
    }

    private void validateSizeInformation(Zip64Mode effectiveMode) throws ZipException {
        if (this.entry.entry.getMethod() == 0 && !(this.outputStream instanceof RandomAccessOutputStream)) {
            if (this.entry.entry.getSize() == -1) {
                throw new ZipException("Uncompressed size is required for STORED method when not writing to a file");
            }
            if (this.entry.entry.getCrc() != -1) {
                this.entry.entry.setCompressedSize(this.entry.entry.getSize());
            } else {
                throw new ZipException("CRC checksum is required for STORED method when not writing to a file");
            }
        }
        if ((this.entry.entry.getSize() >= 4294967295L || this.entry.entry.getCompressedSize() >= 4294967295L) && effectiveMode == Zip64Mode.Never) {
            throw new Zip64RequiredException(Zip64RequiredException.getEntryTooBigMessage(this.entry.entry));
        }
    }

    private int versionNeededToExtract(int zipMethod, boolean zip64, boolean usedDataDescriptor) {
        if (zip64) {
            return 45;
        }
        if (usedDataDescriptor) {
            return 20;
        }
        return versionNeededToExtractMethod(zipMethod);
    }

    private int versionNeededToExtractMethod(int zipMethod) {
        return zipMethod == 8 ? 20 : 10;
    }

    @Override // java.io.OutputStream
    public void write(byte[] b, int offset, int length) throws IOException {
        if (this.entry != null) {
            ZipUtil.checkRequestedFeatures(this.entry.entry);
            long writtenThisTime = this.streamCompressor.write(b, offset, length, this.entry.entry.getMethod());
            count(writtenThisTime);
            return;
        }
        throw new IllegalStateException("No current entry");
    }

    protected void writeCentralDirectoryEnd() throws IOException, IllegalArgumentException {
        if (!this.hasUsedZip64 && this.isSplitZip) {
            ((ZipSplitOutputStream) this.outputStream).prepareToWriteUnsplittableContent(this.eocdLength);
        }
        validateIfZip64IsNeededInEOCD();
        writeCounted(EOCD_SIG);
        int numberOfThisDisk = 0;
        if (this.isSplitZip) {
            numberOfThisDisk = ((ZipSplitOutputStream) this.outputStream).getCurrentSplitSegmentIndex();
        }
        writeCounted(ZipShort.getBytes(numberOfThisDisk));
        writeCounted(ZipShort.getBytes((int) this.cdDiskNumberStart));
        int numberOfEntries = this.entries.size();
        int numOfEntriesOnThisDisk = this.isSplitZip ? this.numberOfCDInDiskData.getOrDefault(Integer.valueOf(numberOfThisDisk), 0).intValue() : numberOfEntries;
        byte[] numOfEntriesOnThisDiskData = ZipShort.getBytes(Math.min(numOfEntriesOnThisDisk, 65535));
        writeCounted(numOfEntriesOnThisDiskData);
        byte[] num = ZipShort.getBytes(Math.min(numberOfEntries, 65535));
        writeCounted(num);
        writeCounted(ZipLong.getBytes(Math.min(this.cdLength, 4294967295L)));
        writeCounted(ZipLong.getBytes(Math.min(this.cdOffset, 4294967295L)));
        ByteBuffer data = this.zipEncoding.encode(this.comment);
        int dataLen = data.limit() - data.position();
        writeCounted(ZipShort.getBytes(dataLen));
        this.streamCompressor.writeCounted(data.array(), data.arrayOffset(), dataLen);
    }

    private void writeCentralDirectoryInChunks() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(70000);
        int count = 0;
        for (ZipArchiveEntry ze : this.entries) {
            byteArrayOutputStream.write(createCentralFileHeader(ze));
            count++;
            if (count > 1000) {
                writeCounted(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                count = 0;
            }
        }
        writeCounted(byteArrayOutputStream.toByteArray());
    }

    protected void writeCentralFileHeader(ZipArchiveEntry ze) throws IOException {
        byte[] centralFileHeader = createCentralFileHeader(ze);
        writeCounted(centralFileHeader);
    }

    private void writeCounted(byte[] data) throws IOException {
        this.streamCompressor.writeCounted(data);
    }

    protected void writeDataDescriptor(ZipArchiveEntry ze) throws IOException {
        if (!usesDataDescriptor(ze.getMethod(), false)) {
            return;
        }
        writeCounted(DD_SIG);
        writeCounted(ZipLong.getBytes(ze.getCrc()));
        if (!hasZip64Extra(ze)) {
            writeCounted(ZipLong.getBytes(ze.getCompressedSize()));
            writeCounted(ZipLong.getBytes(ze.getSize()));
        } else {
            writeCounted(ZipEightByteInteger.getBytes(ze.getCompressedSize()));
            writeCounted(ZipEightByteInteger.getBytes(ze.getSize()));
        }
    }

    protected void writeLocalFileHeader(ZipArchiveEntry ze) throws IOException {
        writeLocalFileHeader(ze, false);
    }

    private void writeLocalFileHeader(ZipArchiveEntry ze, boolean phased) throws IOException {
        long localHeaderStart;
        boolean encodable = this.zipEncoding.canEncode(ze.getName());
        ByteBuffer name = getName(ze);
        if (this.createUnicodeExtraFields != UnicodeExtraFieldPolicy.NEVER) {
            addUnicodeExtraFields(ze, encodable, name);
        }
        long localHeaderStart2 = this.streamCompressor.getTotalBytesWritten();
        if (!this.isSplitZip) {
            localHeaderStart = localHeaderStart2;
        } else {
            ZipSplitOutputStream splitOutputStream = (ZipSplitOutputStream) this.outputStream;
            ze.setDiskNumberStart(splitOutputStream.getCurrentSplitSegmentIndex());
            long localHeaderStart3 = splitOutputStream.getCurrentSplitSegmentBytesWritten();
            localHeaderStart = localHeaderStart3;
        }
        byte[] localHeader = createLocalFileHeader(ze, name, encodable, phased, localHeaderStart);
        this.metaData.put(ze, new EntryMetaData(localHeaderStart, usesDataDescriptor(ze.getMethod(), phased)));
        this.entry.localDataStart = 14 + localHeaderStart;
        writeCounted(localHeader);
        this.entry.dataStart = this.streamCompressor.getTotalBytesWritten();
    }

    protected final void writeOut(byte[] data) throws IOException {
        this.streamCompressor.writeOut(data, 0, data.length);
    }

    protected final void writeOut(byte[] data, int offset, int length) throws IOException {
        this.streamCompressor.writeOut(data, offset, length);
    }

    public void writePreamble(byte[] preamble) throws IOException {
        writePreamble(preamble, 0, preamble.length);
    }

    public void writePreamble(byte[] preamble, int offset, int length) throws IOException {
        if (this.entry != null) {
            throw new IllegalStateException("Preamble must be written before creating an entry");
        }
        this.streamCompressor.writeCounted(preamble, offset, length);
    }

    protected void writeZip64CentralDirectory() throws IOException, IllegalArgumentException {
        if (this.zip64Mode == Zip64Mode.Never) {
            return;
        }
        if (!this.hasUsedZip64 && shouldUseZip64EOCD()) {
            this.hasUsedZip64 = true;
        }
        if (!this.hasUsedZip64) {
            return;
        }
        long offset = this.streamCompressor.getTotalBytesWritten();
        long diskNumberStart = 0;
        if (this.isSplitZip) {
            ZipSplitOutputStream zipSplitOutputStream = (ZipSplitOutputStream) this.outputStream;
            offset = zipSplitOutputStream.getCurrentSplitSegmentBytesWritten();
            diskNumberStart = zipSplitOutputStream.getCurrentSplitSegmentIndex();
        }
        writeOut(ZIP64_EOCD_SIG);
        writeOut(ZipEightByteInteger.getBytes(44L));
        writeOut(ZipShort.getBytes(45));
        writeOut(ZipShort.getBytes(45));
        int numberOfThisDisk = 0;
        if (this.isSplitZip) {
            numberOfThisDisk = ((ZipSplitOutputStream) this.outputStream).getCurrentSplitSegmentIndex();
        }
        writeOut(ZipLong.getBytes(numberOfThisDisk));
        writeOut(ZipLong.getBytes(this.cdDiskNumberStart));
        int numOfEntriesOnThisDisk = this.isSplitZip ? this.numberOfCDInDiskData.getOrDefault(Integer.valueOf(numberOfThisDisk), 0).intValue() : this.entries.size();
        byte[] numOfEntriesOnThisDiskData = ZipEightByteInteger.getBytes(numOfEntriesOnThisDisk);
        writeOut(numOfEntriesOnThisDiskData);
        byte[] num = ZipEightByteInteger.getBytes(this.entries.size());
        writeOut(num);
        writeOut(ZipEightByteInteger.getBytes(this.cdLength));
        writeOut(ZipEightByteInteger.getBytes(this.cdOffset));
        if (this.isSplitZip) {
            long unsplittableContentSize = this.eocdLength + 20;
            ((ZipSplitOutputStream) this.outputStream).prepareToWriteUnsplittableContent(unsplittableContentSize);
        }
        writeOut(ZIP64_EOCD_LOC_SIG);
        writeOut(ZipLong.getBytes(diskNumberStart));
        writeOut(ZipEightByteInteger.getBytes(offset));
        if (this.isSplitZip) {
            int totalNumberOfDisks = ((ZipSplitOutputStream) this.outputStream).getCurrentSplitSegmentIndex() + 1;
            writeOut(ZipLong.getBytes(totalNumberOfDisks));
        } else {
            writeOut(ONE);
        }
    }
}
