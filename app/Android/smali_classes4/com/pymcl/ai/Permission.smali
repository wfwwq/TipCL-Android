.class public final Lcom/pymcl/ai/Permission;
.super Ljava/lang/Object;
.source "Permission.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPermission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Permission.kt\ncom/pymcl/ai/Permission\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n1#2:144\n1960#3,3:145\n777#3:148\n873#3,2:149\n1960#3,3:151\n1960#3,3:154\n1960#3,3:157\n*S KotlinDebug\n*F\n+ 1 Permission.kt\ncom/pymcl/ai/Permission\n*L\n70#1:145,3\n75#1:148\n75#1:149,2\n76#1:151,3\n78#1:154,3\n79#1:157,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006J4\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cJB\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\u0006\u0010\u0013\u001a\u00020\u00062\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0005J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0008\u00a8\u0006#"
    }
    d2 = {
        "Lcom/pymcl/ai/Permission;",
        "",
        "<init>",
        "()V",
        "UI_MODES",
        "",
        "",
        "getUI_MODES",
        "()Ljava/util/List;",
        "UI_LABELS",
        "getUI_LABELS",
        "ARG_KEYS",
        "getARG_KEYS",
        "migrateMode",
        "m",
        "confirmWrites",
        "",
        "uiIndex",
        "",
        "mode",
        "norm",
        "s",
        "matches",
        "rule",
        "Lcom/pymcl/ai/PermissionRule;",
        "tool",
        "args",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "decide",
        "Lcom/pymcl/ai/Verdict;",
        "meta",
        "Lcom/pymcl/ai/ToolMeta;",
        "rules",
        "note",
        "PyMCL-Android:ai"
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
.field private static final ARG_KEYS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/pymcl/ai/Permission;

.field private static final UI_LABELS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final UI_MODES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/pymcl/ai/Permission;

    invoke-direct {v0}, Lcom/pymcl/ai/Permission;-><init>()V

    sput-object v0, Lcom/pymcl/ai/Permission;->INSTANCE:Lcom/pymcl/ai/Permission;

    .line 50
    const/4 v0, 0x5

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "acceptEdits"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "plan"

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const-string v2, "yolo"

    const/4 v6, 0x3

    aput-object v2, v1, v6

    const-string v2, "custom"

    const/4 v7, 0x4

    aput-object v2, v1, v7

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/pymcl/ai/Permission;->UI_MODES:Ljava/util/List;

    .line 51
    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "\u6bcf\u6b21\u786e\u8ba4"

    aput-object v2, v1, v3

    const-string v2, "\u5199\u76f4\u63a5\u6267\u884c"

    aput-object v2, v1, v4

    const-string v2, "\u53ea\u770b\u4e0d\u52a8"

    aput-object v2, v1, v5

    const-string v2, "\u5168\u81ea\u52a8"

    aput-object v2, v1, v6

    const-string v2, "\u81ea\u5b9a\u4e49"

    aput-object v2, v1, v7

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/pymcl/ai/Permission;->UI_LABELS:Ljava/util/List;

    .line 52
    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "command"

    aput-object v2, v1, v3

    const-string v2, "url"

    aput-object v2, v1, v4

    const-string v2, "file_path"

    aput-object v2, v1, v5

    const-string v2, "path"

    aput-object v2, v1, v6

    const-string v2, "pattern"

    aput-object v2, v1, v7

    const-string v2, "filename"

    aput-object v2, v1, v0

    const/4 v0, 0x6

    const-string v2, "slug"

    aput-object v2, v1, v0

    const/4 v0, 0x7

    const-string v2, "name"

    aput-object v2, v1, v0

    const/16 v0, 0x8

    const-string v2, "version"

    aput-object v2, v1, v0

    const/16 v0, 0x9

    const-string v2, "major"

    aput-object v2, v1, v0

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/ai/Permission;->ARG_KEYS:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic migrateMode$default(Lcom/pymcl/ai/Permission;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 54
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/Permission;->migrateMode(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final decide(Lcom/pymcl/ai/ToolMeta;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)Lcom/pymcl/ai/Verdict;
    .locals 11
    .param p1, "meta"    # Lcom/pymcl/ai/ToolMeta;
    .param p2, "args"    # Ljava/util/Map;
    .param p3, "mode"    # Ljava/lang/String;
    .param p4, "rules"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/ToolMeta;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/PermissionRule;",
            ">;)",
            "Lcom/pymcl/ai/Verdict;"
        }
    .end annotation

    const-string v0, "meta"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rules"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    const-string v0, "plan"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/ai/ToolMeta;->getReadonly()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v1, Lcom/pymcl/ai/Decision;->DENY:Lcom/pymcl/ai/Decision;

    const-string v2, "\u5f53\u524d\u662f\u300c\u53ea\u770b\u4e0d\u52a8\u300d\u6863\u4f4d\uff0c\u4e0d\u80fd\u6267\u884c\u5199\u64cd\u4f5c"

    invoke-direct {v0, v1, v2}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;)V

    return-object v0

    .line 75
    :cond_0
    move-object v0, p4

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 148
    .local v1, "$i$f$filter":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 149
    .local v4, "$i$f$filterTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/ai/PermissionRule;

    .local v7, "it":Lcom/pymcl/ai/PermissionRule;
    const/4 v8, 0x0

    .line 75
    .local v8, "$i$a$-filter-Permission$decide$hits$1":I
    sget-object v9, Lcom/pymcl/ai/Permission;->INSTANCE:Lcom/pymcl/ai/Permission;

    invoke-virtual {p1}, Lcom/pymcl/ai/ToolMeta;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v7, v10, p2}, Lcom/pymcl/ai/Permission;->matches(Lcom/pymcl/ai/PermissionRule;Ljava/lang/String;Ljava/util/Map;)Z

    move-result v7

    .line 149
    .end local v7    # "it":Lcom/pymcl/ai/PermissionRule;
    .end local v8    # "$i$a$-filter-Permission$decide$hits$1":I
    if-eqz v7, :cond_1

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 150
    .end local v6    # "element$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filterTo":I
    check-cast v2, Ljava/util/List;

    .line 148
    nop

    .line 75
    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filter":I
    nop

    .line 76
    .local v2, "hits":Ljava/util/List;
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 151
    .local v1, "$i$f$any":I
    instance-of v3, v0, Ljava/util/Collection;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    move v0, v5

    goto :goto_1

    .line 152
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/ai/PermissionRule;

    .restart local v7    # "it":Lcom/pymcl/ai/PermissionRule;
    const/4 v8, 0x0

    .line 76
    .local v8, "$i$a$-any-Permission$decide$1":I
    invoke-virtual {v7}, Lcom/pymcl/ai/PermissionRule;->getBehavior()Ljava/lang/String;

    move-result-object v9

    const-string v10, "deny"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    .line 152
    .end local v7    # "it":Lcom/pymcl/ai/PermissionRule;
    .end local v8    # "$i$a$-any-Permission$decide$1":I
    if-eqz v7, :cond_4

    move v0, v4

    goto :goto_1

    .line 153
    .end local v6    # "element$iv":Ljava/lang/Object;
    :cond_5
    move v0, v5

    .line 76
    .end local v0    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any":I
    :goto_1
    if-eqz v0, :cond_6

    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v1, Lcom/pymcl/ai/Decision;->DENY:Lcom/pymcl/ai/Decision;

    const-string v3, "\u88ab\u6743\u9650\u89c4\u5219\u7981\u6b62"

    invoke-direct {v0, v1, v3}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;)V

    return-object v0

    .line 78
    :cond_6
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .restart local v0    # "$this$any$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 154
    .restart local v1    # "$i$f$any":I
    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_7

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_7

    move v0, v5

    goto :goto_3

    .line 155
    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .restart local v6    # "element$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/ai/PermissionRule;

    .restart local v7    # "it":Lcom/pymcl/ai/PermissionRule;
    const/4 v8, 0x0

    .line 78
    .local v8, "$i$a$-any-Permission$decide$2":I
    invoke-virtual {v7}, Lcom/pymcl/ai/PermissionRule;->getBehavior()Ljava/lang/String;

    move-result-object v9

    const-string v10, "allow"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-virtual {p1}, Lcom/pymcl/ai/ToolMeta;->isDelete()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-virtual {v7}, Lcom/pymcl/ai/PermissionRule;->getRuleContent()Ljava/lang/String;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_9
    move v7, v4

    goto :goto_2

    :cond_a
    move v7, v5

    .line 155
    .end local v7    # "it":Lcom/pymcl/ai/PermissionRule;
    .end local v8    # "$i$a$-any-Permission$decide$2":I
    :goto_2
    if-eqz v7, :cond_8

    move v0, v4

    goto :goto_3

    .line 156
    .end local v6    # "element$iv":Ljava/lang/Object;
    :cond_b
    move v0, v5

    .line 78
    .end local v0    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any":I
    :goto_3
    if-eqz v0, :cond_c

    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v1, Lcom/pymcl/ai/Decision;->ALLOW:Lcom/pymcl/ai/Decision;

    const-string v3, "\u6743\u9650\u89c4\u5219\u5141\u8bb8"

    invoke-direct {v0, v1, v3}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;)V

    return-object v0

    .line 79
    :cond_c
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .restart local v0    # "$this$any$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 157
    .restart local v1    # "$i$f$any":I
    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_d

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_d

    move v4, v5

    goto :goto_4

    .line 158
    :cond_d
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .restart local v6    # "element$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/ai/PermissionRule;

    .restart local v7    # "it":Lcom/pymcl/ai/PermissionRule;
    const/4 v8, 0x0

    .line 79
    .local v8, "$i$a$-any-Permission$decide$3":I
    invoke-virtual {v7}, Lcom/pymcl/ai/PermissionRule;->getBehavior()Ljava/lang/String;

    move-result-object v9

    const-string v10, "ask"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    .line 158
    .end local v7    # "it":Lcom/pymcl/ai/PermissionRule;
    .end local v8    # "$i$a$-any-Permission$decide$3":I
    if-eqz v7, :cond_e

    goto :goto_4

    .line 159
    .end local v6    # "element$iv":Ljava/lang/Object;
    :cond_f
    move v4, v5

    .line 79
    .end local v0    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any":I
    :goto_4
    if-eqz v4, :cond_10

    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v1, Lcom/pymcl/ai/Decision;->ASK:Lcom/pymcl/ai/Decision;

    const-string v3, "\u6743\u9650\u89c4\u5219\u8981\u6c42\u786e\u8ba4"

    invoke-direct {v0, v1, v3}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;)V

    return-object v0

    .line 80
    :cond_10
    invoke-virtual {p1}, Lcom/pymcl/ai/ToolMeta;->getReadonly()Z

    move-result v0

    const/4 v1, 0x2

    const/4 v3, 0x0

    if-eqz v0, :cond_11

    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v4, Lcom/pymcl/ai/Decision;->ALLOW:Lcom/pymcl/ai/Decision;

    invoke-direct {v0, v4, v3, v1, v3}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    .line 81
    :cond_11
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-string v4, "\u9700\u8981\u786e\u8ba4"

    sparse-switch v0, :sswitch_data_0

    :cond_12
    :goto_5
    goto/16 :goto_7

    :sswitch_0
    const-string v0, "dontAsk"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_5

    .line 86
    :cond_13
    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v1, Lcom/pymcl/ai/Decision;->DENY:Lcom/pymcl/ai/Decision;

    const-string v3, "\u5f53\u524d\u6863\u4f4d\u4e0d\u5f39\u786e\u8ba4\uff0c\u672a\u6388\u6743\u7684\u5199\u64cd\u4f5c\u4e00\u5f8b\u62d2\u7edd"

    invoke-direct {v0, v1, v3}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;)V

    goto/16 :goto_9

    .line 81
    :sswitch_1
    const-string v0, "autoEdit"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_5

    :sswitch_2
    const-string v0, "acceptEdits"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_5

    :sswitch_3
    const-string v0, "build"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_5

    .line 84
    :cond_14
    invoke-virtual {p1}, Lcom/pymcl/ai/ToolMeta;->isDelete()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-virtual {p1}, Lcom/pymcl/ai/ToolMeta;->getSideEffect()Ljava/lang/String;

    move-result-object v0

    const-string v5, "launch"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    goto :goto_6

    :cond_15
    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v4, Lcom/pymcl/ai/Decision;->ALLOW:Lcom/pymcl/ai/Decision;

    invoke-direct {v0, v4, v3, v1, v3}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_9

    :cond_16
    :goto_6
    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v1, Lcom/pymcl/ai/Decision;->ASK:Lcom/pymcl/ai/Decision;

    invoke-direct {v0, v1, v4}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;)V

    goto/16 :goto_9

    .line 81
    :sswitch_4
    const-string v0, "yolo"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_5

    :sswitch_5
    const-string v0, "edit"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_5

    .line 85
    :cond_17
    invoke-virtual {p1}, Lcom/pymcl/ai/ToolMeta;->getSideEffect()Ljava/lang/String;

    move-result-object v0

    const-string v5, "write_local"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v4, Lcom/pymcl/ai/Decision;->ALLOW:Lcom/pymcl/ai/Decision;

    invoke-direct {v0, v4, v3, v1, v3}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    :cond_18
    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v1, Lcom/pymcl/ai/Decision;->ASK:Lcom/pymcl/ai/Decision;

    invoke-direct {v0, v1, v4}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;)V

    goto :goto_9

    .line 81
    :sswitch_6
    const-string v0, "auto"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_5

    .line 83
    :cond_19
    invoke-virtual {p1}, Lcom/pymcl/ai/ToolMeta;->isDelete()Z

    move-result v0

    if-eqz v0, :cond_1a

    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v1, Lcom/pymcl/ai/Decision;->ASK:Lcom/pymcl/ai/Decision;

    const-string v3, "\u5220\u9664\u64cd\u4f5c\u9700\u8981\u786e\u8ba4"

    invoke-direct {v0, v1, v3}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;)V

    goto :goto_9

    :cond_1a
    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v4, Lcom/pymcl/ai/Decision;->ALLOW:Lcom/pymcl/ai/Decision;

    invoke-direct {v0, v4, v3, v1, v3}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    .line 81
    :sswitch_7
    const-string v0, "bypassPermissions"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 82
    :cond_1b
    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v4, Lcom/pymcl/ai/Decision;->ALLOW:Lcom/pymcl/ai/Decision;

    invoke-direct {v0, v4, v3, v1, v3}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    .line 87
    :goto_7
    new-instance v0, Lcom/pymcl/ai/Verdict;

    sget-object v1, Lcom/pymcl/ai/Decision;->ASK:Lcom/pymcl/ai/Decision;

    invoke-virtual {p1}, Lcom/pymcl/ai/ToolMeta;->getRisk()Ljava/lang/String;

    move-result-object v3

    const-string v4, "high"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1c

    const-string v3, "\u9ad8\u98ce\u9669\u64cd\u4f5c\u9700\u8981\u786e\u8ba4"

    goto :goto_8

    :cond_1c
    const-string v3, "\u5199\u64cd\u4f5c\u9700\u8981\u786e\u8ba4"

    :goto_8
    invoke-direct {v0, v1, v3}, Lcom/pymcl/ai/Verdict;-><init>(Lcom/pymcl/ai/Decision;Ljava/lang/String;)V

    .line 81
    :goto_9
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5b597184 -> :sswitch_7
        0x2dddaf -> :sswitch_6
        0x2f6e0a -> :sswitch_5
        0x38af19 -> :sswitch_4
        0x59bc66e -> :sswitch_3
        0x24039381 -> :sswitch_2
        0x55ba5059 -> :sswitch_1
        0x6d9ce928 -> :sswitch_0
    .end sparse-switch
