package com.pymcl.core.config;

import com.pymcl.ai.AiMode;
import com.pymcl.ai.Builtin;
import com.pymcl.android.data.LauncherPrefs;
import com.pymcl.android.data.SettingsLogic;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.input.InputSettings;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DebugKt;

/* compiled from: ConfigStore.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tH\u0002J\"\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tH\u0002J\u0006\u0010\u000e\u001a\u00020\fJ\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tJ\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\bH\u0086\u0002J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010\u0011\u001a\u00020\bJ\u001c\u0010\u001e\u001a\u00020\u00162\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010 J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001J\u0006\u0010#\u001a\u00020\u0016J\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006&"}, d2 = {"Lcom/pymcl/core/config/ConfigStore;", "", "paths", "Lcom/pymcl/core/config/LauncherPaths;", "<init>", "(Lcom/pymcl/core/config/LauncherPaths;)V", "data", "", "", "Lcom/pymcl/core/util/JObj;", "load", "migrate", "", "m", "reload", "snapshot", SettingsProtocol.GET, "key", "string", "int", "", "bool", "", "list", "", "curseforgeKey", "getCurseforgeKey", "()Ljava/lang/String;", "microsoftClientId", "getMicrosoftClientId", "update", "changes", "", "set", "value", "save", "publicSettings", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ConfigStore {
    public static final String AI_GATEWAY_DEFAULTS_VER = "2026.10-builtin-newapi";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Object> DEFAULTS = JsonKt.jobj(TuplesKt.to("instances_dir", ".minecraft"), TuplesKt.to("default_instance", ""), TuplesKt.to("java_dir", "java"), TuplesKt.to("shared_libraries", false), TuplesKt.to("shared_assets", false), TuplesKt.to("memory_mb", 4096L), TuplesKt.to("download_threads", 8L), TuplesKt.to("download_segments", 4L), TuplesKt.to("width", 854L), TuplesKt.to("height", 480L), TuplesKt.to("microsoft_client_id", "00000000402b5328"), TuplesKt.to("curseforge_api_key", ""), TuplesKt.to("github_proxy_prefixes", CollectionsKt.mutableListOf("https://gitproxy.mrhjx.cn/", "https://ghproxy.vip/", "https://gh-proxy.com/", "https://v6.gh-proxy.org/", "https://cdn.gh-proxy.com/")), TuplesKt.to("force_manifest_refresh", false), TuplesKt.to("download_source", DebugKt.DEBUG_PROPERTY_VALUE_AUTO), TuplesKt.to("community_source", DebugKt.DEBUG_PROPERTY_VALUE_AUTO), TuplesKt.to("use_system_proxy", true), TuplesKt.to("ai_mode", AiMode.CUSTOM), TuplesKt.to("ai_gateway_url", ""), TuplesKt.to("ai_base_url", ""), TuplesKt.to("ai_api_key", ""), TuplesKt.to("ai_model", Builtin.DEFAULT_MODEL), TuplesKt.to("ai_confirm_writes", true), TuplesKt.to("ai_permission_mode", InputSettings.DEFAULT_LAYOUT), TuplesKt.to("ai_permission_rules", new ArrayList()), TuplesKt.to("ai_permission_dont_ask", false), TuplesKt.to("ai_context_window", 200000L), TuplesKt.to("ai_max_tokens", 8192L), TuplesKt.to("ai_model_caps_overrides", JsonKt.jobj(new Pair[0])), TuplesKt.to("terracotta_extra_nodes", CollectionsKt.mutableListOf("https://terracotta.glavo.site/acebc7d8-1208-47fd-b212-d03ac49e36e0")), TuplesKt.to(LauncherPrefs.FEEDBACK_URL, ""), TuplesKt.to("feedback_heartbeat", true), TuplesKt.to(LauncherPrefs.FEEDBACK_CONSENT, null), TuplesKt.to("device_id", ""), TuplesKt.to(SettingsLogic.Extras.ISOLATION_KEY, "all"), TuplesKt.to("isolation_defaults", ""), TuplesKt.to("ai_gateway_defaults", ""), TuplesKt.to("default_jvm_args", ""), TuplesKt.to("default_priority", "normal"), TuplesKt.to("update_url", "https://pymcl.dev/update.json"), TuplesKt.to(SettingsLogic.Extras.THEME_COLOR, "#2E9B6B"), TuplesKt.to("ui_dark", false), TuplesKt.to("ui_background", ""), TuplesKt.to("ui_background_folder", ""), TuplesKt.to("ui_background_shuffle", false), TuplesKt.to("ui_background_interval", 10L), TuplesKt.to("ui_background_history", new ArrayList()), TuplesKt.to("ui_background_folder_history", new ArrayList()), TuplesKt.to("ui_sidebar_opacity", 85L), TuplesKt.to("ui_background_blur", 0L), TuplesKt.to("ui_background_dim", 25L), TuplesKt.to("ui_fly_animation", true), TuplesKt.to("ui_fly_duration_ms", 620L), TuplesKt.to("ui_motion", true), TuplesKt.to("ui_layout", null), TuplesKt.to("ui_layouts", JsonKt.jobj(new Pair[0])), TuplesKt.to("ui_layout_profile", ""), TuplesKt.to("ui_launch_dock_corner", DebugKt.DEBUG_PROPERTY_VALUE_AUTO), TuplesKt.to("ui_window_aspect", "4:3"), TuplesKt.to("ui_nav_order", new ArrayList()), TuplesKt.to("ui_nav_hidden", new ArrayList()), TuplesKt.to("ui_nav_pinned", new ArrayList()), TuplesKt.to("ui_nav_groups", null), TuplesKt.to("ui_nav_defaults", ""), TuplesKt.to("ui_nav_style", "grouped"), TuplesKt.to("ui_section_members", JsonKt.jobj(new Pair[0])), TuplesKt.to("ui_sidebar_width", 0L), TuplesKt.to("default_java", ""), TuplesKt.to("global_mods_dir", ""), TuplesKt.to(SettingsLogic.Extras.VISIBILITY_KEY, "keep"), TuplesKt.to(SettingsLogic.Extras.GC_KEY, DebugKt.DEBUG_PROPERTY_VALUE_AUTO), TuplesKt.to("download_limit_kbps", 0L), TuplesKt.to("auto_check_update", true), TuplesKt.to("custom_homepage", ""), TuplesKt.to(SettingsLogic.Extras.HOMEPAGE_KEY, "news"), TuplesKt.to("window_mode", "window"), TuplesKt.to("skip_assets", false), TuplesKt.to("first_run", true), TuplesKt.to("show_hidden_versions", false), TuplesKt.to("catalog_favorites", new ArrayList()), TuplesKt.to("offline_skin", InputSettings.DEFAULT_LAYOUT), TuplesKt.to("allow_multi_instance", false), TuplesKt.to("export_dir", ""), TuplesKt.to("language", "zh_CN"), TuplesKt.to("android_renderer", DebugKt.DEBUG_PROPERTY_VALUE_AUTO));
    public static final String ISOLATION_DEFAULTS_VER = "2026.09-isolate-all";
    private volatile Map<String, Object> data;
    private final LauncherPaths paths;

    /* compiled from: ConfigStore.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/pymcl/core/config/ConfigStore$Companion;", "", "<init>", "()V", "DEFAULTS", "", "", "Lcom/pymcl/core/util/JObj;", "getDEFAULTS", "()Ljava/util/Map;", "ISOLATION_DEFAULTS_VER", "AI_GATEWAY_DEFAULTS_VER", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Map<String, Object> getDEFAULTS() {
            return ConfigStore.DEFAULTS;
        }
    }

    public ConfigStore(LauncherPaths paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        this.paths = paths;
        this.data = load();
    }

    private final Map<String, Object> load() {
        Map raw = FileUtil.INSTANCE.readJsonObj(this.paths.getConfigFile());
        if (raw == null) {
            raw = JsonKt.jobj(new Pair[0]);
        }
        Map m = JsonKt.o(JsonKt.deepCopy(DEFAULTS));
        Intrinsics.checkNotNull(m);
        m.putAll(raw);
        migrate(m);
        LauncherPaths launcherPaths = this.paths;
        String str = JsonKt.str(m, "instances_dir");
        if (str == null) {
            str = ".minecraft";
        }
        launcherPaths.setInstancesDir(str);
        return m;
    }

    private final void migrate(Map<String, Object> m) {
        if (Intrinsics.areEqual(m.get("instances_dir"), "instances")) {
            File old = this.paths.resolve("instances");
            File fileResolve = this.paths.resolve(".minecraft");
            if (old.isDirectory() && !fileResolve.exists()) {
                old.renameTo(fileResolve);
            }
            m.put("instances_dir", ".minecraft");
        }
        if (!Intrinsics.areEqual(JsonKt.str(m, "isolation_defaults"), ISOLATION_DEFAULTS_VER)) {
            if (Intrinsics.areEqual(m.get(SettingsLogic.Extras.ISOLATION_KEY), "none")) {
                m.put(SettingsLogic.Extras.ISOLATION_KEY, "all");
            }
            m.put("isolation_defaults", ISOLATION_DEFAULTS_VER);
        }
        if (!Intrinsics.areEqual(JsonKt.str(m, "ai_gateway_defaults"), AI_GATEWAY_DEFAULTS_VER)) {
            boolean noAi = false;
            Iterable $this$all$iv = CollectionsKt.listOf((Object[]) new String[]{"ai_gateway_url", "ai_base_url", "ai_api_key"});
            if (!($this$all$iv instanceof Collection) || !((Collection) $this$all$iv).isEmpty()) {
                Iterator it = $this$all$iv.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object element$iv = it.next();
                        String it2 = (String) element$iv;
                        String str = JsonKt.str(m, it2);
                        if (!(str == null || str.length() == 0)) {
                            break;
                        }
                    } else {
                        noAi = true;
                        break;
                    }
                }
            } else {
                noAi = true;
            }
            if (noAi && Intrinsics.areEqual(m.get("ai_mode"), "public")) {
                m.put("ai_mode", AiMode.CUSTOM);
            }
            m.put("ai_gateway_defaults", AI_GATEWAY_DEFAULTS_VER);
        }
    }

    public final void reload() {
        this.data = load();
    }

    public final Map<String, Object> snapshot() {
        Map<String, Object> mapO;
        synchronized (this) {
            mapO = JsonKt.o(JsonKt.deepCopy(this.data));
            Intrinsics.checkNotNull(mapO);
        }
        return mapO;
    }

    public final Object get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.data.get(key);
    }

    public final String string(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String str = JsonKt.str(this.data, key);
        if (str != null) {
            return str;
        }
        String str2 = JsonKt.str(DEFAULTS, key);
        return str2 == null ? "" : str2;
    }

    /* renamed from: int, reason: not valid java name */
    public final int m8017int(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Integer numM8042int = JsonKt.m8042int(this.data, key);
        if (numM8042int == null && (numM8042int = JsonKt.m8042int(DEFAULTS, key)) == null) {
            return 0;
        }
        return numM8042int.intValue();
    }

    public final boolean bool(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Boolean bool = JsonKt.bool(this.data, key);
        if (bool == null && (bool = JsonKt.bool(DEFAULTS, key)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List<String> list(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Iterable iterableArr = JsonKt.arr(this.data, key);
        if (iterableArr == null) {
            return CollectionsKt.emptyList();
        }
        Iterable $this$mapNotNull$iv = iterableArr;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            String str = element$iv$iv$iv instanceof String ? (String) element$iv$iv$iv : null;
            if (str != null) {
                destination$iv$iv.add(str);
            }
        }
        return (List) destination$iv$iv;
    }

    public final String getCurseforgeKey() {
        String strString = string("curseforge_api_key");
        if (strString.length() == 0) {
            strString = BuiltinSecrets.INSTANCE.getCurseforgeKey();
        }
        return strString;
    }

    public final String getMicrosoftClientId() {
        String strString = string("microsoft_client_id");
        if (strString.length() == 0) {
            strString = "00000000402b5328";
        }
        return strString;
    }

    public final boolean update(Map<String, ? extends Object> changes) {
        boolean zSave;
        Intrinsics.checkNotNullParameter(changes, "changes");
        synchronized (this) {
            Map m = JsonKt.o(JsonKt.deepCopy(this.data));
            Intrinsics.checkNotNull(m);
            m.putAll(changes);
            this.data = m;
            if (changes.containsKey("instances_dir")) {
                LauncherPaths launcherPaths = this.paths;
                String str = JsonKt.str(m, "instances_dir");
                if (str == null) {
                    str = ".minecraft";
                }
                launcherPaths.setInstancesDir(str);
            }
            zSave = save();
        }
        return zSave;
    }

    public final boolean set(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return update(MapsKt.mapOf(TuplesKt.to(key, value)));
    }

    public final boolean save() {
        boolean zWriteJson;
        synchronized (this) {
            Map out = JsonKt.o(JsonKt.deepCopy(this.data));
            Intrinsics.checkNotNull(out);
            if (Intrinsics.areEqual(out.get("curseforge_api_key"), BuiltinSecrets.INSTANCE.getCurseforgeKey())) {
                out.put("curseforge_api_key", "");
            }
            zWriteJson = FileUtil.INSTANCE.writeJson(this.paths.getConfigFile(), out);
        }
        return zWriteJson;
    }

    public final Map<String, Object> publicSettings() {
        Map m = snapshot();
        m.put("ms_client_id", m.remove("microsoft_client_id"));
        for (String k : CollectionsKt.listOf((Object[]) new String[]{"curseforge_api_key", "ai_api_key"})) {
            Object objRemove = m.remove(k);
            String v = objRemove instanceof String ? (String) objRemove : null;
            String str = "";
            if (v == null) {
                v = "";
            }
            m.put(k + "_set", Boolean.valueOf(v.length() > 0));
            String str2 = k + "_hint";
            if (v.length() > 8) {
                str = StringsKt.take(v, 3) + "…" + StringsKt.takeLast(v, 4);
            }
            m.put(str2, str);
        }
        return m;
    }
}
