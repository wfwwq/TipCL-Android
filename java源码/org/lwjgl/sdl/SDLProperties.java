package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLProperties.class */
public class SDLProperties {
    public static final int SDL_PROPERTY_TYPE_INVALID = 0;
    public static final int SDL_PROPERTY_TYPE_POINTER = 1;
    public static final int SDL_PROPERTY_TYPE_STRING = 2;
    public static final int SDL_PROPERTY_TYPE_NUMBER = 3;
    public static final int SDL_PROPERTY_TYPE_FLOAT = 4;
    public static final int SDL_PROPERTY_TYPE_BOOLEAN = 5;
    public static final String SDL_PROP_NAME_STRING = "SDL.name";

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLProperties$Functions.class */
    public static final class Functions {
        public static final long GetGlobalProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGlobalProperties");
        public static final long CreateProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateProperties");
        public static final long CopyProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CopyProperties");
        public static final long LockProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LockProperties");
        public static final long UnlockProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnlockProperties");
        public static final long SetPointerPropertyWithCleanup = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetPointerPropertyWithCleanup");
        public static final long SetPointerProperty = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetPointerProperty");
        public static final long SetStringProperty = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetStringProperty");
        public static final long SetNumberProperty = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetNumberProperty");
        public static final long SetFloatProperty = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetFloatProperty");
        public static final long SetBooleanProperty = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetBooleanProperty");
        public static final long HasProperty = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasProperty");
        public static final long GetPropertyType = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPropertyType");
        public static final long GetPointerProperty = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPointerProperty");
        public static final long GetStringProperty = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetStringProperty");
        public static final long GetNumberProperty = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumberProperty");
        public static final long GetFloatProperty = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetFloatProperty");
        public static final long GetBooleanProperty = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetBooleanProperty");
        public static final long ClearProperty = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClearProperty");
        public static final long EnumerateProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EnumerateProperties");
        public static final long DestroyProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyProperties");

        private Functions() {
        }
    }

