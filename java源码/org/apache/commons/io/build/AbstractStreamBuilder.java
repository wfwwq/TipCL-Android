package org.apache.commons.io.build;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.function.IntUnaryOperator;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.file.PathUtils;

/* loaded from: classes24.dex */
public abstract class AbstractStreamBuilder<T, B extends AbstractStreamBuilder<T, B>> extends AbstractOriginSupplier<T, B> {
    private static final int DEFAULT_MAX_VALUE = Integer.MAX_VALUE;
    private static final OpenOption[] DEFAULT_OPEN_OPTIONS = PathUtils.EMPTY_OPEN_OPTION_ARRAY;
    private int bufferSize = 8192;
    private int bufferSizeDefault = 8192;
    private int bufferSizeMax = Integer.MAX_VALUE;
    private Charset charset = Charset.defaultCharset();
    private Charset charsetDefault = Charset.defaultCharset();
    private OpenOption[] openOptions = DEFAULT_OPEN_OPTIONS;
    private final IntUnaryOperator defaultSizeChecker = new IntUnaryOperator() { // from class: org.apache.commons.io.build.AbstractStreamBuilder$$ExternalSyntheticLambda0
        @Override // java.util.function.IntUnaryOperator
        public final int applyAsInt(int i) {
            return this.f$0.m9833lambda$new$0$orgapachecommonsiobuildAbstractStreamBuilder(i);
        }
    };
    private IntUnaryOperator bufferSizeChecker = this.defaultSizeChecker;

    /* renamed from: lambda$new$0$org-apache-commons-io-build-AbstractStreamBuilder, reason: not valid java name */
    /* synthetic */ int m9833lambda$new$0$orgapachecommonsiobuildAbstractStreamBuilder(int size) {
        return size > this.bufferSizeMax ? throwIae(size, this.bufferSizeMax) : size;
    }

    private int checkBufferSize(int size) {
        return this.bufferSizeChecker.applyAsInt(size);
    }

    protected int getBufferSize() {
        return this.bufferSize;
    }

    protected int getBufferSizeDefault() {
        return this.bufferSizeDefault;
    }

    protected CharSequence getCharSequence() throws IOException {
        return checkOrigin().getCharSequence(getCharset());
    }

    public Charset getCharset() {
        return this.charset;
    }

    protected Charset getCharsetDefault() {
        return this.charsetDefault;
    }

    protected InputStream getInputStream() throws IOException {
        return checkOrigin().getInputStream(getOpenOptions());
    }

    protected OpenOption[] getOpenOptions() {
        return this.openOptions;
    }

    protected OutputStream getOutputStream() throws IOException {
        return checkOrigin().getOutputStream(getOpenOptions());
    }

    protected Path getPath() {
        return checkOrigin().getPath();
    }

    protected Writer getWriter() throws IOException {
        return checkOrigin().getWriter(getCharset(), getOpenOptions());
    }

    public B setBufferSize(int bufferSize) {
        this.bufferSize = checkBufferSize(bufferSize > 0 ? bufferSize : this.bufferSizeDefault);
        return asThis();
    }

    public B setBufferSize(Integer bufferSize) {
        setBufferSize(bufferSize != null ? bufferSize.intValue() : this.bufferSizeDefault);
        return asThis();
    }

    public B setBufferSizeChecker(IntUnaryOperator bufferSizeChecker) {
        this.bufferSizeChecker = bufferSizeChecker != null ? bufferSizeChecker : this.defaultSizeChecker;
        return asThis();
    }

    protected B setBufferSizeDefault(int bufferSizeDefault) {
        this.bufferSizeDefault = bufferSizeDefault;
        return asThis();
    }

    public B setBufferSizeMax(int bufferSizeMax) {
        this.bufferSizeMax = bufferSizeMax > 0 ? bufferSizeMax : Integer.MAX_VALUE;
        return asThis();
    }

    public B setCharset(Charset charset) {
        this.charset = Charsets.toCharset(charset, this.charsetDefault);
        return asThis();
    }

    public B setCharset(String str) {
        return (B) setCharset(Charsets.toCharset(str, this.charsetDefault));
    }

    protected B setCharsetDefault(Charset defaultCharset) {
        this.charsetDefault = defaultCharset;
        return asThis();
    }

    public B setOpenOptions(OpenOption... openOptions) {
        this.openOptions = openOptions != null ? openOptions : DEFAULT_OPEN_OPTIONS;
        return asThis();
    }

    private int throwIae(int size, int max) {
        throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(size), Integer.valueOf(max)));
    }
}
