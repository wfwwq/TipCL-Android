.class public final Lcom/pymcl/android/ui/dialogs/SaveDropRules;
.super Ljava/lang/Object;
.source "SaveDropTarget.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaveDropTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveDropTarget.kt\ncom/pymcl/android/ui/dialogs/SaveDropRules\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1960#2,3:59\n*S KotlinDebug\n*F\n+ 1 SaveDropTarget.kt\ncom/pymcl/android/ui/dialogs/SaveDropRules\n*L\n27#1:59,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nR\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/pymcl/android/ui/dialogs/SaveDropRules;",
        "",
        "<init>",
        "()V",
        "TEXT_ONLY",
        "",
        "",
        "accepts",
        "",
        "mimes",
        "",
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

.field public static final INSTANCE:Lcom/pymcl/android/ui/dialogs/SaveDropRules;

.field private static final TEXT_ONLY:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/android/ui/dialogs/SaveDropRules;

    invoke-direct {v0}, Lcom/pymcl/android/ui/dialogs/SaveDropRules;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/dialogs/SaveDropRules;->INSTANCE:Lcom/pymcl/android/ui/dialogs/SaveDropRules;

    .line 26
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "text/plain"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "text/html"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "text/uri-list"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/dialogs/SaveDropRules;->TEXT_ONLY:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accepts(Ljava/util/Collection;)Z
    .locals 10
    .param p1, "mimes"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "mimes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 59
    .local v1, "$i$f$any\\1\\27":I
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    .line 60
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element\\1":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    .local v5, "it\\2":Ljava/lang/String;
    const/4 v6, 0x0

    .line 27
    .local v6, "$i$a$-any-SaveDropRules$accepts$1\\2\\60\\0":I
    sget-object v7, Lcom/pymcl/android/ui/dialogs/SaveDropRules;->TEXT_ONLY:Ljava/util/Set;

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "toLowerCase(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    .line 60
    .end local v5    # "it\\2":Ljava/lang/String;
    .end local v6    # "$i$a$-any-SaveDropRules$accepts$1\\2\\60\\0":I
    if-nez v7, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    .line 61
    .end local v4    # "element\\1":Ljava/lang/Object;
    :cond_2
    nop

    .line 27
    .end local v0    # "$this$any\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any\\1\\27":I
    :goto_0
    return v3
.end method
