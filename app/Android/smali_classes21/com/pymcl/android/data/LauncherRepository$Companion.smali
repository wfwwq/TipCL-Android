.class public final Lcom/pymcl/android/data/LauncherRepository$Companion;
.super Ljava/lang/Object;
.source "LauncherRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/data/LauncherRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLauncherRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherRepository.kt\ncom/pymcl/android/data/LauncherRepository$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0008R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/pymcl/android/data/LauncherRepository$Companion;",
        "",
        "<init>",
        "()V",
        "inst",
        "Lcom/pymcl/android/data/LauncherRepository;",
        "get",
        "ctx",
        "Landroid/content/Context;",
        "rootDir",
        "Ljava/io/File;",
        "PyMCL-Android:app_debug"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/android/data/LauncherRepository$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;
    .locals 5
    .param p1, "ctx"    # Landroid/content/Context;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-static {}, Lcom/pymcl/android/data/LauncherRepository;->access$getInst$cp()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    if-nez v0, :cond_1

    monitor-enter p0

    .line 207
    const/4 v0, 0x0

    .line 30
    .local v0, "$i$a$-synchronized-LauncherRepository$Companion$get$1\\1\\30\\0":I
    :try_start_0
    invoke-static {}, Lcom/pymcl/android/data/LauncherRepository;->access$getInst$cp()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getApplicationContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/pymcl/android/data/LauncherRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v1

    .line 207
    .local v2, "it\\2":Lcom/pymcl/android/data/LauncherRepository;
    const/4 v3, 0x0

    .line 30
    .local v3, "$i$a$-also-LauncherRepository$Companion$get$1$1\\2\\30\\1":I
    sget-object v4, Lcom/pymcl/android/data/LauncherRepository;->Companion:Lcom/pymcl/android/data/LauncherRepository$Companion;

    invoke-static {v2}, Lcom/pymcl/android/data/LauncherRepository;->access$setInst$cp(Lcom/pymcl/android/data/LauncherRepository;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-LauncherRepository$Companion$get$1\\1\\30\\0":I
    .end local v2    # "it\\2":Lcom/pymcl/android/data/LauncherRepository;
    .end local v3    # "$i$a$-also-LauncherRepository$Companion$get$1$1\\2\\30\\1":I
    :cond_0
    monitor-exit p0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final rootDir(Landroid/content/Context;)Ljava/io/File;
    .locals 4
    .param p1, "ctx"    # Landroid/content/Context;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    const-string v2, "PyMCL"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 33
    .local v0, "pub":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v0

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/io/File;

    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    :cond_2
    invoke-direct {v1, v3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v2, v1

    .line 207
    .local v2, "it\\1":Ljava/io/File;
    const/4 v3, 0x0

    .line 33
    .local v3, "$i$a$-also-LauncherRepository$Companion$rootDir$1\\1\\33\\0":I
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .end local v2    # "it\\1":Ljava/io/File;
    .end local v3    # "$i$a$-also-LauncherRepository$Companion$rootDir$1\\1\\33\\0":I
    :goto_0
    return-object v1
.end method
