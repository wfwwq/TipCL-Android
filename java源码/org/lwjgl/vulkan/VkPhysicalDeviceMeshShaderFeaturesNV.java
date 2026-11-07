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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderFeaturesNV.class */
public class VkPhysicalDeviceMeshShaderFeaturesNV extends Struct<VkPhysicalDeviceMeshShaderFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TASKSHADER;
    public static final int MESHSHADER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TASKSHADER = layout.offsetof(2);
        MESHSHADER = layout.offsetof(3);
    }

    protected VkPhysicalDeviceMeshShaderFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMeshShaderFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMeshShaderFeaturesNV(address, container);
    }

    public VkPhysicalDeviceMeshShaderFeaturesNV(ByteBuffer container) {
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
    public boolean taskShader() {
        return ntaskShader(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean meshShader() {
        return nmeshShader(address()) != 0;
    }

    public VkPhysicalDeviceMeshShaderFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesNV sType$Default() {
        return sType(NVMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV);
    }

    public VkPhysicalDeviceMeshShaderFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesNV taskShader(@NativeType("VkBool32") boolean value) {
        ntaskShader(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesNV meshShader(@NativeType("VkBool32") boolean value) {
        nmeshShader(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesNV set(int sType, long pNext, boolean taskShader, boolean meshShader) {
        sType(sType);
        pNext(pNext);
        taskShader(taskShader);
        meshShader(meshShader);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesNV set(VkPhysicalDeviceMeshShaderFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMeshShaderFeaturesNV malloc() {
        return new VkPhysicalDeviceMeshShaderFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMeshShaderFeaturesNV calloc() {
        return new VkPhysicalDeviceMeshShaderFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMeshShaderFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMeshShaderFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMeshShaderFeaturesNV create(long address) {
        return new VkPhysicalDeviceMeshShaderFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceMeshShaderFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMeshShaderFeaturesNV(address, null);
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

    public static VkPhysicalDeviceMeshShaderFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMeshShaderFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMeshShaderFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMeshShaderFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntaskShader(long struct) {
        return MemoryUtil.memGetInt(struct + TASKSHADER);
    }

    public static int nmeshShader(long struct) {
        return MemoryUtil.memGetInt(struct + MESHSHADER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntaskShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + TASKSHADER, value);
    }

    public static void nmeshShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + MESHSHADER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMeshShaderFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMeshShaderFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceMeshShaderFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMeshShaderFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceMeshShaderFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMeshShaderFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMeshShaderFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean taskShader() {
            return VkPhysicalDeviceMeshShaderFeaturesNV.ntaskShader(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean meshShader() {
            return VkPhysicalDeviceMeshShaderFeaturesNV.nmeshShader(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMeshShaderFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMeshShaderFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer taskShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMeshShaderFeaturesNV.ntaskShader(address(), value ? 1 : 0);
            return this;
        }

        public Buffer meshShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMeshShaderFeaturesNV.nmeshShader(address(), value ? 1 : 0);
            return this;
        }
    }
}
