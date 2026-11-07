.class public final Lcom/pymcl/core/auth/TokenRevocation;
.super Ljava/lang/Object;
.source "TokenRevocation.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTokenRevocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenRevocation.kt\ncom/pymcl/core/auth/TokenRevocation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,70:1\n1#2:71\n1960#3,3:72\n1647#4,14:75\n*S KotlinDebug\n*F\n+ 1 TokenRevocation.kt\ncom/pymcl/core/auth/TokenRevocation\n*L\n43#1:72,3\n67#1:75,14\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0005J\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/pymcl/core/auth/TokenRevocation;",
        "",
        "<init>",
        "()V",
        "REVOKED",
        "",
        "REVOKED_AT",
        "REVOKED_BY",
        "CODE",
        "MESSAGE",
        "MESSAGE_NO_BY",
        "formatMessage",
        "sibling",
        "revokedMessage",
        "acc",
        "Lcom/pymcl/core/account/Account;",
        "isRevocationLike",
        "",
        "httpStatus",
        "",
        "error",
        "errorMessage",
        "boundSibling",
        "failed",
        "all",
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


# static fields
.field public static final CODE:Ljava/lang/String; = "token_revoked_by_binding"

.field public static final INSTANCE:Lcom/pymcl/core/auth/TokenRevocation;

.field public static final MESSAGE:Ljava/lang/String; = "\u8be5\u8d26\u53f7\u7684\u591a\u89d2\u8272\u5171\u4eab\u4ee4\u724c\u5df2\u5728\u7ed1\u5b9a\u89d2\u8272\u300c{0}\u300d\u65f6\u88ab\u670d\u52a1\u5668\u540a\u9500\uff08Yggdrasil \u4ee4\u724c\u4e00\u6b21\u53ea\u80fd\u7ed1\u5b9a\u4e00\u4e2a\u89d2\u8272\uff09\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55\u672c\u89d2\u8272"

.field public static final MESSAGE_NO_BY:Ljava/lang/String; = "\u8be5\u8d26\u53f7\u7684\u4ee4\u724c\u5df2\u88ab\u670d\u52a1\u5668\u540a\u9500\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55\u672c\u89d2\u8272"

.field public static final REVOKED:Ljava/lang/String; = "token_revoked"

.field public static final REVOKED_AT:Ljava/lang/String; = "token_revoked_at"

.field public static final REVOKED_BY:Ljava/lang/String; = "token_revoked_by"


