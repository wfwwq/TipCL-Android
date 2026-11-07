.class public final Lcom/tungsten/fclauncher/keycodes/MinecraftKeyBindingMapper;
.super Ljava/lang/Object;
.source "MinecraftKeyBindingMapper.java"


# static fields
.field public static final BINDING_CHAT:Ljava/lang/String; = "key_key.chat"

.field public static final BINDING_DROP:Ljava/lang/String; = "key_key.drop"

.field public static final BINDING_HOTBAR_1:Ljava/lang/String; = "key_key.hotbar.1"

.field public static final BINDING_HOTBAR_2:Ljava/lang/String; = "key_key.hotbar.2"

.field public static final BINDING_HOTBAR_3:Ljava/lang/String; = "key_key.hotbar.3"

.field public static final BINDING_HOTBAR_4:Ljava/lang/String; = "key_key.hotbar.4"

.field public static final BINDING_HOTBAR_5:Ljava/lang/String; = "key_key.hotbar.5"

.field public static final BINDING_HOTBAR_6:Ljava/lang/String; = "key_key.hotbar.6"

.field public static final BINDING_HOTBAR_7:Ljava/lang/String; = "key_key.hotbar.7"

.field public static final BINDING_HOTBAR_8:Ljava/lang/String; = "key_key.hotbar.8"

.field public static final BINDING_HOTBAR_9:Ljava/lang/String; = "key_key.hotbar.9"

