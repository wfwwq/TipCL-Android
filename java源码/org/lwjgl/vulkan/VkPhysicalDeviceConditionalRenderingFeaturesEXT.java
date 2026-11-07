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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceConditionalRenderingFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceConditionalRenderingFeaturesEXT.class */
public class VkPhysicalDeviceConditionalRenderingFeaturesEXT extends Struct<VkPhysicalDeviceConditionalRenderingFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CONDITIONALRENDERING;
    public static final int INHERITEDCONDITIONALRENDERING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONDITIONALRENDERING = layout.offsetof(2);
        INHERITEDCONDITIONALRENDERING = layout.offsetof(3);
    }

    protected VkPhysicalDeviceConditionalRenderingFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceConditionalRenderingFeaturesEXT(ByteBuffer container) {
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
    public boolean conditionalRendering() {
        return nconditionalRendering(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean inheritedConditionalRendering() {
        return ninheritedConditionalRendering(address()) != 0;
    }

    public VkPhysicalDeviceConditionalRenderingFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceConditionalRenderingFeaturesEXT sType$Default() {
        return sType(EXTConditionalRendering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT);
    }

    public VkPhysicalDeviceConditionalRenderingFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceConditionalRenderingFeaturesEXT conditionalRendering(@NativeType("VkBool32") boolean value) {
        nconditionalRendering(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceConditionalRenderingFeaturesEXT inheritedConditionalRendering(@NativeType("VkBool32") boolean value) {
        ninheritedConditionalRendering(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceConditionalRenderingFeaturesEXT set(int sType, long pNext, boolean conditionalRendering, boolean inheritedConditionalRendering) {
        sType(sType);
        pNext(pNext);
        conditionalRendering(conditionalRendering);
        inheritedConditionalRendering(inheritedConditionalRendering);
        return this;
    }

    public VkPhysicalDeviceConditionalRenderingFeaturesEXT set(VkPhysicalDeviceConditionalRenderingFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT malloc() {
        return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT calloc() {
        return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT create(long address) {
        return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nconditionalRendering(long struct) {
        return MemoryUtil.memGetInt(struct + CONDITIONALRENDERING);
    }

    public static int ninheritedConditionalRendering(long struct) {
        return MemoryUtil.memGetInt(struct + INHERITEDCONDITIONALRENDERING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nconditionalRendering(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONDITIONALRENDERING, value);
    }

    public static void ninheritedConditionalRendering(long struct, int value) {
        MemoryUtil.memPutInt(struct + INHERITEDCONDITIONALRENDERING, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceConditionalRenderingFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceConditionalRenderingFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceConditionalRenderingFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceConditionalRenderingFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceConditionalRenderingFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceConditionalRenderingFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceConditionalRenderingFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceConditionalRenderingFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceConditionalRenderingFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean conditionalRendering() {
            return VkPhysicalDeviceConditionalRenderingFeaturesEXT.nconditionalRendering(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean inheritedConditionalRendering() {
            return VkPhysicalDeviceConditionalRenderingFeaturesEXT.ninheritedConditionalRendering(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceConditionalRenderingFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTConditionalRendering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceConditionalRenderingFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer conditionalRendering(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceConditionalRenderingFeaturesEXT.nconditionalRendering(address(), value ? 1 : 0);
            return this;
        }

        public Buffer inheritedConditionalRendering(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceConditionalRenderingFeaturesEXT.ninheritedConditionalRendering(address(), value ? 1 : 0);
            return this;
        }
    }
}
