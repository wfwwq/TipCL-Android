.class public final Lcom/pymcl/multiplayer/StubMultiplayerService;
.super Ljava/lang/Object;
.source "Terracotta.kt"

# interfaces
.implements Lcom/pymcl/multiplayer/MultiplayerService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\u000cJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/multiplayer/StubMultiplayerService;",
        "Lcom/pymcl/multiplayer/MultiplayerService;",
        "<init>",
        "()V",
        "available",
        "",
        "getAvailable",
        "()Z",
        "host",
        "Lcom/pymcl/multiplayer/RoomState;",
        "port",
        "",
        "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "join",
        "inviteCode",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "leave",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "PyMCL-Android:multiplayer_debug"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final available:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAvailable()Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Lcom/pymcl/multiplayer/StubMultiplayerService;->available:Z

    return v0
.end method

.method public host(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "port"    # I
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/multiplayer/RoomState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 24
    new-instance v0, Lcom/pymcl/multiplayer/RoomState$Failed;

    const-string v1, "Terracotta \u5c1a\u672a\u63a5\u5165"

    invoke-direct {v0, v1}, Lcom/pymcl/multiplayer/RoomState$Failed;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public join(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "inviteCode"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/multiplayer/RoomState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 25
    new-instance v0, Lcom/pymcl/multiplayer/RoomState$Failed;

    const-string v1, "Terracotta \u5c1a\u672a\u63a5\u5165"

    invoke-direct {v0, v1}, Lcom/pymcl/multiplayer/RoomState$Failed;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public leave(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 26
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
