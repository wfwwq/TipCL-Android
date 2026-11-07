.class public interface abstract Lcom/bytedance/android/bytehook/ByteHook$Config;
.super Ljava/lang/Object;
.source "ByteHook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/android/bytehook/ByteHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Config"
.end annotation


# virtual methods
.method public abstract getDebug()Z
.end method

.method public abstract getLibLoader()Lcom/bytedance/android/bytehook/ILibLoader;
.end method

.method public abstract getMode()I
.end method

.method public abstract getRecordable()Z
.end method

.method public abstract setDebug(Z)V
.end method

.method public abstract setLibLoader(Lcom/bytedance/android/bytehook/ILibLoader;)V
.end method

.method public abstract setMode(I)V
.end method

.method public abstract setRecordable(Z)V
.end method
