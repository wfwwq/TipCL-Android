package com.pymcl.android.ui;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.pymcl.android.ui.state.NavKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PyMclApp.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/android/ui/NavEntry;", "", "Group", "Item", "Sec", "Lcom/pymcl/android/ui/NavEntry$Group;", "Lcom/pymcl/android/ui/NavEntry$Item;", "Lcom/pymcl/android/ui/NavEntry$Sec;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
interface NavEntry {

    /* compiled from: PyMclApp.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0011"}, d2 = {"Lcom/pymcl/android/ui/NavEntry$Group;", "Lcom/pymcl/android/ui/NavEntry;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Group implements NavEntry {
        public static final int $stable = 0;
        private final String title;

        public static /* synthetic */ Group copy$default(Group group, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = group.title;
            }
            return group.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Group copy(String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Group(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Group) && Intrinsics.areEqual(this.title, ((Group) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "Group(title=" + this.title + ")";
        }

        public Group(String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: PyMclApp.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001b"}, d2 = {"Lcom/pymcl/android/ui/NavEntry$Item;", "Lcom/pymcl/android/ui/NavEntry;", "key", "Lcom/pymcl/android/ui/state/NavKey;", "label", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "<init>", "(Lcom/pymcl/android/ui/state/NavKey;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;)V", "getKey", "()Lcom/pymcl/android/ui/state/NavKey;", "getLabel", "()Ljava/lang/String;", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Item implements NavEntry {
        public static final int $stable = NavKey.$stable;
        private final ImageVector icon;
        private final NavKey key;
        private final String label;

        public static /* synthetic */ Item copy$default(Item item, NavKey navKey, String str, ImageVector imageVector, int i, Object obj) {
            if ((i & 1) != 0) {
                navKey = item.key;
            }
            if ((i & 2) != 0) {
                str = item.label;
            }
            if ((i & 4) != 0) {
                imageVector = item.icon;
            }
            return item.copy(navKey, str, imageVector);
        }

        /* renamed from: component1, reason: from getter */
        public final NavKey getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final ImageVector getIcon() {
            return this.icon;
        }

        public final Item copy(NavKey key, String label, ImageVector icon) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Item(key, label, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.key, item.key) && Intrinsics.areEqual(this.label, item.label) && Intrinsics.areEqual(this.icon, item.icon);
        }

        public int hashCode() {
            return (((this.key.hashCode() * 31) + this.label.hashCode()) * 31) + this.icon.hashCode();
        }

        public String toString() {
            return "Item(key=" + this.key + ", label=" + this.label + ", icon=" + this.icon + ")";
        }

        public Item(NavKey key, String label, ImageVector icon) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.key = key;
            this.label = label;
            this.icon = icon;
        }

        public final ImageVector getIcon() {
            return this.icon;
        }

        public final NavKey getKey() {
            return this.key;
        }

        public final String getLabel() {
            return this.label;
        }
    }

    /* compiled from: PyMclApp.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001f"}, d2 = {"Lcom/pymcl/android/ui/NavEntry$Sec;", "Lcom/pymcl/android/ui/NavEntry;", "id", "", "label", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "children", "", "Lcom/pymcl/android/ui/NavEntry$Item;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getLabel", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getChildren", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Sec implements NavEntry {
        public static final int $stable = 8;
        private final List<Item> children;
        private final ImageVector icon;
        private final String id;
        private final String label;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Sec copy$default(Sec sec, String str, String str2, ImageVector imageVector, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sec.id;
            }
            if ((i & 2) != 0) {
                str2 = sec.label;
            }
            if ((i & 4) != 0) {
                imageVector = sec.icon;
            }
            if ((i & 8) != 0) {
                list = sec.children;
            }
            return sec.copy(str, str2, imageVector, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final ImageVector getIcon() {
            return this.icon;
        }

        public final List<Item> component4() {
            return this.children;
        }

        public final Sec copy(String id, String label, ImageVector icon, List<Item> children) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(children, "children");
            return new Sec(id, label, icon, children);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sec)) {
                return false;
            }
            Sec sec = (Sec) other;
            return Intrinsics.areEqual(this.id, sec.id) && Intrinsics.areEqual(this.label, sec.label) && Intrinsics.areEqual(this.icon, sec.icon) && Intrinsics.areEqual(this.children, sec.children);
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.children.hashCode();
        }

        public String toString() {
            return "Sec(id=" + this.id + ", label=" + this.label + ", icon=" + this.icon + ", children=" + this.children + ")";
        }

        public Sec(String id, String label, ImageVector icon, List<Item> children) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(children, "children");
            this.id = id;
            this.label = label;
            this.icon = icon;
            this.children = children;
        }

        public final List<Item> getChildren() {
            return this.children;
        }

        public final ImageVector getIcon() {
            return this.icon;
        }

        public final String getId() {
            return this.id;
        }

        public final String getLabel() {
            return this.label;
        }
    }
}
