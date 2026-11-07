package com.pymcl.android.ui.theme;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/pymcl/android/ui/theme/BgPreset;", "", "label", "", "light", "", "", "darkC", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getLabel", "()Ljava/lang/String;", "getLight", "()Ljava/util/List;", "getDarkC", "Default", "Eye", "Warm", "Mist", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes19.dex */
public enum BgPreset {
    Default("默认", CollectionsKt.emptyList(), CollectionsKt.emptyList()),
    Eye("护眼绿", CollectionsKt.listOf((Object[]) new Long[]{15463660L, 15726576L, 15398123L, 15595246L}), CollectionsKt.listOf((Object[]) new Long[]{1186325L, 1318167L, 1450266L, 1186325L})),
    Warm("暖米", CollectionsKt.listOf((Object[]) new Long[]{16249834L, 16381421L, 16184040L, 16315628L}), CollectionsKt.listOf((Object[]) new Long[]{1775635L, 1907221L, 2104342L, 1775635L})),
    Mist("雾蓝", CollectionsKt.listOf((Object[]) new Long[]{15593974L, 15791353L, 15462646L, 15659768L}), CollectionsKt.listOf((Object[]) new Long[]{1316893L, 1448737L, 1580581L, 1316893L}));

    private final List<Long> darkC;
    private final String label;
    private final List<Long> light;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<BgPreset> getEntries() {
        return $ENTRIES;
    }

    BgPreset(String label, List light, List darkC) {
        this.label = label;
        this.light = light;
        this.darkC = darkC;
    }

    public final List<Long> getDarkC() {
        return this.darkC;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<Long> getLight() {
        return this.light;
    }
}
