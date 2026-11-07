.class public final Lcom/pymcl/runtime/keyboard/GameTextSender;
.super Ljava/lang/Object;
.source "GameTextSender.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameTextSender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameTextSender.kt\ncom/pymcl/runtime/keyboard/GameTextSender\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n2077#2,3:46\n*S KotlinDebug\n*F\n+ 1 GameTextSender.kt\ncom/pymcl/runtime/keyboard/GameTextSender\n*L\n34#1:46,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012 \u0008\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0004\u0012\u00020\n0\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u0006J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0004\u0012\u00020\n0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\r\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/pymcl/runtime/keyboard/GameTextSender;",
        "",
        "sink",
        "Lcom/pymcl/runtime/input/InputSink;",
        "cursorVisible",
        "Lkotlin/Function0;",
        "",
        "schedule",
        "Lkotlin/Function2;",
        "",
        "",
        "chatKey",
        "",
        "chatOpenDelayMs",
        "<init>",
        "(Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;IJ)V",
        "getChatKey",
        "()I",
        "setChatKey",
        "(I)V",
        "getChatOpenDelayMs",
        "()J",
        "setChatOpenDelayMs",
        "(J)V",
        "send",
        "text",
        "",
        "pressEnter",
        "commit",
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


# instance fields
.field private chatKey:I

.field private chatOpenDelayMs:J

.field private final cursorVisible:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final schedule:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Long;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final sink:Lcom/pymcl/runtime/input/InputSink;


