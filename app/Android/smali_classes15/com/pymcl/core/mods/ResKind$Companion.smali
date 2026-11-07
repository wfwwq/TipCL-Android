.class public final Lcom/pymcl/core/mods/ResKind$Companion;
.super Ljava/lang/Object;
.source "ModCatalog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/mods/ResKind;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModCatalog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModCatalog.kt\ncom/pymcl/core/mods/ResKind$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n296#2,2:239\n296#2,2:241\n*S KotlinDebug\n*F\n+ 1 ModCatalog.kt\ncom/pymcl/core/mods/ResKind$Companion\n*L\n23#1:239,2\n24#1:241,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0015\u0010\u0008\u001a\u00020\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/pymcl/core/mods/ResKind$Companion;",
        "",
        "<init>",
        "()V",
        "of",
        "Lcom/pymcl/core/mods/ResKind;",
        "key",
        "",
        "fromCfClass",
        "c",
        "",
        "(Ljava/lang/Integer;)Lcom/pymcl/core/mods/ResKind;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/core/mods/ResKind$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromCfClass(Ljava/lang/Integer;)Lcom/pymcl/core/mods/ResKind;
    .locals 8
    .param p1, "c"    # Ljava/lang/Integer;

    .line 24
    invoke-static {}, Lcom/pymcl/core/mods/ResKind;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 241
    .local v1, "$i$f$firstOrNull":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/pymcl/core/mods/ResKind;

    .local v4, "it":Lcom/pymcl/core/mods/ResKind;
    const/4 v5, 0x0

    .line 24
    .local v5, "$i$a$-firstOrNull-ResKind$Companion$fromCfClass$1":I
    invoke-virtual {v4}, Lcom/pymcl/core/mods/ResKind;->getCfClass()I

    move-result v6

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v6, v7, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v6, 0x0

    .line 241
    .end local v4    # "it":Lcom/pymcl/core/mods/ResKind;
    .end local v5    # "$i$a$-firstOrNull-ResKind$Companion$fromCfClass$1":I
    :goto_1
    if-eqz v6, :cond_0

    goto :goto_2

    .line 242
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_3
    const/4 v3, 0x0

    .line 24
    .end local v0    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull":I
    :goto_2
    check-cast v3, Lcom/pymcl/core/mods/ResKind;

    if-nez v3, :cond_4

    sget-object v3, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    :cond_4
    return-object v3
.end method

.method public final of(Ljava/lang/String;)Lcom/pymcl/core/mods/ResKind;
    .locals 9
    .param p1, "key"    # Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    :goto_0
    goto :goto_1

    :sswitch_0
    const-string v2, "mods"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :sswitch_1
    const-string v2, "mod"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    goto :goto_3

    :sswitch_2
    const-string v2, "resource"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :sswitch_3
    const-string v2, "resourcepack"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/pymcl/core/mods/ResKind;->RESOURCE:Lcom/pymcl/core/mods/ResKind;

    goto :goto_3

    :sswitch_4
    const-string v2, "shader"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :sswitch_5
    const-string v2, "shaderpack"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/pymcl/core/mods/ResKind;->SHADER:Lcom/pymcl/core/mods/ResKind;

    goto :goto_3

    .line 23
    :goto_1
    invoke-static {}, Lcom/pymcl/core/mods/ResKind;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 239
    .local v2, "$i$f$firstOrNull":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Lcom/pymcl/core/mods/ResKind;

    .local v5, "it":Lcom/pymcl/core/mods/ResKind;
    const/4 v6, 0x0

    .line 23
    .local v6, "$i$a$-firstOrNull-ResKind$Companion$of$1":I
    invoke-virtual {v5}, Lcom/pymcl/core/mods/ResKind;->getKey()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    .line 239
    .end local v5    # "it":Lcom/pymcl/core/mods/ResKind;
    .end local v6    # "$i$a$-firstOrNull-ResKind$Companion$of$1":I
    if-eqz v5, :cond_3

    goto :goto_2

    .line 240
    .end local v4    # "element$iv":Ljava/lang/Object;
    :cond_4
    const/4 v4, 0x0

    .line 23
    .end local v0    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$firstOrNull":I
    :goto_2
    move-object v0, v4

    check-cast v0, Lcom/pymcl/core/mods/ResKind;

    if-nez v0, :cond_5

    sget-object v0, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    :cond_5
    :goto_3
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4e1fa082 -> :sswitch_5
        -0x35db881b -> :sswitch_4
        -0x16dc90d9 -> :sswitch_3
        -0x14543bf2 -> :sswitch_2
        0x1a702 -> :sswitch_1
        0x3339b1 -> :sswitch_0
    .end sparse-switch
.end method
