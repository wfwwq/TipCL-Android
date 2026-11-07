.class public final Lcom/pymcl/runtime/process/JavaProcessRunnerCodes;
.super Ljava/lang/Object;
.source "JavaProcessService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/pymcl/runtime/process/JavaProcessRunnerCodes;",
        "",
        "<init>",
        "()V",
        "LAUNCH_FAILED",
        "",
        "BUSY",
        "CRASHED",
        "TIMEOUT",
        "START_FAILED",
        "PyMCL-Android:runtime_debug"
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
.field public static final BUSY:I = -0x65

.field public static final CRASHED:I = -0x66

.field public static final INSTANCE:Lcom/pymcl/runtime/process/JavaProcessRunnerCodes;

.field public static final LAUNCH_FAILED:I = -0x64

.field public static final START_FAILED:I = -0x68

.field public static final TIMEOUT:I = -0x67


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/process/JavaProcessRunnerCodes;

    invoke-direct {v0}, Lcom/pymcl/runtime/process/JavaProcessRunnerCodes;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/process/JavaProcessRunnerCodes;->INSTANCE:Lcom/pymcl/runtime/process/JavaProcessRunnerCodes;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
