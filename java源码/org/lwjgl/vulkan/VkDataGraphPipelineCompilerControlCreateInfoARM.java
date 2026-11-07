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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineCompilerControlCreateInfoARM.class */
public class VkDataGraphPipelineCompilerControlCreateInfoARM extends Struct<VkDataGraphPipelineCompilerControlCreateInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PVENDOROPTIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PVENDOROPTIONS = layout.offsetof(2);
    }

    protected VkDataGraphPipelineCompilerControlCreateInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphPipelineCompilerControlCreateInfoARM create(long address, ByteBuffer container) {
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(address, container);
    }

    public VkDataGraphPipelineCompilerControlCreateInfoARM(ByteBuffer container) {
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

    @NativeType("char const *")
    public ByteBuffer pVendorOptions() {
        return npVendorOptions(address());
    }

    @NativeType("char const *")
    public String pVendorOptionsString() {
        return npVendorOptionsString(address());
    }

    public VkDataGraphPipelineCompilerControlCreateInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphPipelineCompilerControlCreateInfoARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM);
    }

    public VkDataGraphPipelineCompilerControlCreateInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphPipelineCompilerControlCreateInfoARM pVendorOptions(@NativeType("char const *") ByteBuffer value) {
        npVendorOptions(address(), value);
        return this;
    }

    public VkDataGraphPipelineCompilerControlCreateInfoARM set(int sType, long pNext, ByteBuffer pVendorOptions) {
        sType(sType);
        pNext(pNext);
        pVendorOptions(pVendorOptions);
        return this;
    }

    public VkDataGraphPipelineCompilerControlCreateInfoARM set(VkDataGraphPipelineCompilerControlCreateInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphPipelineCompilerControlCreateInfoARM malloc() {
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphPipelineCompilerControlCreateInfoARM calloc() {
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphPipelineCompilerControlCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphPipelineCompilerControlCreateInfoARM create(long address) {
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(address, null);
    }

    public static VkDataGraphPipelineCompilerControlCreateInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(address, null);
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

    public static VkDataGraphPipelineCompilerControlCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphPipelineCompilerControlCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineCompilerControlCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer npVendorOptions(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + PVENDOROPTIONS));
    }

    public static String npVendorOptionsString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + PVENDOROPTIONS));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npVendorOptions(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + PVENDOROPTIONS, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PVENDOROPTIONS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineCompilerControlCreateInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineCompilerControlCreateInfoARM, Buffer> implements NativeResource {
        private static final VkDataGraphPipelineCompilerControlCreateInfoARM ELEMENT_FACTORY = VkDataGraphPipelineCompilerControlCreateInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphPipelineCompilerControlCreateInfoARM.SIZEOF);
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
        public VkDataGraphPipelineCompilerControlCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphPipelineCompilerControlCreateInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDataGraphPipelineCompilerControlCreateInfoARM.npNext(address());
        }

        @NativeType("char const *")
        public ByteBuffer pVendorOptions() {
            return VkDataGraphPipelineCompilerControlCreateInfoARM.npVendorOptions(address());
        }

        @NativeType("char const *")
        public String pVendorOptionsString() {
            return VkDataGraphPipelineCompilerControlCreateInfoARM.npVendorOptionsString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphPipelineCompilerControlCreateInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDataGraphPipelineCompilerControlCreateInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer pVendorOptions(@NativeType("char const *") ByteBuffer value) {
            VkDataGraphPipelineCompilerControlCreateInfoARM.npVendorOptions(address(), value);
            return this;
        }
    }
}
