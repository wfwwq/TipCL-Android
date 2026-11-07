.class public final Lcom/pymcl/ai/ChatStore;
.super Ljava/lang/Object;
.source "ChatStore.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/ai/ChatStore$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChatStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatStore.kt\ncom/pymcl/ai/ChatStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1#2:64\n296#3,2:65\n1739#3:67\n1814#3,3:68\n1233#3:71\n2198#3,14:72\n1739#3:86\n1814#3,3:87\n1739#3:90\n1814#3,3:91\n296#3,2:94\n*S KotlinDebug\n*F\n+ 1 ChatStore.kt\ncom/pymcl/ai/ChatStore\n*L\n24#1:65,2\n28#1:67\n28#1:68,3\n29#1:71\n41#1:72,14\n47#1:86\n47#1:87,3\n56#1:90\n56#1:91,3\n58#1:94,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0011\n\u0002\u0008\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001a\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000cH\u0002J\"\u0010\r\u001a\u00020\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000cH\u0002J.\u0010\u0010\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011j\u0002`\u00122\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000cH\u0002J@\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nj\u0004\u0018\u0001`\u000c2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000c2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0008\u0010\u0015\u001a\u00020\u000bH\u0002J\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017J\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u000bJ&\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000c0\u00172\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bJ.\u0010 \u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000b2\u001e\u0010!\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000c0\u0017JK\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000b26\u0010!\u001a\u001c\u0012\u0018\u0008\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000c0#\"\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000c\u00a2\u0006\u0002\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lcom/pymcl/ai/ChatStore;",
        "",
        "file",
        "Ljava/io/File;",
        "clock",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Ljava/io/File;Lkotlin/jvm/functions/Function0;)V",
        "load",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "save",
        "",
        "m",
        "chats",
        "",
        "Lcom/pymcl/core/util/JArr;",
        "find",
        "id",
        "newId",
        "list",
        "",
        "Lcom/pymcl/ai/ChatInfo;",
        "activeId",
        "create",
        "setActive",
        "delete",
        "ensureActive",
        "messages",
        "title",
        "setMessages",
        "msgs",
        "append",
        "",
        "(Ljava/lang/String;[Ljava/util/Map;)Z",
        "Companion",
        "PyMCL-Android:ai"
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
.field public static final Companion:Lcom/pymcl/ai/ChatStore$Companion;

.field public static final DEFAULT_TITLE:Ljava/lang/String; = "\u65b0\u5bf9\u8bdd"

.field public static final MAX_MESSAGES:I = 0xc8

.field public static final TITLE_MAX:I = 0x28


# instance fields
.field private final clock:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final file:Ljava/io/File;


