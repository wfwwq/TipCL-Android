.class public final synthetic Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Landroid/app/Activity;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:[I

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:[Ljava/lang/String;

.field public final synthetic f$5:[I

.field public final synthetic f$6:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;[ILjava/lang/String;[Ljava/lang/String;[ILjava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$0:Landroid/app/Activity;

    iput-object p2, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$2:[I

    iput-object p4, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$4:[Ljava/lang/String;

    iput-object p6, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$5:[I

    iput-object p7, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$6:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 0
    iget-object v0, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$0:Landroid/app/Activity;

    iget-object v1, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$2:[I

    iget-object v3, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$3:Ljava/lang/String;

    iget-object v4, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$4:[Ljava/lang/String;

    iget-object v5, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$5:[I

    iget-object v6, p0, Lorg/libsdl/app/SDLActivity$$ExternalSyntheticLambda3;->f$6:Ljava/util/concurrent/CountDownLatch;

    invoke-static/range {v0 .. v6}, Lorg/libsdl/app/SDLActivity;->lambda$messageboxShowMessageBox$3(Landroid/app/Activity;Ljava/lang/String;[ILjava/lang/String;[Ljava/lang/String;[ILjava/util/concurrent/CountDownLatch;)V

    return-void
.end method
