package com.pymcl.android;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.pymcl.android.ui.i18n.I18n;
import com.pymcl.android.ui.state.AppViewModel;
import com.pymcl.multiplayer.MultiplayerController;
import java.io.PrintStream;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0014"}, d2 = {"Lcom/pymcl/android/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "vm", "Lcom/pymcl/android/ui/state/AppViewModel;", "getVm", "()Lcom/pymcl/android/ui/state/AppViewModel;", "vm$delegate", "Lkotlin/Lazy;", "vpnLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "notifLauncher", "", "observeVpnRequests", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes23.dex */
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 8;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    private final ActivityResultLauncher<Intent> vpnLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.pymcl.android.MainActivity$$ExternalSyntheticLambda1
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            MainActivity.vpnLauncher$lambda$0(this.f$0, (ActivityResult) obj);
        }
    });
    private final ActivityResultLauncher<String> notifLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new MainActivity$$ExternalSyntheticLambda2());

    public static /* synthetic */ void $r8$lambda$iMMxxxIdIxniyOyFQ7CoHExve3M(boolean z) {
        notifLauncher$lambda$0(z);
    }

    public MainActivity() {
        final MainActivity mainActivity = this;
        final Function0 function0 = null;
        this.vm = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AppViewModel.class), new MainActivity$special$$inlined$viewModels$default$2(mainActivity), new Function0<ViewModelProvider.Factory>() { // from class: com.pymcl.android.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return mainActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.pymcl.android.MainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? mainActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppViewModel getVm() {
        return (AppViewModel) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow, com.pymcl.multiplayer.MultiplayerController$Companion] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.pymcl.multiplayer.MultiplayerController, void] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, boolean] */
    public static final void vpnLauncher$lambda$0(MainActivity this$0, ActivityResult r) {
        Intrinsics.checkNotNullParameter(r, "r");
        MultiplayerController.INSTANCE.setResizable(this$0).onVpnPermissionResult(r.getResultCode() == -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifLauncher$lambda$0(boolean it) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.MainActivity$observeVpnRequests$1", f = "MainActivity.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, nl = {43}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.MainActivity$observeVpnRequests$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MultiplayerController $mp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MultiplayerController multiplayerController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$mp = multiplayerController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new AnonymousClass1(this.$mp, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MainActivity.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
        @DebugMetadata(c = "com.pymcl.android.MainActivity$observeVpnRequests$1$1", f = "MainActivity.kt", i = {0}, l = {36}, m = "invokeSuspend", n = {"$this$repeatOnLifecycle"}, nl = {-1}, s = {"L$0"}, v = 2)
        /* renamed from: com.pymcl.android.MainActivity$observeVpnRequests$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ MultiplayerController $mp;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MainActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01511(MultiplayerController multiplayerController, MainActivity mainActivity, Continuation<? super C01511> continuation) {
                super(2, continuation);
                this.$mp = multiplayerController;
                this.this$0 = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01511 c01511 = new C01511(this.$mp, this.this$0, continuation);
                c01511.L$0 = obj;
                return c01511;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: MainActivity.kt */
            @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
            /* renamed from: com.pymcl.android.MainActivity$observeVpnRequests$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C01521<T> implements FlowCollector {
                final /* synthetic */ CoroutineScope $$this$repeatOnLifecycle;
                final /* synthetic */ MultiplayerController $mp;
                final /* synthetic */ MainActivity this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                public C01521(MainActivity mainActivity, CoroutineScope coroutineScope, MultiplayerController multiplayerController) {
                    this.this$0 = mainActivity;
                    this.$$this$repeatOnLifecycle = coroutineScope;
                    this.$mp = multiplayerController;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                    return emit((Intent) value, (Continuation<? super Unit>) $completion);
                }

                public final Object emit(Intent intent, Continuation<? super Unit> continuation) {
                    Object objM8116constructorimpl;
                    if (intent == null) {
                        return Unit.INSTANCE;
                    }
                    if (Build.VERSION.SDK_INT >= 33 && this.this$0.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                        CoroutineScope coroutineScope = this.$$this$repeatOnLifecycle;
                        MainActivity mainActivity = this.this$0;
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            mainActivity.notifLauncher.launch("android.permission.POST_NOTIFICATIONS");
                            Result.m8116constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            Result.m8116constructorimpl(ResultKt.createFailure(th));
                        }
                    }
                    CoroutineScope coroutineScope2 = this.$$this$repeatOnLifecycle;
                    MainActivity mainActivity2 = this.this$0;
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        mainActivity2.vpnLauncher.launch(intent);
                        objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th2));
                    }
                    MultiplayerController multiplayerController = this.$mp;
                    if (Result.m8119exceptionOrNullimpl(objM8116constructorimpl) != null) {
                        multiplayerController.onVpnPermissionResult(false);
                    }
                    return Unit.INSTANCE;
                }
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 ??, still in use, count: 2, list:
                  (r1v2 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow) from 0x0011: INVOKE 
                  (r1v2 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow)
                  ("call to 'resume' before 'invoke' with coroutine")
                 DIRECT call: com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow.setTitle(java.lang.String):void A[MD:(java.lang.String):void (m)]
                  (r1v2 ?? I:java.lang.Throwable) from 0x0014: THROW (r1v2 ?? I:java.lang.Throwable)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                */
            /* JADX WARN: Type inference failed for: r1v2, types: [com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow, java.lang.IllegalStateException, java.lang.Throwable] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = r6.L$0
                    kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r6.label
                    switch(r2) {
                        case 0: goto L19;
                        case 1: goto L15;
                        default: goto Ld;
                    }
                Ld:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.setTitle(r2)
                    throw r1
                L15:
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L40
                L19:
                    kotlin.ResultKt.throwOnFailure(r7)
                    com.pymcl.multiplayer.MultiplayerController r2 = r6.$mp
                    kotlinx.coroutines.flow.StateFlow r2 = r2.getVpnPermission()
                    com.pymcl.android.MainActivity$observeVpnRequests$1$1$1 r3 = new com.pymcl.android.MainActivity$observeVpnRequests$1$1$1
                    com.pymcl.android.MainActivity r4 = r6.this$0
                    com.pymcl.multiplayer.MultiplayerController r5 = r6.$mp
                    r3.<init>(r4, r0, r5)
                    kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                    r4 = r6
                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                    java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                    r6.L$0 = r5
                    r5 = 1
                    r6.label = r5
                    java.lang.Object r2 = r2.collect(r3, r4)
                    if (r2 != r1) goto L40
                    return r1
                L40:
                    kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
                    r1.<init>()
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.MainActivity.AnonymousClass1.C01511.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 2, list:
              (r0v2 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow) from 0x000d: INVOKE 
              (r0v2 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow)
              ("call to 'resume' before 'invoke' with coroutine")
             DIRECT call: com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow.setTitle(java.lang.String):void A[MD:(java.lang.String):void (m)]
              (r0v2 ?? I:java.lang.Throwable) from 0x0010: THROW (r0v2 ?? I:java.lang.Throwable)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        /* JADX WARN: Type inference failed for: r0v2, types: [com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow, java.lang.IllegalStateException, java.lang.Throwable] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                switch(r1) {
                    case 0: goto L15;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.setTitle(r1)
                throw r0
            L11:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L37
            L15:
                kotlin.ResultKt.throwOnFailure(r8)
                com.pymcl.android.MainActivity r1 = com.pymcl.android.MainActivity.this
                androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
                androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
                com.pymcl.android.MainActivity$observeVpnRequests$1$1 r3 = new com.pymcl.android.MainActivity$observeVpnRequests$1$1
                com.pymcl.multiplayer.MultiplayerController r4 = r7.$mp
                com.pymcl.android.MainActivity r5 = com.pymcl.android.MainActivity.this
                r6 = 0
                r3.<init>(r4, r5, r6)
                kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                r4 = r7
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5 = 1
                r7.label = r5
                java.lang.Object r1 = androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(r1, r2, r3, r4)
                if (r1 != r0) goto L37
                return r0
            L37:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.MainActivity.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow, com.pymcl.multiplayer.MultiplayerController$Companion] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.pymcl.multiplayer.MultiplayerController, void] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, boolean] */
    private final void observeVpnRequests() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(MultiplayerController.INSTANCE.setResizable(this), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.pymcl.android.ui.state.AppState, void] */
    /* JADX WARN: Type inference failed for: r2v5, types: [void] */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        I18n.INSTANCE.init(this, PrintStream.println(getResources().getConfiguration().getLocales().get(0).getLanguage()) != 0 ? I18n.Lang.Zh : I18n.Lang.En);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
        getWindow().setSoftInputMode(16);
        AppViewModel vm = getVm();
        ?? jMenuBar = vm.setJMenuBar(vm);
        observeVpnRequests();
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1162002039, true, new MainActivity$$ExternalSyntheticLambda0(jMenuBar)), 1, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ??, still in use, count: 1, list:
          (r0v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0014: IF  (r0v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:18:0x009d
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onCreate$lambda$1(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ??, still in use, count: 1, list:
          (r0v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0014: IF  (r0v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:18:0x009d
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ??, still in use, count: 1, list:
          (r0v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0013: IF  (r0v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:14:0x0033
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onCreate$lambda$1$0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ??, still in use, count: 1, list:
          (r0v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0013: IF  (r0v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:14:0x0033
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */
}
