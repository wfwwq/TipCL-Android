package com.pymcl.runtime.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.pymcl.runtime.input.PrefIO;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrossProcessPrefs.kt */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0012\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001bH\u0016J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020 J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\"J\u0006\u0010#\u001a\u00020\u001bJ\"\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180%2\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00180'R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006)"}, d2 = {"Lcom/pymcl/runtime/settings/CrossProcessPrefs;", "Lcom/pymcl/runtime/input/PrefIO;", "ctx", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "app", "authority", "", "baseUri", "Landroid/net/Uri;", NotificationCompat.CATEGORY_TRANSPORT, "Lcom/pymcl/runtime/settings/SettingsTransport;", "client", "Lcom/pymcl/runtime/settings/SettingsClient;", "getClient", "()Lcom/pymcl/runtime/settings/SettingsClient;", "observer", "com/pymcl/runtime/settings/CrossProcessPrefs$observer$1", "Lcom/pymcl/runtime/settings/CrossProcessPrefs$observer$1;", "getString", "key", "def", "putString", "", "value", "getBoolean", "", "putBoolean", "getInt", "", "getLong", "", SettingsProtocol.PUT, "", "preload", "addListener", "Lkotlin/Function0;", "l", "Lkotlin/Function1;", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CrossProcessPrefs implements PrefIO {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "PyMCL-Settings";
    private static volatile CrossProcessPrefs instance;
    private final Context app;
    private final String authority;
    private final Uri baseUri;
    private final SettingsClient client;
    private final CrossProcessPrefs$observer$1 observer;
    private final SettingsTransport transport;

    public /* synthetic */ CrossProcessPrefs(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.pymcl.runtime.settings.CrossProcessPrefs$observer$1] */
    private CrossProcessPrefs(Context ctx) {
        boolean registered;
        SettingsTransport settingsTransport;
        Context applicationContext = ctx.getApplicationContext();
        this.app = applicationContext == null ? ctx : applicationContext;
        SettingsProtocol settingsProtocol = SettingsProtocol.INSTANCE;
        String packageName = this.app.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.authority = settingsProtocol.authority(packageName);
        Uri uri = Uri.parse("content://" + this.authority + "/prefs");
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        this.baseUri = uri;
        final CrossProcessPrefs $this$transport_u24lambda_u240 = this;
        try {
            registered = $this$transport_u24lambda_u240.app.getPackageManager().resolveContentProvider($this$transport_u24lambda_u240.authority, 0) != null;
        } catch (Throwable th) {
            registered = false;
        }
        if (!registered) {
            Log.w(TAG, "provider " + $this$transport_u24lambda_u240.authority + " not registered, using local SharedPreferences");
            settingsTransport = null;
        } else {
            settingsTransport = new SettingsTransport() { // from class: com.pymcl.runtime.settings.CrossProcessPrefs$$ExternalSyntheticLambda0
                @Override // com.pymcl.runtime.settings.SettingsTransport
                public final Map call(String str, String str2, Map map) {
                    return CrossProcessPrefs.transport$lambda$0$0(this.f$0, str, str2, map);
                }
            };
        }
        this.transport = settingsTransport;
        SettingsTransport settingsTransport2 = this.transport;
        SharedPreferences sharedPreferences = this.app.getSharedPreferences("launcher", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.client = new SettingsClient(settingsTransport2, new SharedPrefsStore(sharedPreferences));
        this.observer = new ContentObserver() { // from class: com.pymcl.runtime.settings.CrossProcessPrefs$observer$1
            {
                super(null);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange) {
                this.this$0.getClient().onRemoteChanged(null);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, Uri uri2) {
                this.this$0.getClient().onRemoteChanged(SettingsProtocol.INSTANCE.keyFromSegments(uri2 != null ? uri2.getPathSegments() : null));
            }
        };
        if (this.transport == null) {
            return;
        }
        try {
            this.app.getContentResolver().registerContentObserver(this.baseUri, true, this.observer);
        } catch (Throwable t) {
            Log.w(TAG, "registerContentObserver", t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map transport$lambda$0$0(CrossProcessPrefs $this_run, String method, String arg, Map extras) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Bundle b = new Bundle();
        for (Map.Entry entry : extras.entrySet()) {
            String k = (String) entry.getKey();
            String v = (String) entry.getValue();
            b.putString(k, v);
        }
        Bundle r = $this_run.app.getContentResolver().call($this_run.baseUri, method, arg, b);
        if (r == null) {
            return null;
        }
        HashMap $this$transport_u24lambda_u240_u240_u241 = new HashMap();
        for (String k2 : r.keySet()) {
            $this$transport_u24lambda_u240_u240_u241.put(k2, r.getString(k2));
        }
        return $this$transport_u24lambda_u240_u240_u241;
    }

    public final SettingsClient getClient() {
        return this.client;
    }

    @Override // com.pymcl.runtime.input.PrefIO
    public String getString(String key, String def) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.client.getString(key, def);
    }

    @Override // com.pymcl.runtime.input.PrefIO
    public void putString(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.client.write(key, value);
    }

    @Override // com.pymcl.runtime.input.PrefIO
    public boolean getBoolean(String key, boolean def) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.client.getBoolean(key, def);
    }

    @Override // com.pymcl.runtime.input.PrefIO
    public void putBoolean(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.client.write(key, Boolean.valueOf(value));
    }

    public final int getInt(String key, int def) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.client.getInt(key, def);
    }

    public final long getLong(String key, long def) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.client.getLong(key, def);
    }

    public final boolean put(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.client.write(key, value);
    }

    public final boolean preload() {
        return this.client.preload();
    }

    public final Function0<Unit> addListener(Function1<? super String, Unit> l) {
        Intrinsics.checkNotNullParameter(l, "l");
        return this.client.addListener(l);
    }

    /* compiled from: CrossProcessPrefs.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007b\u0002\b\u000bJ\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007b\u0002\b\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/pymcl/runtime/settings/CrossProcessPrefs;", SettingsProtocol.GET, "ctx", "Landroid/content/Context;", "Lkotlin/jvm/JvmStatic;", "keyUri", "Landroid/net/Uri;", "applicationId", "key", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CrossProcessPrefs get(Context ctx) {
            CrossProcessPrefs it;
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            CrossProcessPrefs crossProcessPrefs = CrossProcessPrefs.instance;
            if (crossProcessPrefs != null) {
                return crossProcessPrefs;
            }
            synchronized (this) {
                it = CrossProcessPrefs.instance;
                if (it == null) {
                    it = new CrossProcessPrefs(ctx, null);
                    Companion companion = CrossProcessPrefs.INSTANCE;
                    CrossProcessPrefs.instance = it;
                }
            }
            return it;
        }

        @JvmStatic
        public final Uri keyUri(String applicationId, String key) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(key, "key");
            Uri uriBuild = new Uri.Builder().scheme("content").authority(SettingsProtocol.INSTANCE.authority(applicationId)).appendPath(SettingsProtocol.PATH).appendPath(key).build();
            Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
            return uriBuild;
        }
    }

    @JvmStatic
    public static final CrossProcessPrefs get(Context ctx) {
        return INSTANCE.get(ctx);
    }

    @JvmStatic
    public static final Uri keyUri(String applicationId, String key) {
        return INSTANCE.keyUri(applicationId, key);
    }
}
