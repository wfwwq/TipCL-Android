package com.github.caciocavallosilano.cacio.ctc.junit;

import com.github.caciocavallosilano.cacio.ctc.CTCGraphicsEnvironment;
import com.github.caciocavallosilano.cacio.ctc.CTCToolkit;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import javax.swing.plaf.metal.MetalLookAndFeel;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/junit/CacioTestRunner.class */
public class CacioTestRunner extends BlockJUnit4ClassRunner {
    private static final VarHandle MODIFIERS;

    static {
        try {
            MethodHandles.Lookup lookup = MethodHandles.privateLookupIn(Field.class, MethodHandles.lookup());
            MODIFIERS = lookup.findVarHandle(Field.class, "modifiers", Integer.TYPE);
            try {
                Field toolkit = Toolkit.class.getDeclaredField("toolkit");
                toolkit.setAccessible(true);
                toolkit.set(null, new CTCToolkit());
                Field defaultHeadlessField = GraphicsEnvironment.class.getDeclaredField("defaultHeadless");
                defaultHeadlessField.setAccessible(true);
                defaultHeadlessField.set(null, Boolean.TRUE);
                Field headlessField = GraphicsEnvironment.class.getDeclaredField("headless");
                headlessField.setAccessible(true);
                headlessField.set(null, Boolean.TRUE);
                Class<?> geCls = Class.forName("java.awt.GraphicsEnvironment$LocalGE");
                Field ge = geCls.getDeclaredField("INSTANCE");
                ge.setAccessible(true);
                defaultHeadlessField.set(null, Boolean.FALSE);
                headlessField.set(null, Boolean.FALSE);
                makeNonFinal(ge);
                Class<?> smfCls = Class.forName("sun.java2d.SurfaceManagerFactory");
                Field smf = smfCls.getDeclaredField("instance");
                smf.setAccessible(true);
                smf.set(null, null);
                ge.set(null, new CTCGraphicsEnvironment());
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.setProperty("swing.defaultlaf", MetalLookAndFeel.class.getName());
        } catch (IllegalAccessException | NoSuchFieldException ex) {
            throw new RuntimeException(ex);
        }
    }

    public CacioTestRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    public static void makeNonFinal(Field field) {
        int mods = field.getModifiers();
        if (Modifier.isFinal(mods)) {
            MODIFIERS.set(field, mods & (-17));
        }
    }
}
