.class public final Lcom/pymcl/runtime/control/ControlViewsKt;
.super Ljava/lang/Object;
.source "ControlViews.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/control/ControlViewsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "createElementView",
        "Lcom/pymcl/runtime/control/ControlElementView;",
        "context",
        "Landroid/content/Context;",
        "e",
        "Lcom/pymcl/runtime/control/ControlElement;",
        "host",
        "Lcom/pymcl/runtime/control/ControlHost;",
        "PyMCL-Android:runtime_debug"
    }
    k = 0x2
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final createElementView(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)Lcom/pymcl/runtime/control/ControlElementView;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "e"    # Lcom/pymcl/runtime/control/ControlElement;
    .param p2, "host"    # Lcom/pymcl/runtime/control/ControlHost;

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    invoke-virtual {p1}, Lcom/pymcl/runtime/control/ControlElement;->getType()Lcom/pymcl/runtime/control/ElementType;

    move-result-object v0

    sget-object v1, Lcom/pymcl/runtime/control/ControlViewsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ElementType;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 196
    :pswitch_0
    new-instance v0, Lcom/pymcl/runtime/control/LookAreaView;

    invoke-direct {v0, p0, p1, p2}, Lcom/pymcl/runtime/control/LookAreaView;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V

    check-cast v0, Lcom/pymcl/runtime/control/ControlElementView;

    goto :goto_0

    .line 195
    :pswitch_1
    new-instance v0, Lcom/pymcl/runtime/control/DirectionView;

    invoke-direct {v0, p0, p1, p2}, Lcom/pymcl/runtime/control/DirectionView;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V

    check-cast v0, Lcom/pymcl/runtime/control/ControlElementView;

    goto :goto_0

    .line 194
    :pswitch_2
    new-instance v0, Lcom/pymcl/runtime/control/ButtonView;

    invoke-direct {v0, p0, p1, p2}, Lcom/pymcl/runtime/control/ButtonView;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V

    check-cast v0, Lcom/pymcl/runtime/control/ControlElementView;

    .line 197
    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
