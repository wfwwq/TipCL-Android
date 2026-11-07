.class public final Lcom/pymcl/ai/AiClient;
.super Ljava/lang/Object;
.source "AiClient.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/ai/AiClient$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiClient.kt\ncom/pymcl/ai/AiClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n1#2:180\n1#2:198\n1739#3:181\n1814#3,3:182\n2068#3,2:185\n1795#3,10:187\n2068#3:197\n2069#3:199\n1805#3:200\n777#3:201\n873#3,2:202\n*S KotlinDebug\n*F\n+ 1 AiClient.kt\ncom/pymcl/ai/AiClient\n*L\n99#1:198\n37#1:181\n37#1:182,3\n74#1:185,2\n99#1:187,10\n99#1:197\n99#1:199\n99#1:200\n100#1:201\n100#1:202,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\u0018\u0000 82\u00020\u0001:\u00018B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\\\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e2\u001e\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"j\u0002`#0!2\u0010\u0010$\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010!2\u0006\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0002\u0010%\u001a\u00020\r2\u0008\u0008\u0002\u0010&\u001a\u00020\u001aJp\u0010\'\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u001e\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"j\u0002`#0!2\u0010\u0010$\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010!2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0*J6\u0010,\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u001e\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"j\u0002`#0!J\u0014\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u001e0!2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010.\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u001e0!2\u0006\u00101\u001a\u00020\u001eJ\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e032\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u000206J\u001c\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001e032\u0006\u00105\u001a\u000206R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018\u00a8\u00069"
    }
    d2 = {
        "Lcom/pymcl/ai/AiClient;",
        "",
        "http",
        "Lcom/pymcl/ai/AiHttp;",
        "<init>",
        "(Lcom/pymcl/ai/AiHttp;)V",
        "builtinHttp",
        "Lcom/pymcl/ai/BuiltinHttpFallback;",
        "getBuiltinHttp",
        "()Lcom/pymcl/ai/BuiltinHttpFallback;",
        "current",
        "Lcom/pymcl/ai/AiLineStream;",
        "cancelled",
        "",
        "cancel",
        "",
        "resetCancel",
        "isCancelled",
        "()Z",
        "rules",
        "Lcom/pymcl/ai/ModelRules;",
        "getRules",
        "()Lcom/pymcl/ai/ModelRules;",
        "setRules",
        "(Lcom/pymcl/ai/ModelRules;)V",
        "capsFor",
        "Lcom/pymcl/ai/ModelCaps;",
        "st",
        "Lcom/pymcl/ai/AiSettings;",
        "model",
        "",
        "buildBody",
        "messages",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "tools",
        "stream",
        "caps",
        "streamChat",
        "Lcom/pymcl/ai/AssistantTurn;",
        "onContent",
        "Lkotlin/Function1;",
        "onReasoning",
        "complete",
        "listModels",
        "endpoint",
        "Lcom/pymcl/ai/AiEndpoint;",
        "parseModels",
        "txt",
        "testConnection",
        "Lkotlin/Pair;",
        "describeError",
        "e",
        "",
        "describeErrorParts",
        "Companion",
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
.field public static final CONNECT_TIMEOUT:I = 0x3a98

.field public static final Companion:Lcom/pymcl/ai/AiClient$Companion;

.field public static final DETAIL_SEP:Ljava/lang/String; = "\n\u8be6\u60c5\uff1a"

.field public static final ONESHOT_TIMEOUT:I = 0x15f90

.field public static final READ_TIMEOUT:I = 0x15f90


# instance fields
.field private final builtinHttp:Lcom/pymcl/ai/BuiltinHttpFallback;

.field private volatile cancelled:Z

.field private volatile current:Lcom/pymcl/ai/AiLineStream;

.field private final http:Lcom/pymcl/ai/AiHttp;

.field private volatile rules:Lcom/pymcl/ai/ModelRules;


# direct methods
.method public static synthetic $r8$lambda$JU8XwlZlFKBlQ3692YhJPhFiM_4(Lcom/pymcl/ai/StreamAccumulator;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/ai/AiClient;->complete$lambda$1(Lcom/pymcl/ai/StreamAccumulator;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$OVAcViIJlplJNia3f1qtVRMzMmI(Lcom/pymcl/ai/StreamAccumulator;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/ai/AiClient;->streamChat$lambda$0(Lcom/pymcl/ai/StreamAccumulator;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SB5-6PsHftG6xbTkJvsvgKSz2Fk(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/ai/AiClient;->listModels$lambda$0(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$X6ZBHwYY7cM5DHe9KINih2KH6f4(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/ai/AiClient;->complete$lambda$0(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$zxCfX-W0lnpxFJYb1GNo4-NdxLQ(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/AiLineStream;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/ai/AiClient;->streamChat$lambda$1(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/AiLineStream;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/ai/AiClient$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/ai/AiClient$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/ai/AiClient;->Companion:Lcom/pymcl/ai/AiClient$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/pymcl/ai/AiClient;-><init>(Lcom/pymcl/ai/AiHttp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/ai/AiHttp;)V
    .locals 1
    .param p1, "http"    # Lcom/pymcl/ai/AiHttp;

    const-string v0, "http"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/AiClient;->http:Lcom/pymcl/ai/AiHttp;

    .line 18
    new-instance v0, Lcom/pymcl/ai/BuiltinHttpFallback;

    invoke-direct {v0}, Lcom/pymcl/ai/BuiltinHttpFallback;-><init>()V

    iput-object v0, p0, Lcom/pymcl/ai/AiClient;->builtinHttp:Lcom/pymcl/ai/BuiltinHttpFallback;

    .line 28
    sget-object v0, Lcom/pymcl/ai/ModelRules;->Companion:Lcom/pymcl/ai/ModelRules$Companion;

    invoke-virtual {v0}, Lcom/pymcl/ai/ModelRules$Companion;->builtin()Lcom/pymcl/ai/ModelRules;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/ai/AiClient;->rules:Lcom/pymcl/ai/ModelRules;

    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/ai/AiHttp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 9
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Lcom/pymcl/ai/UrlConnectionAiHttp;

    invoke-direct {p1}, Lcom/pymcl/ai/UrlConnectionAiHttp;-><init>()V

    check-cast p1, Lcom/pymcl/ai/AiHttp;

    :cond_0
    invoke-direct {p0, p1}, Lcom/pymcl/ai/AiClient;-><init>(Lcom/pymcl/ai/AiHttp;)V

    return-void
.end method

.method public static synthetic buildBody$default(Lcom/pymcl/ai/AiClient;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/pymcl/ai/AiSettings;ZLcom/pymcl/ai/ModelCaps;ILjava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 36
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    const/4 p5, 0x1

    :cond_0
    move v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    invoke-virtual {p0, p4, p1}, Lcom/pymcl/ai/AiClient;->capsFor(Lcom/pymcl/ai/AiSettings;Ljava/lang/String;)Lcom/pymcl/ai/ModelCaps;

    move-result-object p6

    :cond_1
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v6}, Lcom/pymcl/ai/AiClient;->buildBody(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/pymcl/ai/AiSettings;ZLcom/pymcl/ai/ModelCaps;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final complete$lambda$0(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "this$0"    # Lcom/pymcl/ai/AiClient;
    .param p1, "$ep"    # Lcom/pymcl/ai/AiEndpoint;
    .param p2, "$body"    # Ljava/lang/String;
    .param p3, "u"    # Ljava/lang/String;

    const-string v0, "u"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lcom/pymcl/ai/AiClient;->http:Lcom/pymcl/ai/AiHttp;

    invoke-virtual {p1}, Lcom/pymcl/ai/AiEndpoint;->getHeaders()Ljava/util/Map;

    move-result-object v1

    const v2, 0x15f90

    invoke-interface {v0, p3, v1, p2, v2}, Lcom/pymcl/ai/AiHttp;->post(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final complete$lambda$1(Lcom/pymcl/ai/StreamAccumulator;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "$acc"    # Lcom/pymcl/ai/StreamAccumulator;
    .param p1, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/StreamAccumulator;->accept(Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final listModels$lambda$0(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "this$0"    # Lcom/pymcl/ai/AiClient;
    .param p1, "$ep"    # Lcom/pymcl/ai/AiEndpoint;
    .param p2, "u"    # Ljava/lang/String;

    const-string v0, "u"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/pymcl/ai/AiClient;->http:Lcom/pymcl/ai/AiHttp;

    invoke-virtual {p1}, Lcom/pymcl/ai/AiEndpoint;->getHeaders()Ljava/util/Map;

    move-result-object v1

    const/16 v2, 0x3a98

    invoke-interface {v0, p2, v1, v2}, Lcom/pymcl/ai/AiHttp;->get(Ljava/lang/String;Ljava/util/Map;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final streamChat$lambda$0(Lcom/pymcl/ai/StreamAccumulator;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "$acc"    # Lcom/pymcl/ai/StreamAccumulator;
    .param p1, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/StreamAccumulator;->accept(Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final streamChat$lambda$1(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/AiLineStream;
    .locals 7
    .param p0, "this$0"    # Lcom/pymcl/ai/AiClient;
    .param p1, "$ep"    # Lcom/pymcl/ai/AiEndpoint;
    .param p2, "$body"    # Ljava/lang/String;
    .param p3, "u"    # Ljava/lang/String;

    const-string v0, "u"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    iget-object v1, p0, Lcom/pymcl/ai/AiClient;->http:Lcom/pymcl/ai/AiHttp;

    invoke-virtual {p1}, Lcom/pymcl/ai/AiEndpoint;->getHeaders()Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x3a98

    const v6, 0x15f90

    move-object v4, p2

    move-object v2, p3

    .end local p2    # "$body":Ljava/lang/String;
    .end local p3    # "u":Ljava/lang/String;
    .local v2, "u":Ljava/lang/String;
    .local v4, "$body":Ljava/lang/String;
    invoke-interface/range {v1 .. v6}, Lcom/pymcl/ai/AiHttp;->postStream(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;II)Lcom/pymcl/ai/AiLineStream;

    move-result-object p2

    return-object p2
.end method


# virtual methods
.method public final buildBody(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/pymcl/ai/AiSettings;ZLcom/pymcl/ai/ModelCaps;)Ljava/lang/String;
    .locals 16
    .param p1, "model"    # Ljava/lang/String;
    .param p2, "messages"    # Ljava/util/List;
    .param p3, "tools"    # Ljava/util/List;
    .param p4, "st"    # Lcom/pymcl/ai/AiSettings;
    .param p5, "stream"    # Z
    .param p6, "caps"    # Lcom/pymcl/ai/ModelCaps;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/pymcl/ai/AiSettings;",
            "Z",
            "Lcom/pymcl/ai/ModelCaps;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p6

    const-string v4, "model"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "messages"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "st"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "caps"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 181
    .local v7, "$i$f$map":I
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v6, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v6

    .local v9, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 182
    .local v10, "$i$f$mapTo":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 183
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/util/Map;

    .local v13, "it":Ljava/util/Map;
    const/4 v14, 0x0

    .line 37
    .local v14, "$i$a$-map-AiClient$buildBody$msgs$1":I
    sget-object v15, Lcom/pymcl/ai/CapsTrim;->INSTANCE:Lcom/pymcl/ai/CapsTrim;

    invoke-virtual {v15, v13, v3}, Lcom/pymcl/ai/CapsTrim;->stripImages(Ljava/util/Map;Lcom/pymcl/ai/ModelCaps;)Ljava/util/Map;

    move-result-object v13

    .line 183
    .end local v13    # "it":Ljava/util/Map;
    .end local v14    # "$i$a$-map-AiClient$buildBody$msgs$1":I
    invoke-interface {v8, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 184
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapTo":I
    check-cast v8, Ljava/util/List;

    .line 181
    nop

    .line 37
    .end local v6    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map":I
    nop

    .line 38
    .local v8, "msgs":Ljava/util/List;
    const/4 v6, 0x3

    new-array v6, v6, [Lkotlin/Pair;

    invoke-static {v4, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v7, 0x0

    aput-object v4, v6, v7

    move-object v4, v8

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v6, v5

    const-string v4, "stream"

    invoke-static/range {p5 .. p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v9, 0x2

    aput-object v4, v6, v9

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    .line 39
    .local v4, "b":Ljava/util/Map;
    invoke-virtual {v3}, Lcom/pymcl/ai/ModelCaps;->getSupportsTemperature()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v2}, Lcom/pymcl/ai/AiSettings;->getTemperature()D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    const-string v10, "temperature"

    invoke-interface {v4, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    :cond_1
    sget-object v6, Lcom/pymcl/ai/CapsTrim;->INSTANCE:Lcom/pymcl/ai/CapsTrim;

    invoke-virtual {v6, v2, v3}, Lcom/pymcl/ai/CapsTrim;->maxTokens(Lcom/pymcl/ai/AiSettings;Lcom/pymcl/ai/ModelCaps;)I

    move-result v6

    int-to-long v10, v6

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v10, "max_tokens"

    invoke-interface {v4, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    move-object/from16 v6, p3

    check-cast v6, Ljava/util/Collection;

    if-eqz v6, :cond_3

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    move v6, v7

    goto :goto_2

    :cond_3
    :goto_1
    move v6, v5

    :goto_2
    if-nez v6, :cond_4

    invoke-virtual {v3}, Lcom/pymcl/ai/ModelCaps;->getSupportsTools()Z

    move-result v6

    if-eqz v6, :cond_4

    move-object/from16 v6, p3

    check-cast v6, Ljava/util/Collection;

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v6

    const-string v10, "tools"

    invoke-interface {v4, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "tool_choice"

    const-string v10, "auto"

    invoke-interface {v4, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    :cond_4
    if-eqz p5, :cond_5

    new-array v6, v5, [Lkotlin/Pair;

    const-string v10, "include_usage"

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v10, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v6, v7

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    const-string v6, "stream_options"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    :cond_5
    sget-object v5, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v6, 0x0

    invoke-static {v5, v4, v7, v9, v6}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    return-object v5
.end method

.method public final cancel()V
    .locals 3

    .line 23
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/ai/AiClient;->cancelled:Z

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/ai/AiClient;

    .line 180
    .local v0, "$this$cancel_u24lambda_u240":Lcom/pymcl/ai/AiClient;
    const/4 v1, 0x0

    .line 23
    .local v1, "$i$a$-runCatching-AiClient$cancel$1":I
    iget-object v2, v0, Lcom/pymcl/ai/AiClient;->current:Lcom/pymcl/ai/AiLineStream;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lcom/pymcl/ai/AiLineStream;->close()V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .end local v0    # "$this$cancel_u24lambda_u240":Lcom/pymcl/ai/AiClient;
    .end local v1    # "$i$a$-runCatching-AiClient$cancel$1":I
    :goto_0
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-void
.end method

.method public final capsFor(Lcom/pymcl/ai/AiSettings;Ljava/lang/String;)Lcom/pymcl/ai/ModelCaps;
    .locals 3
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;
    .param p2, "model"    # Ljava/lang/String;

    const-string v0, "st"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lcom/pymcl/ai/AiClient;->rules:Lcom/pymcl/ai/ModelRules;

    sget-object v1, Lcom/pymcl/ai/AiEndpoints;->INSTANCE:Lcom/pymcl/ai/AiEndpoints;

    invoke-virtual {v1, p1}, Lcom/pymcl/ai/AiEndpoints;->resolve(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiEndpoint;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/ai/AiEndpoint;->getChatUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getCapsOverrides()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, p2, v1, v2}, Lcom/pymcl/ai/ModelRules;->resolve(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/ai/ModelCaps;

    move-result-object v0

    return-object v0
.end method

.method public final complete(Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 12
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;
    .param p2, "model"    # Ljava/lang/String;
    .param p3, "messages"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiSettings;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "st"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messages"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/AiClient;->endpoint(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiEndpoint;

    move-result-object v0

    .line 71
    .local v0, "ep":Lcom/pymcl/ai/AiEndpoint;
    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v5, p1

    move-object v2, p2

    move-object v3, p3

    .end local p1    # "st":Lcom/pymcl/ai/AiSettings;
    .end local p2    # "model":Ljava/lang/String;
    .end local p3    # "messages":Ljava/util/List;
    .local v2, "model":Ljava/lang/String;
    .local v3, "messages":Ljava/util/List;
    .local v5, "st":Lcom/pymcl/ai/AiSettings;
    invoke-static/range {v1 .. v9}, Lcom/pymcl/ai/AiClient;->buildBody$default(Lcom/pymcl/ai/AiClient;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/pymcl/ai/AiSettings;ZLcom/pymcl/ai/ModelCaps;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 72
    .local p1, "body":Ljava/lang/String;
    iget-object p2, v1, Lcom/pymcl/ai/AiClient;->builtinHttp:Lcom/pymcl/ai/BuiltinHttpFallback;

    invoke-virtual {v0}, Lcom/pymcl/ai/AiEndpoint;->getChatUrl()Ljava/lang/String;

    move-result-object p3

    new-instance v4, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda3;

    invoke-direct {v4, p0, v0, p1}, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda3;-><init>(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;)V

    invoke-virtual {p2, v0, p3, v4}, Lcom/pymcl/ai/BuiltinHttpFallback;->call(Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 74
    .local p2, "txt":Ljava/lang/String;
    move-object p3, p2

    check-cast p3, Ljava/lang/CharSequence;

    invoke-static {p3}, Lkotlin/text/StringsKt;->trimStart(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v4, "data:"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {p3, v4, v6, v7, v8}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, Lcom/pymcl/ai/StreamAccumulator;

    const/4 v4, 0x3

    invoke-direct {p3, v8, v8, v4, v8}, Lcom/pymcl/ai/StreamAccumulator;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .local p3, "acc":Lcom/pymcl/ai/StreamAccumulator;
    new-instance v4, Lcom/pymcl/ai/SseParser;

    new-instance v6, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda4;

    invoke-direct {v6, p3}, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda4;-><init>(Lcom/pymcl/ai/StreamAccumulator;)V

    invoke-direct {v4, v6}, Lcom/pymcl/ai/SseParser;-><init>(Lkotlin/jvm/functions/Function1;)V

    .local v4, "p":Lcom/pymcl/ai/SseParser;
    move-object v6, p2

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Lkotlin/text/StringsKt;->lines(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 185
    .local v7, "$i$f$forEach":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .local v10, "p0":Ljava/lang/String;
    const/4 v11, 0x0

    .line 74
    .local v11, "$i$a$-forEach-AiClient$complete$1":I
    invoke-virtual {v4, v10}, Lcom/pymcl/ai/SseParser;->feed(Ljava/lang/String;)V

    .line 185
    .end local v10    # "p0":Ljava/lang/String;
    .end local v11    # "$i$a$-forEach-AiClient$complete$1":I
    nop

    .end local v9    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 186
    :cond_0
    nop

    .line 74
    .end local v6    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$forEach":I
    invoke-virtual {v4}, Lcom/pymcl/ai/SseParser;->flush()V

    invoke-virtual {p3, v2}, Lcom/pymcl/ai/StreamAccumulator;->result(Ljava/lang/String;)Lcom/pymcl/ai/AssistantTurn;

    move-result-object v6

    invoke-virtual {v6}, Lcom/pymcl/ai/AssistantTurn;->getContent()Ljava/lang/String;

    move-result-object v6

    return-object v6

    .line 75
    .end local v4    # "p":Lcom/pymcl/ai/SseParser;
    .end local p3    # "acc":Lcom/pymcl/ai/StreamAccumulator;
    :cond_1
    sget-object p3, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {p3, p2}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p3

    .line 76
    .local p3, "o":Ljava/util/Map;
    const-string v4, "error"

    invoke-static {p3, v4}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    const-string v6, "message"

    if-eqz v4, :cond_3

    .line 180
    .local v4, "it":Ljava/util/Map;
    const/4 v7, 0x0

    .line 76
    .local v7, "$i$a$-let-AiClient$complete$2":I
    new-instance v8, Lcom/pymcl/ai/AiHttpException;

    invoke-static {v4, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/16 v9, 0xc8

    if-nez v6, :cond_2

    invoke-static {p2, v9}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    :cond_2
    invoke-direct {v8, v9, v6}, Lcom/pymcl/ai/AiHttpException;-><init>(ILjava/lang/String;)V

    throw v8

    .line 77
    .end local v4    # "it":Ljava/util/Map;
    .end local v7    # "$i$a$-let-AiClient$complete$2":I
    :cond_3
    const-string v4, "choices"

    invoke-static {p3, v4}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    if-eqz v4, :cond_4

    invoke-static {v4, v6}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    if-eqz v4, :cond_4

    const-string v6, "content"

    invoke-static {v4, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_5

    :cond_4
    const-string v4, ""

    :cond_5
    return-object v4
.end method

.method public final describeError(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 4
    .param p1, "e"    # Ljava/lang/Throwable;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/AiClient;->describeErrorParts(Ljava/lang/Throwable;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .local v1, "friendly":Ljava/lang/String;
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 125
    .local v0, "detail":Ljava/lang/String;
    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    if-eqz v2, :cond_1

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-nez v2, :cond_3

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n\u8be6\u60c5\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_3
    :goto_2
    move-object v2, v1

    :goto_3
    return-object v2
.end method

.method public final describeErrorParts(Ljava/lang/Throwable;)Lkotlin/Pair;
    .locals 6
    .param p1, "e"    # Ljava/lang/Throwable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    const/16 v1, 0x190

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 130
    .local v0, "raw":Ljava/lang/String;
    nop

    .line 131
    instance-of v1, p1, Lcom/pymcl/ai/AiConfigException;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto/16 :goto_5

    .line 132
    :cond_1
    instance-of v1, p1, Lcom/pymcl/ai/AiHttpException;

    const/4 v3, 0x0

    if-eqz v1, :cond_a

    move-object v1, p1

    check-cast v1, Lcom/pymcl/ai/AiHttpException;

    invoke-virtual {v1}, Lcom/pymcl/ai/AiHttpException;->getCode()I

    move-result v1

    .line 133
    const/16 v4, 0x191

    const/16 v5, 0xc8

    if-eq v1, v4, :cond_8

    const/16 v4, 0x193

    if-ne v1, v4, :cond_2

    goto/16 :goto_0

    .line 134
    :cond_2
    const/16 v4, 0x194

    if-ne v1, v4, :cond_3

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v4, "\u63a5\u53e3\u5730\u5740\u4e0d\u5bf9\uff08HTTP 404\uff09\uff0c\u8bf7\u68c0\u67e5\u7aef\u70b9\u5730\u5740"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v3}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_1

    .line 135
    :cond_3
    const/16 v4, 0x1ad

    if-ne v1, v4, :cond_4

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v4, "\u8bf7\u6c42\u592a\u9891\u7e41\u6216\u989d\u5ea6\u7528\u5b8c\uff08HTTP 429\uff09"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v3}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_1

    .line 136
    :cond_4
    const/16 v4, 0x1f4

    if-gt v4, v1, :cond_5

    const/16 v4, 0x258

    if-ge v1, v4, :cond_5

    const/4 v3, 0x1

    :cond_5
    if-eqz v3, :cond_6

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    move-object v3, p1

    check-cast v3, Lcom/pymcl/ai/AiHttpException;

    invoke-virtual {v3}, Lcom/pymcl/ai/AiHttpException;->getCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "\u670d\u52a1\u7aef\u51fa\u9519\uff08HTTP {0}\uff09"

    invoke-virtual {v1, v4, v3}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 137
    :cond_6
    move-object v1, p1

    check-cast v1, Lcom/pymcl/ai/AiHttpException;

    invoke-virtual {v1}, Lcom/pymcl/ai/AiHttpException;->getCode()I

    move-result v1

    if-ne v1, v5, :cond_7

    move-object v1, p1

    check-cast v1, Lcom/pymcl/ai/AiHttpException;

    invoke-virtual {v1}, Lcom/pymcl/ai/AiHttpException;->getBody()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    move-object v3, p1

    check-cast v3, Lcom/pymcl/ai/AiHttpException;

    invoke-virtual {v3}, Lcom/pymcl/ai/AiHttpException;->getBody()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "\u670d\u52a1\u7aef\u8fd4\u56de\u9519\u8bef\uff1a{0}"

    invoke-virtual {v1, v4, v3}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_7
    move-object v1, p1

    check-cast v1, Lcom/pymcl/ai/AiHttpException;

    invoke-virtual {v1}, Lcom/pymcl/ai/AiHttpException;->getCode()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HTTP "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 133
    :cond_8
    :goto_0
    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    move-object v3, p1

    check-cast v3, Lcom/pymcl/ai/AiHttpException;

    invoke-virtual {v3}, Lcom/pymcl/ai/AiHttpException;->getCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "\u9274\u6743\u5931\u8d25\uff08HTTP {0}\uff09\uff0c\u8bf7\u68c0\u67e5 API Key"

    invoke-virtual {v1, v4, v3}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 138
    :goto_1
    move-object v3, p1

    check-cast v3, Lcom/pymcl/ai/AiHttpException;

    invoke-virtual {v3}, Lcom/pymcl/ai/AiHttpException;->getCode()I

    move-result v3

    if-ne v3, v5, :cond_9

    goto :goto_2

    :cond_9
    move-object v2, v0

    .line 132
    :goto_2
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto/16 :goto_5

    .line 139
    :cond_a
    sget-object v1, Lcom/pymcl/ai/NetErrors;->INSTANCE:Lcom/pymcl/ai/NetErrors;

    invoke-virtual {v1, p1}, Lcom/pymcl/ai/NetErrors;->isTls(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v2, "\u65e0\u6cd5\u5efa\u7acb\u5b89\u5168\u8fde\u63a5\uff08HTTPS/TLS \u63e1\u624b\u5931\u8d25\uff09\uff0c\u53ef\u5c1d\u8bd5\u6539\u7528 http:// \u5730\u5740"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto/16 :goto_5

    .line 140
    :cond_b
    sget-object v1, Lcom/pymcl/ai/NetErrors;->INSTANCE:Lcom/pymcl/ai/NetErrors;

    invoke-virtual {v1, p1}, Lcom/pymcl/ai/NetErrors;->isCleartextBlocked(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_c

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v2, "\u7cfb\u7edf\u62d2\u7edd\u4e86\u660e\u6587 HTTP \u8fde\u63a5\uff0c\u8bf7\u6539\u7528 https:// \u5730\u5740"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_5

    .line 141
    :cond_c
    instance-of v1, p1, Ljava/net/SocketTimeoutException;

    if-eqz v1, :cond_d

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v2, "\u8fde\u63a5\u8d85\u65f6"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_5

    .line 142
    :cond_d
    instance-of v1, p1, Ljava/net/UnknownHostException;

    if-eqz v1, :cond_f

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_e

    const-string v3, ""

    :cond_e
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "\u65e0\u6cd5\u89e3\u6790\u57df\u540d\uff1a{0}"

    invoke-virtual {v1, v4, v3}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_5

    .line 143
    :cond_f
    instance-of v1, p1, Ljava/net/ConnectException;

    if-nez v1, :cond_13

    instance-of v1, p1, Ljava/net/NoRouteToHostException;

    if-eqz v1, :cond_10

    goto :goto_4

    .line 144
    :cond_10
    instance-of v1, p1, Ljava/net/MalformedURLException;

    if-nez v1, :cond_12

    instance-of v1, p1, Ljava/lang/IllegalArgumentException;

    if-eqz v1, :cond_11

    goto :goto_3

    .line 145
    :cond_11
    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_5

    .line 144
    :cond_12
    :goto_3
    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v2, "\u5730\u5740\u683c\u5f0f\u4e0d\u5bf9\uff0c\u8bf7\u68c0\u67e5\u7aef\u70b9\u5730\u5740"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_5

    .line 143
    :cond_13
    :goto_4
    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v2, "\u8fde\u4e0d\u4e0a\u670d\u52a1\u5668\uff0c\u8bf7\u68c0\u67e5\u5730\u5740\u3001\u7aef\u53e3\u548c\u7f51\u7edc"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 130
    :goto_5
    return-object v1
.end method

.method public final endpoint(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiEndpoint;
    .locals 4
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;

    .line 87
    const-string v0, "st"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/pymcl/ai/AiEndpoints;->INSTANCE:Lcom/pymcl/ai/AiEndpoints;

    invoke-virtual {v0, p1}, Lcom/pymcl/ai/AiEndpoints;->resolve(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiEndpoint;

    move-result-object v0

    .local v0, "ep":Lcom/pymcl/ai/AiEndpoint;
    invoke-virtual {v0}, Lcom/pymcl/ai/AiEndpoint;->getProblem()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    return-object v0

    .line 180
    .local v1, "it":Ljava/lang/String;
    :cond_0
    const/4 v2, 0x0

    .line 87
    .local v2, "$i$a$-let-AiClient$endpoint$1":I
    new-instance v3, Lcom/pymcl/ai/AiConfigException;

    invoke-direct {v3, v1}, Lcom/pymcl/ai/AiConfigException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method public final getBuiltinHttp()Lcom/pymcl/ai/BuiltinHttpFallback;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/ai/AiClient;->builtinHttp:Lcom/pymcl/ai/BuiltinHttpFallback;

    return-object v0
.end method

.method public final getRules()Lcom/pymcl/ai/ModelRules;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/pymcl/ai/AiClient;->rules:Lcom/pymcl/ai/ModelRules;

    return-object v0
.end method

.method public final isCancelled()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lcom/pymcl/ai/AiClient;->cancelled:Z

    return v0
.end method

.method public final listModels(Lcom/pymcl/ai/AiSettings;)Ljava/util/List;
    .locals 4
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiSettings;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "st"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/AiClient;->endpoint(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiEndpoint;

    move-result-object v0

    .line 83
    .local v0, "ep":Lcom/pymcl/ai/AiEndpoint;
    iget-object v1, p0, Lcom/pymcl/ai/AiClient;->builtinHttp:Lcom/pymcl/ai/BuiltinHttpFallback;

    invoke-virtual {v0}, Lcom/pymcl/ai/AiEndpoint;->getModelsUrl()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda2;

    invoke-direct {v3, p0, v0}, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda2;-><init>(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;)V

    invoke-virtual {v1, v0, v2, v3}, Lcom/pymcl/ai/BuiltinHttpFallback;->call(Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/pymcl/ai/AiClient;->parseModels(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method public final parseModels(Ljava/lang/String;)Ljava/util/List;
    .locals 18
    .param p1, "txt"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "txt"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 91
    .local v1, "t":Ljava/lang/String;
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-eqz v2, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    return-object v2

    .line 92
    :cond_1
    const-string v2, "{"

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "["

    invoke-static {v1, v2, v3, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v2, Ljava/io/IOException;

    sget-object v3, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const/16 v4, 0x50

    invoke-static {v1, v4}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "\u6a21\u578b\u5217\u8868\u4e0d\u662f JSON\uff08\u5730\u5740\u53ef\u80fd\u4e0d\u5bf9\uff09\uff1a{0}"

    invoke-virtual {v3, v5, v4}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 93
    :cond_3
    :goto_1
    sget-object v2, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v2, v1}, Lcom/pymcl/core/util/Json;->parse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 94
    .local v2, "v":Ljava/lang/Object;
    nop

    .line 95
    instance-of v3, v2, Ljava/util/List;

    if-eqz v3, :cond_4

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    goto :goto_4

    .line 96
    :cond_4
    instance-of v3, v2, Ljava/util/Map;

    if-eqz v3, :cond_7

    move-object v3, v2

    check-cast v3, Ljava/util/Map;

    const-string v4, "data"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/util/List;

    if-eqz v4, :cond_5

    check-cast v3, Ljava/util/List;

    goto :goto_2

    :cond_5
    move-object v3, v5

    :goto_2
    if-nez v3, :cond_8

    move-object v3, v2

    check-cast v3, Ljava/util/Map;

    const-string v4, "models"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/util/List;

    if-eqz v4, :cond_6

    check-cast v3, Ljava/util/List;

    goto :goto_3

    :cond_6
    move-object v3, v5

    :goto_3
    if-nez v3, :cond_8

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_4

    .line 97
    :cond_7
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    .line 94
    :cond_8
    :goto_4
    nop

    .line 99
    .local v3, "arr":Ljava/util/List;
    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 187
    .local v6, "$i$f$mapNotNull":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v4

    .local v8, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 196
    .local v9, "$i$f$mapNotNullTo":I
    move-object v10, v8

    .local v10, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 197
    .local v11, "$i$f$forEach":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_e

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .local v13, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    .local v14, "element$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 196
    .local v15, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v16, v14

    .local v16, "e":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 99
    .local v17, "$i$a$-mapNotNull-AiClient$parseModels$1":I
    move-object/from16 v5, v16

    .end local v16    # "e":Ljava/lang/Object;
    .local v5, "e":Ljava/lang/Object;
    instance-of v0, v5, Ljava/lang/String;

    if-eqz v0, :cond_9

    move-object v0, v5

    check-cast v0, Ljava/lang/String;

    move-object/from16 v16, v1

    goto :goto_6

    :cond_9
    instance-of v0, v5, Ljava/util/Map;

    if-eqz v0, :cond_b

    move-object v0, v5

    check-cast v0, Ljava/util/Map;

    move-object/from16 v16, v1

    .end local v1    # "t":Ljava/lang/String;
    .local v16, "t":Ljava/lang/String;
    const-string v1, "id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_a

    move-object v0, v5

    check-cast v0, Ljava/util/Map;

    const-string v1, "name"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_a

    move-object v0, v5

    check-cast v0, Ljava/util/Map;

    const-string v1, "model"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_a
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_c

    check-cast v0, Ljava/lang/String;

    goto :goto_6

    .end local v16    # "t":Ljava/lang/String;
    .restart local v1    # "t":Ljava/lang/String;
    :cond_b
    move-object/from16 v16, v1

    .end local v1    # "t":Ljava/lang/String;
    .restart local v16    # "t":Ljava/lang/String;
    :cond_c
    const/4 v0, 0x0

    .line 196
    .end local v5    # "e":Ljava/lang/Object;
    .end local v17    # "$i$a$-mapNotNull-AiClient$parseModels$1":I
    :goto_6
    if-eqz v0, :cond_d

    .line 198
    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 196
    .local v1, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v7, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 197
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v1    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v14    # "element$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_d
    move-object/from16 v0, p1

    move-object/from16 v1, v16

    const/4 v5, 0x0

    .end local v13    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_5

    .line 199
    .end local v16    # "t":Ljava/lang/String;
    .local v1, "t":Ljava/lang/String;
    :cond_e
    move-object/from16 v16, v1

    .line 200
    .end local v1    # "t":Ljava/lang/String;
    .end local v10    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$forEach":I
    .restart local v16    # "t":Ljava/lang/String;
    nop

    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$mapNotNullTo":I
    move-object v0, v7

    check-cast v0, Ljava/util/List;

    .line 187
    nop

    .end local v4    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapNotNull":I
    check-cast v0, Ljava/lang/Iterable;

    .line 100
    nop

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 201
    .local v1, "$i$f$filter":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v0

    .local v5, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 202
    .local v6, "$i$f$filterTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_f
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 100
    .local v10, "$i$a$-filter-AiClient$parseModels$2":I
    move-object v11, v9

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v11}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v11

    .line 202
    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-filter-AiClient$parseModels$2":I
    if-nez v11, :cond_f

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 203
    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    :cond_10
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filterTo":I
    check-cast v4, Ljava/util/List;

    .line 201
    nop

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filter":I
    check-cast v4, Ljava/lang/Iterable;

    .line 100
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 99
    return-object v0
.end method

.method public final resetCancel()V
    .locals 1

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pymcl/ai/AiClient;->cancelled:Z

    return-void
.end method

.method public final setRules(Lcom/pymcl/ai/ModelRules;)V
    .locals 1
    .param p1, "<set-?>"    # Lcom/pymcl/ai/ModelRules;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iput-object p1, p0, Lcom/pymcl/ai/AiClient;->rules:Lcom/pymcl/ai/ModelRules;

    return-void
.end method

.method public final streamChat(Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/ai/AssistantTurn;
    .locals 16
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;
    .param p2, "model"    # Ljava/lang/String;
    .param p3, "messages"    # Ljava/util/List;
    .param p4, "tools"    # Ljava/util/List;
    .param p5, "onContent"    # Lkotlin/jvm/functions/Function1;
    .param p6, "onReasoning"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiSettings;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/pymcl/ai/AssistantTurn;"
        }
    .end annotation

    move-object/from16 v2, p2

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    const-string v0, "st"

    move-object/from16 v5, p1

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messages"

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onContent"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onReasoning"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-virtual/range {p0 .. p1}, Lcom/pymcl/ai/AiClient;->endpoint(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiEndpoint;

    move-result-object v12

    .line 49
    .local v12, "ep":Lcom/pymcl/ai/AiEndpoint;
    new-instance v0, Lcom/pymcl/ai/StreamAccumulator;

    invoke-direct {v0, v10, v11}, Lcom/pymcl/ai/StreamAccumulator;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    move-object v13, v0

    .line 50
    .local v13, "acc":Lcom/pymcl/ai/StreamAccumulator;
    new-instance v0, Lcom/pymcl/ai/SseParser;

    new-instance v1, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda0;

    invoke-direct {v1, v13}, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/ai/StreamAccumulator;)V

    invoke-direct {v0, v1}, Lcom/pymcl/ai/SseParser;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v14, v0

    .line 51
    .local v14, "parser":Lcom/pymcl/ai/SseParser;
    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p4

    invoke-static/range {v1 .. v9}, Lcom/pymcl/ai/AiClient;->buildBody$default(Lcom/pymcl/ai/AiClient;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/pymcl/ai/AiSettings;ZLcom/pymcl/ai/ModelCaps;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 52
    .local v6, "body":Ljava/lang/String;
    iget-object v0, v1, Lcom/pymcl/ai/AiClient;->builtinHttp:Lcom/pymcl/ai/BuiltinHttpFallback;

    invoke-virtual {v12}, Lcom/pymcl/ai/AiEndpoint;->getChatUrl()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda1;

    invoke-direct {v4, v1, v12, v6}, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;)V

    invoke-virtual {v0, v12, v3, v4}, Lcom/pymcl/ai/BuiltinHttpFallback;->call(Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/pymcl/ai/AiLineStream;

    .line 53
    .local v3, "s":Lcom/pymcl/ai/AiLineStream;
    iput-object v3, v1, Lcom/pymcl/ai/AiClient;->current:Lcom/pymcl/ai/AiLineStream;

    .line 54
    nop

    .line 55
    :cond_0
    const/4 v4, 0x0

    :try_start_0
    iget-boolean v0, v1, Lcom/pymcl/ai/AiClient;->cancelled:Z

    if-nez v0, :cond_2

    .line 56
    invoke-interface {v3}, Lcom/pymcl/ai/AiLineStream;->readLine()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 57
    .local v0, "line":Ljava/lang/String;
    :cond_1
    invoke-virtual {v14, v0}, Lcom/pymcl/ai/SseParser;->feed(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v13}, Lcom/pymcl/ai/StreamAccumulator;->getDone()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 60
    .end local v0    # "line":Ljava/lang/String;
    :cond_2
    :goto_0
    invoke-virtual {v14}, Lcom/pymcl/ai/SseParser;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 63
    iput-object v4, v1, Lcom/pymcl/ai/AiClient;->current:Lcom/pymcl/ai/AiLineStream;

    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/AiClient;

    .line 180
    .local v0, "$this$streamChat_u24lambda_u242":Lcom/pymcl/ai/AiClient;
    const/4 v4, 0x0

    .line 63
    .local v4, "$i$a$-runCatching-AiClient$streamChat$1":I
    invoke-interface {v3}, Lcom/pymcl/ai/AiLineStream;->close()V

    .end local v0    # "$this$streamChat_u24lambda_u242":Lcom/pymcl/ai/AiClient;
    .end local v4    # "$i$a$-runCatching-AiClient$streamChat$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    :goto_1
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v5, v0

    goto :goto_6

    .line 61
    :catch_0
    move-exception v0

    .line 62
    .local v0, "e":Ljava/io/IOException;
    :try_start_2
    iget-boolean v5, v1, Lcom/pymcl/ai/AiClient;->cancelled:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v5, :cond_7

    .line 63
    .end local v0    # "e":Ljava/io/IOException;
    iput-object v4, v1, Lcom/pymcl/ai/AiClient;->current:Lcom/pymcl/ai/AiLineStream;

    :try_start_3
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    .line 180
    .local v0, "$this$streamChat_u24lambda_u242":Lcom/pymcl/ai/AiClient;
    const/4 v4, 0x0

    .line 63
    .restart local v4    # "$i$a$-runCatching-AiClient$streamChat$1":I
    invoke-interface {v3}, Lcom/pymcl/ai/AiLineStream;->close()V

    .end local v0    # "$this$streamChat_u24lambda_u242":Lcom/pymcl/ai/AiClient;
    .end local v4    # "$i$a$-runCatching-AiClient$streamChat$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_1

    .line 64
    :goto_2
    invoke-virtual {v13}, Lcom/pymcl/ai/StreamAccumulator;->getError()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 180
    .local v0, "it":Ljava/lang/String;
    const/4 v4, 0x0

    .line 64
    .local v4, "$i$a$-let-AiClient$streamChat$2":I
    invoke-virtual {v13, v2}, Lcom/pymcl/ai/StreamAccumulator;->result(Ljava/lang/String;)Lcom/pymcl/ai/AssistantTurn;

    move-result-object v5

    .line 180
    .local v5, "r":Lcom/pymcl/ai/AssistantTurn;
    const/4 v7, 0x0

    .line 64
    .local v7, "$i$a$-let-AiClient$streamChat$2$1":I
    invoke-virtual {v5}, Lcom/pymcl/ai/AssistantTurn;->getContent()Ljava/lang/String;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v8

    const/4 v9, 0x1

    const/4 v15, 0x0

    if-nez v8, :cond_3

    move v8, v9

    goto :goto_3

    :cond_3
    move v8, v15

    :goto_3
    if-eqz v8, :cond_4

    invoke-virtual {v5}, Lcom/pymcl/ai/AssistantTurn;->getToolCalls()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_4

    :cond_4
    move v9, v15

    .end local v5    # "r":Lcom/pymcl/ai/AssistantTurn;
    .end local v7    # "$i$a$-let-AiClient$streamChat$2$1":I
    :goto_4
    if-nez v9, :cond_5

    .end local v0    # "it":Ljava/lang/String;
    .end local v4    # "$i$a$-let-AiClient$streamChat$2":I
    goto :goto_5

    .restart local v0    # "it":Ljava/lang/String;
    .restart local v4    # "$i$a$-let-AiClient$streamChat$2":I
    :cond_5
    new-instance v5, Lcom/pymcl/ai/AiHttpException;

    const/16 v7, 0xc8

    invoke-direct {v5, v7, v0}, Lcom/pymcl/ai/AiHttpException;-><init>(ILjava/lang/String;)V

    throw v5

    .line 65
    .end local v0    # "it":Ljava/lang/String;
    .end local v4    # "$i$a$-let-AiClient$streamChat$2":I
    :cond_6
    :goto_5
    invoke-virtual {v13, v2}, Lcom/pymcl/ai/StreamAccumulator;->result(Ljava/lang/String;)Lcom/pymcl/ai/AssistantTurn;

    move-result-object v0

    return-object v0

    .line 62
    .end local v3    # "s":Lcom/pymcl/ai/AiLineStream;
    .end local v6    # "body":Ljava/lang/String;
    .end local v12    # "ep":Lcom/pymcl/ai/AiEndpoint;
    .end local v13    # "acc":Lcom/pymcl/ai/StreamAccumulator;
    .end local v14    # "parser":Lcom/pymcl/ai/SseParser;
    .end local p1    # "st":Lcom/pymcl/ai/AiSettings;
    .end local p2    # "model":Ljava/lang/String;
    .end local p3    # "messages":Ljava/util/List;
    .end local p4    # "tools":Ljava/util/List;
    .end local p5    # "onContent":Lkotlin/jvm/functions/Function1;
    .end local p6    # "onReasoning":Lkotlin/jvm/functions/Function1;
    .local v0, "e":Ljava/io/IOException;
    :cond_7
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 63
    .end local v0    # "e":Ljava/io/IOException;
    .restart local v3    # "s":Lcom/pymcl/ai/AiLineStream;
    .restart local v6    # "body":Ljava/lang/String;
    .restart local v12    # "ep":Lcom/pymcl/ai/AiEndpoint;
    .restart local v13    # "acc":Lcom/pymcl/ai/StreamAccumulator;
    .restart local v14    # "parser":Lcom/pymcl/ai/SseParser;
    .restart local p1    # "st":Lcom/pymcl/ai/AiSettings;
    .restart local p2    # "model":Ljava/lang/String;
    .restart local p3    # "messages":Ljava/util/List;
    .restart local p4    # "tools":Ljava/util/List;
    .restart local p5    # "onContent":Lkotlin/jvm/functions/Function1;
    .restart local p6    # "onReasoning":Lkotlin/jvm/functions/Function1;
    :goto_6
    iput-object v4, v1, Lcom/pymcl/ai/AiClient;->current:Lcom/pymcl/ai/AiLineStream;

    :try_start_5
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    .line 180
    .local v0, "$this$streamChat_u24lambda_u242":Lcom/pymcl/ai/AiClient;
    const/4 v4, 0x0

    .line 63
    .local v4, "$i$a$-runCatching-AiClient$streamChat$1":I
    invoke-interface {v3}, Lcom/pymcl/ai/AiLineStream;->close()V

    .end local v0    # "$this$streamChat_u24lambda_u242":Lcom/pymcl/ai/AiClient;
    .end local v4    # "$i$a$-runCatching-AiClient$streamChat$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_7
    throw v5
.end method

.method public final testConnection(Lcom/pymcl/ai/AiSettings;)Lkotlin/Pair;
    .locals 27
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiSettings;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v2, p1

    const-string v0, "st"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    sget-object v0, Lcom/pymcl/ai/AiEndpoints;->INSTANCE:Lcom/pymcl/ai/AiEndpoints;

    invoke-virtual {v0, v2}, Lcom/pymcl/ai/AiEndpoints;->validate(Lcom/pymcl/ai/AiSettings;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v0, :cond_0

    .line 180
    .local v0, "it":Ljava/lang/String;
    const/4 v3, 0x0

    .line 105
    .local v3, "$i$a$-let-AiClient$testConnection$1":I
    invoke-static {v4, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    return-object v4

    .line 106
    .end local v0    # "it":Ljava/lang/String;
    .end local v3    # "$i$a$-let-AiClient$testConnection$1":I
    :cond_0
    invoke-virtual {v2}, Lcom/pymcl/ai/AiSettings;->getModel()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/16 v19, 0x1

    if-nez v5, :cond_1

    move/from16 v5, v19

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    if-eqz v5, :cond_2

    .line 180
    const/4 v0, 0x0

    .line 106
    .local v0, "$i$a$-ifEmpty-AiClient$testConnection$model$1":I
    nop

    .end local v0    # "$i$a$-ifEmpty-AiClient$testConnection$model$1":I
    const-string v0, "deepseek-v4-flash"

    :cond_2
    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 107
    .local v5, "model":Ljava/lang/String;
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/ai/AiClient;

    .line 180
    .local v0, "$this$testConnection_u24lambda_u242":Lcom/pymcl/ai/AiClient;
    const/4 v6, 0x0

    .line 107
    .local v6, "$i$a$-runCatching-AiClient$testConnection$models$1":I
    invoke-virtual {v0, v2}, Lcom/pymcl/ai/AiClient;->listModels(Lcom/pymcl/ai/AiSettings;)Ljava/util/List;

    move-result-object v7

    .end local v0    # "$this$testConnection_u24lambda_u242":Lcom/pymcl/ai/AiClient;
    .end local v6    # "$i$a$-runCatching-AiClient$testConnection$models$1":I
    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    move-object/from16 v20, v0

    .line 108
    .local v20, "models":Ljava/lang/Object;
    invoke-static/range {v20 .. v20}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static/range {v20 .. v20}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, v20

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 109
    invoke-static/range {v20 .. v20}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, v20

    check-cast v0, Ljava/util/List;

    .line 110
    .local v0, "m":Ljava/util/List;
    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v0, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v4, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "\u8fde\u63a5\u6210\u529f\uff0c\u6a21\u578b {0} \u53ef\u7528\uff08\u5171 {1} \u4e2a\u6a21\u578b\uff09"

    invoke-virtual {v4, v7, v6}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_3
    sget-object v4, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v6, v5}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "\u8fde\u63a5\u6210\u529f\uff08\u5171 {0} \u4e2a\u6a21\u578b\uff09\uff0c\u4f46\u5217\u8868\u91cc\u6ca1\u6709 {1}"

    invoke-virtual {v4, v7, v6}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object/from16 v4, p0

    move-object v9, v5

    .end local v0    # "m":Ljava/util/List;
    goto/16 :goto_8

    .line 111
    :cond_4
    const/4 v6, 0x2

    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/ai/AiClient;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .local v0, "$this$testConnection_u24lambda_u243":Lcom/pymcl/ai/AiClient;
    const/16 v21, 0x0

    .line 112
    .local v21, "$i$a$-runCatching-AiClient$testConnection$r$1":I
    const/16 v17, 0x1eff

    const/16 v18, 0x0

    move v7, v3

    const/4 v3, 0x0

    move-object v8, v4

    const/4 v4, 0x0

    move-object v9, v5

    .end local v5    # "model":Ljava/lang/String;
    .local v9, "model":Ljava/lang/String;
    const/4 v5, 0x0

    move v10, v6

    const/4 v6, 0x0

    move v11, v7

    const/4 v7, 0x0

    move-object v12, v8

    const/4 v8, 0x0

    move-object v13, v9

    .end local v9    # "model":Ljava/lang/String;
    .local v13, "model":Ljava/lang/String;
    const/4 v9, 0x0

    move v14, v10

    const/4 v10, 0x0

    move v15, v11

    const/16 v11, 0x10

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v22, v13

    move/from16 v23, v14

    .end local v13    # "model":Ljava/lang/String;
    .local v22, "model":Ljava/lang/String;
    const-wide/16 v13, 0x0

    move/from16 v24, v15

    const/4 v15, 0x0

    move-object/from16 v25, v16

    const/16 v16, 0x0

    move/from16 v1, v23

    move-object/from16 v26, v25

    :try_start_2
    invoke-static/range {v2 .. v18}, Lcom/pymcl/ai/AiSettings;->copy$default(Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;DLjava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/ai/AiSettings;

    move-result-object v3

    new-array v2, v1, [Lkotlin/Pair;

    const-string v4, "role"

    const-string v5, "user"

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v2, v24

    const-string v4, "content"

    const-string v5, "ping"

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v2, v19

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v9, v22

    .end local v22    # "model":Ljava/lang/String;
    .restart local v9    # "model":Ljava/lang/String;
    :try_start_3
    invoke-virtual {v0, v3, v9, v2}, Lcom/pymcl/ai/AiClient;->complete(Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    .line 113
    .local v2, "c":Ljava/lang/String;
    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    sget-object v4, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v5, "\u8fde\u63a5\u6210\u529f\uff08\u6a21\u578b\u56de\u590d {0}\uff09"

    const/16 v6, 0x14

    invoke-static {v2, v6}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_5

    move/from16 v7, v19

    goto :goto_3

    :cond_5
    move/from16 v7, v24

    :goto_3
    if-eqz v7, :cond_6

    .line 180
    const/4 v6, 0x0

    .line 113
    .local v6, "$i$a$-ifEmpty-AiClient$testConnection$r$1$1":I
    sget-object v7, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v8, "\u7a7a"

    move/from16 v15, v24

    new-array v10, v15, [Ljava/lang/Object;

    invoke-virtual {v7, v8, v10}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    move-object v6, v7

    .end local v6    # "$i$a$-ifEmpty-AiClient$testConnection$r$1$1":I
    :cond_6
    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    .line 111
    .end local v0    # "$this$testConnection_u24lambda_u243":Lcom/pymcl/ai/AiClient;
    .end local v2    # "c":Ljava/lang/String;
    .end local v21    # "$i$a$-runCatching-AiClient$testConnection$r$1":I
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_4

    .end local v9    # "model":Ljava/lang/String;
    .restart local v22    # "model":Ljava/lang/String;
    :catchall_2
    move-exception v0

    move-object/from16 v9, v22

    .end local v22    # "model":Ljava/lang/String;
    .restart local v9    # "model":Ljava/lang/String;
    goto :goto_4

    .end local v9    # "model":Ljava/lang/String;
    .restart local v5    # "model":Ljava/lang/String;
    :catchall_3
    move-exception v0

    move-object/from16 v26, v4

    move-object v9, v5

    move v1, v6

    .end local v5    # "model":Ljava/lang/String;
    .restart local v9    # "model":Ljava/lang/String;
    :goto_4
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 114
    :goto_5
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_7

    move-object/from16 v4, p0

    goto :goto_7

    .local v2, "e":Ljava/lang/Throwable;
    :cond_7
    const/4 v0, 0x0

    .line 116
    .local v0, "$i$a$-getOrElse-AiClient$testConnection$r$2":I
    invoke-static/range {v20 .. v20}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    .line 117
    .local v3, "first":Ljava/lang/Throwable;
    instance-of v4, v3, Lcom/pymcl/ai/AiHttpException;

    if-eqz v4, :cond_8

    new-array v1, v1, [Ljava/lang/Integer;

    const/16 v4, 0x191

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v24, 0x0

    aput-object v4, v1, v24

    const/16 v4, 0x193

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v19

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    move-object v4, v3

    check-cast v4, Lcom/pymcl/ai/AiHttpException;

    invoke-virtual {v4}, Lcom/pymcl/ai/AiHttpException;->getCode()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    instance-of v1, v2, Lcom/pymcl/ai/AiHttpException;

    if-nez v1, :cond_8

    move-object v1, v3

    goto :goto_6

    :cond_8
    move-object v1, v2

    :goto_6
    move-object/from16 v4, p0

    invoke-virtual {v4, v1}, Lcom/pymcl/ai/AiClient;->describeError(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v8, v26

    invoke-static {v8, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    move-object v0, v1

    .line 114
    .end local v0    # "$i$a$-getOrElse-AiClient$testConnection$r$2":I
    .end local v2    # "e":Ljava/lang/Throwable;
    .end local v3    # "first":Ljava/lang/Throwable;
    :goto_7
    check-cast v0, Lkotlin/Pair;

    .line 108
    :goto_8
    nop

    .line 119
    .local v0, "r":Lkotlin/Pair;
    iget-object v1, v4, Lcom/pymcl/ai/AiClient;->builtinHttp:Lcom/pymcl/ai/BuiltinHttpFallback;

    invoke-virtual {v1}, Lcom/pymcl/ai/BuiltinHttpFallback;->takeNotice()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 180
    .local v1, "it":Ljava/lang/String;
    const/4 v2, 0x0

    .line 119
    .local v2, "$i$a$-let-AiClient$testConnection$2":I
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\n"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .end local v1    # "it":Ljava/lang/String;
    .end local v2    # "$i$a$-let-AiClient$testConnection$2":I
    if-nez v1, :cond_a

    :cond_9
    move-object v1, v0

    :cond_a
    return-object v1
.end method
