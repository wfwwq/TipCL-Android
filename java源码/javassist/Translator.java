package javassist;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/Translator.class */
public interface Translator {
    void start(ClassPool classPool) throws CannotCompileException, NotFoundException;

    void onLoad(ClassPool classPool, String str) throws CannotCompileException, NotFoundException;
}
