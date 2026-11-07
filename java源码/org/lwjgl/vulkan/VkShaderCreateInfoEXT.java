package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkPushConstantRange;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderCreateInfoEXT.class */
public class VkShaderCreateInfoEXT extends Struct<VkShaderCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int STAGE;
    public static final int NEXTSTAGE;
    public static final int CODETYPE;
    public static final int CODESIZE;
    public static final int PCODE;
    public static final int PNAME;
    public static final int SETLAYOUTCOUNT;
    public static final int PSETLAYOUTS;
    public static final int PUSHCONSTANTRANGECOUNT;
    public static final int PPUSHCONSTANTRANGES;
    public static final int PSPECIALIZATIONINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGE = layout.offsetof(3);
        NEXTSTAGE = layout.offsetof(4);
        CODETYPE = layout.offsetof(5);
        CODESIZE = layout.offsetof(6);
        PCODE = layout.offsetof(7);
        PNAME = layout.offsetof(8);
        SETLAYOUTCOUNT = layout.offsetof(9);
        PSETLAYOUTS = layout.offsetof(10);
        PUSHCONSTANTRANGECOUNT = layout.offsetof(11);
        PPUSHCONSTANTRANGES = layout.offsetof(12);
        PSPECIALIZATIONINFO = layout.offsetof(13);
    }

    protected VkShaderCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkShaderCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkShaderCreateInfoEXT(address, container);
    }

    public VkShaderCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkShaderCreateFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkShaderStageFlagBits")
    public int stage() {
        return nstage(address());
    }

    @NativeType("VkShaderStageFlags")
    public int nextStage() {
        return nnextStage(address());
    }

    @NativeType("VkShaderCodeTypeEXT")
    public int codeType() {
        return ncodeType(address());
    }

    @NativeType("size_t")
    public long codeSize() {
        return ncodeSize(address());
    }

    @NativeType("void const *")
    public ByteBuffer pCode() {
        return npCode(address());
    }

    @NativeType("char const *")
    public ByteBuffer pName() {
        return npName(address());
    }

    @NativeType("char const *")
    public String pNameString() {
        return npNameString(address());
    }

    @NativeType("uint32_t")
    public int setLayoutCount() {
        return nsetLayoutCount(address());
    }

    @NativeType("VkDescriptorSetLayout const *")
    public LongBuffer pSetLayouts() {
        return npSetLayouts(address());
    }

    @NativeType("uint32_t")
    public int pushConstantRangeCount() {
        return npushConstantRangeCount(address());
    }

    @NativeType("VkPushConstantRange const *")
    public VkPushConstantRange.Buffer pPushConstantRanges() {
        return npPushConstantRanges(address());
    }

    @NativeType("VkSpecializationInfo const *")
    public VkSpecializationInfo pSpecializationInfo() {
        return npSpecializationInfo(address());
    }

    public VkShaderCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT sType$Default() {
        return sType(EXTShaderObject.VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT);
    }

    public VkShaderCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT pNext(VkCustomResolveCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkShaderCreateInfoEXT pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkShaderCreateInfoEXT pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkShaderCreateInfoEXT pNext(VkShaderDescriptorSetAndBindingMappingInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkShaderCreateInfoEXT pNext(VkShaderRequiredSubgroupSizeCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkShaderCreateInfoEXT pNext(VkValidationFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkShaderCreateInfoEXT flags(@NativeType("VkShaderCreateFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT stage(@NativeType("VkShaderStageFlagBits") int value) {
        nstage(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT nextStage(@NativeType("VkShaderStageFlags") int value) {
        nnextStage(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT codeType(@NativeType("VkShaderCodeTypeEXT") int value) {
        ncodeType(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT pCode(@NativeType("void const *") ByteBuffer value) {
        npCode(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT pName(@NativeType("char const *") ByteBuffer value) {
        npName(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT setLayoutCount(@NativeType("uint32_t") int value) {
        nsetLayoutCount(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT pSetLayouts(@NativeType("VkDescriptorSetLayout const *") LongBuffer value) {
        npSetLayouts(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT pushConstantRangeCount(@NativeType("uint32_t") int value) {
        npushConstantRangeCount(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT pPushConstantRanges(@NativeType("VkPushConstantRange const *") VkPushConstantRange.Buffer value) {
        npPushConstantRanges(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT pSpecializationInfo(@NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) {
        npSpecializationInfo(address(), value);
        return this;
    }

    public VkShaderCreateInfoEXT set(int sType, long pNext, int flags, int stage, int nextStage, int codeType, ByteBuffer pCode, ByteBuffer pName, int setLayoutCount, LongBuffer pSetLayouts, int pushConstantRangeCount, VkPushConstantRange.Buffer pPushConstantRanges, VkSpecializationInfo pSpecializationInfo) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stage(stage);
        nextStage(nextStage);
        codeType(codeType);
        pCode(pCode);
        pName(pName);
        setLayoutCount(setLayoutCount);
        pSetLayouts(pSetLayouts);
        pushConstantRangeCount(pushConstantRangeCount);
        pPushConstantRanges(pPushConstantRanges);
        pSpecializationInfo(pSpecializationInfo);
        return this;
    }

    public VkShaderCreateInfoEXT set(VkShaderCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkShaderCreateInfoEXT malloc() {
        return new VkShaderCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkShaderCreateInfoEXT calloc() {
        return new VkShaderCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkShaderCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkShaderCreateInfoEXT create(long address) {
        return new VkShaderCreateInfoEXT(address, null);
    }

    public static VkShaderCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkShaderCreateInfoEXT(address, null);
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

    public static VkShaderCreateInfoEXT malloc(MemoryStack stack) {
        return new VkShaderCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkShaderCreateInfoEXT calloc(MemoryStack stack) {
        return new VkShaderCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nnextStage(long struct) {
        return MemoryUtil.memGetInt(struct + NEXTSTAGE);
    }

    public static int ncodeType(long struct) {
        return MemoryUtil.memGetInt(struct + CODETYPE);
    }

    public static long ncodeSize(long struct) {
        return MemoryUtil.memGetAddress(struct + CODESIZE);
    }

    public static ByteBuffer npCode(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PCODE), (int) ncodeSize(struct));
    }

    public static ByteBuffer npName(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + PNAME));
    }

    public static String npNameString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + PNAME));
    }

    public static int nsetLayoutCount(long struct) {
        return MemoryUtil.memGetInt(struct + SETLAYOUTCOUNT);
    }

    public static LongBuffer npSetLayouts(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PSETLAYOUTS), nsetLayoutCount(struct));
    }

    public static int npushConstantRangeCount(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHCONSTANTRANGECOUNT);
    }

    public static VkPushConstantRange.Buffer npPushConstantRanges(long struct) {
        return VkPushConstantRange.createSafe(MemoryUtil.memGetAddress(struct + PPUSHCONSTANTRANGES), npushConstantRangeCount(struct));
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

    public static void nnextStage(long struct, int value) {
        MemoryUtil.memPutInt(struct + NEXTSTAGE, value);
    }

    public static void ncodeType(long struct, int value) {
        MemoryUtil.memPutInt(struct + CODETYPE, value);
    }

    public static void ncodeSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + CODESIZE, value);
    }

    public static void npCode(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PCODE, MemoryUtil.memAddress(value));
        ncodeSize(struct, value.remaining());
    }

    public static void npName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + PNAME, MemoryUtil.memAddressSafe(value));
    }

    public static void nsetLayoutCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SETLAYOUTCOUNT, value);
    }

    public static void npSetLayouts(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSETLAYOUTS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nsetLayoutCount(struct, value.remaining());
        }
    }

    public static void npushConstantRangeCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHCONSTANTRANGECOUNT, value);
    }

    public static void npPushConstantRanges(long struct, VkPushConstantRange.Buffer value) {
        MemoryUtil.memPutAddress(struct + PPUSHCONSTANTRANGES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            npushConstantRangeCount(struct, value.remaining());
        }
    }

    public static void npSpecializationInfo(long struct, VkSpecializationInfo value) {
        MemoryUtil.memPutAddress(struct + PSPECIALIZATIONINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PCODE));
        long pSpecializationInfo = MemoryUtil.memGetAddress(struct + PSPECIALIZATIONINFO);
        if (pSpecializationInfo != 0) {
            VkSpecializationInfo.validate(pSpecializationInfo);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkShaderCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkShaderCreateInfoEXT ELEMENT_FACTORY = VkShaderCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkShaderCreateInfoEXT.SIZEOF);
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
        public VkShaderCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkShaderCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkShaderCreateInfoEXT.npNext(address());
        }

        @NativeType("VkShaderCreateFlagsEXT")
        public int flags() {
            return VkShaderCreateInfoEXT.nflags(address());
        }

        @NativeType("VkShaderStageFlagBits")
        public int stage() {
            return VkShaderCreateInfoEXT.nstage(address());
        }

        @NativeType("VkShaderStageFlags")
        public int nextStage() {
            return VkShaderCreateInfoEXT.nnextStage(address());
        }

        @NativeType("VkShaderCodeTypeEXT")
        public int codeType() {
            return VkShaderCreateInfoEXT.ncodeType(address());
        }

        @NativeType("size_t")
        public long codeSize() {
            return VkShaderCreateInfoEXT.ncodeSize(address());
        }

        @NativeType("void const *")
        public ByteBuffer pCode() {
            return VkShaderCreateInfoEXT.npCode(address());
        }

        @NativeType("char const *")
        public ByteBuffer pName() {
            return VkShaderCreateInfoEXT.npName(address());
        }

        @NativeType("char const *")
        public String pNameString() {
            return VkShaderCreateInfoEXT.npNameString(address());
        }

        @NativeType("uint32_t")
        public int setLayoutCount() {
            return VkShaderCreateInfoEXT.nsetLayoutCount(address());
        }

        @NativeType("VkDescriptorSetLayout const *")
        public LongBuffer pSetLayouts() {
            return VkShaderCreateInfoEXT.npSetLayouts(address());
        }

        @NativeType("uint32_t")
        public int pushConstantRangeCount() {
            return VkShaderCreateInfoEXT.npushConstantRangeCount(address());
        }

        @NativeType("VkPushConstantRange const *")
        public VkPushConstantRange.Buffer pPushConstantRanges() {
            return VkShaderCreateInfoEXT.npPushConstantRanges(address());
        }

        @NativeType("VkSpecializationInfo const *")
        public VkSpecializationInfo pSpecializationInfo() {
            return VkShaderCreateInfoEXT.npSpecializationInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkShaderCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderObject.VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkShaderCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkCustomResolveCreateInfoEXT value) {
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

        public Buffer pNext(VkShaderRequiredSubgroupSizeCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkValidationFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkShaderCreateFlagsEXT") int value) {
            VkShaderCreateInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer stage(@NativeType("VkShaderStageFlagBits") int value) {
            VkShaderCreateInfoEXT.nstage(address(), value);
            return this;
        }

        public Buffer nextStage(@NativeType("VkShaderStageFlags") int value) {
            VkShaderCreateInfoEXT.nnextStage(address(), value);
            return this;
        }

        public Buffer codeType(@NativeType("VkShaderCodeTypeEXT") int value) {
            VkShaderCreateInfoEXT.ncodeType(address(), value);
            return this;
        }

        public Buffer pCode(@NativeType("void const *") ByteBuffer value) {
            VkShaderCreateInfoEXT.npCode(address(), value);
            return this;
        }

        public Buffer pName(@NativeType("char const *") ByteBuffer value) {
            VkShaderCreateInfoEXT.npName(address(), value);
            return this;
        }

        public Buffer setLayoutCount(@NativeType("uint32_t") int value) {
            VkShaderCreateInfoEXT.nsetLayoutCount(address(), value);
            return this;
        }

        public Buffer pSetLayouts(@NativeType("VkDescriptorSetLayout const *") LongBuffer value) {
            VkShaderCreateInfoEXT.npSetLayouts(address(), value);
            return this;
        }

        public Buffer pushConstantRangeCount(@NativeType("uint32_t") int value) {
            VkShaderCreateInfoEXT.npushConstantRangeCount(address(), value);
            return this;
        }

        public Buffer pPushConstantRanges(@NativeType("VkPushConstantRange const *") VkPushConstantRange.Buffer value) {
            VkShaderCreateInfoEXT.npPushConstantRanges(address(), value);
            return this;
        }

        public Buffer pSpecializationInfo(@NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) {
            VkShaderCreateInfoEXT.npSpecializationInfo(address(), value);
            return this;
        }
    }
}
