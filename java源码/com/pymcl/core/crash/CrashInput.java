package com.pymcl.core.crash;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashAnalyzer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lcom/pymcl/core/crash/CrashInput;", "", "exitCode", "", "output", "", "latestLog", "debugLog", "crashReport", "hsErr", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExitCode", "()I", "getOutput", "()Ljava/lang/String;", "getLatestLog", "getDebugLog", "getCrashReport", "getHsErr", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CrashInput {
    private final String crashReport;
    private final String debugLog;
    private final int exitCode;
    private final String hsErr;
    private final String latestLog;
    private final String output;

    public CrashInput() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CrashInput copy$default(CrashInput crashInput, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = crashInput.exitCode;
        }
        if ((i2 & 2) != 0) {
            str = crashInput.output;
        }
        if ((i2 & 4) != 0) {
            str2 = crashInput.latestLog;
        }
        if ((i2 & 8) != 0) {
            str3 = crashInput.debugLog;
        }
        if ((i2 & 16) != 0) {
            str4 = crashInput.crashReport;
        }
        if ((i2 & 32) != 0) {
            str5 = crashInput.hsErr;
        }
        String str6 = str4;
        String str7 = str5;
        return crashInput.copy(i, str, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getExitCode() {
        return this.exitCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOutput() {
        return this.output;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLatestLog() {
        return this.latestLog;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDebugLog() {
        return this.debugLog;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCrashReport() {
        return this.crashReport;
    }

    /* renamed from: component6, reason: from getter */
    public final String getHsErr() {
        return this.hsErr;
    }

    public final CrashInput copy(int exitCode, String output, String latestLog, String debugLog, String crashReport, String hsErr) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(latestLog, "latestLog");
        Intrinsics.checkNotNullParameter(debugLog, "debugLog");
        Intrinsics.checkNotNullParameter(crashReport, "crashReport");
        Intrinsics.checkNotNullParameter(hsErr, "hsErr");
        return new CrashInput(exitCode, output, latestLog, debugLog, crashReport, hsErr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashInput)) {
            return false;
        }
        CrashInput crashInput = (CrashInput) other;
        return this.exitCode == crashInput.exitCode && Intrinsics.areEqual(this.output, crashInput.output) && Intrinsics.areEqual(this.latestLog, crashInput.latestLog) && Intrinsics.areEqual(this.debugLog, crashInput.debugLog) && Intrinsics.areEqual(this.crashReport, crashInput.crashReport) && Intrinsics.areEqual(this.hsErr, crashInput.hsErr);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.exitCode) * 31) + this.output.hashCode()) * 31) + this.latestLog.hashCode()) * 31) + this.debugLog.hashCode()) * 31) + this.crashReport.hashCode()) * 31) + this.hsErr.hashCode();
    }

    public String toString() {
        return "CrashInput(exitCode=" + this.exitCode + ", output=" + this.output + ", latestLog=" + this.latestLog + ", debugLog=" + this.debugLog + ", crashReport=" + this.crashReport + ", hsErr=" + this.hsErr + ")";
    }

    public CrashInput(int exitCode, String output, String latestLog, String debugLog, String crashReport, String hsErr) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(latestLog, "latestLog");
        Intrinsics.checkNotNullParameter(debugLog, "debugLog");
        Intrinsics.checkNotNullParameter(crashReport, "crashReport");
        Intrinsics.checkNotNullParameter(hsErr, "hsErr");
        this.exitCode = exitCode;
        this.output = output;
        this.latestLog = latestLog;
        this.debugLog = debugLog;
        this.crashReport = crashReport;
        this.hsErr = hsErr;
    }

    public /* synthetic */ CrashInput(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5);
    }

    public final String getCrashReport() {
        return this.crashReport;
    }

    public final String getDebugLog() {
        return this.debugLog;
    }

    public final int getExitCode() {
        return this.exitCode;
    }

    public final String getHsErr() {
        return this.hsErr;
    }

    public final String getLatestLog() {
        return this.latestLog;
    }

    public final String getOutput() {
        return this.output;
    }
}
