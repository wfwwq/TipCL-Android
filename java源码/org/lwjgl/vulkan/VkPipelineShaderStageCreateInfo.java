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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageCreateInfo.class */
public class VkPipelineShaderStageCreateInfo extends Struct<VkPipelineShaderStageCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int STAGE;
    public static final int MODULE;
    public static final int PNAME;
    public static final int PSPECIALIZATIONINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(8), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGE = layout.offsetof(3);
        MODULE = layout.offsetof(4);
        PNAME = layout.offsetof(5);
        PSPECIALIZATIONINFO = layout.offsetof(6);
    }

    protected VkPipelineShaderStageCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineShaderStageCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineShaderStageCreateInfo(address, container);
    }

    public VkPipelineShaderStageCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineShaderStageCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkShaderStageFlagBits")
    public int stage() {
        return nstage(address());
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

    public VkPipelineShaderStageCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineShaderStageCreateInfo sType$Default() {
        return sType(18);
    }

    public VkPipelineShaderStageCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineShaderStageCreateInfo pNext(VkDebugUtilsObjectNameInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineShaderStageCreateInfo pNext(VkPipelineRobustnessCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineShaderStageCreateInfo pNext(VkPipelineRobustnessCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineShaderStageCreateInfo pNext(VkPipelineShaderStageModuleIdentifierCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineShaderStageCreateInfo pNext(VkPipelineShaderStageNodeCreateInfoAMDX value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineShaderStageCreateInfo pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineShaderStageCreateInfo pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineShaderStageCreateInfo pNext(VkShaderDescriptorSetAndBindingMappingInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineShaderStageCreateInfo pNext(VkShaderModuleCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineShaderStageCreateInfo pNext(VkShaderModuleValidationCacheCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineShaderStageCreateInfo pNext(VkShaderRequiredSubgroupSizeCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineShaderStageCreateInfo flags(@NativeType("VkPipelineShaderStageCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineShaderStageCreateInfo stage(@NativeType("VkShaderStageFlagBits") int value) {
        nstage(address(), value);
        return this;
    }

    public VkPipelineShaderStageCreateInfo module(@NativeType("VkShaderModule") long value) {
        nmodule(address(), value);
        return this;
    }

    public VkPipelineShaderStageCreateInfo pName(@NativeType("char const *") ByteBuffer value) {
        npName(address(), value);
        return this;
    }

    public VkPipelineShaderStageCreateInfo pSpecializationInfo(@NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) {
        npSpecializationInfo(address(), value);
        return this;
    }

    public VkPipelineShaderStageCreateInfo set(int sType, long pNext, int flags, int stage, long module, ByteBuffer pName, VkSpecializationInfo pSpecializationInfo) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stage(stage);
        module(module);
        pName(pName);
        pSpecializationInfo(pSpecializationInfo);
        return this;
    }

    public VkPipelineShaderStageCreateInfo set(VkPipelineShaderStageCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineShaderStageCreateInfo malloc() {
        return new VkPipelineShaderStageCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineShaderStageCreateInfo calloc() {
        return new VkPipelineShaderStageCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineShaderStageCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineShaderStageCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineShaderStageCreateInfo create(long address) {
        return new VkPipelineShaderStageCreateInfo(address, null);
    }

    public static VkPipelineShaderStageCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineShaderStageCreateInfo(address, null);
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

    public static VkPipelineShaderStageCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineShaderStageCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineShaderStageCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineShaderStageCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstage(long struct) {
        return MemoryUtil.memGetInt(struct + STAGE);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nstage(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGE, value);
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

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PNAME));
        long pSpecializationInfo = MemoryUtil.memGetAddress(struct + PSPECIALIZATIONINFO);
        if (pSpecializationInfo != 0) {
            VkSpecializationInfo.validate(pSpecializationInfo);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineShaderStageCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineShaderStageCreateInfo ELEMENT_FACTORY = VkPipelineShaderStageCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineShaderStageCreateInfo.SIZEOF);
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
        public VkPipelineShaderStageCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineShaderStageCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineShaderStageCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineShaderStageCreateFlags")
        public int flags() {
            return VkPipelineShaderStageCreateInfo.nflags(address());
        }

        @NativeType("VkShaderStageFlagBits")
        public int stage() {
            return VkPipelineShaderStageCreateInfo.nstage(address());
        }

        @NativeType("VkShaderModule")
        public long module() {
            return VkPipelineShaderStageCreateInfo.nmodule(address());
        }

        @NativeType("char const *")
        public ByteBuffer pName() {
            return VkPipelineShaderStageCreateInfo.npName(address());
        }

        @NativeType("char const *")
        public String pNameString() {
            return VkPipelineShaderStageCreateInfo.npNameString(address());
        }

        @NativeType("VkSpecializationInfo const *")
        public VkSpecializationInfo pSpecializationInfo() {
            return VkPipelineShaderStageCreateInfo.npSpecializationInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineShaderStageCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(18);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineShaderStageCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDebugUtilsObjectNameInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRobustnessCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRobustnessCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineShaderStageModuleIdentifierCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineShaderStageNodeCreateInfoAMDX value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkShaderDescriptorSetAndBindingMappingInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkShaderModuleCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkShaderModuleValidationCacheCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkShaderRequiredSubgroupSizeCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkPipelineShaderStageCreateFlags") int value) {
            VkPipelineShaderStageCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer stage(@NativeType("VkShaderStageFlagBits") int value) {
            VkPipelineShaderStageCreateInfo.nstage(address(), value);
            return this;
        }

        public Buffer module(@NativeType("VkShaderModule") long value) {
            VkPipelineShaderStageCreateInfo.nmodule(address(), value);
            return this;
        }

        public Buffer pName(@NativeType("char const *") ByteBuffer value) {
            VkPipelineShaderStageCreateInfo.npName(address(), value);
            return this;
        }

        public Buffer pSpecializationInfo(@NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) {
            VkPipelineShaderStageCreateInfo.npSpecializationInfo(address(), value);
            return this;
        }
    }
}
