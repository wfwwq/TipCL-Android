package com.pymcl.android.ui.state;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.app.NotificationCompat;
import com.pymcl.android.ui.Destination;
import com.pymcl.android.ui.i18n.I18n;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.android.ui.state.LaunchGate;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;
import org.lwjgl.util.shaderc.SPV;

/* compiled from: AppState.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010i\u001a\u00020\u001a2\u0006\u0010j\u001a\u00020)J\u0006\u0010s\u001a\u00020tJ\u000e\u0010}\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020\u0013J\u0010\u0010}\u001a\u00020~2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\u0010\u0010\u0082\u0001\u001a\u00020~2\u0007\u0010\u0080\u0001\u001a\u00020-J\u0014\u0010\u0083\u0001\u001a\u00020~2\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010-J&\u0010\u0086\u0001\u001a\u00020~2\u0007\u0010\u0087\u0001\u001a\u00020)2\t\b\u0002\u0010\u0088\u0001\u001a\u00020)2\t\b\u0002\u0010\u0089\u0001\u001a\u00020)J\u001d\u0010\u008a\u0001\u001a\u00020~2\u0014\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u008c\u0001J;\u0010\u008f\u0001\u001a\u00030\u0090\u00012+\u0010\u0091\u0001\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020~0\u0093\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0092\u0001¢\u0006\u0003\b\u0094\u0001¢\u0006\u0003\u0010\u0095\u0001J(\u0010\u0096\u0001\u001a\u00020~2\u0007\u0010\u0097\u0001\u001a\u00020)2\u0014\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002030\u008c\u0001H\u0002J\b\u0010\u0098\u0001\u001a\u00030\u0090\u0001J\u0010\u0010\u0099\u0001\u001a\u00020~H\u0086@¢\u0006\u0003\u0010\u009a\u0001J\u0010\u0010\u009f\u0001\u001a\u00020\u001a2\u0007\u0010\u0097\u0001\u001a\u00020)J\u0010\u0010 \u0001\u001a\u00020\u001a2\u0007\u0010\u0097\u0001\u001a\u00020)J'\u0010¡\u0001\u001a\u0017\u0012\u0006\u0012\u0004\u0018\u00010?\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020~0\u0092\u00012\u0007\u0010\u0097\u0001\u001a\u00020)H\u0002J\u0093\u0001\u0010¢\u0001\u001a\u00020\u001a2\u0007\u0010\u0087\u0001\u001a\u00020)2\t\b\u0002\u0010\u0089\u0001\u001a\u00020)2\u000b\b\u0002\u0010£\u0001\u001a\u0004\u0018\u00010)2\u0016\b\u0002\u0010¤\u0001\u001a\u000f\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020~0\u008c\u00012K\u0010\u0091\u0001\u001aF\b\u0001\u0012*\u0012(\u0012\u0006\u0012\u0004\u0018\u00010?\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020~0\u0092\u0001¢\u0006\u000e\b¥\u0001\u0012\t\bj\u0012\u0005\b\b(¦\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020)0\u0093\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0092\u0001¢\u0006\u0003\u0010§\u0001J/\u0010¨\u0001\u001a\u00020\u001a2\u0007\u0010©\u0001\u001a\u00020)2\u0007\u0010ª\u0001\u001a\u00020)2\t\u0010«\u0001\u001a\u0004\u0018\u00010)2\t\u0010¬\u0001\u001a\u0004\u0018\u00010)J\u0014\u0010®\u0001\u001a\u00020~2\u000b\b\u0002\u0010¯\u0001\u001a\u0004\u0018\u00010)J\u001d\u0010°\u0001\u001a\u00020~2\u0007\u0010©\u0001\u001a\u00020)2\u000b\b\u0002\u0010ª\u0001\u001a\u0004\u0018\u00010)J\u0007\u0010±\u0001\u001a\u00020~J\n\u0010²\u0001\u001a\u00030\u0090\u0001H\u0002J\u0010\u0010³\u0001\u001a\u00020~H\u0082@¢\u0006\u0003\u0010\u009a\u0001J\b\u0010´\u0001\u001a\u00030\u0090\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR/\u0010!\u001a\u0004\u0018\u00010\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0012\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0(¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u0002000(¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002030(¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R+\u00105\u001a\u00020)2\u0006\u0010\n\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0012\u001a\u0004\b6\u00107\"\u0004\b8\u00109R+\u0010;\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\u0012\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR/\u0010@\u001a\u0004\u0018\u00010?2\b\u0010\n\u001a\u0004\u0018\u00010?8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u0012\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\b\n\u0000\u001a\u0004\bG\u0010+R+\u0010H\u001a\u00020)2\u0006\u0010\n\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010\u0012\u001a\u0004\bI\u00107\"\u0004\bJ\u00109R+\u0010L\u001a\u00020)2\u0006\u0010\n\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010\u0012\u001a\u0004\bM\u00107\"\u0004\bN\u00109R+\u0010P\u001a\u00020)2\u0006\u0010\n\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010\u0012\u001a\u0004\bQ\u00107\"\u0004\bR\u00109R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\b\n\u0000\u001a\u0004\bU\u0010+R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020W0(¢\u0006\b\n\u0000\u001a\u0004\bX\u0010+R\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010+R+\u0010[\u001a\u00020)2\u0006\u0010\n\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010\u0012\u001a\u0004\b\\\u00107\"\u0004\b]\u00109R+\u0010_\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010\u0012\u001a\u0004\b`\u0010\u001d\"\u0004\ba\u0010\u001fR+\u0010c\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010\u0012\u001a\u0004\bd\u0010\u001d\"\u0004\be\u0010\u001fR\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\b\n\u0000\u001a\u0004\bh\u0010+R\u0014\u0010k\u001a\b\u0012\u0004\u0012\u00020)0lX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010m\u001a\u0004\u0018\u00010)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u00107\"\u0004\bo\u00109R\u001a\u0010p\u001a\u00020\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u001d\"\u0004\br\u0010\u001fR\u0011\u0010u\u001a\u00020v8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0011\u0010y\u001a\u00020z¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0010\u0010\u0084\u0001\u001a\u00030\u0085\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u008d\u0001\u001a\u00030\u008e\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u009b\u0001\u001a\u00030\u009c\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u000f\u0010\u00ad\u0001\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000Ê\u0001\u000e\b¶\u0001\u0012\t\b·\u0001\u0012\u0004\b\u0003\u0010\u0000¨\u0006µ\u0001"}, d2 = {"Lcom/pymcl/android/ui/state/AppState;", "", "api", "Lcom/pymcl/android/ui/state/LauncherUiApi;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlinx/coroutines/CoroutineScope;)V", "getApi", "()Lcom/pymcl/android/ui/state/LauncherUiApi;", "<set-?>", "Lcom/pymcl/android/ui/state/UiSettings;", "settings", "getSettings", "()Lcom/pymcl/android/ui/state/UiSettings;", "setSettings", "(Lcom/pymcl/android/ui/state/UiSettings;)V", "settings$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/pymcl/android/ui/state/NavKey;", "current", "getCurrent", "()Lcom/pymcl/android/ui/state/NavKey;", "setCurrent", "(Lcom/pymcl/android/ui/state/NavKey;)V", "current$delegate", "", "navForward", "getNavForward", "()Z", "setNavForward", "(Z)V", "navForward$delegate", "sideCollapsed", "getSideCollapsed", "()Ljava/lang/Boolean;", "setSideCollapsed", "(Ljava/lang/Boolean;)V", "sideCollapsed$delegate", "expandedSections", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "getExpandedSections", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "dialogs", "Lcom/pymcl/android/ui/state/DialogSpec;", "getDialogs", "toasts", "Lcom/pymcl/android/ui/state/Toast;", "getToasts", "tasks", "Lcom/pymcl/android/ui/state/TaskRow;", "getTasks", "bridge", "getBridge", "()Ljava/lang/String;", "setBridge", "(Ljava/lang/String;)V", "bridge$delegate", "gameRunning", "getGameRunning", "setGameRunning", "gameRunning$delegate", "", "launchProgress", "getLaunchProgress", "()Ljava/lang/Float;", "setLaunchProgress", "(Ljava/lang/Float;)V", "launchProgress$delegate", "launchLog", "getLaunchLog", "selectedInstance", "getSelectedInstance", "setSelectedInstance", "selectedInstance$delegate", "selectedVersion", "getSelectedVersion", "setSelectedVersion", "selectedVersion$delegate", "activeAccount", "getActiveAccount", "setActiveAccount", "activeAccount$delegate", "instanceNames", "getInstanceNames", "installedVersions", "Lcom/pymcl/android/ui/state/InstalledVersion;", "getInstalledVersions", "accountNames", "getAccountNames", "notes", "getNotes", "setNotes", "notes$delegate", "launching", "getLaunching", "setLaunching", "launching$delegate", "dataLoaded", "getDataLoaded", "setDataLoaded", "dataLoaded$delegate", "activeInstalls", "getActiveInstalls", "installingInstance", HintConstants.AUTOFILL_HINT_NAME, "activeTaskKeys", "", "pendingLaunchServer", "getPendingLaunchServer$PyMCL_Android_app_debug", "setPendingLaunchServer$PyMCL_Android_app_debug", "pendingLaunch", "getPendingLaunch$PyMCL_Android_app_debug", "setPendingLaunch$PyMCL_Android_app_debug", "gateInput", "Lcom/pymcl/android/ui/state/LaunchGate$Input;", "launchVerdict", "Lcom/pymcl/android/ui/state/LaunchGate$Verdict;", "getLaunchVerdict", "()Lcom/pymcl/android/ui/state/LaunchGate$Verdict;", "modWatcher", "Lcom/pymcl/android/ui/state/ModUpdateWatcher;", "getModWatcher", "()Lcom/pymcl/android/ui/state/ModUpdateWatcher;", "navigate", "", "k", "d", "Lcom/pymcl/android/ui/Destination;", AbstractCircuitBreaker.PROPERTY_NAME, "close", "toastSeq", "", "toast", "title", "body", "kind", "updateSettings", "f", "Lkotlin/Function1;", "errors", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "launch", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "updateTask", "id", "refreshData", "reload", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "taskJobs", "Lcom/pymcl/android/ui/state/TaskJobs;", "getTaskJobs$PyMCL_Android_app_debug", "()Lcom/pymcl/android/ui/state/TaskJobs;", "cancelTask", "canCancel", "progressOf", "runTask", "dedupeKey", "onDone", "Lkotlin/ParameterName;", NotificationCompat.CATEGORY_PROGRESS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Z", "installVersion", "instance", "version", "loader", "loaderVersion", "userStopped", "startGame", "server", "startGameFor", "resumePendingLaunch", "watchGame", "handleGameExit", "loadInitial", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class AppState {
    public static final int $stable = 8;
    private final SnapshotStateList<String> accountNames;

    /* renamed from: activeAccount$delegate, reason: from kotlin metadata */
    private final MutableState activeAccount;
    private final SnapshotStateList<String> activeInstalls;
    private final Set<String> activeTaskKeys;
    private final LauncherUiApi api;

    /* renamed from: bridge$delegate, reason: from kotlin metadata */
    private final MutableState bridge;

    /* renamed from: current$delegate, reason: from kotlin metadata */
    private final MutableState current;

    /* renamed from: dataLoaded$delegate, reason: from kotlin metadata */
    private final MutableState dataLoaded;
    private final SnapshotStateList<DialogSpec> dialogs;
    private final CoroutineExceptionHandler errors;
    private final SnapshotStateList<String> expandedSections;

    /* renamed from: gameRunning$delegate, reason: from kotlin metadata */
    private final MutableState gameRunning;
    private final SnapshotStateList<InstalledVersion> installedVersions;
    private final SnapshotStateList<String> instanceNames;
    private final SnapshotStateList<String> launchLog;

    /* renamed from: launchProgress$delegate, reason: from kotlin metadata */
    private final MutableState launchProgress;

    /* renamed from: launching$delegate, reason: from kotlin metadata */
    private final MutableState launching;
    private final ModUpdateWatcher modWatcher;

    /* renamed from: navForward$delegate, reason: from kotlin metadata */
    private final MutableState navForward;

    /* renamed from: notes$delegate, reason: from kotlin metadata */
    private final MutableState notes;
    private boolean pendingLaunch;
    private String pendingLaunchServer;
    private final CoroutineScope scope;

    /* renamed from: selectedInstance$delegate, reason: from kotlin metadata */
    private final MutableState selectedInstance;

    /* renamed from: selectedVersion$delegate, reason: from kotlin metadata */
    private final MutableState selectedVersion;

    /* renamed from: settings$delegate, reason: from kotlin metadata */
    private final MutableState settings;

    /* renamed from: sideCollapsed$delegate, reason: from kotlin metadata */
    private final MutableState sideCollapsed;
    private final TaskJobs taskJobs;
    private final SnapshotStateList<TaskRow> tasks;
    private long toastSeq;
    private final SnapshotStateList<Toast> toasts;
    private boolean userStopped;

    /* compiled from: AppState.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LaunchGate.Action.values().length];
            try {
                iArr[LaunchGate.Action.Stop.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[LaunchGate.Action.None.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[LaunchGate.Action.DownloadGame.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[LaunchGate.Action.Repair.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[LaunchGate.Action.OpenInstances.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[LaunchGate.Action.AddAccount.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[LaunchGate.Action.Launch.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.AppState", f = "AppState.kt", i = {0}, l = {307}, m = "handleGameExit", n = {"$this$handleGameExit_u24lambda_u240\\1"}, nl = {307}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.AppState$handleGameExit$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppState.this.handleGameExit(this);
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.AppState", f = "AppState.kt", i = {0, 1, 1, 2, 2, 2}, l = {152, 155, 159}, m = "reload", n = {"$this$reload_u24lambda_u240\\1", "$this$reload_u24lambda_u240\\1", "inst\\1", "$this$reload_u24lambda_u240\\1", "inst\\1", "vers\\1"}, nl = {153, 156, 160}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.AppState$reload$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppState.this.reload(this);
        }
    }

    public AppState(LauncherUiApi api, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.api = api;
        this.scope = scope;
        this.settings = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new UiSettings(false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1, SPV.kDefaultMaxIdBound, null), null, 2, null);
        this.current = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new NavKey(Destination.Launch, null, 2, null), null, 2, null);
        this.navForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.sideCollapsed = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.expandedSections = SnapshotStateKt.mutableStateListOf("download");
        this.dialogs = SnapshotStateKt.mutableStateListOf();
        this.toasts = SnapshotStateKt.mutableStateListOf();
        this.tasks = SnapshotStateKt.mutableStateListOf();
        this.bridge = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SettingsProtocol.EXTRA_OK, null, 2, null);
        this.gameRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.launchProgress = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.launchLog = SnapshotStateKt.mutableStateListOf();
        this.selectedInstance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.selectedVersion = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.activeAccount = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.instanceNames = SnapshotStateKt.mutableStateListOf();
        this.installedVersions = SnapshotStateKt.mutableStateListOf();
        this.accountNames = SnapshotStateKt.mutableStateListOf();
        this.notes = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.launching = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.dataLoaded = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.activeInstalls = SnapshotStateKt.mutableStateListOf();
        this.activeTaskKeys = new LinkedHashSet();
        this.modWatcher = new ModUpdateWatcher(this);
        this.errors = new AppState$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this);
        this.taskJobs = new TaskJobs();
    }

    public final LauncherUiApi getApi() {
        return this.api;
    }

    public final UiSettings getSettings() {
        return (UiSettings) this.settings.getValue();
    }

    public final void setSettings(UiSettings uiSettings) {
        Intrinsics.checkNotNullParameter(uiSettings, "<set-?>");
        this.settings.setValue(uiSettings);
    }

    private final void setCurrent(NavKey navKey) {
        this.current.setValue(navKey);
    }

    public final NavKey getCurrent() {
        return (NavKey) this.current.getValue();
    }

    private final void setNavForward(boolean z) {
        this.navForward.setValue(Boolean.valueOf(z));
    }

    public final boolean getNavForward() {
        return ((Boolean) this.navForward.getValue()).booleanValue();
    }

    public final Boolean getSideCollapsed() {
        return (Boolean) this.sideCollapsed.getValue();
    }

    public final void setSideCollapsed(Boolean bool) {
        this.sideCollapsed.setValue(bool);
    }

    public final SnapshotStateList<String> getExpandedSections() {
        return this.expandedSections;
    }

    public final SnapshotStateList<DialogSpec> getDialogs() {
        return this.dialogs;
    }

    public final SnapshotStateList<Toast> getToasts() {
        return this.toasts;
    }

    public final SnapshotStateList<TaskRow> getTasks() {
        return this.tasks;
    }

    public final String getBridge() {
        return (String) this.bridge.getValue();
    }

    public final void setBridge(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bridge.setValue(str);
    }

    public final boolean getGameRunning() {
        return ((Boolean) this.gameRunning.getValue()).booleanValue();
    }

    public final void setGameRunning(boolean z) {
        this.gameRunning.setValue(Boolean.valueOf(z));
    }

    public final Float getLaunchProgress() {
        return (Float) this.launchProgress.getValue();
    }

    public final void setLaunchProgress(Float f) {
        this.launchProgress.setValue(f);
    }

    public final SnapshotStateList<String> getLaunchLog() {
        return this.launchLog;
    }

    public final String getSelectedInstance() {
        return (String) this.selectedInstance.getValue();
    }

    public final void setSelectedInstance(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedInstance.setValue(str);
    }

    public final String getSelectedVersion() {
        return (String) this.selectedVersion.getValue();
    }

    public final void setSelectedVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedVersion.setValue(str);
    }

    public final String getActiveAccount() {
        return (String) this.activeAccount.getValue();
    }

    public final void setActiveAccount(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.activeAccount.setValue(str);
    }

    public final SnapshotStateList<String> getInstanceNames() {
        return this.instanceNames;
    }

    public final SnapshotStateList<InstalledVersion> getInstalledVersions() {
        return this.installedVersions;
    }

    public final SnapshotStateList<String> getAccountNames() {
        return this.accountNames;
    }

    public final String getNotes() {
        return (String) this.notes.getValue();
    }

    public final void setNotes(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notes.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLaunching(boolean z) {
        this.launching.setValue(Boolean.valueOf(z));
    }

    public final boolean getLaunching() {
        return ((Boolean) this.launching.getValue()).booleanValue();
    }

    private final void setDataLoaded(boolean z) {
        this.dataLoaded.setValue(Boolean.valueOf(z));
    }

    public final boolean getDataLoaded() {
        return ((Boolean) this.dataLoaded.getValue()).booleanValue();
    }

    public final SnapshotStateList<String> getActiveInstalls() {
        return this.activeInstalls;
    }

    public final boolean installingInstance(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Iterable iterable = this.activeInstalls;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            if (StringsKt.startsWith$default((String) it.next(), name + "|", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getPendingLaunchServer$PyMCL_Android_app_debug, reason: from getter */
    public final String getPendingLaunchServer() {
        return this.pendingLaunchServer;
    }

    public final void setPendingLaunchServer$PyMCL_Android_app_debug(String str) {
        this.pendingLaunchServer = str;
    }

    /* renamed from: getPendingLaunch$PyMCL_Android_app_debug, reason: from getter */
    public final boolean getPendingLaunch() {
        return this.pendingLaunch;
    }

    public final void setPendingLaunch$PyMCL_Android_app_debug(boolean z) {
        this.pendingLaunch = z;
    }

    public final LaunchGate.Input gateInput() {
        List<String> list = this.instanceNames.toList();
        String selectedInstance = getSelectedInstance();
        Iterable iterable = this.installedVersions;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator<InstalledVersion> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((InstalledVersion) it.next()).getId());
        }
        ArrayList arrayList2 = (List) arrayList;
        String selectedVersion = getSelectedVersion();
        boolean z = true;
        boolean z2 = !this.accountNames.isEmpty();
        boolean gameRunning = getGameRunning();
        boolean z3 = getLaunching() || getLaunchProgress() != null;
        boolean zInstallingInstance = installingInstance(getSelectedInstance());
        Iterable iterable2 = this.installedVersions;
        Collection arrayList3 = new ArrayList();
        for (InstalledVersion installedVersion : iterable2) {
            boolean z4 = z;
            if (installedVersion.getIncomplete()) {
                arrayList3.add(installedVersion);
            }
            z = z4;
        }
        Iterable iterable3 = (List) arrayList3;
        Collection arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10));
        Iterator it2 = iterable3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((InstalledVersion) it2.next()).getId());
        }
        return new LaunchGate.Input(list, selectedInstance, arrayList2, selectedVersion, z2, gameRunning, z3, zInstallingInstance, CollectionsKt.toSet((List) arrayList4), !getDataLoaded());
    }

    public final LaunchGate.Verdict getLaunchVerdict() {
        return LaunchGate.INSTANCE.check(gateInput());
    }

    public final ModUpdateWatcher getModWatcher() {
        return this.modWatcher;
    }

    public final void navigate(NavKey k) {
        Intrinsics.checkNotNullParameter(k, "k");
        if (Intrinsics.areEqual(k, getCurrent())) {
            return;
        }
        Function1 order = new Function1() { // from class: com.pymcl.android.ui.state.AppState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(AppState.navigate$lambda$0((NavKey) obj));
            }
        };
        setNavForward(((Number) order.invoke(k)).intValue() >= ((Number) order.invoke(getCurrent())).intValue());
        setCurrent(k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int navigate$lambda$0(NavKey n) {
        Intrinsics.checkNotNullParameter(n, "n");
        int iIndexOf = Destination.getEntries().indexOf(n.getDest()) * 10;
        CatalogKind catalog = n.getCatalog();
        return iIndexOf + (catalog != null ? catalog.ordinal() : 0);
    }

    public final void navigate(Destination d) {
        Intrinsics.checkNotNullParameter(d, "d");
        navigate(new NavKey(d, d == Destination.Library ? CatalogKind.Mod : null));
    }

    public final void open(DialogSpec d) {
        Intrinsics.checkNotNullParameter(d, "d");
        this.dialogs.add(d);
    }

    public static /* synthetic */ void close$default(AppState appState, DialogSpec dialogSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            dialogSpec = null;
        }
        appState.close(dialogSpec);
    }

    public final void close(DialogSpec d) {
        SnapshotStateList<DialogSpec> snapshotStateList = this.dialogs;
        if (d == null) {
            CollectionsKt.removeLastOrNull(snapshotStateList);
        } else {
            Boolean.valueOf(snapshotStateList.remove(d));
        }
    }

    public static /* synthetic */ void toast$default(AppState appState, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = SettingsProtocol.EXTRA_OK;
        }
        appState.toast(str, str2, str3);
    }

    public final void toast(String title, String body, String kind) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.toastSeq++;
        Toast t = new Toast(this.toastSeq, title, body, kind);
        this.toasts.add(t);
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(t, null), 3, null);
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.AppState$toast$1", f = "AppState.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.AppState$toast$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Toast $t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Toast toast, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$t = toast;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppState.this.new AnonymousClass1(this.$t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (DelayKt.delay(3200L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AppState.this.getToasts().remove(this.$t);
            return Unit.INSTANCE;
        }
    }

    public final void updateSettings(Function1<? super UiSettings, UiSettings> f) {
        Intrinsics.checkNotNullParameter(f, "f");
        setSettings(f.invoke(getSettings()));
        I18n.INSTANCE.set(getSettings().getLanguage() == 1 ? I18n.Lang.En : I18n.Lang.Zh);
    }

    public final Job launch(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this.scope, this.errors, null, block, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTask(String id, Function1<? super TaskRow, TaskRow> f) {
        int i = 0;
        Iterator<TaskRow> it = this.tasks.iterator();
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((TaskRow) it.next()).getId(), id)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            this.tasks.set(i, f.invoke(this.tasks.get(i)));
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.AppState$refreshData$1", f = "AppState.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.AppState$refreshData$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppState.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (AppState.this.reload(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public final Job refreshData() {
        return BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0232 A[Catch: all -> 0x0247, TryCatch #0 {all -> 0x0247, blocks: (B:13:0x0043, B:88:0x01c7, B:89:0x01e9, B:91:0x01ef, B:92:0x0205, B:93:0x0218, B:95:0x021e, B:99:0x022e, B:101:0x0232, B:106:0x023c, B:16:0x0052, B:50:0x011e, B:55:0x0140, B:57:0x0148, B:69:0x017d, B:71:0x0183, B:60:0x0153, B:61:0x0157, B:63:0x015d, B:72:0x0186, B:77:0x0197, B:79:0x019f, B:83:0x01a8, B:84:0x01ab, B:19:0x005d, B:25:0x0079, B:26:0x009a, B:28:0x00a0, B:29:0x00b3, B:31:0x00c9, B:32:0x00d1, B:34:0x00d7, B:38:0x00e7, B:40:0x00eb, B:45:0x00fe, B:42:0x00f1, B:46:0x0101, B:22:0x0065), top: B:115:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[Catch: all -> 0x0247, LOOP:3: B:26:0x009a->B:28:0x00a0, LOOP_END, TryCatch #0 {all -> 0x0247, blocks: (B:13:0x0043, B:88:0x01c7, B:89:0x01e9, B:91:0x01ef, B:92:0x0205, B:93:0x0218, B:95:0x021e, B:99:0x022e, B:101:0x0232, B:106:0x023c, B:16:0x0052, B:50:0x011e, B:55:0x0140, B:57:0x0148, B:69:0x017d, B:71:0x0183, B:60:0x0153, B:61:0x0157, B:63:0x015d, B:72:0x0186, B:77:0x0197, B:79:0x019f, B:83:0x01a8, B:84:0x01ab, B:19:0x005d, B:25:0x0079, B:26:0x009a, B:28:0x00a0, B:29:0x00b3, B:31:0x00c9, B:32:0x00d1, B:34:0x00d7, B:38:0x00e7, B:40:0x00eb, B:45:0x00fe, B:42:0x00f1, B:46:0x0101, B:22:0x0065), top: B:115:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9 A[Catch: all -> 0x0247, TryCatch #0 {all -> 0x0247, blocks: (B:13:0x0043, B:88:0x01c7, B:89:0x01e9, B:91:0x01ef, B:92:0x0205, B:93:0x0218, B:95:0x021e, B:99:0x022e, B:101:0x0232, B:106:0x023c, B:16:0x0052, B:50:0x011e, B:55:0x0140, B:57:0x0148, B:69:0x017d, B:71:0x0183, B:60:0x0153, B:61:0x0157, B:63:0x015d, B:72:0x0186, B:77:0x0197, B:79:0x019f, B:83:0x01a8, B:84:0x01ab, B:19:0x005d, B:25:0x0079, B:26:0x009a, B:28:0x00a0, B:29:0x00b3, B:31:0x00c9, B:32:0x00d1, B:34:0x00d7, B:38:0x00e7, B:40:0x00eb, B:45:0x00fe, B:42:0x00f1, B:46:0x0101, B:22:0x0065), top: B:115:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140 A[Catch: all -> 0x0247, TryCatch #0 {all -> 0x0247, blocks: (B:13:0x0043, B:88:0x01c7, B:89:0x01e9, B:91:0x01ef, B:92:0x0205, B:93:0x0218, B:95:0x021e, B:99:0x022e, B:101:0x0232, B:106:0x023c, B:16:0x0052, B:50:0x011e, B:55:0x0140, B:57:0x0148, B:69:0x017d, B:71:0x0183, B:60:0x0153, B:61:0x0157, B:63:0x015d, B:72:0x0186, B:77:0x0197, B:79:0x019f, B:83:0x01a8, B:84:0x01ab, B:19:0x005d, B:25:0x0079, B:26:0x009a, B:28:0x00a0, B:29:0x00b3, B:31:0x00c9, B:32:0x00d1, B:34:0x00d7, B:38:0x00e7, B:40:0x00eb, B:45:0x00fe, B:42:0x00f1, B:46:0x0101, B:22:0x0065), top: B:115:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0197 A[Catch: all -> 0x0247, TryCatch #0 {all -> 0x0247, blocks: (B:13:0x0043, B:88:0x01c7, B:89:0x01e9, B:91:0x01ef, B:92:0x0205, B:93:0x0218, B:95:0x021e, B:99:0x022e, B:101:0x0232, B:106:0x023c, B:16:0x0052, B:50:0x011e, B:55:0x0140, B:57:0x0148, B:69:0x017d, B:71:0x0183, B:60:0x0153, B:61:0x0157, B:63:0x015d, B:72:0x0186, B:77:0x0197, B:79:0x019f, B:83:0x01a8, B:84:0x01ab, B:19:0x005d, B:25:0x0079, B:26:0x009a, B:28:0x00a0, B:29:0x00b3, B:31:0x00c9, B:32:0x00d1, B:34:0x00d7, B:38:0x00e7, B:40:0x00eb, B:45:0x00fe, B:42:0x00f1, B:46:0x0101, B:22:0x0065), top: B:115:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef A[Catch: all -> 0x0247, LOOP:0: B:89:0x01e9->B:91:0x01ef, LOOP_END, TryCatch #0 {all -> 0x0247, blocks: (B:13:0x0043, B:88:0x01c7, B:89:0x01e9, B:91:0x01ef, B:92:0x0205, B:93:0x0218, B:95:0x021e, B:99:0x022e, B:101:0x0232, B:106:0x023c, B:16:0x0052, B:50:0x011e, B:55:0x0140, B:57:0x0148, B:69:0x017d, B:71:0x0183, B:60:0x0153, B:61:0x0157, B:63:0x015d, B:72:0x0186, B:77:0x0197, B:79:0x019f, B:83:0x01a8, B:84:0x01ab, B:19:0x005d, B:25:0x0079, B:26:0x009a, B:28:0x00a0, B:29:0x00b3, B:31:0x00c9, B:32:0x00d1, B:34:0x00d7, B:38:0x00e7, B:40:0x00eb, B:45:0x00fe, B:42:0x00f1, B:46:0x0101, B:22:0x0065), top: B:115:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021e A[Catch: all -> 0x0247, TryCatch #0 {all -> 0x0247, blocks: (B:13:0x0043, B:88:0x01c7, B:89:0x01e9, B:91:0x01ef, B:92:0x0205, B:93:0x0218, B:95:0x021e, B:99:0x022e, B:101:0x0232, B:106:0x023c, B:16:0x0052, B:50:0x011e, B:55:0x0140, B:57:0x0148, B:69:0x017d, B:71:0x0183, B:60:0x0153, B:61:0x0157, B:63:0x015d, B:72:0x0186, B:77:0x0197, B:79:0x019f, B:83:0x01a8, B:84:0x01ab, B:19:0x005d, B:25:0x0079, B:26:0x009a, B:28:0x00a0, B:29:0x00b3, B:31:0x00c9, B:32:0x00d1, B:34:0x00d7, B:38:0x00e7, B:40:0x00eb, B:45:0x00fe, B:42:0x00f1, B:46:0x0101, B:22:0x0065), top: B:115:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reload(kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.AppState.reload(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getTaskJobs$PyMCL_Android_app_debug, reason: from getter */
    public final TaskJobs getTaskJobs() {
        return this.taskJobs;
    }

    public final boolean cancelTask(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (!this.taskJobs.cancel(id)) {
            return false;
        }
        updateTask(id, new Function1() { // from class: com.pymcl.android.ui.state.AppState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppState.cancelTask$lambda$0((TaskRow) obj);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaskRow cancelTask$lambda$0(TaskRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return TaskRow.copy$default(it, null, null, null, TaskState.Cancelled, I18nKt.tr("已取消", new Object[0]), null, 39, null);
    }

    public final boolean canCancel(String id) {
        Iterable iterable;
        Intrinsics.checkNotNullParameter(id, "id");
        if (!this.taskJobs.canCancel(id)) {
            return false;
        }
        Iterable iterable2 = this.tasks;
        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
            Iterator<TaskRow> it = iterable2.iterator();
            while (true) {
                if (it.hasNext()) {
                    TaskRow taskRow = (TaskRow) it.next();
                    if (((Intrinsics.areEqual(taskRow.getId(), id) && taskRow.getState() == TaskState.Running) ? 1 : null) != null) {
                        iterable = 1;
                        break;
                    }
                } else {
                    iterable = null;
                    break;
                }
            }
        } else {
            iterable = null;
        }
        return iterable != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function2<Float, String, Unit> progressOf(final String id) {
        return new Function2() { // from class: com.pymcl.android.ui.state.AppState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AppState.progressOf$lambda$0(this.f$0, id, (Float) obj, (String) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit progressOf$lambda$0(AppState this$0, String $id, Float p, String d) {
        Intrinsics.checkNotNullParameter(d, "d");
        BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new AppState$progressOf$1$1(this$0, $id, p, d, null), 3, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean runTask$default(AppState appState, String str, String str2, String str3, Function1 function1, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "download";
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = null;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: com.pymcl.android.ui.state.AppState$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AppState.runTask$lambda$0((String) obj2);
                }
            };
        }
        return appState.runTask(str, str4, str5, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runTask$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final boolean runTask(String title, String kind, String dedupeKey, Function1<? super String, Unit> onDone, Function2<? super Function2<? super Float, ? super String, Unit>, ? super Continuation<? super String>, ? extends Object> block) throws Throwable {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(block, "block");
        String key = dedupeKey == null ? kind + "|" + title : dedupeKey;
        synchronized (this.activeTaskKeys) {
            try {
                if (!this.activeTaskKeys.add(key)) {
                    try {
                        toast("已在队列中", I18nKt.tr("「{0}」正在进行，进度看下载任务", title), "info");
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                Unit unit = Unit.INSTANCE;
                String id = "t-" + System.nanoTime();
                this.tasks.add(0, new TaskRow(id, title, Float.valueOf(0.0f), TaskState.Running, null, kind, 16, null));
                Job job = BuildersKt__Builders_commonKt.launch$default(this.scope, null, CoroutineStart.LAZY, new AppState$runTask$job$1(block, this, id, title, onDone, key, null), 1, null);
                this.taskJobs.register(id, job);
                job.start();
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final boolean installVersion(String instance, String version, String loader, String loaderVersion) {
        String str;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        String key = InstallKeys.INSTANCE.key(instance, version, loader, loaderVersion);
        if (this.activeInstalls.contains(key)) {
            toast("已在队列中", I18nKt.tr("「{0}」正在安装，进度看下载任务", version), "info");
            return false;
        }
        this.activeInstalls.add(key);
        String id = "install-" + version + "-" + System.currentTimeMillis();
        SnapshotStateList<TaskRow> snapshotStateList = this.tasks;
        if (loader == null || (str = "-" + loader) == null) {
            str = "";
        }
        snapshotStateList.add(0, new TaskRow(id, I18nKt.tr("安装 {0}", version + str), Float.valueOf(0.0f), TaskState.Running, null, null, 48, null));
        Job job = BuildersKt__Builders_commonKt.launch$default(this.scope, null, CoroutineStart.LAZY, new AppState$installVersion$job$1(this, instance, version, loader, loaderVersion, id, key, null), 1, null);
        this.taskJobs.register(id, job);
        job.start();
        return true;
    }

    public static /* synthetic */ void startGame$default(AppState appState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        appState.startGame(str);
    }

    public final void startGame(String server) {
        LaunchGate.Verdict v = getLaunchVerdict();
        switch (WhenMappings.$EnumSwitchMapping$0[v.getAction().ordinal()]) {
            case 1:
                this.userStopped = true;
                this.api.stopGame();
                setGameRunning(false);
                setLaunchProgress(null);
                this.launchLog.add(I18nKt.tr("[PyMCL] 已停止", new Object[0]));
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(null), 3, null);
                return;
            case 2:
                toast(v.getStatus(), v.getDetail(), "info");
                return;
            case 3:
            case 4:
                toast(v.getStatus(), v.getDetail(), "warn");
                navigate(Destination.Versions);
                return;
            case 5:
                toast(v.getStatus(), v.getDetail(), "warn");
                navigate(Destination.Instances);
                return;
            case 6:
                this.pendingLaunch = true;
                this.pendingLaunchServer = server;
                open(DialogSpec.AccountGate.INSTANCE);
                return;
            case 7:
                setLaunching(true);
                String ver = v.getVersion();
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass2(ver, server, this, null), 3, null);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.AppState$startGame$1", f = "AppState.kt", i = {}, l = {245, 245}, m = "invokeSuspend", n = {}, nl = {245, -1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.AppState$startGame$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppState.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                switch(r1) {
                    case 0: goto L19;
                    case 1: goto L15;
                    case 2: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L11:
                kotlin.ResultKt.throwOnFailure(r5)
                goto L3a
            L15:
                kotlin.ResultKt.throwOnFailure(r5)
                goto L2b
            L19:
                kotlin.ResultKt.throwOnFailure(r5)
                r1 = r4
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r2 = 1
                r4.label = r2
                r2 = 800(0x320, double:3.953E-321)
                java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r2, r1)
                if (r1 != r0) goto L2b
                return r0
            L2b:
                com.pymcl.android.ui.state.AppState r1 = com.pymcl.android.ui.state.AppState.this
                r2 = r4
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3 = 2
                r4.label = r3
                java.lang.Object r1 = com.pymcl.android.ui.state.AppState.access$handleGameExit(r1, r2)
                if (r1 != r0) goto L3a
                return r0
            L3a:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.AppState.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.AppState$startGame$2", f = "AppState.kt", i = {0, 0}, l = {260}, m = "invokeSuspend", n = {"title", "id"}, nl = {264}, s = {"L$0", "L$1"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.AppState$startGame$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $server;
        final /* synthetic */ String $ver;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AppState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, AppState appState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$ver = str;
            this.$server = str2;
            this.this$0 = appState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$ver, this.$server, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x012b A[Catch: all -> 0x0028, TryCatch #5 {all -> 0x0028, blocks: (B:7:0x0020, B:30:0x011b, B:32:0x012b, B:33:0x012f, B:35:0x014e, B:36:0x0152, B:38:0x015b, B:44:0x0170, B:45:0x017a), top: B:48:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x014e A[Catch: all -> 0x0028, TryCatch #5 {all -> 0x0028, blocks: (B:7:0x0020, B:30:0x011b, B:32:0x012b, B:33:0x012f, B:35:0x014e, B:36:0x0152, B:38:0x015b, B:44:0x0170, B:45:0x017a), top: B:48:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x015b A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #5 {all -> 0x0028, blocks: (B:7:0x0020, B:30:0x011b, B:32:0x012b, B:33:0x012f, B:35:0x014e, B:36:0x0152, B:38:0x015b, B:44:0x0170, B:45:0x017a), top: B:48:0x000b }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 398
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.AppState.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(AppState this$0, String l) {
            BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new AppState$startGame$2$vid$1$1(this$0, l, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(AppState this$0, String $id, Float p) {
            BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new AppState$startGame$2$vid$2$1(this$0, p, $id, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TaskRow invokeSuspend$lambda$3(String $vid, TaskRow it) {
            return TaskRow.copy$default(it, null, I18nKt.tr("启动 {0}", $vid), Float.valueOf(1.0f), TaskState.Done, null, null, 49, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TaskRow invokeSuspend$lambda$4(TaskRow it) {
            return TaskRow.copy$default(it, null, null, null, TaskState.Cancelled, I18nKt.tr("已取消", new Object[0]), null, 39, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TaskRow invokeSuspend$lambda$5(Exception $e, TaskRow it) {
            TaskState taskState = TaskState.Failed;
            String message = $e.getMessage();
            if (message == null) {
                message = $e.toString();
            }
            return TaskRow.copy$default(it, null, null, null, taskState, message, null, 39, null);
        }
    }

    public static /* synthetic */ void startGameFor$default(AppState appState, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        appState.startGameFor(str, str2);
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.AppState$startGameFor$1", f = "AppState.kt", i = {}, l = {285}, m = "invokeSuspend", n = {}, nl = {286}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.AppState$startGameFor$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $instance;
        final /* synthetic */ String $version;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$instance = str;
            this.$version = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppState.this.new AnonymousClass1(this.$instance, this.$version, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (!Intrinsics.areEqual(AppState.this.getSelectedInstance(), this.$instance)) {
                        AppState.this.setSelectedInstance(this.$instance);
                        AppState.this.setSelectedVersion("");
                    }
                    if (this.$version != null) {
                        AppState.this.setSelectedVersion(this.$version);
                    }
                    this.label = 1;
                    if (AppState.this.reload(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AppState.startGame$default(AppState.this, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    public final void startGameFor(String instance, String version) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (!getGameRunning() && !getLaunching() && getLaunchProgress() == null) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(instance, version, null), 3, null);
        } else {
            startGame$default(this, null, 1, null);
        }
    }

    public final void resumePendingLaunch() {
        if (this.pendingLaunch) {
            this.pendingLaunch = false;
            String s = this.pendingLaunchServer;
            this.pendingLaunchServer = null;
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(s, null), 3, null);
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.AppState$resumePendingLaunch$1", f = "AppState.kt", i = {}, l = {295}, m = "invokeSuspend", n = {}, nl = {295}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.AppState$resumePendingLaunch$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $s;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppState.this.new AnonymousClass1(this.$s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (AppState.this.reload(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!AppState.this.getAccountNames().isEmpty()) {
                AppState.this.startGame(this.$s);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.AppState$watchGame$1", f = "AppState.kt", i = {}, l = {300, 301, 302}, m = "invokeSuspend", n = {}, nl = {301, 302, 303}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.AppState$watchGame$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppState.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:14:0x0039
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                switch(r1) {
                    case 0: goto L20;
                    case 1: goto L1c;
                    case 2: goto L17;
                    case 3: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L11:
                kotlin.ResultKt.throwOnFailure(r6)
                r1 = r5
                goto L87
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
                r1 = r5
                goto L56
            L1c:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L32
            L20:
                kotlin.ResultKt.throwOnFailure(r6)
                r1 = r5
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r2 = 1
                r5.label = r2
                r2 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r2, r1)
                if (r1 != r0) goto L32
                return r0
            L32:
                r1 = r5
            L33:
                com.pymcl.android.ui.state.AppState r2 = com.pymcl.android.ui.state.AppState.this
                boolean r2 = r2.getGameRunning()
                if (r2 == 0) goto L57
                com.pymcl.android.ui.state.AppState r2 = com.pymcl.android.ui.state.AppState.this
                com.pymcl.android.ui.state.LauncherUiApi r2 = r2.getApi()
                boolean r2 = r2.isGameRunning()
                if (r2 == 0) goto L57
                r2 = r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3 = 2
                r1.label = r3
                r3 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r3, r2)
                if (r2 != r0) goto L56
                return r0
            L56:
                goto L33
            L57:
                com.pymcl.android.ui.state.AppState r2 = com.pymcl.android.ui.state.AppState.this
                boolean r2 = r2.getGameRunning()
                if (r2 == 0) goto L88
                com.pymcl.android.ui.state.AppState r2 = com.pymcl.android.ui.state.AppState.this
                r3 = 0
                r2.setGameRunning(r3)
                com.pymcl.android.ui.state.AppState r2 = com.pymcl.android.ui.state.AppState.this
                androidx.compose.runtime.snapshots.SnapshotStateList r2 = r2.getLaunchLog()
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.String r4 = "[PyMCL] 游戏进程已退出"
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r3 = com.pymcl.android.ui.i18n.I18nKt.tr(r4, r3)
                r2.add(r3)
                com.pymcl.android.ui.state.AppState r2 = com.pymcl.android.ui.state.AppState.this
                r3 = r1
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r4 = 3
                r1.label = r4
                java.lang.Object r2 = com.pymcl.android.ui.state.AppState.access$handleGameExit(r2, r3)
                if (r2 != r0) goto L87
                return r0
            L87:
            L88:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.AppState.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job watchGame() {
        return BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleGameExit(kotlin.coroutines.Continuation<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.AppState.handleGameExit(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.AppState$loadInitial$1", f = "AppState.kt", i = {0, 0, 1, 2}, l = {319, 321, 323}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240\\1", "$this$launch", "$this$launch"}, nl = {319, 323, 324}, s = {"L$0", "L$1", "L$0", "L$0"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.AppState$loadInitial$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = AppState.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.AppState.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Job loadInitial() {
        return BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(null), 3, null);
    }
}
