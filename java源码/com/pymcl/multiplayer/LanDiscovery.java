package com.pymcl.multiplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.pymcl.multiplayer.LanDiscovery;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: LanDiscovery.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/pymcl/multiplayer/LanDiscovery;", "", "<init>", "()V", "GROUP", "", "PORT", "", "RE", "Lkotlin/text/Regex;", "parse", "Lcom/pymcl/multiplayer/LanWorld;", "payload", "host", "discover", "Lkotlinx/coroutines/flow/Flow;", "context", "Landroid/content/Context;", "normalizeDirect", "input", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LanDiscovery {
    public static final String GROUP = "224.0.2.60";
    public static final int PORT = 4445;
    public static final LanDiscovery INSTANCE = new LanDiscovery();
    private static final Regex RE = new Regex("\\[MOTD](.*?)\\[/MOTD]\\[AD](\\d{1,5})\\[/AD]", RegexOption.DOT_MATCHES_ALL);

    private LanDiscovery() {
    }

    public final LanWorld parse(String payload, String host) {
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(host, "host");
        boolean z = false;
        MatchResult m = Regex.find$default(RE, payload, 0, 2, null);
        if (m == null || (intOrNull = StringsKt.toIntOrNull(m.getGroupValues().get(2))) == null) {
            return null;
        }
        int it = intOrNull.intValue();
        if (1 <= it && it < 65536) {
            z = true;
        }
        if (!z) {
            intOrNull = null;
        }
        if (intOrNull != null) {
            return new LanWorld(m.getGroupValues().get(1), host, intOrNull.intValue());
        }
        return null;
    }

    /* compiled from: LanDiscovery.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/pymcl/multiplayer/LanWorld;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.multiplayer.LanDiscovery$discover$1", f = "LanDiscovery.kt", i = {0, 0, 0, 0, 0}, l = {40}, m = "invokeSuspend", n = {"$this$callbackFlow", "wifi", "lock", "sock", "t"}, nl = {41}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
    /* renamed from: com.pymcl.multiplayer.LanDiscovery$discover$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super LanWorld>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super LanWorld> producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IOException {
            final ProducerScope $this$callbackFlow = (ProducerScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Object systemService = this.$context.getApplicationContext().getSystemService("wifi");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                    WifiManager wifi = (WifiManager) systemService;
                    final WifiManager.MulticastLock $this$invokeSuspend_u24lambda_u240 = wifi.createMulticastLock("pymcl-lan");
                    $this$invokeSuspend_u24lambda_u240.setReferenceCounted(false);
                    $this$invokeSuspend_u24lambda_u240.acquire();
                    final MulticastSocket sock = new MulticastSocket(4445);
                    sock.setSoTimeout(1000);
                    sock.joinGroup(InetAddress.getByName(LanDiscovery.GROUP));
                    final Thread t = new Thread(new Runnable() { // from class: com.pymcl.multiplayer.LanDiscovery$discover$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LanDiscovery.AnonymousClass1.invokeSuspend$lambda$2(sock, $this$callbackFlow);
                        }
                    });
                    t.setDaemon(true);
                    t.start();
                    this.L$0 = SpillingKt.nullOutSpilledVariable($this$callbackFlow);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(wifi);
                    this.L$2 = SpillingKt.nullOutSpilledVariable($this$invokeSuspend_u24lambda_u240);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(sock);
                    this.L$4 = SpillingKt.nullOutSpilledVariable(t);
                    this.label = 1;
                    if (ProduceKt.awaitClose($this$callbackFlow, new Function0() { // from class: com.pymcl.multiplayer.LanDiscovery$discover$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LanDiscovery.AnonymousClass1.invokeSuspend$lambda$4($this$callbackFlow, t, sock, $this$invokeSuspend_u24lambda_u240);
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
        public static final void invokeSuspend$lambda$2(MulticastSocket $sock, ProducerScope $$this$callbackFlow) {
            LanDiscovery lanDiscovery;
            String str;
            String hostAddress;
            byte[] buf = new byte[1024];
            while (!$sock.isClosed()) {
                try {
                    DatagramPacket p = new DatagramPacket(buf, buf.length);
                    $sock.receive(p);
                    lanDiscovery = LanDiscovery.INSTANCE;
                    byte[] data = p.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                    str = new String(data, 0, p.getLength(), Charsets.UTF_8);
                    hostAddress = p.getAddress().getHostAddress();
                } catch (SocketTimeoutException e) {
                } catch (Exception e2) {
                    return;
                }
                if (hostAddress != null) {
                    LanWorld it = lanDiscovery.parse(str, hostAddress);
                    if (it != null) {
                        ChannelResult.m9671boximpl($$this$callbackFlow.mo9656trySendJP2dKIU(it));
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(ProducerScope $$this$callbackFlow, Thread $t, MulticastSocket $sock, WifiManager.MulticastLock $lock) {
            try {
                Result.Companion companion = Result.INSTANCE;
                $sock.close();
                Result.m8116constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            $t.interrupt();
            try {
                Result.Companion companion3 = Result.INSTANCE;
                $lock.release();
                Result.m8116constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th2));
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<LanWorld> discover(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return FlowKt.flowOn(FlowKt.callbackFlow(new AnonymousClass1(context, null)), Dispatchers.getIO());
    }

    public final String normalizeDirect(String input) {
        String host;
        int port;
        Intrinsics.checkNotNullParameter(input, "input");
        String s = StringsKt.removePrefix(StringsKt.trim((CharSequence) input).toString(), (CharSequence) "minecraft://");
        if (s.length() == 0) {
            return null;
        }
        if (StringsKt.startsWith$default(s, "[", false, 2, (Object) null)) {
            int e = StringsKt.indexOf$default((CharSequence) s, ']', 0, false, 6, (Object) null);
            if (e < 0) {
                return null;
            }
            host = s.substring(1, e);
            Intrinsics.checkNotNullExpressionValue(host, "substring(...)");
            String strSubstring = s.substring(e + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strRemovePrefix = StringsKt.removePrefix(strSubstring, (CharSequence) ":");
            if (strRemovePrefix.length() == 0) {
                strRemovePrefix = "25565";
            }
            Integer intOrNull = StringsKt.toIntOrNull(strRemovePrefix);
            if (intOrNull == null) {
                return null;
            }
            port = intOrNull.intValue();
        } else {
            String $this$count$iv = s;
            int count$iv = 0;
            for (int i = 0; i < $this$count$iv.length(); i++) {
                char element$iv = $this$count$iv.charAt(i);
                char it = element$iv == ':' ? (char) 1 : (char) 0;
                if (it != 0) {
                    count$iv++;
                }
            }
            if (count$iv == 1) {
                host = StringsKt.substringBefore$default(s, ':', (String) null, 2, (Object) null);
                String host2 = StringsKt.substringAfter$default(s, ':', (String) null, 2, (Object) null);
                Integer intOrNull2 = StringsKt.toIntOrNull(host2);
                if (intOrNull2 == null) {
                    return null;
                }
                port = intOrNull2.intValue();
            } else {
                host = s;
                port = 25565;
            }
        }
        if (!(1 <= port && port < 65536) || StringsKt.isBlank(host) || StringsKt.equals(host, "localhost", true) || StringsKt.startsWith$default(host, "127.", false, 2, (Object) null) || Intrinsics.areEqual(host, "::1")) {
            return null;
        }
        return (StringsKt.contains$default((CharSequence) host, ':', false, 2, (Object) null) ? new StringBuilder().append("[").append(host).append("]:") : new StringBuilder().append(host).append(":")).append(port).toString();
    }
}
