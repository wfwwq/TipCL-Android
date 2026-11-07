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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageRobustnessFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageRobustnessFeatures.class */
public class VkPhysicalDeviceImageRobustnessFeatures extends Struct<VkPhysicalDeviceImageRobustnessFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ROBUSTIMAGEACCESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ROBUSTIMAGEACCESS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageRobustnessFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceImageRobustnessFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageRobustnessFeatures(address, container);
    }

    public VkPhysicalDeviceImageRobustnessFeatures(ByteBuffer container) {
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
    public boolean robustImageAccess() {
        return nrobustImageAccess(address()) != 0;
    }

    public VkPhysicalDeviceImageRobustnessFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageRobustnessFeatures sType$Default() {
        return sType(1000335000);
    }

    public VkPhysicalDeviceImageRobustnessFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageRobustnessFeatures robustImageAccess(@NativeType("VkBool32") boolean value) {
        nrobustImageAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceImageRobustnessFeatures set(int sType, long pNext, boolean robustImageAccess) {
        sType(sType);
        pNext(pNext);
        robustImageAccess(robustImageAccess);
        return this;
    }

    public VkPhysicalDeviceImageRobustnessFeatures set(VkPhysicalDeviceImageRobustnessFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageRobustnessFeatures malloc() {
        return new VkPhysicalDeviceImageRobustnessFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageRobustnessFeatures calloc() {
        return new VkPhysicalDeviceImageRobustnessFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageRobustnessFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageRobustnessFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageRobustnessFeatures create(long address) {
        return new VkPhysicalDeviceImageRobustnessFeatures(address, null);
    }

    public static VkPhysicalDeviceImageRobustnessFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageRobustnessFeatures(address, null);
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

    public static VkPhysicalDeviceImageRobustnessFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageRobustnessFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageRobustnessFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageRobustnessFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrobustImageAccess(long struct) {
        return MemoryUtil.memGetInt(struct + ROBUSTIMAGEACCESS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrobustImageAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + ROBUSTIMAGEACCESS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageRobustnessFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageRobustnessFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageRobustnessFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceImageRobustnessFeatures ELEMENT_FACTORY = VkPhysicalDeviceImageRobustnessFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceImageRobustnessFeatures.SIZEOF);
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
        public VkPhysicalDeviceImageRobustnessFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceImageRobustnessFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceImageRobustnessFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean robustImageAccess() {
            return VkPhysicalDeviceImageRobustnessFeatures.nrobustImageAccess(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageRobustnessFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000335000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceImageRobustnessFeatures.npNext(address(), value);
            return this;
        }

        public Buffer robustImageAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImageRobustnessFeatures.nrobustImageAccess(address(), value ? 1 : 0);
            return this;
        }
    }
}
