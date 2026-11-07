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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDevicePrivateDataCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDevicePrivateDataCreateInfo.class */
public class VkDevicePrivateDataCreateInfo extends Struct<VkDevicePrivateDataCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRIVATEDATASLOTREQUESTCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRIVATEDATASLOTREQUESTCOUNT = layout.offsetof(2);
    }

    protected VkDevicePrivateDataCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDevicePrivateDataCreateInfo create(long address, ByteBuffer container) {
        return new VkDevicePrivateDataCreateInfo(address, container);
    }

    public VkDevicePrivateDataCreateInfo(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int privateDataSlotRequestCount() {
        return nprivateDataSlotRequestCount(address());
    }

    public VkDevicePrivateDataCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDevicePrivateDataCreateInfo sType$Default() {
        return sType(1000295001);
    }

    public VkDevicePrivateDataCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDevicePrivateDataCreateInfo privateDataSlotRequestCount(@NativeType("uint32_t") int value) {
        nprivateDataSlotRequestCount(address(), value);
        return this;
    }

    public VkDevicePrivateDataCreateInfo set(int sType, long pNext, int privateDataSlotRequestCount) {
        sType(sType);
        pNext(pNext);
        privateDataSlotRequestCount(privateDataSlotRequestCount);
        return this;
    }

    public VkDevicePrivateDataCreateInfo set(VkDevicePrivateDataCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDevicePrivateDataCreateInfo malloc() {
        return new VkDevicePrivateDataCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDevicePrivateDataCreateInfo calloc() {
        return new VkDevicePrivateDataCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDevicePrivateDataCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDevicePrivateDataCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDevicePrivateDataCreateInfo create(long address) {
        return new VkDevicePrivateDataCreateInfo(address, null);
    }

    public static VkDevicePrivateDataCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDevicePrivateDataCreateInfo(address, null);
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

    public static VkDevicePrivateDataCreateInfo malloc(MemoryStack stack) {
        return new VkDevicePrivateDataCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDevicePrivateDataCreateInfo calloc(MemoryStack stack) {
        return new VkDevicePrivateDataCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nprivateDataSlotRequestCount(long struct) {
        return MemoryUtil.memGetInt(struct + PRIVATEDATASLOTREQUESTCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nprivateDataSlotRequestCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIVATEDATASLOTREQUESTCOUNT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDevicePrivateDataCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDevicePrivateDataCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDevicePrivateDataCreateInfo, Buffer> implements NativeResource {
        private static final VkDevicePrivateDataCreateInfo ELEMENT_FACTORY = VkDevicePrivateDataCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDevicePrivateDataCreateInfo.SIZEOF);
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
        public VkDevicePrivateDataCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDevicePrivateDataCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDevicePrivateDataCreateInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int privateDataSlotRequestCount() {
            return VkDevicePrivateDataCreateInfo.nprivateDataSlotRequestCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDevicePrivateDataCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000295001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDevicePrivateDataCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer privateDataSlotRequestCount(@NativeType("uint32_t") int value) {
            VkDevicePrivateDataCreateInfo.nprivateDataSlotRequestCount(address(), value);
            return this;
        }
    }
}
