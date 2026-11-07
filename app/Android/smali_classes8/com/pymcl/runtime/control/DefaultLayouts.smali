.class public final Lcom/pymcl/runtime/control/DefaultLayouts;
.super Ljava/lang/Object;
.source "DefaultLayouts.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDefaultLayouts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultLayouts.kt\ncom/pymcl/runtime/control/DefaultLayouts\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n437#2:50\n513#2,5:51\n1#3:56\n*S KotlinDebug\n*F\n+ 1 DefaultLayouts.kt\ncom/pymcl/runtime/control/DefaultLayouts\n*L\n11#1:50\n11#1:51,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Jc\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u000c\"\u00020\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R#\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u00180\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/pymcl/runtime/control/DefaultLayouts;",
        "",
        "<init>",
        "()V",
        "b",
        "Lcom/pymcl/runtime/control/ControlElement;",
        "text",
        "",
        "x",
        "",
        "y",
        "keys",
        "",
        "w",
        "h",
        "toggle",
        "",
        "grabbed",
        "(Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;)Lcom/pymcl/runtime/control/ControlElement;",
        "default",
        "Lcom/pymcl/runtime/control/ControlLayout;",
        "dpad",
        "builtins",
        "",
        "Lkotlin/Function0;",
        "getBuiltins",
        "()Ljava/util/Map;",
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
.field public static final INSTANCE:Lcom/pymcl/runtime/control/DefaultLayouts;

