package com.pymcl.android.ui.state;

import com.pymcl.android.ui.Destination;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppState.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/pymcl/android/ui/state/NavKey;", "", "dest", "Lcom/pymcl/android/ui/Destination;", "catalog", "Lcom/pymcl/android/ui/state/CatalogKind;", "<init>", "(Lcom/pymcl/android/ui/Destination;Lcom/pymcl/android/ui/state/CatalogKind;)V", "getDest", "()Lcom/pymcl/android/ui/Destination;", "getCatalog", "()Lcom/pymcl/android/ui/state/CatalogKind;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class NavKey {
    public static final int $stable = 0;
    private final CatalogKind catalog;
    private final Destination dest;

    public static /* synthetic */ NavKey copy$default(NavKey navKey, Destination destination, CatalogKind catalogKind, int i, Object obj) {
        if ((i & 1) != 0) {
            destination = navKey.dest;
        }
        if ((i & 2) != 0) {
            catalogKind = navKey.catalog;
        }
        return navKey.copy(destination, catalogKind);
    }

    /* renamed from: component1, reason: from getter */
    public final Destination getDest() {
        return this.dest;
    }

    /* renamed from: component2, reason: from getter */
    public final CatalogKind getCatalog() {
        return this.catalog;
    }

    public final NavKey copy(Destination dest, CatalogKind catalog) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        return new NavKey(dest, catalog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavKey)) {
            return false;
        }
        NavKey navKey = (NavKey) other;
        return this.dest == navKey.dest && this.catalog == navKey.catalog;
    }

    public int hashCode() {
        return (this.dest.hashCode() * 31) + (this.catalog == null ? 0 : this.catalog.hashCode());
    }

    public String toString() {
        return "NavKey(dest=" + this.dest + ", catalog=" + this.catalog + ")";
    }

    public NavKey(Destination dest, CatalogKind catalog) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.dest = dest;
        this.catalog = catalog;
    }

    public /* synthetic */ NavKey(Destination destination, CatalogKind catalogKind, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(destination, (i & 2) != 0 ? null : catalogKind);
    }

    public final CatalogKind getCatalog() {
        return this.catalog;
    }

    public final Destination getDest() {
        return this.dest;
    }
}
