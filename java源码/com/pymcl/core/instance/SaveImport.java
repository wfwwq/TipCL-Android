package com.pymcl.core.instance;

import androidx.autofill.HintConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;

/* compiled from: SaveImport.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u00044567B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bJ\u001c\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014J\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0018\u001a\u00020\bJ\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\b0\b0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\bH\u0002J0\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J.\u0010(\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\b\b\u0002\u0010,\u001a\u00020-J.\u0010.\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\b2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001b2\b\b\u0002\u0010,\u001a\u00020-J\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002010\u001b2\u0006\u00103\u001a\u00020\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/pymcl/core/instance/SaveImport;", "", "<init>", "()V", "ILLEGAL", "Lkotlin/text/Regex;", "JUNK_SEGMENTS", "", "", "normalize", "raw", "isJunk", "", "path", "sanitizeName", "n", "fallback", "uniqueName", "base", "existing", "", "plan", "Lcom/pymcl/core/instance/SaveImport$Plan;", "paths", "archiveName", "relative", "existingNames", "", "kotlin.jvm.PlatformType", "savesDir", "Ljava/io/File;", "safeTarget", "staging", "rel", "finish", "Lcom/pymcl/core/instance/SaveImport$Result;", "files", "", "bytes", "", "importZip", AbstractCircuitBreaker.PROPERTY_NAME, "Lkotlin/Function0;", "Ljava/io/InputStream;", "limits", "Lcom/pymcl/core/instance/SaveImport$Limits;", "importTree", "folderName", "entries", "Lcom/pymcl/core/instance/SaveImport$TreeEntry;", "entriesOf", "dir", "Limits", "TreeEntry", "Plan", "Result", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SaveImport {
    public static final SaveImport INSTANCE = new SaveImport();
    private static final Regex ILLEGAL = new Regex("[\\\\/:*?\"<>|\\u0000-\\u001f]");
    private static final Set<String> JUNK_SEGMENTS = SetsKt.setOf((Object[]) new String[]{"__MACOSX", ".DS_Store", "session.lock"});

    /* compiled from: SaveImport.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/pymcl/core/instance/SaveImport$Limits;", "", "maxEntries", "", "maxBytes", "", "<init>", "(IJ)V", "getMaxEntries", "()I", "getMaxBytes", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Limits {
        private final long maxBytes;
        private final int maxEntries;

        public Limits() {
            this(0, 0L, 3, null);
        }

        public static /* synthetic */ Limits copy$default(Limits limits, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = limits.maxEntries;
            }
            if ((i2 & 2) != 0) {
                j = limits.maxBytes;
            }
            return limits.copy(i, j);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxEntries() {
            return this.maxEntries;
        }

        /* renamed from: component2, reason: from getter */
        public final long getMaxBytes() {
            return this.maxBytes;
        }

        public final Limits copy(int maxEntries, long maxBytes) {
            return new Limits(maxEntries, maxBytes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Limits)) {
                return false;
            }
            Limits limits = (Limits) other;
            return this.maxEntries == limits.maxEntries && this.maxBytes == limits.maxBytes;
        }

        public int hashCode() {
            return (Integer.hashCode(this.maxEntries) * 31) + Long.hashCode(this.maxBytes);
        }

        public String toString() {
            return "Limits(maxEntries=" + this.maxEntries + ", maxBytes=" + this.maxBytes + ")";
        }

        public Limits(int maxEntries, long maxBytes) {
            this.maxEntries = maxEntries;
            this.maxBytes = maxBytes;
        }

        public /* synthetic */ Limits(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 200000 : i, (i2 & 2) != 0 ? 17179869184L : j);
        }

        public final long getMaxBytes() {
            return this.maxBytes;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }
    }

    private SaveImport() {
    }

    /* compiled from: SaveImport.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/pymcl/core/instance/SaveImport$TreeEntry;", "", "path", "", "isDir", "", AbstractCircuitBreaker.PROPERTY_NAME, "Lkotlin/Function0;", "Ljava/io/InputStream;", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "getPath", "()Ljava/lang/String;", "()Z", "getOpen", "()Lkotlin/jvm/functions/Function0;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class TreeEntry {
        private final boolean isDir;
        private final Function0<InputStream> open;
        private final String path;

        /* JADX WARN: Multi-variable type inference failed */
        public TreeEntry(String path, boolean isDir, Function0<? extends InputStream> open) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(open, "open");
            this.path = path;
            this.isDir = isDir;
            this.open = open;
        }

        public final Function0<InputStream> getOpen() {
            return this.open;
        }

        public final String getPath() {
            return this.path;
        }

        /* renamed from: isDir, reason: from getter */
        public final boolean getIsDir() {
            return this.isDir;
        }
    }

    /* compiled from: SaveImport.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/pymcl/core/instance/SaveImport$Plan;", "", "rootPrefix", "", "baseName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRootPrefix", "()Ljava/lang/String;", "getBaseName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Plan {
        private final String baseName;
        private final String rootPrefix;

        public static /* synthetic */ Plan copy$default(Plan plan, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = plan.rootPrefix;
            }
            if ((i & 2) != 0) {
                str2 = plan.baseName;
            }
            return plan.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRootPrefix() {
            return this.rootPrefix;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBaseName() {
            return this.baseName;
        }

        public final Plan copy(String rootPrefix, String baseName) {
            Intrinsics.checkNotNullParameter(rootPrefix, "rootPrefix");
            Intrinsics.checkNotNullParameter(baseName, "baseName");
            return new Plan(rootPrefix, baseName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Plan)) {
                return false;
            }
            Plan plan = (Plan) other;
            return Intrinsics.areEqual(this.rootPrefix, plan.rootPrefix) && Intrinsics.areEqual(this.baseName, plan.baseName);
        }

        public int hashCode() {
            return (this.rootPrefix.hashCode() * 31) + this.baseName.hashCode();
        }

        public String toString() {
            return "Plan(rootPrefix=" + this.rootPrefix + ", baseName=" + this.baseName + ")";
        }

        public Plan(String rootPrefix, String baseName) {
            Intrinsics.checkNotNullParameter(rootPrefix, "rootPrefix");
            Intrinsics.checkNotNullParameter(baseName, "baseName");
            this.rootPrefix = rootPrefix;
            this.baseName = baseName;
        }

        public final String getBaseName() {
            return this.baseName;
        }

        public final String getRootPrefix() {
            return this.rootPrefix;
        }
    }

    /* compiled from: SaveImport.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/pymcl/core/instance/SaveImport$Result;", "", HintConstants.AUTOFILL_HINT_NAME, "", "files", "", "bytes", "", "renamed", "", "<init>", "(Ljava/lang/String;IJZ)V", "getName", "()Ljava/lang/String;", "getFiles", "()I", "getBytes", "()J", "getRenamed", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Result {
        private final long bytes;
        private final int files;
        private final String name;
        private final boolean renamed;

        public static /* synthetic */ Result copy$default(Result result, String str, int i, long j, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = result.name;
            }
            if ((i2 & 2) != 0) {
                i = result.files;
            }
            if ((i2 & 4) != 0) {
                j = result.bytes;
            }
            if ((i2 & 8) != 0) {
                z = result.renamed;
            }
            boolean z2 = z;
            return result.copy(str, i, j, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final int getFiles() {
            return this.files;
        }

        /* renamed from: component3, reason: from getter */
        public final long getBytes() {
            return this.bytes;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getRenamed() {
            return this.renamed;
        }

        public final Result copy(String name, int files, long bytes, boolean renamed) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Result(name, files, bytes, renamed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.name, result.name) && this.files == result.files && this.bytes == result.bytes && this.renamed == result.renamed;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + Integer.hashCode(this.files)) * 31) + Long.hashCode(this.bytes)) * 31) + Boolean.hashCode(this.renamed);
        }

        public String toString() {
            return "Result(name=" + this.name + ", files=" + this.files + ", bytes=" + this.bytes + ", renamed=" + this.renamed + ")";
        }

        public Result(String name, int files, long bytes, boolean renamed) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.files = files;
            this.bytes = bytes;
            this.renamed = renamed;
        }

        public final long getBytes() {
            return this.bytes;
        }

        public final int getFiles() {
            return this.files;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getRenamed() {
            return this.renamed;
        }
    }

    public final String normalize(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        boolean z = false;
        if (StringsKt.contains$default((CharSequence) raw, (char) 0, false, 2, (Object) null)) {
            return null;
        }
        String p = StringsKt.replace$default(raw, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX, false, 4, (Object) null);
        if (StringsKt.startsWith$default(p, "/", false, 2, (Object) null) || new Regex("^[A-Za-z]:").containsMatchIn(p)) {
            return null;
        }
        Iterable $this$filter$iv = StringsKt.split$default((CharSequence) p, new char[]{IOUtils.DIR_SEPARATOR_UNIX}, false, 0, 6, (Object) null);
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it = (String) element$iv$iv;
            if (((!(it.length() > 0) || Intrinsics.areEqual(it, ".")) ? null : 1) != null) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable segs = (List) destination$iv$iv;
        Iterable $this$any$iv = segs;
        if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
            Iterator it2 = $this$any$iv.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object element$iv = it2.next();
                if (Intrinsics.areEqual((String) element$iv, "..")) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return null;
        }
        return CollectionsKt.joinToString$default(segs, "/", null, null, 0, null, null, 62, null);
    }

    public final boolean isJunk(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Iterable $this$any$iv = StringsKt.split$default((CharSequence) path, new char[]{IOUtils.DIR_SEPARATOR_UNIX}, false, 0, 6, (Object) null);
        if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
            return false;
        }
        for (Object element$iv : $this$any$iv) {
            String it = (String) element$iv;
            if (((JUNK_SEGMENTS.contains(it) || StringsKt.startsWith$default(it, "._", false, 2, (Object) null)) ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ String sanitizeName$default(SaveImport saveImport, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "world";
        }
        return saveImport.sanitizeName(str, str2);
    }

    public final String sanitizeName(String n, String fallback) {
        Intrinsics.checkNotNullParameter(n, "n");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        String s = StringsKt.trim((CharSequence) StringsKt.trimEnd(StringsKt.trim((CharSequence) ILLEGAL.replace(n, "_")).toString(), '.')).toString();
        return ((s.length() == 0) || Intrinsics.areEqual(s, ".") || Intrinsics.areEqual(s, "..")) ? fallback : StringsKt.take(s, 120);
    }

    public final String uniqueName(String base, Collection<String> existing) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(existing, "existing");
        Collection<String> $this$map$iv = existing;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            String lowerCase = it.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            destination$iv$iv.add(lowerCase);
        }
        HashSet taken = CollectionsKt.toHashSet((List) destination$iv$iv);
        String lowerCase2 = base.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (!taken.contains(lowerCase2)) {
            return base;
        }
        int i = 2;
        while (true) {
            String lowerCase3 = (base + " (" + i + ")").toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            if (!taken.contains(lowerCase3)) {
                return base + " (" + i + ")";
            }
            i++;
        }
    }

    public final Plan plan(Collection<String> paths, String archiveName) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        Intrinsics.checkNotNullParameter(archiveName, "archiveName");
        Collection<String> $this$filter$iv = paths;
        Collection destination$iv$iv = new ArrayList();
        Iterator it = $this$filter$iv.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object element$iv$iv = it.next();
            String it2 = (String) element$iv$iv;
            if (!INSTANCE.isJunk(it2) && (Intrinsics.areEqual(it2, "level.dat") || StringsKt.endsWith$default(it2, "/level.dat", false, 2, (Object) null))) {
                z = true;
            }
            if (z) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List levels = (List) destination$iv$iv;
        final Comparator comparator = new Comparator() { // from class: com.pymcl.core.instance.SaveImport$plan$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                CharSequence it3 = (String) t;
                CharSequence $this$count$iv = it3;
                int count$iv = 0;
                int i = 0;
                while (true) {
                    if (i >= $this$count$iv.length()) {
                        break;
                    }
                    char element$iv = $this$count$iv.charAt(i);
                    if (element$iv == '/') {
                        count$iv++;
                    }
                    i++;
                }
                Integer numValueOf = Integer.valueOf(count$iv);
                CharSequence it4 = (String) t2;
                CharSequence $this$count$iv2 = it4;
                int count$iv2 = 0;
                for (int i2 = 0; i2 < $this$count$iv2.length(); i2++) {
                    char element$iv2 = $this$count$iv2.charAt(i2);
                    char c = element$iv2 == '/' ? (char) 1 : (char) 0;
                    if (c != 0) {
                        count$iv2++;
                    }
                }
                return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(count$iv2));
            }
        };
        String best = (String) CollectionsKt.minWithOrNull(levels, new Comparator() { // from class: com.pymcl.core.instance.SaveImport$plan$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int previousCompare = comparator.compare(t, t2);
                if (previousCompare != 0) {
                    return previousCompare;
                }
                String it3 = (String) t;
                String it4 = (String) t2;
                return ComparisonsKt.compareValues(it3, it4);
            }
        });
        if (best == null) {
            return null;
        }
        String prefix = StringsKt.removeSuffix(best, (CharSequence) "level.dat");
        String dirName = StringsKt.substringAfterLast$default(StringsKt.trimEnd(prefix, IOUtils.DIR_SEPARATOR_UNIX), IOUtils.DIR_SEPARATOR_UNIX, (String) null, 2, (Object) null);
        String it3 = StringsKt.substringAfterLast$default(archiveName, IOUtils.DIR_SEPARATOR_UNIX, (String) null, 2, (Object) null);
        if (StringsKt.endsWith(it3, ".zip", true)) {
            it3 = StringsKt.dropLast(it3, 4);
        }
        String str = dirName;
        if (str.length() == 0) {
            str = it3;
        }
        return new Plan(prefix, sanitizeName(str, sanitizeName$default(this, it3, null, 2, null)));
    }

    public final String relative(String path, Plan plan) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(plan, "plan");
        if (plan.getRootPrefix().length() == 0) {
            return path;
        }
        if (StringsKt.startsWith$default(path, plan.getRootPrefix(), false, 2, (Object) null)) {
            return StringsKt.removePrefix(path, (CharSequence) plan.getRootPrefix());
        }
        return null;
    }

    private final List<String> existingNames(File savesDir) {
        List<String> list;
        String[] list2 = savesDir.list();
        return (list2 == null || (list = ArraysKt.toList(list2)) == null) ? CollectionsKt.emptyList() : list;
    }

    private final File safeTarget(File staging, String rel) throws IOException {
        File out = new File(staging, rel).getCanonicalFile();
        String path = out.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        if (!StringsKt.startsWith$default(path, staging.getCanonicalPath() + File.separator, false, 2, (Object) null)) {
            throw new IOException("压缩包里有越界路径: " + rel);
        }
        Intrinsics.checkNotNull(out);
        return out;
    }

    private final Result finish(File savesDir, File staging, Plan plan, int files, long bytes) throws IOException {
        if (!new File(staging, "level.dat").isFile()) {
            throw new IOException("没有找到 level.dat，不是 Minecraft 存档");
        }
        String baseName = plan.getBaseName();
        Iterable $this$filter$iv = existingNames(savesDir);
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it = (String) element$iv$iv;
            Intrinsics.checkNotNull(it);
            if (!StringsKt.startsWith$default(it, ".", false, 2, (Object) null)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        String name = uniqueName(baseName, (List) destination$iv$iv);
        if (!staging.renameTo(new File(savesDir, name))) {
            throw new IOException("导入失败：无法写入 " + name);
        }
        return new Result(name, files, bytes, !Intrinsics.areEqual(name, plan.getBaseName()));
    }

    public static /* synthetic */ Result importZip$default(SaveImport saveImport, File file, String str, Function0 function0, Limits limits, int i, Object obj) {
        if ((i & 8) != 0) {
            limits = new Limits(0, 0L, 3, null);
        }
        return saveImport.importZip(file, str, function0, limits);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.core.instance.SaveImport.Result importZip(java.io.File r34, java.lang.String r35, kotlin.jvm.functions.Function0<? extends java.io.InputStream> r36, com.pymcl.core.instance.SaveImport.Limits r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.instance.SaveImport.importZip(java.io.File, java.lang.String, kotlin.jvm.functions.Function0, com.pymcl.core.instance.SaveImport$Limits):com.pymcl.core.instance.SaveImport$Result");
    }

    public static /* synthetic */ Result importTree$default(SaveImport saveImport, File file, String str, List list, Limits limits, int i, Object obj) {
        if ((i & 8) != 0) {
            limits = new Limits(0, 0L, 3, null);
        }
        return saveImport.importTree(file, str, list, limits);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.core.instance.SaveImport.Result importTree(java.io.File r30, java.lang.String r31, java.util.List<com.pymcl.core.instance.SaveImport.TreeEntry> r32, com.pymcl.core.instance.SaveImport.Limits r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.instance.SaveImport.importTree(java.io.File, java.lang.String, java.util.List, com.pymcl.core.instance.SaveImport$Limits):com.pymcl.core.instance.SaveImport$Result");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean entriesOf$lambda$0(File $dir, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !Intrinsics.areEqual(it, $dir);
    }

    public final List<TreeEntry> entriesOf(final File dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return SequencesKt.toList(SequencesKt.map(SequencesKt.filter(FilesKt.walkTopDown(dir), new Function1() { // from class: com.pymcl.core.instance.SaveImport$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SaveImport.entriesOf$lambda$0(dir, (File) obj));
            }
        }), new Function1() { // from class: com.pymcl.core.instance.SaveImport$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SaveImport.entriesOf$lambda$1(dir, (File) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TreeEntry entriesOf$lambda$1(File $dir, final File f) {
        Intrinsics.checkNotNullParameter(f, "f");
        return new TreeEntry(FilesKt.getInvariantSeparatorsPath(FilesKt.relativeTo(f, $dir)), f.isDirectory(), new Function0() { // from class: com.pymcl.core.instance.SaveImport$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SaveImport.entriesOf$lambda$1$0(f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputStream entriesOf$lambda$1$0(File $f) {
        return new FileInputStream($f);
    }
}
