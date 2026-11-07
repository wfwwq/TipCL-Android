package org.lwjgl.sdl;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLSensor.class */
public class SDLSensor {
    public static final float SDL_STANDARD_GRAVITY = 9.80665f;
    public static final int SDL_SENSOR_INVALID = -1;
    public static final int SDL_SENSOR_UNKNOWN = 0;
    public static final int SDL_SENSOR_ACCEL = 1;
    public static final int SDL_SENSOR_GYRO = 2;
    public static final int SDL_SENSOR_ACCEL_L = 3;
    public static final int SDL_SENSOR_GYRO_L = 4;
    public static final int SDL_SENSOR_ACCEL_R = 5;
    public static final int SDL_SENSOR_GYRO_R = 6;
    public static final int SDL_SENSOR_COUNT = 7;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLSensor$Functions.class */
    public static final class Functions {
        public static final long GetSensors = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensors");
        public static final long GetSensorNameForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorNameForID");
        public static final long GetSensorTypeForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorTypeForID");
        public static final long GetSensorNonPortableTypeForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorNonPortableTypeForID");
        public static final long OpenSensor = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenSensor");
        public static final long GetSensorFromID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorFromID");
        public static final long GetSensorProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorProperties");
        public static final long GetSensorName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorName");
        public static final long GetSensorType = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorType");
        public static final long GetSensorNonPortableType = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorNonPortableType");
        public static final long GetSensorID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorID");
        public static final long GetSensorData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorData");
        public static final long CloseSensor = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseSensor");
        public static final long UpdateSensors = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateSensors");

        private Functions() {
        }
    }

    protected SDLSensor() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_GetSensors(long count) {
        long __functionAddress = Functions.GetSensors;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("SDL_SensorID *")
    public static IntBuffer SDL_GetSensors() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetSensors(MemoryUtil.memAddress(count));
            IntBuffer intBufferMemIntBufferSafe = MemoryUtil.memIntBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return intBufferMemIntBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetSensorNameForID(int instance_id) {
        long __functionAddress = Functions.GetSensorNameForID;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetSensorNameForID(@NativeType("SDL_SensorID") int instance_id) {
        long __result = nSDL_GetSensorNameForID(instance_id);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("SDL_SensorType")
    public static int SDL_GetSensorTypeForID(@NativeType("SDL_SensorID") int instance_id) {
        long __functionAddress = Functions.GetSensorTypeForID;
        return JNI.invokeI(instance_id, __functionAddress);
    }

    public static int SDL_GetSensorNonPortableTypeForID(@NativeType("SDL_SensorID") int instance_id) {
        long __functionAddress = Functions.GetSensorNonPortableTypeForID;
        return JNI.invokeI(instance_id, __functionAddress);
    }

    @NativeType("SDL_Sensor *")
    public static long SDL_OpenSensor(@NativeType("SDL_SensorID") int instance_id) {
        long __functionAddress = Functions.OpenSensor;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("SDL_Sensor *")
    public static long SDL_GetSensorFromID(@NativeType("SDL_SensorID") int instance_id) {
        long __functionAddress = Functions.GetSensorFromID;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetSensorProperties(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.GetSensorProperties;
        if (Checks.CHECKS) {
            Checks.check(sensor);
        }
        return JNI.invokePI(sensor, __functionAddress);
    }

    public static long nSDL_GetSensorName(long sensor) {
        long __functionAddress = Functions.GetSensorName;
        if (Checks.CHECKS) {
            Checks.check(sensor);
        }
        return JNI.invokePP(sensor, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetSensorName(@NativeType("SDL_Sensor *") long sensor) {
        long __result = nSDL_GetSensorName(sensor);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("SDL_SensorType")
    public static int SDL_GetSensorType(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.GetSensorType;
        if (Checks.CHECKS) {
            Checks.check(sensor);
        }
        return JNI.invokePI(sensor, __functionAddress);
    }

    public static int SDL_GetSensorNonPortableType(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.GetSensorNonPortableType;
        if (Checks.CHECKS) {
            Checks.check(sensor);
        }
        return JNI.invokePI(sensor, __functionAddress);
    }

    @NativeType("SDL_SensorID")
    public static int SDL_GetSensorID(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.GetSensorID;
        if (Checks.CHECKS) {
            Checks.check(sensor);
        }
        return JNI.invokePI(sensor, __functionAddress);
    }

    public static boolean nSDL_GetSensorData(long sensor, long data, int num_values) {
        long __functionAddress = Functions.GetSensorData;
        if (Checks.CHECKS) {
            Checks.check(sensor);
        }
        return JNI.invokePPZ(sensor, data, num_values, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetSensorData(@NativeType("SDL_Sensor *") long sensor, @NativeType("float *") FloatBuffer data) {
        return nSDL_GetSensorData(sensor, MemoryUtil.memAddress(data), data.remaining());
    }

    public static void SDL_CloseSensor(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.CloseSensor;
        if (Checks.CHECKS) {
            Checks.check(sensor);
        }
        JNI.invokePV(sensor, __functionAddress);
    }

    public static void SDL_UpdateSensors() {
        long __functionAddress = Functions.UpdateSensors;
        JNI.invokeV(__functionAddress);
    }
}
