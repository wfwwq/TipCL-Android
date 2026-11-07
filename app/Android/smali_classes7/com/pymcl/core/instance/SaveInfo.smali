.class public final Lcom/pymcl/core/instance/SaveInfo;
.super Ljava/lang/Object;
.source "Saves.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008)\u0008\u0086\u0008\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010\'\u001a\u00020\nH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\nH\u00c6\u0003Jx\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0014\u0010/\u001a\u00020\n2\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00101\u001a\u00020\u0008H\u00d6\u0081\u0004J\n\u00102\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0013R\u0011\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001bR\u0011\u0010!\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u0013\u00a8\u00063"
    }
    d2 = {
        "Lcom/pymcl/core/instance/SaveInfo;",
        "",
        "dirName",
        "",
        "levelName",
        "lastPlayed",
        "",
        "gameMode",
        "",
        "hardcore",
        "",
        "versionName",
        "sizeBytes",
        "iconPath",
        "path",
        "readOk",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V",
        "getDirName",
        "()Ljava/lang/String;",
        "getLevelName",
        "getLastPlayed",
        "()J",
        "getGameMode",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getHardcore",
        "()Z",
        "getVersionName",
        "getSizeBytes",
        "getIconPath",
        "getPath",
        "getReadOk",
        "modeLabel",
        "getModeLabel",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)Lcom/pymcl/core/instance/SaveInfo;",
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
.field private final dirName:Ljava/lang/String;

.field private final gameMode:Ljava/lang/Integer;

.field private final hardcore:Z

.field private final iconPath:Ljava/lang/String;

.field private final lastPlayed:J

.field private final levelName:Ljava/lang/String;

.field private final path:Ljava/lang/String;

.field private final readOk:Z

.field private final sizeBytes:J

.field private final versionName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V
    .locals 1
    .param p1, "dirName"    # Ljava/lang/String;
    .param p2, "levelName"    # Ljava/lang/String;
    .param p3, "lastPlayed"    # J
    .param p5, "gameMode"    # Ljava/lang/Integer;
    .param p6, "hardcore"    # Z
    .param p7, "versionName"    # Ljava/lang/String;
    .param p8, "sizeBytes"    # J
    .param p10, "iconPath"    # Ljava/lang/String;
    .param p11, "path"    # Ljava/lang/String;
    .param p12, "readOk"    # Z

    const-string v0, "dirName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "levelName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/pymcl/core/instance/SaveInfo;->dirName:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/core/instance/SaveInfo;->levelName:Ljava/lang/String;

    iput-wide p3, p0, Lcom/pymcl/core/instance/SaveInfo;->lastPlayed:J

    iput-object p5, p0, Lcom/pymcl/core/instance/SaveInfo;->gameMode:Ljava/lang/Integer;

    iput-boolean p6, p0, Lcom/pymcl/core/instance/SaveInfo;->hardcore:Z

    .line 18
    iput-object p7, p0, Lcom/pymcl/core/instance/SaveInfo;->versionName:Ljava/lang/String;

    iput-wide p8, p0, Lcom/pymcl/core/instance/SaveInfo;->sizeBytes:J

    iput-object p10, p0, Lcom/pymcl/core/instance/SaveInfo;->iconPath:Ljava/lang/String;

    iput-object p11, p0, Lcom/pymcl/core/instance/SaveInfo;->path:Ljava/lang/String;

    iput-boolean p12, p0, Lcom/pymcl/core/instance/SaveInfo;->readOk:Z

    .line 16
    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/core/instance/SaveInfo;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/core/instance/SaveInfo;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/pymcl/core/instance/SaveInfo;->dirName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/pymcl/core/instance/SaveInfo;->levelName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-wide p3, p0, Lcom/pymcl/core/instance/SaveInfo;->lastPlayed:J

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p5, p0, Lcom/pymcl/core/instance/SaveInfo;->gameMode:Ljava/lang/Integer;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-boolean p6, p0, Lcom/pymcl/core/instance/SaveInfo;->hardcore:Z

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p7, p0, Lcom/pymcl/core/instance/SaveInfo;->versionName:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-wide p8, p0, Lcom/pymcl/core/instance/SaveInfo;->sizeBytes:J

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p10, p0, Lcom/pymcl/core/instance/SaveInfo;->iconPath:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p11, p0, Lcom/pymcl/core/instance/SaveInfo;->path:Ljava/lang/String;

    :cond_8
    and-int/lit16 p13, p13, 0x200

    if-eqz p13, :cond_9

    iget-boolean p12, p0, Lcom/pymcl/core/instance/SaveInfo;->readOk:Z

    :cond_9
    move-object p13, p11

    move p14, p12

    move-object p12, p10

    move-wide p10, p8

    move p8, p6

    move-object p9, p7

    move-object p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/pymcl/core/instance/SaveInfo;->copy(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)Lcom/pymcl/core/instance/SaveInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->dirName:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/core/instance/SaveInfo;->readOk:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->levelName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/pymcl/core/instance/SaveInfo;->lastPlayed:J

    return-wide v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->gameMode:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/core/instance/SaveInfo;->hardcore:Z

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->versionName:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lcom/pymcl/core/instance/SaveInfo;->sizeBytes:J

    return-wide v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->iconPath:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)Lcom/pymcl/core/instance/SaveInfo;
    .locals 14

    const-string v0, "dirName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "levelName"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/pymcl/core/instance/SaveInfo;

    move-object v2, p1

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-wide/from16 v9, p8

    move-object/from16 v11, p10

    move/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/pymcl/core/instance/SaveInfo;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/core/instance/SaveInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/core/instance/SaveInfo;

    iget-object v3, p0, Lcom/pymcl/core/instance/SaveInfo;->dirName:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/instance/SaveInfo;->dirName:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/pymcl/core/instance/SaveInfo;->levelName:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/instance/SaveInfo;->levelName:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/pymcl/core/instance/SaveInfo;->lastPlayed:J

    iget-wide v5, v1, Lcom/pymcl/core/instance/SaveInfo;->lastPlayed:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_4

    return v2

    :cond_4
    iget-object v3, p0, Lcom/pymcl/core/instance/SaveInfo;->gameMode:Ljava/lang/Integer;

    iget-object v4, v1, Lcom/pymcl/core/instance/SaveInfo;->gameMode:Ljava/lang/Integer;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    return v2

    :cond_5
    iget-boolean v3, p0, Lcom/pymcl/core/instance/SaveInfo;->hardcore:Z

    iget-boolean v4, v1, Lcom/pymcl/core/instance/SaveInfo;->hardcore:Z

    if-eq v3, v4, :cond_6

    return v2

    :cond_6
    iget-object v3, p0, Lcom/pymcl/core/instance/SaveInfo;->versionName:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/instance/SaveInfo;->versionName:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/pymcl/core/instance/SaveInfo;->sizeBytes:J

    iget-wide v5, v1, Lcom/pymcl/core/instance/SaveInfo;->sizeBytes:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_8

    return v2

    :cond_8
    iget-object v3, p0, Lcom/pymcl/core/instance/SaveInfo;->iconPath:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/instance/SaveInfo;->iconPath:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    return v2

    :cond_9
    iget-object v3, p0, Lcom/pymcl/core/instance/SaveInfo;->path:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/instance/SaveInfo;->path:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    return v2

    :cond_a
    iget-boolean v3, p0, Lcom/pymcl/core/instance/SaveInfo;->readOk:Z

    iget-boolean v1, v1, Lcom/pymcl/core/instance/SaveInfo;->readOk:Z

    if-eq v3, v1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getDirName()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->dirName:Ljava/lang/String;

    return-object v0
