package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.class */
public class VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT extends Struct<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICEGENERATEDCOMMANDS;
    public static final int DYNAMICGENERATEDPIPELINELAYOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEGENERATEDCOMMANDS = layout.offsetof(2);
        DYNAMICGENERATEDPIPELINELAYOUT = layout.offsetof(3);
    }

    protected VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(ByteBuffer container) {
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
    public boolean deviceGeneratedCommands() {
        return ndeviceGeneratedCommands(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean dynamicGeneratedPipelineLayout() {
        return ndynamicGeneratedPipelineLayout(address()) != 0;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT sType$Default() {
        return sType(1000572000);
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT deviceGeneratedCommands(@NativeType("VkBool32") boolean value) {
        ndeviceGeneratedCommands(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT dynamicGeneratedPipelineLayout(@NativeType("VkBool32") boolean value) {
        ndynamicGeneratedPipelineLayout(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT set(int sType, long pNext, boolean deviceGeneratedCommands, boolean dynamicGeneratedPipelineLayout) {
        sType(sType);
        pNext(pNext);
        deviceGeneratedCommands(deviceGeneratedCommands);
        dynamicGeneratedPipelineLayout(dynamicGeneratedPipelineLayout);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT set(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT malloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT calloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndeviceGeneratedCommands(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEGENERATEDCOMMANDS);
    }

    public static int ndynamicGeneratedPipelineLayout(long struct) {
        return MemoryUtil.memGetInt(struct + DYNAMICGENERATEDPIPELINELAYOUT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndeviceGeneratedCommands(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEGENERATEDCOMMANDS, value);
    }

    public static void ndynamicGeneratedPipelineLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + DYNAMICGENERATEDPIPELINELAYOUT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean deviceGeneratedCommands() {
            return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.ndeviceGeneratedCommands(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean dynamicGeneratedPipelineLayout() {
            return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.ndynamicGeneratedPipelineLayout(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000572000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer deviceGeneratedCommands(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.ndeviceGeneratedCommands(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dynamicGeneratedPipelineLayout(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.ndynamicGeneratedPipelineLayout(address(), value ? 1 : 0);
            return this;
        }
    }
}
