package mio;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLaunchWrapper.jar:mio/Wrapper.class */
public class Wrapper {
    public static void main(String[] args) {
        try {
            boolean debug = Boolean.parseBoolean(System.getProperty("mioWrapper.debug", "false"));
            Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass(args[0]);
            Method main = clazz.getDeclaredMethod("main", String[].class);
            main.setAccessible(true);
            String[] copy = (String[]) Arrays.copyOfRange(args, 1, args.length);
            if (debug) {
                for (String s : copy) {
                    System.out.println("MioWrapperDebug: " + s);
                }
            }
            main.invoke(null, copy);
        } catch (Throwable e) {
            System.out.println(getStackTraceInfo(e));
            System.exit(1);
        }
    }

    public static String getStackTraceInfo(Throwable e) throws IOException {
        try {
            StringWriter sw = new StringWriter();
            Throwable th = null;
            try {
                PrintWriter pw = new PrintWriter(sw);
                Throwable th2 = null;
                try {
                    try {
                        e.printStackTrace(pw);
                        pw.flush();
                        sw.flush();
                        String string = sw.toString();
                        if (pw != null) {
                            if (0 != 0) {
                                try {
                                    pw.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            } else {
                                pw.close();
                            }
                        }
                        return string;
                    } finally {
                    }
                } catch (Throwable th4) {
                    if (pw != null) {
                        if (th2 != null) {
                            try {
                                pw.close();
                            } catch (Throwable th5) {
                                th2.addSuppressed(th5);
                            }
                        } else {
                            pw.close();
                        }
                    }
                    throw th4;
                }
            } finally {
                if (sw != null) {
                    if (0 != 0) {
                        try {
                            sw.close();
                        } catch (Throwable th6) {
                            th.addSuppressed(th6);
                        }
                    } else {
                        sw.close();
                    }
                }
            }
        } catch (Exception ex) {
            return "Error/发生错误:" + ex;
        }
    }
}
