package com.mio.libpatcher.transformer;

import javassist.CtClass;
import javassist.CtMethod;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/RandomPatchesTransformer.class */
public class RandomPatchesTransformer implements BaseTransformer {
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public String getTargetClassName() {
        return "com.therandomlabs.randompatches.client.WindowIconHandler";
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        CtMethod method = clazz.getDeclaredMethod("setWindowIcon", new CtClass[0]);
        method.setBody("{}");
    }
}
