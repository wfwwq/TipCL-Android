package org.lwjgl.util.mapped;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/util/mapped/MappedSet3.class */
public class MappedSet3 {
    private final MappedObject a;
    private final MappedObject b;
    private final MappedObject c;
    public int view;

    MappedSet3(MappedObject a, MappedObject b, MappedObject c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void view(int view) {
        this.a.setViewAddress(this.a.getViewAddress(view));
        this.b.setViewAddress(this.b.getViewAddress(view));
        this.c.setViewAddress(this.c.getViewAddress(view));
    }

    public void next() {
        this.a.next();
        this.b.next();
        this.c.next();
    }
}
