package com.pymcl.android.ui.state;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: TaskJobs.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000RN\u0010\b\u001aB\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000b0\u000b \n* \u0012\f\u0012\n \n*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017Ê\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/pymcl/android/ui/state/TaskJobs;", "", "<init>", "()V", "jobs", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlinx/coroutines/Job;", "cancelled", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "kotlin.jvm.PlatformType", "", "register", "", "id", "job", "canCancel", "cancel", "isCancelled", "finish", "size", "", "getSize", "()I", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class TaskJobs {
    public static final int $stable = 8;
    private final ConcurrentHashMap<String, Job> jobs = new ConcurrentHashMap<>();
    private final ConcurrentHashMap.KeySetView<String, Boolean> cancelled = ConcurrentHashMap.newKeySet();

    public final void register(String id, Job job) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(job, "job");
        this.jobs.put(id, job);
    }

    public final boolean canCancel(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (this.cancelled.contains(id)) {
            return false;
        }
        Job job = this.jobs.get(id);
        return job != null && job.isActive();
    }

    public final boolean cancel(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Job j = this.jobs.get(id);
        if (j == null || !j.isActive() || !this.cancelled.add(id)) {
            return false;
        }
        Job.DefaultImpls.cancel$default(j, (CancellationException) null, 1, (Object) null);
        return true;
    }

    public final boolean isCancelled(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.cancelled.contains(id);
    }

    public final void finish(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.jobs.remove(id);
    }

    public final int getSize() {
        return this.jobs.size();
    }
}
