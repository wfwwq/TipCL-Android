.class public final Lcom/pymcl/multiplayer/TerracottaInterop;
.super Ljava/lang/Object;
.source "Interop.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInterop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Interop.kt\ncom/pymcl/multiplayer/TerracottaInterop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1#2:66\n1#2:78\n1#2:120\n1795#3,10:67\n2068#3:77\n2069#3:79\n1805#3:80\n1739#3:81\n1814#3,3:82\n777#3:85\n873#3,2:86\n777#3:88\n873#3,2:89\n1544#3:91\n1633#3,5:92\n812#3,12:97\n1795#3,10:109\n2068#3:119\n2069#3:121\n1805#3:122\n*S KotlinDebug\n*F\n+ 1 Interop.kt\ncom/pymcl/multiplayer/TerracottaInterop\n*L\n42#1:78\n62#1:120\n42#1:67,10\n42#1:77\n42#1:79\n42#1:80\n50#1:81\n50#1:82,3\n50#1:85\n50#1:86,2\n61#1:88\n61#1:89,2\n62#1:91\n62#1:92,5\n62#1:97,12\n62#1:109,10\n62#1:119\n62#1:121\n62#1:122\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nJ(\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00132\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00132\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0013J\u001e\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001bJ\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R(\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/pymcl/multiplayer/TerracottaInterop;",
        "",
        "<init>",
        "()V",
        "PC_TERRACOTTA_VERSION",
        "",
        "ANDROID_TERRACOTTA_BUILD",
        "NODES_URL",
        "nativeVerifier",
        "Lkotlin/Function1;",
        "",
        "getNativeVerifier",
        "()Lkotlin/jvm/functions/Function1;",
        "setNativeVerifier",
        "(Lkotlin/jvm/functions/Function1;)V",
        "classify",
        "Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;",
        "text",
        "parseNodes",
        "",
        "json",
        "mainland",
        "mergeNodes",
        "configured",
        "remote",
        "fetchNodes",
        "timeoutMs",
        "",
        "localIps",
        "CodeKind",
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


# static fields
.field public static final ANDROID_TERRACOTTA_BUILD:Ljava/lang/String; = "Terracotta 050b551, EasyTier v2.5.0-terracotta.2"

.field public static final INSTANCE:Lcom/pymcl/multiplayer/TerracottaInterop;

.field public static final NODES_URL:Ljava/lang/String; = "https://terracotta.glavo.site/nodes"

.field public static final PC_TERRACOTTA_VERSION:Ljava/lang/String; = "0.4.2"

