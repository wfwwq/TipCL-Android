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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerBorderColorComponentMappingCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerBorderColorComponentMappingCreateInfoEXT.class */
public class VkSamplerBorderColorComponentMappingCreateInfoEXT extends Struct<VkSamplerBorderColorComponentMappingCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COMPONENTS;
    public static final int SRGB;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPONENTS = layout.offsetof(2);
        SRGB = layout.offsetof(3);
    }

    protected VkSamplerBorderColorComponentMappingCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSamplerBorderColorComponentMappingCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(address, container);
    }

    public VkSamplerBorderColorComponentMappingCreateInfoEXT(ByteBuffer container) {
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

    public VkComponentMapping components() {
        return ncomponents(address());
    }

    @NativeType("VkBool32")
    public boolean srgb() {
        return nsrgb(address()) != 0;
    }

    public VkSamplerBorderColorComponentMappingCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSamplerBorderColorComponentMappingCreateInfoEXT sType$Default() {
        return sType(EXTBorderColorSwizzle.VK_STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT);
    }

    public VkSamplerBorderColorComponentMappingCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSamplerBorderColorComponentMappingCreateInfoEXT components(VkComponentMapping value) {
        ncomponents(address(), value);
        return this;
    }

    public VkSamplerBorderColorComponentMappingCreateInfoEXT components(Consumer<VkComponentMapping> consumer) {
        consumer.accept(components());
        return this;
    }

    public VkSamplerBorderColorComponentMappingCreateInfoEXT srgb(@NativeType("VkBool32") boolean value) {
        nsrgb(address(), value ? 1 : 0);
        return this;
    }

    public VkSamplerBorderColorComponentMappingCreateInfoEXT set(int sType, long pNext, VkComponentMapping components, boolean srgb) {
        sType(sType);
        pNext(pNext);
        components(components);
        srgb(srgb);
        return this;
    }

    public VkSamplerBorderColorComponentMappingCreateInfoEXT set(VkSamplerBorderColorComponentMappingCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT malloc() {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT calloc() {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT create(long address) {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(address, null);
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(address, null);
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

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT malloc(MemoryStack stack) {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT calloc(MemoryStack stack) {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkComponentMapping ncomponents(long struct) {
        return VkComponentMapping.create(struct + COMPONENTS);
    }

    public static int nsrgb(long struct) {
        return MemoryUtil.memGetInt(struct + SRGB);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncomponents(long struct, VkComponentMapping value) {
        MemoryUtil.memCopy(value.address(), struct + COMPONENTS, VkComponentMapping.SIZEOF);
    }

    public static void nsrgb(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRGB, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSamplerBorderColorComponentMappingCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkSamplerBorderColorComponentMappingCreateInfoEXT ELEMENT_FACTORY = VkSamplerBorderColorComponentMappingCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF);
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
        public VkSamplerBorderColorComponentMappingCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSamplerBorderColorComponentMappingCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSamplerBorderColorComponentMappingCreateInfoEXT.npNext(address());
        }

        public VkComponentMapping components() {
            return VkSamplerBorderColorComponentMappingCreateInfoEXT.ncomponents(address());
        }

        @NativeType("VkBool32")
        public boolean srgb() {
            return VkSamplerBorderColorComponentMappingCreateInfoEXT.nsrgb(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerBorderColorComponentMappingCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTBorderColorSwizzle.VK_STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSamplerBorderColorComponentMappingCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer components(VkComponentMapping value) {
            VkSamplerBorderColorComponentMappingCreateInfoEXT.ncomponents(address(), value);
            return this;
        }

        public Buffer components(Consumer<VkComponentMapping> consumer) {
            consumer.accept(components());
            return this;
        }

        public Buffer srgb(@NativeType("VkBool32") boolean value) {
            VkSamplerBorderColorComponentMappingCreateInfoEXT.nsrgb(address(), value ? 1 : 0);
            return this;
        }
    }
}
