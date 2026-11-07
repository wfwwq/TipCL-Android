.class public Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;
.super Ljava/lang/Object;
.source "AndroidKeycodeMap.java"


# static fields
.field private static final ANDROID_KEYCODES:[I

.field private static final FCL_KEYCODES:[I

.field private static count:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 9
    const/16 v0, 0x63

    new-array v1, v0, [I

    sput-object v1, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->ANDROID_KEYCODES:[I

    .line 10
    new-array v0, v0, [I

    sput-object v0, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->FCL_KEYCODES:[I

    .line 12
    const/4 v0, 0x0

    sput v0, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->count:I

    .line 28
    const/16 v0, 0x66

    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 29
    const/4 v0, 0x4

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 31
    const/4 v3, 0x7

    const/16 v4, 0xb

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 32
    const/4 v5, 0x2

    const/16 v6, 0x8

    invoke-static {v6, v5}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 33
    const/16 v5, 0x9

    invoke-static {v5, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 34
    const/16 v7, 0xa

    invoke-static {v7, v0}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 35
    const/4 v8, 0x5

    invoke-static {v4, v8}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 36
    const/4 v4, 0x6

    const/16 v8, 0xc

    invoke-static {v8, v4}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 37
    const/16 v4, 0xd

    invoke-static {v4, v3}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 38
    const/16 v3, 0xe

    invoke-static {v3, v6}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 39
    const/16 v6, 0xf

    invoke-static {v6, v5}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 40
    const/16 v5, 0x10

    invoke-static {v5, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 42
    const/16 v7, 0x12

    invoke-static {v7, v0}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 44
    const/16 v0, 0x67

    const/16 v9, 0x13

    invoke-static {v9, v0}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 45
    const/16 v0, 0x6c

    const/16 v10, 0x14

    invoke-static {v10, v0}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 46
    const/16 v0, 0x69

    const/16 v11, 0x15

    invoke-static {v11, v0}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 47
    const/16 v0, 0x6a

    const/16 v12, 0x16

    invoke-static {v12, v0}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 49
    const/16 v0, 0x1d

    const/16 v13, 0x1e

    invoke-static {v0, v13}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 50
    const/16 v14, 0x30

    invoke-static {v13, v14}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 51
    const/16 v13, 0x1f

    const/16 v15, 0x2e

    invoke-static {v13, v15}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 52
    const/16 v13, 0x20

    const/16 v15, 0x20

    invoke-static {v13, v15}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 53
    const/16 v13, 0x21

    invoke-static {v13, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 54
    const/16 v7, 0x22

    invoke-static {v7, v13}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 55
    const/16 v7, 0x23

    const/16 v13, 0x22

    invoke-static {v7, v13}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 56
    const/16 v7, 0x24

    const/16 v13, 0x23

    invoke-static {v7, v13}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 57
    const/16 v7, 0x25

    const/16 v13, 0x17

    invoke-static {v7, v13}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 58
    const/16 v7, 0x26

    const/16 v13, 0x24

    invoke-static {v7, v13}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 59
    const/16 v7, 0x27

    const/16 v13, 0x25

    invoke-static {v7, v13}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 60
    const/16 v7, 0x28

    const/16 v13, 0x26

    invoke-static {v7, v13}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 61
    const/16 v7, 0x29

    const/16 v13, 0x32

    invoke-static {v7, v13}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 62
    const/16 v7, 0x2a

    const/16 v13, 0x31

    invoke-static {v7, v13}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 63
    const/16 v7, 0x2b

    const/16 v13, 0x18

    invoke-static {v7, v13}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 64
    const/16 v7, 0x2c

    const/16 v13, 0x19

    invoke-static {v7, v13}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 65
    const/16 v7, 0x2d

    invoke-static {v7, v5}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 66
    const/16 v5, 0x2e

    invoke-static {v5, v9}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 67
    const/16 v5, 0x2f

    const/16 v7, 0x1f

    invoke-static {v5, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 68
    invoke-static {v14, v10}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 69
    const/16 v5, 0x31

    invoke-static {v5, v12}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 70
    const/16 v5, 0x32

    const/16 v7, 0x2f

    invoke-static {v5, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 71
    const/16 v5, 0x33

    const/16 v7, 0x11

    invoke-static {v5, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 72
    const/16 v5, 0x34

    const/16 v7, 0x2d

    invoke-static {v5, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 73
    const/16 v5, 0x35

    invoke-static {v5, v11}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 74
    const/16 v5, 0x36

    const/16 v7, 0x2c

    invoke-static {v5, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 76
    const/16 v5, 0x37

    const/16 v7, 0x33

    invoke-static {v5, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 77
    const/16 v5, 0x38

    const/16 v7, 0x34

    invoke-static {v5, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 79
    const/16 v5, 0x39

    const/16 v7, 0x38

    invoke-static {v5, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 80
    const/16 v5, 0x3a

    const/16 v7, 0x64

    invoke-static {v5, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 82
    const/16 v5, 0x3b

    const/16 v7, 0x2a

    invoke-static {v5, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 83
    const/16 v5, 0x3c

    const/16 v7, 0x36

    invoke-static {v5, v7}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 85
    const/16 v5, 0x3d

    invoke-static {v5, v6}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 86
    const/16 v5, 0x3e

    const/16 v6, 0x39

    invoke-static {v5, v6}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 87
    const/16 v5, 0x42

    const/16 v6, 0x1c

    invoke-static {v5, v6}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 88
    const/16 v5, 0x43

    invoke-static {v5, v3}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 89
    const/16 v3, 0x44

    const/16 v5, 0x29

    invoke-static {v3, v5}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 90
    const/16 v3, 0x45

    invoke-static {v3, v8}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 91
    const/16 v3, 0x46

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 92
    const/16 v3, 0x47

    const/16 v4, 0x1a

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 93
    const/16 v3, 0x48

    const/16 v4, 0x1b

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 94
    const/16 v3, 0x49

    const/16 v4, 0x2b

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 95
    const/16 v3, 0x4a

    const/16 v4, 0x27

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 96
    const/16 v3, 0x4b

    const/16 v4, 0x28

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 97
    const/16 v3, 0x4c

    const/16 v4, 0x35

    invoke-static {v3, v4}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 98
    const/16 v3, 0x4d

    invoke-static {v3, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 100
    const/16 v1, 0x5c

    const/16 v3, 0x68

    invoke-static {v1, v3}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 101
    const/16 v1, 0x5d

    const/16 v3, 0x6d

    invoke-static {v1, v3}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 103
    const/16 v1, 0x6f

    invoke-static {v1, v2}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 105
    const/16 v1, 0x71

    invoke-static {v1, v0}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 106
    const/16 v0, 0x72

    const/16 v1, 0x61

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 108
    const/16 v0, 0x73

    const/16 v1, 0x3a

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 109
    const/16 v0, 0x79

    const/16 v1, 0x77

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 110
    const/16 v0, 0x7b

    const/16 v1, 0x6b

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 111
    const/16 v0, 0x7c

    const/16 v1, 0x6e

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 113
    const/16 v0, 0x83

    const/16 v1, 0x3b

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 114
    const/16 v0, 0x84

    const/16 v1, 0x3c

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 115
    const/16 v0, 0x85

    const/16 v1, 0x3d

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 116
    const/16 v0, 0x86

    const/16 v1, 0x3e

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 117
    const/16 v0, 0x87

    const/16 v1, 0x3f

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 118
    const/16 v0, 0x88

    const/16 v1, 0x40

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 119
    const/16 v0, 0x89

    const/16 v1, 0x41

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 120
    const/16 v0, 0x8a

    const/16 v1, 0x42

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 121
    const/16 v0, 0x8b

    const/16 v1, 0x43

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 122
    const/16 v0, 0x8c

    const/16 v1, 0x44

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 123
    const/16 v0, 0x8d

    const/16 v1, 0x57

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 124
    const/16 v0, 0x8e

    const/16 v1, 0x58

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 126
    const/16 v0, 0x8f

    const/16 v1, 0x45

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 127
    const/16 v0, 0x90

    const/16 v1, 0x52

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 128
    const/16 v0, 0x91

    const/16 v1, 0x4f

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 129
    const/16 v0, 0x92

    const/16 v1, 0x50

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 130
    const/16 v0, 0x93

    const/16 v1, 0x51

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 131
    const/16 v0, 0x94

    const/16 v1, 0x4b

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 132
    const/16 v0, 0x95

    const/16 v1, 0x4c

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 133
    const/16 v0, 0x96

    const/16 v1, 0x4d

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 134
    const/16 v0, 0x97

    const/16 v1, 0x47

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 135
    const/16 v0, 0x98

    const/16 v1, 0x48

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 136
    const/16 v0, 0x99

    const/16 v1, 0x49

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 137
    const/16 v0, 0x9e

    const/16 v1, 0x53

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 138
    const/16 v0, 0x9f

    const/16 v1, 0x79

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 139
    const/16 v0, 0xa0

    const/16 v1, 0x60

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 140
    const/16 v0, 0xa1

    const/16 v1, 0x75

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->add(II)V

    .line 141
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static add(II)V
    .locals 2
    .param p0, "androidKeycode"    # I
    .param p1, "fclKeycode"    # I

    .line 15
    sget-object v0, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->ANDROID_KEYCODES:[I

    sget v1, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->count:I

    aput p0, v0, v1

    .line 16
    sget-object v0, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->FCL_KEYCODES:[I

    sget v1, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->count:I

    aput p1, v0, v1

    .line 17
    sget v0, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->count:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->count:I

    .line 18
    return-void
.end method

.method public static convertKeycode(I)I
    .locals 2
    .param p0, "androidKeycode"    # I

    .line 21
    sget-object v0, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->ANDROID_KEYCODES:[I

    invoke-static {v0, p0}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    .line 22
    .local v0, "index":I
    if-ltz v0, :cond_0

    .line 23
    sget-object v1, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->FCL_KEYCODES:[I

    aget v1, v1, v0

    return v1

    .line 24
    :cond_0
    const/16 v1, 0xf0

    return v1
.end method
