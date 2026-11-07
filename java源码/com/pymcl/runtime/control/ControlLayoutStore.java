package com.pymcl.runtime.control;

import androidx.autofill.HintConstants;
import com.pymcl.runtime.control.ControlLayout;
import com.pymcl.runtime.input.GamepadMapping;
import com.pymcl.runtime.input.InputSettings;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ControlLayoutStore.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nJ\u001a\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/pymcl/runtime/control/ControlLayoutStore;", "", "dir", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getDir", "()Ljava/io/File;", "fileOf", HintConstants.AUTOFILL_HINT_NAME, "", "list", "", "load", "Lcom/pymcl/runtime/control/ControlLayout;", "save", "", "layout", "delete", "", "rename", "from", "to", "import", "input", "Ljava/io/InputStream;", "preferredName", "export", "out", "Ljava/io/OutputStream;", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ControlLayoutStore {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final File dir;

    public ControlLayoutStore(File dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.dir = dir;
        this.dir.mkdirs();
    }

    public final File getDir() {
        return this.dir;
    }

    private final File fileOf(String name) {
        return new File(this.dir, INSTANCE.sanitize(name) + ".json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean list$lambda$0(File f) {
        if (!f.isFile()) {
            return false;
        }
        String name = f.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return (!StringsKt.endsWith$default(name, ".json", false, 2, (Object) null) || Intrinsics.areEqual(f.getName(), "input_settings.json") || Intrinsics.areEqual(f.getName(), "quick_input.json") || Intrinsics.areEqual(f.getName(), GamepadMapping.FILE_NAME)) ? false : true;
    }

    public final List<String> list() {
        Collection destination$iv$iv;
        File[] fileArrListFiles = this.dir.listFiles(new FileFilter() { // from class: com.pymcl.runtime.control.ControlLayoutStore$$ExternalSyntheticLambda0
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return ControlLayoutStore.list$lambda$0(file);
            }
        });
        if (fileArrListFiles != null) {
            Collection destination$iv$iv2 = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                destination$iv$iv2.add(StringsKt.removeSuffix(name, (CharSequence) ".json"));
            }
            destination$iv$iv = (List) destination$iv$iv2;
        } else {
            destination$iv$iv = null;
        }
        if (destination$iv$iv == null) {
            destination$iv$iv = CollectionsKt.emptyList();
        }
        return CollectionsKt.sorted(CollectionsKt.distinct(SetsKt.plus((Set) DefaultLayouts.INSTANCE.getBuiltins().keySet(), (Iterable) destination$iv$iv)));
    }

    public final ControlLayout load(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        File f = fileOf(name);
        if (f.isFile()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                ControlLayoutStore controlLayoutStore = this;
                ControlLayout it = ControlLayout.INSTANCE.fromJson(FilesKt.readText$default(f, null, 1, null));
                it.setName(name);
                return it;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
        }
        AnonymousClass2 anonymousClass2 = DefaultLayouts.INSTANCE.getBuiltins().get(name);
        if (anonymousClass2 == null) {
            anonymousClass2 = new AnonymousClass2(DefaultLayouts.INSTANCE);
        }
        return anonymousClass2.invoke();
    }

    /* compiled from: ControlLayoutStore.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.pymcl.runtime.control.ControlLayoutStore$load$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<ControlLayout> {
        AnonymousClass2(Object obj) {
            super(0, obj, DefaultLayouts.class, InputSettings.DEFAULT_LAYOUT, "default()Lcom/pymcl/runtime/control/ControlLayout;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ControlLayout invoke() {
            return ((DefaultLayouts) this.receiver).m8059default();
        }
    }

    public final void save(ControlLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        File f = fileOf(layout.getName());
        File tmp = new File(this.dir, f.getName() + ".tmp");
        FilesKt.writeText$default(tmp, layout.toJson(), null, 2, null);
        if (!tmp.renameTo(f)) {
            f.delete();
            tmp.renameTo(f);
        }
    }

    public final boolean delete(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return fileOf(name).delete();
    }

    public final boolean rename(String from, String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        ControlLayout l = load(from);
        l.setName(INSTANCE.sanitize(to));
        save(l);
        if (!Intrinsics.areEqual(INSTANCE.sanitize(from), l.getName())) {
            delete(from);
            return true;
        }
        return true;
    }

    public static /* synthetic */ String import$default(ControlLayoutStore controlLayoutStore, InputStream inputStream, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return controlLayoutStore.m8056import(inputStream, str);
    }

    /* renamed from: import, reason: not valid java name */
    public final String m8056import(InputStream input, String preferredName) {
        String str;
        Intrinsics.checkNotNullParameter(input, "input");
        ControlLayout.Companion companion = ControlLayout.INSTANCE;
        Reader inputStreamReader = new InputStreamReader(input, Charsets.UTF_8);
        ControlLayout layout = companion.fromJson(TextStreamsKt.readText(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192)));
        Companion companion2 = INSTANCE;
        if (preferredName == null) {
            String name = layout.getName();
            if (StringsKt.isBlank(name)) {
                name = "imported";
            }
            str = name;
        } else {
            str = preferredName;
        }
        String base = companion2.sanitize(str);
        String name2 = base;
        int i = 1;
        while (true) {
            if (fileOf(name2).exists() || DefaultLayouts.INSTANCE.getBuiltins().containsKey(name2)) {
                name2 = base + "-" + i;
                i++;
            } else {
                layout.setName(name2);
                save(layout);
                return name2;
            }
        }
    }

    public final void export(String name, OutputStream out) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(out, "out");
        Writer outputStreamWriter = new OutputStreamWriter(out, Charsets.UTF_8);
        BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
        try {
            BufferedWriter it = bufferedWriter;
            it.write(load(name).toJson());
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(bufferedWriter, null);
        } finally {
        }
    }

    /* compiled from: ControlLayoutStore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;", "", "<init>", "()V", "sanitize", "", HintConstants.AUTOFILL_HINT_NAME, "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String sanitize(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            String strTake = StringsKt.take(new Regex("[\\\\/:*?\"<>|\\s]+").replace(StringsKt.trim((CharSequence) name).toString(), "_"), 64);
            if (strTake.length() == 0) {
                strTake = "layout";
            }
            return strTake;
        }
    }
}
