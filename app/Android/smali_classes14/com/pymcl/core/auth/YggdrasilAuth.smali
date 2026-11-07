.class public final Lcom/pymcl/core/auth/YggdrasilAuth;
.super Ljava/lang/Object;
.source "Auth.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/auth/YggdrasilAuth$Companion;,
        Lcom/pymcl/core/auth/YggdrasilAuth$Profile;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAuth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Auth.kt\ncom/pymcl/core/auth/YggdrasilAuth\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n1#2:188\n777#3:189\n873#3,2:190\n1739#3:192\n1814#3,3:193\n2945#3,3:196\n*S KotlinDebug\n*F\n+ 1 Auth.kt\ncom/pymcl/core/auth/YggdrasilAuth\n*L\n117#1:189\n117#1:190,2\n117#1:192\n117#1:193,3\n151#1:196,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007JF\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0016\u0008\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\nJ4\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u0002`\u001cH\u0002J$\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/pymcl/core/auth/YggdrasilAuth;",
        "",
        "http",
        "Lcom/pymcl/core/net/Http;",
        "accountStore",
        "Lcom/pymcl/core/account/AccountStore;",
        "<init>",
        "(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/account/AccountStore;)V",
        "authenticate",
        "",
        "Lcom/pymcl/core/account/Account;",
        "api",
        "",
        "username",
        "password",
        "type",
        "extra",
        "",
        "refresh",
        "acc",
        "validate",
        "",
        "diagnoseRevocation",
        "Lcom/pymcl/core/auth/AuthException;",
        "httpStatus",
        "",
        "o",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "loginNide8",
        "serverIdOrLink",
        "Companion",
        "Profile",
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


# static fields
.field public static final Companion:Lcom/pymcl/core/auth/YggdrasilAuth$Companion;

.field public static final LITTLESKIN:Ljava/lang/String; = "https://littleskin.cn/api/yggdrasil"

.field public static final NIDE8_API:Ljava/lang/String; = "https://auth.mc-user.com:233/"

.field private static final PRESETS:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final UNBOUND:Ljava/lang/String; = "token_unbound"


# instance fields
.field private final accountStore:Lcom/pymcl/core/account/AccountStore;

.field private final http:Lcom/pymcl/core/net/Http;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/core/auth/YggdrasilAuth$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/auth/YggdrasilAuth$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/auth/YggdrasilAuth;->Companion:Lcom/pymcl/core/auth/YggdrasilAuth$Companion;

    .line 95
    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "Little Skin"

    const-string v2, "https://littleskin.cn/api/yggdrasil"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/auth/YggdrasilAuth;->PRESETS:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/account/AccountStore;)V
    .locals 1
    .param p1, "http"    # Lcom/pymcl/core/net/Http;
    .param p2, "accountStore"    # Lcom/pymcl/core/account/AccountStore;

    const-string v0, "http"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/auth/YggdrasilAuth;->http:Lcom/pymcl/core/net/Http;

    iput-object p2, p0, Lcom/pymcl/core/auth/YggdrasilAuth;->accountStore:Lcom/pymcl/core/account/AccountStore;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/account/AccountStore;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 92
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/pymcl/core/auth/YggdrasilAuth;-><init>(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/account/AccountStore;)V

    return-void
.end method

