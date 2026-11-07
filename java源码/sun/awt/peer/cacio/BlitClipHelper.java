package sun.awt.peer.cacio;

import java.awt.Composite;
import sun.java2d.SurfaceData;
import sun.java2d.pipe.Region;
import sun.java2d.pipe.SpanIterator;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/BlitClipHelper.class */
public class BlitClipHelper {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/BlitClipHelper$Blitter.class */
    public interface Blitter {
        void doBlit(SurfaceData surfaceData, SurfaceData surfaceData2, Composite composite, int i, int i2, int i3, int i4, int i5, int i6);
    }

    public static void blitWithAnyClip(Blitter blitter, SurfaceData src, SurfaceData dst, Composite comp, Region clip, int sx, int sy, int dx, int dy, int w, int h) {
        if (clip == null) {
            blitWithRectangularClip(blitter, src, dst, comp, -1, -1, -1, -1, sx, sy, dx, dy, w, h);
            return;
        }
        if (clip.isRectangular()) {
            int cx = clip.getLoX();
            int cy = clip.getLoY();
            int cw = clip.getWidth();
            int ch = clip.getHeight();
            blitWithRectangularClip(blitter, src, dst, comp, cx, cy, cw, ch, sx, sy, dx, dy, w, h);
            return;
        }
        SpanIterator si = clip.getSpanIterator();
        int[] spanbox = new int[4];
        while (si.nextSpan(spanbox)) {
            int cx2 = spanbox[0];
            int cy2 = spanbox[1];
            int cw2 = spanbox[2] - spanbox[0];
            int ch2 = spanbox[3] - spanbox[1];
            blitWithRectangularClip(blitter, src, dst, comp, cx2, cy2, cw2, ch2, sx, sy, dx, dy, w, h);
        }
    }

    private static void blitWithRectangularClip(Blitter blitter, SurfaceData src, SurfaceData dst, Composite comp, int cx, int cy, int cw, int ch, int sx, int sy, int dx, int dy, int w, int h) {
        int dstX = dx;
        int dstY = dy;
        int srcX = sx;
        int srcY = sy;
        int width = w;
        int height = h;
        if (cw != -1) {
            dstX = Math.max(dstX, cx);
            dstY = Math.max(dstY, cy);
            int width2 = width - (dstX - dx);
            int height2 = height - (dstY - dy);
            srcX = (sx + w) - width2;
            srcY = (sy + h) - height2;
            int cx2 = cx + cw;
            int cy2 = cy + ch;
            int dstX2 = dstX + width2;
            int dstY2 = dstY + height2;
            int dstX22 = Math.min(cx2, dstX2);
            width = dstX22 - dstX;
            height = Math.min(cy2, dstY2) - dstY;
        }
        if (width <= 0 || height <= 0) {
            return;
        }
        blitter.doBlit(src, dst, comp, srcX, srcY, dstX, dstY, width, height);
    }
}
