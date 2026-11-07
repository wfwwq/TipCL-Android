.class public final synthetic Lcom/pymcl/core/mods/ModpackExport$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ljava/io/File;

    invoke-static {p1}, Lcom/pymcl/core/mods/ModpackExport;->$r8$lambda$JE0xCxVDmQEDiZZf1DjjbRXQ7IM(Ljava/io/File;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1
.end method
