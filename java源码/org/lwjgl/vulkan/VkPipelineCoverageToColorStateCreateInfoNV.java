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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCoverageToColorStateCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCoverageToColorStateCreateInfoNV.class */
public class VkPipelineCoverageToColorStateCreateInfoNV extends Struct<VkPipelineCoverageToColorStateCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int COVERAGETOCOLORENABLE;
    public static final int COVERAGETOCOLORLOCATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        COVERAGETOCOLORENABLE = layout.offsetof(3);
        COVERAGETOCOLORLOCATION = layout.offsetof(4);
    }

    protected VkPipelineCoverageToColorStateCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineCoverageToColorStateCreateInfoNV create(long address, ByteBuffer container) {
        return new VkPipelineCoverageToColorStateCreateInfoNV(address, container);
    }

    public VkPipelineCoverageToColorStateCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkPipelineCoverageToColorStateCreateFlagsNV")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkBool32")
    public boolean coverageToColorEnable() {
        return ncoverageToColorEnable(address()) != 0;
    }

    @NativeType("uint32_t")
    public int coverageToColorLocation() {
        return ncoverageToColorLocation(address());
    }

    public VkPipelineCoverageToColorStateCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineCoverageToColorStateCreateInfoNV sType$Default() {
        return sType(NVFragmentCoverageToColor.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV);
    }

    public VkPipelineCoverageToColorStateCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineCoverageToColorStateCreateInfoNV flags(@NativeType("VkPipelineCoverageToColorStateCreateFlagsNV") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorEnable(@NativeType("VkBool32") boolean value) {
        ncoverageToColorEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorLocation(@NativeType("uint32_t") int value) {
        ncoverageToColorLocation(address(), value);
        return this;
    }

    public VkPipelineCoverageToColorStateCreateInfoNV set(int sType, long pNext, int flags, boolean coverageToColorEnable, int coverageToColorLocation) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        coverageToColorEnable(coverageToColorEnable);
        coverageToColorLocation(coverageToColorLocation);
        return this;
    }

    public VkPipelineCoverageToColorStateCreateInfoNV set(VkPipelineCoverageToColorStateCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineCoverageToColorStateCreateInfoNV malloc() {
        return new VkPipelineCoverageToColorStateCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineCoverageToColorStateCreateInfoNV calloc() {
        return new VkPipelineCoverageToColorStateCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineCoverageToColorStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCoverageToColorStateCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineCoverageToColorStateCreateInfoNV create(long address) {
        return new VkPipelineCoverageToColorStateCreateInfoNV(address, null);
    }

    public static VkPipelineCoverageToColorStateCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineCoverageToColorStateCreateInfoNV(address, null);
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

    public static VkPipelineCoverageToColorStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineCoverageToColorStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineCoverageToColorStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineCoverageToColorStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncoverageToColorEnable(long struct) {
        return MemoryUtil.memGetInt(struct + COVERAGETOCOLORENABLE);
    }

    public static int ncoverageToColorLocation(long struct) {
        return MemoryUtil.memGetInt(struct + COVERAGETOCOLORLOCATION);
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

    public static void ncoverageToColorEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + COVERAGETOCOLORENABLE, value);
    }

    public static void ncoverageToColorLocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + COVERAGETOCOLORLOCATION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCoverageToColorStateCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCoverageToColorStateCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineCoverageToColorStateCreateInfoNV, Buffer> implements NativeResource {
        private static final VkPipelineCoverageToColorStateCreateInfoNV ELEMENT_FACTORY = VkPipelineCoverageToColorStateCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineCoverageToColorStateCreateInfoNV.SIZEOF);
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
        public VkPipelineCoverageToColorStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineCoverageToColorStateCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineCoverageToColorStateCreateInfoNV.npNext(address());
        }

        @NativeType("VkPipelineCoverageToColorStateCreateFlagsNV")
        public int flags() {
            return VkPipelineCoverageToColorStateCreateInfoNV.nflags(address());
        }

        @NativeType("VkBool32")
        public boolean coverageToColorEnable() {
            return VkPipelineCoverageToColorStateCreateInfoNV.ncoverageToColorEnable(address()) != 0;
        }

        @NativeType("uint32_t")
        public int coverageToColorLocation() {
            return VkPipelineCoverageToColorStateCreateInfoNV.ncoverageToColorLocation(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineCoverageToColorStateCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVFragmentCoverageToColor.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineCoverageToColorStateCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineCoverageToColorStateCreateFlagsNV") int value) {
            VkPipelineCoverageToColorStateCreateInfoNV.nflags(address(), value);
            return this;
        }

        public Buffer coverageToColorEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineCoverageToColorStateCreateInfoNV.ncoverageToColorEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer coverageToColorLocation(@NativeType("uint32_t") int value) {
            VkPipelineCoverageToColorStateCreateInfoNV.ncoverageToColorLocation(address(), value);
            return this;
        }
    }
}
