package com.pymcl.ai;

import androidx.collection.SieveCacheKt;
import com.pymcl.ai.AiMode;
import com.pymcl.runtime.input.InputSettings;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: AiSettings.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 :2\u00020\u0001:\u0001:B\u0097\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012HÆ\u0003J\u0099\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012HÆ\u0001J\u0014\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00108\u001a\u00020\u000bHÖ\u0081\u0004J\n\u00109\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006;"}, d2 = {"Lcom/pymcl/ai/AiSettings;", "", "mode", "", "gatewayUrl", "baseUrl", "apiKey", "gatewayKey", "model", "fallbackModel", "contextWindow", "", "maxTokens", "permissionMode", "temperature", "", "language", "capsOverrides", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;DLjava/lang/String;Ljava/util/Map;)V", "getMode", "()Ljava/lang/String;", "getGatewayUrl", "getBaseUrl", "getApiKey", "getGatewayKey", "getModel", "getFallbackModel", "getContextWindow", "()I", "getMaxTokens", "getPermissionMode", "getTemperature", "()D", "getLanguage", "getCapsOverrides", "()Ljava/util/Map;", "toConfig", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AiSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String FALLBACK_KEY = "ai_fallback_model";
    public static final String GATEWAY_KEY = "ai_gateway_key";
    public static final int MAX_CONTEXT = 10000000;
    public static final int MIN_CONTEXT = 4000;
    private final String apiKey;
    private final String baseUrl;
    private final Map<String, Object> capsOverrides;
    private final int contextWindow;
    private final String fallbackModel;
    private final String gatewayKey;
    private final String gatewayUrl;
    private final String language;
    private final int maxTokens;
    private final String mode;
    private final String model;
    private final String permissionMode;
    private final double temperature;

    public AiSettings() {
        this(null, null, null, null, null, null, null, 0, 0, null, 0.0d, null, null, 8191, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPermissionMode() {
        return this.permissionMode;
    }

    /* renamed from: component11, reason: from getter */
    public final double getTemperature() {
        return this.temperature;
    }

    /* renamed from: component12, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final Map<String, Object> component13() {
        return this.capsOverrides;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGatewayUrl() {
        return this.gatewayUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
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
    public final String getFallbackModel() {
        return this.fallbackModel;
    }

    /* renamed from: component8, reason: from getter */
    public final int getContextWindow() {
        return this.contextWindow;
    }

    /* renamed from: component9, reason: from getter */
    public final int getMaxTokens() {
        return this.maxTokens;
    }

    public final AiSettings copy(String mode, String gatewayUrl, String baseUrl, String apiKey, String gatewayKey, String model, String fallbackModel, int contextWindow, int maxTokens, String permissionMode, double temperature, String language, Map<String, ? extends Object> capsOverrides) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(gatewayUrl, "gatewayUrl");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(gatewayKey, "gatewayKey");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(fallbackModel, "fallbackModel");
        Intrinsics.checkNotNullParameter(permissionMode, "permissionMode");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(capsOverrides, "capsOverrides");
        return new AiSettings(mode, gatewayUrl, baseUrl, apiKey, gatewayKey, model, fallbackModel, contextWindow, maxTokens, permissionMode, temperature, language, capsOverrides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiSettings)) {
            return false;
        }
        AiSettings aiSettings = (AiSettings) other;
        return Intrinsics.areEqual(this.mode, aiSettings.mode) && Intrinsics.areEqual(this.gatewayUrl, aiSettings.gatewayUrl) && Intrinsics.areEqual(this.baseUrl, aiSettings.baseUrl) && Intrinsics.areEqual(this.apiKey, aiSettings.apiKey) && Intrinsics.areEqual(this.gatewayKey, aiSettings.gatewayKey) && Intrinsics.areEqual(this.model, aiSettings.model) && Intrinsics.areEqual(this.fallbackModel, aiSettings.fallbackModel) && this.contextWindow == aiSettings.contextWindow && this.maxTokens == aiSettings.maxTokens && Intrinsics.areEqual(this.permissionMode, aiSettings.permissionMode) && Double.compare(this.temperature, aiSettings.temperature) == 0 && Intrinsics.areEqual(this.language, aiSettings.language) && Intrinsics.areEqual(this.capsOverrides, aiSettings.capsOverrides);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.mode.hashCode() * 31) + this.gatewayUrl.hashCode()) * 31) + this.baseUrl.hashCode()) * 31) + this.apiKey.hashCode()) * 31) + this.gatewayKey.hashCode()) * 31) + this.model.hashCode()) * 31) + this.fallbackModel.hashCode()) * 31) + Integer.hashCode(this.contextWindow)) * 31) + Integer.hashCode(this.maxTokens)) * 31) + this.permissionMode.hashCode()) * 31) + Double.hashCode(this.temperature)) * 31) + this.language.hashCode()) * 31) + this.capsOverrides.hashCode();
    }

    public String toString() {
        return "AiSettings(mode=" + this.mode + ", gatewayUrl=" + this.gatewayUrl + ", baseUrl=" + this.baseUrl + ", apiKey=" + this.apiKey + ", gatewayKey=" + this.gatewayKey + ", model=" + this.model + ", fallbackModel=" + this.fallbackModel + ", contextWindow=" + this.contextWindow + ", maxTokens=" + this.maxTokens + ", permissionMode=" + this.permissionMode + ", temperature=" + this.temperature + ", language=" + this.language + ", capsOverrides=" + this.capsOverrides + ")";
    }

    public AiSettings(String mode, String gatewayUrl, String baseUrl, String apiKey, String gatewayKey, String model, String fallbackModel, int contextWindow, int maxTokens, String permissionMode, double temperature, String language, Map<String, ? extends Object> capsOverrides) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(gatewayUrl, "gatewayUrl");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(gatewayKey, "gatewayKey");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(fallbackModel, "fallbackModel");
        Intrinsics.checkNotNullParameter(permissionMode, "permissionMode");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(capsOverrides, "capsOverrides");
        this.mode = mode;
        this.gatewayUrl = gatewayUrl;
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
        this.gatewayKey = gatewayKey;
        this.model = model;
        this.fallbackModel = fallbackModel;
        this.contextWindow = contextWindow;
        this.maxTokens = maxTokens;
        this.permissionMode = permissionMode;
        this.temperature = temperature;
        this.language = language;
        this.capsOverrides = capsOverrides;
    }

    public /* synthetic */ AiSettings(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, String str8, double d, String str9, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? AiMode.BUILTIN : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? Builtin.DEFAULT_MODEL : str6, (i3 & 64) == 0 ? str7 : "", (i3 & 128) != 0 ? 200000 : i, (i3 & 256) != 0 ? 8192 : i2, (i3 & 512) != 0 ? InputSettings.DEFAULT_LAYOUT : str8, (i3 & 1024) != 0 ? 0.3d : d, (i3 & 2048) != 0 ? "zh_CN" : str9, (i3 & 4096) != 0 ? MapsKt.emptyMap() : map);
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getGatewayUrl() {
        return this.gatewayUrl;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getGatewayKey() {
        return this.gatewayKey;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getFallbackModel() {
        return this.fallbackModel;
    }

    public final int getContextWindow() {
        return this.contextWindow;
    }

    public final int getMaxTokens() {
        return this.maxTokens;
    }

    public final String getPermissionMode() {
        return this.permissionMode;
    }

    public final double getTemperature() {
        return this.temperature;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Map<String, Object> getCapsOverrides() {
        return this.capsOverrides;
    }

    /* compiled from: AiSettings.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/pymcl/ai/AiSettings$Companion;", "", "<init>", "()V", "FALLBACK_KEY", "", "GATEWAY_KEY", "MIN_CONTEXT", "", "MAX_CONTEXT", "from", "Lcom/pymcl/ai/AiSettings;", "cfg", "", "normalizeMode", "m", "clampContext", SettingsProtocol.EXTRA_VALUE, "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private static final String from$s(Map<String, ? extends Object> map, String k, String d) {
            Object obj = map.get(k);
            String str = obj instanceof String ? (String) obj : null;
            return str == null ? d : str;
        }

        static /* synthetic */ String from$s$default(Map map, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = "";
            }
            return from$s(map, str, str2);
        }

        private static final int from$i(Map<String, ? extends Object> map, String k, int d) {
            String string;
            Object obj = map.get(k);
            Long longOrNull = null;
            Number it = obj instanceof Number ? (Number) obj : null;
            if (it != null) {
                longOrNull = Long.valueOf(((it instanceof Double) || (it instanceof Float)) ? (long) RangesKt.coerceIn(it.doubleValue(), -2.147483648E9d, 2.147483647E9d) : it.longValue());
            } else {
                Object obj2 = map.get(k);
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str != null && (string = StringsKt.trim((CharSequence) str).toString()) != null) {
                    longOrNull = StringsKt.toLongOrNull(string);
                }
            }
            return longOrNull != null ? (int) RangesKt.coerceIn(longOrNull.longValue(), SieveCacheKt.NodeMetaAndPreviousMask, SieveCacheKt.NodeLinkMask) : d;
        }

        public final AiSettings from(Map<String, ? extends Object> cfg) {
            LinkedHashMap destination$iv$iv;
            Iterable iterableEntrySet;
            Intrinsics.checkNotNullParameter(cfg, "cfg");
            AiMode.Migrated m = AiMode.INSTANCE.migrate(from$s(cfg, "ai_mode", AiMode.CUSTOM), from$s$default(cfg, "ai_base_url", null, 4, null), from$s$default(cfg, "ai_api_key", null, 4, null), from$s$default(cfg, "ai_gateway_url", null, 4, null));
            String mode = m.getMode();
            String gatewayUrl = m.getGatewayUrl();
            String baseUrl = m.getBaseUrl();
            String strFrom$s$default = from$s$default(cfg, "ai_api_key", null, 4, null);
            String strFrom$s$default2 = from$s$default(cfg, AiSettings.GATEWAY_KEY, null, 4, null);
            String string = StringsKt.trim((CharSequence) from$s$default(cfg, "ai_model", null, 4, null)).toString();
            if (StringsKt.isBlank(string)) {
                string = Builtin.DEFAULT_MODEL;
            }
            String str = string;
            String string2 = StringsKt.trim((CharSequence) from$s$default(cfg, AiSettings.FALLBACK_KEY, null, 4, null)).toString();
            int iClampContext = clampContext(from$i(cfg, "ai_context_window", 200000));
            int iCoerceIn = RangesKt.coerceIn(from$i(cfg, "ai_max_tokens", 8192), 256, 128000);
            Permission permission = Permission.INSTANCE;
            String strFrom$s = from$s(cfg, "ai_permission_mode", InputSettings.DEFAULT_LAYOUT);
            Object obj = cfg.get("ai_confirm_writes");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            String strMigrateMode = permission.migrateMode(strFrom$s, bool != null ? bool.booleanValue() : true);
            String strFrom$s2 = from$s(cfg, "language", "zh_CN");
            Object obj2 = cfg.get("ai_model_caps_overrides");
            Map map = obj2 instanceof Map ? (Map) obj2 : null;
            if (map == null || (iterableEntrySet = map.entrySet()) == null) {
                destination$iv$iv = MapsKt.emptyMap();
            } else {
                Iterable $this$associate$iv = iterableEntrySet;
                int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
                destination$iv$iv = new LinkedHashMap(capacity$iv);
                for (Object element$iv$iv : $this$associate$iv) {
                    Map.Entry entry = (Map.Entry) element$iv$iv;
                    Object k = entry.getKey();
                    Object v = entry.getValue();
                    Pair pair = TuplesKt.to(String.valueOf(k), v);
                    destination$iv$iv.put(pair.getFirst(), pair.getSecond());
                    m = m;
                }
            }
            return new AiSettings(mode, gatewayUrl, baseUrl, strFrom$s$default, strFrom$s$default2, str, string2, iClampContext, iCoerceIn, strMigrateMode, 0.0d, strFrom$s2, destination$iv$iv, 1024, null);
        }

        public final String normalizeMode(String m) {
            Intrinsics.checkNotNullParameter(m, "m");
            return AiMode.INSTANCE.normalize(m);
        }

        public final int clampContext(int v) {
            return RangesKt.coerceIn(v, AiSettings.MIN_CONTEXT, AiSettings.MAX_CONTEXT);
        }
    }

    public final Map<String, Object> toConfig() {
        Pair[] pairArr = new Pair[10];
        pairArr[0] = TuplesKt.to("ai_mode", AiMode.INSTANCE.normalize(this.mode));
        pairArr[1] = TuplesKt.to("ai_gateway_url", Builtin.INSTANCE.scrubUrl(StringsKt.trim((CharSequence) this.gatewayUrl).toString()));
        pairArr[2] = TuplesKt.to("ai_base_url", Builtin.INSTANCE.scrubUrl(StringsKt.trim((CharSequence) this.baseUrl).toString()));
        pairArr[3] = TuplesKt.to("ai_api_key", Builtin.INSTANCE.scrubKey(StringsKt.trim((CharSequence) this.apiKey).toString()));
        pairArr[4] = TuplesKt.to(GATEWAY_KEY, Builtin.INSTANCE.scrubKey(StringsKt.trim((CharSequence) this.gatewayKey).toString()));
        String string = StringsKt.trim((CharSequence) this.model).toString();
        if (StringsKt.isBlank(string)) {
            string = Builtin.DEFAULT_MODEL;
        }
        pairArr[5] = TuplesKt.to("ai_model", string);
        pairArr[6] = TuplesKt.to(FALLBACK_KEY, StringsKt.trim((CharSequence) this.fallbackModel).toString());
        pairArr[7] = TuplesKt.to("ai_context_window", Long.valueOf(INSTANCE.clampContext(this.contextWindow)));
        pairArr[8] = TuplesKt.to("ai_max_tokens", Long.valueOf(this.maxTokens));
        pairArr[9] = TuplesKt.to("ai_permission_mode", this.permissionMode);
        return MapsKt.mapOf(pairArr);
    }
}
