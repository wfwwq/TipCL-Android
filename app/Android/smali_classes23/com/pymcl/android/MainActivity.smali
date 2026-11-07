.class public final Lcom/pymcl/android/MainActivity;
.super Landroidx/activity/ComponentActivity;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/pymcl/android/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,79:1\n70#2,11:80\n113#3:91\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/pymcl/android/MainActivity\n*L\n23#1:80,11\n73#1:91\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/android/MainActivity;",
        "Landroidx/activity/ComponentActivity;",
        "<init>",
        "()V",
        "vm",
        "Lcom/pymcl/android/ui/state/AppViewModel;",
        "getVm",
        "()Lcom/pymcl/android/ui/state/AppViewModel;",
        "vm$delegate",
        "Lkotlin/Lazy;",
        "vpnLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Landroid/content/Intent;",
        "notifLauncher",
        "",
        "observeVpnRequests",
        "",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final notifLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final vm$delegate:Lkotlin/Lazy;

.field private final vpnLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$AcF2tCcPjcrWei-q-YV58XPrtGY(Lcom/pymcl/android/MainActivity;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/MainActivity;->vpnLauncher$lambda$0(Lcom/pymcl/android/MainActivity;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic $r8$lambda$a-uvJqkW95yrXRBM_Gnclu8M3Ao(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/MainActivity;->onCreate$lambda$1$0(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$iMMxxxIdIxniyOyFQ7CoHExve3M(Z)V
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/MainActivity;->notifLauncher$lambda$0(Z)V

    return-void
.end method

.method public static synthetic $r8$lambda$vyESdL3AVxZWv9_2-xPKY6rrNQw(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/MainActivity;->onCreate$lambda$1(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/pymcl/android/MainActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 22
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 23
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 80
    .local v0, "$this$viewModels_u24default\\1":Landroidx/activity/ComponentActivity;
    nop

    .line 81
    const/4 v1, 0x0

    .line 80
    .local v1, "extrasProducer\\1":Lkotlin/jvm/functions/Function0;
    nop

    .line 82
    const/4 v2, 0x0

    .line 80
    .local v2, "factoryProducer\\1":Lkotlin/jvm/functions/Function0;
    const/4 v3, 0x0

    .line 84
    .local v3, "$i$f$viewModels\\1\\23":I
    new-instance v4, Lcom/pymcl/android/MainActivity$special$$inlined$viewModels$default$1;

    invoke-direct {v4, v0}, Lcom/pymcl/android/MainActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 86
    .local v4, "factoryPromise\\1":Lkotlin/jvm/functions/Function0;
    new-instance v5, Landroidx/lifecycle/ViewModelLazy;

    const-class v6, Lcom/pymcl/android/ui/state/AppViewModel;

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v6

    .line 88
    new-instance v7, Lcom/pymcl/android/MainActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v7, v0}, Lcom/pymcl/android/MainActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 89
    nop

    .line 90
    new-instance v8, Lcom/pymcl/android/MainActivity$special$$inlined$viewModels$default$3;

    invoke-direct {v8, v1, v0}, Lcom/pymcl/android/MainActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 86
    invoke-direct {v5, v6, v7, v4, v8}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v5, Lkotlin/Lazy;

    .line 23
    .end local v0    # "$this$viewModels_u24default\\1":Landroidx/activity/ComponentActivity;
    .end local v1    # "extrasProducer\\1":Lkotlin/jvm/functions/Function0;
    .end local v2    # "factoryProducer\\1":Lkotlin/jvm/functions/Function0;
    .end local v3    # "$i$f$viewModels\\1\\23":I
    .end local v4    # "factoryPromise\\1":Lkotlin/jvm/functions/Function0;
    iput-object v5, p0, Lcom/pymcl/android/MainActivity;->vm$delegate:Lkotlin/Lazy;

    .line 26
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    new-instance v1, Lcom/pymcl/android/MainActivity$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/pymcl/android/MainActivity$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/android/MainActivity;)V

    invoke-virtual {p0, v0, v1}, Lcom/pymcl/android/MainActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/android/MainActivity;->vpnLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 30
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    new-instance v1, Lcom/pymcl/android/MainActivity$$ExternalSyntheticLambda2;

    invoke-direct {v1}, Lcom/pymcl/android/MainActivity$$ExternalSyntheticLambda2;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/pymcl/android/MainActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/android/MainActivity;->notifLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 22
    return-void
.end method

.method public static final synthetic access$getNotifLauncher$p(Lcom/pymcl/android/MainActivity;)Landroidx/activity/result/ActivityResultLauncher;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/MainActivity;

    .line 22
    iget-object v0, p0, Lcom/pymcl/android/MainActivity;->notifLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-object v0
.end method

.method public static final synthetic access$getVpnLauncher$p(Lcom/pymcl/android/MainActivity;)Landroidx/activity/result/ActivityResultLauncher;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/MainActivity;

    .line 22
    iget-object v0, p0, Lcom/pymcl/android/MainActivity;->vpnLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-object v0
.end method

.method private final getVm()Lcom/pymcl/android/ui/state/AppViewModel;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/pymcl/android/MainActivity;->vm$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/state/AppViewModel;

    return-object v0
.end method

.method private static final notifLauncher$lambda$0(Z)V
    .locals 0
    .param p0, "it"    # Z

    .line 30
    return-void
.end method

.method private final observeVpnRequests()V
    .locals 8

    .line 33
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerController;->Companion:Lcom/pymcl/multiplayer/MultiplayerController$Companion;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/pymcl/multiplayer/MultiplayerController$Companion;->get(Landroid/content/Context;)Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v0

    .line 34
    .local v0, "mp":Lcom/pymcl/multiplayer/MultiplayerController;
    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/LifecycleOwner;

    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    new-instance v1, Lcom/pymcl/android/MainActivity$observeVpnRequests$1;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v0, v3}, Lcom/pymcl/android/MainActivity$observeVpnRequests$1;-><init>(Lcom/pymcl/android/MainActivity;Lcom/pymcl/multiplayer/MultiplayerController;Lkotlin/coroutines/Continuation;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 44
    return-void
.end method

.method private static final onCreate$lambda$1(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 13
    .param p0, "$state"    # Lcom/pymcl/android/ui/state/AppState;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const-string v0, "C74@4071L19,68@3713L377:MainActivity.kt#kghqnz"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v3, p2, 0x1

    invoke-interface {p1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v3, "com.pymcl.android.MainActivity.onCreate.<anonymous> (MainActivity.kt:67)"

    const v4, 0x4542be77

    invoke-static {v4, p2, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 68
    :cond_1
    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/AppState;->getSettings()Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v0

    .line 70
    .local v0, "s":Lcom/pymcl/android/ui/state/UiSettings;
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getDark()Z

    move-result v3

    .line 71
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getAccentIndex()I

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_2

    move-object v4, v5

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/pymcl/android/ui/theme/ThemeKt;->getAccentPresets()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getAccentIndex()I

    move-result v6

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/Pair;

    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/graphics/Color;

    .line 72
    :goto_1
    invoke-static {}, Lcom/pymcl/android/ui/theme/BgPreset;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v6

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getBackground()I

    move-result v7

    invoke-interface {v6, v7}, Lkotlin/enums/EnumEntries;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/pymcl/android/ui/theme/BgPreset;

    .line 73
    new-instance v7, Lcom/pymcl/android/ui/theme/PyShapes;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getCardRadius()I

    move-result v8

    .local v8, "$this$dp\\1":I
    const/4 v9, 0x0

    .line 91
    .local v9, "$i$f$getDp\\1\\73":I
    int-to-float v10, v8

    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 73
    .end local v8    # "$this$dp\\1":I
    .end local v9    # "$i$f$getDp\\1\\73":I
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getSquareCards()Z

    move-result v10

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v7 .. v12}, Lcom/pymcl/android/ui/theme/PyShapes;-><init>(FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 74
    move-object v8, v5

    move-object v5, v6

    move-object v6, v7

    new-instance v7, Lcom/pymcl/android/ui/theme/PyMotion;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getMotion()Z

    move-result v9

    const/4 v10, 0x0

    invoke-direct {v7, v9, v10, v2, v8}, Lcom/pymcl/android/ui/theme/PyMotion;-><init>(ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 75
    new-instance v2, Lcom/pymcl/android/MainActivity$$ExternalSyntheticLambda3;

    invoke-direct {v2, p0}, Lcom/pymcl/android/MainActivity$$ExternalSyntheticLambda3;-><init>(Lcom/pymcl/android/ui/state/AppState;)V

    const/16 v8, 0x36

    const v9, 0x7792ea29

    invoke-static {v9, v1, v2, p1, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 69
    const/high16 v10, 0x30000

    const/4 v11, 0x0

    move-object v9, p1

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v9, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v3 .. v11}, Lcom/pymcl/android/ui/theme/ThemeKt;->PyMclTheme-3lEaxcQ(ZLandroidx/compose/ui/graphics/Color;Lcom/pymcl/android/ui/theme/BgPreset;Lcom/pymcl/android/ui/theme/PyShapes;Lcom/pymcl/android/ui/theme/PyMotion;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v0    # "s":Lcom/pymcl/android/ui/state/UiSettings;
    goto :goto_2

    .line 67
    .end local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_3
    move-object v9, p1

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v9    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 76
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private static final onCreate$lambda$1$0(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 3
    .param p0, "$state"    # Lcom/pymcl/android/ui/state/AppState;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const-string v0, "C74@4073L15:MainActivity.kt#kghqnz"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.pymcl.android.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:74)"

    const v2, 0x7792ea29

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 75
    :cond_1
    sget v0, Lcom/pymcl/android/ui/state/AppState;->$stable:I

    invoke-static {p0, p1, v0}, Lcom/pymcl/android/ui/PyMclAppKt;->PyMclApp(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final vpnLauncher$lambda$0(Lcom/pymcl/android/MainActivity;Landroidx/activity/result/ActivityResult;)V
    .locals 3
    .param p0, "this$0"    # Lcom/pymcl/android/MainActivity;
    .param p1, "r"    # Landroidx/activity/result/ActivityResult;

    const-string v0, "r"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerController;->Companion:Lcom/pymcl/multiplayer/MultiplayerController$Companion;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/pymcl/multiplayer/MultiplayerController$Companion;->get(Landroid/content/Context;)Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getResultCode()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/pymcl/multiplayer/MultiplayerController;->onVpnPermissionResult(Z)V

    .line 28
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 47
    sget-object v0, Lcom/pymcl/android/ui/i18n/I18n;->INSTANCE:Lcom/pymcl/android/ui/i18n/I18n;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-virtual {p0}, Lcom/pymcl/android/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "zh"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lcom/pymcl/android/ui/i18n/I18n$Lang;->Zh:Lcom/pymcl/android/ui/i18n/I18n$Lang;

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/pymcl/android/ui/i18n/I18n$Lang;->En:Lcom/pymcl/android/ui/i18n/I18n$Lang;

    :goto_0
    invoke-virtual {v0, v1, v2}, Lcom/pymcl/android/ui/i18n/I18n;->init(Landroid/content/Context;Lcom/pymcl/android/ui/i18n/I18n$Lang;)V

    .line 48
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 49
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, v1, v2}, Landroidx/activity/EdgeToEdge;->enable$default(Landroidx/activity/ComponentActivity;Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;ILjava/lang/Object;)V

    .line 59
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v3, 0x1

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/pymcl/android/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Lcom/pymcl/android/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    move-object v4, v1

    .local v4, "$this$onCreate_u24lambda_u240\\1":Landroid/view/WindowManager$LayoutParams;
    const/4 v5, 0x0

    .line 60
    .local v5, "$i$a$-apply-MainActivity$onCreate$1\\1\\59\\0":I
    iput v3, v4, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    .line 61
    nop

    .line 59
    .end local v4    # "$this$onCreate_u24lambda_u240\\1":Landroid/view/WindowManager$LayoutParams;
    .end local v5    # "$i$a$-apply-MainActivity$onCreate$1\\1\\59\\0":I
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 64
    :cond_1
    invoke-virtual {p0}, Lcom/pymcl/android/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 65
    invoke-direct {p0}, Lcom/pymcl/android/MainActivity;->getVm()Lcom/pymcl/android/ui/state/AppViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppViewModel;->getState()Lcom/pymcl/android/ui/state/AppState;

    move-result-object v0

    .line 66
    .local v0, "state":Lcom/pymcl/android/ui/state/AppState;
    invoke-direct {p0}, Lcom/pymcl/android/MainActivity;->observeVpnRequests()V

    .line 67
    move-object v1, p0

    check-cast v1, Landroidx/activity/ComponentActivity;

    new-instance v4, Lcom/pymcl/android/MainActivity$$ExternalSyntheticLambda0;

    invoke-direct {v4, v0}, Lcom/pymcl/android/MainActivity$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/android/ui/state/AppState;)V

    const v5, 0x4542be77

    invoke-static {v5, v3, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-static {v1, v2, v4, v3, v2}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 77
    return-void
.end method
