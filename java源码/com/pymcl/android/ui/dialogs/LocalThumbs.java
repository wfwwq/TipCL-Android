package com.pymcl.android.ui.dialogs;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import com.pymcl.android.ui.components.ThumbMath;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/pymcl/android/ui/dialogs/LocalThumbs;", "", "<init>", "()V", "mem", "com/pymcl/android/ui/dialogs/LocalThumbs$mem$1", "Lcom/pymcl/android/ui/dialogs/LocalThumbs$mem$1;", "load", "Landroid/graphics/Bitmap;", "path", "", "targetPx", "", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes18.dex */
final class LocalThumbs {
    public static final LocalThumbs INSTANCE = new LocalThumbs();
    private static final LocalThumbs$mem$1 mem;

    private LocalThumbs() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.pymcl.android.ui.dialogs.LocalThumbs$mem$1] */
    static {
        final int iCoerceAtLeast = RangesKt.coerceAtLeast((int) (Runtime.getRuntime().maxMemory() / 32), 2097152);
        mem = new LruCache<String, Bitmap>(iCoerceAtLeast) { // from class: com.pymcl.android.ui.dialogs.LocalThumbs$mem$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            public int sizeOf(String key, Bitmap value) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                return value.getByteCount();
            }
        };
    }

    public final Bitmap load(String path, int targetPx) {
        Intrinsics.checkNotNullParameter(path, "path");
        File f = new File(path);
        String key = path + "@" + targetPx + "@" + f.lastModified();
        Bitmap bitmap = mem.get(key);
        if (bitmap != null) {
            return bitmap;
        }
        BitmapFactory.Options o = new BitmapFactory.Options();
        o.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, o);
        if (o.outWidth <= 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = ThumbMath.INSTANCE.sampleSize(o.outWidth, o.outHeight, targetPx);
        Bitmap bm = BitmapFactory.decodeFile(path, options);
        if (bm == null) {
            return null;
        }
        mem.put(key, bm);
        return bm;
    }
}
