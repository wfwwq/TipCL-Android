package org.lwjgl.util.mapped;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/util/mapped/MappedSet2.class */
public class MappedSet2 {
    private final MappedObject a;
    private final MappedObject b;
    public int view;

    MappedSet2(MappedObject a, MappedObject b) {
        this.a = a;
        this.b = b;
    }

    void view(int view) {
        this.a.setViewAddress(this.a.getViewAddress(view));
        this.b.setViewAddress(this.b.getViewAddress(view));
    }

    public void next() {
        this.a.next();
        this.b.next();
    }
}
