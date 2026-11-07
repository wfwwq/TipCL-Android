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
import org.lwjgl.vulkan.VkRect2D;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.class */
public class VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM extends Struct<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PERVIEWRENDERAREACOUNT;
    public static final int PPERVIEWRENDERAREAS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERVIEWRENDERAREACOUNT = layout.offsetof(2);
        PPERVIEWRENDERAREAS = layout.offsetof(3);
    }

    protected VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM create(long address, ByteBuffer container) {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(address, container);
    }

    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(ByteBuffer container) {
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
    public int perViewRenderAreaCount() {
        return nperViewRenderAreaCount(address());
    }

    @NativeType("VkRect2D const *")
    public VkRect2D.Buffer pPerViewRenderAreas() {
        return npPerViewRenderAreas(address());
    }

    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM sType$Default() {
        return sType(QCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM);
    }

    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pPerViewRenderAreas(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
        npPerViewRenderAreas(address(), value);
        return this;
    }

    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM set(int sType, long pNext, VkRect2D.Buffer pPerViewRenderAreas) {
        sType(sType);
        pNext(pNext);
        pPerViewRenderAreas(pPerViewRenderAreas);
        return this;
    }

    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM set(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM malloc() {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM calloc() {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM create(long address) {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(address, null);
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(address, null);
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

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM malloc(MemoryStack stack) {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM calloc(MemoryStack stack) {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nperViewRenderAreaCount(long struct) {
        return MemoryUtil.memGetInt(struct + PERVIEWRENDERAREACOUNT);
    }

    public static VkRect2D.Buffer npPerViewRenderAreas(long struct) {
        return VkRect2D.createSafe(MemoryUtil.memGetAddress(struct + PPERVIEWRENDERAREAS), nperViewRenderAreaCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nperViewRenderAreaCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PERVIEWRENDERAREACOUNT, value);
    }

    public static void npPerViewRenderAreas(long struct, VkRect2D.Buffer value) {
        MemoryUtil.memPutAddress(struct + PPERVIEWRENDERAREAS, MemoryUtil.memAddressSafe(value));
        nperViewRenderAreaCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nperViewRenderAreaCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPERVIEWRENDERAREAS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM, Buffer> implements NativeResource {
        private static final VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM ELEMENT_FACTORY = VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.SIZEOF);
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
        public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.npNext(address());
        }

        @NativeType("uint32_t")
        public int perViewRenderAreaCount() {
            return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.nperViewRenderAreaCount(address());
        }

        @NativeType("VkRect2D const *")
        public VkRect2D.Buffer pPerViewRenderAreas() {
            return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.npPerViewRenderAreas(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.npNext(address(), value);
            return this;
        }

        public Buffer pPerViewRenderAreas(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
            VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.npPerViewRenderAreas(address(), value);
            return this;
        }
    }
}
