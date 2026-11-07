.class public final Lcom/pymcl/android/ui/SideBarMetrics;
.super Ljava/lang/Object;
.source "SideBarRules.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSideBarRules.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SideBarRules.kt\ncom/pymcl/android/ui/SideBarMetrics\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,85:1\n113#2:86\n113#2:87\n113#2:88\n113#2:89\n113#2:90\n113#2:91\n113#2:92\n113#2:93\n*S KotlinDebug\n*F\n+ 1 SideBarRules.kt\ncom/pymcl/android/ui/SideBarMetrics\n*L\n39#1:86\n42#1:87\n45#1:88\n51#1:89\n54#1:90\n57#1:91\n58#1:92\n61#1:93\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u000c\u0010\u0007R\u000e\u0010\r\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0012\u0010\u0007R\u0013\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0014\u0010\u0007R\u0013\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0016\u0010\u0007R\u0013\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0018\u0010\u0007\u00ca\u0001\u000c\u0008\u001a\u0012\u0008\u0008\u001b\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/pymcl/android/ui/SideBarMetrics;",
        "",
        "<init>",
        "()V",
        "sideCollapsed",
        "Landroidx/compose/ui/unit/Dp;",
        "getSideCollapsed-D9Ej5fM",
        "()F",
        "F",
        "navItemCollapsed",
        "getNavItemCollapsed-D9Ej5fM",
        "iconCollapsed",
        "getIconCollapsed-D9Ej5fM",
        "LABEL_SP",
        "",
        "dividerCollapsed",
        "getDividerCollapsed-D9Ej5fM",
        "rowPaddingH",
        "getRowPaddingH-D9Ej5fM",
        "barWidth",
        "getBarWidth-D9Ej5fM",
        "barStart",
        "getBarStart-D9Ej5fM",
        "badgeDotCollapsed",
        "getBadgeDotCollapsed-D9Ej5fM",
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
.field public static final $stable:I = 0x0

.field public static final INSTANCE:Lcom/pymcl/android/ui/SideBarMetrics;

.field public static final LABEL_SP:F = 10.0f

.field private static final badgeDotCollapsed:F

.field private static final barStart:F

.field private static final barWidth:F

.field private static final dividerCollapsed:F

.field private static final iconCollapsed:F

.field private static final navItemCollapsed:F

.field private static final rowPaddingH:F

