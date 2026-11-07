.class public Lorg/libsdl/app/SDLActivity;
.super Landroid/app/Activity;
.source "SDLActivity.java"

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/libsdl/app/SDLActivity$NativeState;,
        Lorg/libsdl/app/SDLActivity$SDLFileDialogState;,
        Lorg/libsdl/app/SDLActivity$SDLCommandHandler;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field protected static final COMMAND_CHANGE_TITLE:I = 0x1

.field protected static final COMMAND_CHANGE_WINDOW_STYLE:I = 0x2

.field protected static final COMMAND_SET_KEEP_SCREEN_ON:I = 0x5

.field protected static final COMMAND_TEXTEDIT_HIDE:I = 0x3

.field protected static final COMMAND_USER:I = 0x8000

.field private static final SDL_MAJOR_VERSION:I = 0x3

.field private static final SDL_MICRO_VERSION:I = 0xc

.field private static final SDL_MINOR_VERSION:I = 0x4

.field protected static final SDL_ORIENTATION_LANDSCAPE:I = 0x1

.field protected static final SDL_ORIENTATION_LANDSCAPE_FLIPPED:I = 0x2

.field protected static final SDL_ORIENTATION_PORTRAIT:I = 0x3

.field protected static final SDL_ORIENTATION_PORTRAIT_FLIPPED:I = 0x4

.field protected static final SDL_ORIENTATION_UNKNOWN:I = 0x0

.field private static final SDL_SYSTEM_CURSOR_ARROW:I = 0x0

.field private static final SDL_SYSTEM_CURSOR_CROSSHAIR:I = 0x3

.field private static final SDL_SYSTEM_CURSOR_HAND:I = 0xb

.field private static final SDL_SYSTEM_CURSOR_IBEAM:I = 0x1

.field private static final SDL_SYSTEM_CURSOR_NO:I = 0xa

.field private static final SDL_SYSTEM_CURSOR_SIZEALL:I = 0x9

.field private static final SDL_SYSTEM_CURSOR_SIZENESW:I = 0x6

.field private static final SDL_SYSTEM_CURSOR_SIZENS:I = 0x8

.field private static final SDL_SYSTEM_CURSOR_SIZENWSE:I = 0x5

.field private static final SDL_SYSTEM_CURSOR_SIZEWE:I = 0x7

.field private static final SDL_SYSTEM_CURSOR_WAIT:I = 0x2

.field private static final SDL_SYSTEM_CURSOR_WAITARROW:I = 0x4

.field private static final SDL_SYSTEM_CURSOR_WINDOW_BOTTOM:I = 0x11

.field private static final SDL_SYSTEM_CURSOR_WINDOW_BOTTOMLEFT:I = 0x12

.field private static final SDL_SYSTEM_CURSOR_WINDOW_BOTTOMRIGHT:I = 0x10

.field private static final SDL_SYSTEM_CURSOR_WINDOW_LEFT:I = 0x13

.field private static final SDL_SYSTEM_CURSOR_WINDOW_RIGHT:I = 0xf

.field private static final SDL_SYSTEM_CURSOR_WINDOW_TOP:I = 0xd

.field private static final SDL_SYSTEM_CURSOR_WINDOW_TOPLEFT:I = 0xc

.field private static final SDL_SYSTEM_CURSOR_WINDOW_TOPRIGHT:I = 0xe

.field private static final TAG:Ljava/lang/String; = "SDL"

.field static commandHandler:Landroid/os/Handler;

.field protected static mActivityCreated:Z

.field public static mBrokenLibraries:Z

.field protected static mClipboardHandler:Lorg/libsdl/app/SDLClipboardHandler;

.field protected static mCurrentLocale:Ljava/util/Locale;

.field public static mCurrentNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

.field protected static mCurrentRotation:I

.field protected static mCursors:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/Integer;",
            "Landroid/view/PointerIcon;",
            ">;"
        }
    .end annotation
.end field

.field protected static mDispatchingKeyEvent:Z

.field private static mFileDialogState:Lorg/libsdl/app/SDLActivity$SDLFileDialogState;

.field protected static mFullscreenModeActive:Z

.field protected static mHIDDeviceManager:Lorg/libsdl/app/HIDDeviceManager;

.field public static mHasFocus:Z

.field public static final mHasMultiWindow:Z

.field public static mIsResumedCalled:Z

.field protected static mLastCursorID:I

.field protected static mLayout:Landroid/view/ViewGroup;

.field protected static mMotionListener:Lorg/libsdl/app/SDLGenericMotionListener_API14;

.field public static mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

.field protected static mSDLMainFinished:Z

.field protected static mSDLThread:Ljava/lang/Thread;

.field protected static mSingleton:Landroid/app/Activity;

.field protected static mSurface:Lorg/libsdl/app/SDLSurface;


# instance fields
.field private final rehideSystemUi:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 66
    nop

    .line 176
    const/4 v0, 0x1

    sput-boolean v0, Lorg/libsdl/app/SDLActivity;->mHasMultiWindow:Z

    .line 219
    sput-boolean v0, Lorg/libsdl/app/SDLActivity;->mBrokenLibraries:Z

    .line 233
    const/4 v0, 0x0

    sput-boolean v0, Lorg/libsdl/app/SDLActivity;->mSDLMainFinished:Z

    .line 234
    sput-boolean v0, Lorg/libsdl/app/SDLActivity;->mActivityCreated:Z

    .line 235
    const/4 v1, 0x0

    sput-object v1, Lorg/libsdl/app/SDLActivity;->mFileDialogState:Lorg/libsdl/app/SDLActivity$SDLFileDialogState;

    .line 236
    sput-boolean v0, Lorg/libsdl/app/SDLActivity;->mDispatchingKeyEvent:Z

    .line 1058
    new-instance v0, Lorg/libsdl/app/SDLActivity$SDLCommandHandler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/libsdl/app/SDLActivity$SDLCommandHandler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lorg/libsdl/app/SDLActivity;->commandHandler:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 1728
    new-instance v0, Lorg/libsdl/app/SDLActivity$2;

    invoke-direct {v0, p0}, Lorg/libsdl/app/SDLActivity$2;-><init>(Lorg/libsdl/app/SDLActivity;)V

    iput-object v0, p0, Lorg/libsdl/app/SDLActivity;->rehideSystemUi:Ljava/lang/Runnable;

    return-void
.end method

.method public static clipboardGetText()Ljava/lang/String;
    .locals 1

    .line 1765
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mClipboardHandler:Lorg/libsdl/app/SDLClipboardHandler;

    invoke-virtual {v0}, Lorg/libsdl/app/SDLClipboardHandler;->clipboardGetText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static clipboardHasText()Z
    .locals 1

    .line 1758
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mClipboardHandler:Lorg/libsdl/app/SDLClipboardHandler;

    invoke-virtual {v0}, Lorg/libsdl/app/SDLClipboardHandler;->clipboardHasText()Z

    move-result v0

    return v0
.end method

.method public static clipboardSetText(Ljava/lang/String;)V
    .locals 1
    .param p0, "string"    # Ljava/lang/String;

    .line 1772
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mClipboardHandler:Lorg/libsdl/app/SDLClipboardHandler;

    invoke-virtual {v0, p0}, Lorg/libsdl/app/SDLClipboardHandler;->clipboardSetText(Ljava/lang/String;)V

    .line 1773
    return-void
.end method

.method public static commitTextInput(Ljava/lang/String;)V
    .locals 1
    .param p0, "text"    # Ljava/lang/String;

    .line 393
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/libsdl/app/SDLInputConnection;->nativeCommitText(Ljava/lang/String;I)V

    .line 394
    return-void
.end method

