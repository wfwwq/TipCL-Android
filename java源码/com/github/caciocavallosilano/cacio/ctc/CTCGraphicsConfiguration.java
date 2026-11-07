package com.github.caciocavallosilano.cacio.ctc;

import com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCGraphicsConfiguration.class */
public class CTCGraphicsConfiguration extends GraphicsConfiguration {
    private final ColorModel model;
    private final Raster raster;
    private CTCGraphicsDevice device;

    CTCGraphicsConfiguration(CTCGraphicsDevice dev) {
        BufferedImage bufferedImage = new BufferedImage(FullScreenWindowFactory.getScreenDimension().width, FullScreenWindowFactory.getScreenDimension().height, 2);
        this.device = dev;
        this.model = bufferedImage.getColorModel();
        this.raster = bufferedImage.getRaster().createCompatibleWritableRaster(1, 1);
    }

    public GraphicsDevice getDevice() {
        return this.device;
    }

    public ColorModel getColorModel() {
        return ColorModel.getRGBdefault();
    }

    public ColorModel getColorModel(int transparency) {
        return ColorModel.getRGBdefault();
    }

    public Rectangle getBounds() {
        Dimension d = FullScreenWindowFactory.getScreenDimension();
        return new Rectangle(0, 0, d.width, d.height);
    }

    public BufferedImage createCompatibleImage(int width, int height) {
        WritableRaster wr = this.raster.createCompatibleWritableRaster(width, height);
        return new BufferedImage(this.model, wr, this.model.isAlphaPremultiplied(), (Hashtable) null);
    }

    public AffineTransform getDefaultTransform() {
        return AffineTransform.getScaleInstance(1.0d, 1.0d);
    }

    public AffineTransform getNormalizingTransform() {
        return new AffineTransform();
    }
}
