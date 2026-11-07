package com.pymcl.android.data;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.android.data.RepositoryUiApi;
import com.pymcl.android.data.SettingsLogic;
import com.pymcl.android.ui.state.AccountRow;
import com.pymcl.android.ui.state.AiItem;
import com.pymcl.android.ui.state.CatalogFile;
import com.pymcl.android.ui.state.CatalogHit;
import com.pymcl.android.ui.state.ChatSummary;
import com.pymcl.android.ui.state.FeedbackRecord;
import com.pymcl.android.ui.state.GameExitInfo;
import com.pymcl.android.ui.state.HelpArticle;
import com.pymcl.android.ui.state.InstalledEntry;
import com.pymcl.android.ui.state.InstalledVersion;
import com.pymcl.android.ui.state.InstanceRow;
import com.pymcl.android.ui.state.JavaRow;
import com.pymcl.android.ui.state.LanWorldRow;
import com.pymcl.android.ui.state.LauncherUiApi;
import com.pymcl.android.ui.state.MpPhase;
import com.pymcl.android.ui.state.MpState;
import com.pymcl.android.ui.state.NewsItem;
import com.pymcl.android.ui.state.PermissionRule;
import com.pymcl.android.ui.state.PlaytimeRow;
import com.pymcl.android.ui.state.RemoteVersion;
import com.pymcl.android.ui.state.ServerRow;
import com.pymcl.android.ui.state.UiSettings;
import com.pymcl.core.account.Account;
import com.pymcl.core.account.AccountStore;
import com.pymcl.core.config.ConfigStore;
import com.pymcl.core.crash.CrashReason;
import com.pymcl.core.download.DownloadProgress;
import com.pymcl.core.instance.Instance;
import com.pymcl.core.instance.InstanceException;
import com.pymcl.core.instance.InstanceManager;
import com.pymcl.core.instance.ServerEntry;
import com.pymcl.core.instance.ServersStore;
import com.pymcl.core.instance.VersionSettings;
import com.pymcl.core.loader.LoaderType;
import com.pymcl.core.loader.LoaderVersion;
import com.pymcl.core.loader.LoadersKt;
import com.pymcl.core.mods.ModCatalog;
import com.pymcl.core.mods.ModFile;
import com.pymcl.core.mods.ModHit;
import com.pymcl.core.mods.ResKind;
import com.pymcl.core.net.Http;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import com.pymcl.core.version.GameDirs;
import com.pymcl.core.version.ManifestEntry;
import com.pymcl.core.version.QuickCheckResult;
import com.pymcl.core.version.ResolvedVersion;
import com.pymcl.core.version.VersionManifest;
import com.pymcl.multiplayer.LanDiscovery;
import com.pymcl.multiplayer.LanWorld;
import com.pymcl.multiplayer.MultiplayerController;
import com.pymcl.multiplayer.MultiplayerState;
import com.pymcl.multiplayer.TerracottaInterop;
import com.pymcl.multiplayer.TerracottaProfile;
import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.FclLaunchArgs;
import com.pymcl.runtime.GameLaunchRequest;
import com.pymcl.runtime.RuntimeInstaller;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.lwjgl.util.shaderc.SPV;
import org.lwjgl.util.shaderc.Shaderc;

