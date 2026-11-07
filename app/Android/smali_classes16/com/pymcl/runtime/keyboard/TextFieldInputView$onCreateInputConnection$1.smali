.class public final Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;
.super Landroid/view/inputmethod/BaseInputConnection;
.source "TextFieldInputView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/keyboard/TextFieldInputView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J\u0018\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0018\u0010\r\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0008\u0010\u000e\u001a\u00020\u0008H\u0016J\u0018\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u000cH\u0016J\u0018\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u000cH\u0016J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u000cH\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u000cH\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000cH\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "com/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1",
        "Landroid/view/inputmethod/BaseInputConnection;",
        "cur",
        "Lcom/pymcl/runtime/keyboard/TextFieldState;",
        "push",
        "",
        "n",
        "commitText",
        "",
        "text",
        "",
        "newCursorPosition",
        "",
        "setComposingText",
        "finishComposingText",
        "deleteSurroundingText",
        "before",
        "after",
        "setSelection",
        "start",
        "end",
        "getTextBeforeCursor",
        "flags",
        "getTextAfterCursor",
        "getSelectedText",
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
.field final synthetic this$0:Lcom/pymcl/runtime/keyboard/TextFieldInputView;


# direct methods
.method constructor <init>(Lcom/pymcl/runtime/keyboard/TextFieldInputView;)V
    .locals 2
    .param p1, "$receiver"    # Lcom/pymcl/runtime/keyboard/TextFieldInputView;

    iput-object p1, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->this$0:Lcom/pymcl/runtime/keyboard/TextFieldInputView;

    .line 58
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    return-void
.end method

.method private final cur()Lcom/pymcl/runtime/keyboard/TextFieldState;
    .locals 9

    .line 59
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->this$0:Lcom/pymcl/runtime/keyboard/TextFieldInputView;

    invoke-static {v0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->access$getState$p(Lcom/pymcl/runtime/keyboard/TextFieldInputView;)Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v1, Lcom/pymcl/runtime/keyboard/TextFieldState;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/pymcl/runtime/keyboard/TextFieldState;-><init>(Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    :cond_0
    return-object v0
.end method

.method private final push(Lcom/pymcl/runtime/keyboard/TextFieldState;)V
    .locals 1
    .param p1, "n"    # Lcom/pymcl/runtime/keyboard/TextFieldState;

    .line 60
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->this$0:Lcom/pymcl/runtime/keyboard/TextFieldInputView;

    invoke-static {v0, p1}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->access$setState$p(Lcom/pymcl/runtime/keyboard/TextFieldInputView;Lcom/pymcl/runtime/keyboard/TextFieldState;)V

    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->this$0:Lcom/pymcl/runtime/keyboard/TextFieldInputView;

    invoke-static {v0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->access$getChannel$p(Lcom/pymcl/runtime/keyboard/TextFieldInputView;)Lcom/pymcl/runtime/keyboard/TextFieldChannel;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/pymcl/runtime/keyboard/TextFieldChannel;->pushState(Lcom/pymcl/runtime/keyboard/TextFieldState;)V

    return-void
.end method


# virtual methods
.method public commitText(Ljava/lang/CharSequence;I)Z
    .locals 12
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "newCursorPosition"    # I

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->cur()Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object v0

    .local v0, "c":Lcom/pymcl/runtime/keyboard/TextFieldState;
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingStart()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingStart()I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionStart()I

    move-result v1

    .line 63
    .local v1, "a":I
    :goto_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingStart()I

    move-result v2

    if-ltz v2, :cond_1

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingEnd()I

    move-result v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionEnd()I

    move-result v2

    .line 64
    .local v2, "b":I
    :goto_1
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    invoke-static {v1, v5, v4}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v4

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v2, v1, v5}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v5

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3, v4, v5, p1}, Lkotlin/text/StringsKt;->replaceRange(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 65
    .local v5, "t":Ljava/lang/String;
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    add-int v6, v1, v3

    .local v6, "p":I
    new-instance v4, Lcom/pymcl/runtime/keyboard/TextFieldState;

    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v7, v6

    invoke-direct/range {v4 .. v11}, Lcom/pymcl/runtime/keyboard/TextFieldState;-><init>(Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v4}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->push(Lcom/pymcl/runtime/keyboard/TextFieldState;)V

    const/4 v3, 0x1

    return v3
.end method

.method public deleteSurroundingText(II)Z
    .locals 11
    .param p1, "before"    # I
    .param p2, "after"    # I

    .line 75
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->cur()Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object v0

    .local v0, "c":Lcom/pymcl/runtime/keyboard/TextFieldState;
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionStart()I

    move-result v1

    sub-int/2addr v1, p1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v5

    .local v5, "a":I
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionEnd()I

    move-result v1

    add-int/2addr v1, p2

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v1

    .line 76
    .local v1, "b":I
    new-instance v3, Lcom/pymcl/runtime/keyboard/TextFieldState;

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2, v5, v1}, Lkotlin/text/StringsKt;->removeRange(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v6, v5

    invoke-direct/range {v3 .. v10}, Lcom/pymcl/runtime/keyboard/TextFieldState;-><init>(Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v3}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->push(Lcom/pymcl/runtime/keyboard/TextFieldState;)V

    const/4 v2, 0x1

    return v2
.end method

.method public finishComposingText()Z
    .locals 8

    .line 73
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->cur()Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object v0

    .local v0, "c":Lcom/pymcl/runtime/keyboard/TextFieldState;
    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, -0x1

    invoke-static/range {v0 .. v7}, Lcom/pymcl/runtime/keyboard/TextFieldState;->copy$default(Lcom/pymcl/runtime/keyboard/TextFieldState;Ljava/lang/String;IIIIILjava/lang/Object;)Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->push(Lcom/pymcl/runtime/keyboard/TextFieldState;)V

    const/4 v1, 0x1

    return v1
.end method

.method public getSelectedText(I)Ljava/lang/CharSequence;
    .locals 7
    .param p1, "flags"    # I

    .line 81
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->cur()Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object v0

    .local v0, "c":Lcom/pymcl/runtime/keyboard/TextFieldState;
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionStart()I

    move-result v2

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v2, v4, v3}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v2

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionEnd()I

    move-result v3

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionStart()I

    move-result v5

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-static {v5, v4, v6}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v4

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v3, v4, v5}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "substring(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    return-object v1
.end method

