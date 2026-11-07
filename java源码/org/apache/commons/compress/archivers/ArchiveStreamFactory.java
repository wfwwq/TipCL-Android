package org.apache.commons.compress.archivers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.utils.Sets;

/* loaded from: classes24.dex */
public class ArchiveStreamFactory implements ArchiveStreamProvider {
    public static final String APK = "apk";
    public static final String APKM = "apkm";
    public static final String APKS = "apks";
    public static final String AR = "ar";
    public static final String ARJ = "arj";
    public static final String CPIO = "cpio";
    public static final ArchiveStreamFactory DEFAULT = new ArchiveStreamFactory();
    public static final String DUMP = "dump";
    private static final int DUMP_SIGNATURE_SIZE = 32;
    public static final String JAR = "jar";
    public static final String SEVEN_Z = "7z";
    private static final int SIGNATURE_SIZE = 12;
    public static final String TAR = "tar";
    private static final int TAR_HEADER_SIZE = 512;
    public static final String XAPK = "xapk";
    public static final String ZIP = "zip";
    private SortedMap<String, ArchiveStreamProvider> archiveInputStreamProviders;
    private SortedMap<String, ArchiveStreamProvider> archiveOutputStreamProviders;
    private final String encoding;
    private volatile String entryEncoding;

    private static Iterable<ArchiveStreamProvider> archiveStreamProviderIterable() {
        return ServiceLoader.load(ArchiveStreamProvider.class, ClassLoader.getSystemClassLoader());
    }

