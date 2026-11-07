.class public final Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;
.super Ljava/lang/Object;
.source "FloatRect.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\n\u00a8\u0006\u001a"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;",
        "",
        "left",
        "",
        "top",
        "width",
        "height",
        "<init>",
        "(FFFF)V",
        "getLeft",
        "()F",
        "getTop",
        "getWidth",
        "getHeight",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "TouchController-Proxy-Client"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final height:F

.field private final left:F

.field private final top:F

.field private final width:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0
    .param p1, "left"    # F
    .param p2, "top"    # F
    .param p3, "width"    # F
    .param p4, "height"    # F

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->left:F

    .line 5
    iput p2, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->top:F

    .line 6
    iput p3, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->width:F

    .line 7
    iput p4, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->height:F

    .line 3
    return-void
.end method

.method public static synthetic copy$default(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;FFFFILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->left:F

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->top:F

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->width:F

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->height:F

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->copy(FFFF)Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->left:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->top:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->width:F

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->height:F

    return v0
.end method

.method public final copy(FFFF)Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;
    .locals 1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    invoke-direct {v0, p1, p2, p3, p4}, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;-><init>(FFFF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    iget v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->left:F

    iget v4, v1, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->left:F

    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-eqz v3, :cond_2

    return v2

    :cond_2
    iget v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->top:F

    iget v4, v1, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->top:F

    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-eqz v3, :cond_3

    return v2

    :cond_3
    iget v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->width:F

    iget v4, v1, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->width:F

    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-eqz v3, :cond_4

    return v2

    :cond_4
    iget v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->height:F

    iget v1, v1, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->height:F

    invoke-static {v3, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHeight()F
    .locals 1

    .line 7
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->height:F

    return v0
.end method

.method public final getLeft()F
    .locals 1

    .line 4
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->left:F

    return v0
.end method

.method public final getTop()F
    .locals 1

    .line 5
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->top:F

    return v0
.end method

.method public final getWidth()F
    .locals 1

    .line 6
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->width:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->left:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->top:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->width:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->height:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FloatRect(left="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->left:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", top="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->top:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->width:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->height:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
