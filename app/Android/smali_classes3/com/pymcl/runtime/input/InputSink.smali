.class public interface abstract Lcom/pymcl/runtime/input/InputSink;
.super Ljava/lang/Object;
.source "InputSink.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/input/InputSink$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInputSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputSink.kt\ncom/pymcl/runtime/input/InputSink\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,64:1\n1198#2,2:65\n*S KotlinDebug\n*F\n+ 1 InputSink.kt\ncom/pymcl/runtime/input/InputSink\n*L\n14#1:65,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000c\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0015H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\u0016\u00a8\u0006\u001b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/InputSink;",
        "",
        "key",
        "",
        "fclKeycode",
        "",
        "press",
        "",
        "char",
        "c",
        "",
        "text",
        "s",
        "",
        "mouseButton",
        "button",
        "scroll",
        "dy",
        "",
        "cursorPos",
        "x",
        "",
        "y",
        "lookDelta",
        "dx",
        "tapKey",
        "click",
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


# direct methods
.method public static synthetic access$click$jd(Lcom/pymcl/runtime/input/InputSink;I)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/input/InputSink;
    .param p1, "button"    # I

    .line 10
    invoke-super {p0, p1}, Lcom/pymcl/runtime/input/InputSink;->click(I)V

    return-void
.end method

.method public static synthetic access$tapKey$jd(Lcom/pymcl/runtime/input/InputSink;I)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/input/InputSink;
    .param p1, "fclKeycode"    # I

    .line 10
    invoke-super {p0, p1}, Lcom/pymcl/runtime/input/InputSink;->tapKey(I)V

    return-void
.end method

.method public static synthetic access$text$jd(Lcom/pymcl/runtime/input/InputSink;Ljava/lang/String;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/input/InputSink;
    .param p1, "s"    # Ljava/lang/String;

    .line 10
    invoke-super {p0, p1}, Lcom/pymcl/runtime/input/InputSink;->text(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public abstract char(C)V
.end method

.method public click(I)V
    .locals 1
    .param p1, "button"    # I

    .line 24
    const/4 v0, 0x1

    invoke-interface {p0, p1, v0}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    return-void
.end method

.method public abstract cursorPos(FF)V
.end method

.method public abstract key(IZ)V
.end method

.method public abstract lookDelta(FF)V
.end method

.method public abstract mouseButton(IZ)V
.end method

.method public abstract scroll(D)V
.end method

.method public tapKey(I)V
    .locals 1
    .param p1, "fclKeycode"    # I

    .line 23
    const/4 v0, 0x1

    invoke-interface {p0, p1, v0}, Lcom/pymcl/runtime/input/InputSink;->key(IZ)V

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Lcom/pymcl/runtime/input/InputSink;->key(IZ)V

    return-void
.end method

.method public text(Ljava/lang/String;)V
    .locals 6
    .param p1, "s"    # Ljava/lang/String;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    .local v0, "$this$forEach$iv":Ljava/lang/CharSequence;
    const/4 v1, 0x0

    .line 65
    .local v1, "$i$f$forEach":I
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .local v3, "element$iv":C
    move v4, v3

    .local v4, "p0":C
    const/4 v5, 0x0

    .line 14
    .local v5, "$i$a$-forEach-InputSink$text$1":I
    invoke-interface {p0, v4}, Lcom/pymcl/runtime/input/InputSink;->char(C)V

    .line 65
    .end local v4    # "p0":C
    .end local v5    # "$i$a$-forEach-InputSink$text$1":I
    nop

    .end local v3    # "element$iv":C
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 66
    :cond_0
    nop

    .line 14
    .end local v0    # "$this$forEach$iv":Ljava/lang/CharSequence;
    .end local v1    # "$i$f$forEach":I
    return-void
.end method
