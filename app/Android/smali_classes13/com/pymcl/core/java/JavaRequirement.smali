.class public final Lcom/pymcl/core/java/JavaRequirement;
.super Ljava/lang/Object;
.source "JavaRequirement.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJavaRequirement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaRequirement.kt\ncom/pymcl/core/java/JavaRequirement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n296#2,2:26\n*S KotlinDebug\n*F\n+ 1 JavaRequirement.kt\ncom/pymcl/core/java/JavaRequirement\n*L\n13#1:26,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0011R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/pymcl/core/java/JavaRequirement;",
        "",
        "<init>",
        "()V",
        "BUNDLED",
        "",
        "",
        "getBUNDLED",
        "()Ljava/util/Set;",
        "SUPPORTED",
        "",
        "getSUPPORTED",
        "()Ljava/util/List;",
        "requiredMajor",
        "mcVersion",
        "",
        "declared",
        "(Ljava/lang/String;Ljava/lang/Integer;)I",
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
.field private static final BUNDLED:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/pymcl/core/java/JavaRequirement;

.field private static final SUPPORTED:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/pymcl/core/java/JavaRequirement;

    invoke-direct {v0}, Lcom/pymcl/core/java/JavaRequirement;-><init>()V

    sput-object v0, Lcom/pymcl/core/java/JavaRequirement;->INSTANCE:Lcom/pymcl/core/java/JavaRequirement;

    .line 9
    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Integer;

    const/16 v2, 0x11

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v4, 0x15

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v1, v5

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, Lcom/pymcl/core/java/JavaRequirement;->BUNDLED:Ljava/util/Set;

    .line 10
    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Integer;

    const/16 v6, 0x8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v3

    aput-object v2, v1, v5

    aput-object v4, v1, v0

    const/16 v0, 0x19

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x3

    aput-object v0, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/java/JavaRequirement;->SUPPORTED:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic requiredMajor$default(Lcom/pymcl/core/java/JavaRequirement;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)I
    .locals 0

    .line 12
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/java/JavaRequirement;->requiredMajor(Ljava/lang/String;Ljava/lang/Integer;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final getBUNDLED()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/pymcl/core/java/JavaRequirement;->BUNDLED:Ljava/util/Set;

    return-object v0
.end method

.method public final getSUPPORTED()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 10
    sget-object v0, Lcom/pymcl/core/java/JavaRequirement;->SUPPORTED:Ljava/util/List;

    return-object v0
.end method

.method public final requiredMajor(Ljava/lang/String;Ljava/lang/Integer;)I
    .locals 11
    .param p1, "mcVersion"    # Ljava/lang/String;
    .param p2, "declared"    # Ljava/lang/Integer;

    const-string v0, "mcVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p2, :cond_4

    sget-object v3, Lcom/pymcl/core/java/JavaRequirement;->SUPPORTED:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 26
    .local v4, "$i$f$firstOrNull":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .local v7, "it":I
    const/4 v8, 0x0

    .line 13
    .local v8, "$i$a$-firstOrNull-JavaRequirement$requiredMajor$1":I
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-lt v7, v9, :cond_1

    move v7, v0

    goto :goto_0

    :cond_1
    move v7, v2

    .line 26
    .end local v7    # "it":I
    .end local v8    # "$i$a$-firstOrNull-JavaRequirement$requiredMajor$1":I
    :goto_0
    if-eqz v7, :cond_0

    move-object v1, v6

    goto :goto_1

    .line 27
    .end local v6    # "element$iv":Ljava/lang/Object;
    :cond_2
    nop

    .line 13
    .end local v3    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$firstOrNull":I
    :goto_1
    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_3
    sget-object v0, Lcom/pymcl/core/java/JavaRequirement;->SUPPORTED:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    :goto_2
    return v0

    .line 14
    :cond_4
    const-string v3, "1."

    move-object v4, v3

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {p1, v4}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/CharSequence;

    const/4 v4, 0x3

    new-array v6, v4, [C

    fill-array-data v6, :array_0

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 15
    .local v4, "parts":Ljava/util/List;
    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/16 v6, 0x15

    if-eqz v5, :cond_a

    invoke-static {v5}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 16
    .local v5, "minor":I
    invoke-static {v4, v0}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_3

    :cond_5
    move v0, v2

    .line 17
    .local v0, "patch":I
    :goto_3
    const/4 v7, 0x2

    invoke-static {p1, v3, v2, v7, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    const/16 v1, 0x19

    return v1

    .line 18
    :cond_6
    nop

    .line 19
    const/16 v1, 0x10

    if-gt v5, v1, :cond_7

    const/16 v6, 0x8

    goto :goto_5

    .line 20
    :cond_7
    const/16 v1, 0x14

    if-lt v5, v1, :cond_9

    if-ne v5, v1, :cond_8

    const/4 v1, 0x4

    if-gt v0, v1, :cond_8

    goto :goto_4

    .line 21
    :cond_8
    goto :goto_5

    .line 20
    :cond_9
    :goto_4
    const/16 v6, 0x11

    .line 18
    :goto_5
    return v6

    .line 15
    .end local v0    # "patch":I
    .end local v5    # "minor":I
    :cond_a
    return v6

    :array_0
    .array-data 2
        0x2es
        0x2ds
        0x20s
    .end array-data
.end method
