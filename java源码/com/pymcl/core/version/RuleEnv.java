package com.pymcl.core.version;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.lwjgl.LWJGLUtil;

/* compiled from: Versions.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/pymcl/core/version/RuleEnv;", "", "osName", "", "arch", "osVersion", "features", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getOsName", "()Ljava/lang/String;", "getArch", "getOsVersion", "getFeatures", "()Ljava/util/Map;", "is64", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RuleEnv {
    private final String arch;
    private final Map<String, Boolean> features;
    private final String osName;
    private final String osVersion;

    public RuleEnv() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RuleEnv copy$default(RuleEnv ruleEnv, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ruleEnv.osName;
        }
        if ((i & 2) != 0) {
            str2 = ruleEnv.arch;
        }
        if ((i & 4) != 0) {
            str3 = ruleEnv.osVersion;
        }
        if ((i & 8) != 0) {
            map = ruleEnv.features;
        }
        return ruleEnv.copy(str, str2, str3, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOsName() {
        return this.osName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getArch() {
        return this.arch;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    public final Map<String, Boolean> component4() {
        return this.features;
    }

    public final RuleEnv copy(String osName, String arch, String osVersion, Map<String, Boolean> features) {
        Intrinsics.checkNotNullParameter(osName, "osName");
        Intrinsics.checkNotNullParameter(arch, "arch");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(features, "features");
        return new RuleEnv(osName, arch, osVersion, features);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RuleEnv)) {
            return false;
        }
        RuleEnv ruleEnv = (RuleEnv) other;
        return Intrinsics.areEqual(this.osName, ruleEnv.osName) && Intrinsics.areEqual(this.arch, ruleEnv.arch) && Intrinsics.areEqual(this.osVersion, ruleEnv.osVersion) && Intrinsics.areEqual(this.features, ruleEnv.features);
    }

    public int hashCode() {
        return (((((this.osName.hashCode() * 31) + this.arch.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.features.hashCode();
    }

    public String toString() {
        return "RuleEnv(osName=" + this.osName + ", arch=" + this.arch + ", osVersion=" + this.osVersion + ", features=" + this.features + ")";
    }

    public RuleEnv(String osName, String arch, String osVersion, Map<String, Boolean> features) {
        Intrinsics.checkNotNullParameter(osName, "osName");
        Intrinsics.checkNotNullParameter(arch, "arch");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(features, "features");
        this.osName = osName;
        this.arch = arch;
        this.osVersion = osVersion;
        this.features = features;
    }

    public /* synthetic */ RuleEnv(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LWJGLUtil.PLATFORM_LINUX_NAME : str, (i & 2) != 0 ? "arm64" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? MapsKt.emptyMap() : map);
    }

    public final String getArch() {
        return this.arch;
    }

    public final Map<String, Boolean> getFeatures() {
        return this.features;
    }

    public final String getOsName() {
        return this.osName;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final boolean is64() {
        return StringsKt.contains$default((CharSequence) this.arch, (CharSequence) "64", false, 2, (Object) null);
    }
}
