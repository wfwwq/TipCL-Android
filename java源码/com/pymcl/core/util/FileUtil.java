package com.pymcl.core.util;

import androidx.autofill.HintConstants;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: Files.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ$\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0006J\n\u0010\u0016\u001a\u00020\u0006*\u00020\u000eJ\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J\u0016\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0006J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/pymcl/core/util/FileUtil;", "", "<init>", "()V", "locks", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "lockFor", "f", "Ljava/io/File;", "writeAtomic", "", "bytes", "", "readJsonObj", "", "Lcom/pymcl/core/util/JObj;", "writeJson", SettingsProtocol.EXTRA_VALUE, "hash", "algo", "hex", "sha1", "b", "sha256", "s", "safeChild", "root", HintConstants.AUTOFILL_HINT_NAME, "toLaunchPath", "p", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FileUtil {
    public static final FileUtil INSTANCE = new FileUtil();
    private static final HashMap<String, Object> locks = new HashMap<>();

    private FileUtil() {
    }

    public final Object lockFor(File f) {
        Object answer$iv;
        Intrinsics.checkNotNullParameter(f, "f");
        synchronized (locks) {
            Map $this$getOrPut$iv = locks;
            String absolutePath = f.getAbsolutePath();
            Object value$iv = $this$getOrPut$iv.get(absolutePath);
            if (value$iv == null) {
                answer$iv = new Object();
                $this$getOrPut$iv.put(absolutePath, answer$iv);
            } else {
                answer$iv = value$iv;
            }
        }
        return answer$iv;
    }

    public final boolean writeAtomic(File f, byte[] bytes) {
        boolean zDelete;
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        synchronized (lockFor(f)) {
            File parentFile = f.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            File tmp = new File(f.getParentFile(), f.getName() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(f.getParentFile(), f.getName() + ".lock"), "rw");
            try {
                RandomAccessFile raf = randomAccessFile;
                FileLock fileLockLock = raf.getChannel().lock();
                try {
                    FileLock fileLock = fileLockLock;
                    FilesKt.writeBytes(tmp, bytes);
                    if (!tmp.renameTo(f)) {
                        f.delete();
                        if (!tmp.renameTo(f)) {
                            FilesKt.writeBytes(f, bytes);
                            tmp.delete();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(fileLockLock, null);
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(randomAccessFile, null);
                    zDelete = new File(f.getParentFile(), f.getName() + ".lock").delete();
                } finally {
                }
            } finally {
            }
        }
        return zDelete;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, Object> readJsonObj(File f) {
        Map<String, Object> map;
        Map<String, Object> mapM8116constructorimpl;
        Intrinsics.checkNotNullParameter(f, "f");
        synchronized (lockFor(f)) {
            map = null;
            if (f.isFile()) {
                FileUtil fileUtil = INSTANCE;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    mapM8116constructorimpl = Result.m8116constructorimpl(Json.INSTANCE.obj(FilesKt.readText(f, Charsets.UTF_8)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    mapM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                if (!Result.m8122isFailureimpl(mapM8116constructorimpl)) {
                    map = mapM8116constructorimpl;
                }
                map = map;
            }
        }
        return map;
    }

    public final boolean writeJson(File f, Object v) {
        Intrinsics.checkNotNullParameter(f, "f");
        byte[] bytes = Json.INSTANCE.stringify(v, true).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return writeAtomic(f, bytes);
    }

    public static /* synthetic */ String hash$default(FileUtil fileUtil, File file, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "SHA-1";
        }
        return fileUtil.hash(file, str);
    }

    public final String hash(File f, String algo) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(algo, "algo");
        MessageDigest md = MessageDigest.getInstance(algo);
        FileInputStream fileInputStream = new FileInputStream(f);
        try {
            FileInputStream ins = fileInputStream;
            byte[] buf = new byte[65536];
            while (true) {
                int n = ins.read(buf);
                if (n < 0) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    byte[] bArrDigest = md.digest();
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                    return hex(bArrDigest);
                }
                md.update(buf, 0, n);
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hex$lambda$0(byte it) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final String hex(byte[] $this$hex) {
        Intrinsics.checkNotNullParameter($this$hex, "<this>");
        return ArraysKt.joinToString$default($this$hex, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.pymcl.core.util.FileUtil$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FileUtil.hex$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, (Object) null);
    }

    public final String sha1(byte[] b) {
        Intrinsics.checkNotNullParameter(b, "b");
        byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(b);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return hex(bArrDigest);
    }

    public final String sha256(String s) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(s, "s");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = s.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return hex(bArrDigest);
    }

    public final File safeChild(File root, String name) throws IOException {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(name, "name");
        File f = new File(root, name).getCanonicalFile();
        String path = f.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        String path2 = root.getCanonicalFile().getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
        if (!StringsKt.startsWith$default(path, path2, false, 2, (Object) null)) {
            throw new IllegalArgumentException(("路径越界: " + name).toString());
        }
        Intrinsics.checkNotNull(f);
        return f;
    }

    public final String toLaunchPath(String p) {
        Intrinsics.checkNotNullParameter(p, "p");
        String s = StringsKt.replace$default(p, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX, false, 4, (Object) null);
        if (s.length() < 2) {
            return s;
        }
        if (s.charAt(1) != ':') {
            return s;
        }
        char cCharAt = s.charAt(0);
        if (!('A' <= cCharAt && cCharAt < '[')) {
            char cCharAt2 = s.charAt(0);
            if (!('a' <= cCharAt2 && cCharAt2 < '{')) {
                return s;
            }
        }
        String s2 = s.substring(2);
        Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
        return s2;
    }

    public final String toLaunchPath(File f) {
        Intrinsics.checkNotNullParameter(f, "f");
        String path = f.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return toLaunchPath(path);
    }
}
