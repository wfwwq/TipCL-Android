package com.pymcl.android.ui.state;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u001b\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003Jg\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013Ê\u0001\f\b(\u0012\b\b)\u0012\u0004\b\u0003\u0010\u0002¨\u0006'"}, d2 = {"Lcom/pymcl/android/ui/state/MpState;", "", "phase", "Lcom/pymcl/android/ui/state/MpPhase;", "code", "", "members", "", "Lkotlin/Pair;", "", "lanIps", "label", "serverUrl", "difficulty", "<init>", "(Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhase", "()Lcom/pymcl/android/ui/state/MpPhase;", "getCode", "()Ljava/lang/String;", "getMembers", "()Ljava/util/List;", "getLanIps", "getLabel", "getServerUrl", "getDifficulty", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class MpState {
    public static final int $stable = 0;
    private final String code;
    private final String difficulty;
    private final String label;
    private final List<String> lanIps;
    private final List<Pair<String, Boolean>> members;
    private final MpPhase phase;
    private final String serverUrl;

    public static /* synthetic */ MpState copy$default(MpState mpState, MpPhase mpPhase, String str, List list, List list2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            mpPhase = mpState.phase;
        }
        if ((i & 2) != 0) {
            str = mpState.code;
        }
        if ((i & 4) != 0) {
            list = mpState.members;
        }
        if ((i & 8) != 0) {
            list2 = mpState.lanIps;
        }
        if ((i & 16) != 0) {
            str2 = mpState.label;
        }
        if ((i & 32) != 0) {
            str3 = mpState.serverUrl;
        }
        if ((i & 64) != 0) {
            str4 = mpState.difficulty;
        }
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        List list3 = list;
        return mpState.copy(mpPhase, str, list3, list2, str7, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final MpPhase getPhase() {
        return this.phase;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final List<Pair<String, Boolean>> component3() {
        return this.members;
    }

    public final List<String> component4() {
        return this.lanIps;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component6, reason: from getter */
    public final String getServerUrl() {
        return this.serverUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDifficulty() {
        return this.difficulty;
    }

    public final MpState copy(MpPhase phase, String code, List<Pair<String, Boolean>> members, List<String> lanIps, String label, String serverUrl, String difficulty) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(lanIps, "lanIps");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(difficulty, "difficulty");
        return new MpState(phase, code, members, lanIps, label, serverUrl, difficulty);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MpState)) {
            return false;
        }
        MpState mpState = (MpState) other;
        return this.phase == mpState.phase && Intrinsics.areEqual(this.code, mpState.code) && Intrinsics.areEqual(this.members, mpState.members) && Intrinsics.areEqual(this.lanIps, mpState.lanIps) && Intrinsics.areEqual(this.label, mpState.label) && Intrinsics.areEqual(this.serverUrl, mpState.serverUrl) && Intrinsics.areEqual(this.difficulty, mpState.difficulty);
    }

    public int hashCode() {
        return (((((((((((this.phase.hashCode() * 31) + this.code.hashCode()) * 31) + this.members.hashCode()) * 31) + this.lanIps.hashCode()) * 31) + this.label.hashCode()) * 31) + this.serverUrl.hashCode()) * 31) + this.difficulty.hashCode();
    }

    public String toString() {
        return "MpState(phase=" + this.phase + ", code=" + this.code + ", members=" + this.members + ", lanIps=" + this.lanIps + ", label=" + this.label + ", serverUrl=" + this.serverUrl + ", difficulty=" + this.difficulty + ")";
    }

    public MpState(MpPhase phase, String code, List<Pair<String, Boolean>> members, List<String> lanIps, String label, String serverUrl, String difficulty) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(lanIps, "lanIps");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(difficulty, "difficulty");
        this.phase = phase;
        this.code = code;
        this.members = members;
        this.lanIps = lanIps;
        this.label = label;
        this.serverUrl = serverUrl;
        this.difficulty = difficulty;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MpState(MpPhase mpPhase, String str, List list, List list2, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        str = (i & 2) != 0 ? "" : str;
        list = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        list2 = (i & 8) != 0 ? CollectionsKt.emptyList() : list2;
        str2 = (i & 16) != 0 ? "" : str2;
        str3 = (i & 32) != 0 ? "" : str3;
        if ((i & 64) == 0) {
            str5 = str4;
        } else {
            str5 = "";
        }
        this(mpPhase, str, list, list2, str2, str3, str5);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<String> getLanIps() {
        return this.lanIps;
    }

    public final List<Pair<String, Boolean>> getMembers() {
        return this.members;
    }

    public final MpPhase getPhase() {
        return this.phase;
    }

    public final String getDifficulty() {
        return this.difficulty;
    }

    public final String getServerUrl() {
        return this.serverUrl;
    }
}
