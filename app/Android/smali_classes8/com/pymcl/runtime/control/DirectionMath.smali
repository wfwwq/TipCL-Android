.class public final Lcom/pymcl/runtime/control/DirectionMath;
.super Ljava/lang/Object;
.source "ControlViews.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/pymcl/runtime/control/DirectionMath;",
        "",
        "<init>",
        "()V",
        "directions",
        "",
        "nx",
        "",
        "ny",
        "deadzone",
        "PyMCL-Android:runtime_debug"
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
.field public static final INSTANCE:Lcom/pymcl/runtime/control/DirectionMath;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/control/DirectionMath;

    invoke-direct {v0}, Lcom/pymcl/runtime/control/DirectionMath;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/control/DirectionMath;->INSTANCE:Lcom/pymcl/runtime/control/DirectionMath;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic directions$default(Lcom/pymcl/runtime/control/DirectionMath;FFFILjava/lang/Object;)[Z
    .locals 0

    .line 35
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/high16 p3, 0x3e800000    # 0.25f

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/runtime/control/DirectionMath;->directions(FFF)[Z

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final directions(FFF)[Z
    .locals 11
    .param p1, "nx"    # F
    .param p2, "ny"    # F
    .param p3, "deadzone"    # F

    .line 36
    float-to-double v0, p1

    float-to-double v2, p2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v0, v0

    .line 37
    .local v0, "r":F
    cmpg-float v1, v0, p3

    const/4 v2, 0x4

    if-gez v1, :cond_0

    new-array v1, v2, [Z

    return-object v1

    .line 38
    :cond_0
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .local v1, "ax":F
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 39
    .local v3, "ay":F
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    move-result v5

    div-float/2addr v4, v5

    const v5, 0x3ed41206    # 0.4142f

    cmpl-float v4, v4, v5

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lez v4, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    move v4, v6

    .line 40
    .local v4, "diag":Z
    :goto_0
    const/4 v7, 0x0

    cmpg-float v8, p2, v7

    if-gez v8, :cond_3

    cmpl-float v8, v3, v1

    if-gez v8, :cond_2

    if-eqz v4, :cond_3

    :cond_2
    move v8, v5

    goto :goto_1

    :cond_3
    move v8, v6

    .local v8, "up":Z
    :goto_1
    cmpl-float v9, p2, v7

    if-lez v9, :cond_5

    cmpl-float v9, v3, v1

    if-gez v9, :cond_4

    if-eqz v4, :cond_5

    :cond_4
    move v9, v5

    goto :goto_2

    :cond_5
    move v9, v6

    .line 41
    .local v9, "down":Z
    :goto_2
    cmpg-float v10, p1, v7

    if-gez v10, :cond_7

    cmpl-float v10, v1, v3

    if-gez v10, :cond_6

    if-eqz v4, :cond_7

    :cond_6
    move v10, v5

    goto :goto_3

    :cond_7
    move v10, v6

    .local v10, "left":Z
    :goto_3
    cmpl-float v7, p1, v7

    if-lez v7, :cond_9

    cmpl-float v7, v1, v3

    if-gez v7, :cond_8

    if-eqz v4, :cond_9

    :cond_8
    move v7, v5

    goto :goto_4

    :cond_9
    move v7, v6

    .line 42
    .local v7, "right":Z
    :goto_4
    new-array v2, v2, [Z

    aput-boolean v8, v2, v6

    aput-boolean v9, v2, v5

    const/4 v5, 0x2

    aput-boolean v10, v2, v5

    const/4 v5, 0x3

    aput-boolean v7, v2, v5

    return-object v2
.end method
