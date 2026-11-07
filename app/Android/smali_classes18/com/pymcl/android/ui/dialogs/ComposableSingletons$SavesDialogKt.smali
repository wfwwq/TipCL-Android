.class public final Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt;
.super Ljava/lang/Object;
.source "SavesDialog.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt;

.field private static lambda$-1870378918:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private static lambda$-871244233:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$dbl79TuIHZgn_UCS0fPIX81FSLs(Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt;->lambda__1870378918$lambda$0(Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$kG98G609VLlUxzl3YdDqS5Bu9no(Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt;->lambda__871244233$lambda$0(Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt;

    invoke-direct {v0}, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt;->INSTANCE:Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt;

    .line 335
    new-instance v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt$$ExternalSyntheticLambda0;-><init>()V

    const v1, -0x33ee21c9    # -3.8238428E7f

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sput-object v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt;->lambda$-871244233:Lkotlin/jvm/functions/Function2;

    .line 345
    new-instance v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt$$ExternalSyntheticLambda1;-><init>()V

    const v1, -0x6f7bb7a6

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sput-object v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt;->lambda$-1870378918:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final lambda__1870378918$lambda$0(Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 12
    .param p0, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p1, "$changed"    # I

    const-string v0, "C344@23171L6,344@23107L79:SavesDialog.kt#2dz5k2"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p1, 0x1

    invoke-interface {p0, v0, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v4, "com.pymcl.android.ui.dialogs.ComposableSingletons$SavesDialogKt.lambda$-1870378918.<anonymous> (SavesDialog.kt:344)"

    const v5, -0x6f7bb7a6

    invoke-static {v5, p1, v0, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 345
    :cond_1
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v4, v1, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v1, 0x3fe38e39

    invoke-static {v0, v1, v2, v3, v5}, Landroidx/compose/foundation/layout/AspectRatioKt;->aspectRatio$default(Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v0, Lcom/pymcl/android/ui/theme/Py;->INSTANCE:Lcom/pymcl/android/ui/theme/Py;

    const/4 v1, 0x6

    invoke-virtual {v0, p0, v1}, Lcom/pymcl/android/ui/theme/Py;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/pymcl/android/ui/theme/PyColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/android/ui/theme/PyColors;->getPaper2-0d7_KjU()J

    move-result-wide v7

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final lambda__871244233$lambda$0(Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10
    .param p0, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p1, "$changed"    # I

    const-string v0, "C334@22338L16:SavesDialog.kt#2dz5k2"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-interface {p0, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.pymcl.android.ui.dialogs.ComposableSingletons$SavesDialogKt.lambda$-871244233.<anonymous> (SavesDialog.kt:334)"

    const v2, -0x33ee21c9    # -3.8238428E7f

    invoke-static {v2, p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 335
    :cond_1
    const/4 v8, 0x6

    const/16 v9, 0xe

    const-string v3, "\u8bfb\u4e0d\u4e86\u8fd9\u4e2a\u6587\u4ef6"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p0

    .end local p0    # "$composer":Landroidx/compose/runtime/Composer;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v3 .. v9}, Lcom/pymcl/android/ui/components/UiKt;->Muted(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZILandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p0    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_2
    move-object v7, p0

    .end local p0    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final getLambda$-1870378918$PyMCL_Android_app_debug()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt;->lambda$-1870378918:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final getLambda$-871244233$PyMCL_Android_app_debug()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$SavesDialogKt;->lambda$-871244233:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method
