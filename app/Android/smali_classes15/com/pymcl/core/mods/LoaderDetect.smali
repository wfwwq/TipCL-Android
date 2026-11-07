.class public final Lcom/pymcl/core/mods/LoaderDetect;
.super Ljava/lang/Object;
.source "ModTools.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/mods/LoaderDetect$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModTools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModTools.kt\ncom/pymcl/core/mods/LoaderDetect\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1795#2,10:289\n2068#2:299\n2069#2:301\n1805#2:302\n296#2,2:304\n1#3:300\n1#3:303\n*S KotlinDebug\n*F\n+ 1 ModTools.kt\ncom/pymcl/core/mods/LoaderDetect\n*L\n75#1:289,10\n75#1:299\n75#1:301\n75#1:302\n77#1:304,2\n75#1:300\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\u0008\u001a\u00020\tJ6\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00072\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/pymcl/core/mods/LoaderDetect;",
        "",
        "<init>",
        "()V",
        "detect",
        "Lkotlin/Pair;",
        "Lcom/pymcl/core/loader/LoaderType;",
        "",
        "v",
        "Lcom/pymcl/core/version/ResolvedVersion;",
        "libs",
        "",
        "versionId",
        "mc",
        "mrpackKey",
        "t",
        "catalogName",
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
.field public static final INSTANCE:Lcom/pymcl/core/mods/LoaderDetect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/mods/LoaderDetect;

    invoke-direct {v0}, Lcom/pymcl/core/mods/LoaderDetect;-><init>()V

    sput-object v0, Lcom/pymcl/core/mods/LoaderDetect;->INSTANCE:Lcom/pymcl/core/mods/LoaderDetect;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic detect$default(Lcom/pymcl/core/mods/LoaderDetect;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/Pair;
    .locals 1

    .line 76
    and-int/lit8 p5, p4, 0x2

    const-string v0, ""

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/core/mods/LoaderDetect;->detect(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final detect$stripMc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "$mc"    # Ljava/lang/String;
    .param p1, "s"    # Ljava/lang/String;

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 303
    .local v0, "it":Ljava/lang/String;
    const/4 v2, 0x0

    .line 78
    .local v2, "$i$a$-let-LoaderDetect$detect$stripMc$1":I
    move-object v3, p0

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    move-object v0, v1

    .end local v0    # "it":Ljava/lang/String;
    .end local v2    # "$i$a$-let-LoaderDetect$detect$stripMc$1":I
    :cond_1
    return-object v0
.end method

.method private static final detect$ver(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 13
    .param p0, "$libs"    # Ljava/util/List;
    .param p1, "prefix"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 77
    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 304
    .local v1, "$i$f$firstOrNull":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    .local v7, "it":Ljava/lang/String;
    const/4 v8, 0x0

    .line 77
    .local v8, "$i$a$-firstOrNull-LoaderDetect$detect$ver$1":I
    invoke-static {v7, p1, v5, v4, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v7

    .line 304
    .end local v7    # "it":Ljava/lang/String;
    .end local v8    # "$i$a$-firstOrNull-LoaderDetect$detect$ver$1":I
    if-eqz v7, :cond_0

    goto :goto_0

    .line 305
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_1
    move-object v3, v6

    .line 77
    .end local v0    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull":I
    :goto_0
    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_2

    move-object v7, v3

    check-cast v7, Ljava/lang/CharSequence;

    const/4 v0, 0x1

    new-array v8, v0, [C

    const/16 v0, 0x3a

    aput-char v0, v8, v5

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    :cond_2
    return-object v6
.end method


# virtual methods
.method public final catalogName(Lcom/pymcl/core/loader/LoaderType;)Ljava/lang/String;
    .locals 2
    .param p1, "t"    # Lcom/pymcl/core/loader/LoaderType;

    .line 90
    if-nez p1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/pymcl/core/mods/LoaderDetect$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/pymcl/core/loader/LoaderType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    :goto_0
    packed-switch v0, :pswitch_data_0

    const-string v0, ""

    goto :goto_1

    :pswitch_0
    const-string v0, "neoforge"

    goto :goto_1

    :pswitch_1
    const-string v0, "forge"

    goto :goto_1

    :pswitch_2
    const-string v0, "quilt"

    goto :goto_1

    :pswitch_3
    const-string v0, "fabric"

    :goto_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final detect(Lcom/pymcl/core/version/ResolvedVersion;)Lkotlin/Pair;
    .locals 14
    .param p1, "v"    # Lcom/pymcl/core/version/ResolvedVersion;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/ResolvedVersion;",
            ")",
            "Lkotlin/Pair<",
            "Lcom/pymcl/core/loader/LoaderType;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-virtual {p1}, Lcom/pymcl/core/version/ResolvedVersion;->getJson()Ljava/util/Map;

    move-result-object v0

    const-string v1, "libraries"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 289
    .local v1, "$i$f$mapNotNull":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 298
    .local v4, "$i$f$mapNotNullTo":I
    move-object v5, v3

    .local v5, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 299
    .local v6, "$i$f$forEach":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "element$iv$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 298
    .local v10, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object v11, v9

    check-cast v11, Ljava/util/Map;

    .local v11, "it":Ljava/util/Map;
    const/4 v12, 0x0

    .line 75
    .local v12, "$i$a$-mapNotNull-LoaderDetect$detect$1":I
    const-string v13, "name"

    invoke-static {v11, v13}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 298
    .end local v11    # "it":Ljava/util/Map;
    .end local v12    # "$i$a$-mapNotNull-LoaderDetect$detect$1":I
    if-eqz v11, :cond_0

    .line 300
    .local v11, "it$iv$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 298
    .local v12, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v2, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 299
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    .end local v11    # "it$iv$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    :cond_0
    nop

    .end local v8    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 301
    :cond_1
    nop

    .line 302
    .end local v5    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$forEach":I
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapNotNullTo":I
    check-cast v2, Ljava/util/List;

    .line 289
    nop

    .line 75
    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$mapNotNull":I
    invoke-virtual {p1}, Lcom/pymcl/core/version/ResolvedVersion;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/pymcl/core/version/ResolvedVersion;->getMcVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v2, v0, v1}, Lcom/pymcl/core/mods/LoaderDetect;->detect(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method

.method public final detect(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;
    .locals 5
    .param p1, "libs"    # Ljava/util/List;
    .param p2, "versionId"    # Ljava/lang/String;
    .param p3, "mc"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Lcom/pymcl/core/loader/LoaderType;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "libs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mc"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    const-string v0, "net.fabricmc:fabric-loader:"

    invoke-static {p1, v0}, Lcom/pymcl/core/mods/LoaderDetect;->detect$ver(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 303
    .local v0, "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 79
    .local v1, "$i$a$-let-LoaderDetect$detect$2":I
    sget-object v2, Lcom/pymcl/core/loader/LoaderType;->FABRIC:Lcom/pymcl/core/loader/LoaderType;

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    return-object v2

    .line 80
    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-LoaderDetect$detect$2":I
    :cond_0
    const-string v0, "org.quiltmc:quilt-loader:"

    invoke-static {p1, v0}, Lcom/pymcl/core/mods/LoaderDetect;->detect$ver(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 303
    .restart local v0    # "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 80
    .local v1, "$i$a$-let-LoaderDetect$detect$3":I
    sget-object v2, Lcom/pymcl/core/loader/LoaderType;->QUILT:Lcom/pymcl/core/loader/LoaderType;

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    return-object v2

    .line 81
    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-LoaderDetect$detect$3":I
    :cond_1
    const-string v0, "net.neoforged:neoforge:"

    invoke-static {p1, v0}, Lcom/pymcl/core/mods/LoaderDetect;->detect$ver(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 303
    .restart local v0    # "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 81
    .local v1, "$i$a$-let-LoaderDetect$detect$4":I
    sget-object v2, Lcom/pymcl/core/loader/LoaderType;->NEOFORGE:Lcom/pymcl/core/loader/LoaderType;

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    return-object v2

    .line 82
    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-LoaderDetect$detect$4":I
    :cond_2
    const-string v0, "net.neoforged:forge:"

    invoke-static {p1, v0}, Lcom/pymcl/core/mods/LoaderDetect;->detect$ver(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 303
    .restart local v0    # "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 82
    .local v1, "$i$a$-let-LoaderDetect$detect$5":I
    sget-object v2, Lcom/pymcl/core/loader/LoaderType;->NEOFORGE:Lcom/pymcl/core/loader/LoaderType;

    invoke-static {p3, v0}, Lcom/pymcl/core/mods/LoaderDetect;->detect$stripMc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    return-object v2

    .line 83
    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-LoaderDetect$detect$5":I
    :cond_3
    const-string v0, "net.minecraftforge:forge:"

    invoke-static {p1, v0}, Lcom/pymcl/core/mods/LoaderDetect;->detect$ver(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    const-string v0, "net.minecraftforge:fmlloader:"

    invoke-static {p1, v0}, Lcom/pymcl/core/mods/LoaderDetect;->detect$ver(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_4
    if-eqz v0, :cond_5

    .line 303
    .restart local v0    # "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 83
    .local v1, "$i$a$-let-LoaderDetect$detect$6":I
    sget-object v2, Lcom/pymcl/core/loader/LoaderType;->FORGE:Lcom/pymcl/core/loader/LoaderType;

    invoke-static {p3, v0}, Lcom/pymcl/core/mods/LoaderDetect;->detect$stripMc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    return-object v2

    .line 84
    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-LoaderDetect$detect$6":I
    :cond_5
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "(?i)(neoforge|forge|fabric|quilt)[-_ ]?(?:loader)?[-_ ]?([0-9][\\w.\\-]*)"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v0

    if-eqz v0, :cond_9

    .local v0, "m":Lkotlin/text/MatchResult;
    const/4 v1, 0x0

    .line 85
    .local v1, "$i$a$-let-LoaderDetect$detect$7":I
    invoke-interface {v0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "toLowerCase(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    :cond_6
    :goto_0
    goto :goto_1

    :sswitch_0
    const-string v4, "neoforge"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, Lcom/pymcl/core/loader/LoaderType;->NEOFORGE:Lcom/pymcl/core/loader/LoaderType;

    goto :goto_2

    :sswitch_1
    const-string v4, "forge"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    sget-object v2, Lcom/pymcl/core/loader/LoaderType;->FORGE:Lcom/pymcl/core/loader/LoaderType;

    goto :goto_2

    :sswitch_2
    const-string v4, "fabric"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_0

    :cond_8
    sget-object v2, Lcom/pymcl/core/loader/LoaderType;->FABRIC:Lcom/pymcl/core/loader/LoaderType;

    goto :goto_2

    :goto_1
    sget-object v2, Lcom/pymcl/core/loader/LoaderType;->QUILT:Lcom/pymcl/core/loader/LoaderType;

    .line 86
    .local v2, "t":Lcom/pymcl/core/loader/LoaderType;
    :goto_2
    invoke-interface {v0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {p3, v3}, Lcom/pymcl/core/mods/LoaderDetect;->detect$stripMc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    return-object v3

    .line 87
    .end local v0    # "m":Lkotlin/text/MatchResult;
    .end local v1    # "$i$a$-let-LoaderDetect$detect$7":I
    .end local v2    # "t":Lcom/pymcl/core/loader/LoaderType;
    :cond_9
    return-object v4

    :sswitch_data_0
    .sparse-switch
        -0x4c6c835b -> :sswitch_2
        0x5d18b67 -> :sswitch_1
        0x44d220cf -> :sswitch_0
    .end sparse-switch
.end method

.method public final mrpackKey(Lcom/pymcl/core/loader/LoaderType;)Ljava/lang/String;
    .locals 2
    .param p1, "t"    # Lcom/pymcl/core/loader/LoaderType;

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    sget-object v0, Lcom/pymcl/core/mods/LoaderDetect$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/pymcl/core/loader/LoaderType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_0

    :pswitch_0
    const-string v0, "neoforge"

    goto :goto_0

    :pswitch_1
    const-string v0, "forge"

    goto :goto_0

    :pswitch_2
    const-string v0, "quilt-loader"

    goto :goto_0

    :pswitch_3
    const-string v0, "fabric-loader"

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
