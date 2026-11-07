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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.class */
public class VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT extends Struct<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int YCBCR2PLANE444FORMATS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        YCBCR2PLANE444FORMATS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(ByteBuffer container) {
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
    public boolean ycbcr2plane444Formats() {
        return nycbcr2plane444Formats(address()) != 0;
    }

    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT sType$Default() {
        return sType(1000330000);
    }

    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ycbcr2plane444Formats(@NativeType("VkBool32") boolean value) {
        nycbcr2plane444Formats(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT set(int sType, long pNext, boolean ycbcr2plane444Formats) {
        sType(sType);
        pNext(pNext);
        ycbcr2plane444Formats(ycbcr2plane444Formats);
        return this;
    }

    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT set(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT malloc() {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT calloc() {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT create(long address) {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nycbcr2plane444Formats(long struct) {
        return MemoryUtil.memGetInt(struct + YCBCR2PLANE444FORMATS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nycbcr2plane444Formats(long struct, int value) {
        MemoryUtil.memPutInt(struct + YCBCR2PLANE444FORMATS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean ycbcr2plane444Formats() {
            return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.nycbcr2plane444Formats(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000330000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer ycbcr2plane444Formats(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.nycbcr2plane444Formats(address(), value ? 1 : 0);
            return this;
        }
    }
}
