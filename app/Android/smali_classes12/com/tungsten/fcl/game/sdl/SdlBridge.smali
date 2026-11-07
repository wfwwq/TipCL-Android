.class public final Lcom/tungsten/fcl/game/sdl/SdlBridge;
.super Ljava/lang/Object;
.source "SdlBridge.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tungsten/fcl/game/sdl/SdlBridge$UrlOpener;
    }
.end annotation


# static fields
.field public static final KEY_SDL_AUTO_SHOW_IME:Ljava/lang/String; = "sdl_auto_show_ime"

.field public static final PREFS_LAUNCHER:Ljava/lang/String; = "launcher"

.field private static final TAG:Ljava/lang/String; = "PyMCL-SDL"

.field private static activityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private static currentSource:Ljava/lang/Object;

.field private static currentSurface:Landroid/view/Surface;

.field private static volatile enabled:Z

.field private static jniReady:Z

.field private static layoutRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/ViewGroup;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile onGameImeTakeover:Ljava/lang/Runnable;

.field private static sdlInitialized:Z

.field private static surfaceGeneration:J

.field public static volatile urlOpener:Lcom/tungsten/fcl/game/sdl/SdlBridge$UrlOpener;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static beginSurfaceDestroy(Ljava/lang/Object;Landroid/view/Surface;)Z
    .locals 1
    .param p0, "source"    # Ljava/lang/Object;
    .param p1, "surface"    # Landroid/view/Surface;

    .line 155
    if-eqz p0, :cond_0

    sget-object v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->currentSource:Ljava/lang/Object;

    if-ne v0, p0, :cond_0

    if-eqz p1, :cond_0

    sget-object v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->currentSurface:Landroid/view/Surface;

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static declared-synchronized clearSdlInitialized()V
    .locals 2

    const-class v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;

    monitor-enter v0

    .line 89
    const/4 v1, 0x0

    :try_start_0
    sput-boolean v1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->sdlInitialized:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    .line 89
    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized ensureHostContext()Z
    .locals 6

    const-class v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;

    monitor-enter v0

    .line 64
    const/4 v1, 0x0

    :try_start_0
    invoke-static {}, Lorg/libsdl/app/SDL;->getContext()Landroid/app/Activity;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    monitor-exit v0

    return v3

    .line 65
    :cond_0
    :try_start_1
    sget-object v2, Lcom/tungsten/fcl/game/sdl/SdlBridge;->activityRef:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    sget-object v2, Lcom/tungsten/fcl/game/sdl/SdlBridge;->activityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 66
    .local v2, "a":Landroid/app/Activity;
    :goto_0
    if-nez v2, :cond_2

    invoke-static {}, Lcom/tungsten/fcl/FCLApp;->getActivity()Landroid/app/Activity;

    move-result-object v4

    move-object v2, v4

    .line 67
    :cond_2
    if-nez v2, :cond_3

    const-string v3, "PyMCL-SDL"

    const-string v4, "SDL host context missing, keep SDL disabled"

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return v1

    .line 68
    :cond_3
    :try_start_2
    invoke-static {}, Lorg/libsdl/app/SDL;->initialize()V

    .line 69
    invoke-static {v2}, Lorg/libsdl/app/SDL;->setContext(Landroid/app/Activity;)V

    .line 70
    const-string v4, "PyMCL-SDL"

    const-string v5, "SDL host context attached without surface (non-SDL-render instance)"

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    monitor-exit v0

    return v3

    .line 72
    .end local v2    # "a":Landroid/app/Activity;
    :catchall_0
    move-exception v2

    .local v2, "t":Ljava/lang/Throwable;
    :try_start_3
    const-string v3, "PyMCL-SDL"

    const-string v4, "ensureHostContext"

    invoke-static {v3, v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v0

    return v1

    .line 63
    .end local v2    # "t":Ljava/lang/Throwable;
    :catchall_1
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method public static getSdlEnabled()Z
    .locals 1

    .line 92
    sget-boolean v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->enabled:Z

    return v0
.end method

.method public static getSdlImeAutoShowEnabled()Z
    .locals 4

    .line 97
    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/tungsten/fcl/FCLApp;->getAppContext()Landroid/content/Context;

    move-result-object v1

    .line 99
    .local v1, "c":Landroid/content/Context;
    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->get(Landroid/content/Context;)Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    move-result-object v2

    const-string v3, "sdl_auto_show_ime"

    invoke-virtual {v2, v3, v0}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    .line 100
    .end local v1    # "c":Landroid/content/Context;
    :catchall_0
    move-exception v1

    .local v1, "t":Ljava/lang/Throwable;
    return v0
.end method

.method public static native initializeControllerSubsystems()V
.end method

.method public static native isNativeTextInputActive()Z
.end method

.method public static native isSdlRenderActive()Z
.end method

.method static synthetic lambda$openUrl$0(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3
    .param p0, "a"    # Landroid/app/Activity;
    .param p1, "url"    # Ljava/lang/String;

    .line 184
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    goto :goto_0

    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "openUrl "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "PyMCL-SDL"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 186
    .end local v0    # "t":Ljava/lang/Throwable;
    :goto_0
    return-void
.end method

.method public static declared-synchronized markSdlInitialized()Z
    .locals 2

    const-class v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;

    monitor-enter v0

    .line 84
    :try_start_0
    sget-boolean v1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->sdlInitialized:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    .line 85
    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->sdlInitialized:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    monitor-exit v0

    return v1

    .line 83
    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public static notifyGameImeTakeover()V
    .locals 4

    .line 173
    sget-object v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->onGameImeTakeover:Ljava/lang/Runnable;

    .line 174
    .local v0, "r":Ljava/lang/Runnable;
    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .local v1, "t":Ljava/lang/Throwable;
    const-string v2, "PyMCL-SDL"

    const-string v3, "ime takeover"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 175
    .end local v1    # "t":Ljava/lang/Throwable;
    :cond_0
    :goto_0
    return-void
.end method

.method public static openUrl(Ljava/lang/String;)Z
    .locals 4
    .param p0, "url"    # Ljava/lang/String;

    .line 178
    sget-object v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->urlOpener:Lcom/tungsten/fcl/game/sdl/SdlBridge$UrlOpener;

    .line 179
    .local v0, "o":Lcom/tungsten/fcl/game/sdl/SdlBridge$UrlOpener;
    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0, p0}, Lcom/tungsten/fcl/game/sdl/SdlBridge$UrlOpener;->open(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v1

    :catchall_0
    move-exception v1

    .local v1, "t":Ljava/lang/Throwable;
    const-string v2, "PyMCL-SDL"

    const-string v3, "openUrl"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 181
    .end local v1    # "t":Ljava/lang/Throwable;
    :cond_0
    const/4 v1, 0x0

    :try_start_1
    invoke-static {}, Lorg/libsdl/app/SDL;->getContext()Landroid/app/Activity;

    move-result-object v2

    .line 182
    .local v2, "a":Landroid/app/Activity;
    if-nez v2, :cond_1

    return v1

    .line 183
    :cond_1
    new-instance v3, Lcom/tungsten/fcl/game/sdl/SdlBridge$$ExternalSyntheticLambda0;

    invoke-direct {v3, v2, p0}, Lcom/tungsten/fcl/game/sdl/SdlBridge$$ExternalSyntheticLambda0;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 187
    const/4 v1, 0x1

    return v1

    .line 188
    .end local v2    # "a":Landroid/app/Activity;
    :catchall_1
    move-exception v2

    .local v2, "t":Ljava/lang/Throwable;
    return v1
.end method

.method public static prepareSurface(Landroid/app/Activity;Landroid/view/Surface;Landroid/view/ViewGroup;Ljava/lang/Object;)V
    .locals 4
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "surface"    # Landroid/view/Surface;
    .param p2, "layout"    # Landroid/view/ViewGroup;
    .param p3, "source"    # Ljava/lang/Object;

    .line 108
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->activityRef:Ljava/lang/ref/WeakReference;

    .line 109
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->layoutRef:Ljava/lang/ref/WeakReference;

    .line 110
    sput-object p1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->currentSurface:Landroid/view/Surface;

    .line 111
    sput-object p3, Lcom/tungsten/fcl/game/sdl/SdlBridge;->currentSource:Ljava/lang/Object;

    .line 112
    sget-wide v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->surfaceGeneration:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    sput-wide v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->surfaceGeneration:J

    .line 113
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getSDLSurface()Lorg/libsdl/app/SDLSurface;

    move-result-object v0

    if-nez v0, :cond_0

    .line 114
    invoke-static {}, Lorg/libsdl/app/SDL;->initialize()V

    .line 115
    invoke-static {p0}, Lorg/libsdl/app/SDL;->setContext(Landroid/app/Activity;)V

    .line 116
    new-instance v0, Lorg/libsdl/app/SDLSurface;

    invoke-direct {v0, p0}, Lorg/libsdl/app/SDLSurface;-><init>(Landroid/content/Context;)V

    invoke-static {v0, p2, p1}, Lorg/libsdl/app/SDLActivity;->externalInitialize(Lorg/libsdl/app/SDLSurface;Landroid/view/ViewGroup;Landroid/view/Surface;)V

    goto :goto_0

    .line 118
    :cond_0
    invoke-static {p1}, Lorg/libsdl/app/SDLSurface;->setNativeSurface(Landroid/view/Surface;)V

    .line 120
    :goto_0
    return-void
.end method

.method public static registerSurface(Landroid/app/Activity;Landroid/view/Surface;Landroid/view/ViewGroup;)V
    .locals 1
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "surface"    # Landroid/view/Surface;
    .param p2, "layout"    # Landroid/view/ViewGroup;

    .line 129
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->activityRef:Ljava/lang/ref/WeakReference;

    .line 130
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->layoutRef:Ljava/lang/ref/WeakReference;

    .line 131
    sput-object p1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->currentSurface:Landroid/view/Surface;

    .line 132
    return-void
.end method

.method public static declared-synchronized reset()V
    .locals 4

    const-class v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;

    monitor-enter v0

    .line 163
    const/4 v1, 0x0

    :try_start_0
    sput-object v1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->currentSurface:Landroid/view/Surface;

    sput-object v1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->currentSource:Ljava/lang/Object;

    const-wide/16 v2, 0x0

    sput-wide v2, Lcom/tungsten/fcl/game/sdl/SdlBridge;->surfaceGeneration:J

    .line 164
    sput-object v1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->activityRef:Ljava/lang/ref/WeakReference;

    sput-object v1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->layoutRef:Ljava/lang/ref/WeakReference;

    .line 165
    const/4 v1, 0x0

    sput-boolean v1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->jniReady:Z

    sput-boolean v1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->sdlInitialized:Z

    sput-boolean v1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->enabled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 166
    :try_start_1
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->clearSdlBridgeState()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 167
    :goto_0
    :try_start_2
    invoke-static {}, Lorg/libsdl/app/SDLSurface;->clearNativeSurface()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    .line 168
    :goto_1
    :try_start_3
    invoke-static {}, Lorg/libsdl/app/SDL;->initialize()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v1

    .line 169
    :goto_2
    monitor-exit v0

    return-void

    .line 162
    :catchall_3
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw v1
.end method

.method public static safeIsNativeTextInputActive()Z
    .locals 2

    .line 193
    :try_start_0
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->isNativeTextInputActive()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    const/4 v1, 0x0

    return v1
.end method

.method public static safeIsSdlRenderActive()Z
    .locals 2

    .line 191
    :try_start_0
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->isSdlRenderActive()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    const/4 v1, 0x0

    return v1
.end method

.method public static safePrepareSurface(Landroid/app/Activity;Landroid/view/Surface;Landroid/view/ViewGroup;Ljava/lang/Object;)Z
    .locals 3
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "surface"    # Landroid/view/Surface;
    .param p2, "layout"    # Landroid/view/ViewGroup;
    .param p3, "source"    # Ljava/lang/Object;

    .line 124
    :try_start_0
    invoke-static {p0, p1, p2, p3}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->prepareSurface(Landroid/app/Activity;Landroid/view/Surface;Landroid/view/ViewGroup;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    return v0

    .line 125
    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    const-string v1, "PyMCL-SDL"

    const-string v2, "SDL prepareSurface failed, GLFW only"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v1, 0x0

    return v1
.end method

.method public static safeSetNativeTextInputActive(Z)Z
    .locals 2
    .param p0, "a"    # Z

    .line 192
    :try_start_0
    invoke-static {p0}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->setNativeTextInputActive(Z)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    const/4 v1, 0x0

    return v1
.end method

.method public static native setNativeTextInputActive(Z)Z
.end method

.method public static setSdlEnabled(Z)V
    .locals 0
    .param p0, "v"    # Z

    .line 91
    sput-boolean p0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->enabled:Z

    return-void
.end method

.method public static declared-synchronized setupJNI()Z
    .locals 3

    const-class v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;

    monitor-enter v0

    .line 77
    :try_start_0
    sget-boolean v1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->jniReady:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    monitor-exit v0

    return v2

    .line 78
    :cond_0
    :try_start_1
    invoke-static {}, Lorg/libsdl/app/SDL;->setupJNI()V

    .line 79
    sput-boolean v2, Lcom/tungsten/fcl/game/sdl/SdlBridge;->jniReady:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    monitor-exit v0

    return v2

    .line 76
    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public static syncResolution(II)V
    .locals 3
    .param p0, "width"    # I
    .param p1, "height"    # I

    .line 139
    sget-boolean v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->enabled:Z

    if-nez v0, :cond_0

    return-void

    .line 141
    :cond_0
    :try_start_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getSDLSurface()Lorg/libsdl/app/SDLSurface;

    move-result-object v0

    .line 142
    .local v0, "s":Lorg/libsdl/app/SDLSurface;
    if-nez v0, :cond_1

    return-void

    .line 143
    :cond_1
    invoke-virtual {v0}, Lorg/libsdl/app/SDLSurface;->surfaceChanged()V

    .line 144
    invoke-virtual {v0, p0, p1}, Lorg/libsdl/app/SDLSurface;->nativeResize(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    .end local v0    # "s":Lorg/libsdl/app/SDLSurface;
    goto :goto_0

    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    const-string v1, "PyMCL-SDL"

    const-string v2, "syncResolution"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 146
    .end local v0    # "t":Ljava/lang/Throwable;
    :goto_0
    return-void
.end method

.method public static unregisterSurface(Landroid/view/Surface;)V
    .locals 1
    .param p0, "surface"    # Landroid/view/Surface;

    .line 159
    if-eqz p0, :cond_0

    sget-object v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->currentSurface:Landroid/view/Surface;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    sput-object v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->currentSurface:Landroid/view/Surface;

    sput-object v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->currentSource:Ljava/lang/Object;

    .line 160
    :cond_0
    return-void
.end method
