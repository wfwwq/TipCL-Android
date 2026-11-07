package com.github.caciocavallosilano.cacio.peer.managed;

import com.github.caciocavallosilano.cacio.peer.CacioComponent;
import com.github.caciocavallosilano.cacio.peer.CacioEventPump;
import com.github.caciocavallosilano.cacio.peer.CacioEventSource;
import com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow;
import com.github.caciocavallosilano.cacio.peer.PlatformWindow;
import com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.security.AccessController;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory.class */
public class FullScreenWindowFactory implements PlatformWindowFactory {
    private static final Dimension screenSize;
    private final PlatformScreenSelector selector;
    private final Map<PlatformScreen, ScreenManagedWindowContainer> screenMap;
    private CacioEventSource eventSource;

    static {
        String size = (String) AccessController.doPrivileged(() -> {
            return System.getProperty("cacio.managed.screensize", "1714x864");
        });
        int x = size.indexOf(120);
        int width = Integer.parseInt(size.substring(0, x));
        int height = Integer.parseInt(size.substring(x + 1));
        screenSize = new Dimension(width, height);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory$FullScreenEventSource.class */
    private class FullScreenEventSource implements CacioEventSource {
        private FullScreenEventSource() {
        }

        @Override // com.github.caciocavallosilano.cacio.peer.CacioEventSource
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

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory
    public final PlatformWindow createPlatformWindow(CacioComponent awtComponent, PlatformWindow parent) {
        if (parent == null) {
            throw new IllegalArgumentException("parent cannot be null");
        }
        ManagedWindow p = (ManagedWindow) parent;
        return new ManagedWindow(p, awtComponent);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory
    public final PlatformToplevelWindow createPlatformToplevelWindow(CacioComponent comp) {
        PlatformScreen screen = this.selector.getPlatformScreen(comp);
        ScreenManagedWindowContainer smwc = this.screenMap.get(screen);
        if (smwc == null) {
            smwc = new ScreenManagedWindowContainer(screen);
            this.screenMap.put(screen, smwc);
        }
        return new ManagedWindow(smwc, comp);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory
    public PlatformWindow createPlatformToplevelWindow(CacioComponent component, PlatformWindow notUsed) {
        return createPlatformToplevelWindow(component);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory
    public CacioEventPump<?> createEventPump() {
        FullScreenEventSource s = new FullScreenEventSource();
        return new FullScreenEventPump(s);
    }

    public static Dimension getScreenDimension() {
        return screenSize;
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenWindowFactory$DefaultScreenSelector.class */
    private static final class DefaultScreenSelector implements PlatformScreenSelector {
        PlatformScreen screen;

        DefaultScreenSelector(PlatformScreen screen) {
            this.screen = null;
            this.screen = screen;
        }

        @Override // com.github.caciocavallosilano.cacio.peer.managed.PlatformScreenSelector
        public PlatformScreen getPlatformScreen(GraphicsConfiguration config) {
            return this.screen;
        }

        @Override // com.github.caciocavallosilano.cacio.peer.managed.PlatformScreenSelector
        public PlatformScreen getPlatformScreen(CacioComponent comp) {
            return getPlatformScreen(comp.getAWTComponent().getGraphicsConfiguration());
        }
    }

    public ScreenManagedWindowContainer getScreenManagedWindowContainer(PlatformScreen screen) {
        return this.screenMap.get(screen);
    }
}
