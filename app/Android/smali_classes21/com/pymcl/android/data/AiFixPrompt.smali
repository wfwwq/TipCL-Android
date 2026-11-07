.class public final Lcom/pymcl/android/data/AiFixPrompt;
.super Ljava/lang/Object;
.source "AiFixPrompt.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/AiFixPrompt$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiFixPrompt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiFixPrompt.kt\ncom/pymcl/android/data/AiFixPrompt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005J\"\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/pymcl/android/data/AiFixPrompt;",
        "",
        "<init>",
        "()V",
        "MAX_LOG_LINES",
        "",
        "MAX_LOG_CHARS",
        "SECRET_KV",
        "Lkotlin/text/Regex;",
        "SECRET_ARG",
        "filterSecrets",
        "",
        "s",
        "visible",
        "info",
        "Lcom/pymcl/android/ui/state/CrashInfo;",
        "exitCodeHint",
        "code",
        "hidden",
        "logPath",
        "extra",
        "defaultLogPath",
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

.field public static final INSTANCE:Lcom/pymcl/android/data/AiFixPrompt;

.field public static final MAX_LOG_CHARS:I = 0x2ee0

.field public static final MAX_LOG_LINES:I = 0x78

.field private static final SECRET_ARG:Lkotlin/text/Regex;

.field private static final SECRET_KV:Lkotlin/text/Regex;


