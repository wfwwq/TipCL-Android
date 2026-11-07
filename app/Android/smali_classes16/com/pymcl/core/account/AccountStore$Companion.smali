.class public final Lcom/pymcl/core/account/AccountStore$Companion;
.super Ljava/lang/Object;
.source "Accounts.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/account/AccountStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/pymcl/core/account/AccountStore$Companion;",
        "",
        "<init>",
        "()V",
        "ACTIVE_KEY",
        "",
        "lastInstance",
        "Lcom/pymcl/core/account/AccountStore;",
        "getLastInstance",
        "()Lcom/pymcl/core/account/AccountStore;",
        "setLastInstance",
        "(Lcom/pymcl/core/account/AccountStore;)V",
        "PyMCL-Android:core"
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

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/core/account/AccountStore$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLastInstance()Lcom/pymcl/core/account/AccountStore;
    .locals 1

    .line 83
    invoke-static {}, Lcom/pymcl/core/account/AccountStore;->access$getLastInstance$cp()Lcom/pymcl/core/account/AccountStore;

    move-result-object v0

    return-object v0
.end method

.method public final setLastInstance(Lcom/pymcl/core/account/AccountStore;)V
    .locals 0
    .param p1, "<set-?>"    # Lcom/pymcl/core/account/AccountStore;

    .line 83
    invoke-static {p1}, Lcom/pymcl/core/account/AccountStore;->access$setLastInstance$cp(Lcom/pymcl/core/account/AccountStore;)V

    return-void
.end method
