.class public final Lcom/pymcl/runtime/input/TextRoutingInputSink;
.super Ljava/lang/Object;
.source "SdlTextInput.kt"

# interfaces
.implements Lcom/pymcl/runtime/input/InputSink;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSdlTextInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdlTextInput.kt\ncom/pymcl/runtime/input/TextRoutingInputSink\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,98:1\n1198#2,2:99\n*S KotlinDebug\n*F\n+ 1 SdlTextInput.kt\ncom/pymcl/runtime/input/TextRoutingInputSink\n*L\n79#1:99,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000c\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0011H\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0006\u0010\"\u001a\u00020\u0016J\u0019\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0096\u0001J\u0019\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0096\u0001J\u0019\u0010*\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0014H\u0096\u0001J\u0011\u0010+\u001a\u00020\u00162\u0006\u0010)\u001a\u00020,H\u0096\u0001R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\u0008\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/TextRoutingInputSink;",
        "Lcom/pymcl/runtime/input/InputSink;",
        "base",
        "channel",
        "Lcom/pymcl/runtime/input/SdlTextChannel;",
        "route",
        "Lcom/pymcl/runtime/input/TextRoute;",
        "<init>",
        "(Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/input/SdlTextChannel;Lcom/pymcl/runtime/input/TextRoute;)V",
        "getBase",
        "()Lcom/pymcl/runtime/input/InputSink;",
        "getRoute",
        "()Lcom/pymcl/runtime/input/TextRoute;",
        "setRoute",
        "(Lcom/pymcl/runtime/input/TextRoute;)V",
        "sdlHeld",
        "Ljava/util/HashSet;",
        "",
        "Lkotlin/collections/HashSet;",
        "sdl",
        "",
        "char",
        "",
        "c",
        "",
        "text",
        "s",
        "",
        "key",
        "fclKeycode",
        "press",
        "tapKey",
        "click",
        "button",
        "releaseAll",
        "cursorPos",
        "x",
        "",
        "y",
        "lookDelta",
        "dx",
        "dy",
        "mouseButton",
        "scroll",
        "",
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
.field private final base:Lcom/pymcl/runtime/input/InputSink;

.field private final channel:Lcom/pymcl/runtime/input/SdlTextChannel;

.field private route:Lcom/pymcl/runtime/input/TextRoute;

.field private final sdlHeld:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/input/SdlTextChannel;Lcom/pymcl/runtime/input/TextRoute;)V
    .locals 1
    .param p1, "base"    # Lcom/pymcl/runtime/input/InputSink;
    .param p2, "channel"    # Lcom/pymcl/runtime/input/SdlTextChannel;
    .param p3, "route"    # Lcom/pymcl/runtime/input/TextRoute;

    const-string v0, "base"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "route"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->base:Lcom/pymcl/runtime/input/InputSink;

    .line 67
    iput-object p2, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->channel:Lcom/pymcl/runtime/input/SdlTextChannel;

    .line 68
    iput-object p3, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->route:Lcom/pymcl/runtime/input/TextRoute;

    .line 71
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->sdlHeld:Ljava/util/HashSet;

    .line 65
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/input/SdlTextChannel;Lcom/pymcl/runtime/input/TextRoute;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 65
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 67
    sget-object p2, Lcom/pymcl/runtime/input/NativeSdlTextChannel;->INSTANCE:Lcom/pymcl/runtime/input/NativeSdlTextChannel;

    check-cast p2, Lcom/pymcl/runtime/input/SdlTextChannel;

    .line 65
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 68
    sget-object p3, Lcom/pymcl/runtime/input/TextRoute;->GLFW:Lcom/pymcl/runtime/input/TextRoute;

    .line 65
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/runtime/input/TextRoutingInputSink;-><init>(Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/input/SdlTextChannel;Lcom/pymcl/runtime/input/TextRoute;)V

    .line 69
    return-void
.end method

.method private final sdl()Z
    .locals 2

    .line 72
    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->route:Lcom/pymcl/runtime/input/TextRoute;

    sget-object v1, Lcom/pymcl/runtime/input/TextRoute;->SDL:Lcom/pymcl/runtime/input/TextRoute;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->channel:Lcom/pymcl/runtime/input/SdlTextChannel;

    invoke-interface {v0}, Lcom/pymcl/runtime/input/SdlTextChannel;->available()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public char(C)V
    .locals 2
    .param p1, "c"    # C

    .line 74
    invoke-direct {p0}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->sdl()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->channel:Lcom/pymcl/runtime/input/SdlTextChannel;

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/pymcl/runtime/input/SdlTextChannel;->commit(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->base:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v0, p1}, Lcom/pymcl/runtime/input/InputSink;->char(C)V

    :cond_1
    return-void
.end method

