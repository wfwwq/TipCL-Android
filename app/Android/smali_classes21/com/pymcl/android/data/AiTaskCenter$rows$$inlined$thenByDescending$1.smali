.class public final Lcom/pymcl/android/data/AiTaskCenter$rows$$inlined$thenByDescending$1;
.super Ljava/lang/Object;
.source "Comparisons.kt"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/AiTaskCenter;->rows(Ljava/util/List;Ljava/util/Map;JLjava/util/Locale;Ljava/util/TimeZone;)Ljava/util/List;
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
    value = "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n+ 2 AiTaskCenter.kt\ncom/pymcl/android/data/AiTaskCenter\n*L\n1#1,325:1\n50#2:326\n*E\n"
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
.field final synthetic $this_thenByDescending:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    iput-object p1, p0, Lcom/pymcl/android/data/AiTaskCenter$rows$$inlined$thenByDescending$1;->$this_thenByDescending:Ljava/util/Comparator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6
    .param p1, "a"    # Ljava/lang/Object;
    .param p2, "b"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 169
    iget-object v0, p0, Lcom/pymcl/android/data/AiTaskCenter$rows$$inlined$thenByDescending$1;->$this_thenByDescending:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    .line 170
    .local v0, "previousCompare":I
    if-eqz v0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move-object v1, p2

    check-cast v1, Lcom/pymcl/ai/BgTaskInfo;

    .local v1, "it\\1":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v2, 0x0

    .line 326
    .local v2, "$i$a$-thenByDescending-AiTaskCenter$rows$2\\1\\170\\0":I
    invoke-virtual {v1}, Lcom/pymcl/ai/BgTaskInfo;->getStartedAt()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    check-cast v3, Ljava/lang/Comparable;

    .line 170
    .end local v1    # "it\\1":Lcom/pymcl/ai/BgTaskInfo;
    .end local v2    # "$i$a$-thenByDescending-AiTaskCenter$rows$2\\1\\170\\0":I
    move-object v1, p1

    check-cast v1, Lcom/pymcl/ai/BgTaskInfo;

    .local v1, "it\\2":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v2, 0x0

    .line 326
    .local v2, "$i$a$-thenByDescending-AiTaskCenter$rows$2\\2\\170\\0":I
    invoke-virtual {v1}, Lcom/pymcl/ai/BgTaskInfo;->getStartedAt()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Comparable;

    .line 170
    .end local v1    # "it\\2":Lcom/pymcl/ai/BgTaskInfo;
    .end local v2    # "$i$a$-thenByDescending-AiTaskCenter$rows$2\\2\\170\\0":I
    invoke-static {v3, v4}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v1

    :goto_0
    return v1
.end method
