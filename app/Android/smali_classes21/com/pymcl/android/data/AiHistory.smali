.class public final Lcom/pymcl/android/data/AiHistory;
.super Ljava/lang/Object;
.source "AiBridge.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiBridge.kt\ncom/pymcl/android/data/AiHistory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1373#2,2:220\n1402#2,4:222\n1739#2:226\n1814#2,2:227\n1816#2:230\n777#2:231\n873#2,2:232\n1373#2,2:234\n1402#2,4:236\n2077#2,2:240\n2068#2:242\n1739#2:243\n1814#2,3:244\n2069#2:247\n2079#2:248\n1#3:229\n*S KotlinDebug\n*F\n+ 1 AiBridge.kt\ncom/pymcl/android/data/AiHistory\n*L\n184#1:220,2\n184#1:222,4\n185#1:226\n185#1:227,2\n185#1:230\n190#1:231\n190#1:232,2\n190#1:234,2\n190#1:236,4\n191#1:240,2\n201#1:242\n205#1:243\n205#1:244,3\n201#1:247\n191#1:248\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0005J,\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cj\u0002`\u000e0\u0005\u00ca\u0001\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/pymcl/android/data/AiHistory;",
        "",
        "<init>",
        "()V",
        "withTasks",
        "",
        "Lcom/pymcl/android/ui/state/AiItem;",
        "items",
        "tasks",
        "Lcom/pymcl/ai/BgTaskInfo;",
        "toItems",
        "msgs",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
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

