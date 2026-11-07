.class public final Lcom/pymcl/android/data/RepositoryUiApi$Companion;
.super Ljava/lang/Object;
.source "RepositoryUiApi.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/data/RepositoryUiApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n1#2:495\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/pymcl/android/data/RepositoryUiApi$Companion;",
        "",
        "<init>",
        "()V",
        "LOBBY_NAME",
        "",
        "launchLock",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "SOURCES",
        "",
        "findInstance",
        "Lcom/pymcl/core/instance/Instance;",
        "mgr",
        "Lcom/pymcl/core/instance/InstanceManager;",
        "defaultName",
        "name",
        "missingInstanceMessage",
        "settingsUpdates",
        "",
        "s",
        "Lcom/pymcl/android/ui/state/UiSettings;",
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

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/android/data/RepositoryUiApi$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final findInstance(Lcom/pymcl/core/instance/InstanceManager;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;
    .locals 9
    .param p1, "mgr"    # Lcom/pymcl/core/instance/InstanceManager;
    .param p2, "defaultName"    # Ljava/lang/String;
    .param p3, "name"    # Ljava/lang/String;

    const-string v0, "mgr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    move-object v0, p3

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 495
    const/4 v0, 0x0

    .line 53
    .local v0, "$i$a$-ifBlank-RepositoryUiApi$Companion$findInstance$n$1\\1\\53\\0":I
    move-object v0, p2

    .end local v0    # "$i$a$-ifBlank-RepositoryUiApi$Companion$findInstance$n$1\\1\\53\\0":I
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 54
    .local v0, "n":Ljava/lang/String;
    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, p0

    check-cast v2, Lcom/pymcl/android/data/RepositoryUiApi$Companion;

    .line 495
    .local v2, "$this$findInstance_u24lambda_u241\\2":Lcom/pymcl/android/data/RepositoryUiApi$Companion;
    const/4 v3, 0x0

    .line 54
    .local v3, "$i$a$-runCatching-RepositoryUiApi$Companion$findInstance$i$1\\2\\54\\0":I
    move-object v4, v0

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 495
    const/4 v4, 0x0

    .line 54
    .local v4, "$i$a$-ifBlank-RepositoryUiApi$Companion$findInstance$i$1$1\\3\\54\\2":I
    move-object v4, v1

    .end local v4    # "$i$a$-ifBlank-RepositoryUiApi$Companion$findInstance$i$1$1\\3\\54\\2":I
    :cond_1
    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Lcom/pymcl/core/instance/InstanceManager;->get(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v4

    .end local v2    # "$this$findInstance_u24lambda_u241\\2":Lcom/pymcl/android/data/RepositoryUiApi$Companion;
    .end local v3    # "$i$a$-runCatching-RepositoryUiApi$Companion$findInstance$i$1\\2\\54\\0":I
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v2, v1

    :cond_2
    check-cast v2, Lcom/pymcl/core/instance/Instance;

    if-nez v2, :cond_3

    return-object v1

    .line 55
    .local v2, "i":Lcom/pymcl/core/instance/Instance;
    :cond_3
    invoke-virtual {v2}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_4

    return-object v1

    .line 56
    :cond_4
    invoke-virtual {v2}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {p1}, Lcom/pymcl/core/instance/InstanceManager;->getRootDir()Ljava/io/File;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    return-object v2

    .line 57
    :cond_5
    move-object v3, v2

    .line 495
    .local v3, "it\\4":Lcom/pymcl/core/instance/Instance;
    const/4 v4, 0x0

    .line 57
    .local v4, "$i$a$-takeIf-RepositoryUiApi$Companion$findInstance$1\\4\\57\\0":I
    sget-object v5, Lcom/pymcl/android/data/RepositoryUiApi;->Companion:Lcom/pymcl/android/data/RepositoryUiApi$Companion;

    :try_start_1
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 495
    .local v5, "$this$findInstance_u24lambda_u242_u240\\5":Lcom/pymcl/android/data/RepositoryUiApi$Companion;
    const/4 v6, 0x0

    .line 57
    .local v6, "$i$a$-runCatching-RepositoryUiApi$Companion$findInstance$1$1\\5\\57\\4":I
    invoke-virtual {p1}, Lcom/pymcl/core/instance/InstanceManager;->list()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v2}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    .end local v5    # "$this$findInstance_u24lambda_u242_u240\\5":Lcom/pymcl/android/data/RepositoryUiApi$Companion;
    .end local v6    # "$i$a$-runCatching-RepositoryUiApi$Companion$findInstance$1$1\\5\\57\\4":I
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v5

    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v5}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :goto_1
    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v5}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move-object v5, v6

    :cond_6
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .end local v3    # "it\\4":Lcom/pymcl/core/instance/Instance;
    .end local v4    # "$i$a$-takeIf-RepositoryUiApi$Companion$findInstance$1\\4\\57\\0":I
    if-eqz v5, :cond_7

    move-object v1, v2

    :cond_7
    return-object v1
