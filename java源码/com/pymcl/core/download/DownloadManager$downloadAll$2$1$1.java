package com.pymcl.core.download;

import com.pymcl.core.download.DownloadManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.Semaphore;

/* compiled from: DownloadManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.core.download.DownloadManager$downloadAll$2$1$1", f = "DownloadManager.kt", i = {0, 0}, l = {209}, m = "invokeSuspend", n = {"$this$launch", "$this$withPermit$iv"}, nl = {210}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadManager$downloadAll$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AtomicInteger $done;
    final /* synthetic */ AtomicLong $doneBytes;
    final /* synthetic */ ConcurrentLinkedQueue<String> $errors;
    final /* synthetic */ AtomicInteger $failed;
    final /* synthetic */ DownloadItem $item;
    final /* synthetic */ List<DownloadItem> $list;
    final /* synthetic */ String $name;
    final /* synthetic */ Function1<DownloadProgress, Unit> $onProgress;
    final /* synthetic */ Semaphore $sem;
    final /* synthetic */ long $t0;
    final /* synthetic */ long $total;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ DownloadManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DownloadManager$downloadAll$2$1$1(Semaphore semaphore, DownloadManager downloadManager, DownloadItem downloadItem, AtomicLong atomicLong, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, ConcurrentLinkedQueue<String> concurrentLinkedQueue, long j, String str, List<DownloadItem> list, long j2, Function1<? super DownloadProgress, Unit> function1, Continuation<? super DownloadManager$downloadAll$2$1$1> continuation) {
        super(2, continuation);
        this.$sem = semaphore;
        this.this$0 = downloadManager;
        this.$item = downloadItem;
        this.$doneBytes = atomicLong;
        this.$done = atomicInteger;
        this.$failed = atomicInteger2;
        this.$errors = concurrentLinkedQueue;
        this.$t0 = j;
        this.$name = str;
        this.$list = list;
        this.$total = j2;
        this.$onProgress = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DownloadManager$downloadAll$2$1$1 downloadManager$downloadAll$2$1$1 = new DownloadManager$downloadAll$2$1$1(this.$sem, this.this$0, this.$item, this.$doneBytes, this.$done, this.$failed, this.$errors, this.$t0, this.$name, this.$list, this.$total, this.$onProgress, continuation);
        downloadManager$downloadAll$2$1$1.L$0 = obj;
        return downloadManager$downloadAll$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DownloadManager$downloadAll$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Semaphore $this$withPermit$iv;
        DownloadManager downloadManager;
        DownloadItem downloadItem;
        final AtomicLong atomicLong;
        ConcurrentLinkedQueue<String> concurrentLinkedQueue;
        CoroutineScope $this$launch;
        long j;
        List<DownloadItem> list;
        Function1<DownloadProgress, Unit> function1;
        long j2;
        String str;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        CoroutineScope $this$launch2 = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                $this$withPermit$iv = this.$sem;
                downloadManager = this.this$0;
                downloadItem = this.$item;
                atomicLong = this.$doneBytes;
                AtomicInteger atomicInteger3 = this.$done;
                AtomicInteger atomicInteger4 = this.$failed;
                concurrentLinkedQueue = this.$errors;
                long j3 = this.$t0;
                String str2 = this.$name;
                List<DownloadItem> list2 = this.$list;
                long j4 = this.$total;
                Function1<DownloadProgress, Unit> function12 = this.$onProgress;
                this.L$0 = $this$launch2;
                this.L$1 = $this$withPermit$iv;
                this.L$2 = downloadManager;
                this.L$3 = downloadItem;
                this.L$4 = atomicLong;
                this.L$5 = atomicInteger3;
                this.L$6 = atomicInteger4;
                this.L$7 = concurrentLinkedQueue;
                this.L$8 = str2;
                this.L$9 = list2;
                this.L$10 = function12;
                this.J$0 = j3;
                this.J$1 = j4;
                $this$launch = $this$launch2;
                this.label = 1;
                if ($this$withPermit$iv.acquire(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = j4;
                list = list2;
                function1 = function12;
                j2 = j3;
                str = str2;
                atomicInteger = atomicInteger4;
                atomicInteger2 = atomicInteger3;
                break;
            case 1:
                long j5 = this.J$1;
                long j6 = this.J$0;
                Function1<DownloadProgress, Unit> function13 = (Function1) this.L$10;
                List<DownloadItem> list3 = (List) this.L$9;
                String str3 = (String) this.L$8;
                concurrentLinkedQueue = (ConcurrentLinkedQueue) this.L$7;
                AtomicInteger atomicInteger5 = (AtomicInteger) this.L$6;
                AtomicInteger atomicInteger6 = (AtomicInteger) this.L$5;
                atomicLong = (AtomicLong) this.L$4;
                downloadItem = (DownloadItem) this.L$3;
                downloadManager = (DownloadManager) this.L$2;
                Semaphore $this$withPermit$iv2 = (Semaphore) this.L$1;
                ResultKt.throwOnFailure($result);
                j = j5;
                j2 = j6;
                function1 = function13;
                list = list3;
                $this$withPermit$iv = $this$withPermit$iv2;
                $this$launch = $this$launch2;
                str = str3;
                atomicInteger = atomicInteger5;
                atomicInteger2 = atomicInteger6;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            final Job job = JobKt.getJob($this$launch.getCoroutineContext());
            try {
                if (downloadManager.isValid(downloadItem)) {
                    Long size = downloadItem.getSize();
                    Boxing.boxLong(atomicLong.addAndGet(size != null ? size.longValue() : downloadItem.getDest().length()));
                } else {
                    downloadManager.download(downloadItem, new Function1() { // from class: com.pymcl.core.download.DownloadManager$downloadAll$2$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DownloadManager$downloadAll$2$1$1.invokeSuspend$lambda$0$0(atomicLong, ((Integer) obj).intValue());
                        }
                    }, new Function0() { // from class: com.pymcl.core.download.DownloadManager$downloadAll$2$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(DownloadManager$downloadAll$2$1$1.invokeSuspend$lambda$0$1(job));
                        }
                    });
                }
                atomicInteger2.incrementAndGet();
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                atomicInteger.incrementAndGet();
                concurrentLinkedQueue.add(downloadItem.getName() + ": " + e2.getMessage());
            }
            DownloadManager.AnonymousClass2.invokeSuspend$emit$default(j2, str, list, atomicInteger2, atomicInteger, j, atomicLong, concurrentLinkedQueue, downloadManager, function1, downloadItem.getName(), false, 2048, null);
            Unit unit = Unit.INSTANCE;
            $this$withPermit$iv.release();
            return Unit.INSTANCE;
        } catch (Throwable e3) {
            $this$withPermit$iv.release();
            throw e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$0(AtomicLong $doneBytes, int n) {
        $doneBytes.addAndGet(n);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0$1(Job $job) {
        return !$job.isActive();
    }
}
