.class public final Lcom/pymcl/runtime/input/GamepadMapping$Companion;
.super Ljava/lang/Object;
.source "GamepadMapping.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/input/GamepadMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGamepadMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamepadMapping.kt\ncom/pymcl/runtime/input/GamepadMapping$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n2068#2:125\n2069#2:127\n1#3:126\n*S KotlinDebug\n*F\n+ 1 GamepadMapping.kt\ncom/pymcl/runtime/input/GamepadMapping$Companion\n*L\n91#1:125\n91#1:127\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/GamepadMapping$Companion;",
        "",
        "<init>",
        "()V",
        "VERSION",
        "",
        "FILE_NAME",
        "",
        "defaultButtons",
        "",
        "default",
        "Lcom/pymcl/runtime/input/GamepadMapping;",
        "fromJson",
        "text",
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

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/runtime/input/GamepadMapping$Companion;-><init>()V

    return-void
.end method

.method private static final fromJson$stick(Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/pymcl/runtime/input/StickMode;)Lcom/pymcl/runtime/input/StickMode;
    .locals 4
    .param p0, "o"    # Lcom/google/gson/JsonObject;
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "def"    # Lcom/pymcl/runtime/input/StickMode;

    .line 97
    sget-object v0, Lcom/pymcl/runtime/input/GamepadMapping;->Companion:Lcom/pymcl/runtime/input/GamepadMapping$Companion;

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 126
    .local v0, "$this$fromJson_u24stick_u24lambda_u241":Lcom/pymcl/runtime/input/GamepadMapping$Companion;
    const/4 v1, 0x0

    .line 97
    .local v1, "$i$a$-runCatching-GamepadMapping$Companion$fromJson$stick$1":I
    invoke-virtual {p0, p1}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getAsString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toUpperCase(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/pymcl/runtime/input/StickMode;->valueOf(Ljava/lang/String;)Lcom/pymcl/runtime/input/StickMode;

    move-result-object v2

    .end local v0    # "$this$fromJson_u24stick_u24lambda_u241":Lcom/pymcl/runtime/input/GamepadMapping$Companion;
    .end local v1    # "$i$a$-runCatching-GamepadMapping$Companion$fromJson$stick$1":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v0, p2

    :cond_0
    check-cast v0, Lcom/pymcl/runtime/input/StickMode;

    return-object v0
.end method


# virtual methods
.method public final default()Lcom/pymcl/runtime/input/GamepadMapping;
    .locals 8

    .line 82
    new-instance v0, Lcom/pymcl/runtime/input/GamepadMapping;

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/runtime/input/GamepadMapping;-><init>(Ljava/util/Map;Lcom/pymcl/runtime/input/StickMode;Lcom/pymcl/runtime/input/StickMode;FZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final defaultButtons()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 76
    const/16 v0, 0x10

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "A"

    const-string v2, "KEY_SPACE"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "B"

    const-string v2, "KEY_LEFTSHIFT"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "X"

    const-string v2, "KEY_Q"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "Y"

    const-string v3, "KEY_E"

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    .line 77
    const-string v1, "LB"

    const-string v3, "SCROLL_UP"

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x4

    aput-object v1, v0, v4

    .line 76
    nop

    .line 77
    const-string v1, "RB"

    const-string v4, "SCROLL_DOWN"

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v5, 0x5

    aput-object v1, v0, v5

    .line 76
    nop

    .line 77
    const-string v1, "LT"

    const-string v5, "MOUSE_RIGHT"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v5, 0x6

    aput-object v1, v0, v5

    .line 76
    nop

    .line 77
    const-string v1, "RT"

    const-string v5, "MOUSE_LEFT"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v5, 0x7

    aput-object v1, v0, v5

    .line 76
    nop

    .line 78
    const-string v1, "START"

    const-string v5, "KEY_ESC"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v5, 0x8

    aput-object v1, v0, v5

    .line 76
    nop

    .line 78
    const-string v1, "SELECT"

    const-string v5, "KEY_TAB"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v5, 0x9

    aput-object v1, v0, v5

    .line 76
    nop

    .line 78
    const-string v1, "L3"

    const-string v5, "KEY_LEFTCTRL"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v5, 0xa

    aput-object v1, v0, v5

    .line 76
    nop

    .line 78
    const-string v1, "R3"

    const-string v5, "KEY_F5"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v6, 0xb

    aput-object v1, v0, v6

    .line 76
    nop

    .line 79
    const-string v1, "DPAD_UP"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v5, 0xc

    aput-object v1, v0, v5

    .line 76
    nop

    .line 79
    const-string v1, "DPAD_DOWN"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    .line 76
    nop

    .line 79
    const-string v1, "DPAD_LEFT"

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    .line 76
    nop

    .line 79
    const-string v1, "DPAD_RIGHT"

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    .line 76
    nop

    .line 75
    invoke-static {v0}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 80
    return-object v0
.end method

.method public final fromJson(Ljava/lang/String;)Lcom/pymcl/runtime/input/GamepadMapping;
    .locals 14
    .param p1, "text"    # Ljava/lang/String;

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    invoke-static {p1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v1

    .line 90
    .local v1, "o":Lcom/google/gson/JsonObject;
    new-instance v2, Lcom/pymcl/runtime/input/GamepadMapping;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/pymcl/runtime/input/GamepadMapping;-><init>(Ljava/util/Map;Lcom/pymcl/runtime/input/StickMode;Lcom/pymcl/runtime/input/StickMode;FZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 91
    .local v2, "m":Lcom/pymcl/runtime/input/GamepadMapping;
    const-string v0, "buttons"

    invoke-virtual {v1, v0}, Lcom/google/gson/JsonObject;->getAsJsonObject(Ljava/lang/String;)Lcom/google/gson/JsonObject;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/google/gson/JsonObject;->entrySet()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_8

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 125
    .local v4, "$i$f$forEach":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv":Ljava/lang/Object;
    move-object v0, v6

    check-cast v0, Ljava/util/Map$Entry;

    const/4 v7, 0x0

    .local v7, "$i$a$-forEach-GamepadMapping$Companion$fromJson$1":I
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .local v8, "id":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/google/gson/JsonElement;

    .line 92
    .local v9, "v":Lcom/google/gson/JsonElement;
    sget-object v0, Lcom/pymcl/runtime/input/GamepadButton;->Companion:Lcom/pymcl/runtime/input/GamepadButton$Companion;

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v8}, Lcom/pymcl/runtime/input/GamepadButton$Companion;->of(Ljava/lang/String;)Lcom/pymcl/runtime/input/GamepadButton;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_4

    :cond_0
    move-object v10, v0

    .line 93
    .local v10, "b":Lcom/pymcl/runtime/input/GamepadButton;
    sget-object v0, Lcom/pymcl/runtime/input/GamepadMapping;->Companion:Lcom/pymcl/runtime/input/GamepadMapping$Companion;

    :try_start_0
    sget-object v11, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 126
    .local v0, "$this$fromJson_u24lambda_u240_u240":Lcom/pymcl/runtime/input/GamepadMapping$Companion;
    const/4 v11, 0x0

    .line 93
    .local v11, "$i$a$-runCatching-GamepadMapping$Companion$fromJson$1$k$1":I
    invoke-virtual {v9}, Lcom/google/gson/JsonElement;->isJsonNull()Z

    move-result v12

    if-eqz v12, :cond_1

    const-string v12, ""

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v12

    const-string v13, "getAsString(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v12}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    .end local v0    # "$this$fromJson_u24lambda_u240_u240":Lcom/pymcl/runtime/input/GamepadMapping$Companion;
    .end local v11    # "$i$a$-runCatching-GamepadMapping$Companion$fromJson$1$k$1":I
    :goto_1
    invoke-static {v12}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v11, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    const/4 v0, 0x0

    :cond_2
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_3

    goto :goto_4

    .line 94
    .local v0, "k":Ljava/lang/String;
    :cond_3
    move-object v11, v0

    check-cast v11, Ljava/lang/CharSequence;

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-nez v11, :cond_4

    const/4 v11, 0x1

    goto :goto_3

    :cond_4
    const/4 v11, 0x0

    :goto_3
    if-nez v11, :cond_5

    sget-object v11, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    invoke-virtual {v11, v0}, Lcom/pymcl/runtime/input/Keys;->isValid(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_6

    :cond_5
    invoke-virtual {v2}, Lcom/pymcl/runtime/input/GamepadMapping;->getButtons()Ljava/util/Map;

    move-result-object v11

    invoke-virtual {v10}, Lcom/pymcl/runtime/input/GamepadButton;->name()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v11, v12, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .end local v0    # "k":Ljava/lang/String;
    .end local v10    # "b":Lcom/pymcl/runtime/input/GamepadButton;
    :cond_6
    nop

    .line 125
    .end local v7    # "$i$a$-forEach-GamepadMapping$Companion$fromJson$1":I
    .end local v8    # "id":Ljava/lang/String;
    .end local v9    # "v":Lcom/google/gson/JsonElement;
    :goto_4
    nop

    .end local v6    # "element$iv":Ljava/lang/Object;
    goto/16 :goto_0

    .line 127
    :cond_7
    nop

    .line 98
    .end local v3    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$forEach":I
    :cond_8
    const-string v0, "leftStick"

    sget-object v3, Lcom/pymcl/runtime/input/StickMode;->MOVE:Lcom/pymcl/runtime/input/StickMode;

    invoke-static {v1, v0, v3}, Lcom/pymcl/runtime/input/GamepadMapping$Companion;->fromJson$stick(Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/pymcl/runtime/input/StickMode;)Lcom/pymcl/runtime/input/StickMode;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/pymcl/runtime/input/GamepadMapping;->setLeftStick(Lcom/pymcl/runtime/input/StickMode;)V

    .line 99
    const-string v0, "rightStick"

    sget-object v3, Lcom/pymcl/runtime/input/StickMode;->LOOK:Lcom/pymcl/runtime/input/StickMode;

    invoke-static {v1, v0, v3}, Lcom/pymcl/runtime/input/GamepadMapping$Companion;->fromJson$stick(Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/pymcl/runtime/input/StickMode;)Lcom/pymcl/runtime/input/StickMode;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/pymcl/runtime/input/GamepadMapping;->setRightStick(Lcom/pymcl/runtime/input/StickMode;)V

    .line 100
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/runtime/input/GamepadMapping$Companion;

    .line 126
    .local v0, "$this$fromJson_u24lambda_u242":Lcom/pymcl/runtime/input/GamepadMapping$Companion;
    const/4 v3, 0x0

    .line 100
    .local v3, "$i$a$-runCatching-GamepadMapping$Companion$fromJson$2":I
    const-string v4, "lookSpeed"

    invoke-virtual {v1, v4}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/gson/JsonElement;->getAsFloat()F

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x42c80000    # 100.0f

    invoke-static {v4, v5, v6}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v4

    invoke-virtual {v2, v4}, Lcom/pymcl/runtime/input/GamepadMapping;->setLookSpeed(F)V

    .end local v0    # "$this$fromJson_u24lambda_u242":Lcom/pymcl/runtime/input/GamepadMapping$Companion;
    .end local v3    # "$i$a$-runCatching-GamepadMapping$Companion$fromJson$2":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    :goto_5
    :try_start_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/runtime/input/GamepadMapping$Companion;

    .line 126
    .local v0, "$this$fromJson_u24lambda_u243":Lcom/pymcl/runtime/input/GamepadMapping$Companion;
    const/4 v3, 0x0

    .line 101
    .local v3, "$i$a$-runCatching-GamepadMapping$Companion$fromJson$3":I
    const-string v4, "invertY"

    invoke-virtual {v1, v4}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/gson/JsonElement;->getAsBoolean()Z

    move-result v4

    invoke-virtual {v2, v4}, Lcom/pymcl/runtime/input/GamepadMapping;->setInvertY(Z)V

    .end local v0    # "$this$fromJson_u24lambda_u243":Lcom/pymcl/runtime/input/GamepadMapping$Companion;
    .end local v3    # "$i$a$-runCatching-GamepadMapping$Companion$fromJson$3":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    :goto_6
    return-object v2
.end method
