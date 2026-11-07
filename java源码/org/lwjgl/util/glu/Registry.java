package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/util/glu/Registry.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/util/glu/Registry.class */
public class Registry extends Util {
    private static final String versionString = "1.3";
    private static final String extensionString = "GLU_EXT_nurbs_tessellator GLU_EXT_object_space_tess ";

    public static String gluGetString(int name) {
        if (name == 100800) {
            return versionString;
        }
        if (name == 100801) {
            return extensionString;
        }
        return null;
    }

    public static boolean gluCheckExtension(String extName, String extString) {
        return (extString == null || extName == null || extString.indexOf(extName) == -1) ? false : true;
    }
}
