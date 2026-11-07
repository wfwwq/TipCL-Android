.class public final Lcom/pymcl/multiplayer/MultiplayerState$Companion;
.super Ljava/lang/Object;
.source "MultiplayerController.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/multiplayer/MultiplayerState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultiplayerController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiplayerController.kt\ncom/pymcl/multiplayer/MultiplayerState$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1#2:169\n1739#3:170\n1814#3,3:171\n*S KotlinDebug\n*F\n+ 1 MultiplayerController.kt\ncom/pymcl/multiplayer/MultiplayerState$Companion\n*L\n52#1:170\n52#1:171,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cJ\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/pymcl/multiplayer/MultiplayerState$Companion;",
        "",
        "<init>",
        "()V",
        "EXCEPTIONS",
        "",
        "",
        "getEXCEPTIONS",
        "()Ljava/util/List;",
        "isNewer",
        "",
        "index",
        "",
        "last",
        "parse",
        "Lkotlin/Pair;",
        "Lcom/pymcl/multiplayer/MultiplayerState;",
        "json",
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
.field static final synthetic $$INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$Companion;

.field private static final EXCEPTIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/multiplayer/MultiplayerState$Companion;

    invoke-direct {v0}, Lcom/pymcl/multiplayer/MultiplayerState$Companion;-><init>()V

    sput-object v0, Lcom/pymcl/multiplayer/MultiplayerState$Companion;->$$INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$Companion;

    .line 42
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "\u52a0\u5165\u623f\u95f4\u5931\u8d25\uff1a\u627e\u4e0d\u5230\u623f\u4e3b"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "\u623f\u95f4\u8fde\u63a5\u65ad\u5f00"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "\u52a0\u5165\u623f\u95f4\u5931\u8d25\uff1aEasyTier \u5df2\u5d29\u6e83"

    aput-object v2, v0, v1

    .line 43
    const-string v1, "\u521b\u5efa\u623f\u95f4\u5931\u8d25\uff1aEasyTier \u5df2\u5d29\u6e83"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 42
    nop

    .line 43
    const-string v1, "\u623f\u95f4\u5df2\u5173\u95ed\uff1a\u60a8\u5df2\u9000\u51fa\u6e38\u620f\u4e16\u754c"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 42
    nop

    .line 43
    const-string v1, "\u534f\u8bae\u9519\u8bef\uff1a\u623f\u4e3b\u53d1\u9001\u4e86\u9519\u8bef\u7684\u54cd\u5e94\u6570\u636e"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 42
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/multiplayer/MultiplayerState$Companion;->EXCEPTIONS:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final parse$profiles(Lcom/google/gson/JsonObject;)Ljava/util/List;
    .locals 17
    .param p0, "o"    # Lcom/google/gson/JsonObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonObject;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/multiplayer/TerracottaProfile;",
            ">;"
        }
    .end annotation

    .line 52
    const-string v0, "profiles"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/google/gson/JsonObject;->getAsJsonArray(Ljava/lang/String;)Lcom/google/gson/JsonArray;

    move-result-object v0

    if-eqz v0, :cond_7

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 170
    .local v2, "$i$f$map":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v0

    .local v4, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 171
    .local v5, "$i$f$mapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 172
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/google/gson/JsonElement;

    .local v8, "p":Lcom/google/gson/JsonElement;
    const/4 v9, 0x0

    .line 52
    .local v9, "$i$a$-map-MultiplayerState$Companion$parse$profiles$1":I
    invoke-virtual {v8}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v10

    .local v10, "it":Lcom/google/gson/JsonObject;
    const/4 v11, 0x0

    .line 53
    .local v11, "$i$a$-let-MultiplayerState$Companion$parse$profiles$1$1":I
    new-instance v12, Lcom/pymcl/multiplayer/TerracottaProfile;

    const-string v13, "name"

    invoke-virtual {v10, v13}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v13

    const-string v14, ""

    if-eqz v13, :cond_0

    invoke-virtual {v13}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_1

    :cond_0
    move-object v13, v14

    :cond_1
    const-string v15, "vendor"

    invoke-virtual {v10, v15}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v15

    if-eqz v15, :cond_2

    invoke-virtual {v15}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_3

    :cond_2
    move-object v15, v14

    :cond_3
    move-object/from16 v16, v0

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .local v16, "$this$map$iv":Ljava/lang/Iterable;
    const-string v0, "kind"

    invoke-virtual {v10, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    move-object v14, v0

    :cond_5
    :goto_1
    invoke-direct {v12, v13, v15, v14}, Lcom/pymcl/multiplayer/TerracottaProfile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .end local v10    # "it":Lcom/google/gson/JsonObject;
    .end local v11    # "$i$a$-let-MultiplayerState$Companion$parse$profiles$1$1":I
    nop

    .line 53
    nop

    .line 172
    .end local v8    # "p":Lcom/google/gson/JsonElement;
    .end local v9    # "$i$a$-map-MultiplayerState$Companion$parse$profiles$1":I
    invoke-interface {v3, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v16

    goto :goto_0

    .line 173
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    .end local v16    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$map$iv":Ljava/lang/Iterable;
    :cond_6
    move-object/from16 v16, v0

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    .restart local v16    # "$this$map$iv":Ljava/lang/Iterable;
    move-object v0, v3

    check-cast v0, Ljava/util/List;

    .line 170
    nop

    .end local v2    # "$i$f$map":I
    .end local v16    # "$this$map$iv":Ljava/lang/Iterable;
    goto :goto_2

    .line 52
    :cond_7
    const/4 v0, 0x0

    .line 53
    :goto_2
    if-nez v0, :cond_8

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_8
    return-object v0
.end method


# virtual methods
.method public final getEXCEPTIONS()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 42
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerState$Companion;->EXCEPTIONS:Ljava/util/List;

    return-object v0
.end method

.method public final isNewer(II)Z
    .locals 1
    .param p1, "index"    # I
    .param p2, "last"    # I

    .line 46
    if-eq p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final parse(Ljava/lang/String;)Lkotlin/Pair;
    .locals 8
    .param p1, "json"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Lcom/pymcl/multiplayer/MultiplayerState;",
            ">;"
        }
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-static {p1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v0

    .line 51
    .local v0, "o":Lcom/google/gson/JsonObject;
    const-string v1, "index"

    invoke-virtual {v0, v1}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    .line 54
    .local v1, "idx":I
    :goto_0
    const-string v3, "state"

    invoke-virtual {v0, v3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v4

    .local v3, "s":Ljava/lang/String;
    :goto_1
    if-eqz v3, :cond_13

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v5

    const-string v6, ""

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_6

    :sswitch_0
    const-string v4, "exception"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_6

    .line 62
    :cond_2
    const-string v4, "type"

    invoke-virtual {v0, v4}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result v2

    .local v2, "t":I
    :cond_3
    sget-object v4, Lcom/pymcl/multiplayer/MultiplayerState$Companion;->EXCEPTIONS:Ljava/util/List;

    const/4 v5, 0x0

    if-ltz v2, :cond_4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v2, v6, :cond_4

    const/4 v5, 0x1

    :cond_4
    if-eqz v5, :cond_5

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    goto :goto_2

    .line 169
    :cond_5
    move v4, v2

    .local v4, "it":I
    const/4 v5, 0x0

    .line 62
    .local v5, "$i$a$-getOrElse-MultiplayerState$Companion$parse$st$2":I
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u8054\u673a\u51fa\u9519 ("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ")"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .end local v4    # "it":I
    .end local v5    # "$i$a$-getOrElse-MultiplayerState$Companion$parse$st$2":I
    :goto_2
    check-cast v4, Ljava/lang/String;

    new-instance v5, Lcom/pymcl/multiplayer/MultiplayerState$Error;

    invoke-direct {v5, v2, v4}, Lcom/pymcl/multiplayer/MultiplayerState$Error;-><init>(ILjava/lang/String;)V

    .end local v2    # "t":I
    check-cast v5, Lcom/pymcl/multiplayer/MultiplayerState;

    goto/16 :goto_7

    .line 54
    :sswitch_1
    const-string v4, "waiting"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_6

    .line 55
    :cond_6
    sget-object v2, Lcom/pymcl/multiplayer/MultiplayerState$Waiting;->INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$Waiting;

    move-object v5, v2

    check-cast v5, Lcom/pymcl/multiplayer/MultiplayerState;

    goto/16 :goto_7

    .line 54
    :sswitch_2
    const-string v4, "host-ok"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_6

    .line 58
    :cond_7
    new-instance v2, Lcom/pymcl/multiplayer/MultiplayerState$HostOk;

    const-string v4, "room"

    invoke-virtual {v0, v4}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_8

    goto :goto_3

    :cond_8
    move-object v6, v4

    :cond_9
    :goto_3
    invoke-static {v0}, Lcom/pymcl/multiplayer/MultiplayerState$Companion;->parse$profiles(Lcom/google/gson/JsonObject;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v2, v6, v4}, Lcom/pymcl/multiplayer/MultiplayerState$HostOk;-><init>(Ljava/lang/String;Ljava/util/List;)V

    move-object v5, v2

    check-cast v5, Lcom/pymcl/multiplayer/MultiplayerState;

    goto/16 :goto_7

    .line 54
    :sswitch_3
    const-string v4, "host-starting"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto/16 :goto_6

    .line 57
    :cond_a
    sget-object v2, Lcom/pymcl/multiplayer/MultiplayerState$HostStarting;->INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$HostStarting;

    move-object v5, v2

    check-cast v5, Lcom/pymcl/multiplayer/MultiplayerState;

    goto/16 :goto_7

    .line 54
    :sswitch_4
    const-string v5, "guest-starting"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_6

    .line 60
    :cond_b
    const-string v2, "difficulty"

    invoke-virtual {v0, v2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    if-eqz v2, :cond_d

    move-object v5, v2

    .line 169
    .local v5, "it":Lcom/google/gson/JsonElement;
    const/4 v6, 0x0

    .line 60
    .local v6, "$i$a$-takeIf-MultiplayerState$Companion$parse$st$1":I
    invoke-virtual {v5}, Lcom/google/gson/JsonElement;->isJsonNull()Z

    move-result v7

    .end local v5    # "it":Lcom/google/gson/JsonElement;
    .end local v6    # "$i$a$-takeIf-MultiplayerState$Companion$parse$st$1":I
    if-nez v7, :cond_c

    goto :goto_4

    :cond_c
    move-object v2, v4

    :goto_4
    if-eqz v2, :cond_d

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v4

    :cond_d
    new-instance v2, Lcom/pymcl/multiplayer/MultiplayerState$GuestStarting;

    invoke-direct {v2, v4}, Lcom/pymcl/multiplayer/MultiplayerState$GuestStarting;-><init>(Ljava/lang/String;)V

    move-object v5, v2

    check-cast v5, Lcom/pymcl/multiplayer/MultiplayerState;

    goto :goto_7

    .line 54
    :sswitch_5
    const-string v4, "guest-ok"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_6

    .line 61
    :cond_e
    new-instance v2, Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;

    const-string v4, "url"

    invoke-virtual {v0, v4}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v4

    if-eqz v4, :cond_10

    invoke-virtual {v4}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_f

    goto :goto_5

    :cond_f
    move-object v6, v4

    :cond_10
    :goto_5
    invoke-static {v0}, Lcom/pymcl/multiplayer/MultiplayerState$Companion;->parse$profiles(Lcom/google/gson/JsonObject;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v2, v6, v4}, Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;-><init>(Ljava/lang/String;Ljava/util/List;)V

    move-object v5, v2

    check-cast v5, Lcom/pymcl/multiplayer/MultiplayerState;

    goto :goto_7

    .line 54
    :sswitch_6
    const-string v4, "host-scanning"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_6

    .line 56
    :cond_11
    sget-object v2, Lcom/pymcl/multiplayer/MultiplayerState$HostScanning;->INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$HostScanning;

    move-object v5, v2

    check-cast v5, Lcom/pymcl/multiplayer/MultiplayerState;

    goto :goto_7

    .line 54
    :sswitch_7
    const-string v4, "guest-connecting"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    goto :goto_6

    .line 59
    :cond_12
    sget-object v2, Lcom/pymcl/multiplayer/MultiplayerState$GuestConnecting;->INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$GuestConnecting;

    move-object v5, v2

    check-cast v5, Lcom/pymcl/multiplayer/MultiplayerState;

    goto :goto_7

    .line 63
    :cond_13
    :goto_6
    new-instance v4, Lcom/pymcl/multiplayer/MultiplayerState$Error;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u672a\u77e5\u72b6\u6001 "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v2, v5}, Lcom/pymcl/multiplayer/MultiplayerState$Error;-><init>(ILjava/lang/String;)V

    move-object v5, v4

    check-cast v5, Lcom/pymcl/multiplayer/MultiplayerState;

    .line 54
    .end local v3    # "s":Ljava/lang/String;
    :goto_7
    nop

    .line 65
    .local v5, "st":Lcom/pymcl/multiplayer/MultiplayerState;
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7134da33 -> :sswitch_7
        -0x55bbbcca -> :sswitch_6
        -0x544a660f -> :sswitch_5
        -0x2243b76b -> :sswitch_4
        0x2dc94ac5 -> :sswitch_3
        0x417c0021 -> :sswitch_2
        0x4289964d -> :sswitch_1
        0x584fd04f -> :sswitch_0
    .end sparse-switch
.end method
