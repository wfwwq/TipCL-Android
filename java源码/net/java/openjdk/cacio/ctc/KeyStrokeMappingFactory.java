package net.java.openjdk.cacio.ctc;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/KeyStrokeMappingFactory.class */
class KeyStrokeMappingFactory {
    private static KeyStrokeMappingFactory instance = new KeyStrokeMappingFactory();
    private Map<String, KeyStrokeMapping> maps = new HashMap();

    KeyStrokeMappingFactory() {
    }

    static KeyStrokeMappingFactory getInstance() {
        return instance;
    }

    KeyStrokeMapping getKeyStrokeMapping() {
        String lang = Locale.getDefault().getCountry().toLowerCase();
        KeyStrokeMapping mapping = this.maps.get(lang);
        if (mapping == null) {
            if (lang.equals("de")) {
                mapping = new KeyStrokeMappingDE();
            } else {
                mapping = new KeyStrokeMappingEN();
            }
            this.maps.put(lang, mapping);
        }
        return mapping;
    }
}
