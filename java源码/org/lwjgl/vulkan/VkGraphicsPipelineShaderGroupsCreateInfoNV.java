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
import org.lwjgl.vulkan.VkGraphicsShaderGroupCreateInfoNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGraphicsPipelineShaderGroupsCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGraphicsPipelineShaderGroupsCreateInfoNV.class */
public class VkGraphicsPipelineShaderGroupsCreateInfoNV extends Struct<VkGraphicsPipelineShaderGroupsCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int GROUPCOUNT;
    public static final int PGROUPS;
    public static final int PIPELINECOUNT;
    public static final int PPIPELINES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GROUPCOUNT = layout.offsetof(2);
        PGROUPS = layout.offsetof(3);
        PIPELINECOUNT = layout.offsetof(4);
        PPIPELINES = layout.offsetof(5);
    }

    protected VkGraphicsPipelineShaderGroupsCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGraphicsPipelineShaderGroupsCreateInfoNV create(long address, ByteBuffer container) {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(address, container);
    }

    public VkGraphicsPipelineShaderGroupsCreateInfoNV(ByteBuffer container) {
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
    public int groupCount() {
        return ngroupCount(address());
    }

    @NativeType("VkGraphicsShaderGroupCreateInfoNV const *")
    public VkGraphicsShaderGroupCreateInfoNV.Buffer pGroups() {
        return npGroups(address());
    }

    @NativeType("uint32_t")
    public int pipelineCount() {
        return npipelineCount(address());
    }

    @NativeType("VkPipeline const *")
    public LongBuffer pPipelines() {
        return npPipelines(address());
    }

    public VkGraphicsPipelineShaderGroupsCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkGraphicsPipelineShaderGroupsCreateInfoNV sType$Default() {
        return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV);
    }

    public VkGraphicsPipelineShaderGroupsCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkGraphicsPipelineShaderGroupsCreateInfoNV pGroups(@NativeType("VkGraphicsShaderGroupCreateInfoNV const *") VkGraphicsShaderGroupCreateInfoNV.Buffer value) {
        npGroups(address(), value);
        return this;
    }

    public VkGraphicsPipelineShaderGroupsCreateInfoNV pPipelines(@NativeType("VkPipeline const *") LongBuffer value) {
        npPipelines(address(), value);
        return this;
    }

    public VkGraphicsPipelineShaderGroupsCreateInfoNV set(int sType, long pNext, VkGraphicsShaderGroupCreateInfoNV.Buffer pGroups, LongBuffer pPipelines) {
        sType(sType);
        pNext(pNext);
        pGroups(pGroups);
        pPipelines(pPipelines);
        return this;
    }

    public VkGraphicsPipelineShaderGroupsCreateInfoNV set(VkGraphicsPipelineShaderGroupsCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV malloc() {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV calloc() {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV create(long address) {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(address, null);
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(address, null);
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

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV malloc(MemoryStack stack) {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV calloc(MemoryStack stack) {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ngroupCount(long struct) {
        return MemoryUtil.memGetInt(struct + GROUPCOUNT);
    }

    public static VkGraphicsShaderGroupCreateInfoNV.Buffer npGroups(long struct) {
        return VkGraphicsShaderGroupCreateInfoNV.createSafe(MemoryUtil.memGetAddress(struct + PGROUPS), ngroupCount(struct));
    }

    public static int npipelineCount(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINECOUNT);
    }

    public static LongBuffer npPipelines(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PPIPELINES), npipelineCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ngroupCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + GROUPCOUNT, value);
    }

    public static void npGroups(long struct, VkGraphicsShaderGroupCreateInfoNV.Buffer value) {
        MemoryUtil.memPutAddress(struct + PGROUPS, MemoryUtil.memAddressSafe(value));
        ngroupCount(struct, value == null ? 0 : value.remaining());
    }

    public static void npipelineCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINECOUNT, value);
    }

    public static void npPipelines(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PPIPELINES, MemoryUtil.memAddressSafe(value));
        npipelineCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        int groupCount = ngroupCount(struct);
        if (groupCount != 0) {
            long pGroups = MemoryUtil.memGetAddress(struct + PGROUPS);
            Checks.check(pGroups);
            validate(pGroups, groupCount, VkGraphicsShaderGroupCreateInfoNV.SIZEOF, VkGraphicsShaderGroupCreateInfoNV::validate);
        }
        if (npipelineCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPIPELINES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGraphicsPipelineShaderGroupsCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGraphicsPipelineShaderGroupsCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkGraphicsPipelineShaderGroupsCreateInfoNV, Buffer> implements NativeResource {
        private static final VkGraphicsPipelineShaderGroupsCreateInfoNV ELEMENT_FACTORY = VkGraphicsPipelineShaderGroupsCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGraphicsPipelineShaderGroupsCreateInfoNV.SIZEOF);
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
        public VkGraphicsPipelineShaderGroupsCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkGraphicsPipelineShaderGroupsCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkGraphicsPipelineShaderGroupsCreateInfoNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int groupCount() {
            return VkGraphicsPipelineShaderGroupsCreateInfoNV.ngroupCount(address());
        }

        @NativeType("VkGraphicsShaderGroupCreateInfoNV const *")
        public VkGraphicsShaderGroupCreateInfoNV.Buffer pGroups() {
            return VkGraphicsPipelineShaderGroupsCreateInfoNV.npGroups(address());
        }

        @NativeType("uint32_t")
        public int pipelineCount() {
            return VkGraphicsPipelineShaderGroupsCreateInfoNV.npipelineCount(address());
        }

        @NativeType("VkPipeline const *")
        public LongBuffer pPipelines() {
            return VkGraphicsPipelineShaderGroupsCreateInfoNV.npPipelines(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkGraphicsPipelineShaderGroupsCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkGraphicsPipelineShaderGroupsCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer pGroups(@NativeType("VkGraphicsShaderGroupCreateInfoNV const *") VkGraphicsShaderGroupCreateInfoNV.Buffer value) {
            VkGraphicsPipelineShaderGroupsCreateInfoNV.npGroups(address(), value);
            return this;
        }

        public Buffer pPipelines(@NativeType("VkPipeline const *") LongBuffer value) {
            VkGraphicsPipelineShaderGroupsCreateInfoNV.npPipelines(address(), value);
            return this;
        }
    }
}
