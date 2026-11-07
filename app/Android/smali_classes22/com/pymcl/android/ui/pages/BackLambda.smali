.class public final Lcom/pymcl/android/ui/pages/BackLambda;
.super Ljava/lang/Object;
.source "BackLambda.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field private final sel:Landroidx/compose/runtime/MutableState;


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/MutableState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/BackLambda;->sel:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/pymcl/android/ui/pages/BackLambda;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/BackLambda;->sel:Landroidx/compose/runtime/MutableState;

    const/4 p0, 0x0

    invoke-interface {v0, p0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method
