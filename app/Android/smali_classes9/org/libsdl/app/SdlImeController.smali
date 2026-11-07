.class final Lorg/libsdl/app/SdlImeController;
.super Ljava/lang/Object;
.source "SdlImeController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/libsdl/app/SdlImeController$Source;
    }
.end annotation


# static fields
.field private static final HEIGHT_PADDING:I = 0xf

.field private static final TAG:Ljava/lang/String; = "SDLImeController"

.field private static mEdit:Lorg/libsdl/app/SDLDummyEdit;

.field private static mForcedByLauncher:Z

.field private static mKeyboardShown:Z

.field private static mTextInputActive:Z


# direct methods
.method public static synthetic $r8$lambda$L17-LLKZM0_m_srI-6UszFBgDvI()V
    .locals 0

    invoke-static {}, Lorg/libsdl/app/SdlImeController;->recheckHidden()V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    return-void
.end method

.method private static doHide(Lorg/libsdl/app/SdlImeController$Source;)V
    .locals 4
    .param p0, "source"    # Lorg/libsdl/app/SdlImeController$Source;

    .line 219
    sget-boolean v0, Lorg/libsdl/app/SdlImeController;->mForcedByLauncher:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/libsdl/app/SdlImeController$Source;->GAME:Lorg/libsdl/app/SdlImeController$Source;

    if-eq p0, v0, :cond_0

    .line 221
    invoke-static {v1}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->setNativeTextInputActive(Z)Z

    .line 223
    :cond_0
    sput-boolean v1, Lorg/libsdl/app/SdlImeController;->mForcedByLauncher:Z

    .line 225
    sget-object v0, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    const-string v2, "SDLImeController"

    if-nez v0, :cond_1

    .line 226
    const-string v0, "IME: no text edit available, hide ignored"

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    return-void

    .line 229
    :cond_1
    invoke-static {}, Lorg/libsdl/app/SdlImeController;->forceHideIme()V

    .line 230
    sget-boolean v0, Lorg/libsdl/app/SdlImeController;->mKeyboardShown:Z

    if-eqz v0, :cond_2

    .line 231
    sput-boolean v1, Lorg/libsdl/app/SdlImeController;->mKeyboardShown:Z

    .line 232
    const-string v0, "IME: hidden"

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->onNativeScreenKeyboardHidden()V

    .line 236
    :cond_2
    invoke-static {}, Lorg/libsdl/app/SdlImeController;->isInputAccepted()Z

    move-result v0

    if-nez v0, :cond_3

    .line 238
    sget-object v0, Lorg/libsdl/app/SDLActivity;->commandHandler:Landroid/os/Handler;

    new-instance v1, Lorg/libsdl/app/SdlImeController$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lorg/libsdl/app/SdlImeController$$ExternalSyntheticLambda0;-><init>()V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 240
    :cond_3
    return-void
.end method

