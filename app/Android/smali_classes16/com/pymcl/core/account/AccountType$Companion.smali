.class public final Lcom/pymcl/core/account/AccountType$Companion;
.super Ljava/lang/Object;
.source "Accounts.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/account/AccountType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAccounts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Accounts.kt\ncom/pymcl/core/account/AccountType$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n296#2,2:130\n*S KotlinDebug\n*F\n+ 1 Accounts.kt\ncom/pymcl/core/account/AccountType$Companion\n*L\n25#1:130,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/pymcl/core/account/AccountType$Companion;",
        "",
        "<init>",
        "()V",
        "of",
        "Lcom/pymcl/core/account/AccountType;",
        "s",
        "",
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

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/core/account/AccountType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final of(Ljava/lang/String;)Lcom/pymcl/core/account/AccountType;
    .locals 7
    .param p1, "s"    # Ljava/lang/String;

    .line 25
    invoke-static {}, Lcom/pymcl/core/account/AccountType;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 130
    .local v1, "$i$f$firstOrNull":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/pymcl/core/account/AccountType;

    .local v4, "it":Lcom/pymcl/core/account/AccountType;
    const/4 v5, 0x0

    .line 25
    .local v5, "$i$a$-firstOrNull-AccountType$Companion$of$1":I
    invoke-virtual {v4}, Lcom/pymcl/core/account/AccountType;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 130
    .end local v4    # "it":Lcom/pymcl/core/account/AccountType;
    .end local v5    # "$i$a$-firstOrNull-AccountType$Companion$of$1":I
    if-eqz v4, :cond_0

    goto :goto_0

    .line 131
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_1
    const/4 v3, 0x0

    .line 25
    .end local v0    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull":I
    :goto_0
    check-cast v3, Lcom/pymcl/core/account/AccountType;

    if-nez v3, :cond_2

    sget-object v3, Lcom/pymcl/core/account/AccountType;->OFFLINE:Lcom/pymcl/core/account/AccountType;

    :cond_2
    return-object v3
.end method
