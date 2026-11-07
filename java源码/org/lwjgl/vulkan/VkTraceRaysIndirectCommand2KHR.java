package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommand2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommand2KHR.class */
public class VkTraceRaysIndirectCommand2KHR extends Struct<VkTraceRaysIndirectCommand2KHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RAYGENSHADERRECORDADDRESS;
    public static final int RAYGENSHADERRECORDSIZE;
    public static final int MISSSHADERBINDINGTABLEADDRESS;
    public static final int MISSSHADERBINDINGTABLESIZE;
    public static final int MISSSHADERBINDINGTABLESTRIDE;
    public static final int HITSHADERBINDINGTABLEADDRESS;
    public static final int HITSHADERBINDINGTABLESIZE;
    public static final int HITSHADERBINDINGTABLESTRIDE;
    public static final int CALLABLESHADERBINDINGTABLEADDRESS;
    public static final int CALLABLESHADERBINDINGTABLESIZE;
    public static final int CALLABLESHADERBINDINGTABLESTRIDE;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int DEPTH;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        RAYGENSHADERRECORDADDRESS = layout.offsetof(0);
        RAYGENSHADERRECORDSIZE = layout.offsetof(1);
        MISSSHADERBINDINGTABLEADDRESS = layout.offsetof(2);
        MISSSHADERBINDINGTABLESIZE = layout.offsetof(3);
        MISSSHADERBINDINGTABLESTRIDE = layout.offsetof(4);
        HITSHADERBINDINGTABLEADDRESS = layout.offsetof(5);
        HITSHADERBINDINGTABLESIZE = layout.offsetof(6);
        HITSHADERBINDINGTABLESTRIDE = layout.offsetof(7);
        CALLABLESHADERBINDINGTABLEADDRESS = layout.offsetof(8);
        CALLABLESHADERBINDINGTABLESIZE = layout.offsetof(9);
        CALLABLESHADERBINDINGTABLESTRIDE = layout.offsetof(10);
        WIDTH = layout.offsetof(11);
        HEIGHT = layout.offsetof(12);
        DEPTH = layout.offsetof(13);
    }

    protected VkTraceRaysIndirectCommand2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTraceRaysIndirectCommand2KHR create(long address, ByteBuffer container) {
        return new VkTraceRaysIndirectCommand2KHR(address, container);
    }

    public VkTraceRaysIndirectCommand2KHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceAddress")
    public long raygenShaderRecordAddress() {
        return nraygenShaderRecordAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long raygenShaderRecordSize() {
        return nraygenShaderRecordSize(address());
    }

    @NativeType("VkDeviceAddress")
    public long missShaderBindingTableAddress() {
        return nmissShaderBindingTableAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long missShaderBindingTableSize() {
        return nmissShaderBindingTableSize(address());
    }

    @NativeType("VkDeviceSize")
    public long missShaderBindingTableStride() {
        return nmissShaderBindingTableStride(address());
    }

    @NativeType("VkDeviceAddress")
    public long hitShaderBindingTableAddress() {
        return nhitShaderBindingTableAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long hitShaderBindingTableSize() {
        return nhitShaderBindingTableSize(address());
    }

    @NativeType("VkDeviceSize")
    public long hitShaderBindingTableStride() {
        return nhitShaderBindingTableStride(address());
    }

    @NativeType("VkDeviceAddress")
    public long callableShaderBindingTableAddress() {
        return ncallableShaderBindingTableAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long callableShaderBindingTableSize() {
        return ncallableShaderBindingTableSize(address());
    }

    @NativeType("VkDeviceSize")
    public long callableShaderBindingTableStride() {
        return ncallableShaderBindingTableStride(address());
    }

    @NativeType("uint32_t")
    public int width() {
        return nwidth(address());
    }

    @NativeType("uint32_t")
    public int height() {
        return nheight(address());
    }

    @NativeType("uint32_t")
    public int depth() {
        return ndepth(address());
    }

    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordAddress(@NativeType("VkDeviceAddress") long value) {
        nraygenShaderRecordAddress(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordSize(@NativeType("VkDeviceSize") long value) {
        nraygenShaderRecordSize(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableAddress(@NativeType("VkDeviceAddress") long value) {
        nmissShaderBindingTableAddress(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableSize(@NativeType("VkDeviceSize") long value) {
        nmissShaderBindingTableSize(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableStride(@NativeType("VkDeviceSize") long value) {
        nmissShaderBindingTableStride(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableAddress(@NativeType("VkDeviceAddress") long value) {
        nhitShaderBindingTableAddress(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableSize(@NativeType("VkDeviceSize") long value) {
        nhitShaderBindingTableSize(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableStride(@NativeType("VkDeviceSize") long value) {
        nhitShaderBindingTableStride(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableAddress(@NativeType("VkDeviceAddress") long value) {
        ncallableShaderBindingTableAddress(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableSize(@NativeType("VkDeviceSize") long value) {
        ncallableShaderBindingTableSize(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableStride(@NativeType("VkDeviceSize") long value) {
        ncallableShaderBindingTableStride(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR width(@NativeType("uint32_t") int value) {
        nwidth(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR height(@NativeType("uint32_t") int value) {
        nheight(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR depth(@NativeType("uint32_t") int value) {
        ndepth(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR set(long raygenShaderRecordAddress, long raygenShaderRecordSize, long missShaderBindingTableAddress, long missShaderBindingTableSize, long missShaderBindingTableStride, long hitShaderBindingTableAddress, long hitShaderBindingTableSize, long hitShaderBindingTableStride, long callableShaderBindingTableAddress, long callableShaderBindingTableSize, long callableShaderBindingTableStride, int width, int height, int depth) {
        raygenShaderRecordAddress(raygenShaderRecordAddress);
        raygenShaderRecordSize(raygenShaderRecordSize);
        missShaderBindingTableAddress(missShaderBindingTableAddress);
        missShaderBindingTableSize(missShaderBindingTableSize);
        missShaderBindingTableStride(missShaderBindingTableStride);
        hitShaderBindingTableAddress(hitShaderBindingTableAddress);
        hitShaderBindingTableSize(hitShaderBindingTableSize);
        hitShaderBindingTableStride(hitShaderBindingTableStride);
        callableShaderBindingTableAddress(callableShaderBindingTableAddress);
        callableShaderBindingTableSize(callableShaderBindingTableSize);
        callableShaderBindingTableStride(callableShaderBindingTableStride);
        width(width);
        height(height);
        depth(depth);
        return this;
    }

    public VkTraceRaysIndirectCommand2KHR set(VkTraceRaysIndirectCommand2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTraceRaysIndirectCommand2KHR malloc() {
        return new VkTraceRaysIndirectCommand2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTraceRaysIndirectCommand2KHR calloc() {
        return new VkTraceRaysIndirectCommand2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTraceRaysIndirectCommand2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTraceRaysIndirectCommand2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkTraceRaysIndirectCommand2KHR create(long address) {
        return new VkTraceRaysIndirectCommand2KHR(address, null);
    }

    public static VkTraceRaysIndirectCommand2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTraceRaysIndirectCommand2KHR(address, null);
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

    public static VkTraceRaysIndirectCommand2KHR malloc(MemoryStack stack) {
        return new VkTraceRaysIndirectCommand2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTraceRaysIndirectCommand2KHR calloc(MemoryStack stack) {
        return new VkTraceRaysIndirectCommand2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nraygenShaderRecordAddress(long struct) {
        return MemoryUtil.memGetLong(struct + RAYGENSHADERRECORDADDRESS);
    }

    public static long nraygenShaderRecordSize(long struct) {
        return MemoryUtil.memGetLong(struct + RAYGENSHADERRECORDSIZE);
    }

    public static long nmissShaderBindingTableAddress(long struct) {
        return MemoryUtil.memGetLong(struct + MISSSHADERBINDINGTABLEADDRESS);
    }

    public static long nmissShaderBindingTableSize(long struct) {
        return MemoryUtil.memGetLong(struct + MISSSHADERBINDINGTABLESIZE);
    }

    public static long nmissShaderBindingTableStride(long struct) {
        return MemoryUtil.memGetLong(struct + MISSSHADERBINDINGTABLESTRIDE);
    }

    public static long nhitShaderBindingTableAddress(long struct) {
        return MemoryUtil.memGetLong(struct + HITSHADERBINDINGTABLEADDRESS);
    }

    public static long nhitShaderBindingTableSize(long struct) {
        return MemoryUtil.memGetLong(struct + HITSHADERBINDINGTABLESIZE);
    }

    public static long nhitShaderBindingTableStride(long struct) {
        return MemoryUtil.memGetLong(struct + HITSHADERBINDINGTABLESTRIDE);
    }

    public static long ncallableShaderBindingTableAddress(long struct) {
        return MemoryUtil.memGetLong(struct + CALLABLESHADERBINDINGTABLEADDRESS);
    }

    public static long ncallableShaderBindingTableSize(long struct) {
        return MemoryUtil.memGetLong(struct + CALLABLESHADERBINDINGTABLESIZE);
    }

    public static long ncallableShaderBindingTableStride(long struct) {
        return MemoryUtil.memGetLong(struct + CALLABLESHADERBINDINGTABLESTRIDE);
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static int ndepth(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTH);
    }

    public static void nraygenShaderRecordAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + RAYGENSHADERRECORDADDRESS, value);
    }

    public static void nraygenShaderRecordSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + RAYGENSHADERRECORDSIZE, value);
    }

    public static void nmissShaderBindingTableAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + MISSSHADERBINDINGTABLEADDRESS, value);
    }

    public static void nmissShaderBindingTableSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + MISSSHADERBINDINGTABLESIZE, value);
    }

    public static void nmissShaderBindingTableStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + MISSSHADERBINDINGTABLESTRIDE, value);
    }

    public static void nhitShaderBindingTableAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + HITSHADERBINDINGTABLEADDRESS, value);
    }

    public static void nhitShaderBindingTableSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + HITSHADERBINDINGTABLESIZE, value);
    }

    public static void nhitShaderBindingTableStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + HITSHADERBINDINGTABLESTRIDE, value);
    }

    public static void ncallableShaderBindingTableAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + CALLABLESHADERBINDINGTABLEADDRESS, value);
    }

    public static void ncallableShaderBindingTableSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + CALLABLESHADERBINDINGTABLESIZE, value);
    }

    public static void ncallableShaderBindingTableStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + CALLABLESHADERBINDINGTABLESTRIDE, value);
    }

    public static void nwidth(long struct, int value) {
        MemoryUtil.memPutInt(struct + WIDTH, value);
    }

    public static void nheight(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEIGHT, value);
    }

    public static void ndepth(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTH, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommand2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommand2KHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkTraceRaysIndirectCommand2KHR, Buffer> implements NativeResource {
        private static final VkTraceRaysIndirectCommand2KHR ELEMENT_FACTORY = VkTraceRaysIndirectCommand2KHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTraceRaysIndirectCommand2KHR.SIZEOF);
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
        public VkTraceRaysIndirectCommand2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long raygenShaderRecordAddress() {
            return VkTraceRaysIndirectCommand2KHR.nraygenShaderRecordAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long raygenShaderRecordSize() {
            return VkTraceRaysIndirectCommand2KHR.nraygenShaderRecordSize(address());
        }

        @NativeType("VkDeviceAddress")
        public long missShaderBindingTableAddress() {
            return VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long missShaderBindingTableSize() {
            return VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableSize(address());
        }

        @NativeType("VkDeviceSize")
        public long missShaderBindingTableStride() {
            return VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableStride(address());
        }

        @NativeType("VkDeviceAddress")
        public long hitShaderBindingTableAddress() {
            return VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long hitShaderBindingTableSize() {
            return VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableSize(address());
        }

        @NativeType("VkDeviceSize")
        public long hitShaderBindingTableStride() {
            return VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableStride(address());
        }

        @NativeType("VkDeviceAddress")
        public long callableShaderBindingTableAddress() {
            return VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long callableShaderBindingTableSize() {
            return VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableSize(address());
        }

        @NativeType("VkDeviceSize")
        public long callableShaderBindingTableStride() {
            return VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableStride(address());
        }

        @NativeType("uint32_t")
        public int width() {
            return VkTraceRaysIndirectCommand2KHR.nwidth(address());
        }

        @NativeType("uint32_t")
        public int height() {
            return VkTraceRaysIndirectCommand2KHR.nheight(address());
        }

        @NativeType("uint32_t")
        public int depth() {
            return VkTraceRaysIndirectCommand2KHR.ndepth(address());
        }

        public Buffer raygenShaderRecordAddress(@NativeType("VkDeviceAddress") long value) {
            VkTraceRaysIndirectCommand2KHR.nraygenShaderRecordAddress(address(), value);
            return this;
        }

        public Buffer raygenShaderRecordSize(@NativeType("VkDeviceSize") long value) {
            VkTraceRaysIndirectCommand2KHR.nraygenShaderRecordSize(address(), value);
            return this;
        }

        public Buffer missShaderBindingTableAddress(@NativeType("VkDeviceAddress") long value) {
            VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableAddress(address(), value);
            return this;
        }

        public Buffer missShaderBindingTableSize(@NativeType("VkDeviceSize") long value) {
            VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableSize(address(), value);
            return this;
        }

        public Buffer missShaderBindingTableStride(@NativeType("VkDeviceSize") long value) {
            VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableStride(address(), value);
            return this;
        }

        public Buffer hitShaderBindingTableAddress(@NativeType("VkDeviceAddress") long value) {
            VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableAddress(address(), value);
            return this;
        }

        public Buffer hitShaderBindingTableSize(@NativeType("VkDeviceSize") long value) {
            VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableSize(address(), value);
            return this;
        }

        public Buffer hitShaderBindingTableStride(@NativeType("VkDeviceSize") long value) {
            VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableStride(address(), value);
            return this;
        }

        public Buffer callableShaderBindingTableAddress(@NativeType("VkDeviceAddress") long value) {
            VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableAddress(address(), value);
            return this;
        }

        public Buffer callableShaderBindingTableSize(@NativeType("VkDeviceSize") long value) {
            VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableSize(address(), value);
            return this;
        }

        public Buffer callableShaderBindingTableStride(@NativeType("VkDeviceSize") long value) {
            VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableStride(address(), value);
            return this;
        }

        public Buffer width(@NativeType("uint32_t") int value) {
            VkTraceRaysIndirectCommand2KHR.nwidth(address(), value);
            return this;
        }

        public Buffer height(@NativeType("uint32_t") int value) {
            VkTraceRaysIndirectCommand2KHR.nheight(address(), value);
            return this;
        }

        public Buffer depth(@NativeType("uint32_t") int value) {
            VkTraceRaysIndirectCommand2KHR.ndepth(address(), value);
            return this;
        }
    }
}
