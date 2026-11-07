.class public final Lcom/pymcl/runtime/process/FclJavaProcessRunner;
.super Ljava/lang/Object;
.source "FclJavaProcessRunner.kt"

# interfaces
.implements Lcom/pymcl/core/loader/JavaProcessRunner;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/process/FclJavaProcessRunner$Companion;,
        Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFclJavaProcessRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FclJavaProcessRunner.kt\ncom/pymcl/runtime/process/FclJavaProcessRunner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,110:1\n1#2:111\n777#3:112\n873#3,2:113\n1739#3:117\n1814#3,3:118\n2068#3,2:121\n2068#3,2:123\n37#4,2:115\n*S KotlinDebug\n*F\n+ 1 FclJavaProcessRunner.kt\ncom/pymcl/runtime/process/FclJavaProcessRunner\n*L\n40#1:112\n40#1:113,2\n65#1:117\n65#1:118,3\n73#1:121,2\n89#1:123,2\n59#1:115,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JX\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0016\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002Jb\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00172\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0002R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lcom/pymcl/runtime/process/FclJavaProcessRunner;",
        "Lcom/pymcl/core/loader/JavaProcessRunner;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "ctx",
        "kotlin.jvm.PlatformType",
        "lock",
        "",
        "run",
        "",
        "javaMajor",
        "classpath",
        "",
        "Ljava/io/File;",
        "mainClass",
        "",
        "args",
        "workDir",
        "timeoutSec",
        "",
        "log",
        "Lkotlin/Function1;",
        "",
        "installedMajors",
        "inst",
        "Lcom/pymcl/runtime/RuntimeInstaller;",
        "runLocked",
        "attempt",
        "alive",
        "",
        "pid",
        "Companion",
        "Tail",
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
.field public static final Companion:Lcom/pymcl/runtime/process/FclJavaProcessRunner$Companion;


# instance fields
.field private final ctx:Landroid/content/Context;

.field private final lock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->Companion:Lcom/pymcl/runtime/process/FclJavaProcessRunner$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->ctx:Landroid/content/Context;

    .line 24
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->lock:Ljava/lang/Object;

    .line 22
    return-void
.end method

.method private final alive(I)Z
    .locals 3
    .param p1, "pid"    # I

    .line 95
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/proc/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method

.method private final installedMajors(Lcom/pymcl/runtime/RuntimeInstaller;)Ljava/util/List;
    .locals 9
    .param p1, "inst"    # Lcom/pymcl/runtime/RuntimeInstaller;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/runtime/RuntimeInstaller;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 40
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/16 v1, 0x15

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 112
    .local v1, "$i$f$filter":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 113
    .local v4, "$i$f$filterTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .local v7, "it":I
    const/4 v8, 0x0

    .line 40
    .local v8, "$i$a$-filter-FclJavaProcessRunner$installedMajors$1":I
    invoke-virtual {p1, v7}, Lcom/pymcl/runtime/RuntimeInstaller;->isJavaInstalled(I)Z

    move-result v7

    .line 113
    .end local v7    # "it":I
    .end local v8    # "$i$a$-filter-FclJavaProcessRunner$installedMajors$1":I
    if-eqz v7, :cond_0

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 114
    .end local v6    # "element$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filterTo":I
    check-cast v2, Ljava/util/List;

    .line 112
    nop

    .line 40
    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filter":I
    return-object v2
.end method

