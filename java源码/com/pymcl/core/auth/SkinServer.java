package com.pymcl.core.auth;

import androidx.autofill.HintConstants;
import com.pymcl.ai.AiClient;
import com.pymcl.core.launch.LaunchArgsBuilder;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.URLDecoder;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javassist.compiler.TokenId;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.CharEncoding;
import org.apache.commons.lang3.StringUtils;

/* compiled from: SkinServer.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 O2\u00020\u0001:\u0003MNOB\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0010J\u000e\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0005J\u0006\u0010+\u001a\u00020'J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100,J\u0010\u0010-\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0018J\u0006\u0010.\u001a\u00020'J\u0006\u0010/\u001a\u00020\u0005J\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000101j\u0002`2J\u0010\u00103\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J*\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000101j\u0002`22\u0006\u0010(\u001a\u00020\u00102\b\b\u0002\u00105\u001a\u00020!J\u001a\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00182\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010:\u001a\u000207H\u0002J\b\u0010;\u001a\u000207H\u0002J\u0014\u0010<\u001a\u0004\u0018\u00010\u00102\b\u0010=\u001a\u0004\u0018\u00010\u0005H\u0002J \u0010>\u001a\u0002072\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00052\b\b\u0002\u0010A\u001a\u00020\u0012J\u0010\u0010B\u001a\u00020'2\u0006\u0010C\u001a\u00020DH\u0002J\u0012\u0010E\u001a\u0004\u0018\u00010\u00052\u0006\u0010F\u001a\u00020GH\u0002J \u0010H\u001a\u00020'2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u0002072\u0006\u0010L\u001a\u00020!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\t¨\u0006P"}, d2 = {"Lcom/pymcl/core/auth/SkinServer;", "", "keyPair", "Ljava/security/KeyPair;", "serverName", "", "<init>", "(Ljava/security/KeyPair;Ljava/lang/String;)V", "getServerName", "()Ljava/lang/String;", "publicKey", "Ljava/security/PublicKey;", "getPublicKey", "()Ljava/security/PublicKey;", "profiles", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/pymcl/core/auth/SkinServer$Profile;", "textures", "", "socket", "Ljava/net/ServerSocket;", "pool", "Ljava/util/concurrent/ExecutorService;", "value", "", "port", "getPort", "()I", "requestLog", "", "getRequestLog", "()Ljava/util/List;", "running", "", "getRunning", "()Z", "apiRoot", "getApiRoot", SettingsProtocol.PUT, "", "p", "remove", "uuid", "clear", "", "start", "stop", "prefetched", "metadata", "", "Lcom/pymcl/core/util/JObj;", "sign", "profileJson", "signed", "json", "Lcom/pymcl/core/auth/SkinServer$Response;", "code", SettingsProtocol.EXTRA_VALUE, "noContent", "notFound", "byName", "n", "handle", "method", "path", "body", "serve", "c", "Ljava/net/Socket;", "readLine", "ins", "Ljava/io/InputStream;", "write", "out", "Ljava/io/OutputStream;", "r", "head", "Profile", "Response", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SkinServer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final KeyPair keyPair;
    private ExecutorService pool;
    private volatile int port;
    private final ConcurrentHashMap<String, Profile> profiles;
    private final List<String> requestLog;
    private final String serverName;
    private ServerSocket socket;
    private final ConcurrentHashMap<String, byte[]> textures;

    /* renamed from: $r8$lambda$N7YC7kW3dVKWAEKgm71W2HQL8-g, reason: not valid java name */
    public static /* synthetic */ void m8014$r8$lambda$N7YC7kW3dVKWAEKgm71W2HQL8g(SkinServer skinServer, Socket socket) {
        start$lambda$1$0(skinServer, socket);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkinServer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public SkinServer(KeyPair keyPair, String serverName) {
        Intrinsics.checkNotNullParameter(keyPair, "keyPair");
        Intrinsics.checkNotNullParameter(serverName, "serverName");
        this.keyPair = keyPair;
        this.serverName = serverName;
        this.profiles = new ConcurrentHashMap<>();
        this.textures = new ConcurrentHashMap<>();
        List<String> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(listSynchronizedList, "synchronizedList(...)");
        this.requestLog = listSynchronizedList;
    }

    public /* synthetic */ SkinServer(KeyPair keyPair, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? INSTANCE.generateKeyPair() : keyPair, (i & 2) != 0 ? "PyMCL 本地皮肤" : str);
    }

    public final String getServerName() {
        return this.serverName;
    }

    /* compiled from: SkinServer.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006!"}, d2 = {"Lcom/pymcl/core/auth/SkinServer$Profile;", "", HintConstants.AUTOFILL_HINT_NAME, "", "uuid", "skinPng", "", "slim", "", "capePng", "<init>", "(Ljava/lang/String;Ljava/lang/String;[BZ[B)V", "getName", "()Ljava/lang/String;", "getUuid", "getSkinPng", "()[B", "getSlim", "()Z", "getCapePng", "id", "getId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Profile {
        private final byte[] capePng;
        private final String name;
        private final byte[] skinPng;
        private final boolean slim;
        private final String uuid;

        public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, byte[] bArr, boolean z, byte[] bArr2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = profile.name;
            }
            if ((i & 2) != 0) {
                str2 = profile.uuid;
            }
            if ((i & 4) != 0) {
                bArr = profile.skinPng;
            }
            if ((i & 8) != 0) {
                z = profile.slim;
            }
            if ((i & 16) != 0) {
                bArr2 = profile.capePng;
            }
            byte[] bArr3 = bArr2;
            byte[] bArr4 = bArr;
            return profile.copy(str, str2, bArr4, z, bArr3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* renamed from: component3, reason: from getter */
        public final byte[] getSkinPng() {
            return this.skinPng;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getSlim() {
            return this.slim;
        }

        /* renamed from: component5, reason: from getter */
        public final byte[] getCapePng() {
            return this.capePng;
        }

        public final Profile copy(String name, String uuid, byte[] skinPng, boolean slim, byte[] capePng) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return new Profile(name, uuid, skinPng, slim, capePng);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) other;
            return Intrinsics.areEqual(this.name, profile.name) && Intrinsics.areEqual(this.uuid, profile.uuid) && Intrinsics.areEqual(this.skinPng, profile.skinPng) && this.slim == profile.slim && Intrinsics.areEqual(this.capePng, profile.capePng);
        }

        public int hashCode() {
            return (((((((this.name.hashCode() * 31) + this.uuid.hashCode()) * 31) + (this.skinPng == null ? 0 : Arrays.hashCode(this.skinPng))) * 31) + Boolean.hashCode(this.slim)) * 31) + (this.capePng != null ? Arrays.hashCode(this.capePng) : 0);
        }

        public String toString() {
            return "Profile(name=" + this.name + ", uuid=" + this.uuid + ", skinPng=" + Arrays.toString(this.skinPng) + ", slim=" + this.slim + ", capePng=" + Arrays.toString(this.capePng) + ")";
        }

        public Profile(String name, String uuid, byte[] skinPng, boolean slim, byte[] capePng) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.name = name;
            this.uuid = uuid;
            this.skinPng = skinPng;
            this.slim = slim;
            this.capePng = capePng;
        }

        public /* synthetic */ Profile(String str, String str2, byte[] bArr, boolean z, byte[] bArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, bArr, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : bArr2);
        }

        public final byte[] getCapePng() {
            return this.capePng;
        }

        public final String getName() {
            return this.name;
        }

        public final byte[] getSkinPng() {
            return this.skinPng;
        }

        public final boolean getSlim() {
            return this.slim;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final String getId() {
            String lowerCase = StringsKt.replace$default(this.uuid, "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
    }

    /* compiled from: SkinServer.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/pymcl/core/auth/SkinServer$Response;", "", "code", "", "contentType", "", "body", "", "<init>", "(ILjava/lang/String;[B)V", "getCode", "()I", "getContentType", "()Ljava/lang/String;", "getBody", "()[B", TerracottaVpnService.EXTRA_TEXT, "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Response {
        private final byte[] body;
        private final int code;
        private final String contentType;

        public static /* synthetic */ Response copy$default(Response response, int i, String str, byte[] bArr, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = response.code;
            }
            if ((i2 & 2) != 0) {
                str = response.contentType;
            }
            if ((i2 & 4) != 0) {
                bArr = response.body;
            }
            return response.copy(i, str, bArr);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        /* renamed from: component3, reason: from getter */
        public final byte[] getBody() {
            return this.body;
        }

        public final Response copy(int code, String contentType, byte[] body) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(body, "body");
            return new Response(code, contentType, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return this.code == response.code && Intrinsics.areEqual(this.contentType, response.contentType) && Intrinsics.areEqual(this.body, response.body);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.code) * 31) + this.contentType.hashCode()) * 31) + Arrays.hashCode(this.body);
        }

        public String toString() {
            return "Response(code=" + this.code + ", contentType=" + this.contentType + ", body=" + Arrays.toString(this.body) + ")";
        }

        public Response(int code, String contentType, byte[] body) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(body, "body");
            this.code = code;
            this.contentType = contentType;
            this.body = body;
        }

        public final byte[] getBody() {
            return this.body;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final String getText() {
            return new String(this.body, Charsets.UTF_8);
        }
    }

    /* compiled from: SkinServer.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u0013"}, d2 = {"Lcom/pymcl/core/auth/SkinServer$Companion;", "", "<init>", "()V", "generateKeyPair", "Ljava/security/KeyPair;", "pem", "", "k", "Ljava/security/PublicKey;", "digest", "png", "", "verify", "", "publicKey", "value", "signatureB64", "isValidSkin", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KeyPair generateKeyPair() throws NoSuchAlgorithmException {
            KeyPairGenerator $this$generateKeyPair_u24lambda_u240 = KeyPairGenerator.getInstance("RSA");
            $this$generateKeyPair_u24lambda_u240.initialize(2048);
            KeyPair keyPairGenKeyPair = $this$generateKeyPair_u24lambda_u240.genKeyPair();
            Intrinsics.checkNotNullExpressionValue(keyPairGenKeyPair, "genKeyPair(...)");
            return keyPairGenKeyPair;
        }

        public final String pem(PublicKey k) {
            Intrinsics.checkNotNullParameter(k, "k");
            byte[] bytes = StringUtils.LF.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return "-----BEGIN PUBLIC KEY-----\n" + Base64.getMimeEncoder(76, bytes).encodeToString(k.getEncoded()) + "\n-----END PUBLIC KEY-----\n";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence digest$lambda$0(byte it) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        public final String digest(byte[] png) {
            Intrinsics.checkNotNullParameter(png, "png");
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(png);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
            return ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new SkinServer$Companion$$ExternalSyntheticLambda0(), 30, (Object) null);
        }

        public final boolean verify(PublicKey publicKey, String value, String signatureB64) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
            Intrinsics.checkNotNullParameter(publicKey, "publicKey");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(signatureB64, "signatureB64");
            Signature $this$verify_u24lambda_u240 = Signature.getInstance("SHA1withRSA");
            $this$verify_u24lambda_u240.initVerify(publicKey);
            byte[] bytes = value.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            $this$verify_u24lambda_u240.update(bytes);
            return $this$verify_u24lambda_u240.verify(Base64.getDecoder().decode(signatureB64));
        }

        public final boolean isValidSkin(byte[] png) {
            Intrinsics.checkNotNullParameter(png, "png");
            if (png.length < 24 || png[0] != -119 || png[1] != 80 || png[2] != 78 || png[3] != 71) {
                return false;
            }
            int w = isValidSkin$be(png, 16);
            int h = isValidSkin$be(png, 20);
            if (w == 64) {
                return h == 64 || h == 32;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int isValidSkin$be(byte[] $png, int i) {
            return (($png[i] & UByte.MAX_VALUE) << 24) | (($png[i + 1] & UByte.MAX_VALUE) << 16) | (($png[i + 2] & UByte.MAX_VALUE) << 8) | ($png[i + 3] & UByte.MAX_VALUE);
        }
    }

    public final PublicKey getPublicKey() {
        PublicKey publicKey = this.keyPair.getPublic();
        Intrinsics.checkNotNullExpressionValue(publicKey, "getPublic(...)");
        return publicKey;
    }

    public final int getPort() {
        return this.port;
    }

    public final List<String> getRequestLog() {
        return this.requestLog;
    }

    public final boolean getRunning() {
        ServerSocket serverSocket = this.socket;
        return (serverSocket == null || serverSocket.isClosed()) ? false : true;
    }

    public final String getApiRoot() {
        return "http://127.0.0.1:" + this.port;
    }

    public final void put(Profile p) {
        Intrinsics.checkNotNullParameter(p, "p");
        this.profiles.put(p.getId(), p);
        byte[] it = p.getSkinPng();
        if (it != null) {
            this.textures.put(INSTANCE.digest(it), it);
        }
        byte[] it2 = p.getCapePng();
        if (it2 != null) {
            this.textures.put(INSTANCE.digest(it2), it2);
        }
    }

    public final void remove(String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        ConcurrentHashMap<String, Profile> concurrentHashMap = this.profiles;
        String lowerCase = StringsKt.replace$default(uuid, "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        concurrentHashMap.remove(lowerCase);
    }

    public final void clear() {
        this.profiles.clear();
        this.textures.clear();
    }

    public final List<Profile> profiles() {
        Collection<Profile> collectionValues = this.profiles.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return CollectionsKt.toList(collectionValues);
    }

    public static /* synthetic */ int start$default(SkinServer skinServer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return skinServer.start(i);
    }

    public final synchronized int start(int port) {
        if (getRunning()) {
            return this.port;
        }
        final ServerSocket ss = new ServerSocket();
        ss.setReuseAddress(true);
        ss.bind(new InetSocketAddress(InetAddress.getByName("127.0.0.1"), port), 32);
        this.socket = ss;
        this.port = ss.getLocalPort();
        final ExecutorService p = Executors.newCachedThreadPool(new SkinServer$$ExternalSyntheticLambda1());
        this.pool = p;
        p.execute(new Runnable() { // from class: com.pymcl.core.auth.SkinServer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                SkinServer.start$lambda$1(ss, p, this);
            }
        });
        return this.port;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread start$lambda$0(Runnable r) {
        Thread $this$start_u24lambda_u240_u240 = new Thread(r, "PyMCL-SkinServer");
        $this$start_u24lambda_u240_u240.setDaemon(true);
        return $this$start_u24lambda_u240_u240;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(ServerSocket $ss, ExecutorService $p, final SkinServer this$0) throws IOException {
        while (!$ss.isClosed()) {
            try {
                final Socket c = $ss.accept();
                $p.execute(new Runnable() { // from class: com.pymcl.core.auth.SkinServer$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SkinServer.start$lambda$1$0(this.f$0, c);
                    }
                });
            } catch (SocketException e) {
                return;
            } catch (Exception e2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1$0(SkinServer this$0, Socket $c) {
        Intrinsics.checkNotNull($c);
        this$0.serve($c);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[Catch: all -> 0x002e, TryCatch #1 {, blocks: (B:12:0x0021, B:14:0x0027, B:15:0x002a, B:11:0x0018, B:4:0x0002, B:6:0x000c, B:8:0x0013), top: B:21:0x0002, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void stop() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L17
            r1 = r4
            com.pymcl.core.auth.SkinServer r1 = (com.pymcl.core.auth.SkinServer) r1     // Catch: java.lang.Throwable -> L17
            r2 = 0
            java.net.ServerSocket r3 = r1.socket     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> L17
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L17
            goto L13
        L12:
            r3 = r0
        L13:
            kotlin.Result.m8116constructorimpl(r3)     // Catch: java.lang.Throwable -> L17
            goto L21
        L17:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)     // Catch: java.lang.Throwable -> L2e
            kotlin.Result.m8116constructorimpl(r1)     // Catch: java.lang.Throwable -> L2e
        L21:
            r4.socket = r0     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ExecutorService r1 = r4.pool     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L2a
            r1.shutdownNow()     // Catch: java.lang.Throwable -> L2e
        L2a:
            r4.pool = r0     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r4)
            return
        L2e:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.auth.SkinServer.stop():void");
    }

    public final String prefetched() {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = Json.stringify$default(Json.INSTANCE, metadata(), false, 2, null).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = encoder.encodeToString(bytes);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final Map<String, Object> metadata() {
        Pair[] pairArr = {TuplesKt.to("serverName", this.serverName), TuplesKt.to("implementationName", "PyMCL"), TuplesKt.to("implementationVersion", LaunchArgsBuilder.LAUNCHER_VERSION), TuplesKt.to("feature.non_email_login", true), TuplesKt.to("feature.no_mojang_namespace", true), TuplesKt.to("links", JsonKt.jobj(TuplesKt.to("homepage", getApiRoot())))};
        Companion companion = INSTANCE;
        PublicKey publicKey = this.keyPair.getPublic();
        Intrinsics.checkNotNullExpressionValue(publicKey, "getPublic(...)");
        return JsonKt.jobj(TuplesKt.to("meta", JsonKt.jobj(pairArr)), TuplesKt.to("skinDomains", CollectionsKt.mutableListOf("127.0.0.1", "localhost")), TuplesKt.to("signaturePublickey", companion.pem(publicKey)));
    }

    private final String sign(String value) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Signature $this$sign_u24lambda_u240 = Signature.getInstance("SHA1withRSA");
        $this$sign_u24lambda_u240.initSign(this.keyPair.getPrivate());
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        $this$sign_u24lambda_u240.update(bytes);
        String strEncodeToString = Base64.getEncoder().encodeToString($this$sign_u24lambda_u240.sign());
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "run(...)");
        return strEncodeToString;
    }

    public static /* synthetic */ Map profileJson$default(SkinServer skinServer, Profile profile, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return skinServer.profileJson(profile, z);
    }

    public final Map<String, Object> profileJson(Profile p, boolean signed) {
        Intrinsics.checkNotNullParameter(p, "p");
        Map tex = JsonKt.jobj(new Pair[0]);
        byte[] it = p.getSkinPng();
        if (it != null) {
            Map s = JsonKt.jobj(TuplesKt.to("url", getApiRoot() + "/textures/" + INSTANCE.digest(it)));
            if (p.getSlim()) {
                s.put("metadata", JsonKt.jobj(TuplesKt.to("model", "slim")));
            }
            tex.put("SKIN", s);
        }
        byte[] it2 = p.getCapePng();
        if (it2 != null) {
            tex.put("CAPE", JsonKt.jobj(TuplesKt.to("url", getApiRoot() + "/textures/" + INSTANCE.digest(it2))));
        }
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = Json.stringify$default(Json.INSTANCE, JsonKt.jobj(TuplesKt.to("timestamp", Long.valueOf(System.currentTimeMillis())), TuplesKt.to("profileId", p.getId()), TuplesKt.to("profileName", p.getName()), TuplesKt.to("signatureRequired", Boolean.valueOf(signed)), TuplesKt.to("textures", tex)), false, 2, null).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String value = encoder.encodeToString(bytes);
        Map prop = JsonKt.jobj(TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, "textures"), TuplesKt.to("value", value));
        if (signed) {
            Intrinsics.checkNotNull(value);
            prop.put("signature", sign(value));
        }
        return JsonKt.jobj(TuplesKt.to("id", p.getId()), TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, p.getName()), TuplesKt.to("properties", CollectionsKt.mutableListOf(prop)));
    }

    private final Response json(int code, Object v) {
        byte[] bytes = Json.stringify$default(Json.INSTANCE, v, false, 2, null).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new Response(code, "application/json; charset=utf-8", bytes);
    }

    private final Response noContent() {
        return new Response(204, "text/plain", new byte[0]);
    }

    private final Response notFound() {
        return json(TokenId.FloatConstant, JsonKt.jobj(TuplesKt.to("error", "Not Found"), TuplesKt.to("errorMessage", "Not Found")));
    }

    private final Profile byName(String n) {
        Object element$iv;
        Iterable iterableValues = this.profiles.values();
        Intrinsics.checkNotNullExpressionValue(iterableValues, "<get-values>(...)");
        Iterable $this$firstOrNull$iv = iterableValues;
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (it.hasNext()) {
                element$iv = it.next();
                Profile it2 = (Profile) element$iv;
                if (StringsKt.equals(it2.getName(), n, true)) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        return (Profile) element$iv;
    }

    public static /* synthetic */ Response handle$default(SkinServer skinServer, String str, String str2, byte[] bArr, int i, Object obj) {
        if ((i & 4) != 0) {
            bArr = new byte[0];
        }
        return skinServer.handle(str, str2, bArr);
    }

    public final Response handle(String method, String path, byte[] body) {
        int i;
        char c;
        Object objM8116constructorimpl;
        Map<String, Object> mapJobj;
        ArrayList arrayList;
        Object objM8116constructorimpl2;
        Response responseJson;
        Response responseJson2;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        synchronized (this.requestLog) {
            this.requestLog.add(method + StringUtils.SPACE + path);
            while (this.requestLog.size() > 200) {
                this.requestLog.remove(0);
            }
            Unit unit = Unit.INSTANCE;
        }
        boolean z = true;
        String strTrimEnd = StringsKt.trimEnd(StringsKt.substringBefore$default(path, '?', (String) null, 2, (Object) null), IOUtils.DIR_SEPARATOR_UNIX);
        if (strTrimEnd.length() == 0) {
            strTrimEnd = "/";
        }
        String p = strTrimEnd;
        List $this$filter$iv = StringsKt.split$default((CharSequence) StringsKt.substringAfter(path, '?', ""), new char[]{Typography.amp}, false, 0, 6, (Object) null);
        ArrayList destination$iv$iv = new ArrayList();
        Iterator it = $this$filter$iv.iterator();
        while (true) {
            i = z;
            c = '=';
            if (!it.hasNext()) {
                break;
            }
            Object element$iv$iv = it.next();
            if (StringsKt.contains$default((CharSequence) element$iv$iv, '=', false, 2, (Object) null)) {
                destination$iv$iv.add(element$iv$iv);
            }
            z = i;
        }
        ArrayList<String> $this$associate$iv = destination$iv$iv;
        int $i$f$associate = 0;
        int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
        LinkedHashMap q = new LinkedHashMap(capacity$iv);
        for (String it2 : $this$associate$iv) {
            int $i$f$associate2 = $i$f$associate;
            Pair pair = TuplesKt.to(URLDecoder.decode(StringsKt.substringBefore$default(it2, c, (String) null, 2, (Object) null), CharEncoding.UTF_8), URLDecoder.decode(StringsKt.substringAfter$default(it2, c, (String) null, 2, (Object) null), CharEncoding.UTF_8));
            q.put(pair.getFirst(), pair.getSecond());
            $i$f$associate = $i$f$associate2;
            c = '=';
        }
        String bodyText = new String(body, Charsets.UTF_8);
        if (Intrinsics.areEqual(p, "/") || Intrinsics.areEqual(p, "/status")) {
            int i2 = 200;
            return json(i2, metadata());
        }
        if (StringsKt.startsWith$default(p, "/textures/", false, 2, (Object) null)) {
            byte[] it3 = this.textures.get(StringsKt.removePrefix(p, (CharSequence) "/textures/"));
            return it3 != null ? new Response(200, "image/png", it3) : notFound();
        }
        if (StringsKt.startsWith$default(p, "/sessionserver/session/minecraft/profile/", false, 2, (Object) null)) {
            String id = StringsKt.replace$default(StringsKt.substringAfterLast$default(p, IOUtils.DIR_SEPARATOR_UNIX, (String) null, 2, (Object) null), "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(id, "toLowerCase(...)");
            Profile it4 = this.profiles.get(id);
            return (it4 == null || (responseJson2 = json(200, profileJson(it4, Intrinsics.areEqual(q.get("unsigned"), "true") ^ true))) == null) ? noContent() : responseJson2;
        }
        if (Intrinsics.areEqual(p, "/sessionserver/session/minecraft/hasJoined")) {
            Profile it5 = byName((String) q.get(HintConstants.AUTOFILL_HINT_USERNAME));
            return (it5 == null || (responseJson = json(200, profileJson$default(this, it5, false, 2, null))) == null) ? noContent() : responseJson;
        }
        if (Intrinsics.areEqual(p, "/sessionserver/session/minecraft/join")) {
            return noContent();
        }
        if (Intrinsics.areEqual(p, "/api/profiles/minecraft")) {
            try {
                Result.Companion companion = Result.INSTANCE;
                SkinServer skinServer = this;
                List<Object> listA = JsonKt.a(Json.INSTANCE.parse(bodyText));
                if (listA != null) {
                    List<Object> $this$mapNotNull$iv = listA;
                    ArrayList destination$iv$iv2 = new ArrayList();
                    for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                        String str = element$iv$iv$iv instanceof String ? (String) element$iv$iv$iv : null;
                        if (str != null) {
                            destination$iv$iv2.add(str);
                        }
                    }
                    arrayList = destination$iv$iv2;
                } else {
                    arrayList = null;
                }
                objM8116constructorimpl = Result.m8116constructorimpl(arrayList);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                objM8116constructorimpl = null;
            }
            List names = (List) objM8116constructorimpl;
            if (names == null) {
                names = CollectionsKt.emptyList();
            }
            List<String> $this$mapNotNull$iv2 = names;
            ArrayList destination$iv$iv3 = new ArrayList();
            for (String n : $this$mapNotNull$iv2) {
                List names2 = names;
                Profile it6 = byName(n);
                if (it6 != null) {
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = TuplesKt.to("id", it6.getId());
                    pairArr[i] = TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, it6.getName());
                    mapJobj = JsonKt.jobj(pairArr);
                } else {
                    mapJobj = null;
                }
                if (mapJobj != null) {
                    destination$iv$iv3.add(mapJobj);
                }
                names = names2;
            }
            return json(200, CollectionsKt.toMutableList((Collection) destination$iv$iv3));
        }
        if (StringsKt.startsWith$default(p, "/api/users/profiles/minecraft/", false, 2, (Object) null)) {
            Profile it7 = byName(StringsKt.substringAfterLast$default(p, IOUtils.DIR_SEPARATOR_UNIX, (String) null, 2, (Object) null));
            if (it7 != null) {
                Pair[] pairArr2 = new Pair[2];
                pairArr2[0] = TuplesKt.to("id", it7.getId());
                pairArr2[i] = TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, it7.getName());
                Response responseJson3 = json(200, JsonKt.jobj(pairArr2));
                if (responseJson3 != null) {
                    return responseJson3;
                }
            }
            return noContent();
        }
        if (!Intrinsics.areEqual(p, "/authserver/authenticate") && !Intrinsics.areEqual(p, "/authserver/refresh")) {
            if (Intrinsics.areEqual(p, "/authserver/validate") || Intrinsics.areEqual(p, "/authserver/invalidate") || Intrinsics.areEqual(p, "/authserver/signout")) {
                return noContent();
            }
            if (!Intrinsics.areEqual(p, "/minecraftservices/player/attributes")) {
                return Intrinsics.areEqual(p, "/minecraftservices/publickeys") ? json(200, JsonKt.jobj(TuplesKt.to("profilePropertyKeys", CollectionsKt.mutableListOf(JsonKt.jobj(TuplesKt.to("publicKey", Base64.getEncoder().encodeToString(this.keyPair.getPublic().getEncoded()))))), TuplesKt.to("playerCertificateKeys", new ArrayList()))) : notFound();
            }
            Pair[] pairArr3 = new Pair[4];
            Pair[] pairArr4 = new Pair[i];
            pairArr4[0] = TuplesKt.to("enabled", Boolean.valueOf((boolean) i));
            pairArr3[0] = TuplesKt.to("onlineChat", JsonKt.jobj(pairArr4));
            Pair[] pairArr5 = new Pair[i];
            pairArr5[0] = TuplesKt.to("enabled", Boolean.valueOf((boolean) i));
            pairArr3[i] = TuplesKt.to("multiplayerServer", JsonKt.jobj(pairArr5));
            Pair[] pairArr6 = new Pair[i];
            pairArr6[0] = TuplesKt.to("enabled", false);
            pairArr3[2] = TuplesKt.to("multiplayerRealms", JsonKt.jobj(pairArr6));
            Pair[] pairArr7 = new Pair[i];
            pairArr7[0] = TuplesKt.to("enabled", false);
            pairArr3[3] = TuplesKt.to("telemetry", JsonKt.jobj(pairArr7));
            return json(200, JsonKt.jobj(TuplesKt.to("privileges", JsonKt.jobj(pairArr3)), TuplesKt.to("profanityFilterPreferences", JsonKt.jobj(TuplesKt.to("profanityFilterOn", false)))));
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            SkinServer skinServer2 = this;
            objM8116constructorimpl2 = Result.m8116constructorimpl(Json.INSTANCE.obj(bodyText));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            objM8116constructorimpl2 = Result.m8116constructorimpl(ResultKt.createFailure(th2));
        }
        Map<String, Object> mapJobj2 = JsonKt.jobj(new Pair[0]);
        if (Result.m8122isFailureimpl(objM8116constructorimpl2)) {
            objM8116constructorimpl2 = mapJobj2;
        }
        Map req = (Map) objM8116constructorimpl2;
        Profile prof = byName(JsonKt.str(req, HintConstants.AUTOFILL_HINT_USERNAME));
        if (prof == null) {
            Collection<Profile> collectionValues = this.profiles.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            prof = (Profile) CollectionsKt.firstOrNull(collectionValues);
            if (prof == null) {
                return json(403, JsonKt.jobj(TuplesKt.to("error", "ForbiddenOperationException"), TuplesKt.to("errorMessage", "没有可用的角色")));
            }
        }
        Map<String, Object> pj = JsonKt.jobj(TuplesKt.to("id", prof.getId()), TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, prof.getName()));
        Pair[] pairArr8 = new Pair[4];
        String str2 = JsonKt.str(req, "accessToken");
        if (str2 == null) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            str2 = StringsKt.replace$default(string, "-", "", false, 4, (Object) null);
        }
        pairArr8[0] = TuplesKt.to("accessToken", str2);
        String str3 = JsonKt.str(req, "clientToken");
        if (str3 == null) {
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            str3 = StringsKt.replace$default(string2, "-", "", false, 4, (Object) null);
        }
        pairArr8[1] = TuplesKt.to("clientToken", str3);
        pairArr8[2] = TuplesKt.to("availableProfiles", CollectionsKt.mutableListOf(pj));
        pairArr8[3] = TuplesKt.to("selectedProfile", pj);
        return json(200, JsonKt.jobj(pairArr8));
    }

    private final void serve(Socket c) {
        BufferedInputStream ins;
        OutputStream out;
        String line;
        int i;
        byte[] b;
        Response resp;
        int n;
        Socket socket = c;
        try {
            Socket s = socket;
            try {
                s.setSoTimeout(AiClient.CONNECT_TIMEOUT);
                ins = new BufferedInputStream(s.getInputStream());
                out = s.getOutputStream();
                line = readLine(ins);
            } catch (Exception e) {
            }
            if (line != null) {
                List parts = StringsKt.split$default((CharSequence) line, new char[]{' '}, false, 0, 6, (Object) null);
                if (parts.size() >= 2) {
                    int len = 0;
                    while (true) {
                        String h = readLine(ins);
                        if (h == null) {
                            break;
                        }
                        if (h.length() == 0) {
                            break;
                        } else if (StringsKt.equals(StringsKt.trim((CharSequence) StringsKt.substringBefore$default(h, ':', (String) null, 2, (Object) null)).toString(), "Content-Length", true)) {
                            Integer intOrNull = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) StringsKt.substringAfter$default(h, ':', (String) null, 2, (Object) null)).toString());
                            len = intOrNull != null ? intOrNull.intValue() : 0;
                        }
                    }
                    if (len > 0) {
                        b = new byte[RangesKt.coerceAtMost(len, 1048576)];
                        int r = 0;
                        while (r < b.length && (n = ins.read(b, r, b.length - r)) >= 0) {
                            r += n;
                        }
                        i = 0;
                    } else {
                        i = 0;
                        b = new byte[0];
                    }
                    byte[] body = b;
                    try {
                        String upperCase = ((String) parts.get(i)).toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        resp = handle(upperCase, (String) parts.get(1), body);
                    } catch (Exception e2) {
                        Pair[] pairArr = new Pair[2];
                        pairArr[i] = TuplesKt.to("error", "InternalError");
                        String message = e2.getMessage();
                        if (message == null) {
                            message = e2.toString();
                        }
                        pairArr[1] = TuplesKt.to("errorMessage", message);
                        resp = json(500, JsonKt.jobj(pairArr));
                    }
                    Intrinsics.checkNotNull(out);
                    write(out, resp, StringsKt.equals((String) parts.get(i), "HEAD", true));
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(socket, null);
                    return;
                }
            }
            CloseableKt.closeFinally(socket, null);
        } finally {
        }
    }

    private final String readLine(InputStream ins) throws IOException {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        do {
            int c = ins.read();
            if (c < 0) {
                if (b.size() == 0) {
                    return null;
                }
                return b.toString(CharEncoding.UTF_8);
            }
            if (c == 10) {
                break;
            }
            if (c != 13) {
                b.write(c);
            }
        } while (b.size() <= 16384);
        return b.toString(CharEncoding.UTF_8);
    }

    private final void write(OutputStream out, Response r, boolean head) throws IOException {
        String reason;
        switch (r.getCode()) {
            case 200:
                reason = "OK";
                break;
            case 204:
                reason = "No Content";
                break;
            case 403:
                reason = "Forbidden";
                break;
            case TokenId.FloatConstant /* 404 */:
                reason = "Not Found";
                break;
            default:
                reason = "Error";
                break;
        }
        StringBuilder h = new StringBuilder("HTTP/1.1 " + r.getCode() + StringUtils.SPACE + reason + "\r\n");
        h.append("Content-Type: " + r.getContentType() + "\r\nContent-Length: " + (r.getCode() == 204 ? 0 : r.getBody().length) + "\r\n");
        h.append("X-Authlib-Injector-API-Location: /\r\nConnection: close\r\n\r\n");
        String string = h.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        out.write(bytes);
        if (!head && r.getCode() != 204) {
            out.write(r.getBody());
        }
        out.flush();
    }
}
