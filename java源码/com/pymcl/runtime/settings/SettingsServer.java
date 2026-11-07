package com.pymcl.runtime.settings;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsCore.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/pymcl/runtime/settings/SettingsServer;", "", "store", "Lcom/pymcl/runtime/settings/RawStore;", "<init>", "(Lcom/pymcl/runtime/settings/RawStore;)V", "handle", "Lcom/pymcl/runtime/settings/SettingsServer$Result;", "method", "", "arg", "extras", "", "Result", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SettingsServer {
    private final RawStore store;

    /* compiled from: SettingsCore.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0004HÖ\u0081\u0004R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/pymcl/runtime/settings/SettingsServer$Result;", "", "response", "", "", "changedKey", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getResponse", "()Ljava/util/Map;", "getChangedKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Result {
        private final String changedKey;
        private final Map<String, String> response;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Result copy$default(Result result, Map map, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                map = result.response;
            }
            if ((i & 2) != 0) {
                str = result.changedKey;
            }
            return result.copy(map, str);
        }

        public final Map<String, String> component1() {
            return this.response;
        }

        /* renamed from: component2, reason: from getter */
        public final String getChangedKey() {
            return this.changedKey;
        }

        public final Result copy(Map<String, String> response, String changedKey) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new Result(response, changedKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.response, result.response) && Intrinsics.areEqual(this.changedKey, result.changedKey);
        }

        public int hashCode() {
            return (this.response.hashCode() * 31) + (this.changedKey == null ? 0 : this.changedKey.hashCode());
        }

        public String toString() {
            return "Result(response=" + this.response + ", changedKey=" + this.changedKey + ")";
        }

        public Result(Map<String, String> response, String changedKey) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.response = response;
            this.changedKey = changedKey;
        }

        public /* synthetic */ Result(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, (i & 2) != 0 ? null : str);
        }

        public final String getChangedKey() {
            return this.changedKey;
        }

        public final Map<String, String> getResponse() {
            return this.response;
        }
    }

    public SettingsServer(RawStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.store = store;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Result handle(String method, String arg, Map<String, String> extras) {
        Object objM8116constructorimpl;
        Object objM8116constructorimpl2;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(extras, "extras");
        int i = 2;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        switch (method.hashCode()) {
            case -1249367445:
                if (method.equals(SettingsProtocol.GET_ALL)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : this.store.readAll().entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        try {
                            Result.Companion companion = kotlin.Result.INSTANCE;
                            SettingsServer settingsServer = this;
                            objM8116constructorimpl = kotlin.Result.m8116constructorimpl(PrefCodec.INSTANCE.encode(value));
                        } catch (Throwable th) {
                            Result.Companion companion2 = kotlin.Result.INSTANCE;
                            objM8116constructorimpl = kotlin.Result.m8116constructorimpl(ResultKt.createFailure(th));
                        }
                        if (kotlin.Result.m8122isFailureimpl(objM8116constructorimpl)) {
                            objM8116constructorimpl = null;
                        }
                        String str2 = (String) objM8116constructorimpl;
                        if (str2 != null) {
                            linkedHashMap.put(SettingsProtocol.ALL_PREFIX + key, str2);
                        }
                    }
                    return new Result(linkedHashMap, objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
                }
                break;
            case 102230:
                if (method.equals(SettingsProtocol.GET)) {
                    String str3 = arg;
                    if ((str3 == null || str3.length() == 0) == true) {
                        return new Result(MapsKt.mapOf(TuplesKt.to(SettingsProtocol.EXTRA_EXISTS, "0")), objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0);
                    }
                    try {
                        Result.Companion companion3 = kotlin.Result.INSTANCE;
                        objM8116constructorimpl2 = kotlin.Result.m8116constructorimpl(PrefCodec.INSTANCE.encode(this.store.read(arg)));
                    } catch (Throwable th2) {
                        Result.Companion companion4 = kotlin.Result.INSTANCE;
                        objM8116constructorimpl2 = kotlin.Result.m8116constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (kotlin.Result.m8122isFailureimpl(objM8116constructorimpl2)) {
                        objM8116constructorimpl2 = null;
                    }
                    String str4 = (String) objM8116constructorimpl2;
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = TuplesKt.to(SettingsProtocol.EXTRA_EXISTS, str4 == null ? "0" : "1");
                    pairArr[1] = TuplesKt.to(SettingsProtocol.EXTRA_VALUE, str4);
                    return new Result(MapsKt.mapOf(pairArr), objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0);
                }
                break;
            case 111375:
                if (method.equals(SettingsProtocol.PUT)) {
                    String str5 = arg;
                    if (str5 == null || str5.length() == 0) {
                        return new Result(MapsKt.mapOf(TuplesKt.to(SettingsProtocol.EXTRA_OK, "0")), str, i, objArr11 == true ? 1 : 0);
                    }
                    if (!extras.containsKey(SettingsProtocol.EXTRA_VALUE) || extras.get(SettingsProtocol.EXTRA_VALUE) == null) {
                        this.store.write(arg, null);
                        return new Result(MapsKt.mapOf(TuplesKt.to(SettingsProtocol.EXTRA_OK, "1")), arg);
                    }
                    Object objDecode = PrefCodec.INSTANCE.decode(extras.get(SettingsProtocol.EXTRA_VALUE));
                    if (objDecode == null) {
                        return new Result(MapsKt.mapOf(TuplesKt.to(SettingsProtocol.EXTRA_OK, "0")), objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0);
                    }
                    this.store.write(arg, objDecode);
                    return new Result(MapsKt.mapOf(TuplesKt.to(SettingsProtocol.EXTRA_OK, "1")), arg);
                }
                break;
        }
        return new Result(MapsKt.mapOf(TuplesKt.to(SettingsProtocol.EXTRA_OK, "0")), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
    }
}
