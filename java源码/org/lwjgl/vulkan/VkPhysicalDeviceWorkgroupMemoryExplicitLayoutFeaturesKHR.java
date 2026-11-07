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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.class */
public class VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR extends Struct<VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int WORKGROUPMEMORYEXPLICITLAYOUT;
    public static final int WORKGROUPMEMORYEXPLICITLAYOUTSCALARBLOCKLAYOUT;
    public static final int WORKGROUPMEMORYEXPLICITLAYOUT8BITACCESS;
    public static final int WORKGROUPMEMORYEXPLICITLAYOUT16BITACCESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WORKGROUPMEMORYEXPLICITLAYOUT = layout.offsetof(2);
        WORKGROUPMEMORYEXPLICITLAYOUTSCALARBLOCKLAYOUT = layout.offsetof(3);
        WORKGROUPMEMORYEXPLICITLAYOUT8BITACCESS = layout.offsetof(4);
        WORKGROUPMEMORYEXPLICITLAYOUT16BITACCESS = layout.offsetof(5);
    }

    protected VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(ByteBuffer container) {
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
    public boolean workgroupMemoryExplicitLayout() {
        return nworkgroupMemoryExplicitLayout(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean workgroupMemoryExplicitLayoutScalarBlockLayout() {
        return nworkgroupMemoryExplicitLayoutScalarBlockLayout(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean workgroupMemoryExplicitLayout8BitAccess() {
        return nworkgroupMemoryExplicitLayout8BitAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean workgroupMemoryExplicitLayout16BitAccess() {
        return nworkgroupMemoryExplicitLayout16BitAccess(address()) != 0;
    }

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR sType$Default() {
        return sType(KHRWorkgroupMemoryExplicitLayout.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR);
    }

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout(@NativeType("VkBool32") boolean value) {
        nworkgroupMemoryExplicitLayout(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayoutScalarBlockLayout(@NativeType("VkBool32") boolean value) {
        nworkgroupMemoryExplicitLayoutScalarBlockLayout(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout8BitAccess(@NativeType("VkBool32") boolean value) {
        nworkgroupMemoryExplicitLayout8BitAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout16BitAccess(@NativeType("VkBool32") boolean value) {
        nworkgroupMemoryExplicitLayout16BitAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR set(int sType, long pNext, boolean workgroupMemoryExplicitLayout, boolean workgroupMemoryExplicitLayoutScalarBlockLayout, boolean workgroupMemoryExplicitLayout8BitAccess, boolean workgroupMemoryExplicitLayout16BitAccess) {
        sType(sType);
        pNext(pNext);
        workgroupMemoryExplicitLayout(workgroupMemoryExplicitLayout);
        workgroupMemoryExplicitLayoutScalarBlockLayout(workgroupMemoryExplicitLayoutScalarBlockLayout);
        workgroupMemoryExplicitLayout8BitAccess(workgroupMemoryExplicitLayout8BitAccess);
        workgroupMemoryExplicitLayout16BitAccess(workgroupMemoryExplicitLayout16BitAccess);
        return this;
    }

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR set(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR malloc() {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR calloc() {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR create(long address) {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nworkgroupMemoryExplicitLayout(long struct) {
        return MemoryUtil.memGetInt(struct + WORKGROUPMEMORYEXPLICITLAYOUT);
    }

    public static int nworkgroupMemoryExplicitLayoutScalarBlockLayout(long struct) {
        return MemoryUtil.memGetInt(struct + WORKGROUPMEMORYEXPLICITLAYOUTSCALARBLOCKLAYOUT);
    }

    public static int nworkgroupMemoryExplicitLayout8BitAccess(long struct) {
        return MemoryUtil.memGetInt(struct + WORKGROUPMEMORYEXPLICITLAYOUT8BITACCESS);
    }

    public static int nworkgroupMemoryExplicitLayout16BitAccess(long struct) {
        return MemoryUtil.memGetInt(struct + WORKGROUPMEMORYEXPLICITLAYOUT16BITACCESS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nworkgroupMemoryExplicitLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + WORKGROUPMEMORYEXPLICITLAYOUT, value);
    }

    public static void nworkgroupMemoryExplicitLayoutScalarBlockLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + WORKGROUPMEMORYEXPLICITLAYOUTSCALARBLOCKLAYOUT, value);
    }

    public static void nworkgroupMemoryExplicitLayout8BitAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + WORKGROUPMEMORYEXPLICITLAYOUT8BITACCESS, value);
    }

    public static void nworkgroupMemoryExplicitLayout16BitAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + WORKGROUPMEMORYEXPLICITLAYOUT16BITACCESS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean workgroupMemoryExplicitLayout() {
            return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayout(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean workgroupMemoryExplicitLayoutScalarBlockLayout() {
            return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayoutScalarBlockLayout(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean workgroupMemoryExplicitLayout8BitAccess() {
            return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayout8BitAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean workgroupMemoryExplicitLayout16BitAccess() {
            return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayout16BitAccess(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRWorkgroupMemoryExplicitLayout.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer workgroupMemoryExplicitLayout(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayout(address(), value ? 1 : 0);
            return this;
        }

        public Buffer workgroupMemoryExplicitLayoutScalarBlockLayout(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayoutScalarBlockLayout(address(), value ? 1 : 0);
            return this;
        }

        public Buffer workgroupMemoryExplicitLayout8BitAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayout8BitAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer workgroupMemoryExplicitLayout16BitAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayout16BitAccess(address(), value ? 1 : 0);
            return this;
        }
    }
}
