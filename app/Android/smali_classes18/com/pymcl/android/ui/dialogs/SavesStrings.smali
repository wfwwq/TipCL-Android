.class public final Lcom/pymcl/android/ui/dialogs/SavesStrings;
.super Ljava/lang/Object;
.source "SavesStrings.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSavesStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavesStrings.kt\ncom/pymcl/android/ui/dialogs/SavesStrings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,58:1\n15166#2,3:59\n*S KotlinDebug\n*F\n+ 1 SavesStrings.kt\ncom/pymcl/android/ui/dialogs/SavesStrings\n*L\n43#1:59,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0010\u0010\u000b\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00010\u000c\u00a2\u0006\u0002\u0010\rJC\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00142\u0010\u0010\u000b\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00010\u000c\u00a2\u0006\u0002\u0010\u0015R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00ca\u0001\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/pymcl/android/ui/dialogs/SavesStrings;",
        "",
        "<init>",
        "()V",
        "EN",
        "",
        "",
        "getEN",
        "()Ljava/util/Map;",
        "fill",
        "base",
        "args",
        "",
        "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
        "resolve",
        "key",
        "en",
        "",
        "packHas",
        "packValue",
        "Lkotlin/Function0;",
        "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;[Ljava/lang/Object;)Ljava/lang/String;",
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

