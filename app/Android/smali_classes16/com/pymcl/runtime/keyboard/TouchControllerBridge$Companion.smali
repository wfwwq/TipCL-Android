.class public final Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;
.super Ljava/lang/Object;
.source "TouchControllerBridge.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/keyboard/TouchControllerBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTouchControllerBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchControllerBridge.kt\ncom/pymcl/runtime/keyboard/TouchControllerBridge$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n14266#2:77\n14267#2:79\n1#3:78\n*S KotlinDebug\n*F\n+ 1 TouchControllerBridge.kt\ncom/pymcl/runtime/keyboard/TouchControllerBridge$Companion\n*L\n26#1:77\n26#1:79\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;",
        "",
        "<init>",
        "()V",
        "SOCKET",
        "",
        "modPresent",
        "",
        "gameDir",
        "create",
        "Lcom/pymcl/runtime/keyboard/TouchControllerBridge;",
        "context",
        "Landroid/content/Context;",
        "toState",
        "Lcom/pymcl/runtime/keyboard/TextFieldState;",
        "s",
        "Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;",
        "fromState",
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

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Landroid/content/Context;)Lcom/pymcl/runtime/keyboard/TouchControllerBridge;
    .locals 6
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "PyMCL"

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    nop

    .line 30
    const/4 v1, 0x0

    :try_start_0
    invoke-static {v0}, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransportKt;->UnixSocketTransport(Ljava/lang/String;)Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    move-result-object v2

    .line 31
    .local v2, "transport":Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;
    const-string v3, "TOUCH_CONTROLLER_PROXY_SOCKET"

    const/4 v4, 0x1

    invoke-static {v3, v0, v4}, Landroid/system/Os;->setenv(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 32
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    sget-object v3, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->TEXT_STATUS:Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;-><init>(Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;Ljava/util/Set;)V

    .line 33
    .local v0, "c":Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;
    new-instance v3, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;

    invoke-direct {v3, p1, v0, v1}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;-><init>(Landroid/content/Context;Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v3

    .line 78
    .local v4, "it":Lcom/pymcl/runtime/keyboard/TouchControllerBridge;
    const/4 v5, 0x0

    .line 33
    .local v5, "$i$a$-also-TouchControllerBridge$Companion$create$1":I
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v4    # "it":Lcom/pymcl/runtime/keyboard/TouchControllerBridge;
    .end local v5    # "$i$a$-also-TouchControllerBridge$Companion$create$1":I
    move-object v1, v3

    .end local v0    # "c":Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;
    .end local v2    # "transport":Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    const-string v2, "PyMCL-Game"

    const-string v3, "TouchController proxy \u521b\u5efa\u5931\u8d25"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .end local v0    # "t":Ljava/lang/Throwable;
    :goto_0
    return-object v1
.end method

.method public final fromState(Lcom/pymcl/runtime/keyboard/TextFieldState;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 8
    .param p1, "s"    # Lcom/pymcl/runtime/keyboard/TextFieldState;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    new-instance v1, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    .line 39
    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getText()Ljava/lang/String;

    move-result-object v2

    .line 40
    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingEnd()I

    move-result v0

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingStart()I

    move-result v3

    const/4 v4, 0x0

    if-ltz v3, :cond_0

    if-ge v3, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    if-eqz v0, :cond_1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingStart()I

    move-result v3

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingEnd()I

    move-result v5

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getComposingStart()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-direct {v0, v3, v5}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    goto :goto_1

    :cond_1
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    :goto_1
    move-object v3, v0

    .line 41
    move v0, v4

    new-instance v4, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionStart()I

    move-result v5

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionEnd()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-static {v5, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionEnd()I

    move-result v5

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/TextFieldState;->getSelectionStart()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    invoke-direct {v4, v0, v5}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 38
    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;-><init>(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    return-object v1
.end method

.method public final modPresent(Ljava/lang/String;)Z
    .locals 16
    .param p1, "gameDir"    # Ljava/lang/String;

    move-object/from16 v0, p1

    const-string v1, "gameDir"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v1, Ljava/io/File;

    const-string v2, "mods"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .local v1, "$this$any$iv":[Ljava/lang/Object;
    const/4 v3, 0x0

    .line 77
    .local v3, "$i$f$any":I
    array-length v4, v1

    move v5, v2

    :goto_0
    const/4 v6, 0x1

    if-ge v5, v4, :cond_3

    aget-object v7, v1, v5

    .local v7, "element$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it":Ljava/io/File;
    const/4 v9, 0x0

    .line 26
    .local v9, "$i$a$-any-TouchControllerBridge$Companion$modPresent$1":I
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "getName(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "toLowerCase(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .local v10, "n":Ljava/lang/String;
    const/4 v11, 0x0

    .line 26
    .local v11, "$i$a$-let-TouchControllerBridge$Companion$modPresent$1$1":I
    move-object v12, v10

    check-cast v12, Ljava/lang/CharSequence;

    const-string v13, "touchcontroller"

    check-cast v13, Ljava/lang/CharSequence;

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-static {v12, v13, v2, v14, v15}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    const-string v12, ".jar"

    invoke-static {v10, v12, v2, v14, v15}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    move v10, v6

    goto :goto_1

    :cond_0
    move v10, v2

    .end local v10    # "n":Ljava/lang/String;
    .end local v11    # "$i$a$-let-TouchControllerBridge$Companion$modPresent$1$1":I
    :goto_1
    if-eqz v10, :cond_1

    move v8, v6

    goto :goto_2

    :cond_1
    move v8, v2

    .line 77
    .end local v8    # "it":Ljava/io/File;
    .end local v9    # "$i$a$-any-TouchControllerBridge$Companion$modPresent$1":I
    :goto_2
    if-eqz v8, :cond_2

    move v1, v6

    goto :goto_3

    .end local v7    # "element$iv":Ljava/lang/Object;
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 79
    :cond_3
    move v1, v2

    .line 26
    .end local v1    # "$this$any$iv":[Ljava/lang/Object;
    .end local v3    # "$i$f$any":I
    :goto_3
    if-ne v1, v6, :cond_4

    move v2, v6

    :cond_4
    return v2
.end method

.method public final toState(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Lcom/pymcl/runtime/keyboard/TextFieldState;
    .locals 7
    .param p1, "s"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v1, Lcom/pymcl/runtime/keyboard/TextFieldState;

    invoke-virtual {p1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v3

    invoke-virtual {p1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v4

    .line 37
    invoke-virtual {p1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    const/4 v5, -0x1

    if-nez v0, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v0

    :goto_0
    invoke-virtual {p1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v6

    invoke-virtual {v6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v5

    invoke-virtual {v5}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v5

    :goto_1
    move v6, v5

    .line 36
    move v5, v0

    invoke-direct/range {v1 .. v6}, Lcom/pymcl/runtime/keyboard/TextFieldState;-><init>(Ljava/lang/String;IIII)V

    .line 37
    return-object v1
.end method
