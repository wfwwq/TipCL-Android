.class public final Lcom/pymcl/core/loader/LoaderInstaller$neoforgeVersions$$inlined$compareByDescending$1;
.super Ljava/lang/Object;
.source "Comparisons.kt"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/core/loader/LoaderInstaller;->neoforgeVersions(Ljava/lang/String;)Ljava/util/List;
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
    value = "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 Loaders.kt\ncom/pymcl/core/loader/LoaderInstaller\n*L\n1#1,325:1\n65#2:326\n*E\n"
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


# instance fields
.field final synthetic $receiver$inlined:Lcom/pymcl/core/loader/LoaderInstaller;


# direct methods
.method public constructor <init>(Lcom/pymcl/core/loader/LoaderInstaller;)V
    .locals 0

    iput-object p1, p0, Lcom/pymcl/core/loader/LoaderInstaller$neoforgeVersions$$inlined$compareByDescending$1;->$receiver$inlined:Lcom/pymcl/core/loader/LoaderInstaller;

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

    .line 120
    move-object v0, p2

    check-cast v0, Lcom/pymcl/core/loader/LoaderVersion;

    .local v0, "p0":Lcom/pymcl/core/loader/LoaderVersion;
    const/4 v1, 0x0

    .line 326
    .local v1, "$i$a$-compareByDescending-LoaderInstaller$neoforgeVersions$3":I
    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderInstaller$neoforgeVersions$$inlined$compareByDescending$1;->$receiver$inlined:Lcom/pymcl/core/loader/LoaderInstaller;

    invoke-static {v2, v0}, Lcom/pymcl/core/loader/LoaderInstaller;->access$verKey(Lcom/pymcl/core/loader/LoaderInstaller;Lcom/pymcl/core/loader/LoaderVersion;)Ljava/lang/String;

    move-result-object v0

    .line 120
    .end local v0    # "p0":Lcom/pymcl/core/loader/LoaderVersion;
    .end local v1    # "$i$a$-compareByDescending-LoaderInstaller$neoforgeVersions$3":I
    check-cast v0, Ljava/lang/Comparable;

    move-object v1, p1

    check-cast v1, Lcom/pymcl/core/loader/LoaderVersion;

    .local v1, "p0":Lcom/pymcl/core/loader/LoaderVersion;
    const/4 v2, 0x0

    .line 326
    .local v2, "$i$a$-compareByDescending-LoaderInstaller$neoforgeVersions$3":I
    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderInstaller$neoforgeVersions$$inlined$compareByDescending$1;->$receiver$inlined:Lcom/pymcl/core/loader/LoaderInstaller;

    invoke-static {v3, v1}, Lcom/pymcl/core/loader/LoaderInstaller;->access$verKey(Lcom/pymcl/core/loader/LoaderInstaller;Lcom/pymcl/core/loader/LoaderVersion;)Ljava/lang/String;

    move-result-object v1

    .line 120
    .end local v1    # "p0":Lcom/pymcl/core/loader/LoaderVersion;
    .end local v2    # "$i$a$-compareByDescending-LoaderInstaller$neoforgeVersions$3":I
    check-cast v1, Ljava/lang/Comparable;

    invoke-static {v0, v1}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v0

    return v0
.end method
