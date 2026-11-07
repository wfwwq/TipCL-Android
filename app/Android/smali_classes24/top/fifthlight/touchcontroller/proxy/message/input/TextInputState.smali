.class public final Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
.super Ljava/lang/Object;
.source "TextInputState.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextInputState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputState.kt\ntop/fifthlight/touchcontroller/proxy/message/input/TextInputState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00082\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001c"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;",
        "",
        "text",
        "",
        "composition",
        "Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;",
        "selection",
        "selectionLeft",
        "",
        "<init>",
        "(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Z)V",
        "getText",
        "()Ljava/lang/String;",
        "getComposition",
        "()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;",
        "getSelection",
        "getSelectionLeft",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "TouchController-Proxy-Client"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final composition:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

.field private final selection:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

.field private final selectionLeft:Z

.field private final text:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 7

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;-><init>(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Z)V
    .locals 5
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "composition"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;
    .param p3, "selection"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;
    .param p4, "selectionLeft"    # Z

    const-string/jumbo v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "composition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "selection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->text:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->composition:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    .line 6
    iput-object p3, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selection:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    .line 7
    iput-boolean p4, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selectionLeft:Z

    .line 9
    nop

    .line 10
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->composition:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v0

    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->text:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gt v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    const-string v1, " should not exceed text length "

    if-eqz v0, :cond_3

    .line 11
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selection:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v0

    iget-object v4, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->text:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-gt v0, v4, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-eqz v2, :cond_2

    .line 12
    nop

    .line 3
    return-void

    .line 217
    :cond_2
    const/4 v0, 0x0

    .line 11
    .local v0, "$i$a$-require-TextInputState$2":I
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "selection region end "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selection:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v3}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->text:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-require-TextInputState$2":I
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 217
    :cond_3
    const/4 v0, 0x0

    .line 10
    .local v0, "$i$a$-require-TextInputState$1":I
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "composition region end "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->composition:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v3}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->text:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-require-TextInputState$1":I
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 3
    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 4
    const-string p1, ""

    .line 3
    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 5
    sget-object p2, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {p2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p2

    .line 3
    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 6
    new-instance p3, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p6

    invoke-direct {p3, p6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(I)V

    .line 3
    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 7
    const/4 p4, 0x1

    .line 3
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;-><init>(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Z)V

    .line 8
    return-void
.end method

.method public static synthetic copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->text:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->composition:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selection:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selectionLeft:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Z)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;
    .locals 1

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->composition:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    return-object v0
.end method

.method public final component3()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;
    .locals 1

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selection:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selectionLeft:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Z)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 1

    const-string/jumbo v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "composition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "selection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    invoke-direct {v0, p1, p2, p3, p4}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;-><init>(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->text:Ljava/lang/String;

    iget-object v4, v1, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->text:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->composition:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    iget-object v4, v1, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->composition:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selection:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    iget-object v4, v1, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selection:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-boolean v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selectionLeft:Z

    iget-boolean v1, v1, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selectionLeft:Z

    if-eq v3, v1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;
    .locals 1

    .line 5
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->composition:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    return-object v0
.end method

.method public final getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;
    .locals 1

    .line 6
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selection:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    return-object v0
.end method

.method public final getSelectionLeft()Z
    .locals 1

    .line 7
    iget-boolean v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selectionLeft:Z

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->text:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->composition:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selection:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selectionLeft:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TextInputState(text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", composition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->composition:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", selection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selection:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", selectionLeft="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->selectionLeft:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
