.class public final Lcom/pymcl/android/data/SaveImportProgress$Cancelled;
.super Ljava/util/concurrent/CancellationException;
.source "SaveImportProgress.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/data/SaveImportProgress;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Cancelled"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00ca\u0001\u000c\u0008\u0005\u0012\u0008\u0008\u0006\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/pymcl/android/data/SaveImportProgress$Cancelled;",
        "Ljava/util/concurrent/CancellationException;",
        "<init>",
        "()V",
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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/pymcl/android/data/SaveImportProgress$Cancelled;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 33
    const-string v0, "\u5df2\u53d6\u6d88\u5bfc\u5165"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    return-void
.end method
