package org.lwjgl.openal;

import java.util.HashMap;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/ALCdevice.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/ALCdevice.class */
public final class ALCdevice {
    final long device;
    private final HashMap<Long, ALCcontext> contexts = new HashMap<>();
    private boolean valid = true;

    ALCdevice(long device) {
        this.device = device;
    }

    public boolean equals(Object device) {
        if (device instanceof ALCdevice) {
            return ((ALCdevice) device).device == this.device;
        }
        return super.equals(device);
    }

    void addContext(ALCcontext context) {
        synchronized (this.contexts) {
            this.contexts.put(Long.valueOf(context.context), context);
        }
    }

    void removeContext(ALCcontext context) {
        synchronized (this.contexts) {
            this.contexts.remove(Long.valueOf(context.context));
        }
    }

    void setInvalid() {
        this.valid = false;
        synchronized (this.contexts) {
            for (ALCcontext context : this.contexts.values()) {
                context.setInvalid();
            }
        }
        this.contexts.clear();
    }

    public boolean isValid() {
        return this.valid;
    }
}
