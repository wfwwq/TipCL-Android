package com.pymcl.core.mods;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModCatalog.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Js\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010,\u001a\u00020-HÖ\u0081\u0004J\n\u0010.\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006/"}, d2 = {"Lcom/pymcl/core/mods/ModHit;", "", "id", "", "title", "author", "downloads", "", "desc", "source", "categories", "", "iconUrl", "pageUrl", "slug", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getAuthor", "getDownloads", "()J", "getDesc", "getSource", "getCategories", "()Ljava/util/List;", "getIconUrl", "getPageUrl", "getSlug", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ModHit {
    private final String author;
    private final List<String> categories;
    private final String desc;
    private final long downloads;
    private final String iconUrl;
    private final String id;
    private final String pageUrl;
    private final String slug;
    private final String source;
    private final String title;

    public static /* synthetic */ ModHit copy$default(ModHit modHit, String str, String str2, String str3, long j, String str4, String str5, List list, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modHit.id;
        }
        if ((i & 2) != 0) {
            str2 = modHit.title;
        }
        if ((i & 4) != 0) {
            str3 = modHit.author;
        }
        if ((i & 8) != 0) {
            j = modHit.downloads;
        }
        if ((i & 16) != 0) {
            str4 = modHit.desc;
        }
        if ((i & 32) != 0) {
            str5 = modHit.source;
        }
        if ((i & 64) != 0) {
            list = modHit.categories;
        }
        if ((i & 128) != 0) {
            str6 = modHit.iconUrl;
        }
        if ((i & 256) != 0) {
            str7 = modHit.pageUrl;
        }
        if ((i & 512) != 0) {
            str8 = modHit.slug;
        }
        String str9 = str7;
        String str10 = str8;
        long j2 = j;
        String str11 = str3;
        return modHit.copy(str, str2, str11, j2, str4, str5, list, str6, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSlug() {
        return this.slug;
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
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final ModHit copy(String id, String title, String author, long downloads, String desc, String source, List<String> categories, String iconUrl, String pageUrl, String slug) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(slug, "slug");
        return new ModHit(id, title, author, downloads, desc, source, categories, iconUrl, pageUrl, slug);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModHit)) {
            return false;
        }
        ModHit modHit = (ModHit) other;
        return Intrinsics.areEqual(this.id, modHit.id) && Intrinsics.areEqual(this.title, modHit.title) && Intrinsics.areEqual(this.author, modHit.author) && this.downloads == modHit.downloads && Intrinsics.areEqual(this.desc, modHit.desc) && Intrinsics.areEqual(this.source, modHit.source) && Intrinsics.areEqual(this.categories, modHit.categories) && Intrinsics.areEqual(this.iconUrl, modHit.iconUrl) && Intrinsics.areEqual(this.pageUrl, modHit.pageUrl) && Intrinsics.areEqual(this.slug, modHit.slug);
    }

    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.author.hashCode()) * 31) + Long.hashCode(this.downloads)) * 31) + this.desc.hashCode()) * 31) + this.source.hashCode()) * 31) + this.categories.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.pageUrl.hashCode()) * 31) + this.slug.hashCode();
    }

    public String toString() {
        return "ModHit(id=" + this.id + ", title=" + this.title + ", author=" + this.author + ", downloads=" + this.downloads + ", desc=" + this.desc + ", source=" + this.source + ", categories=" + this.categories + ", iconUrl=" + this.iconUrl + ", pageUrl=" + this.pageUrl + ", slug=" + this.slug + ")";
    }

    public ModHit(String id, String title, String author, long downloads, String desc, String source, List<String> categories, String iconUrl, String pageUrl, String slug) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(slug, "slug");
        this.id = id;
        this.title = title;
        this.author = author;
        this.downloads = downloads;
        this.desc = desc;
        this.source = source;
        this.categories = categories;
        this.iconUrl = iconUrl;
        this.pageUrl = pageUrl;
        this.slug = slug;
    }

    public /* synthetic */ ModHit(String str, String str2, String str3, long j, String str4, String str5, List list, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, str4, str5, list, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8);
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

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final String getSlug() {
        return this.slug;
    }
}
