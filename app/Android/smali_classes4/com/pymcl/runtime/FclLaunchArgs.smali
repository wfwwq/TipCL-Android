.class public final Lcom/pymcl/runtime/FclLaunchArgs;
.super Ljava/lang/Object;
.source "FclLaunchArgs.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/FclLaunchArgs$Env;,
        Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFclLaunchArgs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FclLaunchArgs.kt\ncom/pymcl/runtime/FclLaunchArgs\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,219:1\n3938#2:220\n4474#2,2:221\n3938#2:238\n4474#2,2:239\n1228#2,2:283\n1221#3:223\n2068#3,2:224\n1739#3:227\n1814#3,3:228\n1739#3:234\n1814#3,3:235\n1221#3:241\n2068#3,2:242\n363#3,7:244\n777#3:251\n873#3,2:252\n2945#3,3:259\n975#3,7:270\n777#3:277\n873#3:278\n2945#3,3:279\n874#3:282\n1#4:226\n1123#5,3:231\n221#6,2:254\n129#6:266\n158#6,3:267\n684#7:256\n669#7,2:257\n671#7,4:262\n*S KotlinDebug\n*F\n+ 1 FclLaunchArgs.kt\ncom/pymcl/runtime/FclLaunchArgs\n*L\n72#1:220\n72#1:221,2\n129#1:238\n129#1:239,2\n203#1:283,2\n72#1:223\n72#1:224,2\n81#1:227\n81#1:228,3\n120#1:234\n120#1:235,3\n130#1:241\n130#1:242,2\n142#1:244,7\n145#1:251\n145#1:252,2\n177#1:259,3\n179#1:270,7\n183#1:277\n183#1:278\n183#1:279,3\n183#1:282\n92#1:231,3\n176#1:254,2\n177#1:266\n177#1:267,3\n177#1:256\n177#1:257,2\n177#1:262,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\'(B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J0\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\t2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0006J0\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00102\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\tJp\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001d\u001a\u00020\u00062\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006J \u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u00062\u0008\u0010&\u001a\u0004\u0018\u00010\u0006\u00a8\u0006)"
    }
    d2 = {
        "Lcom/pymcl/runtime/FclLaunchArgs;",
        "",
        "<init>",
        "()V",
        "cacioArgs",
        "",
        "",
        "screenSize",
        "isJava8",
        "",
        "cacioDir",
        "Ljava/io/File;",
        "agentJar",
        "supportsQuickPlay",
        "mcVersion",
        "splitAddress",
        "Lkotlin/Pair;",
        "",
        "address",
        "applyServer",
        "gameArgs",
        "server",
        "pickLwjgl",
        "versionLwjgl",
        "lwjglClasspath",
        "dir",
        "useLwjglX",
        "rewrite",
        "jvmArgs",
        "mainClass",
        "javaMajor",
        "gameDir",
        "lwjglVersion",
        "env",
        "Lcom/pymcl/runtime/FclLaunchArgs$Env;",
        "envFor",
        "context",
        "Landroid/content/Context;",
        "jnaVersion",
        "Env",
        "LibPatcher",
        "PyMCL-Android:runtime_debug"
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
.field public static final INSTANCE:Lcom/pymcl/runtime/FclLaunchArgs;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/FclLaunchArgs;

    invoke-direct {v0}, Lcom/pymcl/runtime/FclLaunchArgs;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/FclLaunchArgs;->INSTANCE:Lcom/pymcl/runtime/FclLaunchArgs;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic applyServer$default(Lcom/pymcl/runtime/FclLaunchArgs;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 99
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/runtime/FclLaunchArgs;->applyServer(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final pickLwjgl$cmp(Ljava/util/List;Ljava/util/List;)I
    .locals 6
    .param p0, "v"    # Ljava/util/List;
    .param p1, "o"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 121
    const/4 v0, 0x0

    .local v0, "i":I
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_0
    const/4 v2, 0x0

    if-ge v0, v1, :cond_5

    const/4 v3, 0x1

    if-ltz v0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_0

    move v4, v3

    goto :goto_1

    :cond_0
    move v4, v2

    :goto_1
    if-eqz v4, :cond_1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    goto :goto_2

    :cond_1
    move v4, v0

    .line 226
    .local v4, "it":I
    const/4 v5, 0x0

    .line 121
    .local v5, "$i$a$-getOrElse-FclLaunchArgs$pickLwjgl$cmp$c$1":I
    nop

    .end local v4    # "it":I
    .end local v5    # "$i$a$-getOrElse-FclLaunchArgs$pickLwjgl$cmp$c$1":I
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_2
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-ltz v0, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v0, v5, :cond_2

    goto :goto_3

    :cond_2
    move v3, v2

    :goto_3
    if-eqz v3, :cond_3

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    goto :goto_4

    .line 226
    :cond_3
    move v3, v0

    .local v3, "it":I
    const/4 v5, 0x0

    .line 121
    .local v5, "$i$a$-getOrElse-FclLaunchArgs$pickLwjgl$cmp$c$2":I
    nop

    .end local v3    # "it":I
    .end local v5    # "$i$a$-getOrElse-FclLaunchArgs$pickLwjgl$cmp$c$2":I
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_4
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    move-result v2

    .local v2, "c":I
    if-eqz v2, :cond_4

    return v2

    .end local v2    # "c":I
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .end local v0    # "i":I
    :cond_5
    return v2
.end method

.method public static synthetic rewrite$default(Lcom/pymcl/runtime/FclLaunchArgs;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLcom/pymcl/runtime/FclLaunchArgs$Env;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 138
    and-int/lit16 p12, p11, 0x100

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    .line 139
    move-object p9, v0

    .line 138
    :cond_0
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_1

    .line 139
    move-object p10, v0

    .line 138
    :cond_1
    invoke-virtual/range {p0 .. p10}, Lcom/pymcl/runtime/FclLaunchArgs;->rewrite(Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLcom/pymcl/runtime/FclLaunchArgs$Env;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final applyServer(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 22
    .param p1, "gameArgs"    # Ljava/util/List;
    .param p2, "mcVersion"    # Ljava/lang/String;
    .param p3, "server"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "gameArgs"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .local v2, "out":Ljava/util/ArrayList;
    const/4 v3, 0x0

    .local v3, "host":Ljava/lang/String;
    const/4 v4, 0x0

    .local v4, "port":Ljava/lang/Object;
    const/4 v5, 0x0

    .local v5, "qp":Ljava/lang/String;
    const/4 v6, -0x1

    .line 101
    .local v6, "insertAt":I
    const/4 v7, 0x0

    .line 102
    .local v7, "i":I
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    const-string v9, "--server"

    const-string v10, "--port"

    const-string v11, "--quickPlayMultiplayer"

    if-ge v7, v8, :cond_6

    .line 103
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v12

    sparse-switch v12, :sswitch_data_0

    :cond_0
    :goto_1
    goto :goto_2

    :sswitch_0
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 104
    add-int/lit8 v8, v7, 0x1

    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v8

    move-object v3, v8

    check-cast v3, Ljava/lang/String;

    if-gez v6, :cond_1

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    :cond_1
    add-int/lit8 v7, v7, 0x2

    goto :goto_0

    .line 103
    :sswitch_1
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    goto :goto_1

    .line 105
    :cond_2
    add-int/lit8 v8, v7, 0x1

    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v4

    if-gez v6, :cond_3

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    :cond_3
    add-int/lit8 v7, v7, 0x2

    goto :goto_0

    .line 103
    :sswitch_2
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_1

    .line 106
    :cond_4
    add-int/lit8 v8, v7, 0x1

    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v8

    move-object v5, v8

    check-cast v5, Ljava/lang/String;

    if-gez v6, :cond_5

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    :cond_5
    add-int/lit8 v7, v7, 0x2

    goto :goto_0

    .line 108
    :goto_2
    move-object v8, v2

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 110
    :cond_6
    const-string v8, ":"

    const-string v12, "]"

    const-string v13, "["

    const/4 v15, 0x0

    const/4 v14, 0x2

    const/16 v17, 0x1

    if-eqz p3, :cond_9

    move-object/from16 v18, p3

    .line 226
    .local v18, "it":Ljava/lang/String;
    const/16 v19, 0x0

    .line 110
    .local v19, "$i$a$-takeIf-FclLaunchArgs$applyServer$addr$1":I
    move-object/from16 v20, v18

    check-cast v20, Ljava/lang/CharSequence;

    invoke-static/range {v20 .. v20}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v20

    .end local v18    # "it":Ljava/lang/String;
    .end local v19    # "$i$a$-takeIf-FclLaunchArgs$applyServer$addr$1":I
    if-nez v20, :cond_7

    move-object/from16 v18, p3

    goto :goto_3

    :cond_7
    move-object/from16 v18, v15

    :goto_3
    if-nez v18, :cond_8

    goto :goto_4

    :cond_8
    move-object/from16 v20, v3

    move-object/from16 v21, v5

    goto/16 :goto_8

    :cond_9
    :goto_4
    if-nez v5, :cond_f

    if-eqz v3, :cond_e

    move-object/from16 v18, v3

    .line 226
    .local v18, "h":Ljava/lang/String;
    const/16 v19, 0x0

    .line 110
    .local v19, "$i$a$-let-FclLaunchArgs$applyServer$addr$2":I
    move-object/from16 v20, v4

    check-cast v20, Ljava/lang/CharSequence;

    if-eqz v20, :cond_b

    invoke-static/range {v20 .. v20}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v20

    if-eqz v20, :cond_a

    goto :goto_5

    :cond_a
    const/16 v20, 0x0

    goto :goto_6

    :cond_b
    :goto_5
    move/from16 v20, v17

    :goto_6
    if-eqz v20, :cond_c

    move-object/from16 v20, v3

    move-object/from16 v21, v5

    goto :goto_8

    :cond_c
    move-object/from16 v1, v18

    check-cast v1, Ljava/lang/CharSequence;

    move-object/from16 v20, v3

    move-object/from16 v21, v5

    const/16 v3, 0x3a

    const/4 v5, 0x0

    .end local v3    # "host":Ljava/lang/String;
    .end local v5    # "qp":Ljava/lang/String;
    .local v20, "host":Ljava/lang/String;
    .local v21, "qp":Ljava/lang/String;
    invoke-static {v1, v3, v5, v14, v15}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v3, v18

    .end local v18    # "h":Ljava/lang/String;
    .local v3, "h":Ljava/lang/String;
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v1, v18

    goto :goto_7

    .end local v3    # "h":Ljava/lang/String;
    .restart local v18    # "h":Ljava/lang/String;
    :cond_d
    move-object/from16 v3, v18

    .end local v18    # "h":Ljava/lang/String;
    .restart local v3    # "h":Ljava/lang/String;
    move-object v1, v3

    :goto_7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v18, v1

    goto :goto_8

    .end local v19    # "$i$a$-let-FclLaunchArgs$applyServer$addr$2":I
    .end local v20    # "host":Ljava/lang/String;
    .end local v21    # "qp":Ljava/lang/String;
    .local v3, "host":Ljava/lang/String;
    .restart local v5    # "qp":Ljava/lang/String;
    :cond_e
    move-object/from16 v20, v3

    move-object/from16 v21, v5

    .end local v3    # "host":Ljava/lang/String;
    .end local v5    # "qp":Ljava/lang/String;
    .restart local v20    # "host":Ljava/lang/String;
    .restart local v21    # "qp":Ljava/lang/String;
    move-object/from16 v18, v15

    goto :goto_8

    .end local v20    # "host":Ljava/lang/String;
    .end local v21    # "qp":Ljava/lang/String;
    .restart local v3    # "host":Ljava/lang/String;
    .restart local v5    # "qp":Ljava/lang/String;
    :cond_f
    move-object/from16 v20, v3

    move-object/from16 v21, v5

    .end local v3    # "host":Ljava/lang/String;
    .end local v5    # "qp":Ljava/lang/String;
    .restart local v20    # "host":Ljava/lang/String;
    .restart local v21    # "qp":Ljava/lang/String;
    move-object/from16 v18, v21

    .line 111
    .local v18, "addr":Ljava/lang/String;
    :goto_8
    if-eqz v18, :cond_15

    move-object/from16 v1, v18

    .line 226
    .local v1, "p0":Ljava/lang/String;
    const/4 v3, 0x0

    .line 111
    .local v3, "$i$a$-let-FclLaunchArgs$applyServer$1":I
    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/FclLaunchArgs;->splitAddress(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v1

    .end local v1    # "p0":Ljava/lang/String;
    .end local v3    # "$i$a$-let-FclLaunchArgs$applyServer$1":I
    if-nez v1, :cond_10

    move-object/from16 v5, p2

    goto/16 :goto_d

    :cond_10
    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .local v3, "h":Ljava/lang/String;
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 112
    .local v1, "p":I
    move-object/from16 v5, p2

    invoke-virtual {v0, v5}, Lcom/pymcl/runtime/FclLaunchArgs;->supportsQuickPlay(Ljava/lang/String;)Z

    move-result v19

    if-eqz v19, :cond_12

    new-array v9, v14, [Ljava/lang/String;

    const/4 v10, 0x0

    aput-object v11, v9, v10

    move-object v11, v3

    check-cast v11, Ljava/lang/CharSequence;

    const/16 v0, 0x3a

    invoke-static {v11, v0, v10, v14, v15}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_11
    move-object v0, v3

    :goto_9
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v17

    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_a

    .line 113
    :cond_12
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/16 v16, 0x0

    aput-object v9, v0, v16

    aput-object v3, v0, v17

    aput-object v10, v0, v14

    const/4 v8, 0x3

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v0, v8

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 112
    :goto_a
    nop

    .line 114
    .local v0, "add":Ljava/util/List;
    if-ltz v6, :cond_14

    if-eqz p3, :cond_13

    goto :goto_b

    :cond_13
    move-object v8, v0

    check-cast v8, Ljava/util/Collection;

    invoke-virtual {v2, v6, v8}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    goto :goto_c

    :cond_14
    :goto_b
    move-object v8, v0

    check-cast v8, Ljava/util/Collection;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 115
    :goto_c
    move-object v8, v2

    check-cast v8, Ljava/util/List;

    return-object v8

    .line 111
    .end local v0    # "add":Ljava/util/List;
    .end local v1    # "p":I
    .end local v3    # "h":Ljava/lang/String;
    :cond_15
    move-object/from16 v5, p2

    :goto_d
    move-object v0, v2

    check-cast v0, Ljava/util/List;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x18df0579 -> :sswitch_2
        0x4f78ce21 -> :sswitch_1
        0x590f7ce3 -> :sswitch_0
    .end sparse-switch
.end method

.method public final cacioArgs(Ljava/lang/String;ZLjava/io/File;Ljava/io/File;)Ljava/util/List;
    .locals 19
    .param p1, "screenSize"    # Ljava/lang/String;
    .param p2, "isJava8"    # Z
    .param p3, "cacioDir"    # Ljava/io/File;
    .param p4, "agentJar"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/io/File;",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    const-string v2, "screenSize"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .local v2, "res":Ljava/util/ArrayList;
    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    const-string v4, "-Djava.awt.headless=false"

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "-Dcacio.managed.screensize="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 55
    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    const-string v4, "-Dcacio.font.fontmanager=sun.awt.X11FontManager"

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    const-string v4, "-Dcacio.font.fontscaler=sun.font.FreetypeFontScaler"

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 57
    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    const-string v4, "-Dswing.defaultlaf=javax.swing.plaf.nimbus.NimbusLookAndFeel"

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 58
    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz p2, :cond_0

    .line 59
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    const-string v6, "-Dawt.toolkit=net.java.openjdk.cacio.ctc.CTCToolkit"

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 60
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    const-string v6, "-Djava.awt.graphicsenv=net.java.openjdk.cacio.ctc.CTCGraphicsEnvironment"

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 62
    :cond_0
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    const-string v6, "-Dawt.toolkit=com.github.caciocavallosilano.cacio.ctc.CTCToolkit"

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    const-string v6, "-Djava.awt.graphicsenv=com.github.caciocavallosilano.cacio.ctc.CTCGraphicsEnvironment"

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 64
    if-eqz v1, :cond_1

    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    sget-object v6, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v6, v1}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "-javaagent:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 65
    :cond_1
    const/16 v5, 0xa

    new-array v5, v5, [Ljava/lang/String;

    const-string v6, "java.desktop/java.awt"

    aput-object v6, v5, v4

    const-string v7, "java.desktop/java.awt.peer"

    const/4 v8, 0x1

    aput-object v7, v5, v8

    const-string v7, "java.desktop/sun.awt.image"

    aput-object v7, v5, v3

    const/4 v7, 0x3

    const-string v9, "java.desktop/sun.java2d"

    aput-object v9, v5, v7

    .line 66
    const-string v10, "java.desktop/java.awt.dnd.peer"

    const/4 v11, 0x4

    aput-object v10, v5, v11

    .line 65
    nop

    .line 66
    const-string v10, "java.desktop/sun.awt"

    const/4 v12, 0x5

    aput-object v10, v5, v12

    .line 65
    nop

    .line 66
    const-string v10, "java.desktop/sun.awt.event"

    const/4 v13, 0x6

    aput-object v10, v5, v13

    .line 65
    nop

    .line 66
    const-string v10, "java.desktop/sun.awt.datatransfer"

    const/4 v14, 0x7

    aput-object v10, v5, v14

    .line 65
    nop

    .line 67
    const/16 v10, 0x8

    const-string v14, "java.desktop/sun.font"

    aput-object v14, v5, v10

    .line 65
    nop

    .line 67
    const-string v10, "java.base/sun.security.action"

    const/16 v15, 0x9

    aput-object v10, v5, v15

    .line 65
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const-string v15, "=ALL-UNNAMED"

    if-eqz v10, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 67
    .local v10, "p":Ljava/lang/String;
    move/from16 v16, v7

    move-object v7, v2

    check-cast v7, Ljava/util/Collection;

    move/from16 v17, v8

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v18, v11

    const-string v11, "--add-exports="

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v7, v16

    move/from16 v8, v17

    move/from16 v11, v18

    goto :goto_0

    .line 68
    .end local v10    # "p":Ljava/lang/String;
    :cond_2
    move/from16 v16, v7

    move/from16 v17, v8

    move/from16 v18, v11

    new-array v5, v13, [Ljava/lang/String;

    const-string v7, "java.base/java.util"

    aput-object v7, v5, v4

    aput-object v6, v5, v17

    aput-object v14, v5, v3

    aput-object v9, v5, v16

    .line 69
    const-string v6, "java.base/java.lang.reflect"

    aput-object v6, v5, v18

    .line 68
    nop

    .line 69
    const-string v6, "java.base/java.net"

    aput-object v6, v5, v12

    .line 68
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 69
    .local v6, "p":Ljava/lang/String;
    move-object v7, v2

    check-cast v7, Ljava/util/Collection;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "--add-opens="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 71
    .end local v6    # "p":Ljava/lang/String;
    :cond_3
    :goto_2
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "-Xbootclasspath/"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_4

    const-string v6, "p"

    goto :goto_3

    :cond_4
    const-string v6, "a"

    :goto_3
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 72
    .local v5, "sb":Ljava/lang/StringBuilder;
    if-eqz p3, :cond_8

    invoke-virtual/range {p3 .. p3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    if-eqz v6, :cond_8

    .local v6, "$this$filter$iv":[Ljava/lang/Object;
    const/4 v7, 0x0

    .line 220
    .local v7, "$i$f$filter":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v6

    .local v9, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    const/4 v10, 0x0

    .line 221
    .local v10, "$i$f$filterTo":I
    array-length v11, v9

    move v12, v4

    :goto_4
    if-ge v12, v11, :cond_6

    aget-object v13, v9, v12

    .local v13, "element$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    .local v14, "it":Ljava/io/File;
    const/4 v15, 0x0

    .line 72
    .local v15, "$i$a$-filter-FclLaunchArgs$cacioArgs$1":I
    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getName(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, ".jar"

    const/4 v0, 0x0

    move-object/from16 v16, v2

    const/4 v1, 0x2

    const/4 v2, 0x0

    .end local v2    # "res":Ljava/util/ArrayList;
    .local v16, "res":Ljava/util/ArrayList;
    invoke-static {v3, v4, v2, v1, v0}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    .line 221
    .end local v14    # "it":Ljava/io/File;
    .end local v15    # "$i$a$-filter-FclLaunchArgs$cacioArgs$1":I
    if-eqz v0, :cond_5

    invoke-interface {v8, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v13    # "element$iv$iv":Ljava/lang/Object;
    :cond_5
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p1

    move v3, v1

    move v4, v2

    move-object/from16 v2, v16

    move-object/from16 v1, p4

    goto :goto_4

    .line 222
    .end local v16    # "res":Ljava/util/ArrayList;
    .restart local v2    # "res":Ljava/util/ArrayList;
    :cond_6
    move-object/from16 v16, v2

    .end local v2    # "res":Ljava/util/ArrayList;
    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .end local v10    # "$i$f$filterTo":I
    .restart local v16    # "res":Ljava/util/ArrayList;
    move-object v0, v8

    check-cast v0, Ljava/util/List;

    .line 220
    nop

    .line 72
    .end local v6    # "$this$filter$iv":[Ljava/lang/Object;
    .end local v7    # "$i$f$filter":I
    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$sortedBy$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 223
    .local v1, "$i$f$sortedBy":I
    new-instance v2, Lcom/pymcl/runtime/FclLaunchArgs$cacioArgs$$inlined$sortedBy$1;

    invoke-direct {v2}, Lcom/pymcl/runtime/FclLaunchArgs$cacioArgs$$inlined$sortedBy$1;-><init>()V

    check-cast v2, Ljava/util/Comparator;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 72
    .end local v0    # "$this$sortedBy$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$sortedBy":I
    if-eqz v0, :cond_9

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 224
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Ljava/io/File;

    .local v4, "it":Ljava/io/File;
    const/4 v6, 0x0

    .line 72
    .local v6, "$i$a$-forEach-FclLaunchArgs$cacioArgs$3":I
    const/16 v7, 0x3a

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v7

    sget-object v8, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v8, v4}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .end local v4    # "it":Ljava/io/File;
    .end local v6    # "$i$a$-forEach-FclLaunchArgs$cacioArgs$3":I
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_5

    .line 225
    :cond_7
    nop

    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    goto :goto_6

    .line 72
    .end local v16    # "res":Ljava/util/ArrayList;
    .restart local v2    # "res":Ljava/util/ArrayList;
    :cond_8
    move-object/from16 v16, v2

    .line 73
    .end local v2    # "res":Ljava/util/ArrayList;
    .restart local v16    # "res":Ljava/util/ArrayList;
    :cond_9
    :goto_6
    move-object/from16 v0, v16

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 74
    move-object/from16 v0, v16

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final envFor(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/runtime/FclLaunchArgs$Env;
    .locals 35
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "gameDir"    # Ljava/lang/String;
    .param p3, "jnaVersion"    # Ljava/lang/String;

    move-object/from16 v1, p3

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gameDir"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    invoke-static {v2}, Lcom/pymcl/runtime/RuntimeHost;->init(Landroid/content/Context;)V

    .line 203
    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    const-string v4, "SUPPORTED_ABIS"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    .local v0, "$this$first$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 283
    .local v4, "$i$f$first":I
    array-length v5, v0

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_8

    aget-object v8, v0, v7

    .local v8, "element$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 203
    .local v10, "$i$a$-first-FclLaunchArgs$envFor$abi$1":I
    const-string v11, "arm64-v8a"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    const-string v11, "x86_64"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_1

    :cond_0
    move v11, v6

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v11, 0x1

    .line 283
    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-first-FclLaunchArgs$envFor$abi$1":I
    :goto_2
    if-eqz v11, :cond_7

    .line 203
    .end local v0    # "$this$first$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$first":I
    .end local v8    # "element$iv":Ljava/lang/Object;
    move-object/from16 v18, v8

    check-cast v18, Ljava/lang/String;

    .line 204
    .local v18, "abi":Ljava/lang/String;
    new-instance v0, Ljava/io/File;

    sget-object v4, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    const-string v5, "jna"

    invoke-direct {v0, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .local v0, "d":Ljava/io/File;
    const/4 v4, 0x0

    .line 204
    .local v4, "$i$a$-let-FclLaunchArgs$envFor$jna$1":I
    if-eqz v1, :cond_2

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_2

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v0, v5

    .end local v0    # "d":Ljava/io/File;
    .end local v4    # "$i$a$-let-FclLaunchArgs$envFor$jna$1":I
    :cond_2
    move-object v4, v0

    .line 205
    .local v4, "jna":Ljava/io/File;
    nop

    .line 206
    new-instance v13, Ljava/io/File;

    sget-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->LWJGL_DIR:Ljava/lang/String;

    invoke-direct {v13, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v14, Ljava/io/File;

    sget-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->MIO_LAUNCH_WRAPPER:Ljava/lang/String;

    invoke-direct {v14, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v15, Lcom/tungsten/fclauncher/utils/FCLPath;->CACHE_DIR:Ljava/lang/String;

    const-string v0, "CACHE_DIR"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    sget-object v5, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_PATH:Ljava/lang/String;

    const-string v0, "JAVA_PATH"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v6, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    const-string v0, "nativeLibraryDir"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 208
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    if-nez v0, :cond_3

    const-string v0, ""

    :cond_3
    move-object/from16 v19, v0

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/runtime/FclLaunchArgs;

    .line 226
    .local v0, "$this$envFor_u24lambda_u242":Lcom/pymcl/runtime/FclLaunchArgs;
    const/4 v7, 0x0

    .line 208
    .local v7, "$i$a$-runCatching-FclLaunchArgs$envFor$1":I
    invoke-static {}, Lcom/tungsten/fclauncher/FCLauncher;->getSocName()Ljava/lang/String;

    move-result-object v8

    .end local v0    # "$this$envFor_u24lambda_u242":Lcom/pymcl/runtime/FclLaunchArgs;
    .end local v7    # "$i$a$-runCatching-FclLaunchArgs$envFor$1":I
    invoke-static {v8}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    sget-object v7, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move-object v0, v7

    :cond_4
    const-string v7, "getOrDefault(...)"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v20, v0

    check-cast v20, Ljava/lang/String;

    .line 209
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_5
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    :goto_4
    move-object/from16 v21, v0

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 210
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v7

    const-string v0, "getLanguage(...)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v8

    const-string v0, "getCountry(...)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v9

    const-string v0, "getID(...)"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v25

    .line 212
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/runtime/FclLaunchArgs;

    .line 226
    .local v0, "$this$envFor_u24lambda_u243":Lcom/pymcl/runtime/FclLaunchArgs;
    const/4 v10, 0x0

    .line 212
    .local v10, "$i$a$-runCatching-FclLaunchArgs$envFor$2":I
    invoke-static {}, Lcom/mio/plugin/NativeLibPlugin;->getJVMEnv()Ljava/util/Map;

    move-result-object v11

    .end local v0    # "$this$envFor_u24lambda_u243":Lcom/pymcl/runtime/FclLaunchArgs;
    .end local v10    # "$i$a$-runCatching-FclLaunchArgs$envFor$2":I
    invoke-static {v11}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    sget-object v10, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v10

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    move-object v0, v10

    :cond_6
    move-object/from16 v26, v0

    check-cast v26, Ljava/util/Map;

    .line 213
    new-instance v0, Ljava/io/File;

    sget-object v10, Lcom/tungsten/fclauncher/utils/FCLPath;->CACIOCAVALLO_8_DIR:Ljava/lang/String;

    invoke-direct {v0, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v10, Ljava/io/File;

    sget-object v11, Lcom/tungsten/fclauncher/utils/FCLPath;->CACIOCAVALLO_17_DIR:Ljava/lang/String;

    invoke-direct {v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 214
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    .line 226
    nop

    .local v11, "it":Landroid/util/DisplayMetrics;
    const/4 v12, 0x0

    .line 214
    .local v12, "$i$a$-let-FclLaunchArgs$envFor$3":I
    move-object/from16 v27, v0

    iget v0, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v1, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v1, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v2, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "x"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v29

    .line 215
    .end local v11    # "it":Landroid/util/DisplayMetrics;
    .end local v12    # "$i$a$-let-FclLaunchArgs$envFor$3":I
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->LIB_PATCHER_PATH:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 205
    nop

    .line 215
    nop

    .line 205
    new-instance v12, Lcom/pymcl/runtime/FclLaunchArgs$Env;

    const/16 v31, 0x0

    const/16 v32, 0x1

    const/high16 v33, 0x40000

    const/16 v34, 0x0

    move-object/from16 v30, v0

    move-object/from16 v16, v5

    move-object/from16 v17, v6

    move-object/from16 v22, v7

    move-object/from16 v23, v8

    move-object/from16 v24, v9

    move-object/from16 v28, v10

    invoke-direct/range {v12 .. v34}, Lcom/pymcl/runtime/FclLaunchArgs$Env;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/io/File;Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v12

    .line 283
    .end local v18    # "abi":Ljava/lang/String;
    .local v0, "$this$first$iv":[Ljava/lang/Object;
    .local v4, "$i$f$first":I
    :cond_7
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v2, p1

    move-object/from16 v1, p3

    goto/16 :goto_0

    .line 284
    :cond_8
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Array contains no element matching the predicate."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final lwjglClasspath(Ljava/io/File;Z)Ljava/util/List;
    .locals 18
    .param p1, "dir"    # Ljava/io/File;
    .param p2, "useLwjglX"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Z)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "dir"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 127
    .local v1, "out":Ljava/util/LinkedHashSet;
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    sget-object v3, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v4, Ljava/io/File;

    const-string v5, "lwjgl.jar"

    invoke-direct {v4, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 128
    const-string v2, "lwjgl-lwjglx.jar"

    if-eqz p2, :cond_0

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    sget-object v4, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 129
    :cond_0
    nop

    .line 130
    nop

    .line 129
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_5

    .local v3, "$this$filter$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 238
    .local v4, "$i$f$filter":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v3

    .local v7, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 239
    .local v8, "$i$f$filterTo":I
    array-length v9, v7

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v9, :cond_3

    aget-object v12, v7, v11

    .local v12, "element$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it":Ljava/io/File;
    const/4 v14, 0x0

    .line 129
    .local v14, "$i$a$-filter-FclLaunchArgs$lwjglClasspath$1":I
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v15

    const-string v10, "getName(...)"

    invoke-static {v15, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x2

    const/4 v0, 0x0

    move-object/from16 v16, v1

    .end local v1    # "out":Ljava/util/LinkedHashSet;
    .local v16, "out":Ljava/util/LinkedHashSet;
    const-string v1, ".jar"

    move-object/from16 v17, v3

    const/4 v3, 0x0

    .end local v3    # "$this$filter$iv":[Ljava/lang/Object;
    .local v17, "$this$filter$iv":[Ljava/lang/Object;
    invoke-static {v15, v1, v3, v10, v0}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    move v0, v3

    .line 239
    .end local v13    # "it":Ljava/io/File;
    .end local v14    # "$i$a$-filter-FclLaunchArgs$lwjglClasspath$1":I
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {v6, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v12    # "element$iv$iv":Ljava/lang/Object;
    :cond_2
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p1

    move-object/from16 v1, v16

    move-object/from16 v3, v17

    goto :goto_0

    .line 240
    .end local v16    # "out":Ljava/util/LinkedHashSet;
    .end local v17    # "$this$filter$iv":[Ljava/lang/Object;
    .restart local v1    # "out":Ljava/util/LinkedHashSet;
    .restart local v3    # "$this$filter$iv":[Ljava/lang/Object;
    :cond_3
    move-object/from16 v16, v1

    move-object/from16 v17, v3

    .end local v1    # "out":Ljava/util/LinkedHashSet;
    .end local v3    # "$this$filter$iv":[Ljava/lang/Object;
    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .end local v8    # "$i$f$filterTo":I
    .restart local v16    # "out":Ljava/util/LinkedHashSet;
    .restart local v17    # "$this$filter$iv":[Ljava/lang/Object;
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    .line 238
    nop

    .line 129
    .end local v4    # "$i$f$filter":I
    .end local v17    # "$this$filter$iv":[Ljava/lang/Object;
    nop

    .line 130
    nop

    .line 129
    check-cast v0, Ljava/lang/Iterable;

    .line 130
    nop

    .local v0, "$this$sortedBy$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 241
    .local v1, "$i$f$sortedBy":I
    new-instance v2, Lcom/pymcl/runtime/FclLaunchArgs$lwjglClasspath$$inlined$sortedBy$1;

    invoke-direct {v2}, Lcom/pymcl/runtime/FclLaunchArgs$lwjglClasspath$$inlined$sortedBy$1;-><init>()V

    check-cast v2, Ljava/util/Comparator;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 130
    .end local v0    # "$this$sortedBy$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$sortedBy":I
    if-eqz v0, :cond_6

    .line 129
    check-cast v0, Ljava/lang/Iterable;

    .line 130
    nop

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 242
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Ljava/io/File;

    .local v4, "it":Ljava/io/File;
    const/4 v5, 0x0

    .line 130
    .local v5, "$i$a$-forEach-FclLaunchArgs$lwjglClasspath$3":I
    move-object/from16 v6, v16

    check-cast v6, Ljava/util/Collection;

    sget-object v7, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v7, v4}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 242
    .end local v4    # "it":Ljava/io/File;
    .end local v5    # "$i$a$-forEach-FclLaunchArgs$lwjglClasspath$3":I
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_2

    .line 243
    :cond_4
    nop

    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    goto :goto_3

    .line 129
    .end local v16    # "out":Ljava/util/LinkedHashSet;
    .local v1, "out":Ljava/util/LinkedHashSet;
    :cond_5
    move-object/from16 v16, v1

    .end local v1    # "out":Ljava/util/LinkedHashSet;
    .restart local v16    # "out":Ljava/util/LinkedHashSet;
    :cond_6
    nop

    .line 131
    :goto_3
    move-object/from16 v0, v16

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final pickLwjgl(Ljava/lang/String;)Lkotlin/Pair;
    .locals 14
    .param p1, "versionLwjgl"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 120
    const-string v0, "3.3.3"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz p1, :cond_4

    move-object v3, p1

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v9, 0x2

    new-array v4, v9, [C

    fill-array-data v4, :array_0

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_4

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 234
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

    .line 235
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 236
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Ljava/lang/String;

    .local v11, "it":Ljava/lang/String;
    const/4 v12, 0x0

    .line 120
    .local v12, "$i$a$-map-FclLaunchArgs$pickLwjgl$v$1":I
    invoke-static {v11}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v13

    if-eqz v13, :cond_0

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    goto :goto_1

    :cond_0
    move v13, v1

    .end local v11    # "it":Ljava/lang/String;
    .end local v12    # "$i$a$-map-FclLaunchArgs$pickLwjgl$v$1":I
    :goto_1
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 236
    invoke-interface {v5, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 237
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    check-cast v5, Ljava/util/List;

    .line 234
    nop

    .line 120
    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map":I
    nop

    .line 122
    .local v5, "v":Ljava/util/List;
    new-array v3, v9, [Ljava/lang/Integer;

    const/4 v4, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x1

    aput-object v6, v3, v7

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v5, v3}, Lcom/pymcl/runtime/FclLaunchArgs;->pickLwjgl$cmp(Ljava/util/List;Ljava/util/List;)I

    move-result v3

    if-gez v3, :cond_2

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    goto :goto_2

    :cond_2
    new-array v3, v4, [Ljava/lang/Integer;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v9

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v5, v1}, Lcom/pymcl/runtime/FclLaunchArgs;->pickLwjgl$cmp(Ljava/util/List;Ljava/util/List;)I

    move-result v1

    if-ltz v1, :cond_3

    const-string v0, "3.4.1"

    :cond_3
    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    :goto_2
    return-object v0

    .line 120
    .end local v5    # "v":Ljava/util/List;
    :cond_4
    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0

    nop

    :array_0
    .array-data 2
        0x2es
        0x2ds
    .end array-data
.end method

.method public final rewrite(Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLcom/pymcl/runtime/FclLaunchArgs$Env;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 40
    .param p1, "jvmArgs"    # Ljava/util/List;
    .param p2, "mainClass"    # Ljava/lang/String;
    .param p3, "gameArgs"    # Ljava/util/List;
    .param p4, "javaMajor"    # I
    .param p5, "gameDir"    # Ljava/lang/String;
    .param p6, "lwjglVersion"    # Ljava/lang/String;
    .param p7, "useLwjglX"    # Z
    .param p8, "env"    # Lcom/pymcl/runtime/FclLaunchArgs$Env;
    .param p9, "mcVersion"    # Ljava/lang/String;
    .param p10, "server"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/pymcl/runtime/FclLaunchArgs$Env;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    const-string v7, "jvmArgs"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "mainClass"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "gameArgs"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "gameDir"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "lwjglVersion"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "env"

    move-object/from16 v8, p8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    move-object v7, v1

    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v7

    .line 142
    .local v7, "jvm":Ljava/util/List;
    move-object v9, v7

    .local v9, "$this$indexOfFirst$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 244
    .local v10, "$i$f$indexOfFirst":I
    const/4 v11, 0x0

    .line 245
    .local v11, "index$iv":I
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    const-string v14, "-cp"

    if-eqz v13, :cond_3

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 246
    .local v13, "item$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    move-object v15, v13

    check-cast v15, Ljava/lang/String;

    .local v15, "it":Ljava/lang/String;
    const/16 v18, 0x0

    .line 142
    .local v18, "$i$a$-indexOfFirst-FclLaunchArgs$rewrite$cpIdx$1":I
    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_1

    const-string v1, "-classpath"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    move/from16 v1, v17

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v1, 0x1

    .line 246
    .end local v15    # "it":Ljava/lang/String;
    .end local v18    # "$i$a$-indexOfFirst-FclLaunchArgs$rewrite$cpIdx$1":I
    :goto_2
    if-eqz v1, :cond_2

    .line 247
    goto :goto_3

    .line 248
    :cond_2
    nop

    .end local v13    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, p1

    goto :goto_0

    .line 250
    :cond_3
    const/16 v17, 0x0

    const/4 v1, -0x1

    move v11, v1

    .line 142
    .end local v9    # "$this$indexOfFirst$iv":Ljava/util/List;
    .end local v10    # "$i$f$indexOfFirst":I
    .end local v11    # "index$iv":I
    :goto_3
    nop

    .line 143
    .local v11, "cpIdx":I
    new-instance v1, Ljava/io/File;

    invoke-virtual {v8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getLwjglDir()Ljava/io/File;

    move-result-object v9

    invoke-direct {v1, v9, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move/from16 v9, p7

    invoke-virtual {v0, v1, v9}, Lcom/pymcl/runtime/FclLaunchArgs;->lwjglClasspath(Ljava/io/File;Z)Ljava/util/List;

    move-result-object v1

    .line 144
    .local v1, "lw":Ljava/util/List;
    const-string v10, ":"

    if-ltz v11, :cond_9

    add-int/lit8 v15, v11, 0x1

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v12

    if-ge v15, v12, :cond_9

    .line 145
    add-int/lit8 v12, v11, 0x1

    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v19, v12

    check-cast v19, Ljava/lang/CharSequence;

    const/4 v12, 0x1

    new-array v14, v12, [C

    const/16 v12, 0x3a

    aput-char v12, v14, v17

    const/16 v23, 0x6

    const/16 v24, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v20, v14

    invoke-static/range {v19 .. v24}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    .local v12, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 251
    .local v14, "$i$f$filter":I
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    check-cast v15, Ljava/util/Collection;

    .local v15, "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 v19, v12

    .local v19, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/16 v20, 0x0

    .line 252
    .local v20, "$i$f$filterTo":I
    invoke-interface/range {v19 .. v19}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_4
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_8

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v23, v1

    .end local v1    # "lw":Ljava/util/List;
    .local v13, "element$iv$iv":Ljava/lang/Object;
    .local v23, "lw":Ljava/util/List;
    move-object v1, v13

    check-cast v1, Ljava/lang/String;

    .local v1, "it":Ljava/lang/String;
    const/16 v24, 0x0

    .line 145
    .local v24, "$i$a$-filter-FclLaunchArgs$rewrite$orig$1":I
    move-object/from16 v25, v1

    check-cast v25, Ljava/lang/CharSequence;

    invoke-interface/range {v25 .. v25}, Ljava/lang/CharSequence;->length()I

    move-result v25

    if-lez v25, :cond_4

    const/16 v25, 0x1

    goto :goto_5

    :cond_4
    move/from16 v25, v17

    :goto_5
    if-eqz v25, :cond_5

    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v25, v1

    .end local v1    # "it":Ljava/lang/String;
    .local v25, "it":Ljava/lang/String;
    const-string v1, "getName(...)"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "lwjgl"

    move-object/from16 v26, v10

    move/from16 v27, v11

    move/from16 v11, v17

    const/4 v9, 0x2

    const/4 v10, 0x0

    .end local v11    # "cpIdx":I
    .local v27, "cpIdx":I
    invoke-static {v8, v1, v11, v9, v10}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    const/4 v1, 0x1

    goto :goto_6

    .end local v25    # "it":Ljava/lang/String;
    .end local v27    # "cpIdx":I
    .restart local v1    # "it":Ljava/lang/String;
    .restart local v11    # "cpIdx":I
    :cond_5
    move-object/from16 v25, v1

    move-object/from16 v26, v10

    move/from16 v27, v11

    .end local v1    # "it":Ljava/lang/String;
    .end local v11    # "cpIdx":I
    .restart local v25    # "it":Ljava/lang/String;
    .restart local v27    # "cpIdx":I
    :cond_6
    const/4 v1, 0x0

    .line 252
    .end local v24    # "$i$a$-filter-FclLaunchArgs$rewrite$orig$1":I
    .end local v25    # "it":Ljava/lang/String;
    :goto_6
    if-eqz v1, :cond_7

    invoke-interface {v15, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_7
    move/from16 v9, p7

    move-object/from16 v8, p8

    move-object/from16 v1, v23

    move-object/from16 v10, v26

    move/from16 v11, v27

    const/16 v17, 0x0

    goto :goto_4

    .line 253
    .end local v13    # "element$iv$iv":Ljava/lang/Object;
    .end local v23    # "lw":Ljava/util/List;
    .end local v27    # "cpIdx":I
    .local v1, "lw":Ljava/util/List;
    .restart local v11    # "cpIdx":I
    :cond_8
    move-object/from16 v23, v1

    move-object/from16 v26, v10

    move/from16 v27, v11

    .end local v1    # "lw":Ljava/util/List;
    .end local v11    # "cpIdx":I
    .end local v15    # "destination$iv$iv":Ljava/util/Collection;
    .end local v19    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v20    # "$i$f$filterTo":I
    .restart local v23    # "lw":Ljava/util/List;
    .restart local v27    # "cpIdx":I
    move-object v1, v15

    check-cast v1, Ljava/util/List;

    .line 251
    nop

    .line 145
    .end local v12    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$filter":I
    nop

    .line 146
    .local v1, "orig":Ljava/util/List;
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 147
    .local v8, "ver":Ljava/lang/String;
    const/4 v12, 0x1

    invoke-static {v1, v12}, Lkotlin/collections/CollectionsKt;->dropLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v9

    .line 148
    .local v9, "body":Ljava/util/List;
    add-int/lit8 v11, v27, 0x1

    move-object/from16 v10, v23

    check-cast v10, Ljava/util/Collection;

    move-object v12, v9

    check-cast v12, Ljava/lang/Iterable;

    invoke-static {v10, v12}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    sget-object v12, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getWrapperJar()Ljava/io/File;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    invoke-static {v10, v12}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v10

    move-object/from16 v28, v10

    check-cast v28, Ljava/lang/Iterable;

    move-object/from16 v29, v26

    check-cast v29, Ljava/lang/CharSequence;

    const/16 v35, 0x3e

    const/16 v36, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-static/range {v28 .. v36}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v7, v11, v10}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    .line 144
    .end local v8    # "ver":Ljava/lang/String;
    .end local v9    # "body":Ljava/util/List;
    .end local v23    # "lw":Ljava/util/List;
    .end local v27    # "cpIdx":I
    .local v1, "lw":Ljava/util/List;
    .restart local v11    # "cpIdx":I
    :cond_9
    move-object/from16 v23, v1

    move-object/from16 v26, v10

    move/from16 v27, v11

    .line 150
    .end local v1    # "lw":Ljava/util/List;
    .end local v11    # "cpIdx":I
    .restart local v23    # "lw":Ljava/util/List;
    .restart local v27    # "cpIdx":I
    move-object v1, v7

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v1, v7

    check-cast v1, Ljava/util/Collection;

    move-object/from16 v8, v23

    check-cast v8, Ljava/util/Collection;

    sget-object v9, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getWrapperJar()Ljava/io/File;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    move-object/from16 v28, v8

    check-cast v28, Ljava/lang/Iterable;

    move-object/from16 v29, v26

    check-cast v29, Ljava/lang/CharSequence;

    const/16 v35, 0x3e

    const/16 v36, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-static/range {v28 .. v36}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 153
    :goto_7
    const/4 v1, 0x0

    .local v1, "i":I
    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_8
    const/4 v9, 0x3

    if-ge v1, v8, :cond_c

    .line 154
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 155
    .local v10, "a":Ljava/lang/String;
    new-array v9, v9, [Ljava/lang/String;

    const-string v11, "-Dio.netty.native.workdir="

    const/16 v17, 0x0

    aput-object v11, v9, v17

    const-string v11, "-Djna.tmpdir="

    const/16 v16, 0x1

    aput-object v11, v9, v16

    const-string v11, "-Dorg.lwjgl.system.SharedLibraryExtractPath="

    const/4 v12, 0x2

    aput-object v11, v9, v12

    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 156
    .local v11, "k":Ljava/lang/String;
    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static {v10, v11, v14, v12, v13}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a

    sget-object v12, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getCacheDir()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v7, v1, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_a
    const/4 v12, 0x2

    goto :goto_9

    .line 153
    .end local v10    # "a":Ljava/lang/String;
    .end local v11    # "k":Ljava/lang/String;
    :cond_b
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    .line 158
    .end local v1    # "i":I
    :cond_c
    sget-object v1, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getLwjglDir()Ljava/io/File;

    move-result-object v8

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getArchAndroid()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v11, "/"

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v12, "/natives/"

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 160
    .local v1, "natives":Ljava/lang/String;
    const/16 v8, 0x21

    new-array v8, v8, [Lkotlin/Pair;

    const-string v10, "-Dfile.encoding="

    const-string v12, "UTF-8"

    invoke-static {v10, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/16 v17, 0x0

    aput-object v10, v8, v17

    const-string v10, "-Dsun.stdout.encoding="

    invoke-static {v10, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/16 v16, 0x1

    aput-object v10, v8, v16

    const-string v10, "-Dsun.stderr.encoding="

    invoke-static {v10, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/16 v18, 0x2

    aput-object v10, v8, v18

    .line 161
    const-string v10, "-Djava.rmi.server.useCodebaseOnly="

    const-string v12, "true"

    invoke-static {v10, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v8, v9

    .line 160
    nop

    .line 161
    const-string v9, "-Dcom.sun.jndi.rmi.object.trustURLCodebase="

    const-string v10, "false"

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/4 v13, 0x4

    aput-object v9, v8, v13

    .line 160
    nop

    .line 162
    const-string v9, "-Dcom.sun.jndi.cosnaming.object.trustURLCodebase="

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/4 v13, 0x5

    aput-object v9, v8, v13

    .line 160
    nop

    .line 162
    const-string v9, "-Dlog4j2.formatMsgNoLookups="

    invoke-static {v9, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/4 v13, 0x6

    aput-object v9, v8, v13

    .line 160
    nop

    .line 163
    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getCpus()I

    move-result v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    const-string v13, "-XX:ActiveProcessorCount="

    invoke-static {v13, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/4 v13, 0x7

    aput-object v9, v8, v13

    .line 160
    nop

    .line 164
    const-string v9, "-Dfml.ignoreInvalidMinecraftCertificates="

    invoke-static {v9, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v13, 0x8

    aput-object v9, v8, v13

    .line 160
    nop

    .line 164
    const-string v9, "-Dfml.ignorePatchDiscrepancies="

    invoke-static {v9, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0x9

    aput-object v9, v8, v14

    .line 160
    nop

    .line 165
    sget-object v9, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getJavaDir()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string v15, "/resolv.conf"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9, v14}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v14, "-Dext.net.resolvPath="

    invoke-static {v14, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0xa

    aput-object v9, v8, v14

    .line 160
    nop

    .line 165
    sget-object v9, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getCacheDir()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9, v14}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v14, "-Djava.io.tmpdir="

    invoke-static {v14, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0xb

    aput-object v9, v8, v14

    .line 160
    nop

    .line 166
    const-string v9, "-Dos.name="

    const-string v14, "Linux"

    invoke-static {v9, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0xc

    aput-object v9, v8, v14

    .line 160
    nop

    .line 166
    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getAndroidRelease()Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Android-"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v14, "-Dos.version="

    invoke-static {v14, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0xd

    aput-object v9, v8, v14

    .line 160
    nop

    .line 167
    const-string v9, "-Dorg.lwjgl.opengl.libname="

    const-string v14, "${gl_lib_name}"

    invoke-static {v9, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0xe

    aput-object v9, v8, v14

    .line 160
    nop

    .line 167
    const-string v9, "-Dorg.lwjgl.egl.libname="

    const-string v14, "${egl_lib_name}"

    invoke-static {v9, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0xf

    aput-object v9, v8, v14

    .line 160
    nop

    .line 168
    sget-object v9, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getNativeLibDir()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string v15, "/libopenal.so"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9, v14}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v14, "-Dorg.lwjgl.openal.libname="

    invoke-static {v14, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0x10

    aput-object v9, v8, v14

    .line 160
    nop

    .line 169
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v14, "/libfreetype.so"

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v14, "-Dorg.lwjgl.freetype.libname="

    invoke-static {v14, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0x11

    aput-object v9, v8, v14

    .line 160
    nop

    .line 169
    const-string v9, "-Dorg.lwjgl.librarypath="

    invoke-static {v9, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0x12

    aput-object v9, v8, v14

    .line 160
    nop

    .line 170
    const-string v9, "-Dorg.lwjgl.system.allocator="

    const-string v14, "system"

    invoke-static {v9, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0x13

    aput-object v9, v8, v14

    .line 160
    nop

    .line 170
    const-string v9, "-Dfml.earlyprogresswindow="

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0x14

    aput-object v9, v8, v14

    .line 160
    nop

    .line 170
    const-string v9, "-Dglfwstub.initEgl="

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v14, 0x15

    aput-object v9, v8, v14

    .line 160
    nop

    .line 171
    const-string v9, "-Dloader.disable_forked_guis="

    invoke-static {v9, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v12, 0x16

    aput-object v9, v8, v12

    .line 160
    nop

    .line 171
    sget-object v9, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v9, v5}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v12, "-Duser.home="

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v12, 0x17

    aput-object v9, v8, v12

    .line 160
    nop

    .line 171
    const-string v9, "-Duser.language="

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getLanguage()Ljava/lang/String;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v12, 0x18

    aput-object v9, v8, v12

    .line 160
    nop

    .line 172
    const-string v9, "-Duser.country="

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getCountry()Ljava/lang/String;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v12, 0x19

    aput-object v9, v8, v12

    .line 160
    nop

    .line 172
    const-string v9, "-Duser.timezone="

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getTimezone()Ljava/lang/String;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v12, 0x1a

    aput-object v9, v8, v12

    .line 160
    nop

    .line 172
    const-string v9, "-Dorg.lwjgl.vulkan.libname="

    const-string v12, "libvulkan.so"

    invoke-static {v9, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v12, 0x1b

    aput-object v9, v8, v12

    .line 160
    nop

    .line 173
    const-string v9, "-Dorg.lwjgl.spvc.libname="

    const-string v12, "spirv-cross-c-shared"

    invoke-static {v9, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v12, 0x1c

    aput-object v9, v8, v12

    .line 160
    nop

    .line 173
    const-string v9, "-Dsodium.checks.issue2561="

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x1d

    aput-object v9, v8, v10

    .line 160
    nop

    .line 174
    const-string v9, "-Djdk.lang.Process.launchMechanism="

    const-string v10, "FORK"

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x1e

    aput-object v9, v8, v10

    .line 160
    nop

    .line 174
    const-string v9, "-Dcpu.name="

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getCpuName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x1f

    aput-object v9, v8, v10

    .line 160
    nop

    .line 174
    sget-object v9, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getJnaBootPath()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "-Djna.boot.library.path="

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x20

    aput-object v9, v8, v10

    .line 160
    nop

    .line 159
    invoke-static {v8}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    move-result-object v8

    .line 176
    .local v8, "defaults":Ljava/util/LinkedHashMap;
    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getExtraJvmEnv()Ljava/util/Map;

    move-result-object v9

    .local v9, "$this$forEach$iv":Ljava/util/Map;
    const/4 v10, 0x0

    .line 254
    .local v10, "$i$f$forEach":I
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_a
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    const-string v15, "="

    if-eqz v14, :cond_d

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Map$Entry;

    .local v14, "element$iv":Ljava/util/Map$Entry;
    const/16 v19, 0x0

    .local v19, "$i$a$-forEach-FclLaunchArgs$rewrite$1":I
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v13, v20

    check-cast v13, Ljava/lang/String;

    .local v13, "k":Ljava/lang/String;
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v24, v1

    .end local v1    # "natives":Ljava/lang/String;
    .local v24, "natives":Ljava/lang/String;
    move-object/from16 v1, v20

    check-cast v1, Ljava/lang/String;

    .line 176
    .local v1, "v":Ljava/lang/String;
    move-object v5, v8

    check-cast v5, Ljava/util/Map;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .end local v1    # "v":Ljava/lang/String;
    .end local v13    # "k":Ljava/lang/String;
    .end local v19    # "$i$a$-forEach-FclLaunchArgs$rewrite$1":I
    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v1, v24

    const/16 v13, 0x8

    .end local v14    # "element$iv":Ljava/util/Map$Entry;
    goto :goto_a

    .line 255
    .end local v24    # "natives":Ljava/lang/String;
    .local v1, "natives":Ljava/lang/String;
    :cond_d
    move-object/from16 v24, v1

    .line 177
    .end local v1    # "natives":Ljava/lang/String;
    .end local v9    # "$this$forEach$iv":Ljava/util/Map;
    .end local v10    # "$i$f$forEach":I
    .restart local v24    # "natives":Ljava/lang/String;
    move-object v1, v8

    check-cast v1, Ljava/util/Map;

    .local v1, "$this$filter$iv":Ljava/util/Map;
    const/4 v5, 0x0

    .line 256
    .local v5, "$i$f$filter":I
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v6, Ljava/util/Map;

    .local v6, "destination$iv$iv":Ljava/util/Map;
    move-object v9, v1

    .local v9, "$this$filterTo$iv$iv":Ljava/util/Map;
    const/4 v10, 0x0

    .line 257
    .local v10, "$i$f$filterTo":I
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_b
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_12

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    .line 258
    .local v13, "element$iv$iv":Ljava/util/Map$Entry;
    const/4 v14, 0x0

    .local v14, "$i$a$-filter-FclLaunchArgs$rewrite$pre$1":I
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v1

    .end local v1    # "$this$filter$iv":Ljava/util/Map;
    .local v20, "$this$filter$iv":Ljava/util/Map;
    move-object/from16 v1, v19

    check-cast v1, Ljava/lang/String;

    .line 177
    .local v1, "k":Ljava/lang/String;
    move/from16 v19, v5

    .end local v5    # "$i$f$filter":I
    .local v19, "$i$f$filter":I
    move-object v5, v7

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$none$iv":Ljava/lang/Iterable;
    const/16 v25, 0x0

    .line 259
    .local v25, "$i$f$none":I
    move-object/from16 v26, v7

    .end local v7    # "jvm":Ljava/util/List;
    .local v26, "jvm":Ljava/util/List;
    instance-of v7, v5, Ljava/util/Collection;

    if-eqz v7, :cond_e

    move-object v7, v5

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_e

    move-object/from16 v32, v8

    move-object/from16 v33, v9

    move/from16 v5, v16

    goto :goto_d

    .line 260
    :cond_e
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v28

    if-eqz v28, :cond_10

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v28

    move-object/from16 v29, v5

    .end local v5    # "$this$none$iv":Ljava/lang/Iterable;
    .local v28, "element$iv":Ljava/lang/Object;
    .local v29, "$this$none$iv":Ljava/lang/Iterable;
    move-object/from16 v5, v28

    check-cast v5, Ljava/lang/String;

    .local v5, "it":Ljava/lang/String;
    const/16 v30, 0x0

    .line 177
    .local v30, "$i$a$-none-FclLaunchArgs$rewrite$pre$1$1":I
    move-object/from16 v31, v7

    move-object/from16 v32, v8

    move-object/from16 v33, v9

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x0

    .end local v8    # "defaults":Ljava/util/LinkedHashMap;
    .end local v9    # "$this$filterTo$iv$iv":Ljava/util/Map;
    .local v32, "defaults":Ljava/util/LinkedHashMap;
    .local v33, "$this$filterTo$iv$iv":Ljava/util/Map;
    invoke-static {v5, v1, v9, v7, v8}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    .line 260
    .end local v5    # "it":Ljava/lang/String;
    .end local v30    # "$i$a$-none-FclLaunchArgs$rewrite$pre$1$1":I
    if-eqz v5, :cond_f

    const/4 v5, 0x0

    goto :goto_d

    :cond_f
    move-object/from16 v5, v29

    move-object/from16 v7, v31

    move-object/from16 v8, v32

    move-object/from16 v9, v33

    goto :goto_c

    .line 261
    .end local v28    # "element$iv":Ljava/lang/Object;
    .end local v29    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v32    # "defaults":Ljava/util/LinkedHashMap;
    .end local v33    # "$this$filterTo$iv$iv":Ljava/util/Map;
    .local v5, "$this$none$iv":Ljava/lang/Iterable;
    .restart local v8    # "defaults":Ljava/util/LinkedHashMap;
    .restart local v9    # "$this$filterTo$iv$iv":Ljava/util/Map;
    :cond_10
    move-object/from16 v29, v5

    move-object/from16 v32, v8

    move-object/from16 v33, v9

    .end local v5    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v8    # "defaults":Ljava/util/LinkedHashMap;
    .end local v9    # "$this$filterTo$iv$iv":Ljava/util/Map;
    .restart local v29    # "$this$none$iv":Ljava/lang/Iterable;
    .restart local v32    # "defaults":Ljava/util/LinkedHashMap;
    .restart local v33    # "$this$filterTo$iv$iv":Ljava/util/Map;
    move/from16 v5, v16

    .line 177
    .end local v25    # "$i$f$none":I
    .end local v29    # "$this$none$iv":Ljava/lang/Iterable;
    :goto_d
    nop

    .line 258
    .end local v1    # "k":Ljava/lang/String;
    .end local v14    # "$i$a$-filter-FclLaunchArgs$rewrite$pre$1":I
    if-eqz v5, :cond_11

    .line 262
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v6, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v5, v19

    move-object/from16 v1, v20

    move-object/from16 v7, v26

    move-object/from16 v8, v32

    move-object/from16 v9, v33

    goto/16 :goto_b

    .line 258
    :cond_11
    move/from16 v5, v19

    move-object/from16 v1, v20

    move-object/from16 v7, v26

    move-object/from16 v8, v32

    move-object/from16 v9, v33

    goto/16 :goto_b

    .line 265
    .end local v13    # "element$iv$iv":Ljava/util/Map$Entry;
    .end local v19    # "$i$f$filter":I
    .end local v20    # "$this$filter$iv":Ljava/util/Map;
    .end local v26    # "jvm":Ljava/util/List;
    .end local v32    # "defaults":Ljava/util/LinkedHashMap;
    .end local v33    # "$this$filterTo$iv$iv":Ljava/util/Map;
    .local v1, "$this$filter$iv":Ljava/util/Map;
    .local v5, "$i$f$filter":I
    .restart local v7    # "jvm":Ljava/util/List;
    .restart local v8    # "defaults":Ljava/util/LinkedHashMap;
    .restart local v9    # "$this$filterTo$iv$iv":Ljava/util/Map;
    :cond_12
    move-object/from16 v20, v1

    move/from16 v19, v5

    move-object/from16 v26, v7

    move-object/from16 v32, v8

    move-object/from16 v33, v9

    .line 256
    .end local v1    # "$this$filter$iv":Ljava/util/Map;
    .end local v5    # "$i$f$filter":I
    .end local v6    # "destination$iv$iv":Ljava/util/Map;
    .end local v7    # "jvm":Ljava/util/List;
    .end local v8    # "defaults":Ljava/util/LinkedHashMap;
    .end local v9    # "$this$filterTo$iv$iv":Ljava/util/Map;
    .end local v10    # "$i$f$filterTo":I
    .restart local v19    # "$i$f$filter":I
    .restart local v20    # "$this$filter$iv":Ljava/util/Map;
    .restart local v26    # "jvm":Ljava/util/List;
    .restart local v32    # "defaults":Ljava/util/LinkedHashMap;
    nop

    .line 177
    .end local v19    # "$i$f$filter":I
    .end local v20    # "$this$filter$iv":Ljava/util/Map;
    nop

    .local v6, "$this$map$iv":Ljava/util/Map;
    const/4 v1, 0x0

    .line 266
    .local v1, "$i$f$map":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/Map;->size()I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v6

    .local v7, "$this$mapTo$iv$iv":Ljava/util/Map;
    const/4 v8, 0x0

    .line 267
    .local v8, "$i$f$mapTo":I
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_13

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    .line 268
    .local v10, "item$iv$iv":Ljava/util/Map$Entry;
    const/4 v12, 0x0

    .local v12, "$i$a$-map-FclLaunchArgs$rewrite$pre$2":I
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .local v13, "k":Ljava/lang/String;
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 177
    .local v14, "v":Ljava/lang/String;
    move/from16 v19, v1

    .end local v1    # "$i$f$map":I
    .local v19, "$i$f$map":I
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 268
    .end local v12    # "$i$a$-map-FclLaunchArgs$rewrite$pre$2":I
    .end local v13    # "k":Ljava/lang/String;
    .end local v14    # "v":Ljava/lang/String;
    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v1, v19

    goto :goto_e

    .line 269
    .end local v10    # "item$iv$iv":Ljava/util/Map$Entry;
    .end local v19    # "$i$f$map":I
    .restart local v1    # "$i$f$map":I
    :cond_13
    move/from16 v19, v1

    .end local v1    # "$i$f$map":I
    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":Ljava/util/Map;
    .end local v8    # "$i$f$mapTo":I
    .restart local v19    # "$i$f$map":I
    move-object v1, v5

    check-cast v1, Ljava/util/List;

    .line 266
    nop

    .line 177
    .end local v6    # "$this$map$iv":Ljava/util/Map;
    .end local v19    # "$i$f$map":I
    nop

    .line 179
    .local v1, "pre":Ljava/util/List;
    move-object/from16 v5, v26

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$takeWhile$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 270
    .local v6, "$i$f$takeWhile":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 271
    .local v7, "list$iv":Ljava/util/ArrayList;
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v10, "-javaagent:"

    if-eqz v9, :cond_17

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 272
    .local v9, "item$iv":Ljava/lang/Object;
    move-object v12, v9

    check-cast v12, Ljava/lang/String;

    .local v12, "it":Ljava/lang/String;
    const/4 v13, 0x0

    .line 179
    .local v13, "$i$a$-takeWhile-FclLaunchArgs$rewrite$head$1":I
    const-string v14, "-Xm"

    move-object/from16 v19, v1

    move-object/from16 v20, v5

    move/from16 v25, v6

    const/4 v1, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    .end local v1    # "pre":Ljava/util/List;
    .end local v5    # "$this$takeWhile$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$takeWhile":I
    .local v19, "pre":Ljava/util/List;
    .local v20, "$this$takeWhile$iv":Ljava/lang/Iterable;
    .local v25, "$i$f$takeWhile":I
    invoke-static {v12, v14, v6, v1, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_15

    invoke-static {v12, v10, v6, v1, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_15

    const-string v14, "-Dauthlibinjector"

    invoke-static {v12, v14, v6, v1, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_15

    const-string v14, "-Dnide8auth"

    invoke-static {v12, v14, v6, v1, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_14

    goto :goto_10

    :cond_14
    const/4 v1, 0x0

    goto :goto_11

    :cond_15
    :goto_10
    move/from16 v1, v16

    .line 272
    .end local v12    # "it":Ljava/lang/String;
    .end local v13    # "$i$a$-takeWhile-FclLaunchArgs$rewrite$head$1":I
    :goto_11
    if-nez v1, :cond_16

    .line 273
    goto :goto_12

    .line 274
    :cond_16
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v19

    move-object/from16 v5, v20

    move/from16 v6, v25

    goto :goto_f

    .line 271
    .end local v9    # "item$iv":Ljava/lang/Object;
    .end local v19    # "pre":Ljava/util/List;
    .end local v20    # "$this$takeWhile$iv":Ljava/lang/Iterable;
    .end local v25    # "$i$f$takeWhile":I
    .restart local v1    # "pre":Ljava/util/List;
    .restart local v5    # "$this$takeWhile$iv":Ljava/lang/Iterable;
    .restart local v6    # "$i$f$takeWhile":I
    :cond_17
    move-object/from16 v19, v1

    move-object/from16 v20, v5

    move/from16 v25, v6

    .line 276
    .end local v1    # "pre":Ljava/util/List;
    .end local v5    # "$this$takeWhile$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$takeWhile":I
    .restart local v19    # "pre":Ljava/util/List;
    .restart local v20    # "$this$takeWhile$iv":Ljava/lang/Iterable;
    .restart local v25    # "$i$f$takeWhile":I
    :goto_12
    move-object v1, v7

    check-cast v1, Ljava/util/List;

    .line 179
    .end local v7    # "list$iv":Ljava/util/ArrayList;
    .end local v20    # "$this$takeWhile$iv":Ljava/lang/Iterable;
    .end local v25    # "$i$f$takeWhile":I
    nop

    .line 180
    .local v1, "head":Ljava/util/List;
    const/16 v5, 0x8

    if-gt v4, v5, :cond_18

    move/from16 v5, v16

    goto :goto_13

    :cond_18
    const/4 v5, 0x0

    .line 181
    .local v5, "isJava8":Z
    :goto_13
    if-eqz v5, :cond_19

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getCacio8Dir()Ljava/io/File;

    move-result-object v6

    goto :goto_14

    :cond_19
    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getCacio17Dir()Ljava/io/File;

    move-result-object v6

    .line 182
    .local v6, "cacioDir":Ljava/io/File;
    :goto_14
    if-nez v6, :cond_1a

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    move-object/from16 v20, v1

    move/from16 v25, v5

    move-object/from16 v29, v6

    goto/16 :goto_1c

    :cond_1a
    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getScreenSize()Ljava/lang/String;

    move-result-object v7

    if-eqz v5, :cond_1b

    const/4 v8, 0x0

    goto :goto_15

    :cond_1b
    new-instance v8, Ljava/io/File;

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getCacio17Dir()Ljava/io/File;

    move-result-object v9

    const-string v12, "cacio-agent.jar"

    invoke-direct {v8, v9, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :goto_15
    invoke-virtual {v0, v7, v5, v6, v8}, Lcom/pymcl/runtime/FclLaunchArgs;->cacioArgs(Ljava/lang/String;ZLjava/io/File;Ljava/io/File;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    .line 183
    nop

    .local v7, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 277
    .local v8, "$i$f$filter":I
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/Collection;

    .local v9, "destination$iv$iv":Ljava/util/Collection;
    move-object v12, v7

    .local v12, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 278
    .local v13, "$i$f$filterTo":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_16
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_23

    move-object/from16 v20, v1

    .end local v1    # "head":Ljava/util/List;
    .local v20, "head":Ljava/util/List;
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move/from16 v25, v5

    .end local v5    # "isJava8":Z
    .local v1, "element$iv$iv":Ljava/lang/Object;
    .local v25, "isJava8":Z
    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    .local v5, "c":Ljava/lang/String;
    const/16 v28, 0x0

    .line 183
    .local v28, "$i$a$-filter-FclLaunchArgs$rewrite$cacio$1":I
    move-object/from16 v29, v6

    .end local v6    # "cacioDir":Ljava/io/File;
    .local v29, "cacioDir":Ljava/io/File;
    const/16 v6, 0x3d

    move-object/from16 v30, v7

    .end local v7    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v30, "$this$filter$iv":Ljava/lang/Iterable;
    invoke-static {v5, v6, v5}, Lkotlin/text/StringsKt;->substringBefore(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move/from16 v31, v8

    .end local v8    # "$i$f$filter":I
    .local v31, "$i$f$filter":I
    move-object v8, v5

    check-cast v8, Ljava/lang/CharSequence;

    move-object/from16 v33, v12

    move/from16 v34, v13

    move-object/from16 v35, v14

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x0

    .end local v12    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$filterTo":I
    .local v33, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .local v34, "$i$f$filterTo":I
    invoke-static {v8, v6, v14, v12, v13}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1c

    move-object v6, v15

    goto :goto_17

    :cond_1c
    const-string v6, ""

    :goto_17
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .local v6, "k":Ljava/lang/String;
    const-string v7, "--add-"

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static {v5, v7, v14, v12, v13}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_21

    const-string v7, "-Xbootclasspath"

    invoke-static {v5, v7, v14, v12, v13}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_21

    invoke-static {v5, v10, v14, v12, v13}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_21

    move-object/from16 v7, v26

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$none$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 279
    .local v8, "$i$f$none":I
    instance-of v12, v7, Ljava/util/Collection;

    if-eqz v12, :cond_1d

    move-object v12, v7

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_1d

    move-object/from16 v37, v5

    move/from16 v12, v16

    goto :goto_19

    .line 280
    :cond_1d
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_18
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .local v13, "element$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Ljava/lang/String;

    .local v14, "it":Ljava/lang/String;
    const/16 v36, 0x0

    .line 183
    .local v36, "$i$a$-none-FclLaunchArgs$rewrite$cacio$1$1":I
    move-object/from16 v37, v5

    move-object/from16 v38, v7

    move/from16 v39, v8

    const/4 v5, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    .end local v5    # "c":Ljava/lang/String;
    .end local v7    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$none":I
    .local v37, "c":Ljava/lang/String;
    .local v38, "$this$none$iv":Ljava/lang/Iterable;
    .local v39, "$i$f$none":I
    invoke-static {v14, v6, v8, v5, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v14

    .line 280
    .end local v14    # "it":Ljava/lang/String;
    .end local v36    # "$i$a$-none-FclLaunchArgs$rewrite$cacio$1$1":I
    if-eqz v14, :cond_1e

    const/4 v12, 0x0

    goto :goto_19

    :cond_1e
    move-object/from16 v5, v37

    move-object/from16 v7, v38

    move/from16 v8, v39

    goto :goto_18

    .line 281
    .end local v13    # "element$iv":Ljava/lang/Object;
    .end local v37    # "c":Ljava/lang/String;
    .end local v38    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v39    # "$i$f$none":I
    .restart local v5    # "c":Ljava/lang/String;
    .restart local v7    # "$this$none$iv":Ljava/lang/Iterable;
    .restart local v8    # "$i$f$none":I
    :cond_1f
    move-object/from16 v37, v5

    move-object/from16 v38, v7

    move/from16 v39, v8

    .end local v5    # "c":Ljava/lang/String;
    .end local v7    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$none":I
    .restart local v37    # "c":Ljava/lang/String;
    .restart local v38    # "$this$none$iv":Ljava/lang/Iterable;
    .restart local v39    # "$i$f$none":I
    move/from16 v12, v16

    .line 183
    .end local v38    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v39    # "$i$f$none":I
    :goto_19
    if-eqz v12, :cond_20

    goto :goto_1a

    :cond_20
    const/4 v12, 0x0

    goto :goto_1b

    .end local v37    # "c":Ljava/lang/String;
    .restart local v5    # "c":Ljava/lang/String;
    :cond_21
    move-object/from16 v37, v5

    .end local v5    # "c":Ljava/lang/String;
    .restart local v37    # "c":Ljava/lang/String;
    :goto_1a
    move/from16 v12, v16

    .line 278
    .end local v6    # "k":Ljava/lang/String;
    .end local v28    # "$i$a$-filter-FclLaunchArgs$rewrite$cacio$1":I
    .end local v37    # "c":Ljava/lang/String;
    :goto_1b
    if-eqz v12, :cond_22

    invoke-interface {v9, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_22
    move-object/from16 v1, v20

    move/from16 v5, v25

    move-object/from16 v6, v29

    move-object/from16 v7, v30

    move/from16 v8, v31

    move-object/from16 v12, v33

    move/from16 v13, v34

    move-object/from16 v14, v35

    goto/16 :goto_16

    .line 282
    .end local v20    # "head":Ljava/util/List;
    .end local v25    # "isJava8":Z
    .end local v29    # "cacioDir":Ljava/io/File;
    .end local v30    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v31    # "$i$f$filter":I
    .end local v33    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v34    # "$i$f$filterTo":I
    .local v1, "head":Ljava/util/List;
    .local v5, "isJava8":Z
    .local v6, "cacioDir":Ljava/io/File;
    .local v7, "$this$filter$iv":Ljava/lang/Iterable;
    .local v8, "$i$f$filter":I
    .restart local v12    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .local v13, "$i$f$filterTo":I
    :cond_23
    move-object/from16 v20, v1

    move/from16 v25, v5

    move-object/from16 v29, v6

    move-object/from16 v30, v7

    move/from16 v31, v8

    move-object/from16 v33, v12

    move/from16 v34, v13

    .end local v1    # "head":Ljava/util/List;
    .end local v5    # "isJava8":Z
    .end local v6    # "cacioDir":Ljava/io/File;
    .end local v7    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$filter":I
    .end local v9    # "destination$iv$iv":Ljava/util/Collection;
    .end local v12    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$filterTo":I
    .restart local v20    # "head":Ljava/util/List;
    .restart local v25    # "isJava8":Z
    .restart local v29    # "cacioDir":Ljava/io/File;
    .restart local v30    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v31    # "$i$f$filter":I
    move-object v7, v9

    check-cast v7, Ljava/util/List;

    .line 277
    nop

    .line 182
    .end local v30    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v31    # "$i$f$filter":I
    :goto_1c
    nop

    .line 184
    .local v7, "cacio":Ljava/util/List;
    nop

    .line 185
    nop

    .line 184
    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getLibPatcherJar()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_27

    move-object v5, v1

    .line 226
    .local v5, "it":Ljava/io/File;
    const/4 v6, 0x0

    .line 184
    .local v6, "$i$a$-takeIf-FclLaunchArgs$rewrite$patcher$1":I
    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getLibPatcher()Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;

    move-result-object v8

    invoke-virtual {v8}, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->getEnabled()Z

    move-result v8

    if-eqz v8, :cond_25

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getRequireLibPatcherFile()Z

    move-result v8

    if-eqz v8, :cond_24

    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v8

    if-eqz v8, :cond_25

    :cond_24
    move/from16 v15, v16

    goto :goto_1d

    :cond_25
    const/4 v15, 0x0

    .end local v5    # "it":Ljava/io/File;
    .end local v6    # "$i$a$-takeIf-FclLaunchArgs$rewrite$patcher$1":I
    :goto_1d
    if-eqz v15, :cond_26

    goto :goto_1e

    :cond_26
    const/4 v1, 0x0

    .line 185
    :goto_1e
    if-eqz v1, :cond_27

    .line 184
    nop

    .line 185
    nop

    .line 226
    .local v1, "it":Ljava/io/File;
    const/4 v5, 0x0

    .line 185
    .local v5, "$i$a$-let-FclLaunchArgs$rewrite$patcher$2":I
    sget-object v6, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v6, v1}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-virtual/range {p8 .. p8}, Lcom/pymcl/runtime/FclLaunchArgs$Env;->getLibPatcher()Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;

    move-result-object v8

    invoke-virtual {v8}, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->jvmOptions()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v6, v8}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    .line 184
    .end local v1    # "it":Ljava/io/File;
    .end local v5    # "$i$a$-let-FclLaunchArgs$rewrite$patcher$2":I
    if-eqz v1, :cond_27

    goto :goto_1f

    .line 185
    :cond_27
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    .line 184
    :goto_1f
    nop

    .line 187
    .local v1, "patcher":Ljava/util/List;
    new-instance v5, Ljava/util/ArrayList;

    move-object v6, v7

    check-cast v6, Ljava/util/Collection;

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 188
    .local v5, "out":Ljava/util/ArrayList;
    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    move-object/from16 v8, v20

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v6, v8}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 189
    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    move-object/from16 v8, v19

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v6, v8}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 190
    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    move-object v8, v1

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v6, v8}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 191
    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    move-object/from16 v8, v26

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    move-result v9

    invoke-static {v8, v9}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v6, v8}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 192
    const/16 v6, 0x8

    if-le v4, v6, :cond_28

    move-object v6, v2

    check-cast v6, Ljava/lang/CharSequence;

    const/16 v8, 0x2e

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static {v6, v8, v14, v12, v13}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_28

    .line 193
    invoke-static {v2, v8, v13, v12, v13}, Lkotlin/text/StringsKt;->substringBeforeLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 194
    .local v6, "pkg":Ljava/lang/String;
    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    const-string v9, "--add-exports"

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "=ALL-UNNAMED"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 196
    .end local v6    # "pkg":Ljava/lang/String;
    :cond_28
    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    const-string v8, "mio.Wrapper"

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 197
    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    invoke-virtual {v0, v3, v8, v9}, Lcom/pymcl/runtime/FclLaunchArgs;->applyServer(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-static {v6, v10}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 198
    move-object v6, v5

    check-cast v6, Ljava/util/List;

    return-object v6
.end method

.method public final splitAddress(Ljava/lang/String;)Lkotlin/Pair;
    .locals 13
    .param p1, "address"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .local v0, "s":Ljava/lang/String;
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/4 v4, 0x0

    if-eqz v1, :cond_1

    return-object v4

    .line 90
    :cond_1
    const-string v1, "["

    const/4 v5, 0x2

    invoke-static {v0, v1, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    move-object v6, v0

    check-cast v6, Ljava/lang/CharSequence;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/16 v7, 0x5d

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    .local v1, "e":I
    if-gez v1, :cond_2

    return-object v4

    .line 91
    :cond_2
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const-string v6, "substring(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v7, v1, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, ":"

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v7, v6}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_3

    move v2, v3

    :cond_3
    if-eqz v2, :cond_4

    .line 226
    const/4 v2, 0x0

    .line 91
    .local v2, "$i$a$-ifEmpty-FclLaunchArgs$splitAddress$1":I
    nop

    .end local v2    # "$i$a$-ifEmpty-FclLaunchArgs$splitAddress$1":I
    const-string v6, "25565"

    :cond_4
    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v5, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    return-object v2

    :cond_5
    return-object v4

    .line 92
    .end local v1    # "e":I
    :cond_6
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    .local v1, "$this$count$iv":Ljava/lang/CharSequence;
    const/4 v6, 0x0

    .line 231
    .local v6, "$i$f$count":I
    const/4 v7, 0x0

    .line 232
    .local v7, "count$iv":I
    move v8, v2

    :goto_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v9

    const/16 v10, 0x3a

    if-ge v8, v9, :cond_9

    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    .local v9, "element$iv":C
    move v11, v9

    .local v11, "it":C
    const/4 v12, 0x0

    .line 92
    .local v12, "$i$a$-count-FclLaunchArgs$splitAddress$2":I
    if-ne v11, v10, :cond_7

    move v10, v3

    goto :goto_2

    :cond_7
    move v10, v2

    .line 232
    .end local v11    # "it":C
    .end local v12    # "$i$a$-count-FclLaunchArgs$splitAddress$2":I
    :goto_2
    if-eqz v10, :cond_8

    add-int/lit8 v7, v7, 0x1

    .end local v9    # "element$iv":C
    :cond_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 233
    :cond_9
    nop

    .line 92
    .end local v1    # "$this$count$iv":Ljava/lang/CharSequence;
    .end local v6    # "$i$f$count":I
    .end local v7    # "count$iv":I
    if-ne v7, v3, :cond_b

    invoke-static {v0, v10, v4, v5, v4}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v10, v4, v5, v4}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_3

    :cond_a
    return-object v4

    :cond_b
    const/16 v1, 0x63dd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    :goto_3
    return-object v1
.end method

.method public final supportsQuickPlay(Ljava/lang/String;)Z
    .locals 12
    .param p1, "mcVersion"    # Ljava/lang/String;

    .line 79
    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_1

    const-string v1, ""

    .local v1, "v":Ljava/lang/String;
    :cond_1
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_1

    :cond_2
    move v2, v4

    :goto_1
    if-eqz v2, :cond_3

    return v4

    .line 80
    :cond_3
    new-instance v2, Lkotlin/text/Regex;

    const-string v5, "^(\\d{2})w(\\d{2})[a-z]"

    invoke-direct {v2, v5}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v5, v1

    check-cast v5, Ljava/lang/CharSequence;

    const/4 v6, 0x2

    invoke-static {v2, v5, v4, v6, v0}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 226
    .local v0, "m":Lkotlin/text/MatchResult;
    const/4 v2, 0x0

    .line 80
    .local v2, "$i$a$-let-FclLaunchArgs$supportsQuickPlay$1":I
    invoke-interface {v0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    mul-int/lit8 v5, v5, 0x64

    invoke-interface {v0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const/16 v6, 0x90a

    if-lt v5, v6, :cond_4

    goto :goto_2

    :cond_4
    move v3, v4

    :goto_2
    return v3

    .line 81
    .end local v0    # "m":Lkotlin/text/MatchResult;
    .end local v2    # "$i$a$-let-FclLaunchArgs$supportsQuickPlay$1":I
    :cond_5
    move-object v5, v1

    check-cast v5, Ljava/lang/CharSequence;

    const/4 v0, 0x4

    new-array v6, v0, [C

    fill-array-data v6, :array_0

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 227
    .local v2, "$i$f$map":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v0

    .local v6, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 228
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 229
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .local v10, "it":Ljava/lang/String;
    const/4 v11, 0x0

    .line 81
    .local v11, "$i$a$-map-FclLaunchArgs$supportsQuickPlay$nums$1":I
    invoke-static {v10}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v10

    .line 229
    .end local v10    # "it":Ljava/lang/String;
    .end local v11    # "$i$a$-map-FclLaunchArgs$supportsQuickPlay$nums$1":I
    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 230
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    :cond_6
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    check-cast v5, Ljava/util/List;

    .line 227
    nop

    .line 81
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map":I
    nop

    .line 82
    .local v5, "nums":Ljava/util/List;
    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 83
    .local v0, "major":I
    if-eq v0, v3, :cond_8

    if-le v0, v3, :cond_7

    goto :goto_4

    :cond_7
    move v3, v4

    :goto_4
    return v3

    .line 84
    :cond_8
    invoke-static {v5, v3}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_5

    :cond_9
    move v2, v4

    :goto_5
    const/16 v6, 0x14

    if-lt v2, v6, :cond_a

    goto :goto_6

    :cond_a
    move v3, v4

    :goto_6
    return v3

    .line 82
    .end local v0    # "major":I
    :cond_b
    return v4

    :array_0
    .array-data 2
        0x2es
        0x2ds
        0x20s
        0x5fs
    .end array-data
.end method
