.class public final Lcom/pymcl/core/loader/LoaderInstaller$parseLiteLoader$$inlined$sortedBy$1;
.super Ljava/lang/Object;
.source "Comparisons.kt"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/core/loader/LoaderInstaller;->parseLiteLoader(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Loaders.kt\ncom/pymcl/core/loader/LoaderInstaller\n*L\n1#1,325:1\n297#2:326\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4
    .param p1, "a"    # Ljava/lang/Object;
    .param p2, "b"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 101
    move-object v0, p1

    check-cast v0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    .local v0, "it":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    const/4 v1, 0x0

    .line 326
    .local v1, "$i$a$-sortedBy-LoaderInstaller$parseLiteLoader$6":I
    invoke-virtual {v0}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getSnapshot()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 101
    .end local v0    # "it":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v1    # "$i$a$-sortedBy-LoaderInstaller$parseLiteLoader$6":I
    check-cast v0, Ljava/lang/Comparable;

    move-object v1, p2

    check-cast v1, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    .local v1, "it":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    const/4 v2, 0x0

    .line 326
    .local v2, "$i$a$-sortedBy-LoaderInstaller$parseLiteLoader$6":I
    invoke-virtual {v1}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getSnapshot()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 101
    .end local v1    # "it":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v2    # "$i$a$-sortedBy-LoaderInstaller$parseLiteLoader$6":I
    check-cast v1, Ljava/lang/Comparable;

    invoke-static {v0, v1}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v0

    return v0
.end method
