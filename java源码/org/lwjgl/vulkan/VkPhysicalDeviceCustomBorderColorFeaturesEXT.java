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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCustomBorderColorFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCustomBorderColorFeaturesEXT.class */
public class VkPhysicalDeviceCustomBorderColorFeaturesEXT extends Struct<VkPhysicalDeviceCustomBorderColorFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CUSTOMBORDERCOLORS;
    public static final int CUSTOMBORDERCOLORWITHOUTFORMAT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CUSTOMBORDERCOLORS = layout.offsetof(2);
        CUSTOMBORDERCOLORWITHOUTFORMAT = layout.offsetof(3);
    }

    protected VkPhysicalDeviceCustomBorderColorFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT(ByteBuffer container) {
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
    public boolean customBorderColors() {
        return ncustomBorderColors(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean customBorderColorWithoutFormat() {
        return ncustomBorderColorWithoutFormat(address()) != 0;
    }

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sType$Default() {
        return sType(EXTCustomBorderColor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT);
    }

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColors(@NativeType("VkBool32") boolean value) {
        ncustomBorderColors(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorWithoutFormat(@NativeType("VkBool32") boolean value) {
        ncustomBorderColorWithoutFormat(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT set(int sType, long pNext, boolean customBorderColors, boolean customBorderColorWithoutFormat) {
        sType(sType);
        pNext(pNext);
        customBorderColors(customBorderColors);
        customBorderColorWithoutFormat(customBorderColorWithoutFormat);
        return this;
    }

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT set(VkPhysicalDeviceCustomBorderColorFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT malloc() {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT calloc() {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT create(long address) {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncustomBorderColors(long struct) {
        return MemoryUtil.memGetInt(struct + CUSTOMBORDERCOLORS);
    }

    public static int ncustomBorderColorWithoutFormat(long struct) {
        return MemoryUtil.memGetInt(struct + CUSTOMBORDERCOLORWITHOUTFORMAT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncustomBorderColors(long struct, int value) {
        MemoryUtil.memPutInt(struct + CUSTOMBORDERCOLORS, value);
    }

    public static void ncustomBorderColorWithoutFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + CUSTOMBORDERCOLORWITHOUTFORMAT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCustomBorderColorFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCustomBorderColorFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCustomBorderColorFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCustomBorderColorFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceCustomBorderColorFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCustomBorderColorFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCustomBorderColorFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCustomBorderColorFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean customBorderColors() {
            return VkPhysicalDeviceCustomBorderColorFeaturesEXT.ncustomBorderColors(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean customBorderColorWithoutFormat() {
            return VkPhysicalDeviceCustomBorderColorFeaturesEXT.ncustomBorderColorWithoutFormat(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCustomBorderColorFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTCustomBorderColor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCustomBorderColorFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer customBorderColors(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCustomBorderColorFeaturesEXT.ncustomBorderColors(address(), value ? 1 : 0);
            return this;
        }

        public Buffer customBorderColorWithoutFormat(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCustomBorderColorFeaturesEXT.ncustomBorderColorWithoutFormat(address(), value ? 1 : 0);
            return this;
        }
    }
}
