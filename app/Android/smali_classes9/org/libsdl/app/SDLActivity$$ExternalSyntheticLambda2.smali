.class public final synthetic Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f$0:[I

.field public final synthetic f$1:I

.field public final synthetic f$2:Landroid/app/AlertDialog;


# direct methods
.method public synthetic constructor <init>([IILandroid/app/AlertDialog;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda2;->f$0:[I

    iput p2, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda2;->f$1:I

    iput-object p3, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda2;->f$2:Landroid/app/AlertDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda2;->f$0:[I

    iget v1, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda2;->f$1:I

    iget-object v2, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda2;->f$2:Landroid/app/AlertDialog;

    invoke-static {v0, v1, v2, p1}, Lorg/libsdl/app/SDLActivity;->lambda$messageboxShowMessageBox$2([IILandroid/app/AlertDialog;Landroid/view/View;)V

    return-void
.end method
