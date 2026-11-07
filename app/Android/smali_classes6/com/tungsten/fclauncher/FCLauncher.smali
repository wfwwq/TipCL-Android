.class public Lcom/tungsten/fclauncher/FCLauncher;
.super Ljava/lang/Object;
.source "FCLauncher.java"


# static fields
.field private static FCL_VERSION_CODE:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    const/4 v0, -0x1

    sput v0, Lcom/tungsten/fclauncher/FCLauncher;->FCL_VERSION_CODE:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static addCommonEnv(Lcom/tungsten/fclauncher/FCLConfig;Ljava/util/HashMap;)V
    .locals 6
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tungsten/fclauncher/FCLConfig;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 204
    .local p1, "envMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    sget v0, Lcom/tungsten/fclauncher/FCLauncher;->FCL_VERSION_CODE:I

    const/4 v1, -0x1

    const-string v2, ""

    if-eq v0, v1, :cond_0

    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Lcom/tungsten/fclauncher/FCLauncher;->FCL_VERSION_CODE:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FCL_VERSION_CODE"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    :cond_0
    const-string v0, "HOME"

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getLogDir()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    const-string v0, "JAVA_HOME"

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getJavaPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    const-string v1, "FCL_NATIVEDIR"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    const-string v1, "POJAV_NATIVEDIR"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    invoke-static {}, Lcom/mio/plugin/DriverPlugin;->getSelected()Lcom/mio/plugin/DriverPlugin$Driver;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mio/plugin/DriverPlugin$Driver;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DRIVER_PATH"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    invoke-static {}, Lcom/mio/plugin/DriverPlugin;->getSelected()Lcom/mio/plugin/DriverPlugin$Driver;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mio/plugin/DriverPlugin$Driver;->getLib()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DRIVER_LIB"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    invoke-static {}, Lcom/mio/plugin/DriverPlugin;->getSelected()Lcom/mio/plugin/DriverPlugin$Driver;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mio/plugin/DriverPlugin$Driver;->getGpu()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DRIVER_GPU"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TMPDIR"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getJavaPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/bin:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "PATH"

    invoke-static {v1}, Landroid/system/Os;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getRenderer()Lcom/mio/data/Renderer;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mio/data/Renderer;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getLwjglVersion()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v3, v4}, Lcom/tungsten/fclauncher/FCLauncher;->getLibraryPath(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "LD_LIBRARY_PATH"

    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    const-string v0, "FORCE_VSYNC"

    const-string v4, "false"

    invoke-virtual {p1, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    const-string v0, "ALSOFT_DRIVERS"

    const-string v4, "opensl"

    invoke-virtual {p1, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    sget-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->MOD_RUNTIME_DIR:Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->MOD_RUNTIME_DIR:Ljava/lang/String;

    :goto_0
    const-string v0, "MOD_ANDROID_RUNTIME"

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getWorkingDir()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 227
    .local v0, "gameDir":Ljava/io/File;
    invoke-static {v0}, Lcom/tungsten/fclauncher/FCLauncher;->hasLwjgl3ify(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 228
    new-instance v2, Ljava/io/File;

    const-string v4, ".local/share"

    invoke-direct {v2, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 229
    .local v2, "xdgDataHome":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-nez v4, :cond_2

    .line 231
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 233
    :cond_2
    const-string v4, "XDG_DATA_HOME"

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .end local v2    # "xdgDataHome":Ljava/io/File;
    :cond_3
    invoke-static {}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->getJavaVMPointer()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const-string v4, "DALVIK_JAVAVM"

    invoke-virtual {p1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->jObjectToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "DALVIK_APPLICATION"

    invoke-virtual {p1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/mio/plugin/FFmpegPlugin;->discover(Landroid/content/Context;)V

    .line 242
    sget-boolean v2, Lcom/mio/plugin/FFmpegPlugin;->isAvailable:Z

    if-eqz v2, :cond_4

    .line 243
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/mio/plugin/FFmpegPlugin;->libraryPath:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ":"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/mio/plugin/FFmpegPlugin;->libraryPath:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    :cond_4
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getUseVKDriverSystem()Z

    move-result v1

    const-string v2, "1"

    if-eqz v1, :cond_5

    .line 247
    const-string v1, "VULKAN_DRIVER_SYSTEM"

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    :cond_5
    sget-object v1, Lcom/mio/device/VulkanCheckManager;->INSTANCE:Lcom/mio/device/VulkanCheckManager;

    invoke-virtual {v1}, Lcom/mio/device/VulkanCheckManager;->getNeedsVulkanShim()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 252
    const-string v1, "VKSHIM_ENABLE"

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    :cond_6
    return-void
.end method

.method private static addCustomEnv(Lcom/tungsten/fclauncher/FCLConfig;Ljava/util/HashMap;)V
    .locals 9
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tungsten/fclauncher/FCLConfig;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 416
    .local p1, "envMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "launcher"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 417
    .local v0, "preferences":Landroid/content/SharedPreferences;
    const-string v1, "env"

    const-string v3, ""

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "\n"

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 418
    .local v1, "env":[Ljava/lang/String;
    array-length v3, v1

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    .line 420
    .local v5, "e":Ljava/lang/String;
    :try_start_0
    const-string v6, "="

    const/4 v7, 0x2

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v6

    .line 421
    .local v6, "split":[Ljava/lang/String;
    array-length v8, v6

    if-ne v8, v7, :cond_0

    .line 422
    aget-object v7, v6, v2

    const/4 v8, 0x1

    aget-object v8, v6, v8

    invoke-virtual {p1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 425
    .end local v6    # "split":[Ljava/lang/String;
    :cond_0
    goto :goto_1

    .line 424
    :catchall_0
    move-exception v6

    .line 418
    .end local v5    # "e":Ljava/lang/String;
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 428
    :cond_1
    return-void
.end method

.method private static addModLoaderEnv(Lcom/tungsten/fclauncher/FCLConfig;Ljava/util/HashMap;)V
    .locals 2
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tungsten/fclauncher/FCLConfig;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 257
    .local p1, "envMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getInstalledModLoaders()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    move-result-object v0

    if-nez v0, :cond_0

    .line 258
    return-void

    .line 260
    :cond_0
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getInstalledModLoaders()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;->getInstallForge()Z

    move-result v0

    const-string v1, "1"

    if-eqz v0, :cond_1

    .line 261
    const-string v0, "INST_FORGE"

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    :cond_1
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getInstalledModLoaders()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;->getInstallCleanroom()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 264
    const-string v0, "INST_CLEANROOM"

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    :cond_2
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getInstalledModLoaders()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;->getInstallNeoForge()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 267
    const-string v0, "INST_NEOFORGE"

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    :cond_3
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getInstalledModLoaders()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;->getInstallLiteLoader()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 270
    const-string v0, "INST_LITELOADER"

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    :cond_4
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getInstalledModLoaders()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;->getInstallFabric()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 273
    const-string v0, "INST_FABRIC"

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    :cond_5
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getInstalledModLoaders()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;->getInstallOptiFine()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 276
    const-string v0, "INST_OPTIFINE"

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    :cond_6
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getInstalledModLoaders()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;->getInstallQuilt()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 279
    const-string v0, "INST_QUILT"

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    :cond_7
    return-void
.end method

.method private static addRendererEnv(Lcom/tungsten/fclauncher/FCLConfig;Ljava/util/HashMap;)V
    .locals 6
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tungsten/fclauncher/FCLConfig;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 284
    .local p1, "envMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-static {p0, p1}, Lcom/tungsten/fclauncher/FCLauncher;->addRendererEnvInner(Lcom/tungsten/fclauncher/FCLConfig;Ljava/util/HashMap;)V

    .line 287
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getRenderer()Lcom/mio/data/Renderer;

    move-result-object v0

    .line 288
    .local v0, "renderer":Lcom/mio/data/Renderer;
    const-string v1, "POJAVEXEC_EGL"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 289
    .local v1, "egl":Ljava/lang/String;
    const-string v2, "/"

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 290
    new-instance v3, Ljava/io/File;

    invoke-static {v0}, Lcom/tungsten/fclauncher/FCLauncher;->rendererLibPath(Lcom/mio/data/Renderer;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .local v3, "candidate":Ljava/io/File;
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 294
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 296
    :cond_0
    const/4 v1, 0x0

    .line 299
    .end local v3    # "candidate":Ljava/io/File;
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 300
    const-string v3, "SDL_EGL_LIBRARY"

    invoke-virtual {p1, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    :cond_2
    invoke-virtual {v0}, Lcom/mio/data/Renderer;->getGlName()Ljava/lang/String;

    move-result-object v3

    .line 303
    .local v3, "gl":Ljava/lang/String;
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    .line 305
    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 306
    invoke-virtual {v0}, Lcom/mio/data/Renderer;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 307
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/mio/data/Renderer;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 310
    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Lcom/tungsten/fclauncher/FCLauncher;->rendererLibPath(Lcom/mio/data/Renderer;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 313
    :cond_4
    :goto_1
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 314
    const-string v2, "SDL_OPENGL_LIBRARY"

    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    :cond_5
    return-void
.end method

.method private static addRendererEnvInner(Lcom/tungsten/fclauncher/FCLConfig;Ljava/util/HashMap;)V
    .locals 11
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tungsten/fclauncher/FCLConfig;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 328
    .local p1, "envMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getRenderer()Lcom/mio/data/Renderer;

    move-result-object v0

    .line 329
    .local v0, "renderer":Lcom/mio/data/Renderer;
    invoke-virtual {v0}, Lcom/mio/data/Renderer;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const-string v2, "POJAVEXEC_EGL"

    const-string v3, "POJAV_RENDERER"

    if-nez v1, :cond_3

    .line 330
    invoke-virtual {v0}, Lcom/mio/data/Renderer;->getPojavRendererId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 331
    invoke-virtual {v0}, Lcom/mio/data/Renderer;->getPojavRendererId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    :cond_0
    invoke-virtual {v0}, Lcom/mio/data/Renderer;->getEglName()Ljava/lang/String;

    move-result-object v1

    .line 334
    .local v1, "eglName":Ljava/lang/String;
    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 335
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/mio/data/Renderer;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 338
    :cond_1
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    invoke-virtual {v0}, Lcom/mio/data/Renderer;->getPojavEnv()Ljava/util/List;

    move-result-object v2

    .line 340
    .local v2, "envList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz v2, :cond_2

    .line 341
    new-instance v3, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda2;

    invoke-direct {v3, p1, v0}, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda2;-><init>(Ljava/util/HashMap;Lcom/mio/data/Renderer;)V

    invoke-interface {v2, v3}, Ljava/util/List;->forEach(Ljava/util/function/Consumer;)V

    .line 355
    :cond_2
    return-void

    .line 357
    .end local v1    # "eglName":Ljava/lang/String;
    .end local v2    # "envList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_3
    const-string v1, "f7e985d8-6d4c-f63c-d9f1-06074dab823a"

    invoke-virtual {v0, v1}, Lcom/mio/data/Renderer;->isEqual(Ljava/lang/String;)Z

    move-result v4

    const-string v5, "LIBGL_NOERROR"

    const-string v6, "LIBGL_NOINTOVLHACK"

    const-string v7, "LIBGL_NORMALIZE"

    const-string v8, "3"

    const-string v9, "LIBGL_ES"

    const-string v10, "1"

    if-nez v4, :cond_a

    const-string v4, "0fb718e4-64e3-83d4-a974-8204ea1d9f9f"

    invoke-virtual {v0, v4}, Lcom/mio/data/Renderer;->isEqual(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_2

    .line 368
    :cond_4
    const-string v1, "e7b90ed6-e518-4d4e-93dc-5c7133cd5b31"

    invoke-virtual {v0, v1}, Lcom/mio/data/Renderer;->isEqual(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 369
    const-string v1, "LIBGL_USE_MC_COLOR"

    invoke-virtual {p1, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    const-string v1, "DLOPEN"

    const-string v4, "libspirv-cross-c-shared.so"

    invoke-virtual {p1, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    const-string v1, "LIBGL_GL"

    const-string v4, "31"

    invoke-virtual {p1, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    invoke-virtual {p1, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    invoke-virtual {p1, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    invoke-virtual {p1, v6, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    invoke-virtual {p1, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    const-string v1, "opengles3"

    invoke-virtual {p1, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    const-string v1, "libEGL.so"

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3

    .line 380
    :cond_5
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v4, "MESA_GLSL_CACHE_DIR"

    invoke-virtual {p1, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    const-string v1, "417a7a93-d9b4-98b9-ec6e-1ea400259c1f"

    invoke-virtual {v0, v1}, Lcom/mio/data/Renderer;->isEqual(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    const-string v4, "4.3"

    goto :goto_0

    :cond_6
    const-string v4, "4.6"

    :goto_0
    const-string v5, "MESA_GL_VERSION_OVERRIDE"

    invoke-virtual {p1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    invoke-virtual {v0, v1}, Lcom/mio/data/Renderer;->isEqual(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    const-string v4, "430"

    goto :goto_1

    :cond_7
    const-string v4, "460"

    :goto_1
    const-string v5, "MESA_GLSL_VERSION_OVERRIDE"

    invoke-virtual {p1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    const-string v4, "force_glsl_extensions_warn"

    const-string v5, "true"

    invoke-virtual {p1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    const-string v4, "allow_higher_compat_version"

    invoke-virtual {p1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    const-string v4, "allow_glsl_extension_directive_midshader"

    invoke-virtual {p1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    new-instance v4, Ljava/io/File;

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    const-string v6, ".virgl_test"

    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    const-string v5, "VTEST_SOCKET_NAME"

    invoke-virtual {p1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    invoke-virtual {v0, v1}, Lcom/mio/data/Renderer;->isEqual(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 388
    const-string v1, "gallium_virgl"

    invoke-virtual {p1, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    const-string v1, "OSMESA_NO_FLUSH_FRONTBUFFER"

    invoke-virtual {p1, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 390
    :cond_8
    const-string v1, "18d93f17-ff53-a319-fa61-58709a77bf87"

    invoke-virtual {v0, v1}, Lcom/mio/data/Renderer;->isEqual(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 391
    const-string v1, "opengles3_desktopgl_zink_kopper"

    invoke-virtual {p1, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    invoke-virtual {p1, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    invoke-virtual {v0}, Lcom/mio/data/Renderer;->getEglName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 394
    :cond_9
    const-string v1, "8d427e6c-9d22-2d19-db0c-3b9ac2c1543f"

    invoke-virtual {v0, v1}, Lcom/mio/data/Renderer;->isEqual(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 395
    const-string v1, "gallium_freedreno"

    invoke-virtual {p1, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 358
    :cond_a
    :goto_2
    const-string v2, "2"

    invoke-virtual {p1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    const-string v2, "LIBGL_MIPMAP"

    invoke-virtual {p1, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    invoke-virtual {p1, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    invoke-virtual {p1, v6, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    invoke-virtual {p1, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    invoke-virtual {v0}, Lcom/mio/data/Renderer;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 364
    const-string v1, "opengles2"

    invoke-virtual {p1, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 366
    :cond_b
    const-string v1, "opengles2_vgpu"

    invoke-virtual {p1, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    :cond_c
    :goto_3
    return-void
.end method

.method private static appendCommonPaths(Ljava/lang/StringBuilder;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "sb"    # Ljava/lang/StringBuilder;
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "pluginLibPath"    # Ljava/lang/String;
    .param p3, "lwjglVersion"    # Ljava/lang/String;

    .line 147
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 148
    .local v0, "nativeDir":Ljava/lang/String;
    invoke-static {}, Lcom/tungsten/fclauncher/utils/Architecture;->is64BitsDevice()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "lib64"

    goto :goto_0

    :cond_0
    const-string v1, "lib"

    .line 149
    .local v1, "libDirName":Ljava/lang/String;
    :goto_0
    const-string v2, ":"

    .line 151
    .local v2, "split":Ljava/lang/String;
    const-string v3, "runtime"

    const/4 v4, 0x0

    invoke-virtual {p1, v3, v4}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/jna"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    invoke-static {p2}, Lcom/tungsten/fclauncher/FCLauncher;->isValidPathString(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 154
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    :cond_1
    invoke-static {v2}, Lcom/mio/plugin/NativeLibPlugin;->getPaths(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 158
    .local v3, "nativeLibPaths":Ljava/lang/String;
    invoke-static {v3}, Lcom/tungsten/fclauncher/FCLauncher;->isValidPathString(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 159
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    :cond_2
    sget-object v4, Lcom/tungsten/fclauncher/utils/FCLPath;->MOD_RUNTIME_DIR:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    const-string v4, "/system/"

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    const-string v4, "/vendor/"

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/hw"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    const-string v4, "/system_ext/"

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    invoke-static {p3}, Lcom/tungsten/fclauncher/FCLauncher;->isValidPathString(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 168
    invoke-static {}, Lcom/tungsten/fclauncher/utils/Architecture;->getDeviceArchitecture()I

    move-result v4

    invoke-static {v4}, Lcom/tungsten/fclauncher/utils/Architecture;->archAsStringAndroid(I)Ljava/lang/String;

    move-result-object v4

    .line 169
    .local v4, "arch":Ljava/lang/String;
    sget-object v5, Lcom/tungsten/fclauncher/utils/FCLPath;->LWJGL_DIR:Ljava/lang/String;

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/natives/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .end local v4    # "arch":Ljava/lang/String;
    :cond_3
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4
.end method

.method public static getDeviceName()Ljava/lang/String;
    .locals 5

    .line 606
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 607
    .local v0, "modelName":Ljava/lang/String;
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 608
    .local v1, "manufacturer":Ljava/lang/String;
    sget-object v2, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 609
    .local v2, "product":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 610
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 611
    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 613
    :cond_0
    const-string v3, "%s %s %s"

    filled-new-array {v1, v2, v0}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method public static getJavaLibDir(Ljava/lang/String;)Ljava/lang/String;
    .locals 9
    .param p0, "javaPath"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 92
    invoke-static {p0}, Lcom/tungsten/fclauncher/FCLauncher;->readJREReleaseProperties(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "OS_ARCH"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 93
    .local v0, "architecture":Ljava/lang/String;
    invoke-static {v0}, Lcom/tungsten/fclauncher/utils/Architecture;->archAsInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    .line 94
    const-string v0, "i386/i486/i586"

    .line 96
    :cond_0
    const-string v1, "/lib"

    .line 97
    .local v1, "libDir":Ljava/lang/String;
    if-eqz v0, :cond_3

    .line 100
    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 101
    .local v5, "arch":Ljava/lang/String;
    new-instance v6, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "lib/"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, p0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .local v6, "file":Ljava/io/File;
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 103
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "/lib/"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 100
    .end local v5    # "arch":Ljava/lang/String;
    .end local v6    # "file":Ljava/io/File;
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 106
    :cond_2
    return-object v1

    .line 98
    :cond_3
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Unsupported architecture!"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private static getJvmLibDir(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "javaPath"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/tungsten/fclauncher/FCLauncher;->isJDK8(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "/jre"

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/tungsten/fclauncher/FCLauncher;->getJavaLibDir(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 112
    .local v0, "path":Ljava/lang/String;
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/server/libjvm.so"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 113
    .local v1, "jvmFile":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "/server"

    goto :goto_1

    :cond_1
    const-string v2, "/client"

    .line 114
    .local v2, "jvmLibDir":Ljava/lang/String;
    :goto_1
    return-object v2
.end method

.method private static getLibraryPath(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "pluginLibPath"    # Ljava/lang/String;
    .param p2, "lwjglVersion"    # Ljava/lang/String;

    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, p0, p1, p2}, Lcom/tungsten/fclauncher/FCLauncher;->appendCommonPaths(Ljava/lang/StringBuilder;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getLibraryPath(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "javaPath"    # Ljava/lang/String;
    .param p2, "pluginLibPath"    # Ljava/lang/String;
    .param p3, "lwjglVersion"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .local v0, "sb":Ljava/lang/StringBuilder;
    const-string v1, ":"

    .line 121
    .local v1, "split":Ljava/lang/String;
    if-eqz p1, :cond_1

    .line 122
    invoke-static {p1}, Lcom/tungsten/fclauncher/FCLauncher;->getJavaLibDir(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 123
    .local v2, "javaLibDir":Ljava/lang/String;
    invoke-static {p1}, Lcom/tungsten/fclauncher/FCLauncher;->getJvmLibDir(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 125
    .local v3, "jvmLibDir":Ljava/lang/String;
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/jli"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    invoke-static {p1}, Lcom/tungsten/fclauncher/FCLauncher;->isJDK8(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 130
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/jre"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 131
    .local v4, "jreLibDir":Ljava/lang/String;
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 134
    .end local v4    # "jreLibDir":Ljava/lang/String;
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 135
    .restart local v4    # "jreLibDir":Ljava/lang/String;
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .end local v2    # "javaLibDir":Ljava/lang/String;
    .end local v3    # "jvmLibDir":Ljava/lang/String;
    .end local v4    # "jreLibDir":Ljava/lang/String;
    :cond_1
    :goto_0
    invoke-static {v0, p0, p2, p3}, Lcom/tungsten/fclauncher/FCLauncher;->appendCommonPaths(Ljava/lang/StringBuilder;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public static getSocName()Ljava/lang/String;
    .locals 5

    .line 594
    const/4 v0, 0x0

    .line 596
    .local v0, "name":Ljava/lang/String;
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    const-string v2, "getprop ro.soc.model"

    invoke-virtual {v1, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v1

    .line 597
    .local v1, "process":Ljava/lang/Process;
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 598
    .local v2, "reader":Ljava/io/BufferedReader;
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    move-object v0, v3

    .line 599
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 601
    .end local v1    # "process":Ljava/lang/Process;
    .end local v2    # "reader":Ljava/io/BufferedReader;
    goto :goto_0

    .line 600
    :catch_0
    move-exception v1

    .line 602
    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    move-object v1, v0

    goto :goto_2

    :cond_1
    :goto_1
    sget-object v1, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    :goto_2
    return-object v1
.end method

.method private static hasLwjgl3ify(Ljava/io/File;)Z
    .locals 2
    .param p0, "gameDir"    # Ljava/io/File;

    .line 200
    new-instance v0, Ljava/io/File;

    const-string v1, "config/lwjgl3ify.cfg"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    return v0
.end method

.method public static isJDK8(Ljava/lang/String;)Z
    .locals 2
    .param p0, "javaPath"    # Ljava/lang/String;

    .line 617
    new-instance v0, Ljava/io/File;

    const-string v1, "jre"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/File;

    const-string v1, "bin/javac"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static isValidPathString(Ljava/lang/String;)Z
    .locals 1
    .param p0, "path"    # Ljava/lang/String;

    .line 177
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "null"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic lambda$addRendererEnvInner$0(Ljava/util/HashMap;Lcom/mio/data/Renderer;Ljava/lang/String;)V
    .locals 6
    .param p0, "envMap"    # Ljava/util/HashMap;
    .param p1, "renderer"    # Lcom/mio/data/Renderer;
    .param p2, "env"    # Ljava/lang/String;

    .line 342
    const-string v0, "="

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 343
    .local v0, "split":[Ljava/lang/String;
    const/4 v1, 0x0

    aget-object v2, v0, v1

    const-string v3, "DLOPEN"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    array-length v2, v0

    const/4 v3, 0x2

    if-ge v2, v3, :cond_0

    goto :goto_1

    .line 346
    :cond_0
    aget-object v2, v0, v1

    const-string v3, "LIB_MESA_NAME"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "/"

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    .line 347
    aget-object v1, v0, v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/mio/data/Renderer;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v3, v0, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 348
    :cond_1
    aget-object v2, v0, v1

    const-string v5, "MESA_LIBRARY"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 349
    aget-object v1, v0, v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/mio/data/Renderer;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v3, v0, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 351
    :cond_2
    aget-object v1, v0, v1

    aget-object v2, v0, v4

    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    :goto_0
    return-void

    .line 344
    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic lambda$launchProcess$2(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;ZZ)V
    .locals 4
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .param p1, "bridge"    # Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .param p2, "task"    # Ljava/lang/String;
    .param p3, "logModList"    # Z
    .param p4, "render"    # Z

    .line 554
    :try_start_0
    invoke-static {p0, p1, p2}, Lcom/tungsten/fclauncher/FCLauncher;->logStartInfo(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 555
    if-eqz p3, :cond_0

    .line 556
    invoke-static {p1}, Lcom/tungsten/fclauncher/FCLauncher;->logModList(Lcom/tungsten/fclauncher/bridge/FCLBridge;)V

    .line 560
    :cond_0
    invoke-static {p0, p1, p4}, Lcom/tungsten/fclauncher/FCLauncher;->setEnv(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;Z)V

    .line 563
    invoke-static {p0, p1}, Lcom/tungsten/fclauncher/FCLauncher;->setUpJavaRuntime(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;)V

    .line 565
    if-eqz p4, :cond_1

    .line 567
    invoke-static {p0, p1}, Lcom/tungsten/fclauncher/FCLauncher;->setupGraphicAndSoundEngine(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;)V

    .line 571
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Working directory: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getWorkingDir()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 572
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getWorkingDir()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->chdir(Ljava/lang/String;)I

    .line 575
    invoke-static {p0, p1, p2}, Lcom/tungsten/fclauncher/FCLauncher;->launch(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 582
    goto :goto_1

    .line 576
    :catchall_0
    move-exception v0

    .line 579
    .local v0, "e":Ljava/lang/Throwable;
    sget-object v1, Lcom/tungsten/fclcore/util/Logging;->LOG:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v3, "launch failed before JVM start"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 580
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PyMCL: launch failed before JVM start: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 581
    :goto_0
    const/4 v1, -0x1

    invoke-virtual {p1, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->onExit(I)V

    .line 583
    .end local v0    # "e":Ljava/lang/Throwable;
    :goto_1
    return-void
.end method

.method static synthetic lambda$setupGraphicAndSoundEngine$1(Lcom/tungsten/fclauncher/bridge/FCLBridge;Lcom/tungsten/fclauncher/FCLConfig;Ljava/lang/String;)V
    .locals 7
    .param p0, "bridge"    # Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .param p1, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .param p2, "env"    # Ljava/lang/String;

    .line 476
    const-string v0, "="

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 477
    .local v0, "split":[Ljava/lang/String;
    const/4 v1, 0x0

    aget-object v2, v0, v1

    const-string v3, "DLOPEN"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 478
    const/4 v2, 0x1

    aget-object v2, v0, v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 479
    .local v2, "libs":[Ljava/lang/String;
    array-length v3, v2

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    .line 480
    .local v4, "lib":Ljava/lang/String;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/tungsten/fclauncher/FCLConfig;->getRenderer()Lcom/mio/data/Renderer;

    move-result-object v6

    invoke-virtual {v6}, Lcom/mio/data/Renderer;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 479
    .end local v4    # "lib":Ljava/lang/String;
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 483
    .end local v2    # "libs":[Ljava/lang/String;
    :cond_0
    return-void
.end method

.method private static launch(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V
    .locals 12
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .param p1, "bridge"    # Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .param p2, "task"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 499
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " Arguments"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tungsten/fclauncher/FCLauncher;->printTaskTitle(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 500
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getJavaPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getRenderer()Lcom/mio/data/Renderer;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mio/data/Renderer;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getLwjglVersion()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/tungsten/fclauncher/FCLauncher;->getLibraryPath(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 501
    .local v0, "libraryPath":Ljava/lang/String;
    invoke-static {p0, v0}, Lcom/tungsten/fclauncher/FCLauncher;->rebaseArgs(Lcom/tungsten/fclauncher/FCLConfig;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 502
    .local v1, "args":[Ljava/lang/String;
    const/4 v2, 0x1

    .line 503
    .local v2, "javaArgs":Z
    const/4 v3, 0x0

    .line 504
    .local v3, "mainClass":I
    const/4 v4, 0x0

    .line 505
    .local v4, "isToken":Z
    array-length v5, v1

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_5

    aget-object v7, v1, v6

    .line 506
    .local v7, "arg":Ljava/lang/String;
    if-eqz v2, :cond_0

    .line 507
    const-string v8, "mio.Wrapper"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    xor-int/lit8 v8, v8, 0x1

    move v2, v8

    .line 508
    :cond_0
    const-string v8, "Minecraft"

    invoke-virtual {p2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    if-eqz v2, :cond_1

    const-string v9, "Java"

    goto :goto_1

    :cond_1
    move-object v9, p2

    .line 509
    .local v9, "title":Ljava/lang/String;
    :goto_1
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " argument: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 510
    .local v10, "prefix":Ljava/lang/String;
    invoke-virtual {p2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    if-nez v2, :cond_2

    const/4 v8, 0x2

    if-ge v3, v8, :cond_2

    .line 511
    add-int/lit8 v3, v3, 0x1

    .line 512
    const-string v10, "MainClass: "

    .line 514
    :cond_2
    if-eqz v4, :cond_3

    .line 515
    const/4 v4, 0x0

    .line 516
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v11, "***"

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {p1, v8}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 517
    goto :goto_2

    .line 519
    :cond_3
    const-string v8, "--accessToken"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 520
    const/4 v4, 0x1

    .line 521
    :cond_4
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {p1, v8}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 505
    .end local v7    # "arg":Ljava/lang/String;
    .end local v9    # "title":Ljava/lang/String;
    .end local v10    # "prefix":Ljava/lang/String;
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 523
    :cond_5
    invoke-virtual {p1, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setLdLibraryPath(Ljava/lang/String;)V

    .line 524
    invoke-virtual {p1, p1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setupExitTrap(Lcom/tungsten/fclauncher/bridge/FCLBridge;)V

    .line 525
    invoke-static {}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->initializeHooks()V

    .line 526
    const-string v5, "Hook success"

    invoke-static {p1, v5}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 527
    invoke-static {v1}, Lcom/oracle/dalvik/VMLauncher;->launchJVM([Ljava/lang/String;)I

    move-result v5

    .line 528
    .local v5, "exitCode":I
    invoke-virtual {p1, v5}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->onExit(I)V

    .line 529
    return-void
.end method

.method public static launchAPIInstaller(Lcom/tungsten/fclauncher/FCLConfig;)Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .locals 6
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;

    .line 544
    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v1, "latest_api_installer.log"

    const-string v2, "API Installer"

    const/4 v3, 0x0

    move-object v0, p0

    .end local p0    # "config":Lcom/tungsten/fclauncher/FCLConfig;
    .local v0, "config":Lcom/tungsten/fclauncher/FCLConfig;
    invoke-static/range {v0 .. v5}, Lcom/tungsten/fclauncher/FCLauncher;->launchProcess(Lcom/tungsten/fclauncher/FCLConfig;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/tungsten/fclauncher/bridge/FCLBridge;

    move-result-object p0

    return-object p0
.end method

.method public static launchJarExecutor(Lcom/tungsten/fclauncher/FCLConfig;)Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .locals 6
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;

    .line 540
    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v1, "latest_jar_executor.log"

    const-string v2, "Jar Executor"

    const/4 v3, 0x1

    move-object v0, p0

    .end local p0    # "config":Lcom/tungsten/fclauncher/FCLConfig;
    .local v0, "config":Lcom/tungsten/fclauncher/FCLConfig;
    invoke-static/range {v0 .. v5}, Lcom/tungsten/fclauncher/FCLauncher;->launchProcess(Lcom/tungsten/fclauncher/FCLConfig;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/tungsten/fclauncher/bridge/FCLBridge;

    move-result-object p0

    return-object p0
.end method

.method public static launchMinecraft(Lcom/tungsten/fclauncher/FCLConfig;)Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .locals 6
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;

    .line 532
    const/4 v4, 0x1

    const/4 v5, 0x1

    const-string v1, "latest_game.log"

    const-string v2, "Minecraft"

    const/4 v3, 0x1

    move-object v0, p0

    .end local p0    # "config":Lcom/tungsten/fclauncher/FCLConfig;
    .local v0, "config":Lcom/tungsten/fclauncher/FCLConfig;
    invoke-static/range {v0 .. v5}, Lcom/tungsten/fclauncher/FCLauncher;->launchProcess(Lcom/tungsten/fclauncher/FCLConfig;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/tungsten/fclauncher/bridge/FCLBridge;

    move-result-object p0

    .line 534
    .local p0, "bridge":Lcom/tungsten/fclauncher/bridge/FCLBridge;
    invoke-virtual {v0}, Lcom/tungsten/fclauncher/FCLConfig;->getInstalledModLoaders()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 535
    invoke-virtual {v0}, Lcom/tungsten/fclauncher/FCLConfig;->getInstalledModLoaders()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;->getInstallCleanroom()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 534
    :goto_0
    invoke-virtual {p0, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setCleanroomActive(Z)V

    .line 536
    return-object p0
.end method

.method private static launchProcess(Lcom/tungsten/fclauncher/FCLConfig;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .locals 7
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .param p1, "logName"    # Ljava/lang/String;
    .param p2, "task"    # Ljava/lang/String;
    .param p3, "render"    # Z
    .param p4, "logModList"    # Z
    .param p5, "highPriority"    # Z

    .line 550
    new-instance v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;

    invoke-direct {v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;-><init>()V

    move-object v3, v0

    .line 551
    .local v3, "bridge":Lcom/tungsten/fclauncher/bridge/FCLBridge;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getLogDir()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setLogPath(Ljava/lang/String;)V

    .line 552
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;

    move-object v2, p0

    move-object v4, p2

    move v6, p3

    move v5, p4

    .end local p0    # "config":Lcom/tungsten/fclauncher/FCLConfig;
    .end local p2    # "task":Ljava/lang/String;
    .end local p3    # "render":Z
    .end local p4    # "logModList":Z
    .local v2, "config":Lcom/tungsten/fclauncher/FCLConfig;
    .local v4, "task":Ljava/lang/String;
    .local v5, "logModList":Z
    .local v6, "render":Z
    invoke-direct/range {v1 .. v6}, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;-><init>(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;ZZ)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 585
    .local v0, "thread":Ljava/lang/Thread;
    if-eqz p5, :cond_0

    .line 586
    const/16 p0, 0xa

    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setPriority(I)V

    .line 588
    :cond_0
    invoke-virtual {v3, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setThread(Ljava/lang/Thread;)V

    .line 590
    return-object v3
.end method

.method public static locateLibs(Ljava/io/File;)Ljava/util/ArrayList;
    .locals 7
    .param p0, "path"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 454
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 455
    .local v0, "returnValue":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/io/File;>;"
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 456
    .local v1, "list":[Ljava/io/File;
    if-eqz v1, :cond_2

    .line 457
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 458
    .local v4, "f":Ljava/io/File;
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, ".so"

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 459
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 460
    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 461
    invoke-static {v4}, Lcom/tungsten/fclauncher/FCLauncher;->locateLibs(Ljava/io/File;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 457
    .end local v4    # "f":Ljava/io/File;
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 465
    :cond_2
    return-object v0
.end method

.method private static log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V
    .locals 3
    .param p0, "bridge"    # Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .param p1, "log"    # Ljava/lang/String;

    .line 45
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->getCallback()Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;->onLog(Ljava/lang/String;)V

    .line 46
    return-void
.end method

.method private static logModList(Lcom/tungsten/fclauncher/bridge/FCLBridge;)V
    .locals 1
    .param p0, "bridge"    # Lcom/tungsten/fclauncher/bridge/FCLBridge;

    .line 72
    const-string v0, "Mods"

    invoke-static {p0, v0}, Lcom/tungsten/fclauncher/FCLauncher;->printTaskTitle(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 73
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->getModSummary()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 74
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setModSummary(Ljava/lang/String;)V

    .line 75
    return-void
.end method

.method private static logStartInfo(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V
    .locals 4
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .param p1, "bridge"    # Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .param p2, "task"    # Ljava/lang/String;

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Start "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tungsten/fclauncher/FCLauncher;->printTaskTitle(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Renderer: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->getRenderer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/tungsten/fclauncher/FCLauncher;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Architecture: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/tungsten/fclauncher/utils/Architecture;->getDeviceArchitecture()I

    move-result v1

    invoke-static {v1}, Lcom/tungsten/fclauncher/utils/Architecture;->archAsString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CPU: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/tungsten/fclauncher/FCLauncher;->getSocName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Android SDK: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Language: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 61
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 63
    .local v0, "pm":Landroid/content/pm/PackageManager;
    :try_start_0
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 64
    .local v1, "packageInfo":Landroid/content/pm/PackageInfo;
    iget v2, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    sput v2, Lcom/tungsten/fclauncher/FCLauncher;->FCL_VERSION_CODE:I

    .line 65
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FCL Version Code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/tungsten/fclauncher/FCLauncher;->FCL_VERSION_CODE:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .end local v1    # "packageInfo":Landroid/content/pm/PackageInfo;
    goto :goto_0

    .line 66
    :catch_0
    move-exception v1

    .line 67
    .local v1, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FCL Version Code: Can\'t get current version code, exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 69
    .end local v1    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    :goto_0
    return-void
.end method

.method private static printTaskTitle(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V
    .locals 2
    .param p0, "bridge"    # Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .param p1, "task"    # Ljava/lang/String;

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "==================== "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ===================="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 50
    return-void
.end method

.method private static readJREReleaseProperties(Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .param p0, "javaPath"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 78
    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    .line 79
    .local v0, "jreReleaseMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/FileReader;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/release"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 81
    .local v1, "jreReleaseReader":Ljava/io/BufferedReader;
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    move-object v3, v2

    .local v3, "currLine":Ljava/lang/String;
    if-eqz v2, :cond_1

    .line 82
    const-string v2, "="

    invoke-virtual {v3, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 83
    invoke-virtual {v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 84
    .local v2, "keyValue":[Ljava/lang/String;
    const/4 v4, 0x0

    aget-object v4, v2, v4

    const/4 v5, 0x1

    aget-object v5, v2, v5

    const-string v6, "\""

    const-string v7, ""

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .end local v2    # "keyValue":[Ljava/lang/String;
    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 88
    return-object v0
.end method

.method private static rebaseArgs(Lcom/tungsten/fclauncher/FCLConfig;Ljava/lang/String;)[Ljava/lang/String;
    .locals 7
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .param p1, "libraryPath"    # Ljava/lang/String;

    .line 181
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getArgs()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 182
    .local v0, "argList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getJavaPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/bin/java"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 183
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    .line 184
    .local v1, "args":[Ljava/lang/String;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 185
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 186
    .local v3, "a":Ljava/lang/String;
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "-Djava.library.path"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 187
    const-string v3, "-Djava.library.path=${natives_directory}"

    .line 189
    :cond_0
    const-string v4, "${natives_directory}"

    invoke-virtual {v3, v4, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 190
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getRenderer()Lcom/mio/data/Renderer;

    move-result-object v4

    invoke-virtual {v4}, Lcom/mio/data/Renderer;->getGLPath()Ljava/lang/String;

    move-result-object v4

    const-string v5, "${gl_lib_name}"

    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 191
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getRenderer()Lcom/mio/data/Renderer;

    move-result-object v5

    invoke-virtual {v5}, Lcom/mio/data/Renderer;->getEGLPath()Ljava/lang/String;

    move-result-object v5

    const-string v6, "${egl_lib_name}"

    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v2

    .line 184
    .end local v3    # "a":Ljava/lang/String;
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 193
    .end local v2    # "i":I
    :cond_1
    return-object v1
.end method

.method private static rendererLibPath(Lcom/mio/data/Renderer;)Ljava/lang/String;
    .locals 2
    .param p0, "renderer"    # Lcom/mio/data/Renderer;

    .line 323
    invoke-virtual {p0}, Lcom/mio/data/Renderer;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 324
    .local v0, "pluginPath":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->NATIVE_LIB_DIR:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    return-object v1
.end method

.method private static setEnv(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;Z)V
    .locals 5
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .param p1, "bridge"    # Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .param p2, "render"    # Z

    .line 401
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 402
    .local v0, "envMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-static {p0, v0}, Lcom/tungsten/fclauncher/FCLauncher;->addCommonEnv(Lcom/tungsten/fclauncher/FCLConfig;Ljava/util/HashMap;)V

    .line 403
    invoke-static {p0, v0}, Lcom/tungsten/fclauncher/FCLauncher;->addModLoaderEnv(Lcom/tungsten/fclauncher/FCLConfig;Ljava/util/HashMap;)V

    .line 404
    if-eqz p2, :cond_0

    .line 405
    invoke-static {p0, v0}, Lcom/tungsten/fclauncher/FCLauncher;->addRendererEnv(Lcom/tungsten/fclauncher/FCLConfig;Ljava/util/HashMap;)V

    .line 407
    :cond_0
    invoke-static {p0, v0}, Lcom/tungsten/fclauncher/FCLauncher;->addCustomEnv(Lcom/tungsten/fclauncher/FCLConfig;Ljava/util/HashMap;)V

    .line 408
    const-string v1, "Env Map"

    invoke-static {p1, v1}, Lcom/tungsten/fclauncher/FCLauncher;->printTaskTitle(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 409
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 410
    .local v2, "key":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Env: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/tungsten/fclauncher/FCLauncher;->log(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 411
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v2, v3}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setenv(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    .end local v2    # "key":Ljava/lang/String;
    goto :goto_0

    .line 413
    :cond_1
    return-void
.end method

.method private static setUpJavaRuntime(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;)V
    .locals 6
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .param p1, "bridge"    # Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 431
    const-string v0, "DLOPEN"

    invoke-static {p1, v0}, Lcom/tungsten/fclauncher/FCLauncher;->printTaskTitle(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;)V

    .line 432
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getJavaPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getJavaPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tungsten/fclauncher/FCLauncher;->getJavaLibDir(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 433
    .local v0, "javaLibDir":Ljava/lang/String;
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/jli/libjli.so"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/jli"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 434
    .local v1, "jliLibDir":Ljava/lang/String;
    :goto_0
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getJavaPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/tungsten/fclauncher/FCLauncher;->isJDK8(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 435
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getJavaPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/jre"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getJavaPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/tungsten/fclauncher/FCLauncher;->getJavaLibDir(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 436
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getJavaPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/tungsten/fclauncher/FCLauncher;->getJvmLibDir(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 438
    .local v2, "jvmLibDir":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/libjli.so"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 439
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/libjvm.so"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 440
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/libfreetype.so"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 441
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/libverify.so"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 442
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/libjava.so"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 443
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/libnet.so"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 444
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/libnio.so"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 445
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/libawt.so"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 446
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/libawt_headless.so"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 447
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/libfontmanager.so"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 448
    new-instance v3, Ljava/io/File;

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getJavaPath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lcom/tungsten/fclauncher/FCLauncher;->locateLibs(Ljava/io/File;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/io/File;

    .line 449
    .local v4, "file":Ljava/io/File;
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 450
    .end local v4    # "file":Ljava/io/File;
    goto :goto_1

    .line 451
    :cond_2
    return-void
.end method

.method private static setupGraphicAndSoundEngine(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;)V
    .locals 7
    .param p0, "config"    # Lcom/tungsten/fclauncher/FCLConfig;
    .param p1, "bridge"    # Lcom/tungsten/fclauncher/bridge/FCLBridge;

    .line 469
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 471
    .local v0, "nativeDir":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/libopenal.so"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 472
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getRenderer()Lcom/mio/data/Renderer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mio/data/Renderer;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 473
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getRenderer()Lcom/mio/data/Renderer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mio/data/Renderer;->getPojavEnv()Ljava/util/List;

    move-result-object v1

    .line 474
    .local v1, "envList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz v1, :cond_0

    .line 475
    new-instance v2, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda1;

    invoke-direct {v2, p1, p0}, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda1;-><init>(Lcom/tungsten/fclauncher/bridge/FCLBridge;Lcom/tungsten/fclauncher/FCLConfig;)V

    invoke-interface {v1, v2}, Ljava/util/List;->forEach(Ljava/util/function/Consumer;)V

    .line 485
    :cond_0
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getRenderer()Lcom/mio/data/Renderer;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mio/data/Renderer;->getGLPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    move-result-wide v2

    .line 486
    .local v2, "handle":J
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1e

    if-ge v4, v5, :cond_1

    .line 488
    :try_start_0
    const-string v4, "RENDERER_HANDLE"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    invoke-static {v4, v5, v6}, Landroid/system/Os;->setenv(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 490
    goto :goto_0

    .line 489
    :catch_0
    move-exception v4

    .line 493
    .end local v1    # "envList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v2    # "handle":J
    :cond_1
    :goto_0
    goto :goto_1

    .line 494
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/tungsten/fclauncher/FCLConfig;->getRenderer()Lcom/mio/data/Renderer;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mio/data/Renderer;->getGlName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->dlopen(Ljava/lang/String;)J

    .line 496
    :goto_1
    return-void
.end method
