package com.github.caciocavallosilano.cacio.peer.managed;

import com.github.caciocavallosilano.cacio.peer.CacioEventPump;
import com.github.caciocavallosilano.cacio.peer.CacioEventSource;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenEventPump.class */
public class FullScreenEventPump extends CacioEventPump<EventData> {
    private CacioEventSource source;

    public FullScreenEventPump(CacioEventSource s) {
        this.source = s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioEventPump
    public EventData fetchNativeEvent() throws InterruptedException {
        return this.source.getNextEvent();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioEventPump
    public void dispatchNativeEvent(EventData d) {
        ManagedWindowContainer c = (ManagedWindowContainer) d.getSource();
        if (c != null) {
            c.dispatchEvent(d);
        }
    }
}
