.class final synthetic Lcom/pymcl/android/data/SettingsLogic$Extras$toConfig$3;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "SettingsLogic.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/SettingsLogic$Extras;->toConfig(Lcom/pymcl/android/ui/state/UiSettings;Ljava/util/Map;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1018
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        ">;"
    }
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
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-class v3, Lcom/pymcl/android/data/SettingsLogic;

    const-string v5, "gcIndex(Ljava/lang/String;)I"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-string v4, "gcIndex"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1
    .param p1, "p0"    # Ljava/lang/String;

    iget-object v0, p0, Lcom/pymcl/android/data/SettingsLogic$Extras$toConfig$3;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/android/data/SettingsLogic;

    .line 56
    invoke-virtual {v0, p1}, Lcom/pymcl/android/data/SettingsLogic;->gcIndex(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 56
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/pymcl/android/data/SettingsLogic$Extras$toConfig$3;->invoke(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
