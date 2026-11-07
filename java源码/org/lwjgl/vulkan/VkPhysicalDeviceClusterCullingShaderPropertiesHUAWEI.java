package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.class */
public class VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI extends Struct<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXWORKGROUPCOUNT;
    public static final int MAXWORKGROUPSIZE;
    public static final int MAXOUTPUTCLUSTERCOUNT;
    public static final int INDIRECTBUFFEROFFSETALIGNMENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __array(4, 3), __array(4, 3), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXWORKGROUPCOUNT = layout.offsetof(2);
        MAXWORKGROUPSIZE = layout.offsetof(3);
        MAXOUTPUTCLUSTERCOUNT = layout.offsetof(4);
        INDIRECTBUFFEROFFSETALIGNMENT = layout.offsetof(5);
    }

    protected VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(address, container);
    }

    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(ByteBuffer container) {
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

    @NativeType("uint32_t[3]")
    public IntBuffer maxWorkGroupCount() {
        return nmaxWorkGroupCount(address());
    }

    @NativeType("uint32_t")
    public int maxWorkGroupCount(int index) {
        return nmaxWorkGroupCount(address(), index);
    }

    @NativeType("uint32_t[3]")
    public IntBuffer maxWorkGroupSize() {
        return nmaxWorkGroupSize(address());
    }

    @NativeType("uint32_t")
    public int maxWorkGroupSize(int index) {
        return nmaxWorkGroupSize(address(), index);
    }

    @NativeType("uint32_t")
    public int maxOutputClusterCount() {
        return nmaxOutputClusterCount(address());
    }

    @NativeType("VkDeviceSize")
    public long indirectBufferOffsetAlignment() {
        return nindirectBufferOffsetAlignment(address());
    }

    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI sType$Default() {
        return sType(HUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI);
    }

    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI set(VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI malloc() {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI calloc() {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI create(long address) {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(address, null);
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(address, null);
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

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI malloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI calloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static IntBuffer nmaxWorkGroupCount(long struct) {
        return MemoryUtil.memIntBuffer(struct + MAXWORKGROUPCOUNT, 3);
    }

    public static int nmaxWorkGroupCount(long struct, int index) {
        return MemoryUtil.memGetInt(struct + MAXWORKGROUPCOUNT + (Checks.check(index, 3) * 4));
    }

    public static IntBuffer nmaxWorkGroupSize(long struct) {
        return MemoryUtil.memIntBuffer(struct + MAXWORKGROUPSIZE, 3);
    }

    public static int nmaxWorkGroupSize(long struct, int index) {
        return MemoryUtil.memGetInt(struct + MAXWORKGROUPSIZE + (Checks.check(index, 3) * 4));
    }

    public static int nmaxOutputClusterCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXOUTPUTCLUSTERCOUNT);
    }

    public static long nindirectBufferOffsetAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + INDIRECTBUFFEROFFSETALIGNMENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.SIZEOF);
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
        public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.npNext(address());
        }

        @NativeType("uint32_t[3]")
        public IntBuffer maxWorkGroupCount() {
            return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nmaxWorkGroupCount(address());
        }

        @NativeType("uint32_t")
        public int maxWorkGroupCount(int index) {
            return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nmaxWorkGroupCount(address(), index);
        }

        @NativeType("uint32_t[3]")
        public IntBuffer maxWorkGroupSize() {
            return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nmaxWorkGroupSize(address());
        }

        @NativeType("uint32_t")
        public int maxWorkGroupSize(int index) {
            return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nmaxWorkGroupSize(address(), index);
        }

        @NativeType("uint32_t")
        public int maxOutputClusterCount() {
            return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nmaxOutputClusterCount(address());
        }

        @NativeType("VkDeviceSize")
        public long indirectBufferOffsetAlignment() {
            return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nindirectBufferOffsetAlignment(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(HUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.npNext(address(), value);
            return this;
        }
    }
}
