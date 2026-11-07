package sun.awt.peer.cacio.managed;

import sun.awt.peer.cacio.CacioEventPump;
import sun.awt.peer.cacio.CacioEventSource;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenEventPump.class */
public class FullScreenEventPump extends CacioEventPump<EventData> {
    private CacioEventSource source;

    public FullScreenEventPump(CacioEventSource s) {
        this.source = s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sun.awt.peer.cacio.CacioEventPump
    public EventData fetchNativeEvent() throws InterruptedException {
        return this.source.getNextEvent();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sun.awt.peer.cacio.CacioEventPump
    public void dispatchNativeEvent(EventData d) {
        ManagedWindowContainer c = (ManagedWindowContainer) d.getSource();
        if (c != null) {
            c.dispatchEvent(d);
        }
    }
}
