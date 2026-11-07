package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueCreateInfo.class */
public class VkDeviceQueueCreateInfo extends Struct<VkDeviceQueueCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int QUEUEFAMILYINDEX;
    public static final int QUEUECOUNT;
    public static final int PQUEUEPRIORITIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        QUEUEFAMILYINDEX = layout.offsetof(3);
        QUEUECOUNT = layout.offsetof(4);
        PQUEUEPRIORITIES = layout.offsetof(5);
    }

    protected VkDeviceQueueCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceQueueCreateInfo create(long address, ByteBuffer container) {
        return new VkDeviceQueueCreateInfo(address, container);
    }

    public VkDeviceQueueCreateInfo(ByteBuffer container) {
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

    @NativeType("VkDeviceQueueCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int queueFamilyIndex() {
        return nqueueFamilyIndex(address());
    }

    @NativeType("uint32_t")
    public int queueCount() {
        return nqueueCount(address());
    }

    @NativeType("float const *")
    public FloatBuffer pQueuePriorities() {
        return npQueuePriorities(address());
    }

    public VkDeviceQueueCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceQueueCreateInfo sType$Default() {
        return sType(2);
    }

    public VkDeviceQueueCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceQueueCreateInfo pNext(VkDeviceQueueGlobalPriorityCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceQueueCreateInfo pNext(VkDeviceQueueGlobalPriorityCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceQueueCreateInfo pNext(VkDeviceQueueGlobalPriorityCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceQueueCreateInfo pNext(VkDeviceQueueShaderCoreControlCreateInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceQueueCreateInfo flags(@NativeType("VkDeviceQueueCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDeviceQueueCreateInfo queueFamilyIndex(@NativeType("uint32_t") int value) {
        nqueueFamilyIndex(address(), value);
        return this;
    }

    public VkDeviceQueueCreateInfo pQueuePriorities(@NativeType("float const *") FloatBuffer value) {
        npQueuePriorities(address(), value);
        return this;
    }

    public VkDeviceQueueCreateInfo set(int sType, long pNext, int flags, int queueFamilyIndex, FloatBuffer pQueuePriorities) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        queueFamilyIndex(queueFamilyIndex);
        pQueuePriorities(pQueuePriorities);
        return this;
    }

    public VkDeviceQueueCreateInfo set(VkDeviceQueueCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceQueueCreateInfo malloc() {
        return new VkDeviceQueueCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceQueueCreateInfo calloc() {
        return new VkDeviceQueueCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceQueueCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceQueueCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceQueueCreateInfo create(long address) {
        return new VkDeviceQueueCreateInfo(address, null);
    }

    public static VkDeviceQueueCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceQueueCreateInfo(address, null);
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

    public static VkDeviceQueueCreateInfo malloc(MemoryStack stack) {
        return new VkDeviceQueueCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceQueueCreateInfo calloc(MemoryStack stack) {
        return new VkDeviceQueueCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nqueueFamilyIndex(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUEFAMILYINDEX);
    }

    public static int nqueueCount(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUECOUNT);
    }

    public static FloatBuffer npQueuePriorities(long struct) {
        return MemoryUtil.memFloatBuffer(MemoryUtil.memGetAddress(struct + PQUEUEPRIORITIES), nqueueCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nqueueFamilyIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUEFAMILYINDEX, value);
    }

    public static void nqueueCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUECOUNT, value);
    }

    public static void npQueuePriorities(long struct, FloatBuffer value) {
        MemoryUtil.memPutAddress(struct + PQUEUEPRIORITIES, MemoryUtil.memAddress(value));
        nqueueCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PQUEUEPRIORITIES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceQueueCreateInfo, Buffer> implements NativeResource {
        private static final VkDeviceQueueCreateInfo ELEMENT_FACTORY = VkDeviceQueueCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceQueueCreateInfo.SIZEOF);
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
        public VkDeviceQueueCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceQueueCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceQueueCreateInfo.npNext(address());
        }

        @NativeType("VkDeviceQueueCreateFlags")
        public int flags() {
            return VkDeviceQueueCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int queueFamilyIndex() {
            return VkDeviceQueueCreateInfo.nqueueFamilyIndex(address());
        }

        @NativeType("uint32_t")
        public int queueCount() {
            return VkDeviceQueueCreateInfo.nqueueCount(address());
        }

        @NativeType("float const *")
        public FloatBuffer pQueuePriorities() {
            return VkDeviceQueueCreateInfo.npQueuePriorities(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceQueueCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(2);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceQueueCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDeviceQueueGlobalPriorityCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceQueueGlobalPriorityCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceQueueGlobalPriorityCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceQueueShaderCoreControlCreateInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkDeviceQueueCreateFlags") int value) {
            VkDeviceQueueCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer queueFamilyIndex(@NativeType("uint32_t") int value) {
            VkDeviceQueueCreateInfo.nqueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer pQueuePriorities(@NativeType("float const *") FloatBuffer value) {
            VkDeviceQueueCreateInfo.npQueuePriorities(address(), value);
            return this;
        }
    }
}
