.class public final Lcom/pymcl/runtime/control/KeyChoices;
.super Ljava/lang/Object;
.source "GamepadMapDialog.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGamepadMapDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamepadMapDialog.kt\ncom/pymcl/runtime/control/KeyChoices\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n777#2:138\n873#2,2:139\n1#3:141\n*S KotlinDebug\n*F\n+ 1 GamepadMapDialog.kt\ncom/pymcl/runtime/control/KeyChoices\n*L\n29#1:138\n29#1:139,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bJ\u000e\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/runtime/control/KeyChoices;",
        "",
        "<init>",
        "()V",
        "common",
        "",
        "",
        "getCommon",
        "()Ljava/util/List;",
        "all",
        "allKeyNames",
        "",
        "label",
        "name",
        "HINTS",
        "",
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
.field private static final HINTS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/pymcl/runtime/control/KeyChoices;

.field private static final common:Ljava/util/List;
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
    .locals 25

    new-instance v0, Lcom/pymcl/runtime/control/KeyChoices;

    invoke-direct {v0}, Lcom/pymcl/runtime/control/KeyChoices;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/control/KeyChoices;->INSTANCE:Lcom/pymcl/runtime/control/KeyChoices;

    .line 20
    nop

    .line 21
    const/16 v0, 0x27

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, ""

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "MOUSE_LEFT"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "MOUSE_RIGHT"

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-string v1, "MOUSE_MIDDLE"

    const/4 v5, 0x3

    aput-object v1, v0, v5

    const-string v1, "SCROLL_UP"

    const/4 v6, 0x4

    aput-object v1, v0, v6

    const-string v1, "SCROLL_DOWN"

    const/4 v7, 0x5

    aput-object v1, v0, v7

    .line 22
    const/4 v1, 0x6

    const-string v8, "KEY_SPACE"

    aput-object v8, v0, v1

    .line 21
    nop

    .line 22
    const/4 v9, 0x7

    const-string v10, "KEY_LEFTSHIFT"

    aput-object v10, v0, v9

    .line 21
    nop

    .line 22
    const/16 v11, 0x8

    const-string v12, "KEY_LEFTCTRL"

    aput-object v12, v0, v11

    .line 21
    nop

    .line 22
    const/16 v13, 0x9

    const-string v14, "KEY_ESC"

    aput-object v14, v0, v13

    .line 21
    nop

    .line 22
    const/16 v15, 0xa

    move/from16 v16, v1

    const-string v1, "KEY_E"

    aput-object v1, v0, v15

    .line 21
    nop

    .line 22
    const/16 v17, 0xb

    move/from16 v18, v2

    const-string v2, "KEY_Q"

    aput-object v2, v0, v17

    .line 21
    nop

    .line 22
    const/16 v19, 0xc

    move/from16 v20, v3

    const-string v3, "KEY_F"

    aput-object v3, v0, v19

    .line 21
    nop

    .line 22
    const/16 v21, 0xd

    move/from16 v22, v4

    const-string v4, "KEY_TAB"

    aput-object v4, v0, v21

    .line 21
    nop

    .line 23
    const-string v23, "KEY_T"

    const/16 v24, 0xe

    aput-object v23, v0, v24

    .line 21
    nop

    .line 23
    const-string v23, "KEY_SLASH"

    const/16 v24, 0xf

    aput-object v23, v0, v24

    .line 21
    nop

    .line 23
    const-string v23, "KEY_F1"

    const/16 v24, 0x10

    aput-object v23, v0, v24

    .line 21
    nop

    .line 23
    const-string v23, "KEY_F2"

    const/16 v24, 0x11

    aput-object v23, v0, v24

    .line 21
    nop

    .line 23
    const-string v23, "KEY_F3"

    const/16 v24, 0x12

    aput-object v23, v0, v24

    .line 21
    nop

    .line 23
    const-string v23, "KEY_F5"

    const/16 v24, 0x13

    aput-object v23, v0, v24

    .line 21
    nop

    .line 23
    const-string v23, "KEY_W"

    const/16 v24, 0x14

    aput-object v23, v0, v24

    .line 21
    nop

    .line 23
    const-string v23, "KEY_A"

    const/16 v24, 0x15

    aput-object v23, v0, v24

    .line 21
    nop

    .line 23
    const-string v23, "KEY_S"

    const/16 v24, 0x16

    aput-object v23, v0, v24

    .line 21
    nop

    .line 23
    const-string v23, "KEY_D"

    const/16 v24, 0x17

    aput-object v23, v0, v24

    .line 21
    nop

    .line 24
    const-string v23, "KEY_1"

    const/16 v24, 0x18

    aput-object v23, v0, v24

    .line 21
    nop

    .line 24
    const-string v23, "KEY_2"

    const/16 v24, 0x19

    aput-object v23, v0, v24

    .line 21
    nop

    .line 24
    const-string v23, "KEY_3"

    const/16 v24, 0x1a

    aput-object v23, v0, v24

    .line 21
    nop

    .line 24
    const-string v23, "KEY_4"

    const/16 v24, 0x1b

    aput-object v23, v0, v24

    .line 21
    nop

    .line 24
    const-string v23, "KEY_5"

    const/16 v24, 0x1c

    aput-object v23, v0, v24

    .line 21
    nop

    .line 24
    const-string v23, "KEY_6"

    const/16 v24, 0x1d

    aput-object v23, v0, v24

    .line 21
    nop

    .line 24
    const-string v23, "KEY_7"

    const/16 v24, 0x1e

    aput-object v23, v0, v24

    .line 21
    nop

    .line 24
    const-string v23, "KEY_8"

    const/16 v24, 0x1f

    aput-object v23, v0, v24

    .line 21
    nop

    .line 24
    const-string v23, "KEY_9"

    const/16 v24, 0x20

    aput-object v23, v0, v24

    .line 21
    nop

    .line 24
    const-string v23, "KEY_ENTER"

    const/16 v24, 0x21

    aput-object v23, v0, v24

    .line 21
    nop

    .line 25
    sget-object v23, Lcom/pymcl/runtime/input/Keys$Action;->GAME_MENU:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual/range {v23 .. v23}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v23

    const/16 v24, 0x22

    aput-object v23, v0, v24

    .line 21
    nop

    .line 25
    sget-object v23, Lcom/pymcl/runtime/input/Keys$Action;->TOGGLE_IME:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual/range {v23 .. v23}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v23

    const/16 v24, 0x23

    aput-object v23, v0, v24

    .line 21
    nop

    .line 25
    sget-object v23, Lcom/pymcl/runtime/input/Keys$Action;->PC_KEYBOARD:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual/range {v23 .. v23}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v23

    const/16 v24, 0x24

    aput-object v23, v0, v24

    .line 21
    nop

    .line 25
    sget-object v23, Lcom/pymcl/runtime/input/Keys$Action;->QUICK_INPUT:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual/range {v23 .. v23}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v23

    const/16 v24, 0x25

    aput-object v23, v0, v24

    .line 21
    nop

    .line 25
    sget-object v23, Lcom/pymcl/runtime/input/Keys$Action;->TOGGLE_CURSOR:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual/range {v23 .. v23}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v23

    const/16 v24, 0x26

    aput-object v23, v0, v24

    .line 21
    nop

    .line 20
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/control/KeyChoices;->common:Ljava/util/List;

    .line 48
    nop

    .line 49
    const/16 v0, 0x12

    new-array v0, v0, [Lkotlin/Pair;

    move/from16 v23, v5

    const-string v5, "\u8df3\u8dc3"

    invoke-static {v8, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v0, v18

    const-string v5, "\u6f5c\u884c"

    invoke-static {v10, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v0, v20

    const-string v5, "\u75be\u8dd1"

    invoke-static {v12, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v0, v22

    const-string v5, "\u6682\u505c"

    invoke-static {v14, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v0, v23

    const-string v5, "\u7269\u54c1\u680f"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v6

    .line 50
    const-string v1, "\u4e22\u5f03"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v7

    .line 49
    nop

    .line 50
    const-string v1, "\u526f\u624b"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v16

    .line 49
    nop

    .line 50
    const-string v1, "\u73a9\u5bb6\u5217\u8868"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v9

    .line 49
    nop

    .line 50
    const-string v1, "KEY_T"

    const-string v2, "\u804a\u5929"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v11

    .line 49
    nop

    .line 50
    const-string v1, "KEY_SLASH"

    const-string v2, "\u547d\u4ee4"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v13

    .line 49
    nop

    .line 51
    const-string v1, "KEY_F1"

    const-string v2, "\u9690\u85cf\u754c\u9762"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v15

    .line 49
    nop

    .line 51
    const-string v1, "KEY_F2"

    const-string v2, "\u622a\u56fe"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v17

    .line 49
    nop

    .line 51
    const-string v1, "KEY_F3"

    const-string v2, "\u8c03\u8bd5"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v19

    .line 49
    nop

    .line 51
    const-string v1, "KEY_F5"

    const-string v2, "\u5207\u6362\u89c6\u89d2"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v21

    .line 49
    nop

    .line 52
    const-string v1, "KEY_W"

    const-string v2, "\u524d"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    .line 49
    nop

    .line 52
    const-string v1, "KEY_A"

    const-string v2, "\u5de6"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    .line 49
    nop

    .line 52
    const-string v1, "KEY_S"

    const-string v2, "\u540e"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    .line 49
    nop

    .line 52
    const-string v1, "KEY_D"

    const-string v2, "\u53f3"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x11

    aput-object v1, v0, v2

    .line 49
    nop

    .line 48
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/control/KeyChoices;->HINTS:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final all(Ljava/util/Collection;)Ljava/util/List;
    .locals 14
    .param p1, "allKeyNames"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "allKeyNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    sget-object v0, Lcom/pymcl/runtime/control/KeyChoices;->common:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 138
    .local v2, "$i$f$filter":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 139
    .local v5, "$i$f$filterTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    .local v8, "it":Ljava/lang/String;
    const/4 v9, 0x0

    .line 29
    .local v9, "$i$a$-filter-KeyChoices$all$1":I
    const/4 v10, 0x2

    const/4 v11, 0x0

    const-string v12, "KEY_"

    const/4 v13, 0x0

    invoke-static {v8, v12, v13, v10, v11}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    const-string v10, "KEY_UNKNOWN"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1

    const-string v10, "KEY_RESERVED"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1

    const/4 v13, 0x1

    .line 139
    .end local v8    # "it":Ljava/lang/String;
    .end local v9    # "$i$a$-filter-KeyChoices$all$1":I
    :cond_1
    if-eqz v13, :cond_0

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 140
    .end local v7    # "element$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$filterTo":I
    check-cast v3, Ljava/util/List;

    .line 138
    nop

    .end local v1    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$filter":I
    check-cast v3, Ljava/lang/Iterable;

    .line 29
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->sorted(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getCommon()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 20
    sget-object v0, Lcom/pymcl/runtime/control/KeyChoices;->common:Ljava/util/List;

    return-object v0
.end method

.method public final label(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    nop

    .line 32
    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\uff08\u4e0d\u6620\u5c04\uff09"

    goto/16 :goto_0

    .line 33
    :cond_0
    const-string v0, "MOUSE_LEFT"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "\u9f20\u6807\u5de6\u952e\uff08\u653b\u51fb/\u7834\u574f\uff09"

    goto/16 :goto_0

    .line 34
    :cond_1
    const-string v0, "MOUSE_RIGHT"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "\u9f20\u6807\u53f3\u952e\uff08\u4f7f\u7528/\u653e\u7f6e\uff09"

    goto/16 :goto_0

    .line 35
    :cond_2
    const-string v0, "MOUSE_MIDDLE"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "\u9f20\u6807\u4e2d\u952e\uff08\u9009\u53d6\u65b9\u5757\uff09"

    goto/16 :goto_0

    .line 36
    :cond_3
    const-string v0, "SCROLL_UP"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "\u6eda\u8f6e\u4e0a\uff08\u4e0a\u4e00\u683c\u7269\u54c1\uff09"

    goto/16 :goto_0

    .line 37
    :cond_4
    const-string v0, "SCROLL_DOWN"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "\u6eda\u8f6e\u4e0b\uff08\u4e0b\u4e00\u683c\u7269\u54c1\uff09"

    goto/16 :goto_0

    .line 38
    :cond_5
    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->GAME_MENU:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "\u6253\u5f00\u6e38\u620f\u83dc\u5355"

    goto/16 :goto_0

    .line 39
    :cond_6
    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->TOGGLE_IME:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "\u547c\u51fa\u8f93\u5165\u6cd5"

    goto/16 :goto_0

    .line 40
    :cond_7
    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->PC_KEYBOARD:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "PC \u952e\u76d8"

    goto/16 :goto_0

    .line 41
    :cond_8
    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->QUICK_INPUT:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "\u5feb\u6377\u8f93\u5165"

    goto :goto_0

    .line 42
    :cond_9
    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->TOGGLE_CURSOR:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "\u5207\u6362\u865a\u62df\u9f20\u6807"

    goto :goto_0

    .line 43
    :cond_a
    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->EDIT_LAYOUT:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "\u7f16\u8f91\u5e03\u5c40"

    goto :goto_0

    .line 44
    :cond_b
    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->MENU:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "Esc\uff08\u83dc\u5355\uff09"

    goto :goto_0

    .line 45
    :cond_c
    const-string v0, "KEY_"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 141
    .local v0, "k":Ljava/lang/String;
    const/4 v1, 0x0

    .line 45
    .local v1, "$i$a$-let-KeyChoices$label$1":I
    sget-object v2, Lcom/pymcl/runtime/control/KeyChoices;->HINTS:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_e

    .line 141
    .local v2, "it":Ljava/lang/String;
    const/4 v3, 0x0

    .line 45
    .local v3, "$i$a$-let-KeyChoices$label$1$1":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\uff08"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\uff09"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .end local v2    # "it":Ljava/lang/String;
    .end local v3    # "$i$a$-let-KeyChoices$label$1$1":I
    if-nez v2, :cond_d

    goto :goto_0

    :cond_d
    move-object v0, v2

    .line 46
    .end local v0    # "k":Ljava/lang/String;
    .end local v1    # "$i$a$-let-KeyChoices$label$1":I
    :cond_e
    :goto_0
    return-object v0
.end method
