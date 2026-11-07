.class public final Lcom/pymcl/runtime/input/RuntimeInput;
.super Ljava/lang/Object;
.source "RuntimeInput.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRuntimeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeInput.kt\ncom/pymcl/runtime/input/RuntimeInput\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000cJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/RuntimeInput;",
        "",
        "<init>",
        "()V",
        "controlDir",
        "Ljava/io/File;",
        "context",
        "Landroid/content/Context;",
        "layoutStore",
        "Lcom/pymcl/runtime/control/ControlLayoutStore;",
        "settingsFile",
        "loadSettings",
        "Lcom/pymcl/runtime/input/InputSettings;",
        "saveSettings",
        "",
        "s",
        "gamepadMapping",
        "Lcom/pymcl/runtime/input/GamepadMappingStore;",
        "quickInput",
        "Lcom/pymcl/runtime/keyboard/QuickInputStore;",
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
.field public static final INSTANCE:Lcom/pymcl/runtime/input/RuntimeInput;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/input/RuntimeInput;

    invoke-direct {v0}, Lcom/pymcl/runtime/input/RuntimeInput;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/input/RuntimeInput;->INSTANCE:Lcom/pymcl/runtime/input/RuntimeInput;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final controlDir(Landroid/content/Context;)Ljava/io/File;
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "control"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v1, v0

    .line 21
    .local v1, "$this$controlDir_u24lambda_u240":Ljava/io/File;
    const/4 v2, 0x0

    .line 11
    .local v2, "$i$a$-apply-RuntimeInput$controlDir$1":I
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .end local v1    # "$this$controlDir_u24lambda_u240":Ljava/io/File;
    .end local v2    # "$i$a$-apply-RuntimeInput$controlDir$1":I
    return-object v0
.end method

.method public final gamepadMapping(Landroid/content/Context;)Lcom/pymcl/runtime/input/GamepadMappingStore;
    .locals 4
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    new-instance v0, Lcom/pymcl/runtime/input/GamepadMappingStore;

    new-instance v1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/input/RuntimeInput;->controlDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    const-string v3, "gamepad_map.json"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/input/GamepadMappingStore;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public final layoutStore(Landroid/content/Context;)Lcom/pymcl/runtime/control/ControlLayoutStore;
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    new-instance v0, Lcom/pymcl/runtime/control/ControlLayoutStore;

    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/input/RuntimeInput;->controlDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/control/ControlLayoutStore;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public final loadSettings(Landroid/content/Context;)Lcom/pymcl/runtime/input/InputSettings;
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sget-object v0, Lcom/pymcl/runtime/input/InputSettings;->Companion:Lcom/pymcl/runtime/input/InputSettings$Companion;

    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/input/RuntimeInput;->settingsFile(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/InputSettings$Companion;->load(Ljava/io/File;)Lcom/pymcl/runtime/input/InputSettings;

    move-result-object v0

    return-object v0
.end method

.method public final quickInput(Landroid/content/Context;)Lcom/pymcl/runtime/keyboard/QuickInputStore;
    .locals 4
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Lcom/pymcl/runtime/keyboard/QuickInputStore;

    new-instance v1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/input/RuntimeInput;->controlDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    const-string v3, "quick_input.json"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/keyboard/QuickInputStore;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public final saveSettings(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSettings;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "s"    # Lcom/pymcl/runtime/input/InputSettings;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "s"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/input/RuntimeInput;->settingsFile(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/pymcl/runtime/input/InputSettings;->save(Ljava/io/File;)V

    return-void
.end method

.method public final settingsFile(Landroid/content/Context;)Ljava/io/File;
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/input/RuntimeInput;->controlDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    const-string v2, "input_settings.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method
