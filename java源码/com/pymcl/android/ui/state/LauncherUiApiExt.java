package com.pymcl.android.ui.state;

import androidx.autofill.HintConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LauncherUiApi.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0005J<\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u000eJJ\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0012H\u0096@¢\u0006\u0002\u0010\u0015J,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0018JD\u0010\u0019\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0012H\u0096@¢\u0006\u0002\u0010\u001bJ0\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u001d0\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u001fJZ\u0010 \u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0012H\u0096@¢\u0006\u0002\u0010#¨\u0006$À\u0006\u0003"}, d2 = {"Lcom/pymcl/android/ui/state/LauncherUiApiExt;", "", "accountSkinFile", "", HintConstants.AUTOFILL_HINT_NAME, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "missingDependencies", "", "Lcom/pymcl/android/ui/state/DepCandidate;", "kind", "instance", "version", "id", "fileId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installDependencies", "deps", "onProgress", "Lkotlin/Function2;", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "identifyInstalled", "Lcom/pymcl/android/ui/state/InstalledEntry;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyModUpdate", "filename", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modpackExportCandidates", "Lkotlin/Pair;", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exportModpack", "packVersion", "include", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface LauncherUiApiExt {
    default Object accountSkinFile(String str, Continuation<? super String> continuation) {
        return accountSkinFile$suspendImpl(this, str, continuation);
    }

    default Object applyModUpdate(String str, String str2, String str3, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return applyModUpdate$suspendImpl(this, str, str2, str3, function2, continuation);
    }

    default Object exportModpack(String str, String str2, String str3, String str4, List<String> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return exportModpack$suspendImpl(this, str, str2, str3, str4, list, function2, continuation);
    }

    default Object identifyInstalled(String str, String str2, String str3, Continuation<? super List<InstalledEntry>> continuation) {
        return identifyInstalled$suspendImpl(this, str, str2, str3, continuation);
    }

    default Object installDependencies(String str, String str2, List<DepCandidate> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return installDependencies$suspendImpl(this, str, str2, list, function2, continuation);
    }

    default Object missingDependencies(String str, String str2, String str3, String str4, String str5, Continuation<? super List<DepCandidate>> continuation) {
        return missingDependencies$suspendImpl(this, str, str2, str3, str4, str5, continuation);
    }

    default Object modpackExportCandidates(String str, String str2, Continuation<? super List<Pair<String, Boolean>>> continuation) {
        return modpackExportCandidates$suspendImpl(this, str, str2, continuation);
    }

    /* compiled from: LauncherUiApi.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object accountSkinFile(LauncherUiApiExt $this, String name, Continuation<? super String> continuation) {
            return LauncherUiApiExt.super.accountSkinFile(name, continuation);
        }

        @Deprecated
        public static Object missingDependencies(LauncherUiApiExt $this, String kind, String instance, String version, String id, String fileId, Continuation<? super List<DepCandidate>> continuation) {
            return LauncherUiApiExt.super.missingDependencies(kind, instance, version, id, fileId, continuation);
        }

        @Deprecated
        public static Object installDependencies(LauncherUiApiExt $this, String instance, String version, List<DepCandidate> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
            return LauncherUiApiExt.super.installDependencies(instance, version, list, function2, continuation);
        }

        @Deprecated
        public static Object identifyInstalled(LauncherUiApiExt $this, String kind, String instance, String version, Continuation<? super List<InstalledEntry>> continuation) {
            return LauncherUiApiExt.super.identifyInstalled(kind, instance, version, continuation);
        }

        @Deprecated
        public static Object applyModUpdate(LauncherUiApiExt $this, String instance, String version, String filename, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
            return LauncherUiApiExt.super.applyModUpdate(instance, version, filename, function2, continuation);
        }

        @Deprecated
        public static Object modpackExportCandidates(LauncherUiApiExt $this, String instance, String version, Continuation<? super List<Pair<String, Boolean>>> continuation) {
            return LauncherUiApiExt.super.modpackExportCandidates(instance, version, continuation);
        }

        @Deprecated
        public static Object exportModpack(LauncherUiApiExt $this, String instance, String version, String name, String packVersion, List<String> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
            return LauncherUiApiExt.super.exportModpack(instance, version, name, packVersion, list, function2, continuation);
        }
    }

    static /* synthetic */ Object accountSkinFile$suspendImpl(LauncherUiApiExt $this, String name, Continuation<? super String> continuation) {
        return null;
    }

    static /* synthetic */ Object missingDependencies$suspendImpl(LauncherUiApiExt $this, String kind, String instance, String version, String id, String fileId, Continuation<? super List<DepCandidate>> continuation) {
        return CollectionsKt.emptyList();
    }

    static /* synthetic */ Object installDependencies$default(LauncherUiApiExt launcherUiApiExt, String str, String str2, List list, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: installDependencies");
        }
        if ((i & 8) != 0) {
            function2 = new Function2() { // from class: com.pymcl.android.ui.state.LauncherUiApiExt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LauncherUiApiExt.installDependencies$lambda$0((Float) obj2, (String) obj3);
                }
            };
        }
        return launcherUiApiExt.installDependencies(str, str2, list, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit installDependencies$lambda$0(Float f, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object installDependencies$suspendImpl(LauncherUiApiExt $this, String instance, String version, List<DepCandidate> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return "";
    }

    static /* synthetic */ Object identifyInstalled$suspendImpl(LauncherUiApiExt $this, String kind, String instance, String version, Continuation<? super List<InstalledEntry>> continuation) {
        return CollectionsKt.emptyList();
    }

    static /* synthetic */ Object applyModUpdate$default(LauncherUiApiExt launcherUiApiExt, String str, String str2, String str3, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyModUpdate");
        }
        if ((i & 8) != 0) {
            function2 = new Function2() { // from class: com.pymcl.android.ui.state.LauncherUiApiExt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LauncherUiApiExt.applyModUpdate$lambda$0((Float) obj2, (String) obj3);
                }
            };
        }
        return launcherUiApiExt.applyModUpdate(str, str2, str3, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit applyModUpdate$lambda$0(Float f, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object applyModUpdate$suspendImpl(LauncherUiApiExt $this, String instance, String version, String filename, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ Object modpackExportCandidates$suspendImpl(LauncherUiApiExt $this, String instance, String version, Continuation<? super List<Pair<String, Boolean>>> continuation) {
        return CollectionsKt.emptyList();
    }

    static /* synthetic */ Object exportModpack$default(LauncherUiApiExt launcherUiApiExt, String str, String str2, String str3, String str4, List list, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exportModpack");
        }
        if ((i & 32) != 0) {
            function2 = new Function2() { // from class: com.pymcl.android.ui.state.LauncherUiApiExt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LauncherUiApiExt.exportModpack$lambda$0((Float) obj2, (String) obj3);
                }
            };
        }
        return launcherUiApiExt.exportModpack(str, str2, str3, str4, list, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit exportModpack$lambda$0(Float f, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object exportModpack$suspendImpl(LauncherUiApiExt $this, String instance, String version, String name, String packVersion, List<String> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        throw new UnsupportedOperationException();
    }
}
