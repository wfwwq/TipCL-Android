.class public Lcom/tungsten/fclauncher/CriticalNativeTest;
.super Ljava/lang/Object;
.source "CriticalNativeTest.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static invokeTest()V
    .locals 1

    .line 9
    const/4 v0, 0x0

    invoke-static {v0, v0}, Lcom/tungsten/fclauncher/CriticalNativeTest;->testCriticalNative(II)V

    .line 10
    return-void
.end method

.method public static native testCriticalNative(II)V
    .annotation build Ldalvik/annotation/optimization/CriticalNative;
    .end annotation
.end method
