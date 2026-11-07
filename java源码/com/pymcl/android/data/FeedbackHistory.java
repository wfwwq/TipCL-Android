package com.pymcl.android.data;

import com.pymcl.android.ui.state.FeedbackRecord;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeedbackSubmit.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nJ\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/pymcl/android/data/FeedbackHistory;", "", "<init>", "()V", "FILE", "", "MAX", "", "load", "", "Lcom/pymcl/android/data/FeedbackHistory$Entry;", "root", "Ljava/io/File;", "append", "e", "toRows", "Lcom/pymcl/android/ui/state/FeedbackRecord;", "entries", "Entry", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class FeedbackHistory {
    public static final int $stable = 0;
    public static final String FILE = "feedback_history.json";
    public static final FeedbackHistory INSTANCE = new FeedbackHistory();
    public static final int MAX = 200;

    private FeedbackHistory() {
    }

    /* compiled from: FeedbackSubmit.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/pymcl/android/data/FeedbackHistory$Entry;", "", "id", "", "time", "", "category", "title", SettingsProtocol.EXTRA_OK, "", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getTime", "()J", "getCategory", "getTitle", "getOk", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Entry {
        public static final int $stable = 0;
        private final String category;
        private final String id;
        private final boolean ok;
        private final long time;
        private final String title;

        public static /* synthetic */ Entry copy$default(Entry entry, String str, long j, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = entry.id;
            }
            if ((i & 2) != 0) {
                j = entry.time;
            }
            if ((i & 4) != 0) {
                str2 = entry.category;
            }
            if ((i & 8) != 0) {
                str3 = entry.title;
            }
            if ((i & 16) != 0) {
                z = entry.ok;
            }
            boolean z2 = z;
            String str4 = str2;
            return entry.copy(str, j, str4, str3, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getOk() {
            return this.ok;
        }

        public final Entry copy(String id, long time, String category, String title, boolean ok) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Entry(id, time, category, title, ok);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) other;
            return Intrinsics.areEqual(this.id, entry.id) && this.time == entry.time && Intrinsics.areEqual(this.category, entry.category) && Intrinsics.areEqual(this.title, entry.title) && this.ok == entry.ok;
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + Long.hashCode(this.time)) * 31) + this.category.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.ok);
        }

        public String toString() {
            return "Entry(id=" + this.id + ", time=" + this.time + ", category=" + this.category + ", title=" + this.title + ", ok=" + this.ok + ")";
        }

        public Entry(String id, long time, String category, String title, boolean ok) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = id;
            this.time = time;
            this.category = category;
            this.title = title;
            this.ok = ok;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getId() {
            return this.id;
        }

        public final boolean getOk() {
            return this.ok;
        }

        public final long getTime() {
            return this.time;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    public final List<Entry> load(File root) {
        Object objM8116constructorimpl;
        List listEmptyList;
        Entry entry;
        FeedbackHistory feedbackHistory;
        String string;
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(root, "root");
        File f = new File(root, FILE);
        if (!f.isFile()) {
            return CollectionsKt.emptyList();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            FeedbackHistory feedbackHistory2 = this;
            boolean z = true;
            Object obj = Json.INSTANCE.obj(FilesKt.readText$default(f, null, 1, null)).get("items");
            Iterable iterable = obj instanceof List ? (List) obj : null;
            if (iterable != null) {
                Collection arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    boolean z2 = z;
                    Map map = obj2 instanceof Map ? (Map) obj2 : null;
                    if (map == null) {
                        feedbackHistory = feedbackHistory2;
                        entry = null;
                    } else {
                        feedbackHistory = feedbackHistory2;
                        Object obj3 = map.get("id");
                        if (obj3 == null || (string = obj3.toString()) == null) {
                            string = "";
                        }
                        String str = string;
                        Object obj4 = map.get("time");
                        Number number = obj4 instanceof Number ? (Number) obj4 : null;
                        long jLongValue = number != null ? number.longValue() : 0L;
                        Object obj5 = map.get("category");
                        if (obj5 == null || (string2 = obj5.toString()) == null) {
                            string2 = "other";
                        }
                        Object obj6 = map.get("title");
                        entry = new Entry(str, jLongValue, string2, (obj6 == null || (string3 = obj6.toString()) == null) ? "" : string3, Intrinsics.areEqual(map.get(SettingsProtocol.EXTRA_OK), Boolean.valueOf(z2)));
                    }
                    if (entry != null) {
                        arrayList.add(entry);
                    }
                    z = z2;
                    feedbackHistory2 = feedbackHistory;
                }
                listEmptyList = (List) arrayList;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            objM8116constructorimpl = Result.m8116constructorimpl(listEmptyList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        List listEmptyList2 = CollectionsKt.emptyList();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = listEmptyList2;
        }
        return (List) objM8116constructorimpl;
    }

    public final List<Entry> append(File root, Entry e) {
        int i;
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(e, "e");
        List list = CollectionsKt.take(CollectionsKt.plus((Collection) CollectionsKt.listOf(e), (Iterable) load(root)), 200);
        try {
            Result.Companion companion = Result.INSTANCE;
            FeedbackHistory feedbackHistory = this;
            File file = new File(root, FILE);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            File file2 = new File(root, "feedback_history.json.tmp");
            Json json = Json.INSTANCE;
            int i2 = 1;
            Pair[] pairArr = new Pair[1];
            List list2 = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                i = i2;
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                Pair[] pairArr2 = new Pair[5];
                pairArr2[0] = TuplesKt.to("id", entry.getId());
                pairArr2[i] = TuplesKt.to("time", Long.valueOf(entry.getTime()));
                pairArr2[2] = TuplesKt.to("category", entry.getCategory());
                pairArr2[3] = TuplesKt.to("title", entry.getTitle());
                pairArr2[4] = TuplesKt.to(SettingsProtocol.EXTRA_OK, Boolean.valueOf(entry.getOk()));
                arrayList.add(JsonKt.jobj(pairArr2));
                i2 = i;
                feedbackHistory = feedbackHistory;
            }
            pairArr[0] = TuplesKt.to("items", (List) arrayList);
            FilesKt.writeText$default(file2, Json.stringify$default(json, JsonKt.jobj(pairArr), false, 2, null), null, 2, null);
            if (!file2.renameTo(file)) {
                FilesKt.writeText$default(file, FilesKt.readText$default(file2, null, i, null), null, 2, null);
                file2.delete();
            }
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        return list;
    }

    public final List<FeedbackRecord> toRows(List<Entry> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        List<Entry> list = entries;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Entry entry : list) {
            String str = (String) CollectionsKt.getOrNull(FeedbackLogic.INSTANCE.getKINDS(), FeedbackLogic.INSTANCE.getCATEGORY().indexOf(entry.getCategory()));
            if (str == null) {
                str = (String) CollectionsKt.last((List) FeedbackLogic.INSTANCE.getKINDS());
            }
            arrayList.add(new FeedbackRecord(entry.getTitle(), str, entry.getOk() ? "已提交" : "提交失败", FeedbackLogic.dateText$default(FeedbackLogic.INSTANCE, entry.getTime(), null, 2, null)));
        }
        return (List) arrayList;
    }
}
