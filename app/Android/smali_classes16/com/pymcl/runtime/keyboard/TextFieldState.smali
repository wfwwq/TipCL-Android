.class public final Lcom/pymcl/runtime/keyboard/TextFieldState;
.super Ljava/lang/Object;
.source "TextFieldInputView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000e\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/pymcl/runtime/keyboard/TextFieldState;",
        "",
        "text",
        "",
        "selectionStart",
        "",
        "selectionEnd",
        "composingStart",
        "composingEnd",
        "<init>",
        "(Ljava/lang/String;IIII)V",
        "getText",
        "()Ljava/lang/String;",
        "getSelectionStart",
        "()I",
        "getSelectionEnd",
        "getComposingStart",
        "getComposingEnd",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field private final composingEnd:I

.field private final composingStart:I

.field private final selectionEnd:I

.field private final selectionStart:I

.field private final text:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IIII)V
    .locals 1
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "selectionStart"    # I
    .param p3, "selectionEnd"    # I
    .param p4, "composingStart"    # I
    .param p5, "composingEnd"    # I

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->text:Ljava/lang/String;

    iput p2, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionStart:I

    iput p3, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionEnd:I

    .line 19
    iput p4, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingStart:I

    iput p5, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingEnd:I

    .line 18
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    .line 18
    and-int/lit8 p7, p6, 0x8

    const/4 v0, -0x1

    if-eqz p7, :cond_0

    .line 19
    move p4, v0

    .line 18
    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    .line 19
    move p6, v0

    goto :goto_0

    .line 18
    :cond_1
    move p6, p5

    :goto_0
    move p5, p4

    move p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p6}, Lcom/pymcl/runtime/keyboard/TextFieldState;-><init>(Ljava/lang/String;IIII)V

    .line 19
    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/runtime/keyboard/TextFieldState;Ljava/lang/String;IIIIILjava/lang/Object;)Lcom/pymcl/runtime/keyboard/TextFieldState;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->text:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionStart:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionEnd:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingStart:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingEnd:I

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/pymcl/runtime/keyboard/TextFieldState;->copy(Ljava/lang/String;IIII)Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionStart:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionEnd:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingStart:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingEnd:I

    return v0
.end method

.method public final copy(Ljava/lang/String;IIII)Lcom/pymcl/runtime/keyboard/TextFieldState;
    .locals 7

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/pymcl/runtime/keyboard/TextFieldState;-><init>(Ljava/lang/String;IIII)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/runtime/keyboard/TextFieldState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/runtime/keyboard/TextFieldState;

    iget-object v3, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->text:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/runtime/keyboard/TextFieldState;->text:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget v3, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionStart:I

    iget v4, v1, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionStart:I

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget v3, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionEnd:I

    iget v4, v1, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionEnd:I

    if-eq v3, v4, :cond_4

    return v2

    :cond_4
    iget v3, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingStart:I

    iget v4, v1, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingStart:I

    if-eq v3, v4, :cond_5

    return v2

    :cond_5
    iget v3, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingEnd:I

    iget v1, v1, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingEnd:I

    if-eq v3, v1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getComposingEnd()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingEnd:I

    return v0
.end method

.method public final getComposingStart()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingStart:I

    return v0
.end method

.method public final getSelectionEnd()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionEnd:I

    return v0
.end method

.method public final getSelectionStart()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionStart:I

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->text:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionStart:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionEnd:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingStart:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingEnd:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->text:Ljava/lang/String;

    iget v1, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionStart:I

    iget v2, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->selectionEnd:I

    iget v3, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingStart:I

    iget v4, p0, Lcom/pymcl/runtime/keyboard/TextFieldState;->composingEnd:I

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "TextFieldState(text="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", selectionStart="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", selectionEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", composingStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", composingEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
