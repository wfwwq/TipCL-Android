.class public final Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;
.super Ljava/lang/Object;
.source "GameActivity.kt"

# interfaces
.implements Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/GameActivity;->onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameActivity.kt\ncom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n1#2:464\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1",
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
.field final synthetic this$0:Lcom/pymcl/runtime/GameActivity;


# direct methods
.method public static synthetic $r8$lambda$-bhJ0XXhiXh5RroGM9N94TbauH4(Lcom/pymcl/runtime/GameActivity;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;->onCursorModeChange$lambda$0(Lcom/pymcl/runtime/GameActivity;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$CYoO_tn01t0NGlJnjyx8XtbygxI(Lcom/pymcl/runtime/GameActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;->onExit$lambda$3(Lcom/pymcl/runtime/GameActivity;)V

    return-void
.end method

.method constructor <init>(Lcom/pymcl/runtime/GameActivity;)V
    .locals 0
    .param p1, "$receiver"    # Lcom/pymcl/runtime/GameActivity;

    iput-object p1, p0, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;->this$0:Lcom/pymcl/runtime/GameActivity;

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final onCursorModeChange$lambda$0(Lcom/pymcl/runtime/GameActivity;I)V
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p1, "$mode"    # I

    .line 218
    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0, v0}, Lcom/pymcl/runtime/GameActivity;->access$onGrabChanged(Lcom/pymcl/runtime/GameActivity;Z)V

    return-void
.end method

.method private static final onExit$lambda$3(Lcom/pymcl/runtime/GameActivity;)V
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;

    .line 225
    invoke-virtual {p0}, Lcom/pymcl/runtime/GameActivity;->finish()V

    return-void
.end method


# virtual methods
.method public onCursorModeChange(I)V
    .locals 3
    .param p1, "mode"    # I

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cursorModeChange mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PyMCL-Game"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;->this$0:Lcom/pymcl/runtime/GameActivity;

    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;->this$0:Lcom/pymcl/runtime/GameActivity;

    new-instance v2, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1, p1}, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/runtime/GameActivity;I)V

    invoke-virtual {v0, v2}, Lcom/pymcl/runtime/GameActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onExit(I)V
    .locals 11
    .param p1, "code"    # I

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exit "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PyMCL-Game"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;->this$0:Lcom/pymcl/runtime/GameActivity;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/pymcl/runtime/GameActivity;->access$setExited$p(Lcom/pymcl/runtime/GameActivity;Z)V

    .line 224
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;->this$0:Lcom/pymcl/runtime/GameActivity;

    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, p0

    check-cast v2, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;

    .line 464
    .local v2, "$this$onExit_u24lambda_u241":Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;
    const/4 v3, 0x0

    .line 224
    .local v3, "$i$a$-runCatching-GameActivity$onSurfaceTextureAvailable$1$onExit$1":I
    sget-object v4, Lcom/pymcl/runtime/GameSession;->Companion:Lcom/pymcl/runtime/GameSession$Companion;

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v4, v0}, Lcom/pymcl/runtime/GameSession$Companion;->of(Landroid/content/Context;)Lcom/pymcl/runtime/GameSession;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v9, 0x2

    const/4 v10, 0x0

    const-wide/16 v7, 0x0

    move v6, p1

    .end local p1    # "code":I
    .local v6, "code":I
    :try_start_1
    invoke-static/range {v5 .. v10}, Lcom/pymcl/runtime/GameSession;->markExit$default(Lcom/pymcl/runtime/GameSession;IJILjava/lang/Object;)V

    .end local v2    # "$this$onExit_u24lambda_u241":Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;
    .end local v3    # "$i$a$-runCatching-GameActivity$onSurfaceTextureAvailable$1$onExit$1":I
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    .end local v6    # "code":I
    .restart local p1    # "code":I
    :catchall_1
    move-exception v0

    move v6, p1

    move-object p1, v0

    .end local p1    # "code":I
    .restart local v6    # "code":I
    :goto_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 464
    .local p1, "it":Ljava/lang/Throwable;
    const/4 v0, 0x0

    .line 224
    .local v0, "$i$a$-onFailure-GameActivity$onSurfaceTextureAvailable$1$onExit$2":I
    const-string v2, "markExit"

    invoke-static {v1, v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 225
    .end local v0    # "$i$a$-onFailure-GameActivity$onSurfaceTextureAvailable$1$onExit$2":I
    .end local p1    # "it":Ljava/lang/Throwable;
    :cond_0
    iget-object p1, p0, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;->this$0:Lcom/pymcl/runtime/GameActivity;

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;->this$0:Lcom/pymcl/runtime/GameActivity;

    new-instance v1, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1$$ExternalSyntheticLambda1;

    invoke-direct {v1, v0}, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {p1, v1}, Lcom/pymcl/runtime/GameActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 226
    return-void
.end method

.method public onLog(Ljava/lang/String;)V
    .locals 1
    .param p1, "log"    # Ljava/lang/String;

    const-string v0, "log"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    const-string v0, "PyMCL-Game"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
