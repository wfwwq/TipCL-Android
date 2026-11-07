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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingProperties.class */
public class VkPhysicalDeviceDescriptorIndexingProperties extends Struct<VkPhysicalDeviceDescriptorIndexingProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS;
    public static final int SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE;
    public static final int SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE;
    public static final int SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE;
    public static final int SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE;
    public static final int SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE;
    public static final int ROBUSTBUFFERACCESSUPDATEAFTERBIND;
    public static final int QUADDIVERGENTIMPLICITLOD;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS;
    public static final int MAXPERSTAGEUPDATEAFTERBINDRESOURCES;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS = layout.offsetof(2);
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(3);
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(4);
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(5);
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(6);
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(7);
        ROBUSTBUFFERACCESSUPDATEAFTERBIND = layout.offsetof(8);
        QUADDIVERGENTIMPLICITLOD = layout.offsetof(9);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS = layout.offsetof(10);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS = layout.offsetof(11);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS = layout.offsetof(12);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES = layout.offsetof(13);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES = layout.offsetof(14);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS = layout.offsetof(15);
        MAXPERSTAGEUPDATEAFTERBINDRESOURCES = layout.offsetof(16);
        MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS = layout.offsetof(17);
        MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS = layout.offsetof(18);
        MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC = layout.offsetof(19);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS = layout.offsetof(20);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC = layout.offsetof(21);
        MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES = layout.offsetof(22);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES = layout.offsetof(23);
        MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS = layout.offsetof(24);
    }

    protected VkPhysicalDeviceDescriptorIndexingProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDescriptorIndexingProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorIndexingProperties(address, container);
    }

    public VkPhysicalDeviceDescriptorIndexingProperties(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int maxUpdateAfterBindDescriptorsInAllPools() {
        return nmaxUpdateAfterBindDescriptorsInAllPools(address());
    }

    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayNonUniformIndexingNative() {
        return nshaderUniformBufferArrayNonUniformIndexingNative(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayNonUniformIndexingNative() {
        return nshaderSampledImageArrayNonUniformIndexingNative(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayNonUniformIndexingNative() {
        return nshaderStorageBufferArrayNonUniformIndexingNative(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayNonUniformIndexingNative() {
        return nshaderStorageImageArrayNonUniformIndexingNative(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayNonUniformIndexingNative() {
        return nshaderInputAttachmentArrayNonUniformIndexingNative(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean robustBufferAccessUpdateAfterBind() {
        return nrobustBufferAccessUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean quadDivergentImplicitLod() {
        return nquadDivergentImplicitLod(address()) != 0;
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindSamplers() {
        return nmaxPerStageDescriptorUpdateAfterBindSamplers(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {
        return nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {
        return nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindSampledImages() {
        return nmaxPerStageDescriptorUpdateAfterBindSampledImages(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageImages() {
        return nmaxPerStageDescriptorUpdateAfterBindStorageImages(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() {
        return nmaxPerStageDescriptorUpdateAfterBindInputAttachments(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageUpdateAfterBindResources() {
        return nmaxPerStageUpdateAfterBindResources(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindSamplers() {
        return nmaxDescriptorSetUpdateAfterBindSamplers(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindUniformBuffers() {
        return nmaxDescriptorSetUpdateAfterBindUniformBuffers(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
        return nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageBuffers() {
        return nmaxDescriptorSetUpdateAfterBindStorageBuffers(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
        return nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindSampledImages() {
        return nmaxDescriptorSetUpdateAfterBindSampledImages(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageImages() {
        return nmaxDescriptorSetUpdateAfterBindStorageImages(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindInputAttachments() {
        return nmaxDescriptorSetUpdateAfterBindInputAttachments(address());
    }

    public VkPhysicalDeviceDescriptorIndexingProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingProperties sType$Default() {
        return sType(1000161002);
    }

    public VkPhysicalDeviceDescriptorIndexingProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingProperties set(VkPhysicalDeviceDescriptorIndexingProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDescriptorIndexingProperties malloc() {
        return new VkPhysicalDeviceDescriptorIndexingProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorIndexingProperties calloc() {
        return new VkPhysicalDeviceDescriptorIndexingProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorIndexingProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorIndexingProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDescriptorIndexingProperties create(long address) {
        return new VkPhysicalDeviceDescriptorIndexingProperties(address, null);
    }

    public static VkPhysicalDeviceDescriptorIndexingProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDescriptorIndexingProperties(address, null);
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

    public static VkPhysicalDeviceDescriptorIndexingProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorIndexingProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorIndexingProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorIndexingProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxUpdateAfterBindDescriptorsInAllPools(long struct) {
        return MemoryUtil.memGetInt(struct + MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS);
    }

    public static int nshaderUniformBufferArrayNonUniformIndexingNative(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE);
    }

    public static int nshaderSampledImageArrayNonUniformIndexingNative(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE);
    }

    public static int nshaderStorageBufferArrayNonUniformIndexingNative(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE);
    }

    public static int nshaderStorageImageArrayNonUniformIndexingNative(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE);
    }

    public static int nshaderInputAttachmentArrayNonUniformIndexingNative(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE);
    }

    public static int nrobustBufferAccessUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + ROBUSTBUFFERACCESSUPDATEAFTERBIND);
    }

    public static int nquadDivergentImplicitLod(long struct) {
        return MemoryUtil.memGetInt(struct + QUADDIVERGENTIMPLICITLOD);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindSamplers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindSampledImages(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindStorageImages(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindInputAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS);
    }

    public static int nmaxPerStageUpdateAfterBindResources(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEUPDATEAFTERBINDRESOURCES);
    }

    public static int nmaxDescriptorSetUpdateAfterBindSamplers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS);
    }

    public static int nmaxDescriptorSetUpdateAfterBindUniformBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS);
    }

    public static int nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC);
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS);
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC);
    }

    public static int nmaxDescriptorSetUpdateAfterBindSampledImages(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES);
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageImages(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES);
    }

    public static int nmaxDescriptorSetUpdateAfterBindInputAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorIndexingProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDescriptorIndexingProperties ELEMENT_FACTORY = VkPhysicalDeviceDescriptorIndexingProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF);
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
        public VkPhysicalDeviceDescriptorIndexingProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDescriptorIndexingProperties.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxUpdateAfterBindDescriptorsInAllPools() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxUpdateAfterBindDescriptorsInAllPools(address());
        }

        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexingNative() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nshaderUniformBufferArrayNonUniformIndexingNative(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexingNative() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nshaderSampledImageArrayNonUniformIndexingNative(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexingNative() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nshaderStorageBufferArrayNonUniformIndexingNative(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexingNative() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nshaderStorageImageArrayNonUniformIndexingNative(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexingNative() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nshaderInputAttachmentArrayNonUniformIndexingNative(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean robustBufferAccessUpdateAfterBind() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nrobustBufferAccessUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean quadDivergentImplicitLod() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nquadDivergentImplicitLod(address()) != 0;
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindSamplers() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindSamplers(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindSampledImages() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindSampledImages(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageImages() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindStorageImages(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindInputAttachments() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindInputAttachments(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageUpdateAfterBindResources() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageUpdateAfterBindResources(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindSamplers() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindSamplers(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindUniformBuffers() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindUniformBuffers(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageBuffers() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindStorageBuffers(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindSampledImages() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindSampledImages(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageImages() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindStorageImages(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindInputAttachments() {
            return VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindInputAttachments(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDescriptorIndexingProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000161002);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDescriptorIndexingProperties.npNext(address(), value);
            return this;
        }
    }
}
