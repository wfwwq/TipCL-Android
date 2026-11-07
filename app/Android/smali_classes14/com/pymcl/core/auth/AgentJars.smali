.class public final Lcom/pymcl/core/auth/AgentJars;
.super Ljava/lang/Object;
.source "Auth.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAuth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Auth.kt\ncom/pymcl/core/auth/AgentJars\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0005J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0008\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/pymcl/core/auth/AgentJars;",
        "",
        "http",
        "Lcom/pymcl/core/net/Http;",
        "root",
        "Ljava/io/File;",
        "<init>",
        "(Lcom/pymcl/core/net/Http;Ljava/io/File;)V",
        "authlibJar",
        "getAuthlibJar",
        "()Ljava/io/File;",
        "nide8Jar",
        "getNide8Jar",
        "ensureAuthlibInjector",
        "sha256",
        "",
        "b",
        "",
        "ensureNide8",
        "prefetch",
        "api",
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


# instance fields
.field private final http:Lcom/pymcl/core/net/Http;

.field private final root:Ljava/io/File;


# direct methods
.method public static synthetic $r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(B)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/auth/AgentJars;->sha256$lambda$0(B)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Lcom/pymcl/core/net/Http;Ljava/io/File;)V
    .locals 1
    .param p1, "http"    # Lcom/pymcl/core/net/Http;
    .param p2, "root"    # Ljava/io/File;

    const-string v0, "http"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/auth/AgentJars;->http:Lcom/pymcl/core/net/Http;

    iput-object p2, p0, Lcom/pymcl/core/auth/AgentJars;->root:Ljava/io/File;

    return-void
.end method

