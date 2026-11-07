.class public final Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;
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
    name = "AccountGate"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00d6\u0083\u0004J\n\u0010\u0008\u001a\u00020\tH\u00d6\u0081\u0004J\n\u0010\n\u001a\u00020\u000bH\u00d6\u0081\u0004\u00ca\u0001\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;",
        "Lcom/pymcl/android/ui/state/DialogSpec;",
        "<init>",
        "()V",
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

.field public static final INSTANCE:Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;

    invoke-direct {v0}, Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;->INSTANCE:Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x2d79bfc9

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "AccountGate"

    return-object v0
.end method
