.class public final Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$lambda$14$0$$inlined$onDispose$1;
.super Ljava/lang/Object;
.source "Effects.kt"

# interfaces
.implements Landroidx/compose/runtime/DisposableEffectResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/DialogsKt;->DialogBody(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Dialogs.kt\ncom/pymcl/android/ui/dialogs/DialogsKt\n*L\n1#1,67:1\n91#2:68\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004\u00b8\u0006\u0000"
    }
    d2 = {
        "androidx/compose/runtime/DisposableEffectScope$onDispose$1",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        "dispose",
        "",
        "runtime_release"
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
.field final synthetic $busy$delegate$inlined:Landroidx/compose/runtime/MutableState;

.field final synthetic $d$inlined:Lcom/pymcl/android/ui/state/DialogSpec;

.field final synthetic $state$inlined:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method public constructor <init>(Lcom/pymcl/android/ui/state/DialogSpec;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$lambda$14$0$$inlined$onDispose$1;->$d$inlined:Lcom/pymcl/android/ui/state/DialogSpec;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$lambda$14$0$$inlined$onDispose$1;->$state$inlined:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$lambda$14$0$$inlined$onDispose$1;->$busy$delegate$inlined:Landroidx/compose/runtime/MutableState;

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 3

    .line 66
    const/4 v0, 0x0

    .line 68
    .local v0, "$i$a$-onDispose-DialogsKt$DialogBody$5$1$1\\1\\66\\0":I
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$lambda$14$0$$inlined$onDispose$1;->$d$inlined:Lcom/pymcl/android/ui/state/DialogSpec;

    sget-object v2, Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;->INSTANCE:Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$lambda$14$0$$inlined$onDispose$1;->$busy$delegate$inlined:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->access$DialogBody$lambda$12(Landroidx/compose/runtime/MutableState;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$lambda$14$0$$inlined$onDispose$1;->$state$inlined:Lcom/pymcl/android/ui/state/AppState;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/pymcl/android/ui/state/AppState;->setPendingLaunch$PyMCL_Android_app_debug(Z)V

    .line 66
    .end local v0    # "$i$a$-onDispose-DialogsKt$DialogBody$5$1$1\\1\\66\\0":I
    :cond_0
    nop

    .line 67
    return-void
.end method
