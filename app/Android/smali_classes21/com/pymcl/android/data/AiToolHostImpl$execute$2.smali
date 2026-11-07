.class final Lcom/pymcl/android/data/AiToolHostImpl$execute$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiToolHostImpl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/AiToolHostImpl;->execute(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/ai/ToolOutput;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiToolHostImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiToolHostImpl.kt\ncom/pymcl/android/data/AiToolHostImpl$execute$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1#2:183\n14426#3,3:184\n1739#4:187\n1814#4,3:188\n1739#4:191\n1814#4,3:192\n1739#4:195\n1814#4,3:196\n1739#4:199\n1814#4,3:200\n1739#4:203\n1814#4,3:204\n296#4,2:207\n1739#4:209\n1814#4,3:210\n777#4:213\n873#4,2:214\n1739#4:216\n1814#4,3:217\n1739#4:220\n1814#4,3:221\n1739#4:224\n1814#4,3:225\n1739#4:228\n1814#4,3:229\n1739#4:232\n1814#4,3:233\n*S KotlinDebug\n*F\n+ 1 AiToolHostImpl.kt\ncom/pymcl/android/data/AiToolHostImpl$execute$2\n*L\n67#1:184,3\n69#1:187\n69#1:188,3\n70#1:191\n70#1:192,3\n71#1:195\n71#1:196,3\n75#1:199\n75#1:200,3\n76#1:203\n76#1:204,3\n81#1:207,2\n82#1:209\n82#1:210,3\n84#1:213\n84#1:214,2\n84#1:216\n84#1:217,3\n85#1:220\n85#1:221,3\n92#1:224\n92#1:225,3\n116#1:228\n116#1:229,3\n128#1:232\n128#1:233,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/pymcl/ai/ToolOutput;",
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
    c = "com.pymcl.android.data.AiToolHostImpl$execute$2"
    f = "AiToolHostImpl.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x4,
        0x4,
        0x5,
        0x5,
        0x5,
        0x6,
        0x7,
        0x8,
        0x9,
        0xa,
        0xa,
        0xa,
        0xb,
        0xb,
        0xb,
        0xc,
        0xd,
        0xe,
        0xf,
        0x10,
        0x11,
        0x12,
        0x12,
        0x13,
        0x13,
        0x14,
        0x14,
        0x14,
        0x15,
        0x15,
        0x15,
        0x15,
        0x16,
        0x16,
        0x16,
        0x16,
        0x17,
        0x17,
        0x17,
        0x17,
        0x18,
        0x19,
        0x19,
        0x1a,
        0x1a,
        0x1a,
        0x1b,
        0x1b,
        0x1b
    }
    l = {
        0x42,
        0x45,
        0x47,
        0x4b,
        0x4c,
        0x50,
        0x57,
        0x58,
        0x59,
        0x5a,
        0x5c,
        0x5f,
        0x62,
        0x63,
        0x64,
        0x65,
        0x66,
        0x67,
        0x68,
        0x69,
        0x6c,
        0x6e,
        0x6f,
        0x70,
        0x74,
        0x77,
        0x7b,
        0x89
    }
    m = "invokeSuspend"
    n = {
        "$this$withContext",
        "cur",
        "i",
        "$this$withContext",
        "cur",
        "i",
        "vs",
        "mods",
        "$this$withContext",
        "cur",
        "i",
        "vs",
        "mods",
        "$this$withContext",
        "$this$withContext",
        "i",
        "$this$withContext",
        "q",
        "kind",
        "$this$withContext",
        "$this$withContext",
        "$this$withContext",
        "$this$withContext",
        "$this$withContext",
        "i",
        "v",
        "$this$withContext",
        "i",
        "loader",
        "$this$withContext",
        "$this$withContext",
        "$this$withContext",
        "$this$withContext",
        "$this$withContext",
        "$this$withContext",
        "$this$withContext",
        "n",
        "$this$withContext",
        "n",
        "$this$withContext",
        "i",
        "v",
        "$this$withContext",
        "i",
        "v",
        "fn",
        "$this$withContext",
        "i",
        "v",
        "fn",
        "$this$withContext",
        "i",
        "v",
        "fn",
        "$this$withContext",
        "$this$withContext",
        "m",
        "$this$withContext",
        "i",
        "v",
        "$this$withContext",
        "i",
        "v"
    }
    nl = {
        0x43,
        0xbb,
        0xc3,
        0xc7,
        0xcb,
        0x51,
        0x58,
        0x59,
        0x5a,
        0x5b,
        0xe0,
        0x60,
        0x63,
        0x64,
        0x65,
        0x66,
        0x67,
        0x68,
        0x69,
        0x6b,
        0x6d,
        0x6f,
        0x70,
        0x72,
        0xe4,
        0x7a,
        0x7c,
        0x8a
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0",
        "L$0",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$0",
        "L$0",
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$0",
        "L$0",
        "L$0",
        "L$0",
        "L$0",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$0",
        "I$0",
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
.field final synthetic $args:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $name:Ljava/lang/String;

.field final synthetic $progress:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/AiToolHostImpl;


# direct methods
.method public static synthetic $r8$lambda$f6X_XMfJqm2NUT6lMlYUU6WmmIQ(Lkotlin/jvm/functions/Function2;Ljava/lang/Float;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->invokeSuspend$lambda$16(Lkotlin/jvm/functions/Function2;Ljava/lang/Float;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$uYlR5czeK0M-W1BPt9A3lNKQegw(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->invokeSuspend$lambda$15(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Ljava/lang/String;Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/data/AiToolHostImpl;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/AiToolHostImpl$execute$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$name:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iput-object p3, p0, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    iput-object p4, p0, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$progress:Lkotlin/jvm/functions/Function2;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$15(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    .line 123
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invokeSuspend$lambda$16(Lkotlin/jvm/functions/Function2;Ljava/lang/Float;)Lkotlin/Unit;
    .locals 1
    .param p0, "$progress"    # Lkotlin/jvm/functions/Function2;
    .param p1, "p"    # Ljava/lang/Float;

    .line 123
    const-string v0, "\u542f\u52a8\u4e2d"

    invoke-interface {p0, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;

    iget-object v1, p0, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$name:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v3, p0, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    iget-object v4, p0, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$progress:Lkotlin/jvm/functions/Function2;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/ai/ToolOutput;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 62
    iget v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    const-string v4, "Java "

    const-string v5, "\u300d"

    const-string v6, "delete_mod"

    const-string v7, "disable_mod"

    const-string v8, "id"

    const-string v9, "name"

    const-string v10, "version"

    const-string v11, "path"

    const-string v13, "filename"

    const-string v14, "mods"

    const-string v12, ""

    packed-switch v0, :pswitch_data_0

    move-object/from16 v27, v2

    .end local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .local v27, "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .end local v27    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    :pswitch_0
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .local v0, "v":Ljava/lang/String;
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/core/instance/Instance;

    .local v3, "i":Lcom/pymcl/core/instance/Instance;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    move-object/from16 v24, v2

    move-object v9, v14

    goto/16 :goto_31

    .end local v0    # "v":Ljava/lang/String;
    .end local v3    # "i":Lcom/pymcl/core/instance/Instance;
    :pswitch_1
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .restart local v0    # "v":Ljava/lang/String;
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/core/instance/Instance;

    .restart local v3    # "i":Lcom/pymcl/core/instance/Instance;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v6, v0

    move-object/from16 v24, v2

    move-object/from16 v0, p1

    goto/16 :goto_15

    .end local v0    # "v":Ljava/lang/String;
    .end local v3    # "i":Lcom/pymcl/core/instance/Instance;
    :pswitch_2
    iget v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->I$0:I

    .local v0, "m":I
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/ai/ToolOutput$Companion;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    move-object/from16 v24, v2

    goto/16 :goto_10

    .end local v0    # "m":I
    :pswitch_3
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/ai/ToolOutput$Companion;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v24, v2

    move-object/from16 v2, p1

    goto/16 :goto_16

    :pswitch_4
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .local v0, "fn":Ljava/lang/String;
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .local v3, "v":Ljava/lang/String;
    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/core/instance/Instance;

    .local v4, "i":Lcom/pymcl/core/instance/Instance;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v24, v2

    goto/16 :goto_b

    .end local v0    # "fn":Ljava/lang/String;
    .end local v3    # "v":Ljava/lang/String;
    .end local v4    # "i":Lcom/pymcl/core/instance/Instance;
    :pswitch_5
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .restart local v0    # "fn":Ljava/lang/String;
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .restart local v3    # "v":Ljava/lang/String;
    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/core/instance/Instance;

    .restart local v4    # "i":Lcom/pymcl/core/instance/Instance;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v24, v2

    goto/16 :goto_a

    .end local v0    # "fn":Ljava/lang/String;
    .end local v3    # "v":Ljava/lang/String;
    .end local v4    # "i":Lcom/pymcl/core/instance/Instance;
    :pswitch_6
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .restart local v0    # "fn":Ljava/lang/String;
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .restart local v3    # "v":Ljava/lang/String;
    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/core/instance/Instance;

    .restart local v4    # "i":Lcom/pymcl/core/instance/Instance;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v24, v2

    goto/16 :goto_9

    .end local v0    # "fn":Ljava/lang/String;
    .end local v3    # "v":Ljava/lang/String;
    .end local v4    # "i":Lcom/pymcl/core/instance/Instance;
    :pswitch_7
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .local v0, "v":Ljava/lang/String;
    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/core/instance/Instance;

    .restart local v4    # "i":Lcom/pymcl/core/instance/Instance;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v0

    move-object/from16 v24, v2

    move-object v0, v4

    move-object/from16 v4, p1

    goto/16 :goto_8

    .end local v0    # "v":Ljava/lang/String;
    .end local v4    # "i":Lcom/pymcl/core/instance/Instance;
    :pswitch_8
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .local v0, "n":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v24, v2

    goto/16 :goto_1c

    .end local v0    # "n":Ljava/lang/String;
    :pswitch_9
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .restart local v0    # "n":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v24, v2

    goto/16 :goto_6

    .end local v0    # "n":Ljava/lang/String;
    :pswitch_a
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v24, v2

    goto/16 :goto_21

    :pswitch_b
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v24, v2

    goto/16 :goto_1a

    :pswitch_c
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v24, v2

    goto/16 :goto_7

    :pswitch_d
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v24, v2

    goto/16 :goto_3

    :pswitch_e
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v24, v2

    goto/16 :goto_4

    :pswitch_f
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v24, v2

    goto/16 :goto_0

    :pswitch_10
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .local v0, "loader":Ljava/lang/String;
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/core/instance/Instance;

    .local v3, "i":Lcom/pymcl/core/instance/Instance;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v24, v2

    move-object/from16 v2, p1

    goto/16 :goto_1

    .end local v0    # "loader":Ljava/lang/String;
    .end local v3    # "i":Lcom/pymcl/core/instance/Instance;
    :pswitch_11
    iget v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->I$0:I

    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$6:Ljava/lang/Object;

    move-object v14, v3

    check-cast v14, Ljava/lang/String;

    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$5:Ljava/lang/Object;

    check-cast v3, [Lkotlin/Pair;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$4:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$3:Ljava/lang/Object;

    check-cast v5, [Lkotlin/Pair;

    iget-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    .local v6, "v":Ljava/lang/String;
    iget-object v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/pymcl/core/instance/Instance;

    .local v7, "i":Lcom/pymcl/core/instance/Instance;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v24, v2

    move-object/from16 v2, p1

    goto/16 :goto_1d

    .end local v6    # "v":Ljava/lang/String;
    .end local v7    # "i":Lcom/pymcl/core/instance/Instance;
    :pswitch_12
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v24, v2

    goto/16 :goto_d

    :pswitch_13
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v24, v2

    goto/16 :goto_5

    :pswitch_14
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v24, v2

    goto/16 :goto_11

    :pswitch_15
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v24, v2

    goto/16 :goto_1b

    :pswitch_16
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .local v0, "kind":Ljava/lang/String;
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .local v3, "q":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    move-object/from16 v24, v2

    move-object v14, v8

    goto/16 :goto_22

    .end local v0    # "kind":Ljava/lang/String;
    .end local v3    # "q":Ljava/lang/String;
    :pswitch_17
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/core/instance/Instance;

    .local v3, "i":Lcom/pymcl/core/instance/Instance;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    move-object/from16 v24, v2

    move-object/from16 v26, v8

    goto/16 :goto_18

    .end local v3    # "i":Lcom/pymcl/core/instance/Instance;
    :pswitch_18
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/ai/ToolOutput$Companion;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v24, v2

    move-object/from16 v2, p1

    goto/16 :goto_1f

    :pswitch_19
    iget v12, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->I$1:I

    iget v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->I$0:I

    .local v0, "mods":I
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$7:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$6:Ljava/lang/Object;

    check-cast v5, [Lkotlin/Pair;

    iget-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$5:Ljava/lang/Object;

    check-cast v6, Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$4:Ljava/lang/Object;

    check-cast v7, [Lkotlin/Pair;

    iget-object v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    .local v8, "vs":Ljava/util/List;
    iget-object v9, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v9, Lcom/pymcl/core/instance/Instance;

    .local v9, "i":Lcom/pymcl/core/instance/Instance;
    iget-object v10, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    .local v10, "cur":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v27, v2

    move-object/from16 v2, p1

    goto/16 :goto_3c

    .end local v0    # "mods":I
    .end local v8    # "vs":Ljava/util/List;
    .end local v9    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v10    # "cur":Ljava/lang/String;
    :pswitch_1a
    iget v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->I$1:I

    iget v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->I$0:I

    .local v5, "mods":I
    iget-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$7:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$6:Ljava/lang/Object;

    check-cast v7, [Lkotlin/Pair;

    iget-object v9, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$5:Ljava/lang/Object;

    check-cast v9, Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v10, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$4:Ljava/lang/Object;

    check-cast v10, [Lkotlin/Pair;

    iget-object v11, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$3:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    .local v11, "vs":Ljava/util/List;
    iget-object v12, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v12, Lcom/pymcl/core/instance/Instance;

    .local v12, "i":Lcom/pymcl/core/instance/Instance;
    iget-object v13, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    .local v13, "cur":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v27, v2

    move-object v14, v8

    move-object/from16 v8, p1

    move v2, v0

    move v0, v5

    move-object v5, v10

    move-object v10, v6

    move-object v6, v9

    move-object v9, v12

    goto/16 :goto_39

    .end local v5    # "mods":I
    .end local v11    # "vs":Ljava/util/List;
    .end local v12    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v13    # "cur":Ljava/lang/String;
    :pswitch_1b
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/core/instance/Instance;

    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    iget-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .local v5, "cur":Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v2

    move-object v9, v14

    move-object v2, v0

    move-object v14, v8

    move-object/from16 v0, p1

    goto/16 :goto_34

    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v5    # "cur":Ljava/lang/String;
    :pswitch_1c
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v22

    const-string v15, "mod"

    move-object/from16 v24, v2

    .end local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .local v24, "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    const-string v2, "world"

    move-object/from16 v25, v14

    const-string v14, "logs/latest.log"

    move-object/from16 v26, v8

    const-string v8, "kind"

    sparse-switch v22, :sswitch_data_0

    move-object/from16 v27, v24

    .end local v24    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v27    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    goto/16 :goto_3f

    .end local v27    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v24    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    :sswitch_0
    const-string v2, "install_mod"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_33

    .line 98
    :cond_0
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$progress:Lkotlin/jvm/functions/Function2;

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    const/16 v6, 0xd

    iput v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-static {v0, v15, v2, v4, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$install(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_1

    .line 62
    return-object v3

    .line 98
    :cond_1
    :goto_0
    check-cast v0, Lcom/pymcl/ai/ToolOutput;

    move-object/from16 v27, v24

    goto/16 :goto_40

    .line 63
    :sswitch_1
    const-string v2, "install_game"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_33

    .line 94
    :cond_2
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .restart local v0    # "i":Lcom/pymcl/core/instance/Instance;
    sget-object v2, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-virtual {v2, v4}, Lcom/pymcl/android/data/AiToolLogic;->loaderArg(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v14

    .line 95
    .local v14, "loader":Ljava/lang/String;
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v11

    invoke-virtual {v0}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v12

    sget-object v2, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-virtual {v2, v4, v10}, Lcom/pymcl/android/data/AiToolLogic;->required(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    const-string v4, "loader_version"

    invoke-static {v2, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$progress:Lkotlin/jvm/functions/Function2;

    move-object/from16 v17, v1

    check-cast v17, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    const/16 v4, 0xc

    iput v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    move-object/from16 v16, v2

    invoke-virtual/range {v11 .. v17}, Lcom/pymcl/android/data/RepositoryUiApi;->installGame(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_3

    .line 62
    return-object v3

    .line 95
    :cond_3
    move-object v3, v0

    move-object v0, v14

    .line 62
    .end local v14    # "loader":Ljava/lang/String;
    .local v0, "loader":Ljava/lang/String;
    .restart local v3    # "i":Lcom/pymcl/core/instance/Instance;
    :goto_1
    check-cast v2, Ljava/lang/String;

    .line 96
    .local v2, "vid":Ljava/lang/String;
    sget-object v4, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    invoke-virtual {v3}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u5df2\u5b89\u88c5 "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " \u5230\u5b9e\u4f8b\u300c"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v4, v5, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "loader":Ljava/lang/String;
    .end local v2    # "vid":Ljava/lang/String;
    .end local v3    # "i":Lcom/pymcl/core/instance/Instance;
    goto/16 :goto_40

    .line 63
    :sswitch_2
    const-string v2, "enable_mod"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_33

    :sswitch_3
    const-string v2, "list_mod_configs"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_33

    .line 139
    :cond_4
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    new-instance v2, Ljava/io/File;

    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v4, v0, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$gameDir(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    const-string v4, "config"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v2, "dir":Ljava/io/File;
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    const-string v4, "prefix"

    invoke-static {v3, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_2

    :cond_5
    move-object v12, v3

    .line 140
    .local v12, "pre":Ljava/lang/String;
    :goto_2
    sget-object v3, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    sget-object v4, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v4, v2, v12}, Lcom/pymcl/android/data/AiToolLogic;->listConfigs(Ljava/io/File;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v3, v4, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->json$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/Object;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v2    # "dir":Ljava/io/File;
    .end local v12    # "pre":Ljava/lang/String;
    goto/16 :goto_40

    .line 63
    :sswitch_4
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_33

    :sswitch_5
    const-string v2, "install_shader"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_33

    .line 100
    :cond_6
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$progress:Lkotlin/jvm/functions/Function2;

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    const/16 v6, 0xf

    iput v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    const-string v6, "shader"

    invoke-static {v0, v6, v2, v4, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$install(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_7

    .line 62
    return-object v3

    .line 100
    :cond_7
    :goto_3
    check-cast v0, Lcom/pymcl/ai/ToolOutput;

    move-object/from16 v27, v24

    goto/16 :goto_40

    .line 63
    :sswitch_6
    const-string v2, "install_modpack"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_33

    .line 99
    :cond_8
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$progress:Lkotlin/jvm/functions/Function2;

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    const/16 v6, 0xe

    iput v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    const-string v6, "modpack"

    invoke-static {v0, v6, v2, v4, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$install(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_9

    .line 62
    return-object v3

    .line 99
    :cond_9
    :goto_4
    check-cast v0, Lcom/pymcl/ai/ToolOutput;

    move-object/from16 v27, v24

    goto/16 :goto_40

    .line 63
    :sswitch_7
    const-string v4, "search_worlds"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_33

    .line 89
    :cond_a
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    const/16 v6, 0x9

    iput v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-static {v0, v2, v4, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$search(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_b

    .line 62
    return-object v3

    .line 89
    :cond_b
    :goto_5
    check-cast v0, Lcom/pymcl/ai/ToolOutput;

    move-object/from16 v27, v24

    goto/16 :goto_40

    .line 63
    :sswitch_8
    const-string v2, "create_instance"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_33

    .line 104
    :cond_c
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-virtual {v0, v2, v9}, Lcom/pymcl/android/data/AiToolLogic;->required(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .local v0, "n":Ljava/lang/String;
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v2

    move-object v4, v1

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    const/16 v5, 0x13

    iput v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-virtual {v2, v0, v4}, Lcom/pymcl/android/data/RepositoryUiApi;->createInstance(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_d

    .line 62
    return-object v3

    .line 104
    :cond_d
    :goto_6
    sget-object v2, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5df2\u65b0\u5efa\u5b9e\u4f8b\u300c"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\u300d\uff08\u91cd\u540d\u65f6\u4f1a\u81ea\u52a8\u52a0\u540e\u7f00\uff0c\u8bf7\u7528 list_instances \u786e\u8ba4\uff09"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v2, v3, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "n":Ljava/lang/String;
    goto/16 :goto_40

    .line 63
    :sswitch_9
    const-string v2, "install_resourcepack"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_33

    .line 101
    :cond_e
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$progress:Lkotlin/jvm/functions/Function2;

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    const/16 v6, 0x10

    iput v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    const-string v6, "resource"

    invoke-static {v0, v6, v2, v4, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$install(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_f

    .line 62
    return-object v3

    .line 101
    :cond_f
    :goto_7
    check-cast v0, Lcom/pymcl/ai/ToolOutput;

    move-object/from16 v27, v24

    goto/16 :goto_40

    .line 63
    :sswitch_a
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_33

    .line 107
    :cond_10
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v2, v0, v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    .line 108
    .local v2, "v":Ljava/lang/String;
    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    sget-object v5, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-virtual {v5, v8, v13}, Lcom/pymcl/android/data/AiToolLogic;->required(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object v8, v1

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    const/16 v9, 0x15

    iput v9, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-static {v4, v0, v2, v5, v8}, Lcom/pymcl/android/data/AiToolHostImpl;->access$resolveMod(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_11

    .line 62
    return-object v3

    .line 108
    :cond_11
    move-object v11, v2

    .line 62
    .end local v2    # "v":Ljava/lang/String;
    .local v11, "v":Ljava/lang/String;
    :goto_8
    move-object v12, v4

    check-cast v12, Ljava/lang/String;

    .line 109
    .local v12, "fn":Ljava/lang/String;
    sget-object v2, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$name:Ljava/lang/String;

    invoke-virtual {v2, v4, v12}, Lcom/pymcl/android/data/AiToolLogic;->modActionNeeded(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_17

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$name:Ljava/lang/String;

    .line 110
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_13

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v8

    invoke-virtual {v0}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v10

    move-object v13, v1

    check-cast v13, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    iput-object v12, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$3:Ljava/lang/Object;

    const/16 v2, 0x16

    iput v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    const-string v9, "mod"

    invoke-virtual/range {v8 .. v13}, Lcom/pymcl/android/data/RepositoryUiApi;->deleteInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_12

    .line 62
    return-object v3

    .line 110
    :cond_12
    move-object v4, v0

    move-object v3, v11

    move-object v0, v12

    .end local v11    # "v":Ljava/lang/String;
    .end local v12    # "fn":Ljava/lang/String;
    .local v0, "fn":Ljava/lang/String;
    .local v3, "v":Ljava/lang/String;
    .restart local v4    # "i":Lcom/pymcl/core/instance/Instance;
    :goto_9
    move-object v12, v0

    move-object v11, v3

    move-object v0, v4

    goto/16 :goto_c

    .line 111
    .end local v3    # "v":Ljava/lang/String;
    .end local v4    # "i":Lcom/pymcl/core/instance/Instance;
    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    .restart local v11    # "v":Ljava/lang/String;
    .restart local v12    # "fn":Ljava/lang/String;
    :cond_13
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v8

    invoke-virtual {v0}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v10

    move-object v14, v1

    check-cast v14, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    iput-object v12, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$3:Ljava/lang/Object;

    const/16 v2, 0x17

    iput v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    const-string v9, "mod"

    const/4 v13, 0x0

    invoke-virtual/range {v8 .. v14}, Lcom/pymcl/android/data/RepositoryUiApi;->setInstalledEnabled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_14

    .line 62
    return-object v3

    .line 111
    :cond_14
    move-object v4, v0

    move-object v3, v11

    move-object v0, v12

    .end local v11    # "v":Ljava/lang/String;
    .end local v12    # "fn":Ljava/lang/String;
    .local v0, "fn":Ljava/lang/String;
    .restart local v3    # "v":Ljava/lang/String;
    .restart local v4    # "i":Lcom/pymcl/core/instance/Instance;
    :goto_a
    move-object v12, v0

    move-object v11, v3

    move-object v0, v4

    goto :goto_c

    .line 112
    .end local v3    # "v":Ljava/lang/String;
    .end local v4    # "i":Lcom/pymcl/core/instance/Instance;
    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    .restart local v11    # "v":Ljava/lang/String;
    .restart local v12    # "fn":Ljava/lang/String;
    :cond_15
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v8

    invoke-virtual {v0}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v10

    move-object v14, v1

    check-cast v14, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    iput-object v12, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$3:Ljava/lang/Object;

    const/16 v2, 0x18

    iput v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    const-string v9, "mod"

    const/4 v13, 0x1

    invoke-virtual/range {v8 .. v14}, Lcom/pymcl/android/data/RepositoryUiApi;->setInstalledEnabled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_16

    .line 62
    return-object v3

    .line 112
    :cond_16
    move-object v4, v0

    move-object v3, v11

    move-object v0, v12

    .line 114
    .end local v11    # "v":Ljava/lang/String;
    .end local v12    # "fn":Ljava/lang/String;
    .local v0, "fn":Ljava/lang/String;
    .restart local v3    # "v":Ljava/lang/String;
    .restart local v4    # "i":Lcom/pymcl/core/instance/Instance;
    :goto_b
    move-object v12, v0

    move-object v11, v3

    move-object v0, v4

    .end local v3    # "v":Ljava/lang/String;
    .end local v4    # "i":Lcom/pymcl/core/instance/Instance;
    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    .restart local v11    # "v":Ljava/lang/String;
    .restart local v12    # "fn":Ljava/lang/String;
    :cond_17
    :goto_c
    sget-object v2, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    sget-object v3, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$name:Ljava/lang/String;

    invoke-virtual {v3, v4, v12}, Lcom/pymcl/android/data/AiToolLogic;->modActionMessage(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v2, v3, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v11    # "v":Ljava/lang/String;
    .end local v12    # "fn":Ljava/lang/String;
    goto/16 :goto_40

    .line 63
    :sswitch_b
    const-string v2, "search_content"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_33

    .line 90
    :cond_18
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    sget-object v2, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v4, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/pymcl/android/data/AiToolLogic;->kindKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    const/16 v6, 0xa

    iput v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-static {v0, v2, v4, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$search(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_19

    .line 62
    return-object v3

    .line 90
    :cond_19
    :goto_d
    check-cast v0, Lcom/pymcl/ai/ToolOutput;

    move-object/from16 v27, v24

    goto/16 :goto_40

    .line 63
    :sswitch_c
    const-string v2, "get_crash_report"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_33

    .line 132
    :cond_1a
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .restart local v0    # "i":Lcom/pymcl/core/instance/Instance;
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v3, v0, v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/pymcl/android/data/AiToolHostImpl;->access$gameDir(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 133
    .local v2, "gd":Ljava/io/File;
    sget-object v3, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v3, v2}, Lcom/pymcl/android/data/AiToolLogic;->latestCrashFile(Ljava/io/File;)Ljava/io/File;

    move-result-object v3

    .line 134
    .local v3, "f":Ljava/io/File;
    sget-object v4, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    if-nez v3, :cond_1b

    const-string v5, "\u6ca1\u6709\u5d29\u6e83\u62a5\u544a"

    invoke-virtual {v4, v5}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v4

    move-object v0, v4

    move-object/from16 v27, v24

    goto/16 :goto_40

    :cond_1b
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v3, v8, v7, v8}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const v8, 0xea60

    invoke-static {v7, v8}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/pymcl/core/crash/CrashAnalyzer;->filterSecrets(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u6587\u4ef6\uff1a"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "\n"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v4, v5, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v2    # "gd":Ljava/io/File;
    .end local v3    # "f":Ljava/io/File;
    goto/16 :goto_40

    .line 63
    :sswitch_d
    const-string v2, "diagnose_launch"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto/16 :goto_33

    .line 126
    :cond_1c
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .restart local v0    # "i":Lcom/pymcl/core/instance/Instance;
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v3, v0, v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/pymcl/android/data/AiToolHostImpl;->access$gameDir(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 127
    .restart local v2    # "gd":Ljava/io/File;
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v3}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getRepo(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v3

    const/4 v4, -0x1

    invoke-virtual {v3, v2, v4, v12}, Lcom/pymcl/android/data/LauncherRepository;->analyzeCrash(Ljava/io/File;ILjava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 128
    .local v3, "reasons":Ljava/util/List;
    sget-object v4, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    const/4 v5, 0x3

    new-array v6, v5, [Lkotlin/Pair;

    const-string v5, "game_dir"

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v23, 0x0

    aput-object v5, v6, v23

    move-object v5, v3

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$map\\42":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 232
    .local v7, "$i$f$map\\42\\128":I
    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v5, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v9, Ljava/util/Collection;

    .local v9, "destination\\43":Ljava/util/Collection;
    move-object v10, v5

    .local v10, "$this$mapTo\\43":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 233
    .local v11, "$i$f$mapTo\\43\\232":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_e
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1d

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 234
    .local v13, "item\\43":Ljava/lang/Object;
    move-object v15, v13

    check-cast v15, Lcom/pymcl/core/crash/CrashReason;

    .local v15, "it\\44":Lcom/pymcl/core/crash/CrashReason;
    const/16 v18, 0x0

    .line 128
    .local v18, "$i$a$-map-AiToolHostImpl$execute$2$11\\44\\234\\0":I
    move-object/from16 v25, v0

    move-object/from16 v22, v3

    const/4 v3, 0x4

    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v3    # "reasons":Ljava/util/List;
    .local v22, "reasons":Ljava/util/List;
    .local v25, "i":Lcom/pymcl/core/instance/Instance;
    new-array v0, v3, [Lkotlin/Pair;

    invoke-virtual {v15}, Lcom/pymcl/core/crash/CrashReason;->getKind()Ljava/lang/String;

    move-result-object v3

    invoke-static {v8, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v23, 0x0

    aput-object v3, v0, v23

    const-string v3, "title"

    move-object/from16 v26, v0

    invoke-virtual {v15}, Lcom/pymcl/core/crash/CrashReason;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v19, 0x1

    aput-object v0, v26, v19

    const-string v0, "description"

    invoke-virtual {v15}, Lcom/pymcl/core/crash/CrashReason;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v21, 0x2

    aput-object v0, v26, v21

    invoke-virtual {v15}, Lcom/pymcl/core/crash/CrashReason;->getExtra()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    const-string v3, "extra"

    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v17, 0x3

    aput-object v0, v26, v17

    invoke-static/range {v26 .. v26}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 234
    .end local v15    # "it\\44":Lcom/pymcl/core/crash/CrashReason;
    .end local v18    # "$i$a$-map-AiToolHostImpl$execute$2$11\\44\\234\\0":I
    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, v22

    move-object/from16 v0, v25

    goto :goto_e

    .line 235
    .end local v13    # "item\\43":Ljava/lang/Object;
    .end local v22    # "reasons":Ljava/util/List;
    .end local v25    # "i":Lcom/pymcl/core/instance/Instance;
    .restart local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .restart local v3    # "reasons":Ljava/util/List;
    :cond_1d
    move-object/from16 v25, v0

    move-object/from16 v22, v3

    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v3    # "reasons":Ljava/util/List;
    .end local v9    # "destination\\43":Ljava/util/Collection;
    .end local v10    # "$this$mapTo\\43":Ljava/lang/Iterable;
    .end local v11    # "$i$f$mapTo\\43\\232":I
    .restart local v22    # "reasons":Ljava/util/List;
    .restart local v25    # "i":Lcom/pymcl/core/instance/Instance;
    move-object v0, v9

    check-cast v0, Ljava/util/List;

    .line 232
    nop

    .end local v5    # "$this$map\\42":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map\\42\\128":I
    check-cast v0, Ljava/util/Collection;

    .line 128
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    const-string v3, "matched"

    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v19, 0x1

    aput-object v0, v6, v19

    .line 129
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/16 v5, 0x28

    invoke-static {v0, v3, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$tail(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/io/File;I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "latest_log_tail"

    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v7, 0x2

    aput-object v0, v6, v7

    .line 128
    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static {v4, v0, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->json$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/Object;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v2    # "gd":Ljava/io/File;
    .end local v22    # "reasons":Ljava/util/List;
    .end local v25    # "i":Lcom/pymcl/core/instance/Instance;
    goto/16 :goto_40

    .line 63
    :sswitch_e
    const-string v2, "write_mod_config"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto/16 :goto_33

    .line 143
    :cond_1e
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .restart local v0    # "i":Lcom/pymcl/core/instance/Instance;
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v4, v0, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$gameDir(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v4, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1f

    move-object v4, v12

    :cond_1f
    invoke-static {v2, v3, v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$configFile(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 144
    .local v2, "f":Ljava/io/File;
    sget-object v3, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    sget-object v4, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    const-string v6, "content"

    invoke-static {v5, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_20

    goto :goto_f

    :cond_20
    move-object v12, v5

    :goto_f
    invoke-virtual {v4, v2, v12}, Lcom/pymcl/android/data/AiToolLogic;->writeConfig(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v3, v4, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v2    # "f":Ljava/io/File;
    goto/16 :goto_40

    .line 63
    :sswitch_f
    const-string v2, "download_java"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_33

    .line 118
    :cond_21
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-virtual {v0, v2}, Lcom/pymcl/android/data/AiToolLogic;->javaMajor(Ljava/util/Map;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 119
    .local v0, "m":I
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$progress:Lkotlin/jvm/functions/Function2;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u4e0b\u8f7d Java "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v2, v6, v5}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v5

    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    iput v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->I$0:I

    const/16 v7, 0x1a

    iput v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-virtual {v5, v0, v12, v6}, Lcom/pymcl/android/data/RepositoryUiApi;->downloadJava(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_22

    .line 62
    return-object v3

    .line 119
    :cond_22
    move-object v3, v2

    :goto_10
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " \u5df2\u5c31\u7eea"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v3, v2, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "m":I
    goto/16 :goto_40

    .line 118
    :cond_23
    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    const-string v2, "\u5b89\u5353\u7248\u53ea\u63d0\u4f9b Java 8/17/21/25\uff0817/21 \u4e3a\u5185\u7f6e\uff0c8/25 \u6309\u9700\u4e0b\u8f7d\uff09"

    invoke-virtual {v0, v2}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    .line 63
    :sswitch_10
    const-string v2, "search_modpacks"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto/16 :goto_33

    .line 88
    :cond_24
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    move-object v4, v1

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    const/16 v5, 0x8

    iput v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    const-string v5, "modpack"

    invoke-static {v0, v5, v2, v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$search(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_25

    .line 62
    return-object v3

    .line 88
    :cond_25
    :goto_11
    check-cast v0, Lcom/pymcl/ai/ToolOutput;

    move-object/from16 v27, v24

    goto/16 :goto_40

    .line 63
    :sswitch_11
    const-string v2, "read_mod_config"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    goto/16 :goto_33

    .line 141
    :cond_26
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v4, v0, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$gameDir(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v4, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_27

    goto :goto_12

    :cond_27
    move-object v12, v4

    :goto_12
    invoke-static {v2, v3, v12}, Lcom/pymcl/android/data/AiToolHostImpl;->access$configFile(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 142
    .restart local v2    # "f":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-nez v3, :cond_28

    sget-object v3, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v4, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u6587\u4ef6\u4e0d\u5b58\u5728\uff1a"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v3

    move-object v0, v3

    move-object/from16 v27, v24

    goto/16 :goto_40

    :cond_28
    sget-object v3, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v2, v6, v7, v6}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v5, 0xea60

    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v3, v4, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v2    # "f":Ljava/io/File;
    goto/16 :goto_40

    .line 63
    :sswitch_12
    const-string v2, "launch_game"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29

    goto/16 :goto_33

    .line 122
    :cond_29
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v2

    .local v2, "i":Lcom/pymcl/core/instance/Instance;
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    :try_start_0
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v5, v24

    .line 183
    .local v5, "$this$invokeSuspend_u24lambda_u2414\\41":Lkotlinx/coroutines/CoroutineScope;
    const/4 v6, 0x0

    .line 122
    .local v6, "$i$a$-runCatching-AiToolHostImpl$execute$2$v$1\\41\\122\\0":I
    invoke-static {v0, v2, v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .end local v5    # "$this$invokeSuspend_u24lambda_u2414\\41":Lkotlinx/coroutines/CoroutineScope;
    .end local v6    # "$i$a$-runCatching-AiToolHostImpl$execute$2$v$1\\41\\122\\0":I
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_13

    :catchall_0
    move-exception v0

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_13
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2a

    goto :goto_14

    :cond_2a
    move-object v12, v0

    :goto_14
    move-object v6, v12

    check-cast v6, Ljava/lang/String;

    .line 123
    .local v6, "v":Ljava/lang/String;
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v0}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v4

    invoke-virtual {v2}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v5

    new-instance v7, Lcom/pymcl/android/data/AiToolHostImpl$execute$2$$ExternalSyntheticLambda0;

    invoke-direct {v7}, Lcom/pymcl/android/data/AiToolHostImpl$execute$2$$ExternalSyntheticLambda0;-><init>()V

    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$progress:Lkotlin/jvm/functions/Function2;

    new-instance v8, Lcom/pymcl/android/data/AiToolHostImpl$execute$2$$ExternalSyntheticLambda1;

    invoke-direct {v8, v0}, Lcom/pymcl/android/data/AiToolHostImpl$execute$2$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function2;)V

    move-object v10, v1

    check-cast v10, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    const/16 v0, 0x1b

    iput v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    const/4 v9, 0x0

    invoke-virtual/range {v4 .. v10}, Lcom/pymcl/android/data/RepositoryUiApi;->launchGame(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_2b

    .line 62
    return-object v3

    .line 123
    :cond_2b
    move-object v3, v2

    .line 62
    .end local v2    # "i":Lcom/pymcl/core/instance/Instance;
    .local v3, "i":Lcom/pymcl/core/instance/Instance;
    :goto_15
    check-cast v0, Ljava/lang/String;

    .line 124
    .local v0, "vid":Ljava/lang/String;
    sget-object v2, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    sget-object v4, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v3}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v5

    sget-object v7, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-virtual {v7, v8}, Lcom/pymcl/android/data/AiToolLogic;->launchNotes(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v4, v0, v5, v7}, Lcom/pymcl/android/data/AiToolLogic;->launchMessage(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v2, v4, v5, v7, v8}, Lcom/pymcl/ai/ToolOutput$Companion;->ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "vid":Ljava/lang/String;
    .end local v3    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v6    # "v":Ljava/lang/String;
    goto/16 :goto_40

    .line 63
    :sswitch_13
    const-string v2, "get_java_list"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c

    goto/16 :goto_33

    .line 116
    :cond_2c
    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v2

    move-object v4, v1

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    const/16 v5, 0x19

    iput v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    const/4 v8, 0x0

    invoke-virtual {v2, v8, v4}, Lcom/pymcl/android/data/RepositoryUiApi;->getJavaList(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_2d

    .line 62
    return-object v3

    :cond_2d
    :goto_16
    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map\\38":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 228
    .local v3, "$i$f$map\\38\\116":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v2, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination\\39":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo\\39":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 229
    .local v6, "$i$f$mapTo\\39\\228":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_17
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 230
    .local v8, "item\\39":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lcom/pymcl/android/ui/state/JavaRow;

    .local v9, "it\\40":Lcom/pymcl/android/ui/state/JavaRow;
    const/4 v12, 0x0

    .line 116
    .local v12, "$i$a$-map-AiToolHostImpl$execute$2$10\\40\\230\\0":I
    const/4 v13, 0x3

    new-array v14, v13, [Lkotlin/Pair;

    invoke-virtual {v9}, Lcom/pymcl/android/ui/state/JavaRow;->getMajor()I

    move-result v13

    move-object v15, v2

    move/from16 v16, v3

    .end local v2    # "$this$map\\38":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\38\\116":I
    .local v15, "$this$map\\38":Ljava/lang/Iterable;
    .local v16, "$i$f$map\\38\\116":I
    int-to-long v2, v13

    invoke-static {v2, v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "major"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v23, 0x0

    aput-object v2, v14, v23

    invoke-virtual {v9}, Lcom/pymcl/android/ui/state/JavaRow;->getVersion()Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v19, 0x1

    aput-object v2, v14, v19

    invoke-virtual {v9}, Lcom/pymcl/android/ui/state/JavaRow;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v21, 0x2

    aput-object v2, v14, v21

    invoke-static {v14}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    .line 230
    .end local v9    # "it\\40":Lcom/pymcl/android/ui/state/JavaRow;
    .end local v12    # "$i$a$-map-AiToolHostImpl$execute$2$10\\40\\230\\0":I
    invoke-interface {v4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v2, v15

    move/from16 v3, v16

    goto :goto_17

    .line 231
    .end local v8    # "item\\39":Ljava/lang/Object;
    .end local v15    # "$this$map\\38":Ljava/lang/Iterable;
    .end local v16    # "$i$f$map\\38\\116":I
    .restart local v2    # "$this$map\\38":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$map\\38\\116":I
    :cond_2e
    move-object v15, v2

    move/from16 v16, v3

    .end local v2    # "$this$map\\38":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\38\\116":I
    .end local v4    # "destination\\39":Ljava/util/Collection;
    .end local v5    # "$this$mapTo\\39":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo\\39\\228":I
    .restart local v15    # "$this$map\\38":Ljava/lang/Iterable;
    .restart local v16    # "$i$f$map\\38\\116":I
    move-object v2, v4

    check-cast v2, Ljava/util/List;

    .line 228
    nop

    .end local v15    # "$this$map\\38":Ljava/lang/Iterable;
    .end local v16    # "$i$f$map\\38\\116":I
    check-cast v2, Ljava/util/Collection;

    .line 116
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v0, v2, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->json$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/Object;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    goto/16 :goto_40

    .line 63
    :sswitch_14
    const-string v2, "list_installed_versions"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2f

    goto/16 :goto_33

    .line 76
    :cond_2f
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    sget-object v2, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v4

    invoke-virtual {v0}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v5

    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    const/4 v7, 0x5

    iput v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-virtual {v4, v5, v6}, Lcom/pymcl/android/data/RepositoryUiApi;->getInstalledVersions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_30

    .line 62
    return-object v3

    .line 76
    :cond_30
    move-object v3, v0

    move-object v0, v2

    .line 62
    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .local v3, "i":Lcom/pymcl/core/instance/Instance;
    :goto_18
    move-object v2, v4

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map\\16":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 203
    .local v4, "$i$f$map\\16\\76":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v2, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\17":Ljava/util/Collection;
    move-object v6, v2

    .local v6, "$this$mapTo\\17":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 204
    .local v7, "$i$f$mapTo\\17\\203":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_19
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_31

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 205
    .local v9, "item\\17":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lcom/pymcl/android/ui/state/InstalledVersion;

    .local v10, "it\\18":Lcom/pymcl/android/ui/state/InstalledVersion;
    const/4 v11, 0x0

    .line 76
    .local v11, "$i$a$-map-AiToolHostImpl$execute$2$5\\18\\205\\0":I
    const/4 v12, 0x4

    new-array v13, v12, [Lkotlin/Pair;

    invoke-virtual {v10}, Lcom/pymcl/android/ui/state/InstalledVersion;->getId()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v14, v26

    invoke-static {v14, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/16 v23, 0x0

    aput-object v12, v13, v23

    const-string v12, "mc"

    invoke-virtual {v10}, Lcom/pymcl/android/ui/state/InstalledVersion;->getMc()Ljava/lang/String;

    move-result-object v15

    invoke-static {v12, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/16 v19, 0x1

    aput-object v12, v13, v19

    const-string v12, "loader"

    invoke-virtual {v10}, Lcom/pymcl/android/ui/state/InstalledVersion;->getLoader()Ljava/lang/String;

    move-result-object v15

    invoke-static {v12, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/16 v21, 0x2

    aput-object v12, v13, v21

    invoke-virtual {v10}, Lcom/pymcl/android/ui/state/InstalledVersion;->getIsolated()Z

    move-result v12

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v12

    const-string v15, "isolated"

    invoke-static {v15, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/16 v17, 0x3

    aput-object v12, v13, v17

    invoke-static {v13}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    .line 205
    .end local v10    # "it\\18":Lcom/pymcl/android/ui/state/InstalledVersion;
    .end local v11    # "$i$a$-map-AiToolHostImpl$execute$2$5\\18\\205\\0":I
    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_19

    .line 206
    .end local v9    # "item\\17":Ljava/lang/Object;
    :cond_31
    nop

    .end local v5    # "destination\\17":Ljava/util/Collection;
    .end local v6    # "$this$mapTo\\17":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo\\17\\203":I
    check-cast v5, Ljava/util/List;

    .line 203
    nop

    .end local v2    # "$this$map\\16":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map\\16\\76":I
    check-cast v5, Ljava/util/Collection;

    .line 76
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v0, v2, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->json$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/Object;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v3    # "i":Lcom/pymcl/core/instance/Instance;
    goto/16 :goto_40

    .line 63
    :sswitch_15
    const-string v2, "scan_mod_conflicts"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_32

    goto/16 :goto_33

    .line 135
    :cond_32
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .restart local v0    # "i":Lcom/pymcl/core/instance/Instance;
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v2, v0, v3}, Lcom/pymcl/android/data/AiToolHostImpl;->access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    .local v2, "v":Ljava/lang/String;
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v3, v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$mcOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .local v6, "mc":Ljava/lang/String;
    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v3, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$loaderOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 136
    .local v7, "l":Ljava/lang/String;
    sget-object v3, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    sget-object v4, Lcom/pymcl/core/mods/ModConflicts;->INSTANCE:Lcom/pymcl/core/mods/ModConflicts;

    new-instance v5, Ljava/io/File;

    iget-object v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v8, v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$gameDir(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v8

    move-object/from16 v9, v25

    invoke-direct {v5, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/pymcl/core/mods/ModConflicts;->scanDir$default(Lcom/pymcl/core/mods/ModConflicts;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/core/mods/ConflictReport;

    move-result-object v4

    invoke-virtual {v4, v6, v7}, Lcom/pymcl/core/mods/ConflictReport;->toJson(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 183
    move-object v5, v4

    .local v5, "it\\45":Ljava/util/Map;
    const/4 v8, 0x0

    .line 136
    .local v8, "$i$a$-also-AiToolHostImpl$execute$2$12\\45\\136\\0":I
    const-string v9, "note"

    const-string v10, "\u542b Jar-in-Jar \u5b50\u6a21\u7ec4\u3001Fabric \u7248\u672c\u8c13\u8bcd\u4e0e Forge/NeoForge mods.toml \u4f9d\u8d56\u533a\u95f4\uff1b\u6700\u7ec8\u4ee5\u6e38\u620f\u65e5\u5fd7\u4e3a\u51c6"

    invoke-interface {v5, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v5    # "it\\45":Ljava/util/Map;
    .end local v8    # "$i$a$-also-AiToolHostImpl$execute$2$12\\45\\136\\0":I
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const/4 v5, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v3, v4, v9, v5, v8}, Lcom/pymcl/ai/ToolOutput$Companion;->json$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/Object;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v2    # "v":Ljava/lang/String;
    .end local v6    # "mc":Ljava/lang/String;
    .end local v7    # "l":Ljava/lang/String;
    goto/16 :goto_40

    .line 63
    :sswitch_16
    const-string v2, "install_datapack"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_33

    goto/16 :goto_33

    .line 102
    :cond_33
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$progress:Lkotlin/jvm/functions/Function2;

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    const/16 v6, 0x11

    iput v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    const-string v6, "datapack"

    invoke-static {v0, v6, v2, v4, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$install(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_34

    .line 62
    return-object v3

    .line 102
    :cond_34
    :goto_1a
    check-cast v0, Lcom/pymcl/ai/ToolOutput;

    move-object/from16 v27, v24

    goto/16 :goto_40

    .line 63
    :sswitch_17
    const-string v2, "search_mods"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_35

    goto/16 :goto_33

    .line 87
    :cond_35
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    move-object v4, v1

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    const/4 v5, 0x7

    iput v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-static {v0, v15, v2, v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$search(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_36

    .line 62
    return-object v3

    .line 87
    :cond_36
    :goto_1b
    check-cast v0, Lcom/pymcl/ai/ToolOutput;

    move-object/from16 v27, v24

    goto/16 :goto_40

    .line 63
    :sswitch_18
    const-string v2, "delete_instance"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37

    goto/16 :goto_33

    .line 105
    :cond_37
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-virtual {v0, v2, v9}, Lcom/pymcl/android/data/AiToolLogic;->required(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .local v0, "n":Ljava/lang/String;
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v2

    move-object v4, v1

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    const/16 v6, 0x14

    iput v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-virtual {v2, v0, v4}, Lcom/pymcl/android/data/RepositoryUiApi;->deleteInstance(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_38

    .line 62
    return-object v3

    .line 105
    :cond_38
    :goto_1c
    sget-object v2, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5df2\u5220\u9664\u5b9e\u4f8b\u300c"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v2, v3, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "n":Ljava/lang/String;
    goto/16 :goto_40

    .line 63
    :sswitch_19
    move-object/from16 v9, v25

    const-string v2, "list_mods"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_39

    goto/16 :goto_33

    .line 91
    :cond_39
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v7

    .local v7, "i":Lcom/pymcl/core/instance/Instance;
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v7, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    .line 92
    .local v6, "v":Ljava/lang/String;
    sget-object v4, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    const/4 v5, 0x3

    new-array v0, v5, [Lkotlin/Pair;

    const-string v2, "instance"

    invoke-virtual {v7}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v23, 0x0

    aput-object v2, v0, v23

    invoke-static {v10, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v19, 0x1

    aput-object v2, v0, v19

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v2

    invoke-virtual {v7}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v5

    move-object v8, v1

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$3:Ljava/lang/Object;

    iput-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$4:Ljava/lang/Object;

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$5:Ljava/lang/Object;

    iput-object v9, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$6:Ljava/lang/Object;

    const/4 v10, 0x2

    iput v10, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->I$0:I

    const/16 v10, 0xb

    iput v10, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-virtual {v2, v5, v6, v8}, Lcom/pymcl/android/data/RepositoryUiApi;->getInstalledMods(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_3a

    .line 62
    return-object v3

    .line 92
    :cond_3a
    move-object v3, v0

    move-object v5, v3

    move-object v14, v9

    const/4 v0, 0x2

    .line 62
    :goto_1d
    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map\\35":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 224
    .local v8, "$i$f$map\\35\\92":I
    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v2, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v9, Ljava/util/Collection;

    .local v9, "destination\\36":Ljava/util/Collection;
    move-object v10, v2

    .local v10, "$this$mapTo\\36":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 225
    .local v11, "$i$f$mapTo\\36\\224":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1e
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_3b

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 226
    .local v15, "item\\36":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Lcom/pymcl/android/ui/state/InstalledEntry;

    .local v16, "it\\37":Lcom/pymcl/android/ui/state/InstalledEntry;
    const/16 v17, 0x0

    .line 92
    .local v17, "$i$a$-map-AiToolHostImpl$execute$2$9\\37\\226\\0":I
    move/from16 v22, v0

    move-object/from16 v18, v2

    const/4 v2, 0x2

    .end local v2    # "$this$map\\35":Ljava/lang/Iterable;
    .local v18, "$this$map\\35":Ljava/lang/Iterable;
    new-array v0, v2, [Lkotlin/Pair;

    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/android/ui/state/InstalledEntry;->getFilename()Ljava/lang/String;

    move-result-object v2

    invoke-static {v13, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v23, 0x0

    aput-object v2, v0, v23

    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/android/ui/state/InstalledEntry;->getEnabled()Z

    move-result v2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    move-object/from16 v25, v0

    const-string v0, "enabled"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v19, 0x1

    aput-object v0, v25, v19

    invoke-static/range {v25 .. v25}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 226
    .end local v16    # "it\\37":Lcom/pymcl/android/ui/state/InstalledEntry;
    .end local v17    # "$i$a$-map-AiToolHostImpl$execute$2$9\\37\\226\\0":I
    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v18

    move/from16 v0, v22

    goto :goto_1e

    .line 227
    .end local v15    # "item\\36":Ljava/lang/Object;
    .end local v18    # "$this$map\\35":Ljava/lang/Iterable;
    .restart local v2    # "$this$map\\35":Ljava/lang/Iterable;
    :cond_3b
    move/from16 v22, v0

    move-object/from16 v18, v2

    .end local v2    # "$this$map\\35":Ljava/lang/Iterable;
    .end local v9    # "destination\\36":Ljava/util/Collection;
    .end local v10    # "$this$mapTo\\36":Ljava/lang/Iterable;
    .end local v11    # "$i$f$mapTo\\36\\224":I
    .restart local v18    # "$this$map\\35":Ljava/lang/Iterable;
    move-object v0, v9

    check-cast v0, Ljava/util/List;

    .line 224
    nop

    .end local v8    # "$i$f$map\\35\\92":I
    .end local v18    # "$this$map\\35":Ljava/lang/Iterable;
    check-cast v0, Ljava/util/Collection;

    .line 92
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-static {v14, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v3, v22

    invoke-static {v5}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-static {v4, v0, v5, v2, v8}, Lcom/pymcl/ai/ToolOutput$Companion;->json$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/Object;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v6    # "v":Ljava/lang/String;
    .end local v7    # "i":Lcom/pymcl/core/instance/Instance;
    goto/16 :goto_40

    .line 63
    :sswitch_1a
    const-string v2, "list_instances"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3c

    goto/16 :goto_33

    .line 75
    :cond_3c
    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v2

    move-object v4, v1

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    const/4 v12, 0x4

    iput v12, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-virtual {v2, v4}, Lcom/pymcl/android/data/RepositoryUiApi;->listInstances(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_3d

    .line 62
    return-object v3

    :cond_3d
    :goto_1f
    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map\\13":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 199
    .local v3, "$i$f$map\\13\\75":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v2, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination\\14":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo\\14":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 200
    .local v6, "$i$f$mapTo\\14\\199":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_20
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 201
    .local v8, "item\\14":Ljava/lang/Object;
    move-object v10, v8

    check-cast v10, Lcom/pymcl/android/ui/state/InstanceRow;

    .local v10, "it\\15":Lcom/pymcl/android/ui/state/InstanceRow;
    const/4 v11, 0x0

    .line 75
    .local v11, "$i$a$-map-AiToolHostImpl$execute$2$4\\15\\201\\0":I
    const/4 v13, 0x3

    new-array v12, v13, [Lkotlin/Pair;

    invoke-virtual {v10}, Lcom/pymcl/android/ui/state/InstanceRow;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    const/16 v23, 0x0

    aput-object v13, v12, v23

    invoke-virtual {v10}, Lcom/pymcl/android/ui/state/InstanceRow;->getVersions()I

    move-result v13

    int-to-long v13, v13

    invoke-static {v13, v14}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v13

    const-string v14, "versions"

    invoke-static {v14, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    const/16 v19, 0x1

    aput-object v13, v12, v19

    invoke-virtual {v10}, Lcom/pymcl/android/ui/state/InstanceRow;->isDefault()Z

    move-result v13

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v13

    const-string v14, "default"

    invoke-static {v14, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    const/16 v21, 0x2

    aput-object v13, v12, v21

    invoke-static {v12}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    .line 201
    .end local v10    # "it\\15":Lcom/pymcl/android/ui/state/InstanceRow;
    .end local v11    # "$i$a$-map-AiToolHostImpl$execute$2$4\\15\\201\\0":I
    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_20

    .line 202
    .end local v8    # "item\\14":Ljava/lang/Object;
    :cond_3e
    nop

    .end local v4    # "destination\\14":Ljava/util/Collection;
    .end local v5    # "$this$mapTo\\14":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo\\14\\199":I
    check-cast v4, Ljava/util/List;

    .line 199
    nop

    .end local v2    # "$this$map\\13":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\13\\75":I
    check-cast v4, Ljava/util/Collection;

    .line 75
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v0, v2, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->json$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/Object;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    goto/16 :goto_40

    .line 63
    :sswitch_1b
    const-string v4, "install_world"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3f

    goto/16 :goto_33

    .line 103
    :cond_3f
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    iget-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$progress:Lkotlin/jvm/functions/Function2;

    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    const/16 v7, 0x12

    iput v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-static {v0, v2, v4, v5, v6}, Lcom/pymcl/android/data/AiToolHostImpl;->access$install(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_40

    .line 62
    return-object v3

    .line 103
    :cond_40
    :goto_21
    check-cast v0, Lcom/pymcl/ai/ToolOutput;

    move-object/from16 v27, v24

    goto/16 :goto_40

    .line 63
    :sswitch_1c
    const-string v2, "get_latest_log"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_41

    goto/16 :goto_33

    .line 130
    :cond_41
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    new-instance v2, Ljava/io/File;

    iget-object v3, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v4, v0, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$gameDir(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-direct {v2, v3, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 131
    .local v2, "f":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-nez v3, :cond_42

    sget-object v3, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    const-string v4, "\u6ca1\u6709 latest.log\uff08\u6e38\u620f\u53ef\u80fd\u8fd8\u6ca1\u542f\u52a8\u8fc7\uff09"

    invoke-virtual {v3, v4}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v3

    move-object v0, v3

    move-object/from16 v27, v24

    goto/16 :goto_40

    :cond_42
    sget-object v3, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    const/16 v5, 0xc8

    invoke-static {v4, v2, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$tail(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/io/File;I)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v3, v4, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v2    # "f":Ljava/io/File;
    goto/16 :goto_40

    .line 63
    :sswitch_1d
    move-object/from16 v14, v26

    const-string v2, "search_versions"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_43

    goto/16 :goto_33

    .line 79
    :cond_43
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-virtual {v0, v2}, Lcom/pymcl/android/data/AiToolLogic;->versionQuery(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .local v0, "q":Ljava/lang/String;
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v2, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_44

    move-object v2, v12

    :cond_44
    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 80
    .local v2, "kind":Ljava/lang/String;
    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v4

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    const/4 v6, 0x6

    iput v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-virtual {v4, v5}, Lcom/pymcl/android/data/RepositoryUiApi;->getVersionList(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_45

    .line 62
    return-object v3

    .line 80
    :cond_45
    move-object v3, v0

    move-object v0, v2

    .line 62
    .end local v2    # "kind":Ljava/lang/String;
    .local v0, "kind":Ljava/lang/String;
    .local v3, "q":Ljava/lang/String;
    :goto_22
    move-object v2, v4

    check-cast v2, Ljava/util/List;

    .line 81
    .local v2, "all":Ljava/util/List;
    move-object v4, v2

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$firstOrNull\\19":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 207
    .local v5, "$i$f$firstOrNull\\19\\81":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_46
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_48

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\19":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/android/ui/state/RemoteVersion;

    .local v8, "it\\20":Lcom/pymcl/android/ui/state/RemoteVersion;
    const/4 v9, 0x0

    .line 81
    .local v9, "$i$a$-firstOrNull-AiToolHostImpl$execute$2$manifest$1\\20\\207\\0":I
    invoke-virtual {v8}, Lcom/pymcl/android/ui/state/RemoteVersion;->getLatest()Z

    move-result v10

    if-eqz v10, :cond_47

    invoke-virtual {v8}, Lcom/pymcl/android/ui/state/RemoteVersion;->getType()Ljava/lang/String;

    move-result-object v10

    const-string v11, "release"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_47

    const/4 v8, 0x1

    goto :goto_23

    :cond_47
    const/4 v8, 0x0

    .line 207
    .end local v8    # "it\\20":Lcom/pymcl/android/ui/state/RemoteVersion;
    .end local v9    # "$i$a$-firstOrNull-AiToolHostImpl$execute$2$manifest$1\\20\\207\\0":I
    :goto_23
    if-eqz v8, :cond_46

    goto :goto_24

    .line 208
    .end local v7    # "element\\19":Ljava/lang/Object;
    :cond_48
    const/4 v7, 0x0

    .line 81
    .end local v4    # "$this$firstOrNull\\19":Ljava/lang/Iterable;
    .end local v5    # "$i$f$firstOrNull\\19\\81":I
    :goto_24
    check-cast v7, Lcom/pymcl/android/ui/state/RemoteVersion;

    if-eqz v7, :cond_49

    invoke-virtual {v7}, Lcom/pymcl/android/ui/state/RemoteVersion;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_25

    :cond_49
    const/4 v4, 0x0

    :goto_25
    if-nez v4, :cond_4a

    move-object v4, v12

    :cond_4a
    move-object v5, v2

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$firstOrNull\\21":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 207
    .local v6, "$i$f$firstOrNull\\21\\81":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element\\21":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lcom/pymcl/android/ui/state/RemoteVersion;

    .local v9, "it\\22":Lcom/pymcl/android/ui/state/RemoteVersion;
    const/4 v10, 0x0

    .line 81
    .local v10, "$i$a$-firstOrNull-AiToolHostImpl$execute$2$manifest$2\\22\\207\\0":I
    invoke-virtual {v9}, Lcom/pymcl/android/ui/state/RemoteVersion;->getLatest()Z

    move-result v11

    if-eqz v11, :cond_4c

    invoke-virtual {v9}, Lcom/pymcl/android/ui/state/RemoteVersion;->getType()Ljava/lang/String;

    move-result-object v11

    const-string v13, "snapshot"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4c

    const/4 v9, 0x1

    goto :goto_26

    :cond_4c
    const/4 v9, 0x0

    .line 207
    .end local v9    # "it\\22":Lcom/pymcl/android/ui/state/RemoteVersion;
    .end local v10    # "$i$a$-firstOrNull-AiToolHostImpl$execute$2$manifest$2\\22\\207\\0":I
    :goto_26
    if-eqz v9, :cond_4b

    goto :goto_27

    .line 208
    .end local v8    # "element\\21":Ljava/lang/Object;
    :cond_4d
    const/4 v8, 0x0

    .line 81
    .end local v5    # "$this$firstOrNull\\21":Ljava/lang/Iterable;
    .end local v6    # "$i$f$firstOrNull\\21\\81":I
    :goto_27
    check-cast v8, Lcom/pymcl/android/ui/state/RemoteVersion;

    if-eqz v8, :cond_4e

    invoke-virtual {v8}, Lcom/pymcl/android/ui/state/RemoteVersion;->getId()Ljava/lang/String;

    move-result-object v15

    goto :goto_28

    :cond_4e
    const/4 v15, 0x0

    :goto_28
    if-nez v15, :cond_4f

    goto :goto_29

    :cond_4f
    move-object v12, v15

    .line 82
    :goto_29
    move-object v5, v2

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$map\\23":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 209
    .local v6, "$i$f$map\\23\\82":I
    new-instance v7, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v5, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination\\24":Ljava/util/Collection;
    move-object v8, v5

    .local v8, "$this$mapTo\\24":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 210
    .local v9, "$i$f$mapTo\\24\\209":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_50

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 211
    .local v11, "item\\24":Ljava/lang/Object;
    move-object v13, v11

    check-cast v13, Lcom/pymcl/android/ui/state/RemoteVersion;

    .local v13, "it\\25":Lcom/pymcl/android/ui/state/RemoteVersion;
    const/4 v15, 0x0

    .line 82
    .local v15, "$i$a$-map-AiToolHostImpl$execute$2$manifest$3\\25\\211\\0":I
    new-instance v25, Lcom/pymcl/core/version/ManifestEntry;

    invoke-virtual {v13}, Lcom/pymcl/android/ui/state/RemoteVersion;->getId()Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v13}, Lcom/pymcl/android/ui/state/RemoteVersion;->getType()Ljava/lang/String;

    move-result-object v27

    invoke-virtual {v13}, Lcom/pymcl/android/ui/state/RemoteVersion;->getReleaseTime()Ljava/lang/String;

    move-result-object v29

    const/16 v30, 0x0

    const-string v28, ""

    invoke-direct/range {v25 .. v30}, Lcom/pymcl/core/version/ManifestEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    move-object/from16 v13, v25

    .end local v13    # "it\\25":Lcom/pymcl/android/ui/state/RemoteVersion;
    .end local v15    # "$i$a$-map-AiToolHostImpl$execute$2$manifest$3\\25\\211\\0":I
    invoke-interface {v7, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2a

    .line 212
    .end local v11    # "item\\24":Ljava/lang/Object;
    :cond_50
    nop

    .end local v7    # "destination\\24":Ljava/util/Collection;
    .end local v8    # "$this$mapTo\\24":Ljava/lang/Iterable;
    .end local v9    # "$i$f$mapTo\\24\\209":I
    check-cast v7, Ljava/util/List;

    .line 209
    nop

    .line 81
    .end local v5    # "$this$map\\23":Ljava/lang/Iterable;
    .end local v6    # "$i$f$map\\23\\82":I
    new-instance v5, Lcom/pymcl/core/version/VersionManifest;

    invoke-direct {v5, v4, v12, v7}, Lcom/pymcl/core/version/VersionManifest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 83
    .local v5, "manifest":Lcom/pymcl/core/version/VersionManifest;
    move-object v4, v0

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_51

    const/4 v4, 0x1

    goto :goto_2b

    :cond_51
    const/4 v4, 0x0

    :goto_2b
    if-eqz v4, :cond_52

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    goto :goto_2c

    :cond_52
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :goto_2c
    check-cast v4, Ljava/util/Collection;

    const/16 v6, 0x1e

    invoke-static {v5, v3, v4, v6}, Lcom/pymcl/core/version/VersionFilterKt;->filterVersions(Lcom/pymcl/core/version/VersionManifest;Ljava/lang/String;Ljava/util/Collection;I)Ljava/util/List;

    move-result-object v4

    .line 84
    .local v4, "hits":Ljava/util/List;
    sget-object v6, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    const/4 v7, 0x2

    new-array v8, v7, [Lkotlin/Pair;

    move-object v7, v2

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$filter\\26":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 213
    .local v9, "$i$f$filter\\26\\84":I
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v10, Ljava/util/Collection;

    .local v10, "destination\\27":Ljava/util/Collection;
    move-object v11, v7

    .local v11, "$this$filterTo\\27":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 214
    .local v12, "$i$f$filterTo\\27\\213":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_53
    :goto_2d
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_54

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element\\27":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Lcom/pymcl/android/ui/state/RemoteVersion;

    .local v16, "it\\28":Lcom/pymcl/android/ui/state/RemoteVersion;
    const/16 v20, 0x0

    .line 84
    .local v20, "$i$a$-filter-AiToolHostImpl$execute$2$6\\28\\214\\0":I
    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/android/ui/state/RemoteVersion;->getLatest()Z

    move-result v16

    .line 214
    .end local v16    # "it\\28":Lcom/pymcl/android/ui/state/RemoteVersion;
    .end local v20    # "$i$a$-filter-AiToolHostImpl$execute$2$6\\28\\214\\0":I
    if-eqz v16, :cond_53

    invoke-interface {v10, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2d

    .line 215
    .end local v15    # "element\\27":Ljava/lang/Object;
    :cond_54
    nop

    .end local v10    # "destination\\27":Ljava/util/Collection;
    .end local v11    # "$this$filterTo\\27":Ljava/lang/Iterable;
    .end local v12    # "$i$f$filterTo\\27\\213":I
    check-cast v10, Ljava/util/List;

    .line 213
    nop

    .end local v7    # "$this$filter\\26":Ljava/lang/Iterable;
    .end local v9    # "$i$f$filter\\26\\84":I
    check-cast v10, Ljava/lang/Iterable;

    .line 84
    nop

    .local v10, "$this$map\\29":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 216
    .local v7, "$i$f$map\\29\\84":I
    new-instance v9, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v10, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v9, Ljava/util/Collection;

    .local v9, "destination\\30":Ljava/util/Collection;
    move-object v11, v10

    .local v11, "$this$mapTo\\30":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 217
    .local v12, "$i$f$mapTo\\30\\216":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2e
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_55

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 218
    .local v15, "item\\30":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Lcom/pymcl/android/ui/state/RemoteVersion;

    .local v16, "it\\31":Lcom/pymcl/android/ui/state/RemoteVersion;
    const/16 v20, 0x0

    .line 84
    .local v20, "$i$a$-map-AiToolHostImpl$execute$2$7\\31\\218\\0":I
    move-object/from16 v22, v0

    .end local v0    # "kind":Ljava/lang/String;
    .local v22, "kind":Ljava/lang/String;
    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/android/ui/state/RemoteVersion;->getType()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v25, v2

    .end local v2    # "all":Ljava/util/List;
    .local v25, "all":Ljava/util/List;
    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/android/ui/state/RemoteVersion;->getId()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v26, v3

    .end local v3    # "q":Ljava/lang/String;
    .local v26, "q":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ":"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 218
    .end local v16    # "it\\31":Lcom/pymcl/android/ui/state/RemoteVersion;
    .end local v20    # "$i$a$-map-AiToolHostImpl$execute$2$7\\31\\218\\0":I
    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v22

    move-object/from16 v2, v25

    move-object/from16 v3, v26

    goto :goto_2e

    .line 219
    .end local v15    # "item\\30":Ljava/lang/Object;
    .end local v22    # "kind":Ljava/lang/String;
    .end local v25    # "all":Ljava/util/List;
    .end local v26    # "q":Ljava/lang/String;
    .restart local v0    # "kind":Ljava/lang/String;
    .restart local v2    # "all":Ljava/util/List;
    .restart local v3    # "q":Ljava/lang/String;
    :cond_55
    move-object/from16 v22, v0

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    .end local v0    # "kind":Ljava/lang/String;
    .end local v2    # "all":Ljava/util/List;
    .end local v3    # "q":Ljava/lang/String;
    .end local v9    # "destination\\30":Ljava/util/Collection;
    .end local v11    # "$this$mapTo\\30":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapTo\\30\\216":I
    .restart local v22    # "kind":Ljava/lang/String;
    .restart local v25    # "all":Ljava/util/List;
    .restart local v26    # "q":Ljava/lang/String;
    move-object v0, v9

    check-cast v0, Ljava/util/List;

    .line 216
    nop

    .end local v7    # "$i$f$map\\29\\84":I
    .end local v10    # "$this$map\\29":Ljava/lang/Iterable;
    check-cast v0, Ljava/util/Collection;

    .line 84
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    const-string v2, "latest"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v23, 0x0

    aput-object v0, v8, v23

    .line 85
    move-object v0, v4

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map\\32":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 220
    .local v2, "$i$f$map\\32\\85":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v0, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination\\33":Ljava/util/Collection;
    move-object v7, v0

    .local v7, "$this$mapTo\\33":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 221
    .local v9, "$i$f$mapTo\\33\\220":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2f
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_56

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 222
    .local v11, "item\\33":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Lcom/pymcl/core/version/ManifestEntry;

    .local v12, "it\\34":Lcom/pymcl/core/version/ManifestEntry;
    const/4 v13, 0x0

    .line 85
    .local v13, "$i$a$-map-AiToolHostImpl$execute$2$8\\34\\222\\0":I
    move-object/from16 v16, v0

    const/4 v15, 0x3

    .end local v0    # "$this$map\\32":Ljava/lang/Iterable;
    .local v16, "$this$map\\32":Ljava/lang/Iterable;
    new-array v0, v15, [Lkotlin/Pair;

    invoke-virtual {v12}, Lcom/pymcl/core/version/ManifestEntry;->getId()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v15

    const/16 v23, 0x0

    aput-object v15, v0, v23

    const-string v15, "type"

    move-object/from16 v18, v0

    invoke-virtual {v12}, Lcom/pymcl/core/version/ManifestEntry;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v19, 0x1

    aput-object v0, v18, v19

    const-string v0, "release"

    invoke-virtual {v12}, Lcom/pymcl/core/version/ManifestEntry;->getReleaseTime()Ljava/lang/String;

    move-result-object v15

    invoke-static {v0, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v21, 0x2

    aput-object v0, v18, v21

    invoke-static/range {v18 .. v18}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 222
    .end local v12    # "it\\34":Lcom/pymcl/core/version/ManifestEntry;
    .end local v13    # "$i$a$-map-AiToolHostImpl$execute$2$8\\34\\222\\0":I
    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v16

    goto :goto_2f

    .line 223
    .end local v11    # "item\\33":Ljava/lang/Object;
    .end local v16    # "$this$map\\32":Ljava/lang/Iterable;
    .restart local v0    # "$this$map\\32":Ljava/lang/Iterable;
    :cond_56
    move-object/from16 v16, v0

    .end local v0    # "$this$map\\32":Ljava/lang/Iterable;
    .end local v3    # "destination\\33":Ljava/util/Collection;
    .end local v7    # "$this$mapTo\\33":Ljava/lang/Iterable;
    .end local v9    # "$i$f$mapTo\\33\\220":I
    .restart local v16    # "$this$map\\32":Ljava/lang/Iterable;
    move-object v0, v3

    check-cast v0, Ljava/util/List;

    .line 220
    nop

    .end local v2    # "$i$f$map\\32\\85":I
    .end local v16    # "$this$map\\32":Ljava/lang/Iterable;
    check-cast v0, Ljava/util/Collection;

    .line 85
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    const-string v2, "results"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v7, 0x1

    aput-object v0, v8, v7

    .line 84
    invoke-static {v8}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 85
    nop

    .line 84
    invoke-virtual {v6, v0, v7}, Lcom/pymcl/ai/ToolOutput$Companion;->json(Ljava/lang/Object;Z)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v4    # "hits":Ljava/util/List;
    .end local v5    # "manifest":Lcom/pymcl/core/version/VersionManifest;
    .end local v22    # "kind":Ljava/lang/String;
    .end local v25    # "all":Ljava/util/List;
    .end local v26    # "q":Ljava/lang/String;
    goto/16 :goto_40

    .line 63
    :sswitch_1e
    move-object/from16 v9, v25

    const-string v2, "inspect_mod"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_57

    goto/16 :goto_33

    .line 137
    :cond_57
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v2, v0, v4}, Lcom/pymcl/android/data/AiToolHostImpl;->access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    .local v2, "v":Ljava/lang/String;
    iget-object v4, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    invoke-static {v5, v13}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_58

    goto :goto_30

    :cond_58
    move-object v12, v5

    :goto_30
    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    const/16 v6, 0x1c

    iput v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-static {v4, v0, v2, v12, v5}, Lcom/pymcl/android/data/AiToolHostImpl;->access$resolveMod(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_59

    .line 62
    return-object v3

    .line 137
    :cond_59
    move-object v3, v0

    move-object v0, v2

    .line 62
    .end local v2    # "v":Ljava/lang/String;
    .local v0, "v":Ljava/lang/String;
    .local v3, "i":Lcom/pymcl/core/instance/Instance;
    :goto_31
    move-object v2, v4

    check-cast v2, Ljava/lang/String;

    .line 138
    .local v2, "fn":Ljava/lang/String;
    sget-object v4, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    new-instance v6, Ljava/io/File;

    new-instance v7, Ljava/io/File;

    iget-object v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v8, v3, v0}, Lcom/pymcl/android/data/AiToolHostImpl;->access$gameDir(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v8

    invoke-direct {v7, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v6, v7, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v5, v6}, Lcom/pymcl/android/data/AiToolHostImpl;->access$modInfo(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/io/File;)Ljava/util/Map;

    move-result-object v5

    if-nez v5, :cond_5a

    const/4 v7, 0x2

    new-array v5, v7, [Lkotlin/Pair;

    invoke-static {v13, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    const/4 v8, 0x0

    aput-object v6, v5, v8

    const-string v6, "error"

    const-string v7, "\u65e0\u6cd5\u89e3\u6790\u5143\u6570\u636e"

    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    const/16 v19, 0x1

    aput-object v6, v5, v19

    invoke-static {v5}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    goto :goto_32

    :cond_5a
    const/4 v8, 0x0

    :goto_32
    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v4, v5, v8, v7, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->json$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/Object;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object/from16 v27, v24

    .end local v0    # "v":Ljava/lang/String;
    .end local v2    # "fn":Ljava/lang/String;
    .end local v3    # "i":Lcom/pymcl/core/instance/Instance;
    goto/16 :goto_40

    .line 63
    :sswitch_1f
    move-object/from16 v9, v25

    move-object/from16 v14, v26

    const-string v2, "get_launcher_state"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5b

    :goto_33
    move-object/from16 v27, v24

    goto/16 :goto_3f

    .line 65
    :cond_5b
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-virtual {v0}, Lcom/pymcl/android/data/AiToolHostImpl;->currentInstance()Ljava/lang/String;

    move-result-object v5

    .local v5, "cur":Ljava/lang/String;
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v0}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getRepo(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/pymcl/core/instance/InstanceManager;->get(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .line 66
    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v2

    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/Continuation;

    move-object/from16 v7, v24

    .end local v24    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .local v7, "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    iput-object v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    iput-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    iput-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    const/4 v8, 0x1

    iput v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-virtual {v2, v5, v6}, Lcom/pymcl/android/data/RepositoryUiApi;->getInstalledVersions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5c

    .line 62
    return-object v3

    .line 66
    :cond_5c
    move-object/from16 v31, v2

    move-object v2, v0

    move-object/from16 v0, v31

    .line 62
    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .local v2, "i":Lcom/pymcl/core/instance/Instance;
    :goto_34
    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 67
    .local v6, "vs":Ljava/util/List;
    iget-object v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$args:Ljava/util/Map;

    :try_start_1
    sget-object v10, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v10, v7

    .line 183
    .local v10, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v11, 0x0

    .line 67
    .local v11, "$i$a$-runCatching-AiToolHostImpl$execute$2$mods$1\\1\\67\\0":I
    new-instance v12, Ljava/io/File;

    invoke-static {v0, v2, v8}, Lcom/pymcl/android/data/AiToolHostImpl;->access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v2, v8}, Lcom/pymcl/android/data/AiToolHostImpl;->access$gameDir(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-direct {v12, v0, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_5f

    .local v0, "$this$count\\2":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 184
    .local v8, "$i$f$count\\2\\67":I
    const/4 v9, 0x0

    .line 185
    .local v9, "count\\2":I
    array-length v12, v0

    move v13, v9

    const/4 v9, 0x0

    .end local v9    # "count\\2":I
    .local v13, "count\\2":I
    :goto_35
    if-ge v9, v12, :cond_5e

    aget-object v15, v0, v9

    .local v15, "element\\2":Ljava/lang/Object;
    move-object/from16 v22, v15

    .local v22, "it\\3":Ljava/io/File;
    const/16 v24, 0x0

    .line 67
    .local v24, "$i$a$-count-AiToolHostImpl$execute$2$mods$1$1\\3\\185\\1":I
    move-object/from16 v25, v0

    .end local v0    # "$this$count\\2":[Ljava/lang/Object;
    .local v25, "$this$count\\2":[Ljava/lang/Object;
    invoke-virtual/range {v22 .. v22}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-object/from16 v26, v2

    .end local v2    # "i":Lcom/pymcl/core/instance/Instance;
    .local v26, "i":Lcom/pymcl/core/instance/Instance;
    :try_start_2
    const-string v2, "getName(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, ".jar"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v27, v7

    move/from16 v28, v8

    move/from16 v29, v9

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    .end local v7    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .end local v8    # "$i$f$count\\2\\67":I
    .restart local v27    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .local v28, "$i$f$count\\2\\67":I
    :try_start_3
    invoke-static {v0, v2, v9, v8, v7}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    .line 185
    .end local v22    # "it\\3":Ljava/io/File;
    .end local v24    # "$i$a$-count-AiToolHostImpl$execute$2$mods$1$1\\3\\185\\1":I
    if-eqz v0, :cond_5d

    add-int/lit8 v13, v13, 0x1

    .end local v15    # "element\\2":Ljava/lang/Object;
    :cond_5d
    add-int/lit8 v9, v29, 0x1

    move-object/from16 v0, v25

    move-object/from16 v2, v26

    move-object/from16 v7, v27

    move/from16 v8, v28

    goto :goto_35

    .line 67
    .end local v10    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v11    # "$i$a$-runCatching-AiToolHostImpl$execute$2$mods$1\\1\\67\\0":I
    .end local v13    # "count\\2":I
    .end local v25    # "$this$count\\2":[Ljava/lang/Object;
    .end local v27    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .end local v28    # "$i$f$count\\2\\67":I
    .restart local v7    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    :catchall_1
    move-exception v0

    move-object/from16 v27, v7

    .end local v7    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v27    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    goto :goto_37

    .line 186
    .end local v26    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v27    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v0    # "$this$count\\2":[Ljava/lang/Object;
    .restart local v2    # "i":Lcom/pymcl/core/instance/Instance;
    .restart local v7    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v8    # "$i$f$count\\2\\67":I
    .restart local v10    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .restart local v11    # "$i$a$-runCatching-AiToolHostImpl$execute$2$mods$1\\1\\67\\0":I
    .restart local v13    # "count\\2":I
    :cond_5e
    move-object/from16 v25, v0

    move-object/from16 v26, v2

    move-object/from16 v27, v7

    move/from16 v28, v8

    .line 67
    .end local v0    # "$this$count\\2":[Ljava/lang/Object;
    .end local v2    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v7    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .end local v8    # "$i$f$count\\2\\67":I
    .end local v13    # "count\\2":I
    .restart local v26    # "i":Lcom/pymcl/core/instance/Instance;
    .restart local v27    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    goto :goto_36

    .end local v26    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v27    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v2    # "i":Lcom/pymcl/core/instance/Instance;
    .restart local v7    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    :cond_5f
    move-object/from16 v26, v2

    move-object/from16 v27, v7

    .end local v2    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v7    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v26    # "i":Lcom/pymcl/core/instance/Instance;
    .restart local v27    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    const/4 v13, 0x0

    .end local v10    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v11    # "$i$a$-runCatching-AiToolHostImpl$execute$2$mods$1\\1\\67\\0":I
    :goto_36
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_38

    :catchall_2
    move-exception v0

    goto :goto_37

    .end local v26    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v27    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v2    # "i":Lcom/pymcl/core/instance/Instance;
    .restart local v7    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    :catchall_3
    move-exception v0

    move-object/from16 v26, v2

    move-object/from16 v27, v7

    .end local v2    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v7    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v26    # "i":Lcom/pymcl/core/instance/Instance;
    .restart local v27    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    :goto_37
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_38
    const/16 v23, 0x0

    invoke-static/range {v23 .. v23}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_60

    move-object v0, v2

    :cond_60
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 68
    .local v0, "mods":I
    sget-object v2, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    .line 69
    const/16 v7, 0x8

    new-array v7, v7, [Lkotlin/Pair;

    const-string v8, "platform"

    const-string v9, "android"

    invoke-static {v8, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v23, 0x0

    aput-object v8, v7, v23

    const-string v8, "current_instance"

    invoke-static {v8, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v19, 0x1

    aput-object v8, v7, v19

    iget-object v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v8}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v8

    move-object v9, v1

    check-cast v9, Lkotlin/coroutines/Continuation;

    invoke-static/range {v27 .. v27}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    invoke-static/range {v26 .. v26}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    iput-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$3:Ljava/lang/Object;

    iput-object v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$4:Ljava/lang/Object;

    iput-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$5:Ljava/lang/Object;

    iput-object v7, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$6:Ljava/lang/Object;

    const-string v10, "instances"

    iput-object v10, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$7:Ljava/lang/Object;

    iput v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->I$0:I

    const/4 v11, 0x2

    iput v11, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->I$1:I

    iput v11, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    invoke-virtual {v8, v9}, Lcom/pymcl/android/data/RepositoryUiApi;->listInstances(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_61

    .line 62
    return-object v3

    .line 69
    :cond_61
    move-object v13, v5

    move-object v11, v6

    move-object v5, v7

    move-object/from16 v9, v26

    move-object v6, v2

    const/4 v2, 0x2

    .line 62
    .end local v5    # "cur":Ljava/lang/String;
    .end local v6    # "vs":Ljava/util/List;
    .end local v26    # "i":Lcom/pymcl/core/instance/Instance;
    .local v9, "i":Lcom/pymcl/core/instance/Instance;
    .local v11, "vs":Ljava/util/List;
    .local v13, "cur":Ljava/lang/String;
    :goto_39
    check-cast v8, Ljava/lang/Iterable;

    .local v8, "$this$map\\4":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 187
    .local v12, "$i$f$map\\4\\69":I
    new-instance v15, Ljava/util/ArrayList;

    move/from16 v22, v2

    move-object/from16 v24, v7

    const/16 v2, 0xa

    invoke-static {v8, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v15, v7}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, v15

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination\\5":Ljava/util/Collection;
    move-object v7, v8

    .local v7, "$this$mapTo\\5":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 188
    .local v15, "$i$f$mapTo\\5\\187":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v25

    :goto_3a
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_62

    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    .line 189
    .local v26, "item\\5":Ljava/lang/Object;
    move-object/from16 v28, v26

    check-cast v28, Lcom/pymcl/android/ui/state/InstanceRow;

    .local v28, "it\\6":Lcom/pymcl/android/ui/state/InstanceRow;
    const/16 v29, 0x0

    .line 69
    .local v29, "$i$a$-map-AiToolHostImpl$execute$2$1\\6\\189\\0":I
    move-object/from16 v30, v7

    .end local v7    # "$this$mapTo\\5":Ljava/lang/Iterable;
    .local v30, "$this$mapTo\\5":Ljava/lang/Iterable;
    invoke-virtual/range {v28 .. v28}, Lcom/pymcl/android/ui/state/InstanceRow;->getName()Ljava/lang/String;

    move-result-object v7

    .line 189
    .end local v28    # "it\\6":Lcom/pymcl/android/ui/state/InstanceRow;
    .end local v29    # "$i$a$-map-AiToolHostImpl$execute$2$1\\6\\189\\0":I
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v7, v30

    goto :goto_3a

    .line 190
    .end local v26    # "item\\5":Ljava/lang/Object;
    .end local v30    # "$this$mapTo\\5":Ljava/lang/Iterable;
    .restart local v7    # "$this$mapTo\\5":Ljava/lang/Iterable;
    :cond_62
    move-object/from16 v30, v7

    .end local v2    # "destination\\5":Ljava/util/Collection;
    .end local v7    # "$this$mapTo\\5":Ljava/lang/Iterable;
    .end local v15    # "$i$f$mapTo\\5\\187":I
    check-cast v2, Ljava/util/List;

    .line 187
    nop

    .end local v8    # "$this$map\\4":Ljava/lang/Iterable;
    .end local v12    # "$i$f$map\\4\\69":I
    check-cast v2, Ljava/util/Collection;

    .line 69
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v24, v22

    .line 70
    move-object v2, v11

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map\\7":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 191
    .local v7, "$i$f$map\\7\\70":I
    new-instance v8, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v2, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v8, v12}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination\\8":Ljava/util/Collection;
    move-object v10, v2

    .local v10, "$this$mapTo\\8":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 192
    .local v12, "$i$f$mapTo\\8\\191":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_3b
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_63

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    .line 193
    .local v22, "item\\8":Ljava/lang/Object;
    move-object/from16 v24, v22

    check-cast v24, Lcom/pymcl/android/ui/state/InstalledVersion;

    .local v24, "it\\9":Lcom/pymcl/android/ui/state/InstalledVersion;
    const/16 v25, 0x0

    .line 70
    .local v25, "$i$a$-map-AiToolHostImpl$execute$2$2\\9\\193\\0":I
    move-object/from16 v26, v2

    move/from16 v28, v7

    const/4 v2, 0x3

    .end local v2    # "$this$map\\7":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map\\7\\70":I
    .local v26, "$this$map\\7":Ljava/lang/Iterable;
    .local v28, "$i$f$map\\7\\70":I
    new-array v7, v2, [Lkotlin/Pair;

    invoke-virtual/range {v24 .. v24}, Lcom/pymcl/android/ui/state/InstalledVersion;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v23, 0x0

    aput-object v2, v7, v23

    const-string v2, "mc"

    move-object/from16 v29, v7

    invoke-virtual/range {v24 .. v24}, Lcom/pymcl/android/ui/state/InstalledVersion;->getMc()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v19, 0x1

    aput-object v2, v29, v19

    const-string v2, "loader"

    invoke-virtual/range {v24 .. v24}, Lcom/pymcl/android/ui/state/InstalledVersion;->getLoader()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v21, 0x2

    aput-object v2, v29, v21

    invoke-static/range {v29 .. v29}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    .line 193
    .end local v24    # "it\\9":Lcom/pymcl/android/ui/state/InstalledVersion;
    .end local v25    # "$i$a$-map-AiToolHostImpl$execute$2$2\\9\\193\\0":I
    invoke-interface {v8, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v26

    move/from16 v7, v28

    goto :goto_3b

    .line 194
    .end local v22    # "item\\8":Ljava/lang/Object;
    .end local v26    # "$this$map\\7":Ljava/lang/Iterable;
    .end local v28    # "$i$f$map\\7\\70":I
    .restart local v2    # "$this$map\\7":Ljava/lang/Iterable;
    .restart local v7    # "$i$f$map\\7\\70":I
    :cond_63
    move-object/from16 v26, v2

    move/from16 v28, v7

    .end local v2    # "$this$map\\7":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map\\7\\70":I
    .end local v8    # "destination\\8":Ljava/util/Collection;
    .end local v10    # "$this$mapTo\\8":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapTo\\8\\191":I
    .restart local v26    # "$this$map\\7":Ljava/lang/Iterable;
    .restart local v28    # "$i$f$map\\7\\70":I
    move-object v2, v8

    check-cast v2, Ljava/util/List;

    .line 191
    nop

    .end local v26    # "$this$map\\7":Ljava/lang/Iterable;
    .end local v28    # "$i$f$map\\7\\70":I
    check-cast v2, Ljava/util/Collection;

    .line 70
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    const-string v7, "installed_versions"

    invoke-static {v7, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v17, 0x3

    aput-object v2, v5, v17

    .line 69
    nop

    .line 71
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v2

    move-object v7, v1

    check-cast v7, Lkotlin/coroutines/Continuation;

    invoke-static/range {v27 .. v27}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$0:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$1:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$2:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$3:Ljava/lang/Object;

    iput-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$4:Ljava/lang/Object;

    iput-object v6, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$5:Ljava/lang/Object;

    iput-object v5, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$6:Ljava/lang/Object;

    const-string v8, "java"

    iput-object v8, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->L$7:Ljava/lang/Object;

    iput v0, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->I$0:I

    const/4 v12, 0x4

    iput v12, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->I$1:I

    const/4 v15, 0x3

    iput v15, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->label:I

    const/4 v10, 0x0

    invoke-virtual {v2, v10, v7}, Lcom/pymcl/android/data/RepositoryUiApi;->getJavaList(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_64

    .line 62
    return-object v3

    .line 71
    :cond_64
    move-object v7, v5

    move-object v3, v8

    move-object v8, v11

    move-object v10, v13

    .line 62
    .end local v11    # "vs":Ljava/util/List;
    .end local v13    # "cur":Ljava/lang/String;
    .local v8, "vs":Ljava/util/List;
    .local v10, "cur":Ljava/lang/String;
    :goto_3c
    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map\\10":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 195
    .local v11, "$i$f$map\\10\\71":I
    new-instance v13, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v2, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination\\11":Ljava/util/Collection;
    move-object v14, v2

    .local v14, "$this$mapTo\\11":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 196
    .local v15, "$i$f$mapTo\\11\\195":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_3d
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_65

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .line 197
    .local v17, "item\\11":Ljava/lang/Object;
    move-object/from16 v18, v17

    check-cast v18, Lcom/pymcl/android/ui/state/JavaRow;

    .local v18, "it\\12":Lcom/pymcl/android/ui/state/JavaRow;
    const/16 v19, 0x0

    .line 71
    .local v19, "$i$a$-map-AiToolHostImpl$execute$2$3\\12\\197\\0":I
    move-object/from16 v22, v2

    .end local v2    # "$this$map\\10":Ljava/lang/Iterable;
    .local v22, "$this$map\\10":Ljava/lang/Iterable;
    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/android/ui/state/JavaRow;->getMajor()I

    move-result v2

    move-object/from16 v24, v5

    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/android/ui/state/JavaRow;->getVersion()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v25, v7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v7, " ("

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, ")"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 197
    .end local v18    # "it\\12":Lcom/pymcl/android/ui/state/JavaRow;
    .end local v19    # "$i$a$-map-AiToolHostImpl$execute$2$3\\12\\197\\0":I
    invoke-interface {v13, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v22

    move-object/from16 v5, v24

    move-object/from16 v7, v25

    goto :goto_3d

    .line 198
    .end local v17    # "item\\11":Ljava/lang/Object;
    .end local v22    # "$this$map\\10":Ljava/lang/Iterable;
    .restart local v2    # "$this$map\\10":Ljava/lang/Iterable;
    :cond_65
    move-object/from16 v22, v2

    move-object/from16 v24, v5

    move-object/from16 v25, v7

    .end local v2    # "$this$map\\10":Ljava/lang/Iterable;
    .end local v13    # "destination\\11":Ljava/util/Collection;
    .end local v14    # "$this$mapTo\\11":Ljava/lang/Iterable;
    .end local v15    # "$i$f$mapTo\\11\\195":I
    .restart local v22    # "$this$map\\10":Ljava/lang/Iterable;
    move-object v2, v13

    check-cast v2, Ljava/util/List;

    .line 195
    nop

    .end local v11    # "$i$f$map\\10\\71":I
    .end local v22    # "$this$map\\10":Ljava/lang/Iterable;
    check-cast v2, Ljava/util/Collection;

    .line 71
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v24, v12

    .line 69
    nop

    .line 72
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getRepo(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getAccounts()Lcom/pymcl/core/account/AccountStore;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/core/account/AccountStore;->active()Lcom/pymcl/core/account/Account;

    move-result-object v2

    if-eqz v2, :cond_66

    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v2

    goto :goto_3e

    :cond_66
    const/4 v2, 0x0

    :goto_3e
    const-string v3, "account"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v25, v3

    .line 69
    nop

    .line 72
    int-to-long v2, v0

    invoke-static {v2, v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "mods_enabled"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v25, v3

    .line 69
    nop

    .line 72
    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->this$0:Lcom/pymcl/android/data/AiToolHostImpl;

    invoke-static {v2}, Lcom/pymcl/android/data/AiToolHostImpl;->access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/RepositoryUiApi;->isGameRunning()Z

    move-result v2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "game_running"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v25, v3

    .line 69
    nop

    .line 68
    invoke-static/range {v25 .. v25}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v7, 0x0

    invoke-static {v6, v2, v3, v5, v7}, Lcom/pymcl/ai/ToolOutput$Companion;->json$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/Object;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    .end local v0    # "mods":I
    .end local v8    # "vs":Ljava/util/List;
    .end local v9    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v10    # "cur":Ljava/lang/String;
    goto :goto_40

    .line 145
    :goto_3f
    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;->$name:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5b89\u5353\u7248\u6682\u4e0d\u652f\u6301\u5de5\u5177 "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    .line 146
    :goto_40
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x78e078c5 -> :sswitch_1f
        -0x5b0df1a9 -> :sswitch_1e
        -0x57d2d8ae -> :sswitch_1d
        -0x5020c4eb -> :sswitch_1c
        -0x4efe3c12 -> :sswitch_1b
        -0x4d4603e3 -> :sswitch_1a
        -0x48f90b4e -> :sswitch_19
        -0x22568f57 -> :sswitch_18
        -0x20272a18 -> :sswitch_17
        -0x1b086919 -> :sswitch_16
        -0x164c705e -> :sswitch_15
        -0x13edd8ff -> :sswitch_14
        -0x1395650e -> :sswitch_13
        -0xdbcc702 -> :sswitch_12
        -0xc4b6a98 -> :sswitch_11
        -0x5d10b91 -> :sswitch_10
        0x1e1af79 -> :sswitch_f
        0x1164ff7f -> :sswitch_e
        0x11c6c154 -> :sswitch_d
        0x1fb2cb15 -> :sswitch_c
        0x41f518e2 -> :sswitch_b
        0x50af452b -> :sswitch_a
        0x5141e74b -> :sswitch_9
        0x57b58078 -> :sswitch_8
        0x5e11c198 -> :sswitch_7
        0x65deb977 -> :sswitch_6
        0x67f8db09 -> :sswitch_5
        0x69328e6e -> :sswitch_4
        0x6aa92313 -> :sswitch_3
        0x70dd8246 -> :sswitch_2
        0x794b2816 -> :sswitch_1
        0x7fc8b65e -> :sswitch_0
    .end sparse-switch
.end method
