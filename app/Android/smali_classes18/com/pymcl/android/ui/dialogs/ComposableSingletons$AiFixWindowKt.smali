.class public final Lcom/pymcl/android/ui/dialogs/ComposableSingletons$AiFixWindowKt;
.super Ljava/lang/Object;
.source "AiFixWindow.kt"


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
.field public static final INSTANCE:Lcom/pymcl/android/ui/dialogs/ComposableSingletons$AiFixWindowKt;

.field private static lambda$-188096457:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$gzpaJ-071Irq47ZyjCFrLbjgsYc(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$AiFixWindowKt;->lambda__188096457$lambda$0(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$AiFixWindowKt;

    invoke-direct {v0}, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$AiFixWindowKt;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$AiFixWindowKt;->INSTANCE:Lcom/pymcl/android/ui/dialogs/ComposableSingletons$AiFixWindowKt;

    .line 131
    new-instance v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$AiFixWindowKt$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$AiFixWindowKt$$ExternalSyntheticLambda0;-><init>()V

    const v1, -0xb361fc9

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    sput-object v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$AiFixWindowKt;->lambda$-188096457:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final lambda__188096457$lambda$0(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10
    .param p0, "$this$item"    # Landroidx/compose/foundation/lazy/LazyItemScope;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const-string v0, "$this$item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C130@6457L15:AiFixWindow.kt#2dz5k2"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0x11

    const/16 v1, 0x10

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

    const-string v1, "com.pymcl.android.ui.dialogs.ComposableSingletons$AiFixWindowKt.lambda$-188096457.<anonymous> (AiFixWindow.kt:130)"

    const v2, -0xb361fc9

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 131
    :cond_1
    const/4 v8, 0x6

    const/16 v9, 0xe

    const-string v3, "\u6b63\u5728\u8bfb\u65e5\u5fd7\u2026"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p1

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v3 .. v9}, Lcom/pymcl/android/ui/components/UiKt;->Muted(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZILandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_2
    move-object v7, p1

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method


# virtual methods
.method public final getLambda$-188096457$PyMCL_Android_app_debug()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/android/ui/dialogs/ComposableSingletons$AiFixWindowKt;->lambda$-188096457:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
