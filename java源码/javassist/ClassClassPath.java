package javassist;

import java.io.InputStream;
import java.net.URL;
import org.apache.commons.io.IOUtils;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/ClassClassPath.class */
public class ClassClassPath implements ClassPath {
    private Class<?> thisClass;

    public ClassClassPath(Class<?> c) {
        this.thisClass = c;
    }

    ClassClassPath() {
        this(Object.class);
    }

    @Override // javassist.ClassPath
    public InputStream openClassfile(String classname) throws NotFoundException {
        String filename = IOUtils.DIR_SEPARATOR_UNIX + classname.replace('.', IOUtils.DIR_SEPARATOR_UNIX) + ".class";
        return this.thisClass.getResourceAsStream(filename);
    }

    @Override // javassist.ClassPath
    public URL find(String classname) {
        String filename = IOUtils.DIR_SEPARATOR_UNIX + classname.replace('.', IOUtils.DIR_SEPARATOR_UNIX) + ".class";
        return this.thisClass.getResource(filename);
    }

    public String toString() {
        return this.thisClass.getName() + ".class";
    }
}
