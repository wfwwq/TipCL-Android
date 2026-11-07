.class public final Lcom/pymcl/android/data/SaveGuard;
.super Ljava/lang/Object;
.source "MiscLogic.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/SaveGuard$Op;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMiscLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiscLogic.kt\ncom/pymcl/android/data/SaveGuard\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,227:1\n1960#2,3:228\n*S KotlinDebug\n*F\n+ 1 MiscLogic.kt\ncom/pymcl/android/data/SaveGuard\n*L\n34#1:228,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J*\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0005J&\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0014R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/pymcl/android/data/SaveGuard;",
        "",
        "<init>",
        "()V",
        "norm",
        "",
        "p",
        "blockReason",
        "op",
        "Lcom/pymcl/android/data/SaveGuard$Op;",
        "gameRunning",
        "",
        "runningGameDir",
        "targetGameDir",
        "ILLEGAL",
        "Lkotlin/text/Regex;",
        "renameProblem",
        "newName",
        "current",
        "existing",
        "",
        "Op",
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

.field private static final ILLEGAL:Lkotlin/text/Regex;

.field public static final INSTANCE:Lcom/pymcl/android/data/SaveGuard;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/android/data/SaveGuard;

    invoke-direct {v0}, Lcom/pymcl/android/data/SaveGuard;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/SaveGuard;->INSTANCE:Lcom/pymcl/android/data/SaveGuard;

    .line 24
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "[\\\\/:*?\"<>|\\u0000-\\u001f]"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/data/SaveGuard;->ILLEGAL:Lkotlin/text/Regex;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final norm(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "p"    # Ljava/lang/String;

    .line 11
    const/4 v0, 0x2

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :array_0
    .array-data 2
        0x2fs
        0x5cs
    .end array-data
.end method


# virtual methods
.method public final blockReason(Lcom/pymcl/android/data/SaveGuard$Op;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "op"    # Lcom/pymcl/android/data/SaveGuard$Op;
    .param p2, "gameRunning"    # Z
    .param p3, "runningGameDir"    # Ljava/lang/String;
    .param p4, "targetGameDir"    # Ljava/lang/String;

    const-string v0, "op"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetGameDir"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    .line 19
    :cond_0
    sget-object v1, Lcom/pymcl/android/data/SaveGuard$Op;->EMPTY_TRASH:Lcom/pymcl/android/data/SaveGuard$Op;

    if-ne p1, v1, :cond_1

    return-object v0

    .line 20
    :cond_1
    move-object v1, p3

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1

    :cond_3
    :goto_0
    move v1, v3

    :goto_1
    if-nez v1, :cond_4

    invoke-direct {p0, p3}, Lcom/pymcl/android/data/SaveGuard;->norm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p4}, Lcom/pymcl/android/data/SaveGuard;->norm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    move v2, v3

    .line 21
    .local v2, "same":Z
    :cond_5
    if-eqz v2, :cond_6

    const-string v0, "\u6e38\u620f\u6b63\u5728\u8fd0\u884c\u5e76\u4f7f\u7528\u8fd9\u4e2a\u5b58\u6863\u76ee\u5f55\uff0c\u8bf7\u5148\u9000\u51fa\u6e38\u620f\u518d\u64cd\u4f5c\uff08\u5426\u5219\u6e38\u620f\u9000\u51fa\u65f6\u4f1a\u56de\u5199\u5b58\u6863\uff0c\u6539\u52a8\u53ef\u80fd\u4e22\u5931\u6216\u635f\u574f\u4e16\u754c\uff09"

    :cond_6
    return-object v0
.end method

.method public final renameProblem(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    .locals 10
    .param p1, "newName"    # Ljava/lang/String;
    .param p2, "current"    # Ljava/lang/String;
    .param p3, "existing"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "newName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "existing"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 29
    .local v0, "n":Ljava/lang/String;
    nop

    .line 30
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    const-string v1, "\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a"

    goto/16 :goto_4

    .line 31
    :cond_1
    const-string v1, "."

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    const-string v1, ".."

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    sget-object v1, Lcom/pymcl/android/data/SaveGuard;->ILLEGAL:Lkotlin/text/Regex;

    move-object v4, v0

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v1, v4}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_3

    .line 32
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v4, 0x80

    if-le v1, v4, :cond_3

    const-string v1, "\u540d\u79f0\u592a\u957f\uff08\u6700\u591a 128 \u4e2a\u5b57\u7b26\uff09"

    goto :goto_4

    .line 33
    :cond_3
    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "\u540d\u79f0\u6ca1\u6709\u53d8\u5316"

    goto :goto_4

    .line 34
    :cond_4
    move-object v1, p3

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$any\\1":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 228
    .local v4, "$i$f$any\\1\\34":I
    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_2

    .line 229
    :cond_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element\\1":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    .local v7, "it\\2":Ljava/lang/String;
    const/4 v8, 0x0

    .line 34
    .local v8, "$i$a$-any-SaveGuard$renameProblem$1\\2\\229\\0":I
    invoke-static {v7, v0, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v7, p2, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-nez v9, :cond_7

    move v7, v3

    goto :goto_1

    :cond_7
    move v7, v2

    .line 229
    .end local v7    # "it\\2":Ljava/lang/String;
    .end local v8    # "$i$a$-any-SaveGuard$renameProblem$1\\2\\229\\0":I
    :goto_1
    if-eqz v7, :cond_6

    move v2, v3

    goto :goto_2

    .line 230
    .end local v6    # "element\\1":Ljava/lang/Object;
    :cond_8
    nop

    .line 34
    .end local v1    # "$this$any\\1":Ljava/lang/Iterable;
    .end local v4    # "$i$f$any\\1\\34":I
    :goto_2
    if-eqz v2, :cond_9

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5df2\u6709\u540c\u540d\u5b58\u6863\u300c"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u300d"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    .line 35
    :cond_9
    const/4 v1, 0x0

    goto :goto_4

    .line 31
    :cond_a
    :goto_3
    const-string v1, "\u540d\u79f0\u4e0d\u80fd\u542b \\ / : * ? \" < > | \u7b49\u5b57\u7b26"

    .line 29
    :goto_4
    return-object v1
.end method
