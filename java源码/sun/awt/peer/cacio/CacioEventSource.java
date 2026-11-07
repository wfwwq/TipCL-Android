package sun.awt.peer.cacio;

import sun.awt.peer.cacio.managed.EventData;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioEventSource.class */
public interface CacioEventSource {
    EventData getNextEvent() throws InterruptedException;
}
