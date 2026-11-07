.class public final Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputStateKt;
.super Ljava/lang/Object;
.source "TextInputState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u0008\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u000c\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\r\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u000e\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u000f\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u0002*\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0004\u00a8\u0006\u0011"
    }
    d2 = {
        "compositionText",
        "",
        "Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;",
        "getCompositionText",
        "(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ljava/lang/String;",
        "selectionText",
        "getSelectionText",
        "doBackspace",
        "doDelete",
        "doHome",
        "doEnd",
        "doArrowLeft",
        "doArrowRight",
        "doShiftLeft",
        "doShiftRight",
        "doShiftHome",
        "doShiftEnd",
        "TouchController-Proxy-Client"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final doArrowLeft(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 8
    .param p0, "$this$doArrowLeft"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    move-object v0, p0

    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-lez v0, :cond_1

    .line 83
    new-instance v4, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v0

    invoke-direct {v4, v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(I)V

    .line 84
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v3

    .line 82
    nop

    .line 84
    nop

    .line 83
    nop

    .line 82
    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    .end local p0    # "$this$doArrowLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v1, "$this$doArrowLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-static/range {v1 .. v7}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    move-object v0, v1

    .end local v1    # "$this$doArrowLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v0, "$this$doArrowLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    goto :goto_1

    .line 86
    .end local v0    # "$this$doArrowLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doArrowLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :cond_1
    move-object v0, p0

    .end local p0    # "$this$doArrowLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doArrowLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    if-lez p0, :cond_2

    .line 88
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-direct {v3, p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(I)V

    .line 89
    sget-object p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    .line 87
    nop

    .line 89
    nop

    .line 88
    nop

    .line 87
    const/16 v5, 0x9

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    goto :goto_1

    .line 92
    :cond_2
    nop

    .line 93
    .end local v0    # "$this$doArrowLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doArrowLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :goto_0
    move-object p0, v0

    .end local p0    # "$this$doArrowLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doArrowLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :goto_1
    return-object p0
.end method

.method public static final doArrowRight(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 8
    .param p0, "$this$doArrowRight"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    move-object v0, p0

    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-lez v0, :cond_1

    .line 100
    new-instance v4, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v0

    invoke-direct {v4, v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(I)V

    .line 101
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v3

    .line 99
    nop

    .line 101
    nop

    .line 100
    nop

    .line 99
    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    .end local p0    # "$this$doArrowRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v1, "$this$doArrowRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-static/range {v1 .. v7}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    move-object v0, v1

    .end local v1    # "$this$doArrowRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v0, "$this$doArrowRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    goto :goto_1

    .line 103
    .end local v0    # "$this$doArrowRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doArrowRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :cond_1
    move-object v0, p0

    .end local p0    # "$this$doArrowRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doArrowRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result p0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p0, v1, :cond_2

    .line 105
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-direct {v3, p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(I)V

    .line 106
    sget-object p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    .line 104
    nop

    .line 106
    nop

    .line 105
    nop

    .line 104
    const/16 v5, 0x9

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    goto :goto_1

    .line 109
    :cond_2
    nop

    .line 110
    .end local v0    # "$this$doArrowRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doArrowRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :goto_0
    move-object p0, v0

    .end local p0    # "$this$doArrowRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doArrowRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :goto_1
    return-object p0
.end method

.method public static final doBackspace(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 9
    .param p0, "$this$doBackspace"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    move-object v0, p0

    goto/16 :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-eqz v0, :cond_1

    .line 25
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v1

    invoke-static {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRangeKt;->removeRange(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;)Ljava/lang/String;

    move-result-object v3

    .line 26
    new-instance v5, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v0

    invoke-direct {v5, v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(I)V

    .line 27
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v4

    .line 24
    nop

    .line 25
    nop

    .line 27
    nop

    .line 26
    nop

    .line 24
    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    .end local p0    # "$this$doBackspace":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v2, "$this$doBackspace":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-static/range {v2 .. v8}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    move-object v0, v2

    .end local v2    # "$this$doBackspace":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v0, "$this$doBackspace":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    goto :goto_1

    .line 29
    .end local v0    # "$this$doBackspace":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doBackspace":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :cond_1
    move-object v0, p0

    .end local p0    # "$this$doBackspace":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doBackspace":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    if-lez p0, :cond_2

    .line 31
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v1

    invoke-virtual {v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v2

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->removeRange(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 32
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-direct {v3, p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(I)V

    .line 33
    sget-object p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    .line 30
    nop

    .line 31
    nop

    .line 33
    nop

    .line 32
    nop

    .line 30
    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    goto :goto_1

    .line 36
    :cond_2
    nop

    .line 37
    .end local v0    # "$this$doBackspace":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doBackspace":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :goto_0
    move-object p0, v0

    .end local p0    # "$this$doBackspace":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doBackspace":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :goto_1
    return-object p0
.end method

.method public static final doDelete(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 9
    .param p0, "$this$doDelete"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    move-object v0, p0

    goto/16 :goto_0

    .line 42
    :cond_0
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-eqz v0, :cond_1

    .line 44
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v1

    invoke-static {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRangeKt;->removeRange(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;)Ljava/lang/String;

    move-result-object v3

    .line 45
    new-instance v5, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v0

    invoke-direct {v5, v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(I)V

    .line 46
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v4

    .line 43
    nop

    .line 44
    nop

    .line 46
    nop

    .line 45
    nop

    .line 43
    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    .end local p0    # "$this$doDelete":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v2, "$this$doDelete":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-static/range {v2 .. v8}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    move-object v0, v2

    .end local v2    # "$this$doDelete":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v0, "$this$doDelete":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    goto :goto_1

    .line 48
    .end local v0    # "$this$doDelete":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doDelete":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :cond_1
    move-object v0, p0

    .end local p0    # "$this$doDelete":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doDelete":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result p0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p0, v1, :cond_2

    .line 50
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v1

    invoke-virtual {v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v1

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->removeRange(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 51
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    invoke-direct {v3, p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(I)V

    .line 52
    sget-object p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    .line 49
    nop

    .line 50
    nop

    .line 52
    nop

    .line 51
    nop

    .line 49
    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    goto :goto_1

    .line 55
    :cond_2
    nop

    .line 56
    .end local v0    # "$this$doDelete":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doDelete":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :goto_0
    move-object p0, v0

    .end local p0    # "$this$doDelete":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doDelete":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :goto_1
    return-object p0
.end method

.method public static final doEnd(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 8
    .param p0, "$this$doEnd"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    move-object v1, p0

    goto :goto_0

    .line 73
    :cond_0
    new-instance v4, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-direct {v4, v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(I)V

    .line 74
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v3

    .line 72
    nop

    .line 74
    nop

    .line 73
    nop

    .line 72
    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    .end local p0    # "$this$doEnd":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v1, "$this$doEnd":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-static/range {v1 .. v7}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    .line 76
    :goto_0
    return-object p0
.end method

.method public static final doHome(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 8
    .param p0, "$this$doHome"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    move-object v1, p0

    goto :goto_0

    .line 63
    :cond_0
    new-instance v4, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(I)V

    .line 64
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v3

    .line 62
    nop

    .line 64
    nop

    .line 63
    nop

    .line 62
    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    .end local p0    # "$this$doHome":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v1, "$this$doHome":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-static/range {v1 .. v7}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    .line 66
    :goto_0
    return-object p0
.end method

.method public static final doShiftEnd(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 8
    .param p0, "$this$doShiftEnd"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    move-object v0, p0

    goto :goto_0

    .line 202
    :cond_0
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelectionLeft()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 204
    new-instance v4, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-direct {v4, v0, v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 205
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v3

    .line 203
    nop

    .line 205
    nop

    .line 204
    nop

    .line 206
    nop

    .line 203
    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    .end local p0    # "$this$doShiftEnd":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v1, "$this$doShiftEnd":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-static/range {v1 .. v7}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    move-object v0, v1

    .end local v1    # "$this$doShiftEnd":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v0, "$this$doShiftEnd":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    goto :goto_0

    .line 210
    .end local v0    # "$this$doShiftEnd":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doShiftEnd":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :cond_1
    move-object v0, p0

    .end local p0    # "$this$doShiftEnd":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doShiftEnd":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-direct {v3, p0, v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 211
    sget-object p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    .line 209
    nop

    .line 211
    nop

    .line 210
    nop

    .line 212
    nop

    .line 209
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    .line 214
    :goto_0
    return-object p0
.end method

.method public static final doShiftHome(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 9
    .param p0, "$this$doShiftHome"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    move-object v0, p0

    goto :goto_0

    .line 185
    :cond_0
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelectionLeft()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 187
    new-instance v5, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v0

    invoke-direct {v5, v1, v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 188
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v4

    .line 186
    nop

    .line 188
    nop

    .line 187
    nop

    .line 189
    nop

    .line 186
    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x1

    move-object v2, p0

    .end local p0    # "$this$doShiftHome":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v2, "$this$doShiftHome":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-static/range {v2 .. v8}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    move-object v0, v2

    .end local v2    # "$this$doShiftHome":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v0, "$this$doShiftHome":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    goto :goto_0

    .line 193
    .end local v0    # "$this$doShiftHome":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doShiftHome":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :cond_1
    move-object v0, p0

    .end local p0    # "$this$doShiftHome":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doShiftHome":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    invoke-direct {v3, v1, p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 194
    sget-object p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    .line 192
    nop

    .line 194
    nop

    .line 193
    nop

    .line 195
    nop

    .line 192
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x1

    invoke-static/range {v0 .. v6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    .line 197
    :goto_0
    return-object p0
.end method

.method public static final doShiftLeft(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 9
    .param p0, "$this$doShiftLeft"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    move-object v0, p0

    goto/16 :goto_0

    .line 115
    :cond_0
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 116
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v0

    if-lez v0, :cond_1

    .line 118
    new-instance v5, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-direct {v5, v0, v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 119
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v4

    .line 117
    nop

    .line 119
    nop

    .line 118
    nop

    .line 120
    nop

    .line 117
    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x1

    move-object v2, p0

    .end local p0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v2, "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-static/range {v2 .. v8}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    move-object v0, v2

    .end local v2    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v0, "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    goto/16 :goto_1

    .line 123
    .end local v0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :cond_1
    move-object v0, p0

    .end local p0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    goto :goto_0

    .line 125
    .end local v0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :cond_2
    move-object v0, p0

    .end local p0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelectionLeft()Z

    move-result p0

    if-eqz p0, :cond_4

    .line 126
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    if-lez p0, :cond_3

    .line 128
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    sub-int/2addr p0, v1

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v2

    add-int/2addr v2, v1

    invoke-direct {v3, p0, v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 129
    sget-object p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    .line 127
    nop

    .line 129
    nop

    .line 128
    nop

    .line 130
    nop

    .line 127
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x1

    invoke-static/range {v0 .. v6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    goto :goto_1

    .line 133
    :cond_3
    goto :goto_0

    .line 136
    :cond_4
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result p0

    if-lez p0, :cond_5

    .line 138
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-direct {v3, p0, v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 139
    sget-object p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    .line 137
    nop

    .line 139
    nop

    .line 138
    nop

    .line 140
    nop

    .line 137
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    goto :goto_1

    .line 143
    :cond_5
    nop

    .line 145
    .end local v0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :goto_0
    move-object p0, v0

    .end local p0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doShiftLeft":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :goto_1
    return-object p0
.end method

.method public static final doShiftRight(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 10
    .param p0, "$this$doShiftRight"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    move-object v0, p0

    goto/16 :goto_0

    .line 150
    :cond_0
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 151
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 153
    new-instance v6, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v0

    invoke-direct {v6, v0, v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 154
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v5

    .line 152
    nop

    .line 154
    nop

    .line 153
    nop

    .line 155
    nop

    .line 152
    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    .end local p0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v3, "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-static/range {v3 .. v9}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    move-object v0, v3

    .end local v3    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .local v0, "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    goto/16 :goto_1

    .line 158
    .end local v0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :cond_1
    move-object v0, p0

    .end local p0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    goto/16 :goto_0

    .line 160
    .end local v0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :cond_2
    move-object v0, p0

    .end local p0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelectionLeft()Z

    move-result p0

    if-eqz p0, :cond_4

    .line 161
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge p0, v2, :cond_3

    .line 163
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    add-int/2addr p0, v1

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-direct {v3, p0, v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 164
    sget-object p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    .line 162
    nop

    .line 164
    nop

    .line 163
    nop

    .line 165
    nop

    .line 162
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x1

    invoke-static/range {v0 .. v6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    goto :goto_1

    .line 168
    :cond_3
    goto :goto_0

    .line 171
    :cond_4
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result p0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge p0, v2, :cond_5

    .line 173
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result p0

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v2

    add-int/2addr v2, v1

    invoke-direct {v3, p0, v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 174
    sget-object p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;->getEMPTY()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    .line 172
    nop

    .line 174
    nop

    .line 173
    nop

    .line 175
    nop

    .line 172
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object p0

    goto :goto_1

    .line 178
    :cond_5
    nop

    .line 180
    .end local v0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local p0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :goto_0
    move-object p0, v0

    .end local p0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .restart local v0    # "$this$doShiftRight":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    :goto_1
    return-object p0
.end method

.method public static final getCompositionText(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ljava/lang/String;
    .locals 2
    .param p0, "$this$compositionText"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v1

    invoke-static {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRangeKt;->substring(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final getSelectionText(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ljava/lang/String;
    .locals 2
    .param p0, "$this$selectionText"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v1

    invoke-static {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRangeKt;->substring(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
