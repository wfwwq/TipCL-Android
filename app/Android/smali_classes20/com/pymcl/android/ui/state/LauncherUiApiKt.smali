.class public final Lcom/pymcl/android/ui/state/LauncherUiApiKt;
.super Ljava/lang/Object;
.source "LauncherUiApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "ext",
        "Lcom/pymcl/android/ui/state/LauncherUiApiExt;",
        "Lcom/pymcl/android/ui/state/LauncherUiApi;",
        "getExt",
        "(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt;",
        "ext8",
        "Lcom/pymcl/android/ui/state/LauncherUiApiExt8;",
        "getExt8",
        "(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt8;",
        "PyMCL-Android:app_debug"
    }
    k = 0x2
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getExt(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt;
    .locals 1
    .param p0, "$this$ext"    # Lcom/pymcl/android/ui/state/LauncherUiApi;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    instance-of v0, p0, Lcom/pymcl/android/ui/state/LauncherUiApiExt;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/pymcl/android/ui/state/LauncherUiApiExt;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lcom/pymcl/android/data/RepositoryUiApiExt;->Companion:Lcom/pymcl/android/data/RepositoryUiApiExt$Companion;

    invoke-virtual {v0, p0}, Lcom/pymcl/android/data/RepositoryUiApiExt$Companion;->forApi(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public static final getExt8(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt8;
    .locals 3
    .param p0, "$this$ext8"    # Lcom/pymcl/android/ui/state/LauncherUiApi;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    instance-of v0, p0, Lcom/pymcl/android/ui/state/LauncherUiApiExt8;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/pymcl/android/ui/state/LauncherUiApiExt8;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_3

    invoke-static {p0}, Lcom/pymcl/android/ui/state/LauncherUiApiKt;->getExt(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt;

    move-result-object v0

    instance-of v2, v0, Lcom/pymcl/android/ui/state/LauncherUiApiExt8;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/pymcl/android/ui/state/LauncherUiApiExt8;

    :cond_1
    if-nez v1, :cond_2

    new-instance v0, Lcom/pymcl/android/ui/state/LauncherUiApiKt$ext8$1;

    invoke-direct {v0}, Lcom/pymcl/android/ui/state/LauncherUiApiKt$ext8$1;-><init>()V

    check-cast v0, Lcom/pymcl/android/ui/state/LauncherUiApiExt8;

    goto :goto_1

    :cond_2
    move-object v0, v1

    :cond_3
    :goto_1
    return-object v0
.end method
