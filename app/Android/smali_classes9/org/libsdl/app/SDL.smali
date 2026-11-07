.class public Lorg/libsdl/app/SDL;
.super Ljava/lang/Object;
.source "SDL.java"


# static fields
.field protected static mContext:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getContext()Landroid/app/Activity;
    .locals 1

    .line 42
    sget-object v0, Lorg/libsdl/app/SDL;->mContext:Landroid/app/Activity;

    return-object v0
.end method

.method public static initialize()V
    .locals 1

    .line 28
    const/4 v0, 0x0

    invoke-static {v0}, Lorg/libsdl/app/SDL;->setContext(Landroid/app/Activity;)V

    .line 30
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->initialize()V

    .line 31
    invoke-static {}, Lorg/libsdl/app/SDLAudioManager;->initialize()V

    .line 32
    invoke-static {}, Lorg/libsdl/app/SDLControllerManager;->initialize()V

    .line 33
    return-void
.end method

.method static loadLibrary(Ljava/lang/String;)V
    .locals 1
    .param p0, "libraryName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/UnsatisfiedLinkError;,
            Ljava/lang/SecurityException;,
            Ljava/lang/NullPointerException;
        }
    .end annotation

    .line 46
    sget-object v0, Lorg/libsdl/app/SDL;->mContext:Landroid/app/Activity;

    invoke-static {p0, v0}, Lorg/libsdl/app/SDL;->loadLibrary(Ljava/lang/String;Landroid/content/Context;)V

    .line 47
    return-void
.end method

.method static loadLibrary(Ljava/lang/String;Landroid/content/Context;)V
    .locals 11
    .param p0, "libraryName"    # Ljava/lang/String;
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/UnsatisfiedLinkError;,
            Ljava/lang/SecurityException;,
            Ljava/lang/NullPointerException;
        }
    .end annotation

    .line 51
    if-eqz p0, :cond_0

    .line 65
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "com.getkeepsafe.relinker.ReLinker"

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 66
    .local v0, "relinkClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "com.getkeepsafe.relinker.ReLinker$LoadListener"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 67
    .local v1, "relinkListenerClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-string v3, "android.content.Context"

    invoke-virtual {v2, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 68
    .local v2, "contextClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const-string v4, "java.lang.String"

    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 72
    .local v3, "stringClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v4, "force"

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/Class;

    invoke-virtual {v0, v4, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 73
    .local v4, "forceMethod":Ljava/lang/reflect/Method;
    new-array v6, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-virtual {v4, v7, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 74
    .local v6, "relinkInstance":Ljava/lang/Object;
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    .line 77
    .local v8, "relinkInstanceClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v9, "loadLibrary"

    const/4 v10, 0x4

    new-array v10, v10, [Ljava/lang/Class;

    aput-object v2, v10, v5

    const/4 v5, 0x1

    aput-object v3, v10, v5

    const/4 v5, 0x2

    aput-object v3, v10, v5

    const/4 v5, 0x3

    aput-object v1, v10, v5

    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 78
    .local v5, "loadMethod":Ljava/lang/reflect/Method;
    filled-new-array {p1, p0, v7, v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    nop

    .end local v0    # "relinkClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v1    # "relinkListenerClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v2    # "contextClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v3    # "stringClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v4    # "forceMethod":Ljava/lang/reflect/Method;
    .end local v5    # "loadMethod":Ljava/lang/reflect/Method;
    .end local v6    # "relinkInstance":Ljava/lang/Object;
    .end local v8    # "relinkInstanceClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    .line 83
    .local v0, "e":Ljava/lang/Throwable;
    :try_start_1
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    .line 90
    nop

    .line 92
    .end local v0    # "e":Ljava/lang/Throwable;
    :goto_0
    return-void

    .line 88
    .restart local v0    # "e":Ljava/lang/Throwable;
    :catch_0
    move-exception v1

    .line 89
    .local v1, "se":Ljava/lang/SecurityException;
    throw v1

    .line 85
    .end local v1    # "se":Ljava/lang/SecurityException;
    :catch_1
    move-exception v1

    .line 86
    .local v1, "ule":Ljava/lang/UnsatisfiedLinkError;
    throw v1

    .line 52
    .end local v0    # "e":Ljava/lang/Throwable;
    .end local v1    # "ule":Ljava/lang/UnsatisfiedLinkError;
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "No library name provided."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static setContext(Landroid/app/Activity;)V
    .locals 0
    .param p0, "context"    # Landroid/app/Activity;

    .line 37
    invoke-static {p0}, Lorg/libsdl/app/SDLAudioManager;->setContext(Landroid/content/Context;)V

    .line 38
    sput-object p0, Lorg/libsdl/app/SDL;->mContext:Landroid/app/Activity;

    .line 39
    return-void
.end method

.method public static setupJNI()V
    .locals 0

    .line 21
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->nativeSetupJNI()V

    .line 22
    invoke-static {}, Lorg/libsdl/app/SDLAudioManager;->nativeSetupJNI()V

    .line 23
    invoke-static {}, Lorg/libsdl/app/SDLControllerManager;->nativeSetupJNI()V

    .line 24
    return-void
.end method
