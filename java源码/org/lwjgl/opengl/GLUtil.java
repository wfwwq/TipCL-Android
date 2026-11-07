package org.lwjgl.opengl;

import java.io.PrintStream;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLUtil.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLUtil.class */
public final class GLUtil {
    private GLUtil() {
    }

    public static Callback setupDebugMessageCallback() {
        return setupDebugMessageCallback(APIUtil.DEBUG_STREAM);
    }

    public static Callback setupDebugMessageCallback(PrintStream stream) {
        GLCapabilities caps = GL.getCapabilities();
        if (caps.OpenGL43) {
            APIUtil.apiLog("[GL] Using OpenGL 4.3 for error logging.");
            GLDebugMessageCallback proc = GLDebugMessageCallback.create((source, type, id, severity, length, message, userParam) -> {
                StringBuilder sb = new StringBuilder(300);
                sb.append("[LWJGL] OpenGL debug message\n");
                printDetail(sb, "ID", "0x" + Integer.toHexString(id).toUpperCase());
                printDetail(sb, "Source", getDebugSource(source));
                printDetail(sb, "Type", getDebugType(type));
                printDetail(sb, "Severity", getDebugSeverity(severity));
                printDetail(sb, "Message", GLDebugMessageCallback.getMessage(length, message));
                stream.print(sb);
            });
            GL43C.glDebugMessageCallback(proc, 0L);
            if ((GL43C.glGetInteger(33310) & 2) == 0) {
                APIUtil.apiLog("[GL] Warning: A non-debug context may not produce any debug output.");
                GL43C.glEnable(37600);
            }
            return proc;
        }
        if (caps.GL_KHR_debug) {
            APIUtil.apiLog("[GL] Using KHR_debug for error logging.");
            GLDebugMessageCallback proc2 = GLDebugMessageCallback.create((source2, type2, id2, severity2, length2, message2, userParam2) -> {
                StringBuilder sb = new StringBuilder(300);
                sb.append("[LWJGL] OpenGL debug message\n");
                printDetail(sb, "ID", "0x" + Integer.toHexString(id2).toUpperCase());
                printDetail(sb, "Source", getDebugSource(source2));
                printDetail(sb, "Type", getDebugType(type2));
                printDetail(sb, "Severity", getDebugSeverity(severity2));
                printDetail(sb, "Message", GLDebugMessageCallback.getMessage(length2, message2));
                stream.print(sb);
            });
            KHRDebug.glDebugMessageCallback(proc2, 0L);
            if (caps.OpenGL30 && (GL43C.glGetInteger(33310) & 2) == 0) {
                APIUtil.apiLog("[GL] Warning: A non-debug context may not produce any debug output.");
                GL43C.glEnable(37600);
            }
            return proc2;
        }
        if (caps.GL_ARB_debug_output) {
            APIUtil.apiLog("[GL] Using ARB_debug_output for error logging.");
            GLDebugMessageARBCallback proc3 = GLDebugMessageARBCallback.create((source3, type3, id3, severity3, length3, message3, userParam3) -> {
                StringBuilder sb = new StringBuilder(300);
                sb.append("[LWJGL] ARB_debug_output message\n");
                printDetail(sb, "ID", "0x" + Integer.toHexString(id3).toUpperCase());
                printDetail(sb, "Source", getSourceARB(source3));
                printDetail(sb, "Type", getTypeARB(type3));
                printDetail(sb, "Severity", getSeverityARB(severity3));
                printDetail(sb, "Message", GLDebugMessageARBCallback.getMessage(length3, message3));
                stream.print(sb);
            });
            ARBDebugOutput.glDebugMessageCallbackARB(proc3, 0L);
            return proc3;
        }
        if (caps.GL_AMD_debug_output) {
            APIUtil.apiLog("[GL] Using AMD_debug_output for error logging.");
            GLDebugMessageAMDCallback proc4 = GLDebugMessageAMDCallback.create((id4, category, severity4, length4, message4, userParam4) -> {
                StringBuilder sb = new StringBuilder(300);
                sb.append("[LWJGL] AMD_debug_output message\n");
                printDetail(sb, "ID", "0x" + Integer.toHexString(id4).toUpperCase());
                printDetail(sb, "Category", getCategoryAMD(category));
                printDetail(sb, "Severity", getSeverityAMD(severity4));
                printDetail(sb, "Message", GLDebugMessageAMDCallback.getMessage(length4, message4));
                stream.print(sb);
            });
            AMDDebugOutput.glDebugMessageCallbackAMD(proc4, 0L);
            return proc4;
        }
        APIUtil.apiLog("[GL] No debug output implementation is available.");
        return null;
    }

