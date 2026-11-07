.class public final synthetic Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Ljava/util/concurrent/atomic/AtomicLong;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicLong;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1$$ExternalSyntheticLambda0;->f$0:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1$$ExternalSyntheticLambda0;->f$0:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/runtime/MutableState;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$r8$lambda$QbONbihRKg0DGADI2DbJMpYJdNU(Ljava/util/concurrent/atomic/AtomicLong;Landroidx/compose/runtime/MutableState;IIJ)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
