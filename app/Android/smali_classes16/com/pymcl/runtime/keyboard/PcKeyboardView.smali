.class public final Lcom/pymcl/runtime/keyboard/PcKeyboardView;
.super Landroid/widget/LinearLayout;
.source "PcKeyboardView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/keyboard/PcKeyboardView$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPcKeyboardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PcKeyboardView.kt\ncom/pymcl/runtime/keyboard/PcKeyboardView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,116:1\n1#2:117\n221#3,2:118\n*S KotlinDebug\n*F\n+ 1 PcKeyboardView.kt\ncom/pymcl/runtime/keyboard/PcKeyboardView\n*L\n106#1:118,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0008\u0010\u0017\u001a\u00020\u0008H\u0002R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0016\u0008\u0019\u0012\u0012\u0008\u001a\u0012\u000e\u0008\u000cJ\u0004\u0008\u0008(\u001bJ\u0004\u0008\u0008(\u001c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/pymcl/runtime/keyboard/PcKeyboardView;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "sink",
        "Lcom/pymcl/runtime/input/InputSink;",
        "onClose",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;)V",
        "sticky",
        "Lcom/pymcl/runtime/keyboard/StickyModifiers;",
        "getSticky",
        "()Lcom/pymcl/runtime/keyboard/StickyModifiers;",
        "modViews",
        "Ljava/util/HashMap;",
        "",
        "Landroid/widget/TextView;",
        "Lkotlin/collections/HashMap;",
        "keyView",
        "k",
        "Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;",
        "refreshMods",
        "PyMCL-Android:runtime_debug",
        "Landroid/annotation/SuppressLint;",
        "value",
        "ViewConstructor",
        "ClickableViewAccessibility"
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
.field private final modViews:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private final onClose:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final sticky:Lcom/pymcl/runtime/keyboard/StickyModifiers;


# direct methods
.method public static synthetic $r8$lambda$oDaTT7haonZYBhQmUM5vdS01T28(Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;Lcom/pymcl/runtime/keyboard/PcKeyboardView;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->keyView$lambda$0$1(Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;Lcom/pymcl/runtime/keyboard/PcKeyboardView;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;)V
    .locals 11
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "sink"    # Lcom/pymcl/runtime/input/InputSink;
    .param p3, "onClose"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/pymcl/runtime/input/InputSink;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClose"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    nop

    .line 63
    nop

    .line 62
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 63
    iput-object p3, p0, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->onClose:Lkotlin/jvm/functions/Function0;

    .line 64
    new-instance v0, Lcom/pymcl/runtime/keyboard/StickyModifiers;

    invoke-direct {v0, p2}, Lcom/pymcl/runtime/keyboard/StickyModifiers;-><init>(Lcom/pymcl/runtime/input/InputSink;)V

    iput-object v0, p0, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->sticky:Lcom/pymcl/runtime/keyboard/StickyModifiers;

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->modViews:Ljava/util/HashMap;

    .line 67
    nop

    .line 68
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->setOrientation(I)V

    .line 69
    const/16 v0, 0xaa

    const/16 v1, 0x14

    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->setBackgroundColor(I)V

    .line 70
    const/4 v0, 0x6

    invoke-virtual {p0, v0, v0, v0, v0}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->setPadding(IIII)V

    .line 71
    sget-object v0, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->INSTANCE:Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->getRows()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 72
    .local v1, "r":Ljava/util/List;
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    move-object v3, v2

    .line 117
    .local v3, "$this$_init__u24lambda_u240":Landroid/widget/LinearLayout;
    const/4 v4, 0x0

    .line 72
    .local v4, "$i$a$-apply-PcKeyboardView$line$1":I
    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 73
    .end local v3    # "$this$_init__u24lambda_u240":Landroid/widget/LinearLayout;
    .end local v4    # "$i$a$-apply-PcKeyboardView$line$1":I
    .local v2, "line":Landroid/widget/LinearLayout;
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v6, -0x1

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    .local v4, "k":Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;
    invoke-direct {p0, v4}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->keyView(Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;)Landroid/widget/TextView;

    move-result-object v7

    check-cast v7, Landroid/view/View;

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v4}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;->getWeight()F

    move-result v9

    invoke-direct {v8, v5, v6, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 117
    move-object v6, v8

    .local v6, "$this$_init__u24lambda_u241":Landroid/widget/LinearLayout$LayoutParams;
    const/4 v9, 0x0

    .line 73
    .local v9, "$i$a$-apply-PcKeyboardView$1":I
    const/4 v10, 0x3

    invoke-virtual {v6, v10, v10, v10, v10}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .end local v6    # "$this$_init__u24lambda_u241":Landroid/widget/LinearLayout$LayoutParams;
    .end local v9    # "$i$a$-apply-PcKeyboardView$1":I
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    check-cast v8, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v2, v7, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .end local v4    # "k":Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;
    goto :goto_1

    .line 74
    :cond_0
    move-object v3, v2

    check-cast v3, Landroid/view/View;

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v4, v6, v5, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    check-cast v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v3, v4}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .end local v1    # "r":Ljava/util/List;
    .end local v2    # "line":Landroid/widget/LinearLayout;
    goto :goto_0

    .line 76
    :cond_1
    nop

    .line 63
    return-void
