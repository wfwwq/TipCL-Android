package org.apache.commons.compress.archivers.examples;

import java.io.Closeable;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes24.dex */
final class CloseableConsumerAdapter implements Closeable {
    private Closeable closeable;
    private final CloseableConsumer consumer;

    CloseableConsumerAdapter(CloseableConsumer consumer) {
        this.consumer = (CloseableConsumer) Objects.requireNonNull(consumer, "consumer");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closeable != null) {
            this.consumer.accept(this.closeable);
        }
    }

    <C extends Closeable> C track(C closeable) {
        this.closeable = closeable;
        return closeable;
    }
}
