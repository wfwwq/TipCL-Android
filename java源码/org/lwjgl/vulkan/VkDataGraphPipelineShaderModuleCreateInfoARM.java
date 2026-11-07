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
import org.lwjgl.vulkan.VkDataGraphPipelineConstantARM;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineShaderModuleCreateInfoARM.class */
public class VkDataGraphPipelineShaderModuleCreateInfoARM extends Struct<VkDataGraphPipelineShaderModuleCreateInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MODULE;
    public static final int PNAME;
    public static final int PSPECIALIZATIONINFO;
    public static final int CONSTANTCOUNT;
    public static final int PCONSTANTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MODULE = layout.offsetof(2);
        PNAME = layout.offsetof(3);
        PSPECIALIZATIONINFO = layout.offsetof(4);
        CONSTANTCOUNT = layout.offsetof(5);
        PCONSTANTS = layout.offsetof(6);
    }

    protected VkDataGraphPipelineShaderModuleCreateInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphPipelineShaderModuleCreateInfoARM create(long address, ByteBuffer container) {
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(address, container);
    }

    public VkDataGraphPipelineShaderModuleCreateInfoARM(ByteBuffer container) {
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

    @NativeType("VkShaderModule")
    public long module() {
        return nmodule(address());
    }

    @NativeType("char const *")
    public ByteBuffer pName() {
        return npName(address());
    }

    @NativeType("char const *")
    public String pNameString() {
        return npNameString(address());
    }

    @NativeType("VkSpecializationInfo const *")
    public VkSpecializationInfo pSpecializationInfo() {
        return npSpecializationInfo(address());
    }

    @NativeType("uint32_t")
    public int constantCount() {
        return nconstantCount(address());
    }

    @NativeType("VkDataGraphPipelineConstantARM const *")
    public VkDataGraphPipelineConstantARM.Buffer pConstants() {
        return npConstants(address());
    }

    public VkDataGraphPipelineShaderModuleCreateInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphPipelineShaderModuleCreateInfoARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM);
    }

    public VkDataGraphPipelineShaderModuleCreateInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphPipelineShaderModuleCreateInfoARM module(@NativeType("VkShaderModule") long value) {
        nmodule(address(), value);
        return this;
    }

    public VkDataGraphPipelineShaderModuleCreateInfoARM pName(@NativeType("char const *") ByteBuffer value) {
        npName(address(), value);
        return this;
    }

    public VkDataGraphPipelineShaderModuleCreateInfoARM pSpecializationInfo(@NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) {
        npSpecializationInfo(address(), value);
        return this;
    }

    public VkDataGraphPipelineShaderModuleCreateInfoARM constantCount(@NativeType("uint32_t") int value) {
        nconstantCount(address(), value);
        return this;
    }

    public VkDataGraphPipelineShaderModuleCreateInfoARM pConstants(@NativeType("VkDataGraphPipelineConstantARM const *") VkDataGraphPipelineConstantARM.Buffer value) {
        npConstants(address(), value);
        return this;
    }

    public VkDataGraphPipelineShaderModuleCreateInfoARM set(int sType, long pNext, long module, ByteBuffer pName, VkSpecializationInfo pSpecializationInfo, int constantCount, VkDataGraphPipelineConstantARM.Buffer pConstants) {
        sType(sType);
        pNext(pNext);
        module(module);
        pName(pName);
        pSpecializationInfo(pSpecializationInfo);
        constantCount(constantCount);
        pConstants(pConstants);
        return this;
    }

    public VkDataGraphPipelineShaderModuleCreateInfoARM set(VkDataGraphPipelineShaderModuleCreateInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphPipelineShaderModuleCreateInfoARM malloc() {
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphPipelineShaderModuleCreateInfoARM calloc() {
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphPipelineShaderModuleCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphPipelineShaderModuleCreateInfoARM create(long address) {
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(address, null);
    }

    public static VkDataGraphPipelineShaderModuleCreateInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(address, null);
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

    public static VkDataGraphPipelineShaderModuleCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphPipelineShaderModuleCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nmodule(long struct) {
        return MemoryUtil.memGetLong(struct + MODULE);
    }

    public static ByteBuffer npName(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + PNAME));
    }

    public static String npNameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + PNAME));
    }

    public static VkSpecializationInfo npSpecializationInfo(long struct) {
        return VkSpecializationInfo.createSafe(MemoryUtil.memGetAddress(struct + PSPECIALIZATIONINFO));
    }

    public static int nconstantCount(long struct) {
        return MemoryUtil.memGetInt(struct + CONSTANTCOUNT);
    }

    public static VkDataGraphPipelineConstantARM.Buffer npConstants(long struct) {
        return VkDataGraphPipelineConstantARM.createSafe(MemoryUtil.memGetAddress(struct + PCONSTANTS), nconstantCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmodule(long struct, long value) {
        MemoryUtil.memPutLong(struct + MODULE, value);
    }

    public static void npName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + PNAME, MemoryUtil.memAddress(value));
    }

    public static void npSpecializationInfo(long struct, VkSpecializationInfo value) {
        MemoryUtil.memPutAddress(struct + PSPECIALIZATIONINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void nconstantCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONSTANTCOUNT, value);
    }

    public static void npConstants(long struct, VkDataGraphPipelineConstantARM.Buffer value) {
        MemoryUtil.memPutAddress(struct + PCONSTANTS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nconstantCount(struct, value.remaining());
        }
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PNAME));
        long pSpecializationInfo = MemoryUtil.memGetAddress(struct + PSPECIALIZATIONINFO);
        if (pSpecializationInfo != 0) {
            VkSpecializationInfo.validate(pSpecializationInfo);
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineShaderModuleCreateInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineShaderModuleCreateInfoARM, Buffer> implements NativeResource {
        private static final VkDataGraphPipelineShaderModuleCreateInfoARM ELEMENT_FACTORY = VkDataGraphPipelineShaderModuleCreateInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphPipelineShaderModuleCreateInfoARM.SIZEOF);
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
        public VkDataGraphPipelineShaderModuleCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphPipelineShaderModuleCreateInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDataGraphPipelineShaderModuleCreateInfoARM.npNext(address());
        }

        @NativeType("VkShaderModule")
        public long module() {
            return VkDataGraphPipelineShaderModuleCreateInfoARM.nmodule(address());
        }

        @NativeType("char const *")
        public ByteBuffer pName() {
            return VkDataGraphPipelineShaderModuleCreateInfoARM.npName(address());
        }

        @NativeType("char const *")
        public String pNameString() {
            return VkDataGraphPipelineShaderModuleCreateInfoARM.npNameString(address());
        }

        @NativeType("VkSpecializationInfo const *")
        public VkSpecializationInfo pSpecializationInfo() {
            return VkDataGraphPipelineShaderModuleCreateInfoARM.npSpecializationInfo(address());
        }

        @NativeType("uint32_t")
        public int constantCount() {
            return VkDataGraphPipelineShaderModuleCreateInfoARM.nconstantCount(address());
        }

        @NativeType("VkDataGraphPipelineConstantARM const *")
        public VkDataGraphPipelineConstantARM.Buffer pConstants() {
            return VkDataGraphPipelineShaderModuleCreateInfoARM.npConstants(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphPipelineShaderModuleCreateInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDataGraphPipelineShaderModuleCreateInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer module(@NativeType("VkShaderModule") long value) {
            VkDataGraphPipelineShaderModuleCreateInfoARM.nmodule(address(), value);
            return this;
        }

        public Buffer pName(@NativeType("char const *") ByteBuffer value) {
            VkDataGraphPipelineShaderModuleCreateInfoARM.npName(address(), value);
            return this;
        }

        public Buffer pSpecializationInfo(@NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) {
            VkDataGraphPipelineShaderModuleCreateInfoARM.npSpecializationInfo(address(), value);
            return this;
        }

        public Buffer constantCount(@NativeType("uint32_t") int value) {
            VkDataGraphPipelineShaderModuleCreateInfoARM.nconstantCount(address(), value);
            return this;
        }

        public Buffer pConstants(@NativeType("VkDataGraphPipelineConstantARM const *") VkDataGraphPipelineConstantARM.Buffer value) {
            VkDataGraphPipelineShaderModuleCreateInfoARM.npConstants(address(), value);
            return this;
        }
    }
}
