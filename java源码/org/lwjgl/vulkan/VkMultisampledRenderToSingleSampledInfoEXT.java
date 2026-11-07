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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultisampledRenderToSingleSampledInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultisampledRenderToSingleSampledInfoEXT.class */
public class VkMultisampledRenderToSingleSampledInfoEXT extends Struct<VkMultisampledRenderToSingleSampledInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MULTISAMPLEDRENDERTOSINGLESAMPLEDENABLE;
    public static final int RASTERIZATIONSAMPLES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MULTISAMPLEDRENDERTOSINGLESAMPLEDENABLE = layout.offsetof(2);
        RASTERIZATIONSAMPLES = layout.offsetof(3);
    }

    protected VkMultisampledRenderToSingleSampledInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMultisampledRenderToSingleSampledInfoEXT create(long address, ByteBuffer container) {
        return new VkMultisampledRenderToSingleSampledInfoEXT(address, container);
    }

    public VkMultisampledRenderToSingleSampledInfoEXT(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean multisampledRenderToSingleSampledEnable() {
        return nmultisampledRenderToSingleSampledEnable(address()) != 0;
    }

    @NativeType("VkSampleCountFlagBits")
    public int rasterizationSamples() {
        return nrasterizationSamples(address());
    }

    public VkMultisampledRenderToSingleSampledInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMultisampledRenderToSingleSampledInfoEXT sType$Default() {
        return sType(EXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT);
    }

    public VkMultisampledRenderToSingleSampledInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMultisampledRenderToSingleSampledInfoEXT multisampledRenderToSingleSampledEnable(@NativeType("VkBool32") boolean value) {
        nmultisampledRenderToSingleSampledEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkMultisampledRenderToSingleSampledInfoEXT rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) {
        nrasterizationSamples(address(), value);
        return this;
    }

    public VkMultisampledRenderToSingleSampledInfoEXT set(int sType, long pNext, boolean multisampledRenderToSingleSampledEnable, int rasterizationSamples) {
        sType(sType);
        pNext(pNext);
        multisampledRenderToSingleSampledEnable(multisampledRenderToSingleSampledEnable);
        rasterizationSamples(rasterizationSamples);
        return this;
    }

    public VkMultisampledRenderToSingleSampledInfoEXT set(VkMultisampledRenderToSingleSampledInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMultisampledRenderToSingleSampledInfoEXT malloc() {
        return new VkMultisampledRenderToSingleSampledInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMultisampledRenderToSingleSampledInfoEXT calloc() {
        return new VkMultisampledRenderToSingleSampledInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMultisampledRenderToSingleSampledInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMultisampledRenderToSingleSampledInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMultisampledRenderToSingleSampledInfoEXT create(long address) {
        return new VkMultisampledRenderToSingleSampledInfoEXT(address, null);
    }

    public static VkMultisampledRenderToSingleSampledInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMultisampledRenderToSingleSampledInfoEXT(address, null);
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

    public static VkMultisampledRenderToSingleSampledInfoEXT malloc(MemoryStack stack) {
        return new VkMultisampledRenderToSingleSampledInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMultisampledRenderToSingleSampledInfoEXT calloc(MemoryStack stack) {
        return new VkMultisampledRenderToSingleSampledInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmultisampledRenderToSingleSampledEnable(long struct) {
        return MemoryUtil.memGetInt(struct + MULTISAMPLEDRENDERTOSINGLESAMPLEDENABLE);
    }

    public static int nrasterizationSamples(long struct) {
        return MemoryUtil.memGetInt(struct + RASTERIZATIONSAMPLES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmultisampledRenderToSingleSampledEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + MULTISAMPLEDRENDERTOSINGLESAMPLEDENABLE, value);
    }

    public static void nrasterizationSamples(long struct, int value) {
        MemoryUtil.memPutInt(struct + RASTERIZATIONSAMPLES, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultisampledRenderToSingleSampledInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultisampledRenderToSingleSampledInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMultisampledRenderToSingleSampledInfoEXT, Buffer> implements NativeResource {
        private static final VkMultisampledRenderToSingleSampledInfoEXT ELEMENT_FACTORY = VkMultisampledRenderToSingleSampledInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMultisampledRenderToSingleSampledInfoEXT.SIZEOF);
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
        public VkMultisampledRenderToSingleSampledInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMultisampledRenderToSingleSampledInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMultisampledRenderToSingleSampledInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean multisampledRenderToSingleSampledEnable() {
            return VkMultisampledRenderToSingleSampledInfoEXT.nmultisampledRenderToSingleSampledEnable(address()) != 0;
        }

        @NativeType("VkSampleCountFlagBits")
        public int rasterizationSamples() {
            return VkMultisampledRenderToSingleSampledInfoEXT.nrasterizationSamples(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMultisampledRenderToSingleSampledInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMultisampledRenderToSingleSampledInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer multisampledRenderToSingleSampledEnable(@NativeType("VkBool32") boolean value) {
            VkMultisampledRenderToSingleSampledInfoEXT.nmultisampledRenderToSingleSampledEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) {
            VkMultisampledRenderToSingleSampledInfoEXT.nrasterizationSamples(address(), value);
            return this;
        }
    }
}
