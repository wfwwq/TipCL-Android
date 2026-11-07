package com.pymcl.android.ui.state;

import com.pymcl.android.data.RepositoryUiApiExt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LauncherUiApi.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ext", "Lcom/pymcl/android/ui/state/LauncherUiApiExt;", "Lcom/pymcl/android/ui/state/LauncherUiApi;", "getExt", "(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt;", "ext8", "Lcom/pymcl/android/ui/state/LauncherUiApiExt8;", "getExt8", "(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt8;", "PyMCL-Android:app_debug"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class LauncherUiApiKt {
    public static final LauncherUiApiExt getExt(LauncherUiApi $this$ext) {
        Intrinsics.checkNotNullParameter($this$ext, "<this>");
        LauncherUiApiExt launcherUiApiExt = $this$ext instanceof LauncherUiApiExt ? (LauncherUiApiExt) $this$ext : null;
        return launcherUiApiExt == null ? RepositoryUiApiExt.INSTANCE.forApi($this$ext) : launcherUiApiExt;
    }

    public static final LauncherUiApiExt8 getExt8(LauncherUiApi $this$ext8) {
        Intrinsics.checkNotNullParameter($this$ext8, "<this>");
        LauncherUiApiExt8 launcherUiApiExt8 = $this$ext8 instanceof LauncherUiApiExt8 ? (LauncherUiApiExt8) $this$ext8 : null;
        if (launcherUiApiExt8 != null) {
            return launcherUiApiExt8;
        }
        LauncherUiApiExt ext = getExt($this$ext8);
        LauncherUiApiExt8 launcherUiApiExt82 = ext instanceof LauncherUiApiExt8 ? (LauncherUiApiExt8) ext : null;
        return launcherUiApiExt82 == null ? new LauncherUiApiExt8() { // from class: com.pymcl.android.ui.state.LauncherUiApiKt$ext8$1
            @Override // com.pymcl.android.ui.state.LauncherUiApiExt
            public /* bridge */ Object accountSkinFile(String name, Continuation<? super String> continuation) {
                return super.accountSkinFile(name, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt
            public /* bridge */ Object applyModUpdate(String instance, String version, String filename, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
                return super.applyModUpdate(instance, version, filename, function2, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
            public /* bridge */ Object contentDirPath(String kind, String instance, String version, Continuation<? super String> continuation) {
                return super.contentDirPath(kind, instance, version, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
            public /* bridge */ Object deleteGlobalMod(String filename, Continuation<? super Unit> continuation) {
                return super.deleteGlobalMod(filename, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
            public /* bridge */ Object exportAllContents(String kind, String instance, String version, Function2<? super Float, ? super String, Unit> function2, Continuation<? super ContentExportResult> continuation) {
                return super.exportAllContents(kind, instance, version, function2, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt
            public /* bridge */ Object exportModpack(String instance, String version, String name, String packVersion, List<String> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
                return super.exportModpack(instance, version, name, packVersion, list, function2, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
            public /* bridge */ Object globalInjected(String instance, String version, Continuation<? super Set<String>> continuation) {
                return super.globalInjected(instance, version, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
            public /* bridge */ Object globalModsDirPath(Continuation<? super String> continuation) {
                return super.globalModsDirPath(continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt
            public /* bridge */ Object identifyInstalled(String kind, String instance, String version, Continuation<? super List<InstalledEntry>> continuation) {
                return super.identifyInstalled(kind, instance, version, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
            public /* bridge */ Object importGlobalMod(String path, Continuation<? super String> continuation) {
                return super.importGlobalMod(path, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt
            public /* bridge */ Object installDependencies(String instance, String version, List<DepCandidate> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
                return super.installDependencies(instance, version, list, function2, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
            public /* bridge */ Object listGlobalMods(Continuation<? super List<InstalledEntry>> continuation) {
                return super.listGlobalMods(continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt
            public /* bridge */ Object missingDependencies(String kind, String instance, String version, String id, String fileId, Continuation<? super List<DepCandidate>> continuation) {
                return super.missingDependencies(kind, instance, version, id, fileId, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
            public /* bridge */ Object modConflicts(String instance, String version, Continuation<? super List<ConflictRow>> continuation) {
                return super.modConflicts(instance, version, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt
            public /* bridge */ Object modpackExportCandidates(String instance, String version, Continuation<? super List<Pair<String, Boolean>>> continuation) {
                return super.modpackExportCandidates(instance, version, continuation);
            }

            @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
            public /* bridge */ Object setGlobalModEnabled(String filename, boolean enabled, Continuation<? super Unit> continuation) {
                return super.setGlobalModEnabled(filename, enabled, continuation);
            }
        } : launcherUiApiExt82;
    }
}
