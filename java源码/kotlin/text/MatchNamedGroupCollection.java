package kotlin.text;

import androidx.autofill.HintConstants;
import com.pymcl.runtime.settings.SettingsProtocol;
import kotlin.Metadata;

/* compiled from: MatchResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0082\u0004Ê\u0001\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t¨\u0006\u0006"}, d2 = {"Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/text/MatchGroupCollection;", SettingsProtocol.GET, "Lkotlin/text/MatchGroup;", HintConstants.AUTOFILL_HINT_NAME, "", "kotlin-stdlib", "Lkotlin/SinceKotlin;", "version", "1.1"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes24.dex */
public interface MatchNamedGroupCollection extends MatchGroupCollection {
    MatchGroup get(String name);
}