# direct methods
.method public static synthetic $r8$lambda$cHoldzIeu6ipqn1b5lBYT713f0s()J
    .locals 2

    invoke-static {}, Lcom/pymcl/ai/ChatStore;->_init_$lambda$0()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic $r8$lambda$tDPDyAub56ZX78ZtNx1HMmOJb2I(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/ai/ChatStore;->delete$lambda$0$0(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/ai/ChatStore$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/ai/ChatStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/ai/ChatStore;->Companion:Lcom/pymcl/ai/ChatStore$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;
    .param p2, "clock"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/ChatStore;->file:Ljava/io/File;

    iput-object p2, p0, Lcom/pymcl/ai/ChatStore;->clock:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 13
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lcom/pymcl/ai/ChatStore$$ExternalSyntheticLambda1;

    invoke-direct {p2}, Lcom/pymcl/ai/ChatStore$$ExternalSyntheticLambda1;-><init>()V

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/pymcl/ai/ChatStore;-><init>(Ljava/io/File;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private static final _init_$lambda$0()J
    .locals 4

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 v2, 0x3e8

    int-to-long v2, v2

    div-long/2addr v0, v2

    return-wide v0
.end method

.method private final chats(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .param p1, "m"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 23
    const-string v0, "chats"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    move-object v2, v1

    .line 64
    .local v2, "it":Ljava/util/List;
    const/4 v3, 0x0

    .line 23
    .local v3, "$i$a$-also-ChatStore$chats$1":I
    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v2    # "it":Ljava/util/List;
    .end local v3    # "$i$a$-also-ChatStore$chats$1":I
    :cond_0
    return-object v1
.end method

.method private static final delete$lambda$0$0(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 2
    .param p0, "$id"    # Ljava/lang/String;
    .param p1, "it"    # Ljava/lang/Object;

    .line 40
    invoke-static {p1}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "id"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final find(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;
    .locals 7
    .param p1, "m"    # Ljava/util/Map;
    .param p2, "id"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 24
    invoke-direct {p0, p1}, Lcom/pymcl/ai/ChatStore;->chats(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 65
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

    check-cast v4, Ljava/util/Map;

    .local v4, "it":Ljava/util/Map;
    const/4 v5, 0x0

    .line 24
    .local v5, "$i$a$-firstOrNull-ChatStore$find$1":I
    const-string v6, "id"

    invoke-static {v4, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 65
    .end local v4    # "it":Ljava/util/Map;
    .end local v5    # "$i$a$-firstOrNull-ChatStore$find$1":I
    if-eqz v4, :cond_0

    goto :goto_0

    .line 66
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_1
    const/4 v3, 0x0

    .end local v0    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull":I
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 24
    return-object v3
.end method

.method private final load()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 21
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/ai/ChatStore;

    .line 64
    .local v0, "$this$load_u24lambda_u240":Lcom/pymcl/ai/ChatStore;
    const/4 v1, 0x0

    .line 21
    .local v1, "$i$a$-runCatching-ChatStore$load$1":I
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v3, v0, Lcom/pymcl/ai/ChatStore;->file:Ljava/io/File;

    invoke-virtual {v2, v3}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v2

    .end local v0    # "$this$load_u24lambda_u240":Lcom/pymcl/ai/ChatStore;
    .end local v1    # "$i$a$-runCatching-ChatStore$load$1":I
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

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v0, v2

    :cond_0
    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_1

    const/4 v0, 0x2

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "active_id"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    const-string v2, "chats"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private final newId()Ljava/lang/String;
    .locals 7

    .line 25
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v0, "toString(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "-"

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final save(Ljava/util/Map;)Z
    .locals 2
    .param p1, "m"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 22
    sget-object v0, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v1, p0, Lcom/pymcl/ai/ChatStore;->file:Ljava/io/File;

    invoke-virtual {v0, v1, p1}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final activeId()Ljava/lang/String;
    .locals 6

    .line 31
    monitor-enter p0

    .line 64
    const/4 v0, 0x0

    .line 31
    .local v0, "$i$a$-synchronized-ChatStore$activeId$1":I
    :try_start_0
    invoke-direct {p0}, Lcom/pymcl/ai/ChatStore;->load()Ljava/util/Map;

    move-result-object v1

    const-string v2, "active_id"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v3, v1

    .line 64
    .local v3, "it":Ljava/lang/String;
    const/4 v4, 0x0

    .line 31
    .local v4, "$i$a$-takeIf-ChatStore$activeId$1$1":I
    move-object v5, v3

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .end local v3    # "it":Ljava/lang/String;
    .end local v4    # "$i$a$-takeIf-ChatStore$activeId$1$1":I
    :goto_0
    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    .end local v0    # "$i$a$-synchronized-ChatStore$activeId$1":I
    :goto_1
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final varargs append(Ljava/lang/String;[Ljava/util/Map;)Z
    .locals 2
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "msgs"    # [Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "msgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    monitor-enter p0

    .line 64
    const/4 v0, 0x0

    .line 61
    .local v0, "$i$a$-synchronized-ChatStore$append$1":I
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/ChatStore;->messages(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;[Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lcom/pymcl/ai/ChatStore;->setMessages(Ljava/lang/String;Ljava/util/List;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-ChatStore$append$1":I
    monitor-exit p0

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final create()Ljava/lang/String;
    .locals 8

    .line 33
    monitor-enter p0

    const/4 v0, 0x0

    .line 34
    .local v0, "$i$a$-synchronized-ChatStore$create$1":I
    :try_start_0
    invoke-direct {p0}, Lcom/pymcl/ai/ChatStore;->load()Ljava/util/Map;

    move-result-object v1

    .local v1, "m":Ljava/util/Map;
    invoke-direct {p0}, Lcom/pymcl/ai/ChatStore;->newId()Ljava/lang/String;

    move-result-object v2

    .line 35
    .local v2, "id":Ljava/lang/String;
    invoke-direct {p0, v1}, Lcom/pymcl/ai/ChatStore;->chats(Ljava/util/Map;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Lkotlin/Pair;

    const-string v5, "id"

    invoke-static {v5, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "title"

    const-string v7, "\u65b0\u5bf9\u8bdd"

    invoke-static {v5, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v7, 0x1

    aput-object v5, v4, v7

    const-string v5, "updated"

    iget-object v7, p0, Lcom/pymcl/ai/ChatStore;->clock:Lkotlin/jvm/functions/Function0;

    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v7, 0x2

    aput-object v5, v4, v7

    const-string v5, "messages"

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v7, 0x3

    aput-object v5, v4, v7

    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v3, v6, v4}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 36
    const-string v3, "active_id"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, v1}, Lcom/pymcl/ai/ChatStore;->save(Ljava/util/Map;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .end local v0    # "$i$a$-synchronized-ChatStore$create$1":I
    .end local v1    # "m":Ljava/util/Map;
    .end local v2    # "id":Ljava/lang/String;
    monitor-exit p0

    .line 37
    return-object v2

    .line 33
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final delete(Ljava/lang/String;)Z
    .locals 19
    .param p1, "id"    # Ljava/lang/String;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "id"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    monitor-enter p0

    const/4 v0, 0x0

    .line 40
    .local v0, "$i$a$-synchronized-ChatStore$delete$1":I
    :try_start_0
    invoke-direct {v1}, Lcom/pymcl/ai/ChatStore;->load()Ljava/util/Map;

    move-result-object v3

    .local v3, "m":Ljava/util/Map;
    invoke-direct {v1, v3}, Lcom/pymcl/ai/ChatStore;->chats(Ljava/util/Map;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Lcom/pymcl/ai/ChatStore$$ExternalSyntheticLambda0;

    invoke-direct {v5, v2}, Lcom/pymcl/ai/ChatStore$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 41
    const-string v4, "active_id"

    invoke-static {v3, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const-string v4, "active_id"

    invoke-direct {v1, v3}, Lcom/pymcl/ai/ChatStore;->chats(Ljava/util/Map;)Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$maxByOrNull$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 72
    .local v6, "$i$f$maxByOrNull":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 73
    .local v7, "iterator$iv":Ljava/util/Iterator;
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_0

    const/4 v8, 0x0

    goto :goto_2

    .line 74
    :cond_0
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 75
    .local v8, "maxElem$iv":Ljava/lang/Object;
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_1

    goto :goto_2

    .line 76
    :cond_1
    move-object v10, v8

    check-cast v10, Ljava/util/Map;

    .local v10, "it":Ljava/util/Map;
    const/4 v11, 0x0

    .line 41
    .local v11, "$i$a$-maxByOrNull-ChatStore$delete$1$2":I
    const-string v12, "updated"

    invoke-static {v10, v12}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v12

    const-wide/16 v13, 0x0

    if-eqz v12, :cond_2

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    goto :goto_0

    :cond_2
    move-wide v15, v13

    .line 76
    .end local v10    # "it":Ljava/util/Map;
    .end local v11    # "$i$a$-maxByOrNull-ChatStore$delete$1$2":I
    :goto_0
    nop

    .line 78
    .local v15, "maxValue$iv":J
    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 79
    .local v10, "e$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Ljava/util/Map;

    .local v11, "it":Ljava/util/Map;
    const/4 v12, 0x0

    .line 41
    .local v12, "$i$a$-maxByOrNull-ChatStore$delete$1$2":I
    const-string v9, "updated"

    invoke-static {v11, v9}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    goto :goto_1

    :cond_4
    move-wide/from16 v17, v13

    .line 79
    .end local v11    # "it":Ljava/util/Map;
    .end local v12    # "$i$a$-maxByOrNull-ChatStore$delete$1$2":I
    :goto_1
    nop

    .line 80
    .local v17, "v$iv":J
    cmp-long v9, v15, v17

    if-gez v9, :cond_5

    .line 81
    move-object v8, v10

    .line 82
    move-wide/from16 v11, v17

    move-wide v15, v11

    .line 84
    .end local v10    # "e$iv":Ljava/lang/Object;
    .end local v17    # "v$iv":J
    :cond_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_3

    .line 85
    nop

    .line 41
    .end local v5    # "$this$maxByOrNull$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$maxByOrNull":I
    .end local v7    # "iterator$iv":Ljava/util/Iterator;
    .end local v8    # "maxElem$iv":Ljava/lang/Object;
    .end local v15    # "maxValue$iv":J
    :goto_2
    check-cast v8, Ljava/util/Map;

    if-eqz v8, :cond_6

    const-string v5, "id"

    invoke-static {v8, v5}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_3

    :cond_6
    const/4 v9, 0x0

    :goto_3
    invoke-interface {v3, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    :cond_7
    invoke-direct {v1, v3}, Lcom/pymcl/ai/ChatStore;->save(Ljava/util/Map;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .end local v0    # "$i$a$-synchronized-ChatStore$delete$1":I
    .end local v3    # "m":Ljava/util/Map;
    monitor-exit p0

    .line 43
    return v4

    .line 39
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final ensureActive()Ljava/lang/String;
    .locals 5

    .line 45
    monitor-enter p0

    .line 64
    const/4 v0, 0x0

    .line 45
    .local v0, "$i$a$-synchronized-ChatStore$ensureActive$1":I
    :try_start_0
    invoke-virtual {p0}, Lcom/pymcl/ai/ChatStore;->activeId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    move-object v2, v1

    .line 64
    .local v2, "id":Ljava/lang/String;
    const/4 v3, 0x0

    .line 45
    .local v3, "$i$a$-takeIf-ChatStore$ensureActive$1$1":I
    invoke-direct {p0}, Lcom/pymcl/ai/ChatStore;->load()Ljava/util/Map;

    move-result-object v4

    invoke-direct {p0, v4, v2}, Lcom/pymcl/ai/ChatStore;->find(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .end local v2    # "id":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-ChatStore$ensureActive$1$1":I
    :goto_0
    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_3

    :cond_2
    invoke-virtual {p0}, Lcom/pymcl/ai/ChatStore;->create()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-ChatStore$ensureActive$1":I
    :cond_3
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final list()Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/ChatInfo;",
            ">;"
        }
    .end annotation

    .line 27
    move-object/from16 v1, p0

    monitor-enter p0

    const/4 v0, 0x0

    .line 28
    .local v0, "$i$a$-synchronized-ChatStore$list$1":I
    :try_start_0
    invoke-direct {v1}, Lcom/pymcl/ai/ChatStore;->load()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/pymcl/ai/ChatStore;->chats(Ljava/util/Map;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 67
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 68
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 69
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/util/Map;

    .local v9, "it":Ljava/util/Map;
    const/4 v10, 0x0

    .line 28
    .local v10, "$i$a$-map-ChatStore$list$1$1":I
    new-instance v11, Lcom/pymcl/ai/ChatInfo;

    const-string v12, "id"

    invoke-static {v9, v12}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_0

    const-string v12, ""

    :cond_0
    const-string v13, "title"

    invoke-static {v9, v13}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_1

    const-string v13, "\u65b0\u5bf9\u8bdd"

    :cond_1
    const-string v14, "updated"

    invoke-static {v9, v14}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v14

    if-eqz v14, :cond_2

    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    goto :goto_1

    :cond_2
    const-wide/16 v14, 0x0

    :goto_1
    move/from16 v17, v0

    .end local v0    # "$i$a$-synchronized-ChatStore$list$1":I
    .local v17, "$i$a$-synchronized-ChatStore$list$1":I
    const-string v0, "messages"

    invoke-static {v9, v0}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    move/from16 v16, v0

    invoke-direct/range {v11 .. v16}, Lcom/pymcl/ai/ChatInfo;-><init>(Ljava/lang/String;Ljava/lang/String;JI)V

    .line 69
    .end local v9    # "it":Ljava/util/Map;
    .end local v10    # "$i$a$-map-ChatStore$list$1$1":I
    invoke-interface {v4, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v0, v17

    goto :goto_0

    .line 70
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-synchronized-ChatStore$list$1":I
    .restart local v0    # "$i$a$-synchronized-ChatStore$list$1":I
    :cond_4
    move/from16 v17, v0

    .end local v0    # "$i$a$-synchronized-ChatStore$list$1":I
    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    .restart local v17    # "$i$a$-synchronized-ChatStore$list$1":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 67
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v0, Ljava/lang/Iterable;

    .line 29
    nop

    .local v0, "$this$sortedByDescending$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 71
    .local v2, "$i$f$sortedByDescending":I
    new-instance v3, Lcom/pymcl/ai/ChatStore$list$lambda$0$$inlined$sortedByDescending$1;

    invoke-direct {v3}, Lcom/pymcl/ai/ChatStore$list$lambda$0$$inlined$sortedByDescending$1;-><init>()V

    check-cast v3, Ljava/util/Comparator;

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .end local v0    # "$this$sortedByDescending$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$sortedByDescending":I
    nop

    .line 27
    .end local v17    # "$i$a$-synchronized-ChatStore$list$1":I
    monitor-exit p0

    .line 30
    return-object v3

    .line 27
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final messages(Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .param p1, "id"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    monitor-enter p0

    .line 64
    const/4 v0, 0x0

    .line 47
    .local v0, "$i$a$-synchronized-ChatStore$messages$1":I
    :try_start_0
    invoke-direct {p0}, Lcom/pymcl/ai/ChatStore;->load()Ljava/util/Map;

    move-result-object v1

    invoke-direct {p0, v1, p1}, Lcom/pymcl/ai/ChatStore;->find(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "messages"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 86
    .local v2, "$i$f$map":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 87
    .local v5, "$i$f$mapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 88
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/util/Map;

    .local v8, "it":Ljava/util/Map;
    const/4 v9, 0x0

    .line 47
    .local v9, "$i$a$-map-ChatStore$messages$1$1":I
    invoke-static {v8}, Lcom/pymcl/core/util/JsonKt;->deepCopy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 88
    .end local v8    # "it":Ljava/util/Map;
    .end local v9    # "$i$a$-map-ChatStore$messages$1$1":I
    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 89
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    check-cast v3, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    nop

    .line 47
    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map":I
    nop

    .end local v0    # "$i$a$-synchronized-ChatStore$messages$1":I
    monitor-exit p0

    return-object v3

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final setActive(Ljava/lang/String;)Z
    .locals 3
    .param p1, "id"    # Ljava/lang/String;

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    monitor-enter p0

    .line 64
    const/4 v0, 0x0

    .line 38
    .local v0, "$i$a$-synchronized-ChatStore$setActive$1":I
    :try_start_0
    invoke-direct {p0}, Lcom/pymcl/ai/ChatStore;->load()Ljava/util/Map;

    move-result-object v1

    .local v1, "m":Ljava/util/Map;
    invoke-direct {p0, v1, p1}, Lcom/pymcl/ai/ChatStore;->find(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "active_id"

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, v1}, Lcom/pymcl/ai/ChatStore;->save(Ljava/util/Map;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    .end local v0    # "$i$a$-synchronized-ChatStore$setActive$1":I
    .end local v1    # "m":Ljava/util/Map;
    :goto_0
    monitor-exit p0

    return v2

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final setMessages(Ljava/lang/String;Ljava/util/List;)Z
    .locals 19
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "msgs"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)Z"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v0, "id"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "msgs"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    monitor-enter p0

    const/4 v0, 0x0

    .line 52
    .local v0, "$i$a$-synchronized-ChatStore$setMessages$1":I
    :try_start_0
    invoke-direct {v1}, Lcom/pymcl/ai/ChatStore;->load()Ljava/util/Map;

    move-result-object v4

    .line 53
    .local v4, "m":Ljava/util/Map;
    invoke-direct {v1, v4, v2}, Lcom/pymcl/ai/ChatStore;->find(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-nez v5, :cond_0

    const/4 v5, 0x2

    new-array v5, v5, [Lkotlin/Pair;

    const-string v8, "id"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v5, v6

    const-string v8, "title"

    const-string v9, "\u65b0\u5bf9\u8bdd"

    invoke-static {v8, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v5, v7

    invoke-static {v5}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    move-object v8, v5

    .line 64
    .local v8, "it":Ljava/util/Map;
    const/4 v9, 0x0

    .line 53
    .local v9, "$i$a$-also-ChatStore$setMessages$1$c$1":I
    invoke-direct {v1, v4}, Lcom/pymcl/ai/ChatStore;->chats(Ljava/util/Map;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10, v6, v8}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 54
    .end local v8    # "it":Ljava/util/Map;
    .end local v9    # "$i$a$-also-ChatStore$setMessages$1$c$1":I
    .local v5, "c":Ljava/util/Map;
    :cond_0
    const/16 v8, 0xc8

    invoke-static {v3, v8}, Lkotlin/collections/CollectionsKt;->takeLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v8

    .line 55
    .local v8, "tail":Ljava/util/List;
    :goto_0
    move-object v9, v8

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    const-string v10, "role"

    invoke-static {v9, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "tool"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move-object v9, v8

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {v9, v7}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v9

    move-object v8, v9

    goto :goto_0

    .line 56
    :cond_1
    const-string v9, "messages"

    move-object v10, v8

    check-cast v10, Ljava/lang/Iterable;

    .local v10, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 90
    .local v11, "$i$f$map":I
    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v10, v13}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v12, Ljava/util/Collection;

    .local v12, "destination$iv$iv":Ljava/util/Collection;
    move-object v13, v10

    .local v13, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 91
    .local v14, "$i$f$mapTo":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_2

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .line 92
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v16

    check-cast v17, Ljava/util/Map;

    .local v17, "it":Ljava/util/Map;
    const/16 v18, 0x0

    .line 56
    .local v18, "$i$a$-map-ChatStore$setMessages$1$1":I
    move-object/from16 v6, v17

    check-cast v6, Ljava/lang/Object;

    .line 92
    .end local v17    # "it":Ljava/util/Map;
    .end local v18    # "$i$a$-map-ChatStore$setMessages$1$1":I
    invoke-interface {v12, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    goto :goto_1

    .line 93
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v12    # "destination$iv$iv":Ljava/util/Collection;
    .end local v13    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$mapTo":I
    move-object v6, v12

    check-cast v6, Ljava/util/List;

    .line 90
    nop

    .end local v10    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$map":I
    check-cast v6, Ljava/util/Collection;

    .line 56
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v5, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    const-string v6, "updated"

    iget-object v9, v1, Lcom/pymcl/ai/ChatStore;->clock:Lkotlin/jvm/functions/Function0;

    invoke-interface {v9}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v5, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    const-string v6, "title"

    invoke-static {v5, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    const-string v6, "\u65b0\u5bf9\u8bdd"

    :cond_3
    const-string v9, "\u65b0\u5bf9\u8bdd"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object v6, v3

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 94
    .local v9, "$i$f$firstOrNull":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Ljava/util/Map;

    .local v12, "it":Ljava/util/Map;
    const/4 v13, 0x0

    .line 58
    .local v13, "$i$a$-firstOrNull-ChatStore$setMessages$1$2":I
    const-string v14, "role"

    invoke-static {v12, v14}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v15, "user"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const-string v14, "hidden"

    invoke-interface {v12, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_5

    move v12, v7

    goto :goto_2

    :cond_5
    const/4 v12, 0x0

    .line 94
    .end local v12    # "it":Ljava/util/Map;
    .end local v13    # "$i$a$-firstOrNull-ChatStore$setMessages$1$2":I
    :goto_2
    if-eqz v12, :cond_4

    goto :goto_3

    .line 95
    .end local v11    # "element$iv":Ljava/lang/Object;
    :cond_6
    const/4 v11, 0x0

    .line 58
    .end local v6    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$firstOrNull":I
    :goto_3
    check-cast v11, Ljava/util/Map;

    if-eqz v11, :cond_7

    const-string v6, "content"

    invoke-static {v11, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_7

    .line 64
    .local v6, "it":Ljava/lang/String;
    const/4 v7, 0x0

    .line 58
    .local v7, "$i$a$-let-ChatStore$setMessages$1$3":I
    const-string v9, "title"

    sget-object v10, Lcom/pymcl/ai/ChatStore;->Companion:Lcom/pymcl/ai/ChatStore$Companion;

    invoke-virtual {v10, v6}, Lcom/pymcl/ai/ChatStore$Companion;->titleFrom(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v5, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .end local v6    # "it":Ljava/lang/String;
    .end local v7    # "$i$a$-let-ChatStore$setMessages$1$3":I
    :cond_7
    invoke-direct {v1, v4}, Lcom/pymcl/ai/ChatStore;->save(Ljava/util/Map;)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .end local v0    # "$i$a$-synchronized-ChatStore$setMessages$1":I
    .end local v4    # "m":Ljava/util/Map;
    .end local v5    # "c":Ljava/util/Map;
    .end local v8    # "tail":Ljava/util/List;
    monitor-exit p0

    .line 60
    return v6

    .line 51
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final title(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "id"    # Ljava/lang/String;

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    monitor-enter p0

    .line 64
    const/4 v0, 0x0

    .line 48
    .local v0, "$i$a$-synchronized-ChatStore$title$1":I
    :try_start_0
    invoke-direct {p0}, Lcom/pymcl/ai/ChatStore;->load()Ljava/util/Map;

    move-result-object v1

    invoke-direct {p0, v1, p1}, Lcom/pymcl/ai/ChatStore;->find(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "title"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "\u65b0\u5bf9\u8bdd"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-ChatStore$title$1":I
    :cond_1
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
