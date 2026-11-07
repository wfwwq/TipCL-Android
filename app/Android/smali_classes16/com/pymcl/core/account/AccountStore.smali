.class public final Lcom/pymcl/core/account/AccountStore;
.super Ljava/lang/Object;
.source "Accounts.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/account/AccountStore$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAccounts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Accounts.kt\ncom/pymcl/core/account/AccountStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1739#2:130\n1814#2,2:131\n1816#2:134\n296#2,2:135\n296#2,2:137\n1739#2:139\n1814#2,3:140\n777#2:143\n873#2,2:144\n777#2:146\n873#2,2:147\n1960#2,3:149\n1960#2,3:152\n296#2,2:155\n1#3:133\n*S KotlinDebug\n*F\n+ 1 Accounts.kt\ncom/pymcl/core/account/AccountStore\n*L\n91#1:130\n91#1:131,2\n91#1:134\n103#1:135,2\n104#1:137,2\n108#1:139\n108#1:140,3\n115#1:143\n115#1:144,2\n119#1:146\n119#1:147,2\n121#1:149,3\n122#1:152,3\n125#1:155,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\r0\u0010J\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\r0\u0013J\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\rJ\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0011J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\rH\u0002J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/pymcl/core/account/AccountStore;",
        "",
        "paths",
        "Lcom/pymcl/core/config/LauncherPaths;",
        "cipher",
        "Lcom/pymcl/core/account/TokenCipher;",
        "<init>",
        "(Lcom/pymcl/core/config/LauncherPaths;Lcom/pymcl/core/account/TokenCipher;)V",
        "getCipher",
        "()Lcom/pymcl/core/account/TokenCipher;",
        "setCipher",
        "(Lcom/pymcl/core/account/TokenCipher;)V",
        "tokenKeys",
        "",
        "",
        "loadFull",
        "Lkotlin/Triple;",
        "Lcom/pymcl/core/account/Account;",
        "load",
        "Lkotlin/Pair;",
        "list",
        "active",
        "save",
        "",
        "activeKey",
        "upsert",
        "acc",
        "makeActive",
        "",
        "remove",
        "key",
        "setActive",
        "name",
        "Companion",
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
.field public static final ACTIVE_KEY:Ljava/lang/String; = "active_key"

.field public static final Companion:Lcom/pymcl/core/account/AccountStore$Companion;

.field private static volatile lastInstance:Lcom/pymcl/core/account/AccountStore;


# instance fields
.field private cipher:Lcom/pymcl/core/account/TokenCipher;

.field private final paths:Lcom/pymcl/core/config/LauncherPaths;

.field private final tokenKeys:Ljava/util/List;
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
    .locals 2

    new-instance v0, Lcom/pymcl/core/account/AccountStore$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/account/AccountStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/account/AccountStore;->Companion:Lcom/pymcl/core/account/AccountStore$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/core/config/LauncherPaths;Lcom/pymcl/core/account/TokenCipher;)V
    .locals 3
    .param p1, "paths"    # Lcom/pymcl/core/config/LauncherPaths;
    .param p2, "cipher"    # Lcom/pymcl/core/account/TokenCipher;

    const-string v0, "paths"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cipher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/account/AccountStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    iput-object p2, p0, Lcom/pymcl/core/account/AccountStore;->cipher:Lcom/pymcl/core/account/TokenCipher;

    .line 85
    sput-object p0, Lcom/pymcl/core/account/AccountStore;->lastInstance:Lcom/pymcl/core/account/AccountStore;

    .line 86
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "access_token"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "refresh_token"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/core/account/AccountStore;->tokenKeys:Ljava/util/List;

    .line 75
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/core/config/LauncherPaths;Lcom/pymcl/core/account/TokenCipher;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 75
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lcom/pymcl/core/account/PlainTokenCipher;->INSTANCE:Lcom/pymcl/core/account/PlainTokenCipher;

    check-cast p2, Lcom/pymcl/core/account/TokenCipher;

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/pymcl/core/account/AccountStore;-><init>(Lcom/pymcl/core/config/LauncherPaths;Lcom/pymcl/core/account/TokenCipher;)V

    return-void
