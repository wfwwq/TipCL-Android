.class public final Lcom/pymcl/android/ui/SideBarRulesKt;
.super Ljava/lang/Object;
.source "SideBarRules.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\t\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a&\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003\u00a8\u0006\u000c"
    }
    d2 = {
        "barClearsCenteredIcon",
        "",
        "pillWidthDp",
        "",
        "iconDp",
        "barStartDp",
        "barWidthDp",
        "barClearsLeftIcon",
        "iconStartDp",
        "sideBarWidthDp",
        "contentWidthDp",
        "startInsetDp",
        "PyMCL-Android:app_debug"
    }
    k = 0x2
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final barClearsCenteredIcon(FFFF)Z
    .locals 2
    .param p0, "pillWidthDp"    # F
    .param p1, "iconDp"    # F
    .param p2, "barStartDp"    # F
    .param p3, "barWidthDp"    # F

    .line 69
    sub-float v0, p0, p1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    .line 70
    .local v0, "iconStart":F
    add-float v1, p2, p3

    cmpg-float v1, v1, v0

    if-lez v1, :cond_1

    add-float v1, v0, p1

    cmpl-float v1, p2, v1

    if-ltz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    return v1
.end method

.method public static final barClearsLeftIcon(FFFF)Z
    .locals 1
    .param p0, "iconStartDp"    # F
    .param p1, "iconDp"    # F
    .param p2, "barStartDp"    # F
    .param p3, "barWidthDp"    # F

    .line 75
    add-float v0, p2, p3

    cmpg-float v0, v0, p0

    if-lez v0, :cond_1

    add-float v0, p0, p1

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static final sideBarWidthDp(FF)F
    .locals 1
    .param p0, "contentWidthDp"    # F
    .param p1, "startInsetDp"    # F

    .line 84
    add-float v0, p0, p1

    return v0
.end method
