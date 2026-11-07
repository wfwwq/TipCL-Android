.class public interface abstract Lcom/pymcl/runtime/keyboard/TextFieldChannel;
.super Ljava/lang/Object;
.source "TextFieldInputView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001:\u0001\tJ\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H&\u00a8\u0006\n\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/pymcl/runtime/keyboard/TextFieldChannel;",
        "",
        "setListener",
        "",
        "l",
        "Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;",
        "pushState",
        "state",
        "Lcom/pymcl/runtime/keyboard/TextFieldState;",
        "Listener",
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


# virtual methods
.method public abstract pushState(Lcom/pymcl/runtime/keyboard/TextFieldState;)V
.end method

.method public abstract setListener(Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;)V
.end method
