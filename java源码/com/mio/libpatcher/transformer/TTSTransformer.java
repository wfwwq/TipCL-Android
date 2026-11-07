package com.mio.libpatcher.transformer;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtMethod;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/TTSTransformer.class */
public class TTSTransformer implements BaseTransformer {
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public String getTargetClassName() {
        return "com.mojang.text2speech.Narrator";
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        if (!Boolean.parseBoolean(System.getProperty("miolibpatcher.ttsDisable", "false"))) {
            return;
        }
        CtMethod method = clazz.getDeclaredMethod("getNarrator");
        try {
            method.setBody("{ return new com.mojang.text2speech.NarratorDummy(); }");
        } catch (CannotCompileException e) {
            method.setBody("{ return EMPTY; }");
        }
    }
}
