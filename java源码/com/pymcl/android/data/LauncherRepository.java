package com.pymcl.android.data;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.android.data.LaunchConfigLogic;
import com.pymcl.android.data.SettingsLogic;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.core.account.Account;
import com.pymcl.core.account.AccountStore;
import com.pymcl.core.account.AccountType;
import com.pymcl.core.account.Offline;
import com.pymcl.core.auth.AgentJars;
import com.pymcl.core.auth.AuthException;
import com.pymcl.core.auth.DeviceCode;
import com.pymcl.core.auth.MicrosoftAuth;
import com.pymcl.core.auth.OfflineSkins;
import com.pymcl.core.auth.SkinServer;
import com.pymcl.core.auth.YggdrasilAuth;
import com.pymcl.core.config.ConfigStore;
import com.pymcl.core.config.LauncherPaths;
import com.pymcl.core.crash.CrashAnalyzer;
import com.pymcl.core.crash.CrashInput;
import com.pymcl.core.crash.CrashReason;
import com.pymcl.core.download.DownloadManager;
import com.pymcl.core.download.DownloadProgress;
import com.pymcl.core.download.Mirrors;
import com.pymcl.core.instance.Instance;
import com.pymcl.core.instance.InstanceManager;
import com.pymcl.core.instance.PlaytimeStore;
import com.pymcl.core.instance.VersionSettings;
import com.pymcl.core.launch.LaunchArgsBuilder;
import com.pymcl.core.launch.LaunchOptions;
import com.pymcl.core.launch.LaunchSpec;
import com.pymcl.core.loader.InstallError;
import com.pymcl.core.loader.LoaderInstaller;
import com.pymcl.core.loader.LoaderType;
import com.pymcl.core.loader.LoaderVersion;
import com.pymcl.core.loader.LoadersKt;
import com.pymcl.core.mods.ModCatalog;
import com.pymcl.core.mods.ModTools;
import com.pymcl.core.net.Http;
import com.pymcl.core.net.UrlConnectionHttp;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import com.pymcl.core.version.GameDirs;
import com.pymcl.core.version.GameInstaller;
import com.pymcl.core.version.ResolvedVersion;
import com.pymcl.core.version.RuleEnv;
import com.pymcl.core.version.VersionManifest;
import com.pymcl.runtime.FclLaunchArgs;
import com.pymcl.runtime.GameLaunchRequest;
import com.pymcl.runtime.JavaDownloads;
import com.pymcl.runtime.Renderers;
import com.pymcl.runtime.RuntimeInstaller;
import com.pymcl.runtime.RuntimeLayout;
import com.pymcl.runtime.input.InputSettings;
import com.pymcl.runtime.process.FclJavaProcessRunner;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.awt.Choice;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.lwjgl.LWJGLUtil;

