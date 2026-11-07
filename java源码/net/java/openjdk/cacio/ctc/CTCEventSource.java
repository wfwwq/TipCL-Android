package net.java.openjdk.cacio.ctc;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import sun.awt.peer.cacio.CacioEventSource;
import sun.awt.peer.cacio.managed.EventData;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCEventSource.class */
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

    @Override // sun.awt.peer.cacio.CacioEventSource
    public EventData getNextEvent() throws InterruptedException {
        return this.queue.take();
    }

    void postEvent(EventData ev) {
        this.queue.offer(ev);
    }
}
