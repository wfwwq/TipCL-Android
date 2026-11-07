.class public final Lcom/pymcl/runtime/keyboard/TextFieldInputView;
.super Landroid/view/View;
.source "TextFieldInputView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002J\u0008\u0010\u0017\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00ca\u0001\u0010\u0008\u001d\u0012\u000c\u0008\u001e\u0012\u0008\u0008\u000cJ\u0004\u0008\u0008(\u001f\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/pymcl/runtime/keyboard/TextFieldInputView;",
        "Landroid/view/View;",
        "context",
        "Landroid/content/Context;",
        "channel",
        "Lcom/pymcl/runtime/keyboard/TextFieldChannel;",
        "<init>",
        "(Landroid/content/Context;Lcom/pymcl/runtime/keyboard/TextFieldChannel;)V",
        "noFullscreen",
        "",
        "getNoFullscreen",
        "()Z",
        "setNoFullscreen",
        "(Z)V",
        "state",
        "Lcom/pymcl/runtime/keyboard/TextFieldState;",
        "imm",
        "Landroid/view/inputmethod/InputMethodManager;",
        "getImm",
        "()Landroid/view/inputmethod/InputMethodManager;",
        "onRemoteState",
        "",
        "s",
        "onCheckIsTextEditor",
        "onCreateInputConnection",
        "Landroid/view/inputmethod/InputConnection;",
        "outAttrs",
        "Landroid/view/inputmethod/EditorInfo;",
        "PyMCL-Android:runtime_debug",
        "Landroid/annotation/SuppressLint;",
        "value",
        "ViewConstructor"
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
.field private final channel:Lcom/pymcl/runtime/keyboard/TextFieldChannel;

.field private noFullscreen:Z

.field private volatile state:Lcom/pymcl/runtime/keyboard/TextFieldState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/pymcl/runtime/keyboard/TextFieldChannel;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "channel"    # Lcom/pymcl/runtime/keyboard/TextFieldChannel;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    nop

    .line 29
    nop

    .line 28
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 29
    iput-object p2, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->channel:Lcom/pymcl/runtime/keyboard/TextFieldChannel;

    .line 30
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->noFullscreen:Z

    .line 34
    nop

    .line 35
    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->setFocusable(Z)V

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->setFocusableInTouchMode(Z)V

    .line 36
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->channel:Lcom/pymcl/runtime/keyboard/TextFieldChannel;

    new-instance v1, Lcom/pymcl/runtime/keyboard/TextFieldInputView$1;

    invoke-direct {v1, p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$1;-><init>(Lcom/pymcl/runtime/keyboard/TextFieldInputView;)V

    check-cast v1, Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;

    invoke-interface {v0, v1}, Lcom/pymcl/runtime/keyboard/TextFieldChannel;->setListener(Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;)V

    .line 39
    nop

    .line 29
    return-void
.end method

.method public static final synthetic access$getChannel$p(Lcom/pymcl/runtime/keyboard/TextFieldInputView;)Lcom/pymcl/runtime/keyboard/TextFieldChannel;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/keyboard/TextFieldInputView;

    .line 28
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->channel:Lcom/pymcl/runtime/keyboard/TextFieldChannel;

    return-object v0
.end method

.method public static final synthetic access$getState$p(Lcom/pymcl/runtime/keyboard/TextFieldInputView;)Lcom/pymcl/runtime/keyboard/TextFieldState;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/keyboard/TextFieldInputView;

    .line 28
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->state:Lcom/pymcl/runtime/keyboard/TextFieldState;

    return-object v0
.end method

.method public static final synthetic access$onRemoteState(Lcom/pymcl/runtime/keyboard/TextFieldInputView;Lcom/pymcl/runtime/keyboard/TextFieldState;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/keyboard/TextFieldInputView;
    .param p1, "s"    # Lcom/pymcl/runtime/keyboard/TextFieldState;

    .line 28
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->onRemoteState(Lcom/pymcl/runtime/keyboard/TextFieldState;)V

    return-void
.end method

.method public static final synthetic access$setState$p(Lcom/pymcl/runtime/keyboard/TextFieldInputView;Lcom/pymcl/runtime/keyboard/TextFieldState;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/keyboard/TextFieldInputView;
    .param p1, "<set-?>"    # Lcom/pymcl/runtime/keyboard/TextFieldState;

    .line 28
    iput-object p1, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->state:Lcom/pymcl/runtime/keyboard/TextFieldState;

    return-void
.end method

.method private final getImm()Landroid/view/inputmethod/InputMethodManager;
    .locals 2

    .line 32
    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method

.method private final onRemoteState(Lcom/pymcl/runtime/keyboard/TextFieldState;)V
    .locals 10
    .param p1, "s"    # Lcom/pymcl/runtime/keyboard/TextFieldState;

    .line 42
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->state:Lcom/pymcl/runtime/keyboard/TextFieldState;

    .local v0, "prev":Lcom/pymcl/runtime/keyboard/TextFieldState;
    iput-object p1, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->state:Lcom/pymcl/runtime/keyboard/TextFieldState;

    .line 43
    nop

    .line 44
    const/4 v1, 0x1

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->requestFocus()Z

    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->getImm()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Landroid/view/View;

    invoke-virtual {v2, v3, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    goto :goto_0

    .line 45
    :cond_0
    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->getImm()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v2

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->clearFocus()V

    .line 47
    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->getImm()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Landroid/view/View;

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionStart()I

    move-result v6

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionEnd()I

    move-result v7

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingStart()I

    move-result v8

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingEnd()I

    move-result v9

    invoke-virtual/range {v4 .. v9}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    .line 48
    :cond_2
    return-void
.end method


# virtual methods
.method public final getNoFullscreen()Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->noFullscreen:Z

    return v0
.end method

.method public onCheckIsTextEditor()Z
    .locals 1

    .line 50
    const/4 v0, 0x1

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3
    .param p1, "outAttrs"    # Landroid/view/inputmethod/EditorInfo;

    const-string v0, "outAttrs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->state:Lcom/pymcl/runtime/keyboard/TextFieldState;

    .line 54
    .local v0, "s":Lcom/pymcl/runtime/keyboard/TextFieldState;
    const/4 v1, 0x1

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 55
    nop

    .line 56
    iget-boolean v1, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->noFullscreen:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/high16 v1, 0x12000000

    goto :goto_0

    :cond_0
    move v1, v2

    .line 55
    :goto_0
    or-int/lit8 v1, v1, 0x6

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 57
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionStart()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionEnd()I

    move-result v2

    :cond_2
    iput v2, p1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 58
    new-instance v1, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;

    invoke-direct {v1, p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;-><init>(Lcom/pymcl/runtime/keyboard/TextFieldInputView;)V

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    return-object v1
.end method

.method public final setNoFullscreen(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 30
    iput-boolean p1, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->noFullscreen:Z

    return-void
.end method
