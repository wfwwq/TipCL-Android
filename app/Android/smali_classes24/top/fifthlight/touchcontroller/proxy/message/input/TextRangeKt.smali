.class public final Ltop/fifthlight/touchcontroller/proxy/message/input/TextRangeKt;
.super Ljava/lang/Object;
.source "TextRange.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "substring",
        "",
        "range",
        "Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;",
        "removeRange",
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
.method public static final removeRange(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;)Ljava/lang/String;
    .locals 3
    .param p0, "$this$removeRange"    # Ljava/lang/String;
    .param p1, "range"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v0

    invoke-virtual {p1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v1

    move-object v2, p0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2, v0, v1}, Lkotlin/text/StringsKt;->removeRange(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final substring(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;)Ljava/lang/String;
    .locals 2
    .param p0, "$this$substring"    # Ljava/lang/String;
    .param p1, "range"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v0

    invoke-virtual {p1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getEnd()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "substring(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
