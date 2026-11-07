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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeatures.class */
public class VkPhysicalDeviceDescriptorIndexingFeatures extends Struct<VkPhysicalDeviceDescriptorIndexingFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING;
    public static final int SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING;
    public static final int SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING;
    public static final int SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING;
    public static final int SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING;
    public static final int SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING;
    public static final int SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING;
    public static final int SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING;
    public static final int SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING;
    public static final int SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING;
    public static final int DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND;
    public static final int DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND;
    public static final int DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND;
    public static final int DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND;
    public static final int DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND;
    public static final int DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND;
    public static final int DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING;
    public static final int DESCRIPTORBINDINGPARTIALLYBOUND;
    public static final int DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT;
    public static final int RUNTIMEDESCRIPTORARRAY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING = layout.offsetof(2);
        SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING = layout.offsetof(3);
        SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING = layout.offsetof(4);
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(5);
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING = layout.offsetof(6);
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(7);
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING = layout.offsetof(8);
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING = layout.offsetof(9);
        SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(10);
        SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(11);
        DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND = layout.offsetof(12);
        DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND = layout.offsetof(13);
        DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND = layout.offsetof(14);
        DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND = layout.offsetof(15);
        DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND = layout.offsetof(16);
        DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND = layout.offsetof(17);
        DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING = layout.offsetof(18);
        DESCRIPTORBINDINGPARTIALLYBOUND = layout.offsetof(19);
        DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT = layout.offsetof(20);
        RUNTIMEDESCRIPTORARRAY = layout.offsetof(21);
    }

    protected VkPhysicalDeviceDescriptorIndexingFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDescriptorIndexingFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorIndexingFeatures(address, container);
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures(ByteBuffer container) {
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
    public boolean shaderInputAttachmentArrayDynamicIndexing() {
        return nshaderInputAttachmentArrayDynamicIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderUniformTexelBufferArrayDynamicIndexing() {
        return nshaderUniformTexelBufferArrayDynamicIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageTexelBufferArrayDynamicIndexing() {
        return nshaderStorageTexelBufferArrayDynamicIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayNonUniformIndexing() {
        return nshaderUniformBufferArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayNonUniformIndexing() {
        return nshaderSampledImageArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayNonUniformIndexing() {
        return nshaderStorageBufferArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayNonUniformIndexing() {
        return nshaderStorageImageArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayNonUniformIndexing() {
        return nshaderInputAttachmentArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderUniformTexelBufferArrayNonUniformIndexing() {
        return nshaderUniformTexelBufferArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageTexelBufferArrayNonUniformIndexing() {
        return nshaderStorageTexelBufferArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingUniformBufferUpdateAfterBind() {
        return ndescriptorBindingUniformBufferUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingSampledImageUpdateAfterBind() {
        return ndescriptorBindingSampledImageUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingStorageImageUpdateAfterBind() {
        return ndescriptorBindingStorageImageUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingStorageBufferUpdateAfterBind() {
        return ndescriptorBindingStorageBufferUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() {
        return ndescriptorBindingUniformTexelBufferUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() {
        return ndescriptorBindingStorageTexelBufferUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingUpdateUnusedWhilePending() {
        return ndescriptorBindingUpdateUnusedWhilePending(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingPartiallyBound() {
        return ndescriptorBindingPartiallyBound(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingVariableDescriptorCount() {
        return ndescriptorBindingVariableDescriptorCount(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean runtimeDescriptorArray() {
        return nruntimeDescriptorArray(address()) != 0;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures sType$Default() {
        return sType(1000161001);
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingPartiallyBound(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures runtimeDescriptorArray(@NativeType("VkBool32") boolean value) {
        nruntimeDescriptorArray(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures set(int sType, long pNext, boolean shaderInputAttachmentArrayDynamicIndexing, boolean shaderUniformTexelBufferArrayDynamicIndexing, boolean shaderStorageTexelBufferArrayDynamicIndexing, boolean shaderUniformBufferArrayNonUniformIndexing, boolean shaderSampledImageArrayNonUniformIndexing, boolean shaderStorageBufferArrayNonUniformIndexing, boolean shaderStorageImageArrayNonUniformIndexing, boolean shaderInputAttachmentArrayNonUniformIndexing, boolean shaderUniformTexelBufferArrayNonUniformIndexing, boolean shaderStorageTexelBufferArrayNonUniformIndexing, boolean descriptorBindingUniformBufferUpdateAfterBind, boolean descriptorBindingSampledImageUpdateAfterBind, boolean descriptorBindingStorageImageUpdateAfterBind, boolean descriptorBindingStorageBufferUpdateAfterBind, boolean descriptorBindingUniformTexelBufferUpdateAfterBind, boolean descriptorBindingStorageTexelBufferUpdateAfterBind, boolean descriptorBindingUpdateUnusedWhilePending, boolean descriptorBindingPartiallyBound, boolean descriptorBindingVariableDescriptorCount, boolean runtimeDescriptorArray) {
        sType(sType);
        pNext(pNext);
        shaderInputAttachmentArrayDynamicIndexing(shaderInputAttachmentArrayDynamicIndexing);
        shaderUniformTexelBufferArrayDynamicIndexing(shaderUniformTexelBufferArrayDynamicIndexing);
        shaderStorageTexelBufferArrayDynamicIndexing(shaderStorageTexelBufferArrayDynamicIndexing);
        shaderUniformBufferArrayNonUniformIndexing(shaderUniformBufferArrayNonUniformIndexing);
        shaderSampledImageArrayNonUniformIndexing(shaderSampledImageArrayNonUniformIndexing);
        shaderStorageBufferArrayNonUniformIndexing(shaderStorageBufferArrayNonUniformIndexing);
        shaderStorageImageArrayNonUniformIndexing(shaderStorageImageArrayNonUniformIndexing);
        shaderInputAttachmentArrayNonUniformIndexing(shaderInputAttachmentArrayNonUniformIndexing);
        shaderUniformTexelBufferArrayNonUniformIndexing(shaderUniformTexelBufferArrayNonUniformIndexing);
        shaderStorageTexelBufferArrayNonUniformIndexing(shaderStorageTexelBufferArrayNonUniformIndexing);
        descriptorBindingUniformBufferUpdateAfterBind(descriptorBindingUniformBufferUpdateAfterBind);
        descriptorBindingSampledImageUpdateAfterBind(descriptorBindingSampledImageUpdateAfterBind);
        descriptorBindingStorageImageUpdateAfterBind(descriptorBindingStorageImageUpdateAfterBind);
        descriptorBindingStorageBufferUpdateAfterBind(descriptorBindingStorageBufferUpdateAfterBind);
        descriptorBindingUniformTexelBufferUpdateAfterBind(descriptorBindingUniformTexelBufferUpdateAfterBind);
        descriptorBindingStorageTexelBufferUpdateAfterBind(descriptorBindingStorageTexelBufferUpdateAfterBind);
        descriptorBindingUpdateUnusedWhilePending(descriptorBindingUpdateUnusedWhilePending);
        descriptorBindingPartiallyBound(descriptorBindingPartiallyBound);
        descriptorBindingVariableDescriptorCount(descriptorBindingVariableDescriptorCount);
        runtimeDescriptorArray(runtimeDescriptorArray);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures set(VkPhysicalDeviceDescriptorIndexingFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDescriptorIndexingFeatures malloc() {
        return new VkPhysicalDeviceDescriptorIndexingFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorIndexingFeatures calloc() {
        return new VkPhysicalDeviceDescriptorIndexingFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorIndexingFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorIndexingFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDescriptorIndexingFeatures create(long address) {
        return new VkPhysicalDeviceDescriptorIndexingFeatures(address, null);
    }

    public static VkPhysicalDeviceDescriptorIndexingFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDescriptorIndexingFeatures(address, null);
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

    public static VkPhysicalDeviceDescriptorIndexingFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorIndexingFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorIndexingFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorIndexingFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderInputAttachmentArrayDynamicIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING);
    }

    public static int nshaderUniformTexelBufferArrayDynamicIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING);
    }

    public static int nshaderStorageTexelBufferArrayDynamicIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING);
    }

    public static int nshaderUniformBufferArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING);
    }

    public static int nshaderSampledImageArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING);
    }

    public static int nshaderStorageBufferArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING);
    }

    public static int nshaderStorageImageArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING);
    }

    public static int nshaderInputAttachmentArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING);
    }

    public static int nshaderUniformTexelBufferArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING);
    }

    public static int nshaderStorageTexelBufferArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING);
    }

    public static int ndescriptorBindingUniformBufferUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND);
    }

    public static int ndescriptorBindingSampledImageUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND);
    }

    public static int ndescriptorBindingStorageImageUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND);
    }

    public static int ndescriptorBindingStorageBufferUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND);
    }

    public static int ndescriptorBindingUniformTexelBufferUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND);
    }

    public static int ndescriptorBindingStorageTexelBufferUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND);
    }

    public static int ndescriptorBindingUpdateUnusedWhilePending(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING);
    }

    public static int ndescriptorBindingPartiallyBound(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGPARTIALLYBOUND);
    }

    public static int ndescriptorBindingVariableDescriptorCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT);
    }

    public static int nruntimeDescriptorArray(long struct) {
        return MemoryUtil.memGetInt(struct + RUNTIMEDESCRIPTORARRAY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderInputAttachmentArrayDynamicIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING, value);
    }

    public static void nshaderUniformTexelBufferArrayDynamicIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING, value);
    }

    public static void nshaderStorageTexelBufferArrayDynamicIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING, value);
    }

    public static void nshaderUniformBufferArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING, value);
    }

    public static void nshaderSampledImageArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING, value);
    }

    public static void nshaderStorageBufferArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING, value);
    }

    public static void nshaderStorageImageArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING, value);
    }

    public static void nshaderInputAttachmentArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING, value);
    }

    public static void nshaderUniformTexelBufferArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING, value);
    }

    public static void nshaderStorageTexelBufferArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING, value);
    }

    public static void ndescriptorBindingUniformBufferUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND, value);
    }

    public static void ndescriptorBindingSampledImageUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND, value);
    }

    public static void ndescriptorBindingStorageImageUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND, value);
    }

    public static void ndescriptorBindingStorageBufferUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND, value);
    }

    public static void ndescriptorBindingUniformTexelBufferUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND, value);
    }

    public static void ndescriptorBindingStorageTexelBufferUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND, value);
    }

    public static void ndescriptorBindingUpdateUnusedWhilePending(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING, value);
    }

    public static void ndescriptorBindingPartiallyBound(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGPARTIALLYBOUND, value);
    }

    public static void ndescriptorBindingVariableDescriptorCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT, value);
    }

    public static void nruntimeDescriptorArray(long struct, int value) {
        MemoryUtil.memPutInt(struct + RUNTIMEDESCRIPTORARRAY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorIndexingFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDescriptorIndexingFeatures ELEMENT_FACTORY = VkPhysicalDeviceDescriptorIndexingFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF);
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
        public VkPhysicalDeviceDescriptorIndexingFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayDynamicIndexing() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderInputAttachmentArrayDynamicIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayDynamicIndexing() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformTexelBufferArrayDynamicIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayDynamicIndexing() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageTexelBufferArrayDynamicIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexing() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformBufferArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexing() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderSampledImageArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexing() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageBufferArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexing() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageImageArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexing() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderInputAttachmentArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayNonUniformIndexing() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformTexelBufferArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayNonUniformIndexing() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageTexelBufferArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingUniformBufferUpdateAfterBind() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUniformBufferUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingSampledImageUpdateAfterBind() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingSampledImageUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingStorageImageUpdateAfterBind() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageImageUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingStorageBufferUpdateAfterBind() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageBufferUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingUpdateUnusedWhilePending() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUpdateUnusedWhilePending(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingPartiallyBound() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingPartiallyBound(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingVariableDescriptorCount() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingVariableDescriptorCount(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean runtimeDescriptorArray() {
            return VkPhysicalDeviceDescriptorIndexingFeatures.nruntimeDescriptorArray(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000161001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.npNext(address(), value);
            return this;
        }

        public Buffer shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingPartiallyBound(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0);
            return this;
        }

        public Buffer runtimeDescriptorArray(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeatures.nruntimeDescriptorArray(address(), value ? 1 : 0);
            return this;
        }
    }
}
