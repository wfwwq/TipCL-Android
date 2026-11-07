package org.apache.commons.compress.archivers;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Objects;
import java.util.function.Consumer;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarFile;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;

/* loaded from: classes24.dex */
public final class Lister {
    private static final ArchiveStreamFactory FACTORY = ArchiveStreamFactory.DEFAULT;
    private final String[] args;
    private final boolean quiet;

    private static <T extends ArchiveInputStream<? extends E>, E extends ArchiveEntry> T createArchiveInputStream(String[] strArr, InputStream inputStream) throws ArchiveException {
        if (strArr.length > 1) {
            return (T) FACTORY.createArchiveInputStream(strArr[1], inputStream);
        }
        return (T) FACTORY.createArchiveInputStream(inputStream);
    }

    private static String detectFormat(Path file) throws ArchiveException, IOException {
        InputStream inputStream = new BufferedInputStream(Files.newInputStream(file, new OpenOption[0]));
        try {
            String strDetect = ArchiveStreamFactory.detect(inputStream);
            inputStream.close();
            return strDetect;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void main(String... args) throws Throwable {
        if (args == null || args.length == 0) {
            usage();
        } else {
            new Lister(false, args).go();
        }
    }

    private static void usage() {
        System.err.println("Parameters: archive-name [archive-type]\n");
        System.err.println("The magic archive-type 'zipfile' prefers ZipFile over ZipArchiveInputStream");
        System.err.println("The magic archive-type 'tarfile' prefers TarFile over TarArchiveInputStream");
    }

    @Deprecated
    public Lister() {
        this(false, "");
    }

    Lister(boolean quiet, String... args) {
        this.quiet = quiet;
        this.args = (String[]) args.clone();
        Objects.requireNonNull(args[0], "args[0]");
    }

    void go() throws Throwable {
        list(Paths.get(this.args[0], new String[0]), this.args);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void list(java.nio.file.Path r6, java.lang.String... r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Analyzing "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            boolean r1 = java.nio.file.Files.isRegularFile(r6, r1)
            if (r1 != 0) goto L37
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = " doesn't exist or is a directory"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
        L37:
            int r1 = r7.length
            r2 = 1
            if (r1 <= r2) goto L3e
            r1 = r7[r2]
            goto L42
        L3e:
            java.lang.String r1 = detectFormat(r6)
        L42:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Detected format "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r5.println(r3)
            int r3 = r1.hashCode()
            switch(r3) {
                case 1827: goto L7c;
                case 114597: goto L71;
                case 120609: goto L66;
                default: goto L65;
            }
        L65:
            goto L85
        L66:
            java.lang.String r0 = "zip"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L65
            r0 = r2
            goto L86
        L71:
            java.lang.String r0 = "tar"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L65
            r0 = 2
            goto L86
        L7c:
            java.lang.String r2 = "7z"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L65
            goto L86
        L85:
            r0 = -1
        L86:
            switch(r0) {
                case 0: goto L95;
                case 1: goto L91;
                case 2: goto L8d;
                default: goto L89;
            }
        L89:
            r5.listStream(r6, r7)
            goto L99
        L8d:
            r5.listZipUsingTarFile(r6)
            goto L99
        L91:
            r5.listZipUsingZipFile(r6)
            goto L99
        L95:
            r5.list7z(r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.Lister.list(java.nio.file.Path, java.lang.String[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void list7z(Path file) throws IOException {
        SevenZFile sevenZFile = ((SevenZFile.Builder) SevenZFile.builder().setPath(file)).get();
        try {
            println("Created " + sevenZFile);
            while (true) {
                ArchiveEntry entry = sevenZFile.getNextEntry();
                if (entry == null) {
                    break;
                } else {
                    println(entry.getName() == null ? sevenZFile.getDefaultName() + " (entry name was null)" : entry.getName());
                }
            }
            if (sevenZFile != null) {
                sevenZFile.close();
            }
        } catch (Throwable th) {
            if (sevenZFile != null) {
                try {
                    sevenZFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void listStream(Path file, String[] args) throws ArchiveException, IOException {
        InputStream inputStream = new BufferedInputStream(Files.newInputStream(file, new OpenOption[0]));
        try {
            ArchiveInputStream<?> archiveInputStream = createArchiveInputStream(args, inputStream);
            try {
                println("Created " + archiveInputStream.toString());
                while (true) {
                    ArchiveEntry entry = archiveInputStream.getNextEntry();
                    if (entry == null) {
                        break;
                    } else {
                        println(entry);
                    }
                }
                if (archiveInputStream != null) {
                    archiveInputStream.close();
                }
                inputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void listZipUsingTarFile(Path file) throws IOException {
        TarFile tarFile = new TarFile(file);
        try {
            println("Created " + tarFile);
            tarFile.getEntries().forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.Lister$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f$0.println((TarArchiveEntry) obj);
                }
            });
            tarFile.close();
        } catch (Throwable th) {
            try {
                tarFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void listZipUsingZipFile(Path file) throws Throwable {
        ZipFile zipFile = ((ZipFile.Builder) ZipFile.builder().setPath(file)).get();
        try {
            println("Created " + zipFile);
            Enumeration<ZipArchiveEntry> en = zipFile.getEntries();
            while (en.hasMoreElements()) {
                println(en.nextElement());
            }
            if (zipFile != null) {
                zipFile.close();
            }
        } catch (Throwable th) {
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void println(ArchiveEntry entry) {
        println(entry.getName());
    }

    private void println(String line) {
        if (!this.quiet) {
            System.out.println(line);
        }
    }
}
