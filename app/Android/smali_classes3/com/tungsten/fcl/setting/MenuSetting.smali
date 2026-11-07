.class public Lcom/tungsten/fcl/setting/MenuSetting;
.super Ljava/lang/Object;
.source "MenuSetting.java"


# instance fields
.field private forceResolution:Z

.field private forceResolutionHeight:I

.field private forceResolutionWidth:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    const/16 v0, 0x780

    iput v0, p0, Lcom/tungsten/fcl/setting/MenuSetting;->forceResolutionWidth:I

    .line 10
    const/16 v0, 0x438

    iput v0, p0, Lcom/tungsten/fcl/setting/MenuSetting;->forceResolutionHeight:I

    return-void
.end method


# virtual methods
.method public getForceResolutionHeight()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/tungsten/fcl/setting/MenuSetting;->forceResolutionHeight:I

    return v0
.end method

.method public getForceResolutionWidth()I
    .locals 1

    .line 14
    iget v0, p0, Lcom/tungsten/fcl/setting/MenuSetting;->forceResolutionWidth:I

    return v0
.end method

.method public isForceResolution()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lcom/tungsten/fcl/setting/MenuSetting;->forceResolution:Z

    return v0
.end method

.method public setForceResolution(Z)V
    .locals 0
    .param p1, "v"    # Z

    .line 13
    iput-boolean p1, p0, Lcom/tungsten/fcl/setting/MenuSetting;->forceResolution:Z

    return-void
.end method

.method public setForceResolutionHeight(I)V
    .locals 0
    .param p1, "v"    # I

    .line 17
    iput p1, p0, Lcom/tungsten/fcl/setting/MenuSetting;->forceResolutionHeight:I

    return-void
.end method

.method public setForceResolutionWidth(I)V
    .locals 0
    .param p1, "v"    # I

    .line 15
    iput p1, p0, Lcom/tungsten/fcl/setting/MenuSetting;->forceResolutionWidth:I

    return-void
.end method
