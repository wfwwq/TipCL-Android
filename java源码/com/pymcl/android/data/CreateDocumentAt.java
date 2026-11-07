package com.pymcl.android.data;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import com.github.caciocavallosilano.cacio.peer.CacioChoicePeer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SaveImportData.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0012"}, d2 = {"Lcom/pymcl/android/data/CreateDocumentAt;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/pymcl/android/data/CreateDocumentAt$Request;", "Landroid/net/Uri;", "mime", "", "<init>", "(Ljava/lang/String;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Request", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class CreateDocumentAt extends ActivityResultContract<Request, Uri> {
    public static final int $stable = 8;
    private final String mime;

    /* compiled from: SaveImportData.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/pymcl/android/data/CreateDocumentAt$Request;", "", "fileName", "", "initialUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getInitialUri", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 0;
        private final String fileName;
        private final String initialUri;

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.fileName;
            }
            if ((i & 2) != 0) {
                str2 = request.initialUri;
            }
            return request.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInitialUri() {
            return this.initialUri;
        }

        public final Request copy(String fileName, String initialUri) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return new Request(fileName, initialUri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.fileName, request.fileName) && Intrinsics.areEqual(this.initialUri, request.initialUri);
        }

        public int hashCode() {
            return (this.fileName.hashCode() * 31) + (this.initialUri == null ? 0 : this.initialUri.hashCode());
        }

        public String toString() {
            return "Request(fileName=" + this.fileName + ", initialUri=" + this.initialUri + ")";
        }

        public Request(String fileName, String initialUri) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.fileName = fileName;
            this.initialUri = initialUri;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getInitialUri() {
            return this.initialUri;
        }
    }

    public CreateDocumentAt(String mime) {
        Intrinsics.checkNotNullParameter(mime, "mime");
        this.mime = mime;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Request input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType(this.mime).putExtra("android.intent.extra.TITLE", input.getFileName());
        if (input.getInitialUri() != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                CreateDocumentAt createDocumentAt = this;
                Result.m8116constructorimpl(intentPutExtra.putExtra("android.provider.extra.INITIAL_URI", (Parcelable) CacioChoicePeer.getAWTComponent()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
        }
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "also(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public Uri parseResult(int resultCode, Intent intent) {
        if (resultCode != -1 || intent == null) {
            return null;
        }
        return intent.getData();
    }
}
