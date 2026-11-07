package com.mio.libpatcher.transformer;

import com.mio.libpatcher.util.LogUtil;
import java.io.ByteArrayInputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.Collections;
import java.util.List;
import javassist.ClassPool;
import javassist.CtClass;
import org.apache.commons.io.IOUtils;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/BaseTransformer.class */
public interface BaseTransformer extends ClassFileTransformer {
    public static final ClassPool pool = ClassPool.getDefault();

    void transform(CtClass ctClass) throws Throwable;

    default String getTargetClassName() {
        return "";
    }

    default List<String> getTargetClassNames() {
        String name = getTargetClassName();
        if (name.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.singletonList(name);
    }

    default byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        if (!isTargetClass(className)) {
            return classfileBuffer;
        }
        LogUtil.info("Patch target class: " + className);
        CtClass clazz = null;
        try {
            try {
                clazz = pool.makeClass(new ByteArrayInputStream(classfileBuffer));
                transform(clazz);
                byte[] bytecode = clazz.toBytecode();
                if (clazz != null) {
                    clazz.detach();
                }
                return bytecode;
            } catch (Throwable e) {
                LogUtil.error("Failed to transform class: " + className, e);
                if (clazz != null) {
                    clazz.detach();
                }
                return classfileBuffer;
            }
        } catch (Throwable th) {
            if (clazz != null) {
                clazz.detach();
            }
            throw th;
        }
    }

    default boolean isTargetClass(String className) {
        String dottedName = className.replace(IOUtils.DIR_SEPARATOR_UNIX, '.');
        if (getTargetClassName().equals(dottedName)) {
            return true;
        }
        for (String name : getTargetClassNames()) {
            if (name.equals(dottedName)) {
                return true;
            }
        }
        return false;
    }
}
