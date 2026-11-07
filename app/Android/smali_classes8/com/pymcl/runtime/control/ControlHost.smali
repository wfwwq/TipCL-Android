.class public interface abstract Lcom/pymcl/runtime/control/ControlHost;
.super Ljava/lang/Object;
.source "ControlViews.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH&J\u0008\u0010\u000e\u001a\u00020\u000fH&J\u0008\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0016\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/pymcl/runtime/control/ControlHost;",
        "",
        "sink",
        "Lcom/pymcl/runtime/input/InputSink;",
        "getSink",
        "()Lcom/pymcl/runtime/input/InputSink;",
        "editing",
        "",
        "getEditing",
        "()Z",
        "onAction",
        "",
        "action",
        "Lcom/pymcl/runtime/input/Keys$Action;",
        "lookSensitivity",
        "",
        "longPressMs",
        "",
        "onElementEdited",
        "view",
        "Lcom/pymcl/runtime/control/ControlElementView;",
        "onElementSelected",
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
.method public abstract getEditing()Z
.end method

.method public abstract getSink()Lcom/pymcl/runtime/input/InputSink;
.end method

.method public abstract longPressMs()J
.end method

.method public abstract lookSensitivity()F
.end method

.method public abstract onAction(Lcom/pymcl/runtime/input/Keys$Action;)V
.end method

.method public abstract onElementEdited(Lcom/pymcl/runtime/control/ControlElementView;)V
.end method

.method public abstract onElementSelected(Lcom/pymcl/runtime/control/ControlElementView;)V
.end method