.field public static final BINDING_SWAP_HANDS:Ljava/lang/String; = "key_key.swapHands"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getGlfwKeycode(Ljava/lang/String;)Ljava/lang/Short;
    .locals 31
    .param p0, "keybinding"    # Ljava/lang/String;

    .line 49
    move-object/from16 v0, p0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x24

    const/16 v3, 0x17

    const/16 v4, 0x23

    const/16 v5, 0x22

    const/16 v6, 0x21

    const/16 v7, 0x12

    const/16 v8, 0x20

    const/16 v9, 0x2e

    const/16 v10, 0x30

    const/16 v11, 0x1e

    const/16 v12, 0xa

    const/16 v13, 0x9

    const/16 v14, 0x8

    const/16 v15, 0xb

    const/16 v16, 0x0

    const/16 v17, 0x7

    .line 58
    invoke-static/range {v17 .. v17}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v18

    .line 49
    const/16 v19, 0x6

    .line 57
    invoke-static/range {v19 .. v19}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v20

    .line 49
    const/16 v21, 0x5

    .line 56
    invoke-static/range {v21 .. v21}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v22

    .line 49
    const/16 v23, 0x4

    .line 55
    invoke-static/range {v23 .. v23}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v24

    .line 49
    const/16 v25, 0x3

    .line 54
    invoke-static/range {v25 .. v25}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v26

    .line 49
    const/16 v27, 0x2

    .line 53
    invoke-static/range {v27 .. v27}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v28

    .line 49
    const/16 v29, 0x1

    .line 52
    invoke-static/range {v29 .. v29}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v30

    .line 49
    sparse-switch v1, :sswitch_data_0

    :cond_0
    goto/16 :goto_0

    :sswitch_0
    const-string v1, "key.keyboard.insert"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x6b

    goto/16 :goto_1

    :sswitch_1
    const-string v1, "key.keyboard.escape"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x66

    goto/16 :goto_1

    :sswitch_2
    const-string v1, "key.keyboard.delete"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x68

    goto/16 :goto_1

    :sswitch_3
    const-string v1, "key.keyboard.left.shift"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x61

    goto/16 :goto_1

    :sswitch_4
    const-string v1, "key.keyboard.tab"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x5e

    goto/16 :goto_1

    :sswitch_5
    const-string v1, "key.keyboard.end"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x69

    goto/16 :goto_1

    :sswitch_6
    const-string v1, "key.keyboard.f24"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x44

    goto/16 :goto_1

    :sswitch_7
    const-string v1, "key.keyboard.f23"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x43

    goto/16 :goto_1

    :sswitch_8
    const-string v1, "key.keyboard.f22"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x42

    goto/16 :goto_1

    :sswitch_9
    const-string v1, "key.keyboard.f21"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x41

    goto/16 :goto_1

    :sswitch_a
    const-string v1, "key.keyboard.f20"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x40

    goto/16 :goto_1

    :sswitch_b
    const-string v1, "key.keyboard.f19"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x3f

    goto/16 :goto_1

    :sswitch_c
    const-string v1, "key.keyboard.f18"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x3e

    goto/16 :goto_1

    :sswitch_d
    const-string v1, "key.keyboard.f17"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x3d

    goto/16 :goto_1

    :sswitch_e
    const-string v1, "key.keyboard.f16"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x3c

    goto/16 :goto_1

    :sswitch_f
    const-string v1, "key.keyboard.f15"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x3b

    goto/16 :goto_1

    :sswitch_10
    const-string v1, "key.keyboard.f14"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x3a

    goto/16 :goto_1

    :sswitch_11
    const-string v1, "key.keyboard.f13"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x39

    goto/16 :goto_1

    :sswitch_12
    const-string v1, "key.keyboard.f12"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x38

    goto/16 :goto_1

    :sswitch_13
    const-string v1, "key.keyboard.f11"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x37

    goto/16 :goto_1

    :sswitch_14
    const-string v1, "key.keyboard.f10"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x36

    goto/16 :goto_1

    :sswitch_15
    const-string v1, "key.keyboard.right.control"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x63

    goto/16 :goto_1

    :sswitch_16
    const-string v1, "key.keyboard.left"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x51

    goto/16 :goto_1

    :sswitch_17
    const-string v1, "key.keyboard.home"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x6a

    goto/16 :goto_1

    :sswitch_18
    const-string v1, "key.keyboard.down"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x50

    goto/16 :goto_1

    :sswitch_19
    const-string v1, "key.keyboard.semicolon"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x5b

    goto/16 :goto_1

    :sswitch_1a
    const-string v1, "key.keyboard.space"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x5d

    goto/16 :goto_1

    :sswitch_1b
    const-string v1, "key.keyboard.slash"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x5c

    goto/16 :goto_1

    :sswitch_1c
    const-string v1, "key.keyboard.right"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x52

    goto/16 :goto_1

    :sswitch_1d
    const-string v1, "key.keyboard.pause"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x6f

    goto/16 :goto_1

    :sswitch_1e
    const-string v1, "key.keyboard.minus"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x5a

    goto/16 :goto_1

    :sswitch_1f
    const-string v1, "key.keyboard.equal"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x57

    goto/16 :goto_1

    :sswitch_20
    const-string v1, "key.keyboard.enter"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x65

    goto/16 :goto_1

    :sswitch_21
    const-string v1, "key.keyboard.comma"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x56

    goto/16 :goto_1

    :sswitch_22
    const-string v1, "key.keyboard.unknown"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v16

    goto/16 :goto_1

    :sswitch_23
    const-string v1, "key.keyboard.apostrophe"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x54

    goto/16 :goto_1

    :sswitch_24
    const-string v1, "key.mouse.left"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v29

    goto/16 :goto_1

    :sswitch_25
    const-string v1, "key.keyboard.page.up"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x6d

    goto/16 :goto_1

    :sswitch_26
    const-string v1, "key.keyboard.num.lock"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x45

    goto/16 :goto_1

    :sswitch_27
    const-string v1, "key.keyboard.right.alt"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x62

    goto/16 :goto_1

    :sswitch_28
    const-string v1, "key.keyboard.caps.lock"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x6e

    goto/16 :goto_1

    :sswitch_29
    const-string v1, "key.keyboard.grave.accent"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x58

    goto/16 :goto_1

    :sswitch_2a
    const-string v1, "key.keyboard.left.control"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x60

    goto/16 :goto_1

    :sswitch_2b
    const-string v1, "key.keyboard.left.alt"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x5f

    goto/16 :goto_1

    :sswitch_2c
    const-string v1, "key.keyboard.up"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x53

    goto/16 :goto_1

    :sswitch_2d
    const-string v1, "key.keyboard.f9"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x35

    goto/16 :goto_1

    :sswitch_2e
    const-string v1, "key.keyboard.f8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x34

    goto/16 :goto_1

    :sswitch_2f
    const-string v1, "key.keyboard.f7"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x33

    goto/16 :goto_1

    :sswitch_30
    const-string v1, "key.keyboard.f6"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x32

    goto/16 :goto_1

    :sswitch_31
    const-string v1, "key.keyboard.f5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x31

    goto/16 :goto_1

    :sswitch_32
    const-string v1, "key.keyboard.f4"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v10

    goto/16 :goto_1

    :sswitch_33
    const-string v1, "key.keyboard.f3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x2f

    goto/16 :goto_1

    :sswitch_34
    const-string v1, "key.keyboard.f2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v9

    goto/16 :goto_1

    :sswitch_35
    const-string v1, "key.keyboard.f1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x2d

    goto/16 :goto_1

    :sswitch_36
    const-string v1, "key.keyboard.right.shift"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x64

    goto/16 :goto_1

    :sswitch_37
    const-string v1, "key.keyboard.left.bracket"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x59

    goto/16 :goto_1

    :sswitch_38
    const-string v1, "key.keyboard.backspace"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x67

    goto/16 :goto_1

    :sswitch_39
    const-string v1, "key.keyboard.backslash"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x55

    goto/16 :goto_1

    :sswitch_3a
    const-string v1, "key.mouse.right"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v27

    goto/16 :goto_1

    :sswitch_3b
    const-string v1, "key.mouse.middle"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v25

    goto/16 :goto_1

    :sswitch_3c
    const-string v1, "key.keyboard.keypad.9"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x4f

    goto/16 :goto_1

    :sswitch_3d
    const-string v1, "key.keyboard.keypad.8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x4e

    goto/16 :goto_1

    :sswitch_3e
    const-string v1, "key.keyboard.keypad.7"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x4d

    goto/16 :goto_1

    :sswitch_3f
    const-string v1, "key.keyboard.keypad.6"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x4c

    goto/16 :goto_1

    :sswitch_40
    const-string v1, "key.keyboard.keypad.5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x4b

    goto/16 :goto_1

    :sswitch_41
    const-string v1, "key.keyboard.keypad.4"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x4a

    goto/16 :goto_1

    :sswitch_42
    const-string v1, "key.keyboard.keypad.3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x49

    goto/16 :goto_1

    :sswitch_43
    const-string v1, "key.keyboard.keypad.2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x48

    goto/16 :goto_1

    :sswitch_44
    const-string v1, "key.keyboard.keypad.1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x47

    goto/16 :goto_1

    :sswitch_45
    const-string v1, "key.keyboard.keypad.0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x46

    goto/16 :goto_1

    :sswitch_46
    const-string v1, "key.keyboard.scroll.lock"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x70

    goto/16 :goto_1

    :sswitch_47
    const-string v1, "key.mouse.8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v14

    goto/16 :goto_1

    :sswitch_48
    const-string v1, "key.mouse.7"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :sswitch_49
    const-string v1, "key.mouse.6"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v19

    goto/16 :goto_1

    :sswitch_4a
    const-string v1, "key.mouse.5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v21

    goto/16 :goto_1

    :sswitch_4b
    const-string v1, "key.mouse.4"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v23

    goto/16 :goto_1

    :sswitch_4c
    const-string v1, "key.keyboard.page.down"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x6c

    goto/16 :goto_1

    :sswitch_4d
    const-string v1, "key.keyboard.z"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x2c

    goto/16 :goto_1

    :sswitch_4e
    const-string v1, "key.keyboard.y"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x2b

    goto/16 :goto_1

    :sswitch_4f
    const-string v1, "key.keyboard.x"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x2a

    goto/16 :goto_1

    :sswitch_50
    const-string v1, "key.keyboard.w"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x29

    goto/16 :goto_1

    :sswitch_51
    const-string v1, "key.keyboard.v"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x28

    goto/16 :goto_1

    :sswitch_52
    const-string v1, "key.keyboard.u"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x27

    goto/16 :goto_1

    :sswitch_53
    const-string v1, "key.keyboard.t"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x26

    goto/16 :goto_1

    :sswitch_54
    const-string v1, "key.keyboard.s"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x25

    goto/16 :goto_1

    :sswitch_55
    const-string v1, "key.keyboard.r"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v2

    goto/16 :goto_1

    :sswitch_56
    const-string v1, "key.keyboard.q"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v4

    goto/16 :goto_1

    :sswitch_57
    const-string v1, "key.keyboard.p"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v5

    goto/16 :goto_1

    :sswitch_58
    const-string v1, "key.keyboard.o"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v6

    goto/16 :goto_1

    :sswitch_59
    const-string v1, "key.keyboard.n"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v8

    goto/16 :goto_1

    :sswitch_5a
    const-string v1, "key.keyboard.m"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x1f

    goto/16 :goto_1

    :sswitch_5b
    const-string v1, "key.keyboard.l"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v11

    goto/16 :goto_1

    :sswitch_5c
    const-string v1, "key.keyboard.k"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x1d

    goto/16 :goto_1

    :sswitch_5d
    const-string v1, "key.keyboard.j"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x1c

    goto/16 :goto_1

    :sswitch_5e
    const-string v1, "key.keyboard.i"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x1b

    goto/16 :goto_1

    :sswitch_5f
    const-string v1, "key.keyboard.h"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x1a

    goto/16 :goto_1

    :sswitch_60
    const-string v1, "key.keyboard.g"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x19

    goto/16 :goto_1

    :sswitch_61
    const-string v1, "key.keyboard.f"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x18

    goto/16 :goto_1

    :sswitch_62
    const-string v1, "key.keyboard.e"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v3

    goto/16 :goto_1

    :sswitch_63
    const-string v1, "key.keyboard.d"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x16

    goto/16 :goto_1

    :sswitch_64
    const-string v1, "key.keyboard.c"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x15

    goto/16 :goto_1

    :sswitch_65
    const-string v1, "key.keyboard.b"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x14

    goto/16 :goto_1

    :sswitch_66
    const-string v1, "key.keyboard.a"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x13

    goto/16 :goto_1

    :sswitch_67
    const-string v1, "key.keyboard.9"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v7

    goto/16 :goto_1

    :sswitch_68
    const-string v1, "key.keyboard.8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x11

    goto :goto_1

    :sswitch_69
    const-string v1, "key.keyboard.7"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0x10

    goto :goto_1

    :sswitch_6a
    const-string v1, "key.keyboard.6"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0xf

    goto :goto_1

    :sswitch_6b
    const-string v1, "key.keyboard.5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0xe

    goto :goto_1

    :sswitch_6c
    const-string v1, "key.keyboard.4"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0xd

    goto :goto_1

    :sswitch_6d
    const-string v1, "key.keyboard.3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v17, 0xc

    goto :goto_1

    :sswitch_6e
    const-string v1, "key.keyboard.2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v15

    goto :goto_1

    :sswitch_6f
    const-string v1, "key.keyboard.1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v12

    goto :goto_1

    :sswitch_70
    const-string v1, "key.keyboard.0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v17, v13

    goto :goto_1

    :goto_0
    const/16 v17, -0x1

    :goto_1
    packed-switch v17, :pswitch_data_0

    .line 163
    const/4 v1, 0x0

    return-object v1

    .line 162
    :pswitch_0
    const/16 v1, 0x46

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 161
    :pswitch_1
    const/16 v1, 0x77

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 160
    :pswitch_2
    const/16 v1, 0x3a

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 159
    :pswitch_3
    const/16 v1, 0x68

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 158
    :pswitch_4
    const/16 v1, 0x6d

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 157
    :pswitch_5
    const/16 v1, 0x6e

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 156
    :pswitch_6
    const/16 v1, 0x66

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 155
    :pswitch_7
    const/16 v1, 0x6b

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 154
    :pswitch_8
    const/16 v1, 0x6f

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 153
    :pswitch_9
    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 152
    :pswitch_a
    return-object v30

    .line 151
    :pswitch_b
    const/16 v1, 0x1c

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 150
    :pswitch_c
    const/16 v1, 0x36

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 149
    :pswitch_d
    const/16 v1, 0x61

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 148
    :pswitch_e
    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 147
    :pswitch_f
    const/16 v1, 0x2a

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 146
    :pswitch_10
    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 145
    :pswitch_11
    const/16 v1, 0x38

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 144
    :pswitch_12
    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 143
    :pswitch_13
    const/16 v1, 0x39

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 142
    :pswitch_14
    const/16 v1, 0x35

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 141
    :pswitch_15
    const/16 v1, 0x27

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 140
    :pswitch_16
    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 139
    :pswitch_17
    const/16 v1, 0x1a

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 138
    :pswitch_18
    const/16 v1, 0x29

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 137
    :pswitch_19
    const/16 v1, 0xd

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 136
    :pswitch_1a
    const/16 v1, 0x33

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 135
    :pswitch_1b
    const/16 v1, 0x2b

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 134
    :pswitch_1c
    const/16 v1, 0x28

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 133
    :pswitch_1d
    const/16 v1, 0x67

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 132
    :pswitch_1e
    const/16 v1, 0x6a

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 131
    :pswitch_1f
    const/16 v1, 0x69

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 130
    :pswitch_20
    const/16 v1, 0x6c

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 129
    :pswitch_21
    const/16 v1, 0x49

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 128
    :pswitch_22
    const/16 v1, 0x48

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 127
    :pswitch_23
    const/16 v1, 0x47

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 126
    :pswitch_24
    const/16 v1, 0x4d

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 125
    :pswitch_25
    const/16 v1, 0x4c

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 124
    :pswitch_26
    const/16 v1, 0x4b

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 123
    :pswitch_27
    const/16 v1, 0x51

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 122
    :pswitch_28
    const/16 v1, 0x50

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 121
    :pswitch_29
    const/16 v1, 0x4f

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 120
    :pswitch_2a
    const/16 v1, 0x52

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 119
    :pswitch_2b
    const/16 v1, 0x45

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 118
    :pswitch_2c
    const/16 v1, 0xc2

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 117
    :pswitch_2d
    const/16 v1, 0xc1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 116
    :pswitch_2e
    const/16 v1, 0xc0

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 115
    :pswitch_2f
    const/16 v1, 0xbf

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 114
    :pswitch_30
    const/16 v1, 0xbe

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 113
    :pswitch_31
    const/16 v1, 0xbd

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 112
    :pswitch_32
    const/16 v1, 0xbc

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 111
    :pswitch_33
    const/16 v1, 0xbb

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 110
    :pswitch_34
    const/16 v1, 0xba

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 109
    :pswitch_35
    const/16 v1, 0xb9

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 108
    :pswitch_36
    const/16 v1, 0xb8

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 107
    :pswitch_37
    const/16 v1, 0xb7

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 106
    :pswitch_38
    const/16 v1, 0x58

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 105
    :pswitch_39
    const/16 v1, 0x57

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 104
    :pswitch_3a
    const/16 v1, 0x44

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 103
    :pswitch_3b
    const/16 v1, 0x43

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 102
    :pswitch_3c
    const/16 v1, 0x42

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 101
    :pswitch_3d
    const/16 v1, 0x41

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 100
    :pswitch_3e
    const/16 v1, 0x40

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 99
    :pswitch_3f
    const/16 v1, 0x3f

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 98
    :pswitch_40
    const/16 v1, 0x3e

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 97
    :pswitch_41
    const/16 v1, 0x3d

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 96
    :pswitch_42
    const/16 v1, 0x3c

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 95
    :pswitch_43
    const/16 v1, 0x3b

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 94
    :pswitch_44
    const/16 v1, 0x2c

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 93
    :pswitch_45
    const/16 v1, 0x15

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 92
    :pswitch_46
    const/16 v1, 0x2d

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 91
    :pswitch_47
    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 90
    :pswitch_48
    const/16 v1, 0x2f

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 89
    :pswitch_49
    const/16 v1, 0x16

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 88
    :pswitch_4a
    const/16 v1, 0x14

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 87
    :pswitch_4b
    const/16 v1, 0x1f

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 86
    :pswitch_4c
    const/16 v1, 0x13

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 85
    :pswitch_4d
    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 84
    :pswitch_4e
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 83
    :pswitch_4f
    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 82
    :pswitch_50
    const/16 v1, 0x31

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 81
    :pswitch_51
    const/16 v1, 0x32

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 80
    :pswitch_52
    const/16 v1, 0x26

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 79
    :pswitch_53
    const/16 v1, 0x25

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 78
    :pswitch_54
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 77
    :pswitch_55
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 76
    :pswitch_56
    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 75
    :pswitch_57
    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 74
    :pswitch_58
    invoke-static {v6}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 73
    :pswitch_59
    invoke-static {v7}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 72
    :pswitch_5a
    invoke-static {v8}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 71
    :pswitch_5b
    invoke-static {v9}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 70
    :pswitch_5c
    invoke-static {v10}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 69
    :pswitch_5d
    invoke-static {v11}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 68
    :pswitch_5e
    invoke-static {v12}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 67
    :pswitch_5f
    invoke-static {v13}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 66
    :pswitch_60
    invoke-static {v14}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 65
    :pswitch_61
    return-object v18

    .line 64
    :pswitch_62
    return-object v20

    .line 63
    :pswitch_63
    return-object v22

    .line 62
    :pswitch_64
    return-object v24

    .line 61
    :pswitch_65
    return-object v26

    .line 60
    :pswitch_66
    return-object v28

    .line 59
    :pswitch_67
    invoke-static {v15}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 58
    :pswitch_68
    return-object v18

    .line 57
    :pswitch_69
    return-object v20

    .line 56
    :pswitch_6a
    return-object v22

    .line 55
    :pswitch_6b
    return-object v24

    .line 54
    :pswitch_6c
    return-object v26

    .line 53
    :pswitch_6d
    return-object v28

    .line 52
    :pswitch_6e
    return-object v30

    .line 51
    :pswitch_6f
    invoke-static/range {v16 .. v16}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    .line 50
    :pswitch_70
    const/16 v1, 0xf0

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x6452c528 -> :sswitch_70
        -0x6452c527 -> :sswitch_6f
        -0x6452c526 -> :sswitch_6e
        -0x6452c525 -> :sswitch_6d
        -0x6452c524 -> :sswitch_6c
        -0x6452c523 -> :sswitch_6b
        -0x6452c522 -> :sswitch_6a
        -0x6452c521 -> :sswitch_69
        -0x6452c520 -> :sswitch_68
        -0x6452c51f -> :sswitch_67
        -0x6452c4f7 -> :sswitch_66
        -0x6452c4f6 -> :sswitch_65
        -0x6452c4f5 -> :sswitch_64
        -0x6452c4f4 -> :sswitch_63
        -0x6452c4f3 -> :sswitch_62
        -0x6452c4f2 -> :sswitch_61
        -0x6452c4f1 -> :sswitch_60
        -0x6452c4f0 -> :sswitch_5f
        -0x6452c4ef -> :sswitch_5e
        -0x6452c4ee -> :sswitch_5d
        -0x6452c4ed -> :sswitch_5c
        -0x6452c4ec -> :sswitch_5b
        -0x6452c4eb -> :sswitch_5a
        -0x6452c4ea -> :sswitch_59
        -0x6452c4e9 -> :sswitch_58
        -0x6452c4e8 -> :sswitch_57
        -0x6452c4e7 -> :sswitch_56
        -0x6452c4e6 -> :sswitch_55
        -0x6452c4e5 -> :sswitch_54
        -0x6452c4e4 -> :sswitch_53
        -0x6452c4e3 -> :sswitch_52
        -0x6452c4e2 -> :sswitch_51
        -0x6452c4e1 -> :sswitch_50
        -0x6452c4e0 -> :sswitch_4f
        -0x6452c4df -> :sswitch_4e
        -0x6452c4de -> :sswitch_4d
        -0x614eb0b7 -> :sswitch_4c
        -0x5a897364 -> :sswitch_4b
        -0x5a897363 -> :sswitch_4a
        -0x5a897362 -> :sswitch_49
        -0x5a897361 -> :sswitch_48
        -0x5a897360 -> :sswitch_47
        -0x5997a7ac -> :sswitch_46
        -0x5997a512 -> :sswitch_45
        -0x5997a511 -> :sswitch_44
        -0x5997a510 -> :sswitch_43
        -0x5997a50f -> :sswitch_42
        -0x5997a50e -> :sswitch_41
        -0x5997a50d -> :sswitch_40
        -0x5997a50c -> :sswitch_3f
        -0x5997a50b -> :sswitch_3e
        -0x5997a50a -> :sswitch_3d
        -0x5997a509 -> :sswitch_3c
        -0x53d031d3 -> :sswitch_3b
        -0x447e257c -> :sswitch_3a
        -0x4298d862 -> :sswitch_39
        -0x429708d9 -> :sswitch_38
        -0x39a88de7 -> :sswitch_37
        -0x29ace128 -> :sswitch_36
        -0x2605d91d -> :sswitch_35
        -0x2605d91c -> :sswitch_34
        -0x2605d91b -> :sswitch_33
        -0x2605d91a -> :sswitch_32
        -0x2605d919 -> :sswitch_31
        -0x2605d918 -> :sswitch_30
        -0x2605d917 -> :sswitch_2f
        -0x2605d916 -> :sswitch_2e
        -0x2605d915 -> :sswitch_2d
        -0x2605d70d -> :sswitch_2c
        -0x12016066 -> :sswitch_2b
        -0x921d532 -> :sswitch_2a
        0x84c452b -> :sswitch_29
        0xb373ac0 -> :sswitch_28
        0xf23c97f -> :sswitch_27
        0x14588eeb -> :sswitch_26
        0x168ab702 -> :sswitch_25
        0x1ecfda9f -> :sswitch_24
        0x33068887 -> :sswitch_23
        0x357648f2 -> :sswitch_22
        0x3d66d97d -> :sswitch_21
        0x3d82ad80 -> :sswitch_20
        0x3d840ddc -> :sswitch_1f
        0x3df10f18 -> :sswitch_1e
        0x3e17cc9e -> :sswitch_1d
        0x3e3768c4 -> :sswitch_1c
        0x3e46c825 -> :sswitch_1b
        0x3e4897ae -> :sswitch_1a
        0x422be759 -> :sswitch_19
        0x440c08fa -> :sswitch_18
        0x440dd937 -> :sswitch_17
        0x440f845f -> :sswitch_16
        0x4be1da33 -> :sswitch_15
        0x654ab5ad -> :sswitch_14
        0x654ab5ae -> :sswitch_13
        0x654ab5af -> :sswitch_12
        0x654ab5b0 -> :sswitch_11
        0x654ab5b1 -> :sswitch_10
        0x654ab5b2 -> :sswitch_f
        0x654ab5b3 -> :sswitch_e
        0x654ab5b4 -> :sswitch_d
        0x654ab5b5 -> :sswitch_c
        0x654ab5b6 -> :sswitch_b
        0x654ab5cc -> :sswitch_a
        0x654ab5cd -> :sswitch_9
        0x654ab5ce -> :sswitch_8
        0x654ab5cf -> :sswitch_7
        0x654ab5d0 -> :sswitch_6
        0x654ab983 -> :sswitch_5
        0x654af03d -> :sswitch_4
        0x69d0da33 -> :sswitch_3
        0x709bb403 -> :sswitch_2
        0x7311aed9 -> :sswitch_1
        0x79a5f111 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static mapBindingToKeycode(Ljava/lang/String;I)I
    .locals 2
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "defaultKeycode"    # I

    .line 23
    if-nez p0, :cond_0

    return p1

    .line 25
    :cond_0
    const-string v0, "key."

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 27
    invoke-static {p0}, Lcom/tungsten/fclauncher/keycodes/MinecraftKeyBindingMapper;->getGlfwKeycode(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object v0

    .line 28
    .local v0, "glfwKeycode":Ljava/lang/Short;
    if-nez v0, :cond_1

    return p1

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v1

    return v1

    .line 34
    .end local v0    # "glfwKeycode":Ljava/lang/Short;
    :cond_2
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .local v0, "lwjgl2Keycode":I
    nop

    .line 38
    return v0

    .line 35
    .end local v0    # "lwjgl2Keycode":I
    :catch_0
    move-exception v0

    .line 36
    .local v0, "e":Ljava/lang/NumberFormatException;
    return p1
.end method
