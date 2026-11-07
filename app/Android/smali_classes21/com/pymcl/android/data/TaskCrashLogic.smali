.class public final Lcom/pymcl/android/data/TaskCrashLogic;
.super Ljava/lang/Object;
.source "MiscLogic.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMiscLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiscLogic.kt\ncom/pymcl/android/data/TaskCrashLogic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,227:1\n1#2:228\n777#3:229\n873#3,2:230\n1739#3:232\n1814#3,3:233\n*S KotlinDebug\n*F\n+ 1 MiscLogic.kt\ncom/pymcl/android/data/TaskCrashLogic\n*L\n179#1:229\n179#1:230,2\n183#1:232\n183#1:233,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ*\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00ca\u0001\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/android/data/TaskCrashLogic;",
        "",
        "<init>",
        "()V",
        "canAnalyze",
        "",
        "state",
        "Lcom/pymcl/android/ui/state/TaskState;",
        "detail",
        "",
        "analyze",
        "Lcom/pymcl/android/ui/state/CrashInfo;",
        "title",
        "gameDir",
        "scene",
        "Lcom/pymcl/android/ui/state/CrashScene;",
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

.field public static final INSTANCE:Lcom/pymcl/android/data/TaskCrashLogic;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/TaskCrashLogic;

    invoke-direct {v0}, Lcom/pymcl/android/data/TaskCrashLogic;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/TaskCrashLogic;->INSTANCE:Lcom/pymcl/android/data/TaskCrashLogic;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic analyze$default(Lcom/pymcl/android/data/TaskCrashLogic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashScene;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/CrashInfo;
    .locals 0

    .line 177
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const-string p3, ""

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    sget-object p4, Lcom/pymcl/android/ui/state/CrashScene;->TASK:Lcom/pymcl/android/ui/state/CrashScene;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/android/data/TaskCrashLogic;->analyze(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashScene;)Lcom/pymcl/android/ui/state/CrashInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final analyze(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashScene;)Lcom/pymcl/android/ui/state/CrashInfo;
    .locals 22
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "detail"    # Ljava/lang/String;
    .param p3, "gameDir"    # Ljava/lang/String;
    .param p4, "scene"    # Lcom/pymcl/android/ui/state/CrashScene;

    move-object/from16 v2, p2

    const-string v0, "title"

    move-object/from16 v9, p1

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detail"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gameDir"

    move-object/from16 v10, p3

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scene"

    move-object/from16 v11, p4

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/android/data/TaskCrashLogic;

    move-object v12, v0

    .line 228
    .local v12, "$this$analyze_u24lambda_u240\\1":Lcom/pymcl/android/data/TaskCrashLogic;
    const/4 v13, 0x0

    .line 178
    .local v13, "$i$a$-runCatching-TaskCrashLogic$analyze$reasons$1\\1\\178\\0":I
    sget-object v14, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    new-instance v0, Lcom/pymcl/core/crash/CrashInput;

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v1, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/pymcl/core/crash/CrashInput;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v14, v0}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze(Lcom/pymcl/core/crash/CrashInput;)Ljava/util/List;

    move-result-object v0

    .end local v12    # "$this$analyze_u24lambda_u240\\1":Lcom/pymcl/android/data/TaskCrashLogic;
    .end local v13    # "$i$a$-runCatching-TaskCrashLogic$analyze$reasons$1\\1\\178\\0":I
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    .line 179
    nop

    .local v0, "$this$filter\\2":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 229
    .local v1, "$i$f$filter\\2\\179":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination\\3":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo\\3":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 230
    .local v4, "$i$f$filterTo\\3\\229":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element\\3":Ljava/lang/Object;
    move-object v12, v6

    check-cast v12, Lcom/pymcl/core/crash/CrashReason;

    .local v12, "it\\4":Lcom/pymcl/core/crash/CrashReason;
    const/4 v13, 0x0

    .line 179
    .local v13, "$i$a$-filter-TaskCrashLogic$analyze$reasons$2\\4\\230\\0":I
    invoke-virtual {v12}, Lcom/pymcl/core/crash/CrashReason;->getKind()Ljava/lang/String;

    move-result-object v14

    const-string v15, "no_files"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_2

    invoke-virtual {v12}, Lcom/pymcl/core/crash/CrashReason;->getKind()Ljava/lang/String;

    move-result-object v14

    const-string v15, "tiny_output"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_2

    goto :goto_2

    :cond_2
    move v7, v8

    .line 230
    .end local v12    # "it\\4":Lcom/pymcl/core/crash/CrashReason;
    .end local v13    # "$i$a$-filter-TaskCrashLogic$analyze$reasons$2\\4\\230\\0":I
    :goto_2
    if-eqz v7, :cond_1

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 231
    .end local v6    # "element\\3":Ljava/lang/Object;
    :cond_3
    nop

    .end local v2    # "destination\\3":Ljava/util/Collection;
    .end local v3    # "$this$filterTo\\3":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filterTo\\3\\229":I
    check-cast v2, Ljava/util/List;

    .line 229
    nop

    .line 179
    .end local v0    # "$this$filter\\2":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filter\\2\\179":I
    nop

    .line 178
    move-object v0, v2

    .line 180
    .local v0, "reasons":Ljava/util/List;
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/pymcl/core/crash/CrashReason;

    .line 181
    .local v12, "first":Lcom/pymcl/core/crash/CrashReason;
    if-nez v12, :cond_4

    const-string v1, "\u6ca1\u6709\u5339\u914d\u5230\u5df2\u77e5\u539f\u56e0\u3002\u4e0b\u9762\u662f\u8fd9\u4e2a\u4efb\u52a1\u7684\u5931\u8d25\u4fe1\u606f\uff0c\u53ef\u590d\u5236\u540e\u641c\u7d22\u6216\u53cd\u9988\u3002"

    move-object v6, v1

    goto :goto_4

    .line 182
    :cond_4
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v12}, Lcom/pymcl/core/crash/CrashReason;->getDescription()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v8

    invoke-virtual {v12}, Lcom/pymcl/core/crash/CrashReason;->getExtra()Ljava/util/List;

    move-result-object v2

    .line 228
    move-object v3, v2

    .local v3, "it\\5":Ljava/util/List;
    const/4 v4, 0x0

    .line 182
    .local v4, "$i$a$-takeIf-TaskCrashLogic$analyze$explain$1\\5\\182\\0":I
    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    .end local v3    # "it\\5":Ljava/util/List;
    .end local v4    # "$i$a$-takeIf-TaskCrashLogic$analyze$explain$1\\5\\182\\0":I
    const/4 v3, 0x0

    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    move-object v2, v3

    :goto_3
    if-eqz v2, :cond_6

    move-object v13, v2

    check-cast v13, Ljava/lang/Iterable;

    const-string v2, "\u3001"

    move-object v14, v2

    check-cast v14, Ljava/lang/CharSequence;

    const/16 v20, 0x3e

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v13 .. v21}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :cond_6
    aput-object v3, v1, v7

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Ljava/lang/Iterable;

    const-string v1, "\n"

    move-object v14, v1

    check-cast v14, Ljava/lang/CharSequence;

    const/16 v20, 0x3e

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v13 .. v21}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v6, v1

    .line 181
    :goto_4
    nop

    .line 183
    .local v6, "explain":Ljava/lang/String;
    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->lines(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map\\6":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 232
    .local v2, "$i$f$map\\6\\183":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination\\7":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$mapTo\\7":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 233
    .local v5, "$i$f$mapTo\\7\\232":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 234
    .local v8, "item\\7":Ljava/lang/Object;
    move-object v13, v8

    check-cast v13, Ljava/lang/String;

    .local v13, "it\\8":Ljava/lang/String;
    const/4 v14, 0x0

    .line 183
    .local v14, "$i$a$-map-TaskCrashLogic$analyze$tail$1\\8\\234\\0":I
    sget-object v15, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    invoke-virtual {v15, v13}, Lcom/pymcl/core/crash/CrashAnalyzer;->filterSecrets(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 234
    .end local v13    # "it\\8":Ljava/lang/String;
    .end local v14    # "$i$a$-map-TaskCrashLogic$analyze$tail$1\\8\\234\\0":I
    invoke-interface {v3, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 235
    .end local v8    # "item\\7":Ljava/lang/Object;
    :cond_7
    nop

    .end local v3    # "destination\\7":Ljava/util/Collection;
    .end local v4    # "$this$mapTo\\7":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo\\7\\232":I
    check-cast v3, Ljava/util/List;

    .line 232
    nop

    .line 183
    .end local v1    # "$this$map\\6":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map\\6\\183":I
    const/16 v1, 0x3c

    invoke-static {v3, v1}, Lkotlin/collections/CollectionsKt;->takeLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v8

    .line 184
    .local v8, "tail":Ljava/util/List;
    new-instance v1, Lcom/pymcl/android/ui/state/CrashInfo;

    if-eqz v12, :cond_8

    invoke-virtual {v12}, Lcom/pymcl/core/crash/CrashReason;->getTitle()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_9

    :cond_8
    const-string v2, "\u4efb\u52a1\u5931\u8d25"

    :cond_9
    move-object v5, v2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    const-string v2, ""

    const/4 v4, -0x1

    move-object v3, v9

    move-object v9, v10

    move-object v10, v11

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/CrashInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashScene;)V

    return-object v1
.end method

.method public final canAnalyze(Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;)Z
    .locals 1
    .param p1, "state"    # Lcom/pymcl/android/ui/state/TaskState;
    .param p2, "detail"    # Ljava/lang/String;

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detail"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    sget-object v0, Lcom/pymcl/android/ui/state/TaskState;->Failed:Lcom/pymcl/android/ui/state/TaskState;

    if-ne p1, v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
