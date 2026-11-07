package com.pymcl.android.ui;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Destinations.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/pymcl/android/ui/Destination;", "", "route", "", "title", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "getTitle", "Launch", "Versions", "Library", "Instances", "Java", "Accounts", "Ai", "Multiplayer", "Servers", "Settings", "PlayTime", "Tasks", "Feedback", "Companion", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public enum Destination {
    Launch("launch", "启动"),
    Versions("versions", "版本"),
    Library("library", "资源库"),
    Instances("instances", "实例"),
    Java("java", "Java"),
    Accounts("accounts", "账号"),
    Ai("ai", "AI"),
    Multiplayer("multiplayer", "联机"),
    Servers("servers", "服务器"),
    Settings("settings", "设置"),
    PlayTime("playtime", "游戏时长"),
    Tasks("tasks", "任务"),
    Feedback("feedback", "反馈");

    private final String route;
    private final String title;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Destination start = Launch;

    public static EnumEntries<Destination> getEntries() {
        return $ENTRIES;
    }

    Destination(String route, String title) {
        this.route = route;
        this.title = title;
    }

    public final String getRoute() {
        return this.route;
    }

    public final String getTitle() {
        return this.title;
    }

    /* compiled from: Destinations.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/pymcl/android/ui/Destination$Companion;", "", "<init>", "()V", "start", "Lcom/pymcl/android/ui/Destination;", "getStart", "()Lcom/pymcl/android/ui/Destination;", "fromRoute", "route", "", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Destination getStart() {
            return Destination.start;
        }

        public final Destination fromRoute(String route) {
            Object next;
            Iterator<Destination> it = Destination.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((Destination) next).getRoute(), route)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            return (Destination) next;
        }
    }
}
