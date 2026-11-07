package com.pymcl.runtime.settings;

import androidx.core.app.NotificationCompat;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SettingsCore.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001/B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007JB\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0018H\u0002J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\nJ\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u001f\u001a\u00020\u0013J\u0010\u0010 \u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\nJ\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\"2\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00110\u0010J\u0012\u0010$\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\nH\u0002J\u000e\u0010%\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\nJ\u0016\u0010&\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0013J\u001a\u0010(\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\nJ\u0016\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010'\u001a\u00020*J\u0016\u0010+\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010'\u001a\u00020,J\u0016\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010'\u001a\u00020.R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u00060"}, d2 = {"Lcom/pymcl/runtime/settings/SettingsClient;", "", NotificationCompat.CATEGORY_TRANSPORT, "Lcom/pymcl/runtime/settings/SettingsTransport;", "fallback", "Lcom/pymcl/runtime/settings/RawStore;", "<init>", "(Lcom/pymcl/runtime/settings/SettingsTransport;Lcom/pymcl/runtime/settings/RawStore;)V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/pymcl/runtime/settings/SettingsClient$Cached;", "generation", "Ljava/util/concurrent/atomic/AtomicLong;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "", "value", "", "remoteOk", "getRemoteOk", "()Z", "remote", "", "method", "arg", "extras", "read", "key", "write", "preload", "onRemoteChanged", "addListener", "Lkotlin/Function0;", "l", "fire", "isCached", "getBoolean", "def", "getString", "getInt", "", "getLong", "", "getFloat", "", "Cached", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SettingsClient {
    private final ConcurrentHashMap<String, Cached> cache;
    private final RawStore fallback;
    private final AtomicLong generation;
    private final CopyOnWriteArrayList<Function1<String, Unit>> listeners;
    private volatile boolean remoteOk;
    private final SettingsTransport transport;

    /* compiled from: SettingsCore.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/pymcl/runtime/settings/SettingsClient$Cached;", "", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    private static final class Cached {
        private final Object value;

        public Cached(Object value) {
            this.value = value;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    public SettingsClient(SettingsTransport transport, RawStore fallback) {
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        this.transport = transport;
        this.fallback = fallback;
        this.cache = new ConcurrentHashMap<>();
        this.generation = new AtomicLong();
        this.listeners = new CopyOnWriteArrayList<>();
        this.remoteOk = this.transport != null;
    }

    public final boolean getRemoteOk() {
        return this.remoteOk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Map remote$default(SettingsClient settingsClient, String str, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return settingsClient.remote(str, str2, map);
    }

    private final Map<String, String> remote(String method, String arg, Map<String, String> extras) {
        Map r = null;
        if (this.transport != null) {
            try {
                r = this.transport.call(method, arg, extras);
            } catch (Throwable th) {
            }
        }
        this.remoteOk = r != null;
        return r;
    }

    public final Object read(String key) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Cached it = this.cache.get(key);
        if (it != null) {
            return it.getValue();
        }
        long gen = this.generation.get();
        Map r = remote$default(this, SettingsProtocol.GET, key, null, 4, null);
        if (r == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                SettingsClient $this$read_u24lambda_u241 = this;
                objM8116constructorimpl = Result.m8116constructorimpl($this$read_u24lambda_u241.fallback.read(key));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                return null;
            }
            return objM8116constructorimpl;
        }
        Object v = Intrinsics.areEqual(r.get(SettingsProtocol.EXTRA_EXISTS), "1") ? PrefCodec.INSTANCE.decode((String) r.get(SettingsProtocol.EXTRA_VALUE)) : null;
        if (this.generation.get() == gen) {
            this.cache.put(key, new Cached(v));
        }
        return v;
    }

    public final boolean write(String key, Object value) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        String enc = PrefCodec.INSTANCE.encode(value);
        Map extras = enc == null ? MapsKt.emptyMap() : MapsKt.mapOf(TuplesKt.to(SettingsProtocol.EXTRA_VALUE, enc));
        Map r = remote(SettingsProtocol.PUT, key, extras);
        boolean viaProvider = r != null && Intrinsics.areEqual(r.get(SettingsProtocol.EXTRA_OK), "1");
        this.generation.incrementAndGet();
        if (viaProvider) {
            this.cache.put(key, new Cached(value));
        } else {
            this.cache.remove(key);
            try {
                Result.Companion companion = Result.INSTANCE;
                SettingsClient $this$write_u24lambda_u240 = this;
                $this$write_u24lambda_u240.fallback.write(key, value);
                objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            Result.m8115boximpl(objM8116constructorimpl);
        }
        fire(key);
        return viaProvider;
    }

    public final boolean preload() {
        long gen = this.generation.get();
        Map r = remote$default(this, SettingsProtocol.GET_ALL, null, null, 4, null);
        if (r == null) {
            return false;
        }
        if (this.generation.get() != gen) {
            return true;
        }
        for (Map.Entry entry : r.entrySet()) {
            String k = (String) entry.getKey();
            String enc = (String) entry.getValue();
            if (StringsKt.startsWith$default(k, SettingsProtocol.ALL_PREFIX, false, 2, (Object) null)) {
                String key = StringsKt.removePrefix(k, (CharSequence) SettingsProtocol.ALL_PREFIX);
                this.cache.putIfAbsent(key, new Cached(PrefCodec.INSTANCE.decode(enc)));
            }
        }
        return true;
    }

    public final void onRemoteChanged(String key) {
        this.generation.incrementAndGet();
        ConcurrentHashMap<String, Cached> concurrentHashMap = this.cache;
        if (key == null) {
            concurrentHashMap.clear();
        } else {
            concurrentHashMap.remove(key);
        }
        fire(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$0(SettingsClient this$0, Function1 $l) {
        this$0.listeners.remove($l);
        return Unit.INSTANCE;
    }

    public final Function0<Unit> addListener(final Function1<? super String, Unit> l) {
        Intrinsics.checkNotNullParameter(l, "l");
        this.listeners.add(l);
        return new Function0() { // from class: com.pymcl.runtime.settings.SettingsClient$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsClient.addListener$lambda$0(this.f$0, l);
            }
        };
    }

    private final void fire(String key) {
        Iterator<Function1<String, Unit>> it = this.listeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Function1 l = it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                SettingsClient settingsClient = this;
                l.invoke(key);
                Result.m8116constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    public final boolean isCached(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.cache.containsKey(key);
    }

    public final boolean getBoolean(String key, boolean def) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = read(key);
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        return bool != null ? bool.booleanValue() : def;
    }

    public final String getString(String key, String def) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = read(key);
        String str = obj instanceof String ? (String) obj : null;
        return str == null ? def : str;
    }

    public final int getInt(String key, int def) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = read(key);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        return num != null ? num.intValue() : def;
    }

    public final long getLong(String key, long def) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = read(key);
        Long l = obj instanceof Long ? (Long) obj : null;
        return l != null ? l.longValue() : def;
    }

    public final float getFloat(String key, float def) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = read(key);
        Float f = obj instanceof Float ? (Float) obj : null;
        return f != null ? f.floatValue() : def;
    }
}
