package com.pymcl.android.ui.state;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LauncherUiApi.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0096@¢\u0006\u0002\u0010\u000bJ$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0019JD\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u001c\b\u0002\u0010\u001c\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u001dH\u0096@¢\u0006\u0002\u0010\u001fJ$\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0019¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/pymcl/android/ui/state/LauncherUiApiExt8;", "Lcom/pymcl/android/ui/state/LauncherUiApiExt;", "contentDirPath", "", "kind", "instance", "version", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listGlobalMods", "", "Lcom/pymcl/android/ui/state/InstalledEntry;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGlobalModEnabled", "", "filename", "enabled", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGlobalMod", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importGlobalMod", "path", "globalModsDirPath", "globalInjected", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exportAllContents", "Lcom/pymcl/android/ui/state/ContentExportResult;", "onProgress", "Lkotlin/Function2;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modConflicts", "Lcom/pymcl/android/ui/state/ConflictRow;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface LauncherUiApiExt8 extends LauncherUiApiExt {
    default Object contentDirPath(String str, String str2, String str3, Continuation<? super String> continuation) {
        return contentDirPath$suspendImpl(this, str, str2, str3, continuation);
    }

    default Object deleteGlobalMod(String str, Continuation<? super Unit> continuation) {
        return deleteGlobalMod$suspendImpl(this, str, continuation);
    }

    default Object exportAllContents(String str, String str2, String str3, Function2<? super Float, ? super String, Unit> function2, Continuation<? super ContentExportResult> continuation) {
        return exportAllContents$suspendImpl(this, str, str2, str3, function2, continuation);
    }

    default Object globalInjected(String str, String str2, Continuation<? super Set<String>> continuation) {
        return globalInjected$suspendImpl(this, str, str2, continuation);
    }

    default Object globalModsDirPath(Continuation<? super String> continuation) {
        return globalModsDirPath$suspendImpl(this, continuation);
    }

    default Object importGlobalMod(String str, Continuation<? super String> continuation) {
        return importGlobalMod$suspendImpl(this, str, continuation);
    }

    default Object listGlobalMods(Continuation<? super List<InstalledEntry>> continuation) {
        return listGlobalMods$suspendImpl(this, continuation);
    }

    default Object modConflicts(String str, String str2, Continuation<? super List<ConflictRow>> continuation) {
        return modConflicts$suspendImpl(this, str, str2, continuation);
    }

    default Object setGlobalModEnabled(String str, boolean z, Continuation<? super Unit> continuation) {
        return setGlobalModEnabled$suspendImpl(this, str, z, continuation);
    }

    /* compiled from: LauncherUiApi.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object accountSkinFile(LauncherUiApiExt8 $this, String name, Continuation<? super String> continuation) {
            return LauncherUiApiExt8.super.accountSkinFile(name, continuation);
        }

        @Deprecated
        public static Object applyModUpdate(LauncherUiApiExt8 $this, String instance, String version, String filename, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
            return LauncherUiApiExt8.super.applyModUpdate(instance, version, filename, function2, continuation);
        }

        @Deprecated
        public static Object exportModpack(LauncherUiApiExt8 $this, String instance, String version, String name, String packVersion, List<String> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
            return LauncherUiApiExt8.super.exportModpack(instance, version, name, packVersion, list, function2, continuation);
        }

        @Deprecated
        public static Object identifyInstalled(LauncherUiApiExt8 $this, String kind, String instance, String version, Continuation<? super List<InstalledEntry>> continuation) {
            return LauncherUiApiExt8.super.identifyInstalled(kind, instance, version, continuation);
        }

        @Deprecated
        public static Object installDependencies(LauncherUiApiExt8 $this, String instance, String version, List<DepCandidate> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
            return LauncherUiApiExt8.super.installDependencies(instance, version, list, function2, continuation);
        }

        @Deprecated
        public static Object missingDependencies(LauncherUiApiExt8 $this, String kind, String instance, String version, String id, String fileId, Continuation<? super List<DepCandidate>> continuation) {
            return LauncherUiApiExt8.super.missingDependencies(kind, instance, version, id, fileId, continuation);
        }

        @Deprecated
        public static Object modpackExportCandidates(LauncherUiApiExt8 $this, String instance, String version, Continuation<? super List<Pair<String, Boolean>>> continuation) {
            return LauncherUiApiExt8.super.modpackExportCandidates(instance, version, continuation);
        }

        @Deprecated
        public static Object contentDirPath(LauncherUiApiExt8 $this, String kind, String instance, String version, Continuation<? super String> continuation) {
            return LauncherUiApiExt8.super.contentDirPath(kind, instance, version, continuation);
        }

        @Deprecated
        public static Object listGlobalMods(LauncherUiApiExt8 $this, Continuation<? super List<InstalledEntry>> continuation) {
            return LauncherUiApiExt8.super.listGlobalMods(continuation);
        }

        @Deprecated
        public static Object setGlobalModEnabled(LauncherUiApiExt8 $this, String filename, boolean enabled, Continuation<? super Unit> continuation) {
            return LauncherUiApiExt8.super.setGlobalModEnabled(filename, enabled, continuation);
        }

        @Deprecated
        public static Object deleteGlobalMod(LauncherUiApiExt8 $this, String filename, Continuation<? super Unit> continuation) {
            return LauncherUiApiExt8.super.deleteGlobalMod(filename, continuation);
        }

        @Deprecated
        public static Object importGlobalMod(LauncherUiApiExt8 $this, String path, Continuation<? super String> continuation) {
            return LauncherUiApiExt8.super.importGlobalMod(path, continuation);
        }

        @Deprecated
        public static Object globalModsDirPath(LauncherUiApiExt8 $this, Continuation<? super String> continuation) {
            return LauncherUiApiExt8.super.globalModsDirPath(continuation);
        }

        @Deprecated
        public static Object globalInjected(LauncherUiApiExt8 $this, String instance, String version, Continuation<? super Set<String>> continuation) {
            return LauncherUiApiExt8.super.globalInjected(instance, version, continuation);
        }

        @Deprecated
        public static Object exportAllContents(LauncherUiApiExt8 $this, String kind, String instance, String version, Function2<? super Float, ? super String, Unit> function2, Continuation<? super ContentExportResult> continuation) {
            return LauncherUiApiExt8.super.exportAllContents(kind, instance, version, function2, continuation);
        }

        @Deprecated
        public static Object modConflicts(LauncherUiApiExt8 $this, String instance, String version, Continuation<? super List<ConflictRow>> continuation) {
            return LauncherUiApiExt8.super.modConflicts(instance, version, continuation);
        }
    }

    static /* synthetic */ Object contentDirPath$suspendImpl(LauncherUiApiExt8 $this, String kind, String instance, String version, Continuation<? super String> continuation) {
        return null;
    }

    static /* synthetic */ Object listGlobalMods$suspendImpl(LauncherUiApiExt8 $this, Continuation<? super List<InstalledEntry>> continuation) {
        return CollectionsKt.emptyList();
    }

    static /* synthetic */ Object setGlobalModEnabled$suspendImpl(LauncherUiApiExt8 $this, String filename, boolean enabled, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object deleteGlobalMod$suspendImpl(LauncherUiApiExt8 $this, String filename, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object importGlobalMod$suspendImpl(LauncherUiApiExt8 $this, String path, Continuation<? super String> continuation) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ Object globalModsDirPath$suspendImpl(LauncherUiApiExt8 $this, Continuation<? super String> continuation) {
        return null;
    }

    static /* synthetic */ Object globalInjected$suspendImpl(LauncherUiApiExt8 $this, String instance, String version, Continuation<? super Set<String>> continuation) {
        return SetsKt.emptySet();
    }

    static /* synthetic */ Object exportAllContents$default(LauncherUiApiExt8 launcherUiApiExt8, String str, String str2, String str3, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exportAllContents");
        }
        if ((i & 8) != 0) {
            function2 = new Function2() { // from class: com.pymcl.android.ui.state.LauncherUiApiExt8$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LauncherUiApiExt8.exportAllContents$lambda$0((Float) obj2, (String) obj3);
                }
            };
        }
        return launcherUiApiExt8.exportAllContents(str, str2, str3, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit exportAllContents$lambda$0(Float f, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object exportAllContents$suspendImpl(LauncherUiApiExt8 $this, String kind, String instance, String version, Function2<? super Float, ? super String, Unit> function2, Continuation<? super ContentExportResult> continuation) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ Object modConflicts$suspendImpl(LauncherUiApiExt8 $this, String instance, String version, Continuation<? super List<ConflictRow>> continuation) {
        return CollectionsKt.emptyList();
    }
}
