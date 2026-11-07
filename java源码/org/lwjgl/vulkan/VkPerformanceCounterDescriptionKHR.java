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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterDescriptionKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterDescriptionKHR.class */
public class VkPerformanceCounterDescriptionKHR extends Struct<VkPerformanceCounterDescriptionKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int NAME;
    public static final int CATEGORY;
    public static final int DESCRIPTION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __array(1, 256), __array(1, 256), __array(1, 256));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        NAME = layout.offsetof(3);
        CATEGORY = layout.offsetof(4);
        DESCRIPTION = layout.offsetof(5);
    }

    protected VkPerformanceCounterDescriptionKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPerformanceCounterDescriptionKHR create(long address, ByteBuffer container) {
        return new VkPerformanceCounterDescriptionKHR(address, container);
    }

    public VkPerformanceCounterDescriptionKHR(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkPerformanceCounterDescriptionFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String nameString() {
        return nnameString(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer category() {
        return ncategory(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String categoryString() {
        return ncategoryString(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() {
        return ndescription(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() {
        return ndescriptionString(address());
    }

    public VkPerformanceCounterDescriptionKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPerformanceCounterDescriptionKHR sType$Default() {
        return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR);
    }

    public VkPerformanceCounterDescriptionKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPerformanceCounterDescriptionKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPerformanceCounterDescriptionKHR set(VkPerformanceCounterDescriptionKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPerformanceCounterDescriptionKHR malloc() {
        return new VkPerformanceCounterDescriptionKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPerformanceCounterDescriptionKHR calloc() {
        return new VkPerformanceCounterDescriptionKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPerformanceCounterDescriptionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceCounterDescriptionKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPerformanceCounterDescriptionKHR create(long address) {
        return new VkPerformanceCounterDescriptionKHR(address, null);
    }

    public static VkPerformanceCounterDescriptionKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPerformanceCounterDescriptionKHR(address, null);
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

    public static VkPerformanceCounterDescriptionKHR malloc(MemoryStack stack) {
        return new VkPerformanceCounterDescriptionKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPerformanceCounterDescriptionKHR calloc(MemoryStack stack) {
        return new VkPerformanceCounterDescriptionKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBuffer(struct + NAME, 256);
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF8(struct + NAME);
    }

    public static ByteBuffer ncategory(long struct) {
        return MemoryUtil.memByteBuffer(struct + CATEGORY, 256);
    }

    public static String ncategoryString(long struct) {
        return MemoryUtil.memUTF8(struct + CATEGORY);
    }

    public static ByteBuffer ndescription(long struct) {
        return MemoryUtil.memByteBuffer(struct + DESCRIPTION, 256);
    }

    public static String ndescriptionString(long struct) {
        return MemoryUtil.memUTF8(struct + DESCRIPTION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterDescriptionKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterDescriptionKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPerformanceCounterDescriptionKHR, Buffer> implements NativeResource {
        private static final VkPerformanceCounterDescriptionKHR ELEMENT_FACTORY = VkPerformanceCounterDescriptionKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPerformanceCounterDescriptionKHR.SIZEOF);
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
        public VkPerformanceCounterDescriptionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPerformanceCounterDescriptionKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPerformanceCounterDescriptionKHR.npNext(address());
        }

        @NativeType("VkPerformanceCounterDescriptionFlagsKHR")
        public int flags() {
            return VkPerformanceCounterDescriptionKHR.nflags(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer name() {
            return VkPerformanceCounterDescriptionKHR.nname(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String nameString() {
            return VkPerformanceCounterDescriptionKHR.nnameString(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer category() {
            return VkPerformanceCounterDescriptionKHR.ncategory(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String categoryString() {
            return VkPerformanceCounterDescriptionKHR.ncategoryString(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() {
            return VkPerformanceCounterDescriptionKHR.ndescription(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() {
            return VkPerformanceCounterDescriptionKHR.ndescriptionString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPerformanceCounterDescriptionKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPerformanceCounterDescriptionKHR.npNext(address(), value);
            return this;
        }
    }
}
