package com.pymcl.android.data;

import android.content.Context;
import androidx.autofill.HintConstants;
import com.pymcl.android.data.LaunchConfigLogic;
import com.pymcl.core.instance.Instance;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LaunchConfigIO.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bJ&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016Ê\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/pymcl/android/data/LaunchConfigIO;", "", "<init>", "()V", "repo", "Lcom/pymcl/android/data/LauncherRepository;", "ctx", "Landroid/content/Context;", "existing", "Lcom/pymcl/core/instance/Instance;", HintConstants.AUTOFILL_HINT_NAME, "", "load", "Lcom/pymcl/android/data/LaunchConfigIO$State;", "instance", "version", "saveDisplay", "", "d", "Lcom/pymcl/android/data/LaunchConfigLogic$Display;", "saveJava", "index", "", "State", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class LaunchConfigIO {
    public static final int $stable = 0;
    public static final LaunchConfigIO INSTANCE = new LaunchConfigIO();

    /* compiled from: LaunchConfigIO.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/pymcl/android/data/LaunchConfigIO$State;", "", "display", "Lcom/pymcl/android/data/LaunchConfigLogic$Display;", "javaIndex", "", "memMax", "<init>", "(Lcom/pymcl/android/data/LaunchConfigLogic$Display;II)V", "getDisplay", "()Lcom/pymcl/android/data/LaunchConfigLogic$Display;", "getJavaIndex", "()I", "getMemMax", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 0;
        private final LaunchConfigLogic.Display display;
        private final int javaIndex;
        private final int memMax;

        public static /* synthetic */ State copy$default(State state, LaunchConfigLogic.Display display, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                display = state.display;
            }
            if ((i3 & 2) != 0) {
                i = state.javaIndex;
            }
            if ((i3 & 4) != 0) {
                i2 = state.memMax;
            }
            return state.copy(display, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final LaunchConfigLogic.Display getDisplay() {
            return this.display;
        }

        /* renamed from: component2, reason: from getter */
        public final int getJavaIndex() {
            return this.javaIndex;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMemMax() {
            return this.memMax;
        }

        public final State copy(LaunchConfigLogic.Display display, int javaIndex, int memMax) {
            Intrinsics.checkNotNullParameter(display, "display");
            return new State(display, javaIndex, memMax);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.display, state.display) && this.javaIndex == state.javaIndex && this.memMax == state.memMax;
        }

        public int hashCode() {
            return (((this.display.hashCode() * 31) + Integer.hashCode(this.javaIndex)) * 31) + Integer.hashCode(this.memMax);
        }

        public String toString() {
            return "State(display=" + this.display + ", javaIndex=" + this.javaIndex + ", memMax=" + this.memMax + ")";
        }

        public State(LaunchConfigLogic.Display display, int javaIndex, int memMax) {
            Intrinsics.checkNotNullParameter(display, "display");
            this.display = display;
            this.javaIndex = javaIndex;
            this.memMax = memMax;
        }

        public final LaunchConfigLogic.Display getDisplay() {
            return this.display;
        }

        public final int getJavaIndex() {
            return this.javaIndex;
        }

        public final int getMemMax() {
            return this.memMax;
        }
    }

    private LaunchConfigIO() {
    }

    private final LauncherRepository repo(Context ctx) {
        return LauncherRepository.INSTANCE.get(ctx);
    }

    private final Instance existing(Context ctx, String name) {
        Object objM8116constructorimpl;
        LauncherRepository r = repo(ctx);
        try {
            Result.Companion companion = Result.INSTANCE;
            LaunchConfigIO launchConfigIO = this;
            objM8116constructorimpl = Result.m8116constructorimpl(r.getInstances().list());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = listEmptyList;
        }
        List names = (List) objM8116constructorimpl;
        String str = name;
        if (StringsKt.isBlank(str)) {
            String str2 = (String) CollectionsKt.firstOrNull(names);
            if (str2 == null) {
                return null;
            }
            str = str2;
        }
        String n = str;
        if (names.contains(n)) {
            return r.getInstances().get(n);
        }
        return null;
    }

    public final State load(Context ctx, String instance, String version) {
        Map<String, Object> mapMeta;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        LauncherRepository r = repo(ctx);
        Instance inst = existing(ctx, instance);
        LaunchConfigLogic.Display displayLoadDisplay = LaunchConfigLogic.INSTANCE.loadDisplay(r.getConfig(), inst, version);
        LaunchConfigLogic launchConfigLogic = LaunchConfigLogic.INSTANCE;
        Object obj = (inst == null || (mapMeta = inst.meta()) == null) ? null : mapMeta.get("java");
        return new State(displayLoadDisplay, launchConfigLogic.javaIndex(obj instanceof String ? (String) obj : null), LaunchConfigLogic.INSTANCE.memMax(SettingsExtrasIO.INSTANCE.totalMemMb(ctx)));
    }

    public final void saveDisplay(Context ctx, String instance, String version, LaunchConfigLogic.Display d) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(d, "d");
        LaunchConfigLogic.INSTANCE.saveDisplay(repo(ctx).getConfig(), existing(ctx, instance), version, d);
    }

    public final void saveJava(Context ctx, String instance, int index) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Instance instanceExisting = existing(ctx, instance);
        if (instanceExisting != null) {
            LaunchConfigLogic.INSTANCE.saveJava(instanceExisting, index);
        }
    }
}