/* compiled from: RepositoryUiApi.kt */
@Metadata(d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 Á\u00012\u00020\u0001:\u0002Á\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J2\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\u001c\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0082@¢\u0006\u0002\u0010\u0017J:\u0010\u0018\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0019\u001a\u0002H\u00122\u001c\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0082@¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0096@¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010!J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001c2\u0006\u0010%\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u000e2\u0006\u0010'\u001a\u00020(H\u0002J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001cH\u0096@¢\u0006\u0002\u0010\u001eJ\u0014\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010\u000eH\u0002J$\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u00101JN\u00102\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\u001a\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 042\u001c\u00106\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0082@¢\u0006\u0002\u00107JN\u00108\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u000e2\b\u0010:\u001a\u0004\u0018\u00010\u000e2\u001a\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 04H\u0096@¢\u0006\u0002\u0010;J\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u001cH\u0096@¢\u0006\u0002\u0010\u001eJ \u0010>\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0002\u00101J\u0016\u0010@\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010!J\u0016\u0010A\u001a\u00020 2\u0006\u0010B\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010!J\u001a\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0E0DH\u0016J&\u0010F\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010IJ&\u0010J\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010IJ(\u0010L\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010M\u001a\u0004\u0018\u00010\u000e2\u0006\u0010N\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010IJ\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u001c2\u0006\u0010Q\u001a\u00020RH\u0096@¢\u0006\u0002\u0010SJ\u001e\u0010T\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010XJ\u0018\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\f2\u0006\u00109\u001a\u00020\u000eH\u0002J\u0018\u0010Y\u001a\u00020Z2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0002J\u0010\u0010&\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0002J\u0018\u0010\\\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0002J\u001e\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000e0bH\u0002J\u0010\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020fH\u0002J\u0014\u0010g\u001a\b\u0012\u0004\u0012\u00020\u000e0bH\u0096@¢\u0006\u0002\u0010\u001eJ<\u0010h\u001a\b\u0012\u0004\u0012\u00020^0\u001c2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010j\u001a\u00020\u000e2\u0006\u0010k\u001a\u00020\u000e2\u0006\u0010l\u001a\u00020\u000e2\u0006\u0010m\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010nJ$\u0010o\u001a\b\u0012\u0004\u0012\u00020d0\u001c2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010p\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u00101JR\u0010q\u001a\u00020\u000e2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010p\u001a\u00020\u000e2\u0006\u0010r\u001a\u00020\u000e2\u001a\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 04H\u0096@¢\u0006\u0002\u0010sJ$\u0010t\u001a\b\u0012\u0004\u0012\u00020u0\u001c2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u00101J,\u0010v\u001a\b\u0012\u0004\u0012\u00020u0\u001c2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010IJ6\u0010w\u001a\u00020 2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010x\u001a\u00020\u000e2\u0006\u0010y\u001a\u00020RH\u0096@¢\u0006\u0002\u0010zJ.\u0010{\u001a\u00020 2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010x\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010|J \u0010}\u001a\u0004\u0018\u00010^2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010~\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u00101JJ\u0010\u007f\u001a\u00020\u000e2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000e2\u001a\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 04H\u0096@¢\u0006\u0002\u0010;J,\u0010\u0080\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0081\u00012\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u00101J\u001f\u0010\u0082\u0001\u001a\u00020R2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010p\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u00101JV\u0010\u0083\u0001\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0013\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 0\u00142\u0014\u00103\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020 0\u00142\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0003\u0010\u0086\u0001J#\u0010\u0087\u0001\u001a\u00020 2\u0006\u0010[\u001a\u00020\f2\u0007\u0010\u0088\u0001\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020\u000eH\u0002J\u001b\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u00012\u0007\u0010\u008c\u0001\u001a\u00020RH\u0096@¢\u0006\u0002\u0010SJ\f\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0002J\t\u0010\u008f\u0001\u001a\u00020RH\u0016J\t\u0010\u0090\u0001\u001a\u00020 H\u0016J\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010\u001cH\u0096@¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u001c2\u0006\u0010%\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010!J\u0016\u0010\u0096\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010\u001cH\u0096@¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u009c\u0001\u001a\u00030\u009d\u00012\u0007\u0010-\u001a\u00030\u009e\u0001H\u0002J\u0010\u0010\u009f\u0001\u001a\u00030\u009d\u0001H\u0096@¢\u0006\u0002\u0010\u001eJ\u0010\u0010 \u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010DH\u0016J\u0010\u0010¡\u0001\u001a\u00030\u009d\u0001H\u0096@¢\u0006\u0002\u0010\u001eJ\t\u0010¢\u0001\u001a\u00020 H\u0002J\u000f\u0010£\u0001\u001a\u00020 H\u0096@¢\u0006\u0002\u0010\u001eJ\u001a\u0010¤\u0001\u001a\u0004\u0018\u00010\u000e2\u0007\u0010¥\u0001\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010!J\u000f\u0010¦\u0001\u001a\u00020 H\u0096@¢\u0006\u0002\u0010\u001eJ\u0016\u0010§\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¨\u00010\u001c0DH\u0016J\u0014\u0010©\u0001\u001a\u0004\u0018\u00010\u000e2\u0007\u0010\u0089\u0001\u001a\u00020\u000eH\u0016J\u0016\u0010°\u0001\u001a\t\u0012\u0005\u0012\u00030±\u00010\u001cH\u0096@¢\u0006\u0002\u0010\u001eJ\u0019\u0010²\u0001\u001a\t\u0012\u0005\u0012\u00030³\u00010D2\u0007\u0010´\u0001\u001a\u00020\u000eH\u0016J\u0015\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001cH\u0096@¢\u0006\u0002\u0010\u001eJ\u0016\u0010¶\u0001\u001a\t\u0012\u0005\u0012\u00030·\u00010\u001cH\u0096@¢\u0006\u0002\u0010\u001eJ\u0010\u0010¹\u0001\u001a\u00030º\u0001H\u0096@¢\u0006\u0002\u0010\u001eJ\u0019\u0010»\u0001\u001a\u00020 2\u0007\u0010-\u001a\u00030º\u0001H\u0096@¢\u0006\u0003\u0010¼\u0001J\u0016\u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030¾\u00010\u001cH\u0096@¢\u0006\u0002\u0010\u001eJ\u0016\u0010¿\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010\u001cH\u0096@¢\u0006\u0002\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0098\u0001\u001a\u00030\u0099\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R!\u0010ª\u0001\u001a\u00030«\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0015\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\u000e\bÃ\u0001\u0012\t\bÄ\u0001\u0012\u0004\b\u0003\u0010\u0000¨\u0006Â\u0001"}, d2 = {"Lcom/pymcl/android/data/RepositoryUiApi;", "Lcom/pymcl/android/ui/state/LauncherUiApi;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "ctx", "getCtx$PyMCL_Android_app_debug", "()Landroid/content/Context;", "repo", "Lcom/pymcl/android/data/LauncherRepository;", "instOrNull", "Lcom/pymcl/core/instance/Instance;", HintConstants.AUTOFILL_HINT_NAME, "", "instExisting", "instForInstall", "io", "T", "b", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safe", "def", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listInstances", "", "Lcom/pymcl/android/ui/state/InstanceRow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInstance", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteInstance", "getInstalledVersions", "Lcom/pymcl/android/ui/state/InstalledVersion;", "instance", "loaderOf", SettingsProtocol.EXTRA_VALUE, "Lcom/pymcl/core/version/ResolvedVersion;", "getVersionList", "Lcom/pymcl/android/ui/state/RemoteVersion;", "loaderType", "Lcom/pymcl/core/loader/LoaderType;", "s", "listLoaderVersions", "loader", "mc", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withProgress", "onProgress", "Lkotlin/Function2;", "", "block", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installGame", "version", "loaderVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountRows", "Lcom/pymcl/android/ui/state/AccountRow;", "setActiveAccount", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "removeAccount", "addOfflineAccount", HintConstants.AUTOFILL_HINT_USERNAME, "startMicrosoftLogin", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "startAuthlibLogin", "api", HintConstants.AUTOFILL_HINT_PASSWORD, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startNide8Login", "serverId", "setAccountSkin", "path", "model", "getJavaList", "Lcom/pymcl/android/ui/state/JavaRow;", "scan", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadJava", "major", "", "distro", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gameDirOf", "Ljava/io/File;", "i", "mcOf", "hitOf", "Lcom/pymcl/android/ui/state/CatalogHit;", "h", "Lcom/pymcl/core/mods/ModHit;", "favs", "", "fileOf", "Lcom/pymcl/android/ui/state/CatalogFile;", "f", "Lcom/pymcl/core/mods/ModFile;", "favorites", "searchCatalog", "kind", "query", "source", "gameVersion", "category", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProjectFiles", "id", "installMod", "file", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInstalledMods", "Lcom/pymcl/android/ui/state/InstalledEntry;", "getInstalled", "setInstalledEnabled", "filename", "enabled", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteInstalled", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveCatalogLink", "url", "importLocalFile", "checkModUpdates", "", "toggleFavorite", "launchGame", "onLog", "server", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rememberLobby", "vid", "address", "collectGameExit", "Lcom/pymcl/android/ui/state/GameExitInfo;", "userStopped", "gameProcess", "Landroid/app/ActivityManager$RunningAppProcessInfo;", "isGameRunning", "stopGame", "activeAccountName", "fetchNews", "Lcom/pymcl/android/ui/state/NewsItem;", "getServers", "Lcom/pymcl/android/ui/state/ServerRow;", "getPlaytime", "Lcom/pymcl/android/ui/state/PlaytimeRow;", "mp", "Lcom/pymcl/multiplayer/MultiplayerController;", "getMp", "()Lcom/pymcl/multiplayer/MultiplayerController;", "toUi", "Lcom/pymcl/android/ui/state/MpState;", "Lcom/pymcl/multiplayer/MultiplayerState;", "terracottaState", "terracottaStates", "terracottaStart", "prepareMp", "terracottaHost", "terracottaJoin", "code", "terracottaStop", "lanWorlds", "Lcom/pymcl/android/ui/state/LanWorldRow;", "normalizeDirect", "ai", "Lcom/pymcl/android/data/AiBridge;", "getAi", "()Lcom/pymcl/android/data/AiBridge;", "ai$delegate", "Lkotlin/Lazy;", "aiListChats", "Lcom/pymcl/android/ui/state/ChatSummary;", "aiSend", "Lcom/pymcl/android/ui/state/AiItem;", TerracottaVpnService.EXTRA_TEXT, "aiListModels", "aiPermissionRules", "Lcom/pymcl/android/ui/state/PermissionRule;", "sources", "getSettings", "Lcom/pymcl/android/ui/state/UiSettings;", "saveSettings", "(Lcom/pymcl/android/ui/state/UiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedbackHistory", "Lcom/pymcl/android/ui/state/FeedbackRecord;", "helpArticles", "Lcom/pymcl/android/ui/state/HelpArticle;", "Companion", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class RepositoryUiApi implements LauncherUiApi {
    public static final String LOBBY_NAME = "陶瓦联机大厅";

    /* renamed from: ai$delegate, reason: from kotlin metadata */
    private final Lazy ai;
    private final Context ctx;
    private final LauncherRepository repo;
    private final List<String> sources;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final AtomicBoolean launchLock = new AtomicBoolean(false);
    private static final List<String> SOURCES = CollectionsKt.listOf((Object[]) new String[]{DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "official", "bmclapi"});

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi", f = "RepositoryUiApi.kt", i = {0}, l = {187}, m = "addOfflineAccount", n = {HintConstants.AUTOFILL_HINT_USERNAME}, nl = {-1}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$addOfflineAccount$1, reason: invalid class name */
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
            return RepositoryUiApi.this.addOfflineAccount(null, this);
        }
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi", f = "RepositoryUiApi.kt", i = {0}, l = {106}, m = "createInstance", n = {HintConstants.AUTOFILL_HINT_NAME}, nl = {-1}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$createInstance$1, reason: invalid class name */
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
            return RepositoryUiApi.this.createInstance(null, this);
        }
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi", f = "RepositoryUiApi.kt", i = {0, 0, 0, 0, 0, 0}, l = {231}, m = "installMod", n = {"kind", "instance", "version", "id", "file", "onProgress"}, nl = {245}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$installMod$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryUiApi.this.installMod(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi", f = "RepositoryUiApi.kt", i = {0}, l = {186}, m = "removeAccount", n = {HintConstants.AUTOFILL_HINT_NAME}, nl = {-1}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$removeAccount$1, reason: invalid class name */
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
            return RepositoryUiApi.this.removeAccount(null, this);
        }
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/pymcl/android/data/RepositoryUiApi$Companion;", "", "<init>", "()V", "LOBBY_NAME", "", "launchLock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "SOURCES", "", "findInstance", "Lcom/pymcl/core/instance/Instance;", "mgr", "Lcom/pymcl/core/instance/InstanceManager;", "defaultName", HintConstants.AUTOFILL_HINT_NAME, "missingInstanceMessage", "settingsUpdates", "", "s", "Lcom/pymcl/android/ui/state/UiSettings;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Instance findInstance(InstanceManager mgr, String defaultName, String name) {
            Object objM8116constructorimpl;
            Object objM8116constructorimpl2;
            Intrinsics.checkNotNullParameter(mgr, "mgr");
            Intrinsics.checkNotNullParameter(defaultName, "defaultName");
            Intrinsics.checkNotNullParameter(name, "name");
            String str = name;
            if (StringsKt.isBlank(str)) {
                str = defaultName;
            }
            String n = str;
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = this;
                String str2 = n;
                if (StringsKt.isBlank(str2)) {
                    str2 = null;
                }
                objM8116constructorimpl = Result.m8116constructorimpl(mgr.get(str2));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                objM8116constructorimpl = null;
            }
            Instance i = (Instance) objM8116constructorimpl;
            if (i == null || !i.getDir().isDirectory()) {
                return null;
            }
            if (Intrinsics.areEqual(i.getDir(), mgr.getRootDir())) {
                return i;
            }
            Companion companion4 = RepositoryUiApi.INSTANCE;
            try {
                Result.Companion companion5 = Result.INSTANCE;
                objM8116constructorimpl2 = Result.m8116constructorimpl(Boolean.valueOf(mgr.list().contains(i.getName())));
            } catch (Throwable th2) {
                Result.Companion companion6 = Result.INSTANCE;
                objM8116constructorimpl2 = Result.m8116constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m8122isFailureimpl(objM8116constructorimpl2)) {
                objM8116constructorimpl2 = false;
            }
            if (((Boolean) objM8116constructorimpl2).booleanValue()) {
                return i;
            }
            return null;
        }

        public final String missingInstanceMessage(String name, String defaultName) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(defaultName, "defaultName");
            String str = name;
            if (StringsKt.isBlank(str)) {
                str = defaultName;
            }
            String str2 = str;
            if (StringsKt.isBlank(str2)) {
                str2 = "默认";
            }
            return "实例「" + ((Object) str2) + "」不存在（可能已被删除），请先在实例页新建或选择一个实例";
        }

        public final Map<String, Object> settingsUpdates(UiSettings s) {
            Intrinsics.checkNotNullParameter(s, "s");
            Pair[] pairArr = new Pair[30];
            boolean z = false;
            pairArr[0] = TuplesKt.to("ui_dark", Boolean.valueOf(s.getDark()));
            pairArr[1] = TuplesKt.to("ui_motion", Boolean.valueOf(s.getMotion()));
            pairArr[2] = TuplesKt.to("ui_fly_animation", Boolean.valueOf(s.getFlyAnimation()));
            pairArr[3] = TuplesKt.to("ui_fly_duration_ms", Long.valueOf(s.getFlyDurationMs()));
            pairArr[4] = TuplesKt.to("ui_nav_style", s.getNavStyle() == 1 ? "compact" : "grouped");
            pairArr[5] = TuplesKt.to("ui_background", s.getWallpaperPath());
            pairArr[6] = TuplesKt.to("ui_background_folder", s.getWallpaperFolder());
            pairArr[7] = TuplesKt.to("ui_background_shuffle", Boolean.valueOf(s.getWallpaperRandom()));
            pairArr[8] = TuplesKt.to("ui_background_interval", Long.valueOf(s.getWallpaperInterval()));
            pairArr[9] = TuplesKt.to("ui_background_blur", Long.valueOf(s.getWallpaperBlur()));
            pairArr[10] = TuplesKt.to("ui_background_dim", Long.valueOf(s.getWallpaperMask()));
            pairArr[11] = TuplesKt.to("download_threads", Long.valueOf(s.getThreads()));
            pairArr[12] = TuplesKt.to("download_segments", Long.valueOf(s.getChunks()));
            List list = RepositoryUiApi.SOURCES;
            int fileSource = s.getFileSource();
            boolean z2 = fileSource >= 0 && fileSource < list.size();
            Object obj = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            pairArr[13] = TuplesKt.to("download_source", z2 ? list.get(fileSource) : DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            List list2 = RepositoryUiApi.SOURCES;
            int communitySource = s.getCommunitySource();
            if (communitySource >= 0 && communitySource < list2.size()) {
                z = true;
            }
            if (z) {
                obj = list2.get(communitySource);
            }
            pairArr[14] = TuplesKt.to("community_source", obj);
            pairArr[15] = TuplesKt.to("use_system_proxy", Boolean.valueOf(s.getSystemProxy()));
            pairArr[16] = TuplesKt.to("download_limit_kbps", Long.valueOf(s.getSpeedLimit()));
            pairArr[17] = TuplesKt.to("curseforge_api_key", s.getCurseforgeKey());
            pairArr[18] = TuplesKt.to("memory_mb", Long.valueOf(s.getMemoryMb()));
            pairArr[19] = TuplesKt.to("width", Long.valueOf(s.getWidth()));
            pairArr[20] = TuplesKt.to("height", Long.valueOf(s.getHeight()));
            pairArr[21] = TuplesKt.to("default_jvm_args", s.getJvmArgs());
            pairArr[22] = TuplesKt.to("allow_multi_instance", Boolean.valueOf(s.getAllowMulti()));
            pairArr[23] = TuplesKt.to("shared_libraries", Boolean.valueOf(s.getSharedLibraries()));
            pairArr[24] = TuplesKt.to("shared_assets", Boolean.valueOf(s.getSharedAssets()));
            pairArr[25] = TuplesKt.to("auto_check_update", Boolean.valueOf(s.getAutoUpdate()));
            pairArr[26] = TuplesKt.to("update_url", s.getUpdateUrl());
            pairArr[27] = TuplesKt.to("custom_homepage", s.getCustomHomepage());
            pairArr[28] = TuplesKt.to("language", s.getLanguage() == 1 ? "en_US" : "zh_CN");
            pairArr[29] = TuplesKt.to("first_run", Boolean.valueOf(s.getFirstRun()));
            return MapsKt.plus(MapsKt.mapOf(pairArr), !StringsKt.isBlank(s.getMsClientId()) ? MapsKt.mapOf(TuplesKt.to("microsoft_client_id", s.getMsClientId())) : MapsKt.emptyMap());
        }
    }

    public RepositoryUiApi(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.ctx = applicationContext;
        this.repo = LauncherRepository.INSTANCE.get(this.ctx);
        this.ai = LazyKt.lazy(new Function0() { // from class: com.pymcl.android.data.RepositoryUiApi$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RepositoryUiApi.ai_delegate$lambda$0(this.f$0);
            }
        });
        this.sources = CollectionsKt.listOf((Object[]) new String[]{DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "official", "bmclapi"});
    }

    /* renamed from: getCtx$PyMCL_Android_app_debug, reason: from getter */
    public final Context getCtx() {
        return this.ctx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Instance instOrNull(String name) {
        return INSTANCE.findInstance(this.repo.getInstances(), this.repo.getConfig().string("default_instance"), name);
    }

    private final Instance instExisting(String name) {
        Instance instanceInstOrNull = instOrNull(name);
        if (instanceInstOrNull != null) {
            return instanceInstOrNull;
        }
        throw new IllegalStateException(INSTANCE.missingInstanceMessage(name, this.repo.getConfig().string("default_instance")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Instance instForInstall(String name) {
        Instance instanceInstOrNull = instOrNull(name);
        if (instanceInstOrNull != null) {
            return instanceInstOrNull;
        }
        if (StringsKt.isBlank(name)) {
            Instance instanceCurrentInstance = this.repo.currentInstance();
            if (instanceCurrentInstance.getDir().isDirectory()) {
                return instanceCurrentInstance;
            }
            Instance.create$default(instanceCurrentInstance, null, 1, null);
            return instanceCurrentInstance;
        }
        Instance instance = this.repo.getInstances().get(name);
        Instance.create$default(instance, null, 1, null);
        return instance;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$io$2", f = "RepositoryUiApi.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$io$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $b;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Function1<Continuation<? super T>, Object> function1 = this.$b;
                    this.label = 1;
                    Object objInvoke = function1.invoke(this);
                    return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object io(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(function1, null), continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$safe$2", f = "RepositoryUiApi.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$safe$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $b;
        final /* synthetic */ T $def;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super Continuation<? super T>, ? extends Object> function1, T t, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$b = function1;
            this.$def = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$b, this.$def, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objInvoke;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Function1<Continuation<? super T>, Object> function1 = this.$b;
                        this.label = 1;
                        objInvoke = function1.invoke(this);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        objInvoke = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return objInvoke;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Log.w("PyMCL", "ui api", e2);
                return this.$def;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object safe(T t, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(function1, t, null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/InstanceRow;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$listInstances$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$listInstances$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends InstanceRow>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends InstanceRow>> continuation) {
            return invoke2((Continuation<? super List<InstanceRow>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<InstanceRow>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RepositoryUiApi.this.repo.getInstances().ensureRoot();
                    String strString = RepositoryUiApi.this.repo.getConfig().string("default_instance");
                    RepositoryUiApi repositoryUiApi = RepositoryUiApi.this;
                    if (strString.length() == 0) {
                        strString = repositoryUiApi.repo.getInstances().getRootName();
                    }
                    String def = strString;
                    Iterable<String> list = RepositoryUiApi.this.repo.getInstances().list();
                    RepositoryUiApi repositoryUiApi2 = RepositoryUiApi.this;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (String str : list) {
                        Instance instance = repositoryUiApi2.repo.getInstances().get(str);
                        int size = instance.versions().size();
                        boolean zAreEqual = Intrinsics.areEqual(str, def);
                        String def2 = def;
                        String str2 = JsonKt.str(instance.meta(), "java");
                        if (str2 == null) {
                            str2 = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                        }
                        arrayList.add(new InstanceRow(str, size, zAreEqual, str2));
                        def = def2;
                    }
                    return (List) arrayList;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object listInstances(Continuation<? super List<InstanceRow>> continuation) {
        return safe(CollectionsKt.emptyList(), new AnonymousClass2(null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/core/instance/Instance;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$createInstance$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$createInstance$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Instance>, Object> {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Instance> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return InstanceManager.createUnique$default(RepositoryUiApi.this.repo.getInstances(), this.$name, null, 2, null);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$deleteInstance$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$deleteInstance$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws InstanceException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RepositoryUiApi.this.repo.getInstances().delete(this.$name);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.ui.state.LauncherUiApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createInstance(java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.pymcl.android.data.RepositoryUiApi.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            com.pymcl.android.data.RepositoryUiApi$createInstance$1 r0 = (com.pymcl.android.data.RepositoryUiApi.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.RepositoryUiApi$createInstance$1 r0 = new com.pymcl.android.data.RepositoryUiApi$createInstance$1
            r0.<init>(r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r1)
            goto L50
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.android.data.RepositoryUiApi$createInstance$2 r3 = new com.pymcl.android.data.RepositoryUiApi$createInstance$2
            r4 = 0
            r3.<init>(r6, r4)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r4
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r5.io(r3, r0)
            if (r3 != r2) goto L50
            return r2
        L50:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi.createInstance(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object deleteInstance(String name, Continuation<? super Unit> continuation) {
        Object objIo = io(new AnonymousClass2(name, null), continuation);
        return objIo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objIo : Unit.INSTANCE;
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/InstalledVersion;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$getInstalledVersions$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$getInstalledVersions$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends InstalledVersion>>, Object> {
        final /* synthetic */ String $instance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$instance = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$instance, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends InstalledVersion>> continuation) {
            return invoke2((Continuation<? super List<InstalledVersion>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<InstalledVersion>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objM8116constructorimpl;
            String str;
            String str2;
            String mcVersion;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Instance i = RepositoryUiApi.this.instOrNull(this.$instance);
                    if (i == null) {
                        return CollectionsKt.emptyList();
                    }
                    GameDirs d = RepositoryUiApi.this.repo.dirsFor(i);
                    Iterable<String> iterableVersions = i.versions();
                    RepositoryUiApi repositoryUiApi = RepositoryUiApi.this;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableVersions, 10));
                    for (String str3 : iterableVersions) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM8116constructorimpl = Result.m8116constructorimpl(ResolvedVersion.Companion.load$default(ResolvedVersion.Companion, d.getVersionsDir(), str3, 0, 4, null));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                            objM8116constructorimpl = null;
                        }
                        ResolvedVersion resolvedVersion = (ResolvedVersion) objM8116constructorimpl;
                        VersionSettings versionSettings = i.settings(str3, repositoryUiApi.repo.getConfig());
                        if (resolvedVersion == null || (mcVersion = resolvedVersion.getMcVersion()) == null) {
                            str = null;
                            str2 = str3;
                        } else {
                            str3 = mcVersion;
                            str = null;
                            str2 = str3;
                        }
                        arrayList.add(new InstalledVersion(str2, str3, resolvedVersion != null ? repositoryUiApi.loaderOf(resolvedVersion) : str, !Intrinsics.areEqual(versionSettings.isolation(), "none"), Intrinsics.areEqual(JsonKt.bool(versionSettings.load(), "hidden"), Boxing.boxBoolean(true)), resolvedVersion == null));
                    }
                    return (List) arrayList;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getInstalledVersions(String instance, Continuation<? super List<InstalledVersion>> continuation) {
        return safe(CollectionsKt.emptyList(), new AnonymousClass2(instance, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String loaderOf(ResolvedVersion v) {
        Iterable iterable;
        Iterable iterable2;
        Iterable iterable3;
        Iterable iterable4;
        Iterable iterable5;
        Iterable iterableObjs = JsonKt.objs(JsonKt.arr(v.getJson(), "libraries"));
        Collection arrayList = new ArrayList();
        Iterator it = iterableObjs.iterator();
        while (it.hasNext()) {
            String str = JsonKt.str((Map) it.next(), HintConstants.AUTOFILL_HINT_NAME);
            if (str != null) {
                arrayList.add(str);
            }
        }
        Iterable libs = (List) arrayList;
        Iterable iterable6 = libs;
        boolean z = true;
        if (!(iterable6 instanceof Collection) || !((Collection) iterable6).isEmpty()) {
            Iterator it2 = iterable6.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    iterable = null;
                    break;
                }
                if (StringsKt.startsWith$default((String) it2.next(), "net.neoforged", false, 2, (Object) null)) {
                    iterable = 1;
                    break;
                }
            }
        } else {
            iterable = null;
        }
        if (iterable != null) {
            return "NeoForge";
        }
        Iterable iterable7 = libs;
        if (!(iterable7 instanceof Collection) || !((Collection) iterable7).isEmpty()) {
            Iterator it3 = iterable7.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    iterable2 = null;
                    break;
                }
                String str2 = (String) it3.next();
                if (((StringsKt.startsWith$default(str2, "net.minecraftforge:forge", false, 2, (Object) null) || StringsKt.startsWith$default(str2, "net.minecraftforge:fmlloader", false, 2, (Object) null)) ? 1 : null) != null) {
                    iterable2 = 1;
                    break;
                }
            }
        } else {
            iterable2 = null;
        }
        if (iterable2 != null || StringsKt.contains$default((CharSequence) v.getMainClass(), (CharSequence) "bootstraplauncher", false, 2, (Object) null)) {
            return "Forge";
        }
        Iterable iterable8 = libs;
        if (!(iterable8 instanceof Collection) || !((Collection) iterable8).isEmpty()) {
            Iterator it4 = iterable8.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    iterable3 = null;
                    break;
                }
                if (StringsKt.startsWith$default((String) it4.next(), "org.quiltmc:quilt-loader", false, 2, (Object) null)) {
                    iterable3 = 1;
                    break;
                }
            }
        } else {
            iterable3 = null;
        }
        if (iterable3 != null) {
            return "Quilt";
        }
        Iterable iterable9 = libs;
        if (!(iterable9 instanceof Collection) || !((Collection) iterable9).isEmpty()) {
            Iterator it5 = iterable9.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    iterable4 = null;
                    break;
                }
                if (StringsKt.startsWith$default((String) it5.next(), "net.fabricmc:fabric-loader", false, 2, (Object) null)) {
                    iterable4 = 1;
                    break;
                }
            }
        } else {
            iterable4 = null;
        }
        if (iterable4 != null) {
            return "Fabric";
        }
        Iterable iterable10 = libs;
        if (!(iterable10 instanceof Collection) || !((Collection) iterable10).isEmpty()) {
            Iterator it6 = iterable10.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    iterable5 = null;
                    break;
                }
                if (StringsKt.startsWith$default((String) it6.next(), "optifine:", false, 2, (Object) null)) {
                    iterable5 = 1;
                    break;
                }
            }
        } else {
            iterable5 = null;
        }
        if (iterable5 != null) {
            return "OptiFine";
        }
        Iterable iterable11 = libs;
        if (!(iterable11 instanceof Collection) || !((Collection) iterable11).isEmpty()) {
            Iterator it7 = iterable11.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    z = false;
                    break;
                }
                if (StringsKt.startsWith$default((String) it7.next(), "com.mumfrey:liteloader", false, 2, (Object) null)) {
                    break;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            return "LiteLoader";
        }
        return null;
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/RemoteVersion;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$getVersionList$2", f = "RepositoryUiApi.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, nl = {133}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$getVersionList$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends RemoteVersion>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends RemoteVersion>> continuation) {
            return invoke2((Continuation<? super List<RemoteVersion>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<RemoteVersion>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objVersionManifest$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objVersionManifest$default = LauncherRepository.versionManifest$default(RepositoryUiApi.this.repo, false, this, 1, null);
                    if (objVersionManifest$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objVersionManifest$default = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            VersionManifest m = (VersionManifest) objVersionManifest$default;
            Iterable<ManifestEntry> versions = m.getVersions();
            int i = 10;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(versions, 10));
            for (ManifestEntry manifestEntry : versions) {
                arrayList.add(new RemoteVersion(manifestEntry.getId(), manifestEntry.getType(), StringsKt.take(manifestEntry.getReleaseTime(), i), Intrinsics.areEqual(manifestEntry.getId(), m.getLatestRelease()) || Intrinsics.areEqual(manifestEntry.getId(), m.getLatestSnapshot())));
                i = 10;
            }
            return (List) arrayList;
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getVersionList(Continuation<? super List<RemoteVersion>> continuation) {
        return safe(CollectionsKt.emptyList(), new AnonymousClass2(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoaderType loaderType(String s) {
        String lowerCase;
        if (s != null) {
            lowerCase = s.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            return null;
        }
        switch (lowerCase.hashCode()) {
            case -1904204223:
                if (lowerCase.equals("liteloader")) {
                    return LoaderType.LITELOADER;
                }
                return null;
            case -1282179931:
                if (lowerCase.equals("fabric")) {
                    return LoaderType.FABRIC;
                }
                return null;
            case -79289648:
                if (lowerCase.equals("optifine")) {
                    return LoaderType.OPTIFINE;
                }
                return null;
            case 97618791:
                if (lowerCase.equals("forge")) {
                    return LoaderType.FORGE;
                }
                return null;
            case 107947789:
                if (lowerCase.equals("quilt")) {
                    return LoaderType.QUILT;
                }
                return null;
            case 1154621647:
                if (lowerCase.equals("neoforge")) {
                    return LoaderType.NEOFORGE;
                }
                return null;
            default:
                return null;
        }
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$listLoaderVersions$2", f = "RepositoryUiApi.kt", i = {0, 0}, l = {143}, m = "invokeSuspend", n = {"t", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {496}, s = {"L$0", "L$1"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$listLoaderVersions$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends String>>, Object> {
        final /* synthetic */ String $loader;
        final /* synthetic */ String $mc;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$loader = str;
            this.$mc = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$loader, this.$mc, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends String>> continuation) {
            return invoke2((Continuation<? super List<String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<String>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objM8116constructorimpl;
            LoaderType t;
            Object objLoaderVersions;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        LoaderType loaderType = RepositoryUiApi.this.loaderType(this.$loader);
                        if (loaderType == null) {
                            return CollectionsKt.emptyList();
                        }
                        t = loaderType;
                        RepositoryUiApi repositoryUiApi = RepositoryUiApi.this;
                        String str = this.$mc;
                        Result.Companion companion = Result.INSTANCE;
                        LauncherRepository launcherRepository = repositoryUiApi.repo;
                        this.L$0 = t;
                        this.L$1 = SpillingKt.nullOutSpilledVariable(repositoryUiApi);
                        this.label = 1;
                        objLoaderVersions = launcherRepository.loaderVersions(t, str, this);
                        if (objLoaderVersions == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        t = (LoaderType) this.L$0;
                        ResultKt.throwOnFailure($result);
                        objLoaderVersions = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterable iterable = (Iterable) objLoaderVersions;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((LoaderVersion) it.next()).getVersion());
                }
                objM8116constructorimpl = Result.m8116constructorimpl((List) arrayList);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            List listEmptyList = CollectionsKt.emptyList();
            if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                objM8116constructorimpl = listEmptyList;
            }
            Iterable<String> vs = (List) objM8116constructorimpl;
            if (t != LoaderType.OPTIFINE) {
                return vs;
            }
            Collection arrayList2 = new ArrayList();
            for (String str2 : vs) {
                CollectionsKt.addAll(arrayList2, CollectionsKt.listOf((Object[]) new String[]{str2, str2 + LoadersKt.OPTIFINE_MOD_SUFFIX}));
            }
            return (List) arrayList2;
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object listLoaderVersions(String loader, String mc, Continuation<? super List<String>> continuation) {
        return io(new AnonymousClass2(loader, mc, null), continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$withProgress$2", f = "RepositoryUiApi.kt", i = {0, 0}, l = {151}, m = "invokeSuspend", n = {"$this$coroutineScope", "job"}, nl = {-1}, s = {"L$0", "L$1"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$withProgress$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
        final /* synthetic */ Function2<Float, String, Unit> $onProgress;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ RepositoryUiApi this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super Continuation<? super T>, ? extends Object> function1, RepositoryUiApi repositoryUiApi, Function2<? super Float, ? super String, Unit> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function1;
            this.this$0 = repositoryUiApi;
            this.$onProgress = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, this.$onProgress, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objInvoke;
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r2 = this.label;
            try {
                switch (r2) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RepositoryUiApi$withProgress$2$job$1(this.this$0, this.$onProgress, null), 3, null);
                        Function1<Continuation<? super T>, Object> function1 = this.$block;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                        this.L$1 = jobLaunch$default;
                        this.label = 1;
                        objInvoke = function1.invoke(this);
                        r2 = jobLaunch$default;
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        Job job = (Job) this.L$1;
                        ResultKt.throwOnFailure(obj);
                        objInvoke = obj;
                        r2 = job;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return objInvoke;
            } finally {
                Job.DefaultImpls.cancel$default((Job) r2, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object withProgress(Function2<? super Float, ? super String, Unit> function2, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        return CoroutineScopeKt.coroutineScope(new AnonymousClass2(function1, this, function2, null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$installGame$2", f = "RepositoryUiApi.kt", i = {0}, l = {156}, m = "invokeSuspend", n = {"i"}, nl = {172}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$installGame$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $instance;
        final /* synthetic */ String $loader;
        final /* synthetic */ String $loaderVersion;
        final /* synthetic */ Function2<Float, String, Unit> $onProgress;
        final /* synthetic */ String $version;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, Function2<? super Float, ? super String, Unit> function2, String str2, String str3, String str4, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$instance = str;
            this.$onProgress = function2;
            this.$version = str2;
            this.$loader = str3;
            this.$loaderVersion = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$instance, this.$onProgress, this.$version, this.$loader, this.$loaderVersion, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Instance i = RepositoryUiApi.this.instForInstall(this.$instance);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(i);
                    this.label = 1;
                    Object objWithProgress = RepositoryUiApi.this.withProgress(this.$onProgress, new AnonymousClass1(RepositoryUiApi.this, this.$version, i, this.$loader, this.$loaderVersion, this.$onProgress, null), this);
                    if (objWithProgress == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objWithProgress;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: RepositoryUiApi.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
        @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$installGame$2$1", f = "RepositoryUiApi.kt", i = {1, 2, 2, 2, 2, 2, 3, 3}, l = {157, 160, 169, 170}, m = "invokeSuspend", n = {"t", "t", "lv", "d", "forgeId", "mods", "t", "lv"}, nl = {158, 161, 170, 171}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"}, v = 2)
        /* renamed from: com.pymcl.android.data.RepositoryUiApi$installGame$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
            final /* synthetic */ Instance $i;
            final /* synthetic */ String $loader;
            final /* synthetic */ String $loaderVersion;
            final /* synthetic */ Function2<Float, String, Unit> $onProgress;
            final /* synthetic */ String $version;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;
            final /* synthetic */ RepositoryUiApi this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(RepositoryUiApi repositoryUiApi, String str, Instance instance, String str2, String str3, Function2<? super Float, ? super String, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = repositoryUiApi;
                this.$version = str;
                this.$i = instance;
                this.$loader = str2;
                this.$loaderVersion = str3;
                this.$onProgress = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$version, this.$i, this.$loader, this.$loaderVersion, this.$onProgress, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super String> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
            
                if (r6 == null) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0164 A[LOOP:0: B:34:0x00fc->B:59:0x0164, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0212  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0162 A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r25) {
                /*
                    Method dump skipped, instructions count: 584
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object installGame(String instance, String version, String loader, String loaderVersion, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return io(new AnonymousClass2(instance, function2, version, loader, loaderVersion, null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/AccountRow;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$getAccountRows$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$getAccountRows$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends AccountRow>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends AccountRow>> continuation) {
            return invoke2((Continuation<? super List<AccountRow>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<AccountRow>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            String activeName;
            Object next;
            String name;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Pair<String, List<Account>> pairLoad = RepositoryUiApi.this.repo.getAccounts().load();
                    String act = pairLoad.component1();
                    List list = pairLoad.component2();
                    Iterator it = list.iterator();
                    while (true) {
                        activeName = null;
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.areEqual(((Account) next).getName(), act)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Account account = (Account) next;
                    if (account == null || (name = account.getName()) == null) {
                        Account account2 = (Account) CollectionsKt.firstOrNull(list);
                        if (account2 != null) {
                            activeName = account2.getName();
                        }
                    } else {
                        activeName = name;
                    }
                    List<Account> list2 = list;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (Account account3 : list2) {
                        String name2 = account3.getName();
                        String id = account3.getType().getId();
                        boolean zAreEqual = Intrinsics.areEqual(account3.getName(), activeName);
                        String strReplace$default = StringsKt.replace$default(account3.getUuid(), "-", "", false, 4, (Object) null);
                        List list3 = list;
                        String str = JsonKt.str(account3.getRaw(), "skin_model");
                        if (str == null) {
                            str = "classic";
                        }
                        arrayList.add(new AccountRow(name2, id, zAreEqual, strReplace$default, str));
                        list = list3;
                    }
                    return (List) arrayList;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getAccountRows(Continuation<? super List<AccountRow>> continuation) {
        return safe(CollectionsKt.emptyList(), new AnonymousClass2(null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$setActiveAccount$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$setActiveAccount$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $name;
        final /* synthetic */ String $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$name = str;
            this.$type = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$name, this.$type, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Iterable list = RepositoryUiApi.this.repo.getAccounts().list();
                    String str = this.$name;
                    String str2 = this.$type;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            Account account = (Account) next;
                            if (Intrinsics.areEqual(account.getName(), str) && (str2 == null || Intrinsics.areEqual(account.getType().getId(), str2))) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Account acc = (Account) next;
                    AccountStore accounts = RepositoryUiApi.this.repo.getAccounts();
                    if (acc != null) {
                        accounts.setActive(acc);
                    } else {
                        accounts.setActive(this.$name);
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object setActiveAccount(String name, String type, Continuation<? super Unit> continuation) {
        Object objIo = io(new AnonymousClass2(name, type, null), continuation);
        return objIo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objIo : Unit.INSTANCE;
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$removeAccount$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$removeAccount$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Iterable list = RepositoryUiApi.this.repo.getAccounts().list();
                    String str = this.$name;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.areEqual(((Account) next).getName(), str)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Account account = (Account) next;
                    if (account == null) {
                        return null;
                    }
                    RepositoryUiApi.this.repo.getAccounts().remove(account.getKey());
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/core/account/Account;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$addOfflineAccount$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$addOfflineAccount$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Account>, Object> {
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$username = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$username, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Account> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return LauncherRepository.addOffline$default(RepositoryUiApi.this.repo, this.$username, null, 2, null);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.ui.state.LauncherUiApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object removeAccount(java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.pymcl.android.data.RepositoryUiApi.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            com.pymcl.android.data.RepositoryUiApi$removeAccount$1 r0 = (com.pymcl.android.data.RepositoryUiApi.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.RepositoryUiApi$removeAccount$1 r0 = new com.pymcl.android.data.RepositoryUiApi$removeAccount$1
            r0.<init>(r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r1)
            goto L50
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.android.data.RepositoryUiApi$removeAccount$2 r3 = new com.pymcl.android.data.RepositoryUiApi$removeAccount$2
            r4 = 0
            r3.<init>(r6, r4)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r4
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r5.io(r3, r0)
            if (r3 != r2) goto L50
            return r2
        L50:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi.removeAccount(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/Pair;", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$startMicrosoftLogin$1", f = "RepositoryUiApi.kt", i = {0, 0, 0}, l = {197}, m = "invokeSuspend", n = {"$this$channelFlow", "cancelled", "job"}, nl = {198}, s = {"L$0", "L$1", "L$2"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$startMicrosoftLogin$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super Pair<? extends String, ? extends String>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = RepositoryUiApi.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ProducerScope<? super Pair<? extends String, ? extends String>> producerScope, Continuation<? super Unit> continuation) {
            return invoke2((ProducerScope<? super Pair<String, String>>) producerScope, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ProducerScope<? super Pair<String, String>> producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            ProducerScope $this$channelFlow = (ProducerScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    final Ref.BooleanRef cancelled = new Ref.BooleanRef();
                    final Job job = BuildersKt__Builders_commonKt.launch$default($this$channelFlow, Dispatchers.getIO(), null, new RepositoryUiApi$startMicrosoftLogin$1$job$1(RepositoryUiApi.this, $this$channelFlow, cancelled, null), 2, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable($this$channelFlow);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(cancelled);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(job);
                    this.label = 1;
                    if (ProduceKt.awaitClose($this$channelFlow, new Function0() { // from class: com.pymcl.android.data.RepositoryUiApi$startMicrosoftLogin$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RepositoryUiApi.AnonymousClass1.invokeSuspend$lambda$0(cancelled, job);
                        }
                    }, this) != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Ref.BooleanRef $cancelled, Job $job) {
            $cancelled.element = true;
            Job.DefaultImpls.cancel$default($job, (CancellationException) null, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.ui.state.LauncherUiApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object addOfflineAccount(java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.pymcl.android.data.RepositoryUiApi.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            com.pymcl.android.data.RepositoryUiApi$addOfflineAccount$1 r0 = (com.pymcl.android.data.RepositoryUiApi.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.RepositoryUiApi$addOfflineAccount$1 r0 = new com.pymcl.android.data.RepositoryUiApi$addOfflineAccount$1
            r0.<init>(r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r1)
            goto L50
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.android.data.RepositoryUiApi$addOfflineAccount$2 r3 = new com.pymcl.android.data.RepositoryUiApi$addOfflineAccount$2
            r4 = 0
            r3.<init>(r6, r4)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r4
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r5.io(r3, r0)
            if (r3 != r2) goto L50
            return r2
        L50:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi.addOfflineAccount(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Flow<Pair<String, String>> startMicrosoftLogin() {
        return FlowKt.channelFlow(new AnonymousClass1(null));
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$startAuthlibLogin$2", f = "RepositoryUiApi.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$startAuthlibLogin$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $api;
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, String str3, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$api = str;
            this.$username = str2;
            this.$password = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$api, this.$username, this.$password, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence invokeSuspend$lambda$0(Account it) {
            return it.getName();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objLoginAuthlib;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objLoginAuthlib = RepositoryUiApi.this.repo.loginAuthlib(this.$api, this.$username, this.$password, this);
                    if (objLoginAuthlib == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objLoginAuthlib = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return CollectionsKt.joinToString$default((Iterable) objLoginAuthlib, null, null, null, 0, null, new Function1() { // from class: com.pymcl.android.data.RepositoryUiApi$startAuthlibLogin$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RepositoryUiApi.AnonymousClass2.invokeSuspend$lambda$0((Account) obj);
                }
            }, 31, null);
        }
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$startNide8Login$2", f = "RepositoryUiApi.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$startNide8Login$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $password;
        final /* synthetic */ String $serverId;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, String str3, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$serverId = str;
            this.$username = str2;
            this.$password = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$serverId, this.$username, this.$password, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence invokeSuspend$lambda$0(Account it) {
            return it.getName();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objLoginNide8;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objLoginNide8 = RepositoryUiApi.this.repo.loginNide8(this.$serverId, this.$username, this.$password, this);
                    if (objLoginNide8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objLoginNide8 = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return CollectionsKt.joinToString$default((Iterable) objLoginNide8, null, null, null, 0, null, new Function1() { // from class: com.pymcl.android.data.RepositoryUiApi$startNide8Login$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RepositoryUiApi.AnonymousClass2.invokeSuspend$lambda$0((Account) obj);
                }
            }, 31, null);
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object startAuthlibLogin(String api, String username, String password, Continuation<? super String> continuation) {
        return io(new AnonymousClass2(api, username, password, null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$setAccountSkin$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$setAccountSkin$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $model;
        final /* synthetic */ String $name;
        final /* synthetic */ String $path;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, String str3, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$name = str;
            this.$path = str2;
            this.$model = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$name, this.$path, this.$model, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RepositoryUiApi.this.repo.setOfflineSkin(this.$name, this.$path, this.$model);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object startNide8Login(String serverId, String username, String password, Continuation<? super String> continuation) {
        return io(new AnonymousClass2(serverId, username, password, null), continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object setAccountSkin(String name, String path, String model, Continuation<? super Unit> continuation) {
        Object objIo = io(new AnonymousClass2(name, path, model, null), continuation);
        return objIo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objIo : Unit.INSTANCE;
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/JavaRow;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$getJavaList$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$getJavaList$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends JavaRow>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends JavaRow>> continuation) {
            return invoke2((Continuation<? super List<JavaRow>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<JavaRow>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e8 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getJavaList(boolean scan, Continuation<? super List<JavaRow>> continuation) {
        return safe(CollectionsKt.emptyList(), new AnonymousClass2(null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$downloadJava$2", f = "RepositoryUiApi.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$downloadJava$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ int $major;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$major = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$major, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (new RuntimeInstaller(RepositoryUiApi.this.getCtx()).downloadJava(this.$major, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return "jre" + this.$major;
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object downloadJava(int major, String distro, Continuation<? super String> continuation) {
        return io(new AnonymousClass2(major, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File gameDirOf(Instance i, String version) {
        return StringsKt.isBlank(version) ? i.getDir() : i.settings(version, this.repo.getConfig()).gameDir(i.getDir());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File gameDirOf(String instance, String version) {
        return gameDirOf(instExisting(instance), version);
    }

    private final String loaderOf(String version) {
        Object obj;
        String lowerCase = version.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Iterator it = CollectionsKt.listOf((Object[]) new String[]{"neoforge", "forge", "fabric", "quilt"}).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) next, false, 2, (Object) null)) {
                obj = next;
                break;
            }
        }
        String str = (String) obj;
        return str == null ? "" : str;
    }

    private final String mcOf(String instance, String version) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            FileUtil fileUtil = FileUtil.INSTANCE;
            Instance instanceInstOrNull = instOrNull(instance);
            Intrinsics.checkNotNull(instanceInstOrNull);
            Map jsonObj = fileUtil.readJsonObj(instanceInstOrNull.versionJson(version));
            String str = JsonKt.str(jsonObj, "inheritsFrom");
            if (str == null && (str = JsonKt.str(jsonObj, "id")) == null) {
                str = version;
            }
            objM8116constructorimpl = Result.m8116constructorimpl(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = version;
        }
        return (String) objM8116constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CatalogHit hitOf(ModHit h, Set<String> favs) {
        return new CatalogHit(h.getId(), h.getTitle(), h.getAuthor(), h.getDownloads(), h.getDesc(), h.getSource(), h.getCategories(), favs.contains(h.getId()), false, h.getPageUrl(), h.getIconUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CatalogFile fileOf(ModFile f) {
        return new CatalogFile(f.getName(), f.getGameVersions(), f.getLoaders(), f.getDate(), (int) (f.getSize() / 1024), f.getId(), f.getDisplayName());
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$favorites$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$favorites$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Set<? extends String>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Set<? extends String>> continuation) {
            return invoke2((Continuation<? super Set<String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Set<String>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return CollectionsKt.toSet(RepositoryUiApi.this.repo.getConfig().list("catalog_favorites"));
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/CatalogHit;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$searchCatalog$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$searchCatalog$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends CatalogHit>>, Object> {
        final /* synthetic */ String $category;
        final /* synthetic */ String $gameVersion;
        final /* synthetic */ String $kind;
        final /* synthetic */ String $query;
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, String str3, String str4, String str5, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$gameVersion = str;
            this.$kind = str2;
            this.$query = str3;
            this.$source = str4;
            this.$category = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$gameVersion, this.$kind, this.$query, this.$source, this.$category, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends CatalogHit>> continuation) {
            return invoke2((Continuation<? super List<CatalogHit>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<CatalogHit>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Set favs = CollectionsKt.toSet(RepositoryUiApi.this.repo.getConfig().list("catalog_favorites"));
                    String str = this.$gameVersion;
                    if (Intrinsics.areEqual(str, "全部")) {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    String gv = str;
                    Iterable iterableSearch$default = ModCatalog.search$default(RepositoryUiApi.this.repo.getCatalog(), ResKind.INSTANCE.of(this.$kind), StringsKt.trim((CharSequence) this.$query).toString(), this.$source, gv, this.$category, 0, 32, null);
                    RepositoryUiApi repositoryUiApi = RepositoryUiApi.this;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableSearch$default, 10));
                    Iterator it = iterableSearch$default.iterator();
                    while (it.hasNext()) {
                        arrayList.add(repositoryUiApi.hitOf((ModHit) it.next(), favs));
                    }
                    return (List) arrayList;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object favorites(Continuation<? super Set<String>> continuation) {
        return safe(SetsKt.emptySet(), new AnonymousClass2(null), continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object searchCatalog(String kind, String query, String source, String gameVersion, String category, Continuation<? super List<CatalogHit>> continuation) {
        return io(new AnonymousClass2(gameVersion, kind, query, source, category, null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/CatalogFile;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$getProjectFiles$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$getProjectFiles$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends CatalogFile>>, Object> {
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends CatalogFile>> continuation) {
            return invoke2((Continuation<? super List<CatalogFile>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<CatalogFile>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Iterable iterableFiles$default = ModCatalog.files$default(RepositoryUiApi.this.repo.getCatalog(), this.$id, null, null, 6, null);
                    RepositoryUiApi repositoryUiApi = RepositoryUiApi.this;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableFiles$default, 10));
                    Iterator it = iterableFiles$default.iterator();
                    while (it.hasNext()) {
                        arrayList.add(repositoryUiApi.fileOf((ModFile) it.next()));
                    }
                    return (List) arrayList;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$installMod$2", f = "RepositoryUiApi.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {236, 237, 241}, m = "invokeSuspend", n = {"k", "mf", ArchiveStreamFactory.ZIP, "k", "mf", ArchiveStreamFactory.ZIP, "k", "mf"}, nl = {237, 238, 243}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$installMod$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $file;
        final /* synthetic */ String $id;
        final /* synthetic */ String $instance;
        final /* synthetic */ String $kind;
        final /* synthetic */ Function2<Float, String, Unit> $onProgress;
        final /* synthetic */ String $version;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ RepositoryUiApi this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, RepositoryUiApi repositoryUiApi, String str2, String str3, String str4, String str5, Function2<? super Float, ? super String, Unit> function2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$kind = str;
            this.this$0 = repositoryUiApi;
            this.$id = str2;
            this.$file = str3;
            this.$version = str4;
            this.$instance = str5;
            this.$onProgress = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$kind, this.this$0, this.$id, this.$file, this.$version, this.$instance, this.$onProgress, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0138 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0139  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws com.pymcl.core.loader.InstallError {
            /*
                Method dump skipped, instructions count: 466
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(Function2 $onProgress, DownloadProgress p) {
            $onProgress.invoke(Float.valueOf(p.getFraction() * 0.2f), p.getCurrent());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(Function2 $onProgress, Float p, String d) {
            $onProgress.invoke(p != null ? Float.valueOf((0.8f * p.floatValue()) + 0.2f) : null, d);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(Function2 $onProgress, ModFile $mf, float it) {
            $onProgress.invoke(Float.valueOf(it), $mf.getName());
            return Unit.INSTANCE;
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getProjectFiles(String kind, String id, Continuation<? super List<CatalogFile>> continuation) {
        return io(new AnonymousClass2(id, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.pymcl.android.ui.state.LauncherUiApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object installMod(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.String, kotlin.Unit> r19, kotlin.coroutines.Continuation<? super java.lang.String> r20) {
        /*
            r13 = this;
            r9 = r20
            boolean r0 = r9 instanceof com.pymcl.android.data.RepositoryUiApi.AnonymousClass1
            if (r0 == 0) goto L16
            r0 = r9
            com.pymcl.android.data.RepositoryUiApi$installMod$1 r0 = (com.pymcl.android.data.RepositoryUiApi.AnonymousClass1) r0
            int r1 = r0.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r3
            if (r1 == 0) goto L16
            int r1 = r0.label
            int r1 = r1 - r3
            r0.label = r1
            goto L1b
        L16:
            com.pymcl.android.data.RepositoryUiApi$installMod$1 r0 = new com.pymcl.android.data.RepositoryUiApi$installMod$1
            r0.<init>(r9)
        L1b:
            r10 = r0
            java.lang.Object r11 = r10.result
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r10.label
            switch(r0) {
                case 0: goto L4c;
                case 1: goto L2f;
                default: goto L27;
            }
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2f:
            java.lang.Object r0 = r10.L$5
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.lang.Object r1 = r10.L$4
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r10.L$3
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r10.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r11
            goto L9b
        L4c:
            kotlin.ResultKt.throwOnFailure(r11)
            com.pymcl.android.data.RepositoryUiApi$installMod$2 r0 = new com.pymcl.android.data.RepositoryUiApi$installMod$2
            r8 = 0
            r2 = r13
            r1 = r14
            r6 = r15
            r5 = r16
            r3 = r17
            r4 = r18
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r10.L$0 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r10.L$1 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r10.L$2 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r10.L$3 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r10.L$4 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r10.L$5 = r1
            r1 = 1
            r10.label = r1
            java.lang.Object r0 = r13.io(r0, r10)
            if (r0 != r12) goto L90
            return r12
        L90:
            r6 = r14
            r5 = r15
            r4 = r16
            r3 = r17
            r1 = r18
            r7 = r0
            r0 = r19
        L9b:
            java.lang.String r8 = "io(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi.installMod(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/InstalledEntry;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$getInstalled$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$getInstalled$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends InstalledEntry>>, Object> {
        final /* synthetic */ String $instance;
        final /* synthetic */ String $kind;
        final /* synthetic */ String $version;
        int label;
        final /* synthetic */ RepositoryUiApi this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, RepositoryUiApi repositoryUiApi, String str2, String str3, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$kind = str;
            this.this$0 = repositoryUiApi;
            this.$instance = str2;
            this.$version = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$kind, this.this$0, this.$instance, this.$version, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends InstalledEntry>> continuation) {
            return invoke2((Continuation<? super List<InstalledEntry>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<InstalledEntry>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00e4 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instructions count: 402
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getInstalledMods(String instance, String version, Continuation<? super List<InstalledEntry>> continuation) {
        return getInstalled("mod", instance, version, continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getInstalled(String kind, String instance, String version, Continuation<? super List<InstalledEntry>> continuation) {
        return safe(CollectionsKt.emptyList(), new AnonymousClass2(kind, this, instance, version, null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$setInstalledEnabled$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$setInstalledEnabled$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ String $filename;
        final /* synthetic */ String $instance;
        final /* synthetic */ String $kind;
        final /* synthetic */ String $version;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, String str3, String str4, boolean z, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$kind = str;
            this.$instance = str2;
            this.$version = str3;
            this.$filename = str4;
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$kind, this.$instance, this.$version, this.$filename, this.$enabled, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IOException {
            File to;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    File dir = RepositoryUiApi.this.repo.getCatalog().targetDir(ResKind.INSTANCE.of(this.$kind), RepositoryUiApi.this.gameDirOf(this.$instance, this.$version));
                    File f = FileUtil.INSTANCE.safeChild(dir, this.$filename);
                    if (this.$enabled) {
                        to = new File(dir, StringsKt.removeSuffix(this.$filename, (CharSequence) ".disabled"));
                    } else {
                        to = new File(dir, StringsKt.removeSuffix(this.$filename, (CharSequence) ".disabled") + ".disabled");
                    }
                    if (Intrinsics.areEqual(f, to) || f.renameTo(to)) {
                        return Unit.INSTANCE;
                    }
                    throw new IOException("重命名失败：" + this.$filename);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object setInstalledEnabled(String kind, String instance, String version, String filename, boolean enabled, Continuation<? super Unit> continuation) {
        Object objIo = io(new AnonymousClass2(kind, instance, version, filename, enabled, null), continuation);
        return objIo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objIo : Unit.INSTANCE;
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$deleteInstalled$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$deleteInstalled$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $filename;
        final /* synthetic */ String $instance;
        final /* synthetic */ String $kind;
        final /* synthetic */ String $version;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, String str3, String str4, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$kind = str;
            this.$instance = str2;
            this.$version = str3;
            this.$filename = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$kind, this.$instance, this.$version, this.$filename, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    File f = FileUtil.INSTANCE.safeChild(RepositoryUiApi.this.repo.getCatalog().targetDir(ResKind.INSTANCE.of(this.$kind), RepositoryUiApi.this.gameDirOf(this.$instance, this.$version)), this.$filename);
                    if (!FilesKt.deleteRecursively(f)) {
                        throw new IOException("删除失败：" + this.$filename);
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object deleteInstalled(String kind, String instance, String version, String filename, Continuation<? super Unit> continuation) {
        Object objIo = io(new AnonymousClass2(kind, instance, version, filename, null), continuation);
        return objIo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objIo : Unit.INSTANCE;
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/android/ui/state/CatalogHit;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$resolveCatalogLink$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$resolveCatalogLink$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super CatalogHit>, Object> {
        final /* synthetic */ String $kind;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ RepositoryUiApi this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, RepositoryUiApi repositoryUiApi, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$url = str;
            this.this$0 = repositoryUiApi;
            this.$kind = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$url, this.this$0, this.$kind, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super CatalogHit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Pair<String, ResKind> link = ModCatalog.INSTANCE.parseLink(this.$url);
                    if (link == null) {
                        return null;
                    }
                    String id = link.component1();
                    ResKind k = link.component2();
                    Set favs = CollectionsKt.toSet(this.this$0.repo.getConfig().list("catalog_favorites"));
                    if (StringsKt.startsWith$default(id, "cfslug:", false, 2, (Object) null)) {
                        ModHit modHitResolveCfSlug = this.this$0.repo.getCatalog().resolveCfSlug(k == null ? ResKind.INSTANCE.of(this.$kind) : k, StringsKt.removePrefix(id, (CharSequence) "cfslug:"));
                        if (modHitResolveCfSlug != null) {
                            return this.this$0.hitOf(modHitResolveCfSlug, favs);
                        }
                        return null;
                    }
                    ModHit modHitProject = this.this$0.repo.getCatalog().project(id);
                    if (modHitProject != null) {
                        return this.this$0.hitOf(modHitProject, favs);
                    }
                    return null;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object resolveCatalogLink(String kind, String url, Continuation<? super CatalogHit> continuation) {
        return io(new AnonymousClass2(url, this, kind, null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$importLocalFile$2", f = "RepositoryUiApi.kt", i = {0, 0, 0}, l = {275}, m = "invokeSuspend", n = {"src", "k", "isPack"}, nl = {276}, s = {"L$0", "L$1", "I$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$importLocalFile$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $instance;
        final /* synthetic */ String $kind;
        final /* synthetic */ Function2<Float, String, Unit> $onProgress;
        final /* synthetic */ String $path;
        final /* synthetic */ String $version;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ RepositoryUiApi this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, String str2, RepositoryUiApi repositoryUiApi, Function2<? super Float, ? super String, Unit> function2, String str3, String str4, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$path = str;
            this.$kind = str2;
            this.this$0 = repositoryUiApi;
            this.$onProgress = function2;
            this.$version = str3;
            this.$instance = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$path, this.$kind, this.this$0, this.$onProgress, this.$version, this.$instance, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 386
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object importLocalFile(String kind, String instance, String version, String path, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return io(new AnonymousClass2(path, kind, this, function2, version, instance, null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$checkModUpdates$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$checkModUpdates$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Map<String, ? extends String>>, Object> {
        final /* synthetic */ String $instance;
        final /* synthetic */ String $version;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$instance = str;
            this.$version = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$instance, this.$version, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Map<String, ? extends String>> continuation) {
            return invoke2((Continuation<? super Map<String, String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Map<String, String>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Map mapCheckUpdates = RepositoryUiApiExt.INSTANCE.get(RepositoryUiApi.this.getCtx()).checkUpdates(this.$instance, this.$version);
                    Map linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapCheckUpdates.size()));
                    for (Object obj : mapCheckUpdates.entrySet()) {
                        linkedHashMap.put(((Map.Entry) obj).getKey(), ((ModFile) ((Map.Entry) obj).getValue()).getDisplayName());
                    }
                    return linkedHashMap;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object checkModUpdates(String instance, String version, Continuation<? super Map<String, String>> continuation) {
        return io(new AnonymousClass2(instance, version, null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$toggleFavorite$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$toggleFavorite$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    List cur = CollectionsKt.toMutableList((Collection) RepositoryUiApi.this.repo.getConfig().list("catalog_favorites"));
                    boolean now = !cur.contains(this.$id);
                    List list = cur;
                    String str = this.$id;
                    if (now) {
                        list.add(str);
                    } else {
                        list.remove(str);
                    }
                    RepositoryUiApi.this.repo.getConfig().set("catalog_favorites", cur);
                    return Boxing.boxBoolean(now);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object toggleFavorite(String kind, String id, Continuation<? super Boolean> continuation) {
        return io(new AnonymousClass2(id, null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$launchGame$2", f = "RepositoryUiApi.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {308, 310, 324, 327, 333}, m = "invokeSuspend", n = {"instName", "names", "i0", "vers", "target", "broken", "vid", "i", "rt", "instName", "names", "i0", "vers", "target", "broken", "vid", "i", "rt", "dirs", "skipAssets", "instName", "names", "i0", "vers", "target", "broken", "vid", "i", "rt", "dirs", "skipAssets", "instName", "names", "i0", "vers", "target", "broken", "vid", "i", "rt", "dirs", "req", "skipAssets", "instName", "names", "i0", "vers", "target", "broken", "vid", "i", "rt", "dirs", "req", "skipAssets"}, nl = {309, 319, 325, 329, 336}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "Z$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$launchGame$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $instance;
        final /* synthetic */ Function1<String, Unit> $onLog;
        final /* synthetic */ Function1<Float, Unit> $onProgress;
        final /* synthetic */ String $server;
        final /* synthetic */ String $version;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        final /* synthetic */ RepositoryUiApi this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, RepositoryUiApi repositoryUiApi, String str2, Function1<? super Float, Unit> function1, Function1<? super String, Unit> function12, String str3, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$instance = str;
            this.this$0 = repositoryUiApi;
            this.$version = str2;
            this.$onProgress = function1;
            this.$onLog = function12;
            this.$server = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$instance, this.this$0, this.$version, this.$onProgress, this.$onLog, this.$server, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x0450  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x04a4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x04a5  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x04be A[Catch: all -> 0x06f4, TryCatch #1 {all -> 0x06f4, blocks: (B:7:0x0043, B:153:0x06c5, B:10:0x0076, B:121:0x0547, B:122:0x0593, B:125:0x059b, B:127:0x05b5, B:136:0x05d0, B:144:0x05e7, B:148:0x060d, B:149:0x0646, B:134:0x05c2, B:13:0x00a6, B:113:0x04b1, B:115:0x04be, B:16:0x00e2, B:72:0x0324, B:77:0x034b, B:79:0x0353, B:81:0x0361, B:84:0x03b7, B:86:0x03bf, B:87:0x03da, B:89:0x03ed, B:95:0x03f9, B:100:0x0415, B:102:0x041d, B:99:0x040b, B:103:0x0438, B:105:0x0442, B:109:0x0452, B:76:0x0341, B:19:0x0110, B:64:0x029c, B:68:0x02ce, B:23:0x012c, B:25:0x0138, B:26:0x0146, B:31:0x0175, B:34:0x0180, B:36:0x018c, B:40:0x019f, B:43:0x01a7, B:44:0x01ab, B:47:0x01bc, B:52:0x01e6, B:54:0x01ec, B:56:0x01f5, B:60:0x0212, B:51:0x01dc, B:55:0x01f1, B:30:0x016b, B:73:0x0326, B:27:0x014b, B:96:0x03fd, B:48:0x01be), top: B:163:0x000a, inners: #0, #2, #3, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0538  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x059b A[Catch: all -> 0x06f4, TRY_ENTER, TryCatch #1 {all -> 0x06f4, blocks: (B:7:0x0043, B:153:0x06c5, B:10:0x0076, B:121:0x0547, B:122:0x0593, B:125:0x059b, B:127:0x05b5, B:136:0x05d0, B:144:0x05e7, B:148:0x060d, B:149:0x0646, B:134:0x05c2, B:13:0x00a6, B:113:0x04b1, B:115:0x04be, B:16:0x00e2, B:72:0x0324, B:77:0x034b, B:79:0x0353, B:81:0x0361, B:84:0x03b7, B:86:0x03bf, B:87:0x03da, B:89:0x03ed, B:95:0x03f9, B:100:0x0415, B:102:0x041d, B:99:0x040b, B:103:0x0438, B:105:0x0442, B:109:0x0452, B:76:0x0341, B:19:0x0110, B:64:0x029c, B:68:0x02ce, B:23:0x012c, B:25:0x0138, B:26:0x0146, B:31:0x0175, B:34:0x0180, B:36:0x018c, B:40:0x019f, B:43:0x01a7, B:44:0x01ab, B:47:0x01bc, B:52:0x01e6, B:54:0x01ec, B:56:0x01f5, B:60:0x0212, B:51:0x01dc, B:55:0x01f1, B:30:0x016b, B:73:0x0326, B:27:0x014b, B:96:0x03fd, B:48:0x01be), top: B:163:0x000a, inners: #0, #2, #3, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:138:0x05de  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x05e0  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x05e3  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x05e4  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x05e7 A[Catch: all -> 0x06f4, TryCatch #1 {all -> 0x06f4, blocks: (B:7:0x0043, B:153:0x06c5, B:10:0x0076, B:121:0x0547, B:122:0x0593, B:125:0x059b, B:127:0x05b5, B:136:0x05d0, B:144:0x05e7, B:148:0x060d, B:149:0x0646, B:134:0x05c2, B:13:0x00a6, B:113:0x04b1, B:115:0x04be, B:16:0x00e2, B:72:0x0324, B:77:0x034b, B:79:0x0353, B:81:0x0361, B:84:0x03b7, B:86:0x03bf, B:87:0x03da, B:89:0x03ed, B:95:0x03f9, B:100:0x0415, B:102:0x041d, B:99:0x040b, B:103:0x0438, B:105:0x0442, B:109:0x0452, B:76:0x0341, B:19:0x0110, B:64:0x029c, B:68:0x02ce, B:23:0x012c, B:25:0x0138, B:26:0x0146, B:31:0x0175, B:34:0x0180, B:36:0x018c, B:40:0x019f, B:43:0x01a7, B:44:0x01ab, B:47:0x01bc, B:52:0x01e6, B:54:0x01ec, B:56:0x01f5, B:60:0x0212, B:51:0x01dc, B:55:0x01f1, B:30:0x016b, B:73:0x0326, B:27:0x014b, B:96:0x03fd, B:48:0x01be), top: B:163:0x000a, inners: #0, #2, #3, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:151:0x06bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:152:0x06be  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x05ca A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01f1 A[Catch: all -> 0x06f4, TryCatch #1 {all -> 0x06f4, blocks: (B:7:0x0043, B:153:0x06c5, B:10:0x0076, B:121:0x0547, B:122:0x0593, B:125:0x059b, B:127:0x05b5, B:136:0x05d0, B:144:0x05e7, B:148:0x060d, B:149:0x0646, B:134:0x05c2, B:13:0x00a6, B:113:0x04b1, B:115:0x04be, B:16:0x00e2, B:72:0x0324, B:77:0x034b, B:79:0x0353, B:81:0x0361, B:84:0x03b7, B:86:0x03bf, B:87:0x03da, B:89:0x03ed, B:95:0x03f9, B:100:0x0415, B:102:0x041d, B:99:0x040b, B:103:0x0438, B:105:0x0442, B:109:0x0452, B:76:0x0341, B:19:0x0110, B:64:0x029c, B:68:0x02ce, B:23:0x012c, B:25:0x0138, B:26:0x0146, B:31:0x0175, B:34:0x0180, B:36:0x018c, B:40:0x019f, B:43:0x01a7, B:44:0x01ab, B:47:0x01bc, B:52:0x01e6, B:54:0x01ec, B:56:0x01f5, B:60:0x0212, B:51:0x01dc, B:55:0x01f1, B:30:0x016b, B:73:0x0326, B:27:0x014b, B:96:0x03fd, B:48:0x01be), top: B:163:0x000a, inners: #0, #2, #3, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x020d  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0210  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x028e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x028f  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x02c9  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x02cc  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x031f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0320  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0353 A[Catch: all -> 0x06f4, TryCatch #1 {all -> 0x06f4, blocks: (B:7:0x0043, B:153:0x06c5, B:10:0x0076, B:121:0x0547, B:122:0x0593, B:125:0x059b, B:127:0x05b5, B:136:0x05d0, B:144:0x05e7, B:148:0x060d, B:149:0x0646, B:134:0x05c2, B:13:0x00a6, B:113:0x04b1, B:115:0x04be, B:16:0x00e2, B:72:0x0324, B:77:0x034b, B:79:0x0353, B:81:0x0361, B:84:0x03b7, B:86:0x03bf, B:87:0x03da, B:89:0x03ed, B:95:0x03f9, B:100:0x0415, B:102:0x041d, B:99:0x040b, B:103:0x0438, B:105:0x0442, B:109:0x0452, B:76:0x0341, B:19:0x0110, B:64:0x029c, B:68:0x02ce, B:23:0x012c, B:25:0x0138, B:26:0x0146, B:31:0x0175, B:34:0x0180, B:36:0x018c, B:40:0x019f, B:43:0x01a7, B:44:0x01ab, B:47:0x01bc, B:52:0x01e6, B:54:0x01ec, B:56:0x01f5, B:60:0x0212, B:51:0x01dc, B:55:0x01f1, B:30:0x016b, B:73:0x0326, B:27:0x014b, B:96:0x03fd, B:48:0x01be), top: B:163:0x000a, inners: #0, #2, #3, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x03b1  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x03bf A[Catch: all -> 0x06f4, TryCatch #1 {all -> 0x06f4, blocks: (B:7:0x0043, B:153:0x06c5, B:10:0x0076, B:121:0x0547, B:122:0x0593, B:125:0x059b, B:127:0x05b5, B:136:0x05d0, B:144:0x05e7, B:148:0x060d, B:149:0x0646, B:134:0x05c2, B:13:0x00a6, B:113:0x04b1, B:115:0x04be, B:16:0x00e2, B:72:0x0324, B:77:0x034b, B:79:0x0353, B:81:0x0361, B:84:0x03b7, B:86:0x03bf, B:87:0x03da, B:89:0x03ed, B:95:0x03f9, B:100:0x0415, B:102:0x041d, B:99:0x040b, B:103:0x0438, B:105:0x0442, B:109:0x0452, B:76:0x0341, B:19:0x0110, B:64:0x029c, B:68:0x02ce, B:23:0x012c, B:25:0x0138, B:26:0x0146, B:31:0x0175, B:34:0x0180, B:36:0x018c, B:40:0x019f, B:43:0x01a7, B:44:0x01ab, B:47:0x01bc, B:52:0x01e6, B:54:0x01ec, B:56:0x01f5, B:60:0x0212, B:51:0x01dc, B:55:0x01f1, B:30:0x016b, B:73:0x0326, B:27:0x014b, B:96:0x03fd, B:48:0x01be), top: B:163:0x000a, inners: #0, #2, #3, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x03f6  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x03f9 A[Catch: all -> 0x06f4, TRY_LEAVE, TryCatch #1 {all -> 0x06f4, blocks: (B:7:0x0043, B:153:0x06c5, B:10:0x0076, B:121:0x0547, B:122:0x0593, B:125:0x059b, B:127:0x05b5, B:136:0x05d0, B:144:0x05e7, B:148:0x060d, B:149:0x0646, B:134:0x05c2, B:13:0x00a6, B:113:0x04b1, B:115:0x04be, B:16:0x00e2, B:72:0x0324, B:77:0x034b, B:79:0x0353, B:81:0x0361, B:84:0x03b7, B:86:0x03bf, B:87:0x03da, B:89:0x03ed, B:95:0x03f9, B:100:0x0415, B:102:0x041d, B:99:0x040b, B:103:0x0438, B:105:0x0442, B:109:0x0452, B:76:0x0341, B:19:0x0110, B:64:0x029c, B:68:0x02ce, B:23:0x012c, B:25:0x0138, B:26:0x0146, B:31:0x0175, B:34:0x0180, B:36:0x018c, B:40:0x019f, B:43:0x01a7, B:44:0x01ab, B:47:0x01bc, B:52:0x01e6, B:54:0x01ec, B:56:0x01f5, B:60:0x0212, B:51:0x01dc, B:55:0x01f1, B:30:0x016b, B:73:0x0326, B:27:0x014b, B:96:0x03fd, B:48:0x01be), top: B:163:0x000a, inners: #0, #2, #3, #4 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r39) {
            /*
                Method dump skipped, instructions count: 1848
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(Function1 $onLog, String stage) {
            $onLog.invoke("[PyMCL] 运行时：" + stage);
            return Unit.INSTANCE;
        }

        /* compiled from: RepositoryUiApi.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
        @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$launchGame$2$3", f = "RepositoryUiApi.kt", i = {1}, l = {311, 316}, m = "invokeSuspend", n = {"q"}, nl = {314, 317}, s = {"L$0"}, v = 2)
        /* renamed from: com.pymcl.android.data.RepositoryUiApi$launchGame$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
            final /* synthetic */ GameDirs $dirs;
            final /* synthetic */ Instance $i;
            final /* synthetic */ Function1<String, Unit> $onLog;
            final /* synthetic */ boolean $skipAssets;
            final /* synthetic */ String $vid;
            Object L$0;
            int label;
            final /* synthetic */ RepositoryUiApi this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Instance instance, String str, Function1<? super String, Unit> function1, RepositoryUiApi repositoryUiApi, GameDirs gameDirs, boolean z, Continuation<? super AnonymousClass3> continuation) {
                super(1, continuation);
                this.$i = instance;
                this.$vid = str;
                this.$onLog = function1;
                this.this$0 = repositoryUiApi;
                this.$dirs = gameDirs;
                this.$skipAssets = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass3(this.$i, this.$vid, this.$onLog, this.this$0, this.$dirs, this.$skipAssets, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
                return invoke2((Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<Object> continuation) {
                return ((AnonymousClass3) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        if (!this.$i.versions().contains(this.$vid)) {
                            this.$onLog.invoke("[PyMCL] 安装原版 " + this.$vid);
                            this.label = 1;
                            Object objInstallVanilla = this.this$0.repo.installVanilla(this.$vid, this.$i, this);
                            return objInstallVanilla == coroutine_suspended ? coroutine_suspended : objInstallVanilla;
                        }
                        QuickCheckResult q = this.this$0.repo.getGame().quickCheck(this.$dirs, this.$vid, this.$skipAssets);
                        if (!q.getComplete()) {
                            this.$onLog.invoke("[PyMCL] 检查文件完整性（全量校验：" + q.getReason() + "）");
                            this.L$0 = SpillingKt.nullOutSpilledVariable(q);
                            this.label = 2;
                            if (this.this$0.repo.getGame().completeFiles(this.$dirs, this.$vid, this.$skipAssets, this) != coroutine_suspended) {
                                break;
                            } else {
                                return coroutine_suspended;
                            }
                        } else {
                            this.$onLog.invoke("[PyMCL] 文件完整（快速检查：" + q.getReason() + "）");
                            break;
                        }
                    case 1:
                        ResultKt.throwOnFailure($result);
                        return $result;
                    case 2:
                        ResultKt.throwOnFailure($result);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(Function1 $onProgress, Function1 $onLog, Float p, String d) {
            $onProgress.invoke(p);
            if (d.length() > 0) {
                if ((p != null ? p.floatValue() : 0.0f) >= 0.999f) {
                    $onLog.invoke("[PyMCL] " + d);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$11(Function1 $onLog, String it) {
            $onLog.invoke("[PyMCL] " + it);
            return Unit.INSTANCE;
        }

        /* compiled from: RepositoryUiApi.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
        @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$launchGame$2$12", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.pymcl.android.data.RepositoryUiApi$launchGame$2$12, reason: invalid class name */
        static final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ GameLaunchRequest $req;
            int label;
            final /* synthetic */ RepositoryUiApi this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass12(RepositoryUiApi repositoryUiApi, GameLaunchRequest gameLaunchRequest, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.this$0 = repositoryUiApi;
                this.$req = gameLaunchRequest;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.this$0, this.$req, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 ??, still in use, count: 1, list:
                  (r1v2 ?? I:android.content.Intent) from 0x0036: INVOKE (r0v2 ?? I:android.content.Context), (r1v2 ?? I:android.content.Intent) VIRTUAL call: android.content.Context.startActivity(android.content.Intent):void A[MD:(android.content.Intent):void (c)]
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
                	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
                	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 ??, still in use, count: 1, list:
                  (r1v2 ?? I:android.content.Intent) from 0x0036: INVOKE (r0v2 ?? I:android.content.Context), (r1v2 ?? I:android.content.Intent) VIRTUAL call: android.content.Context.startActivity(android.content.Intent):void A[MD:(android.content.Intent):void (c)]
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
                	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
                */
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
                */
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object launchGame(String instance, String version, Function1<? super String, Unit> function1, Function1<? super Float, Unit> function12, String server, Continuation<? super String> continuation) {
        return io(new AnonymousClass2(instance, this, version, function12, function1, server, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rememberLobby(Instance i, String vid, String address) {
        File gameDir = i.settings(vid, this.repo.getConfig()).applyIsolation(i.getDir());
        ServersStore store = new ServersStore(gameDir);
        Pair<String, Integer> pairSplitAddress = FclLaunchArgs.INSTANCE.splitAddress(address);
        if (pairSplitAddress == null) {
            return;
        }
        String host = pairSplitAddress.component1();
        int port = pairSplitAddress.component2().intValue();
        ServerEntry lobby = new ServerEntry(LOBBY_NAME, host, port == 25565 ? "" : String.valueOf(port), null, "联机自动写入", false, 40, null);
        List listListOf = CollectionsKt.listOf(lobby);
        Iterable list = store.list();
        Collection arrayList = new ArrayList();
        for (Object obj : list) {
            File gameDir2 = gameDir;
            if (!Intrinsics.areEqual(((ServerEntry) obj).getName(), LOBBY_NAME)) {
                arrayList.add(obj);
            }
            gameDir = gameDir2;
        }
        store.save(CollectionsKt.plus((Collection) listListOf, arrayList));
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/android/ui/state/GameExitInfo;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$collectGameExit$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$collectGameExit$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super GameExitInfo>, Object> {
        final /* synthetic */ boolean $userStopped;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$userStopped = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$userStopped, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super GameExitInfo> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0219  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x021c A[Catch: all -> 0x0286, TryCatch #5 {all -> 0x0286, blocks: (B:53:0x00d4, B:54:0x00f6, B:56:0x00fc, B:57:0x0118, B:59:0x0125, B:61:0x012b, B:74:0x0190, B:78:0x019f, B:80:0x01af, B:83:0x01b7, B:85:0x01be, B:88:0x01c6, B:90:0x01ca, B:92:0x01d0, B:97:0x01e2, B:99:0x0200, B:104:0x021c, B:106:0x0241, B:77:0x0199, B:72:0x0184), top: B:131:0x00d4 }] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0240  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0298  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0199 A[Catch: all -> 0x0286, TryCatch #5 {all -> 0x0286, blocks: (B:53:0x00d4, B:54:0x00f6, B:56:0x00fc, B:57:0x0118, B:59:0x0125, B:61:0x012b, B:74:0x0190, B:78:0x019f, B:80:0x01af, B:83:0x01b7, B:85:0x01be, B:88:0x01c6, B:90:0x01ca, B:92:0x01d0, B:97:0x01e2, B:99:0x0200, B:104:0x021c, B:106:0x0241, B:77:0x0199, B:72:0x0184), top: B:131:0x00d4 }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01ff  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r39) {
            /*
                Method dump skipped, instructions count: 770
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence invokeSuspend$lambda$3$4(CrashReason it) {
            return it.getTitle();
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object collectGameExit(boolean userStopped, Continuation<? super GameExitInfo> continuation) {
        return io(new AnonymousClass2(userStopped, null), continuation);
    }

    private final ActivityManager.RunningAppProcessInfo gameProcess() {
        Object systemService = this.ctx.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        Iterable runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        Object obj = null;
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((ActivityManager.RunningAppProcessInfo) next).processName, this.ctx.getPackageName() + ":game")) {
                obj = next;
                break;
            }
        }
        return (ActivityManager.RunningAppProcessInfo) obj;
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public boolean isGameRunning() {
        return gameProcess() != null;
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$activeAccountName$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$activeAccountName$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Account accountActive = RepositoryUiApi.this.repo.getAccounts().active();
                    if (accountActive != null) {
                        return accountActive.getName();
                    }
                    return null;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public void stopGame() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfoGameProcess = gameProcess();
        if (runningAppProcessInfoGameProcess != null) {
            Process.killProcess(runningAppProcessInfoGameProcess.pid);
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object activeAccountName(Continuation<? super String> continuation) {
        return io(new AnonymousClass2(null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/NewsItem;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$fetchNews$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$fetchNews$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends NewsItem>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends NewsItem>> continuation) {
            return invoke2((Continuation<? super List<NewsItem>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<NewsItem>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objM8116constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RepositoryUiApi repositoryUiApi = RepositoryUiApi.this;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        int i = 0;
                        Map mapObj = Json.INSTANCE.obj(Http.getText$default(repositoryUiApi.repo.getHttp(), "https://launchercontent.mojang.com/v2/javaPatchNotes.json", null, 0, 6, null));
                        Iterable<Map> iterableTake = CollectionsKt.take(JsonKt.objs(JsonKt.arr(mapObj, "entries")), 8);
                        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableTake, 10));
                        for (Map map : iterableTake) {
                            String str = JsonKt.str(map, "title");
                            if (str == null && (str = JsonKt.str(map, "version")) == null) {
                                str = "";
                            }
                            RepositoryUiApi repositoryUiApi2 = repositoryUiApi;
                            String str2 = JsonKt.str(map, "date");
                            if (str2 == null) {
                                str2 = "";
                            }
                            String strTake = StringsKt.take(str2, 10);
                            String str3 = JsonKt.str(map, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                            if (str3 == null) {
                                str3 = "Java 版";
                            }
                            String str4 = JsonKt.str(map, "version");
                            arrayList.add(new NewsItem(str, strTake, str3, "https://www.minecraft.net/zh-hans/article/minecraft-java-edition-" + StringsKt.replace$default(str4 == null ? "" : str4, '.', '-', false, 4, (Object) null)));
                            i = i;
                            repositoryUiApi = repositoryUiApi2;
                            mapObj = mapObj;
                        }
                        objM8116constructorimpl = Result.m8116constructorimpl((List) arrayList);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                    }
                    return Result.m8122isFailureimpl(objM8116constructorimpl) ? CollectionsKt.emptyList() : objM8116constructorimpl;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object fetchNews(Continuation<? super List<NewsItem>> continuation) {
        return io(new AnonymousClass2(null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/ServerRow;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$getServers$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$getServers$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends ServerRow>>, Object> {
        final /* synthetic */ String $instance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$instance = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$instance, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends ServerRow>> continuation) {
            return invoke2((Continuation<? super List<ServerRow>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<ServerRow>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Instance i = RepositoryUiApi.this.instOrNull(this.$instance);
                    if (i == null) {
                        return CollectionsKt.emptyList();
                    }
                    Iterable list = ServersStore.Companion.forInstance$default(ServersStore.INSTANCE, i, null, RepositoryUiApi.this.repo.getConfig().string(SettingsLogic.Extras.ISOLATION_KEY), 2, null).list();
                    Collection arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!((ServerEntry) obj).getHidden()) {
                            arrayList.add(obj);
                        }
                    }
                    Iterable<ServerEntry> iterable = (List) arrayList;
                    Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (ServerEntry serverEntry : iterable) {
                        arrayList2.add(new ServerRow(serverEntry.getName(), serverEntry.getAddress(), serverEntry.getDescription()));
                    }
                    return (List) arrayList2;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getServers(String instance, Continuation<? super List<ServerRow>> continuation) {
        return safe(CollectionsKt.emptyList(), new AnonymousClass2(instance, null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/PlaytimeRow;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$getPlaytime$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$getPlaytime$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends PlaytimeRow>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends PlaytimeRow>> continuation) {
            return invoke2((Continuation<? super List<PlaytimeRow>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<PlaytimeRow>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Map all = RepositoryUiApi.this.repo.getPlaytime().all();
                    Iterable<String> iterableKeySet = all.keySet();
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableKeySet, 10));
                    for (String str : iterableKeySet) {
                        Map mapObj = JsonKt.obj(all, str);
                        Long lM8043long = JsonKt.m8043long(mapObj, "total");
                        long jLongValue = lM8043long != null ? lM8043long.longValue() : 0L;
                        Map<String, Object> mapObj2 = JsonKt.obj(mapObj, "versions");
                        int size = 0;
                        int size2 = mapObj2 != null ? mapObj2.size() : 0;
                        List<Object> listArr = JsonKt.arr(mapObj, "sessions");
                        if (listArr != null) {
                            size = listArr.size();
                        }
                        arrayList.add(new PlaytimeRow(str, jLongValue, size2, size));
                    }
                    return (List) arrayList;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getPlaytime(Continuation<? super List<PlaytimeRow>> continuation) {
        return safe(CollectionsKt.emptyList(), new AnonymousClass2(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiplayerController getMp() {
        return MultiplayerController.INSTANCE.get(this.ctx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MpState toUi(MultiplayerState s) {
        MpState mpState;
        if (s instanceof MultiplayerState.Unavailable) {
            mpState = new MpState(MpPhase.NotInstalled, null, null, null, "联机内核不可用：" + ((MultiplayerState.Unavailable) s).getReason(), null, null, 110, null);
        } else if (Intrinsics.areEqual(s, MultiplayerState.Uninitialized.INSTANCE)) {
            mpState = new MpState(MpPhase.Stopped, null, null, null, "联机内核未启动", null, null, 110, null);
        } else if (Intrinsics.areEqual(s, MultiplayerState.Waiting.INSTANCE)) {
            mpState = new MpState(MpPhase.Idle, null, null, null, "内核运行中，等待操作", null, null, 110, null);
        } else if (Intrinsics.areEqual(s, MultiplayerState.HostScanning.INSTANCE)) {
            mpState = new MpState(MpPhase.HostScanning, null, null, null, "正在扫描局域网世界", null, null, 110, null);
        } else if (Intrinsics.areEqual(s, MultiplayerState.HostStarting.INSTANCE)) {
            mpState = new MpState(MpPhase.HostScanning, null, null, null, "正在启动房间", null, null, 110, null);
        } else if (!(s instanceof MultiplayerState.HostOk)) {
            if (Intrinsics.areEqual(s, MultiplayerState.GuestConnecting.INSTANCE)) {
                mpState = new MpState(MpPhase.GuestJoining, null, null, null, "正在连接房间", null, null, 110, null);
            } else if (s instanceof MultiplayerState.GuestStarting) {
                MpPhase mpPhase = MpPhase.GuestJoining;
                String difficulty = ((MultiplayerState.GuestStarting) s).getDifficulty();
                if (difficulty == null) {
                    difficulty = "";
                }
                mpState = new MpState(mpPhase, null, null, null, "正在加入房间", null, difficulty, 46, null);
            } else if (!(s instanceof MultiplayerState.GuestOk)) {
                if (!(s instanceof MultiplayerState.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                mpState = new MpState(MpPhase.Error, null, null, null, ((MultiplayerState.Error) s).getMessage(), null, null, 110, null);
            } else {
                MpPhase mpPhase2 = MpPhase.GuestReady;
                Iterable<TerracottaProfile> profiles = ((MultiplayerState.GuestOk) s).getProfiles();
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(profiles, 10));
                for (TerracottaProfile terracottaProfile : profiles) {
                    arrayList.add(TuplesKt.to(terracottaProfile.getName(), Boolean.valueOf(Intrinsics.areEqual(terracottaProfile.getKind(), "HOST"))));
                }
                mpState = new MpState(mpPhase2, null, (List) arrayList, null, ((MultiplayerState.GuestOk) s).getUrl(), ((MultiplayerState.GuestOk) s).getUrl(), null, 74, null);
            }
        } else {
            MpPhase mpPhase3 = MpPhase.Hosting;
            String room = ((MultiplayerState.HostOk) s).getRoom();
            Iterable<TerracottaProfile> profiles2 = ((MultiplayerState.HostOk) s).getProfiles();
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(profiles2, 10));
            for (TerracottaProfile terracottaProfile2 : profiles2) {
                arrayList2.add(TuplesKt.to(terracottaProfile2.getName(), Boolean.valueOf(Intrinsics.areEqual(terracottaProfile2.getKind(), "HOST"))));
            }
            mpState = new MpState(mpPhase3, room, (List) arrayList2, null, null, null, null, 120, null);
        }
        return MpState.copy$default(mpState, null, null, null, TerracottaInterop.INSTANCE.localIps(), null, null, null, 119, null);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/android/ui/state/MpState;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$terracottaState$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$terracottaState$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super MpState>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super MpState> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return RepositoryUiApi.this.toUi(RepositoryUiApi.this.getMp().getState().getValue());
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object terracottaState(Continuation<? super MpState> continuation) {
        return io(new AnonymousClass2(null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/android/ui/state/MpState;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$terracottaStart$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$terracottaStart$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super MpState>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super MpState> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RepositoryUiApi.this.getMp().initialize();
                    return RepositoryUiApi.this.toUi(RepositoryUiApi.this.getMp().getState().getValue());
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Flow<MpState> terracottaStates() {
        return FlowKt.flowOn(new RepositoryUiApi$terracottaStates$$inlined$map$1(getMp().getState(), this), Dispatchers.getIO());
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object terracottaStart(Continuation<? super MpState> continuation) {
        return io(new AnonymousClass2(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void prepareMp() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi.prepareMp():void");
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$terracottaHost$2", f = "RepositoryUiApi.kt", i = {}, l = {433}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$terracottaHost$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objHost$default;
            String reason;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RepositoryUiApi.this.prepareMp();
                    this.label = 1;
                    objHost$default = MultiplayerController.host$default(RepositoryUiApi.this.getMp(), null, this, 1, null);
                    if (objHost$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objHost$default = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) objHost$default).booleanValue()) {
                return Unit.INSTANCE;
            }
            MultiplayerState value = RepositoryUiApi.this.getMp().getState().getValue();
            MultiplayerState.Unavailable unavailable = value instanceof MultiplayerState.Unavailable ? (MultiplayerState.Unavailable) value : null;
            if (unavailable == null || (reason = unavailable.getReason()) == null) {
                reason = "联机内核启动失败";
            }
            throw new IllegalStateException(reason);
        }
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$terracottaJoin$2", f = "RepositoryUiApi.kt", i = {}, l = {441}, m = "invokeSuspend", n = {}, nl = {495}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$terracottaJoin$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $code;
        int label;
        final /* synthetic */ RepositoryUiApi this$0;

        /* compiled from: RepositoryUiApi.kt */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        /* renamed from: com.pymcl.android.data.RepositoryUiApi$terracottaJoin$2$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TerracottaInterop.CodeKind.values().length];
                try {
                    iArr[TerracottaInterop.CodeKind.LEGACY_PCL.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[TerracottaInterop.CodeKind.INVALID.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, RepositoryUiApi repositoryUiApi, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$code = str;
            this.this$0 = repositoryUiApi;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$code, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objJoin;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    switch (WhenMappings.$EnumSwitchMapping$0[TerracottaInterop.INSTANCE.classify(this.$code).ordinal()]) {
                        case 1:
                            return "这是旧版 PCL 联机房间号，与陶瓦联机不互通";
                        case 2:
                            return "邀请码格式不正确（应为 U/XXXX-XXXX-XXXX-XXXX）";
                        default:
                            this.this$0.prepareMp();
                            this.label = 1;
                            objJoin = this.this$0.getMp().join(this.$code, this);
                            if (objJoin == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            break;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    objJoin = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) objJoin).booleanValue()) {
                return null;
            }
            MultiplayerState value = this.this$0.getMp().getState().getValue();
            MultiplayerState.Unavailable unavailable = value instanceof MultiplayerState.Unavailable ? (MultiplayerState.Unavailable) value : null;
            if (unavailable != null) {
                String str = "联机内核不可用：" + unavailable.getReason();
                if (str != null) {
                    return str;
                }
            }
            return "内核拒绝了该邀请码";
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object terracottaHost(Continuation<? super Unit> continuation) {
        Object objIo = io(new AnonymousClass2(null), continuation);
        return objIo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objIo : Unit.INSTANCE;
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object terracottaJoin(String code, Continuation<? super String> continuation) {
        return io(new AnonymousClass2(code, this, null), continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object terracottaStop(Continuation<? super Unit> continuation) {
        return getMp().stop(continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u00042\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "Ljava/util/LinkedHashMap;", "", "Lcom/pymcl/android/ui/state/LanWorldRow;", "Lkotlin/collections/LinkedHashMap;", "acc", "w", "Lcom/pymcl/multiplayer/LanWorld;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$lanWorlds$1", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$lanWorlds$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function3<LinkedHashMap<String, LanWorldRow>, LanWorld, Continuation<? super LinkedHashMap<String, LanWorldRow>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(LinkedHashMap<String, LanWorldRow> linkedHashMap, LanWorld lanWorld, Continuation<? super LinkedHashMap<String, LanWorldRow>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = linkedHashMap;
            anonymousClass1.L$1 = lanWorld;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            LinkedHashMap acc = (LinkedHashMap) this.L$0;
            LanWorld w = (LanWorld) this.L$1;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(acc);
                    linkedHashMap.put(w.getAddress(), new LanWorldRow(w.getMotd(), w.getAddress()));
                    return linkedHashMap;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Flow<List<LanWorldRow>> lanWorlds() {
        return new RepositoryUiApi$lanWorlds$$inlined$map$1(FlowKt.scan(LanDiscovery.INSTANCE.discover(this.ctx), new LinkedHashMap(), new AnonymousClass1(null)));
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public String normalizeDirect(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return LanDiscovery.INSTANCE.normalizeDirect(address);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/ChatSummary;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$aiListChats$2", f = "RepositoryUiApi.kt", i = {}, l = {Shaderc.shaderc_env_version_webgpu}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$aiListChats$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends ChatSummary>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends ChatSummary>> continuation) {
            return invoke2((Continuation<? super List<ChatSummary>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<ChatSummary>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objChats = RepositoryUiApi.this.getAi().chats(this);
                    return objChats == coroutine_suspended ? coroutine_suspended : objChats;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiBridge ai_delegate$lambda$0(RepositoryUiApi this$0) {
        return new AiBridge(this$0.ctx, this$0);
    }

    public final AiBridge getAi() {
        return (AiBridge) this.ai.getValue();
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object aiListChats(Continuation<? super List<ChatSummary>> continuation) {
        return safe(CollectionsKt.emptyList(), new AnonymousClass2(null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$aiListModels$2", f = "RepositoryUiApi.kt", i = {}, l = {453}, m = "invokeSuspend", n = {}, nl = {495}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$aiListModels$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends String>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends String>> continuation) {
            return invoke2((Continuation<? super List<String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<String>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objModels$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objModels$default = AiUiExtras.models$default(RepositoryUiApi.this.getAi(), null, this, 1, null);
                    if (objModels$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objModels$default = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection = (Collection) objModels$default;
            return collection.isEmpty() ? CollectionsKt.listOf(RepositoryUiApi.this.repo.getConfig().string("ai_model")) : collection;
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Flow<AiItem> aiSend(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return getAi().sendAsItems(text);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/PermissionRule;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$aiPermissionRules$2", f = "RepositoryUiApi.kt", i = {}, l = {454}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$aiPermissionRules$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends PermissionRule>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends PermissionRule>> continuation) {
            return invoke2((Continuation<? super List<PermissionRule>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<PermissionRule>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objRules = RepositoryUiApi.this.getAi().rules(this);
                    return objRules == coroutine_suspended ? coroutine_suspended : objRules;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object aiListModels(Continuation<? super List<String>> continuation) {
        return safe(CollectionsKt.listOf(this.repo.getConfig().string("ai_model")), new AnonymousClass2(null), continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object aiPermissionRules(Continuation<? super List<PermissionRule>> continuation) {
        return safe(CollectionsKt.emptyList(), new AnonymousClass2(null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/android/ui/state/UiSettings;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$getSettings$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$getSettings$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super UiSettings>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super UiSettings> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    ConfigStore config = RepositoryUiApi.this.repo.getConfig();
                    boolean zBool = config.bool("ui_dark");
                    boolean zBool2 = config.bool("ui_motion");
                    boolean zBool3 = config.bool("ui_fly_animation");
                    int iM8017int = config.m8017int("ui_fly_duration_ms");
                    boolean zAreEqual = Intrinsics.areEqual(config.string("ui_nav_style"), "compact");
                    String strString = config.string("ui_background");
                    String strString2 = config.string("ui_background_folder");
                    boolean zBool4 = config.bool("ui_background_shuffle");
                    int iM8017int2 = config.m8017int("ui_background_interval");
                    int iM8017int3 = config.m8017int("ui_background_blur");
                    int iM8017int4 = config.m8017int("ui_background_dim");
                    int iM8017int5 = config.m8017int("download_threads");
                    int iM8017int6 = config.m8017int("download_segments");
                    int iCoerceAtLeast = RangesKt.coerceAtLeast(RepositoryUiApi.this.sources.indexOf(config.string("download_source")), 0);
                    int iCoerceAtLeast2 = RangesKt.coerceAtLeast(RepositoryUiApi.this.sources.indexOf(config.string("community_source")), 0);
                    boolean zBool5 = config.bool("use_system_proxy");
                    int iM8017int7 = config.m8017int("download_limit_kbps");
                    String strString3 = config.string("curseforge_api_key");
                    String absolutePath = RepositoryUiApi.this.repo.getPaths().getInstancesDir().getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    int iM8017int8 = config.m8017int("memory_mb");
                    int iM8017int9 = config.m8017int("width");
                    int iM8017int10 = config.m8017int("height");
                    String strString4 = config.string("default_instance");
                    RepositoryUiApi repositoryUiApi = RepositoryUiApi.this;
                    if (strString4.length() == 0) {
                        strString4 = repositoryUiApi.repo.getInstances().getRootName();
                    }
                    Intrinsics.checkNotNullExpressionValue(strString4, "ifEmpty(...)");
                    String str = strString4;
                    String strString5 = config.string("default_jvm_args");
                    boolean zBool6 = config.bool("allow_multi_instance");
                    boolean zBool7 = config.bool("shared_libraries");
                    boolean zBool8 = config.bool("shared_assets");
                    String strString6 = config.string("ai_gateway_url");
                    String strString7 = config.string("ai_base_url");
                    String strString8 = config.string("ai_model");
                    int iM8017int11 = config.m8017int("ai_context_window");
                    boolean zBool9 = config.bool("auto_check_update");
                    String strString9 = config.string("update_url");
                    String strString10 = config.string("microsoft_client_id");
                    return new UiSettings(zBool, 0, null, 0, 0, false, 0, zBool2, zBool3, iM8017int, false, zAreEqual ? 1 : 0, strString, strString2, zBool4, iM8017int2, iM8017int3, iM8017int4, 0, iM8017int5, iM8017int6, iCoerceAtLeast, iCoerceAtLeast2, zBool5, iM8017int7, strString3, absolutePath, iM8017int8, iM8017int9, iM8017int10, str, 0, 0, 0, strString5, zBool6, zBool7, zBool8, 0, strString6, strString7, null, strString8, iM8017int11, null, 0, 0, 0, config.string("custom_homepage"), zBool9, strString9, strString10, StringsKt.startsWith$default(config.string("language"), "en", false, 2, (Object) null) ? 1 : 0, config.bool("first_run"), -2147220354, 62019, null);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getSettings(Continuation<? super UiSettings> continuation) {
        return safe(new UiSettings(false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1, SPV.kDefaultMaxIdBound, null), new AnonymousClass2(null), continuation);
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$saveSettings$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$saveSettings$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ UiSettings $s;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(UiSettings uiSettings, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$s = uiSettings;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(this.$s, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RepositoryUiApi.this.repo.getConfig().update(RepositoryUiApi.INSTANCE.settingsUpdates(this.$s));
                    RepositoryUiApi.this.repo.applyDownloadSettings();
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object saveSettings(UiSettings s, Continuation<? super Unit> continuation) {
        Object objIo = io(new AnonymousClass2(s, null), continuation);
        return objIo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objIo : Unit.INSTANCE;
    }

    /* compiled from: RepositoryUiApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/FeedbackRecord;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$feedbackHistory$2", f = "RepositoryUiApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$feedbackHistory$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends FeedbackRecord>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApi.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends FeedbackRecord>> continuation) {
            return invoke2((Continuation<? super List<FeedbackRecord>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<FeedbackRecord>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return FeedbackHistory.INSTANCE.toRows(FeedbackHistory.INSTANCE.load(LauncherRepository.INSTANCE.rootDir(RepositoryUiApi.this.getCtx())));
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object feedbackHistory(Continuation<? super List<FeedbackRecord>> continuation) {
        return safe(CollectionsKt.emptyList(), new AnonymousClass2(null), continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object helpArticles(Continuation<? super List<HelpArticle>> continuation) {
        return CollectionsKt.listOf((Object[]) new HelpArticle[]{new HelpArticle("游戏启动后黑屏怎么办？", "先在设置里换一个渲染器，再检查 Java 版本是否匹配。"), new HelpArticle("首次启动为什么慢？", "首次需要解压内置 Java 运行时并下载游戏文件，之后会快很多。"), new HelpArticle("联机需要什么条件？", "双方都下载陶瓦联机内核，房主开局域网后把邀请码发给朋友。")});
    }
}
