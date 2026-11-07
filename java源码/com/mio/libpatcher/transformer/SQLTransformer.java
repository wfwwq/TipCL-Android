package com.mio.libpatcher.transformer;

import java.util.ArrayList;
import java.util.List;
import javassist.CtClass;
import javassist.CtMethod;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/SQLTransformer.class */
public class SQLTransformer implements BaseTransformer {
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public List<String> getTargetClassNames() {
        List<String> list = new ArrayList<>();
        list.add("dh_sqlite.util.OSInfo");
        list.add("org.rfresh.sqlite.util.OSInfo");
        list.add("org.sqlite.util.OSInfo");
        list.add("io.netty.util.internal.PlatformDependent");
        return list;
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        CtMethod method = clazz.getDeclaredMethod("isAndroid");
        method.setBody("{return true;}");
    }
}
