.class public final Lcom/pymcl/android/data/RepositoryUiApiExt$Companion;
.super Ljava/lang/Object;
.source "RepositoryUiApiExt.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/data/RepositoryUiApiExt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApiExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/android/data/RepositoryUiApiExt$Companion;",
        "",
        "<init>",
        "()V",
        "inst",
        "Lcom/pymcl/android/data/RepositoryUiApiExt;",
        "NONE",
        "com/pymcl/android/data/RepositoryUiApiExt$Companion$NONE$1",
        "Lcom/pymcl/android/data/RepositoryUiApiExt$Companion$NONE$1;",
        "get",
        "ctx",
        "Landroid/content/Context;",
        "forApi",
        "Lcom/pymcl/android/ui/state/LauncherUiApiExt;",
        "api",
        "Lcom/pymcl/android/ui/state/LauncherUiApi;",
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

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/android/data/RepositoryUiApiExt$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final forApi(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt;
    .locals 4
    .param p1, "api"    # Lcom/pymcl/android/ui/state/LauncherUiApi;

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    instance-of v0, p1, Lcom/pymcl/android/data/RepositoryUiApi;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 175
    .local v0, "it\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    const/4 v1, 0x0

    .line 22
    .local v1, "$i$a$-let-RepositoryUiApiExt$Companion$forApi$1\\1\\22\\0":I
    sget-object v2, Lcom/pymcl/android/data/RepositoryUiApiExt;->Companion:Lcom/pymcl/android/data/RepositoryUiApiExt$Companion;

    invoke-virtual {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->getCtx$PyMCL_Android_app_debug()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/pymcl/android/data/RepositoryUiApiExt$Companion;->get(Landroid/content/Context;)Lcom/pymcl/android/data/RepositoryUiApiExt;

    move-result-object v0

    .end local v0    # "it\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    .end local v1    # "$i$a$-let-RepositoryUiApiExt$Companion$forApi$1\\1\\22\\0":I
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getNONE$cp()Lcom/pymcl/android/data/RepositoryUiApiExt$Companion$NONE$1;

    move-result-object v0

    :goto_1
    check-cast v0, Lcom/pymcl/android/ui/state/LauncherUiApiExt;

    return-object v0
.end method

.method public final get(Landroid/content/Context;)Lcom/pymcl/android/data/RepositoryUiApiExt;
    .locals 5
    .param p1, "ctx"    # Landroid/content/Context;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-static {}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getInst$cp()Lcom/pymcl/android/data/RepositoryUiApiExt;

    move-result-object v0

    if-nez v0, :cond_1

    monitor-enter p0

    .line 175
    const/4 v0, 0x0

    .line 21
    .local v0, "$i$a$-synchronized-RepositoryUiApiExt$Companion$get$1\\1\\21\\0":I
    :try_start_0
    invoke-static {}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getInst$cp()Lcom/pymcl/android/data/RepositoryUiApiExt;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getApplicationContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/pymcl/android/data/RepositoryUiApiExt;-><init>(Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v1

    .line 175
    .local v2, "it\\2":Lcom/pymcl/android/data/RepositoryUiApiExt;
    const/4 v3, 0x0

    .line 21
    .local v3, "$i$a$-also-RepositoryUiApiExt$Companion$get$1$1\\2\\21\\1":I
    sget-object v4, Lcom/pymcl/android/data/RepositoryUiApiExt;->Companion:Lcom/pymcl/android/data/RepositoryUiApiExt$Companion;

    invoke-static {v2}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$setInst$cp(Lcom/pymcl/android/data/RepositoryUiApiExt;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-RepositoryUiApiExt$Companion$get$1\\1\\21\\0":I
    .end local v2    # "it\\2":Lcom/pymcl/android/data/RepositoryUiApiExt;
    .end local v3    # "$i$a$-also-RepositoryUiApiExt$Companion$get$1$1\\2\\21\\1":I
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
