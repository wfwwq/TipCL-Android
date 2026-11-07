package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1ExtensionHeader.class */
public class StdVideoEncodeAV1ExtensionHeader extends Struct<StdVideoEncodeAV1ExtensionHeader> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TEMPORAL_ID;
    public static final int SPATIAL_ID;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TEMPORAL_ID = layout.offsetof(0);
        SPATIAL_ID = layout.offsetof(1);
    }

    protected StdVideoEncodeAV1ExtensionHeader(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeAV1ExtensionHeader create(long address, ByteBuffer container) {
        return new StdVideoEncodeAV1ExtensionHeader(address, container);
    }

    public StdVideoEncodeAV1ExtensionHeader(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint8_t")
    public byte temporal_id() {
        return ntemporal_id(address());
    }

    @NativeType("uint8_t")
    public byte spatial_id() {
        return nspatial_id(address());
    }

    public StdVideoEncodeAV1ExtensionHeader temporal_id(@NativeType("uint8_t") byte value) {
        ntemporal_id(address(), value);
        return this;
    }

    public StdVideoEncodeAV1ExtensionHeader spatial_id(@NativeType("uint8_t") byte value) {
        nspatial_id(address(), value);
        return this;
    }

    public StdVideoEncodeAV1ExtensionHeader set(byte temporal_id, byte spatial_id) {
        temporal_id(temporal_id);
        spatial_id(spatial_id);
        return this;
    }

    public StdVideoEncodeAV1ExtensionHeader set(StdVideoEncodeAV1ExtensionHeader src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeAV1ExtensionHeader malloc() {
        return new StdVideoEncodeAV1ExtensionHeader(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeAV1ExtensionHeader calloc() {
        return new StdVideoEncodeAV1ExtensionHeader(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeAV1ExtensionHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1ExtensionHeader(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeAV1ExtensionHeader create(long address) {
        return new StdVideoEncodeAV1ExtensionHeader(address, null);
    }

    public static StdVideoEncodeAV1ExtensionHeader createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeAV1ExtensionHeader(address, null);
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

    public static StdVideoEncodeAV1ExtensionHeader malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1ExtensionHeader(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeAV1ExtensionHeader calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1ExtensionHeader(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte ntemporal_id(long struct) {
        return MemoryUtil.memGetByte(struct + TEMPORAL_ID);
    }

    public static byte nspatial_id(long struct) {
        return MemoryUtil.memGetByte(struct + SPATIAL_ID);
    }

    public static void ntemporal_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TEMPORAL_ID, value);
    }

    public static void nspatial_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SPATIAL_ID, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1ExtensionHeader$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1ExtensionHeader, Buffer> implements NativeResource {
        private static final StdVideoEncodeAV1ExtensionHeader ELEMENT_FACTORY = StdVideoEncodeAV1ExtensionHeader.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeAV1ExtensionHeader.SIZEOF);
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
        public StdVideoEncodeAV1ExtensionHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint8_t")
        public byte temporal_id() {
            return StdVideoEncodeAV1ExtensionHeader.ntemporal_id(address());
        }

        @NativeType("uint8_t")
        public byte spatial_id() {
            return StdVideoEncodeAV1ExtensionHeader.nspatial_id(address());
        }

        public Buffer temporal_id(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1ExtensionHeader.ntemporal_id(address(), value);
            return this;
        }

        public Buffer spatial_id(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1ExtensionHeader.nspatial_id(address(), value);
            return this;
        }
    }
}
