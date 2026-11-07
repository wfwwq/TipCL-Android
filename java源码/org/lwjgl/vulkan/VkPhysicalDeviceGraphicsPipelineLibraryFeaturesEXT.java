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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.class */
public class VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT extends Struct<VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int GRAPHICSPIPELINELIBRARY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GRAPHICSPIPELINELIBRARY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(ByteBuffer container) {
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
    public boolean graphicsPipelineLibrary() {
        return ngraphicsPipelineLibrary(address()) != 0;
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT sType$Default() {
        return sType(EXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT);
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT graphicsPipelineLibrary(@NativeType("VkBool32") boolean value) {
        ngraphicsPipelineLibrary(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT set(int sType, long pNext, boolean graphicsPipelineLibrary) {
        sType(sType);
        pNext(pNext);
        graphicsPipelineLibrary(graphicsPipelineLibrary);
        return this;
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT set(VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT malloc() {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT calloc() {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT create(long address) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ngraphicsPipelineLibrary(long struct) {
        return MemoryUtil.memGetInt(struct + GRAPHICSPIPELINELIBRARY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ngraphicsPipelineLibrary(long struct, int value) {
        MemoryUtil.memPutInt(struct + GRAPHICSPIPELINELIBRARY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean graphicsPipelineLibrary() {
            return VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.ngraphicsPipelineLibrary(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer graphicsPipelineLibrary(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.ngraphicsPipelineLibrary(address(), value ? 1 : 0);
            return this;
        }
    }
}
