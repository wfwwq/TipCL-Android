package com.pymcl.multiplayer;

import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.util.Log;
import com.pymcl.multiplayer.MultiplayerState;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.Reader;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import net.burningtnt.terracotta.TerracottaAndroidAPI;

/* compiled from: MultiplayerController.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 B2\u00020\u0001:\u0001BB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010/\u001a\u00020*J\b\u00100\u001a\u000201H\u0002J\u001a\u00102\u001a\u00020*2\n\b\u0002\u00103\u001a\u0004\u0018\u000104H\u0086@¢\u0006\u0002\u00105J\u0016\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u00108J\u0010\u00109\u001a\u0004\u0018\u00010:2\u0006\u00107\u001a\u00020\u0015J\u000e\u0010;\u001a\u000201H\u0086@¢\u0006\u0002\u0010<J\b\u0010=\u001a\u0004\u0018\u00010\u0015J\b\u0010>\u001a\u000201H\u0002J\b\u0010?\u001a\u000201H\u0002J\u000e\u0010@\u001a\u0002012\u0006\u0010A\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010+\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020*@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerController;", "", "app", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/pymcl/multiplayer/MultiplayerState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "_vpnPermission", "Landroid/content/Intent;", "vpnPermission", "getVpnPermission", "_notices", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "notices", "Lkotlinx/coroutines/flow/SharedFlow;", "getNotices", "()Lkotlinx/coroutines/flow/SharedFlow;", "value", "Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;", "metadata", "getMetadata", "()Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;", "playerName", "getPlayerName", "()Ljava/lang/String;", "setPlayerName", "(Ljava/lang/String;)V", "extraNodes", "", "getExtraNodes", "()Ljava/util/List;", "setExtraNodes", "(Ljava/util/List;)V", "", "isHost", "()Z", "poller", "Lkotlinx/coroutines/Job;", "initialize", "startPolling", "", "host", "port", "", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "join", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseRoomType", "Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectLogs", "ensureWaiting", "requestVpn", "onVpnPermissionResult", "granted", "Companion", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MultiplayerController {
    private static final String TAG = "PyMCL-MP";
    public static final String VPN_DENIED_NOTICE = "没有获得 VPN 授权，联机已取消。陶瓦联机需要建立虚拟网卡，请重新点「创建」或「加入」并在系统弹窗里允许";
    private static volatile MultiplayerController instance;
    private final MutableSharedFlow<String> _notices;
    private final MutableStateFlow<MultiplayerState> _state;
    private final MutableStateFlow<Intent> _vpnPermission;
    private final Context app;
    private List<String> extraNodes;
    private volatile boolean isHost;
    private TerracottaAndroidAPI.Metadata metadata;
    private final SharedFlow<String> notices;
    private String playerName;
    private Job poller;
    private final CoroutineScope scope;
    private final StateFlow<MultiplayerState> state;
    private final StateFlow<Intent> vpnPermission;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> DEFAULT_EXTRA_NODES = CollectionsKt.listOf("https://terracotta.glavo.site/acebc7d8-1208-47fd-b212-d03ac49e36e0");
    private static final Lazy<Boolean> isNativeAvailable$delegate = LazyKt.lazy(new Function0() { // from class: com.pymcl.multiplayer.MultiplayerController$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(MultiplayerController.isNativeAvailable_delegate$lambda$0());
        }
    });

    public /* synthetic */ MultiplayerController(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerController$Companion;", "", "<init>", "()V", "TAG", "", "VPN_DENIED_NOTICE", "DEFAULT_EXTRA_NODES", "", "getDEFAULT_EXTRA_NODES", "()Ljava/util/List;", "instance", "Lcom/pymcl/multiplayer/MultiplayerController;", SettingsProtocol.GET, "context", "Landroid/content/Context;", "isNativeAvailable", "", "()Z", "isNativeAvailable$delegate", "Lkotlin/Lazy;", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<String> getDEFAULT_EXTRA_NODES() {
            return MultiplayerController.DEFAULT_EXTRA_NODES;
        }

        public final MultiplayerController get(Context context) {
            MultiplayerController it;
            Intrinsics.checkNotNullParameter(context, "context");
            MultiplayerController multiplayerController = MultiplayerController.instance;
            if (multiplayerController != null) {
                return multiplayerController;
            }
            synchronized (this) {
                it = MultiplayerController.instance;
                if (it == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    it = new MultiplayerController(applicationContext, null);
                    Companion companion = MultiplayerController.INSTANCE;
                    MultiplayerController.instance = it;
                }
            }
            return it;
        }

        public final boolean isNativeAvailable() {
            return ((Boolean) MultiplayerController.isNativeAvailable$delegate.getValue()).booleanValue();
        }
    }

    private MultiplayerController(Context app) {
        this.app = app;
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        this._state = StateFlowKt.MutableStateFlow(MultiplayerState.Uninitialized.INSTANCE);
        this.state = this._state;
        this._vpnPermission = StateFlowKt.MutableStateFlow(null);
        this.vpnPermission = this._vpnPermission;
        this._notices = SharedFlowKt.MutableSharedFlow$default(0, 4, null, 5, null);
        this.notices = this._notices;
        this.extraNodes = DEFAULT_EXTRA_NODES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNativeAvailable_delegate$lambda$0() {
        Object objM8116constructorimpl;
        Companion companion = INSTANCE;
        try {
            Result.Companion companion2 = Result.INSTANCE;
            Class.forName("net.burningtnt.terracotta.TerracottaAndroidAPI");
            objM8116constructorimpl = Result.m8116constructorimpl(true);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8119exceptionOrNullimpl(objM8116constructorimpl) != null) {
            objM8116constructorimpl = false;
        }
        return ((Boolean) objM8116constructorimpl).booleanValue();
    }

    public final StateFlow<MultiplayerState> getState() {
        return this.state;
    }

    public final StateFlow<Intent> getVpnPermission() {
        return this.vpnPermission;
    }

    public final SharedFlow<String> getNotices() {
        return this.notices;
    }

    public final TerracottaAndroidAPI.Metadata getMetadata() {
        return this.metadata;
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public final void setPlayerName(String str) {
        this.playerName = str;
    }

    public final List<String> getExtraNodes() {
        return this.extraNodes;
    }

    public final void setExtraNodes(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.extraNodes = list;
    }

    /* renamed from: isHost, reason: from getter */
    public final boolean getIsHost() {
        return this.isHost;
    }

    public final synchronized boolean initialize() {
        boolean z = true;
        if (this.metadata != null) {
            return true;
        }
        try {
            this.metadata = TerracottaAndroidAPI.initialize(this.app, new TerracottaAndroidAPI.VpnServiceCallback() { // from class: com.pymcl.multiplayer.MultiplayerController$$ExternalSyntheticLambda1
                @Override // net.burningtnt.terracotta.TerracottaAndroidAPI.VpnServiceCallback
                public final void onStartVpnService() {
                    MultiplayerController.initialize$lambda$0(this.f$0);
                }
            });
            TerracottaAndroidAPI.Metadata metadata = this.metadata;
            String terracottaVersion = metadata != null ? metadata.getTerracottaVersion() : null;
            TerracottaAndroidAPI.Metadata metadata2 = this.metadata;
            Log.i(TAG, "Terracotta " + terracottaVersion + " / EasyTier " + (metadata2 != null ? metadata2.getEasyTierVersion() : null));
            TerracottaInterop.INSTANCE.setNativeVerifier(new Function1() { // from class: com.pymcl.multiplayer.MultiplayerController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MultiplayerController.initialize$lambda$1(this.f$0, (String) obj));
                }
            });
            startPolling();
        } catch (Throwable t) {
            Log.e(TAG, "init failed", t);
            MutableStateFlow<MultiplayerState> mutableStateFlow = this._state;
            String message = t.getMessage();
            if (message == null) {
                message = t.getClass().getSimpleName();
            }
            Intrinsics.checkNotNull(message);
            mutableStateFlow.setValue(new MultiplayerState.Unavailable(message));
            z = false;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$0(MultiplayerController this$0) {
        BuildersKt__Builders_commonKt.launch$default(this$0.scope, Dispatchers.getMain(), null, new MultiplayerController$initialize$1$1(this$0, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initialize$lambda$1(MultiplayerController this$0, String c) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(c, "c");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(Boolean.valueOf(TerracottaAndroidAPI.parseRoomCode(c) != null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = false;
        }
        return ((Boolean) objM8116constructorimpl).booleanValue();
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.multiplayer.MultiplayerController$startPolling$1", f = "MultiplayerController.kt", i = {0, 0}, l = {119}, m = "invokeSuspend", n = {"$this$launch", "lastIdx"}, nl = {121}, s = {"L$0", "L$1"}, v = 2)
    /* renamed from: com.pymcl.multiplayer.MultiplayerController$startPolling$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = MultiplayerController.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Ref.IntRef lastIdx;
            AnonymousClass1 anonymousClass1;
            Object objM8116constructorimpl;
            CoroutineScope $this$launch = (CoroutineScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    lastIdx = new Ref.IntRef();
                    lastIdx.element = -1;
                    anonymousClass1 = this;
                    break;
                case 1:
                    lastIdx = (Ref.IntRef) this.L$1;
                    ResultKt.throwOnFailure($result);
                    anonymousClass1 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (CoroutineScopeKt.isActive($this$launch)) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    MultiplayerState.Companion companion2 = MultiplayerState.INSTANCE;
                    String state = TerracottaAndroidAPI.getState();
                    Intrinsics.checkNotNullExpressionValue(state, "getState(...)");
                    objM8116constructorimpl = Result.m8116constructorimpl(companion2.parse(state));
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                MultiplayerController multiplayerController = MultiplayerController.this;
                if (Result.m8123isSuccessimpl(objM8116constructorimpl)) {
                    Pair pair = (Pair) objM8116constructorimpl;
                    int i = ((Number) pair.component1()).intValue();
                    MultiplayerState s = (MultiplayerState) pair.component2();
                    if (MultiplayerState.INSTANCE.isNewer(i, lastIdx.element)) {
                        lastIdx.element = i;
                        multiplayerController._state.setValue(s);
                        TerracottaVpnService.INSTANCE.updateText(multiplayerController.app, s);
                    }
                }
                Throwable it = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
                if (it != null) {
                    Log.w(MultiplayerController.TAG, "getState", it);
                }
                anonymousClass1.L$0 = $this$launch;
                anonymousClass1.L$1 = lastIdx;
                anonymousClass1.label = 1;
                if (DelayKt.delay(250L, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void startPolling() {
        Job job = this.poller;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.poller = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.multiplayer.MultiplayerController$host$2", f = "MultiplayerController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.multiplayer.MultiplayerController$host$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Integer $port;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Integer num, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$port = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MultiplayerController.this.new AnonymousClass2(this.$port, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (!MultiplayerController.this.initialize()) {
                        return Boxing.boxBoolean(false);
                    }
                    MultiplayerController.this.ensureWaiting();
                    MultiplayerController.this.isHost = true;
                    Log.i(MultiplayerController.TAG, "host scanning (hint port=" + this.$port + ")");
                    TerracottaAndroidAPI.setScanning(null, MultiplayerController.this.getPlayerName(), MultiplayerController.this.getExtraNodes());
                    return Boxing.boxBoolean(true);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static /* synthetic */ Object host$default(MultiplayerController multiplayerController, Integer num, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return multiplayerController.host(num, continuation);
    }

    public final Object host(Integer port, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(port, null), continuation);
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.multiplayer.MultiplayerController$join$2", f = "MultiplayerController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.multiplayer.MultiplayerController$join$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $code;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$code = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MultiplayerController.this.new AnonymousClass2(this.$code, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (!MultiplayerController.this.initialize()) {
                        return Boxing.boxBoolean(false);
                    }
                    String room = RoomCode.INSTANCE.parse(this.$code);
                    if (room == null) {
                        room = StringsKt.trim((CharSequence) this.$code).toString();
                    }
                    MultiplayerController.this.ensureWaiting();
                    MultiplayerController.this.isHost = false;
                    return Boxing.boxBoolean(TerracottaAndroidAPI.setGuesting(room, MultiplayerController.this.getPlayerName(), MultiplayerController.this.getExtraNodes()));
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object join(String code, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(code, null), continuation);
    }

    public final TerracottaAndroidAPI.RoomType parseRoomType(String code) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(code, "code");
        if (this.metadata == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            MultiplayerController multiplayerController = this;
            objM8116constructorimpl = Result.m8116constructorimpl(TerracottaAndroidAPI.parseRoomCode(code));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        return (TerracottaAndroidAPI.RoomType) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.multiplayer.MultiplayerController$stop$2", f = "MultiplayerController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.multiplayer.MultiplayerController$stop$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = MultiplayerController.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (MultiplayerController.this.getMetadata() == null) {
                        return Unit.INSTANCE;
                    }
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        TerracottaAndroidAPI.setWaiting();
                        Result.m8116constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m8116constructorimpl(ResultKt.createFailure(th));
                    }
                    TerracottaVpnService.INSTANCE.stop(MultiplayerController.this.app);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object stop(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final String collectLogs() {
        Object objM8116constructorimpl;
        if (this.metadata == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            MultiplayerController multiplayerController = this;
            Reader readerCollectLogs = TerracottaAndroidAPI.collectLogs();
            try {
                Reader it = readerCollectLogs;
                Intrinsics.checkNotNull(it);
                String text = TextStreamsKt.readText(it);
                CloseableKt.closeFinally(readerCollectLogs, null);
                objM8116constructorimpl = Result.m8116constructorimpl(text);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureWaiting() {
        if (this._state.getValue() instanceof MultiplayerState.Waiting) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            MultiplayerController multiplayerController = this;
            TerracottaAndroidAPI.setWaiting();
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestVpn() {
        Intent intent = VpnService.prepare(this.app);
        if (intent == null) {
            TerracottaVpnService.INSTANCE.start(this.app);
        } else {
            this._vpnPermission.setValue(intent);
        }
    }

    public final void onVpnPermissionResult(boolean granted) {
        this._vpnPermission.setValue(null);
        if (!granted) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(null), 3, null);
        } else {
            TerracottaVpnService.INSTANCE.start(this.app);
        }
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.multiplayer.MultiplayerController$onVpnPermissionResult$1", f = "MultiplayerController.kt", i = {0}, l = {163}, m = "invokeSuspend", n = {"$this$launch"}, nl = {164}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.multiplayer.MultiplayerController$onVpnPermissionResult$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = MultiplayerController.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            CoroutineScope $this$launch = (CoroutineScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        TerracottaAndroidAPI.getPendingVpnServiceRequest().reject();
                        Result.m8116constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m8116constructorimpl(ResultKt.createFailure(th));
                    }
                    this.L$0 = SpillingKt.nullOutSpilledVariable($this$launch);
                    this.label = 1;
                    if (MultiplayerController.this.stop(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MultiplayerController.this._notices.tryEmit(MultiplayerController.VPN_DENIED_NOTICE);
            return Unit.INSTANCE;
        }
    }
}
