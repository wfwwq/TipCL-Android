package com.pymcl.android.data;

import com.pymcl.core.crash.CrashAnalyzer;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: FeedbackSubmit.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ6\u0010\u0010\u001a\u00020\u00052\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/pymcl/android/data/FeedbackSubmit;", "", "<init>", "()V", "DEFAULT_URL", "", "prepare", "Lcom/pymcl/android/data/FeedbackSubmit$Prepared;", "input", "Lcom/pymcl/android/data/FeedbackSubmit$Input;", "submit", "Lcom/pymcl/android/data/FeedbackSubmit$Outcome;", "http", "Lcom/pymcl/core/net/Http;", "r", "Lcom/pymcl/android/data/FeedbackSubmit$Prepared$Ready;", "deviceId", SettingsProtocol.GET, "Lkotlin/Function1;", SettingsProtocol.PUT, "Lkotlin/Function2;", "", "Input", "Prepared", "Outcome", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class FeedbackSubmit {
    public static final int $stable = 0;
    public static final String DEFAULT_URL = "http://114.66.28.184:53611/api/v1/feedback";
    public static final FeedbackSubmit INSTANCE = new FeedbackSubmit();

    private FeedbackSubmit() {
    }

    /* compiled from: FeedbackSubmit.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b \n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fHÆ\u0003Ju\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fHÆ\u0001J\u0014\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020\bHÖ\u0081\u0004J\n\u0010.\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fÊ\u0001\f\b0\u0012\b\b1\u0012\u0004\b\u0003\u0010\u0000¨\u0006/"}, d2 = {"Lcom/pymcl/android/data/FeedbackSubmit$Input;", "", "consented", "", "urlOverride", "", "deviceId", "kind", "", "title", "body", "contact", "appVersion", "sysinfo", "attachments", "", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getConsented", "()Z", "getUrlOverride", "()Ljava/lang/String;", "getDeviceId", "getKind", "()I", "getTitle", "getBody", "getContact", "getAppVersion", "getSysinfo", "getAttachments", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 8;
        private final String appVersion;
        private final List<String> attachments;
        private final String body;
        private final boolean consented;
        private final String contact;
        private final String deviceId;
        private final int kind;
        private final String sysinfo;
        private final String title;
        private final String urlOverride;

        public static /* synthetic */ Input copy$default(Input input, boolean z, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = input.consented;
            }
            if ((i2 & 2) != 0) {
                str = input.urlOverride;
            }
            if ((i2 & 4) != 0) {
                str2 = input.deviceId;
            }
            if ((i2 & 8) != 0) {
                i = input.kind;
            }
            if ((i2 & 16) != 0) {
                str3 = input.title;
            }
            if ((i2 & 32) != 0) {
                str4 = input.body;
            }
            if ((i2 & 64) != 0) {
                str5 = input.contact;
            }
            if ((i2 & 128) != 0) {
                str6 = input.appVersion;
            }
            if ((i2 & 256) != 0) {
                str7 = input.sysinfo;
            }
            if ((i2 & 512) != 0) {
                list = input.attachments;
            }
            String str8 = str7;
            List list2 = list;
            String str9 = str5;
            String str10 = str6;
            String str11 = str3;
            String str12 = str4;
            return input.copy(z, str, str2, i, str11, str12, str9, str10, str8, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getConsented() {
            return this.consented;
        }

        public final List<String> component10() {
            return this.attachments;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUrlOverride() {
            return this.urlOverride;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        /* renamed from: component4, reason: from getter */
        public final int getKind() {
            return this.kind;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component7, reason: from getter */
        public final String getContact() {
            return this.contact;
        }

        /* renamed from: component8, reason: from getter */
        public final String getAppVersion() {
            return this.appVersion;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSysinfo() {
            return this.sysinfo;
        }

        public final Input copy(boolean consented, String urlOverride, String deviceId, int kind, String title, String body, String contact, String appVersion, String sysinfo, List<String> attachments) {
            Intrinsics.checkNotNullParameter(urlOverride, "urlOverride");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(contact, "contact");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(attachments, "attachments");
            return new Input(consented, urlOverride, deviceId, kind, title, body, contact, appVersion, sysinfo, attachments);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return this.consented == input.consented && Intrinsics.areEqual(this.urlOverride, input.urlOverride) && Intrinsics.areEqual(this.deviceId, input.deviceId) && this.kind == input.kind && Intrinsics.areEqual(this.title, input.title) && Intrinsics.areEqual(this.body, input.body) && Intrinsics.areEqual(this.contact, input.contact) && Intrinsics.areEqual(this.appVersion, input.appVersion) && Intrinsics.areEqual(this.sysinfo, input.sysinfo) && Intrinsics.areEqual(this.attachments, input.attachments);
        }

        public int hashCode() {
            return (((((((((((((((((Boolean.hashCode(this.consented) * 31) + this.urlOverride.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + Integer.hashCode(this.kind)) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31) + this.contact.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + (this.sysinfo == null ? 0 : this.sysinfo.hashCode())) * 31) + this.attachments.hashCode();
        }

        public String toString() {
            return "Input(consented=" + this.consented + ", urlOverride=" + this.urlOverride + ", deviceId=" + this.deviceId + ", kind=" + this.kind + ", title=" + this.title + ", body=" + this.body + ", contact=" + this.contact + ", appVersion=" + this.appVersion + ", sysinfo=" + this.sysinfo + ", attachments=" + this.attachments + ")";
        }

        public Input(boolean consented, String urlOverride, String deviceId, int kind, String title, String body, String contact, String appVersion, String sysinfo, List<String> attachments) {
            Intrinsics.checkNotNullParameter(urlOverride, "urlOverride");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(contact, "contact");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(attachments, "attachments");
            this.consented = consented;
            this.urlOverride = urlOverride;
            this.deviceId = deviceId;
            this.kind = kind;
            this.title = title;
            this.body = body;
            this.contact = contact;
            this.appVersion = appVersion;
            this.sysinfo = sysinfo;
            this.attachments = attachments;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Input(boolean z, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            List listEmptyList;
            if ((i2 & 512) == 0) {
                listEmptyList = list;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            this(z, str, str2, i, str3, str4, str5, str6, str7, listEmptyList);
        }

        public final boolean getConsented() {
            return this.consented;
        }

        public final String getUrlOverride() {
            return this.urlOverride;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final int getKind() {
            return this.kind;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getContact() {
            return this.contact;
        }

        public final String getAppVersion() {
            return this.appVersion;
        }

        public final String getSysinfo() {
            return this.sysinfo;
        }

        public final List<String> getAttachments() {
            return this.attachments;
        }
    }

    /* compiled from: FeedbackSubmit.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/pymcl/android/data/FeedbackSubmit$Prepared;", "", "NeedConsent", "Ready", "Lcom/pymcl/android/data/FeedbackSubmit$Prepared$NeedConsent;", "Lcom/pymcl/android/data/FeedbackSubmit$Prepared$Ready;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Prepared {

        /* compiled from: FeedbackSubmit.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/pymcl/android/data/FeedbackSubmit$Prepared$NeedConsent;", "Lcom/pymcl/android/data/FeedbackSubmit$Prepared;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class NeedConsent implements Prepared {
            public static final int $stable = 0;
            public static final NeedConsent INSTANCE = new NeedConsent();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NeedConsent)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -954519571;
            }

            public String toString() {
                return "NeedConsent";
            }

            private NeedConsent() {
            }
        }

        /* compiled from: FeedbackSubmit.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0019"}, d2 = {"Lcom/pymcl/android/data/FeedbackSubmit$Prepared$Ready;", "Lcom/pymcl/android/data/FeedbackSubmit$Prepared;", "url", "", "json", "headers", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getUrl", "()Ljava/lang/String;", "getJson", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Ready implements Prepared {
            public static final int $stable = 8;
            private final Map<String, String> headers;
            private final String json;
            private final String url;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Ready copy$default(Ready ready, String str, String str2, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = ready.url;
                }
                if ((i & 2) != 0) {
                    str2 = ready.json;
                }
                if ((i & 4) != 0) {
                    map = ready.headers;
                }
                return ready.copy(str, str2, map);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: component2, reason: from getter */
            public final String getJson() {
                return this.json;
            }

            public final Map<String, String> component3() {
                return this.headers;
            }

            public final Ready copy(String url, String json, Map<String, String> headers) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(headers, "headers");
                return new Ready(url, json, headers);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Ready)) {
                    return false;
                }
                Ready ready = (Ready) other;
                return Intrinsics.areEqual(this.url, ready.url) && Intrinsics.areEqual(this.json, ready.json) && Intrinsics.areEqual(this.headers, ready.headers);
            }

            public int hashCode() {
                return (((this.url.hashCode() * 31) + this.json.hashCode()) * 31) + this.headers.hashCode();
            }

            public String toString() {
                return "Ready(url=" + this.url + ", json=" + this.json + ", headers=" + this.headers + ")";
            }

            public Ready(String url, String json, Map<String, String> headers) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(headers, "headers");
                this.url = url;
                this.json = json;
                this.headers = headers;
            }

            public final Map<String, String> getHeaders() {
                return this.headers;
            }

            public final String getJson() {
                return this.json;
            }

            public final String getUrl() {
                return this.url;
            }
        }
    }

    public final Prepared prepare(Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (!input.getConsented()) {
            return Prepared.NeedConsent.INSTANCE;
        }
        String string = StringsKt.trim((CharSequence) input.getUrlOverride()).toString();
        if (string.length() == 0) {
            string = DEFAULT_URL;
        }
        String url = string;
        int k = RangesKt.coerceIn(input.getKind(), 0, CollectionsKt.getLastIndex(FeedbackLogic.INSTANCE.getCATEGORY()));
        String ref = !input.getAttachments().isEmpty() ? "\n\n附件（未上传）：" + CollectionsKt.joinToString$default(input.getAttachments(), "、", null, null, 0, null, null, 62, null) : "";
        String body = StringsKt.take(StringsKt.trim((CharSequence) input.getBody()).toString(), RangesKt.coerceAtLeast(16000 - ref.length(), 0)) + ref;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = TuplesKt.to("device_id", input.getDeviceId());
        pairArr[1] = TuplesKt.to("category", FeedbackLogic.INSTANCE.getCATEGORY().get(k));
        pairArr[2] = TuplesKt.to("title", StringsKt.take(StringsKt.trim((CharSequence) input.getTitle()).toString(), 120));
        pairArr[3] = TuplesKt.to("body", StringsKt.take(body, FeedbackLogic.MAX_BODY));
        pairArr[4] = TuplesKt.to("contact", StringsKt.take(StringsKt.trim((CharSequence) input.getContact()).toString(), 120));
        pairArr[5] = TuplesKt.to("app_version", input.getAppVersion());
        pairArr[6] = TuplesKt.to("crash", null);
        String sysinfo = input.getSysinfo();
        pairArr[7] = TuplesKt.to("sysinfo", sysinfo != null ? CollectionsKt.joinToString$default(StringsKt.lines(sysinfo), StringUtils.LF, null, null, 0, null, new Function1() { // from class: com.pymcl.android.data.FeedbackSubmit$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeedbackSubmit.prepare$lambda$1$0((String) obj);
            }
        }, 30, null) : null);
        Map payload = JsonKt.jobj(pairArr);
        return new Prepared.Ready(url, Json.stringify$default(Json.INSTANCE, payload, false, 2, null), MapsKt.mapOf(TuplesKt.to("X-PyMCL-Client", "PyMCL/" + input.getAppVersion())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence prepare$lambda$1$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CrashAnalyzer.INSTANCE.filterSecrets(it);
    }

    /* compiled from: FeedbackSubmit.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/android/data/FeedbackSubmit$Outcome;", "", "Submitted", "ServerError", "HttpError", "Lcom/pymcl/android/data/FeedbackSubmit$Outcome$HttpError;", "Lcom/pymcl/android/data/FeedbackSubmit$Outcome$ServerError;", "Lcom/pymcl/android/data/FeedbackSubmit$Outcome$Submitted;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Outcome {

        /* compiled from: FeedbackSubmit.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0011"}, d2 = {"Lcom/pymcl/android/data/FeedbackSubmit$Outcome$Submitted;", "Lcom/pymcl/android/data/FeedbackSubmit$Outcome;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Submitted implements Outcome {
            public static final int $stable = 0;
            private final String id;

            public static /* synthetic */ Submitted copy$default(Submitted submitted, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = submitted.id;
                }
                return submitted.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final Submitted copy(String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new Submitted(id);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Submitted) && Intrinsics.areEqual(this.id, ((Submitted) other).id);
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "Submitted(id=" + this.id + ")";
            }

            public Submitted(String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                this.id = id;
            }

            public final String getId() {
                return this.id;
            }
        }

        /* compiled from: FeedbackSubmit.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0011"}, d2 = {"Lcom/pymcl/android/data/FeedbackSubmit$Outcome$ServerError;", "Lcom/pymcl/android/data/FeedbackSubmit$Outcome;", "error", "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class ServerError implements Outcome {
            public static final int $stable = 0;
            private final String error;

            public static /* synthetic */ ServerError copy$default(ServerError serverError, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = serverError.error;
                }
                return serverError.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getError() {
                return this.error;
            }

            public final ServerError copy(String error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new ServerError(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ServerError) && Intrinsics.areEqual(this.error, ((ServerError) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "ServerError(error=" + this.error + ")";
            }

            public ServerError(String error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final String getError() {
                return this.error;
            }
        }

        /* compiled from: FeedbackSubmit.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/pymcl/android/data/FeedbackSubmit$Outcome$HttpError;", "Lcom/pymcl/android/data/FeedbackSubmit$Outcome;", "code", "", "body", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getBody", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class HttpError implements Outcome {
            public static final int $stable = 0;
            private final String body;
            private final int code;

            public static /* synthetic */ HttpError copy$default(HttpError httpError, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = httpError.code;
                }
                if ((i2 & 2) != 0) {
                    str = httpError.body;
                }
                return httpError.copy(i, str);
            }

            /* renamed from: component1, reason: from getter */
            public final int getCode() {
                return this.code;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBody() {
                return this.body;
            }

            public final HttpError copy(int code, String body) {
                Intrinsics.checkNotNullParameter(body, "body");
                return new HttpError(code, body);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HttpError)) {
                    return false;
                }
                HttpError httpError = (HttpError) other;
                return this.code == httpError.code && Intrinsics.areEqual(this.body, httpError.body);
            }

            public int hashCode() {
                return (Integer.hashCode(this.code) * 31) + this.body.hashCode();
            }

            public String toString() {
                return "HttpError(code=" + this.code + ", body=" + this.body + ")";
            }

            public HttpError(int code, String body) {
                Intrinsics.checkNotNullParameter(body, "body");
                this.code = code;
                this.body = body;
            }

            public final String getBody() {
                return this.body;
            }

            public final int getCode() {
                return this.code;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.android.data.FeedbackSubmit.Outcome submit(com.pymcl.core.net.Http r8, com.pymcl.android.data.FeedbackSubmit.Prepared.Ready r9) {
        /*
            r7 = this;
            java.lang.String r0 = "http"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "r"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = r9.getUrl()
            java.lang.String r1 = r9.getJson()
            java.util.Map r2 = r9.getHeaders()
            com.pymcl.core.net.HttpResponse r0 = r8.postJson(r0, r1, r2)
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2f
            r1 = r7
            com.pymcl.android.data.FeedbackSubmit r1 = (com.pymcl.android.data.FeedbackSubmit) r1     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            com.pymcl.core.util.Json r3 = com.pymcl.core.util.Json.INSTANCE     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r0.getText()     // Catch: java.lang.Throwable -> L2f
            java.util.Map r3 = r3.obj(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = kotlin.Result.m8116constructorimpl(r3)     // Catch: java.lang.Throwable -> L2f
            goto L3a
        L2f:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m8116constructorimpl(r1)
        L3a:
            boolean r2 = kotlin.Result.m8122isFailureimpl(r1)
            r3 = 0
            if (r2 == 0) goto L42
            r1 = r3
        L42:
            java.util.Map r1 = (java.util.Map) r1
            boolean r2 = r0.getOk()
            if (r2 == 0) goto L85
            r2 = 1
            r4 = 0
            if (r1 == 0) goto L5e
            java.lang.String r5 = "ok"
            java.lang.Boolean r5 = com.pymcl.core.util.JsonKt.bool(r1, r5)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            goto L5f
        L5e:
            r5 = r4
        L5f:
            if (r5 == 0) goto L85
            java.lang.String r3 = "id"
            java.lang.String r3 = com.pymcl.core.util.JsonKt.str(r1, r3)
            if (r3 != 0) goto L6b
            java.lang.String r3 = ""
        L6b:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r5 = r3.length()
            if (r5 != 0) goto L74
            goto L75
        L74:
            r2 = r4
        L75:
            if (r2 == 0) goto L7b
            r2 = 0
            java.lang.String r3 = "fb"
        L7b:
            java.lang.String r3 = (java.lang.String) r3
            com.pymcl.android.data.FeedbackSubmit$Outcome$Submitted r2 = new com.pymcl.android.data.FeedbackSubmit$Outcome$Submitted
            r2.<init>(r3)
            com.pymcl.android.data.FeedbackSubmit$Outcome r2 = (com.pymcl.android.data.FeedbackSubmit.Outcome) r2
            goto Lca
        L85:
            boolean r2 = r0.getOk()
            java.lang.String r4 = "error"
            if (r2 == 0) goto Lad
            if (r1 == 0) goto La3
            java.lang.String r2 = com.pymcl.core.util.JsonKt.str(r1, r4)
            if (r2 == 0) goto La3
            r4 = r2
            r5 = 0
            r6 = r4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = kotlin.text.StringsKt.isBlank(r6)
            if (r6 != 0) goto La1
            r3 = r2
        La1:
            if (r3 != 0) goto La5
        La3:
            java.lang.String r3 = "服务器拒绝了这次反馈"
        La5:
            com.pymcl.android.data.FeedbackSubmit$Outcome$ServerError r2 = new com.pymcl.android.data.FeedbackSubmit$Outcome$ServerError
            r2.<init>(r3)
            com.pymcl.android.data.FeedbackSubmit$Outcome r2 = (com.pymcl.android.data.FeedbackSubmit.Outcome) r2
            goto Lca
        Lad:
            com.pymcl.android.data.FeedbackSubmit$Outcome$HttpError r2 = new com.pymcl.android.data.FeedbackSubmit$Outcome$HttpError
            int r3 = r0.getCode()
            if (r1 == 0) goto Lbb
            java.lang.String r4 = com.pymcl.core.util.JsonKt.str(r1, r4)
            if (r4 != 0) goto Lc5
        Lbb:
            java.lang.String r4 = r0.getText()
            r5 = 200(0xc8, float:2.8E-43)
            java.lang.String r4 = kotlin.text.StringsKt.take(r4, r5)
        Lc5:
            r2.<init>(r3, r4)
            com.pymcl.android.data.FeedbackSubmit$Outcome r2 = (com.pymcl.android.data.FeedbackSubmit.Outcome) r2
        Lca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.FeedbackSubmit.submit(com.pymcl.core.net.Http, com.pymcl.android.data.FeedbackSubmit$Prepared$Ready):com.pymcl.android.data.FeedbackSubmit$Outcome");
    }

    public final String deviceId(Function1<? super String, String> get, Function2<? super String, ? super String, Unit> put) {
        Intrinsics.checkNotNullParameter(get, "get");
        Intrinsics.checkNotNullParameter(put, "put");
        String strInvoke = get.invoke(LauncherPrefs.FEEDBACK_DEVICE_ID);
        if (strInvoke != null) {
            if (StringsKt.isBlank(strInvoke)) {
                strInvoke = null;
            }
            if (strInvoke != null) {
                return strInvoke;
            }
        }
        String id = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id, "toString(...)");
        put.invoke(LauncherPrefs.FEEDBACK_DEVICE_ID, id);
        return id;
    }
}