.end method

.method private final keyView(Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;)Landroid/widget/TextView;
    .locals 8
    .param p1, "k"    # Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;

    .line 78
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object v1, v0

    .local v1, "$this$keyView_u24lambda_u240":Landroid/widget/TextView;
    const/4 v2, 0x0

    .line 79
    .local v2, "$i$a$-apply-PcKeyboardView$keyView$1":I
    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;->getLabel()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v3, 0x11

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v3, -0x1

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v3, 0x41500000    # 13.0f

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 80
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 117
    move-object v4, v3

    .local v4, "$this$keyView_u24lambda_u240_u240":Landroid/graphics/drawable/GradientDrawable;
    const/4 v5, 0x0

    .line 80
    .local v5, "$i$a$-apply-PcKeyboardView$keyView$1$1":I
    const/high16 v6, 0x41200000    # 10.0f

    invoke-virtual {v4, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/16 v6, 0x96

    const/16 v7, 0x46

    invoke-static {v6, v7, v7, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .end local v4    # "$this$keyView_u24lambda_u240_u240":Landroid/graphics/drawable/GradientDrawable;
    .end local v5    # "$i$a$-apply-PcKeyboardView$keyView$1$1":I
    check-cast v3, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 81
    sget-object v3, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->INSTANCE:Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;

    invoke-virtual {v3}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->getMODIFIERS()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;->getKey()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->modViews:Ljava/util/HashMap;

    check-cast v3, Ljava/util/Map;

    invoke-virtual {p1}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;->getKey()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    :cond_0
    new-instance v3, Lcom/pymcl/runtime/keyboard/PcKeyboardView$$ExternalSyntheticLambda0;

    invoke-direct {v3, p1, p0}, Lcom/pymcl/runtime/keyboard/PcKeyboardView$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;Lcom/pymcl/runtime/keyboard/PcKeyboardView;)V

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 103
    nop

    .line 78
    .end local v1    # "$this$keyView_u24lambda_u240":Landroid/widget/TextView;
    .end local v2    # "$i$a$-apply-PcKeyboardView$keyView$1":I
    nop

    .line 103
    return-object v0
.end method

.method private static final keyView$lambda$0$1(Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;Lcom/pymcl/runtime/keyboard/PcKeyboardView;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4
    .param p0, "$k"    # Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;
    .param p1, "this$0"    # Lcom/pymcl/runtime/keyboard/PcKeyboardView;
    .param p2, "v"    # Landroid/view/View;
    .param p3, "e"    # Landroid/view/MotionEvent;

    .line 83
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const-string v1, "@close"

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_0

    .line 93
    :pswitch_1
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 94
    nop

    .line 95
    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->sticky:Lcom/pymcl/runtime/keyboard/StickyModifiers;

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/StickyModifiers;->releaseAll()V

    invoke-direct {p1}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->refreshMods()V

    iget-object v0, p1, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->onClose:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_0

    .line 96
    :cond_0
    sget-object v0, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->INSTANCE:Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->getMODIFIERS()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 97
    iget-object v0, p1, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->sticky:Lcom/pymcl/runtime/keyboard/StickyModifiers;

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;->getKey()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lcom/pymcl/runtime/keyboard/StickyModifiers;->normal(Ljava/lang/String;Z)V

    invoke-direct {p1}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->refreshMods()V

    goto :goto_0

    .line 85
    :pswitch_2
    const v0, 0x3f19999a    # 0.6f

    invoke-virtual {p2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 86
    nop

    .line 87
    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 88
    sget-object v0, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->INSTANCE:Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;->getMODIFIERS()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->sticky:Lcom/pymcl/runtime/keyboard/StickyModifiers;

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/keyboard/StickyModifiers;->tapModifier(Ljava/lang/String;)V

    invoke-direct {p1}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->refreshMods()V

    goto :goto_0

    .line 89
    :cond_1
    iget-object v0, p1, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->sticky:Lcom/pymcl/runtime/keyboard/StickyModifiers;

    invoke-virtual {p0}, Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/runtime/keyboard/StickyModifiers;->normal(Ljava/lang/String;Z)V

    .line 101
    :cond_2
    :goto_0
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private final refreshMods()V
    .locals 13

    .line 106
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->modViews:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    .local v0, "$this$forEach$iv":Ljava/util/Map;
    const/4 v1, 0x0

    .line 118
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .local v3, "element$iv":Ljava/util/Map$Entry;
    const/4 v4, 0x0

    .local v4, "$i$a$-forEach-PcKeyboardView$refreshMods$1":I
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .local v5, "key":Ljava/lang/String;
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 107
    .local v6, "v":Landroid/widget/TextView;
    iget-object v7, p0, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->sticky:Lcom/pymcl/runtime/keyboard/StickyModifiers;

    invoke-virtual {v7}, Lcom/pymcl/runtime/keyboard/StickyModifiers;->getStates()Ljava/util/HashMap;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    if-nez v7, :cond_0

    sget-object v7, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->OFF:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    .line 108
    .local v7, "st":Lcom/pymcl/runtime/keyboard/StickyModifiers$State;
    :cond_0
    invoke-virtual {v6}, Landroid/widget/TextView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v8

    const-string v9, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroid/graphics/drawable/GradientDrawable;

    sget-object v9, Lcom/pymcl/runtime/keyboard/PcKeyboardView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v7}, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->ordinal()I

    move-result v10

    aget v9, v9, v10

    packed-switch v9, :pswitch_data_0

    new-instance v2, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v2}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v2

    .line 111
    :pswitch_0
    const/16 v9, 0x8c

    const/16 v10, 0x1e

    const/16 v11, 0xe6

    const/16 v12, 0xdc

    invoke-static {v11, v12, v9, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v9

    goto :goto_1

    .line 110
    :pswitch_1
    const/16 v9, 0x9b

    const/16 v10, 0x6b

    const/16 v11, 0xc8

    const/16 v12, 0x2e

    invoke-static {v11, v12, v9, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v9

    goto :goto_1

    .line 109
    :pswitch_2
    const/16 v9, 0x96

    const/16 v10, 0x46

    invoke-static {v9, v10, v10, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v9

    .line 108
    :goto_1
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 113
    .end local v7    # "st":Lcom/pymcl/runtime/keyboard/StickyModifiers$State;
    nop

    .line 118
    .end local v4    # "$i$a$-forEach-PcKeyboardView$refreshMods$1":I
    .end local v5    # "key":Ljava/lang/String;
    .end local v6    # "v":Landroid/widget/TextView;
    nop

    .end local v3    # "element$iv":Ljava/util/Map$Entry;
    goto :goto_0

    .line 119
    :cond_1
    nop

    .line 114
    .end local v0    # "$this$forEach$iv":Ljava/util/Map;
    .end local v1    # "$i$f$forEach":I
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final getSticky()Lcom/pymcl/runtime/keyboard/StickyModifiers;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->sticky:Lcom/pymcl/runtime/keyboard/StickyModifiers;

    return-object v0
.end method
