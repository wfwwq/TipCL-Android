package com.pymcl.android.ui.state;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.ModUpdateWatcher;
import com.pymcl.runtime.settings.CrossProcessPrefs;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ModUpdateWatcher.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\tJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\tJ\u000e\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020\rJ\b\u0010)\u001a\u00020#H\u0002J \u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\rH\u0086@¢\u0006\u0002\u00100J$\u00101\u001a\u00020#2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001b03R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR)\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0 0\u001a¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eÊ\u0001\f\b6\u0012\b\b7\u0012\u0004\b\u0003\u0010\u0000¨\u00065"}, d2 = {"Lcom/pymcl/android/ui/state/ModUpdateWatcher;", "", "state", "Lcom/pymcl/android/ui/state/AppState;", "<init>", "(Lcom/pymcl/android/ui/state/AppState;)V", SettingsProtocol.PATH, "Lcom/pymcl/android/ui/state/ModWatchPrefs;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "loop", "Lkotlinx/coroutines/Job;", "<set-?>", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled$delegate", "Landroidx/compose/runtime/MutableState;", "checking", "getChecking", "setChecking", "checking$delegate", "counts", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "", "getCounts", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "details", "", "getDetails", "attach", "", "p", "Lcom/pymcl/runtime/settings/CrossProcessPrefs;", "s", "switchTo", "on", "startLoop", "checkInstance", "instance", "version", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAll", "notify", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumed", "files", "", "Companion", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ModUpdateWatcher {
    public static final int MAX_VERSIONS = 3;
    public static final String SUMMARY_ITEM = "{0} {1} 个";

    /* renamed from: checking$delegate, reason: from kotlin metadata */
    private final MutableState checking;
    private final SnapshotStateMap<String, Integer> counts;
    private final SnapshotStateMap<String, Map<String, String>> details;

    /* renamed from: enabled$delegate, reason: from kotlin metadata */
    private final MutableState enabled;
    private Job loop;
    private ModWatchPrefs prefs;
    private CoroutineScope scope;
    private final AppState state;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ModUpdateWatcher.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.ModUpdateWatcher", f = "ModUpdateWatcher.kt", i = {0, 0, 1, 1, 1}, l = {109, 110}, m = "checkAll", n = {"$this$checkAll_u24lambda_u240\\1", "notify", "names", "i", "notify"}, nl = {124, 111}, s = {"L$0", "Z$0", "L$0", "L$2", "Z$0"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.ModUpdateWatcher$checkAll$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ModUpdateWatcher.this.checkAll(false, this);
        }
    }

    /* compiled from: ModUpdateWatcher.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.ModUpdateWatcher", f = "ModUpdateWatcher.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {95, 98}, m = "checkInstance", n = {"instance", "version", "$this$checkInstance_u24lambda_u240\\1", "instance", "version", "versions", SettingsProtocol.EXTRA_VALUE, "$this$checkInstance_u24lambda_u243\\8", "n"}, nl = {95, 98}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.ModUpdateWatcher$checkInstance$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ModUpdateWatcher.this.checkInstance(null, null, this);
        }
    }

    /* compiled from: ModUpdateWatcher.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/pymcl/android/ui/state/ModUpdateWatcher$Companion;", "", "<init>", "()V", "MAX_VERSIONS", "", "SUMMARY_ITEM", "", "summarize", "counts", "", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence summarize$lambda$1(Map.Entry it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return I18nKt.tr(ModUpdateWatcher.SUMMARY_ITEM, it.getKey(), it.getValue());
        }

        public final String summarize(Map<String, Integer> counts) {
            Intrinsics.checkNotNullParameter(counts, "counts");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<String, Integer>> it = counts.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    return CollectionsKt.joinToString$default(linkedHashMap.entrySet(), I18nKt.tr("、", new Object[0]), null, null, 0, null, new Function1() { // from class: com.pymcl.android.ui.state.ModUpdateWatcher$Companion$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ModUpdateWatcher.Companion.summarize$lambda$1((Map.Entry) obj);
                        }
                    }, 30, null);
                }
                Map.Entry next = it.next();
                if (next.getValue().intValue() > 0) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
        }
    }

    public ModUpdateWatcher(AppState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.enabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.checking = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.counts = SnapshotStateKt.mutableStateMapOf();
        this.details = SnapshotStateKt.mutableStateMapOf();
    }

    private final void setEnabled(boolean z) {
        this.enabled.setValue(Boolean.valueOf(z));
    }

    public final boolean getEnabled() {
        return ((Boolean) this.enabled.getValue()).booleanValue();
    }

    private final void setChecking(boolean z) {
        this.checking.setValue(Boolean.valueOf(z));
    }

    public final boolean getChecking() {
        return ((Boolean) this.checking.getValue()).booleanValue();
    }

    public final SnapshotStateMap<String, Integer> getCounts() {
        return this.counts;
    }

    public final SnapshotStateMap<String, Map<String, String>> getDetails() {
        return this.details;
    }

    public final void attach(CrossProcessPrefs p, CoroutineScope s) {
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(s, "s");
        attach(ModWatchPrefs.INSTANCE.of(p), s);
    }

    public final void attach(ModWatchPrefs p, CoroutineScope s) {
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(s, "s");
        this.prefs = p;
        this.scope = s;
        setEnabled(p.getEnabled());
        if (getEnabled()) {
            startLoop();
        }
    }

    public final void switchTo(boolean on) {
        setEnabled(on);
        ModWatchPrefs modWatchPrefs = this.prefs;
        if (modWatchPrefs != null) {
            modWatchPrefs.setEnabled(on);
        }
        if (on) {
            startLoop();
            return;
        }
        Job job = this.loop;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.loop = null;
    }

    private final void startLoop() {
        CoroutineScope s = this.scope;
        if (s == null) {
            return;
        }
        Job job = this.loop;
        boolean z = false;
        if (job != null && job.isActive()) {
            z = true;
        }
        if (z) {
            return;
        }
        this.loop = BuildersKt__Builders_commonKt.launch$default(s, null, null, new AnonymousClass1(null), 3, null);
    }

    /* compiled from: ModUpdateWatcher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.ModUpdateWatcher$startLoop$1", f = "ModUpdateWatcher.kt", i = {0, 1, 1, 1, 2, 2, 2}, l = {81, 85, 86}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "last", "wait", "$this$launch", "last", "wait"}, nl = {82, 86, 87}, s = {"L$0", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.ModUpdateWatcher$startLoop$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ModUpdateWatcher.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:14:0x0056
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b1 -> B:32:0x00b2). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = r0.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r0.label
                r4 = 1
                switch(r3) {
                    case 0: goto L3a;
                    case 1: goto L36;
                    case 2: goto L27;
                    case 3: goto L18;
                    default: goto L10;
                }
            L10:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r3)
                throw r2
            L18:
                long r5 = r0.J$1
                long r7 = r0.J$0
                kotlin.ResultKt.throwOnFailure(r21)
                r3 = r2
                r9 = r5
                r5 = r0
                r2 = r1
                r1 = r21
                goto Lb2
            L27:
                long r5 = r0.J$1
                long r7 = r0.J$0
                kotlin.ResultKt.throwOnFailure(r21)
                r3 = r2
                r12 = r7
                r7 = r0
                r2 = r1
                r1 = r21
                goto L9a
            L36:
                kotlin.ResultKt.throwOnFailure(r21)
                goto L4d
            L3a:
                kotlin.ResultKt.throwOnFailure(r21)
                r3 = r0
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r0.L$0 = r1
                r0.label = r4
                r5 = 4000(0xfa0, double:1.9763E-320)
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r5, r3)
                if (r3 != r2) goto L4d
                return r2
            L4d:
                r5 = r0
                r3 = r2
                r2 = r1
                r1 = r21
            L52:
                boolean r6 = kotlinx.coroutines.CoroutineScopeKt.isActive(r2)
                if (r6 == 0) goto Lc2
                com.pymcl.android.ui.state.ModUpdateWatcher r6 = com.pymcl.android.ui.state.ModUpdateWatcher.this
                boolean r6 = r6.getEnabled()
                if (r6 == 0) goto Lc2
                com.pymcl.android.ui.state.ModUpdateWatcher r6 = com.pymcl.android.ui.state.ModUpdateWatcher.this
                com.pymcl.android.ui.state.ModWatchPrefs r6 = com.pymcl.android.ui.state.ModUpdateWatcher.access$getPrefs$p(r6)
                r7 = 0
                if (r6 == 0) goto L6f
                long r9 = r6.getLastCheck()
                goto L70
            L6f:
                r9 = r7
            L70:
                r12 = r9
                com.pymcl.core.mods.ModUpdateSchedule r11 = com.pymcl.core.mods.ModUpdateSchedule.INSTANCE
                long r14 = java.lang.System.currentTimeMillis()
                r18 = 4
                r19 = 0
                r16 = 0
                long r9 = com.pymcl.core.mods.ModUpdateSchedule.delayUntilNext$default(r11, r12, r14, r16, r18, r19)
                int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r6 <= 0) goto L9c
                r6 = r5
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r5.L$0 = r2
                r5.J$0 = r12
                r5.J$1 = r9
                r7 = 2
                r5.label = r7
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r9, r6)
                if (r6 != r3) goto L98
                return r3
            L98:
                r7 = r5
                r5 = r9
            L9a:
                r5 = r7
                goto L52
            L9c:
                com.pymcl.android.ui.state.ModUpdateWatcher r6 = com.pymcl.android.ui.state.ModUpdateWatcher.this
                r7 = r5
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r5.L$0 = r2
                r5.J$0 = r12
                r5.J$1 = r9
                r8 = 3
                r5.label = r8
                java.lang.Object r6 = r6.checkAll(r4, r7)
                if (r6 != r3) goto Lb1
                return r3
            Lb1:
                r7 = r12
            Lb2:
                com.pymcl.android.ui.state.ModUpdateWatcher r6 = com.pymcl.android.ui.state.ModUpdateWatcher.this
                com.pymcl.android.ui.state.ModWatchPrefs r6 = com.pymcl.android.ui.state.ModUpdateWatcher.access$getPrefs$p(r6)
                if (r6 == 0) goto L52
                long r11 = java.lang.System.currentTimeMillis()
                r6.setLastCheck(r11)
                goto L52
            Lc2:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.ModUpdateWatcher.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ Object checkInstance$default(ModUpdateWatcher modUpdateWatcher, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return modUpdateWatcher.checkInstance(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131 A[LOOP:1: B:50:0x012b->B:52:0x0131, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x018c -> B:83:0x019d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01b5 -> B:68:0x01c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkInstance(java.lang.String r21, java.lang.String r22, kotlin.coroutines.Continuation<? super java.lang.Integer> r23) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.ModUpdateWatcher.checkInstance(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[Catch: all -> 0x005f, LOOP:0: B:34:0x00ac->B:36:0x00b2, LOOP_END, TryCatch #5 {all -> 0x005f, blocks: (B:18:0x0058, B:33:0x0096, B:34:0x00ac, B:36:0x00b2, B:37:0x00c4), top: B:79:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:50:0x00f7, B:52:0x00fd, B:57:0x0124, B:60:0x0134), top: B:69:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:50:0x00f7, B:52:0x00fd, B:57:0x0124, B:60:0x0134), top: B:69:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0120 -> B:56:0x0122). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkAll(boolean r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.ModUpdateWatcher.checkAll(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void consumed(String instance, String version, Collection<String> files) {
        int size;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(files, "files");
        String k = instance + "/" + version;
        Map map = this.details.get(k);
        if (map != null) {
            this.details.put(k, MapsKt.minus(map, (Iterable) CollectionsKt.toSet(files)));
        }
        Map map2 = this.counts;
        Map map3 = this.details;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Map<String, String>>> it = map3.entrySet().iterator();
        while (true) {
            size = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (StringsKt.startsWith$default(next.getKey(), instance + "/", false, 2, (Object) null)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            size += ((Map) it2.next()).size();
        }
        map2.put(instance, Integer.valueOf(size));
    }
}
