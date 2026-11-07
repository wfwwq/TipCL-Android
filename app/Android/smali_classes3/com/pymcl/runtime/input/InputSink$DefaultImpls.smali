.class public final Lcom/pymcl/runtime/input/InputSink$DefaultImpls;
.super Ljava/lang/Object;
.source "InputSink.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/input/InputSink;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static click(Lcom/pymcl/runtime/input/InputSink;I)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/input/InputSink;
    .param p1, "button"    # I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 24
    invoke-static {p0, p1}, Lcom/pymcl/runtime/input/InputSink;->access$click$jd(Lcom/pymcl/runtime/input/InputSink;I)V

    return-void
.end method

.method public static tapKey(Lcom/pymcl/runtime/input/InputSink;I)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/input/InputSink;
    .param p1, "fclKeycode"    # I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 23
    invoke-static {p0, p1}, Lcom/pymcl/runtime/input/InputSink;->access$tapKey$jd(Lcom/pymcl/runtime/input/InputSink;I)V

    return-void
.end method

.method public static text(Lcom/pymcl/runtime/input/InputSink;Ljava/lang/String;)V
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/input/InputSink;
    .param p1, "s"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-static {p0, p1}, Lcom/pymcl/runtime/input/InputSink;->access$text$jd(Lcom/pymcl/runtime/input/InputSink;Ljava/lang/String;)V

    return-void
.end method
