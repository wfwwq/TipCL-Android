.class final Lcom/pymcl/core/mods/MavenRange$Interval;
.super Ljava/lang/Object;
.source "ModConflicts.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/mods/MavenRange;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Interval"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0014\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0082\u0008\u0018\u00002\u00020\u0001B+\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J5\u0010\u0016\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u0017\u001a\u00020\u00052\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\r\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/pymcl/core/mods/MavenRange$Interval;",
        "",
        "low",
        "",
        "lowInc",
        "",
        "high",
        "highInc",
        "<init>",
        "(Ljava/lang/String;ZLjava/lang/String;Z)V",
        "getLow",
        "()Ljava/lang/String;",
        "getLowInc",
        "()Z",
        "getHigh",
        "getHighInc",
        "contains",
        "v",
        "component1",
        "component2",
        "component3",
        "component4",
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
.field private final high:Ljava/lang/String;

.field private final highInc:Z

.field private final low:Ljava/lang/String;

.field private final lowInc:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;Z)V
    .locals 0
    .param p1, "low"    # Ljava/lang/String;
    .param p2, "lowInc"    # Z
    .param p3, "high"    # Ljava/lang/String;
    .param p4, "highInc"    # Z

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->low:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->lowInc:Z

    iput-object p3, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->high:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->highInc:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/core/mods/MavenRange$Interval;Ljava/lang/String;ZLjava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/core/mods/MavenRange$Interval;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->low:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->lowInc:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->high:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->highInc:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/core/mods/MavenRange$Interval;->copy(Ljava/lang/String;ZLjava/lang/String;Z)Lcom/pymcl/core/mods/MavenRange$Interval;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->low:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->lowInc:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->high:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->highInc:Z

    return v0
.end method

.method public final contains(Ljava/lang/String;)Z
    .locals 3
    .param p1, "v"    # Ljava/lang/String;

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->low:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/pymcl/core/mods/ModVersion;->INSTANCE:Lcom/pymcl/core/mods/ModVersion;

    iget-object v2, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->low:Ljava/lang/String;

    invoke-virtual {v0, p1, v2}, Lcom/pymcl/core/mods/ModVersion;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .local v0, "c":I
    if-ltz v0, :cond_0

    if-nez v0, :cond_1

    iget-boolean v2, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->lowInc:Z

    if-nez v2, :cond_1

    :cond_0
    return v1

    .line 52
    .end local v0    # "c":I
    :cond_1
    iget-object v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->high:Ljava/lang/String;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/pymcl/core/mods/ModVersion;->INSTANCE:Lcom/pymcl/core/mods/ModVersion;

    iget-object v2, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->high:Ljava/lang/String;

    invoke-virtual {v0, p1, v2}, Lcom/pymcl/core/mods/ModVersion;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .restart local v0    # "c":I
    if-gtz v0, :cond_2

    if-nez v0, :cond_3

    iget-boolean v2, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->highInc:Z

    if-nez v2, :cond_3

    :cond_2
    return v1

    .line 53
    .end local v0    # "c":I
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public final copy(Ljava/lang/String;ZLjava/lang/String;Z)Lcom/pymcl/core/mods/MavenRange$Interval;
    .locals 1

    new-instance v0, Lcom/pymcl/core/mods/MavenRange$Interval;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/pymcl/core/mods/MavenRange$Interval;-><init>(Ljava/lang/String;ZLjava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/core/mods/MavenRange$Interval;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/core/mods/MavenRange$Interval;

    iget-object v3, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->low:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/mods/MavenRange$Interval;->low:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-boolean v3, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->lowInc:Z

    iget-boolean v4, v1, Lcom/pymcl/core/mods/MavenRange$Interval;->lowInc:Z

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->high:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/mods/MavenRange$Interval;->high:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-boolean v3, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->highInc:Z

    iget-boolean v1, v1, Lcom/pymcl/core/mods/MavenRange$Interval;->highInc:Z

    if-eq v3, v1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHigh()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->high:Ljava/lang/String;

    return-object v0
.end method

.method public final getHighInc()Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->highInc:Z

    return v0
.end method

.method public final getLow()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->low:Ljava/lang/String;

    return-object v0
.end method

.method public final getLowInc()Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->lowInc:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->low:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->low:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v2, v0, 0x1f

    iget-boolean v3, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->lowInc:Z

    invoke-static {v3}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v3

    add-int/2addr v2, v3

    mul-int/lit8 v0, v2, 0x1f

    iget-object v3, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->high:Ljava/lang/String;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->high:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->highInc:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->low:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->lowInc:Z

    iget-object v2, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->high:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/pymcl/core/mods/MavenRange$Interval;->highInc:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Interval(low="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", lowInc="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", high="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", highInc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