.method private static doShow(Lorg/libsdl/app/SdlImeController$Source;IIIII)V
    .locals 8
    .param p0, "source"    # Lorg/libsdl/app/SdlImeController$Source;
    .param p1, "inputType"    # I
    .param p2, "x"    # I
    .param p3, "y"    # I
    .param p4, "w"    # I
    .param p5, "h"    # I

    .line 136
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mLayout:Landroid/view/ViewGroup;

    const-string v1, " ignored"

    const-string v2, "SDLImeController"

    if-nez v0, :cond_0

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IME: no layout available, show by "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    return-void

    .line 141
    :cond_0
    sget-object v0, Lorg/libsdl/app/SdlImeController$Source;->GAME:Lorg/libsdl/app/SdlImeController$Source;

    const/4 v3, 0x1

    if-ne p0, v0, :cond_1

    .line 142
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->notifyGameImeTakeover()V

    goto :goto_0

    .line 143
    :cond_1
    sget-boolean v0, Lorg/libsdl/app/SdlImeController;->mTextInputActive:Z

    if-nez v0, :cond_3

    sget-boolean v0, Lorg/libsdl/app/SdlImeController;->mForcedByLauncher:Z

    if-nez v0, :cond_3

    .line 146
    invoke-static {v3}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->setNativeTextInputActive(Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IME: show by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " rejected, native text input unavailable"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    return-void

    .line 150
    :cond_2
    sput-boolean v3, Lorg/libsdl/app/SdlImeController;->mForcedByLauncher:Z

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IME: native text input force-activated by "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    :cond_3
    :goto_0
    sget-object v0, Lorg/libsdl/app/SdlImeController$Source;->GAME:Lorg/libsdl/app/SdlImeController$Source;

    const/4 v4, 0x0

    if-ne p0, v0, :cond_5

    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlImeAutoShowEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    move v0, v4

    goto :goto_2

    :cond_5
    :goto_1
    move v0, v3

    .line 156
    .local v0, "autoShow":Z
    :goto_2
    if-nez v0, :cond_6

    sget-object v5, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    if-nez v5, :cond_6

    .line 157
    const-string v1, "IME: auto show suppressed by launcher setting, editor deferred"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    return-void

    .line 161
    :cond_6
    sget-object v5, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    if-nez v5, :cond_7

    .line 162
    new-instance v5, Lorg/libsdl/app/SDLDummyEdit;

    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/libsdl/app/SDLDummyEdit;-><init>(Landroid/content/Context;)V

    sput-object v5, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    .line 163
    sget-object v5, Lorg/libsdl/app/SDLActivity;->mLayout:Landroid/view/ViewGroup;

    sget-object v6, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-static {p2, p3, p4, p5}, Lorg/libsdl/app/SdlImeController;->makeParams(IIII)Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3

    .line 164
    :cond_7
    if-ltz p2, :cond_8

    if-lez p4, :cond_8

    .line 168
    sget-object v5, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v5}, Lorg/libsdl/app/SDLDummyEdit;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 169
    .local v5, "params":Landroid/view/ViewGroup$MarginLayoutParams;
    iput p4, v5, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 170
    add-int/lit8 v6, p5, 0xf

    iput v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 171
    iput p2, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 172
    iput p3, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 173
    sget-object v6, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v6, v5}, Lorg/libsdl/app/SDLDummyEdit;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 175
    .end local v5    # "params":Landroid/view/ViewGroup$MarginLayoutParams;
    :cond_8
    :goto_3
    sget-object v5, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v5, p1}, Lorg/libsdl/app/SDLDummyEdit;->setInputType(I)V

    .line 176
    sget-object v5, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v5, v3}, Lorg/libsdl/app/SDLDummyEdit;->setFocusable(Z)V

    .line 177
    sget-object v5, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v5, v3}, Lorg/libsdl/app/SDLDummyEdit;->setFocusableInTouchMode(Z)V

    .line 179
    sget-object v5, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v5, v4}, Lorg/libsdl/app/SDLDummyEdit;->setVisibility(I)V

    .line 180
    sget-object v5, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v5}, Lorg/libsdl/app/SDLDummyEdit;->hasFocus()Z

    move-result v5

    if-nez v5, :cond_9

    .line 181
    sget-object v5, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v5}, Lorg/libsdl/app/SDLDummyEdit;->requestFocus()Z

    .line 184
    :cond_9
    sget-boolean v5, Lorg/libsdl/app/SdlImeController;->mKeyboardShown:Z

    if-eqz v5, :cond_a

    .line 185
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IME: already visible, show by "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    return-void

    .line 188
    :cond_a
    if-nez v0, :cond_b

    .line 189
    const-string v1, "IME: auto show suppressed by launcher setting"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 190
    return-void

    .line 193
    :cond_b
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v1

    const-string v5, "input_method"

    invoke-virtual {v1, v5}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 194
    .local v1, "imm":Landroid/view/inputmethod/InputMethodManager;
    sget-object v5, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v1, v5, v4}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 195
    invoke-virtual {v1}, Landroid/view/inputmethod/InputMethodManager;->isAcceptingText()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 196
    sput-boolean v3, Lorg/libsdl/app/SdlImeController;->mKeyboardShown:Z

    .line 197
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IME: shown by "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->onNativeScreenKeyboardShown()V

    .line 200
    :cond_c
    return-void