# direct methods
.method public static synthetic $r8$lambda$BT2oeTH52rWA5wrhexuS58xkeFU(Lcom/pymcl/core/account/Account;Lcom/pymcl/core/account/Account;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/auth/TokenRevocation;->boundSibling$lambda$6(Lcom/pymcl/core/account/Account;Lcom/pymcl/core/account/Account;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$EU6kZ2OmEQWR6QYi0xg60HDyQYA(Lcom/pymcl/core/account/Account;Lcom/pymcl/core/account/Account;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/auth/TokenRevocation;->boundSibling$lambda$2(Lcom/pymcl/core/account/Account;Lcom/pymcl/core/account/Account;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$I6RntbAclOuIn07c6VjxPQ07JIc(Lcom/pymcl/core/account/Account;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/auth/TokenRevocation;->boundSibling$lambda$7(Lcom/pymcl/core/account/Account;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$KyT5FpYYWsCSytRGGYUF-b28SiE(Ljava/lang/String;Lcom/pymcl/core/account/Account;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/auth/TokenRevocation;->boundSibling$lambda$4(Ljava/lang/String;Lcom/pymcl/core/account/Account;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$PdcXPatYqnomPceUmbmntexyDVk(Ljava/lang/String;Lcom/pymcl/core/account/Account;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/auth/TokenRevocation;->boundSibling$lambda$5(Ljava/lang/String;Lcom/pymcl/core/account/Account;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$fkeuIxhmRPTJc7du6eIC4s0ATN4(Lcom/pymcl/core/account/Account;Lcom/pymcl/core/account/Account;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/auth/TokenRevocation;->boundSibling$lambda$3(Lcom/pymcl/core/account/Account;Lcom/pymcl/core/account/Account;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$iQr_BFmghyn0Ypv16ke5_Bp_Npk(Lcom/pymcl/core/account/Account;JLcom/pymcl/core/account/Account;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/core/auth/TokenRevocation;->boundSibling$lambda$8(Lcom/pymcl/core/account/Account;JLcom/pymcl/core/account/Account;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/auth/TokenRevocation;

    invoke-direct {v0}, Lcom/pymcl/core/auth/TokenRevocation;-><init>()V

    sput-object v0, Lcom/pymcl/core/auth/TokenRevocation;->INSTANCE:Lcom/pymcl/core/auth/TokenRevocation;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final boundSibling$lambda$2(Lcom/pymcl/core/account/Account;Lcom/pymcl/core/account/Account;)Z
    .locals 1
    .param p0, "$failed"    # Lcom/pymcl/core/account/Account;
    .param p1, "it"    # Lcom/pymcl/core/account/Account;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    if-eq p1, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static final boundSibling$lambda$3(Lcom/pymcl/core/account/Account;Lcom/pymcl/core/account/Account;)Z
    .locals 2
    .param p0, "$failed"    # Lcom/pymcl/core/account/Account;
    .param p1, "it"    # Lcom/pymcl/core/account/Account;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    invoke-virtual {p0}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    sget-object v1, Lcom/pymcl/core/account/AccountType;->AUTHLIB:Lcom/pymcl/core/account/AccountType;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    sget-object v1, Lcom/pymcl/core/account/AccountType;->NIDE8:Lcom/pymcl/core/account/AccountType;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static final boundSibling$lambda$4(Ljava/lang/String;Lcom/pymcl/core/account/Account;)Z
    .locals 2
    .param p0, "$api"    # Ljava/lang/String;
    .param p1, "it"    # Lcom/pymcl/core/account/Account;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    sget-object v0, Lcom/pymcl/core/auth/YggdrasilAuth;->Companion:Lcom/pymcl/core/auth/YggdrasilAuth$Companion;

    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getApi()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/auth/YggdrasilAuth$Companion;->normalizeApi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private static final boundSibling$lambda$5(Ljava/lang/String;Lcom/pymcl/core/account/Account;)Z
    .locals 2
    .param p0, "$user"    # Ljava/lang/String;
    .param p1, "it"    # Lcom/pymcl/core/account/Account;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    const-string v1, "username"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private static final boundSibling$lambda$6(Lcom/pymcl/core/account/Account;Lcom/pymcl/core/account/Account;)Z
    .locals 4
    .param p0, "$failed"    # Lcom/pymcl/core/account/Account;
    .param p1, "it"    # Lcom/pymcl/core/account/Account;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getUuid()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getUuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/pymcl/core/account/Account;->getUuid()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    return v1
.end method

.method private static final boundSibling$lambda$7(Lcom/pymcl/core/account/Account;)Z
    .locals 3
    .param p0, "it"    # Lcom/pymcl/core/account/Account;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {p0}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    const-string v1, "token_unbound"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    return v0
.end method

.method private static final boundSibling$lambda$8(Lcom/pymcl/core/account/Account;JLcom/pymcl/core/account/Account;)Z
    .locals 5
    .param p0, "$failed"    # Lcom/pymcl/core/account/Account;
    .param p1, "$failedUpdated"    # J
    .param p3, "it"    # Lcom/pymcl/core/account/Account;

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-virtual {p3}, Lcom/pymcl/core/account/Account;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p3}, Lcom/pymcl/core/account/Account;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/pymcl/core/account/Account;->getAccessToken()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p3}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    const-string v3, "updated_at"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_1

    :cond_1
    const-wide/16 v3, 0x0

    :goto_1
    cmp-long v0, v3, p1

    if-lez v0, :cond_3

    :cond_2
    goto :goto_2

    :cond_3
    move v1, v2

    :goto_2
    return v1
.end method

.method public static synthetic isRevocationLike$default(Lcom/pymcl/core/auth/TokenRevocation;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Z
    .locals 0

    .line 41
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const-string p3, ""

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/core/auth/TokenRevocation;->isRevocationLike(ILjava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final boundSibling(Lcom/pymcl/core/account/Account;Ljava/util/List;)Lcom/pymcl/core/account/Account;
    .locals 18
    .param p1, "failed"    # Lcom/pymcl/core/account/Account;
    .param p2, "all"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/account/Account;",
            "Ljava/util/List<",
            "Lcom/pymcl/core/account/Account;",
            ">;)",
            "Lcom/pymcl/core/account/Account;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "failed"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "all"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {v0}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v2

    const-string v3, "username"

    invoke-static {v2, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_d

    move-object v4, v2

    .line 71
    .local v4, "it":Ljava/lang/String;
    const/4 v5, 0x0

    .line 56
    .local v5, "$i$a$-takeIf-TokenRevocation$boundSibling$user$1":I
    move-object v6, v4

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-lez v6, :cond_0

    move v6, v7

    goto :goto_0

    :cond_0
    move v6, v8

    .end local v4    # "it":Ljava/lang/String;
    .end local v5    # "$i$a$-takeIf-TokenRevocation$boundSibling$user$1":I
    :goto_0
    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    if-nez v2, :cond_2

    goto/16 :goto_8

    .line 57
    .local v2, "user":Ljava/lang/String;
    :cond_2
    sget-object v4, Lcom/pymcl/core/auth/YggdrasilAuth;->Companion:Lcom/pymcl/core/auth/YggdrasilAuth$Companion;

    invoke-virtual {v0}, Lcom/pymcl/core/account/Account;->getApi()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/pymcl/core/auth/YggdrasilAuth$Companion;->normalizeApi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object v5, v4

    .line 71
    .local v5, "it":Ljava/lang/String;
    const/4 v6, 0x0

    .line 57
    .local v6, "$i$a$-takeIf-TokenRevocation$boundSibling$api$1":I
    move-object v9, v5

    check-cast v9, Ljava/lang/CharSequence;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-lez v9, :cond_3

    goto :goto_2

    :cond_3
    move v7, v8

    .end local v5    # "it":Ljava/lang/String;
    .end local v6    # "$i$a$-takeIf-TokenRevocation$boundSibling$api$1":I
    :goto_2
    if-eqz v7, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v3

    :goto_3
    if-nez v4, :cond_5

    return-object v3

    .line 58
    .local v4, "api":Ljava/lang/String;
    :cond_5
    invoke-virtual {v0}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v5

    const-string v6, "updated_at"

    invoke-static {v5, v6}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    goto :goto_4

    :cond_6
    const-wide/16 v9, 0x0

    .line 59
    .local v9, "failedUpdated":J
    :goto_4
    move-object v5, v1

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object v5

    .line 60
    new-instance v11, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda0;

    invoke-direct {v11, v0}, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/core/account/Account;)V

    invoke-static {v5, v11}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v5

    .line 61
    new-instance v11, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda1;

    invoke-direct {v11, v0}, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/core/account/Account;)V

    invoke-static {v5, v11}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v5

    .line 62
    new-instance v11, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda2;

    invoke-direct {v11, v4}, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda2;-><init>(Ljava/lang/String;)V

    invoke-static {v5, v11}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v5

    .line 63
    new-instance v11, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda3;

    invoke-direct {v11, v2}, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda3;-><init>(Ljava/lang/String;)V

    invoke-static {v5, v11}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v5

    .line 64
    new-instance v11, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda4;

    invoke-direct {v11, v0}, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda4;-><init>(Lcom/pymcl/core/account/Account;)V

    invoke-static {v5, v11}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v5

    .line 65
    new-instance v11, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda5;

    invoke-direct {v11}, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda5;-><init>()V

    invoke-static {v5, v11}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v5

    .line 66
    new-instance v11, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda6;

    invoke-direct {v11, v0, v9, v10}, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda6;-><init>(Lcom/pymcl/core/account/Account;J)V

    invoke-static {v5, v11}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v5

    .line 67
    nop

    .local v5, "$this$maxByOrNull$iv":Lkotlin/sequences/Sequence;
    const/4 v11, 0x0

    .line 75
    .local v11, "$i$f$maxByOrNull":I
    invoke-interface {v5}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .line 76
    .local v12, "iterator$iv":Ljava/util/Iterator;
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-nez v13, :cond_7

    goto :goto_7

    .line 77
    :cond_7
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 78
    .local v3, "maxElem$iv":Ljava/lang/Object;
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-nez v13, :cond_8

    goto :goto_7

    .line 79
    :cond_8
    move-object v13, v3

    check-cast v13, Lcom/pymcl/core/account/Account;

    .local v13, "it":Lcom/pymcl/core/account/Account;
    const/4 v14, 0x0

    .line 67
    .local v14, "$i$a$-maxByOrNull-TokenRevocation$boundSibling$8":I
    invoke-virtual {v13}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v15

    invoke-static {v15, v6}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v15

    if-eqz v15, :cond_9

    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    goto :goto_5

    :cond_9
    const-wide/16 v15, 0x0

    .line 79
    .end local v13    # "it":Lcom/pymcl/core/account/Account;
    .end local v14    # "$i$a$-maxByOrNull-TokenRevocation$boundSibling$8":I
    :goto_5
    nop

    .line 81
    .local v15, "maxValue$iv":J
    :cond_a
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 82
    .local v13, "e$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Lcom/pymcl/core/account/Account;

    .local v14, "it":Lcom/pymcl/core/account/Account;
    const/16 v17, 0x0

    .line 67
    .local v17, "$i$a$-maxByOrNull-TokenRevocation$boundSibling$8":I
    invoke-virtual {v14}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v7

    invoke-static {v7, v6}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v7

    if-eqz v7, :cond_b

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    goto :goto_6

    :cond_b
    const-wide/16 v7, 0x0

    .line 82
    .end local v14    # "it":Lcom/pymcl/core/account/Account;
    .end local v17    # "$i$a$-maxByOrNull-TokenRevocation$boundSibling$8":I
    :goto_6
    nop

    .line 83
    .local v7, "v$iv":J
    cmp-long v14, v15, v7

    if-gez v14, :cond_c

    .line 84
    move-object v3, v13

    .line 85
    move-wide v14, v7

    move-wide v15, v14

    .line 87
    .end local v7    # "v$iv":J
    .end local v13    # "e$iv":Ljava/lang/Object;
    :cond_c
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_a

    .line 88
    nop

    .end local v3    # "maxElem$iv":Ljava/lang/Object;
    .end local v5    # "$this$maxByOrNull$iv":Lkotlin/sequences/Sequence;
    .end local v11    # "$i$f$maxByOrNull":I
    .end local v12    # "iterator$iv":Ljava/util/Iterator;
    .end local v15    # "maxValue$iv":J
    :goto_7
    check-cast v3, Lcom/pymcl/core/account/Account;

    .line 59
    return-object v3

    .line 56
    .end local v2    # "user":Ljava/lang/String;
    .end local v4    # "api":Ljava/lang/String;
    .end local v9    # "failedUpdated":J
    :cond_d
    :goto_8
    return-object v3
.end method

.method public final formatMessage(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p1, "sibling"    # Ljava/lang/String;

    const-string v0, "sibling"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v1, "\u8be5\u8d26\u53f7\u7684\u591a\u89d2\u8272\u5171\u4eab\u4ee4\u724c\u5df2\u5728\u7ed1\u5b9a\u89d2\u8272\u300c{0}\u300d\u65f6\u88ab\u670d\u52a1\u5668\u540a\u9500\uff08Yggdrasil \u4ee4\u724c\u4e00\u6b21\u53ea\u80fd\u7ed1\u5b9a\u4e00\u4e2a\u89d2\u8272\uff09\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55\u672c\u89d2\u8272"

    const-string v2, "{0}"

    const/4 v4, 0x0

    move-object v3, p1

    .end local p1    # "sibling":Ljava/lang/String;
    .local v3, "sibling":Ljava/lang/String;
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final isRevocationLike(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 10
    .param p1, "httpStatus"    # I
    .param p2, "error"    # Ljava/lang/String;
    .param p3, "errorMessage"    # Ljava/lang/String;

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    const/16 v0, 0x193

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    return v1

    .line 43
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p2, v0, v2

    aput-object p3, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 72
    .local v3, "$i$f$any":I
    instance-of v4, v0, Ljava/util/Collection;

    if-eqz v4, :cond_1

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    move v1, v2

    goto :goto_2

    .line 73
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    .local v6, "it":Ljava/lang/String;
    const/4 v7, 0x0

    .line 44
    .local v7, "$i$a$-any-TokenRevocation$isRevocationLike$1":I
    const-string v8, "ForbiddenOperationException"

    invoke-static {v6, v8, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-nez v8, :cond_4

    move-object v8, v6

    check-cast v8, Ljava/lang/CharSequence;

    const-string v9, "forbidden"

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v8, v9, v1}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v8

    if-nez v8, :cond_4

    .line 45
    move-object v8, v6

    check-cast v8, Ljava/lang/CharSequence;

    const-string v9, "invalid token"

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v8, v9, v1}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v8

    if-nez v8, :cond_4

    const-string v8, "InvalidToken"

    invoke-static {v6, v8, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_0

    :cond_3
    move v6, v2

    goto :goto_1

    :cond_4
    :goto_0
    move v6, v1

    .line 73
    .end local v6    # "it":Ljava/lang/String;
    .end local v7    # "$i$a$-any-TokenRevocation$isRevocationLike$1":I
    :goto_1
    if-eqz v6, :cond_2

    goto :goto_2

    .line 74
    .end local v5    # "element$iv":Ljava/lang/Object;
    :cond_5
    move v1, v2

    .line 43
    .end local v0    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$any":I
    :goto_2
    return v1
.end method

.method public final revokedMessage(Lcom/pymcl/core/account/Account;)Ljava/lang/String;
    .locals 4
    .param p1, "acc"    # Lcom/pymcl/core/account/Account;

    const-string v0, "acc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    const-string v1, "token_revoked_by"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    move-object v1, v0

    .line 71
    .local v1, "it":Ljava/lang/String;
    const/4 v2, 0x0

    .line 34
    .local v2, "$i$a$-takeIf-TokenRevocation$revokedMessage$1":I
    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .end local v1    # "it":Ljava/lang/String;
    .end local v2    # "$i$a$-takeIf-TokenRevocation$revokedMessage$1":I
    :goto_0
    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    .line 71
    .local v0, "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 34
    .local v1, "$i$a$-let-TokenRevocation$revokedMessage$2":I
    sget-object v2, Lcom/pymcl/core/auth/TokenRevocation;->INSTANCE:Lcom/pymcl/core/auth/TokenRevocation;

    invoke-virtual {v2, v0}, Lcom/pymcl/core/auth/TokenRevocation;->formatMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-TokenRevocation$revokedMessage$2":I
    if-nez v0, :cond_3

    :cond_2
    const-string v0, "\u8be5\u8d26\u53f7\u7684\u4ee4\u724c\u5df2\u88ab\u670d\u52a1\u5668\u540a\u9500\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55\u672c\u89d2\u8272"

    :cond_3
    return-object v0
.end method
