package com.pymcl.android.data;

import androidx.autofill.HintConstants;
import com.pymcl.core.instance.ServerEntry;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

/* compiled from: MiscLogic.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0006\u0010\b\u001a\u00020\u0007J\u001e\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0014\u0010\u0017\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0002¨\u0006#"}, d2 = {"Lcom/pymcl/android/data/ServerLogic;", "", "<init>", "()V", "parse", "Lkotlin/Pair;", "Lcom/pymcl/core/instance/ServerEntry;", "", "input", "nameProblem", HintConstants.AUTOFILL_HINT_NAME, "others", "", "replaceVisible", "", "all", "oldName", "oldAddress", "newEntry", "importText", "Lcom/pymcl/android/data/ServerLogic$ImportResult;", TerracottaVpnService.EXTRA_TEXT, "existing", "exportText", "readLimited", "", "s", "Ljava/io/InputStream;", "limit", "", "needsSwitch", "", "pageInstance", "selectedInstance", "ImportResult", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class ServerLogic {
    public static final int $stable = 0;
    public static final ServerLogic INSTANCE = new ServerLogic();

    private ServerLogic() {
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<com.pymcl.core.instance.ServerEntry, java.lang.String> parse(java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.ServerLogic.parse(java.lang.String):kotlin.Pair");
    }

    public final String nameProblem(String name, Collection<String> others) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(others, "others");
        if (StringsKt.isBlank(name)) {
            return "名称不能为空";
        }
        Collection<String> collection = others;
        boolean z = false;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual((String) it.next(), StringsKt.trim((CharSequence) name).toString())) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            return null;
        }
        return "已有同名服务器「" + StringsKt.trim((CharSequence) name).toString() + "」";
    }

    public final List<ServerEntry> replaceVisible(List<ServerEntry> all, String oldName, String oldAddress, ServerEntry newEntry) {
        Intrinsics.checkNotNullParameter(all, "all");
        Intrinsics.checkNotNullParameter(oldName, "oldName");
        Intrinsics.checkNotNullParameter(oldAddress, "oldAddress");
        int i = 0;
        Iterator<ServerEntry> it = all.iterator();
        while (true) {
            if (it.hasNext()) {
                ServerEntry serverEntry = (ServerEntry) it.next();
                if (!serverEntry.getHidden() && Intrinsics.areEqual(serverEntry.getName(), oldName) && Intrinsics.areEqual(serverEntry.getAddress(), oldAddress)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return all;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) all);
        if (newEntry == null) {
            mutableList.remove(i);
        } else {
            mutableList.set(i, newEntry);
        }
        return mutableList;
    }

    /* compiled from: MiscLogic.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/pymcl/android/data/ServerLogic$ImportResult;", "", "added", "", "Lcom/pymcl/core/instance/ServerEntry;", "badLines", "", "duplicates", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "getAdded", "()Ljava/util/List;", "getBadLines", "getDuplicates", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ImportResult {
        public static final int $stable = 0;
        private final List<ServerEntry> added;
        private final List<Integer> badLines;
        private final int duplicates;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImportResult copy$default(ImportResult importResult, List list, List list2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = importResult.added;
            }
            if ((i2 & 2) != 0) {
                list2 = importResult.badLines;
            }
            if ((i2 & 4) != 0) {
                i = importResult.duplicates;
            }
            return importResult.copy(list, list2, i);
        }

        public final List<ServerEntry> component1() {
            return this.added;
        }

        public final List<Integer> component2() {
            return this.badLines;
        }

        /* renamed from: component3, reason: from getter */
        public final int getDuplicates() {
            return this.duplicates;
        }

        public final ImportResult copy(List<ServerEntry> added, List<Integer> badLines, int duplicates) {
            Intrinsics.checkNotNullParameter(added, "added");
            Intrinsics.checkNotNullParameter(badLines, "badLines");
            return new ImportResult(added, badLines, duplicates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImportResult)) {
                return false;
            }
            ImportResult importResult = (ImportResult) other;
            return Intrinsics.areEqual(this.added, importResult.added) && Intrinsics.areEqual(this.badLines, importResult.badLines) && this.duplicates == importResult.duplicates;
        }

        public int hashCode() {
            return (((this.added.hashCode() * 31) + this.badLines.hashCode()) * 31) + Integer.hashCode(this.duplicates);
        }

        public String toString() {
            return "ImportResult(added=" + this.added + ", badLines=" + this.badLines + ", duplicates=" + this.duplicates + ")";
        }

        public ImportResult(List<ServerEntry> added, List<Integer> badLines, int duplicates) {
            Intrinsics.checkNotNullParameter(added, "added");
            Intrinsics.checkNotNullParameter(badLines, "badLines");
            this.added = added;
            this.badLines = badLines;
            this.duplicates = duplicates;
        }

        public final List<ServerEntry> getAdded() {
            return this.added;
        }

        public final List<Integer> getBadLines() {
            return this.badLines;
        }

        public final int getDuplicates() {
            return this.duplicates;
        }
    }

    public final ImportResult importText(String text, List<ServerEntry> existing) {
        Iterable iterable;
        int i;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(existing, "existing");
        List<ServerEntry> list = existing;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String lowerCase = ((ServerEntry) it.next()).getAddress().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        Set seen = CollectionsKt.toMutableSet((List) arrayList);
        List<ServerEntry> list2 = existing;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ServerEntry) it2.next()).getName());
        }
        Set names = CollectionsKt.toMutableSet((List) arrayList2);
        List added = new ArrayList();
        List bad = new ArrayList();
        int dup = 0;
        Iterable iterableLines = StringsKt.lines(StringsKt.removePrefix(text, (CharSequence) "\ufeff"));
        int i2 = 0;
        int i3 = 0;
        for (Object obj : iterableLines) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String string = StringsKt.trim((CharSequence) obj).toString();
            if (string.length() == 0) {
                iterable = iterableLines;
                i = i2;
            } else {
                iterable = iterableLines;
                i = i2;
                int i5 = i3;
                if (!StringsKt.startsWith$default(string, "#", false, 2, (Object) null)) {
                    Pair<ServerEntry, String> pair = INSTANCE.parse(string);
                    ServerEntry serverEntryComponent1 = pair.component1();
                    String strComponent2 = pair.component2();
                    if (serverEntryComponent1 == null || strComponent2 != null) {
                        bad.add(Integer.valueOf(i5 + 1));
                    } else {
                        String lowerCase2 = serverEntryComponent1.getAddress().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        if (seen.add(lowerCase2)) {
                            String name = serverEntryComponent1.getName();
                            int i6 = 2;
                            while (names.contains(name)) {
                                name = serverEntryComponent1.getName() + " (" + i6 + ")";
                                i6++;
                                string = string;
                            }
                            names.add(name);
                            added.add(ServerEntry.copy$default(serverEntryComponent1, name, null, null, null, null, false, 62, null));
                        } else {
                            dup++;
                        }
                    }
                }
            }
            i3 = i4;
            iterableLines = iterable;
            i2 = i;
        }
        return new ImportResult(added, bad, dup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence exportText$lambda$2(ServerEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.replace$default(it.getName(), '|', IOUtils.DIR_SEPARATOR_UNIX, false, 4, (Object) null) + "|" + it.getAddress();
    }

    public final String exportText(List<ServerEntry> all) {
        Intrinsics.checkNotNullParameter(all, "all");
        Collection arrayList = new ArrayList();
        for (Object obj : all) {
            if (!((ServerEntry) obj).getHidden()) {
                arrayList.add(obj);
            }
        }
        Collection collection = (List) arrayList;
        String str = StringUtils.LF;
        List<ServerEntry> list = all;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((ServerEntry) it.next()).getHidden()) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            str = "";
        }
        return CollectionsKt.joinToString$default(collection, str, null, str, 0, null, new Function1() { // from class: com.pymcl.android.data.ServerLogic$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ServerLogic.exportText$lambda$2((ServerEntry) obj2);
            }
        }, 26, null);
    }

    public final byte[] readLimited(InputStream s, int limit) {
        int n;
        Intrinsics.checkNotNullParameter(s, "s");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[8192];
        while (out.size() < limit && (n = s.read(buf, 0, Math.min(buf.length, limit - out.size()))) > 0) {
            out.write(buf, 0, n);
        }
        byte[] byteArray = out.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final boolean needsSwitch(String pageInstance, String selectedInstance) {
        Intrinsics.checkNotNullParameter(pageInstance, "pageInstance");
        Intrinsics.checkNotNullParameter(selectedInstance, "selectedInstance");
        return (pageInstance.length() > 0) && !Intrinsics.areEqual(pageInstance, selectedInstance);
    }
}
