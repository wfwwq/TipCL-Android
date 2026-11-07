package com.pymcl.runtime.keyboard;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameTextSender.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/pymcl/runtime/keyboard/QuickInputStore;", "", "file", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "gson", "Lcom/google/gson/Gson;", "load", "", "", "save", "", "list", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class QuickInputStore {
    private final File file;
    private final Gson gson;

    public QuickInputStore(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
        this.gson = new Gson();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [void] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, java.lang.String] */
    public final List<String> load() {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            QuickInputStore $this$load_u24lambda_u240 = this;
            Gson gson = $this$load_u24lambda_u240.gson;
            ?? text$default = FilesKt.readText$default($this$load_u24lambda_u240.file, null, 1, null);
            new TypeToken<List<String>>() { // from class: com.pymcl.runtime.keyboard.QuickInputStore$load$1$1
            }.getType();
            objM8116constructorimpl = Result.m8116constructorimpl((List) gson.setColumns((int) text$default));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        List<String> list = (List) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
        return list == null ? CollectionsKt.mutableListOf("/home", "/spawn", "/tpa ", "gg") : list;
    }

    public final void save(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        File parentFile = this.file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        File file = this.file;
        String json = this.gson.toJson(list);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        FilesKt.writeText$default(file, json, null, 2, null);
    }
}
