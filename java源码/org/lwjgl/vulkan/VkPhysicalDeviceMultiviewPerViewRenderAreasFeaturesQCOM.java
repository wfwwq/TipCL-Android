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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.class */
public class VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM extends Struct<VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MULTIVIEWPERVIEWRENDERAREAS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MULTIVIEWPERVIEWRENDERAREAS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(address, container);
    }

    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(ByteBuffer container) {
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
    public boolean multiviewPerViewRenderAreas() {
        return nmultiviewPerViewRenderAreas(address()) != 0;
    }

    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM sType$Default() {
        return sType(QCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM);
    }

    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM multiviewPerViewRenderAreas(@NativeType("VkBool32") boolean value) {
        nmultiviewPerViewRenderAreas(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM set(int sType, long pNext, boolean multiviewPerViewRenderAreas) {
        sType(sType);
        pNext(pNext);
        multiviewPerViewRenderAreas(multiviewPerViewRenderAreas);
        return this;
    }

    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM set(VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM malloc() {
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM calloc() {
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(address, null);
    }

    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(address, null);
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

    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmultiviewPerViewRenderAreas(long struct) {
        return MemoryUtil.memGetInt(struct + MULTIVIEWPERVIEWRENDERAREAS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmultiviewPerViewRenderAreas(long struct, int value) {
        MemoryUtil.memPutInt(struct + MULTIVIEWPERVIEWRENDERAREAS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.SIZEOF);
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
        public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean multiviewPerViewRenderAreas() {
            return VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.nmultiviewPerViewRenderAreas(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.npNext(address(), value);
            return this;
        }

        public Buffer multiviewPerViewRenderAreas(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.nmultiviewPerViewRenderAreas(address(), value ? 1 : 0);
            return this;
        }
    }
}
