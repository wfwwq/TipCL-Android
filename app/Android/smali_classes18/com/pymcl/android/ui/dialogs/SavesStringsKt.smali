.class public final Lcom/pymcl/android/ui/dialogs/SavesStringsKt;
.super Ljava/lang/Object;
.source "SavesStrings.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0016\u0010\u0003\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0000\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "st",
        "",
        "key",
        "args",
        "",
        "",
        "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
        "PyMCL-Android:app_debug"
    }
    k = 0x2
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$gbgUvbGzBlpOsj3uH4XQqMbk27A(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/dialogs/SavesStringsKt;->st$lambda$0(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs st(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 7
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "args"    # [Ljava/lang/Object;

    const-string v0, "key"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    sget-object v1, Lcom/pymcl/android/ui/dialogs/SavesStrings;->INSTANCE:Lcom/pymcl/android/ui/dialogs/SavesStrings;

    sget-object v0, Lcom/pymcl/android/ui/i18n/I18n;->INSTANCE:Lcom/pymcl/android/ui/i18n/I18n;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/i18n/I18n;->getLang()Lcom/pymcl/android/ui/i18n/I18n$Lang;

    move-result-object v0

    sget-object v2, Lcom/pymcl/android/ui/i18n/I18n$Lang;->En:Lcom/pymcl/android/ui/i18n/I18n$Lang;

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v3, v0

    sget-object v0, Lcom/pymcl/android/ui/i18n/I18n;->INSTANCE:Lcom/pymcl/android/ui/i18n/I18n;

    invoke-virtual {v0, p0}, Lcom/pymcl/android/ui/i18n/I18n;->has(Ljava/lang/String;)Z

    move-result v4

    new-instance v5, Lcom/pymcl/android/ui/dialogs/SavesStringsKt$$ExternalSyntheticLambda0;

    invoke-direct {v5, p0, p1}, Lcom/pymcl/android/ui/dialogs/SavesStringsKt$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v2, p0

    move-object v6, p1

    .end local p0    # "key":Ljava/lang/String;
    .end local p1    # "args":[Ljava/lang/Object;
    .local v2, "key":Ljava/lang/String;
    .local v6, "args":[Ljava/lang/Object;
    invoke-virtual/range {v1 .. v6}, Lcom/pymcl/android/ui/dialogs/SavesStrings;->resolve(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final st$lambda$0(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .param p0, "$key"    # Ljava/lang/String;
    .param p1, "$args"    # [Ljava/lang/Object;

    .line 57
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