    public static String detect(InputStream in) throws ArchiveException, IOException {
        if (in == null) {
            throw new IllegalArgumentException("Stream must not be null.");
        }
        if (!in.markSupported()) {
            throw new IllegalArgumentException("Mark is not supported.");
        }
        byte[] signature = new byte[12];
        in.mark(signature.length);
        try {
            int signatureLength = IOUtils.readFully(in, signature);
            in.reset();
            if (ZipArchiveInputStream.matches(signature, signatureLength)) {
                return ZIP;
            }
            if (JarArchiveInputStream.matches(signature, signatureLength)) {
                return JAR;
            }
            if (ArArchiveInputStream.matches(signature, signatureLength)) {
                return AR;
            }
            if (CpioArchiveInputStream.matches(signature, signatureLength)) {
                return CPIO;
            }
            if (ArjArchiveInputStream.matches(signature, signatureLength)) {
                return ARJ;
            }
            if (SevenZFile.matches(signature, signatureLength)) {
                return SEVEN_Z;
            }
            byte[] dumpsig = new byte[32];
            in.mark(dumpsig.length);
            try {
                int signatureLength2 = IOUtils.readFully(in, dumpsig);
                in.reset();
                if (DumpArchiveInputStream.matches(dumpsig, signatureLength2)) {
                    return DUMP;
                }
                byte[] tarHeader = new byte[512];
                in.mark(tarHeader.length);
                try {
                    int signatureLength3 = IOUtils.readFully(in, tarHeader);
                    in.reset();
                    if (TarArchiveInputStream.matches(tarHeader, signatureLength3)) {
                        return TAR;
                    }
                    if (signatureLength3 >= 512) {
                        try {
                            TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarHeader));
                            try {
                                if (tais.getNextEntry().isCheckSumOK()) {
                                    tais.close();
                                    return TAR;
                                }
                                tais.close();
                            } finally {
                            }
                        } catch (Exception e) {
                        }
                    }
                    throw new ArchiveException("No Archiver found for the stream signature");
                } catch (IOException e2) {
                    throw new ArchiveException("IOException while reading tar signature", e2);
                }
            } catch (IOException e3) {
                throw new ArchiveException("IOException while reading dump signature", e3);
            }
        } catch (IOException e4) {
            throw new ArchiveException("IOException while reading signature.", e4);
        }
    }

    public static SortedMap<String, ArchiveStreamProvider> findAvailableArchiveInputStreamProviders() {
        return (SortedMap) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda3
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ArchiveStreamFactory.lambda$findAvailableArchiveInputStreamProviders$1();
            }
        });
    }

    static /* synthetic */ SortedMap lambda$findAvailableArchiveInputStreamProviders$1() {
        final TreeMap<String, ArchiveStreamProvider> map = new TreeMap<>();
        putAll(DEFAULT.getInputStreamArchiveNames(), DEFAULT, map);
        archiveStreamProviderIterable().forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArchiveStreamProvider archiveStreamProvider = (ArchiveStreamProvider) obj;
                ArchiveStreamFactory.putAll(archiveStreamProvider.getInputStreamArchiveNames(), archiveStreamProvider, map);
            }
        });
        return map;
    }

    public static SortedMap<String, ArchiveStreamProvider> findAvailableArchiveOutputStreamProviders() {
        return (SortedMap) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda2
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ArchiveStreamFactory.lambda$findAvailableArchiveOutputStreamProviders$3();
            }
        });
    }

    static /* synthetic */ SortedMap lambda$findAvailableArchiveOutputStreamProviders$3() {
        final TreeMap<String, ArchiveStreamProvider> map = new TreeMap<>();
        putAll(DEFAULT.getOutputStreamArchiveNames(), DEFAULT, map);
        archiveStreamProviderIterable().forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArchiveStreamProvider archiveStreamProvider = (ArchiveStreamProvider) obj;
                ArchiveStreamFactory.putAll(archiveStreamProvider.getOutputStreamArchiveNames(), archiveStreamProvider, map);
            }
        });
        return map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putAll(Set<String> names, final ArchiveStreamProvider provider, final TreeMap<String, ArchiveStreamProvider> map) {
        names.forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                map.put(ArchiveStreamFactory.toKey((String) obj), provider);
            }
        });
    }

    private static String toKey(String name) {
        return name.toUpperCase(Locale.ROOT);
    }

    public ArchiveStreamFactory() {
        this(null);
    }

    public ArchiveStreamFactory(String encoding) {
        this.encoding = encoding;
        this.entryEncoding = encoding;
    }

    public <I extends ArchiveInputStream<? extends ArchiveEntry>> I createArchiveInputStream(InputStream inputStream) throws ArchiveException {
        return (I) createArchiveInputStream(detect(inputStream), inputStream);
    }

    public <I extends ArchiveInputStream<? extends ArchiveEntry>> I createArchiveInputStream(String str, InputStream inputStream) throws ArchiveException {
        return (I) createArchiveInputStream(str, inputStream, this.entryEncoding);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveStreamProvider
    public <I extends ArchiveInputStream<? extends ArchiveEntry>> I createArchiveInputStream(String str, InputStream inputStream, String str2) throws ArchiveException {
        if (str == null) {
            throw new IllegalArgumentException("Archiver name must not be null.");
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream must not be null.");
        }
        if (AR.equalsIgnoreCase(str)) {
            return new ArArchiveInputStream(inputStream);
        }
        if (ARJ.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new ArjArchiveInputStream(inputStream, str2);
            }
            return new ArjArchiveInputStream(inputStream);
        }
        if (ZIP.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new ZipArchiveInputStream(inputStream, str2);
            }
            return new ZipArchiveInputStream(inputStream);
        }
        if (TAR.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new TarArchiveInputStream(inputStream, str2);
            }
            return new TarArchiveInputStream(inputStream);
        }
        if (JAR.equalsIgnoreCase(str) || APK.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new JarArchiveInputStream(inputStream, str2);
            }
            return new JarArchiveInputStream(inputStream);
        }
        if (CPIO.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new CpioArchiveInputStream(inputStream, str2);
            }
            return new CpioArchiveInputStream(inputStream);
        }
        if (DUMP.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new DumpArchiveInputStream(inputStream, str2);
            }
            return new DumpArchiveInputStream(inputStream);
        }
        if (SEVEN_Z.equalsIgnoreCase(str)) {
            throw new StreamingNotSupportedException(SEVEN_Z);
        }
        ArchiveStreamProvider archiveStreamProvider = getArchiveInputStreamProviders().get(toKey(str));
        if (archiveStreamProvider != null) {
            return (I) archiveStreamProvider.createArchiveInputStream(str, inputStream, str2);
        }
        throw new ArchiveException("Archiver: " + str + " not found.");
    }

    public <O extends ArchiveOutputStream<? extends ArchiveEntry>> O createArchiveOutputStream(String str, OutputStream outputStream) throws ArchiveException {
        return (O) createArchiveOutputStream(str, outputStream, this.entryEncoding);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveStreamProvider
    public <O extends ArchiveOutputStream<? extends ArchiveEntry>> O createArchiveOutputStream(String str, OutputStream outputStream, String str2) throws ArchiveException {
        if (str == null) {
            throw new IllegalArgumentException("Archiver name must not be null.");
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("OutputStream must not be null.");
        }
        if (AR.equalsIgnoreCase(str)) {
            return new ArArchiveOutputStream(outputStream);
        }
        if (ZIP.equalsIgnoreCase(str)) {
            ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(outputStream);
            if (str2 != null) {
                zipArchiveOutputStream.setEncoding(str2);
            }
            return zipArchiveOutputStream;
        }
        if (TAR.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new TarArchiveOutputStream(outputStream, str2);
            }
            return new TarArchiveOutputStream(outputStream);
        }
        if (JAR.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new JarArchiveOutputStream(outputStream, str2);
            }
            return new JarArchiveOutputStream(outputStream);
        }
        if (CPIO.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new CpioArchiveOutputStream(outputStream, str2);
            }
            return new CpioArchiveOutputStream(outputStream);
        }
        if (SEVEN_Z.equalsIgnoreCase(str)) {
            throw new StreamingNotSupportedException(SEVEN_Z);
        }
        ArchiveStreamProvider archiveStreamProvider = getArchiveOutputStreamProviders().get(toKey(str));
        if (archiveStreamProvider != null) {
            return (O) archiveStreamProvider.createArchiveOutputStream(str, outputStream, str2);
        }
        throw new ArchiveException("Archiver: " + str + " not found.");
    }

    public SortedMap<String, ArchiveStreamProvider> getArchiveInputStreamProviders() {
        if (this.archiveInputStreamProviders == null) {
            this.archiveInputStreamProviders = Collections.unmodifiableSortedMap(findAvailableArchiveInputStreamProviders());
        }
        return this.archiveInputStreamProviders;
    }

    public SortedMap<String, ArchiveStreamProvider> getArchiveOutputStreamProviders() {
        if (this.archiveOutputStreamProviders == null) {
            this.archiveOutputStreamProviders = Collections.unmodifiableSortedMap(findAvailableArchiveOutputStreamProviders());
        }
        return this.archiveOutputStreamProviders;
    }

    public String getEntryEncoding() {
        return this.entryEncoding;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveStreamProvider
    public Set<String> getInputStreamArchiveNames() {
        return Sets.newHashSet(AR, ARJ, ZIP, TAR, JAR, CPIO, DUMP, SEVEN_Z);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveStreamProvider
    public Set<String> getOutputStreamArchiveNames() {
        return Sets.newHashSet(AR, ZIP, TAR, JAR, CPIO, SEVEN_Z);
    }

    @Deprecated
    public void setEntryEncoding(String entryEncoding) {
        if (this.encoding != null) {
            throw new IllegalStateException("Cannot overide encoding set by the constructor");
        }
        this.entryEncoding = entryEncoding;
    }
}
