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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.class */
public class VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM extends Struct<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MULTIVIEWPERVIEWVIEWPORTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MULTIVIEWPERVIEWVIEWPORTS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(address, container);
    }

    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(ByteBuffer container) {
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
    public boolean multiviewPerViewViewports() {
        return nmultiviewPerViewViewports(address()) != 0;
    }

    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM sType$Default() {
        return sType(QCOMMultiviewPerViewViewports.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM);
    }

    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM multiviewPerViewViewports(@NativeType("VkBool32") boolean value) {
        nmultiviewPerViewViewports(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM set(int sType, long pNext, boolean multiviewPerViewViewports) {
        sType(sType);
        pNext(pNext);
        multiviewPerViewViewports(multiviewPerViewViewports);
        return this;
    }

    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM set(VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM malloc() {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM calloc() {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(address, null);
    }

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(address, null);
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

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmultiviewPerViewViewports(long struct) {
        return MemoryUtil.memGetInt(struct + MULTIVIEWPERVIEWVIEWPORTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmultiviewPerViewViewports(long struct, int value) {
        MemoryUtil.memPutInt(struct + MULTIVIEWPERVIEWVIEWPORTS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.SIZEOF);
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
        public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean multiviewPerViewViewports() {
            return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.nmultiviewPerViewViewports(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMMultiviewPerViewViewports.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.npNext(address(), value);
            return this;
        }

        public Buffer multiviewPerViewViewports(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.nmultiviewPerViewViewports(address(), value ? 1 : 0);
            return this;
        }
    }
}
