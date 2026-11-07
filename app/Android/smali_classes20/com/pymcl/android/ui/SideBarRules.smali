.class public final Lcom/pymcl/android/ui/SideBarRules;
.super Ljava/lang/Object;
.source "SideBarRules.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/pymcl/android/ui/SideBarRules;",
        "",
        "<init>",
        "()V",
        "WIDE_WIDTH_DP",
        "",
        "isWideWidth",
        "",
        "widthDp",
        "defaultCollapsed",
        "showMenuToggle",
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

.field public static final INSTANCE:Lcom/pymcl/android/ui/SideBarRules;

.field public static final WIDE_WIDTH_DP:I = 0x258


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/ui/SideBarRules;

    invoke-direct {v0}, Lcom/pymcl/android/ui/SideBarRules;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/SideBarRules;->INSTANCE:Lcom/pymcl/android/ui/SideBarRules;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final defaultCollapsed(I)Z
    .locals 1
    .param p1, "widthDp"    # I

    .line 26
    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/SideBarRules;->isWideWidth(I)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final isWideWidth(I)Z
    .locals 1
    .param p1, "widthDp"    # I

    .line 23
    const/16 v0, 0x258

    if-lt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final showMenuToggle(I)Z
    .locals 1
    .param p1, "widthDp"    # I

    .line 29
    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/SideBarRules;->isWideWidth(I)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
