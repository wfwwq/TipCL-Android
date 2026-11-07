.class public final Lcom/pymcl/multiplayer/MultiplayerController$Companion;
.super Ljava/lang/Object;
.source "MultiplayerController.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/multiplayer/MultiplayerController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultiplayerController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiplayerController.kt\ncom/pymcl/multiplayer/MultiplayerController$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0010\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/pymcl/multiplayer/MultiplayerController$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "VPN_DENIED_NOTICE",
        "DEFAULT_EXTRA_NODES",
        "",
        "getDEFAULT_EXTRA_NODES",
        "()Ljava/util/List;",
        "instance",
        "Lcom/pymcl/multiplayer/MultiplayerController;",
        "get",
        "context",
        "Landroid/content/Context;",
        "isNativeAvailable",
        "",
        "()Z",
        "isNativeAvailable$delegate",
        "Lkotlin/Lazy;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/multiplayer/MultiplayerController$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(Landroid/content/Context;)Lcom/pymcl/multiplayer/MultiplayerController;
    .locals 5
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-static {}, Lcom/pymcl/multiplayer/MultiplayerController;->access$getInstance$cp()Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v0

    if-nez v0, :cond_1

    monitor-enter p0

    .line 169
    const/4 v0, 0x0

    .line 78
    .local v0, "$i$a$-synchronized-MultiplayerController$Companion$get$1":I
    :try_start_0
    invoke-static {}, Lcom/pymcl/multiplayer/MultiplayerController;->access$getInstance$cp()Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getApplicationContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/pymcl/multiplayer/MultiplayerController;-><init>(Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v1

    .line 169
    .local v2, "it":Lcom/pymcl/multiplayer/MultiplayerController;
    const/4 v3, 0x0

    .line 78
    .local v3, "$i$a$-also-MultiplayerController$Companion$get$1$1":I
    sget-object v4, Lcom/pymcl/multiplayer/MultiplayerController;->Companion:Lcom/pymcl/multiplayer/MultiplayerController$Companion;

    invoke-static {v2}, Lcom/pymcl/multiplayer/MultiplayerController;->access$setInstance$cp(Lcom/pymcl/multiplayer/MultiplayerController;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-MultiplayerController$Companion$get$1":I
    .end local v2    # "it":Lcom/pymcl/multiplayer/MultiplayerController;
    .end local v3    # "$i$a$-also-MultiplayerController$Companion$get$1$1":I
    :cond_0
    monitor-exit p0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final getDEFAULT_EXTRA_NODES()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 76
    invoke-static {}, Lcom/pymcl/multiplayer/MultiplayerController;->access$getDEFAULT_EXTRA_NODES$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final isNativeAvailable()Z
    .locals 1

    .line 79
    invoke-static {}, Lcom/pymcl/multiplayer/MultiplayerController;->access$isNativeAvailable$delegate$cp()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
