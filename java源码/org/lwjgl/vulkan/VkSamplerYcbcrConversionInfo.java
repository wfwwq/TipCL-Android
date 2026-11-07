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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionInfo.class */
public class VkSamplerYcbcrConversionInfo extends Struct<VkSamplerYcbcrConversionInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CONVERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONVERSION = layout.offsetof(2);
    }

    protected VkSamplerYcbcrConversionInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSamplerYcbcrConversionInfo create(long address, ByteBuffer container) {
        return new VkSamplerYcbcrConversionInfo(address, container);
    }

    public VkSamplerYcbcrConversionInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkSamplerYcbcrConversion")
    public long conversion() {
        return nconversion(address());
    }

    public VkSamplerYcbcrConversionInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionInfo sType$Default() {
        return sType(1000156001);
    }

    public VkSamplerYcbcrConversionInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionInfo conversion(@NativeType("VkSamplerYcbcrConversion") long value) {
        nconversion(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionInfo set(int sType, long pNext, long conversion) {
        sType(sType);
        pNext(pNext);
        conversion(conversion);
        return this;
    }

    public VkSamplerYcbcrConversionInfo set(VkSamplerYcbcrConversionInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerYcbcrConversionInfo malloc() {
        return new VkSamplerYcbcrConversionInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionInfo calloc() {
        return new VkSamplerYcbcrConversionInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerYcbcrConversionInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerYcbcrConversionInfo create(long address) {
        return new VkSamplerYcbcrConversionInfo(address, null);
    }

    public static VkSamplerYcbcrConversionInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerYcbcrConversionInfo(address, null);
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

    public static VkSamplerYcbcrConversionInfo malloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionInfo calloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static long nconversion(long struct) {
        return MemoryUtil.memGetLong(struct + CONVERSION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nconversion(long struct, long value) {
        MemoryUtil.memPutLong(struct + CONVERSION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSamplerYcbcrConversionInfo, Buffer> implements NativeResource {
        private static final VkSamplerYcbcrConversionInfo ELEMENT_FACTORY = VkSamplerYcbcrConversionInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSamplerYcbcrConversionInfo.SIZEOF);
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
        public VkSamplerYcbcrConversionInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSamplerYcbcrConversionInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSamplerYcbcrConversionInfo.npNext(address());
        }

        @NativeType("VkSamplerYcbcrConversion")
        public long conversion() {
            return VkSamplerYcbcrConversionInfo.nconversion(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerYcbcrConversionInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000156001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSamplerYcbcrConversionInfo.npNext(address(), value);
            return this;
        }

        public Buffer conversion(@NativeType("VkSamplerYcbcrConversion") long value) {
            VkSamplerYcbcrConversionInfo.nconversion(address(), value);
            return this;
        }
    }
}
