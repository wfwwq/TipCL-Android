package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AppState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/pymcl/android/ui/state/CatalogKind;", "", "key", "", "title", "installedFirst", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getTitle", "getInstalledFirst", "()Z", "Mod", "Mods", "Modpack", "Datapack", "Resource", "Shader", "World", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public enum CatalogKind {
    Mod("mod", "Mod", false, 4, null),
    Mods("mods", "模组", true),
    Modpack("modpack", "整合包", false, 4, null),
    Datapack("datapack", "数据包", false, 4, null),
    Resource("resource", "资源包", false, 4, null),
    Shader("shader", "光影包", false, 4, null),
    World("world", "世界", false, 4, null);

    private final boolean installedFirst;
    private final String key;
    private final String title;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<CatalogKind> getEntries() {
        return $ENTRIES;
    }

    CatalogKind(String key, String title, boolean installedFirst) {
        this.key = key;
        this.title = title;
        this.installedFirst = installedFirst;
    }

    /* synthetic */ CatalogKind(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }

    public final boolean getInstalledFirst() {
        return this.installedFirst;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTitle() {
        return this.title;
    }
}