.end method

.method private static forceHideIme()V
    .locals 6

    .line 243
    sget-object v0, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    const/4 v1, 0x0

    const-string v2, "input_method"

    if-eqz v0, :cond_2

    .line 244
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 245
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    sget-object v3, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v3}, Lorg/libsdl/app/SDLDummyEdit;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 246
    sget-object v3, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v3}, Lorg/libsdl/app/SDLDummyEdit;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 248
    :cond_0
    sget-object v3, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v3}, Lorg/libsdl/app/SDLDummyEdit;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 249
    .local v3, "parent":Landroid/view/ViewParent;
    instance-of v4, v3, Landroid/view/ViewGroup;

    if-eqz v4, :cond_1

    .line 250
    move-object v4, v3

    check-cast v4, Landroid/view/ViewGroup;

    sget-object v5, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 252
    :cond_1
    const/4 v4, 0x0

    sput-object v4, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    .line 253
    const-string v4, "SDLImeController"

    const-string v5, "IME: text edit removed from view tree"

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 255
    .end local v0    # "imm":Landroid/view/inputmethod/InputMethodManager;
    .end local v3    # "parent":Landroid/view/ViewParent;
    :cond_2
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mLayout:Landroid/view/ViewGroup;

    .line 256
    .local v0, "layout":Landroid/view/ViewGroup;
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 258
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 259
    .local v2, "imm":Landroid/view/inputmethod/InputMethodManager;
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 261
    .end local v2    # "imm":Landroid/view/inputmethod/InputMethodManager;
    :cond_3
    return-void
.end method

.method static isEditAvailable()Z
    .locals 1

    .line 63
    sget-object v0, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static isInputAccepted()Z
    .locals 1

    .line 59
    sget-boolean v0, Lorg/libsdl/app/SdlImeController;->mTextInputActive:Z

    if-nez v0, :cond_1

    sget-boolean v0, Lorg/libsdl/app/SdlImeController;->mForcedByLauncher:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method static isKeyboardShown()Z
    .locals 1

    .line 67
    sget-boolean v0, Lorg/libsdl/app/SdlImeController;->mKeyboardShown:Z

    return v0
.end method

.method static isTextInputActive()Z
    .locals 1

    .line 54
    sget-boolean v0, Lorg/libsdl/app/SdlImeController;->mTextInputActive:Z

    return v0
.end method

.method private static isUnwantedImeVisible()Z
    .locals 2

    .line 264
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {}, Lorg/libsdl/app/SdlImeController;->isInputAccepted()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 267
    :cond_0
    sget-object v0, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    if-eqz v0, :cond_1

    sget-object v0, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v0}, Lorg/libsdl/app/SDLDummyEdit;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    .line 265
    :cond_2
    :goto_0
    return v1
.end method

.method static synthetic lambda$requestHide$1(Lorg/libsdl/app/SdlImeController$Source;)V
    .locals 0
    .param p0, "source"    # Lorg/libsdl/app/SdlImeController$Source;

    .line 100
    invoke-static {p0}, Lorg/libsdl/app/SdlImeController;->doHide(Lorg/libsdl/app/SdlImeController$Source;)V

    return-void
.end method

.method static synthetic lambda$requestShow$0(Lorg/libsdl/app/SdlImeController$Source;IIIII)V
    .locals 0
    .param p0, "source"    # Lorg/libsdl/app/SdlImeController$Source;
    .param p1, "inputType"    # I
    .param p2, "x"    # I
    .param p3, "y"    # I
    .param p4, "w"    # I
    .param p5, "h"    # I

    .line 92
    invoke-static/range {p0 .. p5}, Lorg/libsdl/app/SdlImeController;->doShow(Lorg/libsdl/app/SdlImeController$Source;IIIII)V

    return-void
.end method

