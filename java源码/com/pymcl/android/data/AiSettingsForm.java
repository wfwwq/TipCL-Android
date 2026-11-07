package com.pymcl.android.data;

import androidx.core.app.NotificationCompat;
import com.pymcl.ai.AiClient;
import com.pymcl.ai.AiEndpoints;
import com.pymcl.ai.AiMode;
import com.pymcl.ai.AiSettings;
import com.pymcl.ai.AiText;
import com.pymcl.ai.Builtin;
import com.pymcl.ai.Permission;
import com.pymcl.runtime.input.InputSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: AiSettingsForm.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00011Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u001dJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!2\u0006\u0010\u001e\u001a\u00020\u001dJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jc\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00100\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012Ê\u0001\f\b3\u0012\b\b4\u0012\u0004\b\u0003\u0010\u0002¨\u00062"}, d2 = {"Lcom/pymcl/android/data/AiSettingsForm;", "", "modeIndex", "", "endpoint", "", "apiKey", AiMode.GATEWAY, "gatewayKey", "model", "contextText", "fallback", "permissionIndex", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getModeIndex", "()I", "getEndpoint", "()Ljava/lang/String;", "getApiKey", "getGateway", "getGatewayKey", "getModel", "getContextText", "getFallback", "getPermissionIndex", "mode", "getMode", "toSettings", "Lcom/pymcl/ai/AiSettings;", "base", "blockingError", "warnings", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class AiSettingsForm {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String apiKey;
    private final String contextText;
    private final String endpoint;
    private final String fallback;
    private final String gateway;
    private final String gatewayKey;
    private final int modeIndex;
    private final String model;
    private final int permissionIndex;

    public AiSettingsForm() {
        this(0, null, null, null, null, null, null, null, 0, 511, null);
    }

    public static /* synthetic */ AiSettingsForm copy$default(AiSettingsForm aiSettingsForm, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = aiSettingsForm.modeIndex;
        }
        if ((i3 & 2) != 0) {
            str = aiSettingsForm.endpoint;
        }
        if ((i3 & 4) != 0) {
            str2 = aiSettingsForm.apiKey;
        }
        if ((i3 & 8) != 0) {
            str3 = aiSettingsForm.gateway;
        }
        if ((i3 & 16) != 0) {
            str4 = aiSettingsForm.gatewayKey;
        }
        if ((i3 & 32) != 0) {
            str5 = aiSettingsForm.model;
        }
        if ((i3 & 64) != 0) {
            str6 = aiSettingsForm.contextText;
        }
        if ((i3 & 128) != 0) {
            str7 = aiSettingsForm.fallback;
        }
        if ((i3 & 256) != 0) {
            i2 = aiSettingsForm.permissionIndex;
        }
        String str8 = str7;
        int i4 = i2;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        String str12 = str2;
        return aiSettingsForm.copy(i, str, str12, str3, str11, str9, str10, str8, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getModeIndex() {
        return this.modeIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGateway() {
        return this.gateway;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGatewayKey() {
        return this.gatewayKey;
    }

    /* renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: component7, reason: from getter */
    public final String getContextText() {
        return this.contextText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFallback() {
        return this.fallback;
    }

    /* renamed from: component9, reason: from getter */
    public final int getPermissionIndex() {
        return this.permissionIndex;
    }

    public final AiSettingsForm copy(int modeIndex, String endpoint, String apiKey, String gateway, String gatewayKey, String model, String contextText, String fallback, int permissionIndex) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(gatewayKey, "gatewayKey");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(contextText, "contextText");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        return new AiSettingsForm(modeIndex, endpoint, apiKey, gateway, gatewayKey, model, contextText, fallback, permissionIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiSettingsForm)) {
            return false;
        }
        AiSettingsForm aiSettingsForm = (AiSettingsForm) other;
        return this.modeIndex == aiSettingsForm.modeIndex && Intrinsics.areEqual(this.endpoint, aiSettingsForm.endpoint) && Intrinsics.areEqual(this.apiKey, aiSettingsForm.apiKey) && Intrinsics.areEqual(this.gateway, aiSettingsForm.gateway) && Intrinsics.areEqual(this.gatewayKey, aiSettingsForm.gatewayKey) && Intrinsics.areEqual(this.model, aiSettingsForm.model) && Intrinsics.areEqual(this.contextText, aiSettingsForm.contextText) && Intrinsics.areEqual(this.fallback, aiSettingsForm.fallback) && this.permissionIndex == aiSettingsForm.permissionIndex;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.modeIndex) * 31) + this.endpoint.hashCode()) * 31) + this.apiKey.hashCode()) * 31) + this.gateway.hashCode()) * 31) + this.gatewayKey.hashCode()) * 31) + this.model.hashCode()) * 31) + this.contextText.hashCode()) * 31) + this.fallback.hashCode()) * 31) + Integer.hashCode(this.permissionIndex);
    }

    public String toString() {
        return "AiSettingsForm(modeIndex=" + this.modeIndex + ", endpoint=" + this.endpoint + ", apiKey=" + this.apiKey + ", gateway=" + this.gateway + ", gatewayKey=" + this.gatewayKey + ", model=" + this.model + ", contextText=" + this.contextText + ", fallback=" + this.fallback + ", permissionIndex=" + this.permissionIndex + ")";
    }

    public AiSettingsForm(int modeIndex, String endpoint, String apiKey, String gateway, String gatewayKey, String model, String contextText, String fallback, int permissionIndex) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(gatewayKey, "gatewayKey");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(contextText, "contextText");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        this.modeIndex = modeIndex;
        this.endpoint = endpoint;
        this.apiKey = apiKey;
        this.gateway = gateway;
        this.gatewayKey = gatewayKey;
        this.model = model;
        this.contextText = contextText;
        this.fallback = fallback;
        this.permissionIndex = permissionIndex;
    }

    public /* synthetic */ AiSettingsForm(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "200000" : str6, (i3 & 128) != 0 ? "" : str7, (i3 & 256) != 0 ? 0 : i2);
    }

    public final int getModeIndex() {
        return this.modeIndex;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getGateway() {
        return this.gateway;
    }

    public final String getGatewayKey() {
        return this.gatewayKey;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getContextText() {
        return this.contextText;
    }

    public final String getFallback() {
        return this.fallback;
    }

    public final int getPermissionIndex() {
        return this.permissionIndex;
    }

    public final String getMode() {
        return AiMode.INSTANCE.fromUi(this.modeIndex);
    }

    public final AiSettings toSettings(AiSettings base) {
        Intrinsics.checkNotNullParameter(base, "base");
        String mode = getMode();
        String string = StringsKt.trim((CharSequence) this.endpoint).toString();
        String string2 = StringsKt.trim((CharSequence) this.apiKey).toString();
        String string3 = StringsKt.trim((CharSequence) this.gateway).toString();
        String string4 = StringsKt.trim((CharSequence) this.gatewayKey).toString();
        String string5 = StringsKt.trim((CharSequence) this.model).toString();
        if (string5.length() == 0) {
            string5 = Builtin.DEFAULT_MODEL;
        }
        String str = string5;
        String string6 = StringsKt.trim((CharSequence) this.fallback).toString();
        AiSettings.Companion companion = AiSettings.INSTANCE;
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) this.contextText).toString());
        int iClampContext = companion.clampContext(intOrNull != null ? intOrNull.intValue() : base.getContextWindow());
        List<String> ui_modes = Permission.INSTANCE.getUI_MODES();
        int iCoerceIn = RangesKt.coerceIn(this.permissionIndex, 0, Permission.INSTANCE.getUI_MODES().size() - 1);
        return base.copy((7935 & 1) != 0 ? base.mode : mode, (7935 & 2) != 0 ? base.gatewayUrl : string3, (7935 & 4) != 0 ? base.baseUrl : string, (7935 & 8) != 0 ? base.apiKey : string2, (7935 & 16) != 0 ? base.gatewayKey : string4, (7935 & 32) != 0 ? base.model : str, (7935 & 64) != 0 ? base.fallbackModel : string6, (7935 & 128) != 0 ? base.contextWindow : iClampContext, (7935 & 256) != 0 ? base.maxTokens : 0, (7935 & 512) != 0 ? base.permissionMode : iCoerceIn >= 0 && iCoerceIn < ui_modes.size() ? ui_modes.get(iCoerceIn) : InputSettings.DEFAULT_LAYOUT, (7935 & 1024) != 0 ? base.temperature : 0.0d, (7935 & 2048) != 0 ? base.language : null, (7935 & 4096) != 0 ? base.capsOverrides : null);
    }

    public final String blockingError(AiSettings base) {
        Intrinsics.checkNotNullParameter(base, "base");
        return AiEndpoints.INSTANCE.validate(toSettings(base));
    }

    public final List<String> warnings(AiSettings base) {
        Intrinsics.checkNotNullParameter(base, "base");
        AiSettings st = toSettings(base);
        List out = new ArrayList();
        String strKeyHint = AiEndpoints.INSTANCE.keyHint(st);
        if (strKeyHint != null) {
            out.add(strKeyHint);
        }
        Integer n = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) this.contextText).toString());
        if (n == null) {
            out.add(AiText.INSTANCE.t("上下文窗口不是数字，将沿用 {0}", Integer.valueOf(st.getContextWindow())));
        } else {
            if (n.intValue() != st.getContextWindow()) {
                out.add(AiText.INSTANCE.t("上下文窗口超出范围，已按 {0} 处理（允许 {1}–{2}）", Integer.valueOf(st.getContextWindow()), Integer.valueOf(AiSettings.MIN_CONTEXT), Integer.valueOf(AiSettings.MAX_CONTEXT)));
            }
        }
        if ((st.getFallbackModel().length() > 0) && Intrinsics.areEqual(st.getFallbackModel(), st.getModel())) {
            out.add(AiText.INSTANCE.t("备用模型与主模型相同，不会生效", new Object[0]));
        }
        return out;
    }

    /* compiled from: AiSettingsForm.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\nJ\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e2\u0006\u0010\u000f\u001a\u00020\n¨\u0006\u0010"}, d2 = {"Lcom/pymcl/android/data/AiSettingsForm$Companion;", "", "<init>", "()V", "from", "Lcom/pymcl/android/data/AiSettingsForm;", "st", "Lcom/pymcl/ai/AiSettings;", "modelOptions", "", "", "list", "current", "splitDetail", "Lkotlin/Pair;", NotificationCompat.CATEGORY_MESSAGE, "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AiSettingsForm from(AiSettings st) {
            Intrinsics.checkNotNullParameter(st, "st");
            return new AiSettingsForm(AiMode.INSTANCE.uiIndex(st.getMode()), st.getBaseUrl(), st.getApiKey(), st.getGatewayUrl(), st.getGatewayKey(), st.getModel(), String.valueOf(st.getContextWindow()), st.getFallbackModel(), RangesKt.coerceIn(Permission.INSTANCE.uiIndex(st.getPermissionMode()), 0, Permission.INSTANCE.getUI_LABELS().size() - 1));
        }

        public final List<String> modelOptions(List<String> list, String current) {
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(current, "current");
            String string = StringsKt.trim((CharSequence) current).toString();
            if (!((string.length() > 0) && !list.contains(string))) {
                string = null;
            }
            return CollectionsKt.distinct(CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull(string), (Iterable) list));
        }

        public final Pair<String, String> splitDetail(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i = StringsKt.indexOf$default((CharSequence) msg, AiClient.DETAIL_SEP, 0, false, 6, (Object) null);
            String str = null;
            if (i < 0) {
                return TuplesKt.to(msg, null);
            }
            String strSubstring = msg.substring(0, i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = msg.substring(i + 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String str2 = strSubstring2;
            if (!StringsKt.isBlank(str2)) {
                str = str2;
            }
            return TuplesKt.to(strSubstring, str);
        }
    }
}
