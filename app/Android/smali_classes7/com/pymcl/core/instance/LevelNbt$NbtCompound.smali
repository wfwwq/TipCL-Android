.class public final Lcom/pymcl/core/instance/LevelNbt$NbtCompound;
.super Ljava/lang/Object;
.source "LevelNbt.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/instance/LevelNbt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NbtCompound"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLevelNbt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelNbt.kt\ncom/pymcl/core/instance/LevelNbt$NbtCompound\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B-\u0012$\u0008\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000c\u001a\u00020\u0004H\u0086\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000c\u001a\u00020\u0004J\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000c\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000c\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004R-\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/pymcl/core/instance/LevelNbt$NbtCompound;",
        "",
        "map",
        "Ljava/util/LinkedHashMap;",
        "",
        "Lcom/pymcl/core/instance/LevelNbt$Tag;",
        "Lkotlin/collections/LinkedHashMap;",
        "<init>",
        "(Ljava/util/LinkedHashMap;)V",
        "getMap",
        "()Ljava/util/LinkedHashMap;",
        "get",
        "k",
        "compound",
        "string",
        "long",
        "",
        "(Ljava/lang/String;)Ljava/lang/Long;",
        "int",
        "",
        "(Ljava/lang/String;)Ljava/lang/Integer;",
        "putString",
        "",
        "v",
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


# instance fields
.field private final map:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/instance/LevelNbt$Tag;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;-><init>(Ljava/util/LinkedHashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/LinkedHashMap;)V
    .locals 1
    .param p1, "map"    # Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/instance/LevelNbt$Tag;",
            ">;)V"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->map:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/LinkedHashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 21
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_0
    invoke-direct {p0, p1}, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;-><init>(Ljava/util/LinkedHashMap;)V

    return-void
.end method


# virtual methods
.method public final compound(Ljava/lang/String;)Lcom/pymcl/core/instance/LevelNbt$NbtCompound;
    .locals 3
    .param p1, "k"    # Ljava/lang/String;

    const-string v0, "k"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->map:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/instance/LevelNbt$Tag;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/pymcl/core/instance/LevelNbt$Tag;->getValue()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;

    :cond_1
    return-object v1
.end method

.method public final get(Ljava/lang/String;)Lcom/pymcl/core/instance/LevelNbt$Tag;
    .locals 1
    .param p1, "k"    # Ljava/lang/String;

    const-string v0, "k"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->map:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/instance/LevelNbt$Tag;

    return-object v0
.end method

.method public final getMap()Ljava/util/LinkedHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/instance/LevelNbt$Tag;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->map:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public final int(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2
    .param p1, "k"    # Ljava/lang/String;

    const-string v0, "k"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0, p1}, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->long(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final long(Ljava/lang/String;)Ljava/lang/Long;
    .locals 8
    .param p1, "k"    # Ljava/lang/String;

    const-string v0, "k"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->map:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/instance/LevelNbt$Tag;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/pymcl/core/instance/LevelNbt$Tag;->getValue()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_1

    check-cast v0, Ljava/lang/Number;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    move-object v2, v0

    .line 90
    .local v2, "it":Ljava/lang/Number;
    const/4 v3, 0x0

    .line 25
    .local v3, "$i$a$-takeIf-LevelNbt$NbtCompound$long$1":I
    iget-object v4, p0, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->map:Ljava/util/LinkedHashMap;

    invoke-virtual {v4, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v4, Lcom/pymcl/core/instance/LevelNbt$Tag;

    invoke-virtual {v4}, Lcom/pymcl/core/instance/LevelNbt$Tag;->getType()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-gt v6, v4, :cond_2

    const/4 v7, 0x7

    if-ge v4, v7, :cond_2

    move v5, v6

    .end local v2    # "it":Ljava/lang/Number;
    .end local v3    # "$i$a$-takeIf-LevelNbt$NbtCompound$long$1":I
    :cond_2
    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :cond_4
    return-object v1
.end method

.method public final putString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "k"    # Ljava/lang/String;
    .param p2, "v"    # Ljava/lang/String;

    const-string v0, "k"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "v"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->map:Ljava/util/LinkedHashMap;

    check-cast v0, Ljava/util/Map;

    new-instance v1, Lcom/pymcl/core/instance/LevelNbt$Tag;

    const/16 v2, 0x8

    invoke-direct {v1, v2, p2}, Lcom/pymcl/core/instance/LevelNbt$Tag;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final string(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "k"    # Ljava/lang/String;

    const-string v0, "k"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->map:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/instance/LevelNbt$Tag;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    move-object v2, v0

    .line 90
    .local v2, "it":Lcom/pymcl/core/instance/LevelNbt$Tag;
    const/4 v3, 0x0

    .line 24
    .local v3, "$i$a$-takeIf-LevelNbt$NbtCompound$string$1":I
    invoke-virtual {v2}, Lcom/pymcl/core/instance/LevelNbt$Tag;->getType()I

    move-result v4

    const/16 v5, 0x8

    if-ne v4, v5, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .end local v2    # "it":Lcom/pymcl/core/instance/LevelNbt$Tag;
    .end local v3    # "$i$a$-takeIf-LevelNbt$NbtCompound$string$1":I
    :goto_0
    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/pymcl/core/instance/LevelNbt$Tag;->getValue()Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_3

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    :cond_3
    return-object v1
.end method
