package net.java.openjdk.cacio.ctc;

import androidx.core.view.MotionEventCompat;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import sun.awt.peer.cacio.managed.FullScreenWindowFactory;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCGraphicsConfiguration.class */
public class CTCGraphicsConfiguration extends GraphicsConfiguration {
    private CTCGraphicsDevice device;

    CTCGraphicsConfiguration(CTCGraphicsDevice dev) {
        this.device = dev;
    }

    public GraphicsDevice getDevice() {
        return this.device;
    }

    public ColorModel getColorModel() {
        return ColorModel.getRGBdefault();
    }

    public ColorModel getColorModel(int transparency) {
        switch (transparency) {
            case 1:
                return new DirectColorModel(24, 16711680, MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255);
            case 2:
                return new DirectColorModel(25, 16711680, MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255, 16777216);
            case 3:
                return ColorModel.getRGBdefault();
            default:
                return null;
        }
    }

    public AffineTransform getDefaultTransform() {
        return new AffineTransform();
    }

    public AffineTransform getNormalizingTransform() {
        return new AffineTransform();
    }

    public Rectangle getBounds() {
        Dimension d = FullScreenWindowFactory.getScreenDimension();
        return new Rectangle(0, 0, d.width, d.height);
    }

    public final boolean isTranslucencyCapable() {
        return true;
    }
}
