package com.mio.libpatcher.util;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/util/LogUtil.class */
public class LogUtil {
    private static final PrintStream out = System.out;

    public static void info(String str) {
        out.println("[MioLibPatcher/INFO]: " + str);
    }

    public static void error(String str) {
        out.println("[MioLibPatcher/ERROR]: " + str);
    }

    public static void error(String str, Throwable e) {
        out.println("[MioLibPatcher/ERROR]: " + str);
        out.println(getStackTrace(e));
    }

    private static String getStackTrace(Throwable e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }
}
