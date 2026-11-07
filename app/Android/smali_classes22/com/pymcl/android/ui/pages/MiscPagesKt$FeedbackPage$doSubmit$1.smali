.class final Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MiscPages.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/MiscPagesKt;->FeedbackPage$doSubmit(Ljava/lang/String;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMiscPages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiscPages.kt\ncom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,585:1\n1#2:586\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$doSubmit$1"
    f = "MiscPages.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2
    }
    l = {
        0x1f2,
        0x20a,
        0x210
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$launch",
        "outcome",
        "$this$launch",
        "outcome"
    }
    nl = {
        0x204,
        0x210,
        0x211
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $appVersion:Ljava/lang/String;

.field final synthetic $attachments$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $body$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $contact$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $hist$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/FeedbackRecord;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $kind$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $problem:Ljava/lang/String;

.field final synthetic $sending$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $sys$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $sysText:Ljava/lang/String;

.field final synthetic $title$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public static synthetic $r8$lambda$3IWeK1tmj6EMUYMi5iwUEgcC7XU(Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;Ljava/lang/String;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Z)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p14}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->invokeSuspend$lambda$0(Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;Ljava/lang/String;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;>;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/FeedbackRecord;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$ctx:Landroid/content/Context;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$appVersion:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sysText:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$kind$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$title$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$body$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$contact$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sys$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p10, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$attachments$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p11, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$problem:Ljava/lang/String;

    iput-object p12, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$hist$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p13, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sending$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p14}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;Ljava/lang/String;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Z)Lkotlin/Unit;
    .locals 17
    .param p0, "$$this$launch"    # Lkotlinx/coroutines/CoroutineScope;
    .param p1, "$ctx"    # Landroid/content/Context;
    .param p2, "$problem"    # Ljava/lang/String;
    .param p3, "$state"    # Lcom/pymcl/android/ui/state/AppState;
    .param p4, "$sending$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p5, "$appVersion"    # Ljava/lang/String;
    .param p6, "$sysText"    # Ljava/lang/String;
    .param p7, "$kind$delegate"    # Landroidx/compose/runtime/MutableIntState;
    .param p8, "$title$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p9, "$body$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p10, "$contact$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p11, "$sys$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p12, "$attachments$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p13, "$hist$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p14, "ok"    # Z

    .line 518
    move/from16 v1, p14

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    .line 586
    .local v0, "$this$invokeSuspend_u24lambda_u240_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v2, 0x0

    .line 518
    .local v2, "$i$a$-runCatching-MiscPagesKt$FeedbackPage$doSubmit$1$1$1\\1\\518\\0":I
    sget-object v3, Lcom/pymcl/android/data/LauncherPrefs;->INSTANCE:Lcom/pymcl/android/data/LauncherPrefs;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v7, p1

    :try_start_1
    invoke-virtual {v3, v7}, Lcom/pymcl/android/data/LauncherPrefs;->store(Landroid/content/Context;)Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    move-result-object v3

    const-string v4, "feedback_consent"

    invoke-virtual {v3, v4, v1}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->putBoolean(Ljava/lang/String;Z)V

    .end local v0    # "$this$invokeSuspend_u24lambda_u240_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v2    # "$i$a$-runCatching-MiscPagesKt$FeedbackPage$doSubmit$1$1$1\\1\\518\\0":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object/from16 v7, p1

    :goto_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    :goto_1
    if-eqz v1, :cond_0

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v16, p13

    invoke-static/range {v4 .. v16}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$FeedbackPage$doSubmit(Ljava/lang/String;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    .line 520
    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;

    iget-object v2, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$ctx:Landroid/content/Context;

    iget-object v4, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$appVersion:Ljava/lang/String;

    iget-object v5, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sysText:Ljava/lang/String;

    iget-object v6, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$kind$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v7, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$title$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$body$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v9, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$contact$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v10, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sys$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v11, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$attachments$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v12, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$problem:Ljava/lang/String;

    iget-object v13, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$hist$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v14, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sending$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v15, p2

    invoke-direct/range {v1 .. v15}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    move-object v2, v1

    move-object/from16 v1, p1

    iput-object v1, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lkotlin/coroutines/Continuation;

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->L$0:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlinx/coroutines/CoroutineScope;

    .local v3, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 496
    iget v2, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->label:I

    const-string v4, "{0}\uff1b\u53ef\u6539\u7528\u300c\u590d\u5236\u5e76\u5206\u4eab\u300d\u53d1\u7ed9\u5f00\u53d1\u8005"

    const-string v5, "error"

    const-string v6, "\u63d0\u4ea4\u5931\u8d25"

    packed-switch v2, :pswitch_data_0

    move-object v2, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->L$2:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/runtime/MutableState;

    iget-object v2, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/pymcl/android/data/FeedbackSubmit$Outcome;

    .local v2, "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v15, v2

    move-object/from16 v22, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v4, p1

    move-object v2, v1

    goto/16 :goto_8

    .end local v2    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :pswitch_1
    iget-object v2, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/pymcl/android/data/FeedbackSubmit$Outcome;

    .restart local v2    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v15, v2

    move-object/from16 v22, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object v2, v1

    goto/16 :goto_7

    .end local v2    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v2, p1

    move-object/from16 v19, v4

    goto :goto_3

    .line 538
    :catchall_0
    move-exception v0

    move-object v2, v1

    :goto_0
    const/4 v1, 0x0

    goto/16 :goto_12

    .line 536
    :catch_0
    move-exception v0

    move-object v2, v1

    move-object v7, v5

    move-object v14, v6

    :goto_1
    const/4 v1, 0x0

    goto/16 :goto_f

    .line 534
    :catch_1
    move-exception v0

    move-object v2, v1

    :goto_2
    const/4 v1, 0x0

    goto/16 :goto_11

    .line 496
    :pswitch_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 497
    nop

    .line 498
    :try_start_2
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v8, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1;

    iget-object v9, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$ctx:Landroid/content/Context;

    iget-object v10, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$appVersion:Ljava/lang/String;

    iget-object v11, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sysText:Ljava/lang/String;

    iget-object v12, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$kind$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v13, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$title$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v14, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$body$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v15, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$contact$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sys$delegate:Landroidx/compose/runtime/MutableState;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object/from16 v19, v4

    :try_start_3
    iget-object v4, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$attachments$delegate:Landroidx/compose/runtime/MutableState;

    const/16 v18, 0x0

    move-object/from16 v17, v4

    move-object/from16 v16, v7

    invoke-direct/range {v8 .. v18}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v8, Lkotlin/jvm/functions/Function2;

    move-object v4, v1

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object v3, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->L$0:Ljava/lang/Object;

    const/4 v7, 0x1

    iput v7, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->label:I

    invoke-static {v2, v8, v4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_0

    .line 496
    return-object v0

    :cond_0
    :goto_3
    check-cast v2, Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_16
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v9, v2

    .line 516
    .local v9, "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    nop

    .line 517
    if-nez v9, :cond_1

    :try_start_4
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    new-instance v2, Lcom/pymcl/android/ui/state/DialogSpec$FeedbackConsent;

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$ctx:Landroid/content/Context;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_15
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_b
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-object v7, v5

    :try_start_5
    iget-object v5, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$problem:Ljava/lang/String;
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_15
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_a
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object v8, v6

    :try_start_6
    iget-object v6, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$state:Lcom/pymcl/android/ui/state/AppState;
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_15
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_9
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-object v10, v7

    :try_start_7
    iget-object v7, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sending$delegate:Landroidx/compose/runtime/MutableState;
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_15
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_8
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    move-object v11, v8

    :try_start_8
    iget-object v8, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$appVersion:Ljava/lang/String;

    move-object v12, v9

    .end local v9    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    .local v12, "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    iget-object v9, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sysText:Ljava/lang/String;
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_15
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    move-object v13, v10

    :try_start_9
    iget-object v10, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$kind$delegate:Landroidx/compose/runtime/MutableIntState;
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_15
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    move-object v14, v11

    :try_start_a
    iget-object v11, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$title$delegate:Landroidx/compose/runtime/MutableState;

    move-object v15, v12

    .end local v12    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    .local v15, "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    iget-object v12, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$body$delegate:Landroidx/compose/runtime/MutableState;
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_15
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    move-object/from16 v16, v13

    :try_start_b
    iget-object v13, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$contact$delegate:Landroidx/compose/runtime/MutableState;
    :try_end_b
    .catch Ljava/util/concurrent/CancellationException; {:try_start_b .. :try_end_b} :catch_15
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    move-object/from16 v17, v14

    :try_start_c
    iget-object v14, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sys$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v18, v15

    .end local v15    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    .local v18, "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    iget-object v15, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$attachments$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v20, v2

    iget-object v2, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$hist$delegate:Landroidx/compose/runtime/MutableState;
    :try_end_c
    .catch Ljava/util/concurrent/CancellationException; {:try_start_c .. :try_end_c} :catch_15
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    move-object/from16 v21, v16

    move-object/from16 v16, v2

    :try_start_d
    new-instance v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$$ExternalSyntheticLambda0;
    :try_end_d
    .catch Ljava/util/concurrent/CancellationException; {:try_start_d .. :try_end_d} :catch_15
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_2
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    move-object/from16 v24, v17

    move-object/from16 v22, v19

    move-object/from16 v1, v20

    move-object/from16 v23, v21

    :try_start_e
    invoke-direct/range {v2 .. v16}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$$ExternalSyntheticLambda0;-><init>(Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;Ljava/lang/String;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    invoke-direct {v1, v2}, Lcom/pymcl/android/ui/state/DialogSpec$FeedbackConsent;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v2, v1

    check-cast v2, Lcom/pymcl/android/ui/state/DialogSpec;

    invoke-virtual {v0, v2}, Lcom/pymcl/android/ui/state/AppState;->open(Lcom/pymcl/android/ui/state/DialogSpec;)V

    move-object/from16 v2, p0

    goto/16 :goto_b

    .line 536
    .end local v18    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :catch_2
    move-exception v0

    move-object/from16 v24, v17

    move-object/from16 v22, v19

    move-object/from16 v23, v21

    goto/16 :goto_d

    :catch_3
    move-exception v0

    move-object/from16 v23, v16

    move-object/from16 v24, v17

    goto :goto_6

    :catch_4
    move-exception v0

    move-object/from16 v24, v14

    move-object/from16 v23, v16

    goto :goto_4

    :catch_5
    move-exception v0

    move-object/from16 v23, v13

    move-object/from16 v24, v14

    :goto_4
    move-object/from16 v22, v19

    const/4 v1, 0x0

    move-object/from16 v2, p0

    move-object/from16 v4, v22

    move-object/from16 v7, v23

    goto/16 :goto_f

    :catch_6
    move-exception v0

    move-object/from16 v24, v11

    move-object/from16 v23, v13

    goto :goto_6

    :catch_7
    move-exception v0

    move-object/from16 v23, v10

    move-object/from16 v24, v11

    goto :goto_6

    :catch_8
    move-exception v0

    move-object/from16 v24, v8

    move-object/from16 v23, v10

    goto :goto_6

    :catch_9
    move-exception v0

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    goto :goto_5

    :catch_a
    move-exception v0

    move-object/from16 v24, v6

    move-object/from16 v23, v7

    :goto_5
    move-object/from16 v22, v19

    const/4 v1, 0x0

    move-object/from16 v2, p0

    move-object/from16 v4, v22

    goto/16 :goto_e

    :catch_b
    move-exception v0

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    :goto_6
    move-object/from16 v22, v19

    goto/16 :goto_d

    .line 521
    .restart local v9    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :cond_1
    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v18, v9

    move-object/from16 v22, v19

    .end local v9    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    .restart local v18    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    move-object/from16 v15, v18

    .end local v18    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    .restart local v15    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    instance-of v1, v15, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$Submitted;
    :try_end_e
    .catch Ljava/util/concurrent/CancellationException; {:try_start_e .. :try_end_e} :catch_15
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_14
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    if-eqz v1, :cond_4

    .line 522
    :try_start_f
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v7, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;
    :try_end_f
    .catch Ljava/util/concurrent/CancellationException; {:try_start_f .. :try_end_f} :catch_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_e
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    move-object/from16 v2, p0

    :try_start_10
    iget-object v8, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$ctx:Landroid/content/Context;

    iget-object v10, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$kind$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v11, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$title$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v12, 0x0

    move-object v9, v15

    .end local v15    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    .restart local v9    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    invoke-direct/range {v7 .. v12}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;-><init>(Landroid/content/Context;Lcom/pymcl/android/data/FeedbackSubmit$Outcome;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    .end local v9    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    .restart local v15    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    check-cast v7, Lkotlin/jvm/functions/Function2;

    move-object v4, v2

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->L$0:Ljava/lang/Object;

    iput-object v15, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->L$1:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->label:I

    invoke-static {v1, v7, v4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    .line 496
    return-object v0

    .line 528
    :cond_2
    :goto_7
    iget-object v1, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$hist$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v4

    move-object v5, v2

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->L$0:Ljava/lang/Object;

    iput-object v15, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->L$1:Ljava/lang/Object;

    iput-object v1, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->L$2:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->label:I

    invoke-interface {v4, v5}, Lcom/pymcl/android/ui/state/LauncherUiApi;->feedbackHistory(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_3

    .line 496
    return-object v0

    .line 528
    :cond_3
    move-object v0, v1

    :goto_8
    check-cast v4, Ljava/util/List;

    invoke-static {v0, v4}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$FeedbackPage$lambda$20(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 529
    iget-object v5, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v6, "\u5df2\u63d0\u4ea4"

    move-object v0, v15

    check-cast v0, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$Submitted;

    invoke-virtual {v0}, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$Submitted;->getId()Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto/16 :goto_b

    .line 538
    .end local v15    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :catchall_1
    move-exception v0

    goto/16 :goto_0

    .line 536
    :catch_c
    move-exception v0

    :goto_9
    move-object/from16 v4, v22

    :goto_a
    move-object/from16 v7, v23

    move-object/from16 v14, v24

    goto/16 :goto_1

    .line 534
    :catch_d
    move-exception v0

    goto/16 :goto_2

    .line 538
    :catchall_2
    move-exception v0

    move-object/from16 v2, p0

    goto/16 :goto_0

    .line 536
    :catch_e
    move-exception v0

    move-object/from16 v2, p0

    goto :goto_9

    .line 534
    :catch_f
    move-exception v0

    move-object/from16 v2, p0

    goto/16 :goto_2

    .line 531
    .restart local v15    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :cond_4
    move-object/from16 v2, p0

    instance-of v0, v15, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$ServerError;

    if-eqz v0, :cond_5

    iget-object v0, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    move-object v1, v15

    check-cast v1, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$ServerError;

    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$ServerError;->getError()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1
    :try_end_10
    .catch Ljava/util/concurrent/CancellationException; {:try_start_10 .. :try_end_10} :catch_d
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_c
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    move-object/from16 v4, v22

    :try_start_11
    invoke-static {v4, v1}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1
    :try_end_11
    .catch Ljava/util/concurrent/CancellationException; {:try_start_11 .. :try_end_11} :catch_d
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_10
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    move-object/from16 v7, v23

    move-object/from16 v14, v24

    :try_start_12
    invoke-virtual {v0, v14, v1, v7}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_b

    .line 536
    .end local v15    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :catch_10
    move-exception v0

    goto :goto_a

    .line 532
    .restart local v15    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :cond_5
    move-object/from16 v4, v22

    move-object/from16 v7, v23

    move-object/from16 v14, v24

    instance-of v0, v15, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$HttpError;

    if-eqz v0, :cond_6

    iget-object v0, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v1, "HTTP {0}\uff1a{1}\n\u53ef\u6539\u7528\u300c\u590d\u5236\u5e76\u5206\u4eab\u300d"

    move-object v5, v15

    check-cast v5, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$HttpError;

    invoke-virtual {v5}, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$HttpError;->getCode()I

    move-result v5

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v5

    move-object v6, v15

    check-cast v6, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$HttpError;

    invoke-virtual {v6}, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$HttpError;->getBody()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1, v5}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v14, v1, v7}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_12
    .catch Ljava/util/concurrent/CancellationException; {:try_start_12 .. :try_end_12} :catch_d
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_13
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 538
    .end local v15    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :goto_b
    iget-object v0, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sending$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v1, 0x0

    :goto_c
    invoke-static {v0, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$FeedbackPage$lambda$32(Landroidx/compose/runtime/MutableState;Z)V

    goto :goto_10

    .line 516
    .restart local v15    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    :cond_6
    const/4 v1, 0x0

    :try_start_13
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .end local v3    # "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    .end local p1    # "$result":Ljava/lang/Object;
    throw v0
    :try_end_13
    .catch Ljava/util/concurrent/CancellationException; {:try_start_13 .. :try_end_13} :catch_12
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_11
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 536
    .end local v15    # "outcome":Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    .restart local v3    # "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    .restart local p1    # "$result":Ljava/lang/Object;
    :catch_11
    move-exception v0

    goto :goto_f

    .line 534
    :catch_12
    move-exception v0

    goto :goto_11

    .line 536
    :catch_13
    move-exception v0

    goto/16 :goto_1

    .line 538
    :catchall_3
    move-exception v0

    const/4 v1, 0x0

    move-object/from16 v2, p0

    goto :goto_12

    .line 536
    :catch_14
    move-exception v0

    :goto_d
    const/4 v1, 0x0

    move-object/from16 v2, p0

    move-object/from16 v4, v22

    move-object/from16 v7, v23

    :goto_e
    move-object/from16 v14, v24

    goto :goto_f

    .line 534
    :catch_15
    move-exception v0

    const/4 v1, 0x0

    move-object/from16 v2, p0

    goto :goto_11

    .line 536
    :catch_16
    move-exception v0

    move-object v2, v1

    move-object v7, v5

    move-object v14, v6

    move-object/from16 v4, v19

    goto/16 :goto_1

    .line 537
    .local v0, "e":Ljava/lang/Exception;
    :goto_f
    :try_start_14
    iget-object v5, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_7

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_7
    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v14, v4, v7}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 538
    .end local v0    # "e":Ljava/lang/Exception;
    iget-object v0, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sending$delegate:Landroidx/compose/runtime/MutableState;

    goto :goto_c

    .line 539
    :goto_10
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 535
    .local v0, "e":Ljava/util/concurrent/CancellationException;
    :goto_11
    nop

    .end local v3    # "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    .end local p1    # "$result":Ljava/lang/Object;
    :try_start_15
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    .line 538
    .end local v0    # "e":Ljava/util/concurrent/CancellationException;
    .restart local v3    # "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    .restart local p1    # "$result":Ljava/lang/Object;
    :catchall_4
    move-exception v0

    :goto_12
    iget-object v4, v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->$sending$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v4, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$FeedbackPage$lambda$32(Landroidx/compose/runtime/MutableState;Z)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
