.class public final Lcom/pymcl/runtime/control/ControlLayout$Companion;
.super Ljava/lang/Object;
.source "ControlLayout.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/control/ControlLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nControlLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlLayout.kt\ncom/pymcl/runtime/control/ControlLayout$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1#2:71\n1#2:73\n2955#3:72\n777#3:74\n873#3,2:75\n*S KotlinDebug\n*F\n+ 1 ControlLayout.kt\ncom/pymcl/runtime/control/ControlLayout$Companion\n*L\n57#1:73\n57#1:72\n59#1:74\n59#1:75,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/pymcl/runtime/control/ControlLayout$Companion;",
        "",
        "<init>",
        "()V",
        "FORMAT_VERSION",
        "",
        "gson",
        "Lcom/google/gson/Gson;",
        "kotlin.jvm.PlatformType",
        "fromJson",
        "Lcom/pymcl/runtime/control/ControlLayout;",
        "json",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/runtime/control/ControlLayout$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Ljava/lang/String;)Lcom/pymcl/runtime/control/ControlLayout;
    .locals 19
    .param p1, "json"    # Ljava/lang/String;

    move-object/from16 v0, p1

    const-string v1, "json"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-static {}, Lcom/pymcl/runtime/control/ControlLayout;->access$getGson$cp()Lcom/google/gson/Gson;

    move-result-object v1

    const-class v2, Lcom/pymcl/runtime/control/ControlLayout;

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/pymcl/runtime/control/ControlLayout;

    if-eqz v1, :cond_8

    .line 55
    .local v1, "l":Lcom/pymcl/runtime/control/ControlLayout;
    invoke-virtual {v1}, Lcom/pymcl/runtime/control/ControlLayout;->getVersion()I

    move-result v2

    const/4 v3, 0x1

    if-gt v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_7

    .line 57
    invoke-virtual {v1}, Lcom/pymcl/runtime/control/ControlLayout;->getElements()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_1
    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$onEach$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 72
    .local v3, "$i$f$onEach":I
    move-object v4, v2

    .line 73
    .local v4, "$this$onEach_u24lambda_u240$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 72
    .local v5, "$i$a$-apply-CollectionsKt___CollectionsKt$onEach$1$iv":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/runtime/control/ControlElement;

    .local v8, "e":Lcom/pymcl/runtime/control/ControlElement;
    const/4 v9, 0x0

    .line 58
    .local v9, "$i$a$-onEach-ControlLayout$Companion$fromJson$2":I
    invoke-virtual {v8}, Lcom/pymcl/runtime/control/ControlElement;->getType()Lcom/pymcl/runtime/control/ElementType;

    move-result-object v10

    if-nez v10, :cond_2

    sget-object v10, Lcom/pymcl/runtime/control/ElementType;->BUTTON:Lcom/pymcl/runtime/control/ElementType;

    invoke-virtual {v8, v10}, Lcom/pymcl/runtime/control/ControlElement;->setType(Lcom/pymcl/runtime/control/ElementType;)V

    .line 59
    :cond_2
    invoke-virtual {v8}, Lcom/pymcl/runtime/control/ControlElement;->getKeys()Ljava/util/List;

    move-result-object v10

    if-nez v10, :cond_3

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v10, Ljava/util/List;

    :cond_3
    check-cast v10, Ljava/lang/Iterable;

    .local v10, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 74
    .local v11, "$i$f$filter":I
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    check-cast v12, Ljava/util/Collection;

    .local v12, "destination$iv$iv":Ljava/util/Collection;
    move-object v13, v10

    .local v13, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 75
    .local v14, "$i$f$filterTo":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_5

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v2

    .end local v2    # "$this$onEach$iv":Ljava/lang/Iterable;
    .local v0, "element$iv$iv":Ljava/lang/Object;
    .local v16, "$this$onEach$iv":Ljava/lang/Iterable;
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .local v2, "it":Ljava/lang/String;
    const/16 v17, 0x0

    .line 59
    .local v17, "$i$a$-filter-ControlLayout$Companion$fromJson$2$1":I
    move/from16 v18, v3

    .end local v3    # "$i$f$onEach":I
    .local v18, "$i$f$onEach":I
    sget-object v3, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    invoke-virtual {v3, v2}, Lcom/pymcl/runtime/input/Keys;->isValid(Ljava/lang/String;)Z

    move-result v2

    .line 75
    .end local v2    # "it":Ljava/lang/String;
    .end local v17    # "$i$a$-filter-ControlLayout$Companion$fromJson$2$1":I
    if-eqz v2, :cond_4

    invoke-interface {v12, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_4
    move-object/from16 v0, p1

    move-object/from16 v2, v16

    move/from16 v3, v18

    goto :goto_2

    .line 76
    .end local v0    # "element$iv$iv":Ljava/lang/Object;
    .end local v16    # "$this$onEach$iv":Ljava/lang/Iterable;
    .end local v18    # "$i$f$onEach":I
    .local v2, "$this$onEach$iv":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$onEach":I
    :cond_5
    move-object/from16 v16, v2

    move/from16 v18, v3

    .end local v2    # "$this$onEach$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$onEach":I
    .end local v12    # "destination$iv$iv":Ljava/util/Collection;
    .end local v13    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$filterTo":I
    .restart local v16    # "$this$onEach$iv":Ljava/lang/Iterable;
    .restart local v18    # "$i$f$onEach":I
    move-object v0, v12

    check-cast v0, Ljava/util/List;

    .line 74
    nop

    .end local v10    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$filter":I
    check-cast v0, Ljava/util/Collection;

    .line 59
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/pymcl/runtime/control/ControlElement;->setKeys(Ljava/util/List;)V

    .line 60
    invoke-virtual {v8}, Lcom/pymcl/runtime/control/ControlElement;->getX()F

    move-result v0

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v0, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v0

    invoke-virtual {v8, v0}, Lcom/pymcl/runtime/control/ControlElement;->setX(F)V

    invoke-virtual {v8}, Lcom/pymcl/runtime/control/ControlElement;->getY()F

    move-result v0

    invoke-static {v0, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v0

    invoke-virtual {v8, v0}, Lcom/pymcl/runtime/control/ControlElement;->setY(F)V

    .line 61
    invoke-virtual {v8}, Lcom/pymcl/runtime/control/ControlElement;->getW()F

    move-result v0

    const v2, 0x3ca3d70a    # 0.02f

    invoke-static {v0, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v0

    invoke-virtual {v8, v0}, Lcom/pymcl/runtime/control/ControlElement;->setW(F)V

    invoke-virtual {v8}, Lcom/pymcl/runtime/control/ControlElement;->getH()F

    move-result v0

    invoke-static {v0, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v0

    invoke-virtual {v8, v0}, Lcom/pymcl/runtime/control/ControlElement;->setH(F)V

    .line 62
    invoke-virtual {v8}, Lcom/pymcl/runtime/control/ControlElement;->getAlpha()F

    move-result v0

    const v2, 0x3d4ccccd    # 0.05f

    invoke-static {v0, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v0

    invoke-virtual {v8, v0}, Lcom/pymcl/runtime/control/ControlElement;->setAlpha(F)V

    .line 63
    nop

    .line 72
    .end local v8    # "e":Lcom/pymcl/runtime/control/ControlElement;
    .end local v9    # "$i$a$-onEach-ControlLayout$Companion$fromJson$2":I
    move-object/from16 v0, p1

    move-object/from16 v2, v16

    move/from16 v3, v18

    .end local v7    # "element$iv":Ljava/lang/Object;
    goto/16 :goto_1

    .end local v16    # "$this$onEach$iv":Ljava/lang/Iterable;
    .end local v18    # "$i$f$onEach":I
    .restart local v2    # "$this$onEach$iv":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$onEach":I
    :cond_6
    move-object/from16 v16, v2

    .end local v2    # "$this$onEach$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$onEach":I
    .end local v4    # "$this$onEach_u24lambda_u240$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$a$-apply-CollectionsKt___CollectionsKt$onEach$1$iv":I
    move-object/from16 v0, v16

    check-cast v0, Ljava/util/Collection;

    .line 63
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 57
    invoke-virtual {v1, v0}, Lcom/pymcl/runtime/control/ControlLayout;->setElements(Ljava/util/List;)V

    .line 64
    return-object v1

    .line 71
    :cond_7
    const/4 v0, 0x0

    .line 55
    .local v0, "$i$a$-require-ControlLayout$Companion$fromJson$1":I
    invoke-virtual {v1}, Lcom/pymcl/runtime/control/ControlLayout;->getVersion()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5e03\u5c40\u683c\u5f0f v"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u6bd4\u672c\u7248\u672c\u652f\u6301\u7684 v1 \u65b0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-require-ControlLayout$Companion$fromJson$1":I
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 54
    .end local v1    # "l":Lcom/pymcl/runtime/control/ControlLayout;
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\u7a7a\u5e03\u5c40"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
