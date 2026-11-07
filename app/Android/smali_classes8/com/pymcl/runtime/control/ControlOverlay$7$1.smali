.class final synthetic Lcom/pymcl/runtime/control/ControlOverlay$7$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "ControlOverlay.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/control/ControlOverlay;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/control/ControlLayoutStore;Lcom/pymcl/runtime/input/InputSettings;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1018
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/pymcl/runtime/control/ControlLayout;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-class v3, Lcom/pymcl/runtime/control/DefaultLayouts;

    const-string v5, "default()Lcom/pymcl/runtime/control/ControlLayout;"

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-string v4, "default"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/pymcl/runtime/control/ControlLayout;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay$7$1;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/runtime/control/DefaultLayouts;

    .line 50
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DefaultLayouts;->default()Lcom/pymcl/runtime/control/ControlLayout;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ControlOverlay$7$1;->invoke()Lcom/pymcl/runtime/control/ControlLayout;

    move-result-object v0

    return-object v0
.end method
