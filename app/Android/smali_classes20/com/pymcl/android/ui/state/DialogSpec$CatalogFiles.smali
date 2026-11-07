.class public final Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;
.super Ljava/lang/Object;
.source "AppState.kt"

# interfaces
.implements Lcom/pymcl/android/ui/state/DialogSpec;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/ui/state/DialogSpec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CatalogFiles"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00ca\u0001\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;",
        "Lcom/pymcl/android/ui/state/DialogSpec;",
        "kind",
        "Lcom/pymcl/android/ui/state/CatalogKind;",
        "hit",
        "Lcom/pymcl/android/ui/state/CatalogHit;",
        "<init>",
        "(Lcom/pymcl/android/ui/state/CatalogKind;Lcom/pymcl/android/ui/state/CatalogHit;)V",
        "getKind",
        "()Lcom/pymcl/android/ui/state/CatalogKind;",
        "getHit",
        "()Lcom/pymcl/android/ui/state/CatalogHit;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final hit:Lcom/pymcl/android/ui/state/CatalogHit;

.field private final kind:Lcom/pymcl/android/ui/state/CatalogKind;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/pymcl/android/ui/state/CatalogHit;->$stable:I

    sput v0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/android/ui/state/CatalogKind;Lcom/pymcl/android/ui/state/CatalogHit;)V
    .locals 1
    .param p1, "kind"    # Lcom/pymcl/android/ui/state/CatalogKind;
    .param p2, "hit"    # Lcom/pymcl/android/ui/state/CatalogHit;

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iput-object p2, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->hit:Lcom/pymcl/android/ui/state/CatalogHit;

    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;Lcom/pymcl/android/ui/state/CatalogKind;Lcom/pymcl/android/ui/state/CatalogHit;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->kind:Lcom/pymcl/android/ui/state/CatalogKind;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->hit:Lcom/pymcl/android/ui/state/CatalogHit;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->copy(Lcom/pymcl/android/ui/state/CatalogKind;Lcom/pymcl/android/ui/state/CatalogHit;)Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/pymcl/android/ui/state/CatalogKind;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->kind:Lcom/pymcl/android/ui/state/CatalogKind;

    return-object v0
.end method

.method public final component2()Lcom/pymcl/android/ui/state/CatalogHit;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->hit:Lcom/pymcl/android/ui/state/CatalogHit;

    return-object v0
.end method

.method public final copy(Lcom/pymcl/android/ui/state/CatalogKind;Lcom/pymcl/android/ui/state/CatalogHit;)Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;
    .locals 1

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;

    invoke-direct {v0, p1, p2}, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;-><init>(Lcom/pymcl/android/ui/state/CatalogKind;Lcom/pymcl/android/ui/state/CatalogHit;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;

    iget-object v3, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->kind:Lcom/pymcl/android/ui/state/CatalogKind;

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->hit:Lcom/pymcl/android/ui/state/CatalogHit;

    iget-object v1, v1, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->hit:Lcom/pymcl/android/ui/state/CatalogHit;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getHit()Lcom/pymcl/android/ui/state/CatalogHit;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->hit:Lcom/pymcl/android/ui/state/CatalogHit;

    return-object v0
.end method

.method public final getKind()Lcom/pymcl/android/ui/state/CatalogKind;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->kind:Lcom/pymcl/android/ui/state/CatalogKind;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->kind:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/CatalogKind;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->hit:Lcom/pymcl/android/ui/state/CatalogHit;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/CatalogHit;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;->hit:Lcom/pymcl/android/ui/state/CatalogHit;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CatalogFiles(kind="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", hit="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
