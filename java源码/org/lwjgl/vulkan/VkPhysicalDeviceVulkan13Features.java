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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan13Features.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan13Features.class */
public class VkPhysicalDeviceVulkan13Features extends Struct<VkPhysicalDeviceVulkan13Features> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ROBUSTIMAGEACCESS;
    public static final int INLINEUNIFORMBLOCK;
    public static final int DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND;
    public static final int PIPELINECREATIONCACHECONTROL;
    public static final int PRIVATEDATA;
    public static final int SHADERDEMOTETOHELPERINVOCATION;
    public static final int SHADERTERMINATEINVOCATION;
    public static final int SUBGROUPSIZECONTROL;
    public static final int COMPUTEFULLSUBGROUPS;
    public static final int SYNCHRONIZATION2;
    public static final int TEXTURECOMPRESSIONASTC_HDR;
    public static final int SHADERZEROINITIALIZEWORKGROUPMEMORY;
    public static final int DYNAMICRENDERING;
    public static final int SHADERINTEGERDOTPRODUCT;
    public static final int MAINTENANCE4;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ROBUSTIMAGEACCESS = layout.offsetof(2);
        INLINEUNIFORMBLOCK = layout.offsetof(3);
        DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND = layout.offsetof(4);
        PIPELINECREATIONCACHECONTROL = layout.offsetof(5);
        PRIVATEDATA = layout.offsetof(6);
        SHADERDEMOTETOHELPERINVOCATION = layout.offsetof(7);
        SHADERTERMINATEINVOCATION = layout.offsetof(8);
        SUBGROUPSIZECONTROL = layout.offsetof(9);
        COMPUTEFULLSUBGROUPS = layout.offsetof(10);
        SYNCHRONIZATION2 = layout.offsetof(11);
        TEXTURECOMPRESSIONASTC_HDR = layout.offsetof(12);
        SHADERZEROINITIALIZEWORKGROUPMEMORY = layout.offsetof(13);
        DYNAMICRENDERING = layout.offsetof(14);
        SHADERINTEGERDOTPRODUCT = layout.offsetof(15);
        MAINTENANCE4 = layout.offsetof(16);
    }

    protected VkPhysicalDeviceVulkan13Features(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVulkan13Features create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVulkan13Features(address, container);
    }

    public VkPhysicalDeviceVulkan13Features(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean robustImageAccess() {
        return nrobustImageAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean inlineUniformBlock() {
        return ninlineUniformBlock(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingInlineUniformBlockUpdateAfterBind() {
        return ndescriptorBindingInlineUniformBlockUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean pipelineCreationCacheControl() {
        return npipelineCreationCacheControl(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean privateData() {
        return nprivateData(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDemoteToHelperInvocation() {
        return nshaderDemoteToHelperInvocation(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderTerminateInvocation() {
        return nshaderTerminateInvocation(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean subgroupSizeControl() {
        return nsubgroupSizeControl(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean computeFullSubgroups() {
        return ncomputeFullSubgroups(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean synchronization2() {
        return nsynchronization2(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean textureCompressionASTC_HDR() {
        return ntextureCompressionASTC_HDR(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderZeroInitializeWorkgroupMemory() {
        return nshaderZeroInitializeWorkgroupMemory(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean dynamicRendering() {
        return ndynamicRendering(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderIntegerDotProduct() {
        return nshaderIntegerDotProduct(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean maintenance4() {
        return nmaintenance4(address()) != 0;
    }

    public VkPhysicalDeviceVulkan13Features sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features sType$Default() {
        return sType(53);
    }

    public VkPhysicalDeviceVulkan13Features pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features robustImageAccess(@NativeType("VkBool32") boolean value) {
        nrobustImageAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features inlineUniformBlock(@NativeType("VkBool32") boolean value) {
        ninlineUniformBlock(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) {
        npipelineCreationCacheControl(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features privateData(@NativeType("VkBool32") boolean value) {
        nprivateData(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) {
        nshaderDemoteToHelperInvocation(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features shaderTerminateInvocation(@NativeType("VkBool32") boolean value) {
        nshaderTerminateInvocation(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features subgroupSizeControl(@NativeType("VkBool32") boolean value) {
        nsubgroupSizeControl(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features computeFullSubgroups(@NativeType("VkBool32") boolean value) {
        ncomputeFullSubgroups(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features synchronization2(@NativeType("VkBool32") boolean value) {
        nsynchronization2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) {
        ntextureCompressionASTC_HDR(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) {
        nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features dynamicRendering(@NativeType("VkBool32") boolean value) {
        ndynamicRendering(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features shaderIntegerDotProduct(@NativeType("VkBool32") boolean value) {
        nshaderIntegerDotProduct(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features maintenance4(@NativeType("VkBool32") boolean value) {
        nmaintenance4(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features set(int sType, long pNext, boolean robustImageAccess, boolean inlineUniformBlock, boolean descriptorBindingInlineUniformBlockUpdateAfterBind, boolean pipelineCreationCacheControl, boolean privateData, boolean shaderDemoteToHelperInvocation, boolean shaderTerminateInvocation, boolean subgroupSizeControl, boolean computeFullSubgroups, boolean synchronization2, boolean textureCompressionASTC_HDR, boolean shaderZeroInitializeWorkgroupMemory, boolean dynamicRendering, boolean shaderIntegerDotProduct, boolean maintenance4) {
        sType(sType);
        pNext(pNext);
        robustImageAccess(robustImageAccess);
        inlineUniformBlock(inlineUniformBlock);
        descriptorBindingInlineUniformBlockUpdateAfterBind(descriptorBindingInlineUniformBlockUpdateAfterBind);
        pipelineCreationCacheControl(pipelineCreationCacheControl);
        privateData(privateData);
        shaderDemoteToHelperInvocation(shaderDemoteToHelperInvocation);
        shaderTerminateInvocation(shaderTerminateInvocation);
        subgroupSizeControl(subgroupSizeControl);
        computeFullSubgroups(computeFullSubgroups);
        synchronization2(synchronization2);
        textureCompressionASTC_HDR(textureCompressionASTC_HDR);
        shaderZeroInitializeWorkgroupMemory(shaderZeroInitializeWorkgroupMemory);
        dynamicRendering(dynamicRendering);
        shaderIntegerDotProduct(shaderIntegerDotProduct);
        maintenance4(maintenance4);
        return this;
    }

    public VkPhysicalDeviceVulkan13Features set(VkPhysicalDeviceVulkan13Features src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVulkan13Features malloc() {
        return new VkPhysicalDeviceVulkan13Features(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan13Features calloc() {
        return new VkPhysicalDeviceVulkan13Features(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan13Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan13Features(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVulkan13Features create(long address) {
        return new VkPhysicalDeviceVulkan13Features(address, null);
    }

    public static VkPhysicalDeviceVulkan13Features createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVulkan13Features(address, null);
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

    public static VkPhysicalDeviceVulkan13Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan13Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan13Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan13Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrobustImageAccess(long struct) {
        return MemoryUtil.memGetInt(struct + ROBUSTIMAGEACCESS);
    }

    public static int ninlineUniformBlock(long struct) {
        return MemoryUtil.memGetInt(struct + INLINEUNIFORMBLOCK);
    }

    public static int ndescriptorBindingInlineUniformBlockUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND);
    }

    public static int npipelineCreationCacheControl(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINECREATIONCACHECONTROL);
    }

    public static int nprivateData(long struct) {
        return MemoryUtil.memGetInt(struct + PRIVATEDATA);
    }

    public static int nshaderDemoteToHelperInvocation(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDEMOTETOHELPERINVOCATION);
    }

    public static int nshaderTerminateInvocation(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERTERMINATEINVOCATION);
    }

    public static int nsubgroupSizeControl(long struct) {
        return MemoryUtil.memGetInt(struct + SUBGROUPSIZECONTROL);
    }

    public static int ncomputeFullSubgroups(long struct) {
        return MemoryUtil.memGetInt(struct + COMPUTEFULLSUBGROUPS);
    }

    public static int nsynchronization2(long struct) {
        return MemoryUtil.memGetInt(struct + SYNCHRONIZATION2);
    }

    public static int ntextureCompressionASTC_HDR(long struct) {
        return MemoryUtil.memGetInt(struct + TEXTURECOMPRESSIONASTC_HDR);
    }

    public static int nshaderZeroInitializeWorkgroupMemory(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERZEROINITIALIZEWORKGROUPMEMORY);
    }

    public static int ndynamicRendering(long struct) {
        return MemoryUtil.memGetInt(struct + DYNAMICRENDERING);
    }

    public static int nshaderIntegerDotProduct(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINTEGERDOTPRODUCT);
    }

    public static int nmaintenance4(long struct) {
        return MemoryUtil.memGetInt(struct + MAINTENANCE4);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrobustImageAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + ROBUSTIMAGEACCESS, value);
    }

    public static void ninlineUniformBlock(long struct, int value) {
        MemoryUtil.memPutInt(struct + INLINEUNIFORMBLOCK, value);
    }

    public static void ndescriptorBindingInlineUniformBlockUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND, value);
    }

    public static void npipelineCreationCacheControl(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINECREATIONCACHECONTROL, value);
    }

    public static void nprivateData(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIVATEDATA, value);
    }

    public static void nshaderDemoteToHelperInvocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERDEMOTETOHELPERINVOCATION, value);
    }

    public static void nshaderTerminateInvocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERTERMINATEINVOCATION, value);
    }

    public static void nsubgroupSizeControl(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBGROUPSIZECONTROL, value);
    }

    public static void ncomputeFullSubgroups(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPUTEFULLSUBGROUPS, value);
    }

    public static void nsynchronization2(long struct, int value) {
        MemoryUtil.memPutInt(struct + SYNCHRONIZATION2, value);
    }

    public static void ntextureCompressionASTC_HDR(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEXTURECOMPRESSIONASTC_HDR, value);
    }

    public static void nshaderZeroInitializeWorkgroupMemory(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERZEROINITIALIZEWORKGROUPMEMORY, value);
    }

    public static void ndynamicRendering(long struct, int value) {
        MemoryUtil.memPutInt(struct + DYNAMICRENDERING, value);
    }

    public static void nshaderIntegerDotProduct(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERINTEGERDOTPRODUCT, value);
    }

    public static void nmaintenance4(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAINTENANCE4, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan13Features$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan13Features$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan13Features, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVulkan13Features ELEMENT_FACTORY = VkPhysicalDeviceVulkan13Features.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVulkan13Features.SIZEOF);
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
        public VkPhysicalDeviceVulkan13Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVulkan13Features.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVulkan13Features.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean robustImageAccess() {
            return VkPhysicalDeviceVulkan13Features.nrobustImageAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean inlineUniformBlock() {
            return VkPhysicalDeviceVulkan13Features.ninlineUniformBlock(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingInlineUniformBlockUpdateAfterBind() {
            return VkPhysicalDeviceVulkan13Features.ndescriptorBindingInlineUniformBlockUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean pipelineCreationCacheControl() {
            return VkPhysicalDeviceVulkan13Features.npipelineCreationCacheControl(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean privateData() {
            return VkPhysicalDeviceVulkan13Features.nprivateData(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDemoteToHelperInvocation() {
            return VkPhysicalDeviceVulkan13Features.nshaderDemoteToHelperInvocation(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderTerminateInvocation() {
            return VkPhysicalDeviceVulkan13Features.nshaderTerminateInvocation(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean subgroupSizeControl() {
            return VkPhysicalDeviceVulkan13Features.nsubgroupSizeControl(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean computeFullSubgroups() {
            return VkPhysicalDeviceVulkan13Features.ncomputeFullSubgroups(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean synchronization2() {
            return VkPhysicalDeviceVulkan13Features.nsynchronization2(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean textureCompressionASTC_HDR() {
            return VkPhysicalDeviceVulkan13Features.ntextureCompressionASTC_HDR(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderZeroInitializeWorkgroupMemory() {
            return VkPhysicalDeviceVulkan13Features.nshaderZeroInitializeWorkgroupMemory(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean dynamicRendering() {
            return VkPhysicalDeviceVulkan13Features.ndynamicRendering(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderIntegerDotProduct() {
            return VkPhysicalDeviceVulkan13Features.nshaderIntegerDotProduct(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean maintenance4() {
            return VkPhysicalDeviceVulkan13Features.nmaintenance4(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVulkan13Features.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(53);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVulkan13Features.npNext(address(), value);
            return this;
        }

        public Buffer robustImageAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.nrobustImageAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer inlineUniformBlock(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.ninlineUniformBlock(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.npipelineCreationCacheControl(address(), value ? 1 : 0);
            return this;
        }

        public Buffer privateData(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.nprivateData(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.nshaderDemoteToHelperInvocation(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderTerminateInvocation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.nshaderTerminateInvocation(address(), value ? 1 : 0);
            return this;
        }

        public Buffer subgroupSizeControl(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.nsubgroupSizeControl(address(), value ? 1 : 0);
            return this;
        }

        public Buffer computeFullSubgroups(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.ncomputeFullSubgroups(address(), value ? 1 : 0);
            return this;
        }

        public Buffer synchronization2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.nsynchronization2(address(), value ? 1 : 0);
            return this;
        }

        public Buffer textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.ntextureCompressionASTC_HDR(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dynamicRendering(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.ndynamicRendering(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderIntegerDotProduct(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.nshaderIntegerDotProduct(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maintenance4(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan13Features.nmaintenance4(address(), value ? 1 : 0);
            return this;
        }
    }
}