.end method

.method public final getGameMode()Ljava/lang/Integer;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->gameMode:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getHardcore()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/pymcl/core/instance/SaveInfo;->hardcore:Z

    return v0
.end method

.method public final getIconPath()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->iconPath:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastPlayed()J
    .locals 2

    .line 17
    iget-wide v0, p0, Lcom/pymcl/core/instance/SaveInfo;->lastPlayed:J

    return-wide v0
.end method

.method public final getLevelName()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->levelName:Ljava/lang/String;

    return-object v0
.end method

.method public final getModeLabel()Ljava/lang/String;
    .locals 3

    .line 21
    iget-boolean v0, p0, Lcom/pymcl/core/instance/SaveInfo;->hardcore:Z

    if-eqz v0, :cond_0

    const-string v0, "\u6781\u9650"

    goto :goto_4

    :cond_0
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->gameMode:Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_2

    const-string v0, "\u751f\u5b58"

    goto :goto_4

    :cond_2
    :goto_0
    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    const-string v0, "\u521b\u9020"

    goto :goto_4

    :cond_4
    :goto_1
    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_6

    const-string v0, "\u5192\u9669"

    goto :goto_4

    :cond_6
    :goto_2
    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_8

    const-string v0, "\u65c1\u89c2"

    goto :goto_4

    :cond_8
    :goto_3
    const-string v0, ""

    :goto_4
    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final getReadOk()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/pymcl/core/instance/SaveInfo;->readOk:Z

    return v0
.end method

.method public final getSizeBytes()J
    .locals 2

    .line 18
    iget-wide v0, p0, Lcom/pymcl/core/instance/SaveInfo;->sizeBytes:J

    return-wide v0
.end method

.method public final getVersionName()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->versionName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->dirName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/instance/SaveInfo;->levelName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-wide v2, p0, Lcom/pymcl/core/instance/SaveInfo;->lastPlayed:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/instance/SaveInfo;->gameMode:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/pymcl/core/instance/SaveInfo;->gameMode:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/core/instance/SaveInfo;->hardcore:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/instance/SaveInfo;->versionName:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/pymcl/core/instance/SaveInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-wide v4, p0, Lcom/pymcl/core/instance/SaveInfo;->sizeBytes:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/instance/SaveInfo;->iconPath:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lcom/pymcl/core/instance/SaveInfo;->iconPath:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v1, v3

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/instance/SaveInfo;->path:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/core/instance/SaveInfo;->readOk:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveInfo;->dirName:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/core/instance/SaveInfo;->levelName:Ljava/lang/String;

    iget-wide v2, p0, Lcom/pymcl/core/instance/SaveInfo;->lastPlayed:J

    iget-object v4, p0, Lcom/pymcl/core/instance/SaveInfo;->gameMode:Ljava/lang/Integer;

    iget-boolean v5, p0, Lcom/pymcl/core/instance/SaveInfo;->hardcore:Z

    iget-object v6, p0, Lcom/pymcl/core/instance/SaveInfo;->versionName:Ljava/lang/String;

    iget-wide v7, p0, Lcom/pymcl/core/instance/SaveInfo;->sizeBytes:J

    iget-object v9, p0, Lcom/pymcl/core/instance/SaveInfo;->iconPath:Ljava/lang/String;

    iget-object v10, p0, Lcom/pymcl/core/instance/SaveInfo;->path:Ljava/lang/String;

    iget-boolean v11, p0, Lcom/pymcl/core/instance/SaveInfo;->readOk:Z

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "SaveInfo(dirName="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v12, ", levelName="

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastPlayed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gameMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hardcore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", versionName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sizeBytes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", path="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", readOk="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
