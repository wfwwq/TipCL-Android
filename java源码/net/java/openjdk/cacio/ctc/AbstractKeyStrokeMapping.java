package net.java.openjdk.cacio.ctc;

import java.awt.AWTKeyStroke;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.SystemProperties;
import org.lwjgl.LWJGLUtil;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/AbstractKeyStrokeMapping.class */
abstract class AbstractKeyStrokeMapping implements KeyStrokeMapping {
    static final int NO_MASK = 0;

    AbstractKeyStrokeMapping() {
    }

    Map<AWTKeyStroke, Character> getDefaultMap() {
        Map<AWTKeyStroke, Character> map = new HashMap<>();
        map.put(keyStroke(8, 0), '\b');
        map.put(keyStroke(127, 0), (char) 127);
        map.put(keyStroke(10, 0), '\n');
        if (isWindows()) {
            map.put(keyStroke(10, 0), Character.valueOf(CharUtils.CR));
        }
        map.put(keyStroke(27, 0), (char) 27);
        map.put(keyStroke(9, 0), '\t');
        return map;
    }

    AWTKeyStroke keyStroke(int keyCode, int modifiers) {
        return AWTKeyStroke.getAWTKeyStroke(keyCode, modifiers);
    }

    static boolean isWindows() {
        return System.getProperty(SystemProperties.OS_NAME).toLowerCase().contains(LWJGLUtil.PLATFORM_WINDOWS_NAME);
    }
}
