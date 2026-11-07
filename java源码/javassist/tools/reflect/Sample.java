package javassist.tools.reflect;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/tools/reflect/Sample.class */
public class Sample {
    private Metaobject _metaobject;
    private static ClassMetaobject _classobject;

    public Object trap(Object[] args, int identifier) throws Throwable {
        Metaobject mobj = this._metaobject;
        if (mobj == null) {
            return ClassMetaobject.invoke(this, identifier, args);
        }
        return mobj.trapMethodcall(identifier, args);
    }

    public static Object trapStatic(Object[] args, int identifier) throws Throwable {
        return _classobject.trapMethodcall(identifier, args);
    }

    public static Object trapRead(Object[] args, String name) {
        if (args[0] == null) {
            return _classobject.trapFieldRead(name);
        }
        return ((Metalevel) args[0])._getMetaobject().trapFieldRead(name);
    }

    public static Object trapWrite(Object[] args, String name) throws IllegalAccessException, IllegalArgumentException {
        Metalevel base = (Metalevel) args[0];
        if (base == null) {
            _classobject.trapFieldWrite(name, args[1]);
            return null;
        }
        base._getMetaobject().trapFieldWrite(name, args[1]);
        return null;
    }
}
