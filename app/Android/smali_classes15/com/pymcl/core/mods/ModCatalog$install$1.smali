.class final Lcom/pymcl/core/mods/ModCatalog$install$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ModCatalog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/core/mods/ModCatalog;->install(Lcom/pymcl/core/mods/ResKind;Lcom/pymcl/core/mods/ModFile;Ljava/io/File;Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.pymcl.core.mods.ModCatalog"
    f = "ModCatalog.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0xcd
    }
    m = "install"
    n = {
        "kind",
        "file",
        "gameDir",
        "downloads",
        "world",
        "onProgress",
        "dir",
        "name",
        "dest"
    }
    nl = {
        0xce
    }
    s = {
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

.field final synthetic this$0:Lcom/pymcl/core/mods/ModCatalog;


# direct methods
.method constructor <init>(Lcom/pymcl/core/mods/ModCatalog;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/mods/ModCatalog;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/core/mods/ModCatalog$install$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/core/mods/ModCatalog$install$1;->this$0:Lcom/pymcl/core/mods/ModCatalog;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iput-object p1, p0, Lcom/pymcl/core/mods/ModCatalog$install$1;->result:Ljava/lang/Object;

    iget v0, p0, Lcom/pymcl/core/mods/ModCatalog$install$1;->label:I

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    iput v0, p0, Lcom/pymcl/core/mods/ModCatalog$install$1;->label:I

    iget-object v1, p0, Lcom/pymcl/core/mods/ModCatalog$install$1;->this$0:Lcom/pymcl/core/mods/ModCatalog;

    const/4 v7, 0x0

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v8}, Lcom/pymcl/core/mods/ModCatalog;->install(Lcom/pymcl/core/mods/ResKind;Lcom/pymcl/core/mods/ModFile;Ljava/io/File;Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