    private static void printDetail(StringBuilder sb, String type, String message) {
        sb.append("\t").append(type).append(": ").append(message).append(StringUtils.LF);
    }

    private static String getDebugSource(int source) {
        switch (source) {
            case 33350:
                return "API";
            case 33351:
                return "WINDOW SYSTEM";
            case 33352:
                return "SHADER COMPILER";
            case 33353:
                return "THIRD PARTY";
            case 33354:
                return "APPLICATION";
            case 33355:
                return "OTHER";
            default:
                return APIUtil.apiUnknownToken(source);
        }
    }

    private static String getDebugType(int type) {
        switch (type) {
            case 33356:
                return "ERROR";
            case 33357:
                return "DEPRECATED BEHAVIOR";
            case 33358:
                return "UNDEFINED BEHAVIOR";
            case 33359:
                return "PORTABILITY";
            case 33360:
                return "PERFORMANCE";
            case 33361:
                return "OTHER";
            case 33384:
                return "MARKER";
            default:
                return APIUtil.apiUnknownToken(type);
        }
    }

    private static String getDebugSeverity(int severity) {
        switch (severity) {
            case 33387:
                return "NOTIFICATION";
            case 37190:
                return "HIGH";
            case 37191:
                return "MEDIUM";
            case 37192:
                return "LOW";
            default:
                return APIUtil.apiUnknownToken(severity);
        }
    }

    private static String getSourceARB(int source) {
        switch (source) {
            case 33350:
                return "API";
            case 33351:
                return "WINDOW SYSTEM";
            case 33352:
                return "SHADER COMPILER";
            case 33353:
                return "THIRD PARTY";
            case 33354:
                return "APPLICATION";
            case 33355:
                return "OTHER";
            default:
                return APIUtil.apiUnknownToken(source);
        }
    }

    private static String getTypeARB(int type) {
        switch (type) {
            case 33356:
                return "ERROR";
            case 33357:
                return "DEPRECATED BEHAVIOR";
            case 33358:
                return "UNDEFINED BEHAVIOR";
            case 33359:
                return "PORTABILITY";
            case 33360:
                return "PERFORMANCE";
            case 33361:
                return "OTHER";
            default:
                return APIUtil.apiUnknownToken(type);
        }
    }

    private static String getSeverityARB(int severity) {
        switch (severity) {
            case 37190:
                return "HIGH";
            case 37191:
                return "MEDIUM";
            case 37192:
                return "LOW";
            default:
                return APIUtil.apiUnknownToken(severity);
        }
    }

    private static String getCategoryAMD(int category) {
        switch (category) {
            case AMDDebugOutput.GL_DEBUG_CATEGORY_API_ERROR_AMD /* 37193 */:
                return "API ERROR";
            case AMDDebugOutput.GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD /* 37194 */:
                return "WINDOW SYSTEM";
            case AMDDebugOutput.GL_DEBUG_CATEGORY_DEPRECATION_AMD /* 37195 */:
                return "DEPRECATION";
            case AMDDebugOutput.GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD /* 37196 */:
                return "UNDEFINED BEHAVIOR";
            case AMDDebugOutput.GL_DEBUG_CATEGORY_PERFORMANCE_AMD /* 37197 */:
                return "PERFORMANCE";
            case AMDDebugOutput.GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD /* 37198 */:
                return "SHADER COMPILER";
            case AMDDebugOutput.GL_DEBUG_CATEGORY_APPLICATION_AMD /* 37199 */:
                return "APPLICATION";
            case AMDDebugOutput.GL_DEBUG_CATEGORY_OTHER_AMD /* 37200 */:
                return "OTHER";
            default:
                return APIUtil.apiUnknownToken(category);
        }
    }

    private static String getSeverityAMD(int severity) {
        switch (severity) {
            case 37190:
                return "HIGH";
            case 37191:
                return "MEDIUM";
            case 37192:
                return "LOW";
            default:
                return APIUtil.apiUnknownToken(severity);
        }
    }
}
