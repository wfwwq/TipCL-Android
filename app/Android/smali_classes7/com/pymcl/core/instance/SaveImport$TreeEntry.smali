.class public final Lcom/pymcl/core/instance/SaveImport$TreeEntry;
.super Ljava/lang/Object;
.source "SaveImport.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/instance/SaveImport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TreeEntry"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\rR\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/core/instance/SaveImport$TreeEntry;",
        "",
        "path",
        "",
        "isDir",
        "",
        "open",
        "Lkotlin/Function0;",
        "Ljava/io/InputStream;",
        "<init>",
        "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V",
        "getPath",
        "()Ljava/lang/String;",
        "()Z",
        "getOpen",
        "()Lkotlin/jvm/functions/Function0;",
        "PyMCL-Android:core"
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
.field private final isDir:Z

.field private final open:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field private final path:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1, "path"    # Ljava/lang/String;
    .param p2, "isDir"    # Z
    .param p3, "open"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/io/InputStream;",
            ">;)V"
        }
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "open"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->path:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->isDir:Z

    iput-object p3, p0, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->open:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final getOpen()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->open:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final isDir()Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->isDir:Z

    return v0
.end method
