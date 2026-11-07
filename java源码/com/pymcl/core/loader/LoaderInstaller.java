package com.pymcl.core.loader;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.core.download.DownloadManager;
import com.pymcl.core.download.Mirrors;
import com.pymcl.core.loader.LoaderInstaller;
import com.pymcl.core.net.Http;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import com.pymcl.core.version.GameDirs;
import com.pymcl.core.version.GameInstaller;
import com.pymcl.core.version.Maven;
import com.pymcl.core.version.ResolvedVersion;
import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.compressors.CompressorStreamFactory;
import org.apache.commons.compress.java.util.jar.Pack200;

/* compiled from: Loaders.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 w2\u00020\u0001:\u0003wxyB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0015J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0019H\u0002J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010%\u001a\u00020\u0015J:\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010,J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0015J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010#\u001a\u00020\u0015J&\u00100\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u00101J&\u00102\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u00101J<\u00104\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u00106\u001a\u00020\u00152\u0006\u0010.\u001a\u000207H\u0082@¢\u0006\u0002\u00108J0\u00109\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u000207H\u0086@¢\u0006\u0002\u0010;J8\u0010<\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010=\u001a\u00020>2\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010@j\u0002`AH\u0082@¢\u0006\u0002\u0010BJH\u0010C\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>2\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010@j\u0002`AH\u0082@¢\u0006\u0002\u0010DJT\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150@2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>2\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010@j\u0002`A2\u0006\u0010F\u001a\u00020\u000bJ2\u0010G\u001a\u00020H2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150JH\u0082@¢\u0006\u0002\u0010KJ*\u0010L\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u00152\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150J2\u0006\u0010N\u001a\u00020\u000bJF\u0010O\u001a\u00020H2\u0006\u0010'\u001a\u00020(2\u0018\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010@j\u0002`A2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150J2\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J \u0010Q\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u000bH\u0002J\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u0014\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u001e\u0010U\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010V\u001a\u00020\u0015J\u001a\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150X2\u0006\u0010Y\u001a\u00020\u0015J\u0016\u0010Z\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u0015J\u001e\u0010[\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\\J\u0010\u0010]\u001a\u0002072\u0006\u0010^\u001a\u00020\u000bH\u0002J&\u0010_\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u00101J&\u0010`\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010bJ\u001c\u0010c\u001a\b\u0012\u0004\u0012\u00020d0\u00182\u0006\u0010e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015J\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020d0\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u0014\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010i\u001a\u00020dJ2\u0010j\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00152\n\b\u0002\u0010k\u001a\u0004\u0018\u00010dH\u0086@¢\u0006\u0002\u0010lJ*\u0010m\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010@j\u0002`A2\u0006\u0010n\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(H\u0002J \u0010o\u001a\u00020H2\u0006\u0010=\u001a\u00020>2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020\u000bH\u0002J8\u0010s\u001a\u00020H2\u0006\u0010'\u001a\u00020(2\u0006\u0010t\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u000e\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00182\u0006\u0010v\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006z"}, d2 = {"Lcom/pymcl/core/loader/LoaderInstaller;", "", "http", "Lcom/pymcl/core/net/Http;", "mirrors", "Lcom/pymcl/core/download/Mirrors;", "dm", "Lcom/pymcl/core/download/DownloadManager;", "game", "Lcom/pymcl/core/version/GameInstaller;", "cacheDir", "Ljava/io/File;", "javaRunner", "Lcom/pymcl/core/loader/JavaProcessRunner;", "<init>", "(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/download/Mirrors;Lcom/pymcl/core/download/DownloadManager;Lcom/pymcl/core/version/GameInstaller;Ljava/io/File;Lcom/pymcl/core/loader/JavaProcessRunner;)V", "getJavaRunner", "()Lcom/pymcl/core/loader/JavaProcessRunner;", "setJavaRunner", "(Lcom/pymcl/core/loader/JavaProcessRunner;)V", "getText", "", "url", "fabricVersions", "", "Lcom/pymcl/core/loader/LoaderVersion;", "mc", "quiltVersions", "metaVersions", "t", "Lcom/pymcl/core/loader/LoaderType;", "forgeVersions", "neoforgeVersions", "neoPrefix", "verKey", SettingsProtocol.EXTRA_VALUE, "mavenVersions", "xml", "installFabricLike", "dirs", "Lcom/pymcl/core/version/GameDirs;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "loader", "versionId", "(Lcom/pymcl/core/version/GameDirs;Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forgeInstallerUrls", "forge", "neoforgeInstallerUrls", "installForge", "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installNeoForge", "version", "installWithInstaller", "urls", "cacheName", "", "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installFromInstaller", "installer", "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installLegacy", CompressorStreamFactory.Z, "Ljava/util/zip/ZipFile;", "prof", "", "Lcom/pymcl/core/util/JObj;", "(Lcom/pymcl/core/version/GameDirs;Ljava/util/zip/ZipFile;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installModern", "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;Ljava/util/zip/ZipFile;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processorData", "tmp", "prefetchMojmaps", "", "data", "", "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "substitute", "arg", "libDir", "runProcessor", "p", "installViaOfficial", "optifineBuilds", "Lcom/pymcl/core/loader/LoaderInstaller$OptiFineBuild;", "optifineVersions", "optifineUrl", "patch", "splitOptiFine", "Lkotlin/Pair;", "edition", "optifineVersionId", "downloadOptiFine", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isZip", "f", "installOptiFine", "installOptiFineAsMod", "modsDir", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseLiteLoader", "Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;", TerracottaVpnService.EXTRA_TEXT, "liteloaderBuilds", "liteloaderVersions", "liteloaderUrls", "b", "installLiteLoader", "build", "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "localLib", HintConstants.AUTOFILL_HINT_NAME, "extract", "e", "Ljava/util/zip/ZipEntry;", "dst", "writeTweakVersion", "id", "libs", "tweak", "Companion", "OptiFineBuild", "LiteLoaderBuild", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LoaderInstaller {
    public static final String FABRIC_META = "https://meta.fabricmc.net/v2";
    public static final String NEOFORGE_LEGACY_MAVEN = "https://maven.neoforged.net/releases/net/neoforged/forge";
    public static final String NEOFORGE_MAVEN = "https://maven.neoforged.net/releases/net/neoforged/neoforge";
    public static final String QUILT_META = "https://meta.quiltmc.org/v3";
    private final File cacheDir;
    private final DownloadManager dm;
    private final GameInstaller game;
    private final Http http;
    private JavaProcessRunner javaRunner;
    private final Mirrors mirrors;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String FORGE_MAVEN = "https://maven.minecraftforge.net/net/minecraftforge/forge";
    private static final List<String> FORGE_MAVEN_MIRRORS = CollectionsKt.listOf((Object[]) new String[]{FORGE_MAVEN, "https://bmclapi2.bangbang93.com/maven/net/minecraftforge/forge"});

    /* compiled from: Loaders.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.loader.LoaderInstaller", f = "Loaders.kt", i = {0, 0, 0, 0, 0}, l = {228}, m = "downloadOptiFine", n = {"mc", "edition", "t", "p", "f"}, nl = {229}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
    /* renamed from: com.pymcl.core.loader.LoaderInstaller$downloadOptiFine$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoaderInstaller.this.downloadOptiFine(null, null, this);
        }
    }

    /* compiled from: Loaders.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.loader.LoaderInstaller", f = "Loaders.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {74, 80}, m = "installFabricLike", n = {"dirs", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "mc", "loader", "versionId", "dirs", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "mc", "loader", "versionId", "url", "prof", "id"}, nl = {75, 81}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 2)
    /* renamed from: com.pymcl.core.loader.LoaderInstaller$installFabricLike$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoaderInstaller.this.installFabricLike(null, null, null, null, null, this);
        }
    }

    /* compiled from: Loaders.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.loader.LoaderInstaller", f = "Loaders.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {110, 111}, m = "installFromInstaller", n = {"dirs", "mc", "installer", CompressorStreamFactory.Z, "prof", "forge", "dirs", "mc", "installer", CompressorStreamFactory.Z, "prof", "forge"}, nl = {111, 112}, s = {"L$0", "L$1", "L$2", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "Z$0"}, v = 2)
    /* renamed from: com.pymcl.core.loader.LoaderInstaller$installFromInstaller$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoaderInstaller.this.installFromInstaller(null, null, null, false, this);
        }
    }

    /* compiled from: Loaders.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.loader.LoaderInstaller", f = "Loaders.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {124}, m = "installLegacy", n = {"dirs", CompressorStreamFactory.Z, "prof", "vi", "ins", "id", "path", "file"}, nl = {125}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 2)
    /* renamed from: com.pymcl.core.loader.LoaderInstaller$installLegacy$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoaderInstaller.this.installLegacy(null, null, null, this);
        }
    }

    /* compiled from: Loaders.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.loader.LoaderInstaller", f = "Loaders.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {318, 321, 328}, m = "installLiteLoader", n = {"dirs", "mc", "version", "build", "b", "dirs", "mc", "version", "build", "b", HintConstants.AUTOFILL_HINT_NAME, "dst", "dirs", "mc", "version", "build", "b", HintConstants.AUTOFILL_HINT_NAME, "dst", "libs", "id"}, nl = {319, 322, 329}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"}, v = 2)
    /* renamed from: com.pymcl.core.loader.LoaderInstaller$installLiteLoader$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoaderInstaller.this.installLiteLoader(null, null, null, null, this);
        }
    }

    /* compiled from: Loaders.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.loader.LoaderInstaller", f = "Loaders.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {141, 149, 153}, m = "installModern", n = {"dirs", "mc", "installer", CompressorStreamFactory.Z, "prof", "vEntry", "vj", "id", "libs", "items", "dirs", "mc", "installer", CompressorStreamFactory.Z, "prof", "vEntry", "vj", "id", "libs", "items", "procs", "tmp", "data", "dirs", "mc", "installer", CompressorStreamFactory.Z, "prof", "vEntry", "vj", "id", "libs", "items", "procs"}, nl = {142, 150, 154}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10"}, v = 2)
    /* renamed from: com.pymcl.core.loader.LoaderInstaller$installModern$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoaderInstaller.this.installModern(null, null, null, null, null, this);
        }
    }

    /* compiled from: Loaders.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.loader.LoaderInstaller", f = "Loaders.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {239, 240, 267}, m = "installOptiFine", n = {"dirs", "mc", "edition", "dirs", "mc", "edition", "dirs", "mc", "edition", "inst", "ed", "id", "libName", "libFile", "libs"}, nl = {240, 241, 268}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"}, v = 2)
    /* renamed from: com.pymcl.core.loader.LoaderInstaller$installOptiFine$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoaderInstaller.this.installOptiFine(null, null, null, this);
        }
    }

    /* compiled from: Loaders.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.loader.LoaderInstaller", f = "Loaders.kt", i = {0, 0, 0}, l = {273}, m = "installOptiFineAsMod", n = {"modsDir", "mc", "edition"}, nl = {274}, s = {"L$0", "L$1", "L$2"}, v = 2)
    /* renamed from: com.pymcl.core.loader.LoaderInstaller$installOptiFineAsMod$1, reason: invalid class name */
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
            return LoaderInstaller.this.installOptiFineAsMod(null, null, null, this);
        }
    }

    /* compiled from: Loaders.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.loader.LoaderInstaller", f = "Loaders.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {101, 102, 103}, m = "installWithInstaller", n = {"dirs", "mc", "urls", "cacheName", "inst", "forge", "dirs", "mc", "urls", "cacheName", "inst", "forge", "dirs", "mc", "urls", "cacheName", "inst", "forge"}, nl = {102, 103, -1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"}, v = 2)
    /* renamed from: com.pymcl.core.loader.LoaderInstaller$installWithInstaller$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoaderInstaller.this.installWithInstaller(null, null, null, null, false, this);
        }
    }

    public LoaderInstaller(Http http, Mirrors mirrors, DownloadManager dm, GameInstaller game, File cacheDir, JavaProcessRunner javaRunner) {
        Intrinsics.checkNotNullParameter(http, "http");
        Intrinsics.checkNotNullParameter(mirrors, "mirrors");
        Intrinsics.checkNotNullParameter(dm, "dm");
        Intrinsics.checkNotNullParameter(game, "game");
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(javaRunner, "javaRunner");
        this.http = http;
        this.mirrors = mirrors;
        this.dm = dm;
        this.game = game;
        this.cacheDir = cacheDir;
        this.javaRunner = javaRunner;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoaderInstaller(Http http, Mirrors mirrors, DownloadManager downloadManager, GameInstaller gameInstaller, File file, JavaProcessRunner javaProcessRunner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        JavaProcessRunner javaProcessRunner2;
        if ((i & 32) == 0) {
            javaProcessRunner2 = javaProcessRunner;
        } else {
            javaProcessRunner2 = UnavailableJavaRunner.INSTANCE;
        }
        this(http, mirrors, downloadManager, gameInstaller, file, javaProcessRunner2);
    }

    public final JavaProcessRunner getJavaRunner() {
        return this.javaRunner;
    }

    public final void setJavaRunner(JavaProcessRunner javaProcessRunner) {
        Intrinsics.checkNotNullParameter(javaProcessRunner, "<set-?>");
        this.javaRunner = javaProcessRunner;
    }

    /* compiled from: Loaders.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/pymcl/core/loader/LoaderInstaller$Companion;", "", "<init>", "()V", "FABRIC_META", "", "QUILT_META", "FORGE_MAVEN", "NEOFORGE_MAVEN", "NEOFORGE_LEGACY_MAVEN", "FORGE_MAVEN_MIRRORS", "", "getFORGE_MAVEN_MIRRORS", "()Ljava/util/List;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Companion() {
        }

        public final List<String> getFORGE_MAVEN_MIRRORS() {
            return LoaderInstaller.FORGE_MAVEN_MIRRORS;
        }
    }

    private final String getText(String url) throws Exception {
        Exception e = null;
        Iterator<String> it = this.mirrors.candidates(url).iterator();
        while (true) {
            Exception e2 = e;
            if (!it.hasNext()) {
                Intrinsics.checkNotNull(e2);
                throw e2;
            }
            String u = it.next();
            try {
                return Http.getText$default(this.http, u, null, 0, 6, null);
            } catch (Exception e3) {
                e = e3;
            }
        }
    }

    public final List<LoaderVersion> fabricVersions(String mc) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(mc, "mc");
        return metaVersions(LoaderType.FABRIC, "https://meta.fabricmc.net/v2/versions/loader/" + Http.INSTANCE.enc(mc), mc);
    }

    public final List<LoaderVersion> quiltVersions(String mc) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(mc, "mc");
        return metaVersions(LoaderType.QUILT, "https://meta.quiltmc.org/v3/versions/loader/" + Http.INSTANCE.enc(mc), mc);
    }

    private final List<LoaderVersion> metaVersions(LoaderType t, String url, String mc) {
        String str;
        int $i$f$mapNotNull;
        Iterable $this$mapNotNullTo$iv$iv;
        int $i$f$mapNotNullTo;
        boolean zBooleanValue;
        LoaderVersion loaderVersion;
        Iterable $this$mapNotNull$iv = JsonKt.objs(JsonKt.a(Json.INSTANCE.parse(getText(url))));
        int $i$f$mapNotNull2 = 0;
        Collection destination$iv$iv = new ArrayList();
        Iterable $this$mapNotNullTo$iv$iv2 = $this$mapNotNull$iv;
        int $i$f$mapNotNullTo2 = 0;
        for (Object element$iv$iv$iv : $this$mapNotNullTo$iv$iv2) {
            Map it = (Map) element$iv$iv$iv;
            Map l = JsonKt.obj(it, "loader");
            Iterable $this$mapNotNull$iv2 = $this$mapNotNull$iv;
            if (l == null || (str = JsonKt.str(l, "version")) == null) {
                $i$f$mapNotNull = $i$f$mapNotNull2;
                $this$mapNotNullTo$iv$iv = $this$mapNotNullTo$iv$iv2;
                $i$f$mapNotNullTo = $i$f$mapNotNullTo2;
                loaderVersion = null;
            } else {
                Boolean bool = JsonKt.bool(l, "stable");
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                    $i$f$mapNotNull = $i$f$mapNotNull2;
                    $this$mapNotNullTo$iv$iv = $this$mapNotNullTo$iv$iv2;
                    $i$f$mapNotNullTo = $i$f$mapNotNullTo2;
                } else {
                    String str2 = JsonKt.str(l, "version");
                    Intrinsics.checkNotNull(str2);
                    $i$f$mapNotNull = $i$f$mapNotNull2;
                    $this$mapNotNullTo$iv$iv = $this$mapNotNullTo$iv$iv2;
                    $i$f$mapNotNullTo = $i$f$mapNotNullTo2;
                    zBooleanValue = !StringsKt.contains$default((CharSequence) str2, (CharSequence) "beta", false, 2, (Object) null);
                }
                loaderVersion = new LoaderVersion(t, mc, str, zBooleanValue);
            }
            if (loaderVersion != null) {
                destination$iv$iv.add(loaderVersion);
            }
            $this$mapNotNull$iv = $this$mapNotNull$iv2;
            $i$f$mapNotNull2 = $i$f$mapNotNull;
            $this$mapNotNullTo$iv$iv2 = $this$mapNotNullTo$iv$iv;
            $i$f$mapNotNullTo2 = $i$f$mapNotNullTo;
        }
        return (List) destination$iv$iv;
    }

    public final List<LoaderVersion> forgeVersions(String mc) {
        String mc2 = mc;
        Intrinsics.checkNotNullParameter(mc2, "mc");
        try {
            Result.Companion companion = Result.INSTANCE;
            final LoaderInstaller $this$forgeVersions_u24lambda_u240 = this;
            Iterable $this$mapNotNull$iv = JsonKt.objs(JsonKt.a(Json.INSTANCE.parse(Http.getText$default($this$forgeVersions_u24lambda_u240.http, "https://bmclapi2.bangbang93.com/forge/minecraft/" + Http.INSTANCE.enc(mc2), null, 0, 6, null))));
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                Map o = (Map) element$iv$iv$iv;
                String it = JsonKt.str(o, "version");
                LoaderVersion loaderVersion = it != null ? new LoaderVersion(LoaderType.FORGE, mc2, it, false, 8, null) : null;
                if (loaderVersion != null) {
                    destination$iv$iv.add(loaderVersion);
                }
            }
            return CollectionsKt.sortedWith((List) destination$iv$iv, new Comparator() { // from class: com.pymcl.core.loader.LoaderInstaller$forgeVersions$lambda$0$$inlined$compareByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    LoaderVersion p0 = (LoaderVersion) t2;
                    LoaderVersion p02 = (LoaderVersion) t;
                    return ComparisonsKt.compareValues(this.$receiver$inlined.verKey(p0), this.$receiver$inlined.verKey(p02));
                }
            });
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
            Iterable $this$filter$iv = mavenVersions(getText("https://maven.minecraftforge.net/net/minecraftforge/forge/maven-metadata.xml"));
            Collection destination$iv$iv2 = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                String it2 = (String) element$iv$iv;
                if (StringsKt.startsWith$default(it2, mc2 + "-", false, 2, (Object) null)) {
                    destination$iv$iv2.add(element$iv$iv);
                }
            }
            Iterable $this$map$iv = (List) destination$iv$iv2;
            Collection destination$iv$iv3 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                String it3 = (String) item$iv$iv;
                destination$iv$iv3.add(new LoaderVersion(LoaderType.FORGE, mc2, StringsKt.substringBefore$default(StringsKt.removePrefix(it3, (CharSequence) (mc2 + "-")), "-" + mc2, (String) null, 2, (Object) null), false, 8, null));
                mc2 = mc;
            }
            return CollectionsKt.sortedWith((List) destination$iv$iv3, new Comparator() { // from class: com.pymcl.core.loader.LoaderInstaller$forgeVersions$$inlined$compareByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    LoaderVersion p0 = (LoaderVersion) t2;
                    LoaderVersion p02 = (LoaderVersion) t;
                    return ComparisonsKt.compareValues(this.$receiver$inlined.verKey(p0), this.$receiver$inlined.verKey(p02));
                }
            });
        }
    }

    public final List<LoaderVersion> neoforgeVersions(String mc) {
        Intrinsics.checkNotNullParameter(mc, "mc");
        List all = mavenVersions(getText("https://maven.neoforged.net/releases/net/neoforged/neoforge/maven-metadata.xml"));
        String p = neoPrefix(mc);
        List $this$filter$iv = all;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            if (StringsKt.startsWith$default((String) element$iv$iv, p, false, 2, (Object) null)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$map$iv = (List) destination$iv$iv;
        int $i$f$map = 0;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            destination$iv$iv2.add(new LoaderVersion(LoaderType.NEOFORGE, mc, it, !StringsKt.contains$default((CharSequence) it, (CharSequence) "beta", false, 2, (Object) null)));
            $i$f$map = $i$f$map;
            $this$map$iv = $this$map$iv;
            p = p;
            all = all;
        }
        return CollectionsKt.sortedWith((List) destination$iv$iv2, new Comparator() { // from class: com.pymcl.core.loader.LoaderInstaller$neoforgeVersions$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                LoaderVersion p0 = (LoaderVersion) t2;
                LoaderVersion p02 = (LoaderVersion) t;
                return ComparisonsKt.compareValues(this.$receiver$inlined.verKey(p0), this.$receiver$inlined.verKey(p02));
            }
        });
    }

    public final String neoPrefix(String mc) {
        String str;
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(mc, "mc");
        List p = StringsKt.split$default((CharSequence) mc, new char[]{'.'}, false, 0, 6, (Object) null);
        Object obj = "0";
        if (Intrinsics.areEqual(p.get(0), "1")) {
            str = 1 < p.size() ? p.get(1) : "0";
            if (2 < p.size()) {
                obj = p.get(2);
            }
            sb = new StringBuilder();
        } else {
            str = p.get(0);
            if (1 < p.size()) {
                obj = p.get(1);
            }
            sb = new StringBuilder();
        }
        return sb.append(str).append(".").append(obj).append(".").toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String verKey(LoaderVersion v) {
        return CollectionsKt.joinToString$default(StringsKt.split$default((CharSequence) v.getVersion(), new char[]{'.', '-'}, false, 0, 6, (Object) null), ".", null, null, 0, null, new Function1() { // from class: com.pymcl.core.loader.LoaderInstaller$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoaderInstaller.verKey$lambda$0((String) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence verKey$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Integer intOrNull = StringsKt.toIntOrNull(it);
        return StringsKt.padStart(String.valueOf(intOrNull != null ? intOrNull.intValue() : 0), 6, '0');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mavenVersions$lambda$0(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getGroupValues().get(1);
    }

    public final List<String> mavenVersions(String xml) {
        Intrinsics.checkNotNullParameter(xml, "xml");
        return SequencesKt.toList(SequencesKt.map(Regex.findAll$default(new Regex("<version>([^<]+)</version>"), xml, 0, 2, null), new Function1() { // from class: com.pymcl.core.loader.LoaderInstaller$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoaderInstaller.mavenVersions$lambda$0((MatchResult) obj);
            }
        }));
    }

    public static /* synthetic */ Object installFabricLike$default(LoaderInstaller loaderInstaller, GameDirs gameDirs, LoaderType loaderType, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        return loaderInstaller.installFabricLike(gameDirs, loaderType, str, str2, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object installFabricLike(com.pymcl.core.version.GameDirs r18, com.pymcl.core.loader.LoaderType r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, kotlin.coroutines.Continuation<? super java.lang.String> r23) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.loader.LoaderInstaller.installFabricLike(com.pymcl.core.version.GameDirs, com.pymcl.core.loader.LoaderType, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final List<String> forgeInstallerUrls(String mc, String forge) {
        Intrinsics.checkNotNullParameter(mc, "mc");
        Intrinsics.checkNotNullParameter(forge, "forge");
        String full = StringsKt.startsWith$default(forge, new StringBuilder().append(mc).append("-").toString(), false, 2, (Object) null) ? forge : mc + "-" + forge;
        List alt = CollectionsKt.mutableListOf(String.valueOf(full), full + "-" + mc);
        List $this$flatMap$iv = alt;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$flatMap$iv) {
            String v = (String) element$iv$iv;
            Iterable $this$map$iv = FORGE_MAVEN_MIRRORS;
            String full2 = full;
            Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                List alt2 = alt;
                String it = (String) item$iv$iv;
                destination$iv$iv2.add(it + "/" + v + "/forge-" + v + "-installer.jar");
                alt = alt2;
                $this$flatMap$iv = $this$flatMap$iv;
            }
            Iterable list$iv$iv = (List) destination$iv$iv2;
            CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
            full = full2;
        }
        return CollectionsKt.plus((Collection<? extends String>) destination$iv$iv, "https://bmclapi2.bangbang93.com/forge/download?mcversion=" + mc + "&version=" + forge + "&category=installer&format=jar");
    }

    public final List<String> neoforgeInstallerUrls(String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        String base = StringsKt.startsWith$default(v, "1.20.1-", false, 2, (Object) null) ? NEOFORGE_LEGACY_MAVEN : NEOFORGE_MAVEN;
        String n = Intrinsics.areEqual(base, NEOFORGE_LEGACY_MAVEN) ? "forge" : "neoforge";
        String u = base + "/" + v + "/" + n + "-" + v + "-installer.jar";
        List it = CollectionsKt.listOfNotNull((Object[]) new String[]{u, Mirrors.INSTANCE.rewriteToBmcl(u)});
        return this.mirrors.fileMirrorFirst() ? CollectionsKt.reversed(it) : it;
    }

    public final Object installForge(GameDirs dirs, String mc, String forge, Continuation<? super String> continuation) {
        return installWithInstaller(dirs, mc, forgeInstallerUrls(mc, forge), "forge-" + mc + "-" + forge + "-installer.jar", true, continuation);
    }

    public final Object installNeoForge(GameDirs dirs, String mc, String version, Continuation<? super String> continuation) {
        return installWithInstaller(dirs, mc, neoforgeInstallerUrls(version), "neoforge-" + version + "-installer.jar", false, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object installWithInstaller(com.pymcl.core.version.GameDirs r26, java.lang.String r27, java.util.List<java.lang.String> r28, java.lang.String r29, boolean r30, kotlin.coroutines.Continuation<? super java.lang.String> r31) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.loader.LoaderInstaller.installWithInstaller(com.pymcl.core.version.GameDirs, java.lang.String, java.util.List, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object installFromInstaller$default(LoaderInstaller loaderInstaller, GameDirs gameDirs, String str, File file, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return loaderInstaller.installFromInstaller(gameDirs, str, file, z, continuation);
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to apply debug info
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x007d: MOVE (r2 I:??[OBJECT, ARRAY] A[D('forge' boolean)]) = (r12 I:??[OBJECT, ARRAY] A[D('dirs' com.pymcl.core.version.GameDirs)]), block:B:19:0x007a */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x007c: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY] A[D('installer' java.io.File)]), block:B:19:0x007a */
    public final java.lang.Object installFromInstaller(com.pymcl.core.version.GameDirs r17, java.lang.String r18, java.io.File r19, boolean r20, kotlin.coroutines.Continuation<? super java.lang.String> r21) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.loader.LoaderInstaller.installFromInstaller(com.pymcl.core.version.GameDirs, java.lang.String, java.io.File, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object installLegacy(com.pymcl.core.version.GameDirs r21, java.util.zip.ZipFile r22, java.util.Map<java.lang.String, java.lang.Object> r23, kotlin.coroutines.Continuation<? super java.lang.String> r24) throws com.pymcl.core.loader.InstallError, java.io.IOException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.loader.LoaderInstaller.installLegacy(com.pymcl.core.version.GameDirs, java.util.zip.ZipFile, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0447 A[Catch: all -> 0x0472, TRY_LEAVE, TryCatch #7 {all -> 0x0472, blocks: (B:104:0x043d, B:105:0x0441, B:107:0x0447), top: B:144:0x043d }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c3  */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object installModern(com.pymcl.core.version.GameDirs r32, java.lang.String r33, java.io.File r34, java.util.zip.ZipFile r35, java.util.Map<java.lang.String, java.lang.Object> r36, kotlin.coroutines.Continuation<? super java.lang.String> r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.loader.LoaderInstaller.installModern(com.pymcl.core.version.GameDirs, java.lang.String, java.io.File, java.util.zip.ZipFile, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Map<String, String> processorData(GameDirs dirs, String mc, File installer, ZipFile z, Map<String, Object> prof, File tmp) throws IOException {
        boolean z2;
        int i;
        String path;
        File out;
        Throwable th;
        Throwable th2;
        ZipFile z3 = z;
        File tmp2 = tmp;
        GameDirs dirs2 = dirs;
        Intrinsics.checkNotNullParameter(dirs2, "dirs");
        Intrinsics.checkNotNullParameter(mc, "mc");
        Intrinsics.checkNotNullParameter(installer, "installer");
        Intrinsics.checkNotNullParameter(z3, "z");
        Intrinsics.checkNotNullParameter(prof, "prof");
        Intrinsics.checkNotNullParameter(tmp2, "tmp");
        boolean z4 = false;
        int i2 = 1;
        int i3 = 2;
        LinkedHashMap d = MapsKt.linkedMapOf(TuplesKt.to("SIDE", "client"), TuplesKt.to("MINECRAFT_JAR", new File(dirs2.getVersionsDir(), mc + "/" + mc + ".jar").getPath()), TuplesKt.to("MINECRAFT_VERSION", mc), TuplesKt.to("ROOT", dirs2.getInstanceDir().getPath()), TuplesKt.to("INSTALLER", installer.getPath()), TuplesKt.to("LIBRARY_DIR", dirs2.getLibrariesDir().getPath()));
        Map<String, Object> mapObj = JsonKt.obj(prof, "data");
        if (mapObj == null) {
            mapObj = JsonKt.jobj(new Pair[0]);
        }
        Iterator<Map.Entry<String, Object>> it = mapObj.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            String k = next.getKey();
            Object v = next.getValue();
            String c = JsonKt.str(JsonKt.o(v), "client");
            if (c != null) {
                int i4 = i2;
                LinkedHashMap linkedHashMap = d;
                Iterator<Map.Entry<String, Object>> it2 = it;
                if (StringsKt.startsWith$default(c, "[", z4, i3, (Object) null) && StringsKt.endsWith$default(c, "]", z4, i3, (Object) null)) {
                    File librariesDir = dirs2.getLibrariesDir();
                    Maven maven = Maven.INSTANCE;
                    String strSubstring = c.substring(i4, c.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    path = new File(librariesDir, maven.path(strSubstring)).getPath();
                    z2 = false;
                    i = 2;
                } else if (StringsKt.startsWith$default(c, "'", false, 2, (Object) null) && StringsKt.endsWith$default(c, "'", false, 2, (Object) null)) {
                    path = c.substring(1, c.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(path, "substring(...)");
                    z2 = false;
                    i = 2;
                } else if (StringsKt.startsWith$default(c, "/", false, 2, (Object) null)) {
                    File out2 = FileUtil.INSTANCE.safeChild(tmp2, StringsKt.removePrefix(c, (CharSequence) "/"));
                    out2.getParentFile().mkdirs();
                    ZipEntry e = z3.getEntry(StringsKt.removePrefix(c, (CharSequence) "/"));
                    if (e != null) {
                        FileOutputStream inputStream = z3.getInputStream(e);
                        try {
                            InputStream i5 = inputStream;
                            inputStream = new FileOutputStream(out2);
                            try {
                                FileOutputStream it3 = inputStream;
                                Intrinsics.checkNotNull(i5);
                                out = out2;
                                i = 2;
                                z2 = false;
                                try {
                                    ByteStreamsKt.copyTo$default(i5, it3, 0, 2, null);
                                    try {
                                        CloseableKt.closeFinally(inputStream, null);
                                        CloseableKt.closeFinally(inputStream, null);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } else {
                        out = out2;
                        z2 = false;
                        i = 2;
                    }
                    path = out.getPath();
                } else {
                    z2 = false;
                    i = 2;
                    path = c;
                }
                linkedHashMap.put(k, path);
                dirs2 = dirs;
                z3 = z;
                z4 = z2;
                i3 = i;
                it = it2;
                i2 = 1;
                tmp2 = tmp;
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object prefetchMojmaps(GameDirs dirs, String mc, Map<String, String> map, Continuation<? super Unit> continuation) {
        String target = map.get("MOJMAPS");
        if (target != null && !new File(target).isFile()) {
            ResolvedVersion v = ResolvedVersion.Companion.load$default(ResolvedVersion.Companion, dirs.getVersionsDir(), mc, 0, 4, null);
            Map cm = JsonKt.obj(JsonKt.obj(v.getJson(), "downloads"), "client_mappings");
            if (cm == null) {
                return Unit.INSTANCE;
            }
            DownloadManager downloadManager = this.dm;
            GameInstaller gameInstaller = this.game;
            String str = JsonKt.str(cm, "url");
            Intrinsics.checkNotNull(str);
            return DownloadManager.downloadAll$default(downloadManager, "client_mappings", CollectionsKt.listOf(gameInstaller.item(str, new File(target), JsonKt.str(cm, "sha1"), JsonKt.m8043long(cm, "size"))), null, continuation, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final String substitute(String arg, final Map<String, String> data, File libDir) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(libDir, "libDir");
        if (!StringsKt.startsWith$default(arg, "[", false, 2, (Object) null) || !StringsKt.endsWith$default(arg, "]", false, 2, (Object) null)) {
            return new Regex("\\{([A-Z_]+)}").replace(arg, new Function1() { // from class: com.pymcl.core.loader.LoaderInstaller$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LoaderInstaller.substitute$lambda$0(data, (MatchResult) obj);
                }
            });
        }
        Maven maven = Maven.INSTANCE;
        String strSubstring = arg.substring(1, arg.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String path = new File(libDir, maven.path(strSubstring)).getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence substitute$lambda$0(Map $data, MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String value = (String) $data.get(it.getGroupValues().get(1));
        if (value == null) {
            value = it.getValue();
        }
        return value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void runProcessor(com.pymcl.core.version.GameDirs r35, java.util.Map<java.lang.String, java.lang.Object> r36, java.util.Map<java.lang.String, java.lang.String> r37, java.lang.String r38) throws com.pymcl.core.loader.InstallError {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.loader.LoaderInstaller.runProcessor(com.pymcl.core.version.GameDirs, java.util.Map, java.util.Map, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence runProcessor$lambda$8(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String name = new File((String) it.getFirst()).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String installViaOfficial(GameDirs dirs, String mc, File installer) throws InstallError {
        Set setEmptySet;
        Set setEmptySet2;
        String[] list = dirs.getVersionsDir().list();
        if (list == null || (setEmptySet = ArraysKt.toSet(list)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        File file = new File(dirs.getInstanceDir(), "launcher_profiles.json");
        Throwable th = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (file.exists()) {
            file = null;
        }
        int i = 2;
        if (file != null) {
            FilesKt.writeText$default(file, "{\"profiles\":{}}", null, 2, null);
        }
        int iRun$default = JavaProcessRunner.run$default(this.javaRunner, LoadersKt.compareMc(mc, "1.17") < 0 ? 8 : 17, CollectionsKt.listOf(installer), "net.minecraftforge.installer.SimpleInstaller", CollectionsKt.listOf((Object[]) new String[]{"--installClient", dirs.getInstanceDir().getPath()}), dirs.getInstanceDir(), 0L, null, 96, null);
        if (iRun$default != 0) {
            throw new InstallError("官方安装器退出码 " + iRun$default, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        }
        String[] list2 = dirs.getVersionsDir().list();
        if (list2 == null || (setEmptySet2 = ArraysKt.toSet(list2)) == null) {
            setEmptySet2 = SetsKt.emptySet();
        }
        String str = (String) CollectionsKt.firstOrNull(SetsKt.minus(setEmptySet2, (Iterable) setEmptySet));
        if (str != null) {
            return str;
        }
        throw new InstallError("官方安装器未生成版本", th, i, objArr3 == true ? 1 : 0);
    }

    /* compiled from: Loaders.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/pymcl/core/loader/LoaderInstaller$OptiFineBuild;", "", "mc", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "patch", "filename", "forge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMc", "()Ljava/lang/String;", "getType", "getPatch", "getFilename", "getForge", "edition", "getEdition", "stable", "", "getStable", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class OptiFineBuild {
        private final String filename;
        private final String forge;
        private final String mc;
        private final String patch;
        private final String type;

        public static /* synthetic */ OptiFineBuild copy$default(OptiFineBuild optiFineBuild, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = optiFineBuild.mc;
            }
            if ((i & 2) != 0) {
                str2 = optiFineBuild.type;
            }
            if ((i & 4) != 0) {
                str3 = optiFineBuild.patch;
            }
            if ((i & 8) != 0) {
                str4 = optiFineBuild.filename;
            }
            if ((i & 16) != 0) {
                str5 = optiFineBuild.forge;
            }
            String str6 = str5;
            String str7 = str3;
            return optiFineBuild.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMc() {
            return this.mc;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPatch() {
            return this.patch;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        /* renamed from: component5, reason: from getter */
        public final String getForge() {
            return this.forge;
        }

        public final OptiFineBuild copy(String mc, String type, String patch, String filename, String forge) {
            Intrinsics.checkNotNullParameter(mc, "mc");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(patch, "patch");
            Intrinsics.checkNotNullParameter(filename, "filename");
            return new OptiFineBuild(mc, type, patch, filename, forge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptiFineBuild)) {
                return false;
            }
            OptiFineBuild optiFineBuild = (OptiFineBuild) other;
            return Intrinsics.areEqual(this.mc, optiFineBuild.mc) && Intrinsics.areEqual(this.type, optiFineBuild.type) && Intrinsics.areEqual(this.patch, optiFineBuild.patch) && Intrinsics.areEqual(this.filename, optiFineBuild.filename) && Intrinsics.areEqual(this.forge, optiFineBuild.forge);
        }

        public int hashCode() {
            return (((((((this.mc.hashCode() * 31) + this.type.hashCode()) * 31) + this.patch.hashCode()) * 31) + this.filename.hashCode()) * 31) + (this.forge == null ? 0 : this.forge.hashCode());
        }

        public String toString() {
            return "OptiFineBuild(mc=" + this.mc + ", type=" + this.type + ", patch=" + this.patch + ", filename=" + this.filename + ", forge=" + this.forge + ")";
        }

        public OptiFineBuild(String mc, String type, String patch, String filename, String forge) {
            Intrinsics.checkNotNullParameter(mc, "mc");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(patch, "patch");
            Intrinsics.checkNotNullParameter(filename, "filename");
            this.mc = mc;
            this.type = type;
            this.patch = patch;
            this.filename = filename;
            this.forge = forge;
        }

        public final String getFilename() {
            return this.filename;
        }

        public final String getForge() {
            return this.forge;
        }

        public final String getMc() {
            return this.mc;
        }

        public final String getPatch() {
            return this.patch;
        }

        public final String getType() {
            return this.type;
        }

        public final String getEdition() {
            return this.type + "_" + this.patch;
        }

        public final boolean getStable() {
            Intrinsics.checkNotNullExpressionValue(this.patch.toLowerCase(Locale.ROOT), "toLowerCase(...)");
            return !StringsKt.contains$default((CharSequence) r0, (CharSequence) "pre", false, 2, (Object) null);
        }
    }

    public final List<OptiFineBuild> optifineBuilds(String mc) {
        String p;
        OptiFineBuild optiFineBuild;
        int $i$f$mapNotNull;
        Intrinsics.checkNotNullParameter(mc, "mc");
        Iterable $this$mapNotNull$iv = JsonKt.objs(JsonKt.a(Json.INSTANCE.parse(Http.getText$default(this.http, "https://bmclapi2.bangbang93.com/optifine/" + Http.INSTANCE.enc(mc), null, 0, 6, null))));
        int $i$f$mapNotNull2 = 0;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            Map o = (Map) element$iv$iv$iv;
            String t = JsonKt.str(o, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            Iterable $this$mapNotNull$iv2 = $this$mapNotNull$iv;
            if (t == null || (p = JsonKt.str(o, "patch")) == null) {
                optiFineBuild = null;
                $i$f$mapNotNull = $i$f$mapNotNull2;
            } else {
                String str = JsonKt.str(o, "mcversion");
                String str2 = str == null ? mc : str;
                String str3 = JsonKt.str(o, "filename");
                if (str3 == null) {
                    $i$f$mapNotNull = $i$f$mapNotNull2;
                    str3 = "OptiFine_" + mc + "_" + t + "_" + p + ".jar";
                } else {
                    $i$f$mapNotNull = $i$f$mapNotNull2;
                }
                optiFineBuild = new OptiFineBuild(str2, t, p, str3, JsonKt.str(o, "forge"));
            }
            if (optiFineBuild != null) {
                destination$iv$iv.add(optiFineBuild);
            }
            $i$f$mapNotNull2 = $i$f$mapNotNull;
            $this$mapNotNull$iv = $this$mapNotNull$iv2;
        }
        return (List) destination$iv$iv;
    }

    public final List<LoaderVersion> optifineVersions(String mc) {
        Intrinsics.checkNotNullParameter(mc, "mc");
        Iterable $this$map$iv = optifineBuilds(mc);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            OptiFineBuild it = (OptiFineBuild) item$iv$iv;
            destination$iv$iv.add(new LoaderVersion(LoaderType.OPTIFINE, mc, it.getEdition(), it.getStable()));
        }
        return CollectionsKt.toList(CollectionsKt.asReversed((List) destination$iv$iv));
    }

    public final String optifineUrl(String mc, String type, String patch) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(mc, "mc");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(patch, "patch");
        return "https://bmclapi2.bangbang93.com/optifine/" + Http.INSTANCE.enc(mc) + "/" + Http.INSTANCE.enc(type) + "/" + Http.INSTANCE.enc(patch);
    }

    public final Pair<String, String> splitOptiFine(String edition) {
        Object obj;
        List listDrop;
        Intrinsics.checkNotNullParameter(edition, "edition");
        String v = StringsKt.trim((CharSequence) StringsKt.removeSuffix(edition, (CharSequence) LoadersKt.OPTIFINE_MOD_SUFFIX)).toString();
        List p = StringsKt.split$default((CharSequence) v, new char[]{'_'}, false, 0, 6, (Object) null);
        if (!(p.size() >= 2)) {
            throw new IllegalArgumentException(("无法识别的 OptiFine 版本: " + edition).toString());
        }
        if (p.size() >= 3 && ((String) p.get(1)).length() == 1 && Character.isUpperCase(((String) p.get(1)).charAt(0))) {
            obj = p.get(0) + "_" + p.get(1);
            listDrop = CollectionsKt.drop(p, 2);
        } else {
            obj = p.get(0);
            listDrop = CollectionsKt.drop(p, 1);
        }
        return TuplesKt.to(obj, CollectionsKt.joinToString$default(listDrop, "_", null, null, 0, null, null, 62, null));
    }

    public final String optifineVersionId(String mc, String edition) {
        Intrinsics.checkNotNullParameter(mc, "mc");
        Intrinsics.checkNotNullParameter(edition, "edition");
        return mc + "-OptiFine_" + StringsKt.trim((CharSequence) StringsKt.removeSuffix(edition, (CharSequence) LoadersKt.OPTIFINE_MOD_SUFFIX)).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadOptiFine(java.lang.String r24, java.lang.String r25, kotlin.coroutines.Continuation<? super java.io.File> r26) throws com.pymcl.core.loader.InstallError {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.loader.LoaderInstaller.downloadOptiFine(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean isZip(File f) {
        Object objM8116constructorimpl;
        if (!f.isFile() || f.length() <= 22) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            LoaderInstaller loaderInstaller = this;
            ZipFile zipFile = new ZipFile(f);
            try {
                CloseableKt.closeFinally(zipFile, null);
                objM8116constructorimpl = Result.m8116constructorimpl(true);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = false;
        }
        return ((Boolean) objM8116constructorimpl).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0288 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object installOptiFine(com.pymcl.core.version.GameDirs r45, java.lang.String r46, java.lang.String r47, kotlin.coroutines.Continuation<? super java.lang.String> r48) throws com.pymcl.core.loader.InstallError {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.loader.LoaderInstaller.installOptiFine(com.pymcl.core.version.GameDirs, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object installOptiFineAsMod(java.io.File r24, java.lang.String r25, java.lang.String r26, kotlin.coroutines.Continuation<? super java.io.File> r27) throws com.pymcl.core.loader.InstallError {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.loader.LoaderInstaller.installOptiFineAsMod(java.io.File, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: Loaders.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000b0\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J!\u0010\u001f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000b0\tHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003Jk\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032 \b\u0002\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000b0\t2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0014\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R)\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;", "", "mc", "", "version", "file", "md5", "tweakClass", "libraries", "", "", "Lcom/pymcl/core/util/JObj;", "snapshot", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getMc", "()Ljava/lang/String;", "getVersion", "getFile", "getMd5", "getTweakClass", "getLibraries", "()Ljava/util/List;", "getSnapshot", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LiteLoaderBuild {
        private final String file;
        private final List<Map<String, Object>> libraries;
        private final String mc;
        private final String md5;
        private final boolean snapshot;
        private final String tweakClass;
        private final String version;

        public static /* synthetic */ LiteLoaderBuild copy$default(LiteLoaderBuild liteLoaderBuild, String str, String str2, String str3, String str4, String str5, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = liteLoaderBuild.mc;
            }
            if ((i & 2) != 0) {
                str2 = liteLoaderBuild.version;
            }
            if ((i & 4) != 0) {
                str3 = liteLoaderBuild.file;
            }
            if ((i & 8) != 0) {
                str4 = liteLoaderBuild.md5;
            }
            if ((i & 16) != 0) {
                str5 = liteLoaderBuild.tweakClass;
            }
            if ((i & 32) != 0) {
                list = liteLoaderBuild.libraries;
            }
            if ((i & 64) != 0) {
                z = liteLoaderBuild.snapshot;
            }
            List list2 = list;
            boolean z2 = z;
            String str6 = str5;
            String str7 = str3;
            return liteLoaderBuild.copy(str, str2, str7, str4, str6, list2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMc() {
            return this.mc;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFile() {
            return this.file;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMd5() {
            return this.md5;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTweakClass() {
            return this.tweakClass;
        }

        public final List<Map<String, Object>> component6() {
            return this.libraries;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getSnapshot() {
            return this.snapshot;
        }

        public final LiteLoaderBuild copy(String mc, String version, String file, String md5, String tweakClass, List<? extends Map<String, Object>> libraries, boolean snapshot) {
            Intrinsics.checkNotNullParameter(mc, "mc");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(tweakClass, "tweakClass");
            Intrinsics.checkNotNullParameter(libraries, "libraries");
            return new LiteLoaderBuild(mc, version, file, md5, tweakClass, libraries, snapshot);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LiteLoaderBuild)) {
                return false;
            }
            LiteLoaderBuild liteLoaderBuild = (LiteLoaderBuild) other;
            return Intrinsics.areEqual(this.mc, liteLoaderBuild.mc) && Intrinsics.areEqual(this.version, liteLoaderBuild.version) && Intrinsics.areEqual(this.file, liteLoaderBuild.file) && Intrinsics.areEqual(this.md5, liteLoaderBuild.md5) && Intrinsics.areEqual(this.tweakClass, liteLoaderBuild.tweakClass) && Intrinsics.areEqual(this.libraries, liteLoaderBuild.libraries) && this.snapshot == liteLoaderBuild.snapshot;
        }

        public int hashCode() {
            return (((((((((((this.mc.hashCode() * 31) + this.version.hashCode()) * 31) + (this.file == null ? 0 : this.file.hashCode())) * 31) + (this.md5 != null ? this.md5.hashCode() : 0)) * 31) + this.tweakClass.hashCode()) * 31) + this.libraries.hashCode()) * 31) + Boolean.hashCode(this.snapshot);
        }

        public String toString() {
            return "LiteLoaderBuild(mc=" + this.mc + ", version=" + this.version + ", file=" + this.file + ", md5=" + this.md5 + ", tweakClass=" + this.tweakClass + ", libraries=" + this.libraries + ", snapshot=" + this.snapshot + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LiteLoaderBuild(String mc, String version, String file, String md5, String tweakClass, List<? extends Map<String, Object>> libraries, boolean snapshot) {
            Intrinsics.checkNotNullParameter(mc, "mc");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(tweakClass, "tweakClass");
            Intrinsics.checkNotNullParameter(libraries, "libraries");
            this.mc = mc;
            this.version = version;
            this.file = file;
            this.md5 = md5;
            this.tweakClass = tweakClass;
            this.libraries = libraries;
            this.snapshot = snapshot;
        }

        public final String getFile() {
            return this.file;
        }

        public final String getMc() {
            return this.mc;
        }

        public final String getMd5() {
            return this.md5;
        }

        public final String getTweakClass() {
            return this.tweakClass;
        }

        public final String getVersion() {
            return this.version;
        }

        public final List<Map<String, Object>> getLibraries() {
            return this.libraries;
        }

        public final boolean getSnapshot() {
            return this.snapshot;
        }
    }

    public final List<LiteLoaderBuild> parseLiteLoader(String text, String mc) {
        Iterable iterableListOfNotNull;
        Map it;
        LiteLoaderBuild it2;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(mc, "mc");
        Object root = Json.INSTANCE.parse(text);
        Iterable out = new ArrayList();
        Map<String, Object> mapO = JsonKt.o(root);
        Map versions = mapO != null ? JsonKt.obj(mapO, "versions") : null;
        if (versions != null) {
            Map m = JsonKt.obj(versions, mc);
            if (m == null) {
                return CollectionsKt.emptyList();
            }
            for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("artefacts", false), TuplesKt.to("snapshots", true)})) {
                String key = (String) pair.component1();
                boolean snap = ((Boolean) pair.component2()).booleanValue();
                Map<String, Object> mapObj = JsonKt.obj(JsonKt.obj(m, key), "com.mumfrey:liteloader");
                if (mapObj == null) {
                    mapObj = JsonKt.jobj(new Pair[0]);
                }
                for (Map.Entry<String, Object> entry : mapObj.entrySet()) {
                    String k = entry.getKey();
                    Object e = entry.getValue();
                    if (!Intrinsics.areEqual(k, Pack200.Packer.LATEST) && (it = JsonKt.o(e)) != null && (it2 = parseLiteLoader$build(mc, it, snap)) != null) {
                        ((Collection) out).add(it2);
                    }
                }
            }
        } else {
            List<Object> listA = JsonKt.a(root);
            if (listA == null || (iterableListOfNotNull = JsonKt.objs(listA)) == null) {
                iterableListOfNotNull = CollectionsKt.listOfNotNull(JsonKt.o(root));
            }
            Iterable $this$filter$iv = iterableListOfNotNull;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                Map it3 = (Map) element$iv$iv;
                String str = JsonKt.str(it3, "mcversion");
                if (str == null) {
                    str = mc;
                }
                if (Intrinsics.areEqual(str, mc)) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }
            Iterable<Map> $this$mapNotNullTo$iv = (List) destination$iv$iv;
            Collection destination$iv = (Collection) out;
            for (Map it4 : $this$mapNotNullTo$iv) {
                LiteLoaderBuild liteLoader$build = parseLiteLoader$build(mc, it4, false);
                if (liteLoader$build != null) {
                    destination$iv.add(liteLoader$build);
                }
            }
        }
        Iterable $this$distinctBy$iv = out;
        HashSet set$iv = new HashSet();
        ArrayList list$iv = new ArrayList();
        for (Object e$iv : $this$distinctBy$iv) {
            LiteLoaderBuild it5 = (LiteLoaderBuild) e$iv;
            if (set$iv.add(it5.getVersion())) {
                list$iv.add(e$iv);
            }
        }
        ArrayList $this$distinctBy$iv2 = list$iv;
        ArrayList $this$sortedBy$iv = $this$distinctBy$iv2;
        return CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.pymcl.core.loader.LoaderInstaller$parseLiteLoader$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                LoaderInstaller.LiteLoaderBuild it6 = (LoaderInstaller.LiteLoaderBuild) t;
                LoaderInstaller.LiteLoaderBuild it7 = (LoaderInstaller.LiteLoaderBuild) t2;
                return ComparisonsKt.compareValues(Boolean.valueOf(it6.getSnapshot()), Boolean.valueOf(it7.getSnapshot()));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.pymcl.core.loader.LoaderInstaller.LiteLoaderBuild parseLiteLoader$build(java.lang.String r13, java.util.Map<java.lang.String, java.lang.Object> r14, boolean r15) {
        /*
            java.lang.String r0 = "build"
            java.util.Map r0 = com.pymcl.core.util.JsonKt.obj(r14, r0)
            if (r0 != 0) goto L9
            r0 = r14
        L9:
            java.lang.String r1 = "version"
            java.lang.String r2 = com.pymcl.core.util.JsonKt.str(r0, r1)
            r3 = 0
            if (r2 != 0) goto L19
            java.lang.String r2 = com.pymcl.core.util.JsonKt.str(r14, r1)
            if (r2 != 0) goto L19
            return r3
        L19:
            r6 = r2
            com.pymcl.core.loader.LoaderInstaller$LiteLoaderBuild r4 = new com.pymcl.core.loader.LoaderInstaller$LiteLoaderBuild
            java.lang.String r1 = "mcversion"
            java.lang.String r1 = com.pymcl.core.util.JsonKt.str(r14, r1)
            if (r1 != 0) goto L26
            r5 = r13
            goto L27
        L26:
            r5 = r1
        L27:
            java.lang.String r1 = "file"
            java.lang.String r7 = com.pymcl.core.util.JsonKt.str(r0, r1)
            java.lang.String r1 = "md5"
            java.lang.String r8 = com.pymcl.core.util.JsonKt.str(r0, r1)
            java.lang.String r1 = "tweakClass"
            java.lang.String r1 = com.pymcl.core.util.JsonKt.str(r0, r1)
            if (r1 != 0) goto L3d
            java.lang.String r1 = "com.mumfrey.liteloader.launch.LiteLoaderTweaker"
        L3d:
            r9 = r1
            java.lang.String r1 = "libraries"
            java.util.List r1 = com.pymcl.core.util.JsonKt.arr(r0, r1)
            java.util.List r10 = com.pymcl.core.util.JsonKt.objs(r1)
            r1 = 1
            if (r15 != 0) goto L70
            java.lang.String r2 = "stream"
            java.lang.String r2 = com.pymcl.core.util.JsonKt.str(r0, r2)
            if (r2 != 0) goto L5d
            java.lang.String r2 = "type"
            java.lang.String r2 = com.pymcl.core.util.JsonKt.str(r14, r2)
            if (r2 != 0) goto L5d
            java.lang.String r2 = ""
        L5d:
            java.lang.String r11 = "SNAPSHOT"
            boolean r2 = kotlin.text.StringsKt.equals(r2, r11, r1)
            if (r2 != 0) goto L70
            r2 = 2
            r12 = 0
            boolean r2 = kotlin.text.StringsKt.endsWith$default(r6, r11, r12, r2, r3)
            if (r2 == 0) goto L6e
            goto L70
        L6e:
            r11 = r12
            goto L71
        L70:
            r11 = r1
        L71:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.loader.LoaderInstaller.parseLiteLoader$build(java.lang.String, java.util.Map, boolean):com.pymcl.core.loader.LoaderInstaller$LiteLoaderBuild");
    }

    public final List<LiteLoaderBuild> liteloaderBuilds(String mc) throws InstallError {
        List r;
        Intrinsics.checkNotNullParameter(mc, "mc");
        List<String> it = CollectionsKt.listOf((Object[]) new String[]{LoadersKt.LITELOADER_VERSIONS, "https://bmclapi2.bangbang93.com/liteloader/list?mcversion=" + Http.INSTANCE.enc(mc)});
        if (this.mirrors.fileMirrorFirst()) {
            it = CollectionsKt.reversed(it);
        }
        Exception err = null;
        for (String u : it) {
            try {
                r = parseLiteLoader(Http.getText$default(this.http, u, null, 0, 6, null), mc);
            } catch (Exception e) {
                err = e;
            }
            if (!r.isEmpty()) {
                return r;
            }
        }
        if (err != null) {
            throw new InstallError("获取 LiteLoader 列表失败：" + err.getMessage(), err);
        }
        return CollectionsKt.emptyList();
    }

    public final List<LoaderVersion> liteloaderVersions(String mc) throws InstallError {
        Intrinsics.checkNotNullParameter(mc, "mc");
        Iterable $this$map$iv = liteloaderBuilds(mc);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            LiteLoaderBuild it = (LiteLoaderBuild) item$iv$iv;
            destination$iv$iv.add(new LoaderVersion(LoaderType.LITELOADER, mc, it.getVersion(), !it.getSnapshot()));
        }
        return (List) destination$iv$iv;
    }

    public final List<String> liteloaderUrls(LiteLoaderBuild b) {
        Intrinsics.checkNotNullParameter(b, "b");
        String bm = "https://bmclapi2.bangbang93.com/maven/com/mumfrey/liteloader/" + b.getVersion() + "/liteloader-" + b.getVersion() + ".jar";
        String off = (b.getFile() == null || b.getSnapshot()) ? "http://dl.liteloader.com/versions/com/mumfrey/liteloader/" + b.getVersion() + "/liteloader-" + b.getVersion() + ".jar" : "http://dl.liteloader.com/versions/com/mumfrey/liteloader/" + b.getMc() + "/" + b.getFile();
        return this.mirrors.fileMirrorFirst() ? CollectionsKt.listOf((Object[]) new String[]{bm, off}) : CollectionsKt.listOf((Object[]) new String[]{off, bm});
    }

    public static /* synthetic */ Object installLiteLoader$default(LoaderInstaller loaderInstaller, GameDirs gameDirs, String str, String str2, LiteLoaderBuild liteLoaderBuild, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            liteLoaderBuild = null;
        }
        return loaderInstaller.installLiteLoader(gameDirs, str, str2, liteLoaderBuild, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02cb A[LOOP:1: B:72:0x0296->B:83:0x02cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0357 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object installLiteLoader(com.pymcl.core.version.GameDirs r28, java.lang.String r29, java.lang.String r30, com.pymcl.core.loader.LoaderInstaller.LiteLoaderBuild r31, kotlin.coroutines.Continuation<? super java.lang.String> r32) throws com.pymcl.core.loader.InstallError {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.loader.LoaderInstaller.installLiteLoader(com.pymcl.core.version.GameDirs, java.lang.String, java.lang.String, com.pymcl.core.loader.LoaderInstaller$LiteLoaderBuild, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Map<String, Object> localLib(String name, GameDirs dirs) {
        String path = Maven.INSTANCE.path(name);
        File f = new File(dirs.getLibrariesDir(), path);
        return JsonKt.jobj(TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, name), TuplesKt.to("downloads", JsonKt.jobj(TuplesKt.to("artifact", JsonKt.jobj(TuplesKt.to("path", path), TuplesKt.to("url", ""), TuplesKt.to("size", Long.valueOf(f.length())))))));
    }

    private final void extract(ZipFile z, ZipEntry e, File dst) throws IOException {
        dst.getParentFile().mkdirs();
        FileOutputStream inputStream = z.getInputStream(e);
        try {
            InputStream i = inputStream;
            inputStream = new FileOutputStream(dst);
            try {
                FileOutputStream it = inputStream;
                Intrinsics.checkNotNull(i);
                ByteStreamsKt.copyTo$default(i, it, 0, 2, null);
                CloseableKt.closeFinally(inputStream, null);
                CloseableKt.closeFinally(inputStream, null);
            } finally {
            }
        } finally {
        }
    }

    private final void writeTweakVersion(GameDirs dirs, String id, String mc, List<? extends Object> libs, String tweak) {
        ResolvedVersion parent = ResolvedVersion.Companion.load$default(ResolvedVersion.Companion, dirs.getVersionsDir(), mc, 0, 4, null);
        String now = OffsetDateTime.now().withNano(0).toString();
        Intrinsics.checkNotNullExpressionValue(now, "toString(...)");
        Pair[] pairArr = new Pair[8];
        pairArr[0] = TuplesKt.to("id", id);
        pairArr[1] = TuplesKt.to("inheritsFrom", mc);
        pairArr[2] = TuplesKt.to(ArchiveStreamFactory.JAR, mc);
        String str = JsonKt.str(parent.getJson(), ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (str == null) {
            str = "release";
        }
        pairArr[3] = TuplesKt.to(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, str);
        pairArr[4] = TuplesKt.to("time", now);
        pairArr[5] = TuplesKt.to("releaseTime", now);
        pairArr[6] = TuplesKt.to("mainClass", "net.minecraft.launchwrapper.Launch");
        pairArr[7] = TuplesKt.to("libraries", CollectionsKt.toMutableList((Collection) libs));
        Map j = JsonKt.jobj(pairArr);
        String old = parent.getMinecraftArguments();
        if (old == null || JsonKt.obj(parent.getJson(), "arguments") != null) {
            j.put("arguments", JsonKt.jobj(TuplesKt.to("game", CollectionsKt.mutableListOf("--tweakClass", tweak))));
        } else {
            j.put("minecraftArguments", StringsKt.trim((CharSequence) (old + " --tweakClass " + tweak)).toString());
        }
        FileUtil.INSTANCE.writeJson(new File(dirs.getVersionsDir(), id + "/" + id + ".json"), j);
    }
}
