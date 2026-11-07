.class public final Lcom/pymcl/runtime/keyboard/TextFieldInputView$1;
.super Ljava/lang/Object;
.source "TextFieldInputView.kt"

# interfaces
.implements Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/keyboard/TextFieldInputView;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/keyboard/TextFieldChannel;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/pymcl/runtime/keyboard/TextFieldInputView$1",
        "Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;",
        "onState",
        "",
        "state",
        "Lcom/pymcl/runtime/keyboard/TextFieldState;",
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
.method public static synthetic $r8$lambda$QcRsYamh6VKJXqwDOPU6gj5BXjs(Lcom/pymcl/runtime/keyboard/TextFieldInputView;Lcom/pymcl/runtime/keyboard/TextFieldState;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$1;->onState$lambda$0(Lcom/pymcl/runtime/keyboard/TextFieldInputView;Lcom/pymcl/runtime/keyboard/TextFieldState;)V

    return-void
.end method

.method constructor <init>(Lcom/pymcl/runtime/keyboard/TextFieldInputView;)V
    .locals 0
    .param p1, "$receiver"    # Lcom/pymcl/runtime/keyboard/TextFieldInputView;

    iput-object p1, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView$1;->this$0:Lcom/pymcl/runtime/keyboard/TextFieldInputView;

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final onState$lambda$0(Lcom/pymcl/runtime/keyboard/TextFieldInputView;Lcom/pymcl/runtime/keyboard/TextFieldState;)V
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/runtime/keyboard/TextFieldInputView;
    .param p1, "$state"    # Lcom/pymcl/runtime/keyboard/TextFieldState;

    .line 37
    invoke-static {p0, p1}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->access$onRemoteState(Lcom/pymcl/runtime/keyboard/TextFieldInputView;Lcom/pymcl/runtime/keyboard/TextFieldState;)V

    return-void
.end method


# virtual methods
.method public onState(Lcom/pymcl/runtime/keyboard/TextFieldState;)V
    .locals 3
    .param p1, "state"    # Lcom/pymcl/runtime/keyboard/TextFieldState;

    .line 37
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView$1;->this$0:Lcom/pymcl/runtime/keyboard/TextFieldInputView;

    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/TextFieldInputView$1;->this$0:Lcom/pymcl/runtime/keyboard/TextFieldInputView;

    new-instance v2, Lcom/pymcl/runtime/keyboard/TextFieldInputView$1$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1, p1}, Lcom/pymcl/runtime/keyboard/TextFieldInputView$1$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/runtime/keyboard/TextFieldInputView;Lcom/pymcl/runtime/keyboard/TextFieldState;)V

    invoke-virtual {v0, v2}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
