package com.pymcl.core.download;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.pymcl.core.download.DownloadManager;
import com.pymcl.core.net.Http;
import com.pymcl.core.util.FileUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* compiled from: DownloadManager.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u0000 H2\u00020\u0001:\u0002HIB]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0*2\u0006\u0010+\u001a\u00020\u000bJ<\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000b2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0086@¢\u0006\u0002\u00102J\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u000200J\u0010\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000bH\u0002J4\u00108\u001a\u00020\u000f2\u0006\u00105\u001a\u0002002\u0014\b\u0002\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\r2\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u0002040\nJ\u0016\u0010;\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002040\nH\u0002J2\u0010<\u001a\u00020\u000f2\u0006\u00105\u001a\u0002002\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\r2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002040\nH\u0002J<\u0010=\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020?2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\r2\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u0002040\nH\u0002JD\u0010@\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020?2\u0006\u0010A\u001a\u00020\u000e2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\r2\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u0002040\nH\u0002JU\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020D2\u001e\u0010E\u001a\u001a\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0F2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\r2\u000e\b\b\u0010:\u001a\b\u0012\u0004\u0012\u0002040\nH\u0082\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006J"}, d2 = {"Lcom/pymcl/core/download/DownloadManager;", "", "http", "Lcom/pymcl/core/net/Http;", "threads", "", "segments", "limitKbps", "retries", "curseforgeKey", "Lkotlin/Function0;", "", "sleeper", "Lkotlin/Function1;", "", "", "<init>", "(Lcom/pymcl/core/net/Http;IIIILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getThreads", "()I", "setThreads", "(I)V", "getSegments", "setSegments", "getRetries", "setRetries", "getCurseforgeKey", "()Lkotlin/jvm/functions/Function0;", "setCurseforgeKey", "(Lkotlin/jvm/functions/Function0;)V", "limiter", "Lcom/pymcl/core/download/RateLimiter;", "getLimiter", "()Lcom/pymcl/core/download/RateLimiter;", "_progress", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/pymcl/core/download/DownloadProgress;", NotificationCompat.CATEGORY_PROGRESS, "Lkotlinx/coroutines/flow/StateFlow;", "getProgress", "()Lkotlinx/coroutines/flow/StateFlow;", "headersFor", "", "url", "downloadAll", HintConstants.AUTOFILL_HINT_NAME, "items", "", "Lcom/pymcl/core/download/DownloadItem;", "onProgress", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isValid", "", "item", "algoOf", "h", "download", "onBytes", "isCancelled", "checkCancel", "downloadLocked", "downloadSingle", "out", "Ljava/io/File;", "downloadSegmented", "size", "pump", "i", "Ljava/io/InputStream;", "write", "Lkotlin/Function3;", "", "Companion", "NoSegment", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DownloadManager {
    public static final long SEG_MIN = 8388608;
    private final MutableStateFlow<DownloadProgress> _progress;
    private Function0<String> curseforgeKey;
    private final Http http;
    private final RateLimiter limiter;
    private final StateFlow<DownloadProgress> progress;
    private int retries;
    private int segments;
    private final Function1<Long, Unit> sleeper;
    private int threads;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConcurrentHashMap<String, ReentrantLock> destLocks = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadManager(Http http, int threads, int segments, int limitKbps, int retries, Function0<String> curseforgeKey, Function1<? super Long, Unit> sleeper) {
        Intrinsics.checkNotNullParameter(http, "http");
        Intrinsics.checkNotNullParameter(curseforgeKey, "curseforgeKey");
        Intrinsics.checkNotNullParameter(sleeper, "sleeper");
        this.http = http;
        this.threads = threads;
        this.segments = segments;
        this.retries = retries;
        this.curseforgeKey = curseforgeKey;
        this.sleeper = sleeper;
        this.limiter = new RateLimiter(limitKbps);
        this._progress = StateFlowKt.MutableStateFlow(new DownloadProgress(null, 0, 0, 0, 0L, 0L, 0L, null, false, null, 1023, null));
        this.progress = FlowKt.asStateFlow(this._progress);
    }

    public /* synthetic */ DownloadManager(Http http, int i, int i2, int i3, int i4, Function0 function0, Function1 function1, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(http, (i5 & 2) != 0 ? 8 : i, (i5 & 4) != 0 ? 4 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 3 : i4, (i5 & 32) != 0 ? new Function0() { // from class: com.pymcl.core.download.DownloadManager$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DownloadManager._init_$lambda$0();
            }
        } : function0, (i5 & 64) != 0 ? new Function1() { // from class: com.pymcl.core.download.DownloadManager$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DownloadManager._init_$lambda$1(((Long) obj).longValue());
            }
        } : function1);
    }

    public final int getThreads() {
        return this.threads;
    }

    public final void setThreads(int i) {
        this.threads = i;
    }

    public final int getSegments() {
        return this.segments;
    }

    public final void setSegments(int i) {
        this.segments = i;
    }

    public final int getRetries() {
        return this.retries;
    }

    public final void setRetries(int i) {
        this.retries = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "";
    }

    public final Function0<String> getCurseforgeKey() {
        return this.curseforgeKey;
    }

    public final void setCurseforgeKey(Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.curseforgeKey = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(long it) throws InterruptedException {
        Thread.sleep(it);
        return Unit.INSTANCE;
    }

    /* compiled from: DownloadManager.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/pymcl/core/download/DownloadManager$Companion;", "", "<init>", "()V", "SEG_MIN", "", "destLocks", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/locks/ReentrantLock;", "lockOf", "f", "Ljava/io/File;", "lockOf$PyMCL_Android_core", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReentrantLock lockOf$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new ReentrantLock();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReentrantLock lockOf$lambda$1(Function1 $tmp0, Object p0) {
            return (ReentrantLock) $tmp0.invoke(p0);
        }

        public final ReentrantLock lockOf$PyMCL_Android_core(File f) {
            Intrinsics.checkNotNullParameter(f, "f");
            ConcurrentHashMap concurrentHashMap = DownloadManager.destLocks;
            String absolutePath = f.getAbsolutePath();
            final Function1 function1 = new Function1() { // from class: com.pymcl.core.download.DownloadManager$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DownloadManager.Companion.lockOf$lambda$0((String) obj);
                }
            };
            Object objComputeIfAbsent = concurrentHashMap.computeIfAbsent(absolutePath, new Function() { // from class: com.pymcl.core.download.DownloadManager$Companion$$ExternalSyntheticLambda1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return DownloadManager.Companion.lockOf$lambda$1(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objComputeIfAbsent, "computeIfAbsent(...)");
            return (ReentrantLock) objComputeIfAbsent;
        }
    }

    public final RateLimiter getLimiter() {
        return this.limiter;
    }

    public final StateFlow<DownloadProgress> getProgress() {
        return this.progress;
    }

    public final Map<String, String> headersFor(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        LinkedHashMap h = MapsKt.linkedMapOf(TuplesKt.to("User-Agent", "PyMCL/1.0.1"));
        if (StringsKt.contains$default((CharSequence) url, (CharSequence) "api.curseforge.com", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) url, (CharSequence) "/curseforge/v1/", false, 2, (Object) null)) {
            String it = this.curseforgeKey.invoke();
            String it2 = it.length() > 0 ? it : null;
            if (it2 != null) {
                h.put("x-api-key", it2);
            }
        }
        return h;
    }

    /* compiled from: DownloadManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.download.DownloadManager$downloadAll$2", f = "DownloadManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {103}, m = "invokeSuspend", n = {"$this$coroutineScope", "list", "doneBytes", "done", "failed", "errors", "sem", "total", "t0"}, nl = {104}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "J$1"}, v = 2)
    /* renamed from: com.pymcl.core.download.DownloadManager$downloadAll$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<DownloadItem> $items;
        final /* synthetic */ String $name;
        final /* synthetic */ Function1<DownloadProgress, Unit> $onProgress;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ DownloadManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<DownloadItem> list, DownloadManager downloadManager, String str, Function1<? super DownloadProgress, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$items = list;
            this.this$0 = downloadManager;
            this.$name = str;
            this.$onProgress = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$items, this.this$0, this.$name, this.$onProgress, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v16, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v13 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws DownloadError {
            AtomicLong atomicLong;
            AtomicInteger atomicInteger;
            long j;
            ArrayList arrayList;
            AtomicInteger atomicInteger2;
            ConcurrentLinkedQueue concurrentLinkedQueue;
            long j2;
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    List<DownloadItem> list = this.$items;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (hashSet.add(((DownloadItem) obj2).getDest().getAbsolutePath())) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = arrayList2;
                    Iterator it = arrayList3.iterator();
                    long jLongValue = 0;
                    while (it.hasNext()) {
                        Long size = ((DownloadItem) it.next()).getSize();
                        jLongValue += size != null ? size.longValue() : 0L;
                    }
                    AtomicLong atomicLong2 = new AtomicLong();
                    AtomicInteger atomicInteger3 = new AtomicInteger();
                    AtomicInteger atomicInteger4 = new AtomicInteger();
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = new ConcurrentLinkedQueue();
                    long jNanoTime = System.nanoTime();
                    invokeSuspend$emit$default(jNanoTime, this.$name, arrayList3, atomicInteger3, atomicInteger4, jLongValue, atomicLong2, concurrentLinkedQueue2, this.this$0, this.$onProgress, null, false, 3072, null);
                    ArrayList arrayList4 = arrayList3;
                    AtomicInteger atomicInteger5 = atomicInteger3;
                    AtomicLong atomicLong3 = atomicLong2;
                    Semaphore semaphoreSemaphore$default = SemaphoreKt.Semaphore$default(RangesKt.coerceIn(this.this$0.getThreads(), 1, 64), 0, 2, null);
                    ArrayList arrayList5 = arrayList4;
                    DownloadManager downloadManager = this.this$0;
                    String str = this.$name;
                    Function1<DownloadProgress, Unit> function1 = this.$onProgress;
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        Function1<DownloadProgress, Unit> function12 = function1;
                        long j3 = jLongValue;
                        ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue2;
                        long j4 = jNanoTime;
                        AtomicInteger atomicInteger6 = atomicInteger4;
                        Semaphore semaphore = semaphoreSemaphore$default;
                        String str2 = str;
                        arrayList6.add(BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new DownloadManager$downloadAll$2$1$1(semaphore, downloadManager, (DownloadItem) it2.next(), atomicLong3, atomicInteger5, atomicInteger6, concurrentLinkedQueue3, j4, str2, arrayList4, j3, function12, null), 2, null));
                        concurrentLinkedQueue2 = concurrentLinkedQueue3;
                        atomicInteger4 = atomicInteger6;
                        semaphoreSemaphore$default = semaphore;
                        downloadManager = downloadManager;
                        str = str2;
                        arrayList5 = arrayList5;
                        function1 = function12;
                        jLongValue = j3;
                        atomicInteger5 = atomicInteger5;
                        atomicLong3 = atomicLong3;
                        coroutine_suspended = coroutine_suspended;
                        jNanoTime = j4;
                        arrayList4 = arrayList4;
                    }
                    Object obj3 = coroutine_suspended;
                    AtomicInteger atomicInteger7 = atomicInteger4;
                    AtomicInteger atomicInteger8 = atomicInteger5;
                    ArrayList arrayList7 = arrayList4;
                    long j5 = jNanoTime;
                    atomicLong = atomicLong3;
                    long j6 = jLongValue;
                    ConcurrentLinkedQueue concurrentLinkedQueue4 = concurrentLinkedQueue2;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.L$1 = arrayList7;
                    this.L$2 = atomicLong;
                    this.L$3 = atomicInteger8;
                    this.L$4 = atomicInteger7;
                    this.L$5 = concurrentLinkedQueue4;
                    this.L$6 = SpillingKt.nullOutSpilledVariable(semaphoreSemaphore$default);
                    this.J$0 = j6;
                    this.J$1 = j5;
                    this.label = 1;
                    if (AwaitKt.joinAll(arrayList6, this) == obj3) {
                        return obj3;
                    }
                    atomicInteger = atomicInteger8;
                    j = j5;
                    arrayList = arrayList7;
                    atomicInteger2 = atomicInteger7;
                    concurrentLinkedQueue = concurrentLinkedQueue4;
                    j2 = j6;
                    break;
                case 1:
                    j = this.J$1;
                    long j7 = this.J$0;
                    ConcurrentLinkedQueue concurrentLinkedQueue5 = (ConcurrentLinkedQueue) this.L$5;
                    AtomicInteger atomicInteger9 = (AtomicInteger) this.L$4;
                    AtomicInteger atomicInteger10 = (AtomicInteger) this.L$3;
                    AtomicLong atomicLong4 = (AtomicLong) this.L$2;
                    ?? r13 = (List) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    concurrentLinkedQueue = concurrentLinkedQueue5;
                    atomicInteger = atomicInteger10;
                    atomicLong = atomicLong4;
                    atomicInteger2 = atomicInteger9;
                    j2 = j7;
                    arrayList = r13;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            invokeSuspend$emit$default(j, this.$name, arrayList, atomicInteger, atomicInteger2, j2, atomicLong, concurrentLinkedQueue, this.this$0, this.$onProgress, null, true, 1024, null);
            if (concurrentLinkedQueue.isEmpty()) {
                return Unit.INSTANCE;
            }
            throw new DownloadError(concurrentLinkedQueue.size() + " 个文件下载失败：" + CollectionsKt.joinToString$default(CollectionsKt.take(concurrentLinkedQueue, 5), "; ", null, null, 0, null, null, 62, null), null, 2, 0 == true ? 1 : 0);
        }

        static /* synthetic */ void invokeSuspend$emit$default(long j, String str, List list, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, long j2, AtomicLong atomicLong, ConcurrentLinkedQueue concurrentLinkedQueue, DownloadManager downloadManager, Function1 function1, String str2, boolean z, int i, Object obj) {
            invokeSuspend$emit(j, str, list, atomicInteger, atomicInteger2, j2, atomicLong, concurrentLinkedQueue, downloadManager, function1, (i & 1024) != 0 ? "" : str2, (i & 2048) != 0 ? false : z);
        }

        private static final void invokeSuspend$emit(long t0, String $name, List<DownloadItem> list, AtomicInteger done, AtomicInteger failed, long total, AtomicLong doneBytes, ConcurrentLinkedQueue<String> concurrentLinkedQueue, DownloadManager this$0, Function1<? super DownloadProgress, Unit> function1, String cur, boolean fin) {
            double el = (System.nanoTime() - t0) / 1.0E9d;
            DownloadProgress p = new DownloadProgress($name, list.size(), done.get(), failed.get(), total, doneBytes.get(), el > 0.0d ? (long) (doneBytes.get() / el) : 0L, cur, fin, (String) CollectionsKt.firstOrNull(concurrentLinkedQueue));
            this$0._progress.setValue(p);
            if (function1 != null) {
                function1.invoke(p);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object downloadAll$default(DownloadManager downloadManager, String str, List list, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return downloadManager.downloadAll(str, list, function1, continuation);
    }

    public final Object downloadAll(String name, List<DownloadItem> list, Function1<? super DownloadProgress, Unit> function1, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(list, this, name, function1, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final boolean isValid(DownloadItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        File f = item.getDest();
        if (!f.isFile()) {
            return false;
        }
        if (item.getSize() != null && item.getSize().longValue() > 0) {
            long length = f.length();
            Long size = item.getSize();
            if (size == null || length != size.longValue()) {
                return false;
            }
        }
        String hash = item.getHash();
        return (hash == null || hash.length() == 0) || StringsKt.equals(FileUtil.INSTANCE.hash(f, algoOf(item.getHash())), item.getHash(), true);
    }

    private final String algoOf(String h) {
        switch (h.length()) {
            case 32:
                return "MD5";
            case 64:
                return "SHA-256";
            case 128:
                return "SHA-512";
            default:
                return "SHA-1";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void download$default(DownloadManager downloadManager, DownloadItem downloadItem, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: com.pymcl.core.download.DownloadManager$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DownloadManager.download$lambda$0(((Integer) obj2).intValue());
                }
            };
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.pymcl.core.download.DownloadManager$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(DownloadManager.download$lambda$1());
                }
            };
        }
        downloadManager.download(downloadItem, function1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit download$lambda$0(int it) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean download$lambda$1() {
        return false;
    }

    public final void download(DownloadItem item, Function1<? super Integer, Unit> onBytes, Function0<Boolean> isCancelled) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onBytes, "onBytes");
        Intrinsics.checkNotNullParameter(isCancelled, "isCancelled");
        ReentrantLock lock = INSTANCE.lockOf$PyMCL_Android_core(item.getDest());
        boolean waited = !lock.tryLock();
        if (waited) {
            lock.lock();
        }
        if (waited) {
            try {
                if (isValid(item)) {
                    return;
                }
            } finally {
                lock.unlock();
            }
        }
        downloadLocked(item, onBytes, isCancelled);
    }

    private final void checkCancel(Function0<Boolean> isCancelled) {
        if (isCancelled.invoke().booleanValue()) {
            throw new CancellationException("下载已取消");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024d A[Catch: CancellationException -> 0x02b4, TryCatch #14 {CancellationException -> 0x02b4, blocks: (B:12:0x005a, B:109:0x023c, B:111:0x024d, B:115:0x0282, B:117:0x0288, B:118:0x029a, B:121:0x02a6, B:122:0x02b3), top: B:147:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0288 A[Catch: CancellationException -> 0x02b4, TryCatch #14 {CancellationException -> 0x02b4, blocks: (B:12:0x005a, B:109:0x023c, B:111:0x024d, B:115:0x0282, B:117:0x0288, B:118:0x029a, B:121:0x02a6, B:122:0x02b3), top: B:147:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void downloadLocked(com.pymcl.core.download.DownloadItem r25, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r26, kotlin.jvm.functions.Function0<java.lang.Boolean> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.download.DownloadManager.downloadLocked(com.pymcl.core.download.DownloadItem, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadLocked$lambda$0(AtomicLong $counted, Function1 $onBytes, int it) {
        $counted.addAndGet(it);
        $onBytes.invoke(Integer.valueOf(it));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ long downloadSingle$default(DownloadManager downloadManager, String str, File file, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: com.pymcl.core.download.DownloadManager$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(DownloadManager.downloadSingle$lambda$0());
                }
            };
        }
        return downloadManager.downloadSingle(str, file, function1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean downloadSingle$lambda$0() {
        return false;
    }

    private final long downloadSingle(String url, File out, Function1<? super Integer, Unit> onBytes, Function0<Boolean> isCancelled) {
        Throwable th;
        Throwable th2;
        FileOutputStream o;
        byte[] buf$iv;
        long n;
        FileOutputStream o2;
        InputStream ins = (InputStream) Http.openStream$default(this.http, url, headersFor(url), 0, 4, null).component3();
        long n2 = 0;
        InputStream inputStream = ins;
        try {
            InputStream i = inputStream;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(out);
                try {
                    o = fileOutputStream;
                    buf$iv = new byte[32768];
                } catch (Throwable th3) {
                    th2 = th3;
                }
                while (true) {
                    try {
                        checkCancel(isCancelled);
                        int r$iv = i.read(buf$iv);
                        if (r$iv >= 0) {
                            InputStream ins2 = ins;
                            try {
                                this.limiter.acquire(r$iv);
                                n = n2;
                                try {
                                    o.write(buf$iv, 0, r$iv);
                                    n2 = n + r$iv;
                                    o2 = o;
                                    try {
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                th2 = th6;
                            }
                            try {
                                onBytes.invoke(Integer.valueOf(r$iv));
                                ins = ins2;
                                o = o2;
                            } catch (Throwable th7) {
                                th = th7;
                                th2 = th;
                                throw th2;
                            }
                        } else {
                            n = n2;
                            try {
                                Unit unit = Unit.INSTANCE;
                                try {
                                    CloseableKt.closeFinally(fileOutputStream, null);
                                    Unit unit2 = Unit.INSTANCE;
                                    CloseableKt.closeFinally(inputStream, null);
                                    return n;
                                } catch (Throwable th8) {
                                    th = th8;
                                    try {
                                        throw th;
                                    } catch (Throwable th9) {
                                        CloseableKt.closeFinally(inputStream, th);
                                        throw th9;
                                    }
                                }
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        }
                        th2 = th;
                    } catch (Throwable th11) {
                        th2 = th11;
                    }
                    try {
                        throw th2;
                    } catch (Throwable th12) {
                        try {
                            CloseableKt.closeFinally(fileOutputStream, th2);
                            throw th12;
                        } catch (Throwable th13) {
                            th = th13;
                            throw th;
                        }
                    }
                }
            } catch (Throwable th14) {
                th = th14;
                th = th;
                throw th;
            }
        } catch (Throwable th15) {
            th = th15;
        }
    }

    static /* synthetic */ void downloadSegmented$default(DownloadManager downloadManager, String str, File file, long j, Function1 function1, Function0 function0, int i, Object obj) throws Throwable {
        if ((i & 16) != 0) {
            function0 = new Function0() { // from class: com.pymcl.core.download.DownloadManager$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(DownloadManager.downloadSegmented$lambda$0());
                }
            };
        }
        downloadManager.downloadSegmented(str, file, j, function1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean downloadSegmented$lambda$0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void downloadSegmented(final String url, final File out, long size, final Function1<? super Integer, Unit> onBytes, final Function0<Boolean> isCancelled) throws Throwable {
        Object next;
        boolean z;
        RandomAccessFile randomAccessFile = new RandomAccessFile(out, "rw");
        try {
            randomAccessFile.setLength(size);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(randomAccessFile, null);
            int iCoerceAtMost = RangesKt.coerceAtMost(this.segments, RangesKt.coerceAtLeast((int) (size / 1048576), 1));
            long j = size / iCoerceAtMost;
            final List listSynchronizedList = Collections.synchronizedList(new ArrayList());
            final AtomicLong atomicLong = new AtomicLong();
            boolean z2 = false;
            IntRange intRangeUntil = RangesKt.until(0, iCoerceAtMost);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                IntRange intRange = intRangeUntil;
                final long j2 = iNextInt * j;
                ArrayList arrayList2 = arrayList;
                final long j3 = iNextInt == iCoerceAtMost + (-1) ? size - 1 : (j2 + j) - 1;
                Thread thread = new Thread(new Runnable() { // from class: com.pymcl.core.download.DownloadManager$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        DownloadManager.downloadSegmented$lambda$2$0(this.f$0, url, j2, j3, out, listSynchronizedList, isCancelled, atomicLong, onBytes);
                    }
                });
                thread.start();
                arrayList2.add(thread);
                arrayList = arrayList2;
                intRangeUntil = intRange;
                iCoerceAtMost = iCoerceAtMost;
                z2 = false;
            }
            boolean z3 = z2;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Thread) it2.next()).join();
            }
            Intrinsics.checkNotNull(listSynchronizedList);
            Iterator it3 = listSynchronizedList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it3.next();
                    if (((Throwable) next) instanceof CancellationException) {
                        break;
                    }
                }
            }
            Throwable th = (Throwable) next;
            if (th != null) {
                throw th;
            }
            List list = listSynchronizedList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z = z3;
                        break;
                    } else if (((Throwable) it4.next()) instanceof NoSegment) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = z3;
            }
            if (!z) {
                Throwable th2 = (Throwable) CollectionsKt.firstOrNull(listSynchronizedList);
                if (th2 != null) {
                    throw th2;
                }
            } else {
                onBytes.invoke(Integer.valueOf(-((int) atomicLong.get())));
                out.delete();
                Unit unit2 = Unit.INSTANCE;
                long jDownloadSingle = downloadSingle(url, out, onBytes, isCancelled);
                if (jDownloadSingle == size) {
                } else {
                    throw new DownloadError("文件不完整 " + out.getName() + ": 期望 " + size + " 字节，实得 " + jDownloadSingle + " 字节", null, 2, 0 == true ? 1 : 0);
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadSegmented$lambda$2$0(DownloadManager this$0, String $url, long $from, long $to, File $out, List $errs, Function0 $isCancelled, AtomicLong $segBytes, Function1 $onBytes) {
        Throwable th;
        Throwable th2;
        Function0 isCancelled$iv;
        InputStream i$iv;
        DownloadManager this_$iv;
        byte[] buf$iv;
        try {
            Triple tripleOpenStream$default = Http.openStream$default(this$0.http, $url, MapsKt.plus(this$0.headersFor($url), TuplesKt.to("Range", "bytes=" + $from + "-" + $to)), 0, 4, null);
            int code = ((Number) tripleOpenStream$default.component1()).intValue();
            InputStream ins = (InputStream) tripleOpenStream$default.component3();
            try {
                if (code != 206) {
                    ins.close();
                    throw new NoSegment();
                }
                long got = 0;
                try {
                    InputStream randomAccessFile = new RandomAccessFile($out, "rw");
                    try {
                        try {
                            RandomAccessFile raf = randomAccessFile;
                            raf.seek($from);
                            randomAccessFile = ins;
                            try {
                                InputStream it = randomAccessFile;
                                isCancelled$iv = $isCancelled;
                                i$iv = it;
                                this_$iv = this$0;
                                buf$iv = new byte[32768];
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                            while (true) {
                                InputStream ins2 = ins;
                                Function0 isCancelled$iv2 = isCancelled$iv;
                                int code2 = code;
                                DownloadManager this_$iv2 = this_$iv;
                                try {
                                    this_$iv2.checkCancel(isCancelled$iv2);
                                    InputStream i$iv2 = i$iv;
                                    int r$iv = i$iv2.read(buf$iv);
                                    if (r$iv < 0) {
                                        break;
                                    }
                                    byte[] buf$iv2 = buf$iv;
                                    this_$iv2.limiter.acquire(r$iv);
                                    raf.write(buf$iv2, 0, r$iv);
                                    got += r$iv;
                                    try {
                                        $segBytes.addAndGet(r$iv);
                                        try {
                                            $onBytes.invoke(Integer.valueOf(r$iv));
                                            code = code2;
                                            buf$iv = buf$iv2;
                                            isCancelled$iv = isCancelled$iv2;
                                            ins = ins2;
                                            this_$iv = this_$iv2;
                                            i$iv = i$iv2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th2 = th;
                                        throw th2;
                                    }
                                    th = th4;
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                th2 = th;
                                try {
                                    throw th2;
                                } finally {
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(randomAccessFile, null);
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(randomAccessFile, null);
                            if (got != ($to - $from) + 1) {
                                throw new IOException("分片不完整 bytes=" + $from + "-" + $to + "：实得 " + got + " 字节");
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            try {
                                throw th2;
                            } finally {
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        throw th2;
                    }
                } catch (Throwable th9) {
                    e = th9;
                    $errs.add(e);
                }
            } catch (Throwable th10) {
                e = th10;
                $errs.add(e);
            }
        } catch (Throwable th11) {
            e = th11;
        }
    }

    /* compiled from: DownloadManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pymcl/core/download/DownloadManager$NoSegment;", "Ljava/io/IOException;", "<init>", "()V", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    private static final class NoSegment extends IOException {
        public NoSegment() {
            super("服务器不支持分片");
        }
    }

    private final void pump(InputStream i, Function3<? super byte[], ? super Integer, ? super Integer, Unit> write, Function1<? super Integer, Unit> onBytes, Function0<Boolean> isCancelled) throws IOException {
        byte[] buf = new byte[32768];
        while (true) {
            checkCancel(isCancelled);
            int r = i.read(buf);
            if (r < 0) {
                return;
            }
            this.limiter.acquire(r);
            write.invoke(buf, 0, Integer.valueOf(r));
            onBytes.invoke(Integer.valueOf(r));
        }
    }
}
