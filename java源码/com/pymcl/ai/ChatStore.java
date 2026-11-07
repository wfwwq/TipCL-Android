package com.pymcl.ai;

import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: ChatStore.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\fH\u0002J\"\u0010\r\u001a\u00020\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\fH\u0002J.\u0010\u0010\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011j\u0002`\u00122\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\fH\u0002J@\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nj\u0004\u0018\u0001`\f2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\f2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u000bJ&\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\f0\u00172\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bJ.\u0010 \u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000b2\u001e\u0010!\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\f0\u0017JK\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000b26\u0010!\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\f0#\"\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\f¢\u0006\u0002\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/pymcl/ai/ChatStore;", "", "file", "Ljava/io/File;", "clock", "Lkotlin/Function0;", "", "<init>", "(Ljava/io/File;Lkotlin/jvm/functions/Function0;)V", "load", "", "", "Lcom/pymcl/core/util/JObj;", "save", "", "m", "chats", "", "Lcom/pymcl/core/util/JArr;", "find", "id", "newId", "list", "", "Lcom/pymcl/ai/ChatInfo;", "activeId", "create", "setActive", "delete", "ensureActive", "messages", "title", "setMessages", "msgs", "append", "", "(Ljava/lang/String;[Ljava/util/Map;)Z", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatStore {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DEFAULT_TITLE = "新对话";
    public static final int MAX_MESSAGES = 200;
    public static final int TITLE_MAX = 40;
    private final Function0<Long> clock;
    private final File file;

    /* compiled from: ChatStore.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/pymcl/ai/ChatStore$Companion;", "", "<init>", "()V", "MAX_MESSAGES", "", "TITLE_MAX", "DEFAULT_TITLE", "", "titleFrom", TerracottaVpnService.EXTRA_TEXT, "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String titleFrom(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            String strTake = StringsKt.take(new Regex("\\s+").replace(StringsKt.trim((CharSequence) text).toString(), StringUtils.SPACE), 40);
            if (strTake.length() == 0) {
                strTake = ChatStore.DEFAULT_TITLE;
            }
            return strTake;
        }
    }

    public ChatStore(File file, Function0<Long> clock) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.file = file;
        this.clock = clock;
    }

    public /* synthetic */ ChatStore(File file, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? new Function0() { // from class: com.pymcl.ai.ChatStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(ChatStore._init_$lambda$0());
            }
        } : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$0() {
        return System.currentTimeMillis() / 1000;
    }

    private final Map<String, Object> load() {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ChatStore $this$load_u24lambda_u240 = this;
            objM8116constructorimpl = Result.m8116constructorimpl(FileUtil.INSTANCE.readJsonObj($this$load_u24lambda_u240.file));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        Map<String, Object> map = (Map) objM8116constructorimpl;
        return map == null ? JsonKt.jobj(TuplesKt.to("active_id", null), TuplesKt.to("chats", new ArrayList())) : map;
    }

    private final boolean save(Map<String, Object> m) {
        return FileUtil.INSTANCE.writeJson(this.file, m);
    }

    private final List<Object> chats(Map<String, Object> m) {
        List<Object> listArr = JsonKt.arr(m, "chats");
        if (listArr != null) {
            return listArr;
        }
        ArrayList arrayList = new ArrayList();
        m.put("chats", arrayList);
        return arrayList;
    }

    private final Map<String, Object> find(Map<String, Object> m, String id) {
        Object element$iv;
        Iterable $this$firstOrNull$iv = JsonKt.objs(chats(m));
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (it.hasNext()) {
                element$iv = it.next();
                Map it2 = (Map) element$iv;
                if (Intrinsics.areEqual(JsonKt.str(it2, "id"), id)) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        return (Map) element$iv;
    }

    private final String newId() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.take(StringsKt.replace$default(string, "-", "", false, 4, (Object) null), 12);
    }

    public final List<ChatInfo> list() {
        List<ChatInfo> listSortedWith;
        synchronized (this) {
            int i = 0;
            Iterable $this$map$iv = JsonKt.objs(chats(load()));
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                Map it = (Map) item$iv$iv;
                String str = JsonKt.str(it, "id");
                if (str == null) {
                    str = "";
                }
                String str2 = JsonKt.str(it, "title");
                if (str2 == null) {
                    str2 = DEFAULT_TITLE;
                }
                Long lM8043long = JsonKt.m8043long(it, "updated");
                long jLongValue = lM8043long != null ? lM8043long.longValue() : 0L;
                int i2 = i;
                List<Object> listArr = JsonKt.arr(it, "messages");
                destination$iv$iv.add(new ChatInfo(str, str2, jLongValue, listArr != null ? listArr.size() : 0));
                i = i2;
            }
            Iterable $this$sortedByDescending$iv = (List) destination$iv$iv;
            listSortedWith = CollectionsKt.sortedWith($this$sortedByDescending$iv, new Comparator() { // from class: com.pymcl.ai.ChatStore$list$lambda$0$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    ChatInfo it2 = (ChatInfo) t2;
                    ChatInfo it3 = (ChatInfo) t;
                    return ComparisonsKt.compareValues(Long.valueOf(it2.getUpdated()), Long.valueOf(it3.getUpdated()));
                }
            });
        }
        return listSortedWith;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String activeId() {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            java.util.Map r1 = r6.load()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "active_id"
            java.lang.String r1 = com.pymcl.core.util.JsonKt.str(r1, r2)     // Catch: java.lang.Throwable -> L23
            r2 = 0
            if (r1 == 0) goto L20
            r3 = r1
            r4 = 0
            r5 = r3
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L23
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L23
            if (r5 <= 0) goto L1c
            r5 = 1
            goto L1d
        L1c:
            r5 = 0
        L1d:
            if (r5 == 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            monitor-exit(r6)
            return r1
        L23:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.ChatStore.activeId():java.lang.String");
    }

    public final String create() {
        String id;
        synchronized (this) {
            Map m = load();
            id = newId();
            chats(m).add(0, JsonKt.jobj(TuplesKt.to("id", id), TuplesKt.to("title", DEFAULT_TITLE), TuplesKt.to("updated", this.clock.invoke()), TuplesKt.to("messages", new ArrayList())));
            m.put("active_id", id);
            save(m);
        }
        return id;
    }

    public final boolean setActive(String id) {
        boolean z;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this) {
            Map m = load();
            if (find(m, id) == null) {
                z = false;
            } else {
                m.put("active_id", id);
                save(m);
                z = true;
            }
        }
        return z;
    }

    public final boolean delete(final String id) {
        boolean zSave;
        Object maxElem$iv;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this) {
            Map m = load();
            CollectionsKt.removeAll((List) chats(m), new Function1() { // from class: com.pymcl.ai.ChatStore$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ChatStore.delete$lambda$0$0(id, obj));
                }
            });
            if (Intrinsics.areEqual(JsonKt.str(m, "active_id"), id)) {
                Iterable $this$maxByOrNull$iv = JsonKt.objs(chats(m));
                Iterator iterator$iv = $this$maxByOrNull$iv.iterator();
                if (iterator$iv.hasNext()) {
                    maxElem$iv = iterator$iv.next();
                    if (iterator$iv.hasNext()) {
                        Map it = (Map) maxElem$iv;
                        Long lM8043long = JsonKt.m8043long(it, "updated");
                        long maxValue$iv = lM8043long != null ? lM8043long.longValue() : 0L;
                        do {
                            Object e$iv = iterator$iv.next();
                            Map it2 = (Map) e$iv;
                            Long lM8043long2 = JsonKt.m8043long(it2, "updated");
                            long v$iv = lM8043long2 != null ? lM8043long2.longValue() : 0L;
                            if (maxValue$iv < v$iv) {
                                maxElem$iv = e$iv;
                                maxValue$iv = v$iv;
                            }
                        } while (iterator$iv.hasNext());
                    }
                } else {
                    maxElem$iv = null;
                }
                Map map = (Map) maxElem$iv;
                m.put("active_id", map != null ? JsonKt.str(map, "id") : null);
            }
            zSave = save(m);
        }
        return zSave;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean delete$lambda$0$0(String $id, Object it) {
        Map<String, Object> mapO = JsonKt.o(it);
        return Intrinsics.areEqual(mapO != null ? JsonKt.str(mapO, "id") : null, $id);
    }

    public final String ensureActive() {
        String id;
        synchronized (this) {
            id = activeId();
            if (id != null) {
                if (!(find(load(), id) != null)) {
                    id = null;
                }
                if (id == null) {
                }
            }
            id = create();
        }
        return id;
    }

    public final List<Map<String, Object>> messages(String id) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this) {
            Map<String, Object> mapFind = find(load(), id);
            Iterable $this$map$iv = JsonKt.objs(mapFind != null ? JsonKt.arr(mapFind, "messages") : null);
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                Map it = (Map) item$iv$iv;
                Map<String, Object> mapO = JsonKt.o(JsonKt.deepCopy(it));
                Intrinsics.checkNotNull(mapO);
                destination$iv$iv.add(mapO);
            }
            arrayList = (List) destination$iv$iv;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String title(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            monitor-enter(r3)
            r0 = 0
            java.util.Map r1 = r3.load()     // Catch: java.lang.Throwable -> L1d
            java.util.Map r1 = r3.find(r1, r4)     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L19
            java.lang.String r2 = "title"
            java.lang.String r1 = com.pymcl.core.util.JsonKt.str(r1, r2)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1b
        L19:
            java.lang.String r1 = "新对话"
        L1b:
            monitor-exit(r3)
            return r1
        L1d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.ChatStore.title(java.lang.String):java.lang.String");
    }

    public final boolean setMessages(String id, List<? extends Map<String, Object>> msgs) {
        boolean zSave;
        Object element$iv;
        String it;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(msgs, "msgs");
        synchronized (this) {
            Map m = load();
            Map it2 = find(m, id);
            if (it2 == null) {
                it2 = JsonKt.jobj(TuplesKt.to("id", id), TuplesKt.to("title", DEFAULT_TITLE));
                chats(m).add(0, it2);
            }
            List tail = CollectionsKt.takeLast(msgs, 200);
            while (!tail.isEmpty() && Intrinsics.areEqual(JsonKt.str((Map) CollectionsKt.first(tail), "role"), "tool")) {
                tail = CollectionsKt.drop(tail, 1);
            }
            Iterable $this$map$iv = tail;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                destination$iv$iv.add((Map) item$iv$iv);
            }
            it2.put("messages", CollectionsKt.toMutableList(destination$iv$iv));
            it2.put("updated", this.clock.invoke());
            String str = JsonKt.str(it2, "title");
            if (str == null) {
                str = DEFAULT_TITLE;
            }
            if (Intrinsics.areEqual(str, DEFAULT_TITLE)) {
                List<? extends Map<String, Object>> $this$firstOrNull$iv = msgs;
                Iterator it3 = $this$firstOrNull$iv.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        element$iv = null;
                        break;
                    }
                    element$iv = it3.next();
                    Map it4 = (Map) element$iv;
                    if (((!Intrinsics.areEqual(JsonKt.str(it4, "role"), "user") || Intrinsics.areEqual(it4.get("hidden"), (Object) true)) ? null : 1) != null) {
                        break;
                    }
                }
                Map map = (Map) element$iv;
                if (map != null && (it = JsonKt.str(map, "content")) != null) {
                    it2.put("title", INSTANCE.titleFrom(it));
                }
            }
            zSave = save(m);
        }
        return zSave;
    }

    public final boolean append(String id, Map<String, Object>... msgs) {
        boolean messages;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(msgs, "msgs");
        synchronized (this) {
            messages = setMessages(id, CollectionsKt.plus((Collection) messages(id), (Object[]) msgs));
        }
        return messages;
    }
}