.end method

.method public static final synthetic access$getLastInstance$cp()Lcom/pymcl/core/account/AccountStore;
    .locals 1

    .line 75
    sget-object v0, Lcom/pymcl/core/account/AccountStore;->lastInstance:Lcom/pymcl/core/account/AccountStore;

    return-object v0
.end method

.method public static final synthetic access$setLastInstance$cp(Lcom/pymcl/core/account/AccountStore;)V
    .locals 0
    .param p0, "<set-?>"    # Lcom/pymcl/core/account/AccountStore;

    .line 75
    sput-object p0, Lcom/pymcl/core/account/AccountStore;->lastInstance:Lcom/pymcl/core/account/AccountStore;

    return-void
.end method

.method private final declared-synchronized save(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 22
    .param p1, "active"    # Ljava/lang/String;
    .param p2, "activeKey"    # Ljava/lang/String;
    .param p3, "list"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/core/account/Account;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p0

    monitor-enter p0

    .line 108
    :try_start_0
    move-object/from16 v0, p3

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 139
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

    .line 140
    .local v5, "$i$f$mapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 141
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v7

    check-cast v10, Lcom/pymcl/core/account/Account;

    .local v10, "a":Lcom/pymcl/core/account/Account;
    const/4 v11, 0x0

    .line 108
    .local v11, "$i$a$-map-AccountStore$save$out$1":I
    invoke-virtual {v10}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v12

    invoke-static {v12}, Lcom/pymcl/core/util/JsonKt;->deepCopy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v13, v12

    .local v13, "m":Ljava/util/Map;
    const/4 v14, 0x0

    .line 109
    .local v14, "$i$a$-also-AccountStore$save$out$1$1":I
    iget-object v15, v1, Lcom/pymcl/core/account/AccountStore;->tokenKeys:Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/String;

    move-object/from16 v17, v16

    move-object/from16 v8, v17

    const/16 v16, 0x1

    const/16 v17, 0x0

    .local v8, "k":Ljava/lang/String;
    invoke-interface {v13, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v18, v0

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .local v18, "$this$map$iv":Ljava/lang/Iterable;
    instance-of v0, v9, Ljava/lang/String;

    const/16 v19, 0x0

    if-eqz v0, :cond_0

    check-cast v9, Ljava/lang/String;

    goto :goto_2

    .end local p0    # "this":Lcom/pymcl/core/account/AccountStore;
    :cond_0
    move-object/from16 v9, v19

    :goto_2
    if-eqz v9, :cond_3

    move-object v0, v9

    .line 133
    .local v0, "it":Ljava/lang/String;
    const/16 v20, 0x0

    .line 109
    .local v20, "$i$a$-takeIf-AccountStore$save$out$1$1$1":I
    move-object/from16 v21, v0

    check-cast v21, Ljava/lang/CharSequence;

    invoke-interface/range {v21 .. v21}, Ljava/lang/CharSequence;->length()I

    move-result v21

    if-lez v21, :cond_1

    move/from16 v21, v16

    goto :goto_3

    :cond_1
    move/from16 v21, v17

    .end local v0    # "it":Ljava/lang/String;
    .end local v20    # "$i$a$-takeIf-AccountStore$save$out$1$1$1":I
    :goto_3
    if-eqz v21, :cond_2

    move-object/from16 v19, v9

    :cond_2
    if-eqz v19, :cond_3

    move-object/from16 v0, v19

    .line 133
    .restart local v0    # "it":Ljava/lang/String;
    const/4 v9, 0x0

    .line 109
    .local v9, "$i$a$-let-AccountStore$save$out$1$1$2":I
    move/from16 v19, v2

    .end local v2    # "$i$f$map":I
    .local v19, "$i$f$map":I
    iget-object v2, v1, Lcom/pymcl/core/account/AccountStore;->cipher:Lcom/pymcl/core/account/TokenCipher;

    invoke-interface {v2, v0}, Lcom/pymcl/core/account/TokenCipher;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v13, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v18

    move/from16 v2, v19

    .end local v0    # "it":Ljava/lang/String;
    .end local v9    # "$i$a$-let-AccountStore$save$out$1$1$2":I
    goto :goto_1

    .end local v19    # "$i$f$map":I
    .restart local v2    # "$i$f$map":I
    :cond_3
    move/from16 v19, v2

    .end local v2    # "$i$f$map":I
    .restart local v19    # "$i$f$map":I
    move-object/from16 v0, v18

    move/from16 v2, v19

    .end local v8    # "k":Ljava/lang/String;
    goto :goto_1

    .end local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$map":I
    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    .restart local v2    # "$i$f$map":I
    :cond_4
    move-object/from16 v18, v0

    move/from16 v19, v2

    .line 108
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map":I
    .end local v13    # "m":Ljava/util/Map;
    .end local v14    # "$i$a$-also-AccountStore$save$out$1$1":I
    .restart local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v19    # "$i$f$map":I
    nop

    .line 109
    nop

    .line 141
    .end local v10    # "a":Lcom/pymcl/core/account/Account;
    .end local v11    # "$i$a$-map-AccountStore$save$out$1":I
    invoke-interface {v3, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v18

    move/from16 v2, v19

    goto/16 :goto_0

    .line 142
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    .end local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$map":I
    .restart local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v2    # "$i$f$map":I
    :cond_5
    move-object/from16 v18, v0

    move/from16 v19, v2

    const/16 v16, 0x1

    const/16 v17, 0x0

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map":I
    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    .restart local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v19    # "$i$f$map":I
    move-object v0, v3

    check-cast v0, Ljava/util/List;

    .line 139
    nop

    .line 108
    .end local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$map":I
    nop

    .line 110
    .local v0, "out":Ljava/util/List;
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v3, v1, Lcom/pymcl/core/account/AccountStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v3}, Lcom/pymcl/core/config/LauncherPaths;->getAccountsFile()Ljava/io/File;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Lkotlin/Pair;

    const-string v5, "active"

    move-object/from16 v6, p1

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v17

    const-string v5, "active_key"

    move-object/from16 v7, p2

    invoke-static {v5, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v16

    const-string v5, "accounts"

    move-object v8, v0

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v8, 0x2

    aput-object v5, v4, v8

    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    monitor-exit p0

    return-void

    .line 107
    .end local v0    # "out":Ljava/util/List;
    .end local p1    # "active":Ljava/lang/String;
    .end local p2    # "activeKey":Ljava/lang/String;
    .end local p3    # "list":Ljava/util/List;
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static synthetic upsert$default(Lcom/pymcl/core/account/AccountStore;Lcom/pymcl/core/account/Account;ZILjava/lang/Object;)V
    .locals 0

    .line 113
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/account/AccountStore;->upsert(Lcom/pymcl/core/account/Account;Z)V

    return-void
.end method


# virtual methods
.method public final active()Lcom/pymcl/core/account/Account;
    .locals 11

    .line 102
    invoke-virtual {p0}, Lcom/pymcl/core/account/AccountStore;->loadFull()Lkotlin/Triple;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .local v1, "act":Ljava/lang/String;
    invoke-virtual {v0}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .local v2, "key":Ljava/lang/String;
    invoke-virtual {v0}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 103
    .local v0, "l":Ljava/util/List;
    move-object v3, v2

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x0

    if-eqz v3, :cond_3

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 135
    .local v5, "$i$f$firstOrNull":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/core/account/Account;

    .local v8, "it":Lcom/pymcl/core/account/Account;
    const/4 v9, 0x0

    .line 103
    .local v9, "$i$a$-firstOrNull-AccountStore$active$1":I
    invoke-virtual {v8}, Lcom/pymcl/core/account/Account;->getKey()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    .line 135
    .end local v8    # "it":Lcom/pymcl/core/account/Account;
    .end local v9    # "$i$a$-firstOrNull-AccountStore$active$1":I
    if-eqz v8, :cond_1

    goto :goto_1

    .line 136
    .end local v7    # "element$iv":Ljava/lang/Object;
    :cond_2
    move-object v7, v4

    .line 103
    .end local v3    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$firstOrNull":I
    :goto_1
    check-cast v7, Lcom/pymcl/core/account/Account;

    if-eqz v7, :cond_3

    .line 133
    .local v7, "it":Lcom/pymcl/core/account/Account;
    const/4 v3, 0x0

    .line 103
    .local v3, "$i$a$-let-AccountStore$active$2":I
    return-object v7

    .line 104
    .end local v3    # "$i$a$-let-AccountStore$active$2":I
    .end local v7    # "it":Lcom/pymcl/core/account/Account;
    :cond_3
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 137
    .restart local v5    # "$i$f$firstOrNull":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/core/account/Account;

    .restart local v8    # "it":Lcom/pymcl/core/account/Account;
    const/4 v9, 0x0

    .line 104
    .local v9, "$i$a$-firstOrNull-AccountStore$active$3":I
    invoke-virtual {v8}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    .line 137
    .end local v8    # "it":Lcom/pymcl/core/account/Account;
    .end local v9    # "$i$a$-firstOrNull-AccountStore$active$3":I
    if-eqz v8, :cond_4

    move-object v4, v7

    goto :goto_2

    .line 138
    .end local v7    # "element$iv":Ljava/lang/Object;
    :cond_5
    nop

    .line 104
    .end local v3    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$firstOrNull":I
    :goto_2
    check-cast v4, Lcom/pymcl/core/account/Account;

    if-nez v4, :cond_6

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/pymcl/core/account/Account;

    :cond_6
    return-object v4
.end method

.method public final getCipher()Lcom/pymcl/core/account/TokenCipher;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/pymcl/core/account/AccountStore;->cipher:Lcom/pymcl/core/account/TokenCipher;

    return-object v0
.end method

.method public final list()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/core/account/Account;",
            ">;"
        }
    .end annotation

    .line 99
    invoke-virtual {p0}, Lcom/pymcl/core/account/AccountStore;->load()Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final declared-synchronized load()Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/core/account/Account;",
            ">;>;"
        }
    .end annotation

    monitor-enter p0

    .line 98
    :try_start_0
    invoke-virtual {p0}, Lcom/pymcl/core/account/AccountStore;->loadFull()Lkotlin/Triple;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .local v1, "n":Ljava/lang/String;
    invoke-virtual {v0}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .local v0, "l":Ljava/util/List;
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v2

    .line 98
    .end local v0    # "l":Ljava/util/List;
    .end local v1    # "n":Ljava/lang/String;
    .end local p0    # "this":Lcom/pymcl/core/account/AccountStore;
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized loadFull()Lkotlin/Triple;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Triple<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/core/account/Account;",
            ">;>;"
        }
    .end annotation

    move-object/from16 v1, p0

    monitor-enter p0

    .line 90
    :try_start_0
    sget-object v0, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v2, v1, Lcom/pymcl/core/account/AccountStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v2}, Lcom/pymcl/core/config/LauncherPaths;->getAccountsFile()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    new-array v0, v2, [Lkotlin/Pair;

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 91
    .end local p0    # "this":Lcom/pymcl/core/account/AccountStore;
    .local v0, "o":Ljava/util/Map;
    :cond_0
    const-string v3, "accounts"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 130
    .local v4, "$i$f$map":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 131
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 132
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/util/Map;

    .local v10, "a":Ljava/util/Map;
    const/4 v11, 0x0

    .line 92
    .local v11, "$i$a$-map-AccountStore$loadFull$list$1":I
    invoke-static {v10}, Lcom/pymcl/core/util/JsonKt;->deepCopy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 93
    .local v12, "m":Ljava/util/Map;
    iget-object v13, v1, Lcom/pymcl/core/account/AccountStore;->tokenKeys:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .local v14, "k":Ljava/lang/String;
    invoke-interface {v12, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    instance-of v2, v15, Ljava/lang/String;

    move/from16 v17, v2

    if-eqz v17, :cond_1

    check-cast v15, Ljava/lang/String;

    goto :goto_2

    :cond_1
    const/4 v15, 0x0

    :goto_2
    if-eqz v15, :cond_6

    .line 133
    .local v15, "v":Ljava/lang/String;
    const/16 v17, 0x0

    .line 93
    .local v17, "$i$a$-let-AccountStore$loadFull$list$1$1":I
    iget-object v2, v1, Lcom/pymcl/core/account/AccountStore;->cipher:Lcom/pymcl/core/account/TokenCipher;

    invoke-interface {v2}, Lcom/pymcl/core/account/TokenCipher;->getPrefix()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_3

    :cond_2
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/pymcl/core/account/AccountStore;->cipher:Lcom/pymcl/core/account/TokenCipher;

    invoke-interface {v2}, Lcom/pymcl/core/account/TokenCipher;->getPrefix()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v18, v3

    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .local v18, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x2

    move/from16 v19, v4

    move-object/from16 v16, v6

    const/4 v4, 0x0

    const/4 v6, 0x0

    .end local v4    # "$i$f$map":I
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .local v16, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .local v19, "$i$f$map":I
    invoke-static {v15, v2, v6, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, v1, Lcom/pymcl/core/account/AccountStore;->cipher:Lcom/pymcl/core/account/TokenCipher;

    invoke-interface {v2, v15}, Lcom/pymcl/core/account/TokenCipher;->decrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    :goto_4
    const-string v2, ""

    goto :goto_5

    .end local v16    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$map":I
    .restart local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v4    # "$i$f$map":I
    .restart local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    :cond_3
    move-object/from16 v18, v3

    move/from16 v19, v4

    move-object/from16 v16, v6

    const/4 v6, 0x0

    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map":I
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v16    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v19    # "$i$f$map":I
    :cond_4
    sget-object v2, Lcom/pymcl/core/account/PlainTokenCipher;->INSTANCE:Lcom/pymcl/core/account/PlainTokenCipher;

    invoke-virtual {v2, v15}, Lcom/pymcl/core/account/PlainTokenCipher;->decrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    :goto_5
    invoke-interface {v12, v14, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v2, v6

    move-object/from16 v6, v16

    move-object/from16 v3, v18

    move/from16 v4, v19

    .end local v15    # "v":Ljava/lang/String;
    .end local v17    # "$i$a$-let-AccountStore$loadFull$list$1$1":I
    goto :goto_1

    .end local v16    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$map":I
    .restart local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v4    # "$i$f$map":I
    .restart local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    :cond_6
    move-object/from16 v18, v3

    move/from16 v19, v4

    move-object/from16 v16, v6

    const/4 v6, 0x0

    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map":I
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v16    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v19    # "$i$f$map":I
    move v2, v6

    move-object/from16 v6, v16

    .end local v14    # "k":Ljava/lang/String;
    goto :goto_1

    .line 94
    .end local v16    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$map":I
    .restart local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v4    # "$i$f$map":I
    .restart local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    :cond_7
    move-object/from16 v18, v3

    move/from16 v19, v4

    move-object/from16 v16, v6

    move v6, v2

    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map":I
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v16    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v19    # "$i$f$map":I
    new-instance v2, Lcom/pymcl/core/account/Account;

    invoke-direct {v2, v12}, Lcom/pymcl/core/account/Account;-><init>(Ljava/util/Map;)V

    .line 132
    .end local v10    # "a":Ljava/util/Map;
    .end local v11    # "$i$a$-map-AccountStore$loadFull$list$1":I
    .end local v12    # "m":Ljava/util/Map;
    invoke-interface {v5, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v6

    move-object/from16 v6, v16

    move-object/from16 v3, v18

    move/from16 v4, v19

    goto/16 :goto_0

    .line 134
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    .end local v16    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$map":I
    .restart local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v4    # "$i$f$map":I
    .restart local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    :cond_8
    move-object/from16 v18, v3

    move/from16 v19, v4

    move-object/from16 v16, v6

    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map":I
    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    .restart local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v19    # "$i$f$map":I
    move-object v2, v5

    check-cast v2, Ljava/util/List;

    .line 130
    nop

    .line 91
    .end local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$map":I
    nop

    .line 96
    .local v2, "list":Ljava/util/List;
    new-instance v3, Lkotlin/Triple;

    const-string v4, "active"

    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_9

    const-string v4, ""

    :cond_9
    const-string v5, "active_key"

    invoke-static {v0, v5}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_a

    const-string v5, ""

    :cond_a
    invoke-direct {v3, v4, v5, v2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v3

    .line 89
    .end local v0    # "o":Ljava/util/Map;
    .end local v2    # "list":Ljava/util/List;
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized remove(Ljava/lang/String;)V
    .locals 14
    .param p1, "key"    # Ljava/lang/String;

    monitor-enter p0

    :try_start_0
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    invoke-virtual {p0}, Lcom/pymcl/core/account/AccountStore;->loadFull()Lkotlin/Triple;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .local v1, "act":Ljava/lang/String;
    invoke-virtual {v0}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .local v2, "curKey":Ljava/lang/String;
    invoke-virtual {v0}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .local v0, "l":Ljava/util/List;
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 146
    .local v4, "$i$f$filter":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 147
    .local v7, "$i$f$filterTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lcom/pymcl/core/account/Account;

    .local v10, "it":Lcom/pymcl/core/account/Account;
    const/4 v11, 0x0

    .line 119
    .local v11, "$i$a$-filter-AccountStore$remove$nl$1":I
    invoke-virtual {v10}, Lcom/pymcl/core/account/Account;->getKey()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    .line 147
    .end local v10    # "it":Lcom/pymcl/core/account/Account;
    .end local v11    # "$i$a$-filter-AccountStore$remove$nl$1":I
    if-nez v12, :cond_0

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 148
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    .end local p0    # "this":Lcom/pymcl/core/account/AccountStore;
    :cond_1
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filterTo":I
    check-cast v5, Ljava/util/List;

    .line 146
    nop

    .line 119
    .end local v3    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filter":I
    nop

    .line 121
    .local v5, "nl":Ljava/util/List;
    move-object v3, v5

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 149
    .local v4, "$i$f$any":I
    instance-of v6, v3, Ljava/util/Collection;

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v6, :cond_2

    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    move v3, v8

    goto :goto_1

    .line 150
    :cond_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lcom/pymcl/core/account/Account;

    .restart local v10    # "it":Lcom/pymcl/core/account/Account;
    const/4 v11, 0x0

    .line 121
    .local v11, "$i$a$-any-AccountStore$remove$keepKey$1":I
    invoke-virtual {v10}, Lcom/pymcl/core/account/Account;->getKey()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    .line 150
    .end local v10    # "it":Lcom/pymcl/core/account/Account;
    .end local v11    # "$i$a$-any-AccountStore$remove$keepKey$1":I
    if-eqz v12, :cond_3

    move v3, v7

    goto :goto_1

    .line 151
    .end local v9    # "element$iv":Ljava/lang/Object;
    :cond_4
    move v3, v8

    .line 121
    .end local v3    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$any":I
    :goto_1
    if-eqz v3, :cond_5

    move-object v3, v2

    goto :goto_2

    :cond_5
    const-string v3, ""

    .line 122
    .local v3, "keepKey":Ljava/lang/String;
    :goto_2
    move-object v4, v5

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 152
    .local v6, "$i$f$any":I
    instance-of v9, v4, Ljava/util/Collection;

    if-eqz v9, :cond_6

    move-object v9, v4

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_6

    move v7, v8

    goto :goto_3

    .line 153
    :cond_6
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/core/account/Account;

    .local v11, "it":Lcom/pymcl/core/account/Account;
    const/4 v12, 0x0

    .line 122
    .local v12, "$i$a$-any-AccountStore$remove$1":I
    invoke-virtual {v11}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    .line 153
    .end local v11    # "it":Lcom/pymcl/core/account/Account;
    .end local v12    # "$i$a$-any-AccountStore$remove$1":I
    if-eqz v13, :cond_7

    goto :goto_3

    .line 154
    .end local v10    # "element$iv":Ljava/lang/Object;
    :cond_8
    move v7, v8

    .line 122
    .end local v4    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$any":I
    :goto_3
    if-eqz v7, :cond_9

    move-object v4, v1

    goto :goto_4

    :cond_9
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/pymcl/core/account/Account;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_b

    :cond_a
    const-string v4, ""

    :cond_b
    :goto_4
    invoke-direct {p0, v4, v3, v5}, Lcom/pymcl/core/account/AccountStore;->save(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    monitor-exit p0

    return-void

    .line 118
    .end local v0    # "l":Ljava/util/List;
    .end local v1    # "act":Ljava/lang/String;
    .end local v2    # "curKey":Ljava/lang/String;
    .end local v3    # "keepKey":Ljava/lang/String;
    .end local v5    # "nl":Ljava/util/List;
    .end local p1    # "key":Ljava/lang/String;
    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized setActive(Lcom/pymcl/core/account/Account;)V
    .locals 3
    .param p1, "acc"    # Lcom/pymcl/core/account/Account;

    monitor-enter p0

    :try_start_0
    const-string v0, "acc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    invoke-virtual {p0}, Lcom/pymcl/core/account/AccountStore;->loadFull()Lkotlin/Triple;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .local v0, "l":Ljava/util/List;
    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2, v0}, Lcom/pymcl/core/account/AccountStore;->save(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    .line 127
    .end local v0    # "l":Ljava/util/List;
    .end local p0    # "this":Lcom/pymcl/core/account/AccountStore;
    .end local p1    # "acc":Lcom/pymcl/core/account/Account;
    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized setActive(Ljava/lang/String;)V
    .locals 8
    .param p1, "name"    # Ljava/lang/String;

    monitor-enter p0

    :try_start_0
    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    invoke-virtual {p0}, Lcom/pymcl/core/account/AccountStore;->loadFull()Lkotlin/Triple;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .local v0, "l":Ljava/util/List;
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 155
    .local v2, "$i$f$firstOrNull":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Lcom/pymcl/core/account/Account;

    .local v5, "it":Lcom/pymcl/core/account/Account;
    const/4 v6, 0x0

    .line 125
    .local v6, "$i$a$-firstOrNull-AccountStore$setActive$1":I
    invoke-virtual {v5}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    .line 155
    .end local v5    # "it":Lcom/pymcl/core/account/Account;
    .end local v6    # "$i$a$-firstOrNull-AccountStore$setActive$1":I
    if-eqz v7, :cond_0

    goto :goto_0

    .line 156
    .end local v4    # "element$iv":Ljava/lang/Object;
    .end local p0    # "this":Lcom/pymcl/core/account/AccountStore;
    :cond_1
    const/4 v4, 0x0

    .line 125
    .end local v1    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$firstOrNull":I
    :goto_0
    check-cast v4, Lcom/pymcl/core/account/Account;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/pymcl/core/account/Account;->getKey()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    const-string v1, ""

    :cond_3
    invoke-direct {p0, p1, v1, v0}, Lcom/pymcl/core/account/AccountStore;->save(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    .line 124
    .end local v0    # "l":Ljava/util/List;
    .end local p1    # "name":Ljava/lang/String;
    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final setCipher(Lcom/pymcl/core/account/TokenCipher;)V
    .locals 1
    .param p1, "<set-?>"    # Lcom/pymcl/core/account/TokenCipher;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    iput-object p1, p0, Lcom/pymcl/core/account/AccountStore;->cipher:Lcom/pymcl/core/account/TokenCipher;

    return-void
.end method

.method public final declared-synchronized upsert(Lcom/pymcl/core/account/Account;Z)V
    .locals 16
    .param p1, "acc"    # Lcom/pymcl/core/account/Account;
    .param p2, "makeActive"    # Z

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    monitor-enter p0

    :try_start_0
    const-string v2, "acc"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    invoke-virtual {v1}, Lcom/pymcl/core/account/AccountStore;->loadFull()Lkotlin/Triple;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .local v3, "act":Ljava/lang/String;
    invoke-virtual {v2}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .local v4, "curKey":Ljava/lang/String;
    invoke-virtual {v2}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 115
    .local v2, "l":Ljava/util/List;
    move-object v5, v2

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 143
    .local v6, "$i$f$filter":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v5

    .local v8, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 144
    .local v9, "$i$f$filterTo":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_0
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Lcom/pymcl/core/account/Account;

    .local v12, "it":Lcom/pymcl/core/account/Account;
    const/4 v13, 0x0

    .line 115
    .local v13, "$i$a$-filter-AccountStore$upsert$nl$1":I
    invoke-virtual {v12}, Lcom/pymcl/core/account/Account;->getKey()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lcom/pymcl/core/account/Account;->getKey()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    .line 144
    .end local v12    # "it":Lcom/pymcl/core/account/Account;
    .end local v13    # "$i$a$-filter-AccountStore$upsert$nl$1":I
    if-nez v14, :cond_0

    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 145
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    .end local p0    # "this":Lcom/pymcl/core/account/AccountStore;
    :cond_1
    nop

    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$filterTo":I
    check-cast v7, Ljava/util/List;

    .line 143
    nop

    .end local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filter":I
    check-cast v7, Ljava/util/Collection;

    .line 115
    nop

    .line 133
    move-object/from16 v5, p1

    .local v5, "it":Lcom/pymcl/core/account/Account;
    const/4 v6, 0x0

    .line 115
    .local v6, "$i$a$-also-AccountStore$upsert$nl$2":I
    invoke-virtual {v5}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v8

    const-string v9, "updated_at"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    const/16 v12, 0x3e8

    int-to-long v12, v12

    div-long/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-interface {v8, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v5    # "it":Lcom/pymcl/core/account/Account;
    .end local v6    # "$i$a$-also-AccountStore$upsert$nl$2":I
    invoke-static {v7, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 116
    .local v5, "nl":Ljava/util/List;
    if-eqz p2, :cond_2

    invoke-virtual {v0}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v6, v3

    :goto_1
    if-eqz p2, :cond_3

    invoke-virtual {v0}, Lcom/pymcl/core/account/Account;->getKey()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_3
    move-object v7, v4

    :goto_2
    invoke-direct {v1, v6, v7, v5}, Lcom/pymcl/core/account/AccountStore;->save(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    monitor-exit p0

    return-void

    .line 113
    .end local v2    # "l":Ljava/util/List;
    .end local v3    # "act":Ljava/lang/String;
    .end local v4    # "curKey":Ljava/lang/String;
    .end local v5    # "nl":Ljava/util/List;
    .end local p1    # "acc":Lcom/pymcl/core/account/Account;
    .end local p2    # "makeActive":Z
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
