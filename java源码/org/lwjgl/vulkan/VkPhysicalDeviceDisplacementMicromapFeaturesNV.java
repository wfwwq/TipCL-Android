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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDisplacementMicromapFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDisplacementMicromapFeaturesNV.class */
public class VkPhysicalDeviceDisplacementMicromapFeaturesNV extends Struct<VkPhysicalDeviceDisplacementMicromapFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DISPLACEMENTMICROMAP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISPLACEMENTMICROMAP = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDisplacementMicromapFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(address, container);
    }

    public VkPhysicalDeviceDisplacementMicromapFeaturesNV(ByteBuffer container) {
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
    public boolean displacementMicromap() {
        return ndisplacementMicromap(address()) != 0;
    }

    public VkPhysicalDeviceDisplacementMicromapFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDisplacementMicromapFeaturesNV sType$Default() {
        return sType(1000397000);
    }

    public VkPhysicalDeviceDisplacementMicromapFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDisplacementMicromapFeaturesNV displacementMicromap(@NativeType("VkBool32") boolean value) {
        ndisplacementMicromap(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDisplacementMicromapFeaturesNV set(int sType, long pNext, boolean displacementMicromap) {
        sType(sType);
        pNext(pNext);
        displacementMicromap(displacementMicromap);
        return this;
    }

    public VkPhysicalDeviceDisplacementMicromapFeaturesNV set(VkPhysicalDeviceDisplacementMicromapFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV malloc() {
        return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV calloc() {
        return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV create(long address) {
        return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(address, null);
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

    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndisplacementMicromap(long struct) {
        return MemoryUtil.memGetInt(struct + DISPLACEMENTMICROMAP);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndisplacementMicromap(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISPLACEMENTMICROMAP, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDisplacementMicromapFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDisplacementMicromapFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDisplacementMicromapFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDisplacementMicromapFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceDisplacementMicromapFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDisplacementMicromapFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceDisplacementMicromapFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDisplacementMicromapFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDisplacementMicromapFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean displacementMicromap() {
            return VkPhysicalDeviceDisplacementMicromapFeaturesNV.ndisplacementMicromap(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDisplacementMicromapFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000397000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDisplacementMicromapFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer displacementMicromap(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDisplacementMicromapFeaturesNV.ndisplacementMicromap(address(), value ? 1 : 0);
            return this;
        }
    }
}
