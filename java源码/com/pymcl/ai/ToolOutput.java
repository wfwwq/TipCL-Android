package com.pymcl.ai;

import androidx.core.app.NotificationCompat;
import com.pymcl.core.util.Json;
import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.settings.SettingsProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiToolHost.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/pymcl/ai/ToolOutput;", "", SettingsProtocol.EXTRA_OK, "", TerracottaVpnService.EXTRA_TEXT, "", "network", "<init>", "(ZLjava/lang/String;Z)V", "getOk", "()Z", "getText", "()Ljava/lang/String;", "getNetwork", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ToolOutput {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean network;
    private final boolean ok;
    private final String text;

    public static /* synthetic */ ToolOutput copy$default(ToolOutput toolOutput, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = toolOutput.ok;
        }
        if ((i & 2) != 0) {
            str = toolOutput.text;
        }
        if ((i & 4) != 0) {
            z2 = toolOutput.network;
        }
        return toolOutput.copy(z, str, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getOk() {
        return this.ok;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNetwork() {
        return this.network;
    }

    public final ToolOutput copy(boolean ok, String text, boolean network) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new ToolOutput(ok, text, network);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolOutput)) {
            return false;
        }
        ToolOutput toolOutput = (ToolOutput) other;
        return this.ok == toolOutput.ok && Intrinsics.areEqual(this.text, toolOutput.text) && this.network == toolOutput.network;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.ok) * 31) + this.text.hashCode()) * 31) + Boolean.hashCode(this.network);
    }

    public String toString() {
        return "ToolOutput(ok=" + this.ok + ", text=" + this.text + ", network=" + this.network + ")";
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\r"}, d2 = {"Lcom/pymcl/ai/ToolOutput$Companion;", "", "<init>", "()V", SettingsProtocol.EXTRA_OK, "Lcom/pymcl/ai/ToolOutput;", TerracottaVpnService.EXTRA_TEXT, "", "network", "", NotificationCompat.CATEGORY_ERROR, "json", SettingsProtocol.EXTRA_VALUE, "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ToolOutput ok$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.ok(str, z);
        }

        public final ToolOutput ok(String text, boolean network) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ToolOutput(true, text, network);
        }

        public final ToolOutput err(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ToolOutput(false, text, false, 4, null);
        }

        public static /* synthetic */ ToolOutput json$default(Companion companion, Object obj, boolean z, int i, Object obj2) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.json(obj, z);
        }

        public final ToolOutput json(Object v, boolean network) {
            return new ToolOutput(true, Json.stringify$default(Json.INSTANCE, v, false, 2, null), network);
        }
    }

    public ToolOutput(boolean ok, String text, boolean network) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.ok = ok;
        this.text = text;
        this.network = network;
    }

    public /* synthetic */ ToolOutput(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? false : z2);
    }

    public final boolean getNetwork() {
        return this.network;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final String getText() {
        return this.text;
    }
}
