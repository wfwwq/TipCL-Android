.class public final Lcom/pymcl/android/data/AiConfirmOutcome$Companion;
.super Ljava/lang/Object;
.source "AiConfirmOutcome.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/data/AiConfirmOutcome;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiConfirmOutcome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiConfirmOutcome.kt\ncom/pymcl/android/data/AiConfirmOutcome$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n296#2,2:35\n*S KotlinDebug\n*F\n+ 1 AiConfirmOutcome.kt\ncom/pymcl/android/data/AiConfirmOutcome$Companion\n*L\n29#1:35,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/pymcl/android/data/AiConfirmOutcome$Companion;",
        "",
        "<init>",
        "()V",
        "EN_ALIASES",
        "",
        "",
        "Lcom/pymcl/android/data/AiConfirmOutcome;",
        "of",
        "resolved",
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
.method private constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/android/data/AiConfirmOutcome$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final of(Ljava/lang/String;)Lcom/pymcl/android/data/AiConfirmOutcome;
    .locals 12
    .param p1, "resolved"    # Ljava/lang/String;

    .line 28
    const/4 v0, 0x0

    if-eqz p1, :cond_7

    move-object v1, p1

    .local v1, "r\\1":Ljava/lang/String;
    const/4 v2, 0x0

    .line 29
    .local v2, "$i$a$-let-AiConfirmOutcome$Companion$of$1\\1\\28\\0":I
    invoke-static {}, Lcom/pymcl/android/data/AiConfirmOutcome;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$firstOrNull\\2":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 35
    .local v4, "$i$f$firstOrNull\\2\\29":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element\\2":Ljava/lang/Object;
    move-object v8, v6

    check-cast v8, Lcom/pymcl/android/data/AiConfirmOutcome;

    .local v8, "it\\3":Lcom/pymcl/android/data/AiConfirmOutcome;
    const/4 v9, 0x0

    .line 29
    .local v9, "$i$a$-firstOrNull-AiConfirmOutcome$Companion$of$1$1\\3\\35\\1":I
    invoke-virtual {v8}, Lcom/pymcl/android/data/AiConfirmOutcome;->getLabel()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const/4 v11, 0x1

    if-nez v10, :cond_2

    invoke-virtual {v8}, Lcom/pymcl/android/data/AiConfirmOutcome;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v1, v11}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_0

    :cond_1
    move v11, v7

    .line 35
    .end local v8    # "it\\3":Lcom/pymcl/android/data/AiConfirmOutcome;
    .end local v9    # "$i$a$-firstOrNull-AiConfirmOutcome$Companion$of$1$1\\3\\35\\1":I
    :cond_2
    :goto_0
    if-eqz v11, :cond_0

    goto :goto_1

    .line 36
    .end local v6    # "element\\2":Ljava/lang/Object;
    :cond_3
    move-object v6, v0

    .line 29
    .end local v3    # "$this$firstOrNull\\2":Ljava/lang/Iterable;
    .end local v4    # "$i$f$firstOrNull\\2\\29":I
    :goto_1
    check-cast v6, Lcom/pymcl/android/data/AiConfirmOutcome;

    if-nez v6, :cond_6

    invoke-static {}, Lcom/pymcl/android/data/AiConfirmOutcome;->access$getEN_ALIASES$cp()Ljava/util/Map;

    move-result-object v3

    move-object v4, v1

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "toLowerCase(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/pymcl/android/data/AiConfirmOutcome;

    if-nez v3, :cond_5

    .line 30
    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    const-string v4, "\u62d2\u7edd"

    check-cast v4, Ljava/lang/CharSequence;

    const/4 v5, 0x2

    invoke-static {v3, v4, v7, v5, v0}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->Denied:Lcom/pymcl/android/data/AiConfirmOutcome;

    goto :goto_2

    :cond_4
    sget-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->Allowed:Lcom/pymcl/android/data/AiConfirmOutcome;

    goto :goto_2

    .line 29
    :cond_5
    move-object v0, v3

    goto :goto_2

    :cond_6
    move-object v0, v6

    .line 28
    .end local v1    # "r\\1":Ljava/lang/String;
    .end local v2    # "$i$a$-let-AiConfirmOutcome$Companion$of$1\\1\\28\\0":I
    :cond_7
    :goto_2
    nop

    .line 31
    return-object v0
.end method
