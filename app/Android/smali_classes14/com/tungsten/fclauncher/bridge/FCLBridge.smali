.class public Lcom/tungsten/fclauncher/bridge/FCLBridge;
.super Ljava/lang/Object;
.source "FCLBridge.java"


# static fields
.field public static final Button1:I = 0x0

.field public static final Button2:I = 0x1

.field public static final Button3:I = 0x2

.field public static final Button4:I = 0x3

.field public static final Button5:I = 0x4

.field public static final Button6:I = 0x5

.field public static final Button7:I = 0x6

.field public static final ButtonPress:I = 0x4

.field public static final ButtonRelease:I = 0x5

.field public static final ConfigureNotify:I = 0x16

.field public static final CursorDisabled:I = 0x0

.field public static final CursorEnabled:I = 0x1

.field public static final DEFAULT_HEIGHT:I = 0x2d0

.field public static final DEFAULT_WIDTH:I = 0x500

.field public static final FCLMessage:I = 0x25

.field public static FORCE_RESOLUTION:Z = false

.field public static FORCE_RESOLUTION_HEIGHT:I = 0x0

.field public static FORCE_RESOLUTION_SCALE:F = 0.0f

.field public static FORCE_RESOLUTION_START_SIZE:I = 0x0

.field public static FORCE_RESOLUTION_WIDTH:I = 0x0

.field public static final KeyChar:I = 0x7

.field public static final KeyPress:I = 0x2

.field public static final KeyRelease:I = 0x3

.field public static final MotionNotify:I = 0x6


# instance fields
.field private callback:Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

.field private volatile cleanroomActive:Z

.field private controller:Ljava/lang/String;

.field private gameDir:Ljava/lang/String;

.field private handler:Landroid/os/Handler;

.field private hasTouchController:Z

.field private java:Ljava/lang/String;

.field private logPath:Ljava/lang/String;

.field private modSummary:Ljava/lang/String;

.field private renderer:Ljava/lang/String;

.field private scaleFactor:D

.field private surface:Landroid/view/Surface;

.field private surfaceDestroyed:Z

.field private surfaceTexture:Landroid/graphics/SurfaceTexture;

.field private thread:Ljava/lang/Thread;


