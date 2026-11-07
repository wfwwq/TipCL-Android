package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLHIDAPI.class */
public class SDLHIDAPI {
    public static final int SDL_HID_API_BUS_UNKNOWN = 0;
    public static final int SDL_HID_API_BUS_USB = 1;
    public static final int SDL_HID_API_BUS_BLUETOOTH = 2;
    public static final int SDL_HID_API_BUS_I2C = 3;
    public static final int SDL_HID_API_BUS_SPI = 4;
    public static final String SDL_PROP_HIDAPI_LIBUSB_DEVICE_HANDLE_POINTER = "SDL.hidapi.libusb.device.handle";

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLHIDAPI$Functions.class */
    public static final class Functions {
        public static final long hid_init = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_init");
        public static final long hid_exit = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_exit");
        public static final long hid_device_change_count = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_device_change_count");
        public static final long hid_enumerate = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_enumerate");
        public static final long hid_free_enumeration = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_free_enumeration");
        public static final long hid_open = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_open");
        public static final long hid_open_path = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_open_path");
        public static final long hid_get_properties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_properties");
        public static final long hid_write = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_write");
        public static final long hid_read_timeout = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_read_timeout");
        public static final long hid_read = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_read");
        public static final long hid_set_nonblocking = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_set_nonblocking");
        public static final long hid_send_feature_report = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_send_feature_report");
        public static final long hid_get_feature_report = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_feature_report");
        public static final long hid_get_input_report = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_input_report");
        public static final long hid_close = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_close");
        public static final long hid_get_manufacturer_string = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_manufacturer_string");
        public static final long hid_get_product_string = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_product_string");
        public static final long hid_get_serial_number_string = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_serial_number_string");
        public static final long hid_get_indexed_string = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_indexed_string");
        public static final long hid_get_device_info = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_device_info");
        public static final long hid_get_report_descriptor = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_report_descriptor");
        public static final long hid_ble_scan = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_ble_scan");

        private Functions() {
        }
    }

    protected SDLHIDAPI() {
        throw new UnsupportedOperationException();
    }

    public static int SDL_hid_init() {
        long __functionAddress = Functions.hid_init;
        return JNI.invokeI(__functionAddress);
    }

    public static int SDL_hid_exit() {
        long __functionAddress = Functions.hid_exit;
        return JNI.invokeI(__functionAddress);
    }

    @NativeType("Uint32")
    public static int SDL_hid_device_change_count() {
        long __functionAddress = Functions.hid_device_change_count;
        return JNI.invokeI(__functionAddress);
    }

    public static long nSDL_hid_enumerate(short vendor_id, short product_id) {
        long __functionAddress = Functions.hid_enumerate;
        return JNI.invokeCCP(vendor_id, product_id, __functionAddress);
    }

    @NativeType("SDL_hid_device_info *")
    public static SDL_hid_device_info SDL_hid_enumerate(@NativeType("unsigned short") short vendor_id, @NativeType("unsigned short") short product_id) {
        long __result = nSDL_hid_enumerate(vendor_id, product_id);
        return SDL_hid_device_info.createSafe(__result);
    }

    public static void nSDL_hid_free_enumeration(long devs) {
        long __functionAddress = Functions.hid_free_enumeration;
        JNI.invokePV(devs, __functionAddress);
    }

    public static void SDL_hid_free_enumeration(@NativeType("SDL_hid_device_info *") SDL_hid_device_info devs) {
        nSDL_hid_free_enumeration(devs.address());
    }

    public static long nSDL_hid_open(short vendor_id, short product_id, long serial_number) {
        long __functionAddress = Functions.hid_open;
        return JNI.invokeCCPP(vendor_id, product_id, serial_number, __functionAddress);
    }

