.class public final Lcom/pymcl/android/data/ServerLogic;
.super Ljava/lang/Object;
.source "MiscLogic.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/ServerLogic$ImportResult;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMiscLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiscLogic.kt\ncom/pymcl/android/data/ServerLogic\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,227:1\n1107#2,2:228\n1123#2,3:230\n1#3:233\n1960#4,3:234\n363#4,7:237\n1739#4:244\n1814#4,3:245\n1739#4:248\n1814#4,3:249\n2077#4,3:252\n777#4:255\n873#4,2:256\n1960#4,3:258\n*S KotlinDebug\n*F\n+ 1 MiscLogic.kt\ncom/pymcl/android/data/ServerLogic\n*L\n71#1:228,2\n77#1:230,3\n87#1:234,3\n93#1:237,7\n104#1:244\n104#1:245,3\n105#1:248\n105#1:249,3\n107#1:252,3\n122#1:255\n122#1:256,2\n122#1:258,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0006\u0010\u0008\u001a\u00020\u0007J\u001e\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000cJ4\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000eJ\u0014\u0010\u0017\u001a\u00020\u00072\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000eJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007\u00ca\u0001\u000c\u0008$\u0012\u0008\u0008%\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006#"
    }
    d2 = {
        "Lcom/pymcl/android/data/ServerLogic;",
        "",
        "<init>",
        "()V",
        "parse",
        "Lkotlin/Pair;",
        "Lcom/pymcl/core/instance/ServerEntry;",
        "",
        "input",
        "nameProblem",
        "name",
        "others",
        "",
        "replaceVisible",
        "",
        "all",
        "oldName",
        "oldAddress",
        "newEntry",
        "importText",
        "Lcom/pymcl/android/data/ServerLogic$ImportResult;",
        "text",
        "existing",
        "exportText",
        "readLimited",
        "",
        "s",
        "Ljava/io/InputStream;",
        "limit",
        "",
        "needsSwitch",
        "",
        "pageInstance",
        "selectedInstance",
        "ImportResult",
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

.field public static final INSTANCE:Lcom/pymcl/android/data/ServerLogic;


# direct methods
.method public static synthetic $r8$lambda$4yBoTLgC3_T7qYzdmwKjpoo5bG4(Lcom/pymcl/core/instance/ServerEntry;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/ServerLogic;->exportText$lambda$2(Lcom/pymcl/core/instance/ServerEntry;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/ServerLogic;

    invoke-direct {v0}, Lcom/pymcl/android/data/ServerLogic;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/ServerLogic;->INSTANCE:Lcom/pymcl/android/data/ServerLogic;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final exportText$lambda$2(Lcom/pymcl/core/instance/ServerEntry;)Ljava/lang/CharSequence;
    .locals 7
    .param p0, "it"    # Lcom/pymcl/core/instance/ServerEntry;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    invoke-virtual {p0}, Lcom/pymcl/core/instance/ServerEntry;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x7c

    const/16 v3, 0x2f

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/pymcl/core/instance/ServerEntry;->getAddress()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "|"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method


# virtual methods
.method public final exportText(Ljava/util/List;)Ljava/lang/String;
    .locals 12
    .param p1, "all"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "all"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 255
    .local v1, "$i$f$filter\\1\\122":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination\\2":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo\\2":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 256
    .local v4, "$i$f$filterTo\\2\\255":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element\\2":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/core/instance/ServerEntry;

    .local v7, "it\\3":Lcom/pymcl/core/instance/ServerEntry;
    const/4 v8, 0x0

    .line 122
    .local v8, "$i$a$-filter-ServerLogic$exportText$1\\3\\256\\0":I
    invoke-virtual {v7}, Lcom/pymcl/core/instance/ServerEntry;->getHidden()Z

    move-result v9

    .line 256
    .end local v7    # "it\\3":Lcom/pymcl/core/instance/ServerEntry;
    .end local v8    # "$i$a$-filter-ServerLogic$exportText$1\\3\\256\\0":I
    if-nez v9, :cond_0

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 257
    .end local v6    # "element\\2":Ljava/lang/Object;
    :cond_1
    nop

    .end local v2    # "destination\\2":Ljava/util/Collection;
    .end local v3    # "$this$filterTo\\2":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filterTo\\2\\255":I
    check-cast v2, Ljava/util/List;

    .line 255
    nop

    .end local v0    # "$this$filter\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filter\\1\\122":I
    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    .line 122
    const-string v0, "\n"

    move-object v4, v0

    check-cast v4, Ljava/lang/CharSequence;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$any\\4":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 258
    .local v2, "$i$f$any\\4\\122":I
    instance-of v5, v1, Ljava/util/Collection;

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    .line 259
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\4":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/core/instance/ServerEntry;

    .local v8, "it\\5":Lcom/pymcl/core/instance/ServerEntry;
    const/4 v9, 0x0

    .line 122
    .local v9, "$i$a$-any-ServerLogic$exportText$2\\5\\259\\0":I
    invoke-virtual {v8}, Lcom/pymcl/core/instance/ServerEntry;->getHidden()Z

    move-result v10

    .line 259
    .end local v8    # "it\\5":Lcom/pymcl/core/instance/ServerEntry;
    .end local v9    # "$i$a$-any-ServerLogic$exportText$2\\5\\259\\0":I
    if-nez v10, :cond_3

    const/4 v6, 0x1

    goto :goto_1

    .line 260
    .end local v7    # "element\\4":Ljava/lang/Object;
    :cond_4
    nop

    .line 122
    .end local v1    # "$this$any\\4":Ljava/lang/Iterable;
    .end local v2    # "$i$f$any\\4\\122":I
    :goto_1
    if-eqz v6, :cond_5

    goto :goto_2

    :cond_5
    const-string v0, ""

    :goto_2
    move-object v6, v0

    check-cast v6, Ljava/lang/CharSequence;

    new-instance v9, Lcom/pymcl/android/data/ServerLogic$$ExternalSyntheticLambda0;

    invoke-direct {v9}, Lcom/pymcl/android/data/ServerLogic$$ExternalSyntheticLambda0;-><init>()V

    const/16 v10, 0x1a

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final importText(Ljava/lang/String;Ljava/util/List;)Lcom/pymcl/android/data/ServerLogic$ImportResult;
    .locals 30
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "existing"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;)",
            "Lcom/pymcl/android/data/ServerLogic$ImportResult;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "text"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "existing"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 244
    .local v3, "$i$f$map\\1\\104":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination\\2":Ljava/util/Collection;
    move-object v6, v2

    .local v6, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 245
    .local v7, "$i$f$mapTo\\2\\244":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v10, "toLowerCase(...)"

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 246
    .local v9, "item\\2":Ljava/lang/Object;
    move-object v11, v9

    check-cast v11, Lcom/pymcl/core/instance/ServerEntry;

    .local v11, "it\\3":Lcom/pymcl/core/instance/ServerEntry;
    const/4 v12, 0x0

    .line 104
    .local v12, "$i$a$-map-ServerLogic$importText$seen$1\\3\\246\\0":I
    invoke-virtual {v11}, Lcom/pymcl/core/instance/ServerEntry;->getAddress()Ljava/lang/String;

    move-result-object v13

    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v13, v14}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .end local v11    # "it\\3":Lcom/pymcl/core/instance/ServerEntry;
    .end local v12    # "$i$a$-map-ServerLogic$importText$seen$1\\3\\246\\0":I
    invoke-interface {v4, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 247
    .end local v9    # "item\\2":Ljava/lang/Object;
    :cond_0
    nop

    .end local v4    # "destination\\2":Ljava/util/Collection;
    .end local v6    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo\\2\\244":I
    check-cast v4, Ljava/util/List;

    .line 244
    nop

    .end local v2    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\1\\104":I
    check-cast v4, Ljava/lang/Iterable;

    .line 104
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    .line 105
    .local v2, "seen":Ljava/util/Set;
    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$map\\4":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 248
    .local v4, "$i$f$map\\4\\105":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    move-object v5, v6

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\5":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$mapTo\\5":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 249
    .local v7, "$i$f$mapTo\\5\\248":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 250
    .local v9, "item\\5":Ljava/lang/Object;
    move-object v11, v9

    check-cast v11, Lcom/pymcl/core/instance/ServerEntry;

    .local v11, "it\\6":Lcom/pymcl/core/instance/ServerEntry;
    const/4 v12, 0x0

    .line 105
    .local v12, "$i$a$-map-ServerLogic$importText$names$1\\6\\250\\0":I
    invoke-virtual {v11}, Lcom/pymcl/core/instance/ServerEntry;->getName()Ljava/lang/String;

    move-result-object v11

    .line 250
    .end local v11    # "it\\6":Lcom/pymcl/core/instance/ServerEntry;
    .end local v12    # "$i$a$-map-ServerLogic$importText$names$1\\6\\250\\0":I
    invoke-interface {v5, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 251
    .end local v9    # "item\\5":Ljava/lang/Object;
    :cond_1
    nop

    .end local v5    # "destination\\5":Ljava/util/Collection;
    .end local v6    # "$this$mapTo\\5":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo\\5\\248":I
    check-cast v5, Ljava/util/List;

    .line 248
    nop

    .end local v3    # "$this$map\\4":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map\\4\\105":I
    check-cast v5, Ljava/lang/Iterable;

    .line 105
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toMutableSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    .line 106
    .local v3, "names":Ljava/util/Set;
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    .local v4, "added":Ljava/util/List;
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/List;

    .local v5, "bad":Ljava/util/List;
    const/4 v6, 0x0

    .line 107
    .local v6, "dup":I
    const-string v7, "\ufeff"

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v0, v7}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->lines(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 252
    .local v8, "$i$f$forEachIndexed\\7\\107":I
    const/4 v9, 0x0

    .line 253
    .local v9, "index\\7":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "item\\7":Ljava/lang/Object;
    add-int/lit8 v13, v9, 0x1

    .end local v9    # "index\\7":I
    .local v13, "index\\7":I
    if-gez v9, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_2
    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    .local v9, "i\\8":I
    .local v14, "raw\\8":Ljava/lang/String;
    const/4 v15, 0x0

    .line 108
    .local v15, "$i$a$-forEachIndexed-ServerLogic$importText$1\\8\\253\\0":I
    move-object/from16 v16, v14

    check-cast v16, Ljava/lang/CharSequence;

    invoke-static/range {v16 .. v16}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 109
    .local v0, "line\\8":Ljava/lang/String;
    move-object/from16 v16, v0

    check-cast v16, Ljava/lang/CharSequence;

    invoke-interface/range {v16 .. v16}, Ljava/lang/CharSequence;->length()I

    move-result v16

    if-nez v16, :cond_3

    const/16 v16, 0x1

    goto :goto_3

    :cond_3
    const/16 v16, 0x0

    :goto_3
    if-nez v16, :cond_9

    const/4 v1, 0x2

    move-object/from16 v17, v7

    .end local v7    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .local v17, "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    const/4 v7, 0x0

    move/from16 v18, v8

    .end local v8    # "$i$f$forEachIndexed\\7\\107":I
    .local v18, "$i$f$forEachIndexed\\7\\107":I
    const-string v8, "#"

    move/from16 v19, v9

    const/4 v9, 0x0

    .end local v9    # "i\\8":I
    .local v19, "i\\8":I
    invoke-static {v0, v8, v9, v1, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_6

    .line 110
    :cond_4
    sget-object v1, Lcom/pymcl/android/data/ServerLogic;->INSTANCE:Lcom/pymcl/android/data/ServerLogic;

    invoke-virtual {v1, v0}, Lcom/pymcl/android/data/ServerLogic;->parse(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v20, v7

    check-cast v20, Lcom/pymcl/core/instance/ServerEntry;

    .local v20, "e\\8":Lcom/pymcl/core/instance/ServerEntry;
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 111
    .local v1, "err\\8":Ljava/lang/String;
    if-eqz v20, :cond_8

    if-eqz v1, :cond_5

    move-object/from16 v29, v0

    goto/16 :goto_5

    .line 112
    :cond_5
    invoke-virtual/range {v20 .. v20}, Lcom/pymcl/core/instance/ServerEntry;->getAddress()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_6

    .line 113
    :cond_6
    invoke-virtual/range {v20 .. v20}, Lcom/pymcl/core/instance/ServerEntry;->getName()Ljava/lang/String;

    move-result-object v7

    .local v7, "n\\8":Ljava/lang/String;
    const/4 v8, 0x2

    .line 114
    .local v8, "k\\8":I
    :goto_4
    invoke-interface {v3, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual/range {v20 .. v20}, Lcom/pymcl/core/instance/ServerEntry;->getName()Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v16, v8, 0x1

    move-object/from16 v29, v0

    .end local v0    # "line\\8":Ljava/lang/String;
    .end local v8    # "k\\8":I
    .local v16, "k\\8":I
    .local v29, "line\\8":Ljava/lang/String;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, " ("

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v8, ")"

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move/from16 v8, v16

    move-object/from16 v0, v29

    goto :goto_4

    .line 115
    .end local v16    # "k\\8":I
    .end local v29    # "line\\8":Ljava/lang/String;
    .restart local v0    # "line\\8":Ljava/lang/String;
    .restart local v8    # "k\\8":I
    :cond_7
    move-object/from16 v29, v0

    .end local v0    # "line\\8":Ljava/lang/String;
    .restart local v29    # "line\\8":Ljava/lang/String;
    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v0, v4

    check-cast v0, Ljava/util/Collection;

    const/16 v27, 0x3e

    const/16 v28, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v21, v7

    .end local v7    # "n\\8":Ljava/lang/String;
    .local v21, "n\\8":Ljava/lang/String;
    invoke-static/range {v20 .. v28}, Lcom/pymcl/core/instance/ServerEntry;->copy$default(Lcom/pymcl/core/instance/ServerEntry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/core/instance/ServerEntry;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 116
    goto :goto_6

    .line 111
    .end local v8    # "k\\8":I
    .end local v21    # "n\\8":Ljava/lang/String;
    .end local v29    # "line\\8":Ljava/lang/String;
    .restart local v0    # "line\\8":Ljava/lang/String;
    :cond_8
    move-object/from16 v29, v0

    .end local v0    # "line\\8":Ljava/lang/String;
    .restart local v29    # "line\\8":Ljava/lang/String;
    :goto_5
    move-object v0, v5

    check-cast v0, Ljava/util/Collection;

    add-int/lit8 v9, v19, 0x1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 109
    .end local v1    # "err\\8":Ljava/lang/String;
    .end local v17    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .end local v18    # "$i$f$forEachIndexed\\7\\107":I
    .end local v19    # "i\\8":I
    .end local v20    # "e\\8":Lcom/pymcl/core/instance/ServerEntry;
    .end local v29    # "line\\8":Ljava/lang/String;
    .restart local v0    # "line\\8":Ljava/lang/String;
    .local v7, "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .local v8, "$i$f$forEachIndexed\\7\\107":I
    .restart local v9    # "i\\8":I
    :cond_9
    move-object/from16 v29, v0

    move-object/from16 v17, v7

    move/from16 v18, v8

    move/from16 v19, v9

    .line 253
    .end local v0    # "line\\8":Ljava/lang/String;
    .end local v7    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .end local v8    # "$i$f$forEachIndexed\\7\\107":I
    .end local v9    # "i\\8":I
    .end local v14    # "raw\\8":Ljava/lang/String;
    .end local v15    # "$i$a$-forEachIndexed-ServerLogic$importText$1\\8\\253\\0":I
    .restart local v17    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .restart local v18    # "$i$f$forEachIndexed\\7\\107":I
    :goto_6
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move v9, v13

    move-object/from16 v7, v17

    move/from16 v8, v18

    .end local v12    # "item\\7":Ljava/lang/Object;
    goto/16 :goto_2

    .line 254
    .end local v13    # "index\\7":I
    .end local v17    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .end local v18    # "$i$f$forEachIndexed\\7\\107":I
    .restart local v7    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .restart local v8    # "$i$f$forEachIndexed\\7\\107":I
    .local v9, "index\\7":I
    :cond_a
    nop

    .line 117
    .end local v7    # "$this$forEachIndexed\\7":Ljava/lang/Iterable;
    .end local v8    # "$i$f$forEachIndexed\\7\\107":I
    .end local v9    # "index\\7":I
    new-instance v0, Lcom/pymcl/android/data/ServerLogic$ImportResult;

    invoke-direct {v0, v4, v5, v6}, Lcom/pymcl/android/data/ServerLogic$ImportResult;-><init>(Ljava/util/List;Ljava/util/List;I)V

    return-object v0
.end method

.method public final nameProblem(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    .locals 8
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "others"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "others"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    nop

    .line 86
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a"

    goto :goto_1

    .line 87
    :cond_0
    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 234
    .local v1, "$i$f$any\\1\\87":I
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    goto :goto_0

    .line 235
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element\\1":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    .local v5, "it\\2":Ljava/lang/String;
    const/4 v6, 0x0

    .line 87
    .local v6, "$i$a$-any-ServerLogic$nameProblem$1\\2\\235\\0":I
    move-object v7, p1

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    .line 235
    .end local v5    # "it\\2":Ljava/lang/String;
    .end local v6    # "$i$a$-any-ServerLogic$nameProblem$1\\2\\235\\0":I
    if-eqz v5, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    .line 236
    .end local v4    # "element\\1":Ljava/lang/Object;
    :cond_3
    nop

    .line 87
    .end local v0    # "$this$any\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any\\1\\87":I
    :goto_0
    if-eqz v3, :cond_4

    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5df2\u6709\u540c\u540d\u670d\u52a1\u5668\u300c"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u300d"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 88
    :cond_4
    const/4 v0, 0x0

    .line 89
    :goto_1
    return-object v0
.end method

.method public final needsSwitch(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3
    .param p1, "pageInstance"    # Ljava/lang/String;
    .param p2, "selectedInstance"    # Ljava/lang/String;

    const-string v0, "pageInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedInstance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    return v1
.end method

.method public final parse(Ljava/lang/String;)Lkotlin/Pair;
    .locals 29
    .param p1, "input"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "input"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 69
    .local v1, "t":Ljava/lang/String;
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const/16 v3, 0x7c

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v2, v3, v4, v5, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v2

    const-string v7, ""

    if-eqz v2, :cond_0

    invoke-static {v1, v3, v6, v5, v6}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v6, v5, v6}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {v7, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    :goto_0
    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .local v3, "name0":Ljava/lang/String;
    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 70
    .local v2, "addr0":Ljava/lang/String;
    move-object v8, v2

    check-cast v8, Ljava/lang/CharSequence;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v8

    const/4 v9, 0x1

    if-nez v8, :cond_1

    move v8, v9

    goto :goto_1

    :cond_1
    move v8, v4

    :goto_1
    if-eqz v8, :cond_2

    const-string v4, "\u8bf7\u586b\u5199\u670d\u52a1\u5668\u5730\u5740\uff0c\u4f8b\u5982 mc.example.com \u6216 1.2.3.4:25565"

    invoke-static {v6, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    return-object v4

    .line 71
    :cond_2
    move-object v8, v2

    check-cast v8, Ljava/lang/CharSequence;

    .local v8, "$this$any\\1":Ljava/lang/CharSequence;
    const/4 v10, 0x0

    .line 228
    .local v10, "$i$f$any\\1\\71":I
    move v11, v4

    :goto_2
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-ge v11, v12, :cond_4

    invoke-interface {v8, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    .local v12, "element\\1":C
    move v13, v12

    .local v13, "it\\2":C
    const/4 v14, 0x0

    .line 71
    .local v14, "$i$a$-any-ServerLogic$parse$1\\2\\228\\0":I
    invoke-static {v13}, Lkotlin/text/CharsKt;->isWhitespace(C)Z

    move-result v13

    .line 228
    .end local v13    # "it\\2":C
    .end local v14    # "$i$a$-any-ServerLogic$parse$1\\2\\228\\0":I
    if-eqz v13, :cond_3

    move v8, v9

    goto :goto_3

    .end local v12    # "element\\1":C
    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 229
    :cond_4
    move v8, v4

    .line 71
    .end local v8    # "$this$any\\1":Ljava/lang/CharSequence;
    .end local v10    # "$i$f$any\\1\\71":I
    :goto_3
    if-eqz v8, :cond_5

    const-string v4, "\u5730\u5740\u91cc\u4e0d\u80fd\u6709\u7a7a\u683c"

    invoke-static {v6, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    return-object v4

    .line 73
    :cond_5
    const/4 v8, 0x0

    .local v8, "host":Ljava/lang/String;
    const/4 v10, 0x0

    .line 74
    .local v10, "port":Ljava/lang/String;
    const-string v11, "["

    invoke-static {v2, v11, v4, v5, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v11

    const-string v12, ":"

    if-eqz v11, :cond_7

    .line 75
    move-object v13, v2

    check-cast v13, Ljava/lang/CharSequence;

    const/16 v17, 0x6

    const/16 v18, 0x0

    const/16 v14, 0x5d

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v5

    .local v5, "end":I
    if-gez v5, :cond_6

    const-string v4, "IPv6 \u5730\u5740\u7f3a\u5c11 ]"

    invoke-static {v6, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    return-object v4

    .line 76
    :cond_6
    add-int/lit8 v11, v5, 0x1

    invoke-virtual {v2, v4, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    const-string v13, "substring(...)"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .end local v8    # "host":Ljava/lang/String;
    .local v11, "host":Ljava/lang/String;
    add-int/lit8 v8, v5, 0x1

    invoke-virtual {v2, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v12

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v8, v13}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .end local v10    # "port":Ljava/lang/String;
    .local v5, "port":Ljava/lang/String;
    goto :goto_6

    .line 77
    .end local v5    # "port":Ljava/lang/String;
    .end local v11    # "host":Ljava/lang/String;
    .restart local v8    # "host":Ljava/lang/String;
    .restart local v10    # "port":Ljava/lang/String;
    :cond_7
    move-object v11, v2

    check-cast v11, Ljava/lang/CharSequence;

    .local v11, "$this$count\\3":Ljava/lang/CharSequence;
    const/4 v13, 0x0

    .line 230
    .local v13, "$i$f$count\\3\\77":I
    const/4 v14, 0x0

    .line 231
    .local v14, "count\\3":I
    move v15, v4

    :goto_4
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/16 v5, 0x3a

    if-ge v15, v4, :cond_a

    invoke-interface {v11, v15}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .local v4, "element\\3":C
    move/from16 v18, v4

    .local v18, "it\\4":C
    const/16 v19, 0x0

    .line 77
    .local v19, "$i$a$-count-ServerLogic$parse$2\\4\\231\\0":I
    move/from16 v6, v18

    .end local v18    # "it\\4":C
    .local v6, "it\\4":C
    if-ne v6, v5, :cond_8

    move v5, v9

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    .line 231
    .end local v6    # "it\\4":C
    .end local v19    # "$i$a$-count-ServerLogic$parse$2\\4\\231\\0":I
    :goto_5
    if-eqz v5, :cond_9

    add-int/lit8 v14, v14, 0x1

    .end local v4    # "element\\3":C
    :cond_9
    add-int/lit8 v15, v15, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    goto :goto_4

    .line 232
    :cond_a
    nop

    .line 77
    .end local v11    # "$this$count\\3":Ljava/lang/CharSequence;
    .end local v13    # "$i$f$count\\3\\77":I
    .end local v14    # "count\\3":I
    if-ne v14, v9, :cond_b

    const/4 v4, 0x2

    const/4 v6, 0x0

    invoke-static {v2, v5, v6, v4, v6}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .end local v8    # "host":Ljava/lang/String;
    .local v11, "host":Ljava/lang/String;
    invoke-static {v2, v5, v6, v4, v6}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .end local v10    # "port":Ljava/lang/String;
    .restart local v5    # "port":Ljava/lang/String;
    goto :goto_6

    .line 78
    .end local v5    # "port":Ljava/lang/String;
    .end local v11    # "host":Ljava/lang/String;
    .restart local v8    # "host":Ljava/lang/String;
    .restart local v10    # "port":Ljava/lang/String;
    :cond_b
    move-object v11, v2

    .end local v8    # "host":Ljava/lang/String;
    .restart local v11    # "host":Ljava/lang/String;
    const-string v5, ""

    .line 79
    .end local v10    # "port":Ljava/lang/String;
    .restart local v5    # "port":Ljava/lang/String;
    :goto_6
    move-object v4, v11

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_c

    move v4, v9

    goto :goto_7

    :cond_c
    const/4 v4, 0x0

    :goto_7
    if-nez v4, :cond_17

    const-string v4, "[]"

    invoke-static {v11, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    move-object/from16 v22, v11

    const/4 v6, 0x0

    goto/16 :goto_f

    .line 80
    :cond_d
    move-object v4, v5

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_e

    move v4, v9

    goto :goto_8

    :cond_e
    const/4 v4, 0x0

    :goto_8
    if-eqz v4, :cond_11

    invoke-static {v5}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_10

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 233
    .local v4, "it\\5":I
    const/4 v6, 0x0

    .line 80
    .local v6, "$i$a$-let-ServerLogic$parse$3\\5\\80\\0":I
    if-gt v9, v4, :cond_f

    const/high16 v8, 0x10000

    if-ge v4, v8, :cond_f

    move v4, v9

    goto :goto_9

    :cond_f
    const/4 v4, 0x0

    .end local v4    # "it\\5":I
    .end local v6    # "$i$a$-let-ServerLogic$parse$3\\5\\80\\0":I
    :goto_9
    if-ne v4, v9, :cond_10

    move v4, v9

    goto :goto_a

    :cond_10
    const/4 v4, 0x0

    :goto_a
    if-nez v4, :cond_11

    const-string v4, "\u7aef\u53e3\u5e94\u4e3a 1\u201365535"

    const/4 v6, 0x0

    invoke-static {v6, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    return-object v4

    .line 81
    :cond_11
    const-string v4, "25565"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    move-object/from16 v23, v7

    goto :goto_b

    :cond_12
    move-object/from16 v23, v5

    :goto_b
    move-object/from16 v4, v23

    .line 82
    .local v4, "p":Ljava/lang/String;
    move-object v6, v3

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_13

    move v7, v9

    goto :goto_c

    :cond_13
    const/4 v7, 0x0

    :goto_c
    if-eqz v7, :cond_16

    .line 233
    const/4 v6, 0x0

    .line 82
    .local v6, "$i$a$-ifEmpty-ServerLogic$parse$4\\6\\82\\0":I
    move-object v7, v4

    check-cast v7, Ljava/lang/CharSequence;

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_14

    move/from16 v16, v9

    goto :goto_d

    :cond_14
    const/16 v16, 0x0

    :goto_d
    if-eqz v16, :cond_15

    move-object v6, v11

    goto :goto_e

    :cond_15
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move-object v6, v7

    .end local v6    # "$i$a$-ifEmpty-ServerLogic$parse$4\\6\\82\\0":I
    :cond_16
    :goto_e
    move-object/from16 v21, v6

    check-cast v21, Ljava/lang/String;

    new-instance v20, Lcom/pymcl/core/instance/ServerEntry;

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x38

    const/16 v28, 0x0

    move-object/from16 v23, v4

    move-object/from16 v22, v11

    .end local v4    # "p":Ljava/lang/String;
    .end local v11    # "host":Ljava/lang/String;
    .local v22, "host":Ljava/lang/String;
    .local v23, "p":Ljava/lang/String;
    invoke-direct/range {v20 .. v28}, Lcom/pymcl/core/instance/ServerEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v20

    const/4 v6, 0x0

    invoke-static {v4, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    return-object v4

    .line 79
    .end local v22    # "host":Ljava/lang/String;
    .end local v23    # "p":Ljava/lang/String;
    .restart local v11    # "host":Ljava/lang/String;
    :cond_17
    move-object/from16 v22, v11

    const/4 v6, 0x0

    .end local v11    # "host":Ljava/lang/String;
    .restart local v22    # "host":Ljava/lang/String;
    :goto_f
    const-string v4, "\u8bf7\u586b\u5199\u670d\u52a1\u5668\u5730\u5740"

    invoke-static {v6, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    return-object v4
.end method

.method public final readLimited(Ljava/io/InputStream;I)[B
    .locals 4
    .param p1, "s"    # Ljava/io/InputStream;
    .param p2, "limit"    # I

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .local v0, "out":Ljava/io/ByteArrayOutputStream;
    const/16 v1, 0x2000

    new-array v1, v1, [B

    .line 127
    .local v1, "buf":[B
    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v2

    if-ge v2, p2, :cond_0

    array-length v2, v1

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v3

    sub-int v3, p2, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    .local v2, "n":I
    if-lez v2, :cond_0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .end local v2    # "n":I
    goto :goto_0

    .line 128
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    const-string v3, "toByteArray(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2
.end method

.method public final replaceVisible(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/instance/ServerEntry;)Ljava/util/List;
    .locals 8
    .param p1, "all"    # Ljava/util/List;
    .param p2, "oldName"    # Ljava/lang/String;
    .param p3, "oldAddress"    # Ljava/lang/String;
    .param p4, "newEntry"    # Lcom/pymcl/core/instance/ServerEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;"
        }
    .end annotation

    const-string v0, "all"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldAddress"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    move-object v0, p1

    .local v0, "$this$indexOfFirst\\1":Ljava/util/List;
    const/4 v1, 0x0

    .line 237
    .local v1, "$i$f$indexOfFirst\\1\\93":I
    const/4 v2, 0x0

    .line 238
    .local v2, "index\\1":I
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 239
    .local v4, "item\\1":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Lcom/pymcl/core/instance/ServerEntry;

    .local v5, "it\\2":Lcom/pymcl/core/instance/ServerEntry;
    const/4 v6, 0x0

    .line 93
    .local v6, "$i$a$-indexOfFirst-ServerLogic$replaceVisible$i$1\\2\\239\\0":I
    invoke-virtual {v5}, Lcom/pymcl/core/instance/ServerEntry;->getHidden()Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v5}, Lcom/pymcl/core/instance/ServerEntry;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v5}, Lcom/pymcl/core/instance/ServerEntry;->getAddress()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x1

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    .line 239
    .end local v5    # "it\\2":Lcom/pymcl/core/instance/ServerEntry;
    .end local v6    # "$i$a$-indexOfFirst-ServerLogic$replaceVisible$i$1\\2\\239\\0":I
    :goto_1
    if-eqz v7, :cond_1

    .line 240
    goto :goto_2

    .line 241
    :cond_1
    nop

    .end local v4    # "item\\1":Ljava/lang/Object;
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 243
    :cond_2
    const/4 v3, -0x1

    move v2, v3

    .line 93
    .end local v0    # "$this$indexOfFirst\\1":Ljava/util/List;
    .end local v1    # "$i$f$indexOfFirst\\1\\93":I
    .end local v2    # "index\\1":I
    :goto_2
    nop

    .line 94
    .local v2, "i":I
    if-gez v2, :cond_3

    return-object p1

    .line 95
    :cond_3
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    .line 233
    .local v1, "it\\3":Ljava/util/List;
    const/4 v3, 0x0

    .line 95
    .local v3, "$i$a$-also-ServerLogic$replaceVisible$1\\3\\95\\0":I
    if-nez p4, :cond_4

    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    invoke-interface {v1, v2, p4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .end local v1    # "it\\3":Ljava/util/List;
    .end local v3    # "$i$a$-also-ServerLogic$replaceVisible$1\\3\\95\\0":I
    :goto_3
    return-object v0
.end method
