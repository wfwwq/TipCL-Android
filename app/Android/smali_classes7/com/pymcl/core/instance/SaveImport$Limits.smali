.class public final Lcom/pymcl/core/instance/SaveImport$Limits;
.super Ljava/lang/Object;
.source "SaveImport.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/instance/SaveImport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Limits"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/pymcl/core/instance/SaveImport$Limits;",
        "",
        "maxEntries",
        "",
        "maxBytes",
        "",
        "<init>",
        "(IJ)V",
        "getMaxEntries",
        "()I",
        "getMaxBytes",
        "()J",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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


# instance fields
.field private final maxBytes:J

.field private final maxEntries:I


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/core/instance/SaveImport$Limits;-><init>(IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 0
    .param p1, "maxEntries"    # I
    .param p2, "maxBytes"    # J

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxEntries:I

    iput-wide p2, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxBytes:J

    return-void
.end method

.method public synthetic constructor <init>(IJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 21
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const p1, 0x30d40

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const-wide p2, 0x400000000L

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/core/instance/SaveImport$Limits;-><init>(IJ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/core/instance/SaveImport$Limits;IJILjava/lang/Object;)Lcom/pymcl/core/instance/SaveImport$Limits;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxEntries:I

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-wide p2, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxBytes:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/core/instance/SaveImport$Limits;->copy(IJ)Lcom/pymcl/core/instance/SaveImport$Limits;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxEntries:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxBytes:J

    return-wide v0
.end method

.method public final copy(IJ)Lcom/pymcl/core/instance/SaveImport$Limits;
    .locals 1

    new-instance v0, Lcom/pymcl/core/instance/SaveImport$Limits;

    invoke-direct {v0, p1, p2, p3}, Lcom/pymcl/core/instance/SaveImport$Limits;-><init>(IJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/core/instance/SaveImport$Limits;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/core/instance/SaveImport$Limits;

    iget v3, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxEntries:I

    iget v4, v1, Lcom/pymcl/core/instance/SaveImport$Limits;->maxEntries:I

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxBytes:J

    iget-wide v5, v1, Lcom/pymcl/core/instance/SaveImport$Limits;->maxBytes:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getMaxBytes()J
    .locals 2

    .line 21
    iget-wide v0, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxBytes:J

    return-wide v0
.end method

.method public final getMaxEntries()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxEntries:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxEntries:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v2, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxBytes:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxEntries:I

    iget-wide v1, p0, Lcom/pymcl/core/instance/SaveImport$Limits;->maxBytes:J

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Limits(maxEntries="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", maxBytes="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
