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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeatures.class */
public class VkPhysicalDeviceBufferDeviceAddressFeatures extends Struct<VkPhysicalDeviceBufferDeviceAddressFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BUFFERDEVICEADDRESS;
    public static final int BUFFERDEVICEADDRESSCAPTUREREPLAY;
    public static final int BUFFERDEVICEADDRESSMULTIDEVICE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFERDEVICEADDRESS = layout.offsetof(2);
        BUFFERDEVICEADDRESSCAPTUREREPLAY = layout.offsetof(3);
        BUFFERDEVICEADDRESSMULTIDEVICE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceBufferDeviceAddressFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceBufferDeviceAddressFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(address, container);
    }

    public VkPhysicalDeviceBufferDeviceAddressFeatures(ByteBuffer container) {
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
    public boolean bufferDeviceAddress() {
        return nbufferDeviceAddress(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean bufferDeviceAddressCaptureReplay() {
        return nbufferDeviceAddressCaptureReplay(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean bufferDeviceAddressMultiDevice() {
        return nbufferDeviceAddressMultiDevice(address()) != 0;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeatures sType$Default() {
        return sType(1000257000);
    }

    public VkPhysicalDeviceBufferDeviceAddressFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddress(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddress(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeatures set(int sType, long pNext, boolean bufferDeviceAddress, boolean bufferDeviceAddressCaptureReplay, boolean bufferDeviceAddressMultiDevice) {
        sType(sType);
        pNext(pNext);
        bufferDeviceAddress(bufferDeviceAddress);
        bufferDeviceAddressCaptureReplay(bufferDeviceAddressCaptureReplay);
        bufferDeviceAddressMultiDevice(bufferDeviceAddressMultiDevice);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeatures set(VkPhysicalDeviceBufferDeviceAddressFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeatures malloc() {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeatures calloc() {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeatures create(long address) {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(address, null);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(address, null);
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

    public static VkPhysicalDeviceBufferDeviceAddressFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nbufferDeviceAddress(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERDEVICEADDRESS);
    }

    public static int nbufferDeviceAddressCaptureReplay(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERDEVICEADDRESSCAPTUREREPLAY);
    }

    public static int nbufferDeviceAddressMultiDevice(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERDEVICEADDRESSMULTIDEVICE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nbufferDeviceAddress(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUFFERDEVICEADDRESS, value);
    }

    public static void nbufferDeviceAddressCaptureReplay(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUFFERDEVICEADDRESSCAPTUREREPLAY, value);
    }

    public static void nbufferDeviceAddressMultiDevice(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUFFERDEVICEADDRESSMULTIDEVICE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBufferDeviceAddressFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceBufferDeviceAddressFeatures ELEMENT_FACTORY = VkPhysicalDeviceBufferDeviceAddressFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceBufferDeviceAddressFeatures.SIZEOF);
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
        public VkPhysicalDeviceBufferDeviceAddressFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceBufferDeviceAddressFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceBufferDeviceAddressFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean bufferDeviceAddress() {
            return VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddress(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean bufferDeviceAddressCaptureReplay() {
            return VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddressCaptureReplay(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean bufferDeviceAddressMultiDevice() {
            return VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddressMultiDevice(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceBufferDeviceAddressFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000257000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceBufferDeviceAddressFeatures.npNext(address(), value);
            return this;
        }

        public Buffer bufferDeviceAddress(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddress(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0);
            return this;
        }
    }
}
