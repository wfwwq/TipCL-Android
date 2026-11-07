.class public final synthetic Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f$0:[I

.field public final synthetic f$1:I


# direct methods
.method public synthetic constructor <init>([II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda0;->f$0:[I

    iput p2, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda0;->f$1:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda0;->f$0:[I

    iget v1, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda0;->f$1:I

    invoke-static {v0, v1, p1, p2}, Lorg/libsdl/app/SDLActivity;->lambda$messageboxShowMessageBox$0([IILandroid/content/DialogInterface;I)V

    return-void
.end method
