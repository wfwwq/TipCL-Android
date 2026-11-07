.class public final Lcom/pymcl/android/ui/state/LaunchGate$Blocked;
.super Ljava/lang/IllegalStateException;
.source "LaunchGate.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/ui/state/LaunchGate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Blocked"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLaunchGate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchGate.kt\ncom/pymcl/android/ui/state/LaunchGate$Blocked\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00ca\u0001\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/LaunchGate$Blocked;",
        "Ljava/lang/IllegalStateException;",
        "Lkotlin/IllegalStateException;",
        "verdict",
        "Lcom/pymcl/android/ui/state/LaunchGate$Verdict;",
        "<init>",
        "(Lcom/pymcl/android/ui/state/LaunchGate$Verdict;)V",
        "getVerdict",
        "()Lcom/pymcl/android/ui/state/LaunchGate$Verdict;",
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
.field private final verdict:Lcom/pymcl/android/ui/state/LaunchGate$Verdict;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/pymcl/android/ui/state/LaunchGate$Blocked;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/android/ui/state/LaunchGate$Verdict;)V
    .locals 2
    .param p1, "verdict"    # Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    const-string v0, "verdict"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->getDetail()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 82
    const/4 v0, 0x0

    .line 77
    .local v0, "$i$a$-ifEmpty-LaunchGate$Blocked$1\\1\\77\\0":I
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->getStatus()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-ifEmpty-LaunchGate$Blocked$1\\1\\77\\0":I
    :cond_1
    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/pymcl/android/ui/state/LaunchGate$Blocked;->verdict:Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    return-void
.end method


# virtual methods
.method public final getVerdict()Lcom/pymcl/android/ui/state/LaunchGate$Verdict;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Blocked;->verdict:Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    return-object v0
.end method
