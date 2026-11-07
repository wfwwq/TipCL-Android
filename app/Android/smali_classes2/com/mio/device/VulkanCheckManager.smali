.class public final Lcom/mio/device/VulkanCheckManager;
.super Ljava/lang/Object;
.source "VulkanCheckManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/mio/device/VulkanCheckManager;",
        "",
        "<init>",
        "()V",
        "needsVulkanShim",
        "",
        "getNeedsVulkanShim",
        "()Z",
        "setNeedsVulkanShim",
        "(Z)V",
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
.field public static final INSTANCE:Lcom/mio/device/VulkanCheckManager;

.field private static needsVulkanShim:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mio/device/VulkanCheckManager;

    invoke-direct {v0}, Lcom/mio/device/VulkanCheckManager;-><init>()V

    sput-object v0, Lcom/mio/device/VulkanCheckManager;->INSTANCE:Lcom/mio/device/VulkanCheckManager;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getNeedsVulkanShim()Z
    .locals 1

    .line 8
    sget-boolean v0, Lcom/mio/device/VulkanCheckManager;->needsVulkanShim:Z

    return v0
.end method

.method public final setNeedsVulkanShim(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 8
    sput-boolean p1, Lcom/mio/device/VulkanCheckManager;->needsVulkanShim:Z

    return-void
.end method
