package com.pymcl.android.ui.state;

import androidx.core.app.NotificationCompat;
import com.pymcl.android.ui.i18n.I18nKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LaunchGate.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fÊ\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/pymcl/android/ui/state/LaunchGate;", "", "<init>", "()V", "resolveVersion", "", "versions", "", "selected", "check", "Lcom/pymcl/android/ui/state/LaunchGate$Verdict;", "i", "Lcom/pymcl/android/ui/state/LaunchGate$Input;", "require", "Reason", "Action", "Input", "Verdict", "Blocked", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class LaunchGate {
    public static final int $stable = 0;
    public static final LaunchGate INSTANCE = new LaunchGate();

    /* compiled from: LaunchGate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/pymcl/android/ui/state/LaunchGate$Action;", "", "<init>", "(Ljava/lang/String;I)V", "Launch", "Stop", "None", "DownloadGame", "OpenInstances", "AddAccount", "Repair", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum Action {
        Launch,
        Stop,
        None,
        DownloadGame,
        OpenInstances,
        AddAccount,
        Repair;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }
    }

    /* compiled from: LaunchGate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/pymcl/android/ui/state/LaunchGate$Reason;", "", "<init>", "(Ljava/lang/String;I)V", "Ok", "Loading", "Running", "Launching", "Installing", "NoInstance", "InstanceMissing", "NoVersion", "VersionMissing", "VersionIncomplete", "NoAccount", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum Reason {
        Ok,
        Loading,
        Running,
        Launching,
        Installing,
        NoInstance,
        InstanceMissing,
        NoVersion,
        VersionMissing,
        VersionIncomplete,
        NoAccount;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<Reason> getEntries() {
            return $ENTRIES;
        }
    }

    private LaunchGate() {
    }

    /* compiled from: LaunchGate.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\u007f\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\u0014\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020.HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019Ê\u0001\f\b1\u0012\b\b2\u0012\u0004\b\u0003\u0010\u0002¨\u00060"}, d2 = {"Lcom/pymcl/android/ui/state/LaunchGate$Input;", "", "instances", "", "", "selectedInstance", "versions", "selectedVersion", "hasAccount", "", "gameRunning", "launching", "installing", "incomplete", "", "loading", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZLjava/util/Set;Z)V", "getInstances", "()Ljava/util/List;", "getSelectedInstance", "()Ljava/lang/String;", "getVersions", "getSelectedVersion", "getHasAccount", "()Z", "getGameRunning", "getLaunching", "getInstalling", "getIncomplete", "()Ljava/util/Set;", "getLoading", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 0;
        private final boolean gameRunning;
        private final boolean hasAccount;
        private final Set<String> incomplete;
        private final boolean installing;
        private final List<String> instances;
        private final boolean launching;
        private final boolean loading;
        private final String selectedInstance;
        private final String selectedVersion;
        private final List<String> versions;

        public static /* synthetic */ Input copy$default(Input input, List list, String str, List list2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Set set, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                list = input.instances;
            }
            if ((i & 2) != 0) {
                str = input.selectedInstance;
            }
            if ((i & 4) != 0) {
                list2 = input.versions;
            }
            if ((i & 8) != 0) {
                str2 = input.selectedVersion;
            }
            if ((i & 16) != 0) {
                z = input.hasAccount;
            }
            if ((i & 32) != 0) {
                z2 = input.gameRunning;
            }
            if ((i & 64) != 0) {
                z3 = input.launching;
            }
            if ((i & 128) != 0) {
                z4 = input.installing;
            }
            if ((i & 256) != 0) {
                set = input.incomplete;
            }
            if ((i & 512) != 0) {
                z5 = input.loading;
            }
            Set set2 = set;
            boolean z6 = z5;
            boolean z7 = z3;
            boolean z8 = z4;
            boolean z9 = z;
            boolean z10 = z2;
            return input.copy(list, str, list2, str2, z9, z10, z7, z8, set2, z6);
        }

        public final List<String> component1() {
            return this.instances;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSelectedInstance() {
            return this.selectedInstance;
        }

        public final List<String> component3() {
            return this.versions;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSelectedVersion() {
            return this.selectedVersion;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasAccount() {
            return this.hasAccount;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getGameRunning() {
            return this.gameRunning;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getLaunching() {
            return this.launching;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getInstalling() {
            return this.installing;
        }

        public final Set<String> component9() {
            return this.incomplete;
        }

        public final Input copy(List<String> instances, String selectedInstance, List<String> versions, String selectedVersion, boolean hasAccount, boolean gameRunning, boolean launching, boolean installing, Set<String> incomplete, boolean loading) {
            Intrinsics.checkNotNullParameter(instances, "instances");
            Intrinsics.checkNotNullParameter(selectedInstance, "selectedInstance");
            Intrinsics.checkNotNullParameter(versions, "versions");
            Intrinsics.checkNotNullParameter(selectedVersion, "selectedVersion");
            Intrinsics.checkNotNullParameter(incomplete, "incomplete");
            return new Input(instances, selectedInstance, versions, selectedVersion, hasAccount, gameRunning, launching, installing, incomplete, loading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.areEqual(this.instances, input.instances) && Intrinsics.areEqual(this.selectedInstance, input.selectedInstance) && Intrinsics.areEqual(this.versions, input.versions) && Intrinsics.areEqual(this.selectedVersion, input.selectedVersion) && this.hasAccount == input.hasAccount && this.gameRunning == input.gameRunning && this.launching == input.launching && this.installing == input.installing && Intrinsics.areEqual(this.incomplete, input.incomplete) && this.loading == input.loading;
        }

        public int hashCode() {
            return (((((((((((((((((this.instances.hashCode() * 31) + this.selectedInstance.hashCode()) * 31) + this.versions.hashCode()) * 31) + this.selectedVersion.hashCode()) * 31) + Boolean.hashCode(this.hasAccount)) * 31) + Boolean.hashCode(this.gameRunning)) * 31) + Boolean.hashCode(this.launching)) * 31) + Boolean.hashCode(this.installing)) * 31) + this.incomplete.hashCode()) * 31) + Boolean.hashCode(this.loading);
        }

        public String toString() {
            return "Input(instances=" + this.instances + ", selectedInstance=" + this.selectedInstance + ", versions=" + this.versions + ", selectedVersion=" + this.selectedVersion + ", hasAccount=" + this.hasAccount + ", gameRunning=" + this.gameRunning + ", launching=" + this.launching + ", installing=" + this.installing + ", incomplete=" + this.incomplete + ", loading=" + this.loading + ")";
        }

        public Input(List<String> instances, String selectedInstance, List<String> versions, String selectedVersion, boolean hasAccount, boolean gameRunning, boolean launching, boolean installing, Set<String> incomplete, boolean loading) {
            Intrinsics.checkNotNullParameter(instances, "instances");
            Intrinsics.checkNotNullParameter(selectedInstance, "selectedInstance");
            Intrinsics.checkNotNullParameter(versions, "versions");
            Intrinsics.checkNotNullParameter(selectedVersion, "selectedVersion");
            Intrinsics.checkNotNullParameter(incomplete, "incomplete");
            this.instances = instances;
            this.selectedInstance = selectedInstance;
            this.versions = versions;
            this.selectedVersion = selectedVersion;
            this.hasAccount = hasAccount;
            this.gameRunning = gameRunning;
            this.launching = launching;
            this.installing = installing;
            this.incomplete = incomplete;
            this.loading = loading;
        }

        public /* synthetic */ Input(List list, String str, List list2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Set set, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, list2, str2, z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? SetsKt.emptySet() : set, (i & 512) != 0 ? false : z5);
        }

        public final List<String> getInstances() {
            return this.instances;
        }

        public final String getSelectedInstance() {
            return this.selectedInstance;
        }

        public final List<String> getVersions() {
            return this.versions;
        }

        public final String getSelectedVersion() {
            return this.selectedVersion;
        }

        public final boolean getHasAccount() {
            return this.hasAccount;
        }

        public final boolean getGameRunning() {
            return this.gameRunning;
        }

        public final boolean getLaunching() {
            return this.launching;
        }

        public final boolean getInstalling() {
            return this.installing;
        }

        public final Set<String> getIncomplete() {
            return this.incomplete;
        }

        public final boolean getLoading() {
            return this.loading;
        }
    }

    /* compiled from: LaunchGate.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0014\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014Ê\u0001\f\b*\u0012\b\b+\u0012\u0004\b\u0003\u0010\u0002¨\u0006)"}, d2 = {"Lcom/pymcl/android/ui/state/LaunchGate$Verdict;", "", "reason", "Lcom/pymcl/android/ui/state/LaunchGate$Reason;", "buttonText", "", "enabled", "", "action", "Lcom/pymcl/android/ui/state/LaunchGate$Action;", NotificationCompat.CATEGORY_STATUS, "detail", "version", "<init>", "(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Lcom/pymcl/android/ui/state/LaunchGate$Reason;", "getButtonText", "()Ljava/lang/String;", "getEnabled", "()Z", "getAction", "()Lcom/pymcl/android/ui/state/LaunchGate$Action;", "getStatus", "getDetail", "getVersion", "canLaunch", "getCanLaunch", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Verdict {
        public static final int $stable = 0;
        private final Action action;
        private final String buttonText;
        private final String detail;
        private final boolean enabled;
        private final Reason reason;
        private final String status;
        private final String version;

        public static /* synthetic */ Verdict copy$default(Verdict verdict, Reason reason, String str, boolean z, Action action, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                reason = verdict.reason;
            }
            if ((i & 2) != 0) {
                str = verdict.buttonText;
            }
            if ((i & 4) != 0) {
                z = verdict.enabled;
            }
            if ((i & 8) != 0) {
                action = verdict.action;
            }
            if ((i & 16) != 0) {
                str2 = verdict.status;
            }
            if ((i & 32) != 0) {
                str3 = verdict.detail;
            }
            if ((i & 64) != 0) {
                str4 = verdict.version;
            }
            String str5 = str3;
            String str6 = str4;
            String str7 = str2;
            boolean z2 = z;
            return verdict.copy(reason, str, z2, action, str7, str5, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final Reason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component4, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* renamed from: component5, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        /* renamed from: component7, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final Verdict copy(Reason reason, String buttonText, boolean enabled, Action action, String status, String detail, String version) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(detail, "detail");
            Intrinsics.checkNotNullParameter(version, "version");
            return new Verdict(reason, buttonText, enabled, action, status, detail, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Verdict)) {
                return false;
            }
            Verdict verdict = (Verdict) other;
            return this.reason == verdict.reason && Intrinsics.areEqual(this.buttonText, verdict.buttonText) && this.enabled == verdict.enabled && this.action == verdict.action && Intrinsics.areEqual(this.status, verdict.status) && Intrinsics.areEqual(this.detail, verdict.detail) && Intrinsics.areEqual(this.version, verdict.version);
        }

        public int hashCode() {
            return (((((((((((this.reason.hashCode() * 31) + this.buttonText.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.action.hashCode()) * 31) + this.status.hashCode()) * 31) + this.detail.hashCode()) * 31) + this.version.hashCode();
        }

        public String toString() {
            return "Verdict(reason=" + this.reason + ", buttonText=" + this.buttonText + ", enabled=" + this.enabled + ", action=" + this.action + ", status=" + this.status + ", detail=" + this.detail + ", version=" + this.version + ")";
        }

        public Verdict(Reason reason, String buttonText, boolean enabled, Action action, String status, String detail, String version) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(detail, "detail");
            Intrinsics.checkNotNullParameter(version, "version");
            this.reason = reason;
            this.buttonText = buttonText;
            this.enabled = enabled;
            this.action = action;
            this.status = status;
            this.detail = detail;
            this.version = version;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Verdict(Reason reason, String str, boolean z, Action action, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str5;
            str3 = (i & 32) != 0 ? "" : str3;
            if ((i & 64) == 0) {
                str5 = str4;
            } else {
                str5 = "";
            }
            this(reason, str, z, action, str2, str3, str5);
        }

        public final Reason getReason() {
            return this.reason;
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final Action getAction() {
            return this.action;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final String getVersion() {
            return this.version;
        }

        public final boolean getCanLaunch() {
            return this.reason == Reason.Ok;
        }
    }

    public final String resolveVersion(List<String> versions, String selected) {
        Intrinsics.checkNotNullParameter(versions, "versions");
        Intrinsics.checkNotNullParameter(selected, "selected");
        if (StringsKt.isBlank(selected)) {
            return (String) CollectionsKt.firstOrNull((List) versions);
        }
        if (versions.contains(selected)) {
            return selected;
        }
        return null;
    }

    public final Verdict check(Input i) {
        Intrinsics.checkNotNullParameter(i, "i");
        if (i.getGameRunning()) {
            return new Verdict(Reason.Running, "停止", true, Action.Stop, "游戏运行中", null, null, 96, null);
        }
        if (i.getLoading()) {
            return new Verdict(Reason.Loading, "启动游戏", false, Action.None, "正在读取…", "正在读取实例与账号，请稍候", null, 64, null);
        }
        if (i.getLaunching()) {
            return new Verdict(Reason.Launching, "正在启动游戏", false, Action.None, "正在启动游戏", "正在启动游戏，请稍候", null, 64, null);
        }
        if (i.getInstalling()) {
            return new Verdict(Reason.Installing, "处理中…", false, Action.None, "正在安装", "这个实例正在安装版本，装完再启动", null, 64, null);
        }
        if (i.getInstances().isEmpty()) {
            return new Verdict(Reason.NoInstance, "新建实例", true, Action.OpenInstances, "还没有实例", "先到「实例」页新建一个", null, 64, null);
        }
        if (!StringsKt.isBlank(i.getSelectedInstance()) && !i.getInstances().contains(i.getSelectedInstance())) {
            return new Verdict(Reason.InstanceMissing, "选择实例", true, Action.OpenInstances, "实例不存在", I18nKt.tr("「{0}」已被删除或改名，请重新选择实例", i.getSelectedInstance()), null, 64, null);
        }
        if (i.getVersions().isEmpty()) {
            return new Verdict(Reason.NoVersion, "下载游戏", true, Action.DownloadGame, "还没有可启动的版本 · 去下载页安装", "这个实例还没有版本，先去「原版游戏」装一个", null, 64, null);
        }
        String v = resolveVersion(i.getVersions(), i.getSelectedVersion());
        if (v != null) {
            if (i.getIncomplete().contains(v)) {
                return new Verdict(Reason.VersionIncomplete, "修复版本", true, Action.Repair, "版本文件不完整", I18nKt.tr("「{0}」的版本文件损坏或缺少父版本，到「原版游戏」重新安装", v), v);
            }
            if (!i.getHasAccount()) {
                return new Verdict(Reason.NoAccount, "启动游戏", true, Action.AddAccount, "未登录", "启动游戏前需要先创建一个离线用户（无正版验证）。", v);
            }
            return new Verdict(Reason.Ok, "启动游戏", true, Action.Launch, "就绪", null, v, 32, null);
        }
        return new Verdict(Reason.VersionMissing, "下载游戏", true, Action.DownloadGame, "未选择版本", I18nKt.tr("「{0}」不在这个实例里，先到「原版游戏」安装一个版本", i.getSelectedVersion()), null, 64, null);
    }

    /* compiled from: LaunchGate.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\f\b\n\u0012\b\b\u000b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\t"}, d2 = {"Lcom/pymcl/android/ui/state/LaunchGate$Blocked;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "verdict", "Lcom/pymcl/android/ui/state/LaunchGate$Verdict;", "<init>", "(Lcom/pymcl/android/ui/state/LaunchGate$Verdict;)V", "getVerdict", "()Lcom/pymcl/android/ui/state/LaunchGate$Verdict;", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Blocked extends IllegalStateException {
        public static final int $stable = 8;
        private final Verdict verdict;

        /* JADX WARN: Illegal instructions before constructor call */
        public Blocked(Verdict verdict) {
            Intrinsics.checkNotNullParameter(verdict, "verdict");
            String detail = verdict.getDetail();
            super(detail.length() == 0 ? verdict.getStatus() : detail);
            this.verdict = verdict;
        }

        public final Verdict getVerdict() {
            return this.verdict;
        }
    }

    public final String require(Input i) {
        Intrinsics.checkNotNullParameter(i, "i");
        Verdict v = check(i);
        if (v.getCanLaunch()) {
            return v.getVersion();
        }
        throw new Blocked(v);
    }
}