.end method

.method public final getARG_KEYS()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 52
    sget-object v0, Lcom/pymcl/ai/Permission;->ARG_KEYS:Ljava/util/List;

    return-object v0
.end method

.method public final getUI_LABELS()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 51
    sget-object v0, Lcom/pymcl/ai/Permission;->UI_LABELS:Ljava/util/List;

    return-object v0
.end method

.method public final getUI_MODES()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 50
    sget-object v0, Lcom/pymcl/ai/Permission;->UI_MODES:Ljava/util/List;

    return-object v0
.end method

.method public final matches(Lcom/pymcl/ai/PermissionRule;Ljava/lang/String;Ljava/util/Map;)Z
    .locals 16
    .param p1, "rule"    # Lcom/pymcl/ai/PermissionRule;
    .param p2, "tool"    # Ljava/lang/String;
    .param p3, "args"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/PermissionRule;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "rule"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "tool"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-virtual {v3}, Lcom/pymcl/ai/PermissionRule;->getToolName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_0

    invoke-virtual {v3}, Lcom/pymcl/ai/PermissionRule;->getToolName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "*"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    return v4

    .line 68
    :cond_0
    invoke-virtual {v3}, Lcom/pymcl/ai/PermissionRule;->getRuleContent()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    return v5

    .line 69
    :cond_1
    invoke-virtual {v3}, Lcom/pymcl/ai/PermissionRule;->getRuleContent()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v6, p0

    invoke-virtual {v6, v2}, Lcom/pymcl/ai/Permission;->norm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 70
    .local v2, "want":Ljava/lang/String;
    sget-object v7, Lcom/pymcl/ai/Permission;->ARG_KEYS:Ljava/util/List;

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 145
    .local v8, "$i$f$any":I
    instance-of v9, v7, Ljava/util/Collection;

    if-eqz v9, :cond_2

    move-object v9, v7

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_2

    .line 146
    :cond_2
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Ljava/lang/String;

    .local v11, "k":Ljava/lang/String;
    const/4 v12, 0x0

    .line 70
    .local v12, "$i$a$-any-Permission$matches$1":I
    if-eqz v1, :cond_3

    invoke-interface {v1, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-eqz v13, :cond_3

    .line 144
    .local v13, "v":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 70
    .local v14, "$i$a$-let-Permission$matches$1$1":I
    sget-object v15, Lcom/pymcl/ai/Permission;->INSTANCE:Lcom/pymcl/ai/Permission;

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, Lcom/pymcl/ai/Permission;->norm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .end local v13    # "v":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-Permission$matches$1$1":I
    if-ne v4, v5, :cond_3

    move v4, v5

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 146
    .end local v11    # "k":Ljava/lang/String;
    .end local v12    # "$i$a$-any-Permission$matches$1":I
    :goto_1
    if-eqz v4, :cond_4

    move v4, v5

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    goto :goto_0

    .line 147
    .end local v10    # "element$iv":Ljava/lang/Object;
    :cond_5
    const/4 v4, 0x0

    .line 70
    .end local v7    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$any":I
    :goto_2
    return v4
.end method

.method public final migrateMode(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2
    .param p1, "m"    # Ljava/lang/String;
    .param p2, "confirmWrites"    # Z

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-string v1, "default"

    sparse-switch v0, :sswitch_data_0

    :goto_0
    goto :goto_1

    :sswitch_0
    const-string v0, "standard"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    goto :goto_2

    .line 54
    :sswitch_1
    const-string v0, "full"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 56
    :cond_1
    if-eqz p2, :cond_2

    const-string v1, "acceptEdits"

    goto :goto_2

    :cond_2
    const-string v1, "yolo"

    goto :goto_2

    .line 54
    :sswitch_2
    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 57
    :cond_3
    goto :goto_2

    .line 58
    :goto_1
    move-object v1, p1

    .line 59
    :goto_2
    return-object v1

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x30228f -> :sswitch_1
        0x4e3d1ebd -> :sswitch_0
    .end sparse-switch
.end method

.method public final norm(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p1, "s"    # Ljava/lang/String;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x5c

    const/16 v3, 0x2f

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [C

    const/16 v2, 0x2f

    const/4 v3, 0x0

    aput-char v2, v1, v3

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final note(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "mode"    # Ljava/lang/String;

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :cond_0
    :goto_0
    goto :goto_1

    :sswitch_0
    const-string v0, "autoEdit"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :sswitch_1
    const-string v0, "acceptEdits"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :sswitch_2
    const-string v0, "yolo"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :sswitch_3
    const-string v0, "plan"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    const-string v0, "\u5f53\u524d\u6743\u9650\u6863\u4f4d\uff1a\u53ea\u770b\u4e0d\u52a8\u3002\u53ea\u80fd\u8c03\u7528\u53ea\u8bfb\u5de5\u5177\uff0c\u5199\u64cd\u4f5c\u4f1a\u88ab\u62d2\u7edd\uff1b\u9700\u8981\u6539\u52a8\u65f6\u628a\u65b9\u6848\u8bb2\u6e05\u695a\u8ba9\u7528\u6237\u5207\u6863\u4f4d\u3002"

    goto :goto_2

    .line 92
    :sswitch_4
    const-string v0, "auto"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 95
    :cond_1
    const-string v0, "\u5f53\u524d\u6743\u9650\u6863\u4f4d\uff1a\u5199\u76f4\u63a5\u6267\u884c\u3002\u5b89\u88c5/\u542f\u7528/\u7981\u7528\u76f4\u63a5\u6267\u884c\uff0c\u5220\u9664\u7c7b\u4ecd\u4f1a\u5f39\u786e\u8ba4\u3002"

    goto :goto_2

    .line 92
    :sswitch_5
    const-string v0, "bypassPermissions"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 94
    :cond_2
    const-string v0, "\u5f53\u524d\u6743\u9650\u6863\u4f4d\uff1a\u5168\u81ea\u52a8\u3002\u5199\u64cd\u4f5c\u4f1a\u76f4\u63a5\u6267\u884c\uff0c\u52a8\u624b\u524d\u60f3\u6e05\u695a\u3002"

    goto :goto_2

    .line 96
    :goto_1
    const-string v0, "\u5f53\u524d\u6743\u9650\u6863\u4f4d\uff1a\u6bcf\u6b21\u786e\u8ba4\u3002\u5199\u64cd\u4f5c\u4f1a\u5148\u5f39\u786e\u8ba4\u5361\uff0c\u7528\u6237\u540c\u610f\u540e\u624d\u6267\u884c\uff1b\u88ab\u62d2\u7edd\u5c31\u6362\u65b9\u6848\u6216\u8bf4\u660e\u539f\u56e0\uff0c\u4e0d\u8981\u91cd\u590d\u8bf7\u6c42\u540c\u4e00\u64cd\u4f5c\u3002"

    .line 97
    :goto_2
    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x5b597184 -> :sswitch_5
        0x2dddaf -> :sswitch_4
        0x348b29 -> :sswitch_3
        0x38af19 -> :sswitch_2
        0x24039381 -> :sswitch_1
        0x55ba5059 -> :sswitch_0
    .end sparse-switch
.end method

.method public final uiIndex(Ljava/lang/String;)I
    .locals 5
    .param p1, "mode"    # Ljava/lang/String;

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    sget-object v0, Lcom/pymcl/ai/Permission;->UI_MODES:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 144
    .local v1, "it":I
    const/4 v2, 0x0

    .line 60
    .local v2, "$i$a$-takeIf-Permission$uiIndex$1":I
    const/4 v3, 0x1

    if-ltz v1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .end local v1    # "it":I
    .end local v2    # "$i$a$-takeIf-Permission$uiIndex$1":I
    :goto_0
    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_4

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :goto_2
    goto :goto_3

    :sswitch_0
    const-string v0, "autoEdit"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :sswitch_1
    const-string v0, "auto"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    .line 61
    :cond_3
    goto :goto_4

    .line 60
    :sswitch_2
    const-string v0, "bypassPermissions"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    .line 61
    :cond_4
    const/4 v3, 0x3

    goto :goto_4

    :goto_3
    const/4 v3, 0x4

    .line 62
    :goto_4
    return v3

    :sswitch_data_0
    .sparse-switch
        -0x5b597184 -> :sswitch_2
        0x2dddaf -> :sswitch_1
        0x55ba5059 -> :sswitch_0
    .end sparse-switch
.end method
