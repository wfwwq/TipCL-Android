package com.github.caciocavallosilano.cacio.ctc;

import com.github.caciocavallosilano.cacio.peer.CacioToolkit;
import com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory;
import com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory;
import java.awt.AWTException;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Point;
import java.awt.PrintJob;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.dnd.peer.DragSourceContextPeer;
import java.awt.font.TextAttribute;
import java.awt.im.InputMethodHighlight;
import java.awt.im.spi.InputMethodDescriptor;
import java.awt.image.ColorModel;
import java.awt.peer.DesktopPeer;
import java.awt.peer.FontPeer;
import java.awt.peer.FramePeer;
import java.awt.peer.RobotPeer;
import java.awt.peer.SystemTrayPeer;
import java.awt.peer.TrayIconPeer;
import java.util.Map;
import java.util.Properties;
import sun.awt.LightweightFrame;
import sun.awt.datatransfer.DataTransferer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCToolkit.class */
public class CTCToolkit extends CacioToolkit {
    private PlatformWindowFactory platformWindowFactory;

    public CTCToolkit() {
        System.setProperty("swing.defaultlaf", "javax.swing.plaf.nimbus.NimbusLookAndFeel");
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioToolkit
    public PlatformWindowFactory getPlatformWindowFactory() {
        if (this.platformWindowFactory == null) {
            CTCScreen screen = CTCScreen.getInstance();
            CTCEventSource eventSource = CTCEventSource.getInstance();
            this.platformWindowFactory = new FullScreenWindowFactory(screen, eventSource);
        }
        return this.platformWindowFactory;
    }

    public InputMethodDescriptor getInputMethodAdapterDescriptor() throws AWTException {
        return null;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioToolkit
    public Clipboard getSystemClipboard() {
        return CTCClipboard.INSTANCE;
    }

    public DragSourceContextPeer createDragSourceContextPeer(DragGestureEvent dge) throws InvalidDnDOperationException {
        return null;
    }

    public TrayIconPeer createTrayIcon(TrayIcon target) throws AWTException, HeadlessException {
        return null;
    }

    public SystemTrayPeer createSystemTray(SystemTray target) {
        return null;
    }

    public boolean isTraySupported() {
        return false;
    }

    public FontPeer getFontPeer(String name, int style) {
        return null;
    }

    public RobotPeer createRobot(GraphicsDevice screen) throws AWTException {
        return new CTCRobotPeer(Boolean.parseBoolean(System.getProperty("com.github.caciocavallosilano.cacio.ctc.CTCToolkit.enableInfdevMouseHandler", "true")));
    }

    protected int getScreenWidth() {
        return FullScreenWindowFactory.getScreenDimension().width;
    }

    protected int getScreenHeight() {
        return FullScreenWindowFactory.getScreenDimension().height;
    }

    protected boolean syncNativeQueue(long timeout) {
        return false;
    }

    public void grab(Window w) {
    }

    public void ungrab(Window w) {
    }

    public boolean isDesktopSupported() {
        return true;
    }

    public DesktopPeer createDesktopPeer(Desktop target) throws HeadlessException {
        return new CTCDesktopPeer();
    }

    public ColorModel getColorModel() throws HeadlessException {
        return null;
    }

    public void sync() {
    }

    public PrintJob getPrintJob(Frame frame, String jobtitle, Properties props) {
        return null;
    }

    public void beep() {
    }

    public Map<TextAttribute, ?> mapInputMethodHighlight(InputMethodHighlight highlight) throws HeadlessException {
        return null;
    }

    public FramePeer createLightweightFrame(LightweightFrame lightweightFrame) throws HeadlessException {
        return null;
    }

    public DataTransferer getDataTransferer() {
        return null;
    }

    public boolean isWindowOpacitySupported() {
        return true;
    }

    public boolean isWindowShapingSupported() {
        return true;
    }

    public boolean isWindowTranslucencySupported() {
        return true;
    }

    public boolean isTranslucencyCapable(GraphicsConfiguration gc) {
        return true;
    }

    public boolean isTaskbarSupported() {
        return false;
    }

    public Cursor createCustomCursor(Image cursor, Point hotSpot, String name) {
        System.out.println("cursor=" + ((Object) String.valueOf(cursor)) + " hotspot=" + ((Object) hotSpot.toString()) + " name=" + ((Object) name));
        return new Cursor(0);
    }
}
