package sun.awt.peer.cacio.managed;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sun.awt.peer.cacio.CacioComponent;
import sun.awt.peer.cacio.CacioEventPump;
import sun.awt.peer.cacio.CacioEventSource;
import sun.awt.peer.cacio.PlatformToplevelWindow;
import sun.awt.peer.cacio.PlatformWindow;
import sun.awt.peer.cacio.PlatformWindowFactory;
import sun.security.action.GetPropertyAction;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory.class */
public class FullScreenWindowFactory implements PlatformWindowFactory {
    private static final Dimension screenSize;
    private final PlatformScreenSelector selector;
    private final Map<PlatformScreen, ScreenManagedWindowContainer> screenMap;
    private CacioEventSource eventSource;

    static {
        String size = (String) AccessController.doPrivileged((PrivilegedAction) new GetPropertyAction("cacio.managed.screensize", "1024x768"));
        int x = size.indexOf(120);
        int width = Integer.parseInt(size.substring(0, x));
        int height = Integer.parseInt(size.substring(x + 1));
        screenSize = new Dimension(width, height);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory$FullScreenEventSource.class */
    private class FullScreenEventSource implements CacioEventSource {
        private FullScreenEventSource() {
        }

        @Override // sun.awt.peer.cacio.CacioEventSource
        public EventData getNextEvent() throws InterruptedException {
            EventData d = FullScreenWindowFactory.this.eventSource.getNextEvent();
            PlatformScreen source = (PlatformScreen) d.getSource();
            d.setSource(FullScreenWindowFactory.this.screenMap.get(source));
            return d;
        }
    }

    public FullScreenWindowFactory(PlatformScreen screen, CacioEventSource s) {
        this(new DefaultScreenSelector(screen), s);
    }

    public FullScreenWindowFactory(PlatformScreenSelector screenSelector, CacioEventSource s) {
        this.selector = screenSelector;
        this.eventSource = s;
        this.screenMap = Collections.synchronizedMap(new HashMap());
    }

    @Override // sun.awt.peer.cacio.PlatformWindowFactory
    public final PlatformWindow createPlatformWindow(CacioComponent awtComponent, PlatformWindow parent) {
        if (parent == null) {
            throw new IllegalArgumentException("parent cannot be null");
        }
        ManagedWindow p = (ManagedWindow) parent;
        return new ManagedWindow(p, awtComponent);
    }

    @Override // sun.awt.peer.cacio.PlatformWindowFactory
    public final PlatformToplevelWindow createPlatformToplevelWindow(CacioComponent comp) {
        PlatformScreen screen = this.selector.getPlatformScreen(comp);
        ScreenManagedWindowContainer smwc = this.screenMap.get(screen);
        if (smwc == null) {
            smwc = new ScreenManagedWindowContainer(screen);
            this.screenMap.put(screen, smwc);
        }
        return new ManagedWindow(smwc, comp);
    }

    @Override // sun.awt.peer.cacio.PlatformWindowFactory
    public PlatformWindow createPlatformToplevelWindow(CacioComponent component, PlatformWindow notUsed) {
        return createPlatformToplevelWindow(component);
    }

    @Override // sun.awt.peer.cacio.PlatformWindowFactory
    public CacioEventPump<?> createEventPump() {
        FullScreenEventSource s = new FullScreenEventSource();
        return new FullScreenEventPump(s);
    }

    public static Dimension getScreenDimension() {
        return screenSize;
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenWindowFactory$DefaultScreenSelector.class */
    private static final class DefaultScreenSelector implements PlatformScreenSelector {
        PlatformScreen screen;

        DefaultScreenSelector(PlatformScreen screen) {
            this.screen = null;
            this.screen = screen;
        }

        @Override // sun.awt.peer.cacio.managed.PlatformScreenSelector
        public PlatformScreen getPlatformScreen(GraphicsConfiguration config) {
            return this.screen;
        }

        @Override // sun.awt.peer.cacio.managed.PlatformScreenSelector
        public PlatformScreen getPlatformScreen(CacioComponent comp) {
            return getPlatformScreen(comp.getAWTComponent().getGraphicsConfiguration());
        }
    }

    public ScreenManagedWindowContainer getScreenManagedWindowContainer(PlatformScreen screen) {
        return this.screenMap.get(screen);
    }
}