    protected SDLProperties() {
        throw new UnsupportedOperationException();
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetGlobalProperties() {
        long __functionAddress = Functions.GetGlobalProperties;
        return JNI.invokeI(__functionAddress);
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_CreateProperties() {
        long __functionAddress = Functions.CreateProperties;
        return JNI.invokeI(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_CopyProperties(@NativeType("SDL_PropertiesID") int src, @NativeType("SDL_PropertiesID") int dst) {
        long __functionAddress = Functions.CopyProperties;
        return JNI.invokeZ(src, dst, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_LockProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.LockProperties;
        return JNI.invokeZ(props, __functionAddress);
    }

    public static void SDL_UnlockProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.UnlockProperties;
        JNI.invokeV(props, __functionAddress);
    }

    public static boolean nSDL_SetPointerPropertyWithCleanup(int props, long name, long value, long cleanup, long userdata) {
        long __functionAddress = Functions.SetPointerPropertyWithCleanup;
        return JNI.invokePPPPZ(props, name, value, cleanup, userdata, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetPointerPropertyWithCleanup(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("void *") long value, @NativeType("SDL_CleanupPropertyCallback") SDL_CleanupPropertyCallbackI cleanup, @NativeType("void *") long userdata) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_SetPointerPropertyWithCleanup(props, MemoryUtil.memAddress(name), value, MemoryUtil.memAddressSafe(cleanup), userdata);
    }

    @NativeType("bool")
    public static boolean SDL_SetPointerPropertyWithCleanup(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("void *") long value, @NativeType("SDL_CleanupPropertyCallback") SDL_CleanupPropertyCallbackI cleanup, @NativeType("void *") long userdata) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            boolean zNSDL_SetPointerPropertyWithCleanup = nSDL_SetPointerPropertyWithCleanup(props, nameEncoded, value, MemoryUtil.memAddressSafe(cleanup), userdata);
            stack.setPointer(stackPointer);
            return zNSDL_SetPointerPropertyWithCleanup;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_SetPointerProperty(int props, long name, long value) {
        long __functionAddress = Functions.SetPointerProperty;
        return JNI.invokePPZ(props, name, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetPointerProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("void *") long value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_SetPointerProperty(props, MemoryUtil.memAddress(name), value);
    }

    @NativeType("bool")
    public static boolean SDL_SetPointerProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("void *") long value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            boolean zNSDL_SetPointerProperty = nSDL_SetPointerProperty(props, nameEncoded, value);
            stack.setPointer(stackPointer);
            return zNSDL_SetPointerProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_SetStringProperty(int props, long name, long value) {
        long __functionAddress = Functions.SetStringProperty;
        return JNI.invokePPZ(props, name, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetStringProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
            Checks.checkNT1Safe(value);
        }
        return nSDL_SetStringProperty(props, MemoryUtil.memAddress(name), MemoryUtil.memAddressSafe(value));
    }

    @NativeType("bool")
    public static boolean SDL_SetStringProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(value, true);
            long valueEncoded = value == null ? 0L : stack.getPointerAddress();
            boolean zNSDL_SetStringProperty = nSDL_SetStringProperty(props, nameEncoded, valueEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_SetStringProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_SetNumberProperty(int props, long name, long value) {
        long __functionAddress = Functions.SetNumberProperty;
        return JNI.invokePJZ(props, name, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetNumberProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("Sint64") long value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_SetNumberProperty(props, MemoryUtil.memAddress(name), value);
    }

    @NativeType("bool")
    public static boolean SDL_SetNumberProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("Sint64") long value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            boolean zNSDL_SetNumberProperty = nSDL_SetNumberProperty(props, nameEncoded, value);
            stack.setPointer(stackPointer);
            return zNSDL_SetNumberProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_SetFloatProperty(int props, long name, float value) {
        long __functionAddress = Functions.SetFloatProperty;
        return JNI.invokePZ(props, name, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetFloatProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, float value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_SetFloatProperty(props, MemoryUtil.memAddress(name), value);
    }

    @NativeType("bool")
    public static boolean SDL_SetFloatProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, float value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            boolean zNSDL_SetFloatProperty = nSDL_SetFloatProperty(props, nameEncoded, value);
            stack.setPointer(stackPointer);
            return zNSDL_SetFloatProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_SetBooleanProperty(int props, long name, boolean value) {
        long __functionAddress = Functions.SetBooleanProperty;
        return JNI.invokePZ(props, name, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetBooleanProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("bool") boolean value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_SetBooleanProperty(props, MemoryUtil.memAddress(name), value);
    }

    @NativeType("bool")
    public static boolean SDL_SetBooleanProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("bool") boolean value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            boolean zNSDL_SetBooleanProperty = nSDL_SetBooleanProperty(props, nameEncoded, value);
            stack.setPointer(stackPointer);
            return zNSDL_SetBooleanProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_HasProperty(int props, long name) {
        long __functionAddress = Functions.HasProperty;
        return JNI.invokePZ(props, name, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_HasProperty(props, MemoryUtil.memAddress(name));
    }

    @NativeType("bool")
    public static boolean SDL_HasProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            boolean zNSDL_HasProperty = nSDL_HasProperty(props, nameEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_HasProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nSDL_GetPropertyType(int props, long name) {
        long __functionAddress = Functions.GetPropertyType;
        return JNI.invokePI(props, name, __functionAddress);
    }

    @NativeType("SDL_PropertyType")
    public static int SDL_GetPropertyType(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_GetPropertyType(props, MemoryUtil.memAddress(name));
    }

    @NativeType("SDL_PropertyType")
    public static int SDL_GetPropertyType(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            int iNSDL_GetPropertyType = nSDL_GetPropertyType(props, nameEncoded);
            stack.setPointer(stackPointer);
            return iNSDL_GetPropertyType;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetPointerProperty(int props, long name, long default_value) {
        long __functionAddress = Functions.GetPointerProperty;
        return JNI.invokePPP(props, name, default_value, __functionAddress);
    }

    @NativeType("void *")
    public static long SDL_GetPointerProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("void *") long default_value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_GetPointerProperty(props, MemoryUtil.memAddress(name), default_value);
    }

    @NativeType("void *")
    public static long SDL_GetPointerProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("void *") long default_value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNSDL_GetPointerProperty = nSDL_GetPointerProperty(props, nameEncoded, default_value);
            stack.setPointer(stackPointer);
            return jNSDL_GetPointerProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetStringProperty(int props, long name, long default_value) {
        long __functionAddress = Functions.GetStringProperty;
        return JNI.invokePPP(props, name, default_value, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetStringProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer default_value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
            Checks.checkNT1Safe(default_value);
        }
        long __result = nSDL_GetStringProperty(props, MemoryUtil.memAddress(name), MemoryUtil.memAddressSafe(default_value));
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("char const *")
    public static String SDL_GetStringProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence default_value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(default_value, true);
            long default_valueEncoded = default_value == null ? 0L : stack.getPointerAddress();
            long __result = nSDL_GetStringProperty(props, nameEncoded, default_valueEncoded);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            stack.setPointer(stackPointer);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetNumberProperty(int props, long name, long default_value) {
        long __functionAddress = Functions.GetNumberProperty;
        return JNI.invokePJJ(props, name, default_value, __functionAddress);
    }

    @NativeType("Sint64")
    public static long SDL_GetNumberProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("Sint64") long default_value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_GetNumberProperty(props, MemoryUtil.memAddress(name), default_value);
    }

    @NativeType("Sint64")
    public static long SDL_GetNumberProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("Sint64") long default_value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNSDL_GetNumberProperty = nSDL_GetNumberProperty(props, nameEncoded, default_value);
            stack.setPointer(stackPointer);
            return jNSDL_GetNumberProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static float nSDL_GetFloatProperty(int props, long name, float default_value) {
        long __functionAddress = Functions.GetFloatProperty;
        return JNI.invokePF(props, name, default_value, __functionAddress);
    }

    public static float SDL_GetFloatProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, float default_value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_GetFloatProperty(props, MemoryUtil.memAddress(name), default_value);
    }

    public static float SDL_GetFloatProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, float default_value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            float fNSDL_GetFloatProperty = nSDL_GetFloatProperty(props, nameEncoded, default_value);
            stack.setPointer(stackPointer);
            return fNSDL_GetFloatProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_GetBooleanProperty(int props, long name, boolean default_value) {
        long __functionAddress = Functions.GetBooleanProperty;
        return JNI.invokePZ(props, name, default_value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetBooleanProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("bool") boolean default_value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_GetBooleanProperty(props, MemoryUtil.memAddress(name), default_value);
    }

    @NativeType("bool")
    public static boolean SDL_GetBooleanProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("bool") boolean default_value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            boolean zNSDL_GetBooleanProperty = nSDL_GetBooleanProperty(props, nameEncoded, default_value);
            stack.setPointer(stackPointer);
            return zNSDL_GetBooleanProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_ClearProperty(int props, long name) {
        long __functionAddress = Functions.ClearProperty;
        return JNI.invokePZ(props, name, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ClearProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_ClearProperty(props, MemoryUtil.memAddress(name));
    }

    @NativeType("bool")
    public static boolean SDL_ClearProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            boolean zNSDL_ClearProperty = nSDL_ClearProperty(props, nameEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_ClearProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_EnumerateProperties(int props, long callback, long userdata) {
        long __functionAddress = Functions.EnumerateProperties;
        return JNI.invokePPZ(props, callback, userdata, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_EnumerateProperties(@NativeType("SDL_PropertiesID") int props, @NativeType("SDL_EnumeratePropertiesCallback") SDL_EnumeratePropertiesCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_EnumerateProperties(props, callback.address(), userdata);
    }

    public static void SDL_DestroyProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.DestroyProperties;
        JNI.invokeV(props, __functionAddress);
    }
}
