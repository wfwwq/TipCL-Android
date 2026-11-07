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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpticalFlowFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpticalFlowFeaturesNV.class */
public class VkPhysicalDeviceOpticalFlowFeaturesNV extends Struct<VkPhysicalDeviceOpticalFlowFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int OPTICALFLOW;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OPTICALFLOW = layout.offsetof(2);
    }

    protected VkPhysicalDeviceOpticalFlowFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceOpticalFlowFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(address, container);
    }

    public VkPhysicalDeviceOpticalFlowFeaturesNV(ByteBuffer container) {
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
    public boolean opticalFlow() {
        return nopticalFlow(address()) != 0;
    }

    public VkPhysicalDeviceOpticalFlowFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceOpticalFlowFeaturesNV sType$Default() {
        return sType(1000464000);
    }

    public VkPhysicalDeviceOpticalFlowFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceOpticalFlowFeaturesNV opticalFlow(@NativeType("VkBool32") boolean value) {
        nopticalFlow(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceOpticalFlowFeaturesNV set(int sType, long pNext, boolean opticalFlow) {
        sType(sType);
        pNext(pNext);
        opticalFlow(opticalFlow);
        return this;
    }

    public VkPhysicalDeviceOpticalFlowFeaturesNV set(VkPhysicalDeviceOpticalFlowFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceOpticalFlowFeaturesNV malloc() {
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceOpticalFlowFeaturesNV calloc() {
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceOpticalFlowFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceOpticalFlowFeaturesNV create(long address) {
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceOpticalFlowFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(address, null);
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

    public static VkPhysicalDeviceOpticalFlowFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceOpticalFlowFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nopticalFlow(long struct) {
        return MemoryUtil.memGetInt(struct + OPTICALFLOW);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nopticalFlow(long struct, int value) {
        MemoryUtil.memPutInt(struct + OPTICALFLOW, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpticalFlowFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpticalFlowFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceOpticalFlowFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceOpticalFlowFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceOpticalFlowFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceOpticalFlowFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceOpticalFlowFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceOpticalFlowFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceOpticalFlowFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean opticalFlow() {
            return VkPhysicalDeviceOpticalFlowFeaturesNV.nopticalFlow(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceOpticalFlowFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000464000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceOpticalFlowFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer opticalFlow(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceOpticalFlowFeaturesNV.nopticalFlow(address(), value ? 1 : 0);
            return this;
        }
    }
}
