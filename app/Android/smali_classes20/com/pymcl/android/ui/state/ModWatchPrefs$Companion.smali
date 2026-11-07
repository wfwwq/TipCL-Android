.class public final Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion;
.super Ljava/lang/Object;
.source "ModUpdateWatcher.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/ui/state/ModWatchPrefs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion;",
        "",
        "<init>",
        "()V",
        "of",
        "Lcom/pymcl/android/ui/state/ModWatchPrefs;",
        "p",
        "Lcom/pymcl/runtime/settings/CrossProcessPrefs;",
        "PyMCL-Android:app_debug"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$vAY7Qf4HuNvHyZFT4erq_Bweweo(Lcom/pymcl/runtime/settings/CrossProcessPrefs;Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion;->of$lambda$0(Lcom/pymcl/runtime/settings/CrossProcessPrefs;Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion;-><init>()V

    return-void
.end method

.method private static final of$lambda$0(Lcom/pymcl/runtime/settings/CrossProcessPrefs;Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1
    .param p0, "$p"    # Lcom/pymcl/runtime/settings/CrossProcessPrefs;
    .param p1, "k"    # Ljava/lang/String;
    .param p2, "v"    # Ljava/lang/Object;

    const-string v0, "k"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final of(Lcom/pymcl/runtime/settings/CrossProcessPrefs;)Lcom/pymcl/android/ui/state/ModWatchPrefs;
    .locals 4
    .param p1, "p"    # Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    new-instance v0, Lcom/pymcl/android/ui/state/ModWatchPrefs;

    new-instance v1, Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion$of$1;

    invoke-direct {v1, p1}, Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion$of$1;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    new-instance v2, Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion$of$2;

    invoke-direct {v2, p1}, Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion$of$2;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    new-instance v3, Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v3, p1}, Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/runtime/settings/CrossProcessPrefs;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/pymcl/android/ui/state/ModWatchPrefs;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    return-object v0
.end method
