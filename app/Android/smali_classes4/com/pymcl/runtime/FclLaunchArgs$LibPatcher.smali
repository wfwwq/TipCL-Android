.class public final Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;
.super Ljava/lang/Object;
.source "FclLaunchArgs.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/FclLaunchArgs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LibPatcher"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0016\u001a\u00020\u00032\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u00d6\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0010H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\n\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;",
        "",
        "enabled",
        "",
        "alc10",
        "asmBackport",
        "sablerapier",
        "<init>",
        "(ZZZZ)V",
        "getEnabled",
        "()Z",
        "getAlc10",
        "getAsmBackport",
        "getSablerapier",
        "jvmOptions",
        "",
        "",
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
.field private final alc10:Z

.field private final asmBackport:Z

.field private final enabled:Z

.field private final sablerapier:Z


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

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;-><init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZZ)V
    .locals 0
    .param p1, "enabled"    # Z
    .param p2, "alc10"    # Z
    .param p3, "asmBackport"    # Z
    .param p4, "sablerapier"    # Z

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->enabled:Z

    iput-boolean p2, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->alc10:Z

    iput-boolean p3, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->asmBackport:Z

    iput-boolean p4, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->sablerapier:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    .line 42
    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x1

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v1, 0x0

    if-eqz p6, :cond_1

    move p2, v1

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;-><init>(ZZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;ZZZZILjava/lang/Object;)Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->enabled:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->alc10:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->asmBackport:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->sablerapier:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->copy(ZZZZ)Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->enabled:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->alc10:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->asmBackport:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->sablerapier:Z

    return v0
.end method

.method public final copy(ZZZZ)Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;-><init>(ZZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;

    iget-boolean v3, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->enabled:Z

    iget-boolean v4, v1, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->enabled:Z

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget-boolean v3, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->alc10:Z

    iget-boolean v4, v1, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->alc10:Z

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget-boolean v3, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->asmBackport:Z

    iget-boolean v4, v1, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->asmBackport:Z

    if-eq v3, v4, :cond_4

    return v2

    :cond_4
    iget-boolean v3, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->sablerapier:Z

    iget-boolean v1, v1, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->sablerapier:Z

    if-eq v3, v1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAlc10()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->alc10:Z

    return v0
.end method

.method public final getAsmBackport()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->asmBackport:Z

    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->enabled:Z

    return v0
.end method

.method public final getSablerapier()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->sablerapier:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->enabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->alc10:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->asmBackport:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->sablerapier:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public final jvmOptions()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 43
    invoke-static {}, Lkotlin/collections/CollectionsKt;->createListBuilder()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    .local v1, "$this$jvmOptions_u24lambda_u240":Ljava/util/List;
    const/4 v2, 0x0

    .line 44
    .local v2, "$i$a$-buildList-FclLaunchArgs$LibPatcher$jvmOptions$1":I
    iget-boolean v3, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->alc10:Z

    if-eqz v3, :cond_0

    const-string v3, "-Dmiolibpatcher.alc10=true"

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    :cond_0
    iget-boolean v3, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->sablerapier:Z

    if-nez v3, :cond_1

    const-string v3, "-Dmiolibpatcher.sablerapier=false"

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    :cond_1
    iget-boolean v3, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->asmBackport:Z

    if-eqz v3, :cond_2

    const-string v3, "-Dmiolibpatcher.asmBackport=true"

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    :cond_2
    nop

    .line 43
    .end local v1    # "$this$jvmOptions_u24lambda_u240":Ljava/util/List;
    .end local v2    # "$i$a$-buildList-FclLaunchArgs$LibPatcher$jvmOptions$1":I
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->build(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 47
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->enabled:Z

    iget-boolean v1, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->alc10:Z

    iget-boolean v2, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->asmBackport:Z

    iget-boolean v3, p0, Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;->sablerapier:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "LibPatcher(enabled="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", alc10="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", asmBackport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sablerapier="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