.method public static final synthetic access$getPRESETS$cp()Ljava/util/LinkedHashMap;
    .locals 1

    .line 92
    sget-object v0, Lcom/pymcl/core/auth/YggdrasilAuth;->PRESETS:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public static synthetic authenticate$default(Lcom/pymcl/core/auth/YggdrasilAuth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;
    .locals 6

    .line 105
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    const-string p4, "authlib"

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p5

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/core/auth/YggdrasilAuth;->authenticate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final diagnoseRevocation(Lcom/pymcl/core/account/Account;ILjava/util/Map;)Lcom/pymcl/core/auth/AuthException;
    .locals 18
    .param p1, "acc"    # Lcom/pymcl/core/account/Account;
    .param p2, "httpStatus"    # I
    .param p3, "o"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/account/Account;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pymcl/core/auth/AuthException;"
        }
    .end annotation

    .line 146
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    sget-object v0, Lcom/pymcl/core/auth/TokenRevocation;->INSTANCE:Lcom/pymcl/core/auth/TokenRevocation;

    const-string v4, "error"

    invoke-static {v3, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    if-nez v4, :cond_0

    move-object v4, v5

    :cond_0
    const-string v6, "errorMessage"

    invoke-static {v3, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_0

    :cond_1
    move-object v5, v6

    :goto_0
    move/from16 v6, p2

    invoke-virtual {v0, v6, v4, v5}, Lcom/pymcl/core/auth/TokenRevocation;->isRevocationLike(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const/4 v4, 0x0

    if-nez v0, :cond_2

    return-object v4

    .line 147
    :cond_2
    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    sget-object v5, Lcom/pymcl/core/account/AccountType;->AUTHLIB:Lcom/pymcl/core/account/AccountType;

    if-eq v0, v5, :cond_3

    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    sget-object v5, Lcom/pymcl/core/account/AccountType;->NIDE8:Lcom/pymcl/core/account/AccountType;

    if-eq v0, v5, :cond_3

    return-object v4

    .line 148
    :cond_3
    iget-object v0, v1, Lcom/pymcl/core/auth/YggdrasilAuth;->accountStore:Lcom/pymcl/core/account/AccountStore;

    if-nez v0, :cond_4

    sget-object v0, Lcom/pymcl/core/account/AccountStore;->Companion:Lcom/pymcl/core/account/AccountStore$Companion;

    invoke-virtual {v0}, Lcom/pymcl/core/account/AccountStore$Companion;->getLastInstance()Lcom/pymcl/core/account/AccountStore;

    move-result-object v0

    if-nez v0, :cond_4

    return-object v4

    :cond_4
    move-object v5, v0

    .line 149
    .local v5, "store":Lcom/pymcl/core/account/AccountStore;
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/core/auth/YggdrasilAuth;

    .line 188
    .local v0, "$this$diagnoseRevocation_u24lambda_u240":Lcom/pymcl/core/auth/YggdrasilAuth;
    const/4 v7, 0x0

    .line 149
    .local v7, "$i$a$-runCatching-YggdrasilAuth$diagnoseRevocation$all$1":I
    invoke-virtual {v5}, Lcom/pymcl/core/account/AccountStore;->list()Ljava/util/List;

    move-result-object v8

    .end local v0    # "$this$diagnoseRevocation_u24lambda_u240":Lcom/pymcl/core/auth/YggdrasilAuth;
    .end local v7    # "$i$a$-runCatching-YggdrasilAuth$diagnoseRevocation$all$1":I
    invoke-static {v8}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move-object v0, v7

    :cond_5
    move-object v7, v0

    check-cast v7, Ljava/util/List;

    .line 150
    .local v7, "all":Ljava/util/List;
    sget-object v0, Lcom/pymcl/core/auth/TokenRevocation;->INSTANCE:Lcom/pymcl/core/auth/TokenRevocation;

    invoke-virtual {v0, v2, v7}, Lcom/pymcl/core/auth/TokenRevocation;->boundSibling(Lcom/pymcl/core/account/Account;Ljava/util/List;)Lcom/pymcl/core/account/Account;

    move-result-object v0

    if-nez v0, :cond_6

    return-object v4

    :cond_6
    move-object v8, v0

    .line 151
    .local v8, "sibling":Lcom/pymcl/core/account/Account;
    move-object v0, v7

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$none$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 196
    .local v9, "$i$f$none":I
    instance-of v10, v0, Ljava/util/Collection;

    const/4 v11, 0x0

    if-eqz v10, :cond_7

    move-object v10, v0

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_7

    move-object/from16 v16, v4

    const/4 v12, 0x1

    const/16 v17, 0x1

    goto :goto_3

    .line 197
    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .local v13, "element$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Lcom/pymcl/core/account/Account;

    .local v14, "it":Lcom/pymcl/core/account/Account;
    const/4 v15, 0x0

    .line 151
    .local v15, "$i$a$-none-YggdrasilAuth$diagnoseRevocation$1":I
    move-object/from16 v16, v4

    invoke-virtual {v14}, Lcom/pymcl/core/account/Account;->getKey()Ljava/lang/String;

    move-result-object v4

    const/16 v17, 0x1

    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getKey()Ljava/lang/String;

    move-result-object v12

    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 197
    .end local v14    # "it":Lcom/pymcl/core/account/Account;
    .end local v15    # "$i$a$-none-YggdrasilAuth$diagnoseRevocation$1":I
    if-eqz v4, :cond_8

    move v12, v11

    goto :goto_3

    :cond_8
    move-object/from16 v4, v16

    goto :goto_2

    .line 198
    .end local v13    # "element$iv":Ljava/lang/Object;
    :cond_9
    move-object/from16 v16, v4

    const/16 v17, 0x1

    move/from16 v12, v17

    .line 151
    .end local v0    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$none":I
    :goto_3
    if-eqz v12, :cond_a

    return-object v16

    .line 152
    :cond_a
    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    const-string v4, "token_revoked"

    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-interface {v0, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    const/16 v4, 0x3e8

    int-to-long v12, v4

    div-long/2addr v9, v12

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-string v9, "token_revoked_at"

    invoke-interface {v0, v9, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    const-string v4, "token_revoked_by"

    invoke-virtual {v8}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/core/auth/YggdrasilAuth;

    .line 188
    .local v0, "$this$diagnoseRevocation_u24lambda_u242":Lcom/pymcl/core/auth/YggdrasilAuth;
    const/4 v4, 0x0

    .line 155
    .local v4, "$i$a$-runCatching-YggdrasilAuth$diagnoseRevocation$2":I
    invoke-virtual {v5, v2, v11}, Lcom/pymcl/core/account/AccountStore;->upsert(Lcom/pymcl/core/account/Account;Z)V

    .end local v0    # "$this$diagnoseRevocation_u24lambda_u242":Lcom/pymcl/core/auth/YggdrasilAuth;
    .end local v4    # "$i$a$-runCatching-YggdrasilAuth$diagnoseRevocation$2":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    :goto_4
    new-instance v0, Lcom/pymcl/core/auth/AuthException;

    sget-object v4, Lcom/pymcl/core/auth/TokenRevocation;->INSTANCE:Lcom/pymcl/core/auth/TokenRevocation;

    invoke-virtual {v8}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/pymcl/core/auth/TokenRevocation;->formatMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v9, "token_revoked_by_binding"

    invoke-direct {v0, v4, v9}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final authenticate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;
    .locals 35
    .param p1, "api"    # Ljava/lang/String;
    .param p2, "username"    # Ljava/lang/String;
    .param p3, "password"    # Ljava/lang/String;
    .param p4, "type"    # Ljava/lang/String;
    .param p5, "extra"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/pymcl/core/account/Account;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    const-string v7, "api"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "username"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "password"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "type"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "extra"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    sget-object v10, Lcom/pymcl/core/auth/YggdrasilAuth;->Companion:Lcom/pymcl/core/auth/YggdrasilAuth$Companion;

    invoke-virtual {v10, v2}, Lcom/pymcl/core/auth/YggdrasilAuth$Companion;->normalizeApi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .local v10, "base":Ljava/lang/String;
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v12

    const-string v11, "toString(...)"

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v16, 0x4

    const/16 v17, 0x0

    const-string v13, "-"

    const-string v14, ""

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 107
    .local v11, "ct":Ljava/lang/String;
    iget-object v12, v1, Lcom/pymcl/core/auth/YggdrasilAuth;->http:Lcom/pymcl/core/net/Http;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "/authserver/authenticate"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    sget-object v14, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v15, 0x5

    new-array v1, v15, [Lkotlin/Pair;

    const/4 v15, 0x2

    move-object/from16 v17, v1

    new-array v1, v15, [Lkotlin/Pair;

    move/from16 v18, v15

    const-string v15, "Minecraft"

    move-object/from16 v19, v1

    const-string v1, "name"

    invoke-static {v1, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v15

    move-object/from16 v20, v15

    const/4 v15, 0x0

    aput-object v20, v19, v15

    const-wide/16 v20, 0x1

    move/from16 v22, v15

    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    const-string v2, "version"

    invoke-static {v2, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v20, 0x1

    invoke-static/range {v20 .. v20}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    aput-object v2, v19, v20

    invoke-static/range {v19 .. v19}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    move-object/from16 v19, v12

    const-string v12, "agent"

    invoke-static {v12, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v17, v22

    invoke-static {v8, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v17, v20

    invoke-static {v0, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v17, v18

    const-string v2, "clientToken"

    invoke-static {v2, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v21, 0x3

    aput-object v0, v17, v21

    const-string v0, "requestUser"

    invoke-static {v0, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v23, 0x4

    aput-object v0, v17, v23

    invoke-static/range {v17 .. v17}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/4 v12, 0x0

    move/from16 v4, v18

    move-object/from16 v18, v11

    move v11, v4

    move/from16 v4, v22

    .end local v11    # "ct":Ljava/lang/String;
    .local v18, "ct":Ljava/lang/String;
    invoke-static {v14, v0, v4, v11, v12}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    const/16 v17, 0x5

    move/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v24, v15

    const/4 v15, 0x0

    move-object/from16 v12, v19

    move/from16 v19, v11

    move-object/from16 v11, v24

    invoke-static/range {v12 .. v17}, Lcom/pymcl/core/net/Http;->postJson$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v12

    .line 108
    .local v12, "r":Lcom/pymcl/core/net/HttpResponse;
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/core/auth/YggdrasilAuth;

    .line 188
    .local v0, "$this$authenticate_u24lambda_u240":Lcom/pymcl/core/auth/YggdrasilAuth;
    const/4 v13, 0x0

    .line 108
    .local v13, "$i$a$-runCatching-YggdrasilAuth$authenticate$o$1":I
    sget-object v14, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v12}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    .end local v0    # "$this$authenticate_u24lambda_u240":Lcom/pymcl/core/auth/YggdrasilAuth;
    .end local v13    # "$i$a$-runCatching-YggdrasilAuth$authenticate$o$1":I
    invoke-static {v14}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v13, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    new-array v13, v4, [Lkotlin/Pair;

    invoke-static {v13}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v13

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    move-object v0, v13

    :cond_0
    check-cast v0, Ljava/util/Map;

    .line 109
    .local v0, "o":Ljava/util/Map;
    invoke-virtual {v12}, Lcom/pymcl/core/net/HttpResponse;->getOk()Z

    move-result v13

    if-nez v13, :cond_3

    new-instance v1, Lcom/pymcl/core/auth/AuthException;

    const-string v2, "errorMessage"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {v12}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u767b\u5f55\u5931\u8d25 HTTP "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    const-string v4, "error"

    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    const-string v4, ""

    :cond_2
    invoke-direct {v1, v2, v4}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 110
    :cond_3
    const-string v13, "accessToken"

    invoke-static {v0, v13}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_d

    .line 111
    .local v13, "tok":Ljava/lang/String;
    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    move-object/from16 v2, v18

    .line 112
    .local v2, "cto":Ljava/lang/String;
    :cond_4
    const-string v14, "selectedProfile"

    invoke-static {v0, v14}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    .line 113
    .local v14, "selected":Ljava/util/Map;
    if-eqz v14, :cond_5

    move-object v15, v14

    .line 188
    .local v15, "it":Ljava/util/Map;
    const/16 v16, 0x0

    .line 113
    .local v16, "$i$a$-let-YggdrasilAuth$authenticate$profs$1":I
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    .end local v15    # "it":Ljava/util/Map;
    .end local v16    # "$i$a$-let-YggdrasilAuth$authenticate$profs$1":I
    if-nez v15, :cond_6

    :cond_5
    const-string v15, "availableProfiles"

    invoke-static {v0, v15}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v15

    invoke-static {v15}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v15

    .line 114
    .local v15, "profs":Ljava/util/List;
    :cond_6
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_c

    .line 117
    move-object/from16 v16, v15

    check-cast v16, Ljava/lang/Iterable;

    .local v16, "$this$filter$iv":Ljava/lang/Iterable;
    const/16 v17, 0x0

    .line 189
    .local v17, "$i$f$filter":I
    new-instance v24, Ljava/util/ArrayList;

    invoke-direct/range {v24 .. v24}, Ljava/util/ArrayList;-><init>()V

    check-cast v24, Ljava/util/Collection;

    .local v24, "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 v25, v16

    .local v25, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    move-object/from16 v26, v24

    .end local v24    # "destination$iv$iv":Ljava/util/Collection;
    .local v26, "destination$iv$iv":Ljava/util/Collection;
    const/16 v24, 0x0

    .line 190
    .local v24, "$i$f$filterTo":I
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v27

    :goto_1
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->hasNext()Z

    move-result v28

    move/from16 v29, v4

    const-string v4, "id"

    if-eqz v28, :cond_9

    move-object/from16 v28, v0

    .end local v0    # "o":Ljava/util/Map;
    .local v28, "o":Ljava/util/Map;
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v30, v12

    .end local v12    # "r":Lcom/pymcl/core/net/HttpResponse;
    .local v0, "element$iv$iv":Ljava/lang/Object;
    .local v30, "r":Lcom/pymcl/core/net/HttpResponse;
    move-object v12, v0

    check-cast v12, Ljava/util/Map;

    .local v12, "it":Ljava/util/Map;
    const/16 v31, 0x0

    .line 117
    .local v31, "$i$a$-filter-YggdrasilAuth$authenticate$1":I
    invoke-static {v12, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    move/from16 v4, v20

    goto :goto_2

    :cond_7
    move/from16 v4, v29

    .line 190
    .end local v12    # "it":Ljava/util/Map;
    .end local v31    # "$i$a$-filter-YggdrasilAuth$authenticate$1":I
    :goto_2
    if-eqz v4, :cond_8

    move-object/from16 v12, v26

    .end local v26    # "destination$iv$iv":Ljava/util/Collection;
    .local v12, "destination$iv$iv":Ljava/util/Collection;
    invoke-interface {v12, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .end local v12    # "destination$iv$iv":Ljava/util/Collection;
    .restart local v26    # "destination$iv$iv":Ljava/util/Collection;
    :cond_8
    move-object/from16 v12, v26

    .end local v26    # "destination$iv$iv":Ljava/util/Collection;
    .restart local v12    # "destination$iv$iv":Ljava/util/Collection;
    :goto_3
    move-object/from16 v0, v28

    move/from16 v4, v29

    move-object/from16 v12, v30

    goto :goto_1

    .line 191
    .end local v28    # "o":Ljava/util/Map;
    .end local v30    # "r":Lcom/pymcl/core/net/HttpResponse;
    .local v0, "o":Ljava/util/Map;
    .local v12, "r":Lcom/pymcl/core/net/HttpResponse;
    .restart local v26    # "destination$iv$iv":Ljava/util/Collection;
    :cond_9
    move-object/from16 v28, v0

    move-object/from16 v30, v12

    move-object/from16 v12, v26

    .end local v0    # "o":Ljava/util/Map;
    .end local v12    # "r":Lcom/pymcl/core/net/HttpResponse;
    .end local v24    # "$i$f$filterTo":I
    .end local v25    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v26    # "destination$iv$iv":Ljava/util/Collection;
    .restart local v28    # "o":Ljava/util/Map;
    .restart local v30    # "r":Lcom/pymcl/core/net/HttpResponse;
    move-object v0, v12

    check-cast v0, Ljava/util/List;

    .line 189
    nop

    .end local v16    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v17    # "$i$f$filter":I
    check-cast v0, Ljava/lang/Iterable;

    .line 117
    nop

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 192
    .local v12, "$i$f$map":I
    move/from16 v16, v12

    .end local v12    # "$i$f$map":I
    .local v16, "$i$f$map":I
    new-instance v12, Ljava/util/ArrayList;

    move-object/from16 v17, v14

    .end local v14    # "selected":Ljava/util/Map;
    .local v17, "selected":Ljava/util/Map;
    const/16 v14, 0xa

    invoke-static {v0, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v12, v14}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v12, Ljava/util/Collection;

    .local v12, "destination$iv$iv":Ljava/util/Collection;
    move-object v14, v0

    .local v14, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v24, 0x0

    .line 193
    .local v24, "$i$f$mapTo":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v25

    :goto_4
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_b

    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    .line 194
    .local v26, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v27, v0

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .local v27, "$this$map$iv":Ljava/lang/Iterable;
    move-object/from16 v0, v26

    check-cast v0, Ljava/util/Map;

    .local v0, "p":Ljava/util/Map;
    const/16 v31, 0x0

    .line 117
    .local v31, "$i$a$-map-YggdrasilAuth$authenticate$2":I
    move-object/from16 v32, v14

    .end local v14    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .local v32, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x7

    new-array v14, v14, [Lkotlin/Pair;

    invoke-static {v9, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v33

    aput-object v33, v14, v29

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v14, v20

    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v5}, Lcom/pymcl/core/account/AccountsKt;->dashedUuid(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v33, v0

    .end local v0    # "p":Ljava/util/Map;
    .local v33, "p":Ljava/util/Map;
    const-string v0, "uuid"

    invoke-static {v0, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v14, v19

    const-string v0, "access_token"

    invoke-static {v0, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v14, v21

    const-string v0, "client_token"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v14, v23

    invoke-static {v7, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v14, v22

    const/4 v0, 0x6

    invoke-static {v8, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v14, v0

    invoke-static {v14}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    move-object v5, v0

    .local v5, "it":Ljava/util/Map;
    const/4 v14, 0x0

    .line 118
    .local v14, "$i$a$-also-YggdrasilAuth$authenticate$2$1":I
    invoke-interface {v5, v6}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    if-nez v17, :cond_a

    move-object/from16 v34, v1

    const-string v1, "token_unbound"

    invoke-interface {v5, v1, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_a
    move-object/from16 v34, v1

    .line 117
    .end local v5    # "it":Ljava/util/Map;
    .end local v14    # "$i$a$-also-YggdrasilAuth$authenticate$2$1":I
    :goto_5
    new-instance v1, Lcom/pymcl/core/account/Account;

    invoke-direct {v1, v0}, Lcom/pymcl/core/account/Account;-><init>(Ljava/util/Map;)V

    .line 118
    nop

    .line 194
    .end local v31    # "$i$a$-map-YggdrasilAuth$authenticate$2":I
    .end local v33    # "p":Ljava/util/Map;
    invoke-interface {v12, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v5, p4

    move-object/from16 v0, v27

    move-object/from16 v14, v32

    move-object/from16 v1, v34

    goto :goto_4

    .line 195
    .end local v26    # "item$iv$iv":Ljava/lang/Object;
    .end local v27    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v32    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    .local v14, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    :cond_b
    move-object/from16 v27, v0

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v12    # "destination$iv$iv":Ljava/util/Collection;
    .end local v14    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v24    # "$i$f$mapTo":I
    .restart local v27    # "$this$map$iv":Ljava/lang/Iterable;
    move-object v0, v12

    check-cast v0, Ljava/util/List;

    .line 192
    nop

    .line 117
    .end local v16    # "$i$f$map":I
    .end local v27    # "$this$map$iv":Ljava/lang/Iterable;
    return-object v0

    .line 114
    .end local v17    # "selected":Ljava/util/Map;
    .end local v28    # "o":Ljava/util/Map;
    .end local v30    # "r":Lcom/pymcl/core/net/HttpResponse;
    .local v0, "o":Ljava/util/Map;
    .local v12, "r":Lcom/pymcl/core/net/HttpResponse;
    .local v14, "selected":Ljava/util/Map;
    :cond_c
    move-object/from16 v28, v0

    .end local v0    # "o":Ljava/util/Map;
    .restart local v28    # "o":Ljava/util/Map;
    new-instance v0, Lcom/pymcl/core/auth/AuthException;

    const-string v1, "\u8be5\u8d26\u53f7\u4e0b\u6ca1\u6709\u89d2\u8272"

    move/from16 v11, v19

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v11, v4}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    .line 110
    .end local v2    # "cto":Ljava/lang/String;
    .end local v13    # "tok":Ljava/lang/String;
    .end local v14    # "selected":Ljava/util/Map;
    .end local v15    # "profs":Ljava/util/List;
    .end local v28    # "o":Ljava/util/Map;
    .restart local v0    # "o":Ljava/util/Map;
    :cond_d
    move-object/from16 v28, v0

    move/from16 v11, v19

    const/4 v4, 0x0

    .end local v0    # "o":Ljava/util/Map;
    .restart local v28    # "o":Ljava/util/Map;
    new-instance v0, Lcom/pymcl/core/auth/AuthException;

    const-string v1, "\u767b\u5f55\u5931\u8d25\uff1a\u670d\u52a1\u5668\u6ca1\u6709\u8fd4\u56de\u4ee4\u724c"

    invoke-direct {v0, v1, v4, v11, v4}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final loginNide8(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .param p1, "serverIdOrLink"    # Ljava/lang/String;
    .param p2, "username"    # Ljava/lang/String;
    .param p3, "password"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/account/Account;",
            ">;"
        }
    .end annotation

    const-string v0, "serverIdOrLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "username"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "password"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    sget-object v0, Lcom/pymcl/core/auth/YggdrasilAuth;->Companion:Lcom/pymcl/core/auth/YggdrasilAuth$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/core/auth/YggdrasilAuth$Companion;->nide8Id(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .local v0, "id":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://auth.mc-user.com:233/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v1, "nide8_id"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const-string v6, "nide8"

    move-object v2, p0

    move-object v4, p2

    move-object v5, p3

    .end local p2    # "username":Ljava/lang/String;
    .end local p3    # "password":Ljava/lang/String;
    .local v4, "username":Ljava/lang/String;
    .local v5, "password":Ljava/lang/String;
    invoke-virtual/range {v2 .. v7}, Lcom/pymcl/core/auth/YggdrasilAuth;->authenticate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    move-result-object p2

    return-object p2
.end method

.method public final refresh(Lcom/pymcl/core/account/Account;)Lcom/pymcl/core/account/Account;
    .locals 20
    .param p1, "acc"    # Lcom/pymcl/core/account/Account;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "acc"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    const-string v3, "token_revoked"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 123
    sget-object v0, Lcom/pymcl/core/auth/YggdrasilAuth;->Companion:Lcom/pymcl/core/auth/YggdrasilAuth$Companion;

    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getApi()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/pymcl/core/auth/YggdrasilAuth$Companion;->normalizeApi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 124
    .local v5, "base":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    const-string v6, "token_unbound"

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    .line 125
    .local v7, "unbound":Z
    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/Pair;

    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getAccessToken()Ljava/lang/String;

    move-result-object v8

    const-string v9, "accessToken"

    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/4 v10, 0x0

    aput-object v8, v0, v10

    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getClientToken()Ljava/lang/String;

    move-result-object v8

    const-string v11, "clientToken"

    invoke-static {v11, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v0, v3

    const-string v8, "requestUser"

    invoke-static {v8, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v8, 0x2

    aput-object v4, v0, v8

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    .line 126
    .local v4, "req":Ljava/util/Map;
    const-string v12, "selectedProfile"

    const-string v13, "name"

    if-eqz v7, :cond_0

    new-array v0, v8, [Lkotlin/Pair;

    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getUuid()Ljava/lang/String;

    move-result-object v14

    const/16 v18, 0x4

    const/16 v19, 0x0

    const-string v15, "-"

    const-string v16, ""

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    const-string v15, "id"

    invoke-static {v15, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    aput-object v14, v0, v10

    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    aput-object v14, v0, v3

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v4, v12, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    :cond_0
    iget-object v14, v1, Lcom/pymcl/core/auth/YggdrasilAuth;->http:Lcom/pymcl/core/net/Http;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/authserver/refresh"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v3, 0x0

    invoke-static {v0, v4, v10, v8, v3}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Lcom/pymcl/core/net/Http;->postJson$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v14

    .line 128
    .local v14, "r":Lcom/pymcl/core/net/HttpResponse;
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/core/auth/YggdrasilAuth;

    .line 188
    .local v0, "$this$refresh_u24lambda_u240":Lcom/pymcl/core/auth/YggdrasilAuth;
    const/4 v15, 0x0

    .line 128
    .local v15, "$i$a$-runCatching-YggdrasilAuth$refresh$o$1":I
    sget-object v3, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v14}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .end local v0    # "$this$refresh_u24lambda_u240":Lcom/pymcl/core/auth/YggdrasilAuth;
    .end local v15    # "$i$a$-runCatching-YggdrasilAuth$refresh$o$1":I
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    new-array v3, v10, [Lkotlin/Pair;

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move-object v0, v3

    :cond_1
    check-cast v0, Ljava/util/Map;

    .line 129
    .local v0, "o":Ljava/util/Map;
    invoke-virtual {v14}, Lcom/pymcl/core/net/HttpResponse;->getOk()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v14}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v3

    invoke-direct {v1, v2, v3, v0}, Lcom/pymcl/core/auth/YggdrasilAuth;->diagnoseRevocation(Lcom/pymcl/core/account/Account;ILjava/util/Map;)Lcom/pymcl/core/auth/AuthException;

    move-result-object v3

    if-nez v3, :cond_4

    new-instance v3, Lcom/pymcl/core/auth/AuthException;

    const-string v6, "errorMessage"

    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    const-string v6, "\u5237\u65b0\u5931\u8d25\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55"

    :cond_2
    const-string v8, "error"

    invoke-static {v0, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_3

    const-string v8, ""

    :cond_3
    invoke-direct {v3, v6, v8}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    check-cast v3, Ljava/lang/Throwable;

    throw v3

    .line 130
    :cond_5
    invoke-static {v0, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 131
    .local v3, "tok":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v8

    invoke-static {v8}, Lcom/pymcl/core/util/JsonKt;->deepCopy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v9, v8

    .line 188
    .local v9, "it":Ljava/util/Map;
    const/4 v10, 0x0

    .line 131
    .local v10, "$i$a$-also-YggdrasilAuth$refresh$1":I
    const-string v15, "access_token"

    invoke-interface {v9, v15, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_6

    .line 188
    .local v11, "c":Ljava/lang/String;
    const/4 v15, 0x0

    .line 131
    .local v15, "$i$a$-let-YggdrasilAuth$refresh$1$1":I
    const-string v1, "client_token"

    invoke-interface {v9, v1, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .end local v11    # "c":Ljava/lang/String;
    .end local v15    # "$i$a$-let-YggdrasilAuth$refresh$1$1":I
    :cond_6
    if-eqz v7, :cond_7

    invoke-interface {v9, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, v12}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v1, v13}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 188
    .local v1, "n":Ljava/lang/String;
    const/4 v6, 0x0

    .line 132
    .local v6, "$i$a$-let-YggdrasilAuth$refresh$1$2":I
    invoke-interface {v9, v13, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .end local v1    # "n":Ljava/lang/String;
    .end local v6    # "$i$a$-let-YggdrasilAuth$refresh$1$2":I
    .end local v9    # "it":Ljava/util/Map;
    .end local v10    # "$i$a$-also-YggdrasilAuth$refresh$1":I
    :cond_7
    new-instance v1, Lcom/pymcl/core/account/Account;

    invoke-direct {v1, v8}, Lcom/pymcl/core/account/Account;-><init>(Ljava/util/Map;)V

    return-object v1

    .line 130
    .end local v3    # "tok":Ljava/lang/String;
    :cond_8
    new-instance v1, Lcom/pymcl/core/auth/AuthException;

    const-string v3, "\u5237\u65b0\u5931\u8d25\uff1a\u670d\u52a1\u5668\u6ca1\u6709\u8fd4\u56de\u4ee4\u724c\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55"

    const/4 v6, 0x0

    const/4 v8, 0x2

    invoke-direct {v1, v3, v6, v8, v6}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    .line 122
    .end local v0    # "o":Ljava/util/Map;
    .end local v4    # "req":Ljava/util/Map;
    .end local v5    # "base":Ljava/lang/String;
    .end local v7    # "unbound":Z
    .end local v14    # "r":Lcom/pymcl/core/net/HttpResponse;
    :cond_9
    new-instance v0, Lcom/pymcl/core/auth/AuthException;

    sget-object v1, Lcom/pymcl/core/auth/TokenRevocation;->INSTANCE:Lcom/pymcl/core/auth/TokenRevocation;

    invoke-virtual {v1, v2}, Lcom/pymcl/core/auth/TokenRevocation;->revokedMessage(Lcom/pymcl/core/account/Account;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "token_revoked_by_binding"

    invoke-direct {v0, v1, v3}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
.end method

.method public final validate(Lcom/pymcl/core/account/Account;)Z
    .locals 11
    .param p1, "acc"    # Lcom/pymcl/core/account/Account;

    const-string v0, "acc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    const-string v1, "token_unbound"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    const-string v4, "token_revoked"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 136
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/core/auth/YggdrasilAuth;

    .line 188
    .local v0, "$this$validate_u24lambda_u240":Lcom/pymcl/core/auth/YggdrasilAuth;
    const/4 v2, 0x0

    .line 136
    .local v2, "$i$a$-runCatching-YggdrasilAuth$validate$1":I
    iget-object v4, v0, Lcom/pymcl/core/auth/YggdrasilAuth;->http:Lcom/pymcl/core/net/Http;

    sget-object v5, Lcom/pymcl/core/auth/YggdrasilAuth;->Companion:Lcom/pymcl/core/auth/YggdrasilAuth$Companion;

    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getApi()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/pymcl/core/auth/YggdrasilAuth$Companion;->normalizeApi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/authserver/validate"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v7, 0x2

    new-array v8, v7, [Lkotlin/Pair;

    const-string v9, "accessToken"

    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getAccessToken()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v3

    const-string v9, "clientToken"

    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getClientToken()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v1

    invoke-static {v8}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v6, v8, v3, v7, v9}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/pymcl/core/net/Http;->postJson$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v4

    const/16 v5, 0xcc

    if-ne v4, v5, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v3

    .end local v0    # "$this$validate_u24lambda_u240":Lcom/pymcl/core/auth/YggdrasilAuth;
    .end local v2    # "$i$a$-runCatching-YggdrasilAuth$validate$1":I
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v0, v2

    :cond_1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    return v1
.end method