.method private final runLocked(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/io/File;JLkotlin/jvm/functions/Function1;I)I
    .locals 32
    .param p1, "javaMajor"    # I
    .param p2, "classpath"    # Ljava/util/List;
    .param p3, "mainClass"    # Ljava/lang/String;
    .param p4, "args"    # Ljava/util/List;
    .param p5, "workDir"    # Ljava/io/File;
    .param p6, "timeoutSec"    # J
    .param p8, "log"    # Lkotlin/jvm/functions/Function1;
    .param p9, "attempt"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Ljava/io/File;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/io/File;",
            "J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;I)I"
        }
    .end annotation

    .line 43
    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v9, p8

    move/from16 v11, p9

    new-instance v0, Lcom/pymcl/runtime/RuntimeInstaller;

    iget-object v3, v1, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->ctx:Landroid/content/Context;

    const-string v4, "ctx"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v3}, Lcom/pymcl/runtime/RuntimeInstaller;-><init>(Landroid/content/Context;)V

    move-object v12, v0

    .line 44
    .local v12, "installer":Lcom/pymcl/runtime/RuntimeInstaller;
    new-instance v0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$runLocked$1;

    const/4 v3, 0x0

    invoke-direct {v0, v12, v3}, Lcom/pymcl/runtime/process/FclJavaProcessRunner$runLocked$1;-><init>(Lcom/pymcl/runtime/RuntimeInstaller;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x1

    invoke-static {v3, v0, v4, v3}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 45
    invoke-virtual {v12, v2}, Lcom/pymcl/runtime/RuntimeInstaller;->isJavaInstalled(I)Z

    move-result v0

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v7, 0x2

    if-nez v0, :cond_0

    new-array v0, v7, [Ljava/lang/Integer;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v0, v6

    const/16 v8, 0x19

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v0, v4

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "[PyMCL] \u4e0b\u8f7d Java "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v8, " \u2026"

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/runtime/process/FclJavaProcessRunner;

    .line 111
    .local v0, "$this$runLocked_u24lambda_u240":Lcom/pymcl/runtime/process/FclJavaProcessRunner;
    const/4 v8, 0x0

    .line 47
    .local v8, "$i$a$-runCatching-FclJavaProcessRunner$runLocked$2":I
    new-instance v10, Lcom/pymcl/runtime/process/FclJavaProcessRunner$runLocked$2$1;

    invoke-direct {v10, v12, v2, v3}, Lcom/pymcl/runtime/process/FclJavaProcessRunner$runLocked$2$1;-><init>(Lcom/pymcl/runtime/RuntimeInstaller;ILkotlin/coroutines/Continuation;)V

    check-cast v10, Lkotlin/jvm/functions/Function2;

    invoke-static {v3, v10, v4, v3}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .end local v0    # "$this$runLocked_u24lambda_u240":Lcom/pymcl/runtime/process/FclJavaProcessRunner;
    .end local v8    # "$i$a$-runCatching-FclJavaProcessRunner$runLocked$2":I
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 111
    .local v0, "it":Ljava/lang/Throwable;
    const/4 v8, 0x0

    .line 47
    .local v8, "$i$a$-onFailure-FclJavaProcessRunner$runLocked$3":I
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v10

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "[PyMCL] Java "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, " \u4e0b\u8f7d\u5931\u8d25\uff1a"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v13, "\uff0c\u6539\u7528\u5df2\u5b89\u88c5\u7684 JRE"

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .end local v0    # "it":Ljava/lang/Throwable;
    .end local v8    # "$i$a$-onFailure-FclJavaProcessRunner$runLocked$3":I
    :cond_0
    sget-object v0, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->Companion:Lcom/pymcl/runtime/process/FclJavaProcessRunner$Companion;

    invoke-direct {v1, v12}, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->installedMajors(Lcom/pymcl/runtime/RuntimeInstaller;)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-virtual {v0, v2, v8}, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Companion;->pickJava(ILjava/util/Collection;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v13, v0

    .line 50
    .local v13, "major":I
    if-eq v13, v2, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "[PyMCL] \u8bf7\u6c42 Java "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v8, "\uff0c\u5b9e\u9645\u4f7f\u7528 Java "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    :cond_1
    new-instance v0, Ljava/io/File;

    sget-object v8, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_PATH:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "jre"

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0, v8, v10}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v14

    .line 53
    .local v14, "javaPath":Ljava/lang/String;
    new-instance v0, Ljava/io/File;

    iget-object v8, v1, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->ctx:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v8

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v15, "toString(...)"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v5}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "jpr/"

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v8, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v5, v0

    .line 111
    .local v5, "it":Ljava/io/File;
    const/4 v8, 0x0

    .line 53
    .local v8, "$i$a$-also-FclJavaProcessRunner$runLocked$runDir$1":I
    invoke-static {v5}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .end local v5    # "it":Ljava/io/File;
    .end local v8    # "$i$a$-also-FclJavaProcessRunner$runLocked$runDir$1":I
    move-object v15, v0

    .line 54
    .local v15, "runDir":Ljava/io/File;
    sget-object v16, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->Companion:Lcom/pymcl/runtime/process/FclJavaProcessRunner$Companion;

    sget-object v0, Lcom/tungsten/fclauncher/utils/FCLPath;->CACHE_DIR:Ljava/lang/String;

    const-string v5, "CACHE_DIR"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, p2

    move-object/from16 v18, p3

    move-object/from16 v19, p4

    move-object/from16 v21, p5

    move-object/from16 v20, v0

    invoke-virtual/range {v16 .. v21}, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Companion;->buildArgs(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/io/File;)Ljava/util/List;

    move-result-object v16

    .line 55
    .local v16, "fullArgs":Ljava/util/List;
    new-instance v0, Landroid/content/Intent;

    iget-object v5, v1, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->ctx:Landroid/content/Context;

    const-class v8, Lcom/pymcl/runtime/process/JavaProcessService;

    invoke-direct {v0, v5, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 56
    const-string v5, "run_dir"

    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v5, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 57
    const-string v5, "java_path"

    invoke-virtual {v0, v5, v14}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 58
    const-string v5, "work_dir"

    invoke-virtual/range {p5 .. p5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v5, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 59
    move-object/from16 v5, v16

    check-cast v5, Ljava/util/Collection;

    .local v5, "$this$toTypedArray$iv":Ljava/util/Collection;
    const/4 v8, 0x0

    .line 115
    .local v8, "$i$f$toTypedArray":I
    move-object v10, v5

    .line 116
    .local v10, "thisCollection$iv":Ljava/util/Collection;
    new-array v3, v6, [Ljava/lang/String;

    invoke-interface {v10, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    .end local v5    # "$this$toTypedArray$iv":Ljava/util/Collection;
    .end local v8    # "$i$f$toTypedArray":I
    .end local v10    # "thisCollection$iv":Ljava/util/Collection;
    check-cast v3, [Ljava/lang/String;

    .line 59
    const-string v5, "args"

    invoke-virtual {v0, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v3, "putExtra(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    move-object v3, v0

    .line 60
    .local v3, "intent":Landroid/content/Intent;
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "[PyMCL] java("

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v8, ") "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-object/from16 v8, p3

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v10, " "

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, " args"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    :try_start_1
    iget-object v0, v1, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->ctx:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    new-array v0, v7, [Ljava/io/File;

    new-instance v5, Ljava/io/File;

    const-string v10, "latest_api_installer.log"

    invoke-direct {v5, v15, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object v5, v0, v6

    new-instance v5, Ljava/io/File;

    const-string v6, "bridge.log"

    invoke-direct {v5, v15, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object v5, v0, v4

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 117
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v0, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v10, v0

    .local v10, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v18, 0x0

    .line 118
    .local v18, "$i$f$mapTo":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_1
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_2

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    .line 119
    .local v20, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v7, v20

    check-cast v7, Ljava/io/File;

    .local v7, "it":Ljava/io/File;
    const/16 v22, 0x0

    .line 65
    .local v22, "$i$a$-map-FclJavaProcessRunner$runLocked$tails$1":I
    new-instance v4, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;

    invoke-direct {v4, v7, v9}, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;-><init>(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V

    .line 119
    .end local v7    # "it":Ljava/io/File;
    .end local v22    # "$i$a$-map-FclJavaProcessRunner$runLocked$tails$1":I
    invoke-interface {v6, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x1

    const/4 v7, 0x2

    goto :goto_1

    .line 120
    .end local v20    # "item$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v10    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v18    # "$i$f$mapTo":I
    move-object v4, v6

    check-cast v4, Ljava/util/List;

    .line 117
    nop

    .line 65
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$map":I
    move-object v0, v4

    .line 66
    .local v0, "tails":Ljava/util/List;
    new-instance v4, Ljava/io/File;

    const-string v5, "exit"

    invoke-direct {v4, v15, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v4, "exitFile":Ljava/io/File;
    new-instance v5, Ljava/io/File;

    const-string v6, "pid"

    invoke-direct {v5, v15, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object/from16 v18, v5

    .line 67
    .local v18, "pidFile":Ljava/io/File;
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const/16 v7, 0x3e8

    move-object v10, v3

    .end local v3    # "intent":Landroid/content/Intent;
    .local v10, "intent":Landroid/content/Intent;
    int-to-long v2, v7

    mul-long v2, v2, p6

    add-long v19, v5, v2

    .line 68
    .local v19, "deadline":J
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/16 v5, 0x7530

    int-to-long v5, v5

    add-long v24, v2, v5

    .line 69
    .local v24, "startDeadline":J
    const-wide/16 v2, 0x0

    .line 70
    .local v2, "deadSince":J
    const/4 v5, 0x0

    move-wide/from16 v26, v2

    .line 71
    .end local v2    # "deadSince":J
    .local v5, "code":Ljava/lang/Integer;
    .local v26, "deadSince":J
    :cond_3
    :goto_2
    if-nez v5, :cond_d

    .line 72
    const-wide/16 v2, 0xfa

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 73
    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 121
    .local v3, "$i$f$forEach":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element$iv":Ljava/lang/Object;
    move-object/from16 v22, v7

    check-cast v22, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;

    .local v22, "it":Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;
    const/16 v28, 0x0

    .line 73
    .local v28, "$i$a$-forEach-FclJavaProcessRunner$runLocked$4":I
    invoke-virtual/range {v22 .. v22}, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->poll()V

    .line 121
    .end local v22    # "it":Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;
    .end local v28    # "$i$a$-forEach-FclJavaProcessRunner$runLocked$4":I
    nop

    .end local v7    # "element$iv":Ljava/lang/Object;
    goto :goto_3

    .line 122
    :cond_4
    nop

    .line 74
    .end local v2    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$forEach":I
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v2

    const/16 v3, -0x66

    if-eqz v2, :cond_6

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static {v4, v2, v6, v2}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_5
    move-object v5, v2

    goto/16 :goto_6

    .line 75
    :cond_6
    move-object/from16 v2, v18

    .line 111
    .local v2, "it":Ljava/io/File;
    const/4 v6, 0x0

    .line 75
    .local v6, "$i$a$-takeIf-FclJavaProcessRunner$runLocked$pid$1":I
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v2

    .end local v2    # "it":Ljava/io/File;
    .end local v6    # "$i$a$-takeIf-FclJavaProcessRunner$runLocked$pid$1":I
    if-eqz v2, :cond_7

    move-object/from16 v2, v18

    goto :goto_4

    :cond_7
    const/4 v2, 0x0

    :goto_4
    if-eqz v2, :cond_8

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v2, v6, v7, v6}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    .line 76
    .local v2, "pid":Ljava/lang/Integer;
    :goto_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 77
    .local v6, "now":J
    nop

    .line 78
    if-nez v2, :cond_9

    cmp-long v22, v6, v24

    if-lez v22, :cond_9

    const/16 v3, -0x68

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto/16 :goto_2

    .line 79
    :cond_9
    if-eqz v2, :cond_b

    move/from16 v22, v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {v1, v3}, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->alive(I)Z

    move-result v3

    if-nez v3, :cond_b

    const-wide/16 v28, 0x0

    cmp-long v3, v26, v28

    if-nez v3, :cond_a

    move-wide/from16 v26, v6

    goto/16 :goto_2

    :cond_a
    sub-long v28, v6, v26

    const-wide/16 v30, 0x5dc

    cmp-long v3, v28, v30

    if-lez v3, :cond_3

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto/16 :goto_2

    .line 80
    :cond_b
    cmp-long v3, v6, v19

    if-lez v3, :cond_3

    if-eqz v2, :cond_c

    move-object v3, v2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 111
    .local v3, "it":I
    const/16 v22, 0x0

    .line 80
    .local v22, "$i$a$-let-FclJavaProcessRunner$runLocked$5":I
    invoke-static {v3}, Landroid/os/Process;->killProcess(I)V

    .end local v3    # "it":I
    .end local v22    # "$i$a$-let-FclJavaProcessRunner$runLocked$5":I
    :cond_c
    const/16 v3, -0x67

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .end local v2    # "pid":Ljava/lang/Integer;
    .end local v6    # "now":J
    goto/16 :goto_2

    .line 84
    :cond_d
    :goto_6
    move-object/from16 v2, v18

    .line 111
    .local v2, "it":Ljava/io/File;
    const/4 v3, 0x0

    .line 84
    .local v3, "$i$a$-takeIf-FclJavaProcessRunner$runLocked$6":I
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v2

    .end local v2    # "it":Ljava/io/File;
    .end local v3    # "$i$a$-takeIf-FclJavaProcessRunner$runLocked$6":I
    if-eqz v2, :cond_e

    move-object/from16 v2, v18

    goto :goto_7

    :cond_e
    const/4 v2, 0x0

    :goto_7
    if-eqz v2, :cond_11

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v2, v6, v7, v6}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_11

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_11

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .local v2, "pid":I
    const/4 v3, 0x0

    .line 85
    .local v3, "$i$a$-let-FclJavaProcessRunner$runLocked$7":I
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    move-object/from16 v17, v0

    .end local v0    # "tails":Ljava/util/List;
    .local v17, "tails":Ljava/util/List;
    const/16 v0, 0x1388

    move/from16 v23, v3

    move-object/from16 v22, v4

    .end local v3    # "$i$a$-let-FclJavaProcessRunner$runLocked$7":I
    .end local v4    # "exitFile":Ljava/io/File;
    .local v22, "exitFile":Ljava/io/File;
    .local v23, "$i$a$-let-FclJavaProcessRunner$runLocked$7":I
    int-to-long v3, v0

    add-long/2addr v6, v3

    .line 86
    .local v6, "until":J
    :goto_8
    invoke-direct {v1, v2}, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->alive(I)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    cmp-long v0, v3, v6

    if-gez v0, :cond_f

    const-wide/16 v3, 0x64

    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_8

    .line 87
    :cond_f
    invoke-direct {v1, v2}, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->alive(I)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {v2}, Landroid/os/Process;->killProcess(I)V

    .line 88
    :cond_10
    nop

    .end local v2    # "pid":I
    .end local v6    # "until":J
    .end local v23    # "$i$a$-let-FclJavaProcessRunner$runLocked$7":I
    goto :goto_9

    .line 84
    .end local v17    # "tails":Ljava/util/List;
    .end local v22    # "exitFile":Ljava/io/File;
    .restart local v0    # "tails":Ljava/util/List;
    .restart local v4    # "exitFile":Ljava/io/File;
    :cond_11
    move-object/from16 v17, v0

    move-object/from16 v22, v4

    .end local v0    # "tails":Ljava/util/List;
    .end local v4    # "exitFile":Ljava/io/File;
    .restart local v17    # "tails":Ljava/util/List;
    .restart local v22    # "exitFile":Ljava/io/File;
    :goto_9
    nop

    .line 89
    move-object/from16 v0, v17

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 123
    .local v2, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v6, v4

    check-cast v6, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;

    .local v6, "it":Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;
    const/4 v7, 0x0

    .line 89
    .local v7, "$i$a$-forEach-FclJavaProcessRunner$runLocked$8":I
    invoke-virtual {v6}, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->poll()V

    .line 123
    .end local v6    # "it":Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;
    .end local v7    # "$i$a$-forEach-FclJavaProcessRunner$runLocked$8":I
    nop

    .end local v4    # "element$iv":Ljava/lang/Object;
    goto :goto_a

    .line 124
    :cond_12
    nop

    .line 90
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$forEach":I
    const/16 v0, -0x65

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v0, :cond_13

    const/4 v2, 0x2

    if-ge v11, v2, :cond_13

    move-object v2, v10

    .end local v10    # "intent":Landroid/content/Intent;
    .local v2, "intent":Landroid/content/Intent;
    add-int/lit8 v10, v11, 0x1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-object/from16 v21, v2

    move-object v0, v5

    move-object v4, v8

    move/from16 v2, p1

    move-object/from16 v5, p4

    move-wide/from16 v7, p6

    .end local v2    # "intent":Landroid/content/Intent;
    .end local v5    # "code":Ljava/lang/Integer;
    .local v0, "code":Ljava/lang/Integer;
    .local v21, "intent":Landroid/content/Intent;
    invoke-direct/range {v1 .. v10}, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->runLocked(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/io/File;JLkotlin/jvm/functions/Function1;I)I

    move-result v10

    return v10

    .end local v0    # "code":Ljava/lang/Integer;
    .end local v21    # "intent":Landroid/content/Intent;
    .restart local v5    # "code":Ljava/lang/Integer;
    .restart local v10    # "intent":Landroid/content/Intent;
    :cond_13
    move-object v0, v5

    move-object/from16 v21, v10

    .line 91
    .end local v5    # "code":Ljava/lang/Integer;
    .end local v10    # "intent":Landroid/content/Intent;
    .restart local v0    # "code":Ljava/lang/Integer;
    .restart local v21    # "intent":Landroid/content/Intent;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[PyMCL] java \u9000\u51fa\u7801 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    return v1

    .line 61
    .end local v0    # "code":Ljava/lang/Integer;
    .end local v17    # "tails":Ljava/util/List;
    .end local v18    # "pidFile":Ljava/io/File;
    .end local v19    # "deadline":J
    .end local v21    # "intent":Landroid/content/Intent;
    .end local v22    # "exitFile":Ljava/io/File;
    .end local v24    # "startDeadline":J
    .end local v26    # "deadSince":J
    .local v3, "intent":Landroid/content/Intent;
    :catch_0
    move-exception v0

    move-object/from16 v21, v3

    .line 62
    .end local v3    # "intent":Landroid/content/Intent;
    .local v0, "e":Ljava/lang/Exception;
    .restart local v21    # "intent":Landroid/content/Intent;
    new-instance v1, Lcom/pymcl/core/loader/InstallError;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u65e0\u6cd5\u542f\u52a8 Java \u5b50\u8fdb\u7a0b\u670d\u52a1\uff08\u5e94\u7528\u9700\u5728\u524d\u53f0\uff09\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v3, v0

    check-cast v3, Ljava/lang/Throwable;

    invoke-direct {v1, v2, v3}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 49
    .end local v0    # "e":Ljava/lang/Exception;
    .end local v13    # "major":I
    .end local v14    # "javaPath":Ljava/lang/String;
    .end local v15    # "runDir":Ljava/io/File;
    .end local v16    # "fullArgs":Ljava/util/List;
    .end local v21    # "intent":Landroid/content/Intent;
    :cond_14
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    const-string v1, "\u6ca1\u6709\u53ef\u7528\u7684\u5185\u7f6e Java \u8fd0\u884c\u65f6"

    const/4 v2, 0x2

    const/4 v6, 0x0

    invoke-direct {v0, v1, v6, v2, v6}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method static synthetic runLocked$default(Lcom/pymcl/runtime/process/FclJavaProcessRunner;ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/io/File;JLkotlin/jvm/functions/Function1;IILjava/lang/Object;)I
    .locals 11

    .line 42
    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v10, v0

    goto :goto_0

    :cond_0
    move/from16 v10, p9

    :goto_0
    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->runLocked(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/io/File;JLkotlin/jvm/functions/Function1;I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public run(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/io/File;JLkotlin/jvm/functions/Function1;)I
    .locals 14
    .param p1, "javaMajor"    # I
    .param p2, "classpath"    # Ljava/util/List;
    .param p3, "mainClass"    # Ljava/lang/String;
    .param p4, "args"    # Ljava/util/List;
    .param p5, "workDir"    # Ljava/io/File;
    .param p6, "timeoutSec"    # J
    .param p8, "log"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Ljava/io/File;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/io/File;",
            "J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    const-string v0, "classpath"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainClass"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workDir"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "log"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iget-object v13, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->lock:Ljava/lang/Object;

    monitor-enter v13

    .line 111
    const/4 v0, 0x0

    .line 38
    .local v0, "$i$a$-synchronized-FclJavaProcessRunner$run$1":I
    const/16 v11, 0x80

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move v2, p1

    move-wide/from16 v7, p6

    :try_start_0
    invoke-static/range {v1 .. v12}, Lcom/pymcl/runtime/process/FclJavaProcessRunner;->runLocked$default(Lcom/pymcl/runtime/process/FclJavaProcessRunner;ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/io/File;JLkotlin/jvm/functions/Function1;IILjava/lang/Object;)I

    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-FclJavaProcessRunner$run$1":I
    monitor-exit v13

    return v10

    :catchall_0
    move-exception v0

    monitor-exit v13

    throw v0
.end method
