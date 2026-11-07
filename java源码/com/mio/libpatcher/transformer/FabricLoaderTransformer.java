package com.mio.libpatcher.transformer;

import javassist.CtClass;
import javassist.CtMethod;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/FabricLoaderTransformer.class */
public class FabricLoaderTransformer implements BaseTransformer {
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public String getTargetClassName() {
        return "net.fabricmc.loader.impl.gui.FabricGuiEntry";
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        CtMethod[] methods = clazz.getDeclaredMethods("displayError");
        if (methods != null) {
            for (CtMethod method : methods) {
                method.setBody("{System.out.println(\"start net.fabricmc.loader.impl.gui.FabricGuiEntry.displayError\");System.out.println($1);System.out.println($2);System.out.println(\"end net.fabricmc.loader.impl.gui.FabricGuiEntry.displayError\"); System.exit(1);}");
            }
        }
    }
}
