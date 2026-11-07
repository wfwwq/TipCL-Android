.class public Lcom/tungsten/fclauncher/utils/FCLPath;
.super Ljava/lang/Object;
.source "FCLPath.java"


# static fields
.field public static AUTHLIB_INJECTOR_PATH:Ljava/lang/String; = null

.field public static BACKGROUND_DIR:Ljava/lang/String; = null

.field public static CACHE_DIR:Ljava/lang/String; = null

.field public static CACIOCAVALLO_17_DIR:Ljava/lang/String; = null

.field public static CACIOCAVALLO_8_DIR:Ljava/lang/String; = null

.field public static CONTROLLER_DIR:Ljava/lang/String; = null

.field public static DK_BACKGROUND_PATH:Ljava/lang/String; = null

.field public static FILES_DIR:Ljava/lang/String; = null

.field public static JAVA_17_PATH:Ljava/lang/String; = null

.field public static JAVA_21_PATH:Ljava/lang/String; = null

.field public static JAVA_25_PATH:Ljava/lang/String; = null

.field public static JAVA_8_PATH:Ljava/lang/String; = null

.field public static JAVA_PATH:Ljava/lang/String; = null

.field public static JNA_PATH:Ljava/lang/String; = null

.field public static final LATEST_GAME_LOG:Ljava/lang/String; = "latest_game.log"

.field public static LIB_PATCHER_PATH:Ljava/lang/String;

.field public static LIVE_BACKGROUND_PATH:Ljava/lang/String;

.field public static LOG_DIR:Ljava/lang/String;

.field public static LT_BACKGROUND_PATH:Ljava/lang/String;

.field public static LWJGL_DIR:Ljava/lang/String;

.field public static MIO_LAUNCH_WRAPPER:Ljava/lang/String;

.field public static MOD_RUNTIME_DIR:Ljava/lang/String;

.field public static NATIVE_LIB_DIR:Ljava/lang/String;

.field public static PLUGIN_DIR:Ljava/lang/String;

.field public static PRIVATE_COMMON_DIR:Ljava/lang/String;

.field public static RUNTIME_DIR:Ljava/lang/String;

.field public static SHARED_COMMON_DIR:Ljava/lang/String;

.field public static SHARE_DIR:Ljava/lang/String;

.field public static SKIN_DIR:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/PyMCL/.minecraft"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->SHARED_COMMON_DIR:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getLatestGameLog()Ljava/io/File;
    .locals 3

    .line 112
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->LOG_DIR:Ljava/lang/String;

    const-string v2, "latest_game.log"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static init(Ljava/lang/String;)V
    .locals 1
    .param p0, "path"    # Ljava/lang/String;

    .line 106
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 109
    :cond_0
    return-void
.end method

.method public static loadPaths(Landroid/content/Context;)V
    .locals 5
    .param p0, "context"    # Landroid/content/Context;

    .line 47
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->NATIVE_LIB_DIR:Ljava/lang/String;

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/PyMCL/log"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->LOG_DIR:Ljava/lang/String;

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/fclauncher"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->CACHE_DIR:Ljava/lang/String;

    .line 52
    const-string v0, "runtime"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/java"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_PATH:Ljava/lang/String;

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/java/jre8"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_8_PATH:Ljava/lang/String;

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/java/jre17"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_17_PATH:Ljava/lang/String;

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/java/jre21"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_21_PATH:Ljava/lang/String;

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/java/jre25"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_25_PATH:Ljava/lang/String;

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/jna"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->JNA_PATH:Ljava/lang/String;

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/lwjgl"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->LWJGL_DIR:Ljava/lang/String;

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/caciocavallo"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->CACIOCAVALLO_8_DIR:Ljava/lang/String;

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/caciocavallo17"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->CACIOCAVALLO_17_DIR:Ljava/lang/String;

    .line 63
    const-string v0, "runtime_mod"

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->MOD_RUNTIME_DIR:Ljava/lang/String;

    .line 65
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->FILES_DIR:Ljava/lang/String;

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->FILES_DIR:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/plugins"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->PLUGIN_DIR:Ljava/lang/String;

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->FILES_DIR:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/background"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->BACKGROUND_DIR:Ljava/lang/String;

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->FILES_DIR:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/skin"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->SKIN_DIR:Ljava/lang/String;

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/PyMCL/control"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->CONTROLLER_DIR:Ljava/lang/String;

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/PyMCL/share"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->SHARE_DIR:Ljava/lang/String;

    .line 71
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 72
    .local v0, "externalFilesDir":Ljava/io/File;
    if-nez v0, :cond_0

    .line 73
    new-instance v1, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Android/data/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/files"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v0, v1

    .line 75
    :cond_0
    new-instance v1, Ljava/io/File;

    const-string v2, ".minecraft"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->PRIVATE_COMMON_DIR:Ljava/lang/String;

    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->PLUGIN_DIR:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/authlib-injector.jar"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->AUTHLIB_INJECTOR_PATH:Ljava/lang/String;

    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->PLUGIN_DIR:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/MioLibPatcher.jar"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->LIB_PATCHER_PATH:Ljava/lang/String;

    .line 79
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->PLUGIN_DIR:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/MioLaunchWrapper.jar"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->MIO_LAUNCH_WRAPPER:Ljava/lang/String;

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->BACKGROUND_DIR:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/lt.png"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->LT_BACKGROUND_PATH:Ljava/lang/String;

    .line 81
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->BACKGROUND_DIR:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/dk.png"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->DK_BACKGROUND_PATH:Ljava/lang/String;

    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->BACKGROUND_DIR:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/live.mp4"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->LIVE_BACKGROUND_PATH:Ljava/lang/String;

    .line 84
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->LOG_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 85
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->CACHE_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 86
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 87
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->MOD_RUNTIME_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 88
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_8_PATH:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 89
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_25_PATH:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 90
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_17_PATH:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 91
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_21_PATH:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 92
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->LWJGL_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 93
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->CACIOCAVALLO_8_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 94
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->CACIOCAVALLO_17_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 95
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->FILES_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 96
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->PLUGIN_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 97
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->BACKGROUND_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 98
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->SKIN_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 99
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->CONTROLLER_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 100
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->SHARE_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 101
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->PRIVATE_COMMON_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 102
    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->SHARED_COMMON_DIR:Ljava/lang/String;

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/FCLPath;->init(Ljava/lang/String;)V

    .line 103
    return-void
.end method
