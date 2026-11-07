package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRobustness2FeaturesKHR.class */
public class VkPhysicalDeviceRobustness2FeaturesKHR extends Struct<VkPhysicalDeviceRobustness2FeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ROBUSTBUFFERACCESS2;
    public static final int ROBUSTIMAGEACCESS2;
    public static final int NULLDESCRIPTOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ROBUSTBUFFERACCESS2 = layout.offsetof(2);
        ROBUSTIMAGEACCESS2 = layout.offsetof(3);
        NULLDESCRIPTOR = layout.offsetof(4);
    }

    protected VkPhysicalDeviceRobustness2FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRobustness2FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRobustness2FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceRobustness2FeaturesKHR(ByteBuffer container) {
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
    public boolean robustBufferAccess2() {
        return nrobustBufferAccess2(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean robustImageAccess2() {
        return nrobustImageAccess2(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean nullDescriptor() {
        return nnullDescriptor(address()) != 0;
    }

    public VkPhysicalDeviceRobustness2FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRobustness2FeaturesKHR sType$Default() {
        return sType(1000286000);
    }

    public VkPhysicalDeviceRobustness2FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRobustness2FeaturesKHR robustBufferAccess2(@NativeType("VkBool32") boolean value) {
        nrobustBufferAccess2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRobustness2FeaturesKHR robustImageAccess2(@NativeType("VkBool32") boolean value) {
        nrobustImageAccess2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRobustness2FeaturesKHR nullDescriptor(@NativeType("VkBool32") boolean value) {
        nnullDescriptor(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRobustness2FeaturesKHR set(int sType, long pNext, boolean robustBufferAccess2, boolean robustImageAccess2, boolean nullDescriptor) {
        sType(sType);
        pNext(pNext);
        robustBufferAccess2(robustBufferAccess2);
        robustImageAccess2(robustImageAccess2);
        nullDescriptor(nullDescriptor);
        return this;
    }

    public VkPhysicalDeviceRobustness2FeaturesKHR set(VkPhysicalDeviceRobustness2FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRobustness2FeaturesKHR malloc() {
        return new VkPhysicalDeviceRobustness2FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRobustness2FeaturesKHR calloc() {
        return new VkPhysicalDeviceRobustness2FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRobustness2FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRobustness2FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRobustness2FeaturesKHR create(long address) {
        return new VkPhysicalDeviceRobustness2FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceRobustness2FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRobustness2FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceRobustness2FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRobustness2FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRobustness2FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRobustness2FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrobustBufferAccess2(long struct) {
        return MemoryUtil.memGetInt(struct + ROBUSTBUFFERACCESS2);
    }

    public static int nrobustImageAccess2(long struct) {
        return MemoryUtil.memGetInt(struct + ROBUSTIMAGEACCESS2);
    }

    public static int nnullDescriptor(long struct) {
        return MemoryUtil.memGetInt(struct + NULLDESCRIPTOR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrobustBufferAccess2(long struct, int value) {
        MemoryUtil.memPutInt(struct + ROBUSTBUFFERACCESS2, value);
    }

    public static void nrobustImageAccess2(long struct, int value) {
        MemoryUtil.memPutInt(struct + ROBUSTIMAGEACCESS2, value);
    }

    public static void nnullDescriptor(long struct, int value) {
        MemoryUtil.memPutInt(struct + NULLDESCRIPTOR, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRobustness2FeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRobustness2FeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRobustness2FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceRobustness2FeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRobustness2FeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceRobustness2FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRobustness2FeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRobustness2FeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean robustBufferAccess2() {
            return VkPhysicalDeviceRobustness2FeaturesKHR.nrobustBufferAccess2(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean robustImageAccess2() {
            return VkPhysicalDeviceRobustness2FeaturesKHR.nrobustImageAccess2(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean nullDescriptor() {
            return VkPhysicalDeviceRobustness2FeaturesKHR.nnullDescriptor(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRobustness2FeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000286000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRobustness2FeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer robustBufferAccess2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRobustness2FeaturesKHR.nrobustBufferAccess2(address(), value ? 1 : 0);
            return this;
        }

        public Buffer robustImageAccess2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRobustness2FeaturesKHR.nrobustImageAccess2(address(), value ? 1 : 0);
            return this;
        }

        public Buffer nullDescriptor(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRobustness2FeaturesKHR.nnullDescriptor(address(), value ? 1 : 0);
            return this;
        }
    }
}
