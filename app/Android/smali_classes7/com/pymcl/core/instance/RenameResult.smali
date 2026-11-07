.class public final Lcom/pymcl/core/instance/RenameResult;
.super Ljava/lang/Object;
.source "Saves.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/core/instance/RenameResult;",
        "",
        "newDirName",
        "",
        "levelNameUpdated",
        "",
        "<init>",
        "(Ljava/lang/String;Z)V",
        "getNewDirName",
        "()Ljava/lang/String;",
        "getLevelNameUpdated",
        "()Z",
        "component1",
        "component2",
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
.field private final levelNameUpdated:Z

.field private final newDirName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1
    .param p1, "newDirName"    # Ljava/lang/String;
    .param p2, "levelNameUpdated"    # Z

    const-string v0, "newDirName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/instance/RenameResult;->newDirName:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/pymcl/core/instance/RenameResult;->levelNameUpdated:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/core/instance/RenameResult;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/core/instance/RenameResult;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/pymcl/core/instance/RenameResult;->newDirName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/pymcl/core/instance/RenameResult;->levelNameUpdated:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/instance/RenameResult;->copy(Ljava/lang/String;Z)Lcom/pymcl/core/instance/RenameResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/instance/RenameResult;->newDirName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/core/instance/RenameResult;->levelNameUpdated:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Z)Lcom/pymcl/core/instance/RenameResult;
    .locals 1

    const-string v0, "newDirName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/pymcl/core/instance/RenameResult;

    invoke-direct {v0, p1, p2}, Lcom/pymcl/core/instance/RenameResult;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/core/instance/RenameResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/core/instance/RenameResult;

    iget-object v3, p0, Lcom/pymcl/core/instance/RenameResult;->newDirName:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/instance/RenameResult;->newDirName:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-boolean v3, p0, Lcom/pymcl/core/instance/RenameResult;->levelNameUpdated:Z

    iget-boolean v1, v1, Lcom/pymcl/core/instance/RenameResult;->levelNameUpdated:Z

    if-eq v3, v1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getLevelNameUpdated()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lcom/pymcl/core/instance/RenameResult;->levelNameUpdated:Z

    return v0
.end method

.method public final getNewDirName()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/pymcl/core/instance/RenameResult;->newDirName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/pymcl/core/instance/RenameResult;->newDirName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/core/instance/RenameResult;->levelNameUpdated:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/pymcl/core/instance/RenameResult;->newDirName:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/pymcl/core/instance/RenameResult;->levelNameUpdated:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RenameResult(newDirName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", levelNameUpdated="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
