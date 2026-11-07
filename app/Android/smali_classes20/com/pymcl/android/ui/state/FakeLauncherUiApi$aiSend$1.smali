.class final Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LauncherUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/state/FakeLauncherUiApi;->aiSend(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/flow/FlowCollector<",
        "-",
        "Lcom/pymcl/android/ui/state/AiItem;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/flow/FlowCollector;",
        "Lcom/pymcl/android/ui/state/AiItem;"
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
    c = "com.pymcl.android.ui.state.FakeLauncherUiApi$aiSend$1"
    f = "LauncherUiApi.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x5,
        0x6,
        0x6,
        0x6
    }
    l = {
        0xb5,
        0xb5,
        0xb6,
        0xb7,
        0xb7,
        0xb8,
        0xb9
    }
    m = "invokeSuspend"
    n = {
        "$this$flow",
        "reply",
        "sb",
        "ch",
        "$this$flow",
        "reply",
        "sb",
        "ch",
        "$this$flow",
        "reply",
        "sb",
        "$this$flow",
        "reply",
        "sb",
        "$this$flow",
        "reply",
        "sb",
        "$this$flow",
        "reply",
        "sb",
        "$this$flow",
        "reply",
        "sb"
    }
    nl = {
        0xb5,
        0xb6,
        0xb7,
        0xb7,
        0xb8,
        0xb9,
        0xba
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "C$0",
        "L$0",
        "L$1",
        "L$2",
        "C$0",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2"
    }
    v = 0x2
.end annotation


# instance fields
.field C$0:C

