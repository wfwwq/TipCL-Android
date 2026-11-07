package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.system.windows.RECT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GPU_DEVICE.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GPU_DEVICE.class */
public class GPU_DEVICE extends Struct<GPU_DEVICE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CB;
    public static final int DEVICENAME;
    public static final int DEVICESTRING;
    public static final int FLAGS;
    public static final int RCVIRTUALSCREEN;

    static {
        Struct.Layout layout = __struct(__member(4), __array(1, 32), __array(1, 128), __member(4), __member(RECT.SIZEOF, RECT.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CB = layout.offsetof(0);
        DEVICENAME = layout.offsetof(1);
        DEVICESTRING = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        RCVIRTUALSCREEN = layout.offsetof(4);
    }

    protected GPU_DEVICE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GPU_DEVICE create(long address, ByteBuffer container) {
        return new GPU_DEVICE(address, container);
    }

    public GPU_DEVICE(ByteBuffer container) {
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

    @NativeType("CHAR[32]")
    public ByteBuffer DeviceName() {
        return nDeviceName(address());
    }

    @NativeType("CHAR[32]")
    public String DeviceNameString() {
        return nDeviceNameString(address());
    }

    @NativeType("CHAR[128]")
    public ByteBuffer DeviceString() {
        return nDeviceString(address());
    }

    @NativeType("CHAR[128]")
    public String DeviceStringString() {
        return nDeviceStringString(address());
    }

    @NativeType("DWORD")
    public int Flags() {
        return nFlags(address());
    }

    public RECT rcVirtualScreen() {
        return nrcVirtualScreen(address());
    }

    public static GPU_DEVICE malloc() {
        return new GPU_DEVICE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static GPU_DEVICE calloc() {
        return new GPU_DEVICE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static GPU_DEVICE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GPU_DEVICE(MemoryUtil.memAddress(container), container);
    }

    public static GPU_DEVICE create(long address) {
        return new GPU_DEVICE(address, null);
    }

    public static GPU_DEVICE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GPU_DEVICE(address, null);
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

    public static GPU_DEVICE malloc(MemoryStack stack) {
        return new GPU_DEVICE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static GPU_DEVICE calloc(MemoryStack stack) {
        return new GPU_DEVICE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
        return MemoryUtil.memByteBuffer(struct + DEVICENAME, 32);
    }

    public static String nDeviceNameString(long struct) {
        return MemoryUtil.memASCII(struct + DEVICENAME);
    }

    public static ByteBuffer nDeviceString(long struct) {
        return MemoryUtil.memByteBuffer(struct + DEVICESTRING, 128);
    }

    public static String nDeviceStringString(long struct) {
        return MemoryUtil.memASCII(struct + DEVICESTRING);
    }

    public static int nFlags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static RECT nrcVirtualScreen(long struct) {
        return RECT.create(struct + RCVIRTUALSCREEN);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GPU_DEVICE$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GPU_DEVICE$Buffer.class */
    public static class Buffer extends StructBuffer<GPU_DEVICE, Buffer> implements NativeResource {
        private static final GPU_DEVICE ELEMENT_FACTORY = GPU_DEVICE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GPU_DEVICE.SIZEOF);
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
        public GPU_DEVICE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("DWORD")
        public int cb() {
            return GPU_DEVICE.ncb(address());
        }

        @NativeType("CHAR[32]")
        public ByteBuffer DeviceName() {
            return GPU_DEVICE.nDeviceName(address());
        }

        @NativeType("CHAR[32]")
        public String DeviceNameString() {
            return GPU_DEVICE.nDeviceNameString(address());
        }

        @NativeType("CHAR[128]")
        public ByteBuffer DeviceString() {
            return GPU_DEVICE.nDeviceString(address());
        }

        @NativeType("CHAR[128]")
        public String DeviceStringString() {
            return GPU_DEVICE.nDeviceStringString(address());
        }

        @NativeType("DWORD")
        public int Flags() {
            return GPU_DEVICE.nFlags(address());
        }

        public RECT rcVirtualScreen() {
            return GPU_DEVICE.nrcVirtualScreen(address());
        }
    }
}
