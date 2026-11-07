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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.class */
public class VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT extends Struct<VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERMODULEIDENTIFIER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERMODULEIDENTIFIER = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(ByteBuffer container) {
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
    public boolean shaderModuleIdentifier() {
        return nshaderModuleIdentifier(address()) != 0;
    }

    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT sType$Default() {
        return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT);
    }

    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT shaderModuleIdentifier(@NativeType("VkBool32") boolean value) {
        nshaderModuleIdentifier(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT set(int sType, long pNext, boolean shaderModuleIdentifier) {
        sType(sType);
        pNext(pNext);
        shaderModuleIdentifier(shaderModuleIdentifier);
        return this;
    }

    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT set(VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderModuleIdentifier(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERMODULEIDENTIFIER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderModuleIdentifier(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERMODULEIDENTIFIER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderModuleIdentifier() {
            return VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.nshaderModuleIdentifier(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer shaderModuleIdentifier(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.nshaderModuleIdentifier(address(), value ? 1 : 0);
            return this;
        }
    }
}
