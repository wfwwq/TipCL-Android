.class public final Lcom/pymcl/runtime/input/InputSettings$Companion;
.super Ljava/lang/Object;
.source "InputSettings.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/input/InputSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInputSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputSettings.kt\ncom/pymcl/runtime/input/InputSettings$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0002R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/InputSettings$Companion;",
        "",
        "<init>",
        "()V",
        "gson",
        "Lcom/google/gson/Gson;",
        "kotlin.jvm.PlatformType",
        "DEFAULT_LAYOUT",
        "",
        "MIN_SENSITIVITY",
        "",
        "MAX_SENSITIVITY",
        "MAX_DEADZONE",
        "MAX_LONG_PRESS_MS",
        "",
        "load",
        "Lcom/pymcl/runtime/input/InputSettings;",
        "file",
        "Ljava/io/File;",
        "sens",
        "v",
        "def",
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

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/runtime/input/InputSettings$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$sens(Lcom/pymcl/runtime/input/InputSettings$Companion;FF)F
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/input/InputSettings$Companion;
    .param p1, "v"    # F
    .param p2, "def"    # F

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/pymcl/runtime/input/InputSettings$Companion;->sens(FF)F

    move-result v0

    return v0
.end method

.method private final sens(FF)F
    .locals 2
    .param p1, "v"    # F
    .param p2, "def"    # F

    .line 42
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_1

    goto :goto_1

    :cond_1
    const v0, 0x3d4ccccd    # 0.05f

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {p1, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v0

    goto :goto_2

    :cond_2
    :goto_1
    move v0, p2

    :goto_2
    return v0
.end method


# virtual methods
.method public final load(Ljava/io/File;)Lcom/pymcl/runtime/input/InputSettings;
    .locals 17
    .param p1, "file"    # Ljava/io/File;

    move-object/from16 v1, p1

    const-string v0, "file"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    const/4 v2, 0x0

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/runtime/input/InputSettings$Companion;

    .line 80
    .local v0, "$this$load_u24lambda_u240":Lcom/pymcl/runtime/input/InputSettings$Companion;
    const/4 v3, 0x0

    .line 40
    .local v3, "$i$a$-runCatching-InputSettings$Companion$load$1":I
    invoke-static {}, Lcom/pymcl/runtime/input/InputSettings;->access$getGson$cp()Lcom/google/gson/Gson;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v1, v2, v5, v2}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-class v6, Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v4, v5, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/pymcl/runtime/input/InputSettings;

    .end local v0    # "$this$load_u24lambda_u240":Lcom/pymcl/runtime/input/InputSettings$Companion;
    .end local v3    # "$i$a$-runCatching-InputSettings$Companion$load$1":I
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    move-object v2, v0

    :goto_1
    check-cast v2, Lcom/pymcl/runtime/input/InputSettings;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/InputSettings;->sanitized()Lcom/pymcl/runtime/input/InputSettings;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    new-instance v2, Lcom/pymcl/runtime/input/InputSettings;

    const/16 v15, 0x7ff

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v2 .. v16}, Lcom/pymcl/runtime/input/InputSettings;-><init>(IZIFFZJLjava/lang/String;ZZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v2

    :cond_2
    return-object v0
.end method
