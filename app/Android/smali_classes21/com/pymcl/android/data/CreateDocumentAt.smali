.class public final Lcom/pymcl/android/data/CreateDocumentAt;
.super Landroidx/activity/result/contract/ActivityResultContract;
.source "SaveImportData.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/CreateDocumentAt$Request;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/activity/result/contract/ActivityResultContract<",
        "Lcom/pymcl/android/data/CreateDocumentAt$Request;",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaveImportData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveImportData.kt\ncom/pymcl/android/data/CreateDocumentAt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/pymcl/android/data/CreateDocumentAt;",
        "Landroidx/activity/result/contract/ActivityResultContract;",
        "Lcom/pymcl/android/data/CreateDocumentAt$Request;",
        "Landroid/net/Uri;",
        "mime",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "createIntent",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "input",
        "parseResult",
        "resultCode",
        "",
        "intent",
        "Request",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final mime:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/pymcl/android/data/CreateDocumentAt;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "mime"    # Ljava/lang/String;

    const-string v0, "mime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-direct {p0}, Landroidx/activity/result/contract/ActivityResultContract;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/data/CreateDocumentAt;->mime:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lcom/pymcl/android/data/CreateDocumentAt$Request;)Landroid/content/Intent;
    .locals 9
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "input"    # Lcom/pymcl/android/data/CreateDocumentAt$Request;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.CREATE_DOCUMENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.category.OPENABLE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/CreateDocumentAt;->mime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 73
    const-string v1, "android.intent.extra.TITLE"

    invoke-virtual {p2}, Lcom/pymcl/android/data/CreateDocumentAt$Request;->getFileName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 74
    move-object v1, v0

    .line 78
    .local v1, "i\\1":Landroid/content/Intent;
    const/4 v2, 0x0

    .line 74
    .local v2, "$i$a$-also-CreateDocumentAt$createIntent$1\\1\\74\\0":I
    invoke-virtual {p2}, Lcom/pymcl/android/data/CreateDocumentAt$Request;->getInitialUri()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 78
    .local v3, "it\\2":Ljava/lang/String;
    const/4 v4, 0x0

    .line 74
    .local v4, "$i$a$-let-CreateDocumentAt$createIntent$1$1\\2\\74\\1":I
    :try_start_0
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v5, p0

    check-cast v5, Lcom/pymcl/android/data/CreateDocumentAt;

    .line 78
    .local v5, "$this$createIntent_u24lambda_u240_u240_u240\\3":Lcom/pymcl/android/data/CreateDocumentAt;
    const/4 v6, 0x0

    .line 74
    .local v6, "$i$a$-runCatching-CreateDocumentAt$createIntent$1$1$1\\3\\74\\2":I
    const-string v7, "android.provider.extra.INITIAL_URI"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    check-cast v8, Landroid/os/Parcelable;

    invoke-virtual {v1, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v7

    .end local v5    # "$this$createIntent_u24lambda_u240_u240_u240\\3":Lcom/pymcl/android/data/CreateDocumentAt;
    .end local v6    # "$i$a$-runCatching-CreateDocumentAt$createIntent$1$1$1\\3\\74\\2":I
    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v5

    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v5}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .end local v1    # "i\\1":Landroid/content/Intent;
    .end local v2    # "$i$a$-also-CreateDocumentAt$createIntent$1\\1\\74\\0":I
    .end local v3    # "it\\2":Ljava/lang/String;
    .end local v4    # "$i$a$-let-CreateDocumentAt$createIntent$1$1\\2\\74\\1":I
    :cond_0
    :goto_0
    const-string v1, "also(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "input"    # Ljava/lang/Object;

    .line 69
    move-object v0, p2

    check-cast v0, Lcom/pymcl/android/data/CreateDocumentAt$Request;

    invoke-virtual {p0, p1, v0}, Lcom/pymcl/android/data/CreateDocumentAt;->createIntent(Landroid/content/Context;Lcom/pymcl/android/data/CreateDocumentAt$Request;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public parseResult(ILandroid/content/Intent;)Landroid/net/Uri;
    .locals 2
    .param p1, "resultCode"    # I
    .param p2, "intent"    # Landroid/content/Intent;

    .line 75
    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 1
    .param p1, "resultCode"    # I
    .param p2, "intent"    # Landroid/content/Intent;

    .line 69
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/CreateDocumentAt;->parseResult(ILandroid/content/Intent;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
