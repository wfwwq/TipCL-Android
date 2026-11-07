.class public final Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt;
.super Ljava/lang/Object;
.source "GamePages.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGamePages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamePages.kt\ncom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,303:1\n1247#2,6:304\n*S KotlinDebug\n*F\n+ 1 GamePages.kt\ncom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt\n*L\n265#1:304,6\n*E\n"
.end annotation

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
.field public static final INSTANCE:Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt;

.field private static lambda$-41025310:Lkotlin/jvm/functions/Function2;
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
.method public static synthetic $r8$lambda$dbkvOzn9IKoIwLxFohoR-UW92io(Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt;->lambda__41025310$lambda$0(Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$oI8Kz3nZZ4K3UNkqoxp-jUWWhaE(I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt;->lambda__41025310$lambda$0$0$0(I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt;

    invoke-direct {v0}, Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt;->INSTANCE:Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt;

    .line 265
    new-instance v0, Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt$$ExternalSyntheticLambda0;-><init>()V

    const v1, -0x271ff1e

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sput-object v0, Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt;->lambda$-41025310:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final lambda__41025310$lambda$0(Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 12
    .param p0, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p1, "$changed"    # I

    const-string v0, "C264@17398L2,264@17361L77:GamePages.kt#vz4689"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p1, 0x1

    invoke-interface {p0, v0, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v4, "com.pymcl.android.ui.pages.ComposableSingletons$GamePagesKt.lambda$-41025310.<anonymous> (GamePages.kt:264)"

    const v5, -0x271ff1e

    invoke-static {v5, p1, v0, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 265
    :cond_1
    new-array v0, v3, [Ljava/lang/String;

    const-string v3, "\u9ed8\u8ba4"

    aput-object v3, v0, v1

    const-string v1, "\u751f\u5b58\u670d 1.20.1"

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const v0, -0x2deeaabc

    const-string v1, "CC(remember):GamePages.kt#9igjgp"

    invoke-static {p0, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid\\1":Z
    move-object v1, p0

    .local v1, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 304
    .local v4, "$i$f$cache\\1\\265":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\1":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 305
    .local v6, "$i$a$-let-ComposerKt$cache$1\\2\\304\\1":I
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_2

    .line 306
    const/4 v7, 0x0

    .line 265
    .local v7, "$i$a$-cache-ComposableSingletons$GamePagesKt$lambda$-41025310$1$1\\3\\306\\0":I
    new-instance v8, Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt$$ExternalSyntheticLambda1;

    invoke-direct {v8}, Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt$$ExternalSyntheticLambda1;-><init>()V

    .line 306
    .end local v7    # "$i$a$-cache-ComposableSingletons$GamePagesKt$lambda$-41025310$1$1\\3\\306\\0":I
    nop

    .line 307
    .local v8, "value\\2":Ljava/lang/Object;
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 308
    move-object v5, v8

    .end local v8    # "value\\2":Ljava/lang/Object;
    goto :goto_1

    .line 309
    :cond_2
    nop

    .line 304
    .end local v5    # "it\\1":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1\\2\\304\\1":I
    :goto_1
    nop

    .line 265
    .end local v0    # "invalid\\1":Z
    .end local v1    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\1\\265":I
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v10, 0x6db6

    const/16 v11, 0x20

    const/4 v4, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v9, p0

    .end local p0    # "$composer":Landroidx/compose/runtime/Composer;
    .local v9, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v3 .. v11}, Lcom/pymcl/android/ui/components/UiKt;->Combo(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_2

    .end local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p0    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_3
    move-object v9, p0

    .end local p0    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v9    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final lambda__41025310$lambda$0$0$0(I)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # I

    .line 265
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final getLambda$-41025310$PyMCL_Android_app_debug()Lkotlin/jvm/functions/Function2;
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

    sget-object v0, Lcom/pymcl/android/ui/pages/ComposableSingletons$GamePagesKt;->lambda$-41025310:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method
