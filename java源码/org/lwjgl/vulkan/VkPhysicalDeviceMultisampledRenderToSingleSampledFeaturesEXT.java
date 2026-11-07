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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.class */
public class VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT extends Struct<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MULTISAMPLEDRENDERTOSINGLESAMPLED;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MULTISAMPLEDRENDERTOSINGLESAMPLED = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(ByteBuffer container) {
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
    public boolean multisampledRenderToSingleSampled() {
        return nmultisampledRenderToSingleSampled(address()) != 0;
    }

    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT sType$Default() {
        return sType(EXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT);
    }

    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT multisampledRenderToSingleSampled(@NativeType("VkBool32") boolean value) {
        nmultisampledRenderToSingleSampled(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT set(int sType, long pNext, boolean multisampledRenderToSingleSampled) {
        sType(sType);
        pNext(pNext);
        multisampledRenderToSingleSampled(multisampledRenderToSingleSampled);
        return this;
    }

    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT set(VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT malloc() {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT calloc() {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmultisampledRenderToSingleSampled(long struct) {
        return MemoryUtil.memGetInt(struct + MULTISAMPLEDRENDERTOSINGLESAMPLED);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmultisampledRenderToSingleSampled(long struct, int value) {
        MemoryUtil.memPutInt(struct + MULTISAMPLEDRENDERTOSINGLESAMPLED, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean multisampledRenderToSingleSampled() {
            return VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.nmultisampledRenderToSingleSampled(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer multisampledRenderToSingleSampled(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.nmultisampledRenderToSingleSampled(address(), value ? 1 : 0);
            return this;
        }
    }
}
