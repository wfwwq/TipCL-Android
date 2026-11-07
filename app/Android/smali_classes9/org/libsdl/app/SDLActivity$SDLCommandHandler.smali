.class public Lorg/libsdl/app/SDLActivity$SDLCommandHandler;
.super Landroid/os/Handler;
.source "SDLActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/libsdl/app/SDLActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "SDLCommandHandler"
.end annotation


# direct methods
.method constructor <init>(Landroid/os/Looper;)V
    .locals 0
    .param p1, "looper"    # Landroid/os/Looper;

    .line 979
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 980
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5
    .param p1, "msg"    # Landroid/os/Message;

    .line 984
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 985
    :cond_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v0

    .line 986
    .local v0, "context":Landroid/content/Context;
    const-string v1, "SDL"

    if-nez v0, :cond_1

    .line 987
    const-string v2, "error handling message, getContext() returned null"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 988
    return-void

    .line 990
    :cond_1
    iget v2, p1, Landroid/os/Message;->arg1:I

    packed-switch v2, :pswitch_data_0

    .line 1050
    :pswitch_0
    instance-of v2, v0, Lorg/libsdl/app/SDLActivity;

    if-eqz v2, :cond_5

    move-object v2, v0

    check-cast v2, Lorg/libsdl/app/SDLActivity;

    iget v3, p1, Landroid/os/Message;->arg1:I

    iget-object v4, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2, v3, v4}, Lorg/libsdl/app/SDLActivity;->onUnhandledMessage(ILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 1051
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error handling message, command is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 1037
    :pswitch_1
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_5

    .line 1038
    sget-object v1, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    .line 1039
    .local v1, "window":Landroid/view/Window;
    if-eqz v1, :cond_3

    .line 1040
    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v2, v2, Ljava/lang/Integer;

    const/16 v3, 0x80

    if-eqz v2, :cond_2

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eqz v2, :cond_2

    .line 1041
    invoke-virtual {v1, v3}, Landroid/view/Window;->addFlags(I)V

    goto :goto_0

    .line 1043
    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/Window;->clearFlags(I)V

    .line 1046
    .end local v1    # "window":Landroid/view/Window;
    :cond_3
    :goto_0
    goto :goto_1

    .line 1033
    :pswitch_2
    sget-object v1, Lorg/libsdl/app/SdlImeController$Source;->GAME:Lorg/libsdl/app/SdlImeController$Source;

    invoke-static {v1}, Lorg/libsdl/app/SdlImeController;->requestHide(Lorg/libsdl/app/SdlImeController$Source;)V

    .line 1034
    goto :goto_1

    .line 1031
    :pswitch_3
    goto :goto_1

    .line 992
    :pswitch_4
    sget-object v2, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    if-eqz v2, :cond_4

    .line 993
    sget-object v1, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 995
    :cond_4
    const-string v2, "error handling message, getContext() returned no Activity"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 997
    nop

    .line 1054
    :cond_5
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
