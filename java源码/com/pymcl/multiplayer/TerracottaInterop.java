package com.pymcl.multiplayer;

import com.pymcl.ai.AiSettings;
import com.pymcl.ai.McpClient;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: Interop.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nJ(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/pymcl/multiplayer/TerracottaInterop;", "", "<init>", "()V", "PC_TERRACOTTA_VERSION", "", "ANDROID_TERRACOTTA_BUILD", "NODES_URL", "nativeVerifier", "Lkotlin/Function1;", "", "getNativeVerifier", "()Lkotlin/jvm/functions/Function1;", "setNativeVerifier", "(Lkotlin/jvm/functions/Function1;)V", "classify", "Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;", TerracottaVpnService.EXTRA_TEXT, "parseNodes", "", "json", "mainland", "mergeNodes", "configured", "remote", "fetchNodes", "timeoutMs", "", "localIps", "CodeKind", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TerracottaInterop {
    public static final String ANDROID_TERRACOTTA_BUILD = "Terracotta 050b551, EasyTier v2.5.0-terracotta.2";
    public static final TerracottaInterop INSTANCE = new TerracottaInterop();
    public static final String NODES_URL = "https://terracotta.glavo.site/nodes";
    public static final String PC_TERRACOTTA_VERSION = "0.4.2";
    private static volatile Function1<? super String, Boolean> nativeVerifier;

    /* compiled from: Interop.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;", "", "<init>", "(Ljava/lang/String;I)V", "TERRACOTTA", "LEGACY_PCL", "INVALID", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum CodeKind {
        TERRACOTTA,
        LEGACY_PCL,
        INVALID;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<CodeKind> getEntries() {
            return $ENTRIES;
        }
    }

    private TerracottaInterop() {
    }

    public final Function1<String, Boolean> getNativeVerifier() {
        return nativeVerifier;
    }

    public final void setNativeVerifier(Function1<? super String, Boolean> function1) {
        nativeVerifier = function1;
    }

    public final CodeKind classify(String text) {
        Object objM8116constructorimpl;
        if (RoomCode.INSTANCE.parse(text) != null) {
            return CodeKind.TERRACOTTA;
        }
        String t0 = StringsKt.trim((CharSequence) (text == null ? "" : text)).toString();
        if (t0.length() > 0) {
            try {
                Result.Companion companion = Result.INSTANCE;
                TerracottaInterop terracottaInterop = this;
                Function1<? super String, Boolean> function1 = nativeVerifier;
                objM8116constructorimpl = Result.m8116constructorimpl(function1 != null ? function1.invoke(t0) : null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (Intrinsics.areEqual(Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl, (Object) true)) {
                return CodeKind.TERRACOTTA;
            }
        }
        String t = StringsKt.trim((CharSequence) (text != null ? text : "")).toString();
        return new Regex("^[0-9A-Za-z\\-]{29}$").matches(t) ? CodeKind.LEGACY_PCL : CodeKind.INVALID;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> parseNodes(java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.multiplayer.TerracottaInterop.parseNodes(java.lang.String, boolean):java.util.List");
    }

    public final List<String> mergeNodes(List<String> configured, List<String> remote) {
        Intrinsics.checkNotNullParameter(configured, "configured");
        Intrinsics.checkNotNullParameter(remote, "remote");
        Iterable $this$map$iv = CollectionsKt.plus((Collection) configured, (Iterable) remote);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            destination$iv$iv.add(StringsKt.trim((CharSequence) it).toString());
        }
        Iterable $this$filter$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it2 = (String) element$iv$iv;
            if (it2.length() > 0) {
                destination$iv$iv2.add(element$iv$iv);
            }
        }
        return CollectionsKt.distinct((List) destination$iv$iv2);
    }

    public static /* synthetic */ List fetchNodes$default(TerracottaInterop terracottaInterop, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = AiSettings.MIN_CONTEXT;
        }
        return terracottaInterop.fetchNodes(z, i);
    }

    public final List<String> fetchNodes(boolean mainland, int timeoutMs) {
        Object objM8116constructorimpl;
        List<String> nodes;
        try {
            Result.Companion companion = Result.INSTANCE;
            TerracottaInterop $this$fetchNodes_u24lambda_u240 = this;
            URLConnection uRLConnectionOpenConnection = new URL(NODES_URL).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection c = (HttpURLConnection) uRLConnectionOpenConnection;
            c.setConnectTimeout(timeoutMs);
            c.setReadTimeout(timeoutMs);
            c.setRequestProperty("User-Agent", McpClient.CLIENT_NAME);
            try {
                if (c.getResponseCode() != 200) {
                    nodes = CollectionsKt.emptyList();
                } else {
                    InputStream inputStream = c.getInputStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                    Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                    nodes = $this$fetchNodes_u24lambda_u240.parseNodes(TextStreamsKt.readText(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192)), mainland);
                }
                c.disconnect();
                objM8116constructorimpl = Result.m8116constructorimpl(nodes);
            } catch (Throwable th) {
                c.disconnect();
                throw th;
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th2));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = listEmptyList;
        }
        return (List) objM8116constructorimpl;
    }

    public final List<String> localIps() {
        Object objM8116constructorimpl;
        TerracottaInterop $this$localIps_u24lambda_u240;
        try {
            Result.Companion companion = Result.INSTANCE;
            TerracottaInterop $this$localIps_u24lambda_u2402 = this;
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "getNetworkInterfaces(...)");
            Iterable list = Collections.list(networkInterfaces);
            Intrinsics.checkNotNullExpressionValue(list, "list(...)");
            Iterable $this$filter$iv = (List) list;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                NetworkInterface it = (NetworkInterface) element$iv$iv;
                boolean z = false;
                if (!it.isUp() || it.isLoopback()) {
                    $this$localIps_u24lambda_u240 = $this$localIps_u24lambda_u2402;
                } else {
                    String name = it.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    $this$localIps_u24lambda_u240 = $this$localIps_u24lambda_u2402;
                    if (!StringsKt.startsWith$default(name, "tun", false, 2, (Object) null)) {
                        z = true;
                    }
                }
                if (z) {
                    destination$iv$iv.add(element$iv$iv);
                }
                $this$localIps_u24lambda_u2402 = $this$localIps_u24lambda_u240;
            }
            Iterable<NetworkInterface> $this$flatMap$iv = (List) destination$iv$iv;
            Collection destination$iv$iv2 = new ArrayList();
            for (NetworkInterface it2 : $this$flatMap$iv) {
                Enumeration<InetAddress> inetAddresses = it2.getInetAddresses();
                Intrinsics.checkNotNullExpressionValue(inetAddresses, "getInetAddresses(...)");
                Iterable list2 = Collections.list(inetAddresses);
                Intrinsics.checkNotNullExpressionValue(list2, "list(...)");
                Iterable list$iv$iv = (List) list2;
                CollectionsKt.addAll(destination$iv$iv2, list$iv$iv);
            }
            Iterable $this$filterIsInstance$iv = (List) destination$iv$iv2;
            Collection destination$iv$iv3 = new ArrayList();
            for (Object element$iv$iv2 : $this$filterIsInstance$iv) {
                if (element$iv$iv2 instanceof Inet4Address) {
                    destination$iv$iv3.add(element$iv$iv2);
                }
            }
            Iterable $this$mapNotNull$iv = (List) destination$iv$iv3;
            Collection destination$iv$iv4 = new ArrayList();
            for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                Inet4Address it3 = (Inet4Address) element$iv$iv$iv;
                String hostAddress = it3.getHostAddress();
                if (hostAddress != null) {
                    destination$iv$iv4.add(hostAddress);
                }
            }
            objM8116constructorimpl = Result.m8116constructorimpl((List) destination$iv$iv4);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = listEmptyList;
        }
        return (List) objM8116constructorimpl;
    }
}
