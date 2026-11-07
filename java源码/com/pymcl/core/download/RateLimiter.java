package com.pymcl.core.download;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.ranges.RangesKt;

/* compiled from: DownloadManager.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/pymcl/core/download/RateLimiter;", "", "kbps", "", "<init>", "(I)V", "getKbps", "()I", "setKbps", "avail", "", "last", "", "acquire", "", "n", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RateLimiter {
    private double avail;
    private volatile int kbps;
    private long last = System.nanoTime();

    public RateLimiter(int kbps) {
        this.kbps = kbps;
    }

    public final int getKbps() {
        return this.kbps;
    }

    public final void setKbps(int i) {
        this.kbps = i;
    }

    public final void acquire(int n) {
        long wait;
        if (this.kbps <= 0) {
            return;
        }
        while (true) {
            synchronized (this) {
                long now = System.nanoTime();
                double rate = this.kbps * 1024.0d;
                this.avail = Math.min(rate, this.avail + (((now - this.last) / 1.0E9d) * rate));
                this.last = now;
                if (this.avail >= n || this.avail >= rate) {
                    break;
                }
                wait = RangesKt.coerceIn((long) (((n - this.avail) / rate) * 1000), 1L, 1000L);
                Unit unit = Unit.INSTANCE;
            }
            Thread.sleep(wait);
        }
        this.avail -= n;
    }
}
