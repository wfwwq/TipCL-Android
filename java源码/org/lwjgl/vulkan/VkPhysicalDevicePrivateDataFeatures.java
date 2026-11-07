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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePrivateDataFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePrivateDataFeatures.class */
public class VkPhysicalDevicePrivateDataFeatures extends Struct<VkPhysicalDevicePrivateDataFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRIVATEDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRIVATEDATA = layout.offsetof(2);
    }

    protected VkPhysicalDevicePrivateDataFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePrivateDataFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePrivateDataFeatures(address, container);
    }

    public VkPhysicalDevicePrivateDataFeatures(ByteBuffer container) {
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
    public boolean privateData() {
        return nprivateData(address()) != 0;
    }

    public VkPhysicalDevicePrivateDataFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePrivateDataFeatures sType$Default() {
        return sType(1000295000);
    }

    public VkPhysicalDevicePrivateDataFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePrivateDataFeatures privateData(@NativeType("VkBool32") boolean value) {
        nprivateData(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePrivateDataFeatures set(int sType, long pNext, boolean privateData) {
        sType(sType);
        pNext(pNext);
        privateData(privateData);
        return this;
    }

    public VkPhysicalDevicePrivateDataFeatures set(VkPhysicalDevicePrivateDataFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePrivateDataFeatures malloc() {
        return new VkPhysicalDevicePrivateDataFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePrivateDataFeatures calloc() {
        return new VkPhysicalDevicePrivateDataFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePrivateDataFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePrivateDataFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePrivateDataFeatures create(long address) {
        return new VkPhysicalDevicePrivateDataFeatures(address, null);
    }

    public static VkPhysicalDevicePrivateDataFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePrivateDataFeatures(address, null);
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

    public static VkPhysicalDevicePrivateDataFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDevicePrivateDataFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePrivateDataFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDevicePrivateDataFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nprivateData(long struct) {
        return MemoryUtil.memGetInt(struct + PRIVATEDATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nprivateData(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIVATEDATA, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePrivateDataFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePrivateDataFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePrivateDataFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePrivateDataFeatures ELEMENT_FACTORY = VkPhysicalDevicePrivateDataFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePrivateDataFeatures.SIZEOF);
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
        public VkPhysicalDevicePrivateDataFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePrivateDataFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePrivateDataFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean privateData() {
            return VkPhysicalDevicePrivateDataFeatures.nprivateData(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePrivateDataFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000295000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePrivateDataFeatures.npNext(address(), value);
            return this;
        }

        public Buffer privateData(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePrivateDataFeatures.nprivateData(address(), value ? 1 : 0);
            return this;
        }
    }
}
