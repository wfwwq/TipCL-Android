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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushDescriptorSetWithTemplateInfo.class */
public class VkPushDescriptorSetWithTemplateInfo extends Struct<VkPushDescriptorSetWithTemplateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DESCRIPTORUPDATETEMPLATE;
    public static final int LAYOUT;
    public static final int SET;
    public static final int PDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORUPDATETEMPLATE = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        SET = layout.offsetof(4);
        PDATA = layout.offsetof(5);
    }

    protected VkPushDescriptorSetWithTemplateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPushDescriptorSetWithTemplateInfo create(long address, ByteBuffer container) {
        return new VkPushDescriptorSetWithTemplateInfo(address, container);
    }

    public VkPushDescriptorSetWithTemplateInfo(ByteBuffer container) {
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

    @NativeType("VkDescriptorUpdateTemplate")
    public long descriptorUpdateTemplate() {
        return ndescriptorUpdateTemplate(address());
    }

    @NativeType("VkPipelineLayout")
    public long layout() {
        return nlayout(address());
    }

    @NativeType("uint32_t")
    public int set() {
        return nset(address());
    }

    @NativeType("void const *")
    public long pData() {
        return npData(address());
    }

    public VkPushDescriptorSetWithTemplateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPushDescriptorSetWithTemplateInfo sType$Default() {
        return sType(1000545006);
    }

    public VkPushDescriptorSetWithTemplateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPushDescriptorSetWithTemplateInfo pNext(VkPipelineLayoutCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPushDescriptorSetWithTemplateInfo descriptorUpdateTemplate(@NativeType("VkDescriptorUpdateTemplate") long value) {
        ndescriptorUpdateTemplate(address(), value);
        return this;
    }

    public VkPushDescriptorSetWithTemplateInfo layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    public VkPushDescriptorSetWithTemplateInfo set(@NativeType("uint32_t") int value) {
        nset(address(), value);
        return this;
    }

    public VkPushDescriptorSetWithTemplateInfo pData(@NativeType("void const *") long value) {
        npData(address(), value);
        return this;
    }

    public VkPushDescriptorSetWithTemplateInfo set(int sType, long pNext, long descriptorUpdateTemplate, long layout, int set, long pData) {
        sType(sType);
        pNext(pNext);
        descriptorUpdateTemplate(descriptorUpdateTemplate);
        layout(layout);
        set(set);
        pData(pData);
        return this;
    }

    public VkPushDescriptorSetWithTemplateInfo set(VkPushDescriptorSetWithTemplateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPushDescriptorSetWithTemplateInfo malloc() {
        return new VkPushDescriptorSetWithTemplateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPushDescriptorSetWithTemplateInfo calloc() {
        return new VkPushDescriptorSetWithTemplateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPushDescriptorSetWithTemplateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushDescriptorSetWithTemplateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPushDescriptorSetWithTemplateInfo create(long address) {
        return new VkPushDescriptorSetWithTemplateInfo(address, null);
    }

    public static VkPushDescriptorSetWithTemplateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPushDescriptorSetWithTemplateInfo(address, null);
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

    public static VkPushDescriptorSetWithTemplateInfo malloc(MemoryStack stack) {
        return new VkPushDescriptorSetWithTemplateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPushDescriptorSetWithTemplateInfo calloc(MemoryStack stack) {
        return new VkPushDescriptorSetWithTemplateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndescriptorUpdateTemplate(long struct) {
        return MemoryUtil.memGetLong(struct + DESCRIPTORUPDATETEMPLATE);
    }

    public static long nlayout(long struct) {
        return MemoryUtil.memGetLong(struct + LAYOUT);
    }

    public static int nset(long struct) {
        return MemoryUtil.memGetInt(struct + SET);
    }

    public static long npData(long struct) {
        return MemoryUtil.memGetAddress(struct + PDATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndescriptorUpdateTemplate(long struct, long value) {
        MemoryUtil.memPutLong(struct + DESCRIPTORUPDATETEMPLATE, value);
    }

    public static void nlayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + LAYOUT, value);
    }

    public static void nset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SET, value);
    }

    public static void npData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PDATA, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PDATA));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushDescriptorSetWithTemplateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPushDescriptorSetWithTemplateInfo, Buffer> implements NativeResource {
        private static final VkPushDescriptorSetWithTemplateInfo ELEMENT_FACTORY = VkPushDescriptorSetWithTemplateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPushDescriptorSetWithTemplateInfo.SIZEOF);
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
        public VkPushDescriptorSetWithTemplateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPushDescriptorSetWithTemplateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPushDescriptorSetWithTemplateInfo.npNext(address());
        }

        @NativeType("VkDescriptorUpdateTemplate")
        public long descriptorUpdateTemplate() {
            return VkPushDescriptorSetWithTemplateInfo.ndescriptorUpdateTemplate(address());
        }

        @NativeType("VkPipelineLayout")
        public long layout() {
            return VkPushDescriptorSetWithTemplateInfo.nlayout(address());
        }

        @NativeType("uint32_t")
        public int set() {
            return VkPushDescriptorSetWithTemplateInfo.nset(address());
        }

        @NativeType("void const *")
        public long pData() {
            return VkPushDescriptorSetWithTemplateInfo.npData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPushDescriptorSetWithTemplateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000545006);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPushDescriptorSetWithTemplateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineLayoutCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer descriptorUpdateTemplate(@NativeType("VkDescriptorUpdateTemplate") long value) {
            VkPushDescriptorSetWithTemplateInfo.ndescriptorUpdateTemplate(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkPushDescriptorSetWithTemplateInfo.nlayout(address(), value);
            return this;
        }

        public Buffer set(@NativeType("uint32_t") int value) {
            VkPushDescriptorSetWithTemplateInfo.nset(address(), value);
            return this;
        }

        public Buffer pData(@NativeType("void const *") long value) {
            VkPushDescriptorSetWithTemplateInfo.npData(address(), value);
            return this;
        }
    }
}
