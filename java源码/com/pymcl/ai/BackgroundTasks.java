package com.pymcl.ai;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.pymcl.ai.BgClearResult;
import com.pymcl.ai.BgTaskInfo;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.lwjgl.util.freetype.FreeType;

/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 D2\u00020\u0001:\u0001DB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001d\u001a\u00020\u0016H\u0002J&\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\n2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0002J|\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\n2E\u0010'\u001aA\b\u0001\u0012'\u0012%\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160(¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0012\u0006\u0012\u0004\u0018\u00010\u00010(¢\u0006\u0002\u0010/J\u000e\u00100\u001a\u0002012\u0006\u0010\u001f\u001a\u00020\nJ8\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b062\u0006\u0010\"\u001a\u00020\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\n082\f\u00109\u001a\b\u0012\u0004\u0012\u00020\n08H\u0086@¢\u0006\u0002\u0010:J\u0010\u0010;\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\nJ\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\nJ\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b062\u0006\u0010\"\u001a\u00020\nJ\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000b062\u0006\u0010\"\u001a\u00020\nJ\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b062\u0006\u0010\"\u001a\u00020\nJ\u001c\u0010@\u001a\u00020A2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010B\u001a\u000201J\u000e\u0010C\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\nR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000RN\u00102\u001aB\u0012\f\u0012\n 4*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n 4*\u0004\u0018\u00010101 4* \u0012\f\u0012\n 4*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n 4*\u0004\u0018\u00010101\u0018\u00010303X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/pymcl/ai/BackgroundTasks;", "", "file", "Ljava/io/File;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljava/io/File;Lkotlinx/coroutines/CoroutineScope;)V", "tasks", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/pymcl/ai/BgTaskInfo;", "jobs", "Lkotlinx/coroutines/Job;", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "onFinished", "Lkotlin/Function1;", "", "getOnFinished", "()Lkotlin/jvm/functions/Function1;", "setOnFinished", "(Lkotlin/jvm/functions/Function1;)V", "seq", "", "persist", "update", "id", "f", "start", "chatId", "callId", "tool", "title", "turnId", "block", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, NotificationCompat.CATEGORY_PROGRESS, "Lkotlin/coroutines/Continuation;", "Lcom/pymcl/ai/ToolOutput;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "cancel", "", "silentCancel", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "kotlin.jvm.PlatformType", "cancelForRewind", "", "turnIds", "", "callIds", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", SettingsProtocol.GET, "list", "running", "unreported", "takeFinished", "clearFinished", "Lcom/pymcl/ai/BgClearResult;", "keepUnreported", "dropChat", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BackgroundTasks {
    public static final int KEEP_REPORTED = 30;
    public static final int MAX_RESULT = 3000;
    private final MutableSharedFlow<BgTaskInfo> _events;
    private final SharedFlow<BgTaskInfo> events;
    private final File file;
    private final ConcurrentHashMap<String, Job> jobs;
    private volatile Function1<? super BgTaskInfo, Unit> onFinished;
    private final CoroutineScope scope;
    private int seq;
    private final ConcurrentHashMap.KeySetView<String, Boolean> silentCancel;
    private final ConcurrentHashMap<String, BgTaskInfo> tasks;

    /* compiled from: Background.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.BackgroundTasks", f = "Background.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {116}, m = "cancelForRewind", n = {"chatId", "turnIds", "callIds", "hit", "$this$forEach$iv", "element$iv", "t"}, nl = {172}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7"}, v = 2)
    /* renamed from: com.pymcl.ai.BackgroundTasks$cancelForRewind$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BackgroundTasks.this.cancelForRewind(null, null, null, this);
        }
    }

    public BackgroundTasks(File file, CoroutineScope scope) {
        Object objM8116constructorimpl;
        int $i$f$forEach;
        ConcurrentHashMap<String, BgTaskInfo> concurrentHashMap;
        String str;
        BgTaskInfo bgTaskInfoCopy;
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.file = file;
        this.scope = scope;
        this.tasks = new ConcurrentHashMap<>();
        this.jobs = new ConcurrentHashMap<>();
        this._events = SharedFlowKt.MutableSharedFlow$default(0, 256, null, 5, null);
        this.events = this._events;
        File it = this.file;
        if (it != null) {
            it = it.isFile() ? it : null;
            if (it != null) {
                File f = it;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    BackgroundTasks backgroundTasks = this;
                    objM8116constructorimpl = Result.m8116constructorimpl(FileUtil.INSTANCE.readJsonObj(f));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                Map map = (Map) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
                Iterable $this$map$iv = JsonKt.objs(map != null ? JsonKt.arr(map, "tasks") : null);
                BgTaskInfo.Companion companion3 = BgTaskInfo.INSTANCE;
                Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
                for (Object item$iv$iv : $this$map$iv) {
                    Map p0 = (Map) item$iv$iv;
                    destination$iv$iv.add(companion3.from(p0));
                }
                Iterable $this$forEach$iv = (List) destination$iv$iv;
                int $i$f$forEach2 = 0;
                for (Object element$iv : $this$forEach$iv) {
                    BgTaskInfo t = (BgTaskInfo) element$iv;
                    ConcurrentHashMap<String, BgTaskInfo> concurrentHashMap2 = this.tasks;
                    String id = t.getId();
                    if (Intrinsics.areEqual(t.getState(), "running")) {
                        $i$f$forEach = $i$f$forEach2;
                        concurrentHashMap = concurrentHashMap2;
                        str = id;
                        bgTaskInfoCopy = t.copy((7135 & 1) != 0 ? t.id : null, (7135 & 2) != 0 ? t.chatId : null, (7135 & 4) != 0 ? t.callId : null, (7135 & 8) != 0 ? t.tool : null, (7135 & 16) != 0 ? t.title : null, (7135 & 32) != 0 ? t.state : "interrupted", (7135 & 64) != 0 ? t.progress : null, (7135 & 128) != 0 ? t.detail : null, (7135 & 256) != 0 ? t.result : null, (7135 & 512) != 0 ? t.startedAt : 0L, (7135 & 1024) != 0 ? t.finishedAt : System.currentTimeMillis(), (7135 & 2048) != 0 ? t.reported : false, (7135 & 4096) != 0 ? t.turnId : null);
                    } else {
                        $i$f$forEach = $i$f$forEach2;
                        concurrentHashMap = concurrentHashMap2;
                        str = id;
                        bgTaskInfoCopy = t;
                    }
                    concurrentHashMap.put(str, bgTaskInfoCopy);
                    $i$f$forEach2 = $i$f$forEach;
                }
            }
        }
        this.silentCancel = ConcurrentHashMap.newKeySet();
    }

    public /* synthetic */ BackgroundTasks(File file, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO())) : coroutineScope);
    }

    public final SharedFlow<BgTaskInfo> getEvents() {
        return this.events;
    }

    public final Function1<BgTaskInfo, Unit> getOnFinished() {
        return this.onFinished;
    }

    public final void setOnFinished(Function1<? super BgTaskInfo, Unit> function1) {
        this.onFinished = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void persist() {
        File f = this.file;
        if (f == null) {
            return;
        }
        synchronized (this) {
            Iterable iterableValues = this.tasks.values();
            Intrinsics.checkNotNullExpressionValue(iterableValues, "<get-values>(...)");
            Iterable $this$sortedBy$iv = iterableValues;
            Iterable all = CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.pymcl.ai.BackgroundTasks$persist$lambda$0$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    BgTaskInfo it = (BgTaskInfo) t;
                    BgTaskInfo it2 = (BgTaskInfo) t2;
                    return ComparisonsKt.compareValues(Long.valueOf(it.getStartedAt()), Long.valueOf(it2.getStartedAt()));
                }
            });
            Iterable $this$filter$iv = all;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                BgTaskInfo it = (BgTaskInfo) element$iv$iv;
                if (it.getReported()) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }
            Iterable $this$map$iv = CollectionsKt.dropLast((List) destination$iv$iv, 30);
            Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                BgTaskInfo it2 = (BgTaskInfo) item$iv$iv;
                destination$iv$iv2.add(it2.getId());
            }
            Iterable $this$filter$iv2 = (List) destination$iv$iv2;
            Collection destination$iv$iv3 = new ArrayList();
            for (Object element$iv$iv2 : $this$filter$iv2) {
                String it3 = (String) element$iv$iv2;
                if (!((ConcurrentHashMap.KeySetView) this.jobs.keySet()).contains(it3)) {
                    destination$iv$iv3.add(element$iv$iv2);
                }
            }
            Iterable drop = (List) destination$iv$iv3;
            Iterable $this$forEach$iv = drop;
            for (Object element$iv : $this$forEach$iv) {
                String it4 = (String) element$iv;
                this.tasks.remove(it4);
            }
            Iterable iterableValues2 = this.tasks.values();
            Intrinsics.checkNotNullExpressionValue(iterableValues2, "<get-values>(...)");
            Iterable $this$sortedBy$iv2 = iterableValues2;
            Iterable l = CollectionsKt.sortedWith($this$sortedBy$iv2, new Comparator() { // from class: com.pymcl.ai.BackgroundTasks$persist$lambda$0$$inlined$sortedBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    BgTaskInfo it5 = (BgTaskInfo) t;
                    BgTaskInfo it6 = (BgTaskInfo) t2;
                    return ComparisonsKt.compareValues(Long.valueOf(it5.getStartedAt()), Long.valueOf(it6.getStartedAt()));
                }
            });
            Iterable $this$filter$iv3 = l;
            Collection destination$iv$iv4 = new ArrayList();
            for (Object element$iv$iv3 : $this$filter$iv3) {
                BgTaskInfo it5 = (BgTaskInfo) element$iv$iv3;
                if (!it5.getReported()) {
                    destination$iv$iv4.add(element$iv$iv3);
                }
            }
            Collection collection = (List) destination$iv$iv4;
            Iterable $this$filter$iv4 = l;
            Collection destination$iv$iv5 = new ArrayList();
            for (Object element$iv$iv4 : $this$filter$iv4) {
                BgTaskInfo it6 = (BgTaskInfo) element$iv$iv4;
                if (it6.getReported()) {
                    destination$iv$iv5.add(element$iv$iv4);
                }
            }
            Iterable keep = CollectionsKt.plus(collection, (Iterable) CollectionsKt.takeLast((List) destination$iv$iv5, 30));
            try {
                Result.Companion companion = Result.INSTANCE;
                BackgroundTasks $this$persist_u24lambda_u240_u247 = this;
                FileUtil fileUtil = FileUtil.INSTANCE;
                Pair[] pairArr = new Pair[2];
                pairArr[0] = TuplesKt.to("version", 1L);
                Iterable $this$map$iv2 = keep;
                Collection destination$iv$iv6 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
                for (Object item$iv$iv2 : $this$map$iv2) {
                    BgTaskInfo it7 = (BgTaskInfo) item$iv$iv2;
                    destination$iv$iv6.add(it7.toJson());
                    $this$persist_u24lambda_u240_u247 = $this$persist_u24lambda_u240_u247;
                }
                pairArr[1] = TuplesKt.to("tasks", CollectionsKt.toMutableList(destination$iv$iv6));
                Result.m8116constructorimpl(Boolean.valueOf(fileUtil.writeJson(f, JsonKt.jobj(pairArr))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BgTaskInfo update(String id, final Function1<? super BgTaskInfo, BgTaskInfo> f) {
        ConcurrentHashMap<String, BgTaskInfo> concurrentHashMap = this.tasks;
        final Function2 function2 = new Function2() { // from class: com.pymcl.ai.BackgroundTasks$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BackgroundTasks.update$lambda$0(f, (String) obj, (BgTaskInfo) obj2);
            }
        };
        BgTaskInfo n = concurrentHashMap.computeIfPresent(id, new BiFunction() { // from class: com.pymcl.ai.BackgroundTasks$$ExternalSyntheticLambda5
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return BackgroundTasks.update$lambda$1(function2, obj, obj2);
            }
        });
        if (n == null) {
            return null;
        }
        this._events.tryEmit(n);
        return n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BgTaskInfo update$lambda$0(Function1 $f, String str, BgTaskInfo t) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(t, "t");
        return (BgTaskInfo) $f.invoke(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BgTaskInfo update$lambda$1(Function2 $tmp0, Object p0, Object p1) {
        return (BgTaskInfo) $tmp0.invoke(p0, p1);
    }

    public static /* synthetic */ String start$default(BackgroundTasks backgroundTasks, String str, String str2, String str3, String str4, String str5, Function2 function2, int i, Object obj) {
        if ((i & 16) != 0) {
            str5 = "";
        }
        return backgroundTasks.start(str, str2, str3, str4, str5, function2);
    }

    public final String start(String chatId, String callId, String tool, String title, String turnId, Function2<? super Function2<? super Float, ? super String, Unit>, ? super Continuation<? super ToolOutput>, ? extends Object> block) {
        String id;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(tool, "tool");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(turnId, "turnId");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this) {
            String string = Long.toString(System.currentTimeMillis(), CharsKt.checkRadix(36));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.seq++;
            id = "bg-" + string + "-" + this.seq;
        }
        BgTaskInfo t = new BgTaskInfo(id, chatId, callId, tool, title, "running", null, "后台运行中", null, 0L, 0L, false, turnId, FreeType.FT_Mod_Err_Raster, null);
        this.tasks.put(id, t);
        this._events.tryEmit(t);
        persist();
        Job job = BuildersKt__Builders_commonKt.launch$default(this.scope, null, CoroutineStart.LAZY, new BackgroundTasks$start$job$1(block, this, id, null), 1, null);
        this.jobs.put(id, job);
        job.start();
        return id;
    }

    public final boolean cancel(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Job it = this.jobs.get(id);
        if (it == null) {
            return false;
        }
        Job.DefaultImpls.cancel$default(it, (CancellationException) null, 1, (Object) null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x016d -> B:48:0x0179). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0181 -> B:50:0x0184). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cancelForRewind(java.lang.String r18, java.util.Set<java.lang.String> r19, java.util.Set<java.lang.String> r20, kotlin.coroutines.Continuation<? super java.util.List<com.pymcl.ai.BgTaskInfo>> r21) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.BackgroundTasks.cancelForRewind(java.lang.String, java.util.Set, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BgTaskInfo cancelForRewind$lambda$3$0(String str, BgTaskInfo x) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(x, "x");
        return x.getRunning() ? x : x.copy((7135 & 1) != 0 ? x.id : null, (7135 & 2) != 0 ? x.chatId : null, (7135 & 4) != 0 ? x.callId : null, (7135 & 8) != 0 ? x.tool : null, (7135 & 16) != 0 ? x.title : null, (7135 & 32) != 0 ? x.state : null, (7135 & 64) != 0 ? x.progress : null, (7135 & 128) != 0 ? x.detail : null, (7135 & 256) != 0 ? x.result : null, (7135 & 512) != 0 ? x.startedAt : 0L, (7135 & 1024) != 0 ? x.finishedAt : 0L, (7135 & 2048) != 0 ? x.reported : true, (7135 & 4096) != 0 ? x.turnId : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BgTaskInfo cancelForRewind$lambda$3$1(Function2 $tmp0, Object p0, Object p1) {
        return (BgTaskInfo) $tmp0.invoke(p0, p1);
    }

    public final BgTaskInfo get(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.tasks.get(id);
    }

    public static /* synthetic */ List list$default(BackgroundTasks backgroundTasks, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return backgroundTasks.list(str);
    }

    public final List<BgTaskInfo> list(String chatId) {
        Iterable iterableValues = this.tasks.values();
        Intrinsics.checkNotNullExpressionValue(iterableValues, "<get-values>(...)");
        Iterable $this$filter$iv = iterableValues;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            BgTaskInfo it = (BgTaskInfo) element$iv$iv;
            if (chatId == null || Intrinsics.areEqual(it.getChatId(), chatId)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$sortedBy$iv = (List) destination$iv$iv;
        return CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.pymcl.ai.BackgroundTasks$list$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                BgTaskInfo it2 = (BgTaskInfo) t;
                BgTaskInfo it3 = (BgTaskInfo) t2;
                return ComparisonsKt.compareValues(Long.valueOf(it2.getStartedAt()), Long.valueOf(it3.getStartedAt()));
            }
        });
    }

    public final List<BgTaskInfo> running(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Iterable $this$filter$iv = list(chatId);
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            BgTaskInfo it = (BgTaskInfo) element$iv$iv;
            if (it.getRunning()) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        return (List) destination$iv$iv;
    }

    public final List<BgTaskInfo> unreported(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Iterable $this$filter$iv = list(chatId);
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            BgTaskInfo it = (BgTaskInfo) element$iv$iv;
            if ((it.getRunning() || it.getReported()) ? false : true) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        return (List) destination$iv$iv;
    }

    public final List<BgTaskInfo> takeFinished(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        List list = unreported(chatId);
        if (list.isEmpty()) {
            return list;
        }
        List $this$forEach$iv = list;
        for (Object element$iv : $this$forEach$iv) {
            BgTaskInfo t = (BgTaskInfo) element$iv;
            ConcurrentHashMap<String, BgTaskInfo> concurrentHashMap = this.tasks;
            String id = t.getId();
            final Function2 function2 = new Function2() { // from class: com.pymcl.ai.BackgroundTasks$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BackgroundTasks.takeFinished$lambda$0$0((String) obj, (BgTaskInfo) obj2);
                }
            };
            concurrentHashMap.computeIfPresent(id, new BiFunction() { // from class: com.pymcl.ai.BackgroundTasks$$ExternalSyntheticLambda1
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return BackgroundTasks.takeFinished$lambda$0$1(function2, obj, obj2);
                }
            });
        }
        persist();
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BgTaskInfo takeFinished$lambda$0$0(String str, BgTaskInfo x) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(x, "x");
        return x.copy((7135 & 1) != 0 ? x.id : null, (7135 & 2) != 0 ? x.chatId : null, (7135 & 4) != 0 ? x.callId : null, (7135 & 8) != 0 ? x.tool : null, (7135 & 16) != 0 ? x.title : null, (7135 & 32) != 0 ? x.state : null, (7135 & 64) != 0 ? x.progress : null, (7135 & 128) != 0 ? x.detail : null, (7135 & 256) != 0 ? x.result : null, (7135 & 512) != 0 ? x.startedAt : 0L, (7135 & 1024) != 0 ? x.finishedAt : 0L, (7135 & 2048) != 0 ? x.reported : true, (7135 & 4096) != 0 ? x.turnId : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BgTaskInfo takeFinished$lambda$0$1(Function2 $tmp0, Object p0, Object p1) {
        return (BgTaskInfo) $tmp0.invoke(p0, p1);
    }

    public static /* synthetic */ BgClearResult clearFinished$default(BackgroundTasks backgroundTasks, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return backgroundTasks.clearFinished(str, z);
    }

    public final BgClearResult clearFinished(String chatId, boolean keepUnreported) {
        BgClearResult res;
        synchronized (this) {
            BgClearResult.Companion companion = BgClearResult.INSTANCE;
            List<BgTaskInfo> list = list(chatId);
            Set<String> setKeySet = this.jobs.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
            res = companion.select(list, keepUnreported, setKeySet);
            Iterable $this$forEach$iv = res.getRemovedIds();
            for (Object element$iv : $this$forEach$iv) {
                String it = (String) element$iv;
                this.tasks.remove(it);
            }
        }
        if (res.getRemoved() > 0) {
            persist();
        }
        return res;
    }

    public final void dropChat(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Iterable $this$forEach$iv = list(chatId);
        for (Object element$iv : $this$forEach$iv) {
            BgTaskInfo it = (BgTaskInfo) element$iv;
            cancel(it.getId());
            this.tasks.remove(it.getId());
        }
        persist();
    }
}
