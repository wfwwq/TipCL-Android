.class public Lcom/mio/plugin/FFmpegPlugin;
.super Ljava/lang/Object;
.source "FFmpegPlugin.java"


# static fields
.field public static isAvailable:Z

.field public static libraryPath:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    const/4 v0, 0x0

    sput-boolean v0, Lcom/mio/plugin/FFmpegPlugin;->isAvailable:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static discover(Landroid/content/Context;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .line 12
    const/4 v0, 0x0

    sput-boolean v0, Lcom/mio/plugin/FFmpegPlugin;->isAvailable:Z

    const/4 v0, 0x0

    sput-object v0, Lcom/mio/plugin/FFmpegPlugin;->libraryPath:Ljava/lang/String;

    return-void
.end method
