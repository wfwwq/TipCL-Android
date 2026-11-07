package net.java.openjdk.cacio.ctc;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCGraphicsDevice.class */
public class CTCGraphicsDevice extends GraphicsDevice {
    private CTCGraphicsConfiguration defaultConfig;

    public int getType() {
        return 0;
    }

    public String getIDstring() {
        return "CTCGraphicsDevice";
    }

    public GraphicsConfiguration[] getConfigurations() {
        GraphicsConfiguration[] configs = {getDefaultConfiguration()};
        return configs;
    }

    public GraphicsConfiguration getDefaultConfiguration() {
        if (this.defaultConfig == null) {
            this.defaultConfig = new CTCGraphicsConfiguration(this);
        }
        return this.defaultConfig;
    }
}
