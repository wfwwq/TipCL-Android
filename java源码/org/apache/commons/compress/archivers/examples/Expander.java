package org.apache.commons.compress.archivers.examples;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarFile;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.NullOutputStream;

/* loaded from: classes24.dex */
public class Expander {

    /* JADX INFO: Access modifiers changed from: private */
    @FunctionalInterface
    interface ArchiveEntryBiConsumer<T extends ArchiveEntry> {
        void accept(T t, OutputStream outputStream) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @FunctionalInterface
    interface ArchiveEntrySupplier<T extends ArchiveEntry> {
        T get() throws IOException;
    }

    private <T extends ArchiveEntry> void expand(ArchiveEntrySupplier<T> supplier, ArchiveEntryBiConsumer<T> writer, Path targetDirectory) throws IOException {
        boolean nullTarget = targetDirectory == null;
        Path targetDirPath = nullTarget ? null : targetDirectory.normalize();
        ArchiveEntry archiveEntry = supplier.get();
        while (archiveEntry != null) {
            Path targetPath = nullTarget ? null : archiveEntry.resolveIn(targetDirPath);
            if (archiveEntry.isDirectory()) {
                if (!nullTarget && !Files.isDirectory(targetPath, new LinkOption[0]) && Files.createDirectories(targetPath, new FileAttribute[0]) == null) {
                    throw new IOException("Failed to create directory " + targetPath);
                }
            } else {
                Path parent = nullTarget ? null : targetPath.getParent();
                if (!nullTarget && !Files.isDirectory(parent, new LinkOption[0]) && Files.createDirectories(parent, new FileAttribute[0]) == null) {
                    throw new IOException("Failed to create directory " + parent);
                }
                if (nullTarget) {
                    writer.accept(archiveEntry, NullOutputStream.INSTANCE);
                } else {
                    OutputStream outputStream = Files.newOutputStream(targetPath, new OpenOption[0]);
                    try {
                        writer.accept(archiveEntry, outputStream);
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            archiveEntry = supplier.get();
        }
    }

    public void expand(ArchiveInputStream<?> archive, File targetDirectory) throws IOException {
        expand(archive, toPath(targetDirectory));
    }

    public void expand(final ArchiveInputStream<?> archive, Path targetDirectory) throws IOException {
        expand(new ArchiveEntrySupplier() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda4
            @Override // org.apache.commons.compress.archivers.examples.Expander.ArchiveEntrySupplier
            public final ArchiveEntry get() {
                return Expander.lambda$expand$0(archive);
            }
        }, new ArchiveEntryBiConsumer() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda5
            @Override // org.apache.commons.compress.archivers.examples.Expander.ArchiveEntryBiConsumer
            public final void accept(ArchiveEntry archiveEntry, OutputStream outputStream) throws IOException {
                IOUtils.copy(archive, outputStream);
            }
        }, targetDirectory);
    }

    static /* synthetic */ ArchiveEntry lambda$expand$0(ArchiveInputStream archive) throws IOException {
        ArchiveEntry next = archive.getNextEntry();
        while (next != null && !archive.canReadEntryData(next)) {
            next = archive.getNextEntry();
        }
        return next;
    }

    public void expand(File archive, File targetDirectory) throws ArchiveException, IOException {
        expand(archive.toPath(), toPath(targetDirectory));
    }

    @Deprecated
    public void expand(InputStream archive, File targetDirectory) throws ArchiveException, IOException {
        expand(archive, targetDirectory, CloseableConsumer.NULL_CONSUMER);
    }

    public void expand(InputStream archive, File targetDirectory, CloseableConsumer closeableConsumer) throws ArchiveException, IOException {
        CloseableConsumerAdapter c = new CloseableConsumerAdapter(closeableConsumer);
        try {
            expand((ArchiveInputStream<?>) c.track(ArchiveStreamFactory.DEFAULT.createArchiveInputStream(archive)), targetDirectory);
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void expand(Path archive, Path targetDirectory) throws ArchiveException, IOException {
        InputStream inputStream = new BufferedInputStream(Files.newInputStream(archive, new OpenOption[0]));
        try {
            expand(ArchiveStreamFactory.detect(inputStream), archive, targetDirectory);
            inputStream.close();
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void expand(SevenZFile archive, File targetDirectory) throws IOException {
        expand(archive, toPath(targetDirectory));
    }

    public void expand(final SevenZFile archive, Path targetDirectory) throws IOException {
        Objects.requireNonNull(archive);
        expand(new ArchiveEntrySupplier() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda0
            @Override // org.apache.commons.compress.archivers.examples.Expander.ArchiveEntrySupplier
            public final ArchiveEntry get() {
                return archive.getNextEntry();
            }
        }, new ArchiveEntryBiConsumer() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda1
            @Override // org.apache.commons.compress.archivers.examples.Expander.ArchiveEntryBiConsumer
            public final void accept(ArchiveEntry archiveEntry, OutputStream outputStream) throws IOException {
                Expander.lambda$expand$2(archive, (SevenZArchiveEntry) archiveEntry, outputStream);
            }
        }, targetDirectory);
    }

    static /* synthetic */ void lambda$expand$2(SevenZFile archive, SevenZArchiveEntry entry, OutputStream out) throws IOException {
        byte[] buffer = new byte[8192];
        while (true) {
            int n = archive.read(buffer);
            if (-1 != n) {
                if (out != null) {
                    out.write(buffer, 0, n);
                }
            } else {
                return;
            }
        }
    }

    public void expand(String format, File archive, File targetDirectory) throws ArchiveException, IOException {
        expand(format, archive.toPath(), toPath(targetDirectory));
    }

    @Deprecated
    public void expand(String format, InputStream archive, File targetDirectory) throws ArchiveException, IOException {
        expand(format, archive, targetDirectory, CloseableConsumer.NULL_CONSUMER);
    }

    public void expand(String format, InputStream archive, File targetDirectory, CloseableConsumer closeableConsumer) throws ArchiveException, IOException {
        expand(format, archive, toPath(targetDirectory), closeableConsumer);
    }

    public void expand(String format, InputStream archive, Path targetDirectory, CloseableConsumer closeableConsumer) throws ArchiveException, IOException {
        CloseableConsumerAdapter c = new CloseableConsumerAdapter(closeableConsumer);
        try {
            ArchiveInputStream<?> archiveInputStream = ArchiveStreamFactory.DEFAULT.createArchiveInputStream(format, archive);
            expand((ArchiveInputStream<?>) c.track(archiveInputStream), targetDirectory);
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void expand(String format, Path archive, Path targetDirectory) throws ArchiveException, IOException {
        if (prefersSeekableByteChannel(format)) {
            SeekableByteChannel channel = FileChannel.open(archive, StandardOpenOption.READ);
            try {
                expand(format, channel, targetDirectory, CloseableConsumer.CLOSING_CONSUMER);
                if (channel != null) {
                    channel.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        InputStream inputStream = new BufferedInputStream(Files.newInputStream(archive, new OpenOption[0]));
        try {
            expand(format, inputStream, targetDirectory, CloseableConsumer.CLOSING_CONSUMER);
            inputStream.close();
        } catch (Throwable th3) {
            try {
                inputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Deprecated
    public void expand(String format, SeekableByteChannel archive, File targetDirectory) throws ArchiveException, IOException {
        expand(format, archive, targetDirectory, CloseableConsumer.NULL_CONSUMER);
    }

    public void expand(String format, SeekableByteChannel archive, File targetDirectory, CloseableConsumer closeableConsumer) throws ArchiveException, IOException {
        expand(format, archive, toPath(targetDirectory), closeableConsumer);
    }

    public void expand(String format, SeekableByteChannel archive, Path targetDirectory, CloseableConsumer closeableConsumer) throws ArchiveException, IOException {
        CloseableConsumerAdapter c = new CloseableConsumerAdapter(closeableConsumer);
        try {
            if (!prefersSeekableByteChannel(format)) {
                expand(format, (InputStream) c.track(Channels.newInputStream(archive)), targetDirectory, CloseableConsumer.NULL_CONSUMER);
            } else if (ArchiveStreamFactory.TAR.equalsIgnoreCase(format)) {
                expand((TarFile) c.track(new TarFile(archive)), targetDirectory);
            } else if (ArchiveStreamFactory.ZIP.equalsIgnoreCase(format)) {
                expand((ZipFile) c.track(ZipFile.builder().setSeekableByteChannel(archive).get()), targetDirectory);
            } else if (ArchiveStreamFactory.SEVEN_Z.equalsIgnoreCase(format)) {
                expand((SevenZFile) c.track(SevenZFile.builder().setSeekableByteChannel(archive).get()), targetDirectory);
            } else {
                throw new ArchiveException("Don't know how to handle format " + format);
            }
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void expand(TarFile archive, File targetDirectory) throws IOException {
        expand(archive, toPath(targetDirectory));
    }

    public void expand(final TarFile archive, Path targetDirectory) throws IOException {
        final Iterator<TarArchiveEntry> entryIterator = archive.getEntries().iterator();
        expand(new ArchiveEntrySupplier() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda2
            @Override // org.apache.commons.compress.archivers.examples.Expander.ArchiveEntrySupplier
            public final ArchiveEntry get() {
                return Expander.lambda$expand$3(entryIterator);
            }
        }, new ArchiveEntryBiConsumer() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda3
            @Override // org.apache.commons.compress.archivers.examples.Expander.ArchiveEntryBiConsumer
            public final void accept(ArchiveEntry archiveEntry, OutputStream outputStream) throws IOException {
                Expander.lambda$expand$4(archive, (TarArchiveEntry) archiveEntry, outputStream);
            }
        }, targetDirectory);
    }

    static /* synthetic */ TarArchiveEntry lambda$expand$3(Iterator entryIterator) throws IOException {
        if (entryIterator.hasNext()) {
            return (TarArchiveEntry) entryIterator.next();
        }
        return null;
    }

    static /* synthetic */ void lambda$expand$4(TarFile archive, TarArchiveEntry entry, OutputStream out) throws IOException {
        InputStream in = archive.getInputStream(entry);
        try {
            IOUtils.copy(in, out);
            if (in != null) {
                in.close();
            }
        } catch (Throwable th) {
            if (in != null) {
                try {
                    in.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void expand(ZipFile archive, File targetDirectory) throws IOException {
        expand(archive, toPath(targetDirectory));
    }

    public void expand(final ZipFile archive, Path targetDirectory) throws IOException {
        final Enumeration<ZipArchiveEntry> entries = archive.getEntries();
        expand(new ArchiveEntrySupplier() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda6
            @Override // org.apache.commons.compress.archivers.examples.Expander.ArchiveEntrySupplier
            public final ArchiveEntry get() {
                return Expander.lambda$expand$5(entries, archive);
            }
        }, new ArchiveEntryBiConsumer() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda7
            @Override // org.apache.commons.compress.archivers.examples.Expander.ArchiveEntryBiConsumer
            public final void accept(ArchiveEntry archiveEntry, OutputStream outputStream) throws IOException {
                Expander.lambda$expand$6(archive, (ZipArchiveEntry) archiveEntry, outputStream);
            }
        }, targetDirectory);
    }

    static /* synthetic */ ZipArchiveEntry lambda$expand$5(Enumeration entries, ZipFile archive) throws IOException {
        ZipArchiveEntry next = entries.hasMoreElements() ? (ZipArchiveEntry) entries.nextElement() : null;
        while (next != null && !archive.canReadEntryData(next)) {
            next = entries.hasMoreElements() ? (ZipArchiveEntry) entries.nextElement() : null;
        }
        return next;
    }

    static /* synthetic */ void lambda$expand$6(ZipFile archive, ZipArchiveEntry entry, OutputStream out) throws IOException {
        InputStream in = archive.getInputStream(entry);
        try {
            IOUtils.copy(in, out);
            if (in != null) {
                in.close();
            }
        } catch (Throwable th) {
            if (in != null) {
                try {
                    in.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private boolean prefersSeekableByteChannel(String format) {
        return ArchiveStreamFactory.TAR.equalsIgnoreCase(format) || ArchiveStreamFactory.ZIP.equalsIgnoreCase(format) || ArchiveStreamFactory.SEVEN_Z.equalsIgnoreCase(format);
    }

    private Path toPath(File targetDirectory) {
        if (targetDirectory != null) {
            return targetDirectory.toPath();
        }
        return null;
    }
}
