.class public final Lcom/pymcl/android/ui/theme/PyMotion;
.super Ljava/lang/Object;
.source "Theme.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/ui/theme/PyMotion$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0013\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\u0008\u0087\u0008\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u001d\u001a\u00020\u00032\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001f\u001a\u00020\rH\u00d6\u0081\u0004J\n\u0010 \u001a\u00020!H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0011\u00ca\u0001\u0002\u0008$\u00a8\u0006#"
    }
    d2 = {
        "Lcom/pymcl/android/ui/theme/PyMotion;",
        "",
        "enabled",
        "",
        "scale",
        "",
        "<init>",
        "(ZF)V",
        "getEnabled",
        "()Z",
        "getScale",
        "()F",
        "ms",
        "",
        "base",
        "fast",
        "getFast",
        "()I",
        "med",
        "getMed",
        "page",
        "getPage",
        "countUp",
        "getCountUp",
        "staggerStep",
        "getStaggerStep",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "Companion",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/Immutable;"
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

.field public static final Companion:Lcom/pymcl/android/ui/theme/PyMotion$Companion;

.field private static final EaseInOut:Landroidx/compose/animation/core/CubicBezierEasing;

.field private static final EaseOut:Landroidx/compose/animation/core/CubicBezierEasing;


# instance fields
.field private final enabled:Z

.field private final scale:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/pymcl/android/ui/theme/PyMotion$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/android/ui/theme/PyMotion$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/android/ui/theme/PyMotion;->Companion:Lcom/pymcl/android/ui/theme/PyMotion$Companion;

    .line 168
    new-instance v0, Landroidx/compose/animation/core/CubicBezierEasing;

    const v1, 0x3eb5c28f    # 0.355f

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3e5c28f6    # 0.215f

    const v4, 0x3f1c28f6    # 0.61f

    invoke-direct {v0, v3, v4, v1, v2}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    sput-object v0, Lcom/pymcl/android/ui/theme/PyMotion;->EaseOut:Landroidx/compose/animation/core/CubicBezierEasing;

    new-instance v0, Landroidx/compose/animation/core/CubicBezierEasing;

    const v1, 0x3f03d70a    # 0.515f

    const v2, 0x3f747ae1    # 0.955f

    const v3, 0x3ee8f5c3    # 0.455f

    const v4, 0x3cf5c28f    # 0.03f

    invoke-direct {v0, v3, v4, v1, v2}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    sput-object v0, Lcom/pymcl/android/ui/theme/PyMotion;->EaseInOut:Landroidx/compose/animation/core/CubicBezierEasing;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Lcom/pymcl/android/ui/theme/PyMotion;-><init>(ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZF)V
    .locals 0
    .param p1, "enabled"    # Z
    .param p2, "scale"    # F

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    iput-boolean p1, p0, Lcom/pymcl/android/ui/theme/PyMotion;->enabled:Z

    iput p2, p0, Lcom/pymcl/android/ui/theme/PyMotion;->scale:F

    return-void
.end method

.method public synthetic constructor <init>(ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 161
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/ui/theme/PyMotion;-><init>(ZF)V

    return-void
.end method

.method public static final synthetic access$getEaseInOut$cp()Landroidx/compose/animation/core/CubicBezierEasing;
    .locals 1

    .line 160
    sget-object v0, Lcom/pymcl/android/ui/theme/PyMotion;->EaseInOut:Landroidx/compose/animation/core/CubicBezierEasing;

    return-object v0
.end method

.method public static final synthetic access$getEaseOut$cp()Landroidx/compose/animation/core/CubicBezierEasing;
    .locals 1

    .line 160
    sget-object v0, Lcom/pymcl/android/ui/theme/PyMotion;->EaseOut:Landroidx/compose/animation/core/CubicBezierEasing;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/pymcl/android/ui/theme/PyMotion;ZFILjava/lang/Object;)Lcom/pymcl/android/ui/theme/PyMotion;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lcom/pymcl/android/ui/theme/PyMotion;->enabled:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/pymcl/android/ui/theme/PyMotion;->scale:F

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/theme/PyMotion;->copy(ZF)Lcom/pymcl/android/ui/theme/PyMotion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/theme/PyMotion;->enabled:Z

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/theme/PyMotion;->scale:F

    return v0
.end method

.method public final copy(ZF)Lcom/pymcl/android/ui/theme/PyMotion;
    .locals 1

    new-instance v0, Lcom/pymcl/android/ui/theme/PyMotion;

    invoke-direct {v0, p1, p2}, Lcom/pymcl/android/ui/theme/PyMotion;-><init>(ZF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/android/ui/theme/PyMotion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/android/ui/theme/PyMotion;

    iget-boolean v3, p0, Lcom/pymcl/android/ui/theme/PyMotion;->enabled:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/theme/PyMotion;->enabled:Z

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget v3, p0, Lcom/pymcl/android/ui/theme/PyMotion;->scale:F

    iget v1, v1, Lcom/pymcl/android/ui/theme/PyMotion;->scale:F

    invoke-static {v3, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCountUp()I
    .locals 1

    .line 166
    const/16 v0, 0x26c

    invoke-virtual {p0, v0}, Lcom/pymcl/android/ui/theme/PyMotion;->ms(I)I

    move-result v0

    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    .line 161
    iget-boolean v0, p0, Lcom/pymcl/android/ui/theme/PyMotion;->enabled:Z

    return v0
.end method

.method public final getFast()I
    .locals 1

    .line 163
    const/16 v0, 0x82

    invoke-virtual {p0, v0}, Lcom/pymcl/android/ui/theme/PyMotion;->ms(I)I

    move-result v0

    return v0
.end method

.method public final getMed()I
    .locals 1

    .line 164
    const/16 v0, 0xdc

    invoke-virtual {p0, v0}, Lcom/pymcl/android/ui/theme/PyMotion;->ms(I)I

    move-result v0

    return v0
.end method

.method public final getPage()I
    .locals 1

    .line 165
    const/16 v0, 0xf0

    invoke-virtual {p0, v0}, Lcom/pymcl/android/ui/theme/PyMotion;->ms(I)I

    move-result v0

    return v0
.end method

.method public final getScale()F
    .locals 1

    .line 161
    iget v0, p0, Lcom/pymcl/android/ui/theme/PyMotion;->scale:F

    return v0
.end method

.method public final getStaggerStep()I
    .locals 1

    .line 167
    const/16 v0, 0x1a

    invoke-virtual {p0, v0}, Lcom/pymcl/android/ui/theme/PyMotion;->ms(I)I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/pymcl/android/ui/theme/PyMotion;->enabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/theme/PyMotion;->scale:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public final ms(I)I
    .locals 2
    .param p1, "base"    # I

    .line 162
    iget-boolean v0, p0, Lcom/pymcl/android/ui/theme/PyMotion;->enabled:Z

    if-eqz v0, :cond_0

    int-to-float v0, p1

    iget v1, p0, Lcom/pymcl/android/ui/theme/PyMotion;->scale:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Lcom/pymcl/android/ui/theme/PyMotion;->enabled:Z

    iget v1, p0, Lcom/pymcl/android/ui/theme/PyMotion;->scale:F

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PyMotion(enabled="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", scale="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
