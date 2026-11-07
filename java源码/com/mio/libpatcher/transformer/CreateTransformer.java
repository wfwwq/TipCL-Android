package com.mio.libpatcher.transformer;

import javassist.CtClass;
import javassist.CtMethod;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/CreateTransformer.class */
public class CreateTransformer implements BaseTransformer {
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public String getTargetClassName() {
        return "com.simibubi.create.compat.pojav.PojavChecker";
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        CtMethod method = clazz.getDeclaredMethod("init");
        method.setBody("{}");
    }
}
