package org.lwjgl.system.linux;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XTimeCoord.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XTimeCoord.class */
public class XTimeCoord extends Struct<XTimeCoord> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TIME;
    public static final int X;
    public static final int Y;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TIME = layout.offsetof(0);
        X = layout.offsetof(1);
        Y = layout.offsetof(2);
    }

    protected XTimeCoord(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XTimeCoord create(long address, ByteBuffer container) {
        return new XTimeCoord(address, container);
    }

    public XTimeCoord(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Time")
    public long time() {
        return ntime(address());
    }

    public short x() {
        return nx(address());
    }

    public short y() {
        return ny(address());
    }

    public static XTimeCoord create(long address) {
        return new XTimeCoord(address, null);
    }

    public static XTimeCoord createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XTimeCoord(address, null);
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

    public static long ntime(long struct) {
        return MemoryUtil.memGetCLong(struct + TIME);
    }

    public static short nx(long struct) {
        return MemoryUtil.memGetShort(struct + X);
    }

    public static short ny(long struct) {
        return MemoryUtil.memGetShort(struct + Y);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XTimeCoord$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XTimeCoord$Buffer.class */
    public static class Buffer extends StructBuffer<XTimeCoord, Buffer> {
        private static final XTimeCoord ELEMENT_FACTORY = XTimeCoord.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XTimeCoord.SIZEOF);
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
        public XTimeCoord getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Time")
        public long time() {
            return XTimeCoord.ntime(address());
        }

        public short x() {
            return XTimeCoord.nx(address());
        }

        public short y() {
            return XTimeCoord.ny(address());
        }
    }
}
