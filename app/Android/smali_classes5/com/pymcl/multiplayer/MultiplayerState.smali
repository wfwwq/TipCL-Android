.class public interface abstract Lcom/pymcl/multiplayer/MultiplayerState;
.super Ljava/lang/Object;
.source "MultiplayerController.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/multiplayer/MultiplayerState$Companion;,
        Lcom/pymcl/multiplayer/MultiplayerState$Error;,
        Lcom/pymcl/multiplayer/MultiplayerState$GuestConnecting;,
        Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;,
        Lcom/pymcl/multiplayer/MultiplayerState$GuestStarting;,
        Lcom/pymcl/multiplayer/MultiplayerState$HostOk;,
        Lcom/pymcl/multiplayer/MultiplayerState$HostScanning;,
        Lcom/pymcl/multiplayer/MultiplayerState$HostStarting;,
        Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;,
        Lcom/pymcl/multiplayer/MultiplayerState$Uninitialized;,
        Lcom/pymcl/multiplayer/MultiplayerState$Waiting;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u0000 \u000c2\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/pymcl/multiplayer/MultiplayerState;",
        "",
        "Uninitialized",
        "Unavailable",
        "Waiting",
        "HostScanning",
        "HostStarting",
        "HostOk",
        "GuestConnecting",
        "GuestStarting",
        "GuestOk",
        "Error",
        "Companion",
        "Lcom/pymcl/multiplayer/MultiplayerState$Error;",
        "Lcom/pymcl/multiplayer/MultiplayerState$GuestConnecting;",
        "Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;",
        "Lcom/pymcl/multiplayer/MultiplayerState$GuestStarting;",
        "Lcom/pymcl/multiplayer/MultiplayerState$HostOk;",
        "Lcom/pymcl/multiplayer/MultiplayerState$HostScanning;",
        "Lcom/pymcl/multiplayer/MultiplayerState$HostStarting;",
        "Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;",
        "Lcom/pymcl/multiplayer/MultiplayerState$Uninitialized;",
        "Lcom/pymcl/multiplayer/MultiplayerState$Waiting;",
        "PyMCL-Android:multiplayer_debug"
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
.field public static final Companion:Lcom/pymcl/multiplayer/MultiplayerState$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerState$Companion;->$$INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$Companion;

    sput-object v0, Lcom/pymcl/multiplayer/MultiplayerState;->Companion:Lcom/pymcl/multiplayer/MultiplayerState$Companion;

    return-void
.end method
