package com.pymcl.android.ui.state;

import androidx.autofill.HintConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\tHÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fÊ\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0002¨\u0006%"}, d2 = {"Lcom/pymcl/android/ui/state/CatalogFile;", "", HintConstants.AUTOFILL_HINT_NAME, "", "gameVersions", "", "loaders", "date", "sizeKb", "", "id", "displayName", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getGameVersions", "()Ljava/util/List;", "getLoaders", "getDate", "getSizeKb", "()I", "getId", "getDisplayName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CatalogFile {
    public static final int $stable = 0;
    private final String date;
    private final String displayName;
    private final List<String> gameVersions;
    private final String id;
    private final List<String> loaders;
    private final String name;
    private final int sizeKb;

    public static /* synthetic */ CatalogFile copy$default(CatalogFile catalogFile, String str, List list, List list2, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = catalogFile.name;
        }
        if ((i2 & 2) != 0) {
            list = catalogFile.gameVersions;
        }
        if ((i2 & 4) != 0) {
            list2 = catalogFile.loaders;
        }
        if ((i2 & 8) != 0) {
            str2 = catalogFile.date;
        }
        if ((i2 & 16) != 0) {
            i = catalogFile.sizeKb;
        }
        if ((i2 & 32) != 0) {
            str3 = catalogFile.id;
        }
        if ((i2 & 64) != 0) {
            str4 = catalogFile.displayName;
        }
        String str5 = str3;
        String str6 = str4;
        int i3 = i;
        List list3 = list2;
        return catalogFile.copy(str, list, list3, str2, i3, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<String> component2() {
        return this.gameVersions;
    }

    public final List<String> component3() {
        return this.loaders;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSizeKb() {
        return this.sizeKb;
    }

    /* renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final CatalogFile copy(String name, List<String> gameVersions, List<String> loaders, String date, int sizeKb, String id, String displayName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(gameVersions, "gameVersions");
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new CatalogFile(name, gameVersions, loaders, date, sizeKb, id, displayName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogFile)) {
            return false;
        }
        CatalogFile catalogFile = (CatalogFile) other;
        return Intrinsics.areEqual(this.name, catalogFile.name) && Intrinsics.areEqual(this.gameVersions, catalogFile.gameVersions) && Intrinsics.areEqual(this.loaders, catalogFile.loaders) && Intrinsics.areEqual(this.date, catalogFile.date) && this.sizeKb == catalogFile.sizeKb && Intrinsics.areEqual(this.id, catalogFile.id) && Intrinsics.areEqual(this.displayName, catalogFile.displayName);
    }

    public int hashCode() {
        return (((((((((((this.name.hashCode() * 31) + this.gameVersions.hashCode()) * 31) + this.loaders.hashCode()) * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.sizeKb)) * 31) + this.id.hashCode()) * 31) + this.displayName.hashCode();
    }

    public String toString() {
        return "CatalogFile(name=" + this.name + ", gameVersions=" + this.gameVersions + ", loaders=" + this.loaders + ", date=" + this.date + ", sizeKb=" + this.sizeKb + ", id=" + this.id + ", displayName=" + this.displayName + ")";
    }

    public CatalogFile(String name, List<String> gameVersions, List<String> loaders, String date, int sizeKb, String id, String displayName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(gameVersions, "gameVersions");
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.name = name;
        this.gameVersions = gameVersions;
        this.loaders = loaders;
        this.date = date;
        this.sizeKb = sizeKb;
        this.id = id;
        this.displayName = displayName;
    }

    public /* synthetic */ CatalogFile(String str, List list, List list2, String str2, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, str2, i, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? str : str4);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<String> getGameVersions() {
        return this.gameVersions;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getLoaders() {
        return this.loaders;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSizeKb() {
        return this.sizeKb;
    }
}
