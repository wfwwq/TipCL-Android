.class public final Lcom/pymcl/runtime/input/NativeSdlTextChannel;
.super Ljava/lang/Object;
.source "SdlTextInput.kt"

# interfaces
.implements Lcom/pymcl/runtime/input/SdlTextChannel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000c\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/NativeSdlTextChannel;",
        "Lcom/pymcl/runtime/input/SdlTextChannel;",
        "<init>",
        "()V",
        "TAG",
        "",
        "broken",
        "",
        "available",
        "commit",
        "text",
        "controlChar",
        "c",
        "",
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
.field public static final INSTANCE:Lcom/pymcl/runtime/input/NativeSdlTextChannel;

.field private static final TAG:Ljava/lang/String; = "PyMCL-SdlText"

.field private static volatile broken:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/input/NativeSdlTextChannel;

    invoke-direct {v0}, Lcom/pymcl/runtime/input/NativeSdlTextChannel;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/input/NativeSdlTextChannel;->INSTANCE:Lcom/pymcl/runtime/input/NativeSdlTextChannel;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public available()Z
    .locals 1

    .line 45
    sget-boolean v0, Lcom/pymcl/runtime/input/NativeSdlTextChannel;->broken:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->safeIsSdlRenderActive()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public commit(Ljava/lang/String;)Z
    .locals 4
    .param p1, "text"    # Ljava/lang/String;

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    sget-boolean v0, Lcom/pymcl/runtime/input/NativeSdlTextChannel;->broken:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 50
    :cond_0
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->safeIsNativeTextInputActive()Z

    move-result v0

    const-string v2, "PyMCL-SdlText"

    const/4 v3, 0x1

    if-nez v0, :cond_1

    invoke-static {v3}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->safeSetNativeTextInputActive(Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 51
    const-string v0, "native text input unavailable"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 52
    :cond_1
    :try_start_0
    invoke-static {p1}, Lorg/libsdl/app/PyMclSdlText;->commitText(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, v3

    goto :goto_0

    :catchall_0
    move-exception v0

    .local v0, "e":Ljava/lang/Throwable;
    sput-boolean v3, Lcom/pymcl/runtime/input/NativeSdlTextChannel;->broken:Z

    const-string v3, "nativeCommitText failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .end local v0    # "e":Ljava/lang/Throwable;
    :goto_0
    return v1
.end method

.method public controlChar(C)Z
    .locals 4
    .param p1, "c"    # C

    .line 56
    sget-boolean v0, Lcom/pymcl/runtime/input/NativeSdlTextChannel;->broken:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 57
    :cond_0
    const/4 v0, 0x1

    :try_start_0
    invoke-static {p1}, Lorg/libsdl/app/PyMclSdlText;->controlChar(C)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, v0

    goto :goto_0

    :catchall_0
    move-exception v2

    .local v2, "e":Ljava/lang/Throwable;
    sput-boolean v0, Lcom/pymcl/runtime/input/NativeSdlTextChannel;->broken:Z

    const-string v0, "PyMCL-SdlText"

    const-string v3, "nativeGenerateScancodeForUnichar failed"

    invoke-static {v0, v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .end local v2    # "e":Ljava/lang/Throwable;
    :goto_0
    return v1
.end method
