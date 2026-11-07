package com.pymcl.runtime.settings;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.pymcl.runtime.settings.CrossProcessPrefs;
import com.pymcl.runtime.settings.SettingsServer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LauncherSettingsProvider.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0016JO\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0010\u0010\u001b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0010\u0010\u001e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J1\u0010%\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0010\u0010\u001e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u001cH\u0016¢\u0006\u0002\u0010'J;\u0010(\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0010\u0010\u001e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u001cH\u0016¢\u0006\u0002\u0010)R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006*"}, d2 = {"Lcom/pymcl/runtime/settings/LauncherSettingsProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", SettingsProtocol.PATH, "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "server", "Lcom/pymcl/runtime/settings/SettingsServer;", "getServer", "()Lcom/pymcl/runtime/settings/SettingsServer;", "server$delegate", "onCreate", "", NotificationCompat.CATEGORY_CALL, "Landroid/os/Bundle;", "method", "", "arg", "extras", "query", "Landroid/database/Cursor;", "uri", "Landroid/net/Uri;", "projection", "", "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "insert", "values", "Landroid/content/ContentValues;", "delete", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LauncherSettingsProvider extends ContentProvider {

    /* renamed from: prefs$delegate, reason: from kotlin metadata */
    private final Lazy prefs = LazyKt.lazy(new Function0() { // from class: com.pymcl.runtime.settings.LauncherSettingsProvider$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LauncherSettingsProvider.prefs_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: server$delegate, reason: from kotlin metadata */
    private final Lazy server = LazyKt.lazy(new Function0() { // from class: com.pymcl.runtime.settings.LauncherSettingsProvider$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LauncherSettingsProvider.server_delegate$lambda$0(this.f$0);
        }
    });

    private final SharedPreferences getPrefs() {
        Object value = this.prefs.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences prefs_delegate$lambda$0(LauncherSettingsProvider this$0) {
        Context context = this$0.getContext();
        Intrinsics.checkNotNull(context);
        return context.getSharedPreferences("launcher", 0);
    }

    private final SettingsServer getServer() {
        return (SettingsServer) this.server.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SettingsServer server_delegate$lambda$0(LauncherSettingsProvider this$0) {
        return new SettingsServer(new SharedPrefsStore(this$0.getPrefs()));
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Bundle call(String method, String arg, Bundle extras) {
        SettingsServer.Result res;
        Context ctx;
        Iterable iterableKeySet;
        Intrinsics.checkNotNullParameter(method, "method");
        HashMap req = new HashMap();
        if (extras != null && (iterableKeySet = extras.keySet()) != null) {
            Iterable $this$forEach$iv = iterableKeySet;
            for (Object element$iv : $this$forEach$iv) {
                String k = (String) element$iv;
                req.put(k, extras.getString(k));
            }
        }
        synchronized (this) {
            res = getServer().handle(method, arg, req);
        }
        String key = res.getChangedKey();
        if (key != null && (ctx = getContext()) != null) {
            try {
                ContentResolver contentResolver = ctx.getContentResolver();
                CrossProcessPrefs.Companion companion = CrossProcessPrefs.INSTANCE;
                String packageName = ctx.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                contentResolver.notifyChange(companion.keyUri(packageName, key), null);
            } catch (Throwable t) {
                Log.w("PyMCL-Settings", "notifyChange", t);
            }
        }
        Bundle $this$call_u24lambda_u243 = new Bundle();
        for (Map.Entry<String, String> entry : res.getResponse().entrySet()) {
            String k2 = entry.getKey();
            String v = entry.getValue();
            $this$call_u24lambda_u243.putString(k2, v);
        }
        return $this$call_u24lambda_u243;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
