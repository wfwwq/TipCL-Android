.class public final Lcom/pymcl/runtime/keyboard/TouchCharInput;
.super Landroid/widget/EditText;
.source "TouchCharInput.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0008\u0010\u001a\u001a\u00020\u0008H\u0002J\u0018\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00082\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0014J\u0006\u0010#\u001a\u00020\u0008J\u0006\u0010$\u001a\u00020\u0008J\u0006\u0010%\u001a\u00020\u0008J\u0008\u0010&\u001a\u00020\'H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u000c@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000eR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0010\u0008)\u0012\u000c\u0008\u0011\u0012\u0008\u0008\u000cJ\u0004\u0008\u0008(*\u00a8\u0006("
    }
    d2 = {
        "Lcom/pymcl/runtime/keyboard/TouchCharInput;",
        "Landroid/widget/EditText;",
        "context",
        "Landroid/content/Context;",
        "sink",
        "Lcom/pymcl/runtime/input/InputSink;",
        "restoreFocus",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;)V",
        "noFullscreen",
        "",
        "getNoFullscreen",
        "()Z",
        "setNoFullscreen",
        "(Z)V",
        "value",
        "isShowing",
        "last",
        "",
        "muted",
        "onCreateInputConnection",
        "Landroid/view/inputmethod/InputConnection;",
        "outAttrs",
        "Landroid/view/inputmethod/EditorInfo;",
        "resetFiller",
        "onKeyPreIme",
        "keyCode",
        "",
        "event",
        "Landroid/view/KeyEvent;",
        "onSelectionChanged",
        "selStart",
        "selEnd",
        "show",
        "hide",
        "toggle",
        "imm",
        "Landroid/view/inputmethod/InputMethodManager;",
        "PyMCL-Android:runtime_debug",
        "Landroid/annotation/SuppressLint;",
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
.field private isShowing:Z

.field private last:Ljava/lang/String;

.field private muted:Z

.field private noFullscreen:Z

.field private final restoreFocus:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final sink:Lcom/pymcl/runtime/input/InputSink;


