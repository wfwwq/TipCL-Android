.class public final Lcom/pymcl/runtime/input/GamepadModePref$Companion;
.super Ljava/lang/Object;
.source "GamepadMode.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/input/GamepadModePref;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGamepadMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamepadMode.kt\ncom/pymcl/runtime/input/GamepadModePref$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,132:1\n1401#2,2:133\n*S KotlinDebug\n*F\n+ 1 GamepadMode.kt\ncom/pymcl/runtime/input/GamepadModePref$Companion\n*L\n33#1:133,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/GamepadModePref$Companion;",
        "",
        "<init>",
        "()V",
        "parse",
        "Lcom/pymcl/runtime/input/GamepadModePref;",
        "s",
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

    invoke-direct {p0}, Lcom/pymcl/runtime/input/GamepadModePref$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final parse(Ljava/lang/String;)Lcom/pymcl/runtime/input/GamepadModePref;
    .locals 10
    .param p1, "s"    # Ljava/lang/String;

    .line 33
    invoke-static {}, Lcom/pymcl/runtime/input/GamepadModePref;->values()[Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v0

    .local v0, "$this$firstOrNull$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 133
    .local v1, "$i$f$firstOrNull":I
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x0

    if-ge v3, v2, :cond_2

    aget-object v5, v0, v3

    .local v5, "element$iv":Ljava/lang/Object;
    move-object v6, v5

    .local v6, "it":Lcom/pymcl/runtime/input/GamepadModePref;
    const/4 v7, 0x0

    .line 33
    .local v7, "$i$a$-firstOrNull-GamepadModePref$Companion$parse$1":I
    invoke-virtual {v6}, Lcom/pymcl/runtime/input/GamepadModePref;->getKey()Ljava/lang/String;

    move-result-object v8

    if-eqz p1, :cond_0

    move-object v9, p1

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_0

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v9, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v9, "toLowerCase(...)"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 133
    .end local v6    # "it":Lcom/pymcl/runtime/input/GamepadModePref;
    .end local v7    # "$i$a$-firstOrNull-GamepadModePref$Companion$parse$1":I
    if-eqz v4, :cond_1

    move-object v4, v5

    goto :goto_1

    .end local v5    # "element$iv":Ljava/lang/Object;
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 134
    :cond_2
    nop

    .line 33
    .end local v0    # "$this$firstOrNull$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$firstOrNull":I
    :goto_1
    if-nez v4, :cond_3

    sget-object v4, Lcom/pymcl/runtime/input/GamepadModePref;->ASK:Lcom/pymcl/runtime/input/GamepadModePref;

    :cond_3
    return-object v4
.end method
