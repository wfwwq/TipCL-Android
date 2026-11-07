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
import org.lwjgl.vulkan.VkAttachmentDescription;
import org.lwjgl.vulkan.VkSubpassDependency;
import org.lwjgl.vulkan.VkSubpassDescription;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo.class */
public class VkRenderPassCreateInfo extends Struct<VkRenderPassCreateInfo> implements NativeResource {
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

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
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
    }

    protected VkRenderPassCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassCreateInfo create(long address, ByteBuffer container) {
        return new VkRenderPassCreateInfo(address, container);
    }

    public VkRenderPassCreateInfo(ByteBuffer container) {
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

    @NativeType("VkAttachmentDescription const *")
    public VkAttachmentDescription.Buffer pAttachments() {
        return npAttachments(address());
    }

    @NativeType("uint32_t")
    public int subpassCount() {
        return nsubpassCount(address());
    }

    @NativeType("VkSubpassDescription const *")
    public VkSubpassDescription.Buffer pSubpasses() {
        return npSubpasses(address());
    }

    @NativeType("uint32_t")
    public int dependencyCount() {
        return ndependencyCount(address());
    }

    @NativeType("VkSubpassDependency const *")
    public VkSubpassDependency.Buffer pDependencies() {
        return npDependencies(address());
    }

    public VkRenderPassCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo sType$Default() {
        return sType(38);
    }

    public VkRenderPassCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo pNext(VkRenderPassFragmentDensityMapCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassCreateInfo pNext(VkRenderPassInputAttachmentAspectCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassCreateInfo pNext(VkRenderPassInputAttachmentAspectCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassCreateInfo pNext(VkRenderPassMultiviewCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassCreateInfo pNext(VkRenderPassMultiviewCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassCreateInfo pNext(VkRenderPassTileShadingCreateInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassCreateInfo pNext(VkTileMemorySizeInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderPassCreateInfo flags(@NativeType("VkRenderPassCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo pAttachments(@NativeType("VkAttachmentDescription const *") VkAttachmentDescription.Buffer value) {
        npAttachments(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo pSubpasses(@NativeType("VkSubpassDescription const *") VkSubpassDescription.Buffer value) {
        npSubpasses(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo pDependencies(@NativeType("VkSubpassDependency const *") VkSubpassDependency.Buffer value) {
        npDependencies(address(), value);
        return this;
    }

    public VkRenderPassCreateInfo set(int sType, long pNext, int flags, VkAttachmentDescription.Buffer pAttachments, VkSubpassDescription.Buffer pSubpasses, VkSubpassDependency.Buffer pDependencies) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pAttachments(pAttachments);
        pSubpasses(pSubpasses);
        pDependencies(pDependencies);
        return this;
    }

    public VkRenderPassCreateInfo set(VkRenderPassCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassCreateInfo malloc() {
        return new VkRenderPassCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassCreateInfo calloc() {
        return new VkRenderPassCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassCreateInfo create(long address) {
        return new VkRenderPassCreateInfo(address, null);
    }

    public static VkRenderPassCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassCreateInfo(address, null);
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

    public static VkRenderPassCreateInfo malloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassCreateInfo calloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkAttachmentDescription.Buffer npAttachments(long struct) {
        return VkAttachmentDescription.createSafe(MemoryUtil.memGetAddress(struct + PATTACHMENTS), nattachmentCount(struct));
    }

    public static int nsubpassCount(long struct) {
        return MemoryUtil.memGetInt(struct + SUBPASSCOUNT);
    }

    public static VkSubpassDescription.Buffer npSubpasses(long struct) {
        return VkSubpassDescription.create(MemoryUtil.memGetAddress(struct + PSUBPASSES), nsubpassCount(struct));
    }

    public static int ndependencyCount(long struct) {
        return MemoryUtil.memGetInt(struct + DEPENDENCYCOUNT);
    }

    public static VkSubpassDependency.Buffer npDependencies(long struct) {
        return VkSubpassDependency.createSafe(MemoryUtil.memGetAddress(struct + PDEPENDENCIES), ndependencyCount(struct));
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

    public static void npAttachments(long struct, VkAttachmentDescription.Buffer value) {
        MemoryUtil.memPutAddress(struct + PATTACHMENTS, MemoryUtil.memAddressSafe(value));
        nattachmentCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nsubpassCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBPASSCOUNT, value);
    }

    public static void npSubpasses(long struct, VkSubpassDescription.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSUBPASSES, value.address());
        nsubpassCount(struct, value.remaining());
    }

    public static void ndependencyCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPENDENCYCOUNT, value);
    }

    public static void npDependencies(long struct, VkSubpassDependency.Buffer value) {
        MemoryUtil.memPutAddress(struct + PDEPENDENCIES, MemoryUtil.memAddressSafe(value));
        ndependencyCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PATTACHMENTS));
        }
        int subpassCount = nsubpassCount(struct);
        long pSubpasses = MemoryUtil.memGetAddress(struct + PSUBPASSES);
        Checks.check(pSubpasses);
        validate(pSubpasses, subpassCount, VkSubpassDescription.SIZEOF, VkSubpassDescription::validate);
        if (ndependencyCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDEPENDENCIES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassCreateInfo, Buffer> implements NativeResource {
        private static final VkRenderPassCreateInfo ELEMENT_FACTORY = VkRenderPassCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassCreateInfo.SIZEOF);
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
        public VkRenderPassCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassCreateInfo.npNext(address());
        }

        @NativeType("VkRenderPassCreateFlags")
        public int flags() {
            return VkRenderPassCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int attachmentCount() {
            return VkRenderPassCreateInfo.nattachmentCount(address());
        }

        @NativeType("VkAttachmentDescription const *")
        public VkAttachmentDescription.Buffer pAttachments() {
            return VkRenderPassCreateInfo.npAttachments(address());
        }

        @NativeType("uint32_t")
        public int subpassCount() {
            return VkRenderPassCreateInfo.nsubpassCount(address());
        }

        @NativeType("VkSubpassDescription const *")
        public VkSubpassDescription.Buffer pSubpasses() {
            return VkRenderPassCreateInfo.npSubpasses(address());
        }

        @NativeType("uint32_t")
        public int dependencyCount() {
            return VkRenderPassCreateInfo.ndependencyCount(address());
        }

        @NativeType("VkSubpassDependency const *")
        public VkSubpassDependency.Buffer pDependencies() {
            return VkRenderPassCreateInfo.npDependencies(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(38);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkRenderPassFragmentDensityMapCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassInputAttachmentAspectCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassInputAttachmentAspectCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassMultiviewCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassMultiviewCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassTileShadingCreateInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkTileMemorySizeInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkRenderPassCreateFlags") int value) {
            VkRenderPassCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer pAttachments(@NativeType("VkAttachmentDescription const *") VkAttachmentDescription.Buffer value) {
            VkRenderPassCreateInfo.npAttachments(address(), value);
            return this;
        }

        public Buffer pSubpasses(@NativeType("VkSubpassDescription const *") VkSubpassDescription.Buffer value) {
            VkRenderPassCreateInfo.npSubpasses(address(), value);
            return this;
        }

        public Buffer pDependencies(@NativeType("VkSubpassDependency const *") VkSubpassDependency.Buffer value) {
            VkRenderPassCreateInfo.npDependencies(address(), value);
            return this;
        }
    }
}
