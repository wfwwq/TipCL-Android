package com.pymcl.runtime;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RuntimeLayout.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0005J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/pymcl/runtime/JavaDownloads;", "", "<init>", "()V", "FCL_COMMIT", "", "BASE", "JRE8_VERSION", "JRE25_VERSION", "pinnedVersion", "major", "", "PINNED", "", "Lkotlin/Pair;", "", "urls", "", "abi", "archives", "Lcom/pymcl/runtime/JavaDownloadFile;", "versionUrl", "isPinned", "", "sha256Hex", "file", "Ljava/io/File;", "verify", "", "spec", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class JavaDownloads {
    private static final String BASE = "https://github.com/FCL-Team/FoldCraftLauncher/raw/a36e1e4/FCL/src/main/jreAssets/app_runtime/java";
    public static final String FCL_COMMIT = "a36e1e4";
    public static final String JRE25_VERSION = "3";
    public static final String JRE8_VERSION = "13";
    public static final JavaDownloads INSTANCE = new JavaDownloads();
    private static final Map<String, Pair<String, Long>> PINNED = MapsKt.mapOf(TuplesKt.to("jre8/universal.tar.xz", TuplesKt.to("150072cfa1d9e037c31e4bf9770aa5470ae46d0bfefd366b7ce5b2f940ede3f3", 9540292L)), TuplesKt.to("jre8/bin-arm64.tar.xz", TuplesKt.to("deed9083a1047af1afaf2d7f1a2de4ae39fadf62c52881f075793e80274956cf", 4347796L)), TuplesKt.to("jre8/bin-x86_64.tar.xz", TuplesKt.to("37c3f7214ce3086575d7210baa25aee130d8db28c57739f598d24dfbfff32612", 6182832L)), TuplesKt.to("jre25/universal.tar.xz", TuplesKt.to("23141bf4e0ed46ff0b751c6cc32b3863d39e6a37b720f3d86a4fe9318aeb8e9f", 32814644L)), TuplesKt.to("jre25/bin-arm64.tar.xz", TuplesKt.to("16f09d1d163c008ae556be68c624057c4791c21ae6d31302334e61d75439567b", 5453168L)), TuplesKt.to("jre25/bin-x86_64.tar.xz", TuplesKt.to("449fe8d37f2ed407322b8ba48cdb06daa5947b28bcf56225afea3d7cc2ccaecb", 6519636L)));

    private JavaDownloads() {
    }

    public final String pinnedVersion(int major) {
        switch (major) {
            case 8:
                return JRE8_VERSION;
            case 25:
                return JRE25_VERSION;
            default:
                return null;
        }
    }

    public final List<String> urls(int major, String abi) {
        Intrinsics.checkNotNullParameter(abi, "abi");
        Iterable $this$map$iv = CollectionsKt.listOf((Object[]) new String[]{"universal.tar.xz", "bin-" + RuntimeLayout.INSTANCE.archName(abi) + ".tar.xz", "version"});
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            destination$iv$iv.add("https://github.com/FCL-Team/FoldCraftLauncher/raw/a36e1e4/FCL/src/main/jreAssets/app_runtime/java/jre" + major + "/" + it);
        }
        return (List) destination$iv$iv;
    }

    public final List<JavaDownloadFile> archives(int major, String abi) {
        Intrinsics.checkNotNullParameter(abi, "abi");
        Iterable $this$map$iv = CollectionsKt.listOf((Object[]) new String[]{"universal.tar.xz", "bin-" + RuntimeLayout.INSTANCE.archName(abi) + ".tar.xz"});
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String n = (String) item$iv$iv;
            Pair pin = PINNED.get("jre" + major + "/" + n);
            destination$iv$iv.add(new JavaDownloadFile(n, "https://github.com/FCL-Team/FoldCraftLauncher/raw/a36e1e4/FCL/src/main/jreAssets/app_runtime/java/jre" + major + "/" + n, pin != null ? pin.getFirst() : null, pin != null ? pin.getSecond().longValue() : -1L));
        }
        return (List) destination$iv$iv;
    }

    public final String versionUrl(int major) {
        return "https://github.com/FCL-Team/FoldCraftLauncher/raw/a36e1e4/FCL/src/main/jreAssets/app_runtime/java/jre" + major + "/version";
    }

    public final boolean isPinned(int major, String abi) {
        Intrinsics.checkNotNullParameter(abi, "abi");
        Iterable $this$all$iv = archives(major, abi);
        if (($this$all$iv instanceof Collection) && ((Collection) $this$all$iv).isEmpty()) {
            return true;
        }
        for (Object element$iv : $this$all$iv) {
            JavaDownloadFile it = (JavaDownloadFile) element$iv;
            if (((it.getSha256() == null || it.getSize() < 0) ? null : 1) == null) {
                return false;
            }
        }
        return true;
    }

    public final String sha256Hex(File file) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(file, "file");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileInputStream input = fileInputStream;
            byte[] buf = new byte[65536];
            while (true) {
                int n = input.read(buf);
                if (n < 0) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    byte[] bArrDigest = md.digest();
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                    return ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.pymcl.runtime.JavaDownloads$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return JavaDownloads.sha256Hex$lambda$1(((Byte) obj).byteValue());
                        }
                    }, 30, (Object) null);
                }
                md.update(buf, 0, n);
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence sha256Hex$lambda$1(byte it) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final void verify(File file, JavaDownloadFile spec) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(spec, "spec");
        if (spec.getSize() >= 0 && file.length() != spec.getSize()) {
            throw new IOException(spec.getName() + " 大小不符：期望 " + spec.getSize() + "，实际 " + file.length());
        }
        if (spec.getSha256() != null) {
            String actual = sha256Hex(file);
            if (!StringsKt.equals(actual, spec.getSha256(), true)) {
                throw new IOException(spec.getName() + " SHA-256 不符：期望 " + spec.getSha256() + "，实际 " + actual);
            }
        }
    }
}