.method private static makeParams(IIII)Landroid/widget/FrameLayout$LayoutParams;
    .locals 2
    .param p0, "x"    # I
    .param p1, "y"    # I
    .param p2, "w"    # I
    .param p3, "h"    # I

    .line 203
    if-ltz p0, :cond_0

    if-gtz p2, :cond_1

    .line 204
    :cond_0
    const/4 p0, 0x0

    .line 205
    const/4 p1, 0x0

    .line 206
    const/4 p2, 0x1

    .line 207
    const/4 p3, 0x1

    .line 209
    :cond_1
    add-int/lit8 v0, p3, 0xf

    if-gtz v0, :cond_2

    .line 210
    const/16 p3, -0xe

    .line 212
    :cond_2
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    add-int/lit8 v1, p3, 0xf

    invoke-direct {v0, p2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 213
    .local v0, "params":Landroid/widget/FrameLayout$LayoutParams;
    iput p0, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 214
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 215
    return-object v0
.end method

.method static notifyVisibilityChanged(Z)V
    .locals 3
    .param p0, "visible"    # Z

    .line 108
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 109
    :cond_0
    const-string v0, "SDLImeController"

    if-eqz p0, :cond_1

    invoke-static {}, Lorg/libsdl/app/SdlImeController;->isUnwantedImeVisible()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 111
    const-string v1, "IME: unwanted visibility while text input channel is closed, forcing hide"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    invoke-static {}, Lorg/libsdl/app/SdlImeController;->forceHideIme()V

    .line 113
    return-void

    .line 115
    :cond_1
    sget-boolean v1, Lorg/libsdl/app/SdlImeController;->mKeyboardShown:Z

    if-ne v1, p0, :cond_2

    .line 116
    return-void

    .line 118
    :cond_2
    sput-boolean p0, Lorg/libsdl/app/SdlImeController;->mKeyboardShown:Z

    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IME: visibility changed to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-eqz p0, :cond_3

    const-string v2, "shown"

    goto :goto_0

    :cond_3
    const-string v2, "hidden"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    if-eqz p0, :cond_4

    .line 121
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->onNativeScreenKeyboardShown()V

    goto :goto_1

    .line 123
    :cond_4
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->onNativeScreenKeyboardHidden()V

    .line 125
    :goto_1
    return-void
.end method

.method private static post(Ljava/lang/Runnable;)Z
    .locals 2
    .param p0, "task"    # Ljava/lang/Runnable;

    .line 128
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 129
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 130
    const/4 v0, 0x1

    return v0

    .line 132
    :cond_0
    sget-object v0, Lorg/libsdl/app/SDLActivity;->commandHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    return v0
.end method

.method private static recheckHidden()V
    .locals 2

    .line 271
    sget-boolean v0, Lorg/libsdl/app/SdlImeController;->mTextInputActive:Z

    if-nez v0, :cond_2

    sget-boolean v0, Lorg/libsdl/app/SdlImeController;->mKeyboardShown:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 274
    :cond_0
    invoke-static {}, Lorg/libsdl/app/SdlImeController;->isUnwantedImeVisible()Z

    move-result v0

    if-nez v0, :cond_1

    .line 275
    return-void

    .line 277
    :cond_1
    const-string v0, "SDLImeController"

    const-string v1, "IME: re-hide to suppress stubborn IME"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 278
    invoke-static {}, Lorg/libsdl/app/SdlImeController;->forceHideIme()V

    .line 279
    return-void

    .line 272
    :cond_2
    :goto_0
    return-void
.end method

.method static requestHide(Lorg/libsdl/app/SdlImeController$Source;)V
    .locals 2
    .param p0, "source"    # Lorg/libsdl/app/SdlImeController$Source;

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IME: hide requested by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SDLImeController"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    sget-object v0, Lorg/libsdl/app/SdlImeController$Source;->GAME:Lorg/libsdl/app/SdlImeController$Source;

    if-ne p0, v0, :cond_0

    .line 98
    const/4 v0, 0x0

    sput-boolean v0, Lorg/libsdl/app/SdlImeController;->mTextInputActive:Z

    .line 100
    :cond_0
    new-instance v0, Lorg/libsdl/app/SdlImeController$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0}, Lorg/libsdl/app/SdlImeController$$ExternalSyntheticLambda2;-><init>(Lorg/libsdl/app/SdlImeController$Source;)V

    invoke-static {v0}, Lorg/libsdl/app/SdlImeController;->post(Ljava/lang/Runnable;)Z

    .line 101
    return-void