.field private static final EN:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/pymcl/android/ui/dialogs/SavesStrings;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/android/ui/dialogs/SavesStrings;

    invoke-direct {v0}, Lcom/pymcl/android/ui/dialogs/SavesStrings;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/dialogs/SavesStrings;->INSTANCE:Lcom/pymcl/android/ui/dialogs/SavesStrings;

    .line 15
    nop

    .line 16
    const/16 v0, 0x16

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "\u5bfc\u5165"

    const-string v2, "Import"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 17
    const-string v1, "\u4ece zip \u5bfc\u5165\u2026"

    const-string v2, "Import from zip\u2026"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 16
    nop

    .line 18
    const-string v1, "\u4ece\u6587\u4ef6\u5939\u5bfc\u5165\u2026"

    const-string v2, "Import from folder\u2026"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 16
    nop

    .line 19
    const-string v1, "\u5bfc\u5165\u5b58\u6863\uff1a\u9009 zip \u6216\u6587\u4ef6\u5939\uff0c\u91cc\u9762\u8981\u6709 level.dat\uff1b\u91cd\u540d\u4f1a\u81ea\u52a8\u52a0\u540e\u7f00\u3002"

    const-string v2, "Import a world: pick a zip or folder that contains level.dat. Name clashes get a numeric suffix."

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 16
    nop

    .line 20
    const-string v1, "\u4e5f\u53ef\u4ee5\u628a zip \u62d6\u5230\u8fd9\u4e2a\u7a97\u53e3\u91cc\uff08\u5206\u5c4f\u65f6\u4ece\u6587\u4ef6\u7ba1\u7406\u5668\u62d6\uff09\u3002"

    const-string v2, "You can also drag a zip onto this window (from a file manager in split screen)."

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 16
    nop

    .line 21
    const-string v1, "\u6b63\u5728\u5bfc\u5165\u2026"

    const-string v2, "Importing\u2026"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 16
    nop

    .line 22
    const-string v1, "\u5df2\u5bfc\u5165"

    const-string v2, "Imported"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 16
    nop

    .line 23
    const-string v1, "\u5bfc\u5165\u5931\u8d25"

    const-string v2, "Import failed"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 16
    nop

    .line 24
    const-string v1, "\u4e0e\u73b0\u6709\u5b58\u6863\u91cd\u540d\uff0c\u5df2\u6539\u540d\u4e3a\u300c{0}\u300d"

    const-string v2, "A world with that name already exists; imported as \"{0}\""

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 16
    nop

    .line 25
    const-string v1, "{0} \u4e2a\u6587\u4ef6"

    const-string v2, "{0} files"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    .line 16
    nop

    .line 26
    const-string v1, "\u8bb0\u4f4f\u5bfc\u51fa\u4f4d\u7f6e"

    const-string v2, "Remember export location"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    .line 16
    nop

    .line 27
    const-string v1, "\u4e0b\u6b21\u5bfc\u51fa\u65f6\u76f4\u63a5\u6253\u5f00\u4e0a\u6b21\u4fdd\u5b58\u7684\u76ee\u5f55"

    const-string v2, "Open the last-used folder next time you export"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 16
    nop

    .line 28
    const-string v1, "\u4e0a\u6b21\uff1a{0}"

    const-string v2, "Last: {0}"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    .line 16
    nop

    .line 29
    const-string v1, "\u4e0a\u6b21\u7684\u4f4d\u7f6e\uff08\u8def\u5f84\u65e0\u6cd5\u663e\u793a\uff09"

    const-string v2, "Last location (path not shown)"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    .line 16
    nop

    .line 30
    const-string v1, "\u5fd8\u8bb0"

    const-string v2, "Forget"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    .line 16
    nop

    .line 31
    const-string v1, "\u5df2\u5fd8\u8bb0\u5bfc\u51fa\u4f4d\u7f6e"

    const-string v2, "Export location forgotten"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    .line 16
    nop

    .line 32
    const-string v1, "\u677e\u624b\u5bfc\u5165\u5b58\u6863"

    const-string v2, "Drop to import the world"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    .line 16
    nop

    .line 33
    const-string v1, "\u62d6\u8fdb\u6765\u7684\u4e0d\u662f\u6587\u4ef6"

    const-string v2, "The dropped item is not a file"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x11

    aput-object v1, v0, v2

    .line 16
    nop

    .line 34
    const-string v1, "\u6ca1\u80fd\u83b7\u5f97\u62d6\u653e\u6587\u4ef6\u7684\u8bfb\u53d6\u6743\u9650"

    const-string v2, "No permission to read the dropped file"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x12

    aput-object v1, v0, v2

    .line 16
    nop

    .line 36
    const-string v1, "\u6b63\u5728\u5bfc\u5165\uff1a\u5df2\u5904\u7406 {0}/{1} \u4e2a\u6587\u4ef6"

    const-string v2, "Importing: {0}/{1} files processed"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x13

    aput-object v1, v0, v2

    .line 16
    nop

    .line 37
    const-string v1, "\u53d6\u6d88\u5bfc\u5165"

    const-string v2, "Cancel import"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x14

    aput-object v1, v0, v2

    .line 16
    nop

    .line 38
    const-string v1, "\u5df2\u53d6\u6d88\u5bfc\u5165"

    const-string v2, "Import cancelled"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x15

    aput-object v1, v0, v2

    .line 16
    nop

    .line 15
    invoke-static {v0}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    sput-object v0, Lcom/pymcl/android/ui/dialogs/SavesStrings;->EN:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fill(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 17
    .param p1, "base"    # Ljava/lang/String;
    .param p2, "args"    # [Ljava/lang/Object;

    const-string v0, "base"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    const/4 v0, 0x0

    .local v0, "s":Ljava/lang/Object;
    move-object/from16 v0, p1

    .line 43
    move-object/from16 v3, p2

    .local v3, "$this$forEachIndexed\\1":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 59
    .local v4, "$i$f$forEachIndexed\\1\\43":I
    const/4 v5, 0x0

    .line 60
    .local v5, "index\\1":I
    array-length v6, v3

    const/4 v7, 0x0

    move-object v8, v0

    .end local v0    # "s":Ljava/lang/Object;
    .local v8, "s":Ljava/lang/Object;
    :goto_0
    if-ge v7, v6, :cond_2

    aget-object v0, v3, v7

    .local v0, "item\\1":Ljava/lang/Object;
    add-int/lit8 v14, v5, 0x1

    .local v5, "i\\2":I
    .local v14, "index\\1":I
    move-object v15, v0

    .local v15, "a\\2":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 43
    .local v16, "$i$a$-forEachIndexed-SavesStrings$fill$1\\2\\60\\0":I
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "{"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "}"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    if-eqz v15, :cond_0

    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_1

    :cond_0
    const-string v10, ""

    :cond_1
    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 60
    .end local v5    # "i\\2":I
    .end local v15    # "a\\2":Ljava/lang/Object;
    .end local v16    # "$i$a$-forEachIndexed-SavesStrings$fill$1\\2\\60\\0":I
    nop

    .end local v0    # "item\\1":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    move v5, v14

    goto :goto_0

    .line 61
    .end local v14    # "index\\1":I
    .local v5, "index\\1":I
    :cond_2
    nop

    .line 44
    .end local v3    # "$this$forEachIndexed\\1":[Ljava/lang/Object;
    .end local v4    # "$i$f$forEachIndexed\\1\\43":I
    .end local v5    # "index\\1":I
    return-object v8
.end method

.method public final getEN()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 15
    sget-object v0, Lcom/pymcl/android/ui/dialogs/SavesStrings;->EN:Ljava/util/Map;

    return-object v0
.end method

.method public final resolve(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "en"    # Z
    .param p3, "packHas"    # Z
    .param p4, "packValue"    # Lkotlin/jvm/functions/Function0;
    .param p5, "args"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packValue"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    nop

    .line 49
    if-eqz p3, :cond_0

    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    .line 50
    :cond_0
    if-eqz p2, :cond_2

    sget-object v0, Lcom/pymcl/android/ui/dialogs/SavesStrings;->EN:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    move-object v0, p1

    :cond_1
    invoke-virtual {p0, v0, p5}, Lcom/pymcl/android/ui/dialogs/SavesStrings;->fill(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p0, p1, p5}, Lcom/pymcl/android/ui/dialogs/SavesStrings;->fill(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 52
    :goto_0
    return-object v0
.end method
