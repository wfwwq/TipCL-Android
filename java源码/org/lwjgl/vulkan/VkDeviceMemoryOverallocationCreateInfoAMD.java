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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryOverallocationCreateInfoAMD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryOverallocationCreateInfoAMD.class */
public class VkDeviceMemoryOverallocationCreateInfoAMD extends Struct<VkDeviceMemoryOverallocationCreateInfoAMD> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int OVERALLOCATIONBEHAVIOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OVERALLOCATIONBEHAVIOR = layout.offsetof(2);
    }

    protected VkDeviceMemoryOverallocationCreateInfoAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceMemoryOverallocationCreateInfoAMD create(long address, ByteBuffer container) {
        return new VkDeviceMemoryOverallocationCreateInfoAMD(address, container);
    }

    public VkDeviceMemoryOverallocationCreateInfoAMD(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkMemoryOverallocationBehaviorAMD")
    public int overallocationBehavior() {
        return noverallocationBehavior(address());
    }

    public VkDeviceMemoryOverallocationCreateInfoAMD sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceMemoryOverallocationCreateInfoAMD sType$Default() {
        return sType(AMDMemoryOverallocationBehavior.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD);
    }

    public VkDeviceMemoryOverallocationCreateInfoAMD pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceMemoryOverallocationCreateInfoAMD overallocationBehavior(@NativeType("VkMemoryOverallocationBehaviorAMD") int value) {
        noverallocationBehavior(address(), value);
        return this;
    }

    public VkDeviceMemoryOverallocationCreateInfoAMD set(int sType, long pNext, int overallocationBehavior) {
        sType(sType);
        pNext(pNext);
        overallocationBehavior(overallocationBehavior);
        return this;
    }

    public VkDeviceMemoryOverallocationCreateInfoAMD set(VkDeviceMemoryOverallocationCreateInfoAMD src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceMemoryOverallocationCreateInfoAMD malloc() {
        return new VkDeviceMemoryOverallocationCreateInfoAMD(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceMemoryOverallocationCreateInfoAMD calloc() {
        return new VkDeviceMemoryOverallocationCreateInfoAMD(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceMemoryOverallocationCreateInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceMemoryOverallocationCreateInfoAMD(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceMemoryOverallocationCreateInfoAMD create(long address) {
        return new VkDeviceMemoryOverallocationCreateInfoAMD(address, null);
    }

    public static VkDeviceMemoryOverallocationCreateInfoAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceMemoryOverallocationCreateInfoAMD(address, null);
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

    public static VkDeviceMemoryOverallocationCreateInfoAMD malloc(MemoryStack stack) {
        return new VkDeviceMemoryOverallocationCreateInfoAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceMemoryOverallocationCreateInfoAMD calloc(MemoryStack stack) {
        return new VkDeviceMemoryOverallocationCreateInfoAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int noverallocationBehavior(long struct) {
        return MemoryUtil.memGetInt(struct + OVERALLOCATIONBEHAVIOR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void noverallocationBehavior(long struct, int value) {
        MemoryUtil.memPutInt(struct + OVERALLOCATIONBEHAVIOR, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryOverallocationCreateInfoAMD$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryOverallocationCreateInfoAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceMemoryOverallocationCreateInfoAMD, Buffer> implements NativeResource {
        private static final VkDeviceMemoryOverallocationCreateInfoAMD ELEMENT_FACTORY = VkDeviceMemoryOverallocationCreateInfoAMD.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceMemoryOverallocationCreateInfoAMD.SIZEOF);
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
        public VkDeviceMemoryOverallocationCreateInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceMemoryOverallocationCreateInfoAMD.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceMemoryOverallocationCreateInfoAMD.npNext(address());
        }

        @NativeType("VkMemoryOverallocationBehaviorAMD")
        public int overallocationBehavior() {
            return VkDeviceMemoryOverallocationCreateInfoAMD.noverallocationBehavior(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceMemoryOverallocationCreateInfoAMD.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDMemoryOverallocationBehavior.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceMemoryOverallocationCreateInfoAMD.npNext(address(), value);
            return this;
        }

        public Buffer overallocationBehavior(@NativeType("VkMemoryOverallocationBehaviorAMD") int value) {
            VkDeviceMemoryOverallocationCreateInfoAMD.noverallocationBehavior(address(), value);
            return this;
        }
    }
}