.end method

.method public final missingInstanceMessage(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "defaultName"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 495
    const/4 v0, 0x0

    .line 59
    .local v0, "$i$a$-ifBlank-RepositoryUiApi$Companion$missingInstanceMessage$1\\1\\59\\0":I
    move-object v0, p2

    .end local v0    # "$i$a$-ifBlank-RepositoryUiApi$Companion$missingInstanceMessage$1\\1\\59\\0":I
    :cond_0
    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 495
    const/4 v0, 0x0

    .line 59
    .local v0, "$i$a$-ifBlank-RepositoryUiApi$Companion$missingInstanceMessage$2\\2\\59\\0":I
    nop

    .end local v0    # "$i$a$-ifBlank-RepositoryUiApi$Companion$missingInstanceMessage$2\\2\\59\\0":I
    const-string v0, "\u9ed8\u8ba4"

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5b9e\u4f8b\u300c"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u300d\u4e0d\u5b58\u5728\uff08\u53ef\u80fd\u5df2\u88ab\u5220\u9664\uff09\uff0c\u8bf7\u5148\u5728\u5b9e\u4f8b\u9875\u65b0\u5efa\u6216\u9009\u62e9\u4e00\u4e2a\u5b9e\u4f8b"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final settingsUpdates(Lcom/pymcl/android/ui/state/UiSettings;)Ljava/util/Map;
    .locals 7
    .param p1, "s"    # Lcom/pymcl/android/ui/state/UiSettings;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/UiSettings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    const/16 v0, 0x1e

    new-array v0, v0, [Lkotlin/Pair;

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getDark()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "ui_dark"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getMotion()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v3, "ui_motion"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getFlyAnimation()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v4, "ui_fly_animation"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x2

    aput-object v1, v0, v4

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getFlyDurationMs()I

    move-result v1

    int-to-long v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v4, "ui_fly_duration_ms"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x3

    aput-object v1, v0, v4

    .line 68
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getNavStyle()I

    move-result v1

    if-ne v1, v3, :cond_0

    const-string v1, "compact"

    goto :goto_0

    :cond_0
    const-string v1, "grouped"

    :goto_0
    const-string v4, "ui_nav_style"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x4

    aput-object v1, v0, v4

    .line 67
    nop

    .line 69
    const-string v1, "ui_background"

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperPath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x5

    aput-object v1, v0, v4

    .line 67
    nop

    .line 69
    const-string v1, "ui_background_folder"

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperFolder()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x6

    aput-object v1, v0, v4

    .line 67
    nop

    .line 69
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperRandom()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v4, "ui_background_shuffle"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x7

    aput-object v1, v0, v4

    .line 67
    nop

    .line 70
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperInterval()I

    move-result v1

    int-to-long v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v4, "ui_background_interval"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v4, 0x8

    aput-object v1, v0, v4

    .line 67
    nop

    .line 70
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperBlur()I

    move-result v1

    int-to-long v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v4, "ui_background_blur"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v4, 0x9

    aput-object v1, v0, v4

    .line 67
    nop

    .line 70
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperMask()I

    move-result v1

    int-to-long v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v4, "ui_background_dim"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v4, 0xa

    aput-object v1, v0, v4

    .line 67
    nop

    .line 71
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getThreads()I

    move-result v1

    int-to-long v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v4, "download_threads"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v4, 0xb

    aput-object v1, v0, v4

    .line 67
    nop

    .line 71
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getChunks()I

    move-result v1

    int-to-long v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v4, "download_segments"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v4, 0xc

    aput-object v1, v0, v4

    .line 67
    nop

    .line 72
    invoke-static {}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getSOURCES$cp()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getFileSource()I

    move-result v4

    if-ltz v4, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    move v5, v3

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    const-string v6, "auto"

    if-eqz v5, :cond_2

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    goto :goto_2

    .line 495
    :cond_2
    nop

    .local v4, "it\\1":I
    const/4 v1, 0x0

    .line 72
    .local v1, "$i$a$-getOrElse-RepositoryUiApi$Companion$settingsUpdates$1\\1\\72\\0":I
    move-object v1, v6

    .end local v1    # "$i$a$-getOrElse-RepositoryUiApi$Companion$settingsUpdates$1\\1\\72\\0":I
    .end local v4    # "it\\1":I
    :goto_2
    const-string v4, "download_source"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v4, 0xd

    aput-object v1, v0, v4

    .line 67
    nop

    .line 72
    invoke-static {}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getSOURCES$cp()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getCommunitySource()I

    move-result v4

    if-ltz v4, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_3

    move v2, v3

    :cond_3
    if-eqz v2, :cond_4

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    goto :goto_3

    .line 495
    :cond_4
    nop

    .local v4, "it\\2":I
    const/4 v1, 0x0

    .line 72
    .local v1, "$i$a$-getOrElse-RepositoryUiApi$Companion$settingsUpdates$2\\2\\72\\0":I
    nop

    .end local v1    # "$i$a$-getOrElse-RepositoryUiApi$Companion$settingsUpdates$2\\2\\72\\0":I
    .end local v4    # "it\\2":I
    :goto_3
    const-string v1, "community_source"

    invoke-static {v1, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    .line 67
    nop

    .line 73
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getSystemProxy()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "use_system_proxy"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    .line 67
    nop

    .line 73
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getSpeedLimit()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "download_limit_kbps"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    .line 67
    nop

    .line 73
    const-string v1, "curseforge_api_key"

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getCurseforgeKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x11

    aput-object v1, v0, v2

    .line 67
    nop

    .line 74
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getMemoryMb()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "memory_mb"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x12

    aput-object v1, v0, v2

    .line 67
    nop

    .line 74
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWidth()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "width"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x13

    aput-object v1, v0, v2

    .line 67
    nop

    .line 74
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getHeight()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "height"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x14

    aput-object v1, v0, v2

    .line 67
    nop

    .line 74
    const-string v1, "default_jvm_args"

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getJvmArgs()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x15

    aput-object v1, v0, v2

    .line 67
    nop

    .line 75
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getAllowMulti()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "allow_multi_instance"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x16

    aput-object v1, v0, v2

    .line 67
    nop

    .line 75
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getSharedLibraries()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "shared_libraries"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x17

    aput-object v1, v0, v2

    .line 67
    nop

    .line 75
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getSharedAssets()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "shared_assets"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x18

    aput-object v1, v0, v2

    .line 67
    nop

    .line 76
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getAutoUpdate()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "auto_check_update"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x19

    aput-object v1, v0, v2

    .line 67
    nop

    .line 76
    const-string v1, "update_url"

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getUpdateUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    .line 67
    nop

    .line 76
    const-string v1, "custom_homepage"

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getCustomHomepage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    .line 67
    nop

    .line 77
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getLanguage()I

    move-result v1

    if-ne v1, v3, :cond_5

    const-string v1, "en_US"

    goto :goto_4

    :cond_5
    const-string v1, "zh_CN"

    :goto_4
    const-string v2, "language"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    .line 67
    nop

    .line 77
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getFirstRun()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "first_run"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    .line 67
    nop

    .line 66
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 78
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getMsClientId()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "microsoft_client_id"

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getMsClientId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    goto :goto_5

    :cond_6
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    .line 66
    :goto_5
    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 78
    return-object v0
.end method
