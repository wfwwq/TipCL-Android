package com.pymcl.multiplayer;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.pymcl.multiplayer.MultiplayerState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.burningtnt.terracotta.TerracottaAndroidAPI;

/* compiled from: TerracottaVpnService.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/pymcl/multiplayer/TerracottaVpnService;", "Landroid/net/VpnService;", "<init>", "()V", "tun", "Landroid/os/ParcelFileDescriptor;", TerracottaVpnService.EXTRA_TEXT, "", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "notif", "Landroid/app/Notification;", "onRevoke", "", "onDestroy", "cleanup", "Companion", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TerracottaVpnService extends VpnService {
    public static final String ACTION_START = "com.pymcl.multiplayer.START";
    public static final String ACTION_STOP = "com.pymcl.multiplayer.STOP";
    public static final String ACTION_UPDATE = "com.pymcl.multiplayer.UPDATE";
    private static final String CHANNEL = "terracotta_vpn";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EXTRA_TEXT = "text";
    private static final int NID = 32324;
    private static volatile boolean running;
    private String text = "正在连接…";
    private ParcelFileDescriptor tun;

    /* compiled from: TerracottaVpnService.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;", "", "<init>", "()V", "CHANNEL", "", "NID", "", "ACTION_START", "ACTION_STOP", "ACTION_UPDATE", "EXTRA_TEXT", "value", "", "running", "getRunning", "()Z", "start", "Landroid/content/ComponentName;", "c", "Landroid/content/Context;", "stop", "", "updateText", "s", "Lcom/pymcl/multiplayer/MultiplayerState;", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getRunning() {
            return TerracottaVpnService.running;
        }

        public final ComponentName start(Context c) {
            Intrinsics.checkNotNullParameter(c, "c");
            return c.startForegroundService(new Intent(c, (Class<?>) TerracottaVpnService.class).setAction(TerracottaVpnService.ACTION_START));
        }

        public final void stop(Context c) {
            Intrinsics.checkNotNullParameter(c, "c");
            if (getRunning()) {
                c.startService(new Intent(c, (Class<?>) TerracottaVpnService.class).setAction(TerracottaVpnService.ACTION_STOP));
            }
        }

        public final void updateText(Context c, MultiplayerState s) {
            String t;
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(s, "s");
            if (getRunning()) {
                if (s instanceof MultiplayerState.HostOk) {
                    t = "已启动房间 " + ((MultiplayerState.HostOk) s).getRoom();
                } else if (s instanceof MultiplayerState.GuestOk) {
                    t = "已加入房间";
                } else {
                    t = s instanceof MultiplayerState.Error ? ((MultiplayerState.Error) s).getMessage() : s.getClass().getSimpleName();
                }
                c.startService(new Intent(c, (Class<?>) TerracottaVpnService.class).setAction(TerracottaVpnService.ACTION_UPDATE).putExtra(TerracottaVpnService.EXTRA_TEXT, t));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        Unit unit;
        if (intent == null) {
            stopSelf();
            return 2;
        }
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -857861116:
                    if (action.equals(ACTION_STOP)) {
                        cleanup();
                        stopForeground(1);
                        stopSelf();
                        return 2;
                    }
                    break;
                case 282413131:
                    if (action.equals(ACTION_UPDATE)) {
                        String stringExtra = intent.getStringExtra(EXTRA_TEXT);
                        if (stringExtra == null) {
                            stringExtra = this.text;
                        }
                        this.text = stringExtra;
                        ((NotificationManager) getSystemService(NotificationManager.class)).notify(NID, notif());
                        return 1;
                    }
                    break;
            }
        }
        running = true;
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel(CHANNEL, "陶瓦联机", 2));
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(NID, notif(), 16);
        } else {
            startForeground(NID, notif());
        }
        try {
            VpnService.Builder b = new VpnService.Builder(this).setSession("Terracotta Connection");
            Intrinsics.checkNotNullExpressionValue(b, "setSession(...)");
            try {
                Result.Companion companion = Result.INSTANCE;
                TerracottaVpnService $this$onStartCommand_u24lambda_u240 = this;
                Result.m8116constructorimpl(b.addDisallowedApplication($this$onStartCommand_u24lambda_u240.getPackageName()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            ParcelFileDescriptor old = this.tun;
            this.tun = TerracottaAndroidAPI.getPendingVpnServiceRequest().startVpnService(b);
            try {
                Result.Companion companion3 = Result.INSTANCE;
                TerracottaVpnService terracottaVpnService = this;
                if (old != null) {
                    old.close();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.m8116constructorimpl(unit);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th2));
            }
        } catch (Throwable t) {
            Log.e("PyMCL-MP", "VPN establish failed", t);
            try {
                Result.Companion companion5 = Result.INSTANCE;
                TerracottaAndroidAPI.getPendingVpnServiceRequest().reject();
                Result.m8116constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th3));
            }
        }
        return 1;
    }

    private final Notification notif() {
        Notification notificationBuild = new Notification.Builder(this, CHANNEL).setSmallIcon(android.R.drawable.stat_sys_upload).setContentTitle("陶瓦联机").setContentText(this.text).setOngoing(true).setOnlyAlertOnce(true).setCategory(NotificationCompat.CATEGORY_SERVICE).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        return notificationBuild;
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        cleanup();
        stopSelf();
    }

    @Override // android.app.Service
    public void onDestroy() {
        cleanup();
        super.onDestroy();
    }

    private final void cleanup() {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            TerracottaVpnService terracottaVpnService = this;
            TerracottaAndroidAPI.setWaiting();
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            TerracottaVpnService $this$cleanup_u24lambda_u241 = this;
            ParcelFileDescriptor parcelFileDescriptor = $this$cleanup_u24lambda_u241.tun;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m8116constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th2));
        }
        this.tun = null;
        running = false;
    }
}
