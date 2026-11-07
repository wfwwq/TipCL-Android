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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.class */
public class VkPhysicalDeviceBufferDeviceAddressFeaturesEXT extends Struct<VkPhysicalDeviceBufferDeviceAddressFeaturesEXT> implements NativeResource {
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

    protected VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(ByteBuffer container) {
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

    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT sType$Default() {
        return sType(1000244000);
    }

    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddress(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddress(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT set(int sType, long pNext, boolean bufferDeviceAddress, boolean bufferDeviceAddressCaptureReplay, boolean bufferDeviceAddressMultiDevice) {
        sType(sType);
        pNext(pNext);
        bufferDeviceAddress(bufferDeviceAddress);
        bufferDeviceAddressCaptureReplay(bufferDeviceAddressCaptureReplay);
        bufferDeviceAddressMultiDevice(bufferDeviceAddressMultiDevice);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT set(VkPhysicalDeviceBufferDeviceAddressFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT malloc() {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT calloc() {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT create(long address) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBufferDeviceAddressFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceBufferDeviceAddressFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean bufferDeviceAddress() {
            return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nbufferDeviceAddress(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean bufferDeviceAddressCaptureReplay() {
            return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nbufferDeviceAddressCaptureReplay(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean bufferDeviceAddressMultiDevice() {
            return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nbufferDeviceAddressMultiDevice(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000244000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer bufferDeviceAddress(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nbufferDeviceAddress(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0);
            return this;
        }
    }
}
