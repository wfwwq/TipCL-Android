package com.pymcl.android.data;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.pymcl.core.account.TokenCipher;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: KeystoreTokenCipher.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/pymcl/android/data/KeystoreTokenCipher;", "Lcom/pymcl/core/account/TokenCipher;", "<init>", "()V", "ALIAS", "", "prefix", "getPrefix", "()Ljava/lang/String;", "key", "Ljavax/crypto/SecretKey;", "encrypt", "plain", "decrypt", "stored", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class KeystoreTokenCipher implements TokenCipher {
    public static final int $stable = 0;
    private static final String ALIAS = "pymcl_tokens";
    public static final KeystoreTokenCipher INSTANCE = new KeystoreTokenCipher();
    private static final String prefix = "aks:";

    private KeystoreTokenCipher() {
    }

    @Override // com.pymcl.core.account.TokenCipher
    public String getPrefix() {
        return prefix;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.security.keystore.KeyGenParameterSpec$Builder, com.github.caciocavallosilano.cacio.peer.CacioChoicePeer] */
    private final SecretKey key() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyStore ks = KeyStore.getInstance("AndroidKeyStore");
        ks.load(null);
        Key key = ks.getKey(ALIAS, null);
        SecretKey secretKey = key instanceof SecretKey ? (SecretKey) key : null;
        if (secretKey == null) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            ?? blockModes = new KeyGenParameterSpec.Builder(ALIAS, 3).setBlockModes("GCM");
            new String[1][0] = "NoPadding";
            keyGenerator.init(blockModes.getModel().setKeySize(256).build());
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "generateKey(...)");
            return secretKeyGenerateKey;
        }
        return secretKey;
    }

    @Override // com.pymcl.core.account.TokenCipher
    public String encrypt(String plain) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(plain, "plain");
        Cipher c = Cipher.getInstance("AES/GCM/NoPadding");
        c.init(1, INSTANCE.key());
        String prefix2 = getPrefix();
        byte[] iv = c.getIV();
        Intrinsics.checkNotNullExpressionValue(iv, "getIV(...)");
        byte[] bytes = plain.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDoFinal = c.doFinal(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return prefix2 + Base64.encodeToString(ArraysKt.plus(iv, bArrDoFinal), 2);
    }

    @Override // com.pymcl.core.account.TokenCipher
    public String decrypt(String stored) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(stored, "stored");
        try {
            Result.Companion companion = Result.INSTANCE;
            KeystoreTokenCipher keystoreTokenCipher = this;
            byte[] bArrDecode = Base64.decode(StringsKt.removePrefix(stored, (CharSequence) keystoreTokenCipher.getPrefix()), 2);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, keystoreTokenCipher.key(), new GCMParameterSpec(128, bArrDecode, 0, 12));
            byte[] bArrDoFinal = cipher.doFinal(bArrDecode, 12, bArrDecode.length - 12);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            objM8116constructorimpl = Result.m8116constructorimpl(new String(bArrDoFinal, Charsets.UTF_8));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        return (String) objM8116constructorimpl;
    }
}