.method public click(I)V
    .locals 1
    .param p1, "button"    # I

    .line 94
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->mouseButton(IZ)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->mouseButton(IZ)V

    return-void
.end method

.method public cursorPos(FF)V
    .locals 1

    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->base:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v0, p1, p2}, Lcom/pymcl/runtime/input/InputSink;->cursorPos(FF)V

    return-void
.end method

.method public final getBase()Lcom/pymcl/runtime/input/InputSink;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->base:Lcom/pymcl/runtime/input/InputSink;

    return-object v0
.end method

.method public final getRoute()Lcom/pymcl/runtime/input/TextRoute;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->route:Lcom/pymcl/runtime/input/TextRoute;

    return-object v0
.end method

.method public key(IZ)V
    .locals 3
    .param p1, "fclKeycode"    # I
    .param p2, "press"    # Z

    .line 83
    invoke-direct {p0}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->sdl()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    sparse-switch p1, :sswitch_data_0

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_0
    const/16 v0, 0xd

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x8

    :goto_0
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    .line 85
    .local v0, "c":Ljava/lang/Character;
    :goto_1
    if-eqz v0, :cond_2

    .line 86
    if-eqz p2, :cond_0

    iget-object v1, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->channel:Lcom/pymcl/runtime/input/SdlTextChannel;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v2

    invoke-interface {v1, v2}, Lcom/pymcl/runtime/input/SdlTextChannel;->controlChar(C)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->sdlHeld:Ljava/util/HashSet;

    check-cast v1, Ljava/util/Collection;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    .line 87
    :cond_0
    iget-object v1, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->sdlHeld:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    .line 89
    .end local v0    # "c":Ljava/lang/Character;
    :cond_1
    if-nez p2, :cond_2

    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->sdlHeld:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 90
    :cond_2
    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->base:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v0, p1, p2}, Lcom/pymcl/runtime/input/InputSink;->key(IZ)V

    .line 91
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public lookDelta(FF)V
    .locals 1

    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->base:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v0, p1, p2}, Lcom/pymcl/runtime/input/InputSink;->lookDelta(FF)V

    return-void
.end method

.method public mouseButton(IZ)V
    .locals 1

    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->base:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v0, p1, p2}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    return-void
.end method

.method public final releaseAll()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->base:Lcom/pymcl/runtime/input/InputSink;

    instance-of v1, v0, Lcom/pymcl/runtime/input/BridgeInputSink;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/pymcl/runtime/input/BridgeInputSink;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/BridgeInputSink;->releaseAll()V

    :cond_1
    return-void
.end method

.method public scroll(D)V
    .locals 1

    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->base:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v0, p1, p2}, Lcom/pymcl/runtime/input/InputSink;->scroll(D)V

    return-void
.end method

.method public final setRoute(Lcom/pymcl/runtime/input/TextRoute;)V
    .locals 1
    .param p1, "<set-?>"    # Lcom/pymcl/runtime/input/TextRoute;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iput-object p1, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->route:Lcom/pymcl/runtime/input/TextRoute;

    return-void
.end method

.method public tapKey(I)V
    .locals 1
    .param p1, "fclKeycode"    # I

    .line 93
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->key(IZ)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->key(IZ)V

    return-void
.end method

.method public text(Ljava/lang/String;)V
    .locals 7
    .param p1, "s"    # Ljava/lang/String;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    return-void

    .line 78
    :cond_1
    invoke-direct {p0}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->sdl()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->channel:Lcom/pymcl/runtime/input/SdlTextChannel;

    invoke-interface {v0, p1}, Lcom/pymcl/runtime/input/SdlTextChannel;->commit(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 79
    :cond_2
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    .local v0, "$this$forEach$iv":Ljava/lang/CharSequence;
    iget-object v2, p0, Lcom/pymcl/runtime/input/TextRoutingInputSink;->base:Lcom/pymcl/runtime/input/InputSink;

    const/4 v3, 0x0

    .line 99
    .local v3, "$i$f$forEach":I
    nop

    :goto_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v1, v4, :cond_3

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .local v4, "element$iv":C
    move v5, v4

    .local v5, "p0":C
    const/4 v6, 0x0

    .line 79
    .local v6, "$i$a$-forEach-TextRoutingInputSink$text$1":I
    invoke-interface {v2, v5}, Lcom/pymcl/runtime/input/InputSink;->char(C)V

    .line 99
    .end local v5    # "p0":C
    .end local v6    # "$i$a$-forEach-TextRoutingInputSink$text$1":I
    nop

    .end local v4    # "element$iv":C
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 100
    :cond_3
    nop

    .line 80
    .end local v0    # "$this$forEach$iv":Ljava/lang/CharSequence;
    .end local v3    # "$i$f$forEach":I
    return-void
.end method
