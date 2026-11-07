package org.lwjgl.util.mapped;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/util/mapped/MappedSet.class */
public class MappedSet {
    public static MappedSet2 create(MappedObject a, MappedObject b) {
        return new MappedSet2(a, b);
    }

    public static MappedSet3 create(MappedObject a, MappedObject b, MappedObject c) {
        return new MappedSet3(a, b, c);
    }

    public static MappedSet4 create(MappedObject a, MappedObject b, MappedObject c, MappedObject d) {
        return new MappedSet4(a, b, c, d);
    }
}
