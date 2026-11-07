package org.lwjgl.system.windows;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/DISPLAY_DEVICE.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/DISPLAY_DEVICE.class */
public class DISPLAY_DEVICE extends Struct<DISPLAY_DEVICE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CB;
    public static final int DEVICENAME;
    public static final int DEVICESTRING;
    public static final int STATEFLAGS;
    public static final int DEVICEID;
    public static final int DEVICEKEY;

    static {
        Struct.Layout layout = __struct(__member(4), __array(2, 32), __array(2, 128), __member(4), __array(2, 128), __array(2, 128));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CB = layout.offsetof(0);
        DEVICENAME = layout.offsetof(1);
        DEVICESTRING = layout.offsetof(2);
        STATEFLAGS = layout.offsetof(3);
        DEVICEID = layout.offsetof(4);
        DEVICEKEY = layout.offsetof(5);
    }

    protected DISPLAY_DEVICE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public DISPLAY_DEVICE create(long address, ByteBuffer container) {
        return new DISPLAY_DEVICE(address, container);
    }

    public DISPLAY_DEVICE(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("DWORD")
    public int cb() {
        return ncb(address());
    }

    @NativeType("TCHAR[32]")
    public ByteBuffer DeviceName() {
        return nDeviceName(address());
    }

    @NativeType("TCHAR[32]")
    public String DeviceNameString() {
        return nDeviceNameString(address());
    }

    @NativeType("TCHAR[128]")
    public ByteBuffer DeviceString() {
        return nDeviceString(address());
    }

    @NativeType("TCHAR[128]")
    public String DeviceStringString() {
        return nDeviceStringString(address());
    }

    @NativeType("DWORD")
    public int StateFlags() {
        return nStateFlags(address());
    }

    @NativeType("TCHAR[128]")
    public ByteBuffer DeviceID() {
        return nDeviceID(address());
    }

    @NativeType("TCHAR[128]")
    public String DeviceIDString() {
        return nDeviceIDString(address());
    }

    @NativeType("TCHAR[128]")
    public ByteBuffer DeviceKey() {
        return nDeviceKey(address());
    }

    @NativeType("TCHAR[128]")
    public String DeviceKeyString() {
        return nDeviceKeyString(address());
    }

    public DISPLAY_DEVICE cb(@NativeType("DWORD") int value) {
        ncb(address(), value);
        return this;
    }

    public DISPLAY_DEVICE set(DISPLAY_DEVICE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static DISPLAY_DEVICE malloc() {
        return new DISPLAY_DEVICE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static DISPLAY_DEVICE calloc() {
        return new DISPLAY_DEVICE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static DISPLAY_DEVICE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new DISPLAY_DEVICE(MemoryUtil.memAddress(container), container);
    }

    public static DISPLAY_DEVICE create(long address) {
        return new DISPLAY_DEVICE(address, null);
    }

    public static DISPLAY_DEVICE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new DISPLAY_DEVICE(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static DISPLAY_DEVICE malloc(MemoryStack stack) {
        return new DISPLAY_DEVICE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static DISPLAY_DEVICE calloc(MemoryStack stack) {
        return new DISPLAY_DEVICE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ncb(long struct) {
        return MemoryUtil.memGetInt(struct + CB);
    }

    public static ByteBuffer nDeviceName(long struct) {
        return MemoryUtil.memByteBuffer(struct + DEVICENAME, 64);
    }

    public static String nDeviceNameString(long struct) {
        return MemoryUtil.memUTF16(struct + DEVICENAME);
    }

    public static ByteBuffer nDeviceString(long struct) {
        return MemoryUtil.memByteBuffer(struct + DEVICESTRING, 256);
    }

    public static String nDeviceStringString(long struct) {
        return MemoryUtil.memUTF16(struct + DEVICESTRING);
    }

    public static int nStateFlags(long struct) {
        return MemoryUtil.memGetInt(struct + STATEFLAGS);
    }

    public static ByteBuffer nDeviceID(long struct) {
        return MemoryUtil.memByteBuffer(struct + DEVICEID, 256);
    }

    public static String nDeviceIDString(long struct) {
        return MemoryUtil.memUTF16(struct + DEVICEID);
    }

    public static ByteBuffer nDeviceKey(long struct) {
        return MemoryUtil.memByteBuffer(struct + DEVICEKEY, 256);
    }

    public static String nDeviceKeyString(long struct) {
        return MemoryUtil.memUTF16(struct + DEVICEKEY);
    }

    public static void ncb(long struct, int value) {
        MemoryUtil.memPutInt(struct + CB, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/DISPLAY_DEVICE$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/DISPLAY_DEVICE$Buffer.class */
    public static class Buffer extends StructBuffer<DISPLAY_DEVICE, Buffer> implements NativeResource {
        private static final DISPLAY_DEVICE ELEMENT_FACTORY = DISPLAY_DEVICE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / DISPLAY_DEVICE.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public DISPLAY_DEVICE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("DWORD")
        public int cb() {
            return DISPLAY_DEVICE.ncb(address());
        }

        @NativeType("TCHAR[32]")
        public ByteBuffer DeviceName() {
            return DISPLAY_DEVICE.nDeviceName(address());
        }

        @NativeType("TCHAR[32]")
        public String DeviceNameString() {
            return DISPLAY_DEVICE.nDeviceNameString(address());
        }

        @NativeType("TCHAR[128]")
        public ByteBuffer DeviceString() {
            return DISPLAY_DEVICE.nDeviceString(address());
        }

        @NativeType("TCHAR[128]")
        public String DeviceStringString() {
            return DISPLAY_DEVICE.nDeviceStringString(address());
        }

        @NativeType("DWORD")
        public int StateFlags() {
            return DISPLAY_DEVICE.nStateFlags(address());
        }

        @NativeType("TCHAR[128]")
        public ByteBuffer DeviceID() {
            return DISPLAY_DEVICE.nDeviceID(address());
        }

        @NativeType("TCHAR[128]")
        public String DeviceIDString() {
            return DISPLAY_DEVICE.nDeviceIDString(address());
        }

        @NativeType("TCHAR[128]")
        public ByteBuffer DeviceKey() {
            return DISPLAY_DEVICE.nDeviceKey(address());
        }

        @NativeType("TCHAR[128]")
        public String DeviceKeyString() {
            return DISPLAY_DEVICE.nDeviceKeyString(address());
        }

        public Buffer cb(@NativeType("DWORD") int value) {
            DISPLAY_DEVICE.ncb(address(), value);
            return this;
        }
    }
}