.method private final sha256([B)Ljava/lang/String;
    .locals 10
    .param p1, "b"    # [B

    .line 178
    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    const-string v0, "digest(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    new-instance v7, Lcom/pymcl/core/auth/AgentJars$$ExternalSyntheticLambda0;

    invoke-direct {v7}, Lcom/pymcl/core/auth/AgentJars$$ExternalSyntheticLambda0;-><init>()V

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/ArraysKt;->joinToString$default([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final sha256$lambda$0(B)Ljava/lang/CharSequence;
    .locals 2
    .param p0, "it"    # B

    .line 178
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%02x"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method


# virtual methods
.method public final ensureAuthlibInjector()Ljava/io/File;
    .locals 14

    .line 166
    invoke-virtual {p0}, Lcom/pymcl/core/auth/AgentJars;->getAuthlibJar()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/core/auth/AgentJars;->getAuthlibJar()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/core/auth/AgentJars;->getAuthlibJar()Ljava/io/File;

    move-result-object v0

    return-object v0

    .line 167
    :cond_0
    const/4 v0, 0x0

    .line 168
    .local v0, "err":Ljava/lang/Exception;
    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "https://bmclapi2.bangbang93.com/mirrors/authlib-injector/artifact/latest.json"

    aput-object v4, v2, v3

    const-string v3, "https://authlib-injector.yushi.moe/artifact/latest.json"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v3, v0

    .end local v0    # "err":Ljava/lang/Exception;
    .local v3, "err":Ljava/lang/Exception;
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v5, 0x0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 169
    .local v7, "u":Ljava/lang/String;
    :try_start_0
    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    iget-object v6, p0, Lcom/pymcl/core/auth/AgentJars;->http:Lcom/pymcl/core/net/Http;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/pymcl/core/net/Http;->getText$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .local v0, "meta":Ljava/util/Map;
    const-string v6, "download_url"

    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v9, v6

    .line 170
    .local v9, "dl":Ljava/lang/String;
    iget-object v8, p0, Lcom/pymcl/core/auth/AgentJars;->http:Lcom/pymcl/core/net/Http;

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/pymcl/core/net/Http;->get$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v6

    .local v6, "r":Lcom/pymcl/core/net/HttpResponse;
    invoke-virtual {v6}, Lcom/pymcl/core/net/HttpResponse;->getOk()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v6}, Lcom/pymcl/core/net/HttpResponse;->getBody()[B

    move-result-object v8

    .line 172
    .local v8, "b":[B
    const-string v10, "checksums"

    invoke-static {v0, v10}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v10

    if-eqz v10, :cond_2

    const-string v11, "sha256"

    invoke-static {v10, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_2
    move-object v10, v5

    .line 173
    .local v10, "want":Ljava/lang/String;
    :goto_1
    if-eqz v10, :cond_4

    invoke-direct {p0, v8}, Lcom/pymcl/core/auth/AgentJars;->sha256([B)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v10, v4}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-eqz v11, :cond_3

    goto :goto_2

    :cond_3
    new-instance v11, Lcom/pymcl/core/auth/AuthException;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "authlib-injector \u6821\u9a8c\u5931\u8d25\uff08"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "\uff09"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12, v5, v1, v5}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .end local v3    # "err":Ljava/lang/Exception;
    .end local v7    # "u":Ljava/lang/String;
    throw v11

    .line 174
    .restart local v3    # "err":Ljava/lang/Exception;
    .restart local v7    # "u":Ljava/lang/String;
    :cond_4
    :goto_2
    array-length v5, v8

    const/16 v11, 0x2710

    if-le v5, v11, :cond_1

    sget-object v5, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {p0}, Lcom/pymcl/core/auth/AgentJars;->getAuthlibJar()Ljava/io/File;

    move-result-object v11

    invoke-virtual {v5, v11, v8}, Lcom/pymcl/core/util/FileUtil;->writeAtomic(Ljava/io/File;[B)Z

    invoke-virtual {p0}, Lcom/pymcl/core/auth/AgentJars;->getAuthlibJar()Ljava/io/File;

    move-result-object v1

    return-object v1

    .line 170
    .end local v8    # "b":[B
    .end local v10    # "want":Ljava/lang/String;
    :cond_5
    new-instance v8, Lcom/pymcl/core/auth/AuthException;

    invoke-virtual {v6}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "HTTP "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, ": "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v10, v5, v1, v5}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .end local v3    # "err":Ljava/lang/Exception;
    .end local v7    # "u":Ljava/lang/String;
    throw v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    .end local v0    # "meta":Ljava/util/Map;
    .end local v6    # "r":Lcom/pymcl/core/net/HttpResponse;
    .end local v9    # "dl":Ljava/lang/String;
    .restart local v3    # "err":Ljava/lang/Exception;
    .restart local v7    # "u":Ljava/lang/String;
    :catch_0
    move-exception v0

    .local v0, "e":Ljava/lang/Exception;
    move-object v3, v0

    .end local v0    # "e":Ljava/lang/Exception;
    .end local v7    # "u":Ljava/lang/String;
    goto/16 :goto_0

    .line 176
    :cond_6
    new-instance v0, Lcom/pymcl/core/auth/AuthException;

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_7
    move-object v2, v5

    :goto_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "authlib-injector \u4e0b\u8f7d\u5931\u8d25: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v5, v1, v5}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final ensureNide8()Ljava/io/File;
    .locals 7

    .line 180
    invoke-virtual {p0}, Lcom/pymcl/core/auth/AgentJars;->getNide8Jar()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/core/auth/AgentJars;->getNide8Jar()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/core/auth/AgentJars;->getNide8Jar()Ljava/io/File;

    move-result-object v0

    return-object v0

    .line 181
    :cond_0
    iget-object v1, p0, Lcom/pymcl/core/auth/AgentJars;->http:Lcom/pymcl/core/net/Http;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v2, "https://login.mc-user.com:233/index/jar"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/pymcl/core/net/Http;->get$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getBody()[B

    move-result-object v0

    .local v0, "b":[B
    array-length v1, v0

    const/16 v2, 0x2710

    if-le v1, v2, :cond_1

    .line 182
    sget-object v1, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {p0}, Lcom/pymcl/core/auth/AgentJars;->getNide8Jar()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/pymcl/core/util/FileUtil;->writeAtomic(Ljava/io/File;[B)Z

    invoke-virtual {p0}, Lcom/pymcl/core/auth/AgentJars;->getNide8Jar()Ljava/io/File;

    move-result-object v1

    return-object v1

    .line 181
    :cond_1
    new-instance v1, Lcom/pymcl/core/auth/AuthException;

    const-string v2, "nide8auth.jar \u4e0b\u8f7d\u5931\u8d25"

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4, v3, v4}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1
.end method

.method public final getAuthlibJar()Ljava/io/File;
    .locals 3

    .line 163
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/auth/AgentJars;->root:Ljava/io/File;

    const-string v2, "authlib-injector.jar"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getNide8Jar()Ljava/io/File;
    .locals 3

    .line 164
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/auth/AgentJars;->root:Ljava/io/File;

    const-string v2, "nide8auth.jar"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final prefetch(Ljava/lang/String;)Ljava/lang/String;
    .locals 9
    .param p1, "api"    # Ljava/lang/String;

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/core/auth/AgentJars;

    .line 188
    .local v0, "$this$prefetch_u24lambda_u240":Lcom/pymcl/core/auth/AgentJars;
    const/4 v1, 0x0

    .line 185
    .local v1, "$i$a$-runCatching-AgentJars$prefetch$1":I
    invoke-static {}, Ljava/util/Base64;->getEncoder()Ljava/util/Base64$Encoder;

    move-result-object v2

    iget-object v3, v0, Lcom/pymcl/core/auth/AgentJars;->http:Lcom/pymcl/core/net/Http;

    sget-object v4, Lcom/pymcl/core/auth/YggdrasilAuth;->Companion:Lcom/pymcl/core/auth/YggdrasilAuth$Companion;

    invoke-virtual {v4, p1}, Lcom/pymcl/core/auth/YggdrasilAuth$Companion;->normalizeApi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/pymcl/core/net/Http;->getText$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const-string v4, "getBytes(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    move-result-object v2

    .end local v0    # "$this$prefetch_u24lambda_u240":Lcom/pymcl/core/auth/AgentJars;
    .end local v1    # "$i$a$-runCatching-AgentJars$prefetch$1":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