.field private static final sideCollapsed:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/android/ui/SideBarMetrics;

    invoke-direct {v0}, Lcom/pymcl/android/ui/SideBarMetrics;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/SideBarMetrics;->INSTANCE:Lcom/pymcl/android/ui/SideBarMetrics;

    .line 39
    const/16 v0, 0x50

    .local v0, "$this$dp\\1":I
    const/4 v1, 0x0

    .line 86
    .local v1, "$i$f$getDp\\1\\39":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 39
    .end local v0    # "$this$dp\\1":I
    .end local v1    # "$i$f$getDp\\1\\39":I
    sput v0, Lcom/pymcl/android/ui/SideBarMetrics;->sideCollapsed:F

    .line 42
    const/16 v0, 0x38

    .local v0, "$this$dp\\2":I
    const/4 v1, 0x0

    .line 87
    .local v1, "$i$f$getDp\\2\\42":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 42
    .end local v0    # "$this$dp\\2":I
    .end local v1    # "$i$f$getDp\\2\\42":I
    sput v0, Lcom/pymcl/android/ui/SideBarMetrics;->navItemCollapsed:F

    .line 45
    const/16 v0, 0x16

    .local v0, "$this$dp\\3":I
    const/4 v1, 0x0

    .line 88
    .local v1, "$i$f$getDp\\3\\45":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 45
    .end local v0    # "$this$dp\\3":I
    .end local v1    # "$i$f$getDp\\3\\45":I
    sput v0, Lcom/pymcl/android/ui/SideBarMetrics;->iconCollapsed:F

    .line 51
    const/16 v0, 0x10

    .local v0, "$this$dp\\4":I
    const/4 v1, 0x0

    .line 89
    .local v1, "$i$f$getDp\\4\\51":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 51
    .end local v0    # "$this$dp\\4":I
    .end local v1    # "$i$f$getDp\\4\\51":I
    sput v0, Lcom/pymcl/android/ui/SideBarMetrics;->dividerCollapsed:F

    .line 54
    const/16 v0, 0x8

    .local v0, "$this$dp\\5":I
    const/4 v1, 0x0

    .line 90
    .local v1, "$i$f$getDp\\5\\54":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 54
    .end local v0    # "$this$dp\\5":I
    .end local v1    # "$i$f$getDp\\5\\54":I
    sput v0, Lcom/pymcl/android/ui/SideBarMetrics;->rowPaddingH:F

    .line 57
    const/4 v0, 0x3

    .local v0, "$this$dp\\6":I
    const/4 v1, 0x0

    .line 91
    .local v1, "$i$f$getDp\\6\\57":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 57
    .end local v0    # "$this$dp\\6":I
    .end local v1    # "$i$f$getDp\\6\\57":I
    sput v0, Lcom/pymcl/android/ui/SideBarMetrics;->barWidth:F

    .line 58
    const/4 v0, 0x4

    .local v0, "$this$dp\\7":I
    const/4 v1, 0x0

    .line 92
    .local v1, "$i$f$getDp\\7\\58":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 58
    .end local v0    # "$this$dp\\7":I
    .end local v1    # "$i$f$getDp\\7\\58":I
    sput v0, Lcom/pymcl/android/ui/SideBarMetrics;->barStart:F

    .line 61
    const/16 v0, 0x8

    .local v0, "$this$dp\\8":I
    const/4 v1, 0x0

    .line 93
    .local v1, "$i$f$getDp\\8\\61":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 61
    .end local v0    # "$this$dp\\8":I
    .end local v1    # "$i$f$getDp\\8\\61":I
    sput v0, Lcom/pymcl/android/ui/SideBarMetrics;->badgeDotCollapsed:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getBadgeDotCollapsed-D9Ej5fM()F
    .locals 1

    .line 61
    sget v0, Lcom/pymcl/android/ui/SideBarMetrics;->badgeDotCollapsed:F

    return v0
.end method

.method public final getBarStart-D9Ej5fM()F
    .locals 1

    .line 58
    sget v0, Lcom/pymcl/android/ui/SideBarMetrics;->barStart:F

    return v0
.end method

.method public final getBarWidth-D9Ej5fM()F
    .locals 1

    .line 57
    sget v0, Lcom/pymcl/android/ui/SideBarMetrics;->barWidth:F

    return v0
.end method

.method public final getDividerCollapsed-D9Ej5fM()F
    .locals 1

    .line 51
    sget v0, Lcom/pymcl/android/ui/SideBarMetrics;->dividerCollapsed:F

    return v0
.end method

.method public final getIconCollapsed-D9Ej5fM()F
    .locals 1

    .line 45
    sget v0, Lcom/pymcl/android/ui/SideBarMetrics;->iconCollapsed:F

    return v0
.end method

.method public final getNavItemCollapsed-D9Ej5fM()F
    .locals 1

    .line 42
    sget v0, Lcom/pymcl/android/ui/SideBarMetrics;->navItemCollapsed:F

    return v0
.end method

.method public final getRowPaddingH-D9Ej5fM()F
    .locals 1

    .line 54
    sget v0, Lcom/pymcl/android/ui/SideBarMetrics;->rowPaddingH:F

    return v0
.end method

.method public final getSideCollapsed-D9Ej5fM()F
    .locals 1

    .line 39
    sget v0, Lcom/pymcl/android/ui/SideBarMetrics;->sideCollapsed:F

    return v0
.end method