.method public static createCustomCursor([IIIII)I
    .locals 5
    .param p0, "colors"    # [I
    .param p1, "width"    # I
    .param p2, "height"    # I
    .param p3, "hotSpotX"    # I
    .param p4, "hotSpotY"    # I

    .line 1779
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p0, p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1780
    .local v0, "bitmap":Landroid/graphics/Bitmap;
    sget v1, Lorg/libsdl/app/SDLActivity;->mLastCursorID:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lorg/libsdl/app/SDLActivity;->mLastCursorID:I

    .line 1782
    nop

    .line 1784
    :try_start_0
    sget-object v1, Lorg/libsdl/app/SDLActivity;->mCursors:Ljava/util/Hashtable;

    sget v2, Lorg/libsdl/app/SDLActivity;->mLastCursorID:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    int-to-float v3, p3

    int-to-float v4, p4

    invoke-static {v0, v3, v4}, Landroid/view/PointerIcon;->create(Landroid/graphics/Bitmap;FF)Landroid/view/PointerIcon;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1787
    nop

    .line 1791
    sget v1, Lorg/libsdl/app/SDLActivity;->mLastCursorID:I

    return v1

    .line 1785
    :catch_0
    move-exception v1

    .line 1786
    .local v1, "e":Ljava/lang/Exception;
    const/4 v2, 0x0

    return v2
.end method

.method public static destroyCustomCursor(I)V
    .locals 2
    .param p0, "cursorID"    # I

    .line 1798
    nop

    .line 1800
    :try_start_0
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mCursors:Ljava/util/Hashtable;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1802
    goto :goto_0

    .line 1801
    :catch_0
    move-exception v0

    .line 1804
    :goto_0
    return-void
.end method

.method public static disableSDLEditKeyboard()V
    .locals 1

    .line 401
    sget-object v0, Lorg/libsdl/app/SdlImeController$Source;->LAUNCHER:Lorg/libsdl/app/SdlImeController$Source;

    invoke-static {v0}, Lorg/libsdl/app/SdlImeController;->requestHide(Lorg/libsdl/app/SdlImeController$Source;)V

    .line 402
    return-void
.end method

.method public static dispatchingKeyEvent()Z
    .locals 1

    .line 898
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mDispatchingKeyEvent:Z

    return v0
.end method

.method public static enableSDLEditKeyboard()V
    .locals 1

    .line 397
    sget-object v0, Lorg/libsdl/app/SdlImeController$Source;->LAUNCHER:Lorg/libsdl/app/SdlImeController$Source;

    invoke-static {v0}, Lorg/libsdl/app/SdlImeController;->requestShow(Lorg/libsdl/app/SdlImeController$Source;)V

    .line 398
    return-void
.end method

.method public static externalInitialize(Lorg/libsdl/app/SDLSurface;Landroid/view/ViewGroup;Landroid/view/Surface;)V
    .locals 2
    .param p0, "surface"    # Lorg/libsdl/app/SDLSurface;
    .param p1, "layout"    # Landroid/view/ViewGroup;
    .param p2, "nativeSurface"    # Landroid/view/Surface;

    .line 358
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v0

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    .line 359
    sput-object p0, Lorg/libsdl/app/SDLActivity;->mSurface:Lorg/libsdl/app/SDLSurface;

    .line 360
    invoke-static {p2}, Lorg/libsdl/app/SDLSurface;->setNativeSurface(Landroid/view/Surface;)V

    .line 361
    invoke-static {}, Lorg/libsdl/app/SdlImeController;->reset()V

    .line 362
    sput-object p1, Lorg/libsdl/app/SDLActivity;->mLayout:Landroid/view/ViewGroup;

    .line 363
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    invoke-static {v0}, Lorg/libsdl/app/SDL;->setContext(Landroid/app/Activity;)V

    .line 364
    new-instance v0, Lorg/libsdl/app/SDLClipboardHandler;

    invoke-direct {v0}, Lorg/libsdl/app/SDLClipboardHandler;-><init>()V

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mClipboardHandler:Lorg/libsdl/app/SDLClipboardHandler;

    .line 365
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mCursors:Ljava/util/Hashtable;

    .line 366
    const/4 v0, 0x0

    sput v0, Lorg/libsdl/app/SDLActivity;->mLastCursorID:I

    .line 368
    const/4 v1, 0x0

    sput-object v1, Lorg/libsdl/app/SDLActivity;->mSDLThread:Ljava/lang/Thread;

    .line 369
    sput-boolean v0, Lorg/libsdl/app/SDLActivity;->mIsResumedCalled:Z

    .line 370
    const/4 v0, 0x1

    sput-boolean v0, Lorg/libsdl/app/SDLActivity;->mHasFocus:Z

    .line 371
    sget-object v0, Lorg/libsdl/app/SDLActivity$NativeState;->INIT:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 372
    sget-object v0, Lorg/libsdl/app/SDLActivity$NativeState;->INIT:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mCurrentNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 373
    return-void
.end method

.method public static formatLocale(Ljava/util/Locale;)Ljava/lang/String;
    .locals 5
    .param p0, "locale"    # Ljava/util/Locale;

    .line 2095
    const-string v0, ""

    .line 2096
    .local v0, "result":Ljava/lang/String;
    const-string v1, ""

    .line 2097
    .local v1, "lang":Ljava/lang/String;
    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "in"

    const-string v4, ""

    if-ne v2, v3, :cond_0

    .line 2099
    const-string v1, "id"

    goto :goto_0

    .line 2100
    :cond_0
    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    if-ne v2, v4, :cond_1

    .line 2102
    const-string v1, "und"

    goto :goto_0

    .line 2104
    :cond_1
    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 2107
    :goto_0
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    if-ne v2, v4, :cond_2

    .line 2108
    move-object v0, v1

    goto :goto_1

    .line 2110
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2112
    :goto_1
    return-object v0
.end method

.method public static forwardGenericMotionToSDL(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1
    .param p0, "view"    # Landroid/view/View;
    .param p1, "event"    # Landroid/view/MotionEvent;

    .line 255
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getMotionListener()Lorg/libsdl/app/SDLGenericMotionListener_API14;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lorg/libsdl/app/SDLGenericMotionListener_API14;->onGenericMotion(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public static getContentView()Landroid/view/View;
    .locals 1

    .line 1457
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mLayout:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public static getContext()Landroid/app/Activity;
    .locals 1

    .line 1334
    invoke-static {}, Lorg/libsdl/app/SDL;->getContext()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public static getCurrentRotation()I
    .locals 4

    .line 663
    const/4 v0, 0x0

    .line 665
    .local v0, "result":I
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v1

    .line 666
    .local v1, "activity":Landroid/app/Activity;
    if-eqz v1, :cond_0

    .line 667
    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    .line 668
    .local v2, "display":Landroid/view/Display;
    invoke-virtual {v2}, Landroid/view/Display;->getRotation()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 679
    :pswitch_0
    const/16 v0, 0x10e

    goto :goto_0

    .line 676
    :pswitch_1
    const/16 v0, 0xb4

    .line 677
    goto :goto_0

    .line 673
    :pswitch_2
    const/16 v0, 0x5a

    .line 674
    goto :goto_0

    .line 670
    :pswitch_3
    const/4 v0, 0x0

    .line 671
    nop

    .line 683
    .end local v2    # "display":Landroid/view/Display;
    :cond_0
    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getDiagonal()D
    .locals 10

    .line 1369
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 1370
    .local v0, "metrics":Landroid/util/DisplayMetrics;
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v1

    .line 1371
    .local v1, "activity":Landroid/app/Activity;
    if-nez v1, :cond_0

    .line 1372
    const-wide/16 v2, 0x0

    return-wide v2

    .line 1374
    :cond_0
    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 1376
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v2, v2

    iget v4, v0, Landroid/util/DisplayMetrics;->xdpi:F

    float-to-double v4, v4

    div-double/2addr v2, v4

    .line 1377
    .local v2, "dWidthInches":D
    iget v4, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-double v4, v4

    iget v6, v0, Landroid/util/DisplayMetrics;->ydpi:F

    float-to-double v6, v6

    div-double/2addr v4, v6

    .line 1379
    .local v4, "dHeightInches":D
    mul-double v6, v2, v2

    mul-double v8, v4, v4

    add-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    return-wide v6
.end method

.method public static getManifestEnvironmentVariables()Z
    .locals 9

    .line 1429
    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_0

    .line 1430
    return v0

    .line 1433
    :cond_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 1434
    .local v1, "applicationInfo":Landroid/content/pm/ApplicationInfo;
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 1435
    .local v2, "bundle":Landroid/os/Bundle;
    if-nez v2, :cond_1

    .line 1436
    return v0

    .line 1438
    :cond_1
    const-string v3, "SDL_ENV."

    .line 1439
    .local v3, "prefix":Ljava/lang/String;
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    .line 1440
    .local v4, "trimLength":I
    invoke-virtual {v2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 1441
    .local v6, "key":Ljava/lang/String;
    invoke-virtual {v6, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 1442
    invoke-virtual {v6, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 1443
    .local v7, "name":Ljava/lang/String;
    invoke-virtual {v2, v6}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1444
    .local v8, "value":Ljava/lang/String;
    invoke-static {v7, v8}, Lorg/libsdl/app/SDLActivity;->nativeSetenv(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1446
    .end local v6    # "key":Ljava/lang/String;
    .end local v7    # "name":Ljava/lang/String;
    .end local v8    # "value":Ljava/lang/String;
    :cond_2
    goto :goto_0

    .line 1448
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 1449
    .end local v1    # "applicationInfo":Landroid/content/pm/ApplicationInfo;
    .end local v2    # "bundle":Landroid/os/Bundle;
    .end local v3    # "prefix":Ljava/lang/String;
    .end local v4    # "trimLength":I
    :catch_0
    move-exception v1

    .line 1450
    .local v1, "e":Ljava/lang/Exception;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exception "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "SDL"

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1452
    .end local v1    # "e":Ljava/lang/Exception;
    return v0
.end method

.method public static getMotionListener()Lorg/libsdl/app/SDLGenericMotionListener_API14;
    .locals 2

    .line 239
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mMotionListener:Lorg/libsdl/app/SDLGenericMotionListener_API14;

    if-nez v0, :cond_1

    .line 240
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 241
    new-instance v0, Lorg/libsdl/app/SDLGenericMotionListener_API29;

    invoke-direct {v0}, Lorg/libsdl/app/SDLGenericMotionListener_API29;-><init>()V

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mMotionListener:Lorg/libsdl/app/SDLGenericMotionListener_API14;

    goto :goto_0

    .line 242
    :cond_0
    nop

    .line 243
    new-instance v0, Lorg/libsdl/app/SDLGenericMotionListener_API26;

    invoke-direct {v0}, Lorg/libsdl/app/SDLGenericMotionListener_API26;-><init>()V

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mMotionListener:Lorg/libsdl/app/SDLGenericMotionListener_API14;

    .line 251
    :cond_1
    :goto_0
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mMotionListener:Lorg/libsdl/app/SDLGenericMotionListener_API14;

    return-object v0
.end method

.method public static getNativeSurface()Landroid/view/Surface;
    .locals 1

    .line 1578
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSurface:Lorg/libsdl/app/SDLSurface;

    if-nez v0, :cond_0

    .line 1579
    const/4 v0, 0x0

    return-object v0

    .line 1581
    :cond_0
    invoke-static {}, Lorg/libsdl/app/SDLSurface;->getNativeSurface()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public static getNaturalOrientation()I
    .locals 7

    .line 643
    const/4 v0, 0x0

    .line 645
    .local v0, "result":I
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v1

    .line 646
    .local v1, "activity":Landroid/app/Activity;
    if-eqz v1, :cond_5

    .line 647
    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    .line 648
    .local v2, "config":Landroid/content/res/Configuration;
    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    .line 649
    .local v3, "display":Landroid/view/Display;
    invoke-virtual {v3}, Landroid/view/Display;->getRotation()I

    move-result v4

    .line 650
    .local v4, "rotation":I
    const/4 v5, 0x2

    if-eqz v4, :cond_0

    if-ne v4, v5, :cond_1

    :cond_0
    iget v6, v2, Landroid/content/res/Configuration;->orientation:I

    if-eq v6, v5, :cond_4

    :cond_1
    const/4 v5, 0x1

    if-eq v4, v5, :cond_2

    const/4 v6, 0x3

    if-ne v4, v6, :cond_3

    :cond_2
    iget v6, v2, Landroid/content/res/Configuration;->orientation:I

    if-ne v6, v5, :cond_3

    goto :goto_0

    .line 656
    :cond_3
    const/4 v0, 0x3

    goto :goto_1

    .line 654
    :cond_4
    :goto_0
    const/4 v0, 0x1

    .line 659
    .end local v2    # "config":Landroid/content/res/Configuration;
    .end local v3    # "display":Landroid/view/Display;
    .end local v4    # "rotation":I
    :cond_5
    :goto_1
    return v0
.end method

.method public static getPreferredLocales()Ljava/lang/String;
    .locals 5

    .line 2081
    const-string v0, ""

    .line 2082
    .local v0, "result":Ljava/lang/String;
    nop

    .line 2083
    invoke-static {}, Landroid/os/LocaleList;->getAdjustedDefault()Landroid/os/LocaleList;

    move-result-object v1

    .line 2084
    .local v1, "locales":Landroid/os/LocaleList;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {v1}, Landroid/os/LocaleList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 2085
    if-eqz v2, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2086
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v4

    invoke-static {v4}, Lorg/libsdl/app/SDLActivity;->formatLocale(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2084
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2088
    .end local v1    # "locales":Landroid/os/LocaleList;
    .end local v2    # "i":I
    :cond_1
    nop

    .line 2091
    return-object v0
.end method

.method public static getSDLSurface()Lorg/libsdl/app/SDLSurface;
    .locals 1

    .line 376
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSurface:Lorg/libsdl/app/SDLSurface;

    return-object v0
.end method

.method public static handleKeyEvent(Landroid/view/View;ILandroid/view/KeyEvent;Landroid/view/inputmethod/InputConnection;)Z
    .locals 6
    .param p0, "v"    # Landroid/view/View;
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;
    .param p3, "ic"    # Landroid/view/inputmethod/InputConnection;

    .line 1499
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1500
    :cond_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v0

    .line 1501
    .local v0, "deviceId":I
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getSource()I

    move-result v2

    .line 1503
    .local v2, "source":I
    if-nez v2, :cond_1

    .line 1504
    invoke-static {v0}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v3

    .line 1505
    .local v3, "device":Landroid/view/InputDevice;
    if-eqz v3, :cond_1

    .line 1506
    invoke-virtual {v3}, Landroid/view/InputDevice;->getSources()I

    move-result v2

    .line 1523
    .end local v3    # "device":Landroid/view/InputDevice;
    :cond_1
    invoke-static {v0}, Lorg/libsdl/app/SDLControllerManager;->isDeviceSDLJoystick(I)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    .line 1525
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    if-nez v3, :cond_2

    .line 1526
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getScanCode()I

    move-result v3

    invoke-static {v0, p1, v3}, Lorg/libsdl/app/SDLControllerManager;->onNativePadDown(III)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1527
    return v4

    .line 1529
    :cond_2
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    if-ne v3, v4, :cond_3

    .line 1530
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getScanCode()I

    move-result v3

    invoke-static {v0, p1, v3}, Lorg/libsdl/app/SDLControllerManager;->onNativePadUp(III)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1531
    return v4

    .line 1536
    :cond_3
    and-int/lit16 v3, v2, 0x2002

    const/16 v5, 0x2002

    if-ne v3, v5, :cond_6

    .line 1537
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->isVRHeadset()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_0

    .line 1542
    :cond_4
    const/4 v3, 0x4

    if-eq p1, v3, :cond_5

    const/16 v3, 0x7d

    if-ne p1, v3, :cond_6

    .line 1543
    :cond_5
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 1548
    :pswitch_0
    return v4

    .line 1554
    :cond_6
    :goto_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    if-nez v3, :cond_9

    .line 1555
    invoke-static {p1}, Lorg/libsdl/app/SDLActivity;->onNativeKeyDown(I)V

    .line 1558
    invoke-static {p2}, Lorg/libsdl/app/SDLActivity;->isTextInputEvent(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, Lorg/libsdl/app/SdlImeController;->isInputAccepted()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 1559
    if-eqz p3, :cond_7

    .line 1560
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v1

    int-to-char v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p3, v1, v4}, Landroid/view/inputmethod/InputConnection;->commitText(Ljava/lang/CharSequence;I)Z

    goto :goto_1

    .line 1562
    :cond_7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v1

    int-to-char v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lorg/libsdl/app/SDLInputConnection;->nativeCommitText(Ljava/lang/String;I)V

    .line 1565
    :cond_8
    :goto_1
    return v4

    .line 1566
    :cond_9
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    if-ne v3, v4, :cond_a

    .line 1567
    invoke-static {p1}, Lorg/libsdl/app/SDLActivity;->onNativeKeyUp(I)V

    .line 1568
    return v4

    .line 1571
    :cond_a
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static handleNativeState()V
    .locals 2

    .line 904
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    sget-object v1, Lorg/libsdl/app/SDLActivity;->mCurrentNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    if-ne v0, v1, :cond_0

    .line 906
    return-void

    .line 910
    :cond_0
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    sget-object v1, Lorg/libsdl/app/SDLActivity$NativeState;->INIT:Lorg/libsdl/app/SDLActivity$NativeState;

    if-ne v0, v1, :cond_1

    .line 912
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mCurrentNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 913
    return-void

    .line 917
    :cond_1
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    sget-object v1, Lorg/libsdl/app/SDLActivity$NativeState;->PAUSED:Lorg/libsdl/app/SDLActivity$NativeState;

    if-ne v0, v1, :cond_4

    .line 918
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSDLThread:Ljava/lang/Thread;

    if-eqz v0, :cond_2

    .line 919
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->nativePause()V

    .line 921
    :cond_2
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSurface:Lorg/libsdl/app/SDLSurface;

    if-eqz v0, :cond_3

    .line 922
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSurface:Lorg/libsdl/app/SDLSurface;

    invoke-virtual {v0}, Lorg/libsdl/app/SDLSurface;->handlePause()V

    .line 924
    :cond_3
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mCurrentNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 925
    return-void

    .line 929
    :cond_4
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    sget-object v1, Lorg/libsdl/app/SDLActivity$NativeState;->RESUMED:Lorg/libsdl/app/SDLActivity$NativeState;

    if-ne v0, v1, :cond_5

    .line 944
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSurface:Lorg/libsdl/app/SDLSurface;

    invoke-virtual {v0}, Lorg/libsdl/app/SDLSurface;->handleResume()V

    .line 946
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mCurrentNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 949
    :cond_5
    return-void
.end method

.method public static initTouch()V
    .locals 7

    .line 1590
    invoke-static {}, Landroid/view/InputDevice;->getDeviceIds()[I

    move-result-object v0

    .line 1592
    .local v0, "ids":[I
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget v3, v0, v2

    .line 1593
    .local v3, "id":I
    invoke-static {v3}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v4

    .line 1595
    .local v4, "device":Landroid/view/InputDevice;
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/view/InputDevice;->getSources()I

    move-result v5

    const/16 v6, 0x1002

    and-int/2addr v5, v6

    if-eq v5, v6, :cond_0

    .line 1596
    invoke-virtual {v4}, Landroid/view/InputDevice;->isVirtual()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 1598
    :cond_0
    invoke-virtual {v4}, Landroid/view/InputDevice;->getId()I

    move-result v5

    invoke-virtual {v4}, Landroid/view/InputDevice;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lorg/libsdl/app/SDLActivity;->nativeAddTouch(ILjava/lang/String;)V

    .line 1592
    .end local v3    # "id":I
    .end local v4    # "device":Landroid/view/InputDevice;
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1601
    :cond_2
    return-void
.end method

.method public static initialize()V
    .locals 2

    .line 337
    const/4 v0, 0x0

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    .line 338
    sput-object v0, Lorg/libsdl/app/SDLActivity;->mSurface:Lorg/libsdl/app/SDLSurface;

    .line 339
    invoke-static {}, Lorg/libsdl/app/SdlImeController;->reset()V

    .line 340
    sput-object v0, Lorg/libsdl/app/SDLActivity;->mLayout:Landroid/view/ViewGroup;

    .line 341
    sput-object v0, Lorg/libsdl/app/SDLActivity;->mClipboardHandler:Lorg/libsdl/app/SDLClipboardHandler;

    .line 342
    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    sput-object v1, Lorg/libsdl/app/SDLActivity;->mCursors:Ljava/util/Hashtable;

    .line 343
    const/4 v1, 0x0

    sput v1, Lorg/libsdl/app/SDLActivity;->mLastCursorID:I

    .line 344
    sput-object v0, Lorg/libsdl/app/SDLActivity;->mSDLThread:Ljava/lang/Thread;

    .line 345
    sput-boolean v1, Lorg/libsdl/app/SDLActivity;->mIsResumedCalled:Z

    .line 346
    const/4 v0, 0x1

    sput-boolean v0, Lorg/libsdl/app/SDLActivity;->mHasFocus:Z

    .line 347
    sget-object v0, Lorg/libsdl/app/SDLActivity$NativeState;->INIT:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 348
    sget-object v0, Lorg/libsdl/app/SDLActivity$NativeState;->INIT:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mCurrentNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 349
    return-void
.end method

.method public static isAndroidTV()Z
    .locals 4

    .line 1341
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "uimode"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/UiModeManager;

    .line 1342
    .local v0, "uiModeManager":Landroid/app/UiModeManager;
    invoke-virtual {v0}, Landroid/app/UiModeManager;->getCurrentModeType()I

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    .line 1343
    return v3

    .line 1345
    :cond_0
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v2, "MINIX"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "NEO-U1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1346
    return v3

    .line 1348
    :cond_1
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v2, "Amlogic"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1349
    const-string v2, "TV"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1350
    const-string v2, "X96-W"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1351
    const-string v2, "A95X-R1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1352
    :cond_2
    return v3

    .line 1354
    :cond_3
    const/4 v1, 0x0

    return v1
.end method

.method public static isChromebook()Z
    .locals 3

    .line 1395
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 1396
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "org.chromium.arc"

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1397
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "org.chromium.arc.device_management"

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1398
    :cond_0
    return v1

    .line 1403
    :cond_1
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    if-eqz v0, :cond_2

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "sdk_gpc_"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 1404
    .local v1, "isChromebookEmulator":Z
    :goto_0
    return v1
.end method

.method public static isDeXMode()Z
    .locals 5

    .line 1411
    nop

    .line 1415
    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 1416
    .local v1, "config":Landroid/content/res/Configuration;
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 1417
    .local v2, "configClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v3, "SEM_DESKTOP_MODE_ENABLED"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v3

    const-string v4, "semDesktopModeEnabled"

    .line 1418
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v3, v4, :cond_0

    const/4 v0, 0x1

    .line 1417
    :cond_0
    return v0

    .line 1419
    .end local v1    # "config":Landroid/content/res/Configuration;
    .end local v2    # "configClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :catch_0
    move-exception v1

    .line 1420
    .local v1, "ignored":Ljava/lang/Exception;
    return v0
.end method

.method public static isSDLEditKeyboardShown()Z
    .locals 1

    .line 406
    invoke-static {}, Lorg/libsdl/app/SdlImeController;->isKeyboardShown()Z

    move-result v0

    return v0
.end method

.method public static isSDLTextInputActive()Z
    .locals 1

    .line 388
    invoke-static {}, Lorg/libsdl/app/SdlImeController;->isTextInputActive()Z

    move-result v0

    return v0
.end method

.method public static isTablet()Z
    .locals 4

    .line 1387
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getDiagonal()D

    move-result-wide v0

    const-wide/high16 v2, 0x401c000000000000L    # 7.0

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isTextInputEvent(Landroid/view/KeyEvent;)Z
    .locals 3
    .param p0, "event"    # Landroid/view/KeyEvent;

    .line 1491
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1492
    return v1

    .line 1495
    :cond_0
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isPrintingKey()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x3e

    if-ne v0, v2, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public static isUsingSDLTextEdit()Z
    .locals 1

    .line 384
    invoke-static {}, Lorg/libsdl/app/SdlImeController;->isEditAvailable()Z

    move-result v0

    return v0
.end method

.method public static isVRHeadset()Z
    .locals 3

    .line 1358
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "Oculus"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "Quest"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1359
    return v1

    .line 1361
    :cond_0
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v2, "Pico"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1362
    return v1

    .line 1364
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic lambda$messageboxShowMessageBox$0([IILandroid/content/DialogInterface;I)V
    .locals 1
    .param p0, "selection"    # [I
    .param p1, "id"    # I
    .param p2, "dialog"    # Landroid/content/DialogInterface;
    .param p3, "which"    # I

    .line 1667
    const/4 v0, 0x0

    aput p1, p0, v0

    .line 1668
    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    .line 1669
    return-void
.end method

.method static synthetic lambda$messageboxShowMessageBox$1(Ljava/util/concurrent/CountDownLatch;Landroid/content/DialogInterface;)V
    .locals 0
    .param p0, "latch"    # Ljava/util/concurrent/CountDownLatch;
    .param p1, "unused"    # Landroid/content/DialogInterface;

    .line 1680
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method static synthetic lambda$messageboxShowMessageBox$2([IILandroid/app/AlertDialog;Landroid/view/View;)V
    .locals 1
    .param p0, "selection"    # [I
    .param p1, "id"    # I
    .param p2, "dialog"    # Landroid/app/AlertDialog;
    .param p3, "v"    # Landroid/view/View;

    .line 1684
    const/4 v0, 0x0

    aput p1, p0, v0

    .line 1685
    invoke-virtual {p2}, Landroid/app/AlertDialog;->dismiss()V

    .line 1686
    return-void
.end method

.method static synthetic lambda$messageboxShowMessageBox$3(Landroid/app/Activity;Ljava/lang/String;[ILjava/lang/String;[Ljava/lang/String;[ILjava/util/concurrent/CountDownLatch;)V
    .locals 8
    .param p0, "host"    # Landroid/app/Activity;
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "buttonIds"    # [I
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "buttonTexts"    # [Ljava/lang/String;
    .param p5, "selection"    # [I
    .param p6, "latch"    # Ljava/util/concurrent/CountDownLatch;

    .line 1638
    :try_start_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 1639
    .local v0, "builder":Landroid/app/AlertDialog$Builder;
    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1641
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1642
    .local v1, "extraButtons":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/widget/Button;>;"
    array-length v2, p2

    const/4 v3, 0x3

    if-le v2, v3, :cond_3

    .line 1643
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1644
    .local v2, "customView":Landroid/widget/LinearLayout;
    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1645
    if-eqz p3, :cond_1

    .line 1646
    new-instance v4, Landroid/widget/ScrollView;

    invoke-direct {v4, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 1647
    .local v4, "messageScroll":Landroid/widget/ScrollView;
    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1648
    .local v5, "messageView":Landroid/widget/TextView;
    invoke-virtual {v5, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1649
    invoke-virtual {v4, v5}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 1650
    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1652
    .end local v4    # "messageScroll":Landroid/widget/ScrollView;
    .end local v5    # "messageView":Landroid/widget/TextView;
    :cond_1
    const/4 v4, 0x3

    .local v4, "i":I
    :goto_0
    array-length v5, p2

    if-ge v4, v5, :cond_2

    .line 1653
    new-instance v5, Landroid/widget/Button;

    invoke-direct {v5, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 1654
    .local v5, "button":Landroid/widget/Button;
    aget-object v6, p4, v4

    invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 1655
    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1656
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1652
    nop

    .end local v5    # "button":Landroid/widget/Button;
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1658
    .end local v4    # "i":I
    :cond_2
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1659
    nop

    .end local v2    # "customView":Landroid/widget/LinearLayout;
    goto :goto_1

    :cond_3
    if-eqz p3, :cond_4

    .line 1660
    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1663
    :cond_4
    :goto_1
    array-length v2, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 1664
    .local v2, "slotCount":I
    const/4 v4, 0x0

    .restart local v4    # "i":I
    :goto_2
    if-ge v4, v2, :cond_7

    .line 1665
    aget v5, p2, v4

    .line 1666
    .local v5, "id":I
    new-instance v6, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda0;

    invoke-direct {v6, p5, v5}, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda0;-><init>([II)V

    .line 1670
    .local v6, "listener":Landroid/content/DialogInterface$OnClickListener;
    add-int/lit8 v7, v2, -0x1

    if-ne v4, v7, :cond_5

    .line 1671
    aget-object v7, p4, v4

    invoke-virtual {v0, v7, v6}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    goto :goto_3

    .line 1672
    :cond_5
    if-nez v4, :cond_6

    if-ne v2, v3, :cond_6

    .line 1673
    aget-object v7, p4, v4

    invoke-virtual {v0, v7, v6}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    goto :goto_3

    .line 1675
    :cond_6
    aget-object v7, p4, v4

    invoke-virtual {v0, v7, v6}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1664
    .end local v5    # "id":I
    .end local v6    # "listener":Landroid/content/DialogInterface$OnClickListener;
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 1679
    .end local v4    # "i":I
    :cond_7
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v3

    .line 1680
    .local v3, "dialog":Landroid/app/AlertDialog;
    new-instance v4, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda1;

    invoke-direct {v4, p6}, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda1;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 1681
    const/4 v4, 0x3

    .restart local v4    # "i":I
    :goto_4
    array-length v5, p2

    if-ge v4, v5, :cond_8

    .line 1682
    aget v5, p2, v4

    .line 1683
    .restart local v5    # "id":I
    add-int/lit8 v6, v4, -0x3

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    new-instance v7, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda2;

    invoke-direct {v7, p5, v5, v3}, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda2;-><init>([IILandroid/app/AlertDialog;)V

    invoke-virtual {v6, v7}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1681
    .end local v5    # "id":I
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 1688
    .end local v4    # "i":I
    :cond_8
    invoke-virtual {v3}, Landroid/app/AlertDialog;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1692
    .end local v0    # "builder":Landroid/app/AlertDialog$Builder;
    .end local v1    # "extraButtons":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/widget/Button;>;"
    .end local v2    # "slotCount":I
    .end local v3    # "dialog":Landroid/app/AlertDialog;
    goto :goto_5

    .line 1689
    :catchall_0
    move-exception v0

    .line 1690
    .local v0, "e":Ljava/lang/Throwable;
    const-string v1, "SDL"

    const-string v2, "Failed to show SDL message box"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1691
    invoke-virtual {p6}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1693
    .end local v0    # "e":Ljava/lang/Throwable;
    :goto_5
    return-void
.end method

.method public static manualBackButton()V
    .locals 1

    .line 854
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 855
    return-void
.end method

.method public static messageboxShowMessageBox(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;[I[I[Ljava/lang/String;[I)I
    .locals 8
    .param p0, "host"    # Landroid/app/Activity;
    .param p1, "flags"    # I
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "buttonFlags"    # [I
    .param p5, "buttonIds"    # [I
    .param p6, "buttonTexts"    # [Ljava/lang/String;
    .param p7, "colors"    # [I

    .line 1628
    const/4 v0, -0x1

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 1629
    :cond_0
    array-length v1, p4

    array-length v2, p5

    if-eq v1, v2, :cond_1

    array-length v1, p5

    array-length v2, p6

    if-eq v1, v2, :cond_1

    .line 1630
    return v0

    .line 1633
    :cond_1
    filled-new-array {v0}, [I

    move-result-object v6

    .line 1634
    .local v6, "selection":[I
    new-instance v7, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v7, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 1636
    .local v7, "latch":Ljava/util/concurrent/CountDownLatch;
    new-instance v0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;

    move-object v1, p0

    move-object v2, p2

    move-object v4, p3

    move-object v3, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v7}, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;-><init>(Landroid/app/Activity;Ljava/lang/String;[ILjava/lang/String;[Ljava/lang/String;[ILjava/util/concurrent/CountDownLatch;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1698
    :try_start_0
    invoke-virtual {v7}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1701
    goto :goto_0

    .line 1699
    :catch_0
    move-exception v0

    .line 1700
    .local v0, "ex":Ljava/lang/InterruptedException;
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 1703
    .end local v0    # "ex":Ljava/lang/InterruptedException;
    :goto_0
    const/4 v0, 0x0

    aget v0, v6, v0

    return v0

    .line 1628
    .end local v6    # "selection":[I
    .end local v7    # "latch":Ljava/util/concurrent/CountDownLatch;
    :cond_2
    :goto_1
    return v0
.end method

.method public static minimizeWindow()V
    .locals 2

    .line 1272
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 1273
    return-void

    .line 1276
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MAIN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1277
    .local v0, "startMain":Landroid/content/Intent;
    const-string v1, "android.intent.category.HOME"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1278
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1279
    sget-object v1, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1280
    return-void
.end method

.method public static native nativeAddTouch(ILjava/lang/String;)V
.end method

.method public static native nativeAllowRecreateActivity()Z
.end method

.method public static native nativeCheckSDLThreadCounter()I
.end method

.method public static native nativeCleanupMainThread()V
.end method

.method public static native nativeFocusChanged(Z)V
.end method

.method public static native nativeGetHint(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native nativeGetHintBoolean(Ljava/lang/String;Z)Z
.end method

.method public static native nativeGetVersion()Ljava/lang/String;
.end method

.method public static native nativeInitMainThread()V
.end method

.method public static native nativeLowMemory()V
.end method

.method public static native nativePause()V
.end method

.method public static native nativePermissionResult(IZ)V
.end method

.method public static native nativeQuit()V
.end method

.method public static native nativeResume()V
.end method

.method public static native nativeRunMain(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)I
.end method

.method public static native nativeSendQuit()V
.end method

.method public static native nativeSetNaturalOrientation(I)V
.end method

.method public static native nativeSetScreenResolution(IIIIFF)V
.end method

.method public static native nativeSetenv(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeSetupJNI()V
.end method

.method public static notifyImeVisibilityChanged(Z)V
    .locals 0
    .param p0, "visible"    # Z

    .line 1471
    invoke-static {p0}, Lorg/libsdl/app/SdlImeController;->notifyVisibilityChanged(Z)V

    .line 1472
    return-void
.end method

.method public static native onNativeAccel(FFF)V
.end method

.method public static native onNativeClipboardChanged()V
.end method

.method public static native onNativeDarkModeChanged(Z)V
.end method

.method public static native onNativeDropFile(Ljava/lang/String;)V
.end method

.method public static native onNativeFileDialog(I[Ljava/lang/String;I)V
.end method

.method public static native onNativeInsetsChanged(IIII)V
.end method

.method public static native onNativeKeyDown(I)V
.end method

.method public static native onNativeKeyUp(I)V
.end method

.method public static native onNativeKeyboardFocusLost()V
.end method

.method public static native onNativeLocaleChanged()V
.end method

.method public static native onNativeMouse(IIFFZ)V
.end method

.method public static native onNativePen(IIIIFFF)V
.end method

.method public static native onNativePinchEnd()V
.end method

.method public static native onNativePinchStart()V
.end method

.method public static native onNativePinchUpdate(F)V
.end method

.method public static native onNativeResize()V
.end method

.method public static native onNativeRotationChanged(I)V
.end method

.method public static native onNativeScreenKeyboardHidden()V
.end method

.method public static native onNativeScreenKeyboardShown()V
.end method

.method public static native onNativeSoftReturnKey()Z
.end method

.method public static native onNativeSurfaceChanged()V
.end method

.method public static native onNativeSurfaceCreated()V
.end method

.method public static native onNativeSurfaceDestroyed()V
.end method

.method public static onNativeTextInput(Ljava/lang/String;)V
    .locals 1
    .param p0, "text"    # Ljava/lang/String;

    .line 1479
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1483
    :cond_0
    const/4 v0, 0x1

    :try_start_0
    invoke-static {p0, v0}, Lorg/libsdl/app/SDLInputConnection;->nativeCommitText(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 1485
    goto :goto_0

    .line 1484
    :catch_0
    move-exception v0

    .line 1486
    :goto_0
    return-void

    .line 1480
    :cond_1
    :goto_1
    return-void
.end method

.method public static native onNativeTouch(IIIFFF)V
.end method

.method public static openFileDescriptor(Ljava/lang/String;Ljava/lang/String;)I
    .locals 3
    .param p0, "uri"    # Ljava/lang/String;
    .param p1, "mode"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1995
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    .line 1996
    return v1

    .line 2000
    :cond_0
    :try_start_0
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2, p1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    .line 2001
    .local v0, "pfd":Landroid/os/ParcelFileDescriptor;
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    move-result v1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return v1

    .line 2002
    .end local v0    # "pfd":Landroid/os/ParcelFileDescriptor;
    :catch_0
    move-exception v0

    .line 2003
    .local v0, "e":Ljava/io/FileNotFoundException;
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    .line 2004
    return v1
.end method

.method public static openURL(Ljava/lang/String;)Z
    .locals 1
    .param p0, "url"    # Ljava/lang/String;

    .line 1942
    invoke-static {p0}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->openUrl(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static requestPermission(Ljava/lang/String;I)V
    .locals 4
    .param p0, "permission"    # Ljava/lang/String;
    .param p1, "requestCode"    # I

    .line 1905
    nop

    .line 1913
    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v1

    .line 1914
    .local v1, "activity":Landroid/app/Activity;
    if-nez v1, :cond_0

    .line 1915
    invoke-static {p1, v0}, Lorg/libsdl/app/SDLActivity;->nativePermissionResult(IZ)V

    .line 1916
    return-void

    .line 1918
    :cond_0
    invoke-virtual {v1, p0}, Landroid/app/Activity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    .line 1919
    new-array v2, v3, [Ljava/lang/String;

    aput-object p0, v2, v0

    invoke-virtual {v1, v2, p1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_0

    .line 1921
    :cond_1
    invoke-static {p1, v3}, Lorg/libsdl/app/SDLActivity;->nativePermissionResult(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1926
    .end local v1    # "activity":Landroid/app/Activity;
    :goto_0
    goto :goto_1

    .line 1923
    :catchall_0
    move-exception v1

    .line 1924
    .local v1, "t":Ljava/lang/Throwable;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestPermission "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "SDL"

    invoke-static {v3, v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1925
    :try_start_1
    invoke-static {p1, v0}, Lorg/libsdl/app/SDLActivity;->nativePermissionResult(IZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 1927
    .end local v1    # "t":Ljava/lang/Throwable;
    :goto_1
    return-void
.end method

.method protected static sendCommand(ILjava/lang/Object;)Z
    .locals 9
    .param p0, "command"    # I
    .param p1, "data"    # Ljava/lang/Object;

    .line 1062
    sget-object v0, Lorg/libsdl/app/SDLActivity;->commandHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 1063
    .local v0, "msg":Landroid/os/Message;
    iput p0, v0, Landroid/os/Message;->arg1:I

    .line 1064
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1065
    sget-object v1, Lorg/libsdl/app/SDLActivity;->commandHandler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    move-result v1

    .line 1067
    .local v1, "result":Z
    const/4 v2, 0x2

    if-ne p0, v2, :cond_4

    .line 1071
    const/4 v2, 0x0

    .line 1073
    .local v2, "bShouldWait":Z
    instance-of v3, p1, Ljava/lang/Integer;

    if-eqz v3, :cond_3

    .line 1075
    sget-object v3, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    const-string v4, "window"

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/WindowManager;

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    .line 1076
    .local v3, "display":Landroid/view/Display;
    new-instance v4, Landroid/util/DisplayMetrics;

    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 1077
    .local v4, "realMetrics":Landroid/util/DisplayMetrics;
    invoke-virtual {v3, v4}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 1079
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    sget-object v6, Lorg/libsdl/app/SDLActivity;->mSurface:Lorg/libsdl/app/SDLSurface;

    invoke-virtual {v6}, Lorg/libsdl/app/SDLSurface;->getWidth()I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-ne v5, v6, :cond_0

    iget v5, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    sget-object v6, Lorg/libsdl/app/SDLActivity;->mSurface:Lorg/libsdl/app/SDLSurface;

    .line 1080
    invoke-virtual {v6}, Lorg/libsdl/app/SDLSurface;->getHeight()I

    move-result v6

    if-ne v5, v6, :cond_0

    move v5, v8

    goto :goto_0

    :cond_0
    move v5, v7

    .line 1082
    .local v5, "bFullscreenLayout":Z
    :goto_0
    move-object v6, p1

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v8, :cond_2

    .line 1088
    if-nez v5, :cond_1

    move v7, v8

    :cond_1
    move v2, v7

    goto :goto_1

    .line 1093
    :cond_2
    move v2, v5

    .line 1097
    .end local v3    # "display":Landroid/view/Display;
    .end local v4    # "realMetrics":Landroid/util/DisplayMetrics;
    .end local v5    # "bFullscreenLayout":Z
    :cond_3
    :goto_1
    if-eqz v2, :cond_4

    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 1107
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v3

    monitor-enter v3

    .line 1109
    :try_start_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v4

    const-wide/16 v5, 0x1f4

    invoke-virtual {v4, v5, v6}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1112
    goto :goto_2

    .line 1113
    :catchall_0
    move-exception v4

    goto :goto_3

    .line 1110
    :catch_0
    move-exception v4

    .line 1111
    .local v4, "ie":Ljava/lang/InterruptedException;
    :try_start_1
    invoke-virtual {v4}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 1113
    .end local v4    # "ie":Ljava/lang/InterruptedException;
    :goto_2
    monitor-exit v3

    goto :goto_4

    :goto_3
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v4

    .line 1117
    .end local v2    # "bShouldWait":Z
    :cond_4
    :goto_4
    return v1
.end method

.method public static sendMessage(II)Z
    .locals 1
    .param p0, "command"    # I
    .param p1, "param"    # I

    .line 1324
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 1325
    const/4 v0, 0x0

    return v0

    .line 1327
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/libsdl/app/SDLActivity;->sendCommand(ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static setActivityTitle(Ljava/lang/String;)Z
    .locals 1
    .param p0, "title"    # Ljava/lang/String;

    .line 1173
    const/4 v0, 0x1

    invoke-static {v0, p0}, Lorg/libsdl/app/SDLActivity;->sendCommand(ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static setCustomCursor(I)Z
    .locals 3
    .param p0, "cursorID"    # I

    .line 1812
    nop

    .line 1814
    :try_start_0
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSurface:Lorg/libsdl/app/SDLSurface;

    sget-object v1, Lorg/libsdl/app/SDLActivity;->mCursors:Ljava/util/Hashtable;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/PointerIcon;

    invoke-virtual {v0, v1}, Lorg/libsdl/app/SDLSurface;->setPointerIcon(Landroid/view/PointerIcon;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1817
    nop

    .line 1821
    const/4 v0, 0x1

    return v0

    .line 1815
    :catch_0
    move-exception v0

    .line 1816
    .local v0, "e":Ljava/lang/Exception;
    const/4 v1, 0x0

    return v1
.end method

.method public static setOrientation(IIZLjava/lang/String;)V
    .locals 1
    .param p0, "w"    # I
    .param p1, "h"    # I
    .param p2, "resizable"    # Z
    .param p3, "hint"    # Ljava/lang/String;

    .line 1191
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 1192
    invoke-static {p0, p1, p2, p3}, Lorg/libsdl/app/SDLActivity;->setOrientationBis(IIZLjava/lang/String;)V

    .line 1194
    :cond_0
    return-void
.end method

.method public static setOrientationBis(IIZLjava/lang/String;)V
    .locals 8
    .param p0, "w"    # I
    .param p1, "h"    # I
    .param p2, "resizable"    # Z
    .param p3, "hint"    # Ljava/lang/String;

    .line 1201
    const/4 v0, -0x1

    .line 1202
    .local v0, "orientation_landscape":I
    const/4 v1, -0x1

    .line 1204
    .local v1, "orientation_portrait":I
    const/4 v2, 0x1

    if-le p0, v2, :cond_14

    if-gt p1, v2, :cond_0

    goto/16 :goto_a

    .line 1210
    :cond_0
    const-string v3, "LandscapeRight"

    invoke-virtual {p3, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    const-string v5, "LandscapeLeft"

    if-eqz v4, :cond_1

    invoke-virtual {p3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1211
    const/16 v0, 0xb

    goto :goto_0

    .line 1212
    :cond_1
    invoke-virtual {p3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1213
    const/4 v0, 0x0

    goto :goto_0

    .line 1214
    :cond_2
    invoke-virtual {p3, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1215
    const/16 v0, 0x8

    .line 1219
    :cond_3
    :goto_0
    const-string v3, "Portrait "

    invoke-virtual {p3, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_5

    const-string v3, "Portrait"

    invoke-virtual {p3, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    move v3, v4

    goto :goto_2

    :cond_5
    :goto_1
    move v3, v2

    .line 1221
    .local v3, "contains_Portrait":Z
    :goto_2
    const-string v5, "PortraitUpsideDown"

    if-eqz v3, :cond_6

    invoke-virtual {p3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 1222
    const/16 v1, 0xc

    goto :goto_3

    .line 1223
    :cond_6
    if-eqz v3, :cond_7

    .line 1224
    const/4 v1, 0x1

    goto :goto_3

    .line 1225
    :cond_7
    invoke-virtual {p3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 1226
    const/16 v1, 0x9

    .line 1229
    :cond_8
    :goto_3
    const/4 v5, -0x1

    if-eq v0, v5, :cond_9

    move v6, v2

    goto :goto_4

    :cond_9
    move v6, v4

    .line 1230
    .local v6, "is_landscape_allowed":Z
    :goto_4
    if-eq v1, v5, :cond_a

    goto :goto_5

    :cond_a
    move v2, v4

    .line 1234
    .local v2, "is_portrait_allowed":Z
    :goto_5
    if-nez v2, :cond_d

    if-nez v6, :cond_d

    .line 1235
    if-eqz p2, :cond_b

    .line 1237
    const/16 v4, 0xb

    .local v4, "req":I
    goto :goto_9

    .line 1240
    .end local v4    # "req":I
    :cond_b
    if-le p0, p1, :cond_c

    const/4 v4, 0x6

    goto :goto_6

    :cond_c
    const/4 v4, 0x7

    .restart local v4    # "req":I
    :goto_6
    goto :goto_9

    .line 1244
    .end local v4    # "req":I
    :cond_d
    if-eqz p2, :cond_10

    .line 1245
    if-eqz v2, :cond_e

    if-eqz v6, :cond_e

    .line 1247
    const/16 v4, 0xb

    .restart local v4    # "req":I
    goto :goto_9

    .line 1250
    .end local v4    # "req":I
    :cond_e
    if-eqz v6, :cond_f

    move v4, v0

    goto :goto_7

    :cond_f
    move v4, v1

    .restart local v4    # "req":I
    :goto_7
    goto :goto_9

    .line 1254
    .end local v4    # "req":I
    :cond_10
    if-eqz v2, :cond_12

    if-eqz v6, :cond_12

    .line 1255
    if-le p0, p1, :cond_11

    move v4, v0

    goto :goto_8

    :cond_11
    move v4, v1

    .restart local v4    # "req":I
    :goto_8
    goto :goto_9

    .line 1258
    .end local v4    # "req":I
    :cond_12
    if-eqz v6, :cond_13

    move v4, v0

    goto :goto_9

    :cond_13
    move v4, v1

    .line 1263
    .restart local v4    # "req":I
    :goto_9
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "setOrientation() requestedOrientation="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, " width="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, " height="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, " resizable="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, " hint="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "SDL"

    invoke-static {v7, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1264
    sget-object v5, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    invoke-virtual {v5, v4}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 1265
    return-void

    .line 1206
    .end local v2    # "is_portrait_allowed":Z
    .end local v3    # "contains_Portrait":Z
    .end local v4    # "req":I
    .end local v6    # "is_landscape_allowed":Z
    :cond_14
    :goto_a
    return-void
.end method

.method public static setRelativeMouseEnabled(Z)Z
    .locals 1
    .param p0, "enabled"    # Z

    .line 1313
    if-eqz p0, :cond_0

    invoke-static {}, Lorg/libsdl/app/SDLActivity;->supportsRelativeMouse()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1314
    const/4 v0, 0x0

    return v0

    .line 1317
    :cond_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getMotionListener()Lorg/libsdl/app/SDLGenericMotionListener_API14;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/libsdl/app/SDLGenericMotionListener_API14;->setRelativeMouseEnabled(Z)Z

    move-result v0

    return v0
.end method

.method public static setSystemCursor(I)Z
    .locals 3
    .param p0, "cursorID"    # I

    .line 1828
    const/4 v0, 0x0

    .line 1829
    .local v0, "cursor_type":I
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 1888
    :pswitch_0
    const/16 v0, 0x3f6

    goto :goto_0

    .line 1885
    :pswitch_1
    const/16 v0, 0x3f8

    .line 1886
    goto :goto_0

    .line 1882
    :pswitch_2
    const/16 v0, 0x3f7

    .line 1883
    goto :goto_0

    .line 1879
    :pswitch_3
    const/16 v0, 0x3f9

    .line 1880
    goto :goto_0

    .line 1876
    :pswitch_4
    const/16 v0, 0x3f6

    .line 1877
    goto :goto_0

    .line 1873
    :pswitch_5
    const/16 v0, 0x3f8

    .line 1874
    goto :goto_0

    .line 1870
    :pswitch_6
    const/16 v0, 0x3f7

    .line 1871
    goto :goto_0

    .line 1867
    :pswitch_7
    const/16 v0, 0x3f9

    .line 1868
    goto :goto_0

    .line 1864
    :pswitch_8
    const/16 v0, 0x3ea

    .line 1865
    goto :goto_0

    .line 1861
    :pswitch_9
    const/16 v0, 0x3f4

    .line 1862
    goto :goto_0

    .line 1858
    :pswitch_a
    const/16 v0, 0x3fc

    .line 1859
    goto :goto_0

    .line 1855
    :pswitch_b
    const/16 v0, 0x3f7

    .line 1856
    goto :goto_0

    .line 1852
    :pswitch_c
    const/16 v0, 0x3f6

    .line 1853
    goto :goto_0

    .line 1849
    :pswitch_d
    const/16 v0, 0x3f8

    .line 1850
    goto :goto_0

    .line 1846
    :pswitch_e
    const/16 v0, 0x3f9

    .line 1847
    goto :goto_0

    .line 1843
    :pswitch_f
    const/16 v0, 0x3ec

    .line 1844
    goto :goto_0

    .line 1840
    :pswitch_10
    const/16 v0, 0x3ef

    .line 1841
    goto :goto_0

    .line 1837
    :pswitch_11
    const/16 v0, 0x3ec

    .line 1838
    goto :goto_0

    .line 1834
    :pswitch_12
    const/16 v0, 0x3f0

    .line 1835
    goto :goto_0

    .line 1831
    :pswitch_13
    const/16 v0, 0x3e8

    .line 1832
    nop

    .line 1891
    :goto_0
    nop

    .line 1893
    :try_start_0
    sget-object v1, Lorg/libsdl/app/SDLActivity;->mSurface:Lorg/libsdl/app/SDLSurface;

    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v0}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/libsdl/app/SDLSurface;->setPointerIcon(Landroid/view/PointerIcon;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1896
    nop

    .line 1898
    const/4 v1, 0x1

    return v1

    .line 1894
    :catch_0
    move-exception v1

    .line 1895
    .local v1, "e":Ljava/lang/Exception;
    const/4 v2, 0x0

    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static setWindowStyle(Z)V
    .locals 2
    .param p0, "fullscreen"    # Z

    .line 1181
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lorg/libsdl/app/SDLActivity;->sendCommand(ILjava/lang/Object;)Z

    .line 1182
    return-void
.end method

.method public static shouldMinimizeOnFocusLoss()Z
    .locals 1

    .line 1286
    const/4 v0, 0x0

    return v0
.end method

.method public static showFileDialog([Ljava/lang/String;ZZI)Z
    .locals 16
    .param p0, "filters"    # [Ljava/lang/String;
    .param p1, "allowMultiple"    # Z
    .param p2, "forWrite"    # Z
    .param p3, "requestCode"    # I

    .line 2012
    move-object/from16 v1, p0

    move/from16 v2, p3

    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    .line 2013
    return v3

    .line 2016
    :cond_0
    if-eqz p2, :cond_1

    .line 2017
    const/4 v0, 0x0

    move v4, v0

    .end local p1    # "allowMultiple":Z
    .local v0, "allowMultiple":Z
    goto :goto_0

    .line 2016
    .end local v0    # "allowMultiple":Z
    .restart local p1    # "allowMultiple":Z
    :cond_1
    move/from16 v4, p1

    .line 2021
    .end local p1    # "allowMultiple":Z
    .local v4, "allowMultiple":Z
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v5, v0

    .line 2022
    .local v5, "mimes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v6

    .line 2023
    .local v6, "mimeTypeMap":Landroid/webkit/MimeTypeMap;
    const-string v0, "*/*"

    const/4 v7, 0x1

    if-eqz v1, :cond_5

    .line 2024
    array-length v8, v1

    move v9, v3

    :goto_1
    if-ge v9, v8, :cond_5

    aget-object v10, v1, v9

    .line 2025
    .local v10, "pattern":Ljava/lang/String;
    const-string v11, ";"

    invoke-virtual {v10, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    .line 2027
    .local v11, "extensions":[Ljava/lang/String;
    array-length v12, v11

    if-ne v12, v7, :cond_2

    aget-object v12, v11, v3

    const-string v13, "*"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    .line 2029
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 2031
    :cond_2
    array-length v12, v11

    move v13, v3

    :goto_2
    if-ge v13, v12, :cond_4

    aget-object v14, v11, v13

    .line 2032
    .local v14, "ext":Ljava/lang/String;
    invoke-virtual {v6, v14}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 2033
    .local v15, "mime":Ljava/lang/String;
    if-eqz v15, :cond_3

    .line 2034
    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2031
    .end local v14    # "ext":Ljava/lang/String;
    .end local v15    # "mime":Ljava/lang/String;
    :cond_3
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    .line 2024
    .end local v10    # "pattern":Ljava/lang/String;
    .end local v11    # "extensions":[Ljava/lang/String;
    :cond_4
    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 2042
    :cond_5
    new-instance v8, Landroid/content/Intent;

    if-eqz p2, :cond_6

    const-string v9, "android.intent.action.CREATE_DOCUMENT"

    goto :goto_4

    :cond_6
    const-string v9, "android.intent.action.OPEN_DOCUMENT"

    :goto_4
    invoke-direct {v8, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2043
    .local v8, "intent":Landroid/content/Intent;
    const-string v9, "android.intent.category.OPENABLE"

    invoke-virtual {v8, v9}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 2044
    const-string v9, "android.intent.extra.ALLOW_MULTIPLE"

    invoke-virtual {v8, v9, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2045
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v9

    packed-switch v9, :pswitch_data_0

    .line 2053
    invoke-virtual {v8, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 2054
    new-array v0, v3, [Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const-string v9, "android.intent.extra.MIME_TYPES"

    invoke-virtual {v8, v9, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_5

    .line 2050
    :pswitch_0
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 2051
    goto :goto_5

    .line 2047
    :pswitch_1
    invoke-virtual {v8, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 2048
    nop

    .line 2058
    :goto_5
    :try_start_0
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    invoke-virtual {v0, v8, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2062
    nop

    .line 2065
    new-instance v0, Lorg/libsdl/app/SDLActivity$SDLFileDialogState;

    invoke-direct {v0}, Lorg/libsdl/app/SDLActivity$SDLFileDialogState;-><init>()V

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mFileDialogState:Lorg/libsdl/app/SDLActivity$SDLFileDialogState;

    .line 2066
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mFileDialogState:Lorg/libsdl/app/SDLActivity$SDLFileDialogState;

    iput v2, v0, Lorg/libsdl/app/SDLActivity$SDLFileDialogState;->requestCode:I

    .line 2067
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mFileDialogState:Lorg/libsdl/app/SDLActivity$SDLFileDialogState;

    iput-boolean v4, v0, Lorg/libsdl/app/SDLActivity$SDLFileDialogState;->multipleChoice:Z

    .line 2068
    return v7

    .line 2059
    :catch_0
    move-exception v0

    .line 2060
    .local v0, "e":Landroid/content/ActivityNotFoundException;
    const-string v7, "SDL"

    const-string v9, "Unable to open file dialog."

    invoke-static {v7, v9, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2061
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static showTextInput(IIIII)Z
    .locals 6
    .param p0, "input_type"    # I
    .param p1, "x"    # I
    .param p2, "y"    # I
    .param p3, "w"    # I
    .param p4, "h"    # I

    .line 1464
    sget-object v0, Lorg/libsdl/app/SdlImeController$Source;->GAME:Lorg/libsdl/app/SdlImeController$Source;

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    .end local p0    # "input_type":I
    .end local p1    # "x":I
    .end local p2    # "y":I
    .end local p3    # "w":I
    .end local p4    # "h":I
    .local v1, "input_type":I
    .local v2, "x":I
    .local v3, "y":I
    .local v4, "w":I
    .local v5, "h":I
    invoke-static/range {v0 .. v5}, Lorg/libsdl/app/SdlImeController;->requestShow(Lorg/libsdl/app/SdlImeController$Source;IIIII)Z

    move-result p0

    return p0
.end method

.method public static showToast(Ljava/lang/String;IIII)Z
    .locals 8
    .param p0, "message"    # Ljava/lang/String;
    .param p1, "duration"    # I
    .param p2, "gravity"    # I
    .param p3, "xOffset"    # I
    .param p4, "yOffset"    # I

    .line 1950
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 1951
    return v1

    .line 1984
    :cond_0
    :try_start_0
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    new-instance v2, Lorg/libsdl/app/SDLActivity$1OneShotTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v3, p0

    move v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    .end local p0    # "message":Ljava/lang/String;
    .end local p1    # "duration":I
    .end local p2    # "gravity":I
    .end local p3    # "xOffset":I
    .end local p4    # "yOffset":I
    .local v3, "message":Ljava/lang/String;
    .local v4, "duration":I
    .local v5, "gravity":I
    .local v6, "xOffset":I
    .local v7, "yOffset":I
    :try_start_1
    invoke-direct/range {v2 .. v7}, Lorg/libsdl/app/SDLActivity$1OneShotTask;-><init>(Ljava/lang/String;IIII)V

    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1987
    nop

    .line 1988
    const/4 p0, 0x1

    return p0

    .line 1985
    :catch_0
    move-exception v0

    move-object p0, v0

    goto :goto_0

    .end local v3    # "message":Ljava/lang/String;
    .end local v4    # "duration":I
    .end local v5    # "gravity":I
    .end local v6    # "xOffset":I
    .end local v7    # "yOffset":I
    .restart local p0    # "message":Ljava/lang/String;
    .restart local p1    # "duration":I
    .restart local p2    # "gravity":I
    .restart local p3    # "xOffset":I
    .restart local p4    # "yOffset":I
    :catch_1
    move-exception v0

    move-object v3, p0

    move v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    move-object p0, v0

    .line 1986
    .end local p1    # "duration":I
    .end local p2    # "gravity":I
    .end local p3    # "xOffset":I
    .end local p4    # "yOffset":I
    .restart local v3    # "message":Ljava/lang/String;
    .restart local v4    # "duration":I
    .restart local v5    # "gravity":I
    .restart local v6    # "xOffset":I
    .restart local v7    # "yOffset":I
    .local p0, "ex":Ljava/lang/Exception;
    :goto_0
    return v1
.end method

.method public static supportsRelativeMouse()Z
    .locals 2

    .line 1301
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-ge v0, v1, :cond_0

    invoke-static {}, Lorg/libsdl/app/SDLActivity;->isDeXMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1302
    const/4 v0, 0x0

    return v0

    .line 1305
    :cond_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getMotionListener()Lorg/libsdl/app/SDLGenericMotionListener_API14;

    move-result-object v0

    invoke-virtual {v0}, Lorg/libsdl/app/SDLGenericMotionListener_API14;->supportsRelativeMouse()Z

    move-result v0

    return v0
.end method


# virtual methods
.method protected createSDLSurface(Landroid/content/Context;)Lorg/libsdl/app/SDLSurface;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .line 380
    new-instance v0, Lorg/libsdl/app/SDLSurface;

    invoke-direct {v0, p1}, Lorg/libsdl/app/SDLSurface;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3
    .param p1, "event"    # Landroid/view/KeyEvent;

    .line 877
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mBrokenLibraries:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 878
    return v1

    .line 881
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 883
    .local v0, "keyCode":I
    const/16 v2, 0x19

    if-eq v0, v2, :cond_2

    const/16 v2, 0x18

    if-eq v0, v2, :cond_2

    const/16 v2, 0x1b

    if-eq v0, v2, :cond_2

    const/16 v2, 0xa8

    if-eq v0, v2, :cond_2

    const/16 v2, 0xa9

    if-ne v0, v2, :cond_1

    goto :goto_0

    .line 891
    :cond_1
    const/4 v2, 0x1

    sput-boolean v2, Lorg/libsdl/app/SDLActivity;->mDispatchingKeyEvent:Z

    .line 892
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v2

    .line 893
    .local v2, "result":Z
    sput-boolean v1, Lorg/libsdl/app/SDLActivity;->mDispatchingKeyEvent:Z

    .line 894
    return v2

    .line 889
    .end local v2    # "result":Z
    :cond_2
    :goto_0
    return v1
.end method

.method protected getArguments()[Ljava/lang/String;
    .locals 1

    .line 331
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method

.method protected getLibraries()[Ljava/lang/String;
    .locals 3

    .line 307
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "SDL3"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "main"

    aput-object v2, v0, v1

    return-object v0
.end method

.method protected getMainFunction()Ljava/lang/String;
    .locals 1

    .line 295
    const-string v0, "SDL_main"

    return-object v0
.end method

.method public loadLibraries()V
    .locals 4

    .line 319
    invoke-virtual {p0}, Lorg/libsdl/app/SDLActivity;->getLibraries()[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 320
    .local v3, "lib":Ljava/lang/String;
    invoke-static {v3, p0}, Lorg/libsdl/app/SDL;->loadLibrary(Ljava/lang/String;Landroid/content/Context;)V

    .line 319
    .end local v3    # "lib":Ljava/lang/String;
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 322
    :cond_0
    return-void
.end method

.method protected main()V
    .locals 2

    .line 265
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We do not have a main() program to run. Why are you calling this?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public messageboxShowMessageBox(ILjava/lang/String;Ljava/lang/String;[I[I[Ljava/lang/String;[I)I
    .locals 1
    .param p1, "flags"    # I
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "buttonFlags"    # [I
    .param p5, "buttonIds"    # [I
    .param p6, "buttonTexts"    # [Ljava/lang/String;
    .param p7, "colors"    # [I

    .line 1725
    invoke-static/range {p0 .. p7}, Lorg/libsdl/app/SDLActivity;->messageboxShowMessageBox(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;[I[I[Ljava/lang/String;[I)I

    move-result v0

    return v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 5
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .line 816
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 817
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 819
    :cond_0
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mFileDialogState:Lorg/libsdl/app/SDLActivity$SDLFileDialogState;

    if-eqz v0, :cond_5

    sget-object v0, Lorg/libsdl/app/SDLActivity;->mFileDialogState:Lorg/libsdl/app/SDLActivity$SDLFileDialogState;

    iget v0, v0, Lorg/libsdl/app/SDLActivity$SDLFileDialogState;->requestCode:I

    if-ne v0, p1, :cond_5

    .line 821
    const/4 v0, 0x0

    .line 823
    .local v0, "filelist":[Ljava/lang/String;
    const/4 v1, 0x0

    if-eqz p3, :cond_4

    .line 824
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    .line 826
    .local v2, "singleFileUri":Landroid/net/Uri;
    if-nez v2, :cond_3

    .line 828
    invoke-virtual {p3}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object v1

    .line 829
    .local v1, "clipData":Landroid/content/ClipData;
    if-eqz v1, :cond_2

    .line 831
    invoke-virtual {v1}, Landroid/content/ClipData;->getItemCount()I

    move-result v3

    new-array v0, v3, [Ljava/lang/String;

    .line 833
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_1

    .line 834
    invoke-virtual {v1, v3}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    .line 835
    .local v4, "uri":Ljava/lang/String;
    aput-object v4, v0, v3

    .line 833
    .end local v4    # "uri":Ljava/lang/String;
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 837
    .end local v1    # "clipData":Landroid/content/ClipData;
    .end local v3    # "i":I
    :cond_1
    goto :goto_1

    .line 829
    .restart local v1    # "clipData":Landroid/content/ClipData;
    :cond_2
    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3}, Ljava/lang/AssertionError;-><init>()V

    throw v3

    .line 839
    .end local v1    # "clipData":Landroid/content/ClipData;
    :cond_3
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    move-object v0, v3

    .line 841
    .end local v2    # "singleFileUri":Landroid/net/Uri;
    :goto_1
    goto :goto_2

    .line 843
    :cond_4
    new-array v0, v1, [Ljava/lang/String;

    .line 847
    :goto_2
    const/4 v1, -0x1

    invoke-static {p1, v0, v1}, Lorg/libsdl/app/SDLActivity;->onNativeFileDialog(I[Ljava/lang/String;I)V

    .line 848
    const/4 v1, 0x0

    sput-object v1, Lorg/libsdl/app/SDLActivity;->mFileDialogState:Lorg/libsdl/app/SDLActivity$SDLFileDialogState;

    .line 850
    .end local v0    # "filelist":[Ljava/lang/String;
    :cond_5
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 802
    const-string v0, "SDL_ANDROID_TRAP_BACK_BUTTON"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/libsdl/app/SDLActivity;->nativeGetHintBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 803
    .local v0, "trapBack":Z
    if-eqz v0, :cond_0

    .line 805
    return-void

    .line 809
    :cond_0
    invoke-virtual {p0}, Lorg/libsdl/app/SDLActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    .line 810
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 812
    :cond_1
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .line 734
    const-string v0, "SDL"

    const-string v1, "onConfigurationChanged()"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 735
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 736
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 738
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mBrokenLibraries:Z

    if-eqz v0, :cond_1

    .line 739
    return-void

    .line 742
    :cond_1
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mCurrentLocale:Ljava/util/Locale;

    if-eqz v0, :cond_2

    sget-object v0, Lorg/libsdl/app/SDLActivity;->mCurrentLocale:Ljava/util/Locale;

    iget-object v1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 743
    :cond_2
    iget-object v0, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mCurrentLocale:Ljava/util/Locale;

    .line 744
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->onNativeLocaleChanged()V

    .line 747
    :cond_3
    iget v0, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 752
    :sswitch_0
    const/4 v0, 0x1

    invoke-static {v0}, Lorg/libsdl/app/SDLActivity;->onNativeDarkModeChanged(Z)V

    goto :goto_0

    .line 749
    :sswitch_1
    const/4 v0, 0x0

    invoke-static {v0}, Lorg/libsdl/app/SDLActivity;->onNativeDarkModeChanged(Z)V

    .line 750
    nop

    .line 755
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x20 -> :sswitch_0
    .end sparse-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 415
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We do not run SDLActivity as an activity.This only exists as a bridge to JNI. We manually set up everything else."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected onDestroy()V
    .locals 4

    .line 759
    const-string v0, "onDestroy()"

    const-string v1, "SDL"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 761
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mHIDDeviceManager:Lorg/libsdl/app/HIDDeviceManager;

    if-eqz v0, :cond_0

    .line 762
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mHIDDeviceManager:Lorg/libsdl/app/HIDDeviceManager;

    invoke-static {v0}, Lorg/libsdl/app/HIDDeviceManager;->release(Lorg/libsdl/app/HIDDeviceManager;)V

    .line 763
    const/4 v0, 0x0

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mHIDDeviceManager:Lorg/libsdl/app/HIDDeviceManager;

    .line 766
    :cond_0
    invoke-static {p0}, Lorg/libsdl/app/SDLAudioManager;->release(Landroid/content/Context;)V

    .line 768
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mBrokenLibraries:Z

    if-eqz v0, :cond_1

    .line 769
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 770
    return-void

    .line 773
    :cond_1
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSDLThread:Ljava/lang/Thread;

    if-eqz v0, :cond_2

    .line 776
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->nativeSendQuit()V

    .line 784
    :try_start_0
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSDLThread:Ljava/lang/Thread;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v2, v3}, Ljava/lang/Thread;->join(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 787
    goto :goto_0

    .line 785
    :catch_0
    move-exception v0

    .line 786
    .local v0, "e":Ljava/lang/Exception;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Problem stopping SDLThread: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 790
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_2
    :goto_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->nativeQuit()V

    .line 792
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 793
    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 598
    const-string v0, "SDL"

    const-string v1, "onPause()"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 599
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 601
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mHIDDeviceManager:Lorg/libsdl/app/HIDDeviceManager;

    if-eqz v0, :cond_0

    .line 602
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mHIDDeviceManager:Lorg/libsdl/app/HIDDeviceManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/libsdl/app/HIDDeviceManager;->setFrozen(Z)V

    .line 605
    :cond_0
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mHasMultiWindow:Z

    if-nez v0, :cond_1

    .line 606
    invoke-virtual {p0}, Lorg/libsdl/app/SDLActivity;->pauseNativeThread()V

    .line 608
    :cond_1
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2
    .param p1, "requestCode"    # I
    .param p2, "permissions"    # [Ljava/lang/String;
    .param p3, "grantResults"    # [I

    .line 1931
    array-length v0, p3

    const/4 v1, 0x0

    if-lez v0, :cond_0

    aget v0, p3, v1

    if-nez v0, :cond_0

    const/4 v1, 0x1

    .line 1932
    .local v1, "result":Z
    :cond_0
    invoke-static {p1, v1}, Lorg/libsdl/app/SDLActivity;->nativePermissionResult(IZ)V

    .line 1933
    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 612
    const-string v0, "SDL"

    const-string v1, "onResume()"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 613
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 615
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mHIDDeviceManager:Lorg/libsdl/app/HIDDeviceManager;

    if-eqz v0, :cond_0

    .line 616
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mHIDDeviceManager:Lorg/libsdl/app/HIDDeviceManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/libsdl/app/HIDDeviceManager;->setFrozen(Z)V

    .line 619
    :cond_0
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mHasMultiWindow:Z

    if-nez v0, :cond_1

    .line 620
    invoke-virtual {p0}, Lorg/libsdl/app/SDLActivity;->resumeNativeThread()V

    .line 622
    :cond_1
    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 635
    const-string v0, "SDL"

    const-string v1, "onStart()"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 636
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 637
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mHasMultiWindow:Z

    if-eqz v0, :cond_0

    .line 638
    invoke-virtual {p0}, Lorg/libsdl/app/SDLActivity;->resumeNativeThread()V

    .line 640
    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 626
    const-string v0, "SDL"

    const-string v1, "onStop()"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 627
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 628
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mHasMultiWindow:Z

    if-eqz v0, :cond_0

    .line 629
    invoke-virtual {p0}, Lorg/libsdl/app/SDLActivity;->pauseNativeThread()V

    .line 631
    :cond_0
    return-void
.end method

.method public onSystemUiVisibilityChange(I)V
    .locals 4
    .param p1, "visibility"    # I

    .line 1743
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mFullscreenModeActive:Z

    if-eqz v0, :cond_1

    and-int/lit8 v0, p1, 0x4

    if-eqz v0, :cond_0

    and-int/lit8 v0, p1, 0x2

    if-nez v0, :cond_1

    .line 1745
    :cond_0
    invoke-virtual {p0}, Lorg/libsdl/app/SDLActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    .line 1746
    .local v0, "handler":Landroid/os/Handler;
    if-eqz v0, :cond_1

    .line 1747
    iget-object v1, p0, Lorg/libsdl/app/SDLActivity;->rehideSystemUi:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1748
    iget-object v1, p0, Lorg/libsdl/app/SDLActivity;->rehideSystemUi:Ljava/lang/Runnable;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1752
    .end local v0    # "handler":Landroid/os/Handler;
    :cond_1
    return-void
.end method

.method public onTrimMemory(I)V
    .locals 2
    .param p1, "level"    # I

    .line 722
    const-string v0, "SDL"

    const-string v1, "onTrimMemory()"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 723
    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    .line 725
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mBrokenLibraries:Z

    if-eqz v0, :cond_0

    .line 726
    return-void

    .line 729
    :cond_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->nativeLowMemory()V

    .line 730
    return-void
.end method

.method protected onUnhandledMessage(ILjava/lang/Object;)Z
    .locals 1
    .param p1, "command"    # I
    .param p2, "param"    # Ljava/lang/Object;

    .line 969
    const/4 v0, 0x0

    return v0
.end method

.method public onWindowFocusChanged(Z)V
    .locals 3
    .param p1, "hasFocus"    # Z

    .line 688
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 689
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onWindowFocusChanged(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SDL"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 693
    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string v1, "SDL_JOYSTICK_ALLOW_BACKGROUND_EVENTS"

    invoke-static {v1, v0}, Lorg/libsdl/app/SDLActivity;->nativeGetHintBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_1

    .line 694
    :cond_0
    sget-object v1, Lorg/libsdl/app/SDLActivity;->mHIDDeviceManager:Lorg/libsdl/app/HIDDeviceManager;

    if-eqz v1, :cond_1

    .line 695
    sget-object v1, Lorg/libsdl/app/SDLActivity;->mHIDDeviceManager:Lorg/libsdl/app/HIDDeviceManager;

    xor-int/lit8 v2, p1, 0x1

    invoke-virtual {v1, v2}, Lorg/libsdl/app/HIDDeviceManager;->setFrozen(Z)V

    .line 699
    :cond_1
    sget-boolean v1, Lorg/libsdl/app/SDLActivity;->mBrokenLibraries:Z

    if-eqz v1, :cond_2

    .line 700
    return-void

    .line 703
    :cond_2
    sput-boolean p1, Lorg/libsdl/app/SDLActivity;->mHasFocus:Z

    .line 704
    if-eqz p1, :cond_3

    .line 705
    sget-object v0, Lorg/libsdl/app/SDLActivity$NativeState;->RESUMED:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 706
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getMotionListener()Lorg/libsdl/app/SDLGenericMotionListener_API14;

    move-result-object v0

    invoke-virtual {v0}, Lorg/libsdl/app/SDLGenericMotionListener_API14;->reclaimRelativeMouseModeIfNeeded()V

    .line 708
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->handleNativeState()V

    .line 709
    const/4 v0, 0x1

    invoke-static {v0}, Lorg/libsdl/app/SDLActivity;->nativeFocusChanged(Z)V

    goto :goto_0

    .line 712
    :cond_3
    invoke-static {v0}, Lorg/libsdl/app/SDLActivity;->nativeFocusChanged(Z)V

    .line 713
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mHasMultiWindow:Z

    if-nez v0, :cond_4

    .line 714
    sget-object v0, Lorg/libsdl/app/SDLActivity$NativeState;->PAUSED:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 715
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->handleNativeState()V

    .line 718
    :cond_4
    :goto_0
    return-void
.end method

.method protected pauseNativeThread()V
    .locals 1

    .line 574
    sget-object v0, Lorg/libsdl/app/SDLActivity$NativeState;->PAUSED:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 575
    const/4 v0, 0x0

    sput-boolean v0, Lorg/libsdl/app/SDLActivity;->mIsResumedCalled:Z

    .line 577
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mBrokenLibraries:Z

    if-eqz v0, :cond_0

    .line 578
    return-void

    .line 581
    :cond_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->handleNativeState()V

    .line 582
    return-void
.end method

.method public pressBackButton()V
    .locals 1

    .line 859
    new-instance v0, Lorg/libsdl/app/SDLActivity$1;

    invoke-direct {v0, p0}, Lorg/libsdl/app/SDLActivity$1;-><init>(Lorg/libsdl/app/SDLActivity;)V

    invoke-virtual {p0, v0}, Lorg/libsdl/app/SDLActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 867
    return-void
.end method

.method protected resumeNativeThread()V
    .locals 1

    .line 585
    sget-object v0, Lorg/libsdl/app/SDLActivity$NativeState;->RESUMED:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 586
    const/4 v0, 0x1

    sput-boolean v0, Lorg/libsdl/app/SDLActivity;->mIsResumedCalled:Z

    .line 588
    sget-boolean v0, Lorg/libsdl/app/SDLActivity;->mBrokenLibraries:Z

    if-eqz v0, :cond_0

    .line 589
    return-void

    .line 592
    :cond_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->handleNativeState()V

    .line 593
    return-void
.end method

.method public superOnBackPressed()V
    .locals 0

    .line 871
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 872
    return-void
.end method
