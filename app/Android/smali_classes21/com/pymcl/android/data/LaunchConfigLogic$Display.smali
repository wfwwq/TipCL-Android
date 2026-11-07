.class public final Lcom/pymcl/android/data/LaunchConfigLogic$Display;
.super Ljava/lang/Object;
.source "LaunchConfigIO.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/data/LaunchConfigLogic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Display"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010\u0015\u001a\u00020\u00072\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00ca\u0001\u000c\u0008\u001b\u0012\u0008\u0008\u001c\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/pymcl/android/data/LaunchConfigLogic$Display;",
        "",
        "memoryMb",
        "",
        "width",
        "height",
        "versionOverride",
        "",
        "<init>",
        "(IIIZ)V",
        "getMemoryMb",
        "()I",
        "getWidth",
        "getHeight",
        "getVersionOverride",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
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
.field public static final $stable:I


# instance fields
.field private final height:I

.field private final memoryMb:I

.field private final versionOverride:Z

.field private final width:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IIIZ)V
    .locals 0
    .param p1, "memoryMb"    # I
    .param p2, "width"    # I
    .param p3, "height"    # I
    .param p4, "versionOverride"    # Z

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->memoryMb:I

    iput p2, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->width:I

    iput p3, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->height:I

    .line 75
    iput-boolean p4, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->versionOverride:Z

    .line 73
    return-void
.end method

.method public synthetic constructor <init>(IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 73
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 75
    const/4 p4, 0x0

    .line 73
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;-><init>(IIIZ)V

    .line 75
    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/android/data/LaunchConfigLogic$Display;IIIZILjava/lang/Object;)Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->memoryMb:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->width:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->height:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->versionOverride:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->copy(IIIZ)Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->memoryMb:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->width:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->height:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->versionOverride:Z

    return v0
.end method

.method public final copy(IIIZ)Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;-><init>(IIIZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    iget v3, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->memoryMb:I

    iget v4, v1, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->memoryMb:I

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget v3, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->width:I

    iget v4, v1, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->width:I

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget v3, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->height:I

    iget v4, v1, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->height:I

    if-eq v3, v4, :cond_4

    return v2

    :cond_4
    iget-boolean v3, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->versionOverride:Z

    iget-boolean v1, v1, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->versionOverride:Z

    if-eq v3, v1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHeight()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->height:I

    return v0
.end method

.method public final getMemoryMb()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->memoryMb:I

    return v0
.end method

.method public final getVersionOverride()Z
    .locals 1

    .line 75
    iget-boolean v0, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->versionOverride:Z

    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->memoryMb:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->width:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->height:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->versionOverride:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->memoryMb:I

    iget v1, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->width:I

    iget v2, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->height:I

    iget-boolean v3, p0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->versionOverride:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Display(memoryMb="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", width="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", versionOverride="

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
