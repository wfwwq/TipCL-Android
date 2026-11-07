package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCuModuleCreateInfoNVX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCuModuleCreateInfoNVX.class */
public class VkCuModuleCreateInfoNVX extends Struct<VkCuModuleCreateInfoNVX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DATASIZE;
    public static final int PDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DATASIZE = layout.offsetof(2);
        PDATA = layout.offsetof(3);
    }

    protected VkCuModuleCreateInfoNVX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCuModuleCreateInfoNVX create(long address, ByteBuffer container) {
        return new VkCuModuleCreateInfoNVX(address, container);
    }

    public VkCuModuleCreateInfoNVX(ByteBuffer container) {
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

    @NativeType("size_t")
    public long dataSize() {
        return ndataSize(address());
    }

    @NativeType("void const *")
    public ByteBuffer pData() {
        return npData(address());
    }

    public VkCuModuleCreateInfoNVX sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCuModuleCreateInfoNVX sType$Default() {
        return sType(1000029000);
    }

    public VkCuModuleCreateInfoNVX pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCuModuleCreateInfoNVX pNext(VkCuModuleTexturingModeCreateInfoNVX value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCuModuleCreateInfoNVX pData(@NativeType("void const *") ByteBuffer value) {
        npData(address(), value);
        return this;
    }

    public VkCuModuleCreateInfoNVX set(int sType, long pNext, ByteBuffer pData) {
        sType(sType);
        pNext(pNext);
        pData(pData);
        return this;
    }

    public VkCuModuleCreateInfoNVX set(VkCuModuleCreateInfoNVX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCuModuleCreateInfoNVX malloc() {
        return new VkCuModuleCreateInfoNVX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCuModuleCreateInfoNVX calloc() {
        return new VkCuModuleCreateInfoNVX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCuModuleCreateInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCuModuleCreateInfoNVX(MemoryUtil.memAddress(container), container);
    }

    public static VkCuModuleCreateInfoNVX create(long address) {
        return new VkCuModuleCreateInfoNVX(address, null);
    }

    public static VkCuModuleCreateInfoNVX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCuModuleCreateInfoNVX(address, null);
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

    public static VkCuModuleCreateInfoNVX malloc(MemoryStack stack) {
        return new VkCuModuleCreateInfoNVX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCuModuleCreateInfoNVX calloc(MemoryStack stack) {
        return new VkCuModuleCreateInfoNVX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + DATASIZE);
    }

    public static ByteBuffer npData(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + PDATA), (int) ndataSize(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndataSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DATASIZE, value);
    }

    public static void npData(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PDATA, MemoryUtil.memAddressSafe(value));
        ndataSize(struct, value == null ? 0L : value.remaining());
    }

    public static void validate(long struct) {
        if (ndataSize(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDATA));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCuModuleCreateInfoNVX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCuModuleCreateInfoNVX$Buffer.class */
    public static class Buffer extends StructBuffer<VkCuModuleCreateInfoNVX, Buffer> implements NativeResource {
        private static final VkCuModuleCreateInfoNVX ELEMENT_FACTORY = VkCuModuleCreateInfoNVX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCuModuleCreateInfoNVX.SIZEOF);
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
        public VkCuModuleCreateInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCuModuleCreateInfoNVX.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCuModuleCreateInfoNVX.npNext(address());
        }

        @NativeType("size_t")
        public long dataSize() {
            return VkCuModuleCreateInfoNVX.ndataSize(address());
        }

        @NativeType("void const *")
        public ByteBuffer pData() {
            return VkCuModuleCreateInfoNVX.npData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCuModuleCreateInfoNVX.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000029000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCuModuleCreateInfoNVX.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkCuModuleTexturingModeCreateInfoNVX value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pData(@NativeType("void const *") ByteBuffer value) {
            VkCuModuleCreateInfoNVX.npData(address(), value);
            return this;
        }
    }
}
