package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.class */
public class VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR extends Struct<VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERRELAXEDEXTENDEDINSTRUCTION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERRELAXEDEXTENDEDINSTRUCTION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(ByteBuffer container) {
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
    public boolean shaderRelaxedExtendedInstruction() {
        return nshaderRelaxedExtendedInstruction(address()) != 0;
    }

    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR sType$Default() {
        return sType(KHRShaderRelaxedExtendedInstruction.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_RELAXED_EXTENDED_INSTRUCTION_FEATURES_KHR);
    }

    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR shaderRelaxedExtendedInstruction(@NativeType("VkBool32") boolean value) {
        nshaderRelaxedExtendedInstruction(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR set(int sType, long pNext, boolean shaderRelaxedExtendedInstruction) {
        sType(sType);
        pNext(pNext);
        shaderRelaxedExtendedInstruction(shaderRelaxedExtendedInstruction);
        return this;
    }

    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR set(VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderRelaxedExtendedInstruction(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERRELAXEDEXTENDEDINSTRUCTION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderRelaxedExtendedInstruction(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERRELAXEDEXTENDEDINSTRUCTION, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderRelaxedExtendedInstruction() {
            return VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.nshaderRelaxedExtendedInstruction(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRShaderRelaxedExtendedInstruction.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_RELAXED_EXTENDED_INSTRUCTION_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer shaderRelaxedExtendedInstruction(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.nshaderRelaxedExtendedInstruction(address(), value ? 1 : 0);
            return this;
        }
    }
}
