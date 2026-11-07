.class public final Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;
.super Ljava/lang/Object;
.source "AppState.kt"

# interfaces
.implements Lcom/pymcl/android/ui/state/DialogSpec;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/ui/state/DialogSpec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TaskLog"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00ca\u0001\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;",
        "Lcom/pymcl/android/ui/state/DialogSpec;",
        "task",
        "Lcom/pymcl/android/ui/state/TaskRow;",
        "<init>",
        "(Lcom/pymcl/android/ui/state/TaskRow;)V",
        "getTask",
        "()Lcom/pymcl/android/ui/state/TaskRow;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final task:Lcom/pymcl/android/ui/state/TaskRow;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/pymcl/android/ui/state/TaskRow;->$stable:I

    sput v0, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/android/ui/state/TaskRow;)V
    .locals 1
    .param p1, "task"    # Lcom/pymcl/android/ui/state/TaskRow;

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;->task:Lcom/pymcl/android/ui/state/TaskRow;

    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;Lcom/pymcl/android/ui/state/TaskRow;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;->task:Lcom/pymcl/android/ui/state/TaskRow;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;->copy(Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/pymcl/android/ui/state/TaskRow;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;->task:Lcom/pymcl/android/ui/state/TaskRow;

    return-object v0
.end method

.method public final copy(Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;
    .locals 1

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;

    invoke-direct {v0, p1}, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;-><init>(Lcom/pymcl/android/ui/state/TaskRow;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;

    iget-object v3, p0, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;->task:Lcom/pymcl/android/ui/state/TaskRow;

    iget-object v1, v1, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;->task:Lcom/pymcl/android/ui/state/TaskRow;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getTask()Lcom/pymcl/android/ui/state/TaskRow;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;->task:Lcom/pymcl/android/ui/state/TaskRow;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;->task:Lcom/pymcl/android/ui/state/TaskRow;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/TaskRow;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;->task:Lcom/pymcl/android/ui/state/TaskRow;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TaskLog(task="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
