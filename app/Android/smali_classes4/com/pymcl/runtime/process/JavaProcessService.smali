.class public final Lcom/pymcl/runtime/process/JavaProcessService;
.super Landroid/app/Service;
.source "JavaProcessService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/process/JavaProcessService$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJavaProcessService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaProcessService.kt\ncom/pymcl/runtime/process/JavaProcessService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u000b2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/pymcl/runtime/process/JavaProcessService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "started",
        "",
        "onBind",
        "Landroid/os/IBinder;",
        "intent",
        "Landroid/content/Intent;",
        "onStartCommand",
        "",
        "flags",
        "startId",
        "Companion",
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
.field public static final Companion:Lcom/pymcl/runtime/process/JavaProcessService$Companion;

.field public static final EXTRA_ARGS:Ljava/lang/String; = "args"

.field public static final EXTRA_JAVA:Ljava/lang/String; = "java_path"

.field public static final EXTRA_RUN_DIR:Ljava/lang/String; = "run_dir"

.field public static final EXTRA_WORK_DIR:Ljava/lang/String; = "work_dir"

.field private static final TAG:Ljava/lang/String; = "PyMCL-JPR"


# instance fields
.field private volatile started:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/process/JavaProcessService$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/process/JavaProcessService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/process/JavaProcessService;->Companion:Lcom/pymcl/runtime/process/JavaProcessService$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .line 36
    const/4 v0, 0x0

    return-object v0
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 12
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "flags"    # I
    .param p3, "startId"    # I

    .line 39
    const/4 v1, 0x2

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/runtime/process/JavaProcessService;->stopSelf()V

    return v1

    .line 40
    :cond_0
    new-instance v0, Ljava/io/File;

    const-string v2, "run_dir"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    return v1

    :cond_1
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v2, v0

    .line 41
    .local v2, "runDir":Ljava/io/File;
    iget-boolean v0, p0, Lcom/pymcl/runtime/process/JavaProcessService;->started:Z

    if-eqz v0, :cond_2

    .line 42
    sget-object v0, Lcom/pymcl/runtime/process/JavaProcessService;->Companion:Lcom/pymcl/runtime/process/JavaProcessService$Companion;

    const/16 v3, -0x65

    invoke-virtual {v0, v2, v3}, Lcom/pymcl/runtime/process/JavaProcessService$Companion;->writeExit(Ljava/io/File;I)V

    return v1

    .line 44
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/runtime/process/JavaProcessService;->started:Z

    .line 45
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 46
    new-instance v0, Ljava/io/File;

    const-string v3, "pid"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v4}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .line 47
    new-instance v0, Ljava/io/File;

    const-string v3, "bridge.log"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v3, v0

    .line 48
    .local v3, "bridgeLog":Ljava/io/File;
    nop

    .line 49
    :try_start_0
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/pymcl/runtime/RuntimeHost;->init(Landroid/content/Context;)V

    .line 50
    const-string v0, "java_path"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v8, v0

    .line 51
    .local v8, "java":Ljava/lang/String;
    const-string v0, "work_dir"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 52
    .local v9, "work":Ljava/lang/String;
    const-string v0, "args"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 53
    .local v11, "args":[Ljava/lang/String;
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 54
    new-instance v5, Lcom/tungsten/fclauncher/FCLConfig;

    move-object v6, p0

    check-cast v6, Landroid/content/Context;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    const-string v0, "getAbsolutePath(...)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/pymcl/runtime/Renderers;->INSTANCE:Lcom/pymcl/runtime/Renderers;

    invoke-virtual {v0}, Lcom/pymcl/runtime/Renderers;->getGL4ES()Lcom/mio/data/Renderer;

    move-result-object v10

    invoke-direct/range {v5 .. v11}, Lcom/tungsten/fclauncher/FCLConfig;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mio/data/Renderer;[Ljava/lang/String;)V

    .line 55
    .local v5, "config":Lcom/tungsten/fclauncher/FCLConfig;
    invoke-static {v5}, Lcom/tungsten/fclauncher/FCLauncher;->launchAPIInstaller(Lcom/tungsten/fclauncher/FCLConfig;)Lcom/tungsten/fclauncher/bridge/FCLBridge;

    move-result-object v0

    .line 56
    .local v0, "bridge":Lcom/tungsten/fclauncher/bridge/FCLBridge;
    new-instance v6, Lcom/pymcl/runtime/process/JavaProcessService$onStartCommand$1;

    invoke-direct {v6, v3, v2}, Lcom/pymcl/runtime/process/JavaProcessService$onStartCommand$1;-><init>(Ljava/io/File;Ljava/io/File;)V

    check-cast v6, Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    invoke-virtual {v0, v4, v6}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->execute(Landroid/view/Surface;Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "bridge":Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .end local v5    # "config":Lcom/tungsten/fclauncher/FCLConfig;
    .end local v8    # "java":Ljava/lang/String;
    .end local v9    # "work":Ljava/lang/String;
    .end local v11    # "args":[Ljava/lang/String;
    goto :goto_1

    .line 66
    :catchall_0
    move-exception v0

    move-object v5, v0

    .line 67
    .local v5, "t":Ljava/lang/Throwable;
    const-string v0, "PyMCL-JPR"

    const-string v6, "launch failed"

    invoke-static {v0, v6, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 68
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    .line 84
    .local v0, "$this$onStartCommand_u24lambda_u240":Lcom/pymcl/runtime/process/JavaProcessService;
    const/4 v6, 0x0

    .line 68
    .local v6, "$i$a$-runCatching-JavaProcessService$onStartCommand$2":I
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "launch failed: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7, v4, v1, v4}, Lkotlin/io/FilesKt;->appendText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .end local v0    # "$this$onStartCommand_u24lambda_u240":Lcom/pymcl/runtime/process/JavaProcessService;
    .end local v6    # "$i$a$-runCatching-JavaProcessService$onStartCommand$2":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    :goto_0
    sget-object v0, Lcom/pymcl/runtime/process/JavaProcessService;->Companion:Lcom/pymcl/runtime/process/JavaProcessService$Companion;

    const/16 v4, -0x64

    invoke-virtual {v0, v2, v4}, Lcom/pymcl/runtime/process/JavaProcessService$Companion;->writeExit(Ljava/io/File;I)V

    .line 70
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 72
    .end local v5    # "t":Ljava/lang/Throwable;
    :goto_1
    return v1
.end method
