package com.mio.libpatcher.transformer;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.expr.ExprEditor;
import javassist.expr.MethodCall;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/AxiomTransformer.class */
public class AxiomTransformer implements BaseTransformer {
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public String getTargetClassName() {
        return "imgui.moulberry92.ImGui";
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        CtConstructor constructor = clazz.getClassInitializer();
        constructor.instrument(new ExprEditor() { // from class: com.mio.libpatcher.transformer.AxiomTransformer.1
            @Override // javassist.expr.ExprEditor
            public void edit(MethodCall m) throws CannotCompileException, RuntimeException {
                if (m.getClassName().equals("java.lang.System") && m.getMethodName().equals("load")) {
                    m.replace("{    String path = System.getProperty(\"imgui.library.path\");   String name = System.getProperty(\"imgui.library.name\");   if (path != null && name != null) {          System.load(new java.io.File(path, name).getAbsolutePath());   } else {          $_ = $proceed($$);   }}");
                }
            }
        });
    }
}
