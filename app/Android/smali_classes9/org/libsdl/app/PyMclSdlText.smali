.class public final Lorg/libsdl/app/PyMclSdlText;
.super Ljava/lang/Object;
.source "PyMclSdlText.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static commitText(Ljava/lang/String;)V
    .locals 1
    .param p0, "text"    # Ljava/lang/String;

    .line 9
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/libsdl/app/SDLInputConnection;->nativeCommitText(Ljava/lang/String;I)V

    return-void
.end method

.method public static controlChar(C)V
    .locals 0
    .param p0, "c"    # C

    .line 12
    invoke-static {p0}, Lorg/libsdl/app/SDLInputConnection;->nativeGenerateScancodeForUnichar(C)V

    return-void
.end method
