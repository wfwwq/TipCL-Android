package com.github.caciocavallosilano.cacio.ctc;

import com.github.caciocavallosilano.cacio.peer.CacioEventSource;
import com.github.caciocavallosilano.cacio.peer.managed.EventData;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCEventSource.class */
public class CTCEventSource implements CacioEventSource {
    private static CTCEventSource instance;
    private BlockingQueue<EventData> queue = new LinkedBlockingQueue();

    static CTCEventSource getInstance() {
        if (instance == null) {
            instance = new CTCEventSource();
        }
        return instance;
    }

    private CTCEventSource() {
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioEventSource
    public EventData getNextEvent() throws InterruptedException {
        return this.queue.take();
    }

    void postEvent(EventData ev) {
        this.queue.offer(ev);
    }
}