# direct methods
.method public static synthetic $r8$lambda$6vfQcDujm2HF94eewpc0g_rQv08(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/AiFixPrompt;->hidden$lambda$0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$MdETqTsTgYuZDqL6QlbXgBsbv_c(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/AiFixPrompt;->filterSecrets$lambda$1(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$rXPI_rckOPsd3FKzPsY9xz71xfw(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/AiFixPrompt;->filterSecrets$lambda$0(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/android/data/AiFixPrompt;

    invoke-direct {v0}, Lcom/pymcl/android/data/AiFixPrompt;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/AiFixPrompt;->INSTANCE:Lcom/pymcl/android/data/AiFixPrompt;

    .line 14
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "(?i)((?:access[_-]?token|session[_-]?token|refresh[_-]?token|client[_-]?secret|authorization)\\s*[:=]\\s*)([^\\s\"\']+)"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/data/AiFixPrompt;->SECRET_KV:Lkotlin/text/Regex;

    .line 15
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "(?i)(--(?:accessToken|uuid|xuid|clientId)\\s+)\\S+"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/data/AiFixPrompt;->SECRET_ARG:Lkotlin/text/Regex;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final filterSecrets$lambda$0(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;
    .locals 2
    .param p0, "it"    # Lkotlin/text/MatchResult;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-interface {p0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "***"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method private static final filterSecrets$lambda$1(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;
    .locals 2
    .param p0, "it"    # Lkotlin/text/MatchResult;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-interface {p0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "***"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method public static synthetic hidden$default(Lcom/pymcl/android/data/AiFixPrompt;Lcom/pymcl/android/ui/state/CrashInfo;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 39
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/AiFixPrompt;->defaultLogPath(Lcom/pymcl/android/ui/state/CrashInfo;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const-string p3, ""

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/android/data/AiFixPrompt;->hidden(Lcom/pymcl/android/ui/state/CrashInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final hidden$lambda$0(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    sget-object v0, Lcom/pymcl/android/data/AiFixPrompt;->INSTANCE:Lcom/pymcl/android/data/AiFixPrompt;

    invoke-virtual {v0, p0}, Lcom/pymcl/android/data/AiFixPrompt;->filterSecrets(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method


# virtual methods
.method public final defaultLogPath(Lcom/pymcl/android/ui/state/CrashInfo;)Ljava/lang/String;
    .locals 4
    .param p1, "info"    # Lcom/pymcl/android/ui/state/CrashInfo;

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getGameDir()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getGameDir()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [C

    const/16 v2, 0x2f

    const/4 v3, 0x0

    aput-char v2, v1, v3

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/logs/latest.log"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "\u5b9e\u4f8b\u76ee\u5f55/logs/latest.log"

    :goto_0
    return-object v0
.end method

.method public final exitCodeHint(I)Ljava/lang/String;
    .locals 1
    .param p1, "code"    # I

    .line 29
    sparse-switch p1, :sswitch_data_0

    .line 36
    const-string v0, "\u672a\u77e5\u9000\u51fa\u7801"

    goto :goto_0

    .line 31
    :sswitch_0
    const-string v0, "Java \u5f02\u5e38\u9000\u51fa\uff08\u901a\u5e38\u662f\u6a21\u7ec4\u6216\u914d\u7f6e\u62a5\u9519\uff09"

    goto :goto_0

    .line 30
    :sswitch_1
    const-string v0, "\u6b63\u5e38\u9000\u51fa\u7801\uff0c\u4f46\u88ab\u5224\u5b9a\u4e3a\u542f\u52a8\u5931\u8d25/\u5d29\u6e83"

    goto :goto_0

    .line 32
    :sswitch_2
    const-string v0, "\u8fdb\u7a0b\u88ab\u5f3a\u5236\u7ed3\u675f\u6216 JVM \u542f\u52a8\u5931\u8d25"

    goto :goto_0

    .line 34
    :sswitch_3
    const-string v0, "\u539f\u751f\u5c42 abort\uff08\u6e32\u67d3\u5668/\u9a71\u52a8\u6216\u539f\u751f\u5e93\u5d29\u6e83\uff09"

    goto :goto_0

    .line 33
    :sswitch_4
    const-string v0, "\u88ab\u7cfb\u7edf\u6740\u6b7b\uff08\u591a\u534a\u662f\u5185\u5b58\u4e0d\u8db3\uff09"

    goto :goto_0

    .line 35
    :sswitch_5
    const-string v0, "\u539f\u751f\u6bb5\u9519\u8bef\uff08\u6e32\u67d3\u5668/\u9a71\u52a8\u6216\u539f\u751f\u5e93\u5d29\u6e83\uff09"

    .line 37
    :goto_0
    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0xb -> :sswitch_5
        -0x9 -> :sswitch_4
        -0x6 -> :sswitch_3
        -0x1 -> :sswitch_2
        0x0 -> :sswitch_1
        0x1 -> :sswitch_0
        0x86 -> :sswitch_3
        0x89 -> :sswitch_4
        0x8b -> :sswitch_5
        0xff -> :sswitch_2
    .end sparse-switch
.end method

.method public final filterSecrets(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "s"    # Ljava/lang/String;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    sget-object v0, Lcom/pymcl/android/data/AiFixPrompt;->SECRET_ARG:Lkotlin/text/Regex;

    sget-object v1, Lcom/pymcl/android/data/AiFixPrompt;->SECRET_KV:Lkotlin/text/Regex;

    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    new-instance v3, Lcom/pymcl/android/data/AiFixPrompt$$ExternalSyntheticLambda1;

    invoke-direct {v3}, Lcom/pymcl/android/data/AiFixPrompt$$ExternalSyntheticLambda1;-><init>()V

    invoke-virtual {v1, v2, v3}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    new-instance v2, Lcom/pymcl/android/data/AiFixPrompt$$ExternalSyntheticLambda2;

    invoke-direct {v2}, Lcom/pymcl/android/data/AiFixPrompt$$ExternalSyntheticLambda2;-><init>()V

    invoke-virtual {v0, v1, v2}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hidden(Lcom/pymcl/android/ui/state/CrashInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 19
    .param p1, "info"    # Lcom/pymcl/android/ui/state/CrashInfo;
    .param p2, "logPath"    # Ljava/lang/String;
    .param p3, "extra"    # Ljava/lang/String;

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "info"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "logPath"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "extra"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getLogTail()Ljava/util/List;

    move-result-object v2

    const/16 v4, 0x78

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->takeLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/Iterable;

    const-string v2, "\n"

    move-object v6, v2

    check-cast v6, Ljava/lang/CharSequence;

    new-instance v11, Lcom/pymcl/android/data/AiFixPrompt$$ExternalSyntheticLambda0;

    invoke-direct {v11}, Lcom/pymcl/android/data/AiFixPrompt$$ExternalSyntheticLambda0;-><init>()V

    const/16 v12, 0x1e

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v13}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 65
    .local v2, "it\\1":Ljava/lang/String;
    const/4 v5, 0x0

    .line 40
    .local v5, "$i$a$-let-AiFixPrompt$hidden$tail$2\\1\\40\\0":I
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    const/16 v7, 0x2ee0

    if-le v6, v7, :cond_0

    invoke-static {v2, v7}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u2026\uff08\u524d\u9762\u7701\u7565\uff09\n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    move-object v2, v6

    .line 41
    .end local v5    # "$i$a$-let-AiFixPrompt$hidden$tail$2\\1\\40\\0":I
    .local v2, "tail":Ljava/lang/String;
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object v6, v5

    .local v6, "$this$hidden_u24lambda_u242\\2":Ljava/lang/StringBuilder;
    const/4 v7, 0x0

    .line 42
    .local v7, "$i$a$-buildString-AiFixPrompt$hidden$1\\2\\41\\0":I
    const-string v8, "\uff08\u7cfb\u7edf\u9644\u5e26\u7684\u5d29\u6e83\u4e0a\u4e0b\u6587\uff0c\u7528\u6237\u770b\u4e0d\u5230\u8fd9\u6bb5\uff09"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const/16 v9, 0xa

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    const-string v8, "\u5e73\u53f0\uff1a\u5b89\u5353\u7248 PyMCL\uff08\u6e38\u620f\u8fd0\u884c\u5728 FCL \u542f\u52a8\u6865\u4e0a\uff09"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getInstance()Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u5b9e\u4f8b\uff1a"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getVersion()Ljava/lang/String;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 65
    const/4 v8, 0x0

    .line 45
    .local v8, "$i$a$-ifBlank-AiFixPrompt$hidden$1$1\\3\\45\\2":I
    nop

    .end local v8    # "$i$a$-ifBlank-AiFixPrompt$hidden$1$1\\3\\45\\2":I
    const-string v8, "\u672a\u77e5"

    :cond_1
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u7248\u672c\uff1a"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getExitCode()I

    move-result v8

    sget-object v10, Lcom/pymcl/android/data/AiFixPrompt;->INSTANCE:Lcom/pymcl/android/data/AiFixPrompt;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getExitCode()I

    move-result v11

    invoke-virtual {v10, v11}, Lcom/pymcl/android/data/AiFixPrompt;->exitCodeHint(I)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\u9000\u51fa\u7801\uff1a"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v11, "\uff08"

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v10, "\uff09"

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getTitle()Ljava/lang/String;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_2

    .line 65
    const/4 v8, 0x0

    .line 47
    .local v8, "$i$a$-ifBlank-AiFixPrompt$hidden$1$2\\4\\47\\2":I
    nop

    .end local v8    # "$i$a$-ifBlank-AiFixPrompt$hidden$1$2\\4\\47\\2":I
    const-string v8, "\u6e38\u620f\u5f02\u5e38\u9000\u51fa"

    :cond_2
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u73b0\u8c61\uff1a"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getExplain()Ljava/lang/String;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_3

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getExplain()Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u542f\u52a8\u5668\u7684\u5206\u6790\u7ed3\u8bba\uff1a"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    :cond_3
    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getActions()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_4

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getActions()Ljava/util/List;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Ljava/lang/Iterable;

    const-string v8, "\u3001"

    move-object v11, v8

    check-cast v11, Ljava/lang/CharSequence;

    const/16 v17, 0x3e

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v10 .. v18}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u5d29\u6e83\u7a97\u63d0\u4f9b\u7684\u4e00\u952e\u4fee\u590d\uff1a"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    :cond_4
    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getGameDir()Ljava/lang/String;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getGameDir()Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u6e38\u620f\u76ee\u5f55\uff1a"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    :cond_5
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "\u65e5\u5fd7\u6587\u4ef6\uff1a"

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v10, "\uff08\u53ef\u7528 get_latest_log / get_crash_report \u8bfb\u5168\u6587\uff09"

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 52
    move-object v8, v1

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    :cond_6
    const-string v8, "\u63a5\u53e3\u72b6\u6001\uff1a\u6240\u6709\u5de5\u5177\u53ef\u7528\uff1b\u5199\u64cd\u4f5c\u4f1a\u6309\u5f53\u524d\u6743\u9650\u6863\u4f4d\u786e\u8ba4\uff0c\u7528\u6237\u5728\u7a97\u53e3\u91cc\u70b9\u5141\u8bb8\u5373\u53ef\u3002"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    const-string v8, "\u8981\u6c42\uff1a\u5148\u7528 diagnose_launch / get_crash_report / get_latest_log / scan_mod_conflicts \u786e\u8ba4\u539f\u56e0\uff1b\u80fd\u6539\u914d\u7f6e\u3001\u7981\u7528\u6a21\u7ec4\u3001\u5207\u6362 Java \u5c31\u76f4\u63a5\u52a8\u624b\u4fee\uff08\u4f1a\u6309\u6743\u9650\u786e\u8ba4\uff09\uff0c\u4e0d\u8981\u8ba9\u7528\u6237\u81ea\u5df1\u53bb\u6539\u6587\u4ef6\u6216 JVM \u53c2\u6570\uff1b\u4fee\u5b8c\u7b80\u77ed\u8bf4\u660e\u6539\u4e86\u4ec0\u4e48\uff0c\u5e76\u5efa\u8bae\u91cd\u65b0\u542f\u52a8\u3002"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getLogTail()Ljava/util/List;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/collections/CollectionsKt;->takeLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "\u65e5\u5fd7\u622a\u65ad\u6458\u5f55\uff08\u6700\u540e "

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v8, " \u884c\uff09\uff1a"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    const-string v4, "```"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    move-object v8, v2

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 65
    const/4 v8, 0x0

    .line 57
    .local v8, "$i$a$-ifBlank-AiFixPrompt$hidden$1$3\\5\\57\\2":I
    nop

    .end local v8    # "$i$a$-ifBlank-AiFixPrompt$hidden$1$3\\5\\57\\2":I
    const-string v8, "\uff08\u6ca1\u6709\u6355\u83b7\u5230\u8f93\u51fa\uff09"

    :cond_7
    check-cast v8, Ljava/lang/String;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    nop

    .line 41
    .end local v6    # "$this$hidden_u24lambda_u242\\2":Ljava/lang/StringBuilder;
    .end local v7    # "$i$a$-buildString-AiFixPrompt$hidden$1\\2\\41\\0":I
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4
.end method

.method public final visible(Lcom/pymcl/android/ui/state/CrashInfo;)Ljava/lang/String;
    .locals 6
    .param p1, "info"    # Lcom/pymcl/android/ui/state/CrashInfo;

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getScene()Lcom/pymcl/android/ui/state/CrashScene;

    move-result-object v0

    sget-object v1, Lcom/pymcl/android/data/AiFixPrompt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/CrashScene;->ordinal()I

    move-result v0

    aget v0, v1, v0

    .line 22
    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 23
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getTitle()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4e0b\u8f7d/\u5b89\u88c5\u4efb\u52a1\u300c"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\u300d\u51fa\u9519\u4e86\uff1a"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u3002\u5e2e\u6211\u627e\u51fa\u539f\u56e0\u5e76\u5904\u7406\u3002"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2

    .line 25
    :cond_0
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getExitCode()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getExitCode()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5f02\u5e38\u9000\u51fa\uff08\u9000\u51fa\u7801 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\uff09"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, "\u542f\u52a8\u51fa\u95ee\u9898\u4e86"

    :goto_0
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getInstance()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getVersion()Ljava/lang/String;

    move-result-object v2

    .line 65
    move-object v3, v2

    .local v3, "it\\1":Ljava/lang/String;
    const/4 v4, 0x0

    .line 25
    .local v4, "$i$a$-takeIf-AiFixPrompt$visible$1\\1\\25\\0":I
    move-object v5, v3

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    .end local v3    # "it\\1":Ljava/lang/String;
    .end local v4    # "$i$a$-takeIf-AiFixPrompt$visible$1\\1\\25\\0":I
    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_3

    .line 65
    nop

    .local v2, "it\\2":Ljava/lang/String;
    const/4 v3, 0x0

    .line 25
    .local v3, "$i$a$-let-AiFixPrompt$visible$2\\2\\25\\0":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, " \u7248\u672c "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .end local v2    # "it\\2":Ljava/lang/String;
    .end local v3    # "$i$a$-let-AiFixPrompt$visible$2\\2\\25\\0":I
    if-nez v2, :cond_4

    :cond_3
    const-string v2, ""

    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u6e38\u620f"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "\uff1a\u5b9e\u4f8b\u300c"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u300d"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u3002\u5e2e\u6211\u627e\u51fa\u539f\u56e0\u5e76\u4fee\u597d\u3002"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    :goto_2
    return-object v0
.end method
