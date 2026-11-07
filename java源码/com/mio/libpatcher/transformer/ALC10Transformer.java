package com.mio.libpatcher.transformer;

import javassist.CtClass;
import javassist.CtMethod;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/ALC10Transformer.class */
public class ALC10Transformer implements BaseTransformer {
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public String getTargetClassName() {
        return "org.lwjgl.openal.ALC10";
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        if (Boolean.parseBoolean(System.getProperty("miolibpatcher.alc10", "false"))) {
            CtMethod oldMethod = clazz.getDeclaredMethod("alcGetCurrentContext");
            CtMethod newMethod = CtMethod.make("public static org.lwjgl.openal.ALCcontext alcGetCurrentContext() {   return alcContext;}", clazz);
            clazz.removeMethod(oldMethod);
            clazz.addMethod(newMethod);
        }
    }
}
