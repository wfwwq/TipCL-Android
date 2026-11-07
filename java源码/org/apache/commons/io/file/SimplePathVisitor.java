package org.apache.commons.io.file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.Objects;
import org.apache.commons.io.function.IOBiFunction;

/* loaded from: classes24.dex */
public abstract class SimplePathVisitor extends SimpleFileVisitor<Path> implements PathVisitor {
    private final IOBiFunction<Path, IOException, FileVisitResult> visitFileFailedFunction;

    protected SimplePathVisitor() {
        this.visitFileFailedFunction = new IOBiFunction() { // from class: org.apache.commons.io.file.SimplePathVisitor$$ExternalSyntheticLambda0
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return this.f$0.m9853lambda$new$0$orgapachecommonsiofileSimplePathVisitor((Path) obj, (IOException) obj2);
            }
        };
    }

    /* renamed from: lambda$new$0$org-apache-commons-io-file-SimplePathVisitor, reason: not valid java name */
    /* synthetic */ FileVisitResult m9853lambda$new$0$orgapachecommonsiofileSimplePathVisitor(Object x$0, IOException x$1) throws IOException {
        return super.visitFileFailed((SimplePathVisitor) x$0, x$1);
    }

    protected SimplePathVisitor(IOBiFunction<Path, IOException, FileVisitResult> visitFileFailed) {
        this.visitFileFailedFunction = (IOBiFunction) Objects.requireNonNull(visitFileFailed, "visitFileFailed");
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return this.visitFileFailedFunction.apply(file, exc);
    }
}
