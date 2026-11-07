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
import org.lwjgl.vulkan.VkAttachmentSampleLocationsEXT;
import org.lwjgl.vulkan.VkSubpassSampleLocationsEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassSampleLocationsBeginInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassSampleLocationsBeginInfoEXT.class */
public class VkRenderPassSampleLocationsBeginInfoEXT extends Struct<VkRenderPassSampleLocationsBeginInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ATTACHMENTINITIALSAMPLELOCATIONSCOUNT;
    public static final int PATTACHMENTINITIALSAMPLELOCATIONS;
    public static final int POSTSUBPASSSAMPLELOCATIONSCOUNT;
    public static final int PPOSTSUBPASSSAMPLELOCATIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ATTACHMENTINITIALSAMPLELOCATIONSCOUNT = layout.offsetof(2);
        PATTACHMENTINITIALSAMPLELOCATIONS = layout.offsetof(3);
        POSTSUBPASSSAMPLELOCATIONSCOUNT = layout.offsetof(4);
        PPOSTSUBPASSSAMPLELOCATIONS = layout.offsetof(5);
    }

    protected VkRenderPassSampleLocationsBeginInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassSampleLocationsBeginInfoEXT create(long address, ByteBuffer container) {
        return new VkRenderPassSampleLocationsBeginInfoEXT(address, container);
    }

    public VkRenderPassSampleLocationsBeginInfoEXT(ByteBuffer container) {
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
    public int attachmentInitialSampleLocationsCount() {
        return nattachmentInitialSampleLocationsCount(address());
    }

    @NativeType("VkAttachmentSampleLocationsEXT const *")
    public VkAttachmentSampleLocationsEXT.Buffer pAttachmentInitialSampleLocations() {
        return npAttachmentInitialSampleLocations(address());
    }

    @NativeType("uint32_t")
    public int postSubpassSampleLocationsCount() {
        return npostSubpassSampleLocationsCount(address());
    }

    @NativeType("VkSubpassSampleLocationsEXT const *")
    public VkSubpassSampleLocationsEXT.Buffer pPostSubpassSampleLocations() {
        return npPostSubpassSampleLocations(address());
    }

    public VkRenderPassSampleLocationsBeginInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassSampleLocationsBeginInfoEXT sType$Default() {
        return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT);
    }

    public VkRenderPassSampleLocationsBeginInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassSampleLocationsBeginInfoEXT pAttachmentInitialSampleLocations(@NativeType("VkAttachmentSampleLocationsEXT const *") VkAttachmentSampleLocationsEXT.Buffer value) {
        npAttachmentInitialSampleLocations(address(), value);
        return this;
    }

    public VkRenderPassSampleLocationsBeginInfoEXT pPostSubpassSampleLocations(@NativeType("VkSubpassSampleLocationsEXT const *") VkSubpassSampleLocationsEXT.Buffer value) {
        npPostSubpassSampleLocations(address(), value);
        return this;
    }

    public VkRenderPassSampleLocationsBeginInfoEXT set(int sType, long pNext, VkAttachmentSampleLocationsEXT.Buffer pAttachmentInitialSampleLocations, VkSubpassSampleLocationsEXT.Buffer pPostSubpassSampleLocations) {
        sType(sType);
        pNext(pNext);
        pAttachmentInitialSampleLocations(pAttachmentInitialSampleLocations);
        pPostSubpassSampleLocations(pPostSubpassSampleLocations);
        return this;
    }

    public VkRenderPassSampleLocationsBeginInfoEXT set(VkRenderPassSampleLocationsBeginInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT malloc() {
        return new VkRenderPassSampleLocationsBeginInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT calloc() {
        return new VkRenderPassSampleLocationsBeginInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassSampleLocationsBeginInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT create(long address) {
        return new VkRenderPassSampleLocationsBeginInfoEXT(address, null);
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassSampleLocationsBeginInfoEXT(address, null);
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

    public static VkRenderPassSampleLocationsBeginInfoEXT malloc(MemoryStack stack) {
        return new VkRenderPassSampleLocationsBeginInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT calloc(MemoryStack stack) {
        return new VkRenderPassSampleLocationsBeginInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nattachmentInitialSampleLocationsCount(long struct) {
        return MemoryUtil.memGetInt(struct + ATTACHMENTINITIALSAMPLELOCATIONSCOUNT);
    }

    public static VkAttachmentSampleLocationsEXT.Buffer npAttachmentInitialSampleLocations(long struct) {
        return VkAttachmentSampleLocationsEXT.createSafe(MemoryUtil.memGetAddress(struct + PATTACHMENTINITIALSAMPLELOCATIONS), nattachmentInitialSampleLocationsCount(struct));
    }

    public static int npostSubpassSampleLocationsCount(long struct) {
        return MemoryUtil.memGetInt(struct + POSTSUBPASSSAMPLELOCATIONSCOUNT);
    }

    public static VkSubpassSampleLocationsEXT.Buffer npPostSubpassSampleLocations(long struct) {
        return VkSubpassSampleLocationsEXT.createSafe(MemoryUtil.memGetAddress(struct + PPOSTSUBPASSSAMPLELOCATIONS), npostSubpassSampleLocationsCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nattachmentInitialSampleLocationsCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ATTACHMENTINITIALSAMPLELOCATIONSCOUNT, value);
    }

    public static void npAttachmentInitialSampleLocations(long struct, VkAttachmentSampleLocationsEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PATTACHMENTINITIALSAMPLELOCATIONS, MemoryUtil.memAddressSafe(value));
        nattachmentInitialSampleLocationsCount(struct, value == null ? 0 : value.remaining());
    }

    public static void npostSubpassSampleLocationsCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + POSTSUBPASSSAMPLELOCATIONSCOUNT, value);
    }

    public static void npPostSubpassSampleLocations(long struct, VkSubpassSampleLocationsEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PPOSTSUBPASSSAMPLELOCATIONS, MemoryUtil.memAddressSafe(value));
        npostSubpassSampleLocationsCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        int attachmentInitialSampleLocationsCount = nattachmentInitialSampleLocationsCount(struct);
        if (attachmentInitialSampleLocationsCount != 0) {
            long pAttachmentInitialSampleLocations = MemoryUtil.memGetAddress(struct + PATTACHMENTINITIALSAMPLELOCATIONS);
            Checks.check(pAttachmentInitialSampleLocations);
            validate(pAttachmentInitialSampleLocations, attachmentInitialSampleLocationsCount, VkAttachmentSampleLocationsEXT.SIZEOF, VkAttachmentSampleLocationsEXT::validate);
        }
        int postSubpassSampleLocationsCount = npostSubpassSampleLocationsCount(struct);
        if (postSubpassSampleLocationsCount != 0) {
            long pPostSubpassSampleLocations = MemoryUtil.memGetAddress(struct + PPOSTSUBPASSSAMPLELOCATIONS);
            Checks.check(pPostSubpassSampleLocations);
            validate(pPostSubpassSampleLocations, postSubpassSampleLocationsCount, VkSubpassSampleLocationsEXT.SIZEOF, VkSubpassSampleLocationsEXT::validate);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassSampleLocationsBeginInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassSampleLocationsBeginInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassSampleLocationsBeginInfoEXT, Buffer> implements NativeResource {
        private static final VkRenderPassSampleLocationsBeginInfoEXT ELEMENT_FACTORY = VkRenderPassSampleLocationsBeginInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassSampleLocationsBeginInfoEXT.SIZEOF);
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
        public VkRenderPassSampleLocationsBeginInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassSampleLocationsBeginInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassSampleLocationsBeginInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int attachmentInitialSampleLocationsCount() {
            return VkRenderPassSampleLocationsBeginInfoEXT.nattachmentInitialSampleLocationsCount(address());
        }

        @NativeType("VkAttachmentSampleLocationsEXT const *")
        public VkAttachmentSampleLocationsEXT.Buffer pAttachmentInitialSampleLocations() {
            return VkRenderPassSampleLocationsBeginInfoEXT.npAttachmentInitialSampleLocations(address());
        }

        @NativeType("uint32_t")
        public int postSubpassSampleLocationsCount() {
            return VkRenderPassSampleLocationsBeginInfoEXT.npostSubpassSampleLocationsCount(address());
        }

        @NativeType("VkSubpassSampleLocationsEXT const *")
        public VkSubpassSampleLocationsEXT.Buffer pPostSubpassSampleLocations() {
            return VkRenderPassSampleLocationsBeginInfoEXT.npPostSubpassSampleLocations(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassSampleLocationsBeginInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassSampleLocationsBeginInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pAttachmentInitialSampleLocations(@NativeType("VkAttachmentSampleLocationsEXT const *") VkAttachmentSampleLocationsEXT.Buffer value) {
            VkRenderPassSampleLocationsBeginInfoEXT.npAttachmentInitialSampleLocations(address(), value);
            return this;
        }

        public Buffer pPostSubpassSampleLocations(@NativeType("VkSubpassSampleLocationsEXT const *") VkSubpassSampleLocationsEXT.Buffer value) {
            VkRenderPassSampleLocationsBeginInfoEXT.npPostSubpassSampleLocations(address(), value);
            return this;
        }
    }
}
