package com.pymcl.android.data;

import com.pymcl.ai.AiText;
import com.pymcl.android.ui.i18n.I18n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: AiLang.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000Ê\u0001\f\b\t\u0012\b\b\n\u0012\u0004\b\u0003\u0010\u0002¨\u0006\b"}, d2 = {"Lcom/pymcl/android/data/AiLang;", "", "<init>", "()V", "installed", "", "install", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class AiLang {
    public static final int $stable = 0;
    public static final AiLang INSTANCE = new AiLang();
    private static volatile boolean installed;

    private AiLang() {
    }

    public final void install() {
        if (installed) {
            return;
        }
        AiText.INSTANCE.setEnglish(new Function0() { // from class: com.pymcl.android.data.AiLang$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AiLang.install$lambda$0());
            }
        });
        installed = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean install$lambda$0() {
        return I18n.INSTANCE.getLang() == I18n.Lang.En;
    }
}
