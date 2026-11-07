.class final Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->lanWorlds()Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/util/LinkedHashMap<",
        "Ljava/lang/String;",
        "Lcom/pymcl/android/ui/state/LanWorldRow;",
        ">;",
        "Lcom/pymcl/multiplayer/LanWorld;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/util/LinkedHashMap<",
        "Ljava/lang/String;",
        "Lcom/pymcl/android/ui/state/LanWorldRow;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$lanWorlds$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n1#2:495\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u00042\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n"
    }
    d2 = {
        "<anonymous>",
        "Ljava/util/LinkedHashMap;",
        "",
        "Lcom/pymcl/android/ui/state/LanWorldRow;",
        "Lkotlin/collections/LinkedHashMap;",
        "acc",
        "w",
        "Lcom/pymcl/multiplayer/LanWorld;"
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
    c = "com.pymcl.android.data.RepositoryUiApi$lanWorlds$1"
    f = "RepositoryUiApi.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/util/LinkedHashMap;

    check-cast p2, Lcom/pymcl/multiplayer/LanWorld;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;->invoke(Ljava/util/LinkedHashMap;Lcom/pymcl/multiplayer/LanWorld;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Ljava/util/LinkedHashMap;Lcom/pymcl/multiplayer/LanWorld;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/ui/state/LanWorldRow;",
            ">;",
            "Lcom/pymcl/multiplayer/LanWorld;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/ui/state/LanWorldRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;

    invoke-direct {v0, p3}, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;-><init>(Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;->L$1:Ljava/lang/Object;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    .local v0, "acc":Ljava/util/LinkedHashMap;
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/multiplayer/LanWorld;

    .local v1, "w":Lcom/pymcl/multiplayer/LanWorld;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 445
    iget v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance v2, Ljava/util/LinkedHashMap;

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    move-object v3, v2

    .line 495
    .local v3, "it\\1":Ljava/util/LinkedHashMap;
    const/4 v4, 0x0

    .line 445
    .local v4, "$i$a$-also-RepositoryUiApi$lanWorlds$1$1\\1\\445\\0":I
    move-object v5, v3

    check-cast v5, Ljava/util/Map;

    invoke-virtual {v1}, Lcom/pymcl/multiplayer/LanWorld;->getAddress()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/pymcl/android/ui/state/LanWorldRow;

    invoke-virtual {v1}, Lcom/pymcl/multiplayer/LanWorld;->getMotd()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/pymcl/multiplayer/LanWorld;->getAddress()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v8, v9}, Lcom/pymcl/android/ui/state/LanWorldRow;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v3    # "it\\1":Ljava/util/LinkedHashMap;
    .end local v4    # "$i$a$-also-RepositoryUiApi$lanWorlds$1$1\\1\\445\\0":I
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