.method public getTextAfterCursor(II)Ljava/lang/CharSequence;
    .locals 5
    .param p1, "n"    # I
    .param p2, "flags"    # I

    .line 80
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->cur()Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object v0

    .local v0, "c":Lcom/pymcl/runtime/keyboard/TextFieldState;
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionEnd()I

    move-result v1

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v1

    .local v1, "e":I
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v2

    add-int v3, v1, p1

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v3, v4}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v3

    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/CharSequence;

    return-object v2
.end method

.method public getTextBeforeCursor(II)Ljava/lang/CharSequence;
    .locals 6
    .param p1, "n"    # I
    .param p2, "flags"    # I

    .line 79
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->cur()Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object v0

    .local v0, "c":Lcom/pymcl/runtime/keyboard/TextFieldState;
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionStart()I

    move-result v2

    sub-int/2addr v2, p1

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionStart()I

    move-result v4

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v4, v3, v5}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "substring(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    return-object v1
.end method

.method public setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 8
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "newCursorPosition"    # I

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->cur()Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object v0

    .local v0, "c":Lcom/pymcl/runtime/keyboard/TextFieldState;
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingStart()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingStart()I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionStart()I

    move-result v1

    :goto_0
    move v6, v1

    .line 69
    .local v6, "a":I
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingStart()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingEnd()I

    move-result v1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionEnd()I

    move-result v1

    .line 70
    .local v1, "b":I
    :goto_1
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v6, v4, v3}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v3

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v1, v6, v4}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v4

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2, v3, v4, p1}, Lkotlin/text/StringsKt;->replaceRange(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 71
    .local v3, "t":Ljava/lang/String;
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    add-int v4, v6, v2

    .local v4, "p":I
    new-instance v2, Lcom/pymcl/runtime/keyboard/TextFieldState;

    move v5, v4

    move v7, v4

    invoke-direct/range {v2 .. v7}, Lcom/pymcl/runtime/keyboard/TextFieldState;-><init>(Ljava/lang/String;IIII)V

    invoke-direct {p0, v2}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->push(Lcom/pymcl/runtime/keyboard/TextFieldState;)V

    const/4 v2, 0x1

    return v2
.end method

.method public setSelection(II)Z
    .locals 8
    .param p1, "start"    # I
    .param p2, "end"    # I

    .line 78
    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->cur()Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object v0

    const/16 v6, 0x19

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v2, p1

    move v3, p2

    .end local p1    # "start":I
    .end local p2    # "end":I
    .local v2, "start":I
    .local v3, "end":I
    invoke-static/range {v0 .. v7}, Lcom/pymcl/runtime/keyboard/TextFieldState;->copy$default(Lcom/pymcl/runtime/keyboard/TextFieldState;Ljava/lang/String;IIIIILjava/lang/Object;)Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$onCreateInputConnection$1;->push(Lcom/pymcl/runtime/keyboard/TextFieldState;)V

    const/4 p1, 0x1

    return p1
.end method
