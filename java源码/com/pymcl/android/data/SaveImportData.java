package com.pymcl.android.data;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.pymcl.android.data.SaveImportProgress;
import com.pymcl.core.instance.SaveImport;
import java.awt.Choice;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: SaveImportData.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J2\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u0014J(\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/pymcl/android/data/SaveImportData;", "", "<init>", "()V", "ZIP_MIMES", "", "", "getZIP_MIMES", "()[Ljava/lang/String;", "[Ljava/lang/String;", "displayName", "ctx", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "importZip", "Lcom/pymcl/core/instance/SaveImport$Result;", "savesDir", "Ljava/io/File;", "cb", "Lcom/pymcl/android/data/SaveImportProgress$Cb;", "importTree", "treeUri", "limits", "Lcom/pymcl/core/instance/SaveImport$Limits;", "importAny", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class SaveImportData {
    public static final int $stable = 0;
    public static final SaveImportData INSTANCE = new SaveImportData();
    private static final String[] ZIP_MIMES = {"application/zip", "application/x-zip-compressed", "application/x-zip", "application/octet-stream"};

    private SaveImportData() {
    }

    public final String[] getZIP_MIMES() {
        return ZIP_MIMES;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String displayName(android.content.Context r12, android.net.Uri r13) {
        /*
            r11 = this;
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r1 = 0
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L50
            r0 = r11
            com.pymcl.android.data.SaveImportData r0 = (com.pymcl.android.data.SaveImportData) r0     // Catch: java.lang.Throwable -> L50
            r2 = r0
            r3 = 0
            android.content.ContentResolver r4 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L50
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "_display_name"
            r10 = 0
            r6[r10] = r0     // Catch: java.lang.Throwable -> L50
            r8 = 0
            r9 = 0
            r7 = 0
            r5 = r13
            android.database.Cursor r13 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4d
            if (r13 == 0) goto L46
            java.io.Closeable r13 = (java.io.Closeable) r13     // Catch: java.lang.Throwable -> L4d
            r0 = r13
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            boolean r6 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L3e
            if (r6 == 0) goto L39
            java.lang.String r6 = r0.getString(r10)     // Catch: java.lang.Throwable -> L3e
            goto L3a
        L39:
            r6 = r1
        L3a:
            kotlin.io.CloseableKt.closeFinally(r13, r1)     // Catch: java.lang.Throwable -> L4d
            goto L47
        L3e:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r13, r4)     // Catch: java.lang.Throwable -> L4d
            throw r0     // Catch: java.lang.Throwable -> L4d
        L46:
            r6 = r1
        L47:
            java.lang.Object r13 = kotlin.Result.m8116constructorimpl(r6)     // Catch: java.lang.Throwable -> L4d
            goto L5d
        L4d:
            r0 = move-exception
            r13 = r0
            goto L53
        L50:
            r0 = move-exception
            r5 = r13
            r13 = r0
        L53:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r13 = kotlin.ResultKt.createFailure(r13)
            java.lang.Object r13 = kotlin.Result.m8116constructorimpl(r13)
        L5d:
            boolean r0 = kotlin.Result.m8122isFailureimpl(r13)
            if (r0 == 0) goto L64
            r13 = r1
        L64:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L76
            java.lang.String r13 = r5.getLastPathSegment()
            if (r13 == 0) goto L77
            r0 = 47
            r2 = 2
            java.lang.String r1 = kotlin.text.StringsKt.substringAfterLast$default(r13, r0, r1, r2, r1)
            goto L77
        L76:
            r1 = r13
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.SaveImportData.displayName(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static /* synthetic */ SaveImport.Result importZip$default(SaveImportData saveImportData, Context context, File file, Uri uri, SaveImportProgress.Cb cb, int i, Object obj) {
        if ((i & 8) != 0) {
            cb = new SaveImportProgress.Cb(null, null, 3, null);
        }
        return saveImportData.importZip(context, file, uri, cb);
    }

    public final SaveImport.Result importZip(final Context ctx, File savesDir, final Uri uri, SaveImportProgress.Cb cb) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(savesDir, "savesDir");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cb, "cb");
        String strDisplayName = displayName(ctx, uri);
        if (strDisplayName == null) {
            strDisplayName = "world.zip";
        }
        String name = strDisplayName;
        return SaveImportProgress.importZip$default(SaveImportProgress.INSTANCE, savesDir, name, new Function0() { // from class: com.pymcl.android.data.SaveImportData$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SaveImportData.importZip$lambda$0(ctx, uri);
            }
        }, null, cb, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputStream importZip$lambda$0(Context $ctx, Uri $uri) throws IOException {
        InputStream inputStreamOpenInputStream = $ctx.getContentResolver().openInputStream($uri);
        if (inputStreamOpenInputStream != null) {
            return inputStreamOpenInputStream;
        }
        throw new IOException("打不开所选文件");
    }

    public static /* synthetic */ SaveImport.Result importTree$default(SaveImportData saveImportData, Context context, File file, Uri uri, SaveImport.Limits limits, SaveImportProgress.Cb cb, int i, Object obj) {
        if ((i & 8) != 0) {
            limits = new SaveImport.Limits(0, 0L, 3, null);
        }
        if ((i & 16) != 0) {
            cb = new SaveImportProgress.Cb(null, null, 3, null);
        }
        return saveImportData.importTree(context, file, uri, limits, cb);
    }

    public final SaveImport.Result importTree(Context ctx, File savesDir, Uri treeUri, SaveImport.Limits limits, SaveImportProgress.Cb cb) throws IOException {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(savesDir, "savesDir");
        Intrinsics.checkNotNullParameter(treeUri, "treeUri");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(cb, "cb");
        String rootId = DocumentsContract.getTreeDocumentId(treeUri);
        Uri rootDoc = DocumentsContract.buildDocumentUriUsingTree(treeUri, rootId);
        Intrinsics.checkNotNull(rootDoc);
        String strDisplayName = displayName(ctx, rootDoc);
        if (strDisplayName == null) {
            Intrinsics.checkNotNull(rootId);
            String strSubstringAfterLast$default = StringsKt.substringAfterLast$default(StringsKt.substringAfterLast$default(rootId, ':', (String) null, 2, (Object) null), IOUtils.DIR_SEPARATOR_UNIX, (String) null, 2, (Object) null);
            if (strSubstringAfterLast$default.length() == 0) {
                strSubstringAfterLast$default = "world";
            }
            strDisplayName = strSubstringAfterLast$default;
        }
        String folderName = strDisplayName;
        ArrayList out = new ArrayList();
        Intrinsics.checkNotNull(rootId);
        importTree$walk(treeUri, ctx, out, limits, rootId, "", 0);
        return SaveImportProgress.INSTANCE.importTree(savesDir, folderName, out, limits, cb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void importTree$walk(Uri uri, final Context context, ArrayList<SaveImport.TreeEntry> arrayList, SaveImport.Limits limits, String str, String str2, int i) throws IOException {
        if (i > 64) {
            throw new IOException("文件夹层级太深");
        }
        boolean z = true;
        int i2 = 2;
        Cursor cursorQuery = context.getContentResolver().query(DocumentsContract.buildChildDocumentsUriUsingTree(uri, str), new String[]{"document_id", "_display_name", "mime_type"}, null, null, null);
        if (cursorQuery == null) {
            return;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            while (cursor2.moveToNext()) {
                String string = cursor2.getString(0);
                String string2 = cursor2.getString(z ? 1 : 0);
                if (string2 != null) {
                    String string3 = cursor2.getString(i2);
                    final String str3 = (str2.length() == 0 ? z ? 1 : 0 : false) != false ? string2 : str2 + "/" + string2;
                    if (arrayList.size() > limits.getMaxEntries()) {
                        throw new IOException("文件过多（>" + limits.getMaxEntries() + "）");
                    }
                    if (Intrinsics.areEqual(string3, "vnd.android.document/directory")) {
                        arrayList.add(new SaveImport.TreeEntry(str3, z, new Function0() { // from class: com.pymcl.android.data.SaveImportData$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SaveImportData.importTree$walk$lambda$1$0();
                            }
                        }));
                        Intrinsics.checkNotNull(string);
                        importTree$walk(uri, context, arrayList, limits, string, str3, i + 1);
                        i2 = 2;
                    } else {
                        final Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, string);
                        try {
                            arrayList.add(new SaveImport.TreeEntry(str3, false, new Function0() { // from class: com.pymcl.android.data.SaveImportData$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SaveImportData.importTree$walk$lambda$1$1(context, uriBuildDocumentUriUsingTree, str3);
                                }
                            }));
                            z = true;
                            i2 = 2;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(cursor, th2);
                                throw th3;
                            }
                        }
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cursor, null);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputStream importTree$walk$lambda$1$0() throws IOException {
        throw new IOException("目录");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputStream importTree$walk$lambda$1$1(Context $ctx, Uri $doc, String $path) throws IOException {
        InputStream inputStreamOpenInputStream = $ctx.getContentResolver().openInputStream($doc);
        if (inputStreamOpenInputStream != null) {
            return inputStreamOpenInputStream;
        }
        throw new IOException("打不开 " + $path);
    }

    public static /* synthetic */ SaveImport.Result importAny$default(SaveImportData saveImportData, Context context, File file, Uri uri, SaveImportProgress.Cb cb, int i, Object obj) {
        if ((i & 8) != 0) {
            cb = new SaveImportProgress.Cb(null, null, 3, null);
        }
        return saveImportData.importAny(context, file, uri, cb);
    }

    public final SaveImport.Result importAny(Context ctx, File savesDir, Uri uri, SaveImportProgress.Cb cb) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(savesDir, "savesDir");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cb, "cb");
        return Choice.getItemCount() != 0 ? importTree$default(this, ctx, savesDir, uri, null, cb, 8, null) : importZip(ctx, savesDir, uri, cb);
    }
}
