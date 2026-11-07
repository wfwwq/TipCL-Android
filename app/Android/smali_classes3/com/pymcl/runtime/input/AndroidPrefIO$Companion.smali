.class public final Lcom/pymcl/runtime/input/AndroidPrefIO$Companion;
.super Ljava/lang/Object;
.source "SdlGamepad.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/input/AndroidPrefIO;
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
        "Lcom/pymcl/runtime/input/AndroidPrefIO$Companion;",
        "",
        "<init>",
        "()V",
        "launcherPrefs",
        "Lcom/pymcl/runtime/input/LauncherPrefs;",
        "ctx",
        "Landroid/content/Context;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/runtime/input/AndroidPrefIO$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final launcherPrefs(Landroid/content/Context;)Lcom/pymcl/runtime/input/LauncherPrefs;
    .locals 2
    .param p1, "ctx"    # Landroid/content/Context;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    new-instance v0, Lcom/pymcl/runtime/input/LauncherPrefs;

    sget-object v1, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->Companion:Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;

    invoke-virtual {v1, p1}, Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;->get(Landroid/content/Context;)Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    move-result-object v1

    check-cast v1, Lcom/pymcl/runtime/input/PrefIO;

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/input/LauncherPrefs;-><init>(Lcom/pymcl/runtime/input/PrefIO;)V

    return-object v0
.end method
