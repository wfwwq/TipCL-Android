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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.class */
public class VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR extends Struct<VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERSUBGROUPUNIFORMCONTROLFLOW;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERSUBGROUPUNIFORMCONTROLFLOW = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(ByteBuffer container) {
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
    public boolean shaderSubgroupUniformControlFlow() {
        return nshaderSubgroupUniformControlFlow(address()) != 0;
    }

    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR sType$Default() {
        return sType(KHRShaderSubgroupUniformControlFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR);
    }

    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR shaderSubgroupUniformControlFlow(@NativeType("VkBool32") boolean value) {
        nshaderSubgroupUniformControlFlow(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR set(int sType, long pNext, boolean shaderSubgroupUniformControlFlow) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupUniformControlFlow(shaderSubgroupUniformControlFlow);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR set(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderSubgroupUniformControlFlow(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSUBGROUPUNIFORMCONTROLFLOW);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderSubgroupUniformControlFlow(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSUBGROUPUNIFORMCONTROLFLOW, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderSubgroupUniformControlFlow() {
            return VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.nshaderSubgroupUniformControlFlow(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRShaderSubgroupUniformControlFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer shaderSubgroupUniformControlFlow(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.nshaderSubgroupUniformControlFlow(address(), value ? 1 : 0);
            return this;
        }
    }
}
