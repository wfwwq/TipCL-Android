.class public final Lcom/pymcl/android/data/FeedbackSubmit;
.super Ljava/lang/Object;
.source "FeedbackSubmit.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/FeedbackSubmit$Input;,
        Lcom/pymcl/android/data/FeedbackSubmit$Outcome;,
        Lcom/pymcl/android/data/FeedbackSubmit$Prepared;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFeedbackSubmit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackSubmit.kt\ncom/pymcl/android/data/FeedbackSubmit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ6\u0010\u0010\u001a\u00020\u00052\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008\u001a\u0012\u0008\u0008\u001b\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/pymcl/android/data/FeedbackSubmit;",
        "",
        "<init>",
        "()V",
        "DEFAULT_URL",
        "",
        "prepare",
        "Lcom/pymcl/android/data/FeedbackSubmit$Prepared;",
        "input",
        "Lcom/pymcl/android/data/FeedbackSubmit$Input;",
        "submit",
        "Lcom/pymcl/android/data/FeedbackSubmit$Outcome;",
        "http",
        "Lcom/pymcl/core/net/Http;",
        "r",
        "Lcom/pymcl/android/data/FeedbackSubmit$Prepared$Ready;",
        "deviceId",
        "get",
        "Lkotlin/Function1;",
        "put",
        "Lkotlin/Function2;",
        "",
        "Input",
        "Prepared",
        "Outcome",
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
.field public static final $stable:I = 0x0

.field public static final DEFAULT_URL:Ljava/lang/String; = "http://114.66.28.184:53611/api/v1/feedback"

.field public static final INSTANCE:Lcom/pymcl/android/data/FeedbackSubmit;