.field private static volatile nativeVerifier:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/multiplayer/TerracottaInterop;

    invoke-direct {v0}, Lcom/pymcl/multiplayer/TerracottaInterop;-><init>()V

    sput-object v0, Lcom/pymcl/multiplayer/TerracottaInterop;->INSTANCE:Lcom/pymcl/multiplayer/TerracottaInterop;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic fetchNodes$default(Lcom/pymcl/multiplayer/TerracottaInterop;ZIILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 53
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/16 p2, 0xfa0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/multiplayer/TerracottaInterop;->fetchNodes(ZI)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final classify(Ljava/lang/String;)Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;
    .locals 7
    .param p1, "text"    # Ljava/lang/String;

    .line 29
    sget-object v0, Lcom/pymcl/multiplayer/RoomCode;->INSTANCE:Lcom/pymcl/multiplayer/RoomCode;

    invoke-virtual {v0, p1}, Lcom/pymcl/multiplayer/RoomCode;->parse(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;->TERRACOTTA:Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;

    return-object v0

    .line 30
    :cond_0
    const-string v0, ""

    if-nez p1, :cond_1

    move-object v1, v0

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 31
    .local v1, "t0":Ljava/lang/String;
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x1

    if-lez v2, :cond_2

    move v2, v3

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_5

    const/4 v2, 0x0

    :try_start_0
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v4, p0

    check-cast v4, Lcom/pymcl/multiplayer/TerracottaInterop;

    .line 66
    .local v4, "$this$classify_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    const/4 v5, 0x0

    .line 31
    .local v5, "$i$a$-runCatching-TerracottaInterop$classify$1":I
    sget-object v6, Lcom/pymcl/multiplayer/TerracottaInterop;->nativeVerifier:Lkotlin/jvm/functions/Function1;

    if-eqz v6, :cond_3

    invoke-interface {v6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    move-object v6, v2

    .end local v4    # "$this$classify_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .end local v5    # "$i$a$-runCatching-TerracottaInterop$classify$1":I
    :goto_2
    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v4

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v4}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    :goto_3
    invoke-static {v4}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_4

    :cond_4
    move-object v2, v4

    :goto_4
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object v0, Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;->TERRACOTTA:Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;

    return-object v0

    .line 33
    :cond_5
    if-nez p1, :cond_6

    goto :goto_5

    :cond_6
    move-object v0, p1

    :goto_5
    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 34
    .local v0, "t":Ljava/lang/String;
    new-instance v2, Lkotlin/text/Regex;

    const-string v3, "^[0-9A-Za-z\\-]{29}$"

    invoke-direct {v2, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v3, v0

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v2, Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;->LEGACY_PCL:Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;

    goto :goto_6

    :cond_7
    sget-object v2, Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;->INVALID:Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;

    :goto_6
    return-object v2
.end method

.method public final fetchNodes(ZI)Ljava/util/List;
    .locals 6
    .param p1, "mainland"    # Z
    .param p2, "timeoutMs"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 53
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/multiplayer/TerracottaInterop;

    .local v0, "$this$fetchNodes_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    const/4 v1, 0x0

    .line 54
    .local v1, "$i$a$-runCatching-TerracottaInterop$fetchNodes$1":I
    new-instance v2, Ljava/net/URL;

    const-string v3, "https://terracotta.glavo.site/nodes"

    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/net/HttpURLConnection;

    .line 55
    .local v2, "c":Ljava/net/HttpURLConnection;
    invoke-virtual {v2, p2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    invoke-virtual {v2, p2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const-string v3, "User-Agent"

    const-string v4, "PyMCL-Android"

    invoke-virtual {v2, v3, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 56
    :try_start_1
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    const/16 v4, 0xc8

    if-eq v3, v4, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    const-string v4, "getInputStream(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v5, Ljava/io/InputStreamReader;

    invoke-direct {v5, v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    check-cast v5, Ljava/io/Reader;

    instance-of v3, v5, Ljava/io/BufferedReader;

    if-eqz v3, :cond_1

    check-cast v5, Ljava/io/BufferedReader;

    goto :goto_0

    :cond_1
    new-instance v3, Ljava/io/BufferedReader;

    const/16 v4, 0x2000

    invoke-direct {v3, v5, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    move-object v5, v3

    :goto_0
    check-cast v5, Ljava/io/Reader;

    invoke-static {v5}, Lkotlin/io/TextStreamsKt;->readText(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, p1}, Lcom/pymcl/multiplayer/TerracottaInterop;->parseNodes(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 53
    .end local v0    # "$this$fetchNodes_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .end local v1    # "$i$a$-runCatching-TerracottaInterop$fetchNodes$1":I
    .end local v2    # "c":Ljava/net/HttpURLConnection;
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    .line 56
    .restart local v0    # "$this$fetchNodes_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .restart local v1    # "$i$a$-runCatching-TerracottaInterop$fetchNodes$1":I
    .restart local v2    # "c":Ljava/net/HttpURLConnection;
    :catchall_0
    move-exception v3

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .end local p1    # "mainland":Z
    .end local p2    # "timeoutMs":I
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    .end local v0    # "$this$fetchNodes_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .end local v1    # "$i$a$-runCatching-TerracottaInterop$fetchNodes$1":I
    .end local v2    # "c":Ljava/net/HttpURLConnection;
    .restart local p1    # "mainland":Z
    .restart local p2    # "timeoutMs":I
    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 57
    :goto_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v0, v1

    :cond_2
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getNativeVerifier()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 26
    sget-object v0, Lcom/pymcl/multiplayer/TerracottaInterop;->nativeVerifier:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final localIps()Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 60
    const-string v0, "list(...)"

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v1, p0

    check-cast v1, Lcom/pymcl/multiplayer/TerracottaInterop;

    .local v1, "$this$localIps_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    const/4 v2, 0x0

    .line 61
    .local v2, "$i$a$-runCatching-TerracottaInterop$localIps$1":I
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v3

    const-string v4, "getNetworkInterfaces(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 88
    .local v4, "$i$f$filter":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 89
    .local v7, "$i$f$filterTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/net/NetworkInterface;

    .local v10, "it":Ljava/net/NetworkInterface;
    const/4 v11, 0x0

    .line 61
    .local v11, "$i$a$-filter-TerracottaInterop$localIps$1$1":I
    invoke-virtual {v10}, Ljava/net/NetworkInterface;->isUp()Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_0

    invoke-virtual {v10}, Ljava/net/NetworkInterface;->isLoopback()Z

    move-result v12

    if-nez v12, :cond_0

    invoke-virtual {v10}, Ljava/net/NetworkInterface;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v14, "getName(...)"

    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "tun"

    const/4 v15, 0x2

    move-object/from16 v16, v1

    .end local v1    # "$this$localIps_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .local v16, "$this$localIps_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    const/4 v1, 0x0

    invoke-static {v12, v14, v13, v15, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v13, 0x1

    goto :goto_1

    .end local v16    # "$this$localIps_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .restart local v1    # "$this$localIps_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    :cond_0
    move-object/from16 v16, v1

    .line 89
    .end local v1    # "$this$localIps_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .end local v10    # "it":Ljava/net/NetworkInterface;
    .end local v11    # "$i$a$-filter-TerracottaInterop$localIps$1$1":I
    .restart local v16    # "$this$localIps_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    :cond_1
    :goto_1
    if-eqz v13, :cond_2

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    move-object/from16 v1, v16

    goto :goto_0

    .line 90
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    .end local v16    # "$this$localIps_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .restart local v1    # "$this$localIps_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    :cond_3
    move-object/from16 v16, v1

    .end local v1    # "$this$localIps_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filterTo":I
    .restart local v16    # "$this$localIps_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    move-object v1, v5

    check-cast v1, Ljava/util/List;

    .line 88
    nop

    .end local v3    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filter":I
    check-cast v1, Ljava/lang/Iterable;

    .line 62
    nop

    .local v1, "$this$flatMap$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 91
    .local v3, "$i$f$flatMap":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 92
    .local v6, "$i$f$flatMapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 93
    .local v8, "element$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/net/NetworkInterface;

    .local v9, "it":Ljava/net/NetworkInterface;
    const/4 v10, 0x0

    .line 62
    .local v10, "$i$a$-flatMap-TerracottaInterop$localIps$1$2":I
    invoke-virtual {v9}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v11

    const-string v12, "getInetAddresses(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ljava/util/List;

    check-cast v11, Ljava/lang/Iterable;

    .line 93
    .end local v9    # "it":Ljava/net/NetworkInterface;
    .end local v10    # "$i$a$-flatMap-TerracottaInterop$localIps$1$2":I
    nop

    .line 94
    .local v11, "list$iv$iv":Ljava/lang/Iterable;
    invoke-static {v4, v11}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_2

    .line 96
    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    .end local v11    # "list$iv$iv":Ljava/lang/Iterable;
    :cond_4
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$flatMapTo":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 91
    nop

    .end local v1    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$flatMap":I
    check-cast v0, Ljava/lang/Iterable;

    .line 62
    nop

    .local v0, "$this$filterIsInstance$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 97
    .local v1, "$i$f$filterIsInstance":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v0

    .local v4, "$this$filterIsInstanceTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 107
    .local v5, "$i$f$filterIsInstanceTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element$iv$iv":Ljava/lang/Object;
    instance-of v8, v7, Ljava/net/Inet4Address;

    if-eqz v8, :cond_5

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 108
    .end local v7    # "element$iv$iv":Ljava/lang/Object;
    :cond_6
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$filterIsInstanceTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$filterIsInstanceTo":I
    check-cast v3, Ljava/util/List;

    .line 97
    nop

    .end local v0    # "$this$filterIsInstance$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filterIsInstance":I
    check-cast v3, Ljava/lang/Iterable;

    .line 62
    nop

    .local v3, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 109
    .local v0, "$i$f$mapNotNull":I
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .local v1, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v3

    .local v4, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 118
    .local v5, "$i$f$mapNotNullTo":I
    move-object v6, v4

    .local v6, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 119
    .local v7, "$i$f$forEach":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "element$iv$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 118
    .local v11, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object v12, v10

    check-cast v12, Ljava/net/Inet4Address;

    .local v12, "it":Ljava/net/Inet4Address;
    const/4 v13, 0x0

    .line 62
    .local v13, "$i$a$-mapNotNull-TerracottaInterop$localIps$1$3":I
    invoke-virtual {v12}, Ljava/net/Inet4Address;->getHostAddress()Ljava/lang/String;

    move-result-object v14

    .line 118
    .end local v12    # "it":Ljava/net/Inet4Address;
    .end local v13    # "$i$a$-mapNotNull-TerracottaInterop$localIps$1$3":I
    if-eqz v14, :cond_7

    .line 120
    .local v14, "it$iv$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 118
    .local v12, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v1, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 119
    .end local v10    # "element$iv$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    .end local v12    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v14    # "it$iv$iv":Ljava/lang/Object;
    :cond_7
    nop

    .end local v9    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_4

    .line 121
    :cond_8
    nop

    .line 122
    .end local v6    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$forEach":I
    nop

    .end local v1    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapNotNullTo":I
    check-cast v1, Ljava/util/List;

    .line 109
    nop

    .line 62
    .end local v0    # "$i$f$mapNotNull":I
    .end local v3    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    nop

    .line 60
    .end local v2    # "$i$a$-runCatching-TerracottaInterop$localIps$1":I
    .end local v16    # "$this$localIps_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 63
    :goto_5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    move-object v0, v1

    :cond_9
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final mergeNodes(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 10
    .param p1, "configured"    # Ljava/util/List;
    .param p2, "remote"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "configured"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remote"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    move-object v1, p2

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 81
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 82
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 83
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    .local v7, "it":Ljava/lang/String;
    const/4 v8, 0x0

    .line 50
    .local v8, "$i$a$-map-TerracottaInterop$mergeNodes$1":I
    move-object v9, v7

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    .line 83
    .end local v7    # "it":Ljava/lang/String;
    .end local v8    # "$i$a$-map-TerracottaInterop$mergeNodes$1":I
    invoke-interface {v2, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 84
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 81
    nop

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    check-cast v2, Ljava/lang/Iterable;

    .line 50
    nop

    .local v2, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 85
    .local v0, "$i$f$filter":I
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .local v1, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v2

    .local v3, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 86
    .local v4, "$i$f$filterTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    .restart local v7    # "it":Ljava/lang/String;
    const/4 v8, 0x0

    .line 50
    .local v8, "$i$a$-filter-TerracottaInterop$mergeNodes$2":I
    move-object v9, v7

    check-cast v9, Ljava/lang/CharSequence;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-lez v9, :cond_2

    const/4 v9, 0x1

    goto :goto_2

    :cond_2
    const/4 v9, 0x0

    .line 86
    .end local v7    # "it":Ljava/lang/String;
    .end local v8    # "$i$a$-filter-TerracottaInterop$mergeNodes$2":I
    :goto_2
    if-eqz v9, :cond_1

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 87
    .end local v6    # "element$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .end local v1    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filterTo":I
    check-cast v1, Ljava/util/List;

    .line 85
    nop

    .end local v0    # "$i$f$filter":I
    .end local v2    # "$this$filter$iv":Ljava/lang/Iterable;
    check-cast v1, Ljava/lang/Iterable;

    .line 50
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final parseNodes(Ljava/lang/String;Z)Ljava/util/List;
    .locals 23
    .param p1, "json"    # Ljava/lang/String;
    .param p2, "mainland"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "json"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/multiplayer/TerracottaInterop;

    .local v0, "$this$parseNodes_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    const/4 v2, 0x0

    .line 42
    .local v2, "$i$a$-runCatching-TerracottaInterop$parseNodes$1":I
    invoke-static {v1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v3

    const-string v4, "getAsJsonArray(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 67
    .local v4, "$i$f$mapNotNull":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 76
    .local v7, "$i$f$mapNotNullTo":I
    move-object v8, v6

    .local v8, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 77
    .local v9, "$i$f$forEach":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "element$iv$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 76
    .local v13, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object v14, v12

    check-cast v14, Lcom/google/gson/JsonElement;

    .local v14, "e":Lcom/google/gson/JsonElement;
    const/4 v15, 0x0

    .line 43
    .local v15, "$i$a$-mapNotNull-TerracottaInterop$parseNodes$1$1":I
    invoke-virtual {v14}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v16

    move-object/from16 v17, v16

    move-object/from16 v16, v0

    .end local v0    # "$this$parseNodes_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .local v16, "$this$parseNodes_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .local v17, "o":Lcom/google/gson/JsonObject;
    const-string v0, "url"

    move-object/from16 v1, v17

    .end local v17    # "o":Lcom/google/gson/JsonObject;
    .local v1, "o":Lcom/google/gson/JsonObject;
    invoke-virtual {v1, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    const/16 v17, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    move-object/from16 v21, v1

    move/from16 v22, v2

    move/from16 v2, p2

    goto :goto_4

    .line 44
    .local v0, "url":Ljava/lang/String;
    :cond_0
    move-object/from16 v18, v0

    .end local v0    # "url":Ljava/lang/String;
    .local v18, "url":Ljava/lang/String;
    const-string v0, "region"

    invoke-virtual {v1, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    if-eqz v0, :cond_2

    move-object/from16 v19, v0

    .line 66
    .local v19, "it":Lcom/google/gson/JsonElement;
    const/16 v20, 0x0

    .line 44
    .local v20, "$i$a$-takeIf-TerracottaInterop$parseNodes$1$1$region$1":I
    invoke-virtual/range {v19 .. v19}, Lcom/google/gson/JsonElement;->isJsonNull()Z

    move-result v21

    .end local v19    # "it":Lcom/google/gson/JsonElement;
    .end local v20    # "$i$a$-takeIf-TerracottaInterop$parseNodes$1$1$region$1":I
    if-nez v21, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v0, v17

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object/from16 v0, v17

    :goto_2
    if-nez v0, :cond_3

    const-string v0, ""

    .line 45
    .local v0, "region":Ljava/lang/String;
    :cond_3
    move-object/from16 v19, v18

    .line 66
    .local v19, "it":Ljava/lang/String;
    const/16 v20, 0x0

    .line 45
    .local v20, "$i$a$-takeIf-TerracottaInterop$parseNodes$1$1$1":I
    move-object/from16 v21, v1

    .end local v1    # "o":Lcom/google/gson/JsonObject;
    .local v21, "o":Lcom/google/gson/JsonObject;
    const-string v1, "cn"

    move/from16 v22, v2

    .end local v2    # "$i$a$-runCatching-TerracottaInterop$parseNodes$1":I
    .local v22, "$i$a$-runCatching-TerracottaInterop$parseNodes$1":I
    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move/from16 v2, p2

    if-ne v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    .end local v19    # "it":Ljava/lang/String;
    .end local v20    # "$i$a$-takeIf-TerracottaInterop$parseNodes$1$1$1":I
    :goto_3
    if-eqz v1, :cond_6

    move-object/from16 v17, v18

    goto :goto_4

    .line 43
    .end local v0    # "region":Ljava/lang/String;
    .end local v18    # "url":Ljava/lang/String;
    .end local v21    # "o":Lcom/google/gson/JsonObject;
    .end local v22    # "$i$a$-runCatching-TerracottaInterop$parseNodes$1":I
    .restart local v1    # "o":Lcom/google/gson/JsonObject;
    .restart local v2    # "$i$a$-runCatching-TerracottaInterop$parseNodes$1":I
    :cond_5
    move-object/from16 v21, v1

    move/from16 v22, v2

    move/from16 v2, p2

    .line 76
    .end local v1    # "o":Lcom/google/gson/JsonObject;
    .end local v2    # "$i$a$-runCatching-TerracottaInterop$parseNodes$1":I
    .end local v14    # "e":Lcom/google/gson/JsonElement;
    .end local v15    # "$i$a$-mapNotNull-TerracottaInterop$parseNodes$1$1":I
    .restart local v22    # "$i$a$-runCatching-TerracottaInterop$parseNodes$1":I
    :cond_6
    :goto_4
    if-eqz v17, :cond_7

    move-object/from16 v0, v17

    .line 78
    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 76
    .local v1, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    :try_start_1
    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 77
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v1    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v12    # "element$iv$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_7
    move-object/from16 v1, p1

    move-object/from16 v0, v16

    move/from16 v2, v22

    .end local v11    # "element$iv$iv$iv":Ljava/lang/Object;
    goto/16 :goto_0

    .line 79
    .end local v16    # "$this$parseNodes_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .end local v22    # "$i$a$-runCatching-TerracottaInterop$parseNodes$1":I
    .local v0, "$this$parseNodes_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .restart local v2    # "$i$a$-runCatching-TerracottaInterop$parseNodes$1":I
    :cond_8
    move-object/from16 v16, v0

    move/from16 v22, v2

    move/from16 v2, p2

    .line 80
    .end local v0    # "$this$parseNodes_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .end local v2    # "$i$a$-runCatching-TerracottaInterop$parseNodes$1":I
    .end local v8    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$forEach":I
    .restart local v16    # "$this$parseNodes_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .restart local v22    # "$i$a$-runCatching-TerracottaInterop$parseNodes$1":I
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapNotNullTo":I
    move-object v0, v5

    check-cast v0, Ljava/util/List;

    .line 67
    nop

    .line 46
    .end local v3    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapNotNull":I
    nop

    .line 41
    .end local v16    # "$this$parseNodes_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaInterop;
    .end local v22    # "$i$a$-runCatching-TerracottaInterop$parseNodes$1":I
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_5

    :catchall_1
    move-exception v0

    move/from16 v2, p2

    :goto_5
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 47
    :goto_6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    move-object v0, v1

    :cond_9
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final setNativeVerifier(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 26
    sput-object p1, Lcom/pymcl/multiplayer/TerracottaInterop;->nativeVerifier:Lkotlin/jvm/functions/Function1;

    return-void
.end method
