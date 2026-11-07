.class public final Lcom/pymcl/core/config/LauncherPaths;
.super Ljava/lang/Object;
.source "LauncherPaths.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLauncherPaths.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherPaths.kt\ncom/pymcl/core/config/LauncherPaths\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u0002\n\u0002\u0008\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\t\"\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\tR\u0011\u0010\u0015\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\tR\u0011\u0010\u0017\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\tR\u0011\u0010\u0019\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\tR\u0011\u0010\u001b\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\tR\u0011\u0010\u001d\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\tR\u0011\u0010\u001f\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\tR\u0011\u0010!\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\tR\u0011\u0010#\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\tR\u0011\u0010%\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\tR\u0011\u0010\'\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\t\u00a8\u0006)"
    }
    d2 = {
        "Lcom/pymcl/core/config/LauncherPaths;",
        "",
        "root",
        "Ljava/io/File;",
        "instancesDirName",
        "",
        "<init>",
        "(Ljava/io/File;Ljava/lang/String;)V",
        "getRoot",
        "()Ljava/io/File;",
        "value",
        "instancesDir",
        "getInstancesDir",
        "setInstancesDir$PyMCL_Android_core",
        "(Ljava/io/File;)V",
        "resolve",
        "p",
        "setInstancesDir",
        "",
        "configFile",
        "getConfigFile",
        "accountsFile",
        "getAccountsFile",
        "playtimeFile",
        "getPlaytimeFile",
        "authlibInjectorJar",
        "getAuthlibInjectorJar",
        "nide8Jar",
        "getNide8Jar",
        "cacheDir",
        "getCacheDir",
        "skinsDir",
        "getSkinsDir",
        "exportsDir",
        "getExportsDir",
        "sharedDir",
        "getSharedDir",
        "javaDir",
        "getJavaDir",
        "errorLog",
        "getErrorLog",
        "PyMCL-Android:core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private instancesDir:Ljava/io/File;

.field private final root:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 1
    .param p1, "root"    # Ljava/io/File;
    .param p2, "instancesDirName"    # Ljava/lang/String;

    const-string v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instancesDirName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    .line 10
    invoke-virtual {p0, p2}, Lcom/pymcl/core/config/LauncherPaths;->resolve(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/core/config/LauncherPaths;->instancesDir:Ljava/io/File;

    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 9
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ".minecraft"

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/pymcl/core/config/LauncherPaths;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getAccountsFile()Ljava/io/File;
    .locals 3

    .line 15
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    const-string v2, "accounts.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getAuthlibInjectorJar()Ljava/io/File;
    .locals 3

    .line 17
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    const-string v2, "authlib-injector.jar"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getCacheDir()Ljava/io/File;
    .locals 3

    .line 19
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    const-string v2, "cache"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getConfigFile()Ljava/io/File;
    .locals 3

    .line 14
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    const-string v2, "config.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getErrorLog()Ljava/io/File;
    .locals 3

    .line 24
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    const-string v2, "pymcl-error.log"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getExportsDir()Ljava/io/File;
    .locals 3

    .line 21
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    const-string v2, "exports"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getInstancesDir()Ljava/io/File;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/pymcl/core/config/LauncherPaths;->instancesDir:Ljava/io/File;

    return-object v0
.end method

.method public final getJavaDir()Ljava/io/File;
    .locals 3

    .line 23
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    const-string v2, "java"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getNide8Jar()Ljava/io/File;
    .locals 3

    .line 18
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    const-string v2, "nide8auth.jar"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getPlaytimeFile()Ljava/io/File;
    .locals 3

    .line 16
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    const-string v2, "playtime.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getRoot()Ljava/io/File;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    return-object v0
.end method

.method public final getSharedDir()Ljava/io/File;
    .locals 3

    .line 22
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    const-string v2, "shared"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getSkinsDir()Ljava/io/File;
    .locals 3

    .line 20
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    const-string v2, "skins"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final resolve(Ljava/lang/String;)Ljava/io/File;
    .locals 4
    .param p1, "p"    # Ljava/lang/String;

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 27
    .local v0, "it":Ljava/io/File;
    const/4 v1, 0x0

    .line 11
    .local v1, "$i$a$-let-LauncherPaths$resolve$1":I
    invoke-virtual {v0}, Ljava/io/File;->isAbsolute()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/pymcl/core/config/LauncherPaths;->root:Ljava/io/File;

    invoke-direct {v2, v3, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v0, v2

    .end local v0    # "it":Ljava/io/File;
    .end local v1    # "$i$a$-let-LauncherPaths$resolve$1":I
    :goto_0
    return-object v0
.end method

.method public final setInstancesDir(Ljava/lang/String;)V
    .locals 1
    .param p1, "p"    # Ljava/lang/String;

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0, p1}, Lcom/pymcl/core/config/LauncherPaths;->resolve(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/core/config/LauncherPaths;->instancesDir:Ljava/io/File;

    return-void
.end method

.method public final setInstancesDir$PyMCL_Android_core(Ljava/io/File;)V
    .locals 1
    .param p1, "<set-?>"    # Ljava/io/File;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iput-object p1, p0, Lcom/pymcl/core/config/LauncherPaths;->instancesDir:Ljava/io/File;

    return-void
.end method
