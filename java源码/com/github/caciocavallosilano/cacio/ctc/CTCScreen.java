package com.github.caciocavallosilano.cacio.ctc;

import com.github.caciocavallosilano.cacio.peer.WindowClippedGraphics;
import com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory;
import com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.util.List;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCScreen.class */
public class CTCScreen implements PlatformScreen {
    private BufferedImage screenBuffer;
    private static CTCScreen instance;
    private static int[] dataBufAux;

    static CTCScreen getInstance() {
        if (instance == null) {
            instance = new CTCScreen();
        }
        return instance;
    }

    private CTCScreen() {
        Dimension d = FullScreenWindowFactory.getScreenDimension();
        this.screenBuffer = new BufferedImage(d.width, d.height, 2);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen
    public ColorModel getColorModel() {
        return this.screenBuffer.getColorModel();
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen
    public GraphicsConfiguration getGraphicsConfiguration() {
        return GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen
    public Rectangle getBounds() {
        Dimension d = FullScreenWindowFactory.getScreenDimension();
        return new Rectangle(0, 0, d.width, d.height);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen
    public Graphics2D getClippedGraphics(Color fg, Color bg, Font f, List<Rectangle> clipRects) {
        Graphics2D g2d = this.screenBuffer.getGraphics();
        if (clipRects != null && clipRects.size() > 0) {
            Area a = new Area(getBounds());
            for (Rectangle clip : clipRects) {
                a.subtract(new Area(clip));
            }
            g2d = new WindowClippedGraphics(g2d, a);
        }
        return g2d;
    }

    int[] getRGBPixels(Rectangle bounds) {
        return this.screenBuffer.getRGB(bounds.x, bounds.y, bounds.width, bounds.height, (int[]) null, 0, bounds.width);
    }

    public static int[] getCurrentScreenRGB() {
        if (instance.screenBuffer == null) {
            return null;
        }
        if (dataBufAux == null) {
            dataBufAux = new int[((int) FullScreenWindowFactory.getScreenDimension().getWidth()) * ((int) FullScreenWindowFactory.getScreenDimension().getHeight())];
        }
        instance.screenBuffer.getRaster().getDataElements(0, 0, (int) FullScreenWindowFactory.getScreenDimension().getWidth(), (int) FullScreenWindowFactory.getScreenDimension().getHeight(), dataBufAux);
        return dataBufAux;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        java.lang.System.load(r0.getAbsolutePath());
     */
    static {
        /*
            java.lang.String r0 = "LD_LIBRARY_PATH"
            java.lang.String r0 = java.lang.System.getenv(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> L4b
            r6 = r0
            r0 = r6
            int r0 = r0.length     // Catch: java.lang.Throwable -> L4b
            r7 = r0
            r0 = 0
            r8 = r0
        L10:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L48
            r0 = r6
            r1 = r8
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L4b
            r9 = r0
            r0 = r9
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L25
            goto L42
        L25:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4b
            r1 = r0
            r2 = r9
            java.lang.String r3 = "libpojavexec_awt.so"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L4b
            r5 = r0
            r0 = r5
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L42
            r0 = r5
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L4b
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> L4b
            goto L48
        L42:
            int r8 = r8 + 1
            goto L10
        L48:
            goto L50
        L4b:
            r5 = move-exception
            r0 = r5
            r0.printStackTrace()
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.ctc.CTCScreen.m7497clinit():void");
    }
}
