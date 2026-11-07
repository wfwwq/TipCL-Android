package com.pymcl.core.auth;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Auth.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/pymcl/core/auth/DeviceCode;", "", "deviceCode", "", "userCode", "verificationUri", "expiresIn", "", "interval", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getDeviceCode", "()Ljava/lang/String;", "getUserCode", "getVerificationUri", "getExpiresIn", "()I", "getInterval", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DeviceCode {
    private final String deviceCode;
    private final int expiresIn;
    private final int interval;
    private final String userCode;
    private final String verificationUri;

    public static /* synthetic */ DeviceCode copy$default(DeviceCode deviceCode, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = deviceCode.deviceCode;
        }
        if ((i3 & 2) != 0) {
            str2 = deviceCode.userCode;
        }
        if ((i3 & 4) != 0) {
            str3 = deviceCode.verificationUri;
        }
        if ((i3 & 8) != 0) {
            i = deviceCode.expiresIn;
        }
        if ((i3 & 16) != 0) {
            i2 = deviceCode.interval;
        }
        int i4 = i2;
        String str4 = str3;
        return deviceCode.copy(str, str2, str4, i, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeviceCode() {
        return this.deviceCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserCode() {
        return this.userCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVerificationUri() {
        return this.verificationUri;
    }

    /* renamed from: component4, reason: from getter */
    public final int getExpiresIn() {
        return this.expiresIn;
    }

    /* renamed from: component5, reason: from getter */
    public final int getInterval() {
        return this.interval;
    }

    public final DeviceCode copy(String deviceCode, String userCode, String verificationUri, int expiresIn, int interval) {
        Intrinsics.checkNotNullParameter(deviceCode, "deviceCode");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(verificationUri, "verificationUri");
        return new DeviceCode(deviceCode, userCode, verificationUri, expiresIn, interval);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceCode)) {
            return false;
        }
        DeviceCode deviceCode = (DeviceCode) other;
        return Intrinsics.areEqual(this.deviceCode, deviceCode.deviceCode) && Intrinsics.areEqual(this.userCode, deviceCode.userCode) && Intrinsics.areEqual(this.verificationUri, deviceCode.verificationUri) && this.expiresIn == deviceCode.expiresIn && this.interval == deviceCode.interval;
    }

    public int hashCode() {
        return (((((((this.deviceCode.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.verificationUri.hashCode()) * 31) + Integer.hashCode(this.expiresIn)) * 31) + Integer.hashCode(this.interval);
    }

    public String toString() {
        return "DeviceCode(deviceCode=" + this.deviceCode + ", userCode=" + this.userCode + ", verificationUri=" + this.verificationUri + ", expiresIn=" + this.expiresIn + ", interval=" + this.interval + ")";
    }

    public DeviceCode(String deviceCode, String userCode, String verificationUri, int expiresIn, int interval) {
        Intrinsics.checkNotNullParameter(deviceCode, "deviceCode");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(verificationUri, "verificationUri");
        this.deviceCode = deviceCode;
        this.userCode = userCode;
        this.verificationUri = verificationUri;
        this.expiresIn = expiresIn;
        this.interval = interval;
    }

    public final String getDeviceCode() {
        return this.deviceCode;
    }

    public final int getExpiresIn() {
        return this.expiresIn;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final String getUserCode() {
        return this.userCode;
    }

    public final String getVerificationUri() {
        return this.verificationUri;
    }
}
