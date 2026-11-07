.class public final Lcom/pymcl/android/ui/theme/Spacing;
.super Ljava/lang/Object;
.source "Theme.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/pymcl/android/ui/theme/Spacing\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,211:1\n113#2:212\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/pymcl/android/ui/theme/Spacing\n*L\n171#1:212\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u000c\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0012\u0010\u0007R\u0013\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0014\u0010\u0007R\u0013\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0016\u0010\u0007R\u0013\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0018\u0010\u0007\u00ca\u0001\u000c\u0008\u001a\u0012\u0008\u0008\u001b\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/pymcl/android/ui/theme/Spacing;",
        "",
        "<init>",
        "()V",
        "xs",
        "Landroidx/compose/ui/unit/Dp;",
        "getXs-D9Ej5fM",
        "()F",
        "F",
        "s",
        "getS-D9Ej5fM",
        "m",
        "getM-D9Ej5fM",
        "l",
        "getL-D9Ej5fM",
        "xl",
        "getXl-D9Ej5fM",
        "chrome",
        "getChrome-D9Ej5fM",
        "side",
        "getSide-D9Ej5fM",
        "sideCollapsed",
        "getSideCollapsed-D9Ej5fM",
        "navItem",
        "getNavItem-D9Ej5fM",
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

.field public static final INSTANCE:Lcom/pymcl/android/ui/theme/Spacing;

.field private static final chrome:F

.field private static final l:F

.field private static final m:F

.field private static final navItem:F

.field private static final s:F

.field private static final side:F

.field private static final sideCollapsed:F

.field private static final xl:F

.field private static final xs:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/android/ui/theme/Spacing;

    invoke-direct {v0}, Lcom/pymcl/android/ui/theme/Spacing;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/theme/Spacing;->INSTANCE:Lcom/pymcl/android/ui/theme/Spacing;

    .line 171
    const/4 v0, 0x4

    .local v0, "$this$dp\\1":I
    const/4 v1, 0x0

    .line 212
    .local v1, "$i$f$getDp\\1\\171":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 171
    .end local v0    # "$this$dp\\1":I
    .end local v1    # "$i$f$getDp\\1\\171":I
    sput v0, Lcom/pymcl/android/ui/theme/Spacing;->xs:F

    const/16 v0, 0x8

    .local v0, "$this$dp\\2":I
    const/4 v1, 0x0

    .line 212
    .local v1, "$i$f$getDp\\2\\171":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 171
    .end local v0    # "$this$dp\\2":I
    .end local v1    # "$i$f$getDp\\2\\171":I
    sput v0, Lcom/pymcl/android/ui/theme/Spacing;->s:F

    const/16 v0, 0xc

    .local v0, "$this$dp\\3":I
    const/4 v1, 0x0

    .line 212
    .local v1, "$i$f$getDp\\3\\171":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 171
    .end local v0    # "$this$dp\\3":I
    .end local v1    # "$i$f$getDp\\3\\171":I
    sput v0, Lcom/pymcl/android/ui/theme/Spacing;->m:F

    const/16 v0, 0x10

    .local v0, "$this$dp\\4":I
    const/4 v1, 0x0

    .line 212
    .local v1, "$i$f$getDp\\4\\171":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 171
    .end local v0    # "$this$dp\\4":I
    .end local v1    # "$i$f$getDp\\4\\171":I
    sput v0, Lcom/pymcl/android/ui/theme/Spacing;->l:F

    const/16 v0, 0x18

    .local v0, "$this$dp\\5":I
    const/4 v1, 0x0

    .line 212
    .local v1, "$i$f$getDp\\5\\171":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 171
    .end local v0    # "$this$dp\\5":I
    .end local v1    # "$i$f$getDp\\5\\171":I
    sput v0, Lcom/pymcl/android/ui/theme/Spacing;->xl:F

    const/16 v0, 0x28

    .local v0, "$this$dp\\6":I
    const/4 v1, 0x0

    .line 212
    .local v1, "$i$f$getDp\\6\\171":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 171
    .end local v0    # "$this$dp\\6":I
    .end local v1    # "$i$f$getDp\\6\\171":I
    sput v0, Lcom/pymcl/android/ui/theme/Spacing;->chrome:F

    const/16 v0, 0xc4

    .local v0, "$this$dp\\7":I
    const/4 v1, 0x0

    .line 212
    .local v1, "$i$f$getDp\\7\\171":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 171
    .end local v0    # "$this$dp\\7":I
    .end local v1    # "$i$f$getDp\\7\\171":I
    sput v0, Lcom/pymcl/android/ui/theme/Spacing;->side:F

    const/16 v0, 0x3c

    .local v0, "$this$dp\\8":I
    const/4 v1, 0x0

    .line 212
    .local v1, "$i$f$getDp\\8\\171":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 171
    .end local v0    # "$this$dp\\8":I
    .end local v1    # "$i$f$getDp\\8\\171":I
    sput v0, Lcom/pymcl/android/ui/theme/Spacing;->sideCollapsed:F

    const/16 v0, 0x24

    .local v0, "$this$dp\\9":I
    const/4 v1, 0x0

    .line 212
    .local v1, "$i$f$getDp\\9\\171":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 171
    .end local v0    # "$this$dp\\9":I
    .end local v1    # "$i$f$getDp\\9\\171":I
    sput v0, Lcom/pymcl/android/ui/theme/Spacing;->navItem:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getChrome-D9Ej5fM()F
    .locals 1

    .line 171
    sget v0, Lcom/pymcl/android/ui/theme/Spacing;->chrome:F

    return v0
.end method

.method public final getL-D9Ej5fM()F
    .locals 1

    .line 171
    sget v0, Lcom/pymcl/android/ui/theme/Spacing;->l:F

    return v0
.end method

.method public final getM-D9Ej5fM()F
    .locals 1

    .line 171
    sget v0, Lcom/pymcl/android/ui/theme/Spacing;->m:F

    return v0
.end method

.method public final getNavItem-D9Ej5fM()F
    .locals 1

    .line 171
    sget v0, Lcom/pymcl/android/ui/theme/Spacing;->navItem:F

    return v0
.end method

.method public final getS-D9Ej5fM()F
    .locals 1

    .line 171
    sget v0, Lcom/pymcl/android/ui/theme/Spacing;->s:F

    return v0
.end method

.method public final getSide-D9Ej5fM()F
    .locals 1

    .line 171
    sget v0, Lcom/pymcl/android/ui/theme/Spacing;->side:F

    return v0
.end method

.method public final getSideCollapsed-D9Ej5fM()F
    .locals 1

    .line 171
    sget v0, Lcom/pymcl/android/ui/theme/Spacing;->sideCollapsed:F

    return v0
.end method

.method public final getXl-D9Ej5fM()F
    .locals 1

    .line 171
    sget v0, Lcom/pymcl/android/ui/theme/Spacing;->xl:F

    return v0
.end method

.method public final getXs-D9Ej5fM()F
    .locals 1

    .line 171
    sget v0, Lcom/pymcl/android/ui/theme/Spacing;->xs:F

    return v0
.end method
