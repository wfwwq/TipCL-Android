.class public final Lcom/pymcl/core/instance/SaveManager$LevelMeta;
.super Ljava/lang/Object;
.source "Saves.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/instance/SaveManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LevelMeta"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u001a\u0008\u0086\u0008\u0018\u00002\u00020\u0001B7\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JH\u0010\u001d\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\t2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010!\u001a\u00020\u0007H\u00d6\u0081\u0004J\n\u0010\"\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u000e\u00a8\u0006#"
    }
    d2 = {
        "Lcom/pymcl/core/instance/SaveManager$LevelMeta;",
        "",
        "levelName",
        "",
        "lastPlayed",
        "",
        "gameType",
        "",
        "hardcore",
        "",
        "versionName",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;)V",
        "getLevelName",
        "()Ljava/lang/String;",
        "getLastPlayed",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getGameType",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getHardcore",
        "()Z",
        "getVersionName",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;)Lcom/pymcl/core/instance/SaveManager$LevelMeta;",
        "equals",
        "other",
        "hashCode",
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
.field private final gameType:Ljava/lang/Integer;

.field private final hardcore:Z

.field private final lastPlayed:Ljava/lang/Long;

.field private final levelName:Ljava/lang/String;

.field private final versionName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;)V
    .locals 0
    .param p1, "levelName"    # Ljava/lang/String;
    .param p2, "lastPlayed"    # Ljava/lang/Long;
    .param p3, "gameType"    # Ljava/lang/Integer;
    .param p4, "hardcore"    # Z
    .param p5, "versionName"    # Ljava/lang/String;

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->levelName:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->lastPlayed:Ljava/lang/Long;

    iput-object p3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->gameType:Ljava/lang/Integer;

    iput-boolean p4, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->hardcore:Z

    iput-object p5, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->versionName:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/core/instance/SaveManager$LevelMeta;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;ILjava/lang/Object;)Lcom/pymcl/core/instance/SaveManager$LevelMeta;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->levelName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->lastPlayed:Ljava/lang/Long;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->gameType:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->hardcore:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->versionName:Ljava/lang/String;

    :cond_4
    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->copy(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;)Lcom/pymcl/core/instance/SaveManager$LevelMeta;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->levelName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->lastPlayed:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->gameType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->hardcore:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->versionName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;)Lcom/pymcl/core/instance/SaveManager$LevelMeta;
    .locals 6

    new-instance v0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/core/instance/SaveManager$LevelMeta;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/core/instance/SaveManager$LevelMeta;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/core/instance/SaveManager$LevelMeta;

    iget-object v3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->levelName:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->levelName:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->lastPlayed:Ljava/lang/Long;

    iget-object v4, v1, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->lastPlayed:Ljava/lang/Long;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->gameType:Ljava/lang/Integer;

    iget-object v4, v1, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->gameType:Ljava/lang/Integer;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-boolean v3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->hardcore:Z

    iget-boolean v4, v1, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->hardcore:Z

    if-eq v3, v4, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->versionName:Ljava/lang/String;

    iget-object v1, v1, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->versionName:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getGameType()Ljava/lang/Integer;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->gameType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getHardcore()Z
    .locals 1

    .line 114
    iget-boolean v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->hardcore:Z

    return v0
.end method

.method public final getLastPlayed()Ljava/lang/Long;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->lastPlayed:Ljava/lang/Long;

    return-object v0
.end method

.method public final getLevelName()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->levelName:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersionName()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->versionName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->levelName:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->levelName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v2, v0, 0x1f

    iget-object v3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->lastPlayed:Ljava/lang/Long;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->lastPlayed:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    mul-int/lit8 v0, v2, 0x1f

    iget-object v3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->gameType:Ljava/lang/Integer;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    iget-object v3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->gameType:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/lit8 v2, v0, 0x1f

    iget-boolean v3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->hardcore:Z

    invoke-static {v3}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v3

    add-int/2addr v2, v3

    mul-int/lit8 v0, v2, 0x1f

    iget-object v3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->versionName:Ljava/lang/String;

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->versionName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->levelName:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->lastPlayed:Ljava/lang/Long;

    iget-object v2, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->gameType:Ljava/lang/Integer;

    iget-boolean v3, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->hardcore:Z

    iget-object v4, p0, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->versionName:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "LevelMeta(levelName="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", lastPlayed="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gameType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hardcore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", versionName="

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
