.class public final Lcom/pymcl/android/data/KeystoreTokenCipher;
.super Ljava/lang/Object;
.source "KeystoreTokenCipher.kt"

# interfaces
.implements Lcom/pymcl/core/account/TokenCipher;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nKeystoreTokenCipher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeystoreTokenCipher.kt\ncom/pymcl/android/data/KeystoreTokenCipher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u0005H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00ca\u0001\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/pymcl/android/data/KeystoreTokenCipher;",
        "Lcom/pymcl/core/account/TokenCipher;",
        "<init>",
        "()V",
        "ALIAS",
        "",
        "prefix",
        "getPrefix",
        "()Ljava/lang/String;",
        "key",
        "Ljavax/crypto/SecretKey;",
        "encrypt",
        "plain",
        "decrypt",
        "stored",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
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
.field public static final $stable:I = 0x0

.field private static final ALIAS:Ljava/lang/String; = "pymcl_tokens"

.field public static final INSTANCE:Lcom/pymcl/android/data/KeystoreTokenCipher;

.field private static final prefix:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/KeystoreTokenCipher;

    invoke-direct {v0}, Lcom/pymcl/android/data/KeystoreTokenCipher;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/KeystoreTokenCipher;->INSTANCE:Lcom/pymcl/android/data/KeystoreTokenCipher;

    .line 16
    const-string v0, "aks:"

    sput-object v0, Lcom/pymcl/android/data/KeystoreTokenCipher;->prefix:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final key()Ljavax/crypto/SecretKey;
    .locals 9

    .line 18
    const-string v0, "AndroidKeyStore"

    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v1

    move-object v2, v1

    .line 36
    .local v2, "$this$key_u24lambda_u240\\1":Ljava/security/KeyStore;
    const/4 v3, 0x0

    .line 18
    .local v3, "$i$a$-apply-KeystoreTokenCipher$key$ks$1\\1\\18\\0":I
    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 19
    .end local v2    # "$this$key_u24lambda_u240\\1":Ljava/security/KeyStore;
    .end local v3    # "$i$a$-apply-KeystoreTokenCipher$key$ks$1\\1\\18\\0":I
    .local v1, "ks":Ljava/security/KeyStore;
    const-string v2, "pymcl_tokens"

    invoke-virtual {v1, v2, v4}, Ljava/security/KeyStore;->getKey(Ljava/lang/String;[C)Ljava/security/Key;

    move-result-object v3

    instance-of v5, v3, Ljavax/crypto/SecretKey;

    if-eqz v5, :cond_0

    move-object v4, v3

    check-cast v4, Ljavax/crypto/SecretKey;

    :cond_0
    if-eqz v4, :cond_1

    .line 36
    .local v4, "it\\2":Ljavax/crypto/SecretKey;
    const/4 v0, 0x0

    .line 19
    .local v0, "$i$a$-let-KeystoreTokenCipher$key$1\\2\\19\\0":I
    return-object v4

    .line 20
    .end local v0    # "$i$a$-let-KeystoreTokenCipher$key$1\\2\\19\\0":I
    .end local v4    # "it\\2":Ljavax/crypto/SecretKey;
    :cond_1
    const-string v3, "AES"

    invoke-static {v3, v0}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v0

    move-object v3, v0

    .local v3, "$this$key_u24lambda_u242\\3":Ljavax/crypto/KeyGenerator;
    const/4 v4, 0x0

    .line 21
    .local v4, "$i$a$-apply-KeystoreTokenCipher$key$2\\3\\20\\0":I
    new-instance v5, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const/4 v6, 0x3

    invoke-direct {v5, v2, v6}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    .line 22
    const/4 v2, 0x1

    new-array v6, v2, [Ljava/lang/String;

    const-string v7, "GCM"

    const/4 v8, 0x0

    aput-object v7, v6, v8

    invoke-virtual {v5, v6}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v5

    new-array v2, v2, [Ljava/lang/String;

    const-string v6, "NoPadding"

    aput-object v6, v2, v8

    invoke-virtual {v5, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v2

    const/16 v5, 0x100

    invoke-virtual {v2, v5}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object v2

    check-cast v2, Ljava/security/spec/AlgorithmParameterSpec;

    .line 21
    invoke-virtual {v3, v2}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 23
    nop

    .line 20
    .end local v3    # "$this$key_u24lambda_u242\\3":Ljavax/crypto/KeyGenerator;
    .end local v4    # "$i$a$-apply-KeystoreTokenCipher$key$2\\3\\20\\0":I
    nop

    .line 23
    invoke-virtual {v0}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    move-result-object v0

    const-string v2, "generateKey(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    return-object v0
.end method


# virtual methods
.method public decrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 12
    .param p1, "stored"    # Ljava/lang/String;

    const-string v0, "stored"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/android/data/KeystoreTokenCipher;

    .local v0, "$this$decrypt_u24lambda_u240\\1":Lcom/pymcl/android/data/KeystoreTokenCipher;
    const/4 v1, 0x0

    .line 30
    .local v1, "$i$a$-runCatching-KeystoreTokenCipher$decrypt$1\\1\\29\\0":I
    invoke-virtual {v0}, Lcom/pymcl/android/data/KeystoreTokenCipher;->getPrefix()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {p1, v2}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v2, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    .line 31
    .local v2, "b\\1":[B
    const-string v4, "AES/GCM/NoPadding"

    invoke-static {v4}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v4

    move-object v5, v4

    .line 36
    .local v5, "$this$decrypt_u24lambda_u240_u240\\2":Ljavax/crypto/Cipher;
    const/4 v6, 0x0

    .line 31
    .local v6, "$i$a$-apply-KeystoreTokenCipher$decrypt$1$c$1\\2\\31\\1":I
    invoke-direct {v0}, Lcom/pymcl/android/data/KeystoreTokenCipher;->key()Ljavax/crypto/SecretKey;

    move-result-object v7

    check-cast v7, Ljava/security/Key;

    new-instance v8, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v9, 0x80

    const/4 v10, 0x0

    const/16 v11, 0xc

    invoke-direct {v8, v9, v2, v10, v11}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    check-cast v8, Ljava/security/spec/AlgorithmParameterSpec;

    invoke-virtual {v5, v3, v7, v8}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 32
    .end local v5    # "$this$decrypt_u24lambda_u240_u240\\2":Ljavax/crypto/Cipher;
    .end local v6    # "$i$a$-apply-KeystoreTokenCipher$decrypt$1$c$1\\2\\31\\1":I
    .local v4, "c\\1":Ljavax/crypto/Cipher;
    array-length v3, v2

    sub-int/2addr v3, v11

    invoke-virtual {v4, v2, v11, v3}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object v3

    const-string v5, "doFinal(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/lang/String;

    sget-object v6, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v5, v3, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 29
    .end local v0    # "$this$decrypt_u24lambda_u240\\1":Lcom/pymcl/android/data/KeystoreTokenCipher;
    .end local v1    # "$i$a$-runCatching-KeystoreTokenCipher$decrypt$1\\1\\29\\0":I
    .end local v2    # "b\\1":[B
    .end local v4    # "c\\1":Ljavax/crypto/Cipher;
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 33
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public encrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "plain"    # Ljava/lang/String;

    const-string v0, "plain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    const-string v0, "AES/GCM/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    move-object v1, v0

    .line 36
    .local v1, "$this$encrypt_u24lambda_u240\\1":Ljavax/crypto/Cipher;
    const/4 v2, 0x0

    .line 26
    .local v2, "$i$a$-apply-KeystoreTokenCipher$encrypt$c$1\\1\\26\\0":I
    sget-object v3, Lcom/pymcl/android/data/KeystoreTokenCipher;->INSTANCE:Lcom/pymcl/android/data/KeystoreTokenCipher;

    invoke-direct {v3}, Lcom/pymcl/android/data/KeystoreTokenCipher;->key()Ljavax/crypto/SecretKey;

    move-result-object v3

    check-cast v3, Ljava/security/Key;

    const/4 v4, 0x1

    invoke-virtual {v1, v4, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 27
    .end local v1    # "$this$encrypt_u24lambda_u240\\1":Ljavax/crypto/Cipher;
    .end local v2    # "$i$a$-apply-KeystoreTokenCipher$encrypt$c$1\\1\\26\\0":I
    .local v0, "c":Ljavax/crypto/Cipher;
    invoke-virtual {p0}, Lcom/pymcl/android/data/KeystoreTokenCipher;->getPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljavax/crypto/Cipher;->getIV()[B

    move-result-object v2

    const-string v3, "getIV(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const-string v4, "getBytes(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v3

    const-string v4, "doFinal(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lkotlin/collections/ArraysKt;->plus([B[B)[B

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 1

    .line 16
    sget-object v0, Lcom/pymcl/android/data/KeystoreTokenCipher;->prefix:Ljava/lang/String;

    return-object v0
.end method
