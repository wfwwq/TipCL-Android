.class public final Lcom/mio/plugin/DriverPlugin;
.super Ljava/lang/Object;
.source "DriverPlugin.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mio/plugin/DriverPlugin$Driver;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007b\u0002\u0008\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000er\u0002\u0008\r\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0008\u0010\u0003\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/mio/plugin/DriverPlugin;",
        "",
        "<init>",
        "()V",
        "DEFAULT_DRIVER_LIB",
        "",
        "selected",
        "Lcom/mio/plugin/DriverPlugin$Driver;",
        "getSelected$annotations",
        "getSelected",
        "()Lcom/mio/plugin/DriverPlugin$Driver;",
        "setSelected",
        "(Lcom/mio/plugin/DriverPlugin$Driver;)V",
        "Lkotlin/jvm/JvmStatic;",
        "init",
        "",
        "context",
        "Landroid/content/Context;",
        "Driver",
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
.field public static final DEFAULT_DRIVER_LIB:Ljava/lang/String; = "libvulkan_freedreno.so"

.field public static final INSTANCE:Lcom/mio/plugin/DriverPlugin;

.field private static selected:Lcom/mio/plugin/DriverPlugin$Driver;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/mio/plugin/DriverPlugin;

    invoke-direct {v0}, Lcom/mio/plugin/DriverPlugin;-><init>()V

    sput-object v0, Lcom/mio/plugin/DriverPlugin;->INSTANCE:Lcom/mio/plugin/DriverPlugin;

    .line 14
    new-instance v1, Lcom/mio/plugin/DriverPlugin$Driver;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "Turnip"

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/mio/plugin/DriverPlugin$Driver;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/mio/plugin/DriverPlugin;->selected:Lcom/mio/plugin/DriverPlugin$Driver;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final getSelected()Lcom/mio/plugin/DriverPlugin$Driver;
    .locals 1

    .line 14
    sget-object v0, Lcom/mio/plugin/DriverPlugin;->selected:Lcom/mio/plugin/DriverPlugin$Driver;

    return-object v0
.end method

.method public static synthetic getSelected$annotations()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    return-void
.end method

.method public static final init(Landroid/content/Context;)V
    .locals 8
    .param p0, "context"    # Landroid/content/Context;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v1, Lcom/mio/plugin/DriverPlugin$Driver;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v3, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    const-string v0, "nativeLibraryDir"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "Turnip"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/mio/plugin/DriverPlugin$Driver;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/mio/plugin/DriverPlugin;->selected:Lcom/mio/plugin/DriverPlugin$Driver;

    .line 19
    return-void
.end method

.method public static final setSelected(Lcom/mio/plugin/DriverPlugin$Driver;)V
    .locals 1
    .param p0, "<set-?>"    # Lcom/mio/plugin/DriverPlugin$Driver;

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sput-object p0, Lcom/mio/plugin/DriverPlugin;->selected:Lcom/mio/plugin/DriverPlugin$Driver;

    return-void
.end method
