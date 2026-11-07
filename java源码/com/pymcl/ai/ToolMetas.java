package com.pymcl.ai;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: Permission.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/pymcl/ai/ToolMetas;", "", "<init>", "()V", "m", "", "Lcom/pymcl/ai/ToolMeta;", "names", "", "ro", "", "se", "risk", "lr", "ALL", "", "getALL", "()Ljava/util/Map;", "of", HintConstants.AUTOFILL_HINT_NAME, "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToolMetas {
    private static final Map<String, ToolMeta> ALL;
    public static final ToolMetas INSTANCE = new ToolMetas();

    private ToolMetas() {
    }

    private final List<ToolMeta> m(String names, boolean ro, String se, String risk, boolean lr) {
        Iterable $this$map$iv = StringsKt.split$default((CharSequence) names, new char[]{' '}, false, 0, 6, (Object) null);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            destination$iv$iv.add(new ToolMeta(it, ro, se, risk, lr));
        }
        return (List) destination$iv$iv;
    }

    static /* synthetic */ List m$default(ToolMetas toolMetas, String str, boolean z, String str2, String str3, boolean z2, int i, Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        return toolMetas.m(str, z, str2, str3, z2);
    }

    public final Map<String, ToolMeta> getALL() {
        return ALL;
    }

    static {
        Iterable $this$associateBy$iv = CollectionsKt.flatten(CollectionsKt.listOf((Object[]) new List[]{m$default(INSTANCE, "ask_user get_launcher_state list_instances list_installed_versions get_java_list dispatch_subagent update_plan", true, "none", "low", false, 16, null), m$default(INSTANCE, "search_versions search_mods search_modpacks search_content search_worlds", true, "network", "low", false, 16, null), m$default(INSTANCE, "list_mods diagnose_launch get_latest_log get_crash_report scan_mod_conflicts inspect_mod list_mod_configs read_mod_config read_artifact", true, "read", "low", false, 16, null), INSTANCE.m("install_game install_modpack", false, "write_local", "high", true), INSTANCE.m("install_mod install_world", false, "write_local", "medium", true), INSTANCE.m("install_shader install_resourcepack install_datapack", false, "write_local", "low", true), m$default(INSTANCE, "create_instance disable_mod enable_mod", false, "write_local", "medium", false, 16, null), INSTANCE.m("download_java", false, "write_local", "medium", true), m$default(INSTANCE, "write_mod_config", false, "write_local", "high", false, 16, null), m$default(INSTANCE, "delete_instance delete_mod", false, "delete", "high", false, 16, null), m$default(INSTANCE, "launch_game", false, "launch", "high", false, 16, null)}));
        int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map destination$iv$iv = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associateBy$iv) {
            ToolMeta it = (ToolMeta) element$iv$iv;
            destination$iv$iv.put(it.getName(), element$iv$iv);
        }
        ALL = destination$iv$iv;
    }

    public final ToolMeta of(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ToolMeta toolMeta = ALL.get(name);
        return toolMeta == null ? new ToolMeta(name, false, "write_local", "high", false, 16, null) : toolMeta;
    }
}