.field public static final INSTANCE:Lcom/pymcl/android/data/AiHistory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/AiHistory;

    invoke-direct {v0}, Lcom/pymcl/android/data/AiHistory;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/AiHistory;->INSTANCE:Lcom/pymcl/android/data/AiHistory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toItems(Ljava/util/List;)Ljava/util/List;
    .locals 38
    .param p1, "msgs"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p1

    const-string v0, "msgs"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .line 190
    .local v2, "out":Ljava/util/List;
    move-object v0, v1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter\\1":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 231
    .local v3, "$i$f$filter\\1\\190":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination\\2":Ljava/util/Collection;
    move-object v5, v0

    .local v5, "$this$filterTo\\2":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 232
    .local v6, "$i$f$filterTo\\2\\231":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-string v9, "role"

    if-eqz v8, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element\\2":Ljava/lang/Object;
    move-object v10, v8

    check-cast v10, Ljava/util/Map;

    .local v10, "it\\3":Ljava/util/Map;
    const/4 v11, 0x0

    .line 190
    .local v11, "$i$a$-filter-AiHistory$toItems$results$1\\3\\232\\0":I
    invoke-static {v10, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v12, "tool"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    .line 232
    .end local v10    # "it\\3":Ljava/util/Map;
    .end local v11    # "$i$a$-filter-AiHistory$toItems$results$1\\3\\232\\0":I
    if-eqz v9, :cond_0

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 233
    .end local v8    # "element\\2":Ljava/lang/Object;
    :cond_1
    nop

    .end local v4    # "destination\\2":Ljava/util/Collection;
    .end local v5    # "$this$filterTo\\2":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filterTo\\2\\231":I
    check-cast v4, Ljava/util/List;

    .line 231
    nop

    .end local v0    # "$this$filter\\1":Ljava/lang/Iterable;
    .end local v3    # "$i$f$filter\\1\\190":I
    check-cast v4, Ljava/lang/Iterable;

    .line 190
    nop

    .local v4, "$this$associateBy\\4":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 234
    .local v0, "$i$f$associateBy\\4\\190":I
    const/16 v3, 0xa

    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v5

    const/16 v6, 0x10

    invoke-static {v5, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v5

    .line 235
    .local v5, "capacity\\4":I
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v6, Ljava/util/Map;

    .local v6, "destination\\5":Ljava/util/Map;
    move-object v7, v4

    .local v7, "$this$associateByTo\\5":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 236
    .local v8, "$i$f$associateByTo\\5\\235":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const-string v12, ""

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 237
    .local v11, "element\\5":Ljava/lang/Object;
    move-object v13, v11

    check-cast v13, Ljava/util/Map;

    .local v13, "it\\6":Ljava/util/Map;
    const/4 v14, 0x0

    .line 190
    .local v14, "$i$a$-associateBy-AiHistory$toItems$results$2\\6\\237\\0":I
    const-string v15, "tool_call_id"

    invoke-static {v13, v15}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_2

    goto :goto_2

    :cond_2
    move-object v12, v15

    .line 237
    .end local v13    # "it\\6":Ljava/util/Map;
    .end local v14    # "$i$a$-associateBy-AiHistory$toItems$results$2\\6\\237\\0":I
    :goto_2
    invoke-interface {v6, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 239
    .end local v11    # "element\\5":Ljava/lang/Object;
    :cond_3
    nop

    .line 235
    .end local v6    # "destination\\5":Ljava/util/Map;
    .end local v7    # "$this$associateByTo\\5":Ljava/lang/Iterable;
    .end local v8    # "$i$f$associateByTo\\5\\235":I
    nop

    .line 190
    .end local v0    # "$i$f$associateBy\\4\\190":I
    .end local v4    # "$this$associateBy\\4":Ljava/lang/Iterable;
    .end local v5    # "capacity\\4":I
    nop

    .line 191
    .local v6, "results":Ljava/util/Map;
    move-object v4, v1

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 240
    .local v5, "$i$f$forEachIndexed\\7\\191":I
    const/4 v0, 0x0

    .line 241
    .local v0, "index\\7":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_27

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "item\\7":Ljava/lang/Object;
    add-int/lit8 v10, v0, 0x1

    .end local v0    # "index\\7":I
    .local v10, "index\\7":I
    if-gez v0, :cond_4

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_4
    move-object v11, v8

    check-cast v11, Ljava/util/Map;

    .local v11, "m\\8":Ljava/util/Map;
    move v13, v0

    .local v13, "i\\8":I
    const/4 v14, 0x0

    .line 192
    .local v14, "$i$a$-forEachIndexed-AiHistory$toItems$1\\8\\241\\0":I
    invoke-static {v11, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 193
    const-string v15, "user"

    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    const-string v3, "content"

    const-string v1, "h"

    move-object/from16 v17, v2

    .end local v2    # "out":Ljava/util/List;
    .local v17, "out":Ljava/util/List;
    const/16 v18, 0x1

    const/4 v2, 0x0

    if-eqz v15, :cond_a

    .line 194
    const-string v0, "summary"

    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object/from16 v0, v17

    check-cast v0, Ljava/util/Collection;

    new-instance v18, Lcom/pymcl/android/ui/state/AiItem$Tool;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v3, "\u8f83\u65e9\u7684\u5bf9\u8bdd\u5df2\u538b\u7f29\u6210\u6458\u8981"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    sget-object v23, Lcom/pymcl/android/ui/state/TaskState;->Done:Lcom/pymcl/android/ui/state/TaskState;

    const/16 v25, 0x20

    const/16 v26, 0x0

    const-string v20, "__status"

    const/16 v22, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v26}, Lcom/pymcl/android/ui/state/AiItem$Tool;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v21, v4

    move/from16 v18, v5

    move-object/from16 v16, v6

    goto/16 :goto_14

    .line 195
    :cond_5
    const-string v0, "bg_report"

    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    move-object/from16 v0, v17

    check-cast v0, Ljava/util/Collection;

    new-instance v18, Lcom/pymcl/android/ui/state/AiItem$Tool;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v3, "\u540e\u53f0\u4efb\u52a1\u5df2\u7ed3\u675f\uff0c\u52a9\u624b\u56de\u6765\u6c47\u62a5\u7ed3\u679c"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    sget-object v23, Lcom/pymcl/android/ui/state/TaskState;->Done:Lcom/pymcl/android/ui/state/TaskState;

    const/16 v25, 0x20

    const/16 v26, 0x0

    const-string v20, "__status"

    const/16 v22, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v26}, Lcom/pymcl/android/ui/state/AiItem$Tool;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v21, v4

    move/from16 v18, v5

    move-object/from16 v16, v6

    goto/16 :goto_14

    .line 196
    :cond_6
    const-string v0, "hidden"

    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    move-object/from16 v0, v17

    check-cast v0, Ljava/util/Collection;

    new-instance v2, Lcom/pymcl/android/ui/state/AiItem$User;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v11, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v15, v3, Ljava/lang/String;

    if-eqz v15, :cond_7

    check-cast v3, Ljava/lang/String;

    move-object/from16 v19, v3

    goto :goto_4

    :cond_7
    const/16 v19, 0x0

    :goto_4
    if-nez v19, :cond_8

    move-object v3, v12

    goto :goto_5

    :cond_8
    move-object/from16 v3, v19

    :goto_5
    invoke-direct {v2, v1, v3}, Lcom/pymcl/android/ui/state/AiItem$User;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_9
    move-object/from16 v21, v4

    move/from16 v18, v5

    move-object/from16 v16, v6

    goto/16 :goto_14

    .line 198
    :cond_a
    const-string v15, "assistant"

    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 199
    invoke-interface {v11, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v15, v0, Ljava/lang/String;

    if-eqz v15, :cond_b

    check-cast v0, Ljava/lang/String;

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    :goto_6
    if-nez v0, :cond_c

    move-object v0, v12

    :cond_c
    move-object v15, v0

    .line 200
    .local v15, "c\\8":Ljava/lang/String;
    move-object v0, v15

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v2, "reasoning_content"

    if-eqz v0, :cond_10

    invoke-static {v11, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    move-object/from16 v21, v4

    move/from16 v4, v18

    .end local v4    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .local v21, "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    if-ne v0, v4, :cond_e

    goto :goto_7

    .end local v21    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .restart local v4    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    :cond_d
    move-object/from16 v21, v4

    .end local v4    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .restart local v21    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    :cond_e
    const/4 v4, 0x0

    :goto_7
    if-eqz v4, :cond_f

    goto :goto_8

    :cond_f
    move/from16 v18, v5

    goto :goto_a

    .end local v21    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .restart local v4    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    :cond_10
    move-object/from16 v21, v4

    .end local v4    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .restart local v21    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    :goto_8
    move-object/from16 v0, v17

    check-cast v0, Ljava/util/Collection;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_12

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_11

    .line 229
    const/4 v2, 0x0

    .line 200
    .local v2, "$i$a$-ifBlank-AiHistory$toItems$1$1\\9\\200\\8":I
    const/4 v2, 0x0

    .end local v2    # "$i$a$-ifBlank-AiHistory$toItems$1$1\\9\\200\\8":I
    :cond_11
    check-cast v2, Ljava/lang/String;

    goto :goto_9

    :cond_12
    const/4 v2, 0x0

    :goto_9
    new-instance v4, Lcom/pymcl/android/ui/state/AiItem$Assistant;

    move/from16 v18, v5

    const/4 v5, 0x0

    .end local v5    # "$i$f$forEachIndexed\\7\\191":I
    .local v18, "$i$f$forEachIndexed\\7\\191":I
    invoke-direct {v4, v1, v15, v5, v2}, Lcom/pymcl/android/ui/state/AiItem$Assistant;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 201
    :goto_a
    const-string v0, "tool_calls"

    invoke-static {v11, v0}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$forEach\\10":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 242
    .local v2, "$i$f$forEach\\10\\201":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v22, v1

    .end local v1    # "$this$forEach\\10":Ljava/lang/Iterable;
    .local v5, "element\\10":Ljava/lang/Object;
    .local v22, "$this$forEach\\10":Ljava/lang/Iterable;
    move-object v1, v5

    check-cast v1, Ljava/util/Map;

    .local v1, "tc\\11":Ljava/util/Map;
    const/16 v23, 0x0

    .line 202
    .local v23, "$i$a$-forEach-AiHistory$toItems$1$2\\11\\242\\8":I
    const-string v0, "id"

    invoke-static {v1, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_13

    move-object v0, v12

    :cond_13
    move-object/from16 v24, v0

    .local v24, "id\\11":Ljava/lang/String;
    const-string v0, "function"

    move/from16 v25, v2

    .end local v2    # "$i$f$forEach\\10\\201":I
    .local v25, "$i$f$forEach\\10\\201":I
    invoke-static {v1, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    move-object/from16 v26, v4

    const-string v4, "name"

    invoke-static {v2, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_14

    move-object v2, v12

    .line 203
    .local v2, "name\\11":Ljava/lang/String;
    :cond_14
    move-object/from16 v4, v24

    .end local v24    # "id\\11":Ljava/lang/String;
    .local v4, "id\\11":Ljava/lang/String;
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v24

    move-object/from16 v34, v5

    .end local v5    # "element\\10":Ljava/lang/Object;
    .local v34, "element\\10":Ljava/lang/Object;
    move-object/from16 v5, v24

    check-cast v5, Ljava/util/Map;

    if-eqz v5, :cond_15

    invoke-static {v5, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_16

    :cond_15
    move-object v5, v12

    .line 204
    .local v5, "r\\11":Ljava/lang/String;
    :cond_16
    move-object/from16 v24, v3

    const-string v3, "update_plan"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1c

    .line 205
    sget-object v3, Lcom/pymcl/android/data/AiHistory;->INSTANCE:Lcom/pymcl/android/data/AiHistory;

    :try_start_0
    sget-object v27, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 229
    .local v3, "$this$toItems_u24lambda_u242_u241_u240\\12":Lcom/pymcl/android/data/AiHistory;
    const/16 v27, 0x0

    .line 205
    .local v27, "$i$a$-runCatching-AiHistory$toItems$1$2$items$1\\12\\205\\11":I
    move-object/from16 v29, v2

    .end local v2    # "name\\11":Ljava/lang/String;
    .local v29, "name\\11":Ljava/lang/String;
    :try_start_1
    sget-object v2, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-static {v1, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v35, v1

    .end local v1    # "tc\\11":Ljava/util/Map;
    .local v35, "tc\\11":Ljava/util/Map;
    :try_start_2
    const-string v1, "arguments"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_17

    const-string v0, "{}"

    :cond_17
    invoke-virtual {v2, v0}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "items"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map\\13":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 243
    .local v1, "$i$f$map\\13\\205":I
    new-instance v2, Ljava/util/ArrayList;

    move/from16 v28, v1

    move-object/from16 v16, v3

    const/16 v1, 0xa

    .end local v1    # "$i$f$map\\13\\205":I
    .end local v3    # "$this$toItems_u24lambda_u242_u241_u240\\12":Lcom/pymcl/android/data/AiHistory;
    .local v16, "$this$toItems_u24lambda_u242_u241_u240\\12":Lcom/pymcl/android/data/AiHistory;
    .local v28, "$i$f$map\\13\\205":I
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination\\14":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo\\14":Ljava/lang/Iterable;
    const/16 v30, 0x0

    .line 244
    .local v30, "$i$f$mapTo\\14\\243":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v31

    :goto_c
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    move-result v32

    if-eqz v32, :cond_1a

    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v32

    .line 245
    .local v32, "item\\14":Ljava/lang/Object;
    move-object/from16 v33, v32

    check-cast v33, Ljava/util/Map;

    move-object/from16 v36, v33

    .local v36, "it\\15":Ljava/util/Map;
    const/16 v33, 0x0

    .line 205
    .local v33, "$i$a$-map-AiHistory$toItems$1$2$items$1$1\\15\\245\\12":I
    const-string v1, "title"

    move-object/from16 v37, v0

    move-object/from16 v0, v36

    .end local v36    # "it\\15":Ljava/util/Map;
    .local v0, "it\\15":Ljava/util/Map;
    .local v37, "$this$map\\13":Ljava/lang/Iterable;
    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_18

    move-object v1, v12

    :cond_18
    move-object/from16 v36, v3

    .end local v3    # "$this$mapTo\\14":Ljava/lang/Iterable;
    .local v36, "$this$mapTo\\14":Ljava/lang/Iterable;
    const-string v3, "status"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_19

    const-string v3, "pending"

    :cond_19
    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 245
    .end local v0    # "it\\15":Ljava/util/Map;
    .end local v33    # "$i$a$-map-AiHistory$toItems$1$2$items$1$1\\15\\245\\12":I
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, v36

    move-object/from16 v0, v37

    const/16 v1, 0xa

    goto :goto_c

    .line 246
    .end local v32    # "item\\14":Ljava/lang/Object;
    .end local v36    # "$this$mapTo\\14":Ljava/lang/Iterable;
    .end local v37    # "$this$map\\13":Ljava/lang/Iterable;
    .local v0, "$this$map\\13":Ljava/lang/Iterable;
    .restart local v3    # "$this$mapTo\\14":Ljava/lang/Iterable;
    :cond_1a
    move-object/from16 v37, v0

    move-object/from16 v36, v3

    .end local v0    # "$this$map\\13":Ljava/lang/Iterable;
    .end local v2    # "destination\\14":Ljava/util/Collection;
    .end local v3    # "$this$mapTo\\14":Ljava/lang/Iterable;
    .end local v30    # "$i$f$mapTo\\14\\243":I
    .restart local v37    # "$this$map\\13":Ljava/lang/Iterable;
    move-object v0, v2

    check-cast v0, Ljava/util/List;

    .line 243
    nop

    .line 205
    .end local v28    # "$i$f$map\\13\\205":I
    .end local v37    # "$this$map\\13":Ljava/lang/Iterable;
    nop

    .end local v16    # "$this$toItems_u24lambda_u242_u241_u240\\12":Lcom/pymcl/android/data/AiHistory;
    .end local v27    # "$i$a$-runCatching-AiHistory$toItems$1$2$items$1\\12\\205\\11":I
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_e

    :catchall_0
    move-exception v0

    goto :goto_d

    .end local v35    # "tc\\11":Ljava/util/Map;
    .local v1, "tc\\11":Ljava/util/Map;
    :catchall_1
    move-exception v0

    move-object/from16 v35, v1

    .end local v1    # "tc\\11":Ljava/util/Map;
    .restart local v35    # "tc\\11":Ljava/util/Map;
    goto :goto_d

    .end local v29    # "name\\11":Ljava/lang/String;
    .end local v35    # "tc\\11":Ljava/util/Map;
    .restart local v1    # "tc\\11":Ljava/util/Map;
    .local v2, "name\\11":Ljava/lang/String;
    :catchall_2
    move-exception v0

    move-object/from16 v35, v1

    move-object/from16 v29, v2

    .end local v1    # "tc\\11":Ljava/util/Map;
    .end local v2    # "name\\11":Ljava/lang/String;
    .restart local v29    # "name\\11":Ljava/lang/String;
    .restart local v35    # "tc\\11":Ljava/util/Map;
    :goto_d
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_e
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    move-object v0, v1

    :cond_1b
    check-cast v0, Ljava/util/List;

    .line 206
    .local v0, "items\\11":Ljava/util/List;
    move-object/from16 v1, v17

    check-cast v1, Ljava/util/Collection;

    new-instance v2, Lcom/pymcl/android/ui/state/AiItem$Plan;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v6

    .end local v6    # "results":Ljava/util/Map;
    .local v16, "results":Ljava/util/Map;
    const-string v6, "hp"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, "-"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/pymcl/android/ui/state/AiItem$Plan;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    goto/16 :goto_13

    .line 208
    .end local v0    # "items\\11":Ljava/util/List;
    .end local v16    # "results":Ljava/util/Map;
    .end local v29    # "name\\11":Ljava/lang/String;
    .end local v35    # "tc\\11":Ljava/util/Map;
    .restart local v1    # "tc\\11":Ljava/util/Map;
    .restart local v2    # "name\\11":Ljava/lang/String;
    .restart local v6    # "results":Ljava/util/Map;
    :cond_1c
    move-object/from16 v35, v1

    move-object/from16 v29, v2

    move-object/from16 v16, v6

    .end local v1    # "tc\\11":Ljava/util/Map;
    .end local v2    # "name\\11":Ljava/lang/String;
    .end local v6    # "results":Ljava/util/Map;
    .restart local v16    # "results":Ljava/util/Map;
    .restart local v29    # "name\\11":Ljava/lang/String;
    .restart local v35    # "tc\\11":Ljava/util/Map;
    const-string v0, "\u5df2\u8f6c\u4e3a\u540e\u53f0\u4efb\u52a1"

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v5, v0, v3, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    .line 209
    .local v0, "bgTask\\11":Z
    const-string v6, "\u64cd\u4f5c\u88ab\u62d2\u7edd"

    invoke-static {v5, v6, v3, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_20

    const-string v6, "\u7528\u6237\u62d2\u7edd"

    invoke-static {v5, v6, v3, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1d

    goto :goto_10

    :cond_1d
    const-string v6, "\u5931\u8d25"

    invoke-static {v5, v6, v3, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1f

    const-string v6, "\u9519\u8bef"

    invoke-static {v5, v6, v3, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1e

    goto :goto_f

    :cond_1e
    sget-object v1, Lcom/pymcl/android/ui/state/TaskState;->Done:Lcom/pymcl/android/ui/state/TaskState;

    goto :goto_11

    :cond_1f
    :goto_f
    sget-object v1, Lcom/pymcl/android/ui/state/TaskState;->Failed:Lcom/pymcl/android/ui/state/TaskState;

    goto :goto_11

    :cond_20
    :goto_10
    sget-object v1, Lcom/pymcl/android/ui/state/TaskState;->Cancelled:Lcom/pymcl/android/ui/state/TaskState;

    :goto_11
    move-object/from16 v32, v1

    .line 210
    .local v32, "st\\11":Lcom/pymcl/android/ui/state/TaskState;
    move-object/from16 v1, v17

    check-cast v1, Ljava/util/Collection;

    move-object v3, v4

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_21

    .line 229
    const/4 v3, 0x0

    .line 210
    .local v3, "$i$a$-ifBlank-AiHistory$toItems$1$2$1\\16\\210\\11":I
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ht"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .end local v3    # "$i$a$-ifBlank-AiHistory$toItems$1$2$1\\16\\210\\11":I
    :cond_21
    move-object/from16 v28, v3

    check-cast v28, Ljava/lang/String;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v31

    if-eqz v0, :cond_23

    sget-object v2, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v3, "\u5df2\u8f6c\u5230\u540e\u53f0\u6267\u884c"

    move/from16 v20, v0

    const/4 v6, 0x0

    .end local v0    # "bgTask\\11":Z
    .local v20, "bgTask\\11":Z
    new-array v0, v6, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v0}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :cond_22
    move-object/from16 v33, v0

    goto :goto_12

    .end local v20    # "bgTask\\11":Z
    .restart local v0    # "bgTask\\11":Z
    :cond_23
    move/from16 v20, v0

    const/4 v6, 0x0

    .end local v0    # "bgTask\\11":Z
    .restart local v20    # "bgTask\\11":Z
    move-object v0, v5

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->lineSequence(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->firstOrNull(Lkotlin/sequences/Sequence;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_24

    const/16 v2, 0x78

    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_22

    :cond_24
    move-object/from16 v33, v12

    :goto_12
    new-instance v27, Lcom/pymcl/android/ui/state/AiItem$Tool;

    move-object/from16 v30, v29

    invoke-direct/range {v27 .. v33}, Lcom/pymcl/android/ui/state/AiItem$Tool;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;)V

    move-object/from16 v0, v27

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 212
    .end local v20    # "bgTask\\11":Z
    .end local v32    # "st\\11":Lcom/pymcl/android/ui/state/TaskState;
    :goto_13
    nop

    .line 242
    .end local v4    # "id\\11":Ljava/lang/String;
    .end local v5    # "r\\11":Ljava/lang/String;
    .end local v23    # "$i$a$-forEach-AiHistory$toItems$1$2\\11\\242\\8":I
    .end local v29    # "name\\11":Ljava/lang/String;
    .end local v35    # "tc\\11":Ljava/util/Map;
    move-object/from16 v6, v16

    move-object/from16 v1, v22

    move-object/from16 v3, v24

    move/from16 v2, v25

    move-object/from16 v4, v26

    .end local v34    # "element\\10":Ljava/lang/Object;
    goto/16 :goto_b

    .line 247
    .end local v16    # "results":Ljava/util/Map;
    .end local v22    # "$this$forEach\\10":Ljava/lang/Iterable;
    .end local v25    # "$i$f$forEach\\10\\201":I
    .local v1, "$this$forEach\\10":Ljava/lang/Iterable;
    .local v2, "$i$f$forEach\\10\\201":I
    .restart local v6    # "results":Ljava/util/Map;
    :cond_25
    move-object/from16 v22, v1

    move/from16 v25, v2

    move-object/from16 v16, v6

    .end local v1    # "$this$forEach\\10":Ljava/lang/Iterable;
    .end local v2    # "$i$f$forEach\\10\\201":I
    .end local v6    # "results":Ljava/util/Map;
    .restart local v16    # "results":Ljava/util/Map;
    .restart local v22    # "$this$forEach\\10":Ljava/lang/Iterable;
    .restart local v25    # "$i$f$forEach\\10\\201":I
    goto :goto_14

    .line 198
    .end local v15    # "c\\8":Ljava/lang/String;
    .end local v16    # "results":Ljava/util/Map;
    .end local v18    # "$i$f$forEachIndexed\\7\\191":I
    .end local v21    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .end local v22    # "$this$forEach\\10":Ljava/lang/Iterable;
    .end local v25    # "$i$f$forEach\\10\\201":I
    .local v4, "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .local v5, "$i$f$forEachIndexed\\7\\191":I
    .restart local v6    # "results":Ljava/util/Map;
    :cond_26
    move-object/from16 v21, v4

    move/from16 v18, v5

    move-object/from16 v16, v6

    .line 215
    .end local v4    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .end local v5    # "$i$f$forEachIndexed\\7\\191":I
    .end local v6    # "results":Ljava/util/Map;
    .restart local v16    # "results":Ljava/util/Map;
    .restart local v18    # "$i$f$forEachIndexed\\7\\191":I
    .restart local v21    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    :goto_14
    nop

    .line 241
    .end local v11    # "m\\8":Ljava/util/Map;
    .end local v13    # "i\\8":I
    .end local v14    # "$i$a$-forEachIndexed-AiHistory$toItems$1\\8\\241\\0":I
    move-object/from16 v1, p1

    move v0, v10

    move-object/from16 v6, v16

    move-object/from16 v2, v17

    move/from16 v5, v18

    move-object/from16 v4, v21

    const/16 v3, 0xa

    .end local v8    # "item\\7":Ljava/lang/Object;
    goto/16 :goto_3

    .line 248
    .end local v10    # "index\\7":I
    .end local v16    # "results":Ljava/util/Map;
    .end local v17    # "out":Ljava/util/List;
    .end local v18    # "$i$f$forEachIndexed\\7\\191":I
    .end local v21    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .local v0, "index\\7":I
    .local v2, "out":Ljava/util/List;
    .restart local v4    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .restart local v5    # "$i$f$forEachIndexed\\7\\191":I
    .restart local v6    # "results":Ljava/util/Map;
    :cond_27
    move-object/from16 v17, v2

    .line 216
    .end local v0    # "index\\7":I
    .end local v2    # "out":Ljava/util/List;
    .end local v4    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .end local v5    # "$i$f$forEachIndexed\\7\\191":I
    .restart local v17    # "out":Ljava/util/List;
    return-object v17
.end method

.method public final withTasks(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 24
    .param p1, "items"    # Ljava/util/List;
    .param p2, "tasks"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "items"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "tasks"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    .line 184
    :cond_0
    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$associateBy\\1":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 220
    .local v3, "$i$f$associateBy\\1\\184":I
    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v5

    const/16 v6, 0x10

    invoke-static {v5, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v5

    .line 221
    .local v5, "capacity\\1":I
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v6, Ljava/util/Map;

    .local v6, "destination\\2":Ljava/util/Map;
    move-object v7, v2

    .local v7, "$this$associateByTo\\2":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 222
    .local v8, "$i$f$associateByTo\\2\\221":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 223
    .local v10, "element\\2":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/ai/BgTaskInfo;

    .local v11, "it\\3":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v12, 0x0

    .line 184
    .local v12, "$i$a$-associateBy-AiHistory$withTasks$byCall$1\\3\\223\\0":I
    invoke-virtual {v11}, Lcom/pymcl/ai/BgTaskInfo;->getCallId()Ljava/lang/String;

    move-result-object v11

    .line 223
    .end local v11    # "it\\3":Lcom/pymcl/ai/BgTaskInfo;
    .end local v12    # "$i$a$-associateBy-AiHistory$withTasks$byCall$1\\3\\223\\0":I
    invoke-interface {v6, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 225
    .end local v10    # "element\\2":Ljava/lang/Object;
    :cond_1
    nop

    .line 221
    .end local v6    # "destination\\2":Ljava/util/Map;
    .end local v7    # "$this$associateByTo\\2":Ljava/lang/Iterable;
    .end local v8    # "$i$f$associateByTo\\2\\221":I
    nop

    .line 184
    .end local v2    # "$this$associateBy\\1":Ljava/lang/Iterable;
    .end local v3    # "$i$f$associateBy\\1\\184":I
    .end local v5    # "capacity\\1":I
    nop

    .line 185
    .local v6, "byCall":Ljava/util/Map;
    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map\\4":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 226
    .local v3, "$i$f$map\\4\\185":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    move-object v4, v5

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination\\5":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo\\5":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 227
    .local v7, "$i$f$mapTo\\5\\226":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 228
    .local v9, "item\\5":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lcom/pymcl/android/ui/state/AiItem;

    .local v10, "it\\6":Lcom/pymcl/android/ui/state/AiItem;
    const/4 v11, 0x0

    .line 185
    .local v11, "$i$a$-map-AiHistory$withTasks$1\\6\\228\\0":I
    instance-of v12, v10, Lcom/pymcl/android/ui/state/AiItem$Tool;

    if-eqz v12, :cond_6

    move-object v12, v10

    check-cast v12, Lcom/pymcl/android/ui/state/AiItem$Tool;

    invoke-virtual {v12}, Lcom/pymcl/android/ui/state/AiItem$Tool;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v6, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/pymcl/ai/BgTaskInfo;

    if-eqz v12, :cond_4

    .line 229
    .local v12, "t\\7":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v13, 0x0

    .line 185
    .local v13, "$i$a$-let-AiHistory$withTasks$1$1\\7\\185\\6":I
    sget-object v14, Lcom/pymcl/android/data/AiItemReducer;->Companion:Lcom/pymcl/android/data/AiItemReducer$Companion;

    invoke-virtual {v14, v12}, Lcom/pymcl/android/data/AiItemReducer$Companion;->bgItem(Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/android/ui/state/AiItem$Tool;

    move-result-object v15

    move-object v14, v10

    check-cast v14, Lcom/pymcl/android/ui/state/AiItem$Tool;

    invoke-virtual {v14}, Lcom/pymcl/android/ui/state/AiItem$Tool;->getTitle()Ljava/lang/String;

    move-result-object v14

    .line 229
    move-object/from16 v16, v14

    .local v16, "x\\8":Ljava/lang/String;
    const/16 v17, 0x0

    .line 185
    .local v17, "$i$a$-takeIf-AiHistory$withTasks$1$1$1\\8\\185\\7":I
    move-object/from16 v18, v10

    check-cast v18, Lcom/pymcl/android/ui/state/AiItem$Tool;

    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/android/ui/state/AiItem$Tool;->getTool()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    .end local v16    # "x\\8":Ljava/lang/String;
    .local v1, "x\\8":Ljava/lang/String;
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .end local v1    # "x\\8":Ljava/lang/String;
    .end local v17    # "$i$a$-takeIf-AiHistory$withTasks$1$1$1\\8\\185\\7":I
    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v14, 0x0

    :goto_2
    if-nez v14, :cond_3

    invoke-virtual {v12}, Lcom/pymcl/ai/BgTaskInfo;->getTitle()Ljava/lang/String;

    move-result-object v14

    :cond_3
    move-object/from16 v18, v14

    const/16 v22, 0x3b

    const/16 v23, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v15 .. v23}, Lcom/pymcl/android/ui/state/AiItem$Tool;->copy$default(Lcom/pymcl/android/ui/state/AiItem$Tool;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/AiItem$Tool;

    move-result-object v0

    .end local v12    # "t\\7":Lcom/pymcl/ai/BgTaskInfo;
    .end local v13    # "$i$a$-let-AiHistory$withTasks$1$1\\7\\185\\6":I
    if-nez v0, :cond_5

    :cond_4
    move-object v0, v10

    check-cast v0, Lcom/pymcl/android/ui/state/AiItem$Tool;

    :cond_5
    check-cast v0, Lcom/pymcl/android/ui/state/AiItem;

    move-object v10, v0

    .line 228
    .end local v10    # "it\\6":Lcom/pymcl/android/ui/state/AiItem;
    .end local v11    # "$i$a$-map-AiHistory$withTasks$1\\6\\228\\0":I
    :cond_6
    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    goto :goto_1

    .line 230
    .end local v9    # "item\\5":Ljava/lang/Object;
    :cond_7
    nop

    .end local v4    # "destination\\5":Ljava/util/Collection;
    .end local v5    # "$this$mapTo\\5":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo\\5\\226":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 226
    nop

    .line 185
    .end local v2    # "$this$map\\4":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\4\\185":I
    return-object v0
.end method
