.class public final Lcom/pymcl/runtime/control/GamepadMapDialog;
.super Ljava/lang/Object;
.source "GamepadMapDialog.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGamepadMapDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamepadMapDialog.kt\ncom/pymcl/runtime/control/GamepadMapDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,137:1\n1739#2:138\n1814#2,3:139\n1739#2:143\n1814#2,3:144\n1739#2:149\n1814#2,3:150\n1739#2:158\n1814#2,3:159\n1#3:142\n37#4,2:147\n37#4,2:153\n3938#5:155\n4474#5,2:156\n*S KotlinDebug\n*F\n+ 1 GamepadMapDialog.kt\ncom/pymcl/runtime/control/GamepadMapDialog\n*L\n73#1:138\n73#1:139,3\n115#1:143\n115#1:144,3\n125#1:149\n125#1:150,3\n135#1:158\n135#1:159,3\n115#1:147,2\n125#1:153,2\n134#1:155\n134#1:156,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000e\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002J\u0008\u0010\u001b\u001a\u00020\tH\u0002J\u0006\u0010\u001c\u001a\u00020\tJ\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0014H\u0002J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0002J\u000e\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006%"
    }
    d2 = {
        "Lcom/pymcl/runtime/control/GamepadMapDialog;",
        "",
        "context",
        "Landroid/content/Context;",
        "store",
        "Lcom/pymcl/runtime/input/GamepadMappingStore;",
        "onSaved",
        "Lkotlin/Function1;",
        "Lcom/pymcl/runtime/input/GamepadMapping;",
        "",
        "<init>",
        "(Landroid/content/Context;Lcom/pymcl/runtime/input/GamepadMappingStore;Lkotlin/jvm/functions/Function1;)V",
        "working",
        "adapter",
        "Landroid/widget/ArrayAdapter;",
        "",
        "dialog",
        "Landroid/app/AlertDialog;",
        "buttons",
        "Lkotlin/enums/EnumEntries;",
        "Lcom/pymcl/runtime/input/GamepadButton;",
        "rowCount",
        "",
        "getRowCount",
        "()I",
        "rows",
        "",
        "refresh",
        "show",
        "onRow",
        "pos",
        "pickKey",
        "b",
        "pickStick",
        "left",
        "",
        "allKeyNames",
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


# instance fields
.field private adapter:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final buttons:Lkotlin/enums/EnumEntries;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/runtime/input/GamepadButton;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private dialog:Landroid/app/AlertDialog;

.field private final onSaved:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/pymcl/runtime/input/GamepadMapping;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final store:Lcom/pymcl/runtime/input/GamepadMappingStore;

.field private working:Lcom/pymcl/runtime/input/GamepadMapping;


# direct methods
.method public static synthetic $r8$lambda$IbVTyJDsXzFVlh_WVTpuZy-bH7Q(Lcom/pymcl/runtime/control/GamepadMapDialog;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/runtime/control/GamepadMapDialog;->show$lambda$3(Lcom/pymcl/runtime/control/GamepadMapDialog;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$JD0aHryKRdMLH7NxHDDTNsQSXFk(Lcom/pymcl/runtime/control/GamepadMapDialog;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/runtime/control/GamepadMapDialog;->show$lambda$2(Lcom/pymcl/runtime/control/GamepadMapDialog;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$QUArdUQKeNWEJwxysc6QRTlX8ds(Lcom/pymcl/runtime/control/GamepadMapDialog;Lcom/pymcl/runtime/input/GamepadButton;Ljava/util/List;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/pymcl/runtime/control/GamepadMapDialog;->pickKey$lambda$0(Lcom/pymcl/runtime/control/GamepadMapDialog;Lcom/pymcl/runtime/input/GamepadButton;Ljava/util/List;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$rpNqgQQaZFIjHm2VpP4Ow-AOmN0(Lcom/pymcl/runtime/control/GamepadMapDialog;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/pymcl/runtime/control/GamepadMapDialog;->show$lambda$1(Lcom/pymcl/runtime/control/GamepadMapDialog;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method public static synthetic $r8$lambda$sE3ZD77QuPohB9ga_laylSPW8dg(Lcom/pymcl/runtime/control/GamepadMapDialog;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/runtime/control/GamepadMapDialog;->show$lambda$4$0(Lcom/pymcl/runtime/control/GamepadMapDialog;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$uCDH7LFRHAV3ATStXJuWNswS9Xk(ZLcom/pymcl/runtime/control/GamepadMapDialog;Lkotlin/enums/EnumEntries;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/pymcl/runtime/control/GamepadMapDialog;->pickStick$lambda$1(ZLcom/pymcl/runtime/control/GamepadMapDialog;Lkotlin/enums/EnumEntries;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/pymcl/runtime/input/GamepadMappingStore;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "store"    # Lcom/pymcl/runtime/input/GamepadMappingStore;
    .param p3, "onSaved"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/pymcl/runtime/input/GamepadMappingStore;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/runtime/input/GamepadMapping;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "store"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSaved"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->context:Landroid/content/Context;

    .line 63
    iput-object p2, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->store:Lcom/pymcl/runtime/input/GamepadMappingStore;

    .line 64
    iput-object p3, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->onSaved:Lkotlin/jvm/functions/Function1;

    .line 66
    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->store:Lcom/pymcl/runtime/input/GamepadMappingStore;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadMappingStore;->load()Lcom/pymcl/runtime/input/GamepadMapping;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    .line 70
    invoke-static {}, Lcom/pymcl/runtime/input/GamepadButton;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->buttons:Lkotlin/enums/EnumEntries;

    .line 61
    return-void
.end method

.method private final allKeyNames()Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 133
    const-class v0, Lcom/tungsten/fclauncher/keycodes/FCLKeycodes;

    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-string v1, "getFields(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    .line 134
    nop

    .local v0, "$this$filter$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 155
    .local v1, "$i$f$filter":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 156
    .local v4, "$i$f$filterTo":I
    array-length v5, v3

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_2

    aget-object v8, v3, v7

    .local v8, "element$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/reflect/Field;

    .local v9, "it":Ljava/lang/reflect/Field;
    const/4 v10, 0x0

    .line 134
    .local v10, "$i$a$-filter-GamepadMapDialog$allKeyNames$1":I
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "getName(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v12, 0x2

    const/4 v13, 0x0

    const-string v14, "KEY_"

    invoke-static {v11, v14, v6, v12, v13}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v11

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    const/4 v11, 0x1

    goto :goto_1

    :cond_0
    move v11, v6

    .line 156
    .end local v9    # "it":Ljava/lang/reflect/Field;
    .end local v10    # "$i$a$-filter-GamepadMapDialog$allKeyNames$1":I
    :goto_1
    if-eqz v11, :cond_1

    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 157
    :cond_2
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$filterTo":I
    check-cast v2, Ljava/util/List;

    .line 155
    nop

    .end local v0    # "$this$filter$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$filter":I
    check-cast v2, Ljava/lang/Iterable;

    .line 135
    nop

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 158
    .local v0, "$i$f$map":I
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .local v1, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v2

    .local v3, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 159
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 160
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/lang/reflect/Field;

    .local v7, "it":Ljava/lang/reflect/Field;
    const/4 v8, 0x0

    .line 135
    .local v8, "$i$a$-map-GamepadMapDialog$allKeyNames$2":I
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v7

    .line 160
    .end local v7    # "it":Ljava/lang/reflect/Field;
    .end local v8    # "$i$a$-map-GamepadMapDialog$allKeyNames$2":I
    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 161
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .end local v1    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v1, Ljava/util/List;

    .line 158
    nop

    .line 135
    .end local v0    # "$i$f$map":I
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    return-object v1
.end method

.method private final getRowCount()I
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->buttons:Lkotlin/enums/EnumEntries;

    invoke-interface {v0}, Lkotlin/enums/EnumEntries;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    return v0
.end method

.method private final onRow(I)V
    .locals 3
    .param p1, "pos"    # I

    .line 102
    nop

    .line 103
    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->buttons:Lkotlin/enums/EnumEntries;

    invoke-interface {v0}, Lkotlin/enums/EnumEntries;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->buttons:Lkotlin/enums/EnumEntries;

    invoke-interface {v0, p1}, Lkotlin/enums/EnumEntries;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/input/GamepadButton;

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/control/GamepadMapDialog;->pickKey(Lcom/pymcl/runtime/input/GamepadButton;)V

    goto :goto_0

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->buttons:Lkotlin/enums/EnumEntries;

    invoke-interface {v0}, Lkotlin/enums/EnumEntries;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne p1, v0, :cond_1

    invoke-direct {p0, v1}, Lcom/pymcl/runtime/control/GamepadMapDialog;->pickStick(Z)V

    goto :goto_0

    .line 105
    :cond_1
    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->buttons:Lkotlin/enums/EnumEntries;

    invoke-interface {v0}, Lkotlin/enums/EnumEntries;->size()I

    move-result v0

    add-int/2addr v0, v1

    if-ne p1, v0, :cond_2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/control/GamepadMapDialog;->pickStick(Z)V

    goto :goto_0

    .line 106
    :cond_2
    invoke-direct {p0}, Lcom/pymcl/runtime/control/GamepadMapDialog;->getRowCount()I

    move-result v0

    sub-int/2addr v0, v1

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    iget-object v2, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/GamepadMapping;->getInvertY()Z

    move-result v2

    xor-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/GamepadMapping;->setInvertY(Z)V

    invoke-direct {p0}, Lcom/pymcl/runtime/control/GamepadMapDialog;->refresh()V

    .line 108
    :cond_3
    :goto_0
    return-void
.end method

.method private final pickKey(Lcom/pymcl/runtime/input/GamepadButton;)V
    .locals 13
    .param p1, "b"    # Lcom/pymcl/runtime/input/GamepadButton;

    .line 111
    sget-object v0, Lcom/pymcl/runtime/control/KeyChoices;->INSTANCE:Lcom/pymcl/runtime/control/KeyChoices;

    invoke-direct {p0}, Lcom/pymcl/runtime/control/GamepadMapDialog;->allKeyNames()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/control/KeyChoices;->all(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 112
    .local v0, "names":Ljava/util/List;
    iget-object v1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {v1, p1}, Lcom/pymcl/runtime/input/GamepadMapping;->keyFor(Lcom/pymcl/runtime/input/GamepadButton;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 113
    .local v1, "current":I
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->context:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 114
    invoke-virtual {p1}, Lcom/pymcl/runtime/input/GamepadButton;->getLabel()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " \u6620\u5c04\u4e3a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 115
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$map$iv":Ljava/lang/Iterable;
    sget-object v4, Lcom/pymcl/runtime/control/KeyChoices;->INSTANCE:Lcom/pymcl/runtime/control/KeyChoices;

    const/4 v5, 0x0

    .line 143
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v3

    .local v7, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 144
    .local v8, "$i$f$mapTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 145
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Ljava/lang/String;

    .local v11, "p0":Ljava/lang/String;
    const/4 v12, 0x0

    .line 115
    .local v12, "$i$a$-map-GamepadMapDialog$pickKey$1":I
    invoke-virtual {v4, v11}, Lcom/pymcl/runtime/control/KeyChoices;->label(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 145
    .end local v11    # "p0":Ljava/lang/String;
    .end local v12    # "$i$a$-map-GamepadMapDialog$pickKey$1":I
    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 146
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapTo":I
    move-object v4, v6

    check-cast v4, Ljava/util/List;

    .line 143
    nop

    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 115
    nop

    .local v4, "$this$toTypedArray$iv":Ljava/util/Collection;
    const/4 v3, 0x0

    .line 147
    .local v3, "$i$f$toTypedArray":I
    move-object v5, v4

    .line 148
    .local v5, "thisCollection$iv":Ljava/util/Collection;
    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/String;

    invoke-interface {v5, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    .end local v3    # "$i$f$toTypedArray":I
    .end local v4    # "$this$toTypedArray$iv":Ljava/util/Collection;
    .end local v5    # "thisCollection$iv":Ljava/util/Collection;
    check-cast v3, [Ljava/lang/CharSequence;

    .line 115
    new-instance v4, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda4;

    invoke-direct {v4, p0, p1, v0}, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda4;-><init>(Lcom/pymcl/runtime/control/GamepadMapDialog;Lcom/pymcl/runtime/input/GamepadButton;Ljava/util/List;)V

    invoke-virtual {v2, v3, v1, v4}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 116
    const-string v3, "\u53d6\u6d88"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 117
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 118
    return-void
.end method

.method private static final pickKey$lambda$0(Lcom/pymcl/runtime/control/GamepadMapDialog;Lcom/pymcl/runtime/input/GamepadButton;Ljava/util/List;Landroid/content/DialogInterface;I)V
    .locals 2
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/GamepadMapDialog;
    .param p1, "$b"    # Lcom/pymcl/runtime/input/GamepadButton;
    .param p2, "$names"    # Ljava/util/List;
    .param p3, "d"    # Landroid/content/DialogInterface;
    .param p4, "i"    # I

    .line 115
    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/pymcl/runtime/input/GamepadMapping;->set(Lcom/pymcl/runtime/input/GamepadButton;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/pymcl/runtime/control/GamepadMapDialog;->refresh()V

    invoke-interface {p3}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method private final pickStick(Z)V
    .locals 12
    .param p1, "left"    # Z

    .line 121
    invoke-static {}, Lcom/pymcl/runtime/input/StickMode;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    .line 122
    .local v0, "modes":Lkotlin/enums/EnumEntries;
    iget-object v1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Lcom/pymcl/runtime/input/GamepadMapping;->getLeftStick()Lcom/pymcl/runtime/input/StickMode;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/pymcl/runtime/input/GamepadMapping;->getRightStick()Lcom/pymcl/runtime/input/StickMode;

    move-result-object v1

    .line 123
    .local v1, "cur":Lcom/pymcl/runtime/input/StickMode;
    :goto_0
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->context:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 124
    if-eqz p1, :cond_1

    const-string v3, "\u5de6\u6447\u6746\u7528\u9014"

    goto :goto_1

    :cond_1
    const-string v3, "\u53f3\u6447\u6746\u7528\u9014"

    :goto_1
    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 125
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 149
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

    .line 150
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 151
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lcom/pymcl/runtime/input/StickMode;

    .local v10, "it":Lcom/pymcl/runtime/input/StickMode;
    const/4 v11, 0x0

    .line 125
    .local v11, "$i$a$-map-GamepadMapDialog$pickStick$1":I
    invoke-virtual {v10}, Lcom/pymcl/runtime/input/StickMode;->getLabel()Ljava/lang/String;

    move-result-object v10

    .line 151
    .end local v10    # "it":Lcom/pymcl/runtime/input/StickMode;
    .end local v11    # "$i$a$-map-GamepadMapDialog$pickStick$1":I
    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 152
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    check-cast v5, Ljava/util/List;

    .line 149
    nop

    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map":I
    check-cast v5, Ljava/util/Collection;

    .line 125
    nop

    .local v5, "$this$toTypedArray$iv":Ljava/util/Collection;
    const/4 v3, 0x0

    .line 153
    .local v3, "$i$f$toTypedArray":I
    move-object v4, v5

    .line 154
    .local v4, "thisCollection$iv":Ljava/util/Collection;
    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/String;

    invoke-interface {v4, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    .end local v3    # "$i$f$toTypedArray":I
    .end local v4    # "thisCollection$iv":Ljava/util/Collection;
    .end local v5    # "$this$toTypedArray$iv":Ljava/util/Collection;
    check-cast v3, [Ljava/lang/CharSequence;

    .line 125
    invoke-interface {v0, v1}, Lkotlin/enums/EnumEntries;->indexOf(Ljava/lang/Object;)I

    move-result v4

    new-instance v5, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda5;

    invoke-direct {v5, p1, p0, v0}, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda5;-><init>(ZLcom/pymcl/runtime/control/GamepadMapDialog;Lkotlin/enums/EnumEntries;)V

    invoke-virtual {v2, v3, v4, v5}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 128
    const-string v3, "\u53d6\u6d88"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 129
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 130
    return-void
.end method

.method private static final pickStick$lambda$1(ZLcom/pymcl/runtime/control/GamepadMapDialog;Lkotlin/enums/EnumEntries;Landroid/content/DialogInterface;I)V
    .locals 2
    .param p0, "$left"    # Z
    .param p1, "this$0"    # Lcom/pymcl/runtime/control/GamepadMapDialog;
    .param p2, "$modes"    # Lkotlin/enums/EnumEntries;
    .param p3, "d"    # Landroid/content/DialogInterface;
    .param p4, "i"    # I

    .line 126
    iget-object v0, p1, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-interface {p2, p4}, Lkotlin/enums/EnumEntries;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/pymcl/runtime/input/StickMode;

    if-eqz p0, :cond_0

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/GamepadMapping;->setLeftStick(Lcom/pymcl/runtime/input/StickMode;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/GamepadMapping;->setRightStick(Lcom/pymcl/runtime/input/StickMode;)V

    :goto_0
    invoke-direct {p1}, Lcom/pymcl/runtime/control/GamepadMapDialog;->refresh()V

    invoke-interface {p3}, Landroid/content/DialogInterface;->dismiss()V

    .line 127
    return-void
.end method

.method private final refresh()V
    .locals 4

    .line 79
    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->adapter:Landroid/widget/ArrayAdapter;

    const/4 v1, 0x0

    const-string v2, "adapter"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->clear()V

    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->adapter:Landroid/widget/ArrayAdapter;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-direct {p0}, Lcom/pymcl/runtime/control/GamepadMapDialog;->rows()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v0, v3}, Landroid/widget/ArrayAdapter;->addAll(Ljava/util/Collection;)V

    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->adapter:Landroid/widget/ArrayAdapter;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method private final rows()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->buttons:Lkotlin/enums/EnumEntries;

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 138
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

    .line 139
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 140
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/runtime/input/GamepadButton;

    .local v7, "it":Lcom/pymcl/runtime/input/GamepadButton;
    const/4 v8, 0x0

    .line 73
    .local v8, "$i$a$-map-GamepadMapDialog$rows$1":I
    invoke-virtual {v7}, Lcom/pymcl/runtime/input/GamepadButton;->getLabel()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lcom/pymcl/runtime/control/KeyChoices;->INSTANCE:Lcom/pymcl/runtime/control/KeyChoices;

    iget-object v11, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {v11, v7}, Lcom/pymcl/runtime/input/GamepadMapping;->keyFor(Lcom/pymcl/runtime/input/GamepadButton;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/pymcl/runtime/control/KeyChoices;->label(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v11, "  \u2192  "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 140
    .end local v7    # "it":Lcom/pymcl/runtime/input/GamepadButton;
    .end local v8    # "$i$a$-map-GamepadMapDialog$rows$1":I
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 141
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 138
    nop

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    check-cast v2, Ljava/util/Collection;

    .line 74
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {v1}, Lcom/pymcl/runtime/input/GamepadMapping;->getLeftStick()Lcom/pymcl/runtime/input/StickMode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/runtime/input/StickMode;->getLabel()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5de6\u6447\u6746  \u2192  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    .line 75
    iget-object v1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {v1}, Lcom/pymcl/runtime/input/GamepadMapping;->getRightStick()Lcom/pymcl/runtime/input/StickMode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/runtime/input/StickMode;->getLabel()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u53f3\u6447\u6746  \u2192  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    .line 74
    nop

    .line 76
    iget-object v1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {v1}, Lcom/pymcl/runtime/input/GamepadMapping;->getInvertY()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "\u5f00"

    goto :goto_1

    :cond_1
    const-string v1, "\u5173"

    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u89c6\u89d2 Y \u8f74\u53cd\u8f6c  \u2192  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    .line 74
    nop

    .line 73
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 77
    return-object v0
.end method

.method private static final show$lambda$1(Lcom/pymcl/runtime/control/GamepadMapDialog;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/GamepadMapDialog;
    .param p3, "pos"    # I

    .line 84
    invoke-direct {p0, p3}, Lcom/pymcl/runtime/control/GamepadMapDialog;->onRow(I)V

    return-void
.end method

.method private static final show$lambda$2(Lcom/pymcl/runtime/control/GamepadMapDialog;Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/GamepadMapDialog;

    .line 88
    iget-object p1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->store:Lcom/pymcl/runtime/input/GamepadMappingStore;

    iget-object p2, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {p1, p2}, Lcom/pymcl/runtime/input/GamepadMappingStore;->save(Lcom/pymcl/runtime/input/GamepadMapping;)V

    iget-object p1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->onSaved:Lkotlin/jvm/functions/Function1;

    iget-object p2, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final show$lambda$3(Lcom/pymcl/runtime/control/GamepadMapDialog;Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/GamepadMapDialog;

    .line 89
    iget-object p1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->store:Lcom/pymcl/runtime/input/GamepadMappingStore;

    invoke-virtual {p1}, Lcom/pymcl/runtime/input/GamepadMappingStore;->reset()Lcom/pymcl/runtime/input/GamepadMapping;

    move-result-object p1

    iput-object p1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    iget-object p1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->onSaved:Lkotlin/jvm/functions/Function1;

    iget-object p2, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->working:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final show$lambda$4$0(Lcom/pymcl/runtime/control/GamepadMapDialog;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/GamepadMapDialog;
    .param p2, "keyCode"    # I
    .param p3, "e"    # Landroid/view/KeyEvent;

    .line 93
    sget-object p1, Lcom/pymcl/runtime/input/GamepadButton;->Companion:Lcom/pymcl/runtime/input/GamepadButton$Companion;

    invoke-virtual {p1, p2}, Lcom/pymcl/runtime/input/GamepadButton$Companion;->ofKeycode(I)Lcom/pymcl/runtime/input/GamepadButton;

    move-result-object p1

    .line 94
    .local p1, "b":Lcom/pymcl/runtime/input/GamepadButton;
    if-eqz p1, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/16 v0, 0x61

    if-eq p2, v0, :cond_0

    invoke-direct {p0, p1}, Lcom/pymcl/runtime/control/GamepadMapDialog;->pickKey(Lcom/pymcl/runtime/input/GamepadButton;)V

    goto :goto_0

    .line 95
    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method


# virtual methods
.method public final show()V
    .locals 5

    .line 82
    new-instance v0, Landroid/widget/ArrayAdapter;

    iget-object v1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->context:Landroid/content/Context;

    invoke-direct {p0}, Lcom/pymcl/runtime/control/GamepadMapDialog;->rows()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    const v3, 0x1090003

    invoke-direct {v0, v1, v3, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    iput-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->adapter:Landroid/widget/ArrayAdapter;

    .line 83
    new-instance v0, Landroid/widget/ListView;

    iget-object v1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    move-object v1, v0

    .line 142
    .local v1, "$this$show_u24lambda_u240":Landroid/widget/ListView;
    const/4 v2, 0x0

    .line 83
    .local v2, "$i$a$-apply-GamepadMapDialog$show$list$1":I
    iget-object v3, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->adapter:Landroid/widget/ArrayAdapter;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    const-string v3, "adapter"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v4

    :cond_0
    check-cast v3, Landroid/widget/ListAdapter;

    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 84
    .end local v1    # "$this$show_u24lambda_u240":Landroid/widget/ListView;
    .end local v2    # "$i$a$-apply-GamepadMapDialog$show$list$1":I
    .local v0, "list":Landroid/widget/ListView;
    new-instance v1, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/runtime/control/GamepadMapDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 85
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->context:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 86
    const-string v2, "\u624b\u67c4\u6620\u5c04"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 87
    move-object v2, v0

    check-cast v2, Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 88
    const-string v2, "\u4fdd\u5b58"

    check-cast v2, Ljava/lang/CharSequence;

    new-instance v3, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda1;

    invoke-direct {v3, p0}, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/runtime/control/GamepadMapDialog;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 89
    const-string v2, "\u6062\u590d\u9ed8\u8ba4"

    check-cast v2, Ljava/lang/CharSequence;

    new-instance v3, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda2;

    invoke-direct {v3, p0}, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda2;-><init>(Lcom/pymcl/runtime/control/GamepadMapDialog;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 90
    const-string v2, "\u53d6\u6d88"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 91
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    move-object v2, v1

    .local v2, "d":Landroid/app/AlertDialog;
    const/4 v3, 0x0

    .line 92
    .local v3, "$i$a$-also-GamepadMapDialog$show$4":I
    new-instance v4, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda3;

    invoke-direct {v4, p0}, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda3;-><init>(Lcom/pymcl/runtime/control/GamepadMapDialog;)V

    invoke-virtual {v2, v4}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 97
    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V

    .line 98
    nop

    .line 91
    .end local v2    # "d":Landroid/app/AlertDialog;
    .end local v3    # "$i$a$-also-GamepadMapDialog$show$4":I
    nop

    .line 85
    iput-object v1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog;->dialog:Landroid/app/AlertDialog;

    .line 99
    return-void
.end method
