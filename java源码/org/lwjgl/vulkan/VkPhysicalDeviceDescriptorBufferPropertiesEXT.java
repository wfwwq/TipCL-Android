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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferPropertiesEXT.class */
public class VkPhysicalDeviceDescriptorBufferPropertiesEXT extends Struct<VkPhysicalDeviceDescriptorBufferPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COMBINEDIMAGESAMPLERDESCRIPTORSINGLEARRAY;
    public static final int BUFFERLESSPUSHDESCRIPTORS;
    public static final int ALLOWSAMPLERIMAGEVIEWPOSTSUBMITCREATION;
    public static final int DESCRIPTORBUFFEROFFSETALIGNMENT;
    public static final int MAXDESCRIPTORBUFFERBINDINGS;
    public static final int MAXRESOURCEDESCRIPTORBUFFERBINDINGS;
    public static final int MAXSAMPLERDESCRIPTORBUFFERBINDINGS;
    public static final int MAXEMBEDDEDIMMUTABLESAMPLERBINDINGS;
    public static final int MAXEMBEDDEDIMMUTABLESAMPLERS;
    public static final int BUFFERCAPTUREREPLAYDESCRIPTORDATASIZE;
    public static final int IMAGECAPTUREREPLAYDESCRIPTORDATASIZE;
    public static final int IMAGEVIEWCAPTUREREPLAYDESCRIPTORDATASIZE;
    public static final int SAMPLERCAPTUREREPLAYDESCRIPTORDATASIZE;
    public static final int ACCELERATIONSTRUCTURECAPTUREREPLAYDESCRIPTORDATASIZE;
    public static final int SAMPLERDESCRIPTORSIZE;
    public static final int COMBINEDIMAGESAMPLERDESCRIPTORSIZE;
    public static final int SAMPLEDIMAGEDESCRIPTORSIZE;
    public static final int STORAGEIMAGEDESCRIPTORSIZE;
    public static final int UNIFORMTEXELBUFFERDESCRIPTORSIZE;
    public static final int ROBUSTUNIFORMTEXELBUFFERDESCRIPTORSIZE;
    public static final int STORAGETEXELBUFFERDESCRIPTORSIZE;
    public static final int ROBUSTSTORAGETEXELBUFFERDESCRIPTORSIZE;
    public static final int UNIFORMBUFFERDESCRIPTORSIZE;
    public static final int ROBUSTUNIFORMBUFFERDESCRIPTORSIZE;
    public static final int STORAGEBUFFERDESCRIPTORSIZE;
    public static final int ROBUSTSTORAGEBUFFERDESCRIPTORSIZE;
    public static final int INPUTATTACHMENTDESCRIPTORSIZE;
    public static final int ACCELERATIONSTRUCTUREDESCRIPTORSIZE;
    public static final int MAXSAMPLERDESCRIPTORBUFFERRANGE;
    public static final int MAXRESOURCEDESCRIPTORBUFFERRANGE;
    public static final int SAMPLERDESCRIPTORBUFFERADDRESSSPACESIZE;
    public static final int RESOURCEDESCRIPTORBUFFERADDRESSSPACESIZE;
    public static final int DESCRIPTORBUFFERADDRESSSPACESIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMBINEDIMAGESAMPLERDESCRIPTORSINGLEARRAY = layout.offsetof(2);
        BUFFERLESSPUSHDESCRIPTORS = layout.offsetof(3);
        ALLOWSAMPLERIMAGEVIEWPOSTSUBMITCREATION = layout.offsetof(4);
        DESCRIPTORBUFFEROFFSETALIGNMENT = layout.offsetof(5);
        MAXDESCRIPTORBUFFERBINDINGS = layout.offsetof(6);
        MAXRESOURCEDESCRIPTORBUFFERBINDINGS = layout.offsetof(7);
        MAXSAMPLERDESCRIPTORBUFFERBINDINGS = layout.offsetof(8);
        MAXEMBEDDEDIMMUTABLESAMPLERBINDINGS = layout.offsetof(9);
        MAXEMBEDDEDIMMUTABLESAMPLERS = layout.offsetof(10);
        BUFFERCAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(11);
        IMAGECAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(12);
        IMAGEVIEWCAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(13);
        SAMPLERCAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(14);
        ACCELERATIONSTRUCTURECAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(15);
        SAMPLERDESCRIPTORSIZE = layout.offsetof(16);
        COMBINEDIMAGESAMPLERDESCRIPTORSIZE = layout.offsetof(17);
        SAMPLEDIMAGEDESCRIPTORSIZE = layout.offsetof(18);
        STORAGEIMAGEDESCRIPTORSIZE = layout.offsetof(19);
        UNIFORMTEXELBUFFERDESCRIPTORSIZE = layout.offsetof(20);
        ROBUSTUNIFORMTEXELBUFFERDESCRIPTORSIZE = layout.offsetof(21);
        STORAGETEXELBUFFERDESCRIPTORSIZE = layout.offsetof(22);
        ROBUSTSTORAGETEXELBUFFERDESCRIPTORSIZE = layout.offsetof(23);
        UNIFORMBUFFERDESCRIPTORSIZE = layout.offsetof(24);
        ROBUSTUNIFORMBUFFERDESCRIPTORSIZE = layout.offsetof(25);
        STORAGEBUFFERDESCRIPTORSIZE = layout.offsetof(26);
        ROBUSTSTORAGEBUFFERDESCRIPTORSIZE = layout.offsetof(27);
        INPUTATTACHMENTDESCRIPTORSIZE = layout.offsetof(28);
        ACCELERATIONSTRUCTUREDESCRIPTORSIZE = layout.offsetof(29);
        MAXSAMPLERDESCRIPTORBUFFERRANGE = layout.offsetof(30);
        MAXRESOURCEDESCRIPTORBUFFERRANGE = layout.offsetof(31);
        SAMPLERDESCRIPTORBUFFERADDRESSSPACESIZE = layout.offsetof(32);
        RESOURCEDESCRIPTORBUFFERADDRESSSPACESIZE = layout.offsetof(33);
        DESCRIPTORBUFFERADDRESSSPACESIZE = layout.offsetof(34);
    }

    protected VkPhysicalDeviceDescriptorBufferPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceDescriptorBufferPropertiesEXT(ByteBuffer container) {
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
    public boolean combinedImageSamplerDescriptorSingleArray() {
        return ncombinedImageSamplerDescriptorSingleArray(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean bufferlessPushDescriptors() {
        return nbufferlessPushDescriptors(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean allowSamplerImageViewPostSubmitCreation() {
        return nallowSamplerImageViewPostSubmitCreation(address()) != 0;
    }

    @NativeType("VkDeviceSize")
    public long descriptorBufferOffsetAlignment() {
        return ndescriptorBufferOffsetAlignment(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorBufferBindings() {
        return nmaxDescriptorBufferBindings(address());
    }

    @NativeType("uint32_t")
    public int maxResourceDescriptorBufferBindings() {
        return nmaxResourceDescriptorBufferBindings(address());
    }

    @NativeType("uint32_t")
    public int maxSamplerDescriptorBufferBindings() {
        return nmaxSamplerDescriptorBufferBindings(address());
    }

    @NativeType("uint32_t")
    public int maxEmbeddedImmutableSamplerBindings() {
        return nmaxEmbeddedImmutableSamplerBindings(address());
    }

    @NativeType("uint32_t")
    public int maxEmbeddedImmutableSamplers() {
        return nmaxEmbeddedImmutableSamplers(address());
    }

    @NativeType("size_t")
    public long bufferCaptureReplayDescriptorDataSize() {
        return nbufferCaptureReplayDescriptorDataSize(address());
    }

    @NativeType("size_t")
    public long imageCaptureReplayDescriptorDataSize() {
        return nimageCaptureReplayDescriptorDataSize(address());
    }

    @NativeType("size_t")
    public long imageViewCaptureReplayDescriptorDataSize() {
        return nimageViewCaptureReplayDescriptorDataSize(address());
    }

    @NativeType("size_t")
    public long samplerCaptureReplayDescriptorDataSize() {
        return nsamplerCaptureReplayDescriptorDataSize(address());
    }

    @NativeType("size_t")
    public long accelerationStructureCaptureReplayDescriptorDataSize() {
        return naccelerationStructureCaptureReplayDescriptorDataSize(address());
    }

    @NativeType("size_t")
    public long samplerDescriptorSize() {
        return nsamplerDescriptorSize(address());
    }

    @NativeType("size_t")
    public long combinedImageSamplerDescriptorSize() {
        return ncombinedImageSamplerDescriptorSize(address());
    }

    @NativeType("size_t")
    public long sampledImageDescriptorSize() {
        return nsampledImageDescriptorSize(address());
    }

    @NativeType("size_t")
    public long storageImageDescriptorSize() {
        return nstorageImageDescriptorSize(address());
    }

    @NativeType("size_t")
    public long uniformTexelBufferDescriptorSize() {
        return nuniformTexelBufferDescriptorSize(address());
    }

    @NativeType("size_t")
    public long robustUniformTexelBufferDescriptorSize() {
        return nrobustUniformTexelBufferDescriptorSize(address());
    }

    @NativeType("size_t")
    public long storageTexelBufferDescriptorSize() {
        return nstorageTexelBufferDescriptorSize(address());
    }

    @NativeType("size_t")
    public long robustStorageTexelBufferDescriptorSize() {
        return nrobustStorageTexelBufferDescriptorSize(address());
    }

    @NativeType("size_t")
    public long uniformBufferDescriptorSize() {
        return nuniformBufferDescriptorSize(address());
    }

    @NativeType("size_t")
    public long robustUniformBufferDescriptorSize() {
        return nrobustUniformBufferDescriptorSize(address());
    }

    @NativeType("size_t")
    public long storageBufferDescriptorSize() {
        return nstorageBufferDescriptorSize(address());
    }

    @NativeType("size_t")
    public long robustStorageBufferDescriptorSize() {
        return nrobustStorageBufferDescriptorSize(address());
    }

    @NativeType("size_t")
    public long inputAttachmentDescriptorSize() {
        return ninputAttachmentDescriptorSize(address());
    }

    @NativeType("size_t")
    public long accelerationStructureDescriptorSize() {
        return naccelerationStructureDescriptorSize(address());
    }

    @NativeType("VkDeviceSize")
    public long maxSamplerDescriptorBufferRange() {
        return nmaxSamplerDescriptorBufferRange(address());
    }

    @NativeType("VkDeviceSize")
    public long maxResourceDescriptorBufferRange() {
        return nmaxResourceDescriptorBufferRange(address());
    }

    @NativeType("VkDeviceSize")
    public long samplerDescriptorBufferAddressSpaceSize() {
        return nsamplerDescriptorBufferAddressSpaceSize(address());
    }

    @NativeType("VkDeviceSize")
    public long resourceDescriptorBufferAddressSpaceSize() {
        return nresourceDescriptorBufferAddressSpaceSize(address());
    }

    @NativeType("VkDeviceSize")
    public long descriptorBufferAddressSpaceSize() {
        return ndescriptorBufferAddressSpaceSize(address());
    }

    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sType$Default() {
        return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceDescriptorBufferPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferPropertiesEXT set(VkPhysicalDeviceDescriptorBufferPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT malloc() {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT calloc() {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT create(long address) {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncombinedImageSamplerDescriptorSingleArray(long struct) {
        return MemoryUtil.memGetInt(struct + COMBINEDIMAGESAMPLERDESCRIPTORSINGLEARRAY);
    }

    public static int nbufferlessPushDescriptors(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERLESSPUSHDESCRIPTORS);
    }

    public static int nallowSamplerImageViewPostSubmitCreation(long struct) {
        return MemoryUtil.memGetInt(struct + ALLOWSAMPLERIMAGEVIEWPOSTSUBMITCREATION);
    }

    public static long ndescriptorBufferOffsetAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + DESCRIPTORBUFFEROFFSETALIGNMENT);
    }

    public static int nmaxDescriptorBufferBindings(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORBUFFERBINDINGS);
    }

    public static int nmaxResourceDescriptorBufferBindings(long struct) {
        return MemoryUtil.memGetInt(struct + MAXRESOURCEDESCRIPTORBUFFERBINDINGS);
    }

    public static int nmaxSamplerDescriptorBufferBindings(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSAMPLERDESCRIPTORBUFFERBINDINGS);
    }

    public static int nmaxEmbeddedImmutableSamplerBindings(long struct) {
        return MemoryUtil.memGetInt(struct + MAXEMBEDDEDIMMUTABLESAMPLERBINDINGS);
    }

    public static int nmaxEmbeddedImmutableSamplers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXEMBEDDEDIMMUTABLESAMPLERS);
    }

    public static long nbufferCaptureReplayDescriptorDataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + BUFFERCAPTUREREPLAYDESCRIPTORDATASIZE);
    }

    public static long nimageCaptureReplayDescriptorDataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + IMAGECAPTUREREPLAYDESCRIPTORDATASIZE);
    }

    public static long nimageViewCaptureReplayDescriptorDataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + IMAGEVIEWCAPTUREREPLAYDESCRIPTORDATASIZE);
    }

    public static long nsamplerCaptureReplayDescriptorDataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + SAMPLERCAPTUREREPLAYDESCRIPTORDATASIZE);
    }

    public static long naccelerationStructureCaptureReplayDescriptorDataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + ACCELERATIONSTRUCTURECAPTUREREPLAYDESCRIPTORDATASIZE);
    }

    public static long nsamplerDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + SAMPLERDESCRIPTORSIZE);
    }

    public static long ncombinedImageSamplerDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + COMBINEDIMAGESAMPLERDESCRIPTORSIZE);
    }

    public static long nsampledImageDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + SAMPLEDIMAGEDESCRIPTORSIZE);
    }

    public static long nstorageImageDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + STORAGEIMAGEDESCRIPTORSIZE);
    }

    public static long nuniformTexelBufferDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + UNIFORMTEXELBUFFERDESCRIPTORSIZE);
    }

    public static long nrobustUniformTexelBufferDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + ROBUSTUNIFORMTEXELBUFFERDESCRIPTORSIZE);
    }

    public static long nstorageTexelBufferDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + STORAGETEXELBUFFERDESCRIPTORSIZE);
    }

    public static long nrobustStorageTexelBufferDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + ROBUSTSTORAGETEXELBUFFERDESCRIPTORSIZE);
    }

    public static long nuniformBufferDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + UNIFORMBUFFERDESCRIPTORSIZE);
    }

    public static long nrobustUniformBufferDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + ROBUSTUNIFORMBUFFERDESCRIPTORSIZE);
    }

    public static long nstorageBufferDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + STORAGEBUFFERDESCRIPTORSIZE);
    }

    public static long nrobustStorageBufferDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + ROBUSTSTORAGEBUFFERDESCRIPTORSIZE);
    }

    public static long ninputAttachmentDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + INPUTATTACHMENTDESCRIPTORSIZE);
    }

    public static long naccelerationStructureDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + ACCELERATIONSTRUCTUREDESCRIPTORSIZE);
    }

    public static long nmaxSamplerDescriptorBufferRange(long struct) {
        return MemoryUtil.memGetLong(struct + MAXSAMPLERDESCRIPTORBUFFERRANGE);
    }

    public static long nmaxResourceDescriptorBufferRange(long struct) {
        return MemoryUtil.memGetLong(struct + MAXRESOURCEDESCRIPTORBUFFERRANGE);
    }

    public static long nsamplerDescriptorBufferAddressSpaceSize(long struct) {
        return MemoryUtil.memGetLong(struct + SAMPLERDESCRIPTORBUFFERADDRESSSPACESIZE);
    }

    public static long nresourceDescriptorBufferAddressSpaceSize(long struct) {
        return MemoryUtil.memGetLong(struct + RESOURCEDESCRIPTORBUFFERADDRESSSPACESIZE);
    }

    public static long ndescriptorBufferAddressSpaceSize(long struct) {
        return MemoryUtil.memGetLong(struct + DESCRIPTORBUFFERADDRESSSPACESIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorBufferPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDescriptorBufferPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceDescriptorBufferPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceDescriptorBufferPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean combinedImageSamplerDescriptorSingleArray() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ncombinedImageSamplerDescriptorSingleArray(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean bufferlessPushDescriptors() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nbufferlessPushDescriptors(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean allowSamplerImageViewPostSubmitCreation() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nallowSamplerImageViewPostSubmitCreation(address()) != 0;
        }

        @NativeType("VkDeviceSize")
        public long descriptorBufferOffsetAlignment() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ndescriptorBufferOffsetAlignment(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorBufferBindings() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxDescriptorBufferBindings(address());
        }

        @NativeType("uint32_t")
        public int maxResourceDescriptorBufferBindings() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxResourceDescriptorBufferBindings(address());
        }

        @NativeType("uint32_t")
        public int maxSamplerDescriptorBufferBindings() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxSamplerDescriptorBufferBindings(address());
        }

        @NativeType("uint32_t")
        public int maxEmbeddedImmutableSamplerBindings() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxEmbeddedImmutableSamplerBindings(address());
        }

        @NativeType("uint32_t")
        public int maxEmbeddedImmutableSamplers() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxEmbeddedImmutableSamplers(address());
        }

        @NativeType("size_t")
        public long bufferCaptureReplayDescriptorDataSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nbufferCaptureReplayDescriptorDataSize(address());
        }

        @NativeType("size_t")
        public long imageCaptureReplayDescriptorDataSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nimageCaptureReplayDescriptorDataSize(address());
        }

        @NativeType("size_t")
        public long imageViewCaptureReplayDescriptorDataSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nimageViewCaptureReplayDescriptorDataSize(address());
        }

        @NativeType("size_t")
        public long samplerCaptureReplayDescriptorDataSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsamplerCaptureReplayDescriptorDataSize(address());
        }

        @NativeType("size_t")
        public long accelerationStructureCaptureReplayDescriptorDataSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.naccelerationStructureCaptureReplayDescriptorDataSize(address());
        }

        @NativeType("size_t")
        public long samplerDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsamplerDescriptorSize(address());
        }

        @NativeType("size_t")
        public long combinedImageSamplerDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ncombinedImageSamplerDescriptorSize(address());
        }

        @NativeType("size_t")
        public long sampledImageDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsampledImageDescriptorSize(address());
        }

        @NativeType("size_t")
        public long storageImageDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nstorageImageDescriptorSize(address());
        }

        @NativeType("size_t")
        public long uniformTexelBufferDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nuniformTexelBufferDescriptorSize(address());
        }

        @NativeType("size_t")
        public long robustUniformTexelBufferDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustUniformTexelBufferDescriptorSize(address());
        }

        @NativeType("size_t")
        public long storageTexelBufferDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nstorageTexelBufferDescriptorSize(address());
        }

        @NativeType("size_t")
        public long robustStorageTexelBufferDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustStorageTexelBufferDescriptorSize(address());
        }

        @NativeType("size_t")
        public long uniformBufferDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nuniformBufferDescriptorSize(address());
        }

        @NativeType("size_t")
        public long robustUniformBufferDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustUniformBufferDescriptorSize(address());
        }

        @NativeType("size_t")
        public long storageBufferDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nstorageBufferDescriptorSize(address());
        }

        @NativeType("size_t")
        public long robustStorageBufferDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustStorageBufferDescriptorSize(address());
        }

        @NativeType("size_t")
        public long inputAttachmentDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ninputAttachmentDescriptorSize(address());
        }

        @NativeType("size_t")
        public long accelerationStructureDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.naccelerationStructureDescriptorSize(address());
        }

        @NativeType("VkDeviceSize")
        public long maxSamplerDescriptorBufferRange() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxSamplerDescriptorBufferRange(address());
        }

        @NativeType("VkDeviceSize")
        public long maxResourceDescriptorBufferRange() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxResourceDescriptorBufferRange(address());
        }

        @NativeType("VkDeviceSize")
        public long samplerDescriptorBufferAddressSpaceSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsamplerDescriptorBufferAddressSpaceSize(address());
        }

        @NativeType("VkDeviceSize")
        public long resourceDescriptorBufferAddressSpaceSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nresourceDescriptorBufferAddressSpaceSize(address());
        }

        @NativeType("VkDeviceSize")
        public long descriptorBufferAddressSpaceSize() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ndescriptorBufferAddressSpaceSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDescriptorBufferPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
