package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.function.IOSupplier;

/* loaded from: classes24.dex */
public class EmptyFileFilter extends AbstractFileFilter implements Serializable {
    public static final IOFileFilter EMPTY = new EmptyFileFilter();
    public static final IOFileFilter NOT_EMPTY = EMPTY.negate();
    private static final long serialVersionUID = 3631422087512832211L;

    protected EmptyFileFilter() {
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        if (!file.isDirectory()) {
            return file.length() == 0;
        }
        File[] files = file.listFiles();
        return IOUtils.length(files) == 0;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(final Path file, BasicFileAttributes attributes) {
        return get(new IOSupplier() { // from class: org.apache.commons.io.filefilter.EmptyFileFilter$$ExternalSyntheticLambda0
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return this.f$0.m9855lambda$accept$0$orgapachecommonsiofilefilterEmptyFileFilter(file);
            }
        });
    }

    /* renamed from: lambda$accept$0$org-apache-commons-io-filefilter-EmptyFileFilter, reason: not valid java name */
    /* synthetic */ FileVisitResult m9855lambda$accept$0$orgapachecommonsiofilefilterEmptyFileFilter(Path file) throws IOException {
        if (!Files.isDirectory(file, new LinkOption[0])) {
            return toFileVisitResult(Files.size(file) == 0);
        }
        Stream<Path> stream = Files.list(file);
        try {
            FileVisitResult fileVisitResult = toFileVisitResult(stream.findFirst().isPresent() ? false : true);
            if (stream != null) {
                stream.close();
            }
            return fileVisitResult;
        } catch (Throwable th) {
            if (stream != null) {
                try {
                    stream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
