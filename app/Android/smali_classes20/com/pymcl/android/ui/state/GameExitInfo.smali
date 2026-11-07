.class public final Lcom/pymcl/android/ui/state/GameExitInfo;
.super Ljava/lang/Object;
.source "Models.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001a\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003JD\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010!\u001a\u00020\u0006H\u00d6\u0081\u0004J\n\u0010\"\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00ca\u0001\u000c\u0008$\u0012\u0008\u0008%\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006#"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/GameExitInfo;",
        "",
        "instance",
        "",
        "version",
        "exitCode",
        "",
        "durationSec",
        "",
        "crash",
        "Lcom/pymcl/android/ui/state/CrashInfo;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLcom/pymcl/android/ui/state/CrashInfo;)V",
        "getInstance",
        "()Ljava/lang/String;",
        "getVersion",
        "getExitCode",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getDurationSec",
        "()J",
        "getCrash",
        "()Lcom/pymcl/android/ui/state/CrashInfo;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLcom/pymcl/android/ui/state/CrashInfo;)Lcom/pymcl/android/ui/state/GameExitInfo;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field private final crash:Lcom/pymcl/android/ui/state/CrashInfo;

.field private final durationSec:J

.field private final exitCode:Ljava/lang/Integer;

.field private final instance:Ljava/lang/String;

.field private final version:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLcom/pymcl/android/ui/state/CrashInfo;)V
    .locals 1
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "exitCode"    # Ljava/lang/Integer;
    .param p4, "durationSec"    # J
    .param p6, "crash"    # Lcom/pymcl/android/ui/state/CrashInfo;

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->instance:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->version:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->exitCode:Ljava/lang/Integer;

    iput-wide p4, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->durationSec:J

    iput-object p6, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->crash:Lcom/pymcl/android/ui/state/CrashInfo;

    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/android/ui/state/GameExitInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLcom/pymcl/android/ui/state/CrashInfo;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/GameExitInfo;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->instance:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->version:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->exitCode:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-wide p4, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->durationSec:J

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget-object p6, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->crash:Lcom/pymcl/android/ui/state/CrashInfo;

    :cond_4
    move-object p8, p6

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p8}, Lcom/pymcl/android/ui/state/GameExitInfo;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLcom/pymcl/android/ui/state/CrashInfo;)Lcom/pymcl/android/ui/state/GameExitInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->instance:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->exitCode:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->durationSec:J

    return-wide v0
.end method

.method public final component5()Lcom/pymcl/android/ui/state/CrashInfo;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->crash:Lcom/pymcl/android/ui/state/CrashInfo;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLcom/pymcl/android/ui/state/CrashInfo;)Lcom/pymcl/android/ui/state/GameExitInfo;
    .locals 8

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/pymcl/android/ui/state/GameExitInfo;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/pymcl/android/ui/state/GameExitInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLcom/pymcl/android/ui/state/CrashInfo;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/android/ui/state/GameExitInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/android/ui/state/GameExitInfo;

    iget-object v3, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->instance:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/GameExitInfo;->instance:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->version:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/GameExitInfo;->version:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->exitCode:Ljava/lang/Integer;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/GameExitInfo;->exitCode:Ljava/lang/Integer;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->durationSec:J

    iget-wide v5, v1, Lcom/pymcl/android/ui/state/GameExitInfo;->durationSec:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->crash:Lcom/pymcl/android/ui/state/CrashInfo;

    iget-object v1, v1, Lcom/pymcl/android/ui/state/GameExitInfo;->crash:Lcom/pymcl/android/ui/state/CrashInfo;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCrash()Lcom/pymcl/android/ui/state/CrashInfo;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->crash:Lcom/pymcl/android/ui/state/CrashInfo;

    return-object v0
.end method

.method public final getDurationSec()J
    .locals 2

    .line 52
    iget-wide v0, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->durationSec:J

    return-wide v0
.end method

.method public final getExitCode()Ljava/lang/Integer;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->exitCode:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getInstance()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->instance:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->instance:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->version:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->exitCode:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->exitCode:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v4, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->durationSec:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->crash:Lcom/pymcl/android/ui/state/CrashInfo;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->crash:Lcom/pymcl/android/ui/state/CrashInfo;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/CrashInfo;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->instance:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->version:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->exitCode:Ljava/lang/Integer;

    iget-wide v3, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->durationSec:J

    iget-object v5, p0, Lcom/pymcl/android/ui/state/GameExitInfo;->crash:Lcom/pymcl/android/ui/state/CrashInfo;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "GameExitInfo(instance="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", version="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", exitCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", durationSec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", crash="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
