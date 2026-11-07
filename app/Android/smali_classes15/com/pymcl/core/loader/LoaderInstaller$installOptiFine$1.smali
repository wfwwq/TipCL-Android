.class final Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "Loaders.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/core/loader/LoaderInstaller;->installOptiFine(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.pymcl.core.loader.LoaderInstaller"
    f = "Loaders.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0xef,
        0xf0,
        0x10b
    }
    m = "installOptiFine"
    n = {
        "dirs",
        "mc",
        "edition",
        "dirs",
        "mc",
        "edition",
        "dirs",
        "mc",
        "edition",
        "inst",
        "ed",
        "id",
        "libName",
        "libFile",
        "libs"
    }
    nl = {
        0xf0,
        0xf1,
        0x10c
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8"
    }
    v = 0x2
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/pymcl/core/loader/LoaderInstaller;


# direct methods
.method constructor <init>(Lcom/pymcl/core/loader/LoaderInstaller;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/loader/LoaderInstaller;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->this$0:Lcom/pymcl/core/loader/LoaderInstaller;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->result:Ljava/lang/Object;

    iget v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->label:I

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    iput v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->label:I

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->this$0:Lcom/pymcl/core/loader/LoaderInstaller;

    const/4 v1, 0x0

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    invoke-virtual {v0, v1, v1, v1, v2}, Lcom/pymcl/core/loader/LoaderInstaller;->installOptiFine(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
