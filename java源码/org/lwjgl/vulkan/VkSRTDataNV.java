package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSRTDataNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSRTDataNV.class */
public class VkSRTDataNV extends Struct<VkSRTDataNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SX;
    public static final int A;
    public static final int B;
    public static final int PVX;
    public static final int SY;
    public static final int C;
    public static final int PVY;
    public static final int SZ;
    public static final int PVZ;
    public static final int QX;
    public static final int QY;
    public static final int QZ;
    public static final int QW;
    public static final int TX;
    public static final int TY;
    public static final int TZ;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SX = layout.offsetof(0);
        A = layout.offsetof(1);
        B = layout.offsetof(2);
        PVX = layout.offsetof(3);
        SY = layout.offsetof(4);
        C = layout.offsetof(5);
        PVY = layout.offsetof(6);
        SZ = layout.offsetof(7);
        PVZ = layout.offsetof(8);
        QX = layout.offsetof(9);
        QY = layout.offsetof(10);
        QZ = layout.offsetof(11);
        QW = layout.offsetof(12);
        TX = layout.offsetof(13);
        TY = layout.offsetof(14);
        TZ = layout.offsetof(15);
    }

    protected VkSRTDataNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSRTDataNV create(long address, ByteBuffer container) {
        return new VkSRTDataNV(address, container);
    }

    public VkSRTDataNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public float sx() {
        return nsx(address());
    }

    public float a() {
        return na(address());
    }

    public float b() {
        return nb(address());
    }

    public float pvx() {
        return npvx(address());
    }

    public float sy() {
        return nsy(address());
    }

    public float c() {
        return nc(address());
    }

    public float pvy() {
        return npvy(address());
    }

    public float sz() {
        return nsz(address());
    }

    public float pvz() {
        return npvz(address());
    }

    public float qx() {
        return nqx(address());
    }

    public float qy() {
        return nqy(address());
    }

    public float qz() {
        return nqz(address());
    }

    public float qw() {
        return nqw(address());
    }

    public float tx() {
        return ntx(address());
    }

    public float ty() {
        return nty(address());
    }

    public float tz() {
        return ntz(address());
    }

    public VkSRTDataNV sx(float value) {
        nsx(address(), value);
        return this;
    }

    public VkSRTDataNV a(float value) {
        na(address(), value);
        return this;
    }

    public VkSRTDataNV b(float value) {
        nb(address(), value);
        return this;
    }

    public VkSRTDataNV pvx(float value) {
        npvx(address(), value);
        return this;
    }

    public VkSRTDataNV sy(float value) {
        nsy(address(), value);
        return this;
    }

    public VkSRTDataNV c(float value) {
        nc(address(), value);
        return this;
    }

    public VkSRTDataNV pvy(float value) {
        npvy(address(), value);
        return this;
    }

    public VkSRTDataNV sz(float value) {
        nsz(address(), value);
        return this;
    }

    public VkSRTDataNV pvz(float value) {
        npvz(address(), value);
        return this;
    }

    public VkSRTDataNV qx(float value) {
        nqx(address(), value);
        return this;
    }

    public VkSRTDataNV qy(float value) {
        nqy(address(), value);
        return this;
    }

    public VkSRTDataNV qz(float value) {
        nqz(address(), value);
        return this;
    }

    public VkSRTDataNV qw(float value) {
        nqw(address(), value);
        return this;
    }

    public VkSRTDataNV tx(float value) {
        ntx(address(), value);
        return this;
    }

    public VkSRTDataNV ty(float value) {
        nty(address(), value);
        return this;
    }

    public VkSRTDataNV tz(float value) {
        ntz(address(), value);
        return this;
    }

    public VkSRTDataNV set(float sx, float a, float b, float pvx, float sy, float c, float pvy, float sz, float pvz, float qx, float qy, float qz, float qw, float tx, float ty, float tz) {
        sx(sx);
        a(a);
        b(b);
        pvx(pvx);
        sy(sy);
        c(c);
        pvy(pvy);
        sz(sz);
        pvz(pvz);
        qx(qx);
        qy(qy);
        qz(qz);
        qw(qw);
        tx(tx);
        ty(ty);
        tz(tz);
        return this;
    }

    public VkSRTDataNV set(VkSRTDataNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSRTDataNV malloc() {
        return new VkSRTDataNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSRTDataNV calloc() {
        return new VkSRTDataNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSRTDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSRTDataNV(MemoryUtil.memAddress(container), container);
    }

    public static VkSRTDataNV create(long address) {
        return new VkSRTDataNV(address, null);
    }

    public static VkSRTDataNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSRTDataNV(address, null);
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

    public static VkSRTDataNV malloc(MemoryStack stack) {
        return new VkSRTDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSRTDataNV calloc(MemoryStack stack) {
        return new VkSRTDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static float nsx(long struct) {
        return MemoryUtil.memGetFloat(struct + SX);
    }

    public static float na(long struct) {
        return MemoryUtil.memGetFloat(struct + A);
    }

    public static float nb(long struct) {
        return MemoryUtil.memGetFloat(struct + B);
    }

    public static float npvx(long struct) {
        return MemoryUtil.memGetFloat(struct + PVX);
    }

    public static float nsy(long struct) {
        return MemoryUtil.memGetFloat(struct + SY);
    }

    public static float nc(long struct) {
        return MemoryUtil.memGetFloat(struct + C);
    }

    public static float npvy(long struct) {
        return MemoryUtil.memGetFloat(struct + PVY);
    }

    public static float nsz(long struct) {
        return MemoryUtil.memGetFloat(struct + SZ);
    }

    public static float npvz(long struct) {
        return MemoryUtil.memGetFloat(struct + PVZ);
    }

    public static float nqx(long struct) {
        return MemoryUtil.memGetFloat(struct + QX);
    }

    public static float nqy(long struct) {
        return MemoryUtil.memGetFloat(struct + QY);
    }

    public static float nqz(long struct) {
        return MemoryUtil.memGetFloat(struct + QZ);
    }

    public static float nqw(long struct) {
        return MemoryUtil.memGetFloat(struct + QW);
    }

    public static float ntx(long struct) {
        return MemoryUtil.memGetFloat(struct + TX);
    }

    public static float nty(long struct) {
        return MemoryUtil.memGetFloat(struct + TY);
    }

    public static float ntz(long struct) {
        return MemoryUtil.memGetFloat(struct + TZ);
    }

    public static void nsx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + SX, value);
    }

    public static void na(long struct, float value) {
        MemoryUtil.memPutFloat(struct + A, value);
    }

    public static void nb(long struct, float value) {
        MemoryUtil.memPutFloat(struct + B, value);
    }

    public static void npvx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + PVX, value);
    }

    public static void nsy(long struct, float value) {
        MemoryUtil.memPutFloat(struct + SY, value);
    }

    public static void nc(long struct, float value) {
        MemoryUtil.memPutFloat(struct + C, value);
    }

    public static void npvy(long struct, float value) {
        MemoryUtil.memPutFloat(struct + PVY, value);
    }

    public static void nsz(long struct, float value) {
        MemoryUtil.memPutFloat(struct + SZ, value);
    }

    public static void npvz(long struct, float value) {
        MemoryUtil.memPutFloat(struct + PVZ, value);
    }

    public static void nqx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + QX, value);
    }

    public static void nqy(long struct, float value) {
        MemoryUtil.memPutFloat(struct + QY, value);
    }

    public static void nqz(long struct, float value) {
        MemoryUtil.memPutFloat(struct + QZ, value);
    }

    public static void nqw(long struct, float value) {
        MemoryUtil.memPutFloat(struct + QW, value);
    }

    public static void ntx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + TX, value);
    }

    public static void nty(long struct, float value) {
        MemoryUtil.memPutFloat(struct + TY, value);
    }

    public static void ntz(long struct, float value) {
        MemoryUtil.memPutFloat(struct + TZ, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSRTDataNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSRTDataNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkSRTDataNV, Buffer> implements NativeResource {
        private static final VkSRTDataNV ELEMENT_FACTORY = VkSRTDataNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSRTDataNV.SIZEOF);
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
        public VkSRTDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float sx() {
            return VkSRTDataNV.nsx(address());
        }

        public float a() {
            return VkSRTDataNV.na(address());
        }

        public float b() {
            return VkSRTDataNV.nb(address());
        }

        public float pvx() {
            return VkSRTDataNV.npvx(address());
        }

        public float sy() {
            return VkSRTDataNV.nsy(address());
        }

        public float c() {
            return VkSRTDataNV.nc(address());
        }

        public float pvy() {
            return VkSRTDataNV.npvy(address());
        }

        public float sz() {
            return VkSRTDataNV.nsz(address());
        }

        public float pvz() {
            return VkSRTDataNV.npvz(address());
        }

        public float qx() {
            return VkSRTDataNV.nqx(address());
        }

        public float qy() {
            return VkSRTDataNV.nqy(address());
        }

        public float qz() {
            return VkSRTDataNV.nqz(address());
        }

        public float qw() {
            return VkSRTDataNV.nqw(address());
        }

        public float tx() {
            return VkSRTDataNV.ntx(address());
        }

        public float ty() {
            return VkSRTDataNV.nty(address());
        }

        public float tz() {
            return VkSRTDataNV.ntz(address());
        }

        public Buffer sx(float value) {
            VkSRTDataNV.nsx(address(), value);
            return this;
        }

        public Buffer a(float value) {
            VkSRTDataNV.na(address(), value);
            return this;
        }

        public Buffer b(float value) {
            VkSRTDataNV.nb(address(), value);
            return this;
        }

        public Buffer pvx(float value) {
            VkSRTDataNV.npvx(address(), value);
            return this;
        }

        public Buffer sy(float value) {
            VkSRTDataNV.nsy(address(), value);
            return this;
        }

        public Buffer c(float value) {
            VkSRTDataNV.nc(address(), value);
            return this;
        }

        public Buffer pvy(float value) {
            VkSRTDataNV.npvy(address(), value);
            return this;
        }

        public Buffer sz(float value) {
            VkSRTDataNV.nsz(address(), value);
            return this;
        }

        public Buffer pvz(float value) {
            VkSRTDataNV.npvz(address(), value);
            return this;
        }

        public Buffer qx(float value) {
            VkSRTDataNV.nqx(address(), value);
            return this;
        }

        public Buffer qy(float value) {
            VkSRTDataNV.nqy(address(), value);
            return this;
        }

        public Buffer qz(float value) {
            VkSRTDataNV.nqz(address(), value);
            return this;
        }

        public Buffer qw(float value) {
            VkSRTDataNV.nqw(address(), value);
            return this;
        }

        public Buffer tx(float value) {
            VkSRTDataNV.ntx(address(), value);
            return this;
        }

        public Buffer ty(float value) {
            VkSRTDataNV.nty(address(), value);
            return this;
        }

        public Buffer tz(float value) {
            VkSRTDataNV.ntz(address(), value);
            return this;
        }
    }
}
