.class public final Lcom/pymcl/ai/NetErrors;
.super Ljava/lang/Object;
.source "AiClient.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiClient.kt\ncom/pymcl/ai/NetErrors\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1439#2:180\n1440#2:182\n1439#2,2:183\n1#3:181\n*S KotlinDebug\n*F\n+ 1 AiClient.kt\ncom/pymcl/ai/NetErrors\n*L\n153#1:180\n153#1:182\n154#1:183,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/pymcl/ai/NetErrors;",
        "",
        "<init>",
        "()V",
        "chain",
        "Lkotlin/sequences/Sequence;",
        "",
        "e",
        "isTls",
        "",
        "isCleartextBlocked",
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
.field public static final INSTANCE:Lcom/pymcl/ai/NetErrors;


# direct methods
.method public static synthetic $r8$lambda$DdP3x5ezb3BxE5m2o2UoO3_jYp8(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/ai/NetErrors;->chain$lambda$0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/ai/NetErrors;

    invoke-direct {v0}, Lcom/pymcl/ai/NetErrors;-><init>()V

    sput-object v0, Lcom/pymcl/ai/NetErrors;->INSTANCE:Lcom/pymcl/ai/NetErrors;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final chain$lambda$0(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 5
    .param p0, "it"    # Ljava/lang/Throwable;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v2, v0

    .line 181
    .local v2, "c":Ljava/lang/Throwable;
    const/4 v3, 0x0

    .line 152
    .local v3, "$i$a$-takeIf-NetErrors$chain$1$1":I
    if-eq v2, p0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .end local v2    # "c":Ljava/lang/Throwable;
    .end local v3    # "$i$a$-takeIf-NetErrors$chain$1$1":I
    :goto_0
    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    return-object v0
.end method


# virtual methods
.method public final chain(Ljava/lang/Throwable;)Lkotlin/sequences/Sequence;
    .locals 2
    .param p1, "e"    # Ljava/lang/Throwable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    new-instance v0, Lcom/pymcl/ai/NetErrors$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/ai/NetErrors$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {p1, v0}, Lkotlin/sequences/SequencesKt;->generateSequence(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->take(Lkotlin/sequences/Sequence;I)Lkotlin/sequences/Sequence;

    move-result-object v0

    return-object v0
.end method

.method public final isCleartextBlocked(Ljava/lang/Throwable;)Z
    .locals 10
    .param p1, "e"    # Ljava/lang/Throwable;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/NetErrors;->chain(Ljava/lang/Throwable;)Lkotlin/sequences/Sequence;

    move-result-object v0

    .local v0, "$this$any$iv":Lkotlin/sequences/Sequence;
    const/4 v1, 0x0

    .line 183
    .local v1, "$i$f$any":I
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v5, v3

    check-cast v5, Ljava/lang/Throwable;

    .local v5, "it":Ljava/lang/Throwable;
    const/4 v6, 0x0

    .line 154
    .local v6, "$i$a$-any-NetErrors$isCleartextBlocked$1":I
    instance-of v7, v5, Ljava/net/UnknownServiceException;

    const/4 v8, 0x1

    if-nez v7, :cond_2

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    const-string v7, ""

    :cond_1
    check-cast v7, Ljava/lang/CharSequence;

    const-string v9, "CLEARTEXT"

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v7, v9, v8}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v7

    if-eqz v7, :cond_3

    :cond_2
    move v4, v8

    .line 183
    .end local v5    # "it":Ljava/lang/Throwable;
    .end local v6    # "$i$a$-any-NetErrors$isCleartextBlocked$1":I
    :cond_3
    if-eqz v4, :cond_0

    move v4, v8

    goto :goto_0

    .line 184
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_4
    nop

    .line 154
    .end local v0    # "$this$any$iv":Lkotlin/sequences/Sequence;
    .end local v1    # "$i$f$any":I
    :goto_0
    return v4
.end method

.method public final isTls(Ljava/lang/Throwable;)Z
    .locals 14
    .param p1, "e"    # Ljava/lang/Throwable;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/NetErrors;->chain(Ljava/lang/Throwable;)Lkotlin/sequences/Sequence;

    move-result-object v0

    .local v0, "$this$any$iv":Lkotlin/sequences/Sequence;
    const/4 v1, 0x0

    .line 180
    .local v1, "$i$f$any":I
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v5, v3

    check-cast v5, Ljava/lang/Throwable;

    .local v5, "it":Ljava/lang/Throwable;
    const/4 v6, 0x0

    .line 153
    .local v6, "$i$a$-any-NetErrors$isTls$1":I
    instance-of v7, v5, Ljavax/net/ssl/SSLException;

    const/4 v8, 0x1

    if-nez v7, :cond_4

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    const-string v7, ""

    .line 181
    .local v7, "m":Ljava/lang/String;
    :cond_1
    const/4 v9, 0x0

    .line 153
    .local v9, "$i$a$-let-NetErrors$isTls$1$1":I
    move-object v10, v7

    check-cast v10, Ljava/lang/CharSequence;

    const-string v11, "unrecognized_name"

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v10, v11, v8}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_3

    move-object v10, v7

    check-cast v10, Ljava/lang/CharSequence;

    const-string v11, "UNRECOGNIZED_NAME"

    check-cast v11, Ljava/lang/CharSequence;

    const/4 v12, 0x2

    const/4 v13, 0x0

    invoke-static {v10, v11, v4, v12, v13}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    move-object v10, v7

    check-cast v10, Ljava/lang/CharSequence;

    const-string v11, "handshake"

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v10, v11, v8}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_2

    move-object v10, v7

    check-cast v10, Ljava/lang/CharSequence;

    const-string v11, "ssl"

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v10, v11, v8}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_2

    goto :goto_0

    :cond_2
    move v7, v4

    goto :goto_1

    :cond_3
    :goto_0
    move v7, v8

    .end local v7    # "m":Ljava/lang/String;
    .end local v9    # "$i$a$-let-NetErrors$isTls$1$1":I
    :goto_1
    if-eqz v7, :cond_5

    :cond_4
    move v4, v8

    .line 180
    .end local v5    # "it":Ljava/lang/Throwable;
    .end local v6    # "$i$a$-any-NetErrors$isTls$1":I
    :cond_5
    if-eqz v4, :cond_0

    move v4, v8

    goto :goto_2

    .line 182
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_6
    nop

    .line 153
    .end local v0    # "$this$any$iv":Lkotlin/sequences/Sequence;
    .end local v1    # "$i$f$any":I
    :goto_2
    return v4
.end method
