.class final Lcom/pymcl/android/ui/dialogs/LocalThumbs;
.super Ljava/lang/Object;
.source "SavesDialog.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSavesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavesDialog.kt\ncom/pymcl/android/ui/dialogs/LocalThumbs\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,393:1\n1#2:394\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0005\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/pymcl/android/ui/dialogs/LocalThumbs;",
        "",
        "<init>",
        "()V",
        "mem",
        "com/pymcl/android/ui/dialogs/LocalThumbs$mem$1",
        "Lcom/pymcl/android/ui/dialogs/LocalThumbs$mem$1;",
        "load",
        "Landroid/graphics/Bitmap;",
        "path",
        "",
        "targetPx",
        "",
        "PyMCL-Android:app_debug"
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
.field public static final INSTANCE:Lcom/pymcl/android/ui/dialogs/LocalThumbs;

.field private static final mem:Lcom/pymcl/android/ui/dialogs/LocalThumbs$mem$1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/pymcl/android/ui/dialogs/LocalThumbs;

    invoke-direct {v0}, Lcom/pymcl/android/ui/dialogs/LocalThumbs;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/dialogs/LocalThumbs;->INSTANCE:Lcom/pymcl/android/ui/dialogs/LocalThumbs;

    .line 372
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    const/16 v2, 0x20

    int-to-long v2, v2

    div-long/2addr v0, v2

    long-to-int v0, v0

    const/high16 v1, 0x200000

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    new-instance v1, Lcom/pymcl/android/ui/dialogs/LocalThumbs$mem$1;

    invoke-direct {v1, v0}, Lcom/pymcl/android/ui/dialogs/LocalThumbs$mem$1;-><init>(I)V

    sput-object v1, Lcom/pymcl/android/ui/dialogs/LocalThumbs;->mem:Lcom/pymcl/android/ui/dialogs/LocalThumbs$mem$1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 371
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final load(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    .locals 10
    .param p1, "path"    # Ljava/lang/String;
    .param p2, "targetPx"    # I

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 376
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .local v0, "f":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "@"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 377
    .local v1, "key":Ljava/lang/String;
    sget-object v2, Lcom/pymcl/android/ui/dialogs/LocalThumbs;->mem:Lcom/pymcl/android/ui/dialogs/LocalThumbs$mem$1;

    invoke-virtual {v2, v1}, Lcom/pymcl/android/ui/dialogs/LocalThumbs$mem$1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    if-eqz v2, :cond_0

    .line 394
    .local v2, "it\\1":Landroid/graphics/Bitmap;
    const/4 v3, 0x0

    .line 377
    .local v3, "$i$a$-let-LocalThumbs$load$1\\1\\377\\0":I
    return-object v2

    .line 378
    .end local v2    # "it\\1":Landroid/graphics/Bitmap;
    .end local v3    # "$i$a$-let-LocalThumbs$load$1\\1\\377\\0":I
    :cond_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    move-object v3, v2

    .line 394
    .local v3, "$this$load_u24lambda_u241\\2":Landroid/graphics/BitmapFactory$Options;
    const/4 v4, 0x0

    .line 378
    .local v4, "$i$a$-apply-LocalThumbs$load$o$1\\2\\378\\0":I
    const/4 v5, 0x1

    iput-boolean v5, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .end local v3    # "$this$load_u24lambda_u241\\2":Landroid/graphics/BitmapFactory$Options;
    .end local v4    # "$i$a$-apply-LocalThumbs$load$o$1\\2\\378\\0":I
    .local v2, "o":Landroid/graphics/BitmapFactory$Options;
    invoke-static {p1, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 379
    iget v3, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    const/4 v4, 0x0

    if-gtz v3, :cond_1

    return-object v4

    .line 380
    :cond_1
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 394
    move-object v5, v3

    .local v5, "$this$load_u24lambda_u242\\3":Landroid/graphics/BitmapFactory$Options;
    const/4 v6, 0x0

    .line 380
    .local v6, "$i$a$-apply-LocalThumbs$load$bm$1\\3\\380\\0":I
    sget-object v7, Lcom/pymcl/android/ui/components/ThumbMath;->INSTANCE:Lcom/pymcl/android/ui/components/ThumbMath;

    iget v8, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v9, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-virtual {v7, v8, v9, p2}, Lcom/pymcl/android/ui/components/ThumbMath;->sampleSize(III)I

    move-result v7

    iput v7, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .end local v5    # "$this$load_u24lambda_u242\\3":Landroid/graphics/BitmapFactory$Options;
    .end local v6    # "$i$a$-apply-LocalThumbs$load$bm$1\\3\\380\\0":I
    invoke-static {p1, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v3

    if-nez v3, :cond_2

    return-object v4

    .line 381
    .local v3, "bm":Landroid/graphics/Bitmap;
    :cond_2
    sget-object v4, Lcom/pymcl/android/ui/dialogs/LocalThumbs;->mem:Lcom/pymcl/android/ui/dialogs/LocalThumbs$mem$1;

    invoke-virtual {v4, v1, v3}, Lcom/pymcl/android/ui/dialogs/LocalThumbs$mem$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3
.end method
