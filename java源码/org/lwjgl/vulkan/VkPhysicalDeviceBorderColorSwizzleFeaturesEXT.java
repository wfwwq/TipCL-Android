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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.class */
public class VkPhysicalDeviceBorderColorSwizzleFeaturesEXT extends Struct<VkPhysicalDeviceBorderColorSwizzleFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BORDERCOLORSWIZZLE;
    public static final int BORDERCOLORSWIZZLEFROMIMAGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BORDERCOLORSWIZZLE = layout.offsetof(2);
        BORDERCOLORSWIZZLEFROMIMAGE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(ByteBuffer container) {
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
    public boolean borderColorSwizzle() {
        return nborderColorSwizzle(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean borderColorSwizzleFromImage() {
        return nborderColorSwizzleFromImage(address()) != 0;
    }

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sType$Default() {
        return sType(EXTBorderColorSwizzle.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT);
    }

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzle(@NativeType("VkBool32") boolean value) {
        nborderColorSwizzle(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleFromImage(@NativeType("VkBool32") boolean value) {
        nborderColorSwizzleFromImage(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT set(int sType, long pNext, boolean borderColorSwizzle, boolean borderColorSwizzleFromImage) {
        sType(sType);
        pNext(pNext);
        borderColorSwizzle(borderColorSwizzle);
        borderColorSwizzleFromImage(borderColorSwizzleFromImage);
        return this;
    }

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT set(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT malloc() {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT calloc() {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT create(long address) {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nborderColorSwizzle(long struct) {
        return MemoryUtil.memGetInt(struct + BORDERCOLORSWIZZLE);
    }

    public static int nborderColorSwizzleFromImage(long struct) {
        return MemoryUtil.memGetInt(struct + BORDERCOLORSWIZZLEFROMIMAGE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nborderColorSwizzle(long struct, int value) {
        MemoryUtil.memPutInt(struct + BORDERCOLORSWIZZLE, value);
    }

    public static void nborderColorSwizzleFromImage(long struct, int value) {
        MemoryUtil.memPutInt(struct + BORDERCOLORSWIZZLEFROMIMAGE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBorderColorSwizzleFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBorderColorSwizzleFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBorderColorSwizzleFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceBorderColorSwizzleFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean borderColorSwizzle() {
            return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nborderColorSwizzle(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean borderColorSwizzleFromImage() {
            return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nborderColorSwizzleFromImage(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTBorderColorSwizzle.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer borderColorSwizzle(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nborderColorSwizzle(address(), value ? 1 : 0);
            return this;
        }

        public Buffer borderColorSwizzleFromImage(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nborderColorSwizzleFromImage(address(), value ? 1 : 0);
            return this;
        }
    }
}
