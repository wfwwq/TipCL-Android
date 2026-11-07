.class public final Lcom/pymcl/runtime/process/JavaProcessService$onStartCommand$1;
.super Ljava/lang/Object;
.source "JavaProcessService.kt"

# interfaces
.implements Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/process/JavaProcessService;->onStartCommand(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJavaProcessService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaProcessService.kt\ncom/pymcl/runtime/process/JavaProcessService$onStartCommand$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/pymcl/runtime/process/JavaProcessService$onStartCommand$1",
        "Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;",
        "onCursorModeChange",
        "",
        "mode",
        "",
        "onLog",
        "log",
        "",
        "onExit",
        "code",
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


# instance fields
.field final synthetic $bridgeLog:Ljava/io/File;

.field final synthetic $runDir:Ljava/io/File;


# direct methods
.method constructor <init>(Ljava/io/File;Ljava/io/File;)V
    .locals 0
    .param p1, "$bridgeLog"    # Ljava/io/File;
    .param p2, "$runDir"    # Ljava/io/File;

    iput-object p1, p0, Lcom/pymcl/runtime/process/JavaProcessService$onStartCommand$1;->$bridgeLog:Ljava/io/File;

    iput-object p2, p0, Lcom/pymcl/runtime/process/JavaProcessService$onStartCommand$1;->$runDir:Ljava/io/File;

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCursorModeChange(I)V
    .locals 0
    .param p1, "mode"    # I

    .line 57
    return-void
.end method

.method public onExit(I)V
    .locals 2
    .param p1, "code"    # I

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "java exited "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PyMCL-JPR"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    sget-object v0, Lcom/pymcl/runtime/process/JavaProcessService;->Companion:Lcom/pymcl/runtime/process/JavaProcessService$Companion;

    iget-object v1, p0, Lcom/pymcl/runtime/process/JavaProcessService$onStartCommand$1;->$runDir:Ljava/io/File;

    invoke-virtual {v0, v1, p1}, Lcom/pymcl/runtime/process/JavaProcessService$Companion;->writeExit(Ljava/io/File;I)V

    .line 63
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 64
    return-void
.end method

.method public onLog(Ljava/lang/String;)V
    .locals 5
    .param p1, "log"    # Ljava/lang/String;

    const-string v0, "log"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    iget-object v0, p0, Lcom/pymcl/runtime/process/JavaProcessService$onStartCommand$1;->$bridgeLog:Ljava/io/File;

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/runtime/process/JavaProcessService$onStartCommand$1;

    .line 84
    .local v1, "$this$onLog_u24lambda_u240":Lcom/pymcl/runtime/process/JavaProcessService$onStartCommand$1;
    const/4 v2, 0x0

    .line 58
    .local v2, "$i$a$-runCatching-JavaProcessService$onStartCommand$1$onLog$1":I
    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, p1, v4, v3, v4}, Lkotlin/io/FilesKt;->appendText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .end local v1    # "$this$onLog_u24lambda_u240":Lcom/pymcl/runtime/process/JavaProcessService$onStartCommand$1;
    .end local v2    # "$i$a$-runCatching-JavaProcessService$onStartCommand$1$onLog$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method
