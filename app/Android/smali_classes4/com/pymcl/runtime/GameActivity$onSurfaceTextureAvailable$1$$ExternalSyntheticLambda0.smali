.class public final synthetic Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/runtime/GameActivity;

.field public final synthetic f$1:I


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/runtime/GameActivity;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/runtime/GameActivity;

    iput p2, p0, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1$$ExternalSyntheticLambda0;->f$1:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/runtime/GameActivity;

    iget v1, p0, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1$$ExternalSyntheticLambda0;->f$1:I

    invoke-static {v0, v1}, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;->$r8$lambda$-bhJ0XXhiXh5RroGM9N94TbauH4(Lcom/pymcl/runtime/GameActivity;I)V

    return-void
.end method
