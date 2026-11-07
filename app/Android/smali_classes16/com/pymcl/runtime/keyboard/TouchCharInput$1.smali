.class public final Lcom/pymcl/runtime/keyboard/TouchCharInput$1;
.super Ljava/lang/Object;
.source "TouchCharInput.kt"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/keyboard/TouchCharInput;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J*\u0010\n\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u000cH\u0016\u00a8\u0006\r"
    }
    d2 = {
        "com/pymcl/runtime/keyboard/TouchCharInput$1",
        "Landroid/text/TextWatcher;",
        "beforeTextChanged",
        "",
        "s",
        "",
        "a",
        "",
        "b",
        "c",
        "onTextChanged",
        "afterTextChanged",
        "Landroid/text/Editable;",
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
.field final synthetic this$0:Lcom/pymcl/runtime/keyboard/TouchCharInput;


# direct methods
.method constructor <init>(Lcom/pymcl/runtime/keyboard/TouchCharInput;)V
    .locals 0
    .param p1, "$receiver"    # Lcom/pymcl/runtime/keyboard/TouchCharInput;

    iput-object p1, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput$1;->this$0:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 6
    .param p1, "s"    # Landroid/text/Editable;

    .line 64
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput$1;->this$0:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    invoke-static {v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->access$getMuted$p(Lcom/pymcl/runtime/keyboard/TouchCharInput;)Z

    move-result v0

    if-nez v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 66
    .local v0, "now":Ljava/lang/String;
    sget-object v1, Lcom/pymcl/runtime/keyboard/TextDiff;->INSTANCE:Lcom/pymcl/runtime/keyboard/TextDiff;

    iget-object v2, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput$1;->this$0:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    invoke-static {v2}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->access$getSink$p(Lcom/pymcl/runtime/keyboard/TouchCharInput;)Lcom/pymcl/runtime/input/InputSink;

    move-result-object v2

    sget-object v3, Lcom/pymcl/runtime/keyboard/TextDiff;->INSTANCE:Lcom/pymcl/runtime/keyboard/TextDiff;

    iget-object v4, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput$1;->this$0:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    invoke-static {v4}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->access$getLast$p(Lcom/pymcl/runtime/keyboard/TouchCharInput;)Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    move-object v5, v0

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v3, v4, v5}, Lcom/pymcl/runtime/keyboard/TextDiff;->diff(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/pymcl/runtime/keyboard/TextDiff$Result;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/pymcl/runtime/keyboard/TextDiff;->apply(Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/keyboard/TextDiff$Result;)V

    .line 67
    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput$1;->this$0:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    invoke-static {v1, v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->access$setLast$p(Lcom/pymcl/runtime/keyboard/TouchCharInput;Ljava/lang/String;)V

    .line 69
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_1

    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/TouchCharInput$1;->this$0:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    invoke-static {v1}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->access$resetFiller(Lcom/pymcl/runtime/keyboard/TouchCharInput;)V

    .line 70
    :cond_1
    return-void

    .line 64
    .end local v0    # "now":Ljava/lang/String;
    :cond_2
    :goto_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .param p1, "s"    # Ljava/lang/CharSequence;
    .param p2, "a"    # I
    .param p3, "b"    # I
    .param p4, "c"    # I

    .line 61
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .param p1, "s"    # Ljava/lang/CharSequence;
    .param p2, "a"    # I
    .param p3, "b"    # I
    .param p4, "c"    # I

    .line 62
    return-void
.end method
