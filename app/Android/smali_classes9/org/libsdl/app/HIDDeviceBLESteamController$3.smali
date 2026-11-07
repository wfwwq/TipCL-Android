.class Lorg/libsdl/app/HIDDeviceBLESteamController$3;
.super Ljava/lang/Object;
.source "HIDDeviceBLESteamController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/libsdl/app/HIDDeviceBLESteamController;->enableNotification(Ljava/util/UUID;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/libsdl/app/HIDDeviceBLESteamController;

.field final synthetic val$finalThis:Lorg/libsdl/app/HIDDeviceBLESteamController;

.field final synthetic val$finalUuid:Ljava/util/UUID;


# direct methods
.method constructor <init>(Lorg/libsdl/app/HIDDeviceBLESteamController;Lorg/libsdl/app/HIDDeviceBLESteamController;Ljava/util/UUID;)V
    .locals 0
    .param p1, "this$0"    # Lorg/libsdl/app/HIDDeviceBLESteamController;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 508
    iput-object p1, p0, Lorg/libsdl/app/HIDDeviceBLESteamController$3;->this$0:Lorg/libsdl/app/HIDDeviceBLESteamController;

    iput-object p2, p0, Lorg/libsdl/app/HIDDeviceBLESteamController$3;->val$finalThis:Lorg/libsdl/app/HIDDeviceBLESteamController;

    iput-object p3, p0, Lorg/libsdl/app/HIDDeviceBLESteamController$3;->val$finalUuid:Ljava/util/UUID;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 511
    iget-object v0, p0, Lorg/libsdl/app/HIDDeviceBLESteamController$3;->val$finalThis:Lorg/libsdl/app/HIDDeviceBLESteamController;

    invoke-static {v0}, Lorg/libsdl/app/HIDDeviceBLESteamController;->-$$Nest$fgetmHasEnabledNotifications(Lorg/libsdl/app/HIDDeviceBLESteamController;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 513
    iget-object v0, p0, Lorg/libsdl/app/HIDDeviceBLESteamController$3;->val$finalThis:Lorg/libsdl/app/HIDDeviceBLESteamController;

    invoke-static {v0}, Lorg/libsdl/app/HIDDeviceBLESteamController;->-$$Nest$fgetmHasSeenInputUpdate(Lorg/libsdl/app/HIDDeviceBLESteamController;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 516
    const-string v0, "hidapi"

    const-string v1, "WriteDescriptor has never returned, but we\'ve seen input reports. Moving on with controller initialization."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 517
    iget-object v0, p0, Lorg/libsdl/app/HIDDeviceBLESteamController$3;->val$finalThis:Lorg/libsdl/app/HIDDeviceBLESteamController;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lorg/libsdl/app/HIDDeviceBLESteamController;->-$$Nest$fputmHasEnabledNotifications(Lorg/libsdl/app/HIDDeviceBLESteamController;Z)V

    .line 518
    iget-object v0, p0, Lorg/libsdl/app/HIDDeviceBLESteamController$3;->val$finalThis:Lorg/libsdl/app/HIDDeviceBLESteamController;

    invoke-static {v0}, Lorg/libsdl/app/HIDDeviceBLESteamController;->-$$Nest$menableValveMode(Lorg/libsdl/app/HIDDeviceBLESteamController;)V

    .line 519
    return-void

    .line 523
    :cond_0
    iget-object v0, p0, Lorg/libsdl/app/HIDDeviceBLESteamController$3;->val$finalThis:Lorg/libsdl/app/HIDDeviceBLESteamController;

    invoke-static {v0}, Lorg/libsdl/app/HIDDeviceBLESteamController;->-$$Nest$fgetmGatt(Lorg/libsdl/app/HIDDeviceBLESteamController;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    iget-object v1, p0, Lorg/libsdl/app/HIDDeviceBLESteamController$3;->val$finalUuid:Ljava/util/UUID;

    const/16 v2, 0x1f4

    invoke-static {v0, v1, v2}, Lorg/libsdl/app/HIDDeviceBLESteamController$GattOperation;->enableNotification(Landroid/bluetooth/BluetoothGatt;Ljava/util/UUID;I)Lorg/libsdl/app/HIDDeviceBLESteamController$GattOperation;

    move-result-object v0

    .line 524
    .local v0, "retry":Lorg/libsdl/app/HIDDeviceBLESteamController$GattOperation;
    iget-object v1, p0, Lorg/libsdl/app/HIDDeviceBLESteamController$3;->val$finalThis:Lorg/libsdl/app/HIDDeviceBLESteamController;

    invoke-static {v1, v0}, Lorg/libsdl/app/HIDDeviceBLESteamController;->-$$Nest$mqueueGattOperation(Lorg/libsdl/app/HIDDeviceBLESteamController;Lorg/libsdl/app/HIDDeviceBLESteamController$GattOperation;)V

    .line 526
    .end local v0    # "retry":Lorg/libsdl/app/HIDDeviceBLESteamController$GattOperation;
    :cond_1
    return-void
.end method
