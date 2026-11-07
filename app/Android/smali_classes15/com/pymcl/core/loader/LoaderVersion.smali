.class public final Lcom/pymcl/core/loader/LoaderVersion;
.super Ljava/lang/Object;
.source "Loaders.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0014\u0010\u0017\u001a\u00020\u00082\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/pymcl/core/loader/LoaderVersion;",
        "",
        "type",
        "Lcom/pymcl/core/loader/LoaderType;",
        "mcVersion",
        "",
        "version",
        "stable",
        "",
        "<init>",
        "(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Z)V",
        "getType",
        "()Lcom/pymcl/core/loader/LoaderType;",
        "getMcVersion",
        "()Ljava/lang/String;",
        "getVersion",
        "getStable",
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
        "PyMCL-Android:core"
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
.field private final mcVersion:Ljava/lang/String;

.field private final stable:Z

.field private final type:Lcom/pymcl/core/loader/LoaderType;

.field private final version:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1
    .param p1, "type"    # Lcom/pymcl/core/loader/LoaderType;
    .param p2, "mcVersion"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "stable"    # Z

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mcVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/loader/LoaderVersion;->type:Lcom/pymcl/core/loader/LoaderType;

    iput-object p2, p0, Lcom/pymcl/core/loader/LoaderVersion;->mcVersion:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/core/loader/LoaderVersion;->version:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/pymcl/core/loader/LoaderVersion;->stable:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 14
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/core/loader/LoaderVersion;-><init>(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/core/loader/LoaderVersion;Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/core/loader/LoaderVersion;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/pymcl/core/loader/LoaderVersion;->type:Lcom/pymcl/core/loader/LoaderType;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/pymcl/core/loader/LoaderVersion;->mcVersion:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/pymcl/core/loader/LoaderVersion;->version:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/pymcl/core/loader/LoaderVersion;->stable:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/core/loader/LoaderVersion;->copy(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Z)Lcom/pymcl/core/loader/LoaderVersion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/pymcl/core/loader/LoaderType;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderVersion;->type:Lcom/pymcl/core/loader/LoaderType;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderVersion;->mcVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderVersion;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/core/loader/LoaderVersion;->stable:Z

    return v0
.end method

.method public final copy(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Z)Lcom/pymcl/core/loader/LoaderVersion;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mcVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/pymcl/core/loader/LoaderVersion;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/pymcl/core/loader/LoaderVersion;-><init>(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/core/loader/LoaderVersion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/core/loader/LoaderVersion;

    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderVersion;->type:Lcom/pymcl/core/loader/LoaderType;

    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderVersion;->type:Lcom/pymcl/core/loader/LoaderType;

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderVersion;->mcVersion:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderVersion;->mcVersion:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderVersion;->version:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderVersion;->version:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-boolean v3, p0, Lcom/pymcl/core/loader/LoaderVersion;->stable:Z

    iget-boolean v1, v1, Lcom/pymcl/core/loader/LoaderVersion;->stable:Z

    if-eq v3, v1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMcVersion()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderVersion;->mcVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getStable()Z
    .locals 1

    .line 14
    iget-boolean v0, p0, Lcom/pymcl/core/loader/LoaderVersion;->stable:Z

    return v0
.end method

.method public final getType()Lcom/pymcl/core/loader/LoaderType;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderVersion;->type:Lcom/pymcl/core/loader/LoaderType;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderVersion;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderVersion;->type:Lcom/pymcl/core/loader/LoaderType;

    invoke-virtual {v0}, Lcom/pymcl/core/loader/LoaderType;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderVersion;->mcVersion:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderVersion;->version:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/core/loader/LoaderVersion;->stable:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderVersion;->type:Lcom/pymcl/core/loader/LoaderType;

    iget-object v1, p0, Lcom/pymcl/core/loader/LoaderVersion;->mcVersion:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderVersion;->version:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/pymcl/core/loader/LoaderVersion;->stable:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "LoaderVersion(type="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", mcVersion="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stable="

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