# direct methods
.method public static synthetic $r8$lambda$AEJkch5C3Jskx82eOFxu1ZKpDM8(Lcom/pymcl/runtime/keyboard/TouchCharInput;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->_init_$lambda$0(Lcom/pymcl/runtime/keyboard/TouchCharInput;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "sink"    # Lcom/pymcl/runtime/input/InputSink;
    .param p3, "restoreFocus"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/pymcl/runtime/input/InputSink;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restoreFocus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    nop

    .line 47
    nop

    .line 46
    invoke-direct {p0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 47
    iput-object p2, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    iput-object p3, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->restoreFocus:Lkotlin/jvm/functions/Function0;

    .line 48
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->noFullscreen:Z

    .line 50
    sget-object v1, Lcom/pymcl/runtime/keyboard/TextDiff;->INSTANCE:Lcom/pymcl/runtime/keyboard/TextDiff;

    invoke-virtual {v1}, Lcom/pymcl/runtime/keyboard/TextDiff;->getFILLER()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->last:Ljava/lang/String;

    .line 53
    nop

    .line 54
    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->setFocusable(Z)V

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->setFocusableInTouchMode(Z)V

    .line 55
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->setAlpha(F)V

    .line 56
    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->setSingleLine(Z)V

    .line 57
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 58
    const v0, 0x80001

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->setInputType(I)V

    .line 59
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->resetFiller()V

    .line 60
    new-instance v0, Lcom/pymcl/runtime/keyboard/TouchCharInput$1;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput$1;-><init>(Lcom/pymcl/runtime/keyboard/TouchCharInput;)V

    check-cast v0, Landroid/text/TextWatcher;

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 72
    new-instance v0, Lcom/pymcl/runtime/keyboard/TouchCharInput$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/runtime/keyboard/TouchCharInput;)V

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 73
    nop

    .line 47
    return-void
.end method

.method private static final _init_$lambda$0(Lcom/pymcl/runtime/keyboard/TouchCharInput;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/runtime/keyboard/TouchCharInput;

    .line 72
    iget-object p1, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/16 p2, 0x1c

    invoke-interface {p1, p2}, Lcom/pymcl/runtime/input/InputSink;->tapKey(I)V

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->hide()V

    const/4 p1, 0x1

    return p1
.end method

.method public static final synthetic access$getLast$p(Lcom/pymcl/runtime/keyboard/TouchCharInput;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/keyboard/TouchCharInput;

    .line 46
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->last:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getMuted$p(Lcom/pymcl/runtime/keyboard/TouchCharInput;)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/keyboard/TouchCharInput;

    .line 46
    iget-boolean v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->muted:Z

    return v0
.end method

.method public static final synthetic access$getSink$p(Lcom/pymcl/runtime/keyboard/TouchCharInput;)Lcom/pymcl/runtime/input/InputSink;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/keyboard/TouchCharInput;

    .line 46
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    return-object v0
.end method

.method public static final synthetic access$resetFiller(Lcom/pymcl/runtime/keyboard/TouchCharInput;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/keyboard/TouchCharInput;

    .line 46
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->resetFiller()V

    return-void
.end method

.method public static final synthetic access$setLast$p(Lcom/pymcl/runtime/keyboard/TouchCharInput;Ljava/lang/String;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/keyboard/TouchCharInput;
    .param p1, "<set-?>"    # Ljava/lang/String;

    .line 46
    iput-object p1, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->last:Ljava/lang/String;

    return-void
.end method

.method private final imm()Landroid/view/inputmethod/InputMethodManager;
    .locals 2

    .line 116
    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method

.method private final resetFiller()V
    .locals 1

    .line 83
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->muted:Z

    .line 84
    sget-object v0, Lcom/pymcl/runtime/keyboard/TextDiff;->INSTANCE:Lcom/pymcl/runtime/keyboard/TextDiff;

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextDiff;->getFILLER()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->setText(Ljava/lang/CharSequence;)V

    const/16 v0, 0x1e

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->setSelection(I)V

    sget-object v0, Lcom/pymcl/runtime/keyboard/TextDiff;->INSTANCE:Lcom/pymcl/runtime/keyboard/TextDiff;

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextDiff;->getFILLER()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->last:Ljava/lang/String;

    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->muted:Z

    .line 86
    return-void
.end method


# virtual methods
.method public final getNoFullscreen()Z
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->noFullscreen:Z

    return v0
.end method

.method public final hide()V
    .locals 3

    .line 108
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->imm()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 109
    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->clearFocus()V

    .line 110
    iput-boolean v2, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->isShowing:Z

    .line 111
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->restoreFocus:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 112
    return-void
.end method

.method public final isShowing()Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->isShowing:Z

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3
    .param p1, "outAttrs"    # Landroid/view/inputmethod/EditorInfo;

    const-string v0, "outAttrs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-super {p0, p1}, Landroid/widget/EditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 77
    .local v0, "ic":Landroid/view/inputmethod/InputConnection;
    iget v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    or-int/lit8 v1, v1, 0x6

    .line 78
    iget-boolean v2, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->noFullscreen:Z

    if-eqz v2, :cond_0

    const/high16 v2, 0x12000000

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 77
    :goto_0
    or-int/2addr v1, v2

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 79
    return-object v0
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 2
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->isShowing:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->hide()V

    return v1

    .line 90
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->onKeyPreIme(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method protected onSelectionChanged(II)V
    .locals 1
    .param p1, "selStart"    # I
    .param p2, "selEnd"    # I

    .line 95
    iget-boolean v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->muted:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-eq p2, v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->setSelection(I)V

    .line 96
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->onSelectionChanged(II)V

    .line 97
    return-void
.end method

.method public final setNoFullscreen(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 48
    iput-boolean p1, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->noFullscreen:Z

    return-void
.end method

.method public final show()V
    .locals 3

    .line 100
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->resetFiller()V

    .line 101
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->setVisibility(I)V

    .line 102
    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->requestFocus()Z

    .line 103
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->imm()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 104
    iput-boolean v2, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->isShowing:Z

    .line 105
    return-void
.end method

.method public final toggle()V
    .locals 1

    .line 114
    iget-boolean v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput;->isShowing:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->hide()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->show()V

    :goto_0
    return-void
.end method
