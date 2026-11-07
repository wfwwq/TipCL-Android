.class public final synthetic Lcom/pymcl/android/data/SaveImportProgress$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Ljava/util/zip/ZipInputStream;


# direct methods
.method public synthetic constructor <init>(Ljava/util/zip/ZipInputStream;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/data/SaveImportProgress$$ExternalSyntheticLambda0;->f$0:Ljava/util/zip/ZipInputStream;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/data/SaveImportProgress$$ExternalSyntheticLambda0;->f$0:Ljava/util/zip/ZipInputStream;

    invoke-static {v0}, Lcom/pymcl/android/data/SaveImportProgress;->$r8$lambda$p6cRC_7d-uUB9XbulunAHCgOBv0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;

    move-result-object v0

    return-object v0
.end method
