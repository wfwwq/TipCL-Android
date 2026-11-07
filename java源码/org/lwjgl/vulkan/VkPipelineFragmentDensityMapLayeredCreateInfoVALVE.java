package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.class */
public class VkPipelineFragmentDensityMapLayeredCreateInfoVALVE extends Struct<VkPipelineFragmentDensityMapLayeredCreateInfoVALVE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXFRAGMENTDENSITYMAPLAYERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXFRAGMENTDENSITYMAPLAYERS = layout.offsetof(2);
    }

    protected VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE create(long address, ByteBuffer container) {
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(address, container);
    }

    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int maxFragmentDensityMapLayers() {
        return nmaxFragmentDensityMapLayers(address());
    }

    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE sType$Default() {
        return sType(VALVEFragmentDensityMapLayered.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_DENSITY_MAP_LAYERED_CREATE_INFO_VALVE);
    }

    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE maxFragmentDensityMapLayers(@NativeType("uint32_t") int value) {
        nmaxFragmentDensityMapLayers(address(), value);
        return this;
    }

    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE set(int sType, long pNext, int maxFragmentDensityMapLayers) {
        sType(sType);
        pNext(pNext);
        maxFragmentDensityMapLayers(maxFragmentDensityMapLayers);
        return this;
    }

    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE set(VkPipelineFragmentDensityMapLayeredCreateInfoVALVE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE malloc() {
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE calloc() {
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE create(long address) {
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(address, null);
    }

    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(address, null);
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

    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE malloc(MemoryStack stack) {
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE calloc(MemoryStack stack) {
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxFragmentDensityMapLayers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFRAGMENTDENSITYMAPLAYERS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaxFragmentDensityMapLayers(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXFRAGMENTDENSITYMAPLAYERS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineFragmentDensityMapLayeredCreateInfoVALVE$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineFragmentDensityMapLayeredCreateInfoVALVE, Buffer> implements NativeResource {
        private static final VkPipelineFragmentDensityMapLayeredCreateInfoVALVE ELEMENT_FACTORY = VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.SIZEOF);
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
        public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxFragmentDensityMapLayers() {
            return VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.nmaxFragmentDensityMapLayers(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(VALVEFragmentDensityMapLayered.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_DENSITY_MAP_LAYERED_CREATE_INFO_VALVE);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.npNext(address(), value);
            return this;
        }

        public Buffer maxFragmentDensityMapLayers(@NativeType("uint32_t") int value) {
            VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.nmaxFragmentDensityMapLayers(address(), value);
            return this;
        }
    }
}
