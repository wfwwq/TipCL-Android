.class final Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$2$3$2$1$2$1$1;
.super Ljava/lang/Object;
.source "AiPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/AiPageKt;->AiPage(Lcom/pymcl/android/ui/state/AppState;ZLjava/util/List;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
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


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiUiExtras;

.field final synthetic $chats$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $input$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $s:Lcom/pymcl/android/ui/pages/AiSession;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/pages/AiSession;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$2$3$2$1$2$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$2$3$2$1$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$2$3$2$1$2$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$2$3$2$1$2$1$1;->$input$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$2$3$2$1$2$1$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 241
    invoke-virtual {p0}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$2$3$2$1$2$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 241
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$2$3$2$1$2$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$2$3$2$1$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$2$3$2$1$2$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$2$3$2$1$2$1$1;->$input$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$2$3$2$1$2$1$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$retry(Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    return-void
.end method
