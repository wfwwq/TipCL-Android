.class public final Lcom/pymcl/core/mods/ModUpdateSchedule;
.super Ljava/lang/Object;
.source "ContentExport.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nContentExport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentExport.kt\ncom/pymcl/core/mods/ModUpdateSchedule\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,65:1\n635#2,7:66\n*S KotlinDebug\n*F\n+ 1 ContentExport.kt\ncom/pymcl/core/mods/ModUpdateSchedule\n*L\n63#1:66,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005J@\u0010\u000c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H\u00100\u000e0\r\"\u0004\u0008\u0000\u0010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H\u00100\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/pymcl/core/mods/ModUpdateSchedule;",
        "",
        "<init>",
        "()V",
        "DEFAULT_INTERVAL",
        "",
        "due",
        "",
        "lastMs",
        "nowMs",
        "intervalMs",
        "delayUntilNext",
        "pick",
        "",
        "Lkotlin/Pair;",
        "",
        "T",
        "updates",
        "",
        "chosen",
        "",
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
.field public static final DEFAULT_INTERVAL:J = 0x1499700L

.field public static final INSTANCE:Lcom/pymcl/core/mods/ModUpdateSchedule;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/mods/ModUpdateSchedule;

    invoke-direct {v0}, Lcom/pymcl/core/mods/ModUpdateSchedule;-><init>()V

    sput-object v0, Lcom/pymcl/core/mods/ModUpdateSchedule;->INSTANCE:Lcom/pymcl/core/mods/ModUpdateSchedule;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic delayUntilNext$default(Lcom/pymcl/core/mods/ModUpdateSchedule;JJJILjava/lang/Object;)J
    .locals 7

    .line 61
    and-int/lit8 p7, p7, 0x4

    if-eqz p7, :cond_0

    const-wide/32 p5, 0x1499700

    :cond_0
    move-wide v5, p5

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-virtual/range {v0 .. v6}, Lcom/pymcl/core/mods/ModUpdateSchedule;->delayUntilNext(JJJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic due$default(Lcom/pymcl/core/mods/ModUpdateSchedule;JJJILjava/lang/Object;)Z
    .locals 7

    .line 59
    and-int/lit8 p7, p7, 0x4

    if-eqz p7, :cond_0

    const-wide/32 p5, 0x1499700

    :cond_0
    move-wide v5, p5

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-virtual/range {v0 .. v6}, Lcom/pymcl/core/mods/ModUpdateSchedule;->due(JJJ)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final delayUntilNext(JJJ)J
    .locals 2
    .param p1, "lastMs"    # J
    .param p3, "nowMs"    # J
    .param p5, "intervalMs"    # J

    .line 61
    invoke-virtual/range {p0 .. p6}, Lcom/pymcl/core/mods/ModUpdateSchedule;->due(JJJ)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    sub-long v0, p3, p1

    sub-long v0, p5, v0

    :goto_0
    return-wide v0
.end method

.method public final due(JJJ)Z
    .locals 2
    .param p1, "lastMs"    # J
    .param p3, "nowMs"    # J
    .param p5, "intervalMs"    # J

    .line 59
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    cmp-long v0, p3, p1

    if-ltz v0, :cond_1

    sub-long v0, p3, p1

    cmp-long v0, v0, p5

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final pick(Ljava/util/Map;Ljava/util/Set;)Ljava/util/List;
    .locals 7
    .param p1, "updates"    # Ljava/util/Map;
    .param p2, "chosen"    # Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+TT;>;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "TT;>;>;"
        }
    .end annotation

    const-string v0, "updates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chosen"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    move-object v0, p1

    .local v0, "$this$filterKeys$iv":Ljava/util/Map;
    const/4 v1, 0x0

    .line 66
    .local v1, "$i$f$filterKeys":I
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 67
    .local v2, "result$iv":Ljava/util/LinkedHashMap;
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 68
    .local v4, "entry$iv":Ljava/util/Map$Entry;
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .local v5, "it":Ljava/lang/String;
    const/4 v6, 0x0

    .line 63
    .local v6, "$i$a$-filterKeys-ModUpdateSchedule$pick$1":I
    invoke-interface {p2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    .line 68
    .end local v5    # "it":Ljava/lang/String;
    .end local v6    # "$i$a$-filterKeys-ModUpdateSchedule$pick$1":I
    if-eqz v5, :cond_0

    .line 69
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 72
    .end local v4    # "entry$iv":Ljava/util/Map$Entry;
    :cond_1
    move-object v0, v2

    check-cast v0, Ljava/util/Map;

    .line 63
    .end local v0    # "$this$filterKeys$iv":Ljava/util/Map;
    .end local v1    # "$i$f$filterKeys":I
    .end local v2    # "result$iv":Ljava/util/LinkedHashMap;
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toList(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
