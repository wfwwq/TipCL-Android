package javassist;

import java.io.InputStream;
import java.net.URL;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/ClassPath.class */
public interface ClassPath {
    InputStream openClassfile(String str) throws NotFoundException;

    URL find(String str);
}
