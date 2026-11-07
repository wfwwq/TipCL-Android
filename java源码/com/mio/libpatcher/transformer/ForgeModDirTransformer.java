package com.mio.libpatcher.transformer;

import javassist.CtClass;
import javassist.CtMethod;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/ForgeModDirTransformer.class */
public class ForgeModDirTransformer implements BaseTransformer {
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public String getTargetClassName() {
        return "net.minecraftforge.fml.loading.ModDirTransformerDiscoverer";
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        CtMethod method = clazz.getDeclaredMethod("visitFile");
        method.insertBefore("{    String name = $1.getFileName().toString();\n    if (name.endsWith(\".jar\")) {\n        System.out.println(\"Loading mod: \" + name);\n    }}");
    }
}
