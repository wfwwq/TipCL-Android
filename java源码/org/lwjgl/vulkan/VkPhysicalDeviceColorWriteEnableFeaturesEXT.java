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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceColorWriteEnableFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceColorWriteEnableFeaturesEXT.class */
public class VkPhysicalDeviceColorWriteEnableFeaturesEXT extends Struct<VkPhysicalDeviceColorWriteEnableFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COLORWRITEENABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COLORWRITEENABLE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceColorWriteEnableFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceColorWriteEnableFeaturesEXT(ByteBuffer container) {
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
    public boolean colorWriteEnable() {
        return ncolorWriteEnable(address()) != 0;
    }

    public VkPhysicalDeviceColorWriteEnableFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceColorWriteEnableFeaturesEXT sType$Default() {
        return sType(1000381000);
    }

    public VkPhysicalDeviceColorWriteEnableFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceColorWriteEnableFeaturesEXT colorWriteEnable(@NativeType("VkBool32") boolean value) {
        ncolorWriteEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceColorWriteEnableFeaturesEXT set(int sType, long pNext, boolean colorWriteEnable) {
        sType(sType);
        pNext(pNext);
        colorWriteEnable(colorWriteEnable);
        return this;
    }

    public VkPhysicalDeviceColorWriteEnableFeaturesEXT set(VkPhysicalDeviceColorWriteEnableFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT malloc() {
        return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT calloc() {
        return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT create(long address) {
        return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncolorWriteEnable(long struct) {
        return MemoryUtil.memGetInt(struct + COLORWRITEENABLE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncolorWriteEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORWRITEENABLE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceColorWriteEnableFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceColorWriteEnableFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceColorWriteEnableFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceColorWriteEnableFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceColorWriteEnableFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceColorWriteEnableFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceColorWriteEnableFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceColorWriteEnableFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceColorWriteEnableFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean colorWriteEnable() {
            return VkPhysicalDeviceColorWriteEnableFeaturesEXT.ncolorWriteEnable(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceColorWriteEnableFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000381000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceColorWriteEnableFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer colorWriteEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceColorWriteEnableFeaturesEXT.ncolorWriteEnable(address(), value ? 1 : 0);
            return this;
        }
    }
}
