.class public Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;
.super Ljava/lang/Object;
.source "EfficientAndroidLWJGLKeycode.java"


# static fields
.field private static final KEYCODE_COUNT:I = 0x70

.field private static final buffer:[C

.field private static final mKcm:Landroid/view/KeyCharacterMap;

.field private static mTmpCount:I

.field private static final sAndroidKeycodes:[I

.field private static final sLwjglKeycodes:[S


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 39
    const/16 v0, 0x70

    new-array v1, v0, [I

    sput-object v1, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->sAndroidKeycodes:[I

    .line 40
    new-array v1, v0, [S

    sput-object v1, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->sLwjglKeycodes:[S

    .line 41
    const/4 v1, 0x0

    sput v1, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->mTmpCount:I

    .line 47
    invoke-static {v1, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 48
    const/4 v1, 0x3

    const/16 v2, 0x10c

    invoke-static {v1, v2}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 50
    const/4 v1, 0x4

    const/16 v3, 0x100

    invoke-static {v1, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 53
    const/4 v1, 0x7

    const/16 v4, 0x30

    invoke-static {v1, v4}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 54
    const/16 v1, 0x8

    const/16 v5, 0x31

    invoke-static {v1, v5}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 55
    const/16 v1, 0x9

    const/16 v6, 0x32

    invoke-static {v1, v6}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 56
    const/16 v1, 0xa

    const/16 v7, 0x33

    invoke-static {v1, v7}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 57
    const/16 v1, 0xb

    const/16 v8, 0x34

    invoke-static {v1, v8}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 58
    const/16 v1, 0xc

    const/16 v9, 0x35

    invoke-static {v1, v9}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 59
    const/16 v1, 0xd

    const/16 v10, 0x36

    invoke-static {v1, v10}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 60
    const/16 v1, 0xe

    const/16 v11, 0x37

    invoke-static {v1, v11}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 61
    const/16 v1, 0xf

    const/16 v12, 0x38

    invoke-static {v1, v12}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 62
    const/16 v1, 0x10

    const/16 v13, 0x39

    invoke-static {v1, v13}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 64
    const/16 v1, 0x12

    invoke-static {v1, v7}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 67
    const/16 v1, 0x13

    const/16 v14, 0x109

    invoke-static {v1, v14}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 68
    const/16 v1, 0x14

    const/16 v14, 0x108

    invoke-static {v1, v14}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 69
    const/16 v1, 0x15

    const/16 v14, 0x107

    invoke-static {v1, v14}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 70
    const/16 v1, 0x16

    const/16 v14, 0x106

    invoke-static {v1, v14}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 73
    const/16 v1, 0x1d

    const/16 v14, 0x41

    invoke-static {v1, v14}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 74
    const/16 v1, 0x1e

    const/16 v14, 0x42

    invoke-static {v1, v14}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 75
    const/16 v1, 0x1f

    const/16 v15, 0x43

    invoke-static {v1, v15}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 76
    const/16 v1, 0x20

    const/16 v2, 0x44

    invoke-static {v1, v2}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 77
    const/16 v0, 0x21

    const/16 v3, 0x45

    invoke-static {v0, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 78
    const/16 v0, 0x22

    const/16 v3, 0x46

    invoke-static {v0, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 79
    const/16 v0, 0x23

    const/16 v3, 0x47

    invoke-static {v0, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 80
    const/16 v0, 0x24

    const/16 v3, 0x48

    invoke-static {v0, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 81
    const/16 v0, 0x25

    const/16 v3, 0x49

    invoke-static {v0, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 82
    const/16 v0, 0x26

    const/16 v3, 0x4a

    invoke-static {v0, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 83
    const/16 v0, 0x27

    const/16 v3, 0x4b

    invoke-static {v0, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 84
    const/16 v0, 0x28

    const/16 v3, 0x4c

    invoke-static {v0, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 85
    const/16 v0, 0x29

    const/16 v3, 0x4d

    invoke-static {v0, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 86
    const/16 v0, 0x2a

    const/16 v3, 0x4e

    invoke-static {v0, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 87
    const/16 v0, 0x2b

    const/16 v3, 0x4f

    invoke-static {v0, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 88
    const/16 v0, 0x50

    const/16 v3, 0x2c

    invoke-static {v3, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 89
    const/16 v0, 0x2d

    const/16 v2, 0x51

    invoke-static {v0, v2}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 90
    const/16 v0, 0x2e

    const/16 v2, 0x52

    invoke-static {v0, v2}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 91
    const/16 v0, 0x2f

    const/16 v2, 0x53

    invoke-static {v0, v2}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 92
    const/16 v0, 0x54

    invoke-static {v4, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 93
    const/16 v0, 0x55

    invoke-static {v5, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 94
    const/16 v0, 0x56

    invoke-static {v6, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 95
    const/16 v0, 0x57

    invoke-static {v7, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 96
    const/16 v0, 0x58

    invoke-static {v8, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 97
    const/16 v0, 0x59

    invoke-static {v9, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 98
    const/16 v0, 0x5a

    invoke-static {v10, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 101
    invoke-static {v11, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 102
    const/16 v0, 0x2e

    invoke-static {v12, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 105
    const/16 v0, 0x156

    invoke-static {v13, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 106
    const/16 v0, 0x3a

    const/16 v2, 0x15a

    invoke-static {v0, v2}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 109
    const/16 v0, 0x3b

    const/16 v2, 0x154

    invoke-static {v0, v2}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 110
    const/16 v0, 0x3c

    const/16 v2, 0x158

    invoke-static {v0, v2}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 112
    const/16 v0, 0x3d

    const/16 v2, 0x102

    invoke-static {v0, v2}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 113
    const/16 v0, 0x3e

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 114
    const/16 v0, 0x101

    invoke-static {v14, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 115
    const/16 v0, 0x103

    invoke-static {v15, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 116
    const/16 v0, 0x60

    const/16 v1, 0x44

    invoke-static {v1, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 117
    const/16 v0, 0x2d

    const/16 v1, 0x45

    invoke-static {v1, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 118
    const/16 v0, 0x3d

    const/16 v1, 0x46

    invoke-static {v1, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 119
    const/16 v0, 0x5b

    const/16 v1, 0x47

    invoke-static {v1, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 120
    const/16 v0, 0x48

    const/16 v1, 0x5d

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 121
    const/16 v0, 0x49

    const/16 v1, 0x5c

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 122
    const/16 v0, 0x4a

    const/16 v1, 0x3b

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 123
    const/16 v0, 0x4b

    const/16 v1, 0x27

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 124
    const/16 v0, 0x4c

    const/16 v1, 0x2f

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 125
    const/16 v0, 0x4d

    invoke-static {v0, v6}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 126
    const/16 v0, 0x51

    const/16 v1, 0x14e

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 127
    const/16 v0, 0x52

    const/16 v1, 0x15c

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 130
    const/16 v0, 0x5c

    const/16 v1, 0x10a

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 131
    const/16 v0, 0x5d

    const/16 v1, 0x10b

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 133
    const/16 v0, 0x6f

    const/16 v1, 0x100

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 134
    const/16 v0, 0x105

    const/16 v1, 0x70

    invoke-static {v1, v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 137
    const/16 v0, 0x71

    const/16 v1, 0x155

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 138
    const/16 v0, 0x72

    const/16 v1, 0x159

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 140
    const/16 v0, 0x73

    const/16 v1, 0x118

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 141
    const/16 v0, 0x74

    const/16 v1, 0x119

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 142
    const/16 v0, 0x75

    const/16 v1, 0x157

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 143
    const/16 v0, 0x76

    const/16 v1, 0x15b

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 144
    const/16 v0, 0x78

    const/16 v1, 0x11b

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 145
    const/16 v0, 0x79

    const/16 v1, 0x11c

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 146
    const/16 v0, 0x7a

    const/16 v1, 0x10c

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 147
    const/16 v0, 0x7b

    const/16 v1, 0x10d

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 148
    const/16 v0, 0x7c

    const/16 v1, 0x104

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 152
    const/16 v0, 0x83

    const/16 v1, 0x122

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 153
    const/16 v0, 0x84

    const/16 v1, 0x123

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 154
    const/16 v0, 0x85

    const/16 v1, 0x124

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 155
    const/16 v0, 0x86

    const/16 v1, 0x125

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 156
    const/16 v0, 0x87

    const/16 v1, 0x126

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 157
    const/16 v0, 0x88

    const/16 v1, 0x127

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 158
    const/16 v0, 0x89

    const/16 v1, 0x128

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 159
    const/16 v0, 0x8a

    const/16 v1, 0x129

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 160
    const/16 v0, 0x8b

    const/16 v1, 0x12a

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 161
    const/16 v0, 0x8c

    const/16 v1, 0x12b

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 162
    const/16 v0, 0x8d

    const/16 v1, 0x12c

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 163
    const/16 v0, 0x8e

    const/16 v1, 0x12d

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 166
    const/16 v0, 0x8f

    const/16 v1, 0x11a

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 167
    const/16 v0, 0x90

    const/16 v1, 0x140

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 168
    const/16 v0, 0x91

    const/16 v1, 0x141

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 169
    const/16 v0, 0x92

    const/16 v1, 0x142

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 170
    const/16 v0, 0x93

    const/16 v1, 0x143

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 171
    const/16 v0, 0x94

    const/16 v1, 0x144

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 172
    const/16 v0, 0x95

    const/16 v1, 0x145

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 173
    const/16 v0, 0x96

    const/16 v1, 0x146

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 174
    const/16 v0, 0x97

    const/16 v1, 0x147

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 175
    const/16 v0, 0x98

    const/16 v1, 0x148

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 176
    const/16 v0, 0x99

    const/16 v1, 0x149

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 177
    const/16 v0, 0x9a

    const/16 v1, 0x14b

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 178
    const/16 v0, 0x9b

    const/16 v1, 0x14c

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 179
    const/16 v0, 0x9c

    const/16 v1, 0x14d

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 180
    const/16 v0, 0x9d

    const/16 v1, 0x14e

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 181
    const/16 v0, 0x9e

    const/16 v1, 0x14a

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 182
    const/16 v0, 0x9f

    invoke-static {v0, v3}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 183
    const/16 v0, 0xa0

    const/16 v1, 0x14f

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 184
    const/16 v0, 0xa1

    const/16 v1, 0x150

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->add(IS)V

    .line 238
    const/4 v0, -0x1

    invoke-static {v0}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v0

    sput-object v0, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->mKcm:Landroid/view/KeyCharacterMap;

    .line 239
    const/4 v0, 0x1

    new-array v0, v0, [C

    sput-object v0, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->buffer:[C

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static add(IS)V
    .locals 2
    .param p0, "androidKeycode"    # I
    .param p1, "LWJGLKeycode"    # S

    .line 232
    sget-object v0, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->sAndroidKeycodes:[I

    sget v1, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->mTmpCount:I

    aput p0, v0, v1

    .line 233
    sget-object v0, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->sLwjglKeycodes:[S

    sget v1, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->mTmpCount:I

    aput-short p1, v0, v1

    .line 235
    sget v0, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->mTmpCount:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->mTmpCount:I

    .line 236
    return-void
.end method

.method public static containsIndex(I)Z
    .locals 1
    .param p0, "index"    # I

    .line 189
    if-ltz p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static execKey(Landroid/view/KeyEvent;I)V
    .locals 6
    .param p0, "keyEvent"    # Landroid/view/KeyEvent;
    .param p1, "valueIndex"    # I

    .line 194
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result v0

    sput-boolean v0, Lorg/lwjgl/glfw/CallbackBridge;->holdingAlt:Z

    .line 195
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isCapsLockOn()Z

    move-result v0

    sput-boolean v0, Lorg/lwjgl/glfw/CallbackBridge;->holdingCapslock:Z

    .line 196
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v0

    sput-boolean v0, Lorg/lwjgl/glfw/CallbackBridge;->holdingCtrl:Z

    .line 197
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isNumLockOn()Z

    move-result v0

    sput-boolean v0, Lorg/lwjgl/glfw/CallbackBridge;->holdingNumlock:Z

    .line 198
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result v0

    sput-boolean v0, Lorg/lwjgl/glfw/CallbackBridge;->holdingShift:Z

    .line 200
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    int-to-char v0, v0

    .line 201
    .local v0, "key":C
    nop

    .line 202
    invoke-static {p1}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->getValueByIndex(I)S

    move-result v2

    .line 204
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getScanCode()I

    move-result v3

    .line 205
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->getCurrentMods()I

    move-result v4

    .line 206
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getAction()I

    move-result v5

    if-nez v5, :cond_1

    const/4 v1, 0x1

    .line 201
    :cond_1
    invoke-static {v2, v0, v3, v4, v1}, Lorg/lwjgl/glfw/CallbackBridge;->sendKeyPress(ICIIZ)V

    .line 207
    return-void
.end method

.method public static execKeyIndex(I)V
    .locals 1
    .param p0, "index"    # I

    .line 211
    invoke-static {p0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->getValueByIndex(I)S

    move-result v0

    invoke-static {v0}, Lorg/lwjgl/glfw/CallbackBridge;->sendKeyPress(I)V

    .line 212
    return-void
.end method

.method public static getAndroidKeycode(C)I
    .locals 3
    .param p0, "c"    # C

    .line 274
    sget-object v0, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->buffer:[C

    const/4 v1, 0x0

    aput-char p0, v0, v1

    .line 275
    sget-object v0, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->mKcm:Landroid/view/KeyCharacterMap;

    sget-object v2, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->buffer:[C

    invoke-virtual {v0, v2}, Landroid/view/KeyCharacterMap;->getEvents([C)[Landroid/view/KeyEvent;

    move-result-object v0

    .line 276
    .local v0, "events":[Landroid/view/KeyEvent;
    if-eqz v0, :cond_0

    array-length v2, v0

    if-lez v2, :cond_0

    .line 277
    aget-object v1, v0, v1

    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    goto :goto_0

    .line 278
    :cond_0
    nop

    .line 276
    :goto_0
    return v1
.end method

.method public static getAndroidKeycode(I)I
    .locals 2
    .param p0, "lwjglGlfwKeycode"    # I

    .line 245
    const/16 v0, 0x32

    if-ne p0, v0, :cond_0

    const/16 v0, 0x9

    return v0

    .line 246
    :cond_0
    const/16 v0, 0x33

    if-ne p0, v0, :cond_1

    const/16 v0, 0xa

    return v0

    .line 247
    :cond_1
    invoke-static {p0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->getIndexByValue(I)I

    move-result v0

    .line 248
    .local v0, "index":I
    if-ltz v0, :cond_2

    sget-object v1, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->sAndroidKeycodes:[I

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 249
    sget-object v1, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->sAndroidKeycodes:[I

    aget v1, v1, v0

    goto :goto_0

    .line 250
    :cond_2
    const/4 v1, 0x0

    .line 248
    :goto_0
    return v1
.end method

.method public static getIndexByKey(I)I
    .locals 1
    .param p0, "key"    # I

    .line 219
    sget-object v0, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->sAndroidKeycodes:[I

    invoke-static {v0, p0}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    return v0
.end method

.method public static getIndexByValue(I)I
    .locals 2
    .param p0, "lwjglKey"    # I

    .line 225
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    sget-object v1, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->sLwjglKeycodes:[S

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 226
    sget-object v1, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->sLwjglKeycodes:[S

    aget-short v1, v1, v0

    if-ne v1, p0, :cond_0

    return v0

    .line 225
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 228
    .end local v0    # "i":I
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public static getSdlAndroidKeycode(I)I
    .locals 1
    .param p0, "lwjglGlfwKeycode"    # I

    .line 254
    sparse-switch p0, :sswitch_data_0

    .line 266
    invoke-static {p0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->getAndroidKeycode(I)I

    move-result v0

    goto :goto_0

    .line 265
    :sswitch_0
    const/16 v0, 0x52

    goto :goto_0

    .line 264
    :sswitch_1
    const/16 v0, 0x76

    goto :goto_0

    .line 263
    :sswitch_2
    const/16 v0, 0x75

    goto :goto_0

    .line 262
    :sswitch_3
    const/16 v0, 0xa1

    goto :goto_0

    .line 260
    :sswitch_4
    const/16 v0, 0xa0

    goto :goto_0

    .line 258
    :sswitch_5
    const/16 v0, 0x9d

    goto :goto_0

    .line 259
    :sswitch_6
    const/16 v0, 0x9e

    goto :goto_0

    .line 257
    :sswitch_7
    const/16 v0, 0x7b

    goto :goto_0

    .line 256
    :sswitch_8
    const/16 v0, 0x7a

    goto :goto_0

    .line 261
    :sswitch_9
    const/16 v0, 0x70

    goto :goto_0

    .line 255
    :sswitch_a
    const/16 v0, 0x6f

    .line 254
    :goto_0
    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x100 -> :sswitch_a
        0x105 -> :sswitch_9
        0x10c -> :sswitch_8
        0x10d -> :sswitch_7
        0x14a -> :sswitch_6
        0x14e -> :sswitch_5
        0x14f -> :sswitch_4
        0x150 -> :sswitch_3
        0x157 -> :sswitch_2
        0x15b -> :sswitch_1
        0x15c -> :sswitch_0
    .end sparse-switch
.end method

.method public static getValueByIndex(I)S
    .locals 1
    .param p0, "index"    # I

    .line 215
    sget-object v0, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->sLwjglKeycodes:[S

    aget-short v0, v0, p0

    return v0
.end method
