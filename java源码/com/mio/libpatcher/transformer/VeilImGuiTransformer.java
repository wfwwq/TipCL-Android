package com.mio.libpatcher.transformer;

import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/VeilImGuiTransformer.class */
public class VeilImGuiTransformer implements BaseTransformer {
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public String getTargetClassName() {
        return "foundry.veil.impl.client.imgui.VeilImGuiImpl";
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        try {
            CtMethod loadLibraryMethod = clazz.getDeclaredMethod("setImGuiPath");
            loadLibraryMethod.setBody("{}");
        } catch (NotFoundException e) {
        }
    }
}
