.class public final Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;
.super Ljava/lang/Object;
.source "PcKeyboardView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPcKeyboardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PcKeyboardView.kt\ncom/pymcl/runtime/keyboard/PcKeyboardLayout\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n12746#2:117\n13093#2,3:118\n1739#3:121\n1814#3,3:122\n*S KotlinDebug\n*F\n+ 1 PcKeyboardView.kt\ncom/pymcl/runtime/keyboard/PcKeyboardLayout\n*L\n20#1:117\n20#1:118,3\n23#1:121\n23#1:122,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\t0\u0008\"\u00020\tH\u0002\u00a2\u0006\u0002\u0010\nR\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;",
        "",
        "<init>",
        "()V",
        "row",
        "",
        "Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;",
        "s",
        "",
        "",
        "([Ljava/lang/String;)Ljava/util/List;",
        "MODIFIERS",
        "",
        "getMODIFIERS",
        "()Ljava/util/Set;",
        "rows",
        "getRows",
        "()Ljava/util/List;",
        "K",
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
.field public static final INSTANCE:Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;

.field private static final MODIFIERS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 39

    new-instance v0, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;

    invoke-direct {v0}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->INSTANCE:Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;

    .line 21
    const/4 v0, 0x6

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "KEY_LEFTSHIFT"

    aput-object v3, v1, v2

    const/4 v4, 0x1

    const-string v5, "KEY_RIGHTSHIFT"

    aput-object v5, v1, v4

    const/4 v6, 0x2

    const-string v7, "KEY_LEFTCTRL"

    aput-object v7, v1, v6

    const/4 v8, 0x3

    const-string v9, "KEY_RIGHTCTRL"

    aput-object v9, v1, v8

    const/4 v10, 0x4

    const-string v11, "KEY_LEFTALT"

    aput-object v11, v1, v10

    const/4 v12, 0x5

    const-string v13, "KEY_RIGHTALT"

    aput-object v13, v1, v12

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->MODIFIERS:Ljava/util/Set;

    .line 22
    nop

    .line 23
    new-array v1, v0, [Ljava/util/List;

    new-instance v14, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v18, 0x4

    const/16 v19, 0x0

    const-string v15, "Esc"

    const-string v16, "KEY_ESC"

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/util/Collection;

    new-instance v15, Lkotlin/ranges/IntRange;

    move/from16 v16, v0

    const/16 v0, 0xc

    invoke-direct {v15, v4, v0}, Lkotlin/ranges/IntRange;-><init>(II)V

    move-object v0, v15

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 121
    .local v15, "$i$f$map":I
    move/from16 v17, v2

    new-instance v2, Ljava/util/ArrayList;

    move/from16 v18, v4

    const/16 v4, 0xa

    move/from16 v19, v10

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v2, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v10, v0

    .local v10, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v20, 0x0

    .line 122
    .local v20, "$i$f$mapTo":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_0
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    move/from16 v23, v12

    const-string v12, "F"

    if-eqz v22, :cond_0

    move-object/from16 v22, v21

    check-cast v22, Lkotlin/collections/IntIterator;

    invoke-virtual/range {v22 .. v22}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v22

    .line 123
    .local v22, "item$iv$iv":I
    move/from16 v24, v22

    .local v24, "it":I
    const/16 v25, 0x0

    .line 23
    .local v25, "$i$a$-map-PcKeyboardLayout$rows$1":I
    new-instance v26, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    move/from16 v32, v8

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    move/from16 v12, v24

    .end local v24    # "it":I
    .local v12, "it":I
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v27

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "KEY_F"

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    const/16 v30, 0x4

    const/16 v31, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v26 .. v31}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 123
    move-object/from16 v4, v26

    .end local v12    # "it":I
    .end local v25    # "$i$a$-map-PcKeyboardLayout$rows$1":I
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v12, v23

    move/from16 v8, v32

    const/16 v4, 0xa

    goto :goto_0

    .line 124
    .end local v22    # "item$iv$iv":I
    :cond_0
    move/from16 v32, v8

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v10    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v20    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 121
    nop

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$map":I
    check-cast v2, Ljava/lang/Iterable;

    .line 23
    invoke-static {v14, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-array v2, v6, [Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    new-instance v25, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v29, 0x4

    const/16 v30, 0x0

    const/16 v28, 0x0

    const-string v26, "Del"

    const-string v27, "KEY_DELETE"

    invoke-direct/range {v25 .. v30}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v25, v2, v17

    new-instance v26, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v30, 0x4

    const/16 v31, 0x0

    const/16 v29, 0x0

    const-string v27, "\u2715"

    const-string v28, "@close"

    invoke-direct/range {v26 .. v31}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v26, v2, v18

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    aput-object v0, v1, v17

    .line 24
    new-instance v25, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v29, 0x4

    const/16 v30, 0x0

    const/16 v28, 0x0

    const-string v26, "`"

    const-string v27, "KEY_GRAVE"

    invoke-direct/range {v25 .. v30}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v25 .. v25}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    sget-object v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->INSTANCE:Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;

    const/16 v4, 0xa

    new-array v8, v4, [Ljava/lang/String;

    const-string v4, "1"

    aput-object v4, v8, v17

    const-string v4, "2"

    aput-object v4, v8, v18

    const-string v4, "3"

    aput-object v4, v8, v6

    const-string v4, "4"

    aput-object v4, v8, v32

    const-string v4, "5"

    aput-object v4, v8, v19

    const-string v4, "6"

    aput-object v4, v8, v23

    const-string v4, "7"

    aput-object v4, v8, v16

    const-string v4, "8"

    const/4 v10, 0x7

    aput-object v4, v8, v10

    const-string v4, "9"

    const/16 v10, 0x8

    aput-object v4, v8, v10

    const-string v4, "0"

    const/16 v10, 0x9

    aput-object v4, v8, v10

    invoke-direct {v2, v8}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->row([Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 25
    move/from16 v2, v32

    new-array v4, v2, [Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    new-instance v25, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const-string v26, "-"

    const-string v27, "KEY_MINUS"

    invoke-direct/range {v25 .. v30}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v25, v4, v17

    new-instance v26, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v30, 0x4

    const/16 v29, 0x0

    const-string v27, "="

    const-string v28, "KEY_EQUAL"

    invoke-direct/range {v26 .. v31}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v26, v4, v18

    new-instance v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const-string v8, "KEY_BACKSPACE"

    const v10, 0x3fcccccd    # 1.6f

    const-string v14, "\u232b"

    invoke-direct {v2, v14, v8, v10}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;F)V

    aput-object v2, v4, v6

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 24
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    aput-object v0, v1, v18

    .line 23
    nop

    .line 26
    new-instance v0, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const-string v2, "Tab"

    const-string v4, "KEY_TAB"

    const v8, 0x3fb33333    # 1.4f

    invoke-direct {v0, v2, v4, v8}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;F)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    sget-object v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->INSTANCE:Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;

    const/16 v4, 0xa

    new-array v4, v4, [Ljava/lang/String;

    const-string v8, "Q"

    aput-object v8, v4, v17

    const-string v8, "W"

    aput-object v8, v4, v18

    const-string v8, "E"

    aput-object v8, v4, v6

    const-string v8, "R"

    const/16 v32, 0x3

    aput-object v8, v4, v32

    const-string v8, "T"

    aput-object v8, v4, v19

    const-string v8, "Y"

    aput-object v8, v4, v23

    const-string v8, "U"

    aput-object v8, v4, v16

    const-string v8, "I"

    const/4 v10, 0x7

    aput-object v8, v4, v10

    const-string v8, "O"

    const/16 v10, 0x8

    aput-object v8, v4, v10

    const-string v8, "P"

    const/16 v10, 0x9

    aput-object v8, v4, v10

    invoke-direct {v2, v4}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->row([Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 27
    const/4 v2, 0x3

    new-array v4, v2, [Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    new-instance v24, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v28, 0x4

    const/16 v29, 0x0

    const/16 v27, 0x0

    const-string v25, "["

    const-string v26, "KEY_LEFTBRACE"

    invoke-direct/range {v24 .. v29}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v24, v4, v17

    new-instance v25, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v29, 0x4

    const/16 v30, 0x0

    const/16 v28, 0x0

    const-string v26, "]"

    const-string v27, "KEY_RIGHTBRACE"

    invoke-direct/range {v25 .. v30}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v25, v4, v18

    new-instance v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const-string v8, "\\"

    const-string v10, "KEY_BACKSLASH"

    const v14, 0x3f99999a    # 1.2f

    invoke-direct {v2, v8, v10, v14}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;F)V

    aput-object v2, v4, v6

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 26
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    aput-object v0, v1, v6

    .line 23
    nop

    .line 28
    new-instance v0, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const-string v2, "KEY_CAPSLOCK"

    const v4, 0x3fd9999a    # 1.7f

    const-string v8, "Caps"

    invoke-direct {v0, v8, v2, v4}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;F)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    sget-object v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->INSTANCE:Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;

    const/16 v4, 0x9

    new-array v4, v4, [Ljava/lang/String;

    const-string v8, "A"

    aput-object v8, v4, v17

    const-string v8, "S"

    aput-object v8, v4, v18

    const-string v8, "D"

    aput-object v8, v4, v6

    const/16 v32, 0x3

    aput-object v12, v4, v32

    const-string v8, "G"

    aput-object v8, v4, v19

    const-string v8, "H"

    aput-object v8, v4, v23

    const-string v8, "J"

    aput-object v8, v4, v16

    const-string v8, "K"

    const/4 v10, 0x7

    aput-object v8, v4, v10

    const-string v8, "L"

    const/16 v10, 0x8

    aput-object v8, v4, v10

    invoke-direct {v2, v4}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->row([Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 29
    const/4 v2, 0x3

    new-array v4, v2, [Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    new-instance v24, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v28, 0x4

    const/16 v29, 0x0

    const/16 v27, 0x0

    const-string v25, ";"

    const-string v26, "KEY_SEMICOLON"

    invoke-direct/range {v24 .. v29}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v24, v4, v17

    new-instance v25, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v29, 0x4

    const/16 v28, 0x0

    const-string v26, "\'"

    const-string v27, "KEY_APOSTROPHE"

    invoke-direct/range {v25 .. v30}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v25, v4, v18

    new-instance v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const-string v8, "KEY_ENTER"

    const v10, 0x3ff33333    # 1.9f

    const-string v12, "Enter"

    invoke-direct {v2, v12, v8, v10}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;F)V

    aput-object v2, v4, v6

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 28
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    const/16 v32, 0x3

    aput-object v0, v1, v32

    .line 23
    nop

    .line 30
    new-instance v0, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const v2, 0x400ccccd    # 2.2f

    const-string v4, "Shift"

    invoke-direct {v0, v4, v3, v2}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;F)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    sget-object v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->INSTANCE:Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;

    const/4 v3, 0x7

    new-array v3, v3, [Ljava/lang/String;

    const-string v8, "Z"

    aput-object v8, v3, v17

    const-string v8, "X"

    aput-object v8, v3, v18

    const-string v8, "C"

    aput-object v8, v3, v6

    const-string v8, "V"

    const/16 v32, 0x3

    aput-object v8, v3, v32

    const-string v8, "B"

    aput-object v8, v3, v19

    const-string v8, "N"

    aput-object v8, v3, v23

    const-string v8, "M"

    aput-object v8, v3, v16

    invoke-direct {v2, v3}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->row([Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 31
    move/from16 v2, v23

    new-array v3, v2, [Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    new-instance v24, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v28, 0x4

    const/16 v29, 0x0

    const/16 v27, 0x0

    const-string v25, ","

    const-string v26, "KEY_COMMA"

    invoke-direct/range {v24 .. v29}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v24, v3, v17

    new-instance v25, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v29, 0x4

    const/16 v28, 0x0

    const-string v26, "."

    const-string v27, "KEY_DOT"

    invoke-direct/range {v25 .. v30}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v25, v3, v18

    new-instance v26, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v30, 0x4

    const/16 v29, 0x0

    const-string v27, "/"

    const-string v28, "KEY_SLASH"

    invoke-direct/range {v26 .. v31}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v26, v3, v6

    new-instance v33, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/16 v37, 0x4

    const/16 v38, 0x0

    const/16 v36, 0x0

    const-string v34, "\u2191"

    const-string v35, "KEY_UP"

    invoke-direct/range {v33 .. v38}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v32, 0x3

    aput-object v33, v3, v32

    new-instance v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const v8, 0x3fb33333    # 1.4f

    invoke-direct {v2, v4, v5, v8}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;F)V

    aput-object v2, v3, v19

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 30
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    aput-object v0, v1, v19

    .line 23
    nop

    .line 32
    const/16 v0, 0x8

    new-array v0, v0, [Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    new-instance v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const v3, 0x3fb33333    # 1.4f

    const-string v4, "Ctrl"

    invoke-direct {v2, v4, v7, v3}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;F)V

    aput-object v2, v0, v17

    new-instance v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const-string v3, "Alt"

    const v5, 0x3f99999a    # 1.2f

    invoke-direct {v2, v3, v11, v5}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;F)V

    aput-object v2, v0, v18

    new-instance v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const-string v3, "KEY_SPACE"

    const/high16 v5, 0x40c00000    # 6.0f

    const-string v7, "Space"

    invoke-direct {v2, v7, v3, v5}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;F)V

    aput-object v2, v0, v6

    .line 33
    new-instance v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const-string v3, "Alt"

    const v5, 0x3f99999a    # 1.2f

    invoke-direct {v2, v3, v13, v5}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;F)V

    const/16 v32, 0x3

    aput-object v2, v0, v32

    .line 32
    nop

    .line 33
    new-instance v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const v3, 0x3f99999a    # 1.2f

    invoke-direct {v2, v4, v9, v3}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;F)V

    aput-object v2, v0, v19

    .line 32
    nop

    .line 33
    new-instance v10, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    const-string v11, "\u2190"

    const-string v12, "KEY_LEFT"

    invoke-direct/range {v10 .. v15}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v23, 0x5

    aput-object v10, v0, v23

    .line 32
    nop

    .line 33
    new-instance v2, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    const-string v3, "\u2193"

    const-string v4, "KEY_DOWN"

    invoke-direct/range {v2 .. v7}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v2, v0, v16

    .line 32
    nop

    .line 33
    new-instance v3, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    const-string v4, "\u2192"

    const-string v5, "KEY_RIGHT"

    invoke-direct/range {v3 .. v8}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x7

    aput-object v3, v0, v2

    .line 32
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/16 v23, 0x5

    aput-object v0, v1, v23

    .line 23
    nop

    .line 22
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->rows:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final varargs row([Ljava/lang/String;)Ljava/util/List;
    .locals 15
    .param p1, "s"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;",
            ">;"
        }
    .end annotation

    .line 20
    move-object/from16 v0, p1

    .local v0, "$this$map$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 117
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 118
    .local v4, "$i$f$mapTo":I
    array-length v5, v3

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v3, v6

    .line 119
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v7

    .local v9, "it":Ljava/lang/String;
    const/4 v14, 0x0

    .line 20
    .local v14, "$i$a$-map-PcKeyboardLayout$row$1":I
    new-instance v8, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "KEY_"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 119
    .end local v9    # "it":Ljava/lang/String;
    .end local v14    # "$i$a$-map-PcKeyboardLayout$row$1":I
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 118
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 120
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 117
    nop

    .line 20
    .end local v0    # "$this$map$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$map":I
    return-object v2
.end method


# virtual methods
.method public final getMODIFIERS()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 21
    sget-object v0, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->MODIFIERS:Ljava/util/Set;

    return-object v0
.end method

.method public final getRows()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;",
            ">;>;"
        }
    .end annotation

    .line 22
    sget-object v0, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->rows:Ljava/util/List;

    return-object v0
.end method
