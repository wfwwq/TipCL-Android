.class public Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;
.super Ljava/lang/Object;
.source "LwjglKeycodeMap.java"


# static fields
.field private static final KEY_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->KEY_MAP:Ljava/util/Map;

    .line 28
    const/16 v0, 0x10c

    const/16 v1, 0x66

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 29
    const/16 v0, 0x100

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 30
    const/16 v2, 0xb

    const/16 v3, 0x30

    invoke-static {v3, v2}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 31
    const/4 v2, 0x2

    const/16 v4, 0x31

    invoke-static {v4, v2}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 32
    const/4 v2, 0x3

    const/16 v5, 0x32

    invoke-static {v5, v2}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 33
    const/4 v2, 0x4

    const/16 v6, 0x33

    invoke-static {v6, v2}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 34
    const/4 v2, 0x5

    const/16 v7, 0x34

    invoke-static {v7, v2}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 35
    const/4 v2, 0x6

    const/16 v8, 0x35

    invoke-static {v8, v2}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 36
    const/4 v2, 0x7

    const/16 v9, 0x36

    invoke-static {v9, v2}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 37
    const/16 v2, 0x8

    const/16 v10, 0x37

    invoke-static {v10, v2}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 38
    const/16 v2, 0x9

    const/16 v11, 0x38

    invoke-static {v11, v2}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 39
    const/16 v2, 0xa

    const/16 v12, 0x39

    invoke-static {v12, v2}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 40
    const/16 v2, 0x109

    const/16 v13, 0x67

    invoke-static {v2, v13}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 41
    const/16 v2, 0x108

    const/16 v13, 0x6c

    invoke-static {v2, v13}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 42
    const/16 v2, 0x107

    const/16 v13, 0x69

    invoke-static {v2, v13}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 43
    const/16 v2, 0x106

    const/16 v13, 0x6a

    invoke-static {v2, v13}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 44
    const/16 v2, 0x1e

    const/16 v13, 0x41

    invoke-static {v13, v2}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 45
    const/16 v2, 0x42

    invoke-static {v2, v3}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 46
    const/16 v3, 0x43

    const/16 v14, 0x2e

    invoke-static {v3, v14}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 47
    const/16 v15, 0x44

    const/16 v10, 0x20

    invoke-static {v15, v10}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 48
    const/16 v15, 0x12

    const/16 v3, 0x45

    invoke-static {v3, v15}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 49
    const/16 v15, 0x46

    const/16 v3, 0x21

    invoke-static {v15, v3}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 50
    const/16 v3, 0x22

    const/16 v15, 0x47

    invoke-static {v15, v3}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 51
    const/16 v3, 0x23

    const/16 v15, 0x48

    invoke-static {v15, v3}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 52
    const/16 v3, 0x17

    const/16 v15, 0x49

    invoke-static {v15, v3}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 53
    const/16 v3, 0x4a

    const/16 v15, 0x24

    invoke-static {v3, v15}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 54
    const/16 v3, 0x4b

    const/16 v15, 0x25

    invoke-static {v3, v15}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 55
    const/16 v3, 0x4c

    const/16 v15, 0x26

    invoke-static {v3, v15}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 56
    const/16 v3, 0x4d

    invoke-static {v3, v5}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 57
    const/16 v3, 0x4e

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 58
    const/16 v3, 0x4f

    const/16 v4, 0x18

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 59
    const/16 v3, 0x50

    const/16 v4, 0x19

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 60
    const/16 v3, 0x51

    const/16 v4, 0x10

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 61
    const/16 v3, 0x52

    const/16 v4, 0x13

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 62
    const/16 v3, 0x53

    const/16 v4, 0x1f

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 63
    const/16 v3, 0x54

    const/16 v4, 0x14

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 64
    const/16 v3, 0x55

    const/16 v4, 0x16

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 65
    const/16 v3, 0x56

    const/16 v4, 0x2f

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 66
    const/16 v3, 0x57

    const/16 v4, 0x11

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 67
    const/16 v3, 0x58

    const/16 v4, 0x2d

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 68
    const/16 v3, 0x59

    const/16 v4, 0x15

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 69
    const/16 v3, 0x5a

    const/16 v4, 0x2c

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 70
    const/16 v3, 0x2c

    invoke-static {v3, v6}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 71
    invoke-static {v14, v7}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 72
    const/16 v3, 0x156

    invoke-static {v3, v11}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 73
    const/16 v3, 0x15a

    const/16 v4, 0x64

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 74
    const/16 v3, 0x154

    const/16 v4, 0x2a

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 75
    const/16 v3, 0x158

    invoke-static {v3, v9}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 76
    const/16 v3, 0x102

    const/16 v4, 0xf

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 77
    invoke-static {v10, v12}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 78
    const/16 v3, 0x101

    const/16 v4, 0x1c

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 79
    const/16 v3, 0x103

    const/16 v4, 0xe

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 80
    const/16 v3, 0x60

    const/16 v4, 0x29

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 81
    const/16 v3, 0x2d

    const/16 v4, 0xc

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 82
    const/16 v3, 0x3d

    const/16 v4, 0xd

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 83
    const/16 v3, 0x5b

    const/16 v4, 0x1a

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 84
    const/16 v3, 0x5d

    const/16 v4, 0x1b

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 85
    const/16 v3, 0x5c

    const/16 v4, 0x2b

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 86
    const/16 v3, 0x3b

    const/16 v4, 0x27

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 87
    const/16 v3, 0x27

    const/16 v4, 0x28

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 88
    const/16 v3, 0x2f

    invoke-static {v3, v8}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 89
    const/16 v3, 0x10a

    const/16 v4, 0x68

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 90
    const/16 v3, 0x10b

    const/16 v4, 0x6d

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 91
    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 92
    const/16 v0, 0x155

    const/16 v1, 0x1d

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 93
    const/16 v0, 0x159

    const/16 v1, 0x61

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 94
    const/16 v0, 0x118

    const/16 v1, 0x3a

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 95
    const/16 v0, 0x11c

    const/16 v1, 0x77

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 96
    const/16 v0, 0x10d

    const/16 v1, 0x6b

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 97
    const/16 v0, 0x104

    const/16 v1, 0x6e

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 98
    const/16 v0, 0x122

    const/16 v1, 0x3b

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 99
    const/16 v0, 0x123

    const/16 v1, 0x3c

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 100
    const/16 v0, 0x124

    const/16 v1, 0x3d

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 101
    const/16 v0, 0x125

    const/16 v1, 0x3e

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 102
    const/16 v0, 0x126

    const/16 v1, 0x3f

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 103
    const/16 v0, 0x127

    const/16 v1, 0x40

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 104
    const/16 v0, 0x128

    invoke-static {v0, v13}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 105
    const/16 v0, 0x129

    invoke-static {v0, v2}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 106
    const/16 v0, 0x12a

    const/16 v1, 0x43

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 107
    const/16 v0, 0x12b

    const/16 v1, 0x44

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 108
    const/16 v0, 0x12c

    const/16 v1, 0x57

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 109
    const/16 v0, 0x12d

    const/16 v1, 0x58

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 110
    const/16 v0, 0x11a

    const/16 v1, 0x45

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 111
    const/16 v0, 0x140

    const/16 v1, 0x52

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 112
    const/16 v0, 0x141

    const/16 v1, 0x4f

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 113
    const/16 v0, 0x142

    const/16 v1, 0x50

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 114
    const/16 v0, 0x143

    const/16 v1, 0x51

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 115
    const/16 v0, 0x144

    const/16 v1, 0x4b

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 116
    const/16 v0, 0x145

    const/16 v1, 0x4c

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 117
    const/16 v0, 0x146

    const/16 v1, 0x4d

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 118
    const/16 v0, 0x147

    const/16 v1, 0x47

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 119
    const/16 v0, 0x148

    const/16 v1, 0x48

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 120
    const/16 v0, 0x149

    const/16 v1, 0x49

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 121
    const/16 v0, 0x14a

    const/16 v1, 0x53

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 122
    const/16 v0, 0x14d

    const/16 v1, 0x4a

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 123
    const/16 v0, 0x14c

    const/16 v1, 0x37

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 124
    const/16 v0, 0x14e

    const/16 v1, 0x4e

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 125
    const/16 v0, 0x14b

    const/16 v1, 0x62

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 126
    const/16 v0, 0x14f

    const/16 v1, 0x60

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 127
    const/16 v0, 0x150

    const/16 v1, 0x75

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 128
    const/16 v0, 0x105

    const/16 v1, 0x6f

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->add(II)V

    .line 129
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static add(II)V
    .locals 3
    .param p0, "lwjglKeycode"    # I
    .param p1, "fclKeycode"    # I

    .line 16
    sget-object v0, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->KEY_MAP:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    return-void
.end method

.method public static convertKeycode(I)I
    .locals 2
    .param p0, "fclKeycode"    # I

    .line 20
    sget-object v0, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->KEY_MAP:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 21
    .local v0, "key":Ljava/lang/Integer;
    if-eqz v0, :cond_0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    return v1

    .line 24
    :cond_0
    const/4 v1, 0x0

    return v1
.end method
