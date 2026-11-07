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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.class */
public class VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT extends Struct<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int GRAPHICSPIPELINELIBRARYFASTLINKING;
    public static final int GRAPHICSPIPELINELIBRARYINDEPENDENTINTERPOLATIONDECORATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GRAPHICSPIPELINELIBRARYFASTLINKING = layout.offsetof(2);
        GRAPHICSPIPELINELIBRARYINDEPENDENTINTERPOLATIONDECORATION = layout.offsetof(3);
    }

    protected VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(ByteBuffer container) {
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
    public boolean graphicsPipelineLibraryFastLinking() {
        return ngraphicsPipelineLibraryFastLinking(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean graphicsPipelineLibraryIndependentInterpolationDecoration() {
        return ngraphicsPipelineLibraryIndependentInterpolationDecoration(address()) != 0;
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sType$Default() {
        return sType(EXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT set(VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT malloc() {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT calloc() {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT create(long address) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ngraphicsPipelineLibraryFastLinking(long struct) {
        return MemoryUtil.memGetInt(struct + GRAPHICSPIPELINELIBRARYFASTLINKING);
    }

    public static int ngraphicsPipelineLibraryIndependentInterpolationDecoration(long struct) {
        return MemoryUtil.memGetInt(struct + GRAPHICSPIPELINELIBRARYINDEPENDENTINTERPOLATIONDECORATION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean graphicsPipelineLibraryFastLinking() {
            return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.ngraphicsPipelineLibraryFastLinking(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean graphicsPipelineLibraryIndependentInterpolationDecoration() {
            return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.ngraphicsPipelineLibraryIndependentInterpolationDecoration(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
