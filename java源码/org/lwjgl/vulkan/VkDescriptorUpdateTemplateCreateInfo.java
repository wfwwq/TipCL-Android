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
import org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfo.class */
public class VkDescriptorUpdateTemplateCreateInfo extends Struct<VkDescriptorUpdateTemplateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DESCRIPTORUPDATEENTRYCOUNT;
    public static final int PDESCRIPTORUPDATEENTRIES;
    public static final int TEMPLATETYPE;
    public static final int DESCRIPTORSETLAYOUT;
    public static final int PIPELINEBINDPOINT;
    public static final int PIPELINELAYOUT;
    public static final int SET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DESCRIPTORUPDATEENTRYCOUNT = layout.offsetof(3);
        PDESCRIPTORUPDATEENTRIES = layout.offsetof(4);
        TEMPLATETYPE = layout.offsetof(5);
        DESCRIPTORSETLAYOUT = layout.offsetof(6);
        PIPELINEBINDPOINT = layout.offsetof(7);
        PIPELINELAYOUT = layout.offsetof(8);
        SET = layout.offsetof(9);
    }

    protected VkDescriptorUpdateTemplateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorUpdateTemplateCreateInfo create(long address, ByteBuffer container) {
        return new VkDescriptorUpdateTemplateCreateInfo(address, container);
    }

    public VkDescriptorUpdateTemplateCreateInfo(ByteBuffer container) {
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

    @NativeType("VkDescriptorUpdateTemplateCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int descriptorUpdateEntryCount() {
        return ndescriptorUpdateEntryCount(address());
    }

    @NativeType("VkDescriptorUpdateTemplateEntry const *")
    public VkDescriptorUpdateTemplateEntry.Buffer pDescriptorUpdateEntries() {
        return npDescriptorUpdateEntries(address());
    }

    @NativeType("VkDescriptorUpdateTemplateType")
    public int templateType() {
        return ntemplateType(address());
    }

    @NativeType("VkDescriptorSetLayout")
    public long descriptorSetLayout() {
        return ndescriptorSetLayout(address());
    }

    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() {
        return npipelineBindPoint(address());
    }

    @NativeType("VkPipelineLayout")
    public long pipelineLayout() {
        return npipelineLayout(address());
    }

    @NativeType("uint32_t")
    public int set() {
        return nset(address());
    }

    public VkDescriptorUpdateTemplateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateCreateInfo sType$Default() {
        return sType(1000085000);
    }

    public VkDescriptorUpdateTemplateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateCreateInfo flags(@NativeType("VkDescriptorUpdateTemplateCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateCreateInfo pDescriptorUpdateEntries(@NativeType("VkDescriptorUpdateTemplateEntry const *") VkDescriptorUpdateTemplateEntry.Buffer value) {
        npDescriptorUpdateEntries(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateCreateInfo templateType(@NativeType("VkDescriptorUpdateTemplateType") int value) {
        ntemplateType(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateCreateInfo descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) {
        ndescriptorSetLayout(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateCreateInfo pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
        npipelineBindPoint(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateCreateInfo pipelineLayout(@NativeType("VkPipelineLayout") long value) {
        npipelineLayout(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateCreateInfo set(@NativeType("uint32_t") int value) {
        nset(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateCreateInfo set(int sType, long pNext, int flags, VkDescriptorUpdateTemplateEntry.Buffer pDescriptorUpdateEntries, int templateType, long descriptorSetLayout, int pipelineBindPoint, long pipelineLayout, int set) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pDescriptorUpdateEntries(pDescriptorUpdateEntries);
        templateType(templateType);
        descriptorSetLayout(descriptorSetLayout);
        pipelineBindPoint(pipelineBindPoint);
        pipelineLayout(pipelineLayout);
        set(set);
        return this;
    }

    public VkDescriptorUpdateTemplateCreateInfo set(VkDescriptorUpdateTemplateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorUpdateTemplateCreateInfo malloc() {
        return new VkDescriptorUpdateTemplateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorUpdateTemplateCreateInfo calloc() {
        return new VkDescriptorUpdateTemplateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorUpdateTemplateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorUpdateTemplateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorUpdateTemplateCreateInfo create(long address) {
        return new VkDescriptorUpdateTemplateCreateInfo(address, null);
    }

    public static VkDescriptorUpdateTemplateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorUpdateTemplateCreateInfo(address, null);
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

    public static VkDescriptorUpdateTemplateCreateInfo malloc(MemoryStack stack) {
        return new VkDescriptorUpdateTemplateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorUpdateTemplateCreateInfo calloc(MemoryStack stack) {
        return new VkDescriptorUpdateTemplateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndescriptorUpdateEntryCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORUPDATEENTRYCOUNT);
    }

    public static VkDescriptorUpdateTemplateEntry.Buffer npDescriptorUpdateEntries(long struct) {
        return VkDescriptorUpdateTemplateEntry.create(MemoryUtil.memGetAddress(struct + PDESCRIPTORUPDATEENTRIES), ndescriptorUpdateEntryCount(struct));
    }

    public static int ntemplateType(long struct) {
        return MemoryUtil.memGetInt(struct + TEMPLATETYPE);
    }

    public static long ndescriptorSetLayout(long struct) {
        return MemoryUtil.memGetLong(struct + DESCRIPTORSETLAYOUT);
    }

    public static int npipelineBindPoint(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEBINDPOINT);
    }

    public static long npipelineLayout(long struct) {
        return MemoryUtil.memGetLong(struct + PIPELINELAYOUT);
    }

    public static int nset(long struct) {
        return MemoryUtil.memGetInt(struct + SET);
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

    public static void ndescriptorUpdateEntryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORUPDATEENTRYCOUNT, value);
    }

    public static void npDescriptorUpdateEntries(long struct, VkDescriptorUpdateTemplateEntry.Buffer value) {
        MemoryUtil.memPutAddress(struct + PDESCRIPTORUPDATEENTRIES, value.address());
        ndescriptorUpdateEntryCount(struct, value.remaining());
    }

    public static void ntemplateType(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEMPLATETYPE, value);
    }

    public static void ndescriptorSetLayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + DESCRIPTORSETLAYOUT, value);
    }

    public static void npipelineBindPoint(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEBINDPOINT, value);
    }

    public static void npipelineLayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + PIPELINELAYOUT, value);
    }

    public static void nset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SET, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PDESCRIPTORUPDATEENTRIES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorUpdateTemplateCreateInfo, Buffer> implements NativeResource {
        private static final VkDescriptorUpdateTemplateCreateInfo ELEMENT_FACTORY = VkDescriptorUpdateTemplateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorUpdateTemplateCreateInfo.SIZEOF);
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
        public VkDescriptorUpdateTemplateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorUpdateTemplateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDescriptorUpdateTemplateCreateInfo.npNext(address());
        }

        @NativeType("VkDescriptorUpdateTemplateCreateFlags")
        public int flags() {
            return VkDescriptorUpdateTemplateCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int descriptorUpdateEntryCount() {
            return VkDescriptorUpdateTemplateCreateInfo.ndescriptorUpdateEntryCount(address());
        }

        @NativeType("VkDescriptorUpdateTemplateEntry const *")
        public VkDescriptorUpdateTemplateEntry.Buffer pDescriptorUpdateEntries() {
            return VkDescriptorUpdateTemplateCreateInfo.npDescriptorUpdateEntries(address());
        }

        @NativeType("VkDescriptorUpdateTemplateType")
        public int templateType() {
            return VkDescriptorUpdateTemplateCreateInfo.ntemplateType(address());
        }

        @NativeType("VkDescriptorSetLayout")
        public long descriptorSetLayout() {
            return VkDescriptorUpdateTemplateCreateInfo.ndescriptorSetLayout(address());
        }

        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() {
            return VkDescriptorUpdateTemplateCreateInfo.npipelineBindPoint(address());
        }

        @NativeType("VkPipelineLayout")
        public long pipelineLayout() {
            return VkDescriptorUpdateTemplateCreateInfo.npipelineLayout(address());
        }

        @NativeType("uint32_t")
        public int set() {
            return VkDescriptorUpdateTemplateCreateInfo.nset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorUpdateTemplateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000085000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorUpdateTemplateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkDescriptorUpdateTemplateCreateFlags") int value) {
            VkDescriptorUpdateTemplateCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer pDescriptorUpdateEntries(@NativeType("VkDescriptorUpdateTemplateEntry const *") VkDescriptorUpdateTemplateEntry.Buffer value) {
            VkDescriptorUpdateTemplateCreateInfo.npDescriptorUpdateEntries(address(), value);
            return this;
        }

        public Buffer templateType(@NativeType("VkDescriptorUpdateTemplateType") int value) {
            VkDescriptorUpdateTemplateCreateInfo.ntemplateType(address(), value);
            return this;
        }

        public Buffer descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) {
            VkDescriptorUpdateTemplateCreateInfo.ndescriptorSetLayout(address(), value);
            return this;
        }

        public Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
            VkDescriptorUpdateTemplateCreateInfo.npipelineBindPoint(address(), value);
            return this;
        }

        public Buffer pipelineLayout(@NativeType("VkPipelineLayout") long value) {
            VkDescriptorUpdateTemplateCreateInfo.npipelineLayout(address(), value);
            return this;
        }

        public Buffer set(@NativeType("uint32_t") int value) {
            VkDescriptorUpdateTemplateCreateInfo.nset(address(), value);
            return this;
        }
    }
}