    @NativeType("SDL_hid_device *")
    public static long SDL_hid_open(@NativeType("unsigned short") short vendor_id, @NativeType("unsigned short") short product_id, @NativeType("wchar_t const *") ByteBuffer serial_number) {
        if (Checks.CHECKS) {
            Checks.checkNT2Safe(serial_number);
        }
        return nSDL_hid_open(vendor_id, product_id, MemoryUtil.memAddressSafe(serial_number));
    }

    @NativeType("SDL_hid_device *")
    public static long SDL_hid_open(@NativeType("unsigned short") short vendor_id, @NativeType("unsigned short") short product_id, @NativeType("wchar_t const *") CharSequence serial_number) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(serial_number, true);
            long serial_numberEncoded = serial_number == null ? 0L : stack.getPointerAddress();
            long jNSDL_hid_open = nSDL_hid_open(vendor_id, product_id, serial_numberEncoded);
            stack.setPointer(stackPointer);
            return jNSDL_hid_open;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_hid_open_path(long path) {
        long __functionAddress = Functions.hid_open_path;
        return JNI.invokePP(path, __functionAddress);
    }

    @NativeType("SDL_hid_device *")
    public static long SDL_hid_open_path(@NativeType("char const *") ByteBuffer path) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        return nSDL_hid_open_path(MemoryUtil.memAddress(path));
    }

    @NativeType("SDL_hid_device *")
    public static long SDL_hid_open_path(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            long jNSDL_hid_open_path = nSDL_hid_open_path(pathEncoded);
            stack.setPointer(stackPointer);
            return jNSDL_hid_open_path;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_hid_get_properties(@NativeType("SDL_hid_device *") long dev) {
        long __functionAddress = Functions.hid_get_properties;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePI(dev, __functionAddress);
    }

    public static int nSDL_hid_write(long dev, long data, long length) {
        long __functionAddress = Functions.hid_write;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePPPI(dev, data, length, __functionAddress);
    }

    public static int SDL_hid_write(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char const *") ByteBuffer data) {
        return nSDL_hid_write(dev, MemoryUtil.memAddress(data), data.remaining());
    }

    public static int nSDL_hid_read_timeout(long dev, long data, long length, int milliseconds) {
        long __functionAddress = Functions.hid_read_timeout;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePPPI(dev, data, length, milliseconds, __functionAddress);
    }

    public static int SDL_hid_read_timeout(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char const *") ByteBuffer data, int milliseconds) {
        return nSDL_hid_read_timeout(dev, MemoryUtil.memAddress(data), data.remaining(), milliseconds);
    }

    public static int nSDL_hid_read(long dev, long data, long length) {
        long __functionAddress = Functions.hid_read;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePPPI(dev, data, length, __functionAddress);
    }

    public static int SDL_hid_read(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char *") ByteBuffer data) {
        return nSDL_hid_read(dev, MemoryUtil.memAddress(data), data.remaining());
    }

    public static int SDL_hid_set_nonblocking(@NativeType("SDL_hid_device *") long dev, @NativeType("int") boolean nonblock) {
        long __functionAddress = Functions.hid_set_nonblocking;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePI(dev, nonblock ? 1 : 0, __functionAddress);
    }

    public static int nSDL_hid_send_feature_report(long dev, long data, long length) {
        long __functionAddress = Functions.hid_send_feature_report;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePPPI(dev, data, length, __functionAddress);
    }

    public static int SDL_hid_send_feature_report(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char const *") ByteBuffer data) {
        return nSDL_hid_send_feature_report(dev, MemoryUtil.memAddress(data), data.remaining());
    }

    public static int nSDL_hid_get_feature_report(long dev, long data, long length) {
        long __functionAddress = Functions.hid_get_feature_report;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePPPI(dev, data, length, __functionAddress);
    }

    public static int SDL_hid_get_feature_report(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char *") ByteBuffer data) {
        return nSDL_hid_get_feature_report(dev, MemoryUtil.memAddress(data), data.remaining());
    }

    public static int nSDL_hid_get_input_report(long dev, long data, long length) {
        long __functionAddress = Functions.hid_get_input_report;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePPPI(dev, data, length, __functionAddress);
    }

    public static int SDL_hid_get_input_report(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char *") ByteBuffer data) {
        return nSDL_hid_get_input_report(dev, MemoryUtil.memAddress(data), data.remaining());
    }

    public static int SDL_hid_close(@NativeType("SDL_hid_device *") long dev) {
        long __functionAddress = Functions.hid_close;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePI(dev, __functionAddress);
    }

    public static int nSDL_hid_get_manufacturer_string(long dev, long string, long maxlen) {
        long __functionAddress = Functions.hid_get_manufacturer_string;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePPPI(dev, string, maxlen, __functionAddress);
    }

    public static int SDL_hid_get_manufacturer_string(@NativeType("SDL_hid_device *") long dev, @NativeType("wchar_t *") ByteBuffer string) {
        return nSDL_hid_get_manufacturer_string(dev, MemoryUtil.memAddress(string), Integer.toUnsignedLong(string.remaining()) >> 1);
    }

    public static int nSDL_hid_get_product_string(long dev, long string, long maxlen) {
        long __functionAddress = Functions.hid_get_product_string;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePPPI(dev, string, maxlen, __functionAddress);
    }

    public static int SDL_hid_get_product_string(@NativeType("SDL_hid_device *") long dev, @NativeType("wchar_t *") ByteBuffer string) {
        return nSDL_hid_get_product_string(dev, MemoryUtil.memAddress(string), Integer.toUnsignedLong(string.remaining()) >> 1);
    }

    public static int nSDL_hid_get_serial_number_string(long dev, long string, long maxlen) {
        long __functionAddress = Functions.hid_get_serial_number_string;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePPPI(dev, string, maxlen, __functionAddress);
    }

    public static int SDL_hid_get_serial_number_string(@NativeType("SDL_hid_device *") long dev, @NativeType("wchar_t *") ByteBuffer string) {
        return nSDL_hid_get_serial_number_string(dev, MemoryUtil.memAddress(string), Integer.toUnsignedLong(string.remaining()) >> 1);
    }

    public static int nSDL_hid_get_indexed_string(long dev, int string_index, long string, long maxlen) {
        long __functionAddress = Functions.hid_get_indexed_string;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePPPI(dev, string_index, string, maxlen, __functionAddress);
    }

    public static int SDL_hid_get_indexed_string(@NativeType("SDL_hid_device *") long dev, int string_index, @NativeType("wchar_t *") ByteBuffer string) {
        return nSDL_hid_get_indexed_string(dev, string_index, MemoryUtil.memAddress(string), Integer.toUnsignedLong(string.remaining()) >> 1);
    }

    public static long nSDL_hid_get_device_info(long dev) {
        long __functionAddress = Functions.hid_get_device_info;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePP(dev, __functionAddress);
    }

    @NativeType("SDL_hid_device_info *")
    public static SDL_hid_device_info SDL_hid_get_device_info(@NativeType("SDL_hid_device *") long dev) {
        long __result = nSDL_hid_get_device_info(dev);
        return SDL_hid_device_info.createSafe(__result);
    }

    public static int nSDL_hid_get_report_descriptor(long dev, long buf, long buf_size) {
        long __functionAddress = Functions.hid_get_report_descriptor;
        if (Checks.CHECKS) {
            Checks.check(dev);
        }
        return JNI.invokePPPI(dev, buf, buf_size, __functionAddress);
    }

    public static int SDL_hid_get_report_descriptor(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char *") ByteBuffer buf) {
        return nSDL_hid_get_report_descriptor(dev, MemoryUtil.memAddress(buf), buf.remaining());
    }

    public static void SDL_hid_ble_scan(@NativeType("bool") boolean active) {
        long __functionAddress = Functions.hid_ble_scan;
        JNI.invokeV(active, __functionAddress);
    }
}
