package com.github.caciocavallosilano.cacio.peer;

import com.github.caciocavallosilano.cacio.peer.managed.EventData;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioEventSource.class */
public interface CacioEventSource {
    EventData getNextEvent() throws InterruptedException;
}
