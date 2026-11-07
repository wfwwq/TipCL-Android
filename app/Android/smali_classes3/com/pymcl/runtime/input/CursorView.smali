.class public final Lcom/pymcl/runtime/input/CursorView;
.super Landroid/view/View;
.source "CursorView.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCursorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorView.kt\ncom/pymcl/runtime/input/CursorView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tJ\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u000b\"\u0004\u0008\u0010\u0010\r\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/CursorView;",
        "Landroid/view/View;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "p",
        "Landroid/graphics/Paint;",
        "cx",
        "",
        "getCx",
        "()F",
        "setCx",
        "(F)V",
        "cy",
        "getCy",
        "setCy",
        "moveTo",
        "",
        "x",
        "y",
        "onDraw",
        "c",
        "Landroid/graphics/Canvas;",
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
.field private cx:F

.field private cy:F

.field private final p:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 13
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/pymcl/runtime/input/CursorView;->p:Landroid/graphics/Paint;

    .line 12
    return-void
.end method


# virtual methods
.method public final getCx()F
    .locals 1

    .line 14
    iget v0, p0, Lcom/pymcl/runtime/input/CursorView;->cx:F

    return v0
.end method

.method public final getCy()F
    .locals 1

    .line 14
    iget v0, p0, Lcom/pymcl/runtime/input/CursorView;->cy:F

    return v0
.end method

.method public final moveTo(FF)V
    .locals 0
    .param p1, "x"    # F
    .param p2, "y"    # F

    .line 15
    iput p1, p0, Lcom/pymcl/runtime/input/CursorView;->cx:F

    iput p2, p0, Lcom/pymcl/runtime/input/CursorView;->cy:F

    invoke-virtual {p0}, Lcom/pymcl/runtime/input/CursorView;->invalidate()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 7
    .param p1, "c"    # Landroid/graphics/Canvas;

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    const/high16 v0, 0x41e00000    # 28.0f

    .line 18
    .local v0, "s":F
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    move-object v2, v1

    .line 24
    .local v2, "$this$onDraw_u24lambda_u240":Landroid/graphics/Path;
    const/4 v3, 0x0

    .line 18
    .local v3, "$i$a$-apply-CursorView$onDraw$path$1":I
    iget v4, p0, Lcom/pymcl/runtime/input/CursorView;->cx:F

    iget v5, p0, Lcom/pymcl/runtime/input/CursorView;->cy:F

    invoke-virtual {v2, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    iget v4, p0, Lcom/pymcl/runtime/input/CursorView;->cx:F

    iget v5, p0, Lcom/pymcl/runtime/input/CursorView;->cy:F

    add-float/2addr v5, v0

    invoke-virtual {v2, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    iget v4, p0, Lcom/pymcl/runtime/input/CursorView;->cx:F

    const v5, 0x3e99999a    # 0.3f

    mul-float/2addr v5, v0

    add-float/2addr v4, v5

    iget v5, p0, Lcom/pymcl/runtime/input/CursorView;->cy:F

    const v6, 0x3f3851ec    # 0.72f

    mul-float/2addr v6, v0

    add-float/2addr v5, v6

    invoke-virtual {v2, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    iget v4, p0, Lcom/pymcl/runtime/input/CursorView;->cx:F

    const v5, 0x3f333333    # 0.7f

    mul-float v6, v0, v5

    add-float/2addr v4, v6

    iget v6, p0, Lcom/pymcl/runtime/input/CursorView;->cy:F

    mul-float/2addr v5, v0

    add-float/2addr v6, v5

    invoke-virtual {v2, v4, v6}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    .line 19
    .end local v2    # "$this$onDraw_u24lambda_u240":Landroid/graphics/Path;
    .end local v3    # "$i$a$-apply-CursorView$onDraw$path$1":I
    .local v1, "path":Landroid/graphics/Path;
    iget-object v2, p0, Lcom/pymcl/runtime/input/CursorView;->p:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v2, p0, Lcom/pymcl/runtime/input/CursorView;->p:Landroid/graphics/Paint;

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, p0, Lcom/pymcl/runtime/input/CursorView;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 20
    iget-object v2, p0, Lcom/pymcl/runtime/input/CursorView;->p:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v2, p0, Lcom/pymcl/runtime/input/CursorView;->p:Landroid/graphics/Paint;

    const/high16 v3, 0x40000000    # 2.0f

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v2, p0, Lcom/pymcl/runtime/input/CursorView;->p:Landroid/graphics/Paint;

    const/high16 v3, -0x1000000

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, p0, Lcom/pymcl/runtime/input/CursorView;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 21
    return-void
.end method

.method public final setCx(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 14
    iput p1, p0, Lcom/pymcl/runtime/input/CursorView;->cx:F

    return-void
.end method

.method public final setCy(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 14
    iput p1, p0, Lcom/pymcl/runtime/input/CursorView;->cy:F

    return-void
.end method
