package com.mio.libpatcher.transformer;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.expr.ExprEditor;
import javassist.expr.MethodCall;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/SableRapierLibTransformer.class */
public class SableRapierLibTransformer implements BaseTransformer {
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public String getTargetClassName() {
        return "dev.ryanhcode.sable.physics.impl.rapier.Rapier3D";
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        String override = System.getProperty("miolibpatcher.sablerapier");
        if ((override == null || Boolean.parseBoolean(override)) && System.getProperty("sable_rapier_path") != null) {
            CtMethod loadLibraryMethod = clazz.getDeclaredMethod("loadLibrary");
            loadLibraryMethod.instrument(new ExprEditor() { // from class: com.mio.libpatcher.transformer.SableRapierLibTransformer.1
                @Override // javassist.expr.ExprEditor
                public void edit(MethodCall m) throws CannotCompileException, RuntimeException {
                    if (m.getClassName().equals("java.lang.System") && m.getMethodName().equals("load")) {
                        m.replace("{    String libPath = java.lang.System.getProperty(\"sable_rapier_path\");   if (libPath != null) {       java.lang.System.load(new java.io.File(libPath).getAbsolutePath());   } else {       $_ = $proceed($$);   }}");
                    }
                }
            });
        }
    }
}