.end method

.method static requestShow(Lorg/libsdl/app/SdlImeController$Source;)V
    .locals 6
    .param p0, "source"    # Lorg/libsdl/app/SdlImeController$Source;

    .line 84
    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, -0x1

    move-object v0, p0

    .end local p0    # "source":Lorg/libsdl/app/SdlImeController$Source;
    .local v0, "source":Lorg/libsdl/app/SdlImeController$Source;
    invoke-static/range {v0 .. v5}, Lorg/libsdl/app/SdlImeController;->requestShow(Lorg/libsdl/app/SdlImeController$Source;IIIII)Z

    .line 85
    return-void
.end method

.method static requestShow(Lorg/libsdl/app/SdlImeController$Source;IIIII)Z
    .locals 8
    .param p0, "source"    # Lorg/libsdl/app/SdlImeController$Source;
    .param p1, "inputType"    # I
    .param p2, "x"    # I
    .param p3, "y"    # I
    .param p4, "w"    # I
    .param p5, "h"    # I

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IME: show requested by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SDLImeController"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    sget-object v0, Lorg/libsdl/app/SdlImeController$Source;->GAME:Lorg/libsdl/app/SdlImeController$Source;

    if-ne p0, v0, :cond_0

    .line 90
    const/4 v0, 0x1

    sput-boolean v0, Lorg/libsdl/app/SdlImeController;->mTextInputActive:Z

    .line 92
    :cond_0
    new-instance v1, Lorg/libsdl/app/SdlImeController$$ExternalSyntheticLambda1;

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    .end local p0    # "source":Lorg/libsdl/app/SdlImeController$Source;
    .end local p1    # "inputType":I
    .end local p2    # "x":I
    .end local p3    # "y":I
    .end local p4    # "w":I
    .end local p5    # "h":I
    .local v2, "source":Lorg/libsdl/app/SdlImeController$Source;
    .local v3, "inputType":I
    .local v4, "x":I
    .local v5, "y":I
    .local v6, "w":I
    .local v7, "h":I
    invoke-direct/range {v1 .. v7}, Lorg/libsdl/app/SdlImeController$$ExternalSyntheticLambda1;-><init>(Lorg/libsdl/app/SdlImeController$Source;IIIII)V

    invoke-static {v1}, Lorg/libsdl/app/SdlImeController;->post(Ljava/lang/Runnable;)Z

    move-result p0

    return p0
.end method

.method static reset()V
    .locals 3

    .line 71
    sget-object v0, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    if-eqz v0, :cond_1

    .line 72
    sget-object v0, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v0}, Lorg/libsdl/app/SDLDummyEdit;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 73
    .local v0, "parent":Landroid/view/ViewParent;
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 74
    move-object v1, v0

    check-cast v1, Landroid/view/ViewGroup;

    sget-object v2, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 76
    :cond_0
    const/4 v1, 0x0

    sput-object v1, Lorg/libsdl/app/SdlImeController;->mEdit:Lorg/libsdl/app/SDLDummyEdit;

    .line 78
    .end local v0    # "parent":Landroid/view/ViewParent;
    :cond_1
    const/4 v0, 0x0

    sput-boolean v0, Lorg/libsdl/app/SdlImeController;->mTextInputActive:Z

    .line 79
    sput-boolean v0, Lorg/libsdl/app/SdlImeController;->mKeyboardShown:Z

    .line 80
    sput-boolean v0, Lorg/libsdl/app/SdlImeController;->mForcedByLauncher:Z

    .line 81
    return-void
.end method
