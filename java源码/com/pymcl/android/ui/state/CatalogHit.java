package com.pymcl.android.ui.state;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J}\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0014\u0010.\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u000201HÖ\u0081\u0004J\n\u00102\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014Ê\u0001\f\b4\u0012\b\b5\u0012\u0004\b\u0003\u0010\u0000¨\u00063"}, d2 = {"Lcom/pymcl/android/ui/state/CatalogHit;", "", "id", "", "title", "author", "downloads", "", "desc", "source", "categories", "", "favorite", "", "installed", "pageUrl", "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getAuthor", "getDownloads", "()J", "getDesc", "getSource", "getCategories", "()Ljava/util/List;", "getFavorite", "()Z", "getInstalled", "getPageUrl", "getIconUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CatalogHit {
    public static final int $stable = 8;
    private final String author;
    private final List<String> categories;
    private final String desc;
    private final long downloads;
    private final boolean favorite;
    private final String iconUrl;
    private final String id;
    private final boolean installed;
    private final String pageUrl;
    private final String source;
    private final String title;

    public static /* synthetic */ CatalogHit copy$default(CatalogHit catalogHit, String str, String str2, String str3, long j, String str4, String str5, List list, boolean z, boolean z2, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catalogHit.id;
        }
        if ((i & 2) != 0) {
            str2 = catalogHit.title;
        }
        if ((i & 4) != 0) {
            str3 = catalogHit.author;
        }
        if ((i & 8) != 0) {
            j = catalogHit.downloads;
        }
        if ((i & 16) != 0) {
            str4 = catalogHit.desc;
        }
        if ((i & 32) != 0) {
            str5 = catalogHit.source;
        }
        if ((i & 64) != 0) {
            list = catalogHit.categories;
        }
        if ((i & 128) != 0) {
            z = catalogHit.favorite;
        }
        if ((i & 256) != 0) {
            z2 = catalogHit.installed;
        }
        if ((i & 512) != 0) {
            str6 = catalogHit.pageUrl;
        }
        if ((i & 1024) != 0) {
            str7 = catalogHit.iconUrl;
        }
        String str8 = str6;
        String str9 = str7;
        boolean z3 = z2;
        List list2 = list;
        String str10 = str4;
        long j2 = j;
        String str11 = str3;
        return catalogHit.copy(str, str2, str11, j2, str10, str5, list2, z, z3, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPageUrl() {
        return this.pageUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDownloads() {
        return this.downloads;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final List<String> component7() {
        return this.categories;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getFavorite() {
        return this.favorite;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getInstalled() {
        return this.installed;
    }

    public final CatalogHit copy(String id, String title, String author, long downloads, String desc, String source, List<String> categories, boolean favorite, boolean installed, String pageUrl, String iconUrl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        return new CatalogHit(id, title, author, downloads, desc, source, categories, favorite, installed, pageUrl, iconUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogHit)) {
            return false;
        }
        CatalogHit catalogHit = (CatalogHit) other;
        return Intrinsics.areEqual(this.id, catalogHit.id) && Intrinsics.areEqual(this.title, catalogHit.title) && Intrinsics.areEqual(this.author, catalogHit.author) && this.downloads == catalogHit.downloads && Intrinsics.areEqual(this.desc, catalogHit.desc) && Intrinsics.areEqual(this.source, catalogHit.source) && Intrinsics.areEqual(this.categories, catalogHit.categories) && this.favorite == catalogHit.favorite && this.installed == catalogHit.installed && Intrinsics.areEqual(this.pageUrl, catalogHit.pageUrl) && Intrinsics.areEqual(this.iconUrl, catalogHit.iconUrl);
    }

    public int hashCode() {
        return (((((((((((((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.author.hashCode()) * 31) + Long.hashCode(this.downloads)) * 31) + this.desc.hashCode()) * 31) + this.source.hashCode()) * 31) + this.categories.hashCode()) * 31) + Boolean.hashCode(this.favorite)) * 31) + Boolean.hashCode(this.installed)) * 31) + this.pageUrl.hashCode()) * 31) + this.iconUrl.hashCode();
    }

    public String toString() {
        return "CatalogHit(id=" + this.id + ", title=" + this.title + ", author=" + this.author + ", downloads=" + this.downloads + ", desc=" + this.desc + ", source=" + this.source + ", categories=" + this.categories + ", favorite=" + this.favorite + ", installed=" + this.installed + ", pageUrl=" + this.pageUrl + ", iconUrl=" + this.iconUrl + ")";
    }

    public CatalogHit(String id, String title, String author, long downloads, String desc, String source, List<String> categories, boolean favorite, boolean installed, String pageUrl, String iconUrl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.id = id;
        this.title = title;
        this.author = author;
        this.downloads = downloads;
        this.desc = desc;
        this.source = source;
        this.categories = categories;
        this.favorite = favorite;
        this.installed = installed;
        this.pageUrl = pageUrl;
        this.iconUrl = iconUrl;
    }

    public /* synthetic */ CatalogHit(String str, String str2, String str3, long j, String str4, String str5, List list, boolean z, boolean z2, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, str4, str5, list, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? "" : str7);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final long getDownloads() {
        return this.downloads;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final boolean getFavorite() {
        return this.favorite;
    }

    public final boolean getInstalled() {
        return this.installed;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }
}