# direct methods
.method public static synthetic $r8$lambda$7HJYc4Awk5oOz6MiiNstkq-vSXA(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/FeedbackSubmit;->prepare$lambda$1$0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/FeedbackSubmit;

    invoke-direct {v0}, Lcom/pymcl/android/data/FeedbackSubmit;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/FeedbackSubmit;->INSTANCE:Lcom/pymcl/android/data/FeedbackSubmit;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final prepare$lambda$1$0(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    sget-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    invoke-virtual {v0, p0}, Lcom/pymcl/core/crash/CrashAnalyzer;->filterSecrets(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method


# virtual methods
.method public final deviceId(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;
    .locals 5
    .param p1, "get"    # Lkotlin/jvm/functions/Function1;
    .param p2, "put"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "get"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "put"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    const-string v0, "feedback_device_id"

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    move-object v2, v1

    .line 137
    .local v2, "it\\1":Ljava/lang/String;
    const/4 v3, 0x0

    .line 89
    .local v3, "$i$a$-takeIf-FeedbackSubmit$deviceId$1\\1\\89\\0":I
    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    .end local v2    # "it\\1":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-FeedbackSubmit$deviceId$1\\1\\89\\0":I
    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 137
    .local v1, "it\\2":Ljava/lang/String;
    const/4 v0, 0x0

    .line 89
    .local v0, "$i$a$-let-FeedbackSubmit$deviceId$2\\2\\89\\0":I
    return-object v1

    .line 90
    .end local v0    # "$i$a$-let-FeedbackSubmit$deviceId$2\\2\\89\\0":I
    .end local v1    # "it\\2":Ljava/lang/String;
    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .local v1, "id":Ljava/lang/String;
    invoke-interface {p2, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    return-object v1
.end method

.method public final prepare(Lcom/pymcl/android/data/FeedbackSubmit$Input;)Lcom/pymcl/android/data/FeedbackSubmit$Prepared;
    .locals 21
    .param p1, "input"    # Lcom/pymcl/android/data/FeedbackSubmit$Input;

    const-string v0, "input"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Input;->getConsented()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/pymcl/android/data/FeedbackSubmit$Prepared$NeedConsent;->INSTANCE:Lcom/pymcl/android/data/FeedbackSubmit$Prepared$NeedConsent;

    check-cast v0, Lcom/pymcl/android/data/FeedbackSubmit$Prepared;

    return-object v0

    .line 52
    :cond_0
    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Input;->getUrlOverride()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    if-eqz v2, :cond_2

    .line 137
    const/4 v0, 0x0

    .line 52
    .local v0, "$i$a$-ifEmpty-FeedbackSubmit$prepare$url$1\\1\\52\\0":I
    nop

    .end local v0    # "$i$a$-ifEmpty-FeedbackSubmit$prepare$url$1\\1\\52\\0":I
    const-string v0, "http://114.66.28.184:53611/api/v1/feedback"

    :cond_2
    check-cast v0, Ljava/lang/String;

    .line 53
    .local v0, "url":Ljava/lang/String;
    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Input;->getKind()I

    move-result v2

    sget-object v5, Lcom/pymcl/android/data/FeedbackLogic;->INSTANCE:Lcom/pymcl/android/data/FeedbackLogic;

    invoke-virtual {v5}, Lcom/pymcl/android/data/FeedbackLogic;->getCATEGORY()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v5

    invoke-static {v2, v4, v5}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v2

    .line 55
    .local v2, "k":I
    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Input;->getAttachments()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Input;->getAttachments()Ljava/util/List;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/Iterable;

    const-string v5, "\u3001"

    move-object v7, v5

    check-cast v7, Ljava/lang/CharSequence;

    const/16 v13, 0x3e

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v14}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\n\n\u9644\u4ef6\uff08\u672a\u4e0a\u4f20\uff09\uff1a"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_3
    const-string v5, ""

    .line 56
    .local v5, "ref":Ljava/lang/String;
    :goto_1
    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Input;->getBody()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    const/16 v8, 0x3e80

    rsub-int v7, v7, 0x3e80

    invoke-static {v7, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v7

    invoke-static {v6, v7}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 58
    .local v6, "body":Ljava/lang/String;
    const/16 v7, 0x8

    new-array v7, v7, [Lkotlin/Pair;

    const-string v9, "device_id"

    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Input;->getDeviceId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v7, v4

    .line 59
    sget-object v9, Lcom/pymcl/android/data/FeedbackLogic;->INSTANCE:Lcom/pymcl/android/data/FeedbackLogic;

    invoke-virtual {v9}, Lcom/pymcl/android/data/FeedbackLogic;->getCATEGORY()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    const-string v10, "category"

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v7, v3

    .line 58
    nop

    .line 60
    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Input;->getTitle()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v9, 0x78

    invoke-static {v3, v9}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    const-string v10, "title"

    invoke-static {v10, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v10, 0x2

    aput-object v3, v7, v10

    .line 58
    nop

    .line 61
    const-string v3, "body"

    invoke-static {v6, v8}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v8, 0x3

    aput-object v3, v7, v8

    .line 58
    nop

    .line 62
    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Input;->getContact()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    const-string v8, "contact"

    invoke-static {v8, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v8, 0x4

    aput-object v3, v7, v8

    .line 58
    nop

    .line 63
    const-string v3, "app_version"

    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Input;->getAppVersion()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v8, 0x5

    aput-object v3, v7, v8

    .line 58
    nop

    .line 64
    const-string v3, "crash"

    const/4 v8, 0x0

    invoke-static {v3, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v9, 0x6

    aput-object v3, v7, v9

    .line 58
    nop

    .line 65
    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Input;->getSysinfo()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 137
    nop

    .local v3, "s\\2":Ljava/lang/String;
    const/4 v9, 0x0

    .line 65
    .local v9, "$i$a$-let-FeedbackSubmit$prepare$payload$1\\2\\65\\0":I
    move-object v11, v3

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v11}, Lkotlin/text/StringsKt;->lines(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ljava/lang/Iterable;

    const-string v11, "\n"

    move-object v13, v11

    check-cast v13, Ljava/lang/CharSequence;

    new-instance v18, Lcom/pymcl/android/data/FeedbackSubmit$$ExternalSyntheticLambda0;

    invoke-direct/range {v18 .. v18}, Lcom/pymcl/android/data/FeedbackSubmit$$ExternalSyntheticLambda0;-><init>()V

    const/16 v19, 0x1e

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v12 .. v20}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .end local v3    # "s\\2":Ljava/lang/String;
    .end local v9    # "$i$a$-let-FeedbackSubmit$prepare$payload$1\\2\\65\\0":I
    goto :goto_2

    :cond_4
    move-object v3, v8

    :goto_2
    const-string v9, "sysinfo"

    invoke-static {v9, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v9, 0x7

    aput-object v3, v7, v9

    .line 58
    nop

    .line 57
    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    .line 67
    .local v3, "payload":Ljava/util/Map;
    new-instance v7, Lcom/pymcl/android/data/FeedbackSubmit$Prepared$Ready;

    sget-object v9, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-static {v9, v3, v4, v10, v8}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/pymcl/android/data/FeedbackSubmit$Input;->getAppVersion()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "PyMCL/"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "X-PyMCL-Client"

    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    invoke-direct {v7, v0, v4, v8}, Lcom/pymcl/android/data/FeedbackSubmit$Prepared$Ready;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    check-cast v7, Lcom/pymcl/android/data/FeedbackSubmit$Prepared;

    return-object v7
.end method

.method public final submit(Lcom/pymcl/core/net/Http;Lcom/pymcl/android/data/FeedbackSubmit$Prepared$Ready;)Lcom/pymcl/android/data/FeedbackSubmit$Outcome;
    .locals 7
    .param p1, "http"    # Lcom/pymcl/core/net/Http;
    .param p2, "r"    # Lcom/pymcl/android/data/FeedbackSubmit$Prepared$Ready;

    const-string v0, "http"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "r"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p2}, Lcom/pymcl/android/data/FeedbackSubmit$Prepared$Ready;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/pymcl/android/data/FeedbackSubmit$Prepared$Ready;->getJson()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/pymcl/android/data/FeedbackSubmit$Prepared$Ready;->getHeaders()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2}, Lcom/pymcl/core/net/Http;->postJson(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    .line 79
    .local v0, "resp":Lcom/pymcl/core/net/HttpResponse;
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/android/data/FeedbackSubmit;

    .line 137
    .local v1, "$this$submit_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackSubmit;
    const/4 v2, 0x0

    .line 79
    .local v2, "$i$a$-runCatching-FeedbackSubmit$submit$o$1\\1\\79\\0":I
    sget-object v3, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .end local v1    # "$this$submit_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackSubmit;
    .end local v2    # "$i$a$-runCatching-FeedbackSubmit$submit$o$1\\1\\79\\0":I
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v1, v3

    :cond_0
    check-cast v1, Ljava/util/Map;

    .line 80
    .local v1, "o":Ljava/util/Map;
    nop

    .line 81
    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getOk()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    const-string v5, "ok"

    invoke-static {v1, v5}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    if-eqz v5, :cond_5

    const-string v3, "id"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    const-string v3, ""

    :cond_2
    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    move v2, v4

    :goto_2
    if-eqz v2, :cond_4

    .line 137
    const/4 v2, 0x0

    .line 81
    .local v2, "$i$a$-ifEmpty-FeedbackSubmit$submit$1\\2\\81\\0":I
    nop

    .end local v2    # "$i$a$-ifEmpty-FeedbackSubmit$submit$1\\2\\81\\0":I
    const-string v3, "fb"

    :cond_4
    check-cast v3, Ljava/lang/String;

    new-instance v2, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$Submitted;

    invoke-direct {v2, v3}, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$Submitted;-><init>(Ljava/lang/String;)V

    check-cast v2, Lcom/pymcl/android/data/FeedbackSubmit$Outcome;

    goto :goto_3

    .line 82
    :cond_5
    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getOk()Z

    move-result v2

    const-string v4, "error"

    if-eqz v2, :cond_9

    if-eqz v1, :cond_7

    invoke-static {v1, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    move-object v4, v2

    .line 137
    .local v4, "it\\3":Ljava/lang/String;
    const/4 v5, 0x0

    .line 82
    .local v5, "$i$a$-takeIf-FeedbackSubmit$submit$2\\3\\82\\0":I
    move-object v6, v4

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v6

    .end local v4    # "it\\3":Ljava/lang/String;
    .end local v5    # "$i$a$-takeIf-FeedbackSubmit$submit$2\\3\\82\\0":I
    if-nez v6, :cond_6

    move-object v3, v2

    :cond_6
    if-nez v3, :cond_8

    :cond_7
    const-string v3, "\u670d\u52a1\u5668\u62d2\u7edd\u4e86\u8fd9\u6b21\u53cd\u9988"

    :cond_8
    new-instance v2, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$ServerError;

    invoke-direct {v2, v3}, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$ServerError;-><init>(Ljava/lang/String;)V

    check-cast v2, Lcom/pymcl/android/data/FeedbackSubmit$Outcome;

    goto :goto_3

    .line 83
    :cond_9
    new-instance v2, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$HttpError;

    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v3

    if-eqz v1, :cond_a

    invoke-static {v1, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_b

    :cond_a
    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0xc8

    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    :cond_b
    invoke-direct {v2, v3, v4}, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$HttpError;-><init>(ILjava/lang/String;)V

    check-cast v2, Lcom/pymcl/android/data/FeedbackSubmit$Outcome;

    .line 80
    :goto_3
    return-object v2
.end method