/* compiled from: LauncherRepository.kt */
@Metadata(d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 ©\u00012\u00020\u0001:\u0002©\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J@\u0010P\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020E2\u001c\b\u0002\u0010T\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010V\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020W0UH\u0086@¢\u0006\u0002\u0010XJ\u0006\u0010^\u001a\u00020WJ\u000e\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bJ\u0006\u0010c\u001a\u00020bJ\u0018\u0010d\u001a\u00020e2\b\b\u0002\u0010f\u001a\u00020gH\u0086@¢\u0006\u0002\u0010hJ \u0010i\u001a\u00020R2\u0006\u0010j\u001a\u00020R2\b\b\u0002\u0010k\u001a\u00020bH\u0086@¢\u0006\u0002\u0010lJ0\u0010m\u001a\u00020R2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020R2\u0006\u0010q\u001a\u00020R2\b\b\u0002\u0010k\u001a\u00020bH\u0086@¢\u0006\u0002\u0010rJ$\u0010s\u001a\b\u0012\u0004\u0012\u00020u0t2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020RH\u0086@¢\u0006\u0002\u0010vJ\u0018\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020R2\b\b\u0002\u0010z\u001a\u00020RJ4\u0010{\u001a\u00020x2\u0012\u0010|\u001a\u000e\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020W0}2\u000f\b\u0002\u0010\u007f\u001a\t\u0012\u0004\u0012\u00020g0\u0080\u0001H\u0086@¢\u0006\u0003\u0010\u0081\u0001J1\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020x0t2\u0007\u0010\u0083\u0001\u001a\u00020R2\u0007\u0010\u0084\u0001\u001a\u00020R2\u0007\u0010\u0085\u0001\u001a\u00020RH\u0086@¢\u0006\u0003\u0010\u0086\u0001J1\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020x0t2\u0007\u0010\u0088\u0001\u001a\u00020R2\u0007\u0010\u0084\u0001\u001a\u00020R2\u0007\u0010\u0085\u0001\u001a\u00020RH\u0086@¢\u0006\u0003\u0010\u0086\u0001J\u0019\u0010\u0089\u0001\u001a\u00020x2\u0007\u0010\u008a\u0001\u001a\u00020xH\u0086@¢\u0006\u0003\u0010\u008b\u0001J#\u0010\u008c\u0001\u001a\u00020W2\u0006\u0010y\u001a\u00020R2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010R2\u0007\u0010\u008e\u0001\u001a\u00020RJ\u0012\u0010\u008f\u0001\u001a\u0004\u0018\u00010E2\u0007\u0010\u008a\u0001\u001a\u00020xJ\u001e\u0010\u0090\u0001\u001a\u0010\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020R\u0018\u00010Q2\u0007\u0010\u008a\u0001\u001a\u00020xJU\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020R2\b\b\u0002\u0010k\u001a\u00020b2\u000b\b\u0002\u0010\u0094\u0001\u001a\u0004\u0018\u00010R2\u000b\b\u0002\u0010\u0095\u0001\u001a\u0004\u0018\u00010R2\u0015\b\u0002\u0010\u0096\u0001\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020W0}H\u0086@¢\u0006\u0003\u0010\u0097\u0001J\u0013\u0010\u0098\u0001\u001a\u00020g2\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0002J=\u0010\u009b\u0001\u001a\u00030\u0092\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u00012\b\u0010\u009e\u0001\u001a\u00030\u009f\u00012\u0007\u0010 \u0001\u001a\u00020E2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010R2\u000b\b\u0002\u0010\u0095\u0001\u001a\u0004\u0018\u00010RJ+\u0010¡\u0001\u001a\u00020W2\u0006\u0010k\u001a\u00020b2\u0006\u0010q\u001a\u00020R2\b\u0010¢\u0001\u001a\u00030£\u00012\b\u0010¤\u0001\u001a\u00030£\u0001J*\u0010¥\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010t2\u0007\u0010 \u0001\u001a\u00020E2\b\u0010§\u0001\u001a\u00030\u009a\u00012\u0007\u0010¨\u0001\u001a\u00020RR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u000207¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010:\u001a\u00020;¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u001b\u0010>\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b@\u0010AR\u0011\u0010D\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010H\u001a\u00020I¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010L\u001a\u00020M¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0Z8F¢\u0006\u0006\u001a\u0004\b\\\u0010]Ê\u0001\u000e\b«\u0001\u0012\t\b¬\u0001\u0012\u0004\b\u0003\u0010\u0000¨\u0006ª\u0001"}, d2 = {"Lcom/pymcl/android/data/LauncherRepository;", "", "ctx", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "http", "Lcom/pymcl/core/net/Http;", "getHttp", "()Lcom/pymcl/core/net/Http;", "paths", "Lcom/pymcl/core/config/LauncherPaths;", "getPaths", "()Lcom/pymcl/core/config/LauncherPaths;", "config", "Lcom/pymcl/core/config/ConfigStore;", "getConfig", "()Lcom/pymcl/core/config/ConfigStore;", "accounts", "Lcom/pymcl/core/account/AccountStore;", "getAccounts", "()Lcom/pymcl/core/account/AccountStore;", "instances", "Lcom/pymcl/core/instance/InstanceManager;", "getInstances", "()Lcom/pymcl/core/instance/InstanceManager;", "playtime", "Lcom/pymcl/core/instance/PlaytimeStore;", "getPlaytime", "()Lcom/pymcl/core/instance/PlaytimeStore;", "mirrors", "Lcom/pymcl/core/download/Mirrors;", "getMirrors", "()Lcom/pymcl/core/download/Mirrors;", "downloads", "Lcom/pymcl/core/download/DownloadManager;", "getDownloads", "()Lcom/pymcl/core/download/DownloadManager;", "ruleEnv", "Lcom/pymcl/core/version/RuleEnv;", "getRuleEnv", "()Lcom/pymcl/core/version/RuleEnv;", "game", "Lcom/pymcl/core/version/GameInstaller;", "getGame", "()Lcom/pymcl/core/version/GameInstaller;", "loaders", "Lcom/pymcl/core/loader/LoaderInstaller;", "getLoaders", "()Lcom/pymcl/core/loader/LoaderInstaller;", "microsoft", "Lcom/pymcl/core/auth/MicrosoftAuth;", "getMicrosoft", "()Lcom/pymcl/core/auth/MicrosoftAuth;", "yggdrasil", "Lcom/pymcl/core/auth/YggdrasilAuth;", "getYggdrasil", "()Lcom/pymcl/core/auth/YggdrasilAuth;", "agents", "Lcom/pymcl/core/auth/AgentJars;", "getAgents", "()Lcom/pymcl/core/auth/AgentJars;", "skinServer", "Lcom/pymcl/core/auth/SkinServer;", "getSkinServer", "()Lcom/pymcl/core/auth/SkinServer;", "skinServer$delegate", "Lkotlin/Lazy;", "skinsDir", "Ljava/io/File;", "getSkinsDir", "()Ljava/io/File;", "catalog", "Lcom/pymcl/core/mods/ModCatalog;", "getCatalog", "()Lcom/pymcl/core/mods/ModCatalog;", "modTools", "Lcom/pymcl/core/mods/ModTools;", "getModTools", "()Lcom/pymcl/core/mods/ModTools;", "importModpack", "Lkotlin/Pair;", "", ArchiveStreamFactory.ZIP, "onProgress", "Lkotlin/Function2;", "", "", "(Ljava/io/File;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadProgress", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/pymcl/core/download/DownloadProgress;", "getDownloadProgress", "()Lkotlinx/coroutines/flow/StateFlow;", "applyDownloadSettings", "dirsFor", "Lcom/pymcl/core/version/GameDirs;", "i", "Lcom/pymcl/core/instance/Instance;", "currentInstance", "versionManifest", "Lcom/pymcl/core/version/VersionManifest;", "force", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installVanilla", "id", "inst", "(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installLoader", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/pymcl/core/loader/LoaderType;", "mc", "version", "(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loaderVersions", "", "Lcom/pymcl/core/loader/LoaderVersion;", "(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addOffline", "Lcom/pymcl/core/account/Account;", HintConstants.AUTOFILL_HINT_NAME, "skin", "loginMicrosoft", "onCode", "Lkotlin/Function1;", "Lcom/pymcl/core/auth/DeviceCode;", "cancelled", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginAuthlib", "api", "user", "pass", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginNide8", "serverId", "refreshIfNeeded", "a", "(Lcom/pymcl/core/account/Account;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setOfflineSkin", "src", "model", "offlineSkinFile", "prepareOfflineSkin", "buildLaunchRequest", "Lcom/pymcl/runtime/GameLaunchRequest;", "versionId", "rendererId", "server", "onNote", "(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "javaAvailable", "major", "", "toFclRequest", SettingsProtocol.EXTRA_VALUE, "Lcom/pymcl/core/version/ResolvedVersion;", "spec", "Lcom/pymcl/core/launch/LaunchSpec;", "gameDir", "recordPlaytime", "startSec", "", "durationSec", "analyzeCrash", "Lcom/pymcl/core/crash/CrashReason;", "exitCode", "output", "Companion", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class LauncherRepository {
    private static volatile LauncherRepository inst;
    private final AccountStore accounts;
    private final AgentJars agents;
    private final ModCatalog catalog;
    private final ConfigStore config;
    private final Context ctx;
    private final DownloadManager downloads;
    private final GameInstaller game;
    private final Http http;
    private final InstanceManager instances;
    private final LoaderInstaller loaders;
    private final MicrosoftAuth microsoft;
    private final Mirrors mirrors;
    private final ModTools modTools;
    private final LauncherPaths paths;
    private final PlaytimeStore playtime;
    private final RuleEnv ruleEnv;

    /* renamed from: skinServer$delegate, reason: from kotlin metadata */
    private final Lazy skinServer;
    private final YggdrasilAuth yggdrasil;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LauncherRepository(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* compiled from: LauncherRepository.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/pymcl/android/data/LauncherRepository$Companion;", "", "<init>", "()V", "inst", "Lcom/pymcl/android/data/LauncherRepository;", SettingsProtocol.GET, "ctx", "Landroid/content/Context;", "rootDir", "Ljava/io/File;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LauncherRepository get(Context ctx) {
            LauncherRepository launcherRepository;
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            LauncherRepository launcherRepository2 = LauncherRepository.inst;
            if (launcherRepository2 != null) {
                return launcherRepository2;
            }
            synchronized (this) {
                launcherRepository = LauncherRepository.inst;
                if (launcherRepository == null) {
                    Context applicationContext = ctx.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    launcherRepository = new LauncherRepository(applicationContext, null);
                    Companion companion = LauncherRepository.INSTANCE;
                    LauncherRepository.inst = launcherRepository;
                }
            }
            return launcherRepository;
        }

        public final File rootDir(Context ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            File pub = new File(Environment.getExternalStorageDirectory(), "PyMCL");
            if ((pub.isDirectory() || pub.mkdirs()) && pub.canWrite()) {
                return pub;
            }
            File externalFilesDir = ctx.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                externalFilesDir = ctx.getFilesDir();
            }
            File file = new File(externalFilesDir, "PyMCL");
            file.mkdirs();
            return file;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LauncherRepository(Context context) {
        this.ctx = context;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.http = new UrlConnectionHttp(null, 1, 0 == true ? 1 : 0);
        int i = 2;
        this.paths = new LauncherPaths(INSTANCE.rootDir(this.ctx), null, 2, null);
        this.config = new ConfigStore(this.paths);
        this.accounts = new AccountStore(this.paths, KeystoreTokenCipher.INSTANCE);
        this.instances = new InstanceManager(this.paths);
        this.playtime = new PlaytimeStore(this.paths);
        this.mirrors = new Mirrors(this.http, new Function0() { // from class: com.pymcl.android.data.LauncherRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LauncherRepository.mirrors$lambda$0(this.f$0);
            }
        }, new Function0() { // from class: com.pymcl.android.data.LauncherRepository$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LauncherRepository.mirrors$lambda$1(this.f$0);
            }
        }, null, 8, null);
        this.downloads = new DownloadManager(this.http, this.config.m8017int("download_threads"), this.config.m8017int("download_segments"), this.config.m8017int("download_limit_kbps"), 0, new Function0() { // from class: com.pymcl.android.data.LauncherRepository$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LauncherRepository.downloads$lambda$0(this.f$0);
            }
        }, null, 80, null);
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        String str = (String) ArraysKt.firstOrNull(SUPPORTED_ABIS);
        this.ruleEnv = new RuleEnv(LWJGLUtil.PLATFORM_LINUX_NAME, ((str == null || !StringsKt.contains$default((CharSequence) str, (CharSequence) "64", false, 2, (Object) null)) ? 0 : 1) != 0 ? "arm64" : "arm", null, null, 12, null);
        this.game = new GameInstaller(this.http, this.mirrors, this.downloads, this.paths.getCacheDir(), this.ruleEnv);
        this.loaders = new LoaderInstaller(this.http, this.mirrors, this.downloads, this.game, this.paths.getCacheDir(), new FclJavaProcessRunner(this.ctx));
        this.microsoft = new MicrosoftAuth(this.http, new Function0() { // from class: com.pymcl.android.data.LauncherRepository$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LauncherRepository.microsoft$lambda$0(this.f$0);
            }
        }, null, 4, null);
        this.yggdrasil = new YggdrasilAuth(this.http, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        this.agents = new AgentJars(this.http, this.paths.getRoot());
        this.skinServer = LazyKt.lazy(new Function0() { // from class: com.pymcl.android.data.LauncherRepository$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LauncherRepository.skinServer_delegate$lambda$0();
            }
        });
        this.catalog = new ModCatalog(this.http, this.mirrors, new Function0() { // from class: com.pymcl.android.data.LauncherRepository$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LauncherRepository.catalog$lambda$0(this.f$0);
            }
        });
        this.modTools = new ModTools(this.catalog, this.mirrors, new File(this.paths.getCacheDir(), "mod_ident.json"));
    }

    public final Http getHttp() {
        return this.http;
    }

    public final LauncherPaths getPaths() {
        return this.paths;
    }

    public final ConfigStore getConfig() {
        return this.config;
    }

    public final AccountStore getAccounts() {
        return this.accounts;
    }

    public final InstanceManager getInstances() {
        return this.instances;
    }

    public final PlaytimeStore getPlaytime() {
        return this.playtime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mirrors$lambda$0(LauncherRepository this$0) {
        return this$0.config.string("download_source");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mirrors$lambda$1(LauncherRepository this$0) {
        return this$0.config.string("community_source");
    }

    public final Mirrors getMirrors() {
        return this.mirrors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloads$lambda$0(LauncherRepository this$0) {
        return this$0.config.getCurseforgeKey();
    }

    public final DownloadManager getDownloads() {
        return this.downloads;
    }

    public final RuleEnv getRuleEnv() {
        return this.ruleEnv;
    }

    public final GameInstaller getGame() {
        return this.game;
    }

    public final LoaderInstaller getLoaders() {
        return this.loaders;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String microsoft$lambda$0(LauncherRepository this$0) {
        return this$0.config.getMicrosoftClientId();
    }

    public final MicrosoftAuth getMicrosoft() {
        return this.microsoft;
    }

    public final YggdrasilAuth getYggdrasil() {
        return this.yggdrasil;
    }

    public final AgentJars getAgents() {
        return this.agents;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SkinServer skinServer_delegate$lambda$0() {
        return new SkinServer(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final SkinServer getSkinServer() {
        return (SkinServer) this.skinServer.getValue();
    }

    public final File getSkinsDir() {
        return new File(this.paths.getRoot(), "skins");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String catalog$lambda$0(LauncherRepository this$0) {
        return this$0.config.getCurseforgeKey();
    }

    public final ModCatalog getCatalog() {
        return this.catalog;
    }

    public final ModTools getModTools() {
        return this.modTools;
    }

    /* compiled from: LauncherRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.LauncherRepository$importModpack$3", f = "LauncherRepository.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {69, 73, 76}, m = "invokeSuspend", n = {"info", "inst", "info", "inst", "lt", "lv", "info", "inst", "lt", "lv", "vid", "gameDir"}, nl = {70, 74, 77}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
    /* renamed from: com.pymcl.android.data.LauncherRepository$importModpack$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends String, ? extends String>>, Object> {
        final /* synthetic */ Function2<Float, String, Unit> $onProgress;
        final /* synthetic */ File $zip;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ LauncherRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(File file, LauncherRepository launcherRepository, Function2<? super Float, ? super String, Unit> function2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$zip = file;
            this.this$0 = launcherRepository;
            this.$onProgress = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$zip, this.this$0, this.$onProgress, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends String, ? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Pair<String, String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<String, String>> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x017e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 468
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.LauncherRepository.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Function2 $onProgress, float p, String d) {
            $onProgress.invoke(Float.valueOf(p), d);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object importModpack$default(LauncherRepository launcherRepository, File file, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function2() { // from class: com.pymcl.android.data.LauncherRepository$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LauncherRepository.importModpack$lambda$0((Float) obj2, (String) obj3);
                }
            };
        }
        return launcherRepository.importModpack(file, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit importModpack$lambda$0(Float f, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    public final Object importModpack(File zip, Function2<? super Float, ? super String, Unit> function2, Continuation<? super Pair<String, String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass3(zip, this, function2, null), continuation);
    }

    public final StateFlow<DownloadProgress> getDownloadProgress() {
        return this.downloads.getProgress();
    }

    public final void applyDownloadSettings() {
        this.downloads.setThreads(this.config.m8017int("download_threads"));
        this.downloads.setSegments(this.config.m8017int("download_segments"));
        this.downloads.getLimiter().setKbps(this.config.m8017int("download_limit_kbps"));
        this.mirrors.invalidateProbe();
    }

    public final GameDirs dirsFor(Instance i) {
        Intrinsics.checkNotNullParameter(i, "i");
        return new GameDirs(i.getDir(), this.config.bool("shared_libraries") ? new File(this.paths.getSharedDir(), "libraries") : new File(i.getDir(), "libraries"), this.config.bool("shared_assets") ? new File(this.paths.getSharedDir(), "assets") : new File(i.getDir(), "assets"));
    }

    public final Instance currentInstance() {
        String strString = this.config.string("default_instance");
        return strString.length() == 0 ? this.instances.ensureRoot() : this.instances.get(strString);
    }

    /* compiled from: LauncherRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/core/version/VersionManifest;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.LauncherRepository$versionManifest$2", f = "LauncherRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.LauncherRepository$versionManifest$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VersionManifest>, Object> {
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LauncherRepository.this.new AnonymousClass2(this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super VersionManifest> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return LauncherRepository.this.getGame().manifest(this.$force);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: LauncherRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.LauncherRepository$installVanilla$2", f = "LauncherRepository.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.LauncherRepository$installVanilla$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ String $id;
        final /* synthetic */ Instance $inst;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Instance instance, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$inst = instance;
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LauncherRepository.this.new AnonymousClass2(this.$inst, this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (GameInstaller.installVanilla$default(LauncherRepository.this.getGame(), LauncherRepository.this.dirsFor(this.$inst), this.$id, LauncherRepository.this.getConfig().bool("skip_assets"), null, this, 8, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.$inst.setMeta("mc_version", this.$id);
            return this.$id;
        }
    }

    public static /* synthetic */ Object versionManifest$default(LauncherRepository launcherRepository, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return launcherRepository.versionManifest(z, continuation);
    }

    public final Object versionManifest(boolean force, Continuation<? super VersionManifest> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(force, null), continuation);
    }

    public static /* synthetic */ Object installVanilla$default(LauncherRepository launcherRepository, String str, Instance instance, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            instance = launcherRepository.currentInstance();
        }
        return launcherRepository.installVanilla(str, instance, continuation);
    }

    public final Object installVanilla(String id, Instance inst2, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(inst2, id, null), continuation);
    }

    /* compiled from: LauncherRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.LauncherRepository$installLoader$2", f = "LauncherRepository.kt", i = {0, 1, 2, 3, 4}, l = {97, 98, 98, 99, 99}, m = "invokeSuspend", n = {"d", "d", "d", "d", "d"}, nl = {98, 98, 99, 99, 97}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.LauncherRepository$installLoader$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ Instance $inst;
        final /* synthetic */ String $mc;
        final /* synthetic */ LoaderType $type;
        final /* synthetic */ String $version;
        Object L$0;
        int label;

        /* compiled from: LauncherRepository.kt */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        /* renamed from: com.pymcl.android.data.LauncherRepository$installLoader$2$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LoaderType.values().length];
                try {
                    iArr[LoaderType.FABRIC.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[LoaderType.QUILT.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                try {
                    iArr[LoaderType.FORGE.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                }
                try {
                    iArr[LoaderType.NEOFORGE.ordinal()] = 4;
                } catch (NoSuchFieldError e4) {
                }
                try {
                    iArr[LoaderType.OPTIFINE.ordinal()] = 5;
                } catch (NoSuchFieldError e5) {
                }
                try {
                    iArr[LoaderType.LITELOADER.ordinal()] = 6;
                } catch (NoSuchFieldError e6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Instance instance, LoaderType loaderType, String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$inst = instance;
            this.$type = loaderType;
            this.$mc = str;
            this.$version = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LauncherRepository.this.new AnonymousClass2(this.$inst, this.$type, this.$mc, this.$version, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws InstallError {
            Object objInstallFabricLike$default;
            Object objInstallForge;
            Object objInstallOptiFine;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GameDirs d = LauncherRepository.this.dirsFor(this.$inst);
                    switch (WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()]) {
                        case 1:
                        case 2:
                            this.L$0 = SpillingKt.nullOutSpilledVariable(d);
                            this.label = 1;
                            objInstallFabricLike$default = LoaderInstaller.installFabricLike$default(LauncherRepository.this.getLoaders(), d, this.$type, this.$mc, this.$version, null, this, 16, null);
                            return objInstallFabricLike$default == coroutine_suspended ? coroutine_suspended : (String) objInstallFabricLike$default;
                        case 3:
                            this.L$0 = SpillingKt.nullOutSpilledVariable(d);
                            this.label = 2;
                            objInstallForge = LauncherRepository.this.getLoaders().installForge(d, this.$mc, this.$version, this);
                            if (objInstallForge == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return (String) objInstallForge;
                        case 4:
                            this.L$0 = SpillingKt.nullOutSpilledVariable(d);
                            this.label = 3;
                            objInstallForge = LauncherRepository.this.getLoaders().installNeoForge(d, this.$mc, this.$version, this);
                            if (objInstallForge == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return (String) objInstallForge;
                        case 5:
                            this.L$0 = SpillingKt.nullOutSpilledVariable(d);
                            this.label = 4;
                            objInstallOptiFine = LauncherRepository.this.getLoaders().installOptiFine(d, this.$mc, this.$version, this);
                            if (objInstallOptiFine == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return (String) objInstallOptiFine;
                        case 6:
                            this.L$0 = SpillingKt.nullOutSpilledVariable(d);
                            this.label = 5;
                            objInstallOptiFine = LoaderInstaller.installLiteLoader$default(LauncherRepository.this.getLoaders(), d, this.$mc, this.$version, null, this, 8, null);
                            if (objInstallOptiFine == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return (String) objInstallOptiFine;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    objInstallFabricLike$default = $result;
                case 2:
                case 3:
                    ResultKt.throwOnFailure($result);
                    objInstallForge = $result;
                    return (String) objInstallForge;
                case 4:
                case 5:
                    ResultKt.throwOnFailure($result);
                    objInstallOptiFine = $result;
                    return (String) objInstallOptiFine;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static /* synthetic */ Object installLoader$default(LauncherRepository launcherRepository, LoaderType loaderType, String str, String str2, Instance instance, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            instance = launcherRepository.currentInstance();
        }
        return launcherRepository.installLoader(loaderType, str, str2, instance, continuation);
    }

    public final Object installLoader(LoaderType type, String mc, String version, Instance inst2, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(inst2, type, mc, version, null), continuation);
    }

    /* compiled from: LauncherRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/core/loader/LoaderVersion;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.LauncherRepository$loaderVersions$2", f = "LauncherRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.LauncherRepository$loaderVersions$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends LoaderVersion>>, Object> {
        final /* synthetic */ String $mc;
        final /* synthetic */ LoaderType $type;
        int label;
        final /* synthetic */ LauncherRepository this$0;

        /* compiled from: LauncherRepository.kt */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        /* renamed from: com.pymcl.android.data.LauncherRepository$loaderVersions$2$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LoaderType.values().length];
                try {
                    iArr[LoaderType.FABRIC.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[LoaderType.QUILT.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                try {
                    iArr[LoaderType.FORGE.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                }
                try {
                    iArr[LoaderType.NEOFORGE.ordinal()] = 4;
                } catch (NoSuchFieldError e4) {
                }
                try {
                    iArr[LoaderType.OPTIFINE.ordinal()] = 5;
                } catch (NoSuchFieldError e5) {
                }
                try {
                    iArr[LoaderType.LITELOADER.ordinal()] = 6;
                } catch (NoSuchFieldError e6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LoaderType loaderType, LauncherRepository launcherRepository, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$type = loaderType;
            this.this$0 = launcherRepository;
            this.$mc = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$type, this.this$0, this.$mc, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends LoaderVersion>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<LoaderVersion>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<LoaderVersion>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    switch (WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()]) {
                        case 1:
                            return this.this$0.getLoaders().fabricVersions(this.$mc);
                        case 2:
                            return this.this$0.getLoaders().quiltVersions(this.$mc);
                        case 3:
                            return this.this$0.getLoaders().forgeVersions(this.$mc);
                        case 4:
                            return this.this$0.getLoaders().neoforgeVersions(this.$mc);
                        case 5:
                            return this.this$0.getLoaders().optifineVersions(this.$mc);
                        case 6:
                            return this.this$0.getLoaders().liteloaderVersions(this.$mc);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object loaderVersions(LoaderType type, String mc, Continuation<? super List<LoaderVersion>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(type, this, mc, null), continuation);
    }

    /* compiled from: LauncherRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/core/account/Account;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.LauncherRepository$loginMicrosoft$3", f = "LauncherRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.LauncherRepository$loginMicrosoft$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Account>, Object> {
        final /* synthetic */ Function0<Boolean> $cancelled;
        final /* synthetic */ Function1<DeviceCode, Unit> $onCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function1<? super DeviceCode, Unit> function1, Function0<Boolean> function0, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$onCode = function1;
            this.$cancelled = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LauncherRepository.this.new AnonymousClass3(this.$onCode, this.$cancelled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Account> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Account accountLogin = LauncherRepository.this.getMicrosoft().login(this.$onCode, this.$cancelled);
                    AccountStore.upsert$default(LauncherRepository.this.getAccounts(), accountLogin, false, 2, null);
                    return accountLogin;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static /* synthetic */ Account addOffline$default(LauncherRepository launcherRepository, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = InputSettings.DEFAULT_LAYOUT;
        }
        return launcherRepository.addOffline(str, str2);
    }

    public final Account addOffline(String name, String skin) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(skin, "skin");
        Account accountCreate = Offline.INSTANCE.create(name, skin);
        AccountStore.upsert$default(this.accounts, accountCreate, false, 2, null);
        return accountCreate;
    }

    /* compiled from: LauncherRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/core/account/Account;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.LauncherRepository$loginAuthlib$2", f = "LauncherRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.LauncherRepository$loginAuthlib$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Account>>, Object> {
        final /* synthetic */ String $api;
        final /* synthetic */ String $pass;
        final /* synthetic */ String $user;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, String str3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$api = str;
            this.$user = str2;
            this.$pass = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LauncherRepository.this.new AnonymousClass2(this.$api, this.$user, this.$pass, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Account>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Account>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Account>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    LauncherRepository.this.getAgents().prefetch(this.$api);
                    Iterable iterableAuthenticate$default = YggdrasilAuth.authenticate$default(LauncherRepository.this.getYggdrasil(), this.$api, this.$user, this.$pass, null, null, 24, null);
                    LauncherRepository launcherRepository = LauncherRepository.this;
                    Iterator it = iterableAuthenticate$default.iterator();
                    while (it.hasNext()) {
                        AccountStore.upsert$default(launcherRepository.getAccounts(), (Account) it.next(), false, 2, null);
                    }
                    return iterableAuthenticate$default;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object loginMicrosoft$default(LauncherRepository launcherRepository, Function1 function1, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.pymcl.android.data.LauncherRepository$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(LauncherRepository.loginMicrosoft$lambda$0());
                }
            };
        }
        return launcherRepository.loginMicrosoft(function1, function0, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean loginMicrosoft$lambda$0() {
        return false;
    }

    public final Object loginMicrosoft(Function1<? super DeviceCode, Unit> function1, Function0<Boolean> function0, Continuation<? super Account> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass3(function1, function0, null), continuation);
    }

    /* compiled from: LauncherRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/core/account/Account;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.LauncherRepository$loginNide8$2", f = "LauncherRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.LauncherRepository$loginNide8$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Account>>, Object> {
        final /* synthetic */ String $pass;
        final /* synthetic */ String $serverId;
        final /* synthetic */ String $user;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, String str3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$serverId = str;
            this.$user = str2;
            this.$pass = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LauncherRepository.this.new AnonymousClass2(this.$serverId, this.$user, this.$pass, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Account>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Account>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Account>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws AuthException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Iterable iterableLoginNide8 = LauncherRepository.this.getYggdrasil().loginNide8(this.$serverId, this.$user, this.$pass);
                    LauncherRepository launcherRepository = LauncherRepository.this;
                    Iterator it = iterableLoginNide8.iterator();
                    while (it.hasNext()) {
                        AccountStore.upsert$default(launcherRepository.getAccounts(), (Account) it.next(), false, 2, null);
                    }
                    return iterableLoginNide8;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object loginAuthlib(String api, String user, String pass, Continuation<? super List<Account>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(api, user, pass, null), continuation);
    }

    /* compiled from: LauncherRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/core/account/Account;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.LauncherRepository$refreshIfNeeded$2", f = "LauncherRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.LauncherRepository$refreshIfNeeded$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Account>, Object> {
        final /* synthetic */ Account $a;
        int label;
        final /* synthetic */ LauncherRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Account account, LauncherRepository launcherRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$a = account;
            this.this$0 = launcherRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$a, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Account> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws AuthException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (Account.needsRefresh$default(this.$a, 0L, 1, null)) {
                        Account accountRefresh = this.this$0.getMicrosoft().refresh(this.$a);
                        AccountStore.upsert$default(this.this$0.getAccounts(), accountRefresh, false, 2, null);
                        return accountRefresh;
                    }
                    if ((this.$a.getType() == AccountType.AUTHLIB || this.$a.getType() == AccountType.NIDE8) && !this.this$0.getYggdrasil().validate(this.$a)) {
                        Account accountRefresh2 = this.this$0.getYggdrasil().refresh(this.$a);
                        AccountStore.upsert$default(this.this$0.getAccounts(), accountRefresh2, false, 2, null);
                        return accountRefresh2;
                    }
                    return this.$a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object loginNide8(String serverId, String user, String pass, Continuation<? super List<Account>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(serverId, user, pass, null), continuation);
    }

    public final Object refreshIfNeeded(Account a, Continuation<? super Account> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(a, this, null), continuation);
    }

    public final void setOfflineSkin(String name, String src, String model) {
        Object next;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(model, "model");
        Iterator it = this.accounts.list().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Account account = (Account) next;
            if (((Intrinsics.areEqual(account.getName(), name) && account.getType() == AccountType.OFFLINE) ? 1 : null) != null) {
                break;
            }
        }
        Account a = (Account) next;
        if (a == null) {
            throw new IllegalStateException("只有离线账号可以设置自定义皮肤");
        }
        a.getRaw().put("skin_model", Intrinsics.areEqual(model, "slim") ? "slim" : "classic");
        if (src != null) {
            if (src.length() == 0) {
                a.getRaw().put("skin", InputSettings.DEFAULT_LAYOUT);
            } else {
                byte[] b = FilesKt.readBytes(new File(src));
                if (!SkinServer.INSTANCE.isValidSkin(b)) {
                    throw new IllegalArgumentException("皮肤需为 64×64 或 64×32 的 PNG");
                }
                File f = new File(getSkinsDir(), FileUtil.INSTANCE.sha1(b) + ".png");
                if (!f.isFile()) {
                    FileUtil.INSTANCE.writeAtomic(f, b);
                }
                a.getRaw().put("skin", f.getName());
            }
        }
        this.accounts.upsert(a, false);
    }

    public final File offlineSkinFile(Account a) {
        Intrinsics.checkNotNullParameter(a, "a");
        if (a.getType() != AccountType.OFFLINE) {
            return null;
        }
        return OfflineSkins.INSTANCE.customFile(a.getSkin(), getSkinsDir());
    }

    public final Pair<String, String> prepareOfflineSkin(Account a) {
        Intrinsics.checkNotNullParameter(a, "a");
        File f = offlineSkinFile(a);
        if (f == null) {
            return null;
        }
        byte[] bytes = FilesKt.readBytes(f);
        if (!SkinServer.INSTANCE.isValidSkin(bytes)) {
            bytes = null;
        }
        if (bytes == null) {
            return null;
        }
        byte[] png = bytes;
        String str = JsonKt.str(a.getRaw(), "skin_model");
        if (str == null) {
            str = "classic";
        }
        boolean slim = Intrinsics.areEqual(str, "slim");
        SkinServer.start$default(getSkinServer(), 0, 1, null);
        getSkinServer().put(new SkinServer.Profile(a.getName(), a.getUuid(), png, slim, null, 16, null));
        return TuplesKt.to(getSkinServer().getApiRoot(), getSkinServer().prefetched());
    }

    /* compiled from: LauncherRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/runtime/GameLaunchRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.LauncherRepository$buildLaunchRequest$3", f = "LauncherRepository.kt", i = {0, 0}, l = {153}, m = "invokeSuspend", n = {"$this$withContext", "acc0"}, nl = {154}, s = {"L$0", "L$1"}, v = 2)
    /* renamed from: com.pymcl.android.data.LauncherRepository$buildLaunchRequest$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GameLaunchRequest>, Object> {
        final /* synthetic */ Instance $inst;
        final /* synthetic */ Function1<String, Unit> $onNote;
        final /* synthetic */ String $rendererId;
        final /* synthetic */ String $server;
        final /* synthetic */ String $versionId;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Instance instance, String str, String str2, String str3, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$inst = instance;
            this.$versionId = str;
            this.$rendererId = str2;
            this.$server = str3;
            this.$onNote = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = LauncherRepository.this.new AnonymousClass3(this.$inst, this.$versionId, this.$rendererId, this.$server, this.$onNote, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GameLaunchRequest> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Account accountActive;
            Object objRefreshIfNeeded;
            Pair pair;
            String string;
            Object objM8116constructorimpl;
            ResolvedVersion resolvedVersion;
            Object objM8116constructorimpl2;
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    accountActive = LauncherRepository.this.getAccounts().active();
                    if (accountActive == null) {
                        throw new IllegalStateException("请先添加账号");
                    }
                    this.L$0 = coroutineScope;
                    this.L$1 = SpillingKt.nullOutSpilledVariable(accountActive);
                    this.label = 1;
                    objRefreshIfNeeded = LauncherRepository.this.refreshIfNeeded(accountActive, this);
                    if (objRefreshIfNeeded == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    Account account = (Account) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    objRefreshIfNeeded = obj;
                    accountActive = account;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Account account2 = (Account) objRefreshIfNeeded;
            VersionSettings versionSettings = this.$inst.settings(this.$versionId, LauncherRepository.this.getConfig());
            Map<String, Object> mapLoad = versionSettings.load();
            File fileApplyIsolation = versionSettings.applyIsolation(this.$inst.getDir());
            GameDirs gameDirsDirsFor = LauncherRepository.this.dirsFor(this.$inst);
            ResolvedVersion resolvedVersionLoad$default = ResolvedVersion.Companion.load$default(ResolvedVersion.Companion, gameDirsDirsFor.getVersionsDir(), this.$versionId, 0, 4, null);
            if (account2.getType() == AccountType.OFFLINE) {
                LauncherRepository launcherRepository = LauncherRepository.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Pair<String, String> pairPrepareOfflineSkin = launcherRepository.prepareOfflineSkin(account2);
                    if (pairPrepareOfflineSkin == null || !launcherRepository.getAgents().ensureAuthlibInjector().isFile()) {
                        pairPrepareOfflineSkin = null;
                    }
                    objM8116constructorimpl2 = Result.m8116constructorimpl(pairPrepareOfflineSkin);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8116constructorimpl2 = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl2);
                if (thM8119exceptionOrNullimpl != null) {
                    Log.w("PyMCL", "offline skin server", thM8119exceptionOrNullimpl);
                }
                if (Result.m8122isFailureimpl(objM8116constructorimpl2)) {
                    objM8116constructorimpl2 = null;
                }
                pair = (Pair) objM8116constructorimpl2;
            } else {
                pair = null;
            }
            Pair pair2 = pair;
            File fileEnsureAuthlibInjector = (account2.getType() == AccountType.AUTHLIB || pair2 != null) ? LauncherRepository.this.getAgents().ensureAuthlibInjector() : null;
            File fileEnsureNide8 = account2.getType() == AccountType.NIDE8 ? LauncherRepository.this.getAgents().ensureNide8() : null;
            LaunchArgsBuilder launchArgsBuilder = LaunchArgsBuilder.INSTANCE;
            Object obj2 = mapLoad.get("memory_mb");
            Number number = obj2 instanceof Number ? (Number) obj2 : null;
            int iIntValue = number != null ? number.intValue() : LauncherRepository.this.getConfig().m8017int("memory_mb");
            Object obj3 = mapLoad.get("window_width");
            Number number2 = obj3 instanceof Number ? (Number) obj3 : null;
            int iIntValue2 = number2 != null ? number2.intValue() : LauncherRepository.this.getConfig().m8017int("width");
            Object obj4 = mapLoad.get("window_height");
            Number number3 = obj4 instanceof Number ? (Number) obj4 : null;
            int iIntValue3 = number3 != null ? number3.intValue() : LauncherRepository.this.getConfig().m8017int("height");
            boolean z = true;
            Set of = SetsKt.setOf((Object[]) new String[]{"maximize", "fullscreen"});
            Object obj5 = mapLoad.get("window_mode");
            String strString = obj5 instanceof String ? (String) obj5 : null;
            if (strString == null) {
                strString = LauncherRepository.this.getConfig().string("window_mode");
            }
            boolean zContains = of.contains(strString);
            String strString2 = LauncherRepository.this.getConfig().string("default_jvm_args");
            Object obj6 = mapLoad.get("jvm_args");
            String str = obj6 instanceof String ? (String) obj6 : null;
            if (str == null) {
                str = "";
            }
            Object obj7 = mapLoad.get("game_args");
            String str2 = obj7 instanceof String ? (String) obj7 : null;
            if (str2 == null) {
                str2 = "";
            }
            Object obj8 = mapLoad.get("server");
            String str3 = str2;
            String str4 = obj8 instanceof String ? (String) obj8 : null;
            if (str4 == null) {
                str4 = "";
            }
            Object obj9 = mapLoad.get("port");
            if (obj9 == null || (string = obj9.toString()) == null) {
                string = "";
            }
            String str5 = string;
            Object obj10 = mapLoad.get("gc");
            String str6 = str4;
            String str7 = obj10 instanceof String ? (String) obj10 : null;
            String strString3 = str7 != null ? str7 : "";
            LauncherRepository launcherRepository2 = LauncherRepository.this;
            if (strString3.length() != 0) {
                z = false;
            }
            if (z) {
                strString3 = launcherRepository2.getConfig().string(SettingsLogic.Extras.GC_KEY);
            }
            LaunchSpec launchSpecBuild = launchArgsBuilder.build(resolvedVersionLoad$default, new LaunchOptions(account2, fileApplyIsolation, gameDirsDirsFor, iIntValue, iIntValue2, iIntValue3, zContains, strString2, str, str3, str6, str5, strString3, LauncherRepository.this.getConfig().getMicrosoftClientId(), fileEnsureAuthlibInjector, fileEnsureNide8, (account2.getType() != AccountType.AUTHLIB || fileEnsureAuthlibInjector == null) ? null : LauncherRepository.this.getAgents().prefetch(account2.getApi()), LauncherRepository.this.getRuleEnv(), pair2 != null ? (String) pair2.getFirst() : null, pair2 != null ? (String) pair2.getSecond() : null));
            LaunchConfigLogic launchConfigLogic = LaunchConfigLogic.INSTANCE;
            int javaMajor = launchSpecBuild.getJavaMajor();
            Object obj11 = mapLoad.get("java");
            String str8 = obj11 instanceof String ? (String) obj11 : null;
            Instance instance = this.$inst;
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Object obj12 = instance.meta().get("java");
                objM8116constructorimpl = Result.m8116constructorimpl(obj12 instanceof String ? (String) obj12 : null);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th2));
            }
            LaunchConfigLogic.JavaPick javaPickResolveJava = launchConfigLogic.resolveJava(javaMajor, str8, (String) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl), new LauncherRepository$buildLaunchRequest$3$pick$2(LauncherRepository.this));
            String note = javaPickResolveJava.getNote();
            if (note != null) {
                Function1<String, Unit> function1 = this.$onNote;
                resolvedVersion = resolvedVersionLoad$default;
                Object[] array = javaPickResolveJava.getArgs().toArray(new Object[0]);
                String strTr = I18nKt.tr(note, Arrays.copyOf(array, array.length));
                Choice.getItem("PyMCL");
                function1.invoke(strTr);
            } else {
                resolvedVersion = resolvedVersionLoad$default;
            }
            LauncherRepository launcherRepository3 = LauncherRepository.this;
            if (javaPickResolveJava.getMajor() != launchSpecBuild.getJavaMajor()) {
                launchSpecBuild = LaunchSpec.copy$default(launchSpecBuild, javaPickResolveJava.getMajor(), null, null, null, null, 30, null);
            }
            return launcherRepository3.toFclRequest(resolvedVersion, launchSpecBuild, fileApplyIsolation, this.$rendererId, this.$server);
        }
    }

    public static /* synthetic */ Object buildLaunchRequest$default(LauncherRepository launcherRepository, String str, Instance instance, String str2, String str3, Function1 function1, Continuation continuation, int i, Object obj) {
        Function1 function12;
        if ((i & 2) != 0) {
            instance = launcherRepository.currentInstance();
        }
        Instance instance2 = instance;
        String str4 = (i & 4) != 0 ? null : str2;
        String str5 = (i & 8) != 0 ? null : str3;
        if ((i & 16) == 0) {
            function12 = function1;
        } else {
            function12 = new Function1() { // from class: com.pymcl.android.data.LauncherRepository$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LauncherRepository.buildLaunchRequest$lambda$0((String) obj2);
                }
            };
        }
        return launcherRepository.buildLaunchRequest(str, instance2, str4, str5, function12, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildLaunchRequest$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Object buildLaunchRequest(String versionId, Instance inst2, String rendererId, String server, Function1<? super String, Unit> function1, Continuation<? super GameLaunchRequest> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass3(inst2, versionId, rendererId, server, function1, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean javaAvailable(int major) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(Boolean.valueOf(new RuntimeInstaller(this.ctx).isJavaInstalled(major)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = false;
        }
        return ((Boolean) objM8116constructorimpl).booleanValue() || RuntimeLayout.INSTANCE.getBUNDLED_JRE().contains(Integer.valueOf(major)) || JavaDownloads.INSTANCE.pinnedVersion(major) != null;
    }

    public static /* synthetic */ GameLaunchRequest toFclRequest$default(LauncherRepository launcherRepository, ResolvedVersion resolvedVersion, LaunchSpec launchSpec, File file, String str, String str2, int i, Object obj) {
        if ((i & 16) != 0) {
            str2 = null;
        }
        return launcherRepository.toFclRequest(resolvedVersion, launchSpec, file, str, str2);
    }

    public final GameLaunchRequest toFclRequest(ResolvedVersion v, LaunchSpec spec, File gameDir, String rendererId, String server) {
        String renderer;
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        Iterable iterableObjs = JsonKt.objs(JsonKt.arr(v.getJson(), "libraries"));
        Collection arrayList = new ArrayList();
        Iterator it = iterableObjs.iterator();
        while (it.hasNext()) {
            Iterable iterable = iterableObjs;
            String str = JsonKt.str((Map) it.next(), HintConstants.AUTOFILL_HINT_NAME);
            if (str != null) {
                arrayList.add(str);
            }
            iterableObjs = iterable;
        }
        List libs = (List) arrayList;
        FclLaunchArgs fclLaunchArgs = FclLaunchArgs.INSTANCE;
        String fclRequest$verOf = toFclRequest$verOf(libs, "org.lwjgl:lwjgl:");
        if (fclRequest$verOf == null) {
            fclRequest$verOf = toFclRequest$verOf(libs, "org.lwjgl.lwjgl:lwjgl:");
        }
        Pair<String, Boolean> pairPickLwjgl = fclLaunchArgs.pickLwjgl(fclRequest$verOf);
        String lwjgl = pairPickLwjgl.component1();
        boolean lwjglx = pairPickLwjgl.component2().booleanValue();
        FclLaunchArgs fclLaunchArgs2 = FclLaunchArgs.INSTANCE;
        Context context = this.ctx;
        String path = gameDir.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        FclLaunchArgs.Env env = fclLaunchArgs2.envFor(context, path, toFclRequest$verOf(libs, "net.java.dev.jna:jna:"));
        FclLaunchArgs fclLaunchArgs3 = FclLaunchArgs.INSTANCE;
        List<String> jvmArgs = spec.getJvmArgs();
        String mainClass = spec.getMainClass();
        List<String> gameArgs = spec.getGameArgs();
        int javaMajor = spec.getJavaMajor();
        String lwjgl2 = gameDir.getPath();
        Intrinsics.checkNotNullExpressionValue(lwjgl2, "getPath(...)");
        List args = fclLaunchArgs3.rewrite(jvmArgs, mainClass, gameArgs, javaMajor, lwjgl2, lwjgl, lwjglx, env, v.getMcVersion(), server);
        if (rendererId == null) {
            String strString = this.config.string("android_renderer");
            if (!((strString.length() > 0) && !Intrinsics.areEqual(strString, DebugKt.DEBUG_PROPERTY_VALUE_AUTO))) {
                strString = null;
            }
            if (strString == null) {
                renderer = (LoadersKt.compareMc(v.getMcVersion(), "1.21.4") <= 0 ? Renderers.INSTANCE.getGL4ES() : Renderers.INSTANCE.getNG_GL4ES()).getId();
            } else {
                renderer = strString;
            }
        } else {
            renderer = rendererId;
        }
        Float floatOrNull = StringsKt.toFloatOrNull(this.config.string("android_window_scale"));
        float windowScale = RangesKt.coerceIn(floatOrNull != null ? floatOrNull.floatValue() : 1.0f, 0.3f, 1.0f);
        return new GameLaunchRequest(spec.getJavaMajor(), spec.getWorkingDir(), args, renderer, lwjgl, v.getMcVersion(), windowScale);
    }

    private static final String toFclRequest$verOf(List<String> list, String prefix) {
        Object next;
        List listSplit$default;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (StringsKt.startsWith$default((String) next, prefix, false, 2, (Object) null)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        String str = (String) next;
        if (str == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new char[]{':'}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        return (String) CollectionsKt.getOrNull(listSplit$default, 2);
    }

    public final void recordPlaytime(Instance inst2, String version, long startSec, long durationSec) {
        Intrinsics.checkNotNullParameter(inst2, "inst");
        Intrinsics.checkNotNullParameter(version, "version");
        this.playtime.record(inst2.getName(), version, startSec, durationSec);
    }

    private static final String analyzeCrash$rd(File f) {
        return f.isFile() ? StringsKt.takeLast(FilesKt.readText$default(f, null, 1, null), 2000000) : "";
    }

    public final List<CrashReason> analyzeCrash(File gameDir, int exitCode, String output) {
        File file;
        File file2;
        String strAnalyzeCrash$rd;
        String strAnalyzeCrash$rd2;
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        Intrinsics.checkNotNullParameter(output, "output");
        File[] fileArrListFiles = new File(gameDir, "crash-reports").listFiles();
        File file3 = null;
        Object next = null;
        if (fileArrListFiles != null) {
            if (fileArrListFiles.length == 0) {
                file = null;
            } else {
                file = fileArrListFiles[0];
                int lastIndex = ArraysKt.getLastIndex(fileArrListFiles);
                if (lastIndex != 0) {
                    long jLastModified = file.lastModified();
                    int i = 1;
                    if (1 <= lastIndex) {
                        while (true) {
                            File file4 = fileArrListFiles[i];
                            long jLastModified2 = file4.lastModified();
                            if (jLastModified < jLastModified2) {
                                file = file4;
                                jLastModified = jLastModified2;
                            }
                            if (i == lastIndex) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        } else {
            file = null;
        }
        File file5 = file;
        File[] fileArrListFiles2 = gameDir.listFiles();
        if (fileArrListFiles2 != null) {
            ArrayList arrayList = new ArrayList();
            int length = fileArrListFiles2.length;
            int i2 = 0;
            while (i2 < length) {
                File file6 = fileArrListFiles2[i2];
                String name = file6.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                File file7 = file5;
                if (StringsKt.startsWith$default(name, "hs_err_pid", false, 2, (Object) null)) {
                    arrayList.add(file6);
                }
                i2++;
                file5 = file7;
            }
            file2 = file5;
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    long jLastModified3 = ((File) next).lastModified();
                    do {
                        Object next2 = it.next();
                        long jLastModified4 = ((File) next2).lastModified();
                        if (jLastModified3 < jLastModified4) {
                            next = next2;
                            jLastModified3 = jLastModified4;
                        }
                    } while (it.hasNext());
                }
            }
            file3 = (File) next;
        } else {
            file2 = file5;
        }
        File file8 = file3;
        return CrashAnalyzer.INSTANCE.analyze(new CrashInput(exitCode, output, analyzeCrash$rd(new File(gameDir, "logs/latest.log")), analyzeCrash$rd(new File(gameDir, "logs/debug.log")), (file2 == null || (strAnalyzeCrash$rd2 = analyzeCrash$rd(file2)) == null) ? "" : strAnalyzeCrash$rd2, (file8 == null || (strAnalyzeCrash$rd = analyzeCrash$rd(file8)) == null) ? "" : strAnalyzeCrash$rd));
    }
}
