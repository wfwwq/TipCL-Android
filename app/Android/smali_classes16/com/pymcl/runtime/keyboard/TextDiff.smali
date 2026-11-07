.class public final Lcom/pymcl/runtime/keyboard/TextDiff;
.super Ljava/lang/Object;
.source "TouchCharInput.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/keyboard/TextDiff$Result;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTouchCharInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchCharInput.kt\ncom/pymcl/runtime/keyboard/TextDiff\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,118:1\n1#2:119\n2077#3,3:120\n*S KotlinDebug\n*F\n+ 1 TouchCharInput.kt\ncom/pymcl/runtime/keyboard/TextDiff\n*L\n39#1:120,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/pymcl/runtime/keyboard/TextDiff;",
        "",
        "<init>",
        "()V",
        "FILLER_LEN",
        "",
        "FILLER",
        "",
        "getFILLER",
        "()Ljava/lang/String;",
        "diff",
        "Lcom/pymcl/runtime/keyboard/TextDiff$Result;",
        "old",
        "",
        "new",
        "apply",
        "",
        "sink",
        "Lcom/pymcl/runtime/input/InputSink;",
        "r",
        "Result",
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


# static fields
.field private static final FILLER:Ljava/lang/String;

.field public static final FILLER_LEN:I = 0x1e

.field public static final INSTANCE:Lcom/pymcl/runtime/keyboard/TextDiff;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/keyboard/TextDiff;

    invoke-direct {v0}, Lcom/pymcl/runtime/keyboard/TextDiff;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/keyboard/TextDiff;->INSTANCE:Lcom/pymcl/runtime/keyboard/TextDiff;

    .line 23
    const-string v0, " "

    check-cast v0, Ljava/lang/CharSequence;

    const/16 v1, 0x1e

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->repeat(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/keyboard/TextDiff;->FILLER:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/keyboard/TextDiff$Result;)V
    .locals 12
    .param p1, "sink"    # Lcom/pymcl/runtime/input/InputSink;
    .param p2, "r"    # Lcom/pymcl/runtime/keyboard/TextDiff$Result;

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "r"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p2}, Lcom/pymcl/runtime/keyboard/TextDiff$Result;->getBackspaces()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    move v3, v2

    .line 119
    .local v3, "it":I
    const/4 v4, 0x0

    .line 36
    .local v4, "$i$a$-repeat-TextDiff$apply$1":I
    const/16 v5, 0xe

    invoke-interface {p1, v5}, Lcom/pymcl/runtime/input/InputSink;->tapKey(I)V

    .end local v3    # "it":I
    .end local v4    # "$i$a$-repeat-TextDiff$apply$1":I
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p2}, Lcom/pymcl/runtime/keyboard/TextDiff$Result;->getInserted()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    const/4 v0, 0x1

    new-array v3, v0, [C

    const/16 v4, 0xa

    aput-char v4, v3, v1

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 39
    .local v2, "parts":Ljava/util/List;
    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 120
    .local v4, "$i$f$forEachIndexed":I
    const/4 v5, 0x0

    .line 121
    .local v5, "index$iv":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "item$iv":Ljava/lang/Object;
    add-int/lit8 v8, v5, 0x1

    .end local v5    # "index$iv":I
    .local v8, "index$iv":I
    if-gez v5, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1
    move-object v9, v7

    check-cast v9, Ljava/lang/String;

    .local v5, "i":I
    .local v9, "seg":Ljava/lang/String;
    const/4 v10, 0x0

    .line 40
    .local v10, "$i$a$-forEachIndexed-TextDiff$apply$2":I
    move-object v11, v9

    check-cast v11, Ljava/lang/CharSequence;

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-lez v11, :cond_2

    move v11, v0

    goto :goto_2

    :cond_2
    move v11, v1

    :goto_2
    if-eqz v11, :cond_3

    invoke-interface {p1, v9}, Lcom/pymcl/runtime/input/InputSink;->text(Ljava/lang/String;)V

    .line 41
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v11

    sub-int/2addr v11, v0

    if-ge v5, v11, :cond_4

    const/16 v11, 0x1c

    invoke-interface {p1, v11}, Lcom/pymcl/runtime/input/InputSink;->tapKey(I)V

    .line 42
    :cond_4
    nop

    .line 121
    .end local v5    # "i":I
    .end local v9    # "seg":Ljava/lang/String;
    .end local v10    # "$i$a$-forEachIndexed-TextDiff$apply$2":I
    move v5, v8

    .end local v7    # "item$iv":Ljava/lang/Object;
    goto :goto_1

    .line 122
    .end local v8    # "index$iv":I
    .local v5, "index$iv":I
    :cond_5
    nop

    .line 43
    .end local v3    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$forEachIndexed":I
    .end local v5    # "index$iv":I
    return-void
.end method

.method public final diff(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/pymcl/runtime/keyboard/TextDiff$Result;
    .locals 5
    .param p1, "old"    # Ljava/lang/CharSequence;
    .param p2, "new"    # Ljava/lang/CharSequence;

    const-string v0, "old"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "new"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    const/4 v0, 0x0

    .line 30
    .local v0, "p":I
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 31
    .local v1, "n":I
    :goto_0
    if-ge v0, v1, :cond_0

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-interface {p2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-ne v2, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 32
    :cond_0
    new-instance v2, Lcom/pymcl/runtime/keyboard/TextDiff$Result;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    sub-int/2addr v3, v0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-interface {p2, v0, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/pymcl/runtime/keyboard/TextDiff$Result;-><init>(ILjava/lang/String;)V

    return-object v2
.end method

.method public final getFILLER()Ljava/lang/String;
    .locals 1

    .line 23
    sget-object v0, Lcom/pymcl/runtime/keyboard/TextDiff;->FILLER:Ljava/lang/String;

    return-object v0
.end method
