package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShadingRatePaletteNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShadingRatePaletteNV.class */
public class VkShadingRatePaletteNV extends Struct<VkShadingRatePaletteNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SHADINGRATEPALETTEENTRYCOUNT;
    public static final int PSHADINGRATEPALETTEENTRIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SHADINGRATEPALETTEENTRYCOUNT = layout.offsetof(0);
        PSHADINGRATEPALETTEENTRIES = layout.offsetof(1);
    }

    protected VkShadingRatePaletteNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkShadingRatePaletteNV create(long address, ByteBuffer container) {
        return new VkShadingRatePaletteNV(address, container);
    }

    public VkShadingRatePaletteNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int shadingRatePaletteEntryCount() {
        return nshadingRatePaletteEntryCount(address());
    }

    @NativeType("VkShadingRatePaletteEntryNV const *")
    public IntBuffer pShadingRatePaletteEntries() {
        return npShadingRatePaletteEntries(address());
    }

    public VkShadingRatePaletteNV pShadingRatePaletteEntries(@NativeType("VkShadingRatePaletteEntryNV const *") IntBuffer value) {
        npShadingRatePaletteEntries(address(), value);
        return this;
    }

    public VkShadingRatePaletteNV set(VkShadingRatePaletteNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkShadingRatePaletteNV malloc() {
        return new VkShadingRatePaletteNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkShadingRatePaletteNV calloc() {
        return new VkShadingRatePaletteNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkShadingRatePaletteNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShadingRatePaletteNV(MemoryUtil.memAddress(container), container);
    }

    public static VkShadingRatePaletteNV create(long address) {
        return new VkShadingRatePaletteNV(address, null);
    }

    public static VkShadingRatePaletteNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkShadingRatePaletteNV(address, null);
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

    public static VkShadingRatePaletteNV malloc(MemoryStack stack) {
        return new VkShadingRatePaletteNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkShadingRatePaletteNV calloc(MemoryStack stack) {
        return new VkShadingRatePaletteNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nshadingRatePaletteEntryCount(long struct) {
        return MemoryUtil.memGetInt(struct + SHADINGRATEPALETTEENTRYCOUNT);
    }

    public static IntBuffer npShadingRatePaletteEntries(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PSHADINGRATEPALETTEENTRIES), nshadingRatePaletteEntryCount(struct));
    }

    public static void nshadingRatePaletteEntryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADINGRATEPALETTEENTRYCOUNT, value);
    }

    public static void npShadingRatePaletteEntries(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PSHADINGRATEPALETTEENTRIES, MemoryUtil.memAddress(value));
        nshadingRatePaletteEntryCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSHADINGRATEPALETTEENTRIES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShadingRatePaletteNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShadingRatePaletteNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkShadingRatePaletteNV, Buffer> implements NativeResource {
        private static final VkShadingRatePaletteNV ELEMENT_FACTORY = VkShadingRatePaletteNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkShadingRatePaletteNV.SIZEOF);
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
        public VkShadingRatePaletteNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int shadingRatePaletteEntryCount() {
            return VkShadingRatePaletteNV.nshadingRatePaletteEntryCount(address());
        }

        @NativeType("VkShadingRatePaletteEntryNV const *")
        public IntBuffer pShadingRatePaletteEntries() {
            return VkShadingRatePaletteNV.npShadingRatePaletteEntries(address());
        }

        public Buffer pShadingRatePaletteEntries(@NativeType("VkShadingRatePaletteEntryNV const *") IntBuffer value) {
            VkShadingRatePaletteNV.npShadingRatePaletteEntries(address(), value);
            return this;
        }
    }
}
