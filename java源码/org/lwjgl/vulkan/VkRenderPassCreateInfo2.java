package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkAttachmentDescription2;
import org.lwjgl.vulkan.VkSubpassDependency2;
import org.lwjgl.vulkan.VkSubpassDescription2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2.class */
public class VkRenderPassCreateInfo2 extends Struct<VkRenderPassCreateInfo2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int ATTACHMENTCOUNT;
    public static final int PATTACHMENTS;
    public static final int SUBPASSCOUNT;
    public static final int PSUBPASSES;
    public static final int DEPENDENCYCOUNT;
    public static final int PDEPENDENCIES;
    public static final int CORRELATEDVIEWMASKCOUNT;
    public static final int PCORRELATEDVIEWMASKS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        ATTACHMENTCOUNT = layout.offsetof(3);
        PATTACHMENTS = layout.offsetof(4);
        SUBPASSCOUNT = layout.offsetof(5);
        PSUBPASSES = layout.offsetof(6);
        DEPENDENCYCOUNT = layout.offsetof(7);
        PDEPENDENCIES = layout.offsetof(8);
        CORRELATEDVIEWMASKCOUNT = layout.offsetof(9);
        PCORRELATEDVIEWMASKS = layout.offsetof(10);
    }

    protected VkRenderPassCreateInfo2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassCreateInfo2 create(long address, ByteBuffer container) {
        return new VkRenderPassCreateInfo2(address, container);
    }

    public VkRenderPassCreateInfo2(ByteBuffer container) {
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

    @NativeType("VkRenderPassCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int attachmentCount() {
        return nattachmentCount(address());
    }

    @NativeType("VkAttachmentDescription2 const *")
    public VkAttachmentDescription2.Buffer pAttachments() {
        return npAttachments(address());
    }

    @NativeType("uint32_t")
    public int subpassCount() {
        return nsubpassCount(address());
    }

    @NativeType("VkSubpassDescription2 const *")
    public VkSubpassDescription2.Buffer pSubpasses() {
        return npSubpasses(address());
    }

    @NativeType("uint32_t")
    public int dependencyCount() {
        return ndependencyCount(address());
    }

    @NativeType("VkSubpassDependency2 const *")
    public VkSubpassDependency2.Buffer pDependencies() {
        return npDependencies(address());
    }

    @NativeType("uint32_t")
    public int correlatedViewMaskCount() {
        return ncorrelatedViewMaskCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pCorrelatedViewMasks() {
        return npCorrelatedViewMasks(address());
    }

    public VkRenderPassCreateInfo2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo2 sType$Default() {
        return sType(1000109004);
    }

    public VkRenderPassCreateInfo2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo2 pNext(VkRenderPassCreationControlEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassCreateInfo2 pNext(VkRenderPassCreationFeedbackCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassCreateInfo2 pNext(VkRenderPassFragmentDensityMapCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassCreateInfo2 pNext(VkRenderPassTileShadingCreateInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassCreateInfo2 pNext(VkTileMemorySizeInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassCreateInfo2 flags(@NativeType("VkRenderPassCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo2 pAttachments(@NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.Buffer value) {
        npAttachments(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo2 pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) {
        npSubpasses(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo2 pDependencies(@NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.Buffer value) {
        npDependencies(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo2 pCorrelatedViewMasks(@NativeType("uint32_t const *") IntBuffer value) {
        npCorrelatedViewMasks(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo2 set(int sType, long pNext, int flags, VkAttachmentDescription2.Buffer pAttachments, VkSubpassDescription2.Buffer pSubpasses, VkSubpassDependency2.Buffer pDependencies, IntBuffer pCorrelatedViewMasks) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pAttachments(pAttachments);
        pSubpasses(pSubpasses);
        pDependencies(pDependencies);
        pCorrelatedViewMasks(pCorrelatedViewMasks);
        return this;
    }

    public VkRenderPassCreateInfo2 set(VkRenderPassCreateInfo2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassCreateInfo2 malloc() {
        return new VkRenderPassCreateInfo2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassCreateInfo2 calloc() {
        return new VkRenderPassCreateInfo2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassCreateInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassCreateInfo2(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassCreateInfo2 create(long address) {
        return new VkRenderPassCreateInfo2(address, null);
    }

    public static VkRenderPassCreateInfo2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassCreateInfo2(address, null);
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

    public static VkRenderPassCreateInfo2 malloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassCreateInfo2 calloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nattachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + ATTACHMENTCOUNT);
    }

    public static VkAttachmentDescription2.Buffer npAttachments(long struct) {
        return VkAttachmentDescription2.createSafe(MemoryUtil.memGetAddress(struct + PATTACHMENTS), nattachmentCount(struct));
    }

    public static int nsubpassCount(long struct) {
        return MemoryUtil.memGetInt(struct + SUBPASSCOUNT);
    }

    public static VkSubpassDescription2.Buffer npSubpasses(long struct) {
        return VkSubpassDescription2.create(MemoryUtil.memGetAddress(struct + PSUBPASSES), nsubpassCount(struct));
    }

    public static int ndependencyCount(long struct) {
        return MemoryUtil.memGetInt(struct + DEPENDENCYCOUNT);
    }

    public static VkSubpassDependency2.Buffer npDependencies(long struct) {
        return VkSubpassDependency2.createSafe(MemoryUtil.memGetAddress(struct + PDEPENDENCIES), ndependencyCount(struct));
    }

    public static int ncorrelatedViewMaskCount(long struct) {
        return MemoryUtil.memGetInt(struct + CORRELATEDVIEWMASKCOUNT);
    }

    public static IntBuffer npCorrelatedViewMasks(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PCORRELATEDVIEWMASKS), ncorrelatedViewMaskCount(struct));
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

    public static void nattachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ATTACHMENTCOUNT, value);
    }

    public static void npAttachments(long struct, VkAttachmentDescription2.Buffer value) {
        MemoryUtil.memPutAddress(struct + PATTACHMENTS, MemoryUtil.memAddressSafe(value));
        nattachmentCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nsubpassCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBPASSCOUNT, value);
    }

    public static void npSubpasses(long struct, VkSubpassDescription2.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSUBPASSES, value.address());
        nsubpassCount(struct, value.remaining());
    }

    public static void ndependencyCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPENDENCYCOUNT, value);
    }

    public static void npDependencies(long struct, VkSubpassDependency2.Buffer value) {
        MemoryUtil.memPutAddress(struct + PDEPENDENCIES, MemoryUtil.memAddressSafe(value));
        ndependencyCount(struct, value == null ? 0 : value.remaining());
    }

    public static void ncorrelatedViewMaskCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + CORRELATEDVIEWMASKCOUNT, value);
    }

    public static void npCorrelatedViewMasks(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCORRELATEDVIEWMASKS, MemoryUtil.memAddressSafe(value));
        ncorrelatedViewMaskCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PATTACHMENTS));
        }
        int subpassCount = nsubpassCount(struct);
        long pSubpasses = MemoryUtil.memGetAddress(struct + PSUBPASSES);
        Checks.check(pSubpasses);
        validate(pSubpasses, subpassCount, VkSubpassDescription2.SIZEOF, VkSubpassDescription2::validate);
        if (ndependencyCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDEPENDENCIES));
        }
        if (ncorrelatedViewMaskCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PCORRELATEDVIEWMASKS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassCreateInfo2, Buffer> implements NativeResource {
        private static final VkRenderPassCreateInfo2 ELEMENT_FACTORY = VkRenderPassCreateInfo2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassCreateInfo2.SIZEOF);
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
        public VkRenderPassCreateInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassCreateInfo2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassCreateInfo2.npNext(address());
        }

        @NativeType("VkRenderPassCreateFlags")
        public int flags() {
            return VkRenderPassCreateInfo2.nflags(address());
        }

        @NativeType("uint32_t")
        public int attachmentCount() {
            return VkRenderPassCreateInfo2.nattachmentCount(address());
        }

        @NativeType("VkAttachmentDescription2 const *")
        public VkAttachmentDescription2.Buffer pAttachments() {
            return VkRenderPassCreateInfo2.npAttachments(address());
        }

        @NativeType("uint32_t")
        public int subpassCount() {
            return VkRenderPassCreateInfo2.nsubpassCount(address());
        }

        @NativeType("VkSubpassDescription2 const *")
        public VkSubpassDescription2.Buffer pSubpasses() {
            return VkRenderPassCreateInfo2.npSubpasses(address());
        }

        @NativeType("uint32_t")
        public int dependencyCount() {
            return VkRenderPassCreateInfo2.ndependencyCount(address());
        }

        @NativeType("VkSubpassDependency2 const *")
        public VkSubpassDependency2.Buffer pDependencies() {
            return VkRenderPassCreateInfo2.npDependencies(address());
        }

        @NativeType("uint32_t")
        public int correlatedViewMaskCount() {
            return VkRenderPassCreateInfo2.ncorrelatedViewMaskCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pCorrelatedViewMasks() {
            return VkRenderPassCreateInfo2.npCorrelatedViewMasks(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassCreateInfo2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000109004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassCreateInfo2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkRenderPassCreationControlEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassCreationFeedbackCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassFragmentDensityMapCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassTileShadingCreateInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkTileMemorySizeInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkRenderPassCreateFlags") int value) {
            VkRenderPassCreateInfo2.nflags(address(), value);
            return this;
        }

        public Buffer pAttachments(@NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.Buffer value) {
            VkRenderPassCreateInfo2.npAttachments(address(), value);
            return this;
        }

        public Buffer pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) {
            VkRenderPassCreateInfo2.npSubpasses(address(), value);
            return this;
        }

        public Buffer pDependencies(@NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.Buffer value) {
            VkRenderPassCreateInfo2.npDependencies(address(), value);
            return this;
        }

        public Buffer pCorrelatedViewMasks(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderPassCreateInfo2.npCorrelatedViewMasks(address(), value);
            return this;
        }
    }
}
