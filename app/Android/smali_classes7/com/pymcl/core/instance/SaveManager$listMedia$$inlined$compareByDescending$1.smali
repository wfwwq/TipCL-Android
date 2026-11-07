.class public final Lcom/pymcl/core/instance/SaveManager$listMedia$$inlined$compareByDescending$1;
.super Ljava/lang/Object;
.source "Comparisons.kt"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/core/instance/SaveManager;->listMedia(Lcom/pymcl/core/instance/MediaKind;)Ljava/util/List;
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
    value = "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 Saves.kt\ncom/pymcl/core/instance/SaveManager\n*L\n1#1,325:1\n239#2:326\n*E\n"
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
    .locals 5
    .param p1, "a"    # Ljava/lang/Object;
    .param p2, "b"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 120
    move-object v0, p2

    check-cast v0, Lcom/pymcl/core/instance/MediaFile;

    .local v0, "it":Lcom/pymcl/core/instance/MediaFile;
    const/4 v1, 0x0

    .line 326
    .local v1, "$i$a$-compareByDescending-SaveManager$listMedia$4":I
    invoke-virtual {v0}, Lcom/pymcl/core/instance/MediaFile;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    check-cast v2, Ljava/lang/Comparable;

    .line 120
    .end local v0    # "it":Lcom/pymcl/core/instance/MediaFile;
    .end local v1    # "$i$a$-compareByDescending-SaveManager$listMedia$4":I
    move-object v0, p1

    check-cast v0, Lcom/pymcl/core/instance/MediaFile;

    .restart local v0    # "it":Lcom/pymcl/core/instance/MediaFile;
    const/4 v1, 0x0

    .line 326
    .restart local v1    # "$i$a$-compareByDescending-SaveManager$listMedia$4":I
    invoke-virtual {v0}, Lcom/pymcl/core/instance/MediaFile;->getTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    check-cast v3, Ljava/lang/Comparable;

    .line 120
    .end local v0    # "it":Lcom/pymcl/core/instance/MediaFile;
    .end local v1    # "$i$a$-compareByDescending-SaveManager$listMedia$4":I
    invoke-static {v2, v3}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v0

    return v0
.end method
