.class public final Lcom/pymcl/android/ui/state/LauncherUiApiExt$DefaultImpls;
.super Ljava/lang/Object;
.source "LauncherUiApi.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/ui/state/LauncherUiApiExt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static accountSkinFile(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApiExt;
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApiExt;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 212
    invoke-static {p0, p1, p2}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->access$accountSkinFile$jd(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static applyModUpdate(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApiExt;
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "filename"    # Ljava/lang/String;
    .param p4, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p5, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApiExt;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 220
    invoke-static/range {p0 .. p5}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->access$applyModUpdate$jd(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic applyModUpdate$default(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 220
    invoke-static/range {p0 .. p7}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->applyModUpdate$default(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static exportModpack(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApiExt;
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "name"    # Ljava/lang/String;
    .param p4, "packVersion"    # Ljava/lang/String;
    .param p5, "include"    # Ljava/util/List;
    .param p6, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p7, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApiExt;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 224
    invoke-static/range {p0 .. p7}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->access$exportModpack$jd(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic exportModpack$default(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 224
    invoke-static/range {p0 .. p9}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->exportModpack$default(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static identifyInstalled(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApiExt;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApiExt;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstalledEntry;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 218
    invoke-static {p0, p1, p2, p3, p4}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->access$identifyInstalled$jd(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static installDependencies(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApiExt;
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "deps"    # Ljava/util/List;
    .param p4, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p5, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApiExt;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/DepCandidate;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 216
    invoke-static/range {p0 .. p5}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->access$installDependencies$jd(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic installDependencies$default(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 216
    invoke-static/range {p0 .. p7}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->installDependencies$default(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static missingDependencies(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApiExt;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "id"    # Ljava/lang/String;
    .param p5, "fileId"    # Ljava/lang/String;
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApiExt;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/DepCandidate;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 214
    invoke-static/range {p0 .. p6}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->access$missingDependencies$jd(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static modpackExportCandidates(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApiExt;
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApiExt;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 222
    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->access$modpackExportCandidates$jd(Lcom/pymcl/android/ui/state/LauncherUiApiExt;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
