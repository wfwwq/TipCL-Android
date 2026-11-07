.class public final Lcom/pymcl/core/mods/ModDep;
.super Ljava/lang/Object;
.source "ModConflicts.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0019\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J=\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u001d\u001a\u00020\u00062\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001f\u001a\u00020 H\u00d6\u0081\u0004J\n\u0010!\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000cR\u0011\u0010\u0015\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u000c\u00a8\u0006\""
    }
    d2 = {
        "Lcom/pymcl/core/mods/ModDep;",
        "",
        "modId",
        "",
        "range",
        "mandatory",
        "",
        "maven",
        "kind",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/String;)V",
        "getModId",
        "()Ljava/lang/String;",
        "getRange",
        "()Ljava/lang/Object;",
        "getMandatory",
        "()Z",
        "getMaven",
        "getKind",
        "accepts",
        "version",
        "rangeText",
        "getRangeText",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final kind:Ljava/lang/String;

.field private final mandatory:Z

.field private final maven:Z

.field private final modId:Ljava/lang/String;

.field private final range:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/String;)V
    .locals 1
    .param p1, "modId"    # Ljava/lang/String;
    .param p2, "range"    # Ljava/lang/Object;
    .param p3, "mandatory"    # Z
    .param p4, "maven"    # Z
    .param p5, "kind"    # Ljava/lang/String;

    const-string v0, "modId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/mods/ModDep;->modId:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    iput-boolean p3, p0, Lcom/pymcl/core/mods/ModDep;->mandatory:Z

    iput-boolean p4, p0, Lcom/pymcl/core/mods/ModDep;->maven:Z

    iput-object p5, p0, Lcom/pymcl/core/mods/ModDep;->kind:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    .line 122
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const-string p2, "*"

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x1

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    const/4 p4, 0x0

    :cond_2
    move v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    const-string p5, "depends"

    :cond_3
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/core/mods/ModDep;-><init>(Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/core/mods/ModDep;Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/pymcl/core/mods/ModDep;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/pymcl/core/mods/ModDep;->modId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Lcom/pymcl/core/mods/ModDep;->mandatory:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lcom/pymcl/core/mods/ModDep;->maven:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/pymcl/core/mods/ModDep;->kind:Ljava/lang/String;

    :cond_4
    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/pymcl/core/mods/ModDep;->copy(Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/String;)Lcom/pymcl/core/mods/ModDep;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final accepts(Ljava/lang/String;)Z
    .locals 2
    .param p1, "version"    # Ljava/lang/String;

    const-string v0, "version"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    iget-boolean v0, p0, Lcom/pymcl/core/mods/ModDep;->maven:Z

    if-eqz v0, :cond_2

    sget-object v0, Lcom/pymcl/core/mods/MavenRange;->Companion:Lcom/pymcl/core/mods/MavenRange$Companion;

    iget-object v1, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, ""

    :cond_1
    invoke-virtual {v0, v1}, Lcom/pymcl/core/mods/MavenRange$Companion;->parse(Ljava/lang/String;)Lcom/pymcl/core/mods/MavenRange;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/pymcl/core/mods/MavenRange;->contains(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/pymcl/core/mods/FabricPredicate;->INSTANCE:Lcom/pymcl/core/mods/FabricPredicate;

    iget-object v1, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lcom/pymcl/core/mods/FabricPredicate;->matches(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    :goto_0
    return v0
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/mods/ModDep;->modId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/core/mods/ModDep;->mandatory:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/core/mods/ModDep;->maven:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/mods/ModDep;->kind:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/String;)Lcom/pymcl/core/mods/ModDep;
    .locals 7

    const-string v0, "modId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/pymcl/core/mods/ModDep;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/pymcl/core/mods/ModDep;-><init>(Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/core/mods/ModDep;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/core/mods/ModDep;

    iget-object v3, p0, Lcom/pymcl/core/mods/ModDep;->modId:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/mods/ModDep;->modId:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    iget-object v4, v1, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-boolean v3, p0, Lcom/pymcl/core/mods/ModDep;->mandatory:Z

    iget-boolean v4, v1, Lcom/pymcl/core/mods/ModDep;->mandatory:Z

    if-eq v3, v4, :cond_4

    return v2

    :cond_4
    iget-boolean v3, p0, Lcom/pymcl/core/mods/ModDep;->maven:Z

    iget-boolean v4, v1, Lcom/pymcl/core/mods/ModDep;->maven:Z

    if-eq v3, v4, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Lcom/pymcl/core/mods/ModDep;->kind:Ljava/lang/String;

    iget-object v1, v1, Lcom/pymcl/core/mods/ModDep;->kind:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getKind()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/pymcl/core/mods/ModDep;->kind:Ljava/lang/String;

    return-object v0
.end method

.method public final getMandatory()Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Lcom/pymcl/core/mods/ModDep;->mandatory:Z

    return v0
.end method

.method public final getMaven()Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Lcom/pymcl/core/mods/ModDep;->maven:Z

    return v0
.end method

.method public final getModId()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/pymcl/core/mods/ModDep;->modId:Ljava/lang/String;

    return-object v0
.end method

.method public final getRange()Ljava/lang/Object;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    return-object v0
.end method

.method public final getRangeText()Ljava/lang/String;
    .locals 10

    .line 124
    iget-object v0, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    const-string v0, " || "

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const-string v0, "*"

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/pymcl/core/mods/ModDep;->modId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/core/mods/ModDep;->mandatory:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/core/mods/ModDep;->maven:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/mods/ModDep;->kind:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/pymcl/core/mods/ModDep;->modId:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/core/mods/ModDep;->range:Ljava/lang/Object;

    iget-boolean v2, p0, Lcom/pymcl/core/mods/ModDep;->mandatory:Z

    iget-boolean v3, p0, Lcom/pymcl/core/mods/ModDep;->maven:Z

    iget-object v4, p0, Lcom/pymcl/core/mods/ModDep;->kind:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ModDep(modId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", range="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mandatory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maven="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", kind="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
