package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCustomBorderColorCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCustomBorderColorCreateInfoEXT.class */
public class VkSamplerCustomBorderColorCreateInfoEXT extends Struct<VkSamplerCustomBorderColorCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CUSTOMBORDERCOLOR;
    public static final int FORMAT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkClearColorValue.SIZEOF, VkClearColorValue.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CUSTOMBORDERCOLOR = layout.offsetof(2);
        FORMAT = layout.offsetof(3);
    }

    protected VkSamplerCustomBorderColorCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSamplerCustomBorderColorCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkSamplerCustomBorderColorCreateInfoEXT(address, container);
    }

    public VkSamplerCustomBorderColorCreateInfoEXT(ByteBuffer container) {
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

    public VkClearColorValue customBorderColor() {
        return ncustomBorderColor(address());
    }

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    public VkSamplerCustomBorderColorCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSamplerCustomBorderColorCreateInfoEXT sType$Default() {
        return sType(EXTCustomBorderColor.VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT);
    }

    public VkSamplerCustomBorderColorCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor(VkClearColorValue value) {
        ncustomBorderColor(address(), value);
        return this;
    }

    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor(Consumer<VkClearColorValue> consumer) {
        consumer.accept(customBorderColor());
        return this;
    }

    public VkSamplerCustomBorderColorCreateInfoEXT format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkSamplerCustomBorderColorCreateInfoEXT set(int sType, long pNext, VkClearColorValue customBorderColor, int format) {
        sType(sType);
        pNext(pNext);
        customBorderColor(customBorderColor);
        format(format);
        return this;
    }

    public VkSamplerCustomBorderColorCreateInfoEXT set(VkSamplerCustomBorderColorCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerCustomBorderColorCreateInfoEXT malloc() {
        return new VkSamplerCustomBorderColorCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerCustomBorderColorCreateInfoEXT calloc() {
        return new VkSamplerCustomBorderColorCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerCustomBorderColorCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerCustomBorderColorCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerCustomBorderColorCreateInfoEXT create(long address) {
        return new VkSamplerCustomBorderColorCreateInfoEXT(address, null);
    }

    public static VkSamplerCustomBorderColorCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerCustomBorderColorCreateInfoEXT(address, null);
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

    public static VkSamplerCustomBorderColorCreateInfoEXT malloc(MemoryStack stack) {
        return new VkSamplerCustomBorderColorCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerCustomBorderColorCreateInfoEXT calloc(MemoryStack stack) {
        return new VkSamplerCustomBorderColorCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkClearColorValue ncustomBorderColor(long struct) {
        return VkClearColorValue.create(struct + CUSTOMBORDERCOLOR);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncustomBorderColor(long struct, VkClearColorValue value) {
        MemoryUtil.memCopy(value.address(), struct + CUSTOMBORDERCOLOR, VkClearColorValue.SIZEOF);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCustomBorderColorCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCustomBorderColorCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSamplerCustomBorderColorCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkSamplerCustomBorderColorCreateInfoEXT ELEMENT_FACTORY = VkSamplerCustomBorderColorCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSamplerCustomBorderColorCreateInfoEXT.SIZEOF);
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
        public VkSamplerCustomBorderColorCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSamplerCustomBorderColorCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSamplerCustomBorderColorCreateInfoEXT.npNext(address());
        }

        public VkClearColorValue customBorderColor() {
            return VkSamplerCustomBorderColorCreateInfoEXT.ncustomBorderColor(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkSamplerCustomBorderColorCreateInfoEXT.nformat(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerCustomBorderColorCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTCustomBorderColor.VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSamplerCustomBorderColorCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer customBorderColor(VkClearColorValue value) {
            VkSamplerCustomBorderColorCreateInfoEXT.ncustomBorderColor(address(), value);
            return this;
        }

        public Buffer customBorderColor(Consumer<VkClearColorValue> consumer) {
            consumer.accept(customBorderColor());
            return this;
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkSamplerCustomBorderColorCreateInfoEXT.nformat(address(), value);
            return this;
        }
    }
}
