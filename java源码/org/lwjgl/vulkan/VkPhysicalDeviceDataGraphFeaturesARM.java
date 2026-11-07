package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDataGraphFeaturesARM.class */
public class VkPhysicalDeviceDataGraphFeaturesARM extends Struct<VkPhysicalDeviceDataGraphFeaturesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DATAGRAPH;
    public static final int DATAGRAPHUPDATEAFTERBIND;
    public static final int DATAGRAPHSPECIALIZATIONCONSTANTS;
    public static final int DATAGRAPHDESCRIPTORBUFFER;
    public static final int DATAGRAPHSHADERMODULE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DATAGRAPH = layout.offsetof(2);
        DATAGRAPHUPDATEAFTERBIND = layout.offsetof(3);
        DATAGRAPHSPECIALIZATIONCONSTANTS = layout.offsetof(4);
        DATAGRAPHDESCRIPTORBUFFER = layout.offsetof(5);
        DATAGRAPHSHADERMODULE = layout.offsetof(6);
    }

    protected VkPhysicalDeviceDataGraphFeaturesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDataGraphFeaturesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDataGraphFeaturesARM(address, container);
    }

    public VkPhysicalDeviceDataGraphFeaturesARM(ByteBuffer container) {
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
    public boolean dataGraph() {
        return ndataGraph(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean dataGraphUpdateAfterBind() {
        return ndataGraphUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean dataGraphSpecializationConstants() {
        return ndataGraphSpecializationConstants(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean dataGraphDescriptorBuffer() {
        return ndataGraphDescriptorBuffer(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean dataGraphShaderModule() {
        return ndataGraphShaderModule(address()) != 0;
    }

    public VkPhysicalDeviceDataGraphFeaturesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDataGraphFeaturesARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM);
    }

    public VkPhysicalDeviceDataGraphFeaturesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDataGraphFeaturesARM dataGraph(@NativeType("VkBool32") boolean value) {
        ndataGraph(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndataGraphUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphSpecializationConstants(@NativeType("VkBool32") boolean value) {
        ndataGraphSpecializationConstants(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphDescriptorBuffer(@NativeType("VkBool32") boolean value) {
        ndataGraphDescriptorBuffer(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphShaderModule(@NativeType("VkBool32") boolean value) {
        ndataGraphShaderModule(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDataGraphFeaturesARM set(int sType, long pNext, boolean dataGraph, boolean dataGraphUpdateAfterBind, boolean dataGraphSpecializationConstants, boolean dataGraphDescriptorBuffer, boolean dataGraphShaderModule) {
        sType(sType);
        pNext(pNext);
        dataGraph(dataGraph);
        dataGraphUpdateAfterBind(dataGraphUpdateAfterBind);
        dataGraphSpecializationConstants(dataGraphSpecializationConstants);
        dataGraphDescriptorBuffer(dataGraphDescriptorBuffer);
        dataGraphShaderModule(dataGraphShaderModule);
        return this;
    }

    public VkPhysicalDeviceDataGraphFeaturesARM set(VkPhysicalDeviceDataGraphFeaturesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDataGraphFeaturesARM malloc() {
        return new VkPhysicalDeviceDataGraphFeaturesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDataGraphFeaturesARM calloc() {
        return new VkPhysicalDeviceDataGraphFeaturesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDataGraphFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDataGraphFeaturesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDataGraphFeaturesARM create(long address) {
        return new VkPhysicalDeviceDataGraphFeaturesARM(address, null);
    }

    public static VkPhysicalDeviceDataGraphFeaturesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDataGraphFeaturesARM(address, null);
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

    public static VkPhysicalDeviceDataGraphFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDataGraphFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndataGraph(long struct) {
        return MemoryUtil.memGetInt(struct + DATAGRAPH);
    }

    public static int ndataGraphUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DATAGRAPHUPDATEAFTERBIND);
    }

    public static int ndataGraphSpecializationConstants(long struct) {
        return MemoryUtil.memGetInt(struct + DATAGRAPHSPECIALIZATIONCONSTANTS);
    }

    public static int ndataGraphDescriptorBuffer(long struct) {
        return MemoryUtil.memGetInt(struct + DATAGRAPHDESCRIPTORBUFFER);
    }

    public static int ndataGraphShaderModule(long struct) {
        return MemoryUtil.memGetInt(struct + DATAGRAPHSHADERMODULE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndataGraph(long struct, int value) {
        MemoryUtil.memPutInt(struct + DATAGRAPH, value);
    }

    public static void ndataGraphUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DATAGRAPHUPDATEAFTERBIND, value);
    }

    public static void ndataGraphSpecializationConstants(long struct, int value) {
        MemoryUtil.memPutInt(struct + DATAGRAPHSPECIALIZATIONCONSTANTS, value);
    }

    public static void ndataGraphDescriptorBuffer(long struct, int value) {
        MemoryUtil.memPutInt(struct + DATAGRAPHDESCRIPTORBUFFER, value);
    }

    public static void ndataGraphShaderModule(long struct, int value) {
        MemoryUtil.memPutInt(struct + DATAGRAPHSHADERMODULE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDataGraphFeaturesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDataGraphFeaturesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDataGraphFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceDataGraphFeaturesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDataGraphFeaturesARM.SIZEOF);
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
        public VkPhysicalDeviceDataGraphFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDataGraphFeaturesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDataGraphFeaturesARM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean dataGraph() {
            return VkPhysicalDeviceDataGraphFeaturesARM.ndataGraph(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean dataGraphUpdateAfterBind() {
            return VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean dataGraphSpecializationConstants() {
            return VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphSpecializationConstants(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean dataGraphDescriptorBuffer() {
            return VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphDescriptorBuffer(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean dataGraphShaderModule() {
            return VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphShaderModule(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDataGraphFeaturesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDataGraphFeaturesARM.npNext(address(), value);
            return this;
        }

        public Buffer dataGraph(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDataGraphFeaturesARM.ndataGraph(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dataGraphUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dataGraphSpecializationConstants(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphSpecializationConstants(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dataGraphDescriptorBuffer(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphDescriptorBuffer(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dataGraphShaderModule(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphShaderModule(address(), value ? 1 : 0);
            return this;
        }
    }
}
