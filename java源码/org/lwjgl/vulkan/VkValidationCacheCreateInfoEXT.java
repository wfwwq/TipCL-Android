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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkValidationCacheCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkValidationCacheCreateInfoEXT.class */
public class VkValidationCacheCreateInfoEXT extends Struct<VkValidationCacheCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int INITIALDATASIZE;
    public static final int PINITIALDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        INITIALDATASIZE = layout.offsetof(3);
        PINITIALDATA = layout.offsetof(4);
    }

    protected VkValidationCacheCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkValidationCacheCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkValidationCacheCreateInfoEXT(address, container);
    }

    public VkValidationCacheCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkValidationCacheCreateFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("size_t")
    public long initialDataSize() {
        return ninitialDataSize(address());
    }

    @NativeType("void const *")
    public ByteBuffer pInitialData() {
        return npInitialData(address());
    }

    public VkValidationCacheCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkValidationCacheCreateInfoEXT sType$Default() {
        return sType(1000160000);
    }

    public VkValidationCacheCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkValidationCacheCreateInfoEXT flags(@NativeType("VkValidationCacheCreateFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkValidationCacheCreateInfoEXT pInitialData(@NativeType("void const *") ByteBuffer value) {
        npInitialData(address(), value);
        return this;
    }

    public VkValidationCacheCreateInfoEXT set(int sType, long pNext, int flags, ByteBuffer pInitialData) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pInitialData(pInitialData);
        return this;
    }

    public VkValidationCacheCreateInfoEXT set(VkValidationCacheCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkValidationCacheCreateInfoEXT malloc() {
        return new VkValidationCacheCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkValidationCacheCreateInfoEXT calloc() {
        return new VkValidationCacheCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkValidationCacheCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkValidationCacheCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkValidationCacheCreateInfoEXT create(long address) {
        return new VkValidationCacheCreateInfoEXT(address, null);
    }

    public static VkValidationCacheCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkValidationCacheCreateInfoEXT(address, null);
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

    public static VkValidationCacheCreateInfoEXT malloc(MemoryStack stack) {
        return new VkValidationCacheCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkValidationCacheCreateInfoEXT calloc(MemoryStack stack) {
        return new VkValidationCacheCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long ninitialDataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + INITIALDATASIZE);
    }

    public static ByteBuffer npInitialData(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + PINITIALDATA), (int) ninitialDataSize(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ninitialDataSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + INITIALDATASIZE, value);
    }

    public static void npInitialData(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PINITIALDATA, MemoryUtil.memAddressSafe(value));
        ninitialDataSize(struct, value == null ? 0L : value.remaining());
    }

    public static void validate(long struct) {
        if (ninitialDataSize(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PINITIALDATA));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkValidationCacheCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkValidationCacheCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkValidationCacheCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkValidationCacheCreateInfoEXT ELEMENT_FACTORY = VkValidationCacheCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkValidationCacheCreateInfoEXT.SIZEOF);
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
        public VkValidationCacheCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkValidationCacheCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkValidationCacheCreateInfoEXT.npNext(address());
        }

        @NativeType("VkValidationCacheCreateFlagsEXT")
        public int flags() {
            return VkValidationCacheCreateInfoEXT.nflags(address());
        }

        @NativeType("size_t")
        public long initialDataSize() {
            return VkValidationCacheCreateInfoEXT.ninitialDataSize(address());
        }

        @NativeType("void const *")
        public ByteBuffer pInitialData() {
            return VkValidationCacheCreateInfoEXT.npInitialData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkValidationCacheCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000160000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkValidationCacheCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkValidationCacheCreateFlagsEXT") int value) {
            VkValidationCacheCreateInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer pInitialData(@NativeType("void const *") ByteBuffer value) {
            VkValidationCacheCreateInfoEXT.npInitialData(address(), value);
            return this;
        }
    }
}