.field private static final builtins:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/pymcl/runtime/control/ControlLayout;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$w7a6b0VfvLvOgQk5_IVk_WM6Gvo(Lcom/pymcl/runtime/control/ControlElement;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/control/DefaultLayouts;->dpad$lambda$0$0(Lcom/pymcl/runtime/control/ControlElement;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/runtime/control/DefaultLayouts;

    invoke-direct {v0}, Lcom/pymcl/runtime/control/DefaultLayouts;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/control/DefaultLayouts;->INSTANCE:Lcom/pymcl/runtime/control/DefaultLayouts;

    .line 47
    const/4 v0, 0x2

    new-array v0, v0, [Lkotlin/Pair;

    new-instance v1, Lcom/pymcl/runtime/control/DefaultLayouts$builtins$1;

    sget-object v2, Lcom/pymcl/runtime/control/DefaultLayouts;->INSTANCE:Lcom/pymcl/runtime/control/DefaultLayouts;

    invoke-direct {v1, v2}, Lcom/pymcl/runtime/control/DefaultLayouts$builtins$1;-><init>(Ljava/lang/Object;)V

    const-string v2, "default"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/pymcl/runtime/control/DefaultLayouts$builtins$2;

    sget-object v2, Lcom/pymcl/runtime/control/DefaultLayouts;->INSTANCE:Lcom/pymcl/runtime/control/DefaultLayouts;

    invoke-direct {v1, v2}, Lcom/pymcl/runtime/control/DefaultLayouts$builtins$2;-><init>(Ljava/lang/Object;)V

    const-string v2, "dpad"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    sput-object v0, Lcom/pymcl/runtime/control/DefaultLayouts;->builtins:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;)Lcom/pymcl/runtime/control/ControlElement;
    .locals 18
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "x"    # F
    .param p3, "y"    # F
    .param p4, "keys"    # [Ljava/lang/String;
    .param p5, "w"    # F
    .param p6, "h"    # F
    .param p7, "toggle"    # Z
    .param p8, "grabbed"    # Ljava/lang/Boolean;

    .line 11
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .local v0, "$this$filter$iv":Ljava/lang/String;
    const/4 v2, 0x0

    .line 50
    .local v2, "$i$f$filter":I
    move-object v3, v0

    check-cast v3, Ljava/lang/CharSequence;

    .local v3, "$this$filterTo$iv$iv":Ljava/lang/CharSequence;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v5, Ljava/lang/Appendable;

    .local v5, "destination$iv$iv":Ljava/lang/Appendable;
    const/4 v6, 0x0

    .line 51
    .local v6, "$i$f$filterTo":I
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_1

    .line 52
    invoke-interface {v3, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    .line 53
    .local v9, "element$iv$iv":C
    move v10, v9

    .local v10, "it":C
    const/4 v11, 0x0

    .line 11
    .local v11, "$i$a$-filter-DefaultLayouts$b$1":I
    invoke-static {v10}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v12

    .line 53
    .end local v10    # "it":C
    .end local v11    # "$i$a$-filter-DefaultLayouts$b$1":I
    if-eqz v12, :cond_0

    invoke-interface {v5, v9}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 51
    .end local v9    # "element$iv$iv":C
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 55
    .end local v7    # "index$iv$iv":I
    :cond_1
    nop

    .end local v3    # "$this$filterTo$iv$iv":Ljava/lang/CharSequence;
    .end local v5    # "destination$iv$iv":Ljava/lang/Appendable;
    .end local v6    # "$i$f$filterTo":I
    move-object v3, v5

    check-cast v3, Ljava/lang/StringBuilder;

    .line 50
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$this$filter$iv":Ljava/lang/String;
    .end local v2    # "$i$f$filter":I
    check-cast v0, Ljava/lang/CharSequence;

    .line 11
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_3

    .line 56
    const/4 v0, 0x0

    .line 11
    .local v0, "$i$a$-ifEmpty-DefaultLayouts$b$2":I
    invoke-static/range {p4 .. p4}, Lkotlin/collections/ArraysKt;->first([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v2

    .end local v0    # "$i$a$-ifEmpty-DefaultLayouts$b$2":I
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "btn_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 12
    sget-object v3, Lcom/pymcl/runtime/control/ElementType;->BUTTON:Lcom/pymcl/runtime/control/ElementType;

    invoke-static/range {p4 .. p4}, Lkotlin/collections/ArraysKt;->toMutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    .line 11
    nop

    .line 12
    nop

    .line 11
    new-instance v1, Lcom/pymcl/runtime/control/ControlElement;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x3600

    const/16 v17, 0x0

    move/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v10, p7

    move-object/from16 v13, p8

    invoke-direct/range {v1 .. v17}, Lcom/pymcl/runtime/control/ControlElement;-><init>(Ljava/lang/String;Lcom/pymcl/runtime/control/ElementType;Ljava/lang/String;FFFFLjava/util/List;ZFFLjava/lang/Boolean;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    return-object v1
.end method

.method static synthetic b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;
    .locals 11

    .line 9
    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    const v1, 0x3d8f5c29    # 0.07f

    move v7, v1

    goto :goto_0

    :cond_0
    move/from16 v7, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    const v1, 0x3de147ae    # 0.11f

    move v8, v1

    goto :goto_1

    :cond_1
    move/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    .line 10
    const/4 v1, 0x0

    move v9, v1

    goto :goto_2

    .line 9
    :cond_2
    move/from16 v9, p7

    :goto_2
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    .line 10
    const/4 v0, 0x0

    move-object v10, v0

    goto :goto_3

    .line 9
    :cond_3
    move-object/from16 v10, p8

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v2 .. v10}, Lcom/pymcl/runtime/control/DefaultLayouts;->b(Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object p0

    return-object p0
.end method

.method private static final dpad$lambda$0$0(Lcom/pymcl/runtime/control/ControlElement;)Z
    .locals 2
    .param p0, "it"    # Lcom/pymcl/runtime/control/ControlElement;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ControlElement;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "move"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final default()Lcom/pymcl/runtime/control/ControlLayout;
    .locals 25

    .line 14
    new-instance v0, Lcom/pymcl/runtime/control/ControlLayout;

    .line 15
    nop

    .line 14
    nop

    .line 15
    nop

    .line 17
    const/16 v1, 0x12

    new-array v1, v1, [Lcom/pymcl/runtime/control/ControlElement;

    sget-object v4, Lcom/pymcl/runtime/control/ElementType;->JOYSTICK:Lcom/pymcl/runtime/control/ElementType;

    .line 18
    const/4 v2, 0x4

    new-array v3, v2, [Ljava/lang/String;

    const-string v5, "KEY_W"

    const/16 v19, 0x0

    aput-object v5, v3, v19

    const-string v5, "KEY_S"

    const/4 v6, 0x1

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    aput-object v5, v3, v6

    const-string v5, "KEY_A"

    const/16 v20, 0x2

    aput-object v5, v3, v20

    const-string v5, "KEY_D"

    const/16 v21, 0x3

    aput-object v5, v3, v21

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    .line 17
    move v3, v2

    new-instance v2, Lcom/pymcl/runtime/control/ControlElement;

    .line 18
    nop

    .line 17
    nop

    .line 18
    nop

    .line 17
    const/16 v17, 0x2704

    const/16 v18, 0x0

    move v5, v3

    const-string v3, "move"

    move v7, v5

    const/4 v5, 0x0

    move v8, v6

    const v6, 0x3d23d70a    # 0.04f

    move v9, v7

    const v7, 0x3f051eb8    # 0.52f

    move v11, v8

    const v8, 0x3e75c28f    # 0.24f

    move v12, v9

    const v9, 0x3ed70a3d    # 0.42f

    move v13, v11

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v22, v14

    move-object v14, v15

    const-string v15, "KEY_LEFTCTRL"

    move/from16 v23, v16

    const/16 v16, 0x0

    move/from16 v24, v23

    move-object/from16 v23, v0

    move/from16 v0, v24

    invoke-direct/range {v2 .. v18}, Lcom/pymcl/runtime/control/ControlElement;-><init>(Ljava/lang/String;Lcom/pymcl/runtime/control/ElementType;Ljava/lang/String;FFFFLjava/util/List;ZFFLjava/lang/Boolean;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v15, v14

    aput-object v2, v1, v19

    .line 19
    new-array v11, v0, [Ljava/lang/String;

    const-string v2, "KEY_SPACE"

    aput-object v2, v11, v19

    const/16 v16, 0x40

    const/16 v17, 0x0

    const-string v8, "\u8df3"

    const v9, 0x3f5c28f6    # 0.86f

    const v10, 0x3f1eb852    # 0.62f

    const v12, 0x3dcccccd    # 0.1f

    const v13, 0x3e2e147b    # 0.17f

    const/4 v14, 0x0

    move-object/from16 v7, p0

    invoke-static/range {v7 .. v17}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    aput-object v2, v1, v0

    .line 17
    nop

    .line 20
    new-array v11, v0, [Ljava/lang/String;

    const-string v2, "KEY_LEFTSHIFT"

    aput-object v2, v11, v19

    const/16 v16, 0x30

    const-string v8, "\u8e72"

    const v10, 0x3f51eb85    # 0.82f

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    invoke-static/range {v7 .. v17}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    aput-object v2, v1, v20

    .line 17
    nop

    .line 21
    new-array v11, v0, [Ljava/lang/String;

    const-string v2, "MOUSE_LEFT"

    aput-object v2, v11, v19

    const/16 v16, 0x70

    const-string v8, "\u653b"

    const v9, 0x3f3d70a4    # 0.74f

    const v10, 0x3ee66666    # 0.45f

    const/4 v14, 0x0

    invoke-static/range {v7 .. v17}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    aput-object v2, v1, v21

    .line 17
    nop

    .line 22
    new-array v11, v0, [Ljava/lang/String;

    const-string v2, "MOUSE_RIGHT"

    aput-object v2, v11, v19

    const-string v8, "\u7528"

    const v10, 0x3f1eb852    # 0.62f

    invoke-static/range {v7 .. v17}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    aput-object v2, v1, v22

    .line 17
    nop

    .line 23
    new-array v7, v0, [Ljava/lang/String;

    const-string v2, "KEY_E"

    aput-object v2, v7, v19

    const/16 v12, 0xc0

    const/4 v13, 0x0

    const-string v4, "\u80cc\u5305"

    const v5, 0x3f6e147b    # 0.93f

    const v6, 0x3ca3d70a    # 0.02f

    const v8, 0x3d75c28f    # 0.06f

    const v9, 0x3dcccccd    # 0.1f

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v3, p0

    invoke-static/range {v3 .. v13}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 17
    nop

    .line 24
    new-array v11, v0, [Ljava/lang/String;

    const-string v2, "KEY_Q"

    aput-object v2, v11, v19

    const/16 v16, 0x40

    const-string v8, "\u4e22"

    const v9, 0x3f5c28f6    # 0.86f

    const v10, 0x3ca3d70a    # 0.02f

    const v12, 0x3d75c28f    # 0.06f

    const v13, 0x3dcccccd    # 0.1f

    move-object/from16 v7, p0

    invoke-static/range {v7 .. v17}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 17
    nop

    .line 25
    new-array v11, v0, [Ljava/lang/String;

    const-string v2, "KEY_T"

    aput-object v2, v11, v19

    const-string v8, "\u804a"

    const v9, 0x3e99999a    # 0.3f

    invoke-static/range {v7 .. v17}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 17
    nop

    .line 26
    new-array v7, v0, [Ljava/lang/String;

    const-string v2, "KEY_ESC"

    aput-object v2, v7, v19

    const/16 v12, 0xc0

    const/4 v13, 0x0

    const-string v4, "Esc"

    const v5, 0x3c23d70a    # 0.01f

    const v8, 0x3d75c28f    # 0.06f

    const v9, 0x3dcccccd    # 0.1f

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v3, p0

    invoke-static/range {v3 .. v13}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    .line 17
    nop

    .line 27
    new-array v7, v0, [Ljava/lang/String;

    sget-object v2, Lcom/pymcl/runtime/input/Keys$Action;->TOGGLE_IME:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v7, v19

    const-string v4, "\u952e\u76d8"

    const v5, 0x3da3d70a    # 0.08f

    move-object/from16 v3, p0

    invoke-static/range {v3 .. v13}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 17
    nop

    .line 28
    new-array v7, v0, [Ljava/lang/String;

    sget-object v2, Lcom/pymcl/runtime/input/Keys$Action;->PC_KEYBOARD:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v7, v19

    const-string v4, "PC"

    const v5, 0x3e19999a    # 0.15f

    move-object/from16 v3, p0

    invoke-static/range {v3 .. v13}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    const/16 v3, 0xa

    aput-object v2, v1, v3

    .line 17
    nop

    .line 29
    new-array v7, v0, [Ljava/lang/String;

    sget-object v2, Lcom/pymcl/runtime/input/Keys$Action;->QUICK_INPUT:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v7, v19

    const-string v4, "\u5feb\u6377"

    const v5, 0x3e6147ae    # 0.22f

    move-object/from16 v3, p0

    invoke-static/range {v3 .. v13}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    .line 17
    nop

    .line 30
    new-array v7, v0, [Ljava/lang/String;

    sget-object v2, Lcom/pymcl/runtime/input/Keys$Action;->TOGGLE_CURSOR:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v7, v19

    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    const/16 v12, 0x40

    const-string v4, "\u9f20\u6807"

    const v5, 0x3ebd70a4    # 0.37f

    move-object/from16 v3, p0

    invoke-static/range {v3 .. v13}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    const/16 v3, 0xc

    aput-object v2, v1, v3

    .line 17
    nop

    .line 31
    new-array v11, v0, [Ljava/lang/String;

    const-string v2, "KEY_F5"

    aput-object v2, v11, v19

    const-string v8, "F5"

    const v9, 0x3ee147ae    # 0.44f

    const v10, 0x3ca3d70a    # 0.02f

    const v12, 0x3d75c28f    # 0.06f

    const v13, 0x3dcccccd    # 0.1f

    move-object/from16 v7, p0

    invoke-static/range {v7 .. v17}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    .line 17
    nop

    .line 32
    new-array v11, v0, [Ljava/lang/String;

    const-string v2, "KEY_TAB"

    aput-object v2, v11, v19

    const-string v8, "Tab"

    const v9, 0x3f028f5c    # 0.51f

    invoke-static/range {v7 .. v17}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    const/16 v3, 0xe

    aput-object v2, v1, v3

    .line 17
    nop

    .line 33
    new-array v7, v0, [Ljava/lang/String;

    sget-object v2, Lcom/pymcl/runtime/input/Keys$Action;->EDIT_LAYOUT:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/Keys$Action;->getId()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v7, v19

    const/16 v12, 0xc0

    const/4 v13, 0x0

    const-string v4, "\u7f16\u8f91"

    const v5, 0x3f4a3d71    # 0.79f

    const v8, 0x3d75c28f    # 0.06f

    const v9, 0x3dcccccd    # 0.1f

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v3, p0

    invoke-static/range {v3 .. v13}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    .line 17
    nop

    .line 34
    new-array v11, v0, [Ljava/lang/String;

    const-string v2, "SCROLL_UP"

    aput-object v2, v11, v19

    const-string v8, "\u2191"

    const v9, 0x3f51eb85    # 0.82f

    const v10, 0x3e99999a    # 0.3f

    const v12, 0x3d4ccccd    # 0.05f

    const v13, 0x3db851ec    # 0.09f

    move-object/from16 v7, p0

    invoke-static/range {v7 .. v17}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v2

    const/16 v3, 0x10

    aput-object v2, v1, v3

    .line 17
    nop

    .line 35
    new-array v11, v0, [Ljava/lang/String;

    const-string v0, "SCROLL_DOWN"

    aput-object v0, v11, v19

    const-string v8, "\u2193"

    const v9, 0x3f6147ae    # 0.88f

    invoke-static/range {v7 .. v17}, Lcom/pymcl/runtime/control/DefaultLayouts;->b$default(Lcom/pymcl/runtime/control/DefaultLayouts;Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v0

    const/16 v2, 0x11

    aput-object v0, v1, v2

    .line 17
    nop

    .line 16
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 14
    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v1, "default"

    const/4 v2, 0x0

    const-string v3, "PyMCL"

    const-string v4, "\u9ed8\u8ba4\u5e03\u5c40\uff1a\u5de6\u6447\u6746\u79fb\u52a8\uff0c\u53f3\u4fa7\u8df3\u8dc3/\u6f5c\u884c/\u653b\u51fb/\u4f7f\u7528"

    move-object/from16 v0, v23

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/runtime/control/ControlLayout;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 37
    return-object v0
.end method

.method public final dpad()Lcom/pymcl/runtime/control/ControlLayout;
    .locals 23

    .line 40
    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/runtime/control/DefaultLayouts;->default()Lcom/pymcl/runtime/control/ControlLayout;

    move-result-object v0

    move-object v1, v0

    .local v1, "$this$dpad_u24lambda_u240":Lcom/pymcl/runtime/control/ControlLayout;
    const/4 v2, 0x0

    .line 41
    .local v2, "$i$a$-apply-DefaultLayouts$dpad$1":I
    const-string v3, "dpad"

    invoke-virtual {v1, v3}, Lcom/pymcl/runtime/control/ControlLayout;->setName(Ljava/lang/String;)V

    const-string v3, "\u5341\u5b57\u65b9\u5411\u952e\u5e03\u5c40"

    invoke-virtual {v1, v3}, Lcom/pymcl/runtime/control/ControlLayout;->setDescription(Ljava/lang/String;)V

    .line 42
    invoke-virtual {v1}, Lcom/pymcl/runtime/control/ControlLayout;->getElements()Ljava/util/List;

    move-result-object v3

    new-instance v4, Lcom/pymcl/runtime/control/DefaultLayouts$$ExternalSyntheticLambda0;

    invoke-direct {v4}, Lcom/pymcl/runtime/control/DefaultLayouts$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 43
    invoke-virtual {v1}, Lcom/pymcl/runtime/control/ControlLayout;->getElements()Ljava/util/List;

    move-result-object v3

    new-instance v4, Lcom/pymcl/runtime/control/ControlElement;

    sget-object v6, Lcom/pymcl/runtime/control/ElementType;->DPAD:Lcom/pymcl/runtime/control/ElementType;

    .line 44
    const/4 v5, 0x4

    new-array v5, v5, [Ljava/lang/String;

    const-string v7, "KEY_W"

    const/4 v8, 0x0

    aput-object v7, v5, v8

    const-string v7, "KEY_S"

    const/4 v9, 0x1

    aput-object v7, v5, v9

    const/4 v7, 0x2

    const-string v10, "KEY_A"

    aput-object v10, v5, v7

    const/4 v7, 0x3

    const-string v10, "KEY_D"

    aput-object v10, v5, v7

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    .line 43
    nop

    .line 44
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    .line 43
    const/16 v19, 0x3704

    const/16 v20, 0x0

    const-string v5, "move"

    const/4 v7, 0x0

    move v9, v8

    const v8, 0x3d23d70a    # 0.04f

    move v10, v9

    const v9, 0x3f051eb8    # 0.52f

    move v11, v10

    const v10, 0x3e75c28f    # 0.24f

    move v13, v11

    const v11, 0x3ed70a3d    # 0.42f

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v22, v0

    move/from16 v0, v21

    invoke-direct/range {v4 .. v20}, Lcom/pymcl/runtime/control/ControlElement;-><init>(Ljava/lang/String;Lcom/pymcl/runtime/control/ElementType;Ljava/lang/String;FFFFLjava/util/List;ZFFLjava/lang/Boolean;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v0, v4}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 45
    nop

    .line 40
    .end local v1    # "$this$dpad_u24lambda_u240":Lcom/pymcl/runtime/control/ControlLayout;
    .end local v2    # "$i$a$-apply-DefaultLayouts$dpad$1":I
    nop

    .line 45
    return-object v22
.end method

.method public final getBuiltins()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/pymcl/runtime/control/ControlLayout;",
            ">;>;"
        }
    .end annotation

    .line 47
    sget-object v0, Lcom/pymcl/runtime/control/DefaultLayouts;->builtins:Ljava/util/Map;

    return-object v0
.end method