# direct methods
.method public static synthetic $r8$lambda$DP7s5GfzIbxIetKHy_n3c7O8zNc(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/keyboard/GameTextSender;->_init_$lambda$0$0(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic $r8$lambda$RncYu9FTODzzObfPIGNAxzrpoWc(JLkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/runtime/keyboard/GameTextSender;->_init_$lambda$0(JLkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$hRgu-T67tVcgQ-ntPKs4wseSLXA(Lcom/pymcl/runtime/keyboard/GameTextSender;Ljava/lang/String;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/runtime/keyboard/GameTextSender;->send$lambda$0(Lcom/pymcl/runtime/keyboard/GameTextSender;Ljava/lang/String;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;IJ)V
    .locals 1
    .param p1, "sink"    # Lcom/pymcl/runtime/input/InputSink;
    .param p2, "cursorVisible"    # Lkotlin/jvm/functions/Function0;
    .param p3, "schedule"    # Lkotlin/jvm/functions/Function2;
    .param p4, "chatKey"    # I
    .param p5, "chatOpenDelayMs"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/runtime/input/InputSink;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;IJ)V"
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cursorVisible"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedule"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->sink:Lcom/pymcl/runtime/input/InputSink;

    .line 19
    iput-object p2, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->cursorVisible:Lkotlin/jvm/functions/Function0;

    .line 20
    iput-object p3, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->schedule:Lkotlin/jvm/functions/Function2;

    .line 21
    iput p4, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->chatKey:I

    .line 22
    iput-wide p5, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->chatOpenDelayMs:J

    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    .line 17
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    .line 20
    new-instance p3, Lcom/pymcl/runtime/keyboard/GameTextSender$$ExternalSyntheticLambda0;

    invoke-direct {p3}, Lcom/pymcl/runtime/keyboard/GameTextSender$$ExternalSyntheticLambda0;-><init>()V

    move-object v3, p3

    goto :goto_0

    .line 17
    :cond_0
    move-object v3, p3

    :goto_0
    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    .line 21
    const/16 p4, 0x14

    move v4, p4

    goto :goto_1

    .line 17
    :cond_1
    move v4, p4

    :goto_1
    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    .line 22
    const-wide/16 p5, 0x96

    move-wide v5, p5

    goto :goto_2

    .line 17
    :cond_2
    move-wide v5, p5

    :goto_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/runtime/keyboard/GameTextSender;-><init>(Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;IJ)V

    .line 23
    return-void
.end method

.method private static final _init_$lambda$0(JLkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 2
    .param p0, "d"    # J
    .param p2, "r"    # Lkotlin/jvm/functions/Function0;

    const-string v0, "r"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/pymcl/runtime/keyboard/GameTextSender$$ExternalSyntheticLambda1;

    invoke-direct {v1, p2}, Lcom/pymcl/runtime/keyboard/GameTextSender$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0, v1, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final _init_$lambda$0$0(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .param p0, "$tmp0"    # Lkotlin/jvm/functions/Function0;

    .line 20
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final commit(Ljava/lang/String;)V
    .locals 13
    .param p1, "text"    # Ljava/lang/String;

    .line 33
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v6, 0x1

    new-array v1, v6, [C

    const/4 v7, 0x0

    const/16 v2, 0xa

    aput-char v2, v1, v7

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 34
    .local v0, "parts":Ljava/util/List;
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 46
    .local v2, "$i$f$forEachIndexed":I
    const/4 v3, 0x0

    .line 47
    .local v3, "index$iv":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "item$iv":Ljava/lang/Object;
    add-int/lit8 v8, v3, 0x1

    .end local v3    # "index$iv":I
    .local v8, "index$iv":I
    if-gez v3, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    move-object v9, v5

    check-cast v9, Ljava/lang/String;

    .local v3, "i":I
    .local v9, "seg":Ljava/lang/String;
    const/4 v10, 0x0

    .line 34
    .local v10, "$i$a$-forEachIndexed-GameTextSender$commit$1":I
    move-object v11, v9

    check-cast v11, Ljava/lang/CharSequence;

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-lez v11, :cond_1

    move v11, v6

    goto :goto_1

    :cond_1
    move v11, v7

    :goto_1
    if-eqz v11, :cond_2

    iget-object v11, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v11, v9}, Lcom/pymcl/runtime/input/InputSink;->text(Ljava/lang/String;)V

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v11

    sub-int/2addr v11, v6

    if-ge v3, v11, :cond_3

    iget-object v11, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/16 v12, 0x1c

    invoke-interface {v11, v12}, Lcom/pymcl/runtime/input/InputSink;->tapKey(I)V

    .line 47
    .end local v3    # "i":I
    .end local v9    # "seg":Ljava/lang/String;
    .end local v10    # "$i$a$-forEachIndexed-GameTextSender$commit$1":I
    :cond_3
    move v3, v8

    .end local v5    # "item$iv":Ljava/lang/Object;
    goto :goto_0

    .line 48
    .end local v8    # "index$iv":I
    .local v3, "index$iv":I
    :cond_4
    nop

    .line 34
    .end local v1    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$forEachIndexed":I
    .end local v3    # "index$iv":I
    return-void
.end method

.method public static synthetic send$default(Lcom/pymcl/runtime/keyboard/GameTextSender;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    .line 24
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/runtime/keyboard/GameTextSender;->send(Ljava/lang/String;Z)V

    return-void
.end method

.method private static final send$lambda$0(Lcom/pymcl/runtime/keyboard/GameTextSender;Ljava/lang/String;Z)Lkotlin/Unit;
    .locals 2
    .param p0, "this$0"    # Lcom/pymcl/runtime/keyboard/GameTextSender;
    .param p1, "$text"    # Ljava/lang/String;
    .param p2, "$pressEnter"    # Z

    .line 28
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/keyboard/GameTextSender;->commit(Ljava/lang/String;)V

    .line 29
    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/16 v1, 0x1c

    invoke-interface {v0, v1}, Lcom/pymcl/runtime/input/InputSink;->tapKey(I)V

    .line 30
    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final getChatKey()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->chatKey:I

    return v0
.end method

.method public final getChatOpenDelayMs()J
    .locals 2

    .line 22
    iget-wide v0, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->chatOpenDelayMs:J

    return-wide v0
.end method

.method public final send(Ljava/lang/String;Z)V
    .locals 3
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "pressEnter"    # Z

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->cursorVisible:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/pymcl/runtime/keyboard/GameTextSender;->commit(Ljava/lang/String;)V

    return-void

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->sink:Lcom/pymcl/runtime/input/InputSink;

    iget v1, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->chatKey:I

    invoke-interface {v0, v1}, Lcom/pymcl/runtime/input/InputSink;->tapKey(I)V

    .line 27
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->schedule:Lkotlin/jvm/functions/Function2;

    iget-wide v1, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->chatOpenDelayMs:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-instance v2, Lcom/pymcl/runtime/keyboard/GameTextSender$$ExternalSyntheticLambda2;

    invoke-direct {v2, p0, p1, p2}, Lcom/pymcl/runtime/keyboard/GameTextSender$$ExternalSyntheticLambda2;-><init>(Lcom/pymcl/runtime/keyboard/GameTextSender;Ljava/lang/String;Z)V

    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    return-void
.end method

.method public final setChatKey(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 21
    iput p1, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->chatKey:I

    return-void
.end method

.method public final setChatOpenDelayMs(J)V
    .locals 0
    .param p1, "<set-?>"    # J

    .line 22
    iput-wide p1, p0, Lcom/pymcl/runtime/keyboard/GameTextSender;->chatOpenDelayMs:J

    return-void
.end method
