package com.pymcl.runtime.input;

import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GamepadMapping.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/pymcl/runtime/input/GamepadMappingStore;", "", "file", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "load", "Lcom/pymcl/runtime/input/GamepadMapping;", "save", "", "m", "reset", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GamepadMappingStore {
    private final File file;

    public GamepadMappingStore(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
    }

    public final File getFile() {
        return this.file;
    }

    public final GamepadMapping load() {
        Object objM8116constructorimpl;
        if (this.file.isFile()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                GamepadMappingStore $this$load_u24lambda_u240 = this;
                objM8116constructorimpl = Result.m8116constructorimpl(GamepadMapping.INSTANCE.fromJson(FilesKt.readText$default($this$load_u24lambda_u240.file, null, 1, null)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8119exceptionOrNullimpl(objM8116constructorimpl) != null) {
                objM8116constructorimpl = GamepadMapping.INSTANCE.m8064default();
            }
            return (GamepadMapping) objM8116constructorimpl;
        }
        return GamepadMapping.INSTANCE.m8064default();
    }

    public final void save(GamepadMapping m) {
        Intrinsics.checkNotNullParameter(m, "m");
        File parentFile = this.file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        File tmp = new File(this.file.getParentFile(), this.file.getName() + ".tmp");
        FilesKt.writeText$default(tmp, m.toJson(), null, 2, null);
        if (!tmp.renameTo(this.file)) {
            this.file.delete();
            tmp.renameTo(this.file);
        }
    }

    public final GamepadMapping reset() {
        this.file.delete();
        return GamepadMapping.INSTANCE.m8064default();
    }
}
