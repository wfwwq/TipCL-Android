package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/openal/Util.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/openal/Util.class */
public final class Util {
    private Util() {
    }

    public static void checkALCError(ALCdevice device) {
        int err = ALC10.alcGetError(device.device);
        if (err != 0) {
            throw new OpenALException(ALC10.alcGetString(AL.getDevice().device, err));
        }
    }

    public static void checkALError() {
        int err = AL10.alGetError();
        if (err != 0) {
            throw new OpenALException(err);
        }
    }

    public static void checkALCValidDevice(ALCdevice device) {
        if (!device.isValid()) {
            throw new OpenALException("Invalid device: " + device);
        }
    }

    public static void checkALCValidContext(ALCcontext context) {
        if (!context.isValid()) {
            throw new OpenALException("Invalid context: " + context);
        }
    }
}
