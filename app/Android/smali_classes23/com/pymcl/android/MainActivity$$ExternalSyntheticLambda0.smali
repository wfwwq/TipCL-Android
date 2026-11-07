.class public final synthetic Lcom/pymcl/android/MainActivity$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/MainActivity$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/android/ui/state/AppState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/MainActivity$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/android/ui/state/AppState;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/pymcl/android/MainActivity;->$r8$lambda$vyESdL3AVxZWv9_2-xPKY6rrNQw(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