# direct methods
.method public static synthetic $r8$lambda$Fwn36zeA9rRrhuHoIpFgMskM9E8(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->lambda$handleWindow$3(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic $r8$lambda$IEWwDex0z5ibqo68UXFl3wMVKYo(Lcom/tungsten/fclauncher/bridge/FCLBridge;)V
    .locals 0

    invoke-direct {p0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->lambda$handleWindow$4()V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 36
    const/4 v0, 0x0

    sput-boolean v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION:Z

    .line 37
    const/high16 v0, -0x40800000    # -1.0f

    sput v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION_SCALE:F

    .line 38
    const/16 v0, 0x780

    sput v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION_WIDTH:I

    .line 39
    const/16 v0, 0x438

    sput v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION_HEIGHT:I

    .line 40
    const/4 v0, -0x1

    sput v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION_START_SIZE:I

    .line 88
    const-string v0, "fcl"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 89
    const-string v0, "pojavexec_awt"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 90
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->scaleFactor:D

    .line 68
    const-string v0, "Default"

    iput-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->controller:Ljava/lang/String;

    .line 79
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->hasTouchController:Z

    .line 81
    iput-boolean v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->cleanroomActive:Z

    .line 93
    return-void
.end method

.method public static getFps()I
    .locals 1

    .line 444
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->getFps()I

    move-result v0

    return v0
.end method

.method public static native getJavaVMPointer()J
.end method

.method private handleWindow()V
    .locals 3

    .line 411
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->gameDir:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 412
    const-string v0, "invoke setFCLNativeWindow\n"

    invoke-virtual {p0, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->receiveLog(Ljava/lang/String;)V

    .line 413
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->surface:Landroid/view/Surface;

    invoke-static {v0}, Lorg/lwjgl/glfw/CallbackBridge;->setupBridgeWindow(Ljava/lang/Object;)V

    goto :goto_0

    .line 415
    :cond_0
    const-string v0, "start Android AWT Renderer thread\n"

    invoke-virtual {p0, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->receiveLog(Ljava/lang/String;)V

    .line 416
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/tungsten/fclauncher/bridge/FCLBridge$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lcom/tungsten/fclauncher/bridge/FCLBridge$$ExternalSyntheticLambda3;-><init>(Lcom/tungsten/fclauncher/bridge/FCLBridge;)V

    const-string v2, "AndroidAWTRenderer"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 439
    .local v0, "canvasThread":Ljava/lang/Thread;
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 441
    .end local v0    # "canvasThread":Ljava/lang/Thread;
    :goto_0
    return-void
.end method

.method public static initForceResolution(Lcom/tungsten/fcl/setting/MenuSetting;)V
    .locals 1
    .param p0, "menuSetting"    # Lcom/tungsten/fcl/setting/MenuSetting;

    .line 224
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/tungsten/fcl/setting/MenuSetting;->isForceResolution()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION:Z

    .line 225
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/tungsten/fcl/setting/MenuSetting;->getForceResolutionWidth()I

    move-result v0

    goto :goto_1

    :cond_1
    const/16 v0, 0x780

    :goto_1
    sput v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION_WIDTH:I

    .line 226
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/tungsten/fcl/setting/MenuSetting;->getForceResolutionHeight()I

    move-result v0

    goto :goto_2

    :cond_2
    const/16 v0, 0x438

    :goto_2
    sput v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION_HEIGHT:I

    .line 227
    return-void
.end method

.method public static native initializeHooks()V
.end method

.method public static native jObjectToString(Ljava/lang/Object;)Ljava/lang/String;
.end method

.method private synthetic lambda$handleWindow$3(Ljava/lang/Throwable;)V
    .locals 2
    .param p1, "throwable"    # Ljava/lang/Throwable;

    .line 434
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->receiveLog(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic lambda$handleWindow$4()V
    .locals 11

    .line 418
    const/16 v0, 0x2d0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/16 v2, 0x500

    invoke-static {v2, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 419
    .local v3, "rgbArrayBitmap":Landroid/graphics/Bitmap;
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    move-object v1, v0

    .line 421
    .local v1, "paint":Landroid/graphics/Paint;
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->surfaceDestroyed:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->surface:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 422
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->surface:Landroid/view/Surface;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/Surface;->lockCanvas(Landroid/graphics/Rect;)Landroid/graphics/Canvas;

    move-result-object v0

    .line 423
    .local v0, "canvas":Landroid/graphics/Canvas;
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v2}, Landroid/graphics/Canvas;->drawRGB(III)V

    .line 424
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->renderAWTScreenFrame()[I

    move-result-object v4

    .line 425
    .local v4, "rgbArray":[I
    if-eqz v4, :cond_0

    .line 426
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 427
    const/16 v9, 0x500

    const/16 v10, 0x2d0

    const/4 v5, 0x0

    const/16 v6, 0x500

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 428
    const/4 v2, 0x0

    invoke-virtual {v0, v3, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 429
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 431
    :cond_0
    iget-object v2, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->surface:Landroid/view/Surface;

    invoke-virtual {v2, v0}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 432
    .end local v4    # "rgbArray":[I
    goto :goto_0

    .line 435
    .end local v0    # "canvas":Landroid/graphics/Canvas;
    :cond_1
    goto :goto_1

    .line 433
    :catchall_0
    move-exception v0

    .line 434
    .local v0, "throwable":Ljava/lang/Throwable;
    iget-object v2, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->handler:Landroid/os/Handler;

    new-instance v4, Lcom/tungsten/fclauncher/bridge/FCLBridge$$ExternalSyntheticLambda4;

    invoke-direct {v4, p0, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge$$ExternalSyntheticLambda4;-><init>(Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/Throwable;)V

    invoke-virtual {v2, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 436
    .end local v0    # "throwable":Ljava/lang/Throwable;
    :goto_1
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 437
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->surface:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 438
    return-void
.end method

.method static synthetic lambda$openLink$0(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 4
    .param p0, "link"    # Ljava/lang/String;
    .param p1, "activity"    # Landroid/app/Activity;

    .line 277
    move-object v0, p0

    .line 278
    .local v0, "targetLink":Ljava/lang/String;
    :try_start_0
    const-string v1, "file:"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 279
    const-string v1, "^file:/+"

    const-string v2, "/"

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 280
    .end local v0    # "targetLink":Ljava/lang/String;
    .local v1, "targetLink":Ljava/lang/String;
    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 281
    .end local v1    # "targetLink":Ljava/lang/String;
    .restart local v0    # "targetLink":Ljava/lang/String;
    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-static {v0, v2}, Ljava/nio/file/Paths;->get(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    move-result-object v2

    invoke-interface {v2}, Ljava/nio/file/Path;->normalize()Ljava/nio/file/Path;

    move-result-object v2

    invoke-interface {v2}, Ljava/nio/file/Path;->toAbsolutePath()Ljava/nio/file/Path;

    move-result-object v2

    .line 282
    .local v2, "path":Ljava/nio/file/Path;
    new-array v1, v1, [Ljava/nio/file/LinkOption;

    invoke-static {v2, v1}, Ljava/nio/file/Files;->isDirectory(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 284
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/pymcl/runtime/RuntimeHost;->openFolder(Landroid/app/Activity;Ljava/lang/String;)V

    .line 285
    return-void

    .line 288
    .end local v2    # "path":Ljava/nio/file/Path;
    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 290
    .local v1, "intent":Landroid/content/Intent;
    const-string v2, "http"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 291
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .local v2, "uri":Landroid/net/Uri;
    goto :goto_0

    .line 293
    .end local v2    # "uri":Landroid/net/Uri;
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".provider"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v2, v3}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    .line 295
    .restart local v2    # "uri":Landroid/net/Uri;
    :goto_0
    const-string v3, "*/*"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 296
    const-string v3, ""

    invoke-static {v1, v3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 299
    .end local v0    # "targetLink":Ljava/lang/String;
    .end local v1    # "intent":Landroid/content/Intent;
    .end local v2    # "uri":Landroid/net/Uri;
    goto :goto_1

    .line 297
    :catch_0
    move-exception v0

    .line 298
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "link:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " err:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "openLink error"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 300
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_1
    return-void
.end method

.method static synthetic lambda$putClipboardData$2(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "mimeType"    # Ljava/lang/String;
    .param p2, "data"    # Ljava/lang/String;

    .line 332
    const-string v0, "clipboard"

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 333
    .local v0, "clipboard":Landroid/content/ClipboardManager;
    const/4 v1, 0x0

    .line 334
    .local v1, "clipData":Landroid/content/ClipData;
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    :cond_0
    goto :goto_0

    :sswitch_0
    const-string v2, "text/plain"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :sswitch_1
    const-string v2, "text/html"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :goto_0
    const/4 v2, -0x1

    :goto_1
    const-string v3, "AWT Paste"

    packed-switch v2, :pswitch_data_0

    goto :goto_2

    .line 339
    :pswitch_0
    invoke-static {v3, p2, p2}, Landroid/content/ClipData;->newHtmlText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)Landroid/content/ClipData;

    move-result-object v1

    goto :goto_2

    .line 336
    :pswitch_1
    invoke-static {v3, p2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v1

    .line 337
    nop

    .line 341
    :goto_2
    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 342
    :cond_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4081b8b3 -> :sswitch_1
        0x30b78e68 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic lambda$querySystemClipboard$1(Landroid/content/ClipboardManager;)V
    .locals 5
    .param p0, "clipboard"    # Landroid/content/ClipboardManager;

    .line 310
    invoke-virtual {p0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v0

    .line 311
    .local v0, "clipData":Landroid/content/ClipData;
    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 312
    invoke-static {v1, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->nativeClipboardReceived(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    return-void

    .line 315
    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v2

    .line 317
    .local v2, "firstClipItem":Landroid/content/ClipData$Item;
    invoke-virtual {v2}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    .line 318
    .local v3, "clipItemText":Ljava/lang/CharSequence;
    if-nez v3, :cond_1

    .line 319
    invoke-static {v1, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->nativeClipboardReceived(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    return-void

    .line 322
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "plain"

    invoke-static {v1, v4}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->nativeClipboardReceived(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    return-void
.end method

.method public static native nativeClipboardReceived(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static openLink(Ljava/lang/String;)V
    .locals 2
    .param p0, "link"    # Ljava/lang/String;

    .line 271
    invoke-static {}, Lcom/tungsten/fcl/FCLApp;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 272
    .local v0, "activity":Landroid/app/Activity;
    if-nez v0, :cond_0

    .line 273
    return-void

    .line 275
    :cond_0
    new-instance v1, Lcom/tungsten/fclauncher/bridge/FCLBridge$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge$$ExternalSyntheticLambda1;-><init>(Ljava/lang/String;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 301
    return-void
.end method

.method public static pushEventLookDelta(FF)V
    .locals 1
    .param p0, "x"    # F
    .param p1, "y"    # F

    .line 212
    sget-boolean v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION:Z

    if-eqz v0, :cond_0

    .line 213
    sget v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION_SCALE:F

    div-float/2addr p0, v0

    .line 214
    sget v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION_SCALE:F

    div-float/2addr p1, v0

    .line 216
    :cond_0
    invoke-static {p0, p1}, Lorg/lwjgl/glfw/CallbackBridge;->sendCursorDelta(FF)V

    .line 217
    return-void
.end method

.method public static putClipboardData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "data"    # Ljava/lang/String;
    .param p1, "mimeType"    # Ljava/lang/String;

    .line 327
    invoke-static {}, Lcom/tungsten/fcl/FCLApp;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 328
    .local v0, "activity":Landroid/app/Activity;
    if-nez v0, :cond_0

    .line 329
    return-void

    .line 331
    :cond_0
    new-instance v1, Lcom/tungsten/fclauncher/bridge/FCLBridge$$ExternalSyntheticLambda0;

    invoke-direct {v1, v0, p1, p0}, Lcom/tungsten/fclauncher/bridge/FCLBridge$$ExternalSyntheticLambda0;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 343
    return-void
.end method

.method public static querySystemClipboard()V
    .locals 3

    .line 304
    invoke-static {}, Lcom/tungsten/fcl/FCLApp;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 305
    .local v0, "activity":Landroid/app/Activity;
    if-nez v0, :cond_0

    .line 306
    return-void

    .line 308
    :cond_0
    invoke-static {}, Lcom/tungsten/fcl/FCLApp;->getAppContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "clipboard"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    .line 309
    .local v1, "clipboard":Landroid/content/ClipboardManager;
    new-instance v2, Lcom/tungsten/fclauncher/bridge/FCLBridge$$ExternalSyntheticLambda2;

    invoke-direct {v2, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge$$ExternalSyntheticLambda2;-><init>(Landroid/content/ClipboardManager;)V

    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 324
    return-void
.end method


# virtual methods
.method public native chdir(Ljava/lang/String;)I
.end method

.method public native dlopen(Ljava/lang/String;)J
.end method

.method public execute(Landroid/view/Surface;Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;)V
    .locals 3
    .param p1, "surface"    # Landroid/view/Surface;
    .param p2, "callback"    # Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    .line 148
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->handler:Landroid/os/Handler;

    .line 149
    iput-object p2, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->callback:Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    .line 150
    iput-object p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->surface:Landroid/view/Surface;

    .line 151
    invoke-static {p0}, Lorg/lwjgl/glfw/CallbackBridge;->setFCLBridge(Lcom/tungsten/fclauncher/bridge/FCLBridge;)V

    .line 152
    iget-boolean v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->cleanroomActive:Z

    invoke-static {v0}, Lorg/lwjgl/glfw/CallbackBridge;->setCleanroomActive(Z)V

    .line 153
    const-string v0, "==================== Before Start ====================\n"

    invoke-virtual {p0, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->receiveLog(Ljava/lang/String;)V

    .line 154
    const-string v0, "invoke redirectStdio\n"

    invoke-virtual {p0, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->receiveLog(Ljava/lang/String;)V

    .line 155
    invoke-virtual {p0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->getLogPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->redirectStdio(Ljava/lang/String;)I

    move-result v0

    .line 156
    .local v0, "errorCode":I
    if-eqz v0, :cond_0

    .line 157
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t exec redirectStdio! Error code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->receiveLog(Ljava/lang/String;)V

    .line 159
    :cond_0
    const-string v1, "invoke setLogPipeReady\n"

    invoke-virtual {p0, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->receiveLog(Ljava/lang/String;)V

    .line 161
    if-eqz p1, :cond_1

    .line 162
    invoke-direct {p0}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->handleWindow()V

    .line 164
    :cond_1
    const-string v1, "invoke setEventPipe\n"

    invoke-virtual {p0, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->receiveLog(Ljava/lang/String;)V

    .line 167
    iget-object v1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->thread:Ljava/lang/Thread;

    if-eqz v1, :cond_2

    .line 168
    iget-object v1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->thread:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 170
    :cond_2
    return-void
.end method

.method public getCallback()Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->callback:Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    return-object v0
.end method

.method public getController()Ljava/lang/String;
    .locals 1

    .line 358
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->controller:Ljava/lang/String;

    return-object v0
.end method

.method public getGameDir()Ljava/lang/String;
    .locals 1

    .line 367
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->gameDir:Ljava/lang/String;

    return-object v0
.end method

.method public getJava()Ljava/lang/String;
    .locals 1

    .line 384
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->java:Ljava/lang/String;

    return-object v0
.end method

.method public getLogPath()Ljava/lang/String;
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->logPath:Ljava/lang/String;

    return-object v0
.end method

.method public getModSummary()Ljava/lang/String;
    .locals 1

    .line 448
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->modSummary:Ljava/lang/String;

    return-object v0
.end method

.method public getPrimaryClipString()Ljava/lang/String;
    .locals 3

    .line 262
    invoke-static {}, Lcom/tungsten/fcl/FCLApp;->getAppContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 263
    .local v0, "clipboard":Landroid/content/ClipboardManager;
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v1

    if-nez v1, :cond_0

    .line 264
    const/4 v1, 0x0

    return-object v1

    .line 266
    :cond_0
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v1

    .line 267
    .local v1, "item":Landroid/content/ClipData$Item;
    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public getRenderer()Ljava/lang/String;
    .locals 1

    .line 376
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->renderer:Ljava/lang/String;

    return-object v0
.end method

.method public getScaleFactor()D
    .locals 2

    .line 350
    iget-wide v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->scaleFactor:D

    return-wide v0
.end method

.method public getSurfaceTexture()Landroid/graphics/SurfaceTexture;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    return-object v0
.end method

.method public getThread()Ljava/lang/Thread;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->thread:Ljava/lang/Thread;

    return-object v0
.end method

.method public hasTouchController()Z
    .locals 1

    .line 456
    iget-boolean v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->hasTouchController:Z

    return v0
.end method

.method public isSurfaceDestroyed()Z
    .locals 1

    .line 392
    iget-boolean v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->surfaceDestroyed:Z

    return v0
.end method

.method public native nativeMoveWindow(II)V
.end method

.method public native nativeSendData(IIIII)V
.end method

.method public onExit(I)V
    .locals 3
    .param p1, "code"    # I

    .line 243
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->callback:Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->callback:Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\nOpenJDK exited with code : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;->onLog(Ljava/lang/String;)V

    .line 245
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->callback:Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    invoke-interface {v0, p1}, Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;->onExit(I)V

    .line 247
    :cond_0
    return-void
.end method

.method public pushEventChar(C)V
    .locals 1
    .param p1, "keyChar"    # C

    .line 234
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lorg/lwjgl/glfw/CallbackBridge;->sendChar(CI)V

    .line 235
    return-void
.end method

.method public pushEventKey(IIZ)V
    .locals 3
    .param p1, "keyCode"    # I
    .param p2, "keyChar"    # I
    .param p3, "press"    # Z

    .line 230
    int-to-char v0, p2

    const/4 v1, 0x0

    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->getCurrentMods()I

    move-result v2

    invoke-static {p1, v0, v1, v2, p3}, Lorg/lwjgl/glfw/CallbackBridge;->sendKeycode(ICIIZ)V

    .line 231
    return-void
.end method

.method public pushEventMouseButton(IZ)V
    .locals 4
    .param p1, "button"    # I
    .param p2, "press"    # Z

    .line 173
    const-wide/16 v0, 0x0

    packed-switch p1, :pswitch_data_0

    .line 185
    invoke-static {p1, p2}, Lorg/lwjgl/glfw/CallbackBridge;->sendMouseButton(IZ)V

    goto :goto_0

    .line 180
    :pswitch_0
    if-eqz p2, :cond_0

    .line 181
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    invoke-static {v0, v1, v2, v3}, Lorg/lwjgl/glfw/CallbackBridge;->sendScroll(DD)V

    goto :goto_0

    .line 175
    :pswitch_1
    if-eqz p2, :cond_0

    .line 176
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, v2, v3}, Lorg/lwjgl/glfw/CallbackBridge;->sendScroll(DD)V

    .line 187
    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public pushEventPointer(FF)V
    .locals 3
    .param p1, "x"    # F
    .param p2, "y"    # F

    .line 196
    sget-boolean v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION:Z

    if-eqz v0, :cond_0

    .line 197
    sget v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION_START_SIZE:I

    int-to-float v0, v0

    sub-float v0, p1, v0

    sget v1, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION_SCALE:F

    div-float/2addr v0, v1

    .line 198
    .end local p1    # "x":F
    .local v0, "x":F
    sget p1, Lcom/tungsten/fclauncher/bridge/FCLBridge;->FORCE_RESOLUTION_SCALE:F

    div-float/2addr p2, p1

    goto :goto_0

    .line 200
    .end local v0    # "x":F
    .restart local p1    # "x":F
    :cond_0
    iget-wide v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->scaleFactor:D

    double-to-float v0, v0

    mul-float/2addr v0, p1

    .line 201
    .end local p1    # "x":F
    .restart local v0    # "x":F
    iget-wide v1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->scaleFactor:D

    double-to-float p1, v1

    mul-float/2addr p2, p1

    .line 203
    :goto_0
    invoke-static {v0, p2}, Lorg/lwjgl/glfw/CallbackBridge;->sendCursorPos(FF)V

    .line 204
    return-void
.end method

.method public pushEventWindow(II)V
    .locals 0
    .param p1, "width"    # I
    .param p2, "height"    # I

    .line 238
    invoke-static {p1, p2}, Lorg/lwjgl/glfw/CallbackBridge;->sendUpdateWindowSize(II)V

    .line 239
    return-void
.end method

.method public receiveLog(Ljava/lang/String;)V
    .locals 1
    .param p1, "log"    # Ljava/lang/String;

    .line 405
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->callback:Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->callback:Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    invoke-interface {v0, p1}, Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;->onLog(Ljava/lang/String;)V

    .line 408
    :cond_0
    return-void
.end method

.method public native redirectStdio(Ljava/lang/String;)I
.end method

.method public native renderAWTScreenFrame()[I
.end method

.method public setCleanroomActive(Z)V
    .locals 0
    .param p1, "cleanroomActive"    # Z

    .line 84
    iput-boolean p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->cleanroomActive:Z

    .line 85
    return-void
.end method

.method public setController(Ljava/lang/String;)V
    .locals 0
    .param p1, "controller"    # Ljava/lang/String;

    .line 354
    iput-object p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->controller:Ljava/lang/String;

    .line 355
    return-void
.end method

.method public setCursorMode(I)V
    .locals 1
    .param p1, "mode"    # I

    .line 250
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->callback:Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    if-eqz v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->callback:Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    invoke-interface {v0, p1}, Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;->onCursorModeChange(I)V

    .line 253
    :cond_0
    return-void
.end method

.method public setGameDir(Ljava/lang/String;)V
    .locals 0
    .param p1, "gameDir"    # Ljava/lang/String;

    .line 362
    iput-object p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->gameDir:Ljava/lang/String;

    .line 363
    return-void
.end method

.method public setHasTouchController(Z)V
    .locals 0
    .param p1, "hasTouchController"    # Z

    .line 460
    iput-boolean p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->hasTouchController:Z

    .line 461
    return-void
.end method

.method public setJava(Ljava/lang/String;)V
    .locals 0
    .param p1, "java"    # Ljava/lang/String;

    .line 380
    iput-object p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->java:Ljava/lang/String;

    .line 381
    return-void
.end method

.method public native setLdLibraryPath(Ljava/lang/String;)V
.end method

.method public setLogPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "logPath"    # Ljava/lang/String;

    .line 401
    iput-object p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->logPath:Ljava/lang/String;

    .line 402
    return-void
.end method

.method public setModSummary(Ljava/lang/String;)V
    .locals 0
    .param p1, "modSummary"    # Ljava/lang/String;

    .line 452
    iput-object p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->modSummary:Ljava/lang/String;

    .line 453
    return-void
.end method

.method public setPrimaryClipString(Ljava/lang/String;)V
    .locals 2
    .param p1, "string"    # Ljava/lang/String;

    .line 256
    invoke-static {}, Lcom/tungsten/fcl/FCLApp;->getAppContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 257
    .local v0, "clipboard":Landroid/content/ClipboardManager;
    const-string v1, "FCL Clipboard"

    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v1

    .line 258
    .local v1, "clip":Landroid/content/ClipData;
    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 259
    return-void
.end method

.method public setRenderer(Ljava/lang/String;)V
    .locals 0
    .param p1, "renderer"    # Ljava/lang/String;

    .line 371
    iput-object p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->renderer:Ljava/lang/String;

    .line 372
    return-void
.end method

.method public setScaleFactor(D)V
    .locals 0
    .param p1, "scaleFactor"    # D

    .line 346
    iput-wide p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->scaleFactor:D

    .line 347
    return-void
.end method

.method public setSurfaceDestroyed(Z)V
    .locals 0
    .param p1, "surfaceDestroyed"    # Z

    .line 388
    iput-boolean p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->surfaceDestroyed:Z

    .line 389
    return-void
.end method

.method public setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V
    .locals 0
    .param p1, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;

    .line 140
    iput-object p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 141
    return-void
.end method

.method public setThread(Ljava/lang/Thread;)V
    .locals 0
    .param p1, "thread"    # Ljava/lang/Thread;

    .line 128
    iput-object p1, p0, Lcom/tungsten/fclauncher/bridge/FCLBridge;->thread:Ljava/lang/Thread;

    .line 129
    return-void
.end method

.method public native setenv(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public native setupExitTrap(Lcom/tungsten/fclauncher/bridge/FCLBridge;)V
.end method