.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;

    invoke-direct {v0, p2}, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;-><init>(Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/FlowCollector<",
            "-",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/flow/FlowCollector;

    .local v1, "$this$flow":Lkotlinx/coroutines/flow/FlowCollector;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 178
    iget v3, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->label:I

    const/4 v4, 0x1

    packed-switch v3, :pswitch_data_0

    .end local p0    # "this":Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .restart local p0    # "this":Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;
    :pswitch_0
    iget-object v2, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/StringBuilder;

    .local v2, "sb":Ljava/lang/StringBuilder;
    iget-object v3, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .local v3, "reply":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v0

    move-object v5, v3

    move-object v3, v2

    move-object v2, v1

    move-object/from16 v1, p1

    goto/16 :goto_7

    .end local v2    # "sb":Ljava/lang/StringBuilder;
    .end local v3    # "reply":Ljava/lang/String;
    :pswitch_1
    iget-object v3, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/StringBuilder;

    .local v3, "sb":Ljava/lang/StringBuilder;
    iget-object v4, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    .local v4, "reply":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v0

    move-object v5, v4

    move-object v4, v2

    move-object v2, v1

    move-object/from16 v1, p1

    goto/16 :goto_6

    .end local v3    # "sb":Ljava/lang/StringBuilder;
    .end local v4    # "reply":Ljava/lang/String;
    :pswitch_2
    iget-object v3, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/StringBuilder;

    .restart local v3    # "sb":Ljava/lang/StringBuilder;
    iget-object v4, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    .restart local v4    # "reply":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v0

    move-object v12, v3

    move-object v3, v2

    move-object v2, v1

    move-object/from16 v1, p1

    goto/16 :goto_5

    .end local v3    # "sb":Ljava/lang/StringBuilder;
    .end local v4    # "reply":Ljava/lang/String;
    :pswitch_3
    iget-object v3, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/StringBuilder;

    .restart local v3    # "sb":Ljava/lang/StringBuilder;
    iget-object v4, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    .restart local v4    # "reply":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v0

    move-object v12, v3

    move-object v3, v2

    move-object v2, v1

    move-object/from16 v1, p1

    goto/16 :goto_4

    .end local v3    # "sb":Ljava/lang/StringBuilder;
    .end local v4    # "reply":Ljava/lang/String;
    :pswitch_4
    iget-object v3, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/StringBuilder;

    .restart local v3    # "sb":Ljava/lang/StringBuilder;
    iget-object v4, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    .restart local v4    # "reply":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v0

    move-object v12, v3

    move-object v3, v2

    move-object v2, v1

    move-object/from16 v1, p1

    goto/16 :goto_3

    .end local v3    # "sb":Ljava/lang/StringBuilder;
    .end local v4    # "reply":Ljava/lang/String;
    :pswitch_5
    iget-char v3, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->C$0:C

    .local v3, "ch":C
    iget v5, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->I$1:I

    iget v6, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->I$0:I

    iget-object v7, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/StringBuilder;

    .local v7, "sb":Ljava/lang/StringBuilder;
    iget-object v8, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .local v8, "reply":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v0

    move-object v12, v7

    move v7, v5

    move-object v5, v2

    move-object v2, v1

    move-object/from16 v1, p1

    goto/16 :goto_2

    .end local v3    # "ch":C
    .end local v7    # "sb":Ljava/lang/StringBuilder;
    .end local v8    # "reply":Ljava/lang/String;
    :pswitch_6
    iget-char v3, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->C$0:C

    .restart local v3    # "ch":C
    iget v5, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->I$1:I

    iget v6, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->I$0:I

    iget-object v7, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/StringBuilder;

    .restart local v7    # "sb":Ljava/lang/StringBuilder;
    iget-object v8, v0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .restart local v8    # "reply":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v0

    move-object v9, v8

    move v8, v3

    move-object v3, v2

    move-object v2, v1

    move-object/from16 v1, p1

    goto :goto_1

    .end local v3    # "ch":C
    .end local v7    # "sb":Ljava/lang/StringBuilder;
    .end local v8    # "reply":Ljava/lang/String;
    :pswitch_7
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 179
    const-string v3, "\u597d\u7684\uff0c\u6211\u5148\u770b\u770b\u5f53\u524d\u5b9e\u4f8b\u7684\u72b6\u6001\uff0c\u7136\u540e\u5e2e\u4f60\u5b89\u88c5 Fabric \u548c\u94a0\uff08Sodium\uff09\u3002"

    .line 180
    .local v3, "reply":Ljava/lang/String;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .local v5, "sb":Ljava/lang/StringBuilder;
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x0

    move-object v13, v0

    move-object v12, v5

    move v5, v7

    move-object v7, v3

    move-object v3, v2

    move-object v2, v1

    move-object/from16 v1, p1

    .end local v3    # "reply":Ljava/lang/String;
    .end local v5    # "sb":Ljava/lang/StringBuilder;
    .end local p0    # "this":Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v1, "$result":Ljava/lang/Object;
    .local v2, "$this$flow":Lkotlinx/coroutines/flow/FlowCollector;
    .local v7, "reply":Ljava/lang/String;
    .local v12, "sb":Ljava/lang/StringBuilder;
    .local v13, "this":Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;
    :goto_0
    if-ge v5, v6, :cond_2

    invoke-virtual {v7, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .local v8, "ch":C
    int-to-char v9, v8

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    new-instance v14, Lcom/pymcl/android/ui/state/AiItem$Assistant;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "toString(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v19, 0x8

    const/16 v20, 0x0

    const-string v15, "a"

    const/16 v17, 0x1

    const/16 v18, 0x0

    move-object/from16 v16, v9

    invoke-direct/range {v14 .. v20}, Lcom/pymcl/android/ui/state/AiItem$Assistant;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v13

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput-object v2, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$0:Ljava/lang/Object;

    iput-object v7, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    iput-object v12, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    iput v5, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->I$0:I

    iput v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->I$1:I

    iput-char v8, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->C$0:C

    iput v4, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->label:I

    invoke-interface {v2, v14, v9}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_0

    .line 178
    return-object v3

    .line 181
    :cond_0
    move v9, v6

    move v6, v5

    move v5, v9

    move-object v9, v7

    move-object v7, v12

    .end local v12    # "sb":Ljava/lang/StringBuilder;
    .local v7, "sb":Ljava/lang/StringBuilder;
    .local v9, "reply":Ljava/lang/String;
    :goto_1
    move-object v10, v13

    check-cast v10, Lkotlin/coroutines/Continuation;

    iput-object v2, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$0:Ljava/lang/Object;

    iput-object v9, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    iput-object v7, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    iput v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->I$0:I

    iput v5, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->I$1:I

    iput-char v8, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->C$0:C

    const/4 v11, 0x2

    iput v11, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->label:I

    const-wide/16 v11, 0x12

    invoke-static {v11, v12, v10}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_1

    .line 178
    return-object v3

    .line 181
    :cond_1
    move-object v12, v7

    move v7, v5

    move-object v5, v3

    move v3, v8

    move-object v8, v9

    .end local v7    # "sb":Ljava/lang/StringBuilder;
    .end local v9    # "reply":Ljava/lang/String;
    .local v3, "ch":C
    .local v8, "reply":Ljava/lang/String;
    .restart local v12    # "sb":Ljava/lang/StringBuilder;
    :goto_2
    nop

    .end local v3    # "ch":C
    add-int/lit8 v3, v6, 0x1

    move-object v6, v5

    move v5, v3

    move-object v3, v6

    move v6, v7

    move-object v7, v8

    goto :goto_0

    .line 182
    .end local v8    # "reply":Ljava/lang/String;
    .local v7, "reply":Ljava/lang/String;
    :cond_2
    new-instance v5, Lcom/pymcl/android/ui/state/AiItem$Assistant;

    const/16 v10, 0xc

    const/4 v11, 0x0

    const-string v6, "a"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/pymcl/android/ui/state/AiItem$Assistant;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v13

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object v2, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$0:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->label:I

    invoke-interface {v2, v5, v4}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_3

    .line 178
    return-object v3

    .line 182
    :cond_3
    move-object v4, v7

    .line 183
    .end local v7    # "reply":Ljava/lang/String;
    .restart local v4    # "reply":Ljava/lang/String;
    :goto_3
    new-instance v14, Lcom/pymcl/android/ui/state/AiItem$Tool;

    sget-object v19, Lcom/pymcl/android/ui/state/TaskState;->Running:Lcom/pymcl/android/ui/state/TaskState;

    const/16 v21, 0x20

    const/16 v22, 0x0

    const-string v15, "t1"

    const-string v16, "get_launcher_state"

    const-string v17, "\u8bfb\u53d6\u542f\u52a8\u5668\u72b6\u6001"

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lcom/pymcl/android/ui/state/AiItem$Tool;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v13

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v2, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$0:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->label:I

    invoke-interface {v2, v14, v5}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_4

    .line 178
    return-object v3

    .line 183
    :cond_4
    :goto_4
    move-object v5, v13

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v2, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$0:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    const/4 v6, 0x5

    iput v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->label:I

    const-wide/16 v6, 0x1f4

    invoke-static {v6, v7, v5}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_5

    .line 178
    return-object v3

    .line 184
    :cond_5
    :goto_5
    new-instance v14, Lcom/pymcl/android/ui/state/AiItem$Tool;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v18

    sget-object v19, Lcom/pymcl/android/ui/state/TaskState;->Done:Lcom/pymcl/android/ui/state/TaskState;

    const/16 v21, 0x20

    const/16 v22, 0x0

    const-string v15, "t1"

    const-string v16, "get_launcher_state"

    const-string v17, "\u8bfb\u53d6\u542f\u52a8\u5668\u72b6\u6001"

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lcom/pymcl/android/ui/state/AiItem$Tool;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v13

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v2, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$0:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    const/4 v6, 0x6

    iput v6, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->label:I

    invoke-interface {v2, v14, v5}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_6

    .line 178
    return-object v3

    .line 184
    :cond_6
    move-object v5, v4

    move-object v4, v3

    move-object v3, v12

    .line 185
    .end local v4    # "reply":Ljava/lang/String;
    .end local v12    # "sb":Ljava/lang/StringBuilder;
    .local v3, "sb":Ljava/lang/StringBuilder;
    .local v5, "reply":Ljava/lang/String;
    :goto_6
    new-instance v14, Lcom/pymcl/android/ui/state/AiItem$Confirm;

    const/16 v20, 0x10

    const/16 v21, 0x0

    const-string v15, "cf"

    const-string v16, "install_mod"

    const-string v17, "\u5b89\u88c5 Sodium 0.6.13 \u5230\u300c\u9ed8\u8ba4\u300d/ 1.21.1-Fabric"

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v21}, Lcom/pymcl/android/ui/state/AiItem$Confirm;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v13

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$0:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$1:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->L$2:Ljava/lang/Object;

    const/4 v7, 0x7

    iput v7, v13, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$aiSend$1;->label:I

    invoke-interface {v2, v14, v6}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_7

    .line 178
    return-object v4

    .line 186
    :cond_7
    :goto_7
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
