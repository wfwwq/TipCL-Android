package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLCamera.class */
public class SDLCamera {
    public static final int SDL_CAMERA_POSITION_UNKNOWN = 0;
    public static final int SDL_CAMERA_POSITION_FRONT_FACING = 1;
    public static final int SDL_CAMERA_POSITION_BACK_FACING = 2;
    public static final int SDL_CAMERA_PERMISSION_STATE_DENIED = -1;
    public static final int SDL_CAMERA_PERMISSION_STATE_PENDING = 0;
    public static final int SDL_CAMERA_PERMISSION_STATE_APPROVED = 1;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLCamera$Functions.class */
    public static final class Functions {
        public static final long GetNumCameraDrivers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumCameraDrivers");
        public static final long GetCameraDriver = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraDriver");
        public static final long GetCurrentCameraDriver = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentCameraDriver");
        public static final long GetCameras = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameras");
        public static final long GetCameraSupportedFormats = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraSupportedFormats");
        public static final long GetCameraName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraName");
        public static final long GetCameraPosition = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraPosition");
        public static final long OpenCamera = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenCamera");
        public static final long GetCameraPermissionState = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraPermissionState");
        public static final long GetCameraID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraID");
        public static final long GetCameraProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraProperties");
        public static final long GetCameraFormat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraFormat");
        public static final long AcquireCameraFrame = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AcquireCameraFrame");
        public static final long ReleaseCameraFrame = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseCameraFrame");
        public static final long CloseCamera = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseCamera");

        private Functions() {
        }
    }

    protected SDLCamera() {
        throw new UnsupportedOperationException();
    }

    public static int SDL_GetNumCameraDrivers() {
        long __functionAddress = Functions.GetNumCameraDrivers;
        return JNI.invokeI(__functionAddress);
    }

    public static long nSDL_GetCameraDriver(int index) {
        long __functionAddress = Functions.GetCameraDriver;
        return JNI.invokeP(index, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetCameraDriver(int index) {
        long __result = nSDL_GetCameraDriver(index);
        return MemoryUtil.memASCIISafe(__result);
    }

    public static long nSDL_GetCurrentCameraDriver() {
        long __functionAddress = Functions.GetCurrentCameraDriver;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetCurrentCameraDriver() {
        long __result = nSDL_GetCurrentCameraDriver();
        return MemoryUtil.memASCIISafe(__result);
    }

    public static long nSDL_GetCameras(long count) {
        long __functionAddress = Functions.GetCameras;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("SDL_CameraID *")
    public static IntBuffer SDL_GetCameras() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetCameras(MemoryUtil.memAddress(count));
            IntBuffer intBufferMemIntBufferSafe = MemoryUtil.memIntBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return intBufferMemIntBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetCameraSupportedFormats(int instance_id, long count) {
        long __functionAddress = Functions.GetCameraSupportedFormats;
        return JNI.invokePP(instance_id, count, __functionAddress);
    }

    @NativeType("SDL_CameraSpec **")
    public static PointerBuffer SDL_GetCameraSupportedFormats(@NativeType("SDL_CameraID") int instance_id) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetCameraSupportedFormats(instance_id, MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetCameraName(int instance_id) {
        long __functionAddress = Functions.GetCameraName;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetCameraName(@NativeType("SDL_CameraID") int instance_id) {
        long __result = nSDL_GetCameraName(instance_id);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("SDL_CameraPosition")
    public static int SDL_GetCameraPosition(@NativeType("SDL_CameraID") int instance_id) {
        long __functionAddress = Functions.GetCameraPosition;
        return JNI.invokeI(instance_id, __functionAddress);
    }

    public static long nSDL_OpenCamera(int instance_id, long spec) {
        long __functionAddress = Functions.OpenCamera;
        return JNI.invokePP(instance_id, spec, __functionAddress);
    }

    @NativeType("SDL_Camera *")
    public static long SDL_OpenCamera(@NativeType("SDL_CameraID") int instance_id, @NativeType("SDL_CameraSpec const *") SDL_CameraSpec spec) {
        return nSDL_OpenCamera(instance_id, MemoryUtil.memAddressSafe(spec));
    }

    @NativeType("SDL_CameraPermissionState")
    public static int SDL_GetCameraPermissionState(@NativeType("SDL_Camera *") long camera) {
        long __functionAddress = Functions.GetCameraPermissionState;
        if (Checks.CHECKS) {
            Checks.check(camera);
        }
        return JNI.invokePI(camera, __functionAddress);
    }

    @NativeType("SDL_CameraID")
    public static int SDL_GetCameraID(@NativeType("SDL_Camera *") long camera) {
        long __functionAddress = Functions.GetCameraID;
        if (Checks.CHECKS) {
            Checks.check(camera);
        }
        return JNI.invokePI(camera, __functionAddress);
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetCameraProperties(@NativeType("SDL_Camera *") long camera) {
        long __functionAddress = Functions.GetCameraProperties;
        if (Checks.CHECKS) {
            Checks.check(camera);
        }
        return JNI.invokePI(camera, __functionAddress);
    }

    public static boolean nSDL_GetCameraFormat(long camera, long spec) {
        long __functionAddress = Functions.GetCameraFormat;
        if (Checks.CHECKS) {
            Checks.check(camera);
        }
        return JNI.invokePPZ(camera, spec, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetCameraFormat(@NativeType("SDL_Camera *") long camera, @NativeType("SDL_CameraSpec *") SDL_CameraSpec spec) {
        return nSDL_GetCameraFormat(camera, spec.address());
    }

    public static long nSDL_AcquireCameraFrame(long camera, long timestampNS) {
        long __functionAddress = Functions.AcquireCameraFrame;
        if (Checks.CHECKS) {
            Checks.check(camera);
        }
        return JNI.invokePPP(camera, timestampNS, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_AcquireCameraFrame(@NativeType("SDL_Camera *") long camera, @NativeType("Uint64 *") LongBuffer timestampNS) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) timestampNS, 1);
        }
        long __result = nSDL_AcquireCameraFrame(camera, MemoryUtil.memAddressSafe(timestampNS));
        return SDL_Surface.createSafe(__result);
    }

    public static void nSDL_ReleaseCameraFrame(long camera, long frame) {
        long __functionAddress = Functions.ReleaseCameraFrame;
        if (Checks.CHECKS) {
            Checks.check(camera);
        }
        JNI.invokePPV(camera, frame, __functionAddress);
    }

    public static void SDL_ReleaseCameraFrame(@NativeType("SDL_Camera *") long camera, @NativeType("SDL_Surface *") SDL_Surface frame) {
        nSDL_ReleaseCameraFrame(camera, frame.address());
    }

    public static void SDL_CloseCamera(@NativeType("SDL_Camera *") long camera) {
        long __functionAddress = Functions.CloseCamera;
        if (Checks.CHECKS) {
            Checks.check(camera);
        }
        JNI.invokePV(camera, __functionAddress);
    }
}
