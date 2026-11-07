.class public final Lcom/pymcl/runtime/input/GamepadButton$Companion;
.super Ljava/lang/Object;
.source "GamepadMapping.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/input/GamepadButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGamepadMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamepadMapping.kt\ncom/pymcl/runtime/input/GamepadButton$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n296#2,2:125\n296#2,2:127\n*S KotlinDebug\n*F\n+ 1 GamepadMapping.kt\ncom/pymcl/runtime/input/GamepadButton$Companion\n*L\n32#1:125,2\n33#1:127,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/GamepadButton$Companion;",
        "",
        "<init>",
        "()V",
        "ofKeycode",
        "Lcom/pymcl/runtime/input/GamepadButton;",
        "code",
        "",
        "of",
        "id",
        "",
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

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/runtime/input/GamepadButton$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final of(Ljava/lang/String;)Lcom/pymcl/runtime/input/GamepadButton;
    .locals 9
    .param p1, "id"    # Ljava/lang/String;

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-static {}, Lcom/pymcl/runtime/input/GamepadButton;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 127
    .local v1, "$i$f$firstOrNull":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/pymcl/runtime/input/GamepadButton;

    .local v4, "it":Lcom/pymcl/runtime/input/GamepadButton;
    const/4 v5, 0x0

    .line 33
    .local v5, "$i$a$-firstOrNull-GamepadButton$Companion$of$1":I
    invoke-virtual {v4}, Lcom/pymcl/runtime/input/GamepadButton;->name()Ljava/lang/String;

    move-result-object v6

    move-object v7, p1

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    invoke-static {v6, v7, v8}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    .line 127
    .end local v4    # "it":Lcom/pymcl/runtime/input/GamepadButton;
    .end local v5    # "$i$a$-firstOrNull-GamepadButton$Companion$of$1":I
    if-eqz v4, :cond_0

    goto :goto_0

    .line 128
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_1
    const/4 v3, 0x0

    .end local v0    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull":I
    :goto_0
    check-cast v3, Lcom/pymcl/runtime/input/GamepadButton;

    .line 33
    return-object v3
.end method

.method public final ofKeycode(I)Lcom/pymcl/runtime/input/GamepadButton;
    .locals 7
    .param p1, "code"    # I

    .line 32
    invoke-static {}, Lcom/pymcl/runtime/input/GamepadButton;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 125
    .local v1, "$i$f$firstOrNull":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/pymcl/runtime/input/GamepadButton;

    .local v4, "it":Lcom/pymcl/runtime/input/GamepadButton;
    const/4 v5, 0x0

    .line 32
    .local v5, "$i$a$-firstOrNull-GamepadButton$Companion$ofKeycode$1":I
    invoke-virtual {v4}, Lcom/pymcl/runtime/input/GamepadButton;->getKeycodes()[I

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v4

    .line 125
    .end local v4    # "it":Lcom/pymcl/runtime/input/GamepadButton;
    .end local v5    # "$i$a$-firstOrNull-GamepadButton$Companion$ofKeycode$1":I
    if-eqz v4, :cond_0

    goto :goto_0

    .line 126
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_1
    const/4 v3, 0x0

    .end local v0    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull":I
    :goto_0
    check-cast v3, Lcom/pymcl/runtime/input/GamepadButton;

    .line 32
    return-object v3
.end method
