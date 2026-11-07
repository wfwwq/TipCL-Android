package com.mio.libpatcher.transformer;

import javassist.CtClass;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/TTSCancelTransformer.class */
public class TTSCancelTransformer implements BaseTransformer {
    private static final String HOOK = "{ try { Object lib = Class.forName(\"com.sun.jna.NativeLibrary\")   .getMethod(\"getInstance\", new Class[]{String.class}).invoke(null, new Object[]{\"flite\"}); Object fn = lib.getClass().getMethod(\"getFunction\", new Class[]{String.class}).invoke(lib, new Object[]{\"flite_cancel\"}); fn.getClass().getMethod(\"invokeVoid\", new Class[]{Object[].class}).invoke(fn, new Object[]{new Object[0]}); } catch (Throwable t) {} }";

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public String getTargetClassName() {
        return "com.mojang.text2speech.NarratorLinux";
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        if (!Boolean.parseBoolean(System.getProperty("miolibpatcher.ttsCancel", "true"))) {
            return;
        }
        clazz.getDeclaredMethod("clear").insertBefore(HOOK);
    }
}
